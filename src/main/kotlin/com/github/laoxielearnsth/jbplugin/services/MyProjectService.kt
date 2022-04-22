package com.github.laoxielearnsth.jbplugin.services

import com.intellij.openapi.project.Project
import com.github.laoxielearnsth.jbplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
