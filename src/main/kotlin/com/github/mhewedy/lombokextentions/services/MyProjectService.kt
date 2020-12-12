package com.github.mhewedy.lombokextentions.services

import com.intellij.openapi.project.Project
import com.github.mhewedy.lombokextentions.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
