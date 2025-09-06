package androidx.core.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@RestrictTo({Scope.c})
public class ComponentActivity extends Activity implements Component, LifecycleOwner {
    @RestrictTo({Scope.c})
    @k(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window\'s decor view.")
    public static class ExtraData {
    }

    @l
    private final SimpleArrayMap extraDataMap;
    @l
    private final LifecycleRegistry lifecycleRegistry;

    public ComponentActivity() {
        this.extraDataMap = new SimpleArrayMap(0, 1, null);
        this.lifecycleRegistry = new LifecycleRegistry(this);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyEvent(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        View view0 = this.getWindow().getDecorView();
        L.o(view0, "window.decorView");
        return KeyEventDispatcher.d(view0, keyEvent0) ? true : KeyEventDispatcher.e(this, view0, this, keyEvent0);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyShortcutEvent(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        View view0 = this.getWindow().getDecorView();
        L.o(view0, "window.decorView");
        return KeyEventDispatcher.d(view0, keyEvent0) ? true : super.dispatchKeyShortcutEvent(keyEvent0);
    }

    private static void e0() {
    }

    private static void f0() {
    }

    private final boolean g0(String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            String s = arr_s[0];
            switch(s.hashCode()) {
                case 0xD98C2911: {
                    return s.equals("--translation") && Build.VERSION.SDK_INT >= 0x1F;
                }
                case 0x5FD0F67: {
                    return s.equals("--dump-dumpable") ? Build.VERSION.SDK_INT >= 33 : false;
                }
                case 0x1C2B8816: {
                    return s.equals("--list-dumpables") ? Build.VERSION.SDK_INT >= 33 : false;
                }
                case 0x4519F64D: {
                    return s.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
                }
                case 1455016274: {
                    return s.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @RestrictTo({Scope.c})
    @k(message = "Use {@link View#getTag(int)} with the window\'s decor view.")
    @m
    public ExtraData getExtraData(@l Class class0) {
        L.p(class0, "extraDataClass");
        return (ExtraData)this.extraDataMap.get(class0);
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override  // android.app.Activity
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        ReportFragment.b.d(this);
    }

    @Override  // android.app.Activity
    @CallSuper
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        this.lifecycleRegistry.s(State.c);
        super.onSaveInstanceState(bundle0);
    }

    @RestrictTo({Scope.c})
    @k(message = "Use {@link View#setTag(int, Object)} with the window\'s decor view.")
    public void putExtraData(@l ExtraData componentActivity$ExtraData0) {
        L.p(componentActivity$ExtraData0, "extraData");
        Class class0 = componentActivity$ExtraData0.getClass();
        this.extraDataMap.put(class0, componentActivity$ExtraData0);
    }

    protected final boolean shouldDumpInternalState(@m String[] arr_s) {
        return !this.g0(arr_s);
    }

    @Override  // androidx.core.view.KeyEventDispatcher$Component
    @RestrictTo({Scope.c})
    public boolean superDispatchKeyEvent(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        return super.dispatchKeyEvent(keyEvent0);
    }
}

