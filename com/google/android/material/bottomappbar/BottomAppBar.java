package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.animator;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.l;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M.d;
import com.google.android.material.internal.M.e;
import com.google.android.material.internal.M;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements AttachedBehavior {
    public static class Behavior extends HideBottomViewOnScrollBehavior {
        class a implements View.OnLayoutChangeListener {
            final Behavior a;

            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                BottomAppBar bottomAppBar0 = (BottomAppBar)Behavior.this.r.get();
                if(bottomAppBar0 != null && (view0 instanceof FloatingActionButton || view0 instanceof ExtendedFloatingActionButton)) {
                    int v8 = view0.getHeight();
                    if(view0 instanceof FloatingActionButton) {
                        ((FloatingActionButton)view0).l(Behavior.this.q);
                        int v9 = Behavior.this.q.height();
                        bottomAppBar0.l1(v9);
                        bottomAppBar0.setFabCornerSize(((FloatingActionButton)view0).getShapeAppearanceModel().r().a(new RectF(Behavior.this.q)));
                        v8 = v9;
                    }
                    LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                    if(Behavior.this.s == 0) {
                        if(bottomAppBar0.W8 == 1) {
                            int v10 = view0.getMeasuredHeight();
                            coordinatorLayout$LayoutParams0.bottomMargin = bottomAppBar0.getBottomInset() + (bottomAppBar0.getResources().getDimensionPixelOffset(dimen.mtrl_bottomappbar_fab_bottom_margin) - (v10 - v8) / 2);
                        }
                        coordinatorLayout$LayoutParams0.leftMargin = bottomAppBar0.getLeftInset();
                        coordinatorLayout$LayoutParams0.rightMargin = bottomAppBar0.getRightInset();
                        if(M.s(view0)) {
                            coordinatorLayout$LayoutParams0.leftMargin += bottomAppBar0.X8;
                        }
                        else {
                            coordinatorLayout$LayoutParams0.rightMargin += bottomAppBar0.X8;
                        }
                    }
                    bottomAppBar0.j1();
                    return;
                }
                view0.removeOnLayoutChangeListener(this);
            }
        }

        @NonNull
        private final Rect q;
        private WeakReference r;
        private int s;
        private final View.OnLayoutChangeListener t;

        public Behavior() {
            this.t = new a(this);
            this.q = new Rect();
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.t = new a(this);
            this.q = new Rect();
        }

        @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public boolean I(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
            return this.e0(coordinatorLayout0, ((BottomAppBar)view0), view1, view2, v, v1);
        }

        public boolean d0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull BottomAppBar bottomAppBar0, int v) {
            this.r = new WeakReference(bottomAppBar0);
            View view0 = bottomAppBar0.R0();
            if(view0 != null && !ViewCompat.a1(view0)) {
                BottomAppBar.o1(bottomAppBar0, view0);
                this.s = ((LayoutParams)view0.getLayoutParams()).bottomMargin;
                if(view0 instanceof FloatingActionButton) {
                    if(bottomAppBar0.W8 == 0 && bottomAppBar0.a9) {
                        ViewCompat.X1(((FloatingActionButton)view0), 0.0f);
                        ((FloatingActionButton)view0).setCompatElevation(0.0f);
                    }
                    if(((FloatingActionButton)view0).getShowMotionSpec() == null) {
                        ((FloatingActionButton)view0).setShowMotionSpecResource(animator.mtrl_fab_show_motion_spec);
                    }
                    if(((FloatingActionButton)view0).getHideMotionSpec() == null) {
                        ((FloatingActionButton)view0).setHideMotionSpecResource(animator.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar0.H0(((FloatingActionButton)view0));
                }
                view0.addOnLayoutChangeListener(this.t);
                bottomAppBar0.j1();
            }
            coordinatorLayout0.N(bottomAppBar0, v);
            return super.t(coordinatorLayout0, bottomAppBar0, v);
        }

        // 去混淆评级： 低(20)
        public boolean e0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull BottomAppBar bottomAppBar0, @NonNull View view0, @NonNull View view1, int v, int v1) {
            return bottomAppBar0.getHideOnScroll() && super.I(coordinatorLayout0, bottomAppBar0, view0, view1, v, v1);
        }

        @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.d0(coordinatorLayout0, ((BottomAppBar)view0), v);
        }
    }

    static class SavedState extends AbsSavedState {
        class com.google.android.material.bottomappbar.BottomAppBar.SavedState.a implements Parcelable.ClassLoaderCreator {
            com.google.android.material.bottomappbar.BottomAppBar.SavedState.a() {
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
        int c;
        boolean d;

        static {
            SavedState.CREATOR = new com.google.android.material.bottomappbar.BottomAppBar.SavedState.a();
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = parcel0.readInt();
            this.d = parcel0.readInt() != 0;
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.c);
            parcel0.writeInt(((int)this.d));
        }
    }

    class com.google.android.material.bottomappbar.BottomAppBar.a extends AnimatorListenerAdapter {
        final BottomAppBar a;

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            if(!BottomAppBar.this.i9) {
                BottomAppBar.this.Y0(BottomAppBar.this.U8, BottomAppBar.this.j9);
            }
        }
    }

    class b implements l {
        final BottomAppBar a;

        @Override  // com.google.android.material.animation.l
        public void a(@NonNull View view0) {
            this.c(((FloatingActionButton)view0));
        }

        @Override  // com.google.android.material.animation.l
        public void b(@NonNull View view0) {
            this.d(((FloatingActionButton)view0));
        }

        public void c(@NonNull FloatingActionButton floatingActionButton0) {
            BottomAppBar.this.R8.q0((floatingActionButton0.getVisibility() != 0 || BottomAppBar.this.W8 != 1 ? 0.0f : floatingActionButton0.getScaleY()));
        }

        public void d(@NonNull FloatingActionButton floatingActionButton0) {
            if(BottomAppBar.this.W8 != 1) {
                return;
            }
            float f = floatingActionButton0.getTranslationX();
            if(BottomAppBar.this.getTopEdgeTreatment().j() != f) {
                BottomAppBar.this.getTopEdgeTreatment().p(f);
                BottomAppBar.this.R8.invalidateSelf();
            }
            float f1 = 0.0f;
            float f2 = Math.max(0.0f, -floatingActionButton0.getTranslationY());
            if(BottomAppBar.this.getTopEdgeTreatment().d() != f2) {
                BottomAppBar.this.getTopEdgeTreatment().k(f2);
                BottomAppBar.this.R8.invalidateSelf();
            }
            k k0 = BottomAppBar.this.R8;
            if(floatingActionButton0.getVisibility() == 0) {
                f1 = floatingActionButton0.getScaleY();
            }
            k0.q0(f1);
        }
    }

    interface j {
        void a(BottomAppBar arg1);

        void b(BottomAppBar arg1);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.bottomappbar.BottomAppBar.k {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.bottomappbar.BottomAppBar.l {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    public static final int A9 = 1;
    public static final int B9 = 0;
    public static final int C9 = 1;
    private static final int D9 = -1;
    private static final int E9 = 0;
    @Nullable
    private Integer Q8;
    private final k R8;
    @Nullable
    private Animator S8;
    @Nullable
    private Animator T8;
    private int U8;
    private int V8;
    private int W8;
    private final int X8;
    @Px
    private int Y8;
    private int Z8;
    private final boolean a9;
    private boolean b9;
    private final boolean c9;
    private final boolean d9;
    private final boolean e9;
    private int f9;
    private ArrayList g9;
    @MenuRes
    private int h9;
    private boolean i9;
    private boolean j9;
    private Behavior k9;
    private int l9;
    private int m9;
    private int n9;
    @NonNull
    AnimatorListenerAdapter o9;
    @NonNull
    l p9;
    private static final int q9 = 0;
    private static final int r9 = 300;
    private static final int s9 = 0;
    private static final int t9 = 0;
    private static final float u9 = 0.2f;
    public static final int v9 = 0;
    public static final int w9 = 1;
    public static final int x9 = 0;
    public static final int y9 = 1;
    public static final int z9;

    static {
        BottomAppBar.q9 = style.Widget_MaterialComponents_BottomAppBar;
        BottomAppBar.s9 = attr.motionDurationLong2;
        BottomAppBar.t9 = attr.motionEasingEmphasizedInterpolator;
    }

    public BottomAppBar(@NonNull Context context0) {
        this(context0, null);
    }

    public BottomAppBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.bottomAppBarStyle);
    }

    public BottomAppBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class c implements d {
            final BottomAppBar a;

            @Override  // com.google.android.material.internal.M$d
            @NonNull
            public WindowInsetsCompat a(View view0, @NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull e m$e0) {
                boolean z;
                if(BottomAppBar.this.c9) {
                    int v = windowInsetsCompat0.o();
                    BottomAppBar.this.l9 = v;
                }
                int v1 = 1;
                int v2 = 0;
                if(BottomAppBar.this.d9) {
                    z = BottomAppBar.this.n9 != windowInsetsCompat0.p();
                    int v3 = windowInsetsCompat0.p();
                    BottomAppBar.this.n9 = v3;
                }
                else {
                    z = false;
                }
                if(BottomAppBar.this.e9) {
                    if(BottomAppBar.this.m9 == windowInsetsCompat0.q()) {
                        v1 = 0;
                    }
                    int v4 = windowInsetsCompat0.q();
                    BottomAppBar.this.m9 = v4;
                    v2 = v1;
                }
                if(z || v2 != 0) {
                    BottomAppBar.this.J0();
                    BottomAppBar.this.j1();
                    BottomAppBar.this.i1();
                }
                return windowInsetsCompat0;
            }
        }

        int v1 = BottomAppBar.q9;
        super(I1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        k k0 = new k();
        this.R8 = k0;
        this.f9 = 0;
        this.h9 = 0;
        this.i9 = false;
        this.j9 = true;
        this.o9 = new com.google.android.material.bottomappbar.BottomAppBar.a(this);
        this.p9 = new b(this);
        Context context1 = this.getContext();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.BottomAppBar, v, v1, new int[0]);
        ColorStateList colorStateList0 = com.google.android.material.resources.d.a(context1, typedArray0, styleable.BottomAppBar_backgroundTint);
        if(typedArray0.hasValue(styleable.BottomAppBar_navigationIconTint)) {
            this.setNavigationIconTint(typedArray0.getColor(12, -1));
        }
        int v2 = typedArray0.getDimensionPixelSize(styleable.BottomAppBar_elevation, 0);
        float f = (float)typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabCradleMargin, 0);
        float f1 = (float)typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float f2 = (float)typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.U8 = typedArray0.getInt(styleable.BottomAppBar_fabAlignmentMode, 0);
        this.V8 = typedArray0.getInt(styleable.BottomAppBar_fabAnimationMode, 0);
        this.W8 = typedArray0.getInt(styleable.BottomAppBar_fabAnchorMode, 1);
        this.a9 = typedArray0.getBoolean(styleable.BottomAppBar_removeEmbeddedFabElevation, true);
        this.Z8 = typedArray0.getInt(styleable.BottomAppBar_menuAlignmentMode, 0);
        this.b9 = typedArray0.getBoolean(styleable.BottomAppBar_hideOnScroll, false);
        this.c9 = typedArray0.getBoolean(styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.d9 = typedArray0.getBoolean(styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.e9 = typedArray0.getBoolean(styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.Y8 = typedArray0.getDimensionPixelOffset(styleable.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z = typedArray0.getBoolean(styleable.BottomAppBar_addElevationShadow, true);
        typedArray0.recycle();
        this.X8 = this.getResources().getDimensionPixelOffset(dimen.mtrl_bottomappbar_fabOffsetEndMode);
        com.google.android.material.bottomappbar.d d0 = new com.google.android.material.bottomappbar.d(f, f1, f2);
        k0.setShapeAppearanceModel(p.a().G(d0).m());
        if(z) {
            k0.y0(2);
        }
        else {
            k0.y0(1);
            if(Build.VERSION.SDK_INT >= 28) {
                this.setOutlineAmbientShadowColor(0);
                this.setOutlineSpotShadowColor(0);
            }
        }
        k0.s0(Paint.Style.FILL);
        k0.a0(context1);
        this.setElevation(((float)v2));
        DrawableCompat.o(k0, colorStateList0);
        ViewCompat.R1(this, k0);
        M.g(this, attributeSet0, v, v1, new c(this));
    }

    void G0(@NonNull j bottomAppBar$j0) {
        if(this.g9 == null) {
            this.g9 = new ArrayList();
        }
        this.g9.add(bottomAppBar$j0);
    }

    private void H0(@NonNull FloatingActionButton floatingActionButton0) {
        class i extends AnimatorListenerAdapter {
            final BottomAppBar a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                BottomAppBar.this.o9.onAnimationStart(animator0);
                FloatingActionButton floatingActionButton0 = BottomAppBar.this.Q0();
                if(floatingActionButton0 != null) {
                    floatingActionButton0.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        }

        floatingActionButton0.f(this.o9);
        floatingActionButton0.g(new i(this));
        floatingActionButton0.h(this.p9);
    }

    public void I0(@NonNull com.google.android.material.behavior.HideBottomViewOnScrollBehavior.b hideBottomViewOnScrollBehavior$b0) {
        this.getBehavior().O(hideBottomViewOnScrollBehavior$b0);
    }

    private void J0() {
        Animator animator0 = this.T8;
        if(animator0 != null) {
            animator0.cancel();
        }
        Animator animator1 = this.S8;
        if(animator1 != null) {
            animator1.cancel();
        }
    }

    public void K0() {
        this.getBehavior().Q();
    }

    protected void L0(int v, List list0) {
        class com.google.android.material.bottomappbar.BottomAppBar.e extends com.google.android.material.floatingactionbutton.FloatingActionButton.b {
            final int a;
            final BottomAppBar b;

            com.google.android.material.bottomappbar.BottomAppBar.e(int v) {
                this.a = v;
                super();
            }

            @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$b
            public void a(@NonNull FloatingActionButton floatingActionButton0) {
                class com.google.android.material.bottomappbar.BottomAppBar.e.a extends com.google.android.material.floatingactionbutton.FloatingActionButton.b {
                    final com.google.android.material.bottomappbar.BottomAppBar.e a;

                    @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$b
                    public void b(FloatingActionButton floatingActionButton0) {
                        BottomAppBar.this.O0();
                    }
                }

                floatingActionButton0.setTranslationX(BottomAppBar.this.T0(this.a));
                floatingActionButton0.A(new com.google.android.material.bottomappbar.BottomAppBar.e.a(this));
            }
        }

        FloatingActionButton floatingActionButton0 = this.Q0();
        if(floatingActionButton0 != null && !floatingActionButton0.r()) {
            this.P0();
            floatingActionButton0.p(new com.google.android.material.bottomappbar.BottomAppBar.e(this, v));
        }
    }

    private void M0(int v, @NonNull List list0) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.Q0(), "translationX", new float[]{this.T0(v)});
        objectAnimator0.setDuration(((long)this.getFabAlignmentAnimationDuration()));
        list0.add(objectAnimator0);
    }

    private void N0(int v, boolean z, @NonNull List list0) {
        class g extends AnimatorListenerAdapter {
            public boolean a;
            final ActionMenuView b;
            final int c;
            final boolean d;
            final BottomAppBar e;

            g(ActionMenuView actionMenuView0, int v, boolean z) {
                this.b = actionMenuView0;
                this.c = v;
                this.d = z;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                this.a = true;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                if(!this.a) {
                    BottomAppBar.this.h1(BottomAppBar.this.h9);
                    BottomAppBar.this.n1(this.b, this.c, this.d, BottomAppBar.this.h9 != 0);
                }
            }
        }

        ActionMenuView actionMenuView0 = this.getActionMenuView();
        if(actionMenuView0 == null) {
            return;
        }
        float f = (float)this.getFabAlignmentAnimationDuration();
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(actionMenuView0, "alpha", new float[]{1.0f});
        objectAnimator0.setDuration(((long)(0.8f * f)));
        if(Math.abs(actionMenuView0.getTranslationX() - ((float)this.S0(actionMenuView0, v, z))) > 1.0f) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(actionMenuView0, "alpha", new float[]{0.0f});
            objectAnimator1.setDuration(((long)(f * 0.2f)));
            objectAnimator1.addListener(new g(this, actionMenuView0, v, z));
            AnimatorSet animatorSet0 = new AnimatorSet();
            animatorSet0.playSequentially(new Animator[]{objectAnimator1, objectAnimator0});
            list0.add(animatorSet0);
            return;
        }
        if(actionMenuView0.getAlpha() < 1.0f) {
            list0.add(objectAnimator0);
        }
    }

    private void O0() {
        int v = this.f9 - 1;
        this.f9 = v;
        if(v == 0) {
            ArrayList arrayList0 = this.g9;
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((j)object0).a(this);
                }
            }
        }
    }

    private void P0() {
        int v = this.f9;
        this.f9 = v + 1;
        if(v == 0) {
            ArrayList arrayList0 = this.g9;
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((j)object0).b(this);
                }
            }
        }
    }

    @Nullable
    private FloatingActionButton Q0() {
        View view0 = this.R0();
        return view0 instanceof FloatingActionButton ? ((FloatingActionButton)view0) : null;
    }

    @Nullable
    private View R0() {
        if(!(this.getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for(Object object0: ((CoordinatorLayout)this.getParent()).x(this)) {
            View view0 = (View)object0;
            if(view0 instanceof FloatingActionButton || view0 instanceof ExtendedFloatingActionButton) {
                return view0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected int S0(@NonNull ActionMenuView actionMenuView0, int v, boolean z) {
        int v1 = 0;
        if(this.Z8 != 1 && (v != 1 || !z)) {
            return 0;
        }
        boolean z1 = M.s(this);
        int v2 = z1 ? this.getMeasuredWidth() : 0;
        for(int v3 = 0; v3 < this.getChildCount(); ++v3) {
            View view0 = this.getChildAt(v3);
            if(view0.getLayoutParams() instanceof androidx.appcompat.widget.Toolbar.LayoutParams && (((androidx.appcompat.widget.Toolbar.LayoutParams)view0.getLayoutParams()).a & 0x800007) == 0x800003) {
                v2 = z1 ? Math.min(v2, view0.getLeft()) : Math.max(v2, view0.getRight());
            }
        }
        int v4 = z1 ? actionMenuView0.getRight() : actionMenuView0.getLeft();
        int v5 = z1 ? this.m9 : -this.n9;
        if(this.getNavigationIcon() == null) {
            v1 = this.getResources().getDimensionPixelOffset(dimen.m3_bottomappbar_horizontal_padding);
            if(!z1) {
                v1 = -v1;
            }
        }
        return v2 - (v4 + v5 + v1);
    }

    private float T0(int v) {
        boolean z = M.s(this);
        int v1 = 1;
        if(v == 1) {
            View view0 = this.R0();
            int v2 = z ? this.n9 : this.m9;
            int v3 = this.Y8 == -1 || view0 == null ? this.X8 : view0.getMeasuredWidth() / 2 + this.Y8;
            int v4 = this.getMeasuredWidth();
            if(z) {
                v1 = -1;
            }
            return (float)((v4 / 2 - (v2 + v3)) * v1);
        }
        return 0.0f;
    }

    private boolean U0() {
        FloatingActionButton floatingActionButton0 = this.Q0();
        return floatingActionButton0 != null && floatingActionButton0.s();
    }

    public boolean V0() {
        return this.getBehavior().R();
    }

    public boolean W0() {
        return this.getBehavior().S();
    }

    private void Y0(int v, boolean z) {
        class f extends AnimatorListenerAdapter {
            final BottomAppBar a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BottomAppBar.this.O0();
                BottomAppBar.this.i9 = false;
                BottomAppBar.this.T8 = null;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                BottomAppBar.this.P0();
            }
        }

        if(!ViewCompat.a1(this)) {
            this.i9 = false;
            this.h1(this.h9);
            return;
        }
        Animator animator0 = this.T8;
        if(animator0 != null) {
            animator0.cancel();
        }
        ArrayList arrayList0 = new ArrayList();
        if(!this.U0()) {
            v = 0;
            z = false;
        }
        this.N0(v, z, arrayList0);
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(arrayList0);
        this.T8 = animatorSet0;
        animatorSet0.addListener(new f(this));
        this.T8.start();
    }

    private void Z0(int v) {
        class com.google.android.material.bottomappbar.BottomAppBar.d extends AnimatorListenerAdapter {
            final BottomAppBar a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BottomAppBar.this.O0();
                BottomAppBar.this.S8 = null;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                BottomAppBar.this.P0();
            }
        }

        if(this.U8 != v && ViewCompat.a1(this)) {
            Animator animator0 = this.S8;
            if(animator0 != null) {
                animator0.cancel();
            }
            ArrayList arrayList0 = new ArrayList();
            if(this.V8 == 1) {
                this.M0(v, arrayList0);
            }
            else {
                this.L0(v, arrayList0);
            }
            AnimatorSet animatorSet0 = new AnimatorSet();
            animatorSet0.playTogether(arrayList0);
            animatorSet0.setInterpolator(com.google.android.material.motion.j.g(this.getContext(), BottomAppBar.t9, com.google.android.material.animation.b.a));
            this.S8 = animatorSet0;
            animatorSet0.addListener(new com.google.android.material.bottomappbar.BottomAppBar.d(this));
            this.S8.start();
        }
    }

    @Nullable
    private Drawable a1(@Nullable Drawable drawable0) {
        if(drawable0 != null && this.Q8 != null) {
            drawable0 = DrawableCompat.r(drawable0.mutate());
            DrawableCompat.n(drawable0, ((int)this.Q8));
        }
        return drawable0;
    }

    public void b1() {
        this.c1(true);
    }

    public void c1(boolean z) {
        this.getBehavior().W(this, z);
    }

    public void d1() {
        this.e1(true);
    }

    public void e1(boolean z) {
        this.getBehavior().Y(this, z);
    }

    void f1(@NonNull j bottomAppBar$j0) {
        ArrayList arrayList0 = this.g9;
        if(arrayList0 == null) {
            return;
        }
        arrayList0.remove(bottomAppBar$j0);
    }

    public void g1(@NonNull com.google.android.material.behavior.HideBottomViewOnScrollBehavior.b hideBottomViewOnScrollBehavior$b0) {
        this.getBehavior().T(hideBottomViewOnScrollBehavior$b0);
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0 instanceof ActionMenuView) {
                return (ActionMenuView)view0;
            }
        }
        return null;
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.R8.S();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
        return this.getBehavior();
    }

    @NonNull
    public Behavior getBehavior() {
        if(this.k9 == null) {
            this.k9 = new Behavior();
        }
        return this.k9;
    }

    private int getBottomInset() {
        return this.l9;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return this.getTopEdgeTreatment().d();
    }

    private int getFabAlignmentAnimationDuration() {
        return com.google.android.material.motion.j.f(this.getContext(), BottomAppBar.s9, 300);
    }

    public int getFabAlignmentMode() {
        return this.U8;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.Y8;
    }

    public int getFabAnchorMode() {
        return this.W8;
    }

    public int getFabAnimationMode() {
        return this.V8;
    }

    public float getFabCradleMargin() {
        return this.getTopEdgeTreatment().f();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return this.getTopEdgeTreatment().g();
    }

    private float getFabTranslationX() {
        return this.T0(this.U8);
    }

    private float getFabTranslationY() {
        if(this.W8 == 1) {
            return -this.getTopEdgeTreatment().d();
        }
        View view0 = this.R0();
        return view0 == null ? 0.0f : ((float)(-(this.getMeasuredHeight() + this.getBottomInset() - view0.getMeasuredHeight()) / 2));
    }

    public boolean getHideOnScroll() {
        return this.b9;
    }

    private int getLeftInset() {
        return this.n9;
    }

    public int getMenuAlignmentMode() {
        return this.Z8;
    }

    private int getRightInset() {
        return this.m9;
    }

    @NonNull
    private com.google.android.material.bottomappbar.d getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.d)this.R8.getShapeAppearanceModel().p();
    }

    public void h1(@MenuRes int v) {
        if(v != 0) {
            this.h9 = 0;
            this.getMenu().clear();
            this.x(v);
        }
    }

    private void i1() {
        ActionMenuView actionMenuView0 = this.getActionMenuView();
        if(actionMenuView0 != null && this.T8 == null) {
            actionMenuView0.setAlpha(1.0f);
            if(!this.U0()) {
                this.m1(actionMenuView0, 0, false);
                return;
            }
            this.m1(actionMenuView0, this.U8, this.j9);
        }
    }

    private void j1() {
        this.getTopEdgeTreatment().p(this.getFabTranslationX());
        float f = !this.j9 || !this.U0() || this.W8 != 1 ? 0.0f : 1.0f;
        this.R8.q0(f);
        View view0 = this.R0();
        if(view0 != null) {
            view0.setTranslationY(this.getFabTranslationY());
            view0.setTranslationX(this.getFabTranslationX());
        }
    }

    public void k1(int v, @MenuRes int v1) {
        this.h9 = v1;
        this.i9 = true;
        this.Y0(v, this.j9);
        this.Z0(v);
        this.U8 = v;
    }

    boolean l1(@Px int v) {
        if(((float)v) != this.getTopEdgeTreatment().h()) {
            this.getTopEdgeTreatment().o(((float)v));
            this.R8.invalidateSelf();
            return true;
        }
        return false;
    }

    private void m1(@NonNull ActionMenuView actionMenuView0, int v, boolean z) {
        this.n1(actionMenuView0, v, z, false);
    }

    private void n1(@NonNull ActionMenuView actionMenuView0, int v, boolean z, boolean z1) {
        class h implements Runnable {
            final ActionMenuView a;
            final int b;
            final boolean c;
            final BottomAppBar d;

            h(ActionMenuView actionMenuView0, int v, boolean z) {
                this.a = actionMenuView0;
                this.b = v;
                this.c = z;
                super();
            }

            @Override
            public void run() {
                float f = (float)BottomAppBar.this.S0(this.a, this.b, this.c);
                this.a.setTranslationX(f);
            }
        }

        h bottomAppBar$h0 = new h(this, actionMenuView0, v, z);
        if(z1) {
            actionMenuView0.post(bottomAppBar$h0);
            return;
        }
        bottomAppBar$h0.run();
    }

    private static void o1(BottomAppBar bottomAppBar0, View view0) {
        LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        coordinatorLayout$LayoutParams0.d = 17;
        int v = bottomAppBar0.W8;
        if(v == 1) {
            coordinatorLayout$LayoutParams0.d = 49;
        }
        if(v == 0) {
            coordinatorLayout$LayoutParams0.d |= 80;
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.f(this, this.R8);
        if(this.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.getParent()).setClipChildren(false);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            this.J0();
            this.j1();
            View view0 = this.R0();
            if(view0 != null && ViewCompat.a1(view0)) {
                view0.post(new com.google.android.material.bottomappbar.c(view0));
            }
        }
        this.i1();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.U8 = ((SavedState)parcelable0).c;
        this.j9 = ((SavedState)parcelable0).d;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    @NonNull
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.c = this.U8;
        parcelable0.d = this.j9;
        return parcelable0;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList0) {
        DrawableCompat.o(this.R8, colorStateList0);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if(f != this.getCradleVerticalOffset()) {
            this.getTopEdgeTreatment().k(f);
            this.R8.invalidateSelf();
            this.j1();
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        this.R8.o0(f);
        this.getBehavior().U(this, this.R8.L() - this.R8.K());
    }

    public void setFabAlignmentMode(int v) {
        this.k1(v, 0);
    }

    public void setFabAlignmentModeEndMargin(@Px int v) {
        if(this.Y8 != v) {
            this.Y8 = v;
            this.j1();
        }
    }

    public void setFabAnchorMode(int v) {
        this.W8 = v;
        this.j1();
        View view0 = this.R0();
        if(view0 != null) {
            BottomAppBar.o1(this, view0);
            view0.requestLayout();
            this.R8.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int v) {
        this.V8 = v;
    }

    void setFabCornerSize(@Dimension float f) {
        if(f != this.getTopEdgeTreatment().e()) {
            this.getTopEdgeTreatment().l(f);
            this.R8.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if(f != this.getFabCradleMargin()) {
            this.getTopEdgeTreatment().m(f);
            this.R8.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if(f != this.getFabCradleRoundedCornerRadius()) {
            this.getTopEdgeTreatment().n(f);
            this.R8.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.b9 = z;
    }

    public void setMenuAlignmentMode(int v) {
        if(this.Z8 != v) {
            this.Z8 = v;
            ActionMenuView actionMenuView0 = this.getActionMenuView();
            if(actionMenuView0 != null) {
                this.m1(actionMenuView0, this.U8, this.U0());
            }
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable0) {
        super.setNavigationIcon(this.a1(drawable0));
    }

    public void setNavigationIconTint(@ColorInt int v) {
        this.Q8 = v;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence0) {
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence0) {
    }
}

