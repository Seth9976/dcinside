package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.animator;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.D;
import com.google.android.material.internal.d;
import com.google.android.material.shape.p;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements AttachedBehavior {
    public static class ExtendedFloatingActionButtonBehavior extends Behavior {
        private Rect a;
        @Nullable
        private l b;
        @Nullable
        private l c;
        private boolean d;
        private boolean e;
        private static final boolean f = false;
        private static final boolean g = true;

        public ExtendedFloatingActionButtonBehavior() {
            this.d = false;
            this.e = true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.d = typedArray0.getBoolean(styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.e = typedArray0.getBoolean(styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArray0.recycle();
        }

        // 去混淆评级： 低(20)
        protected void N(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton0) {
            extendedFloatingActionButton0.N((this.e ? 3 : 0), (this.e ? this.c : this.b));
        }

        public boolean O(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0, @NonNull Rect rect0) {
            return super.i(coordinatorLayout0, extendedFloatingActionButton0, rect0);
        }

        public boolean P() {
            return this.d;
        }

        public boolean Q() {
            return this.e;
        }

        private static boolean R(@NonNull View view0) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            return viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0).f() instanceof BottomSheetBehavior : false;
        }

        public boolean S(CoordinatorLayout coordinatorLayout0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0, View view0) {
            if(view0 instanceof AppBarLayout) {
                this.a0(coordinatorLayout0, ((AppBarLayout)view0), extendedFloatingActionButton0);
                return false;
            }
            if(ExtendedFloatingActionButtonBehavior.R(view0)) {
                this.b0(view0, extendedFloatingActionButton0);
            }
            return false;
        }

        public boolean T(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0, int v) {
            List list0 = coordinatorLayout0.w(extendedFloatingActionButton0);
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = (View)list0.get(v2);
                if(!(view0 instanceof AppBarLayout)) {
                    if(!ExtendedFloatingActionButtonBehavior.R(view0) || !this.b0(view0, extendedFloatingActionButton0)) {
                        continue;
                    }
                    break;
                }
                else if(this.a0(coordinatorLayout0, ((AppBarLayout)view0), extendedFloatingActionButton0)) {
                    break;
                }
            }
            coordinatorLayout0.N(extendedFloatingActionButton0, v);
            return true;
        }

        public void U(boolean z) {
            this.d = z;
        }

        public void V(boolean z) {
            this.e = z;
        }

        @VisibleForTesting
        void W(@Nullable l extendedFloatingActionButton$l0) {
            this.b = extendedFloatingActionButton$l0;
        }

        @VisibleForTesting
        void X(@Nullable l extendedFloatingActionButton$l0) {
            this.c = extendedFloatingActionButton$l0;
        }

        private boolean Y(@NonNull View view0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)extendedFloatingActionButton0.getLayoutParams();
            return this.d || this.e ? coordinatorLayout$LayoutParams0.e() == view0.getId() : false;
        }

        // 去混淆评级： 低(20)
        protected void Z(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton0) {
            extendedFloatingActionButton0.N((this.e ? 2 : 1), (this.e ? this.c : this.b));
        }

        private boolean a0(CoordinatorLayout coordinatorLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0) {
            if(!this.Y(appBarLayout0, extendedFloatingActionButton0)) {
                return false;
            }
            if(this.a == null) {
                this.a = new Rect();
            }
            Rect rect0 = this.a;
            d.a(coordinatorLayout0, appBarLayout0, rect0);
            if(rect0.bottom <= appBarLayout0.getMinimumHeightForVisibleOverlappingContent()) {
                this.Z(extendedFloatingActionButton0);
                return true;
            }
            this.N(extendedFloatingActionButton0);
            return true;
        }

        private boolean b0(@NonNull View view0, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton0) {
            if(!this.Y(view0, extendedFloatingActionButton0)) {
                return false;
            }
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)extendedFloatingActionButton0.getLayoutParams();
            if(view0.getTop() < extendedFloatingActionButton0.getHeight() / 2 + coordinatorLayout$LayoutParams0.topMargin) {
                this.Z(extendedFloatingActionButton0);
                return true;
            }
            this.N(extendedFloatingActionButton0);
            return true;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean i(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull Rect rect0) {
            return this.O(coordinatorLayout0, ((ExtendedFloatingActionButton)view0), rect0);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
            if(coordinatorLayout$LayoutParams0.h == 0) {
                coordinatorLayout$LayoutParams0.h = 80;
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean p(CoordinatorLayout coordinatorLayout0, @NonNull View view0, View view1) {
            return this.S(coordinatorLayout0, ((ExtendedFloatingActionButton)view0), view1);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
            return this.T(coordinatorLayout0, ((ExtendedFloatingActionButton)view0), v);
        }
    }

    class f extends Property {
        f(Class class0, String s) {
            super(class0, s);
        }

        @NonNull
        public Float a(@NonNull View view0) {
            return (float)view0.getLayoutParams().width;
        }

        public void b(@NonNull View view0, @NonNull Float float0) {
            view0.getLayoutParams().width = float0.intValue();
            view0.requestLayout();
        }

        @Override  // android.util.Property
        @NonNull
        public Object get(@NonNull Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @NonNull Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    class g extends Property {
        g(Class class0, String s) {
            super(class0, s);
        }

        @NonNull
        public Float a(@NonNull View view0) {
            return (float)view0.getLayoutParams().height;
        }

        public void b(@NonNull View view0, @NonNull Float float0) {
            view0.getLayoutParams().height = float0.intValue();
            view0.requestLayout();
        }

        @Override  // android.util.Property
        @NonNull
        public Object get(@NonNull Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @NonNull Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    class h extends Property {
        h(Class class0, String s) {
            super(class0, s);
        }

        @NonNull
        public Float a(@NonNull View view0) {
            return (float)ViewCompat.p0(view0);
        }

        public void b(@NonNull View view0, @NonNull Float float0) {
            ViewCompat.p2(view0, float0.intValue(), view0.getPaddingTop(), ViewCompat.o0(view0), view0.getPaddingBottom());
        }

        @Override  // android.util.Property
        @NonNull
        public Object get(@NonNull Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @NonNull Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    class i extends Property {
        i(Class class0, String s) {
            super(class0, s);
        }

        @NonNull
        public Float a(@NonNull View view0) {
            return (float)ViewCompat.o0(view0);
        }

        public void b(@NonNull View view0, @NonNull Float float0) {
            ViewCompat.p2(view0, ViewCompat.p0(view0), view0.getPaddingTop(), float0.intValue(), view0.getPaddingBottom());
        }

        @Override  // android.util.Property
        @NonNull
        public Object get(@NonNull Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @NonNull Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    class j extends b {
        private final n g;
        private final boolean h;
        final ExtendedFloatingActionButton i;

        j(a a0, n extendedFloatingActionButton$n0, boolean z) {
            super(extendedFloatingActionButton0, a0);
            this.g = extendedFloatingActionButton$n0;
            this.h = z;
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.M = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = ExtendedFloatingActionButton.this.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                return;
            }
            viewGroup$LayoutParams0.width = this.g.getLayoutParams().width;
            viewGroup$LayoutParams0.height = this.g.getLayoutParams().height;
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return this.h == ExtendedFloatingActionButton.this.L || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.material.floatingactionbutton.f
        public int f() {
            return this.h ? animator.mtrl_extended_fab_change_size_expand_motion_spec : animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        @NonNull
        public AnimatorSet g() {
            com.google.android.material.animation.i i0 = this.b();
            if(i0.j("width")) {
                PropertyValuesHolder[] arr_propertyValuesHolder = i0.g("width");
                arr_propertyValuesHolder[0].setFloatValues(new float[]{((float)ExtendedFloatingActionButton.this.getWidth()), ((float)this.g.getWidth())});
                i0.l("width", arr_propertyValuesHolder);
            }
            if(i0.j("height")) {
                PropertyValuesHolder[] arr_propertyValuesHolder1 = i0.g("height");
                arr_propertyValuesHolder1[0].setFloatValues(new float[]{((float)ExtendedFloatingActionButton.this.getHeight()), ((float)this.g.getHeight())});
                i0.l("height", arr_propertyValuesHolder1);
            }
            if(i0.j("paddingStart")) {
                PropertyValuesHolder[] arr_propertyValuesHolder2 = i0.g("paddingStart");
                arr_propertyValuesHolder2[0].setFloatValues(new float[]{((float)ViewCompat.p0(ExtendedFloatingActionButton.this)), ((float)this.g.getPaddingStart())});
                i0.l("paddingStart", arr_propertyValuesHolder2);
            }
            if(i0.j("paddingEnd")) {
                PropertyValuesHolder[] arr_propertyValuesHolder3 = i0.g("paddingEnd");
                arr_propertyValuesHolder3[0].setFloatValues(new float[]{((float)ViewCompat.o0(ExtendedFloatingActionButton.this)), ((float)this.g.getPaddingEnd())});
                i0.l("paddingEnd", arr_propertyValuesHolder3);
            }
            if(i0.j("labelOpacity")) {
                PropertyValuesHolder[] arr_propertyValuesHolder4 = i0.g("labelOpacity");
                float f = 1.0f;
                float f1 = this.h ? 0.0f : 1.0f;
                if(!this.h) {
                    f = 0.0f;
                }
                arr_propertyValuesHolder4[0].setFloatValues(new float[]{f1, f});
                i0.l("labelOpacity", arr_propertyValuesHolder4);
            }
            return super.n(i0);
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public void h(@Nullable l extendedFloatingActionButton$l0) {
            if(extendedFloatingActionButton$l0 == null) {
                return;
            }
            if(this.h) {
            }
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public void i() {
            ExtendedFloatingActionButton.this.L = this.h;
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = ExtendedFloatingActionButton.this.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                return;
            }
            if(!this.h) {
                ExtendedFloatingActionButton.this.P = viewGroup$LayoutParams0.width;
                ExtendedFloatingActionButton.this.Q = viewGroup$LayoutParams0.height;
            }
            viewGroup$LayoutParams0.width = this.g.getLayoutParams().width;
            viewGroup$LayoutParams0.height = this.g.getLayoutParams().height;
            int v = this.g.getPaddingStart();
            int v1 = ExtendedFloatingActionButton.this.getPaddingTop();
            int v2 = this.g.getPaddingEnd();
            int v3 = ExtendedFloatingActionButton.this.getPaddingBottom();
            ViewCompat.p2(ExtendedFloatingActionButton.this, v, v1, v2, v3);
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator0) {
            super.onAnimationStart(animator0);
            ExtendedFloatingActionButton.this.L = this.h;
            ExtendedFloatingActionButton.this.M = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class k extends b {
        private boolean g;
        final ExtendedFloatingActionButton h;

        public k(a a0) {
            super(extendedFloatingActionButton0, a0);
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.B = 0;
            if(!this.g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.L();
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public int f() {
            return animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public void h(@Nullable l extendedFloatingActionButton$l0) {
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public void i() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        public void j() {
            super.j();
            this.g = true;
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator0) {
            super.onAnimationStart(animator0);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.B = 1;
        }
    }

    public static abstract class l {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        }
    }

    class m extends b {
        final ExtendedFloatingActionButton g;

        public m(a a0) {
            super(extendedFloatingActionButton0, a0);
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.B = 0;
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.M();
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public int f() {
            return animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public void h(@Nullable l extendedFloatingActionButton$l0) {
        }

        @Override  // com.google.android.material.floatingactionbutton.f
        public void i() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override  // com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator0) {
            super.onAnimationStart(animator0);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.B = 2;
        }
    }

    interface n {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    private int B;
    private final a C;
    @NonNull
    private final com.google.android.material.floatingactionbutton.f D;
    @NonNull
    private final com.google.android.material.floatingactionbutton.f E;
    private final com.google.android.material.floatingactionbutton.f F;
    private final com.google.android.material.floatingactionbutton.f G;
    private final int H;
    private int I;
    private int J;
    @NonNull
    private final Behavior K;
    private boolean L;
    private boolean M;
    private final int M8;
    private boolean N;
    private static final int N8 = 0;
    @NonNull
    protected ColorStateList O;
    private static final int O8 = 0;
    private int P;
    private static final int P8 = 1;
    private int Q;
    private static final int Q8 = 2;
    private static final int R8 = 0;
    private static final int S8 = 1;
    private static final int T8 = 2;
    private static final int U8 = 3;
    private static final int V8 = 0;
    private static final int W8 = 1;
    private static final int X8 = 2;
    static final Property Y8;
    static final Property Z8;
    static final Property a9;
    static final Property b9;

    static {
        ExtendedFloatingActionButton.N8 = style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
        ExtendedFloatingActionButton.Y8 = new f(Float.class, "width");
        ExtendedFloatingActionButton.Z8 = new g(Float.class, "height");
        ExtendedFloatingActionButton.a9 = new h(Float.class, "paddingStart");
        ExtendedFloatingActionButton.b9 = new i(Float.class, "paddingEnd");
    }

    public ExtendedFloatingActionButton(@NonNull Context context0) {
        this(context0, null);
    }

    public ExtendedFloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.a implements n {
            final ExtendedFloatingActionButton a;

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(this.getWidth(), this.getHeight());
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getWidth() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }
        }

        super(I1.a.c(context0, attributeSet0, v, ExtendedFloatingActionButton.N8), attributeSet0, v);
        this.B = 0;
        a a0 = new a();
        this.C = a0;
        m extendedFloatingActionButton$m0 = new m(this, a0);
        this.F = extendedFloatingActionButton$m0;
        k extendedFloatingActionButton$k0 = new k(this, a0);
        this.G = extendedFloatingActionButton$k0;
        this.L = true;
        this.M = false;
        this.N = false;
        Context context1 = this.getContext();
        this.K = new ExtendedFloatingActionButtonBehavior(context1, attributeSet0);
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.ExtendedFloatingActionButton, v, ExtendedFloatingActionButton.N8, new int[0]);
        com.google.android.material.animation.i i0 = com.google.android.material.animation.i.c(context1, typedArray0, styleable.ExtendedFloatingActionButton_showMotionSpec);
        com.google.android.material.animation.i i1 = com.google.android.material.animation.i.c(context1, typedArray0, styleable.ExtendedFloatingActionButton_hideMotionSpec);
        com.google.android.material.animation.i i2 = com.google.android.material.animation.i.c(context1, typedArray0, styleable.ExtendedFloatingActionButton_extendMotionSpec);
        com.google.android.material.animation.i i3 = com.google.android.material.animation.i.c(context1, typedArray0, styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.H = typedArray0.getDimensionPixelSize(styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int v1 = typedArray0.getInt(styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.M8 = v1;
        this.I = ViewCompat.p0(this);
        this.J = ViewCompat.o0(this);
        a a1 = new a();
        j extendedFloatingActionButton$j0 = new j(this, a1, this.H(v1), true);
        this.E = extendedFloatingActionButton$j0;
        j extendedFloatingActionButton$j1 = new j(this, a1, new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.a(this), false);
        this.D = extendedFloatingActionButton$j1;
        extendedFloatingActionButton$m0.l(i0);
        extendedFloatingActionButton$k0.l(i1);
        extendedFloatingActionButton$j0.l(i2);
        extendedFloatingActionButton$j1.l(i3);
        typedArray0.recycle();
        this.setShapeAppearanceModel(p.g(context1, attributeSet0, v, ExtendedFloatingActionButton.N8, p.m).m());
        this.S();
    }

    public void B(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.E.k(animator$AnimatorListener0);
    }

    public void C(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.G.k(animator$AnimatorListener0);
    }

    public void D(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.F.k(animator$AnimatorListener0);
    }

    public void E(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.D.k(animator$AnimatorListener0);
    }

    public void F() {
        this.N(3, null);
    }

    public void G(@NonNull l extendedFloatingActionButton$l0) {
        this.N(3, extendedFloatingActionButton$l0);
    }

    private n H(int v) {
        class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.b implements n {
            final ExtendedFloatingActionButton a;

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-2, -2);
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.J;
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.I;
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getWidth() {
                return ExtendedFloatingActionButton.this.getMeasuredWidth() - ExtendedFloatingActionButton.this.getCollapsedPadding() * 2 + ExtendedFloatingActionButton.this.I + ExtendedFloatingActionButton.this.J;
            }
        }


        class c implements n {
            final n a;
            final ExtendedFloatingActionButton b;

            c(n extendedFloatingActionButton$n0) {
                this.a = extendedFloatingActionButton$n0;
                super();
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getHeight() {
                switch(ExtendedFloatingActionButton.this.Q) {
                    case -1: {
                        if(!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                            return this.a.getHeight();
                        }
                        View view0 = (View)ExtendedFloatingActionButton.this.getParent();
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                        if(viewGroup$LayoutParams0 != null && viewGroup$LayoutParams0.height == -2) {
                            return this.a.getHeight();
                        }
                        int v = view0.getPaddingTop();
                        int v1 = view0.getPaddingBottom();
                        if(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)ExtendedFloatingActionButton.this.getLayoutParams();
                            if(viewGroup$MarginLayoutParams0 != null) {
                                int v2 = viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin;
                                return view0.getHeight() - v2 - (v + v1);
                            }
                        }
                        return view0.getHeight() - (v + v1);
                    }
                    case -2: 
                    case 0: {
                        return this.a.getHeight();
                    }
                    default: {
                        return ExtendedFloatingActionButton.this.Q;
                    }
                }
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public ViewGroup.LayoutParams getLayoutParams() {
                return ExtendedFloatingActionButton.this.Q == 0 ? new ViewGroup.LayoutParams(-1, -2) : new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.Q);
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.J;
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.I;
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getWidth() {
                if(!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return this.a.getWidth();
                }
                View view0 = (View)ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(viewGroup$LayoutParams0 != null && viewGroup$LayoutParams0.width == -2) {
                    return this.a.getWidth();
                }
                int v = view0.getPaddingLeft();
                int v1 = view0.getPaddingRight();
                if(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)ExtendedFloatingActionButton.this.getLayoutParams();
                    if(viewGroup$MarginLayoutParams0 != null) {
                        int v2 = viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin;
                        return view0.getWidth() - v2 - (v + v1);
                    }
                }
                return view0.getWidth() - (v + v1);
            }
        }


        class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.d implements n {
            final n a;
            final n b;
            final ExtendedFloatingActionButton c;

            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.d(n extendedFloatingActionButton$n0, n extendedFloatingActionButton$n1) {
                this.a = extendedFloatingActionButton$n0;
                this.b = extendedFloatingActionButton$n1;
                super();
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getHeight() {
                switch(ExtendedFloatingActionButton.this.Q) {
                    case -1: {
                        return this.a.getHeight();
                    }
                    case -2: 
                    case 0: {
                        return this.b.getHeight();
                    }
                    default: {
                        return ExtendedFloatingActionButton.this.Q;
                    }
                }
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public ViewGroup.LayoutParams getLayoutParams() {
                int v = -2;
                int v1 = ExtendedFloatingActionButton.this.P == 0 ? -2 : ExtendedFloatingActionButton.this.P;
                if(ExtendedFloatingActionButton.this.Q != 0) {
                    v = ExtendedFloatingActionButton.this.Q;
                }
                return new ViewGroup.LayoutParams(v1, v);
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.J;
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.I;
            }

            @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n
            public int getWidth() {
                switch(ExtendedFloatingActionButton.this.P) {
                    case -1: {
                        return this.a.getWidth();
                    }
                    case -2: 
                    case 0: {
                        return this.b.getWidth();
                    }
                    default: {
                        return ExtendedFloatingActionButton.this.P;
                    }
                }
            }
        }

        n extendedFloatingActionButton$n0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.b(this);
        n extendedFloatingActionButton$n1 = new c(this, extendedFloatingActionButton$n0);
        n extendedFloatingActionButton$n2 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.d(this, extendedFloatingActionButton$n1, extendedFloatingActionButton$n0);
        switch(v) {
            case 1: {
                return extendedFloatingActionButton$n0;
            }
            case 2: {
                return extendedFloatingActionButton$n1;
            }
            default: {
                return extendedFloatingActionButton$n2;
            }
        }
    }

    public void I() {
        this.N(1, null);
    }

    public void J(@NonNull l extendedFloatingActionButton$l0) {
        this.N(1, extendedFloatingActionButton$l0);
    }

    public final boolean K() {
        return this.L;
    }

    private boolean L() {
        return this.getVisibility() == 0 ? this.B == 1 : this.B != 2;
    }

    private boolean M() {
        return this.getVisibility() == 0 ? this.B != 1 : this.B == 2;
    }

    private void N(int v, @Nullable l extendedFloatingActionButton$l0) {
        class e extends AnimatorListenerAdapter {
            private boolean a;
            final com.google.android.material.floatingactionbutton.f b;
            final l c;
            final ExtendedFloatingActionButton d;

            e(com.google.android.material.floatingactionbutton.f f0, l extendedFloatingActionButton$l0) {
                this.b = f0;
                this.c = extendedFloatingActionButton$l0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                this.a = true;
                this.b.j();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.b.a();
                if(!this.a) {
                    this.b.h(this.c);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                this.b.onAnimationStart(animator0);
                this.a = false;
            }
        }

        com.google.android.material.floatingactionbutton.f f0;
        if(v == 0) {
            f0 = this.F;
        }
        else {
            switch(v) {
                case 1: {
                    f0 = this.G;
                    break;
                }
                case 2: {
                    f0 = this.D;
                    break;
                }
                default: {
                    if(v != 3) {
                        throw new IllegalStateException("Unknown strategy type: " + v);
                    }
                    f0 = this.E;
                    break;
                }
            }
        }
        if(f0.d()) {
            return;
        }
        if(!this.T()) {
            f0.i();
            f0.h(extendedFloatingActionButton$l0);
            return;
        }
        if(v == 2) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                this.P = this.getWidth();
                this.Q = this.getHeight();
            }
            else {
                this.P = viewGroup$LayoutParams0.width;
                this.Q = viewGroup$LayoutParams0.height;
            }
        }
        this.measure(0, 0);
        AnimatorSet animatorSet0 = f0.g();
        animatorSet0.addListener(new e(this, f0, extendedFloatingActionButton$l0));
        for(Object object0: f0.getListeners()) {
            animatorSet0.addListener(((Animator.AnimatorListener)object0));
        }
        animatorSet0.start();
    }

    public void O(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.E.e(animator$AnimatorListener0);
    }

    public void P(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.G.e(animator$AnimatorListener0);
    }

    public void Q(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.F.e(animator$AnimatorListener0);
    }

    public void R(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.D.e(animator$AnimatorListener0);
    }

    private void S() {
        this.O = this.getTextColors();
    }

    // 去混淆评级： 低(40)
    private boolean T() {
        return (ViewCompat.a1(this) || !this.M() && this.N) && !this.isInEditMode();
    }

    public void U() {
        this.N(0, null);
    }

    public void V(@NonNull l extendedFloatingActionButton$l0) {
        this.N(0, extendedFloatingActionButton$l0);
    }

    public void W() {
        this.N(2, null);
    }

    public void X(@NonNull l extendedFloatingActionButton$l0) {
        this.N(2, extendedFloatingActionButton$l0);
    }

    protected void Y(@NonNull ColorStateList colorStateList0) {
        super.setTextColor(colorStateList0);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        return this.K;
    }

    int getCollapsedPadding() {
        return (this.getCollapsedSize() - this.getIconSize()) / 2;
    }

    @VisibleForTesting
    int getCollapsedSize() {
        return this.H >= 0 ? this.H : Math.min(ViewCompat.p0(this), ViewCompat.o0(this)) * 2 + this.getIconSize();
    }

    @Nullable
    public com.google.android.material.animation.i getExtendMotionSpec() {
        return this.E.c();
    }

    @Nullable
    public com.google.android.material.animation.i getHideMotionSpec() {
        return this.G.c();
    }

    @Nullable
    public com.google.android.material.animation.i getShowMotionSpec() {
        return this.F.c();
    }

    @Nullable
    public com.google.android.material.animation.i getShrinkMotionSpec() {
        return this.D.c();
    }

    @Override  // com.google.android.material.button.MaterialButton
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.L && TextUtils.isEmpty(this.getText()) && this.getIcon() != null) {
            this.L = false;
            this.D.i();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.N = z;
    }

    public void setExtendMotionSpec(@Nullable com.google.android.material.animation.i i0) {
        this.E.l(i0);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int v) {
        this.setExtendMotionSpec(com.google.android.material.animation.i.d(this.getContext(), v));
    }

    public void setExtended(boolean z) {
        if(this.L == z) {
            return;
        }
        com.google.android.material.floatingactionbutton.f f0 = z ? this.E : this.D;
        if(f0.d()) {
            return;
        }
        f0.i();
    }

    public void setHideMotionSpec(@Nullable com.google.android.material.animation.i i0) {
        this.G.l(i0);
    }

    public void setHideMotionSpecResource(@AnimatorRes int v) {
        this.setHideMotionSpec(com.google.android.material.animation.i.d(this.getContext(), v));
    }

    @Override  // android.widget.TextView
    public void setPadding(int v, int v1, int v2, int v3) {
        super.setPadding(v, v1, v2, v3);
        if(this.L && !this.M) {
            this.I = ViewCompat.p0(this);
            this.J = ViewCompat.o0(this);
        }
    }

    @Override  // android.widget.TextView
    public void setPaddingRelative(int v, int v1, int v2, int v3) {
        super.setPaddingRelative(v, v1, v2, v3);
        if(this.L && !this.M) {
            this.I = v;
            this.J = v2;
        }
    }

    public void setShowMotionSpec(@Nullable com.google.android.material.animation.i i0) {
        this.F.l(i0);
    }

    public void setShowMotionSpecResource(@AnimatorRes int v) {
        this.setShowMotionSpec(com.google.android.material.animation.i.d(this.getContext(), v));
    }

    public void setShrinkMotionSpec(@Nullable com.google.android.material.animation.i i0) {
        this.D.l(i0);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int v) {
        this.setShrinkMotionSpec(com.google.android.material.animation.i.d(this.getContext(), v));
    }

    @Override  // android.widget.TextView
    public void setTextColor(int v) {
        super.setTextColor(v);
        this.S();
    }

    @Override  // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList0) {
        super.setTextColor(colorStateList0);
        this.S();
    }
}

