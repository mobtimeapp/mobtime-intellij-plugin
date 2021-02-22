package org.intellij.sdk.mobtimeviewer;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.ui.jcef.JBCefBrowser;
import org.cef.CefSettings;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefDisplayHandler;

import javax.swing.*;
import java.awt.*;

public class MobTimeViewer {
    private final JBCefBrowser browser;
    private final ToolWindow toolWindow;
    private final Project project;
    private boolean hasStarted = false;
    private String oldTitle;

    public MobTimeViewer(ToolWindow _toolWindow, Project _project) {
        toolWindow = _toolWindow;
        project = _project;

        browser = new JBCefBrowser();
        browser.loadURL("https://mobti.me/");
    }

    public JBCefBrowser getBrowser() {
        return browser;
    }

    public JComponent getContent() {

        CefDisplayHandler displayHandler = new CefDisplayHandler() {
            @Override
            public void onAddressChange(CefBrowser cefBrowser, CefFrame cefFrame, String s) {
            }

            @Override
            public void onTitleChange(CefBrowser cefBrowser, String title) {
                handleTitleChange(title);
            }

            @Override
            public boolean onTooltip(CefBrowser cefBrowser, String s) {
                return false;
            }

            @Override
            public void onStatusMessage(CefBrowser cefBrowser, String s) {
            }

            @Override
            public boolean onConsoleMessage(CefBrowser cefBrowser, CefSettings.LogSeverity logSeverity, String message, String source, int i) {
                return false;
            }
        };

        browser.getJBCefClient().addDisplayHandler(displayHandler, browser.getCefBrowser());
        return browser.getComponent();
    }

    public void handleTitleChange(String title){
        EventQueue.invokeLater(() -> {
            oldTitle = toolWindow.getTitle();
        });

        EventQueue.invokeLater(() -> {
            if (toolWindow == null) {
                return;
            }
            toolWindow.setTitle(title);
            toolWindow.setStripeTitle(title);
        });

        if(hasStarted && oldTitle.matches(".*\\d.*") && title.equals("mobtime")){
            showTimerUpNotification();
//            send notification that timer is up here
        }

        if(title.equals("Mob Timer")){
            //User has entered the actual timer page and presumably will start the timer here
            hasStarted = true;
        }

    }

    private void showTimerUpNotification(){
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
