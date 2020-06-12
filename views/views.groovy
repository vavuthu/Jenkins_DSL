
listView("First Job") {
    description("This is the First Job")
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
        regex ("*First*")
    }
}

