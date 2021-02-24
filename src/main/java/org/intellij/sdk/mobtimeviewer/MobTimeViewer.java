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

    public MobTimeViewer(ToolWindow _toolWindow, Project _project) {
        browser = new JBCefBrowser();
        browser.loadURL("https://mobti.me/");

        ChromiumDisplayHandler displayHandler = new ChromiumDisplayHandler(_toolWindow, _project);
        browser.getJBCefClient().addDisplayHandler(displayHandler, browser.getCefBrowser());
    }

    public JBCefBrowser getBrowser() {
        return browser;
    }

    public JComponent getContent() {
        return browser.getComponent();
    }

}
