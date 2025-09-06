package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.style;

abstract class g extends AppCompatDialog {
    @Nullable
    private c f;
    @Nullable
    private FrameLayout g;
    @Nullable
    private FrameLayout h;
    boolean i;
    boolean j;
    private boolean k;
    private boolean l;
    @Nullable
    private com.google.android.material.motion.c m;
    private static final int n;
    private static final int o;

    static {
        g.n = id.coordinator;
        g.o = id.touch_outside;
    }

    g(@NonNull Context context0, @StyleRes int v, @AttrRes int v1, @StyleRes int v2) {
        super(context0, g.x(context0, v, v1, v2));
        this.j = true;
        this.k = true;
        this.k(1);
    }

    private void A() {
        Window window0 = this.getWindow();
        if(window0 != null && (this.h != null && this.h.getLayoutParams() instanceof LayoutParams)) {
            window0.setWindowAnimations((GravityCompat.d(((LayoutParams)this.h.getLayoutParams()).c, ViewCompat.e0(this.h)) == 3 ? style.Animation_Material3_SideSheetDialog_Left : style.Animation_Material3_SideSheetDialog_Right));
        }
    }

    public void B(boolean z) {
        this.i = z;
    }

    public void C(@GravityInt int v) {
        FrameLayout frameLayout0 = this.h;
        if(frameLayout0 == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if(ViewCompat.a1(frameLayout0)) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.h.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            ((LayoutParams)viewGroup$LayoutParams0).c = v;
            this.A();
        }
    }

    private boolean D() {
        if(!this.l) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x101035B});
            this.k = typedArray0.getBoolean(0, true);
            typedArray0.recycle();
            this.l = true;
        }
        return this.k;
    }

    private void E() {
        com.google.android.material.motion.c c0 = this.m;
        if(c0 == null) {
            return;
        }
        if(this.j) {
            c0.c();
            return;
        }
        c0.f();
    }

    private View F(int v, @Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        class a extends AccessibilityDelegateCompat {
            final g d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                if(g.this.j) {
                    accessibilityNodeInfoCompat0.a(0x100000);
                    accessibilityNodeInfoCompat0.s1(true);
                    return;
                }
                accessibilityNodeInfoCompat0.s1(false);
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public boolean j(View view0, int v, Bundle bundle0) {
                if(v == 0x100000) {
                    g g0 = g.this;
                    if(g0.j) {
                        g0.cancel();
                        return true;
                    }
                }
                return super.j(view0, v, bundle0);
            }
        }

        this.n();
        CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.q().findViewById(g.n);
        if(v != 0 && view0 == null) {
            view0 = this.getLayoutInflater().inflate(v, coordinatorLayout0, false);
        }
        FrameLayout frameLayout0 = this.v();
        frameLayout0.removeAllViews();
        if(viewGroup$LayoutParams0 == null) {
            frameLayout0.addView(view0);
        }
        else {
            frameLayout0.addView(view0, viewGroup$LayoutParams0);
        }
        coordinatorLayout0.findViewById(g.o).setOnClickListener((View view0) -> if(this.j && this.isShowing() && this.D()) {
            this.cancel();
        });
        ViewCompat.J1(this.v(), new a(this));
        return this.g;
    }

    @Override  // android.app.Dialog
    public void cancel() {
        c c0 = this.o();
        if(this.i && c0.getState() != 5) {
            c0.g(5);
            return;
        }
        super.cancel();
    }

    abstract void m(c arg1);

    private void n() {
        if(this.g == null) {
            FrameLayout frameLayout0 = (FrameLayout)View.inflate(this.getContext(), this.u(), null);
            this.g = frameLayout0;
            FrameLayout frameLayout1 = (FrameLayout)frameLayout0.findViewById(this.t());
            this.h = frameLayout1;
            c c0 = this.p(frameLayout1);
            this.f = c0;
            this.m(c0);
            this.m = new com.google.android.material.motion.c(this.f, this.h);
        }
    }

    @NonNull
    c o() {
        if(this.f == null) {
            this.n();
        }
        return this.f;
    }

    @Override  // android.app.Dialog
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A();
        this.E();
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        Window window0 = this.getWindow();
        if(window0 != null) {
            int v = Build.VERSION.SDK_INT;
            window0.setStatusBarColor(0);
            window0.addFlags(0x80000000);
            if(v < 23) {
                window0.addFlags(0x4000000);
            }
            window0.setLayout(-1, -1);
        }
    }

    @Override  // android.app.Dialog
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.motion.c c0 = this.m;
        if(c0 != null) {
            c0.f();
        }
    }

    @Override  // androidx.activity.ComponentDialog
    protected void onStart() {
        super.onStart();
        if(this.f != null && this.f.getState() == 5) {
            this.f.g(this.w());
        }
    }

    @NonNull
    abstract c p(@NonNull FrameLayout arg1);

    @NonNull
    private FrameLayout q() {
        if(this.g == null) {
            this.n();
        }
        return this.g;
    }

    @Override  // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if(this.j != z) {
            this.j = z;
        }
        if(this.getWindow() != null) {
            this.E();
        }
    }

    @Override  // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if(z && !this.j) {
            this.j = true;
        }
        this.k = z;
        this.l = true;
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(@LayoutRes int v) {
        super.setContentView(this.F(v, null, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(@Nullable View view0) {
        super.setContentView(this.F(0, view0, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(@Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(this.F(0, view0, viewGroup$LayoutParams0));
    }

    @IdRes
    abstract int t();

    @LayoutRes
    abstract int u();

    @NonNull
    private FrameLayout v() {
        if(this.h == null) {
            this.n();
        }
        return this.h;
    }

    abstract int w();

    private static int x(@NonNull Context context0, @StyleRes int v, @AttrRes int v1, @StyleRes int v2) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            return context0.getTheme().resolveAttribute(v1, typedValue0, true) ? typedValue0.resourceId : v2;
        }
        return v;
    }

    public boolean y() {
        return this.i;
    }

    // 检测为 Lambda 实现
    private void z(View view0) [...]
}

