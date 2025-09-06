package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.SpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.fragment.app.FragmentTransaction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ActionBar {
    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayOptions {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;

        public LayoutParams(int v) {
            this(-2, -1, v);
        }

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 0x800013;
        }

        public LayoutParams(int v, int v1, int v2) {
            super(v, v1);
            this.a = v2;
        }

        public LayoutParams(@NonNull Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ActionBarLayout);
            this.a = typedArray0.getInt(styleable.ActionBarLayout_android_layout_gravity, 0);
            typedArray0.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0;
        }

        public LayoutParams(LayoutParams actionBar$LayoutParams0) {
            super(actionBar$LayoutParams0);
            this.a = actionBar$LayoutParams0.a;
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void a(boolean arg1);
    }

    @Deprecated
    public interface OnNavigationListener {
        boolean a(int arg1, long arg2);
    }

    @Deprecated
    public static abstract class Tab {
        public static final int a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract Tab h(@StringRes int arg1);

        public abstract Tab i(CharSequence arg1);

        public abstract Tab j(int arg1);

        public abstract Tab k(View arg1);

        public abstract Tab l(@DrawableRes int arg1);

        public abstract Tab m(Drawable arg1);

        public abstract Tab n(TabListener arg1);

        public abstract Tab o(Object arg1);

        public abstract Tab p(int arg1);

        public abstract Tab q(CharSequence arg1);
    }

    @Deprecated
    public interface TabListener {
        void a(Tab arg1, FragmentTransaction arg2);

        void b(Tab arg1, FragmentTransaction arg2);

        void c(Tab arg1, FragmentTransaction arg2);
    }

    @Deprecated
    public static final int a = 0;
    @Deprecated
    public static final int b = 1;
    @Deprecated
    public static final int c = 2;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 8;
    public static final int h = 16;

    @Nullable
    public abstract CharSequence A();

    @RestrictTo({Scope.c})
    public void A0(CharSequence charSequence0) {
    }

    public abstract void B();

    public abstract void B0();

    @RestrictTo({Scope.c})
    public boolean C() {
        return false;
    }

    @RestrictTo({Scope.c})
    public ActionMode C0(Callback actionMode$Callback0) {
        return null;
    }

    public boolean D() {
        return false;
    }

    public abstract boolean E();

    @RestrictTo({Scope.c})
    public boolean F() {
        return false;
    }

    @Deprecated
    public abstract Tab G();

    @RestrictTo({Scope.c})
    public void H(Configuration configuration0) {
    }

    void I() {
    }

    @RestrictTo({Scope.c})
    public boolean J(int v, KeyEvent keyEvent0) {
        return false;
    }

    @RestrictTo({Scope.c})
    public boolean K(KeyEvent keyEvent0) {
        return false;
    }

    @RestrictTo({Scope.c})
    public boolean L() {
        return false;
    }

    @Deprecated
    public abstract void M();

    public abstract void N(OnMenuVisibilityListener arg1);

    @Deprecated
    public abstract void O(Tab arg1);

    @Deprecated
    public abstract void P(int arg1);

    @RestrictTo({Scope.c})
    boolean Q() {
        return false;
    }

    @Deprecated
    public abstract void R(Tab arg1);

    public abstract void S(@Nullable Drawable arg1);

    public abstract void T(int arg1);

    public abstract void U(View arg1);

    public abstract void V(View arg1, LayoutParams arg2);

    @RestrictTo({Scope.c})
    public void W(boolean z) {
    }

    public abstract void X(boolean arg1);

    public abstract void Y(int arg1);

    public abstract void Z(int arg1, int arg2);

    public abstract void a0(boolean arg1);

    public abstract void b0(boolean arg1);

    public abstract void c0(boolean arg1);

    public abstract void d0(boolean arg1);

    public void e0(float f) {
        if(f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void f(OnMenuVisibilityListener arg1);

    public void f0(int v) {
        if(v != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void g(Tab arg1);

    public void g0(boolean z) {
        if(z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(Tab arg1, int arg2);

    public void h0(@StringRes int v) {
    }

    @Deprecated
    public abstract void i(Tab arg1, int arg2, boolean arg3);

    public void i0(@Nullable CharSequence charSequence0) {
    }

    @Deprecated
    public abstract void j(Tab arg1, boolean arg2);

    public void j0(@DrawableRes int v) {
    }

    @RestrictTo({Scope.c})
    public boolean k() {
        return false;
    }

    public void k0(@Nullable Drawable drawable0) {
    }

    @RestrictTo({Scope.c})
    public boolean l() {
        return false;
    }

    public void l0(boolean z) {
    }

    @RestrictTo({Scope.c})
    public void m(boolean z) {
    }

    public abstract void m0(@DrawableRes int arg1);

    public abstract View n();

    public abstract void n0(Drawable arg1);

    public abstract int o();

    @Deprecated
    public abstract void o0(SpinnerAdapter arg1, OnNavigationListener arg2);

    public float p() {
        return 0.0f;
    }

    public abstract void p0(@DrawableRes int arg1);

    public abstract int q();

    public abstract void q0(Drawable arg1);

    public int r() {
        return 0;
    }

    @Deprecated
    public abstract void r0(int arg1);

    @Deprecated
    public abstract int s();

    @Deprecated
    public abstract void s0(int arg1);

    @Deprecated
    public abstract int t();

    @RestrictTo({Scope.c})
    public void t0(boolean z) {
    }

    @Deprecated
    public abstract int u();

    public void u0(Drawable drawable0) {
    }

    @Nullable
    @Deprecated
    public abstract Tab v();

    public void v0(Drawable drawable0) {
    }

    @Nullable
    public abstract CharSequence w();

    public abstract void w0(int arg1);

    @Deprecated
    public abstract Tab x(int arg1);

    public abstract void x0(CharSequence arg1);

    @Deprecated
    public abstract int y();

    public abstract void y0(@StringRes int arg1);

    public Context z() {
        return null;
    }

    public abstract void z0(CharSequence arg1);
}

