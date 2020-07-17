package com.github.nargetdev.typescripttestgenerationintention.services

import com.intellij.openapi.project.Project
import com.github.nargetdev.typescripttestgenerationintention.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
