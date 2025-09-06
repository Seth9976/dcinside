package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.Window;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({Scope.c})
public class KeyEventDispatcher {
    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent arg1);
    }

    private static boolean a = false;
    private static Method b = null;
    private static boolean c = false;
    private static Field d;

    static {
    }

    private static boolean a(ActionBar actionBar0, KeyEvent keyEvent0) {
        if(!KeyEventDispatcher.a) {
            try {
                KeyEventDispatcher.b = actionBar0.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            KeyEventDispatcher.a = true;
        }
        Method method0 = KeyEventDispatcher.b;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(actionBar0, keyEvent0);
                return object0 == null ? false : ((Boolean)object0).booleanValue();
            }
            catch(IllegalAccessException | InvocationTargetException unused_ex) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity0, KeyEvent keyEvent0) {
        activity0.onUserInteraction();
        Window window0 = activity0.getWindow();
        if(window0.hasFeature(8)) {
            ActionBar actionBar0 = activity0.getActionBar();
            if(keyEvent0.getKeyCode() == 82 && actionBar0 != null && KeyEventDispatcher.a(actionBar0, keyEvent0)) {
                return true;
            }
        }
        if(window0.superDispatchKeyEvent(keyEvent0)) {
            return true;
        }
        View view0 = window0.getDecorView();
        if(ViewCompat.A(view0, keyEvent0)) {
            return true;
        }
        return view0 == null ? keyEvent0.dispatch(activity0, null, activity0) : keyEvent0.dispatch(activity0, view0.getKeyDispatcherState(), activity0);
    }

    private static boolean c(Dialog dialog0, KeyEvent keyEvent0) {
        DialogInterface.OnKeyListener dialogInterface$OnKeyListener0 = KeyEventDispatcher.f(dialog0);
        if(dialogInterface$OnKeyListener0 != null && dialogInterface$OnKeyListener0.onKey(dialog0, keyEvent0.getKeyCode(), keyEvent0)) {
            return true;
        }
        Window window0 = dialog0.getWindow();
        if(window0.superDispatchKeyEvent(keyEvent0)) {
            return true;
        }
        View view0 = window0.getDecorView();
        if(ViewCompat.A(view0, keyEvent0)) {
            return true;
        }
        return view0 == null ? keyEvent0.dispatch(dialog0, null, dialog0) : keyEvent0.dispatch(dialog0, view0.getKeyDispatcherState(), dialog0);
    }

    public static boolean d(View view0, KeyEvent keyEvent0) {
        return ViewCompat.B(view0, keyEvent0);
    }

    @SuppressLint({"LambdaLast"})
    public static boolean e(Component keyEventDispatcher$Component0, View view0, Window.Callback window$Callback0, KeyEvent keyEvent0) {
        if(keyEventDispatcher$Component0 == null) {
            return false;
        }
        if(Build.VERSION.SDK_INT >= 28) {
            return keyEventDispatcher$Component0.superDispatchKeyEvent(keyEvent0);
        }
        if(window$Callback0 instanceof Activity) {
            return KeyEventDispatcher.b(((Activity)window$Callback0), keyEvent0);
        }
        return window$Callback0 instanceof Dialog ? KeyEventDispatcher.c(((Dialog)window$Callback0), keyEvent0) : view0 != null && ViewCompat.A(view0, keyEvent0) || keyEventDispatcher$Component0.superDispatchKeyEvent(keyEvent0);
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog0) {
        if(!KeyEventDispatcher.c) {
            try {
                Field field0 = Dialog.class.getDeclaredField("mOnKeyListener");
                KeyEventDispatcher.d = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException unused_ex) {
            }
            KeyEventDispatcher.c = true;
        }
        Field field1 = KeyEventDispatcher.d;
        if(field1 != null) {
            try {
                return (DialogInterface.OnKeyListener)field1.get(dialog0);
            }
            catch(IllegalAccessException unused_ex) {
            }
        }
        return null;
    }
}

