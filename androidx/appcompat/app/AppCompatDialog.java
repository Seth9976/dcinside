package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.activity.ComponentDialog;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    private AppCompatDelegate d;
    private final Component e;

    public AppCompatDialog(@NonNull Context context0) {
        this(context0, 0);
    }

    public AppCompatDialog(@NonNull Context context0, int v) {
        super(context0, AppCompatDialog.h(context0, v));
        this.e = (KeyEvent keyEvent0) -> super.dispatchKeyEvent(keyEvent0);
        AppCompatDelegate appCompatDelegate0 = this.f();
        appCompatDelegate0.i0(AppCompatDialog.h(context0, v));
        appCompatDelegate0.M(null);
    }

    protected AppCompatDialog(@NonNull Context context0, boolean z, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        super(context0);
        this.e = (KeyEvent keyEvent0) -> super.dispatchKeyEvent(keyEvent0);
        this.setCancelable(z);
        this.setOnCancelListener(dialogInterface$OnCancelListener0);
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    public void S(ActionMode actionMode0) {
    }

    @Override  // androidx.activity.ComponentDialog
    public void addContentView(@NonNull View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.f().f(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        super.dismiss();
        this.f().N();
    }

    @Override  // android.app.Dialog
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        View view0 = this.getWindow().getDecorView();
        return KeyEventDispatcher.e(this.e, view0, this, keyEvent0);
    }

    @NonNull
    public AppCompatDelegate f() {
        if(this.d == null) {
            this.d = AppCompatDelegate.o(this, this);
        }
        return this.d;
    }

    @Override  // android.app.Dialog
    @Nullable
    public View findViewById(@IdRes int v) {
        return this.f().s(v);
    }

    public ActionBar g() {
        return this.f().C();
    }

    private static int h(Context context0, int v) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            context0.getTheme().resolveAttribute(attr.dialogTheme, typedValue0, true);
            return typedValue0.resourceId;
        }
        return v;
    }

    private void i() {
        ViewTreeLifecycleOwner.b(this.getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(this.getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(this.getWindow().getDecorView(), this);
    }

    @Override  // android.app.Dialog
    @RestrictTo({Scope.c})
    public void invalidateOptionsMenu() {
        this.f().F();
    }

    // 检测为 Lambda 实现
    boolean j(KeyEvent keyEvent0) [...]

    public boolean k(int v) {
        return this.f().V(v);
    }

    @Override  // androidx.activity.ComponentDialog
    protected void onCreate(Bundle bundle0) {
        this.f().E();
        super.onCreate(bundle0);
        this.f().M(bundle0);
    }

    @Override  // androidx.activity.ComponentDialog
    protected void onStop() {
        super.onStop();
        this.f().S();
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    public void r(ActionMode actionMode0) {
    }

    @Override  // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode s(Callback actionMode$Callback0) {
        return null;
    }

    @Override  // androidx.activity.ComponentDialog
    public void setContentView(@LayoutRes int v) {
        this.i();
        this.f().Z(v);
    }

    @Override  // androidx.activity.ComponentDialog
    public void setContentView(@NonNull View view0) {
        this.i();
        this.f().a0(view0);
    }

    @Override  // androidx.activity.ComponentDialog
    public void setContentView(@NonNull View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.i();
        this.f().b0(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Dialog
    public void setTitle(int v) {
        super.setTitle(v);
        this.f().j0(this.getContext().getString(v));
    }

    @Override  // android.app.Dialog
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.f().j0(charSequence0);
    }
}

