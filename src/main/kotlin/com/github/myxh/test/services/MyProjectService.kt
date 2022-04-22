package com.github.myxh.test.services

import com.intellij.openapi.project.Project
import com.github.myxh.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
