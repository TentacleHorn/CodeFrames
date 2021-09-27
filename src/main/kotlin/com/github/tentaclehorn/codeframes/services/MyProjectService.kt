package com.github.tentaclehorn.codeframes.services

import com.intellij.openapi.project.Project
import com.github.tentaclehorn.codeframes.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
