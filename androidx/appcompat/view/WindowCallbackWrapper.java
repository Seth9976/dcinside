package androidx.appcompat.view;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({Scope.c})
public class WindowCallbackWrapper implements Window.Callback {
    @RequiresApi(23)
    static class Api23Impl {
        @DoNotInline
        static boolean a(Window.Callback window$Callback0, SearchEvent searchEvent0) {
            return window$Callback0.onSearchRequested(searchEvent0);
        }

        @DoNotInline
        static ActionMode b(Window.Callback window$Callback0, ActionMode.Callback actionMode$Callback0, int v) {
            return window$Callback0.onWindowStartingActionMode(actionMode$Callback0, v);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        @DoNotInline
        static void a(Window.Callback window$Callback0, List list0, Menu menu0, int v) {
            window$Callback0.onProvideKeyboardShortcuts(list0, menu0, v);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        @DoNotInline
        static void a(Window.Callback window$Callback0, boolean z) {
            window$Callback0.onPointerCaptureChanged(z);
        }
    }

    final Window.Callback a;

    public WindowCallbackWrapper(Window.Callback window$Callback0) {
        if(window$Callback0 == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = window$Callback0;
    }

    public final Window.Callback a() {
        return this.a;
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        return this.a.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.a.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        return this.a.dispatchKeyShortcutEvent(keyEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return this.a.dispatchTouchEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent0) {
        return this.a.dispatchTrackballEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public void onActionModeFinished(ActionMode actionMode0) {
        this.a.onActionModeFinished(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public void onActionModeStarted(ActionMode actionMode0) {
        this.a.onActionModeStarted(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override  // android.view.Window$Callback
    public void onContentChanged() {
        this.a.onContentChanged();
    }

    @Override  // android.view.Window$Callback
    public boolean onCreatePanelMenu(int v, Menu menu0) {
        return this.a.onCreatePanelMenu(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public View onCreatePanelView(int v) {
        return this.a.onCreatePanelView(v);
    }

    @Override  // android.view.Window$Callback
    public void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override  // android.view.Window$Callback
    public boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        return this.a.onMenuItemSelected(v, menuItem0);
    }

    @Override  // android.view.Window$Callback
    public boolean onMenuOpened(int v, Menu menu0) {
        return this.a.onMenuOpened(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public void onPanelClosed(int v, Menu menu0) {
        this.a.onPanelClosed(v, menu0);
    }

    @Override  // android.view.Window$Callback
    @RequiresApi(26)
    public void onPointerCaptureChanged(boolean z) {
        Api26Impl.a(this.a, z);
    }

    @Override  // android.view.Window$Callback
    public boolean onPreparePanel(int v, View view0, Menu menu0) {
        return this.a.onPreparePanel(v, view0, menu0);
    }

    @Override  // android.view.Window$Callback
    @RequiresApi(24)
    public void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
        Api24Impl.a(this.a, list0, menu0, v);
    }

    @Override  // android.view.Window$Callback
    public boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override  // android.view.Window$Callback
    @RequiresApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent0) {
        return Api23Impl.a(this.a, searchEvent0);
    }

    @Override  // android.view.Window$Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams windowManager$LayoutParams0) {
        this.a.onWindowAttributesChanged(windowManager$LayoutParams0);
    }

    @Override  // android.view.Window$Callback
    public void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override  // android.view.Window$Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
        return this.a.onWindowStartingActionMode(actionMode$Callback0);
    }

    @Override  // android.view.Window$Callback
    @RequiresApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        return Api23Impl.b(this.a, actionMode$Callback0, v);
    }
}

