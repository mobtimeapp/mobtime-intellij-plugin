package org.intellij.sdk.mobtimeviewer.test;

import org.intellij.sdk.mobtimeviewer.MobTimeViewer;
import org.junit.Test;

public class MobTimeViewerTest {

    @Test
    public void testMobTimeViewerCanLoadPage(){
        MobTimeViewer mobTimeViewer = new MobTimeViewer(new MockToolWindow(), new MockProject());

        assert mobTimeViewer.getBrowser().getCefBrowser().getURL().equals("https://mobti.me/");
    }
}
