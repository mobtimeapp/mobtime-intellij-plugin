package org.intellij.sdk.mobtimeviewer.test;

import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.util.ActionCallback;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowContentUiType;
import com.intellij.openapi.wm.ToolWindowType;
import com.intellij.ui.content.ContentManager;
import com.intellij.ui.content.ContentManagerListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;

public class MockToolWindow implements ToolWindow {
    @Override
    public @NotNull String getId() {
        return null;
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void activate(@Nullable Runnable runnable) {

    }

    @Override
    public void activate(@Nullable Runnable runnable, boolean autoFocusContents) {

    }

    @Override
    public void activate(@Nullable Runnable runnable, boolean autoFocusContents, boolean forced) {

    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public void show(@Nullable Runnable runnable) {

    }

    @Override
    public void hide(@Nullable Runnable runnable) {

    }

    @Override
    public @NotNull ToolWindowAnchor getAnchor() {
        return null;
    }

    @Override
    public void setAnchor(@NotNull ToolWindowAnchor anchor, @Nullable Runnable runnable) {

    }

    @Override
    public boolean isSplitMode() {
        return false;
    }

    @Override
    public void setSplitMode(boolean split, @Nullable Runnable runnable) {

    }

    @Override
    public boolean isAutoHide() {
        return false;
    }

    @Override
    public void setAutoHide(boolean value) {

    }

    @Override
    public @NotNull ToolWindowType getType() {
        return null;
    }

    @Override
    public void setType(@NotNull ToolWindowType type, @Nullable Runnable runnable) {

    }

    @Override
    public @Nullable Icon getIcon() {
        return null;
    }

    @Override
    public void setIcon(@NotNull Icon icon) {

    }

    @Override
    public @Nullable String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public @NotNull String getStripeTitle() {
        return null;
    }

    @Override
    public void setStripeTitle(@NotNull String title) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void setAvailable(boolean value, @Nullable Runnable runnable) {

    }

    @Override
    public void setAvailable(boolean value) {

    }

    @Override
    public void setContentUiType(@NotNull ToolWindowContentUiType type, @Nullable Runnable runnable) {

    }

    @Override
    public void setDefaultContentUiType(@NotNull ToolWindowContentUiType type) {

    }

    @Override
    public @NotNull ToolWindowContentUiType getContentUiType() {
        return null;
    }

    @Override
    public void installWatcher(ContentManager contentManager) {

    }

    @Override
    public @NotNull JComponent getComponent() {
        return null;
    }

    @Override
    public @NotNull ContentManager getContentManager() {
        return null;
    }

    @Override
    public @Nullable ContentManager getContentManagerIfCreated() {
        return null;
    }

    @Override
    public void addContentManagerListener(@NotNull ContentManagerListener listener) {

    }

    @Override
    public void setDefaultState(@Nullable ToolWindowAnchor anchor, @Nullable ToolWindowType type, @Nullable Rectangle floatingBounds) {

    }

    @Override
    public void setToHideOnEmptyContent(boolean hideOnEmpty) {

    }

    @Override
    public void setShowStripeButton(boolean value) {

    }

    @Override
    public boolean isShowStripeButton() {
        return false;
    }

    @Override
    public boolean isDisposed() {
        return false;
    }

    @Override
    public void showContentPopup(@NotNull InputEvent inputEvent) {

    }

    @Override
    public @NotNull Disposable getDisposable() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void setTitleActions(@NotNull List<AnAction> actions) {

    }

    @Override
    public @NotNull ActionCallback getReady(@NotNull Object requestor) {
        return null;
    }
}
