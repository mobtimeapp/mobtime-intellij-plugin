package org.intellij.sdk.mobtimeviewer;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.awt.RelativePoint;

public class Utils {

    public static void showTimerUpNotification(Project project){
        StatusBar statusBar = WindowManager.getInstance()
                .getStatusBar(project);

        JBPopupFactory.getInstance()
                .createHtmlTextBalloonBuilder("The mob timer is up!", MessageType.INFO, null)
                .setFadeoutTime(5000)
                .createBalloon()
                .show(RelativePoint.getCenterOf(statusBar.getComponent()),
                        Balloon.Position.atRight);
    }

}
