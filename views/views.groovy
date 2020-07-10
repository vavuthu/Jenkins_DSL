def view_list = [
  ["name": "Deployment", "description": "Deployemnt jobs", "job_regex": ".*deploy.*"],
  ["name": "Tier1", "description": "Tier1 jobs", "job_regex": ".*tier1.*"],
  ["name": "Tier2", "description": "Tier2 jobs", "job_regex": ".*tier2.*"],
  ["name": "Tier3", "description": "Tier3 jobs", "job_regex": ".*tier3.*"],
]

for (each_view in view_list) {
    listView(each_view["name"]) {
        description(each_view["description"])
        columns {
            status()
            buildButton()
            lastBuildConsole()
            name()
            progressBar()
            lastFailure()
            lastSuccess()
            lastDuration()
            configureProject()
            disableProject(icon = true)
        }
        jobs {
            regex (each_view["regex"])
        }
    }
}
