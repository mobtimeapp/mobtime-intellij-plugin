package org.intellij.sdk.mobtimeviewer;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import org.cef.CefSettings;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefDisplayHandler;

import java.awt.*;

public class ChromiumDisplayHandler implements CefDisplayHandler {

    private final ToolWindow toolWindow;
    private final Project project;
    private boolean hasStarted = false;
    private String oldTitle;

    public ChromiumDisplayHandler(ToolWindow _toolWindow, Project _project) {
        toolWindow = _toolWindow;
        project = _project;
    }

    @Override
    public void onAddressChange(CefBrowser cefBrowser, CefFrame cefFrame, String s) {
    }

    @Override
    public void onTitleChange(CefBrowser cefBrowser, String title) {
        handleTitleChange(title);
    }

    public boolean onCursorChange(CefBrowser cefBrowser, int cursor) {
        return false;
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
            Utils.showTimerUpNotification(project);
        }

        if(title.equals("Mob Timer")){
            hasStarted = true;
        }

    }


}
