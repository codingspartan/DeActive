package com.github.codingspartan.deactive.services

import com.github.codingspartan.deactive.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
