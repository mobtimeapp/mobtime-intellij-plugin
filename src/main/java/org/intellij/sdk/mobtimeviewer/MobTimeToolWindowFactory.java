// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.mobtimeviewer;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class MobTimeToolWindowFactory implements ToolWindowFactory {
    /**
     * Create the tool window content.
     *
     * @param project    current project
     * @param toolWindow current tool window
     */

    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        MobTimeViewer mobtimeViewer = new MobTimeViewer(toolWindow, project);
//        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        ContentFactory contentFactory = ApplicationManager.getApplication().getService(ContentFactory.class);
        Content content = contentFactory.createContent(mobtimeViewer.getContent(), "MobTime", false);
        toolWindow.getContentManager().addContent(content);
    }
}
