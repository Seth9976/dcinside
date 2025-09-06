package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public class ComponentDialog extends Dialog implements OnBackPressedDispatcherOwner, LifecycleOwner, SavedStateRegistryOwner {
    @m
    private LifecycleRegistry a;
    @l
    private final SavedStateRegistryController b;
    @l
    private final OnBackPressedDispatcher c;

    @j
    public ComponentDialog(@l Context context0) {
        L.p(context0, "context");
        this(context0, 0, 2, null);
    }

    @j
    public ComponentDialog(@l Context context0, @StyleRes int v) {
        L.p(context0, "context");
        super(context0, v);
        this.b = SavedStateRegistryController.d.a(this);
        this.c = new OnBackPressedDispatcher(() -> {
            L.p(this, "this$0");
            this.super.onBackPressed();
        });
    }

    public ComponentDialog(Context context0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(context0, v);
    }

    @Override  // android.app.Dialog
    public void addContentView(@l View view0, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        L.p(view0, "view");
        this.d();
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    private final LifecycleRegistry b() {
        LifecycleRegistry lifecycleRegistry0 = this.a;
        if(lifecycleRegistry0 == null) {
            lifecycleRegistry0 = new LifecycleRegistry(this);
            this.a = lifecycleRegistry0;
        }
        return lifecycleRegistry0;
    }

    public static void c() {
    }

    @CallSuper
    public void d() {
        Window window0 = this.getWindow();
        L.m(window0);
        View view0 = window0.getDecorView();
        L.o(view0, "window!!.decorView");
        ViewTreeLifecycleOwner.b(view0, this);
        Window window1 = this.getWindow();
        L.m(window1);
        View view1 = window1.getDecorView();
        L.o(view1, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.b(view1, this);
        Window window2 = this.getWindow();
        L.m(window2);
        View view2 = window2.getDecorView();
        L.o(view2, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.b(view2, this);
    }

    // 检测为 Lambda 实现
    private static final void e(ComponentDialog componentDialog0) [...]

    @Override  // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.b();
    }

    @Override  // androidx.activity.OnBackPressedDispatcherOwner
    @l
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @l
    public SavedStateRegistry getSavedStateRegistry() {
        return this.b.b();
    }

    @Override  // android.app.Dialog
    @CallSuper
    public void onBackPressed() {
        this.c.p();
    }

    @Override  // android.app.Dialog
    @CallSuper
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        if(Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.getOnBackInvokedDispatcher();
            L.o(onBackInvokedDispatcher0, "onBackInvokedDispatcher");
            this.c.s(onBackInvokedDispatcher0);
        }
        this.b.d(bundle0);
        this.b().l(Event.ON_CREATE);
    }

    @Override  // android.app.Dialog
    @l
    public Bundle onSaveInstanceState() {
        Bundle bundle0 = super.onSaveInstanceState();
        L.o(bundle0, "super.onSaveInstanceState()");
        this.b.e(bundle0);
        return bundle0;
    }

    @Override  // android.app.Dialog
    @CallSuper
    protected void onStart() {
        super.onStart();
        this.b().l(Event.ON_RESUME);
    }

    @Override  // android.app.Dialog
    @CallSuper
    protected void onStop() {
        this.b().l(Event.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override  // android.app.Dialog
    public void setContentView(int v) {
        this.d();
        super.setContentView(v);
    }

    @Override  // android.app.Dialog
    public void setContentView(@l View view0) {
        L.p(view0, "view");
        this.d();
        super.setContentView(view0);
    }

    @Override  // android.app.Dialog
    public void setContentView(@l View view0, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        L.p(view0, "view");
        this.d();
        super.setContentView(view0, viewGroup$LayoutParams0);
    }
}

