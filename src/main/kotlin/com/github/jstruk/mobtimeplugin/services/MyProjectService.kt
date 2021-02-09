package com.github.jstruk.mobtimeplugin.services

import com.github.jstruk.mobtimeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
