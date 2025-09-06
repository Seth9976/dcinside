package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper.Callback;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.motion.i;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

public class SideSheetBehavior extends Behavior implements c {
    public static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            @Nullable
            public SavedState a(@NonNull Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            @NonNull
            public SavedState b(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            @NonNull
            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            @Nullable
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        final int c;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(@NonNull Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readInt();
        }

        public SavedState(Parcelable parcelable0, @NonNull SideSheetBehavior sideSheetBehavior0) {
            super(parcelable0);
            this.c = sideSheetBehavior0.i;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.c);
        }
    }

    class com.google.android.material.sidesheet.SideSheetBehavior.a extends Callback {
        final SideSheetBehavior a;

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int a(@NonNull View view0, int v, int v1) {
            return MathUtils.e(v, SideSheetBehavior.this.a.g(), SideSheetBehavior.this.a.f());
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int b(@NonNull View view0, int v, int v1) {
            return view0.getTop();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public int d(@NonNull View view0) {
            return SideSheetBehavior.this.n + SideSheetBehavior.this.t0();
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void j(int v) {
            if(v == 1 && SideSheetBehavior.this.h) {
                SideSheetBehavior.this.Y0(1);
            }
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void k(@NonNull View view0, int v, int v1, int v2, int v3) {
            View view1 = SideSheetBehavior.this.o0();
            if(view1 != null) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    int v4 = view0.getLeft();
                    int v5 = view0.getRight();
                    SideSheetBehavior.this.a.p(viewGroup$MarginLayoutParams0, v4, v5);
                    view1.setLayoutParams(viewGroup$MarginLayoutParams0);
                }
            }
            SideSheetBehavior.this.g0(view0, v);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public void l(@NonNull View view0, float f, float f1) {
            int v = SideSheetBehavior.this.c0(view0, f, f1);
            SideSheetBehavior.this.d1(view0, v, true);
        }

        @Override  // androidx.customview.widget.ViewDragHelper$Callback
        public boolean m(@NonNull View view0, int v) {
            return SideSheetBehavior.this.i == 1 ? false : SideSheetBehavior.this.r != null && SideSheetBehavior.this.r.get() == view0;
        }
    }

    class com.google.android.material.sidesheet.SideSheetBehavior.c {
        private int a;
        private boolean b;
        private final Runnable c;
        final SideSheetBehavior d;

        com.google.android.material.sidesheet.SideSheetBehavior.c() {
            this.c = () -> {
                this.b = false;
                if(SideSheetBehavior.this.k != null && SideSheetBehavior.this.k.o(true)) {
                    this.b(this.a);
                    return;
                }
                if(SideSheetBehavior.this.i == 2) {
                    SideSheetBehavior.this.Y0(this.a);
                }
            };
        }

        void b(int v) {
            if(SideSheetBehavior.this.r != null && SideSheetBehavior.this.r.get() != null) {
                this.a = v;
                if(!this.b) {
                    ViewCompat.x1(((View)SideSheetBehavior.this.r.get()), this.c);
                    this.b = true;
                }
            }
        }

        // 检测为 Lambda 实现
        private void c() [...]
    }

    static final int A = 500;
    private static final float B = 0.5f;
    private static final float C = 0.1f;
    private static final int D = -1;
    private static final int E;
    private e a;
    private float b;
    @Nullable
    private k c;
    @Nullable
    private ColorStateList d;
    private p e;
    private final com.google.android.material.sidesheet.SideSheetBehavior.c f;
    private float g;
    private boolean h;
    private int i;
    private int j;
    @Nullable
    private ViewDragHelper k;
    private boolean l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    @Nullable
    private WeakReference r;
    @Nullable
    private WeakReference s;
    @IdRes
    private int t;
    @Nullable
    private VelocityTracker u;
    @Nullable
    private i v;
    private int w;
    @NonNull
    private final Set x;
    private final Callback y;
    private static final int z;

    static {
        SideSheetBehavior.z = string.side_sheet_accessibility_pane_title;
        SideSheetBehavior.E = style.Widget_Material3_SideSheet;
    }

    public SideSheetBehavior() {
        this.f = new com.google.android.material.sidesheet.SideSheetBehavior.c(this);
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new com.google.android.material.sidesheet.SideSheetBehavior.a(this);
    }

    public SideSheetBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = new com.google.android.material.sidesheet.SideSheetBehavior.c(this);
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new com.google.android.material.sidesheet.SideSheetBehavior.a(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.SideSheetBehavior_Layout);
        if(typedArray0.hasValue(styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.d = d.a(context0, typedArray0, 3);
        }
        if(typedArray0.hasValue(styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.e = p.e(context0, attributeSet0, 0, SideSheetBehavior.E).m();
        }
        if(typedArray0.hasValue(styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            this.T0(typedArray0.getResourceId(5, -1));
        }
        this.f0(context0);
        this.g = typedArray0.getDimension(styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.U0(typedArray0.getBoolean(styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArray0.recycle();
        this.b = (float)ViewConfiguration.get(context0).getScaledMaximumFlingVelocity();
    }

    @Nullable
    private LayoutParams A0() {
        WeakReference weakReference0 = this.r;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            return view0 == null || !(view0.getLayoutParams() instanceof LayoutParams) ? null : ((LayoutParams)view0.getLayoutParams());
        }
        return null;
    }

    float B0() {
        VelocityTracker velocityTracker0 = this.u;
        if(velocityTracker0 == null) {
            return 0.0f;
        }
        velocityTracker0.computeCurrentVelocity(1000, this.b);
        return this.u.getXVelocity();
    }

    private boolean C0() {
        LayoutParams coordinatorLayout$LayoutParams0 = this.A0();
        return coordinatorLayout$LayoutParams0 != null && coordinatorLayout$LayoutParams0.leftMargin > 0;
    }

    private boolean D0() {
        LayoutParams coordinatorLayout$LayoutParams0 = this.A0();
        return coordinatorLayout$LayoutParams0 != null && coordinatorLayout$LayoutParams0.rightMargin > 0;
    }

    public void E0() {
        this.g(5);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void F(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Parcelable parcelable0) {
        if(((SavedState)parcelable0).a() != null) {
            super.F(coordinatorLayout0, view0, ((SavedState)parcelable0).a());
        }
        int v = ((SavedState)parcelable0).c;
        if(v == 1 || v == 2) {
            v = 5;
        }
        this.i = v;
        this.j = v;
    }

    public boolean F0() {
        return this.h;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @NonNull
    public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
        return new SavedState(super.G(coordinatorLayout0, view0), this);
    }

    private boolean G0(@NonNull MotionEvent motionEvent0) {
        return this.Z0() ? this.b0(((float)this.w), motionEvent0.getX()) > ((float)this.k.E()) : false;
    }

    private boolean H0(float f) {
        return this.a.k(f);
    }

    private boolean I0(@NonNull View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 != null && viewParent0.isLayoutRequested() && ViewCompat.T0(view0);
    }

    private boolean J0(View view0, int v, boolean z) {
        int v1 = this.v0(v);
        ViewDragHelper viewDragHelper0 = this.z0();
        if(viewDragHelper0 != null) {
            return z ? viewDragHelper0.V(v1, view0.getTop()) : viewDragHelper0.X(view0, v1, view0.getTop());
        }
        return false;
    }

    // 检测为 Lambda 实现
    private boolean K0(int v, View view0, CommandArguments accessibilityViewCommand$CommandArguments0) [...]

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(!view0.isShown()) {
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(this.i == 1 && v == 0) {
            return true;
        }
        if(this.Z0()) {
            this.k.M(motionEvent0);
        }
        if(v == 0) {
            this.Q0();
        }
        if(this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent0);
        if(this.Z0() && v == 2 && !this.l && this.G0(motionEvent0)) {
            this.k.d(view0, motionEvent0.getPointerId(motionEvent0.getActionIndex()));
        }
        return !this.l;
    }

    // 检测为 Lambda 实现
    private void L0(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, View view0, ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void M0(int v) [...]

    private void N0(@NonNull CoordinatorLayout coordinatorLayout0) {
        if(this.s == null) {
            int v = this.t;
            if(v != -1) {
                View view0 = coordinatorLayout0.findViewById(v);
                if(view0 != null) {
                    this.s = new WeakReference(view0);
                }
            }
        }
    }

    public void O0(@NonNull m m0) {
        this.x.remove(m0);
    }

    private void P0(View view0, AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0, int v) {
        ViewCompat.C1(view0, accessibilityNodeInfoCompat$AccessibilityActionCompat0, null, this.e0(v));
    }

    private void Q0() {
        VelocityTracker velocityTracker0 = this.u;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.u = null;
        }
    }

    private void R0(@NonNull View view0, Runnable runnable0) {
        if(this.I0(view0)) {
            view0.post(runnable0);
            return;
        }
        runnable0.run();
    }

    public void S0(@Nullable View view0) {
        this.t = -1;
        if(view0 == null) {
            this.d0();
            return;
        }
        this.s = new WeakReference(view0);
        WeakReference weakReference0 = this.r;
        if(weakReference0 != null) {
            View view1 = (View)weakReference0.get();
            if(ViewCompat.a1(view1)) {
                view1.requestLayout();
            }
        }
    }

    public void T0(@IdRes int v) {
        this.t = v;
        this.d0();
        WeakReference weakReference0 = this.r;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            if(v != -1 && ViewCompat.a1(view0)) {
                view0.requestLayout();
            }
        }
    }

    public void U0(boolean z) {
        this.h = z;
    }

    public void V0(float f) {
        this.m = f;
    }

    private void W0(int v) {
        if(this.a != null && this.a.j() == v) {
            return;
        }
        switch(v) {
            case 0: {
                this.a = new b(this);
                if(this.e != null && !this.D0()) {
                    com.google.android.material.shape.p.b p$b0 = this.e.v();
                    p$b0.P(0.0f).C(0.0f);
                    this.g1(p$b0.m());
                }
                return;
            }
            case 1: {
                this.a = new com.google.android.material.sidesheet.a(this);
                if(this.e != null && !this.C0()) {
                    com.google.android.material.shape.p.b p$b1 = this.e.v();
                    p$b1.K(0.0f).x(0.0f);
                    this.g1(p$b1.m());
                }
                return;
            }
            default: {
                throw new IllegalArgumentException("Invalid sheet edge position value: " + v + ". Must be " + 0 + " or " + 1 + ".");
            }
        }
    }

    private void X0(@NonNull View view0, int v) {
        this.W0((GravityCompat.d(((LayoutParams)view0.getLayoutParams()).c, v) == 3 ? 1 : 0));
    }

    void Y0(int v) {
        if(this.i == v) {
            return;
        }
        this.i = v;
        if(v == 3 || v == 5) {
            this.j = v;
        }
        WeakReference weakReference0 = this.r;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        this.h1(view0);
        for(Object object0: this.x) {
            ((com.google.android.material.sidesheet.d)object0).a(view0, v);
        }
        this.e1();
    }

    public void Z(@NonNull m m0) {
        this.x.add(m0);
    }

    // 去混淆评级： 低(20)
    private boolean Z0() {
        return this.k != null && (this.h || this.i == 1);
    }

    @Override  // com.google.android.material.sidesheet.c
    public void a(@NonNull com.google.android.material.sidesheet.d d0) {
        this.Z(((m)d0));
    }

    private int a0(int v, View view0) {
        switch(this.i) {
            case 1: 
            case 2: {
                return v - this.a.h(view0);
            }
            case 3: {
                return 0;
            }
            case 5: {
                return this.a.e();
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + this.i);
            }
        }
    }

    boolean a1(@NonNull View view0, float f) {
        return this.a.n(view0, f);
    }

    @Override  // com.google.android.material.motion.b
    public void b(@NonNull BackEventCompat backEventCompat0) {
        i i0 = this.v;
        if(i0 == null) {
            return;
        }
        i0.j(backEventCompat0);
    }

    private float b0(float f, float f1) {
        return Math.abs(f - f1);
    }

    // 去混淆评级： 低(20)
    private boolean b1(@NonNull View view0) {
        return (view0.isShown() || ViewCompat.L(view0) != null) && this.h;
    }

    @Override  // com.google.android.material.motion.b
    public void c(@NonNull BackEventCompat backEventCompat0) {
        i i0 = this.v;
        if(i0 == null) {
            return;
        }
        i0.l(backEventCompat0, this.q0());
        this.f1();
    }

    private int c0(@NonNull View view0, float f, float f1) {
        if(!this.H0(f)) {
            if(this.a1(view0, f)) {
                return !this.a.m(f, f1) && !this.a.l(view0) ? 3 : 5;
            }
            if(f == 0.0f || !h.a(f, f1)) {
                int v = view0.getLeft();
                return Math.abs(v - this.p0()) >= Math.abs(v - this.a.e()) ? 5 : 3;
            }
            return 5;
        }
        return 3;
    }

    @RestrictTo({Scope.b})
    public boolean c1() [...] // Inlined contents

    @Override  // com.google.android.material.motion.b
    public void d() {
        class com.google.android.material.sidesheet.SideSheetBehavior.b extends AnimatorListenerAdapter {
            final SideSheetBehavior a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                SideSheetBehavior.this.Y0(5);
                if(SideSheetBehavior.this.r != null && SideSheetBehavior.this.r.get() != null) {
                    ((View)SideSheetBehavior.this.r.get()).requestLayout();
                }
            }
        }

        i i0 = this.v;
        if(i0 == null) {
            return;
        }
        BackEventCompat backEventCompat0 = i0.c();
        if(backEventCompat0 != null && Build.VERSION.SDK_INT >= 34) {
            this.v.h(backEventCompat0, this.q0(), new com.google.android.material.sidesheet.SideSheetBehavior.b(this), this.n0());
            return;
        }
        this.g(5);
    }

    private void d0() {
        WeakReference weakReference0 = this.s;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.s = null;
    }

    private void d1(View view0, int v, boolean z) {
        if(this.J0(view0, v, z)) {
            this.Y0(2);
            this.f.b(v);
            return;
        }
        this.Y0(v);
    }

    @Override  // com.google.android.material.sidesheet.c
    public void e(@NonNull com.google.android.material.sidesheet.d d0) {
        this.O0(((m)d0));
    }

    private AccessibilityViewCommand e0(int v) {
        return (View view0, CommandArguments accessibilityViewCommand$CommandArguments0) -> {
            this.g(v);
            return true;
        };
    }

    private void e1() {
        WeakReference weakReference0 = this.r;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        ViewCompat.z1(view0, 0x40000);
        ViewCompat.z1(view0, 0x100000);
        if(this.i != 5) {
            this.P0(view0, AccessibilityActionCompat.z, 5);
        }
        if(this.i != 3) {
            this.P0(view0, AccessibilityActionCompat.x, 3);
        }
    }

    @Override  // com.google.android.material.motion.b
    public void f() {
        i i0 = this.v;
        if(i0 == null) {
            return;
        }
        i0.f();
    }

    private void f0(@NonNull Context context0) {
        if(this.e == null) {
            return;
        }
        k k0 = new k(this.e);
        this.c = k0;
        k0.a0(context0);
        ColorStateList colorStateList0 = this.d;
        if(colorStateList0 != null) {
            this.c.p0(colorStateList0);
            return;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010031, typedValue0, true);
        this.c.setTint(typedValue0.data);
    }

    private void f1() {
        if(this.r != null && this.r.get() != null) {
            View view0 = (View)this.r.get();
            View view1 = this.o0();
            if(view1 == null) {
                return;
            }
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
            if(viewGroup$MarginLayoutParams0 == null) {
                return;
            }
            float f = (float)this.n;
            float f1 = view0.getScaleX();
            this.a.o(viewGroup$MarginLayoutParams0, ((int)(f * f1 + ((float)this.q))));
            view1.requestLayout();
        }
    }

    @Override  // com.google.android.material.sidesheet.c
    public void g(int v) {
        if(v == 1 || v == 2) {
            throw new IllegalArgumentException("STATE_" + (v == 1 ? "DRAGGING" : "SETTLING") + " should not be set externally.");
        }
        if(this.r != null && this.r.get() != null) {
            this.R0(((View)this.r.get()), () -> {
                View view0 = (View)this.r.get();
                if(view0 != null) {
                    this.d1(view0, v, false);
                }
            });
            return;
        }
        this.Y0(v);
    }

    private void g0(@NonNull View view0, int v) {
        if(!this.x.isEmpty()) {
            float f = this.a.b(v);
            for(Object object0: this.x) {
                ((com.google.android.material.sidesheet.d)object0).b(view0, f);
            }
        }
    }

    private void g1(@NonNull p p0) {
        k k0 = this.c;
        if(k0 != null) {
            k0.setShapeAppearanceModel(p0);
        }
    }

    @Override  // com.google.android.material.sidesheet.c
    public int getState() {
        return this.i;
    }

    private void h0(View view0) {
        if(ViewCompat.L(view0) == null) {
            ViewCompat.M1(view0, view0.getResources().getString(SideSheetBehavior.z));
        }
    }

    private void h1(@NonNull View view0) {
        int v = this.i == 5 ? 4 : 0;
        if(view0.getVisibility() != v) {
            view0.setVisibility(v);
        }
    }

    public void i0() {
        this.g(3);
    }

    @NonNull
    public static SideSheetBehavior j0(@NonNull View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).f();
        if(!(coordinatorLayout$Behavior0 instanceof SideSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        return (SideSheetBehavior)coordinatorLayout$Behavior0;
    }

    @Nullable
    @VisibleForTesting
    i k0() {
        return this.v;
    }

    private int l0(int v, int v1, int v2, int v3) {
        int v4 = ViewGroup.getChildMeasureSpec(v, v1, v3);
        if(v2 == -1) {
            return v4;
        }
        int v5 = View.MeasureSpec.getMode(v4);
        int v6 = View.MeasureSpec.getSize(v4);
        if(v5 != 0x40000000) {
            if(v6 != 0) {
                v2 = Math.min(v6, v2);
            }
            return View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(v6, v2), 0x40000000);
    }

    int m0() {
        return this.n;
    }

    @Nullable
    private ValueAnimator.AnimatorUpdateListener n0() {
        View view0 = this.o0();
        if(view0 == null) {
            return null;
        }
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0 == null ? null : (ValueAnimator valueAnimator0) -> {
            this.a.o(viewGroup$MarginLayoutParams0, com.google.android.material.animation.b.c(this.a.c(viewGroup$MarginLayoutParams0), 0, valueAnimator0.getAnimatedFraction()));
            view0.requestLayout();
        };
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        super.o(coordinatorLayout$LayoutParams0);
        this.r = null;
        this.k = null;
        this.v = null;
    }

    @Nullable
    public View o0() {
        return this.s == null ? null : ((View)this.s.get());
    }

    public int p0() {
        return this.a.d();
    }

    @GravityInt
    private int q0() {
        return this.a == null || this.a.j() == 0 ? 5 : 3;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void r() {
        super.r();
        this.r = null;
        this.k = null;
        this.v = null;
    }

    public float r0() {
        return this.m;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(!this.b1(view0)) {
            this.l = true;
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.Q0();
        }
        if(this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                this.w = (int)motionEvent0.getX();
                return !this.l && (this.k != null && this.k.W(motionEvent0));
            label_13:
                if(v == 3) {
                    goto label_14;
                }
                break;
            }
            case 1: {
            label_14:
                if(this.l) {
                    this.l = false;
                    return false;
                }
                break;
            }
            default: {
                goto label_13;
            }
        }
        return !this.l && (this.k != null && this.k.W(motionEvent0));
    }

    float s0() [...] // Inlined contents

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        if(ViewCompat.Y(coordinatorLayout0) && !ViewCompat.Y(view0)) {
            view0.setFitsSystemWindows(true);
        }
        if(this.r == null) {
            this.r = new WeakReference(view0);
            this.v = new i(view0);
            k k0 = this.c;
            if(k0 == null) {
                ColorStateList colorStateList0 = this.d;
                if(colorStateList0 != null) {
                    ViewCompat.S1(view0, colorStateList0);
                }
            }
            else {
                ViewCompat.R1(view0, k0);
                this.c.o0((this.g == -1.0f ? ViewCompat.V(view0) : this.g));
            }
            this.h1(view0);
            this.e1();
            if(ViewCompat.Z(view0) == 0) {
                ViewCompat.b2(view0, 1);
            }
            this.h0(view0);
        }
        this.X0(view0, v);
        if(this.k == null) {
            this.k = ViewDragHelper.q(coordinatorLayout0, this.y);
        }
        int v1 = this.a.h(view0);
        coordinatorLayout0.N(view0, v);
        this.o = coordinatorLayout0.getWidth();
        this.p = this.a.i(coordinatorLayout0);
        this.n = view0.getWidth();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.q = viewGroup$MarginLayoutParams0 == null ? 0 : this.a.a(viewGroup$MarginLayoutParams0);
        ViewCompat.k1(view0, this.a0(v1, view0));
        this.N0(coordinatorLayout0);
        for(Object object0: this.x) {
            if(((com.google.android.material.sidesheet.d)object0) instanceof m) {
            }
        }
        return true;
    }

    int t0() {
        return this.q;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean u(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        view0.measure(this.l0(v, coordinatorLayout0.getPaddingLeft() + coordinatorLayout0.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, -1, viewGroup$MarginLayoutParams0.width), this.l0(v2, coordinatorLayout0.getPaddingTop() + coordinatorLayout0.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, -1, viewGroup$MarginLayoutParams0.height));
        return true;
    }

    @RestrictTo({Scope.b})
    public int u0() {
        return this.j;
    }

    int v0(int v) {
        switch(v) {
            case 3: {
                return this.p0();
            }
            case 5: {
                return this.a.e();
            }
            default: {
                throw new IllegalArgumentException("Invalid state to get outer edge offset: " + v);
            }
        }
    }

    int w0() {
        return this.p;
    }

    int x0() {
        return this.o;
    }

    int y0() [...] // Inlined contents

    @Nullable
    ViewDragHelper z0() {
        return this.k;
    }
}

