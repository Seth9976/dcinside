package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat.Builder;
import androidx.core.view.WindowInsetsCompat;

@SuppressLint({"UnknownNullness"})
@RestrictTo({Scope.c})
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent2, NestedScrollingParent3, NestedScrollingParent {
    public interface ActionBarVisibilityCallback {
        void a();

        void b();

        void c();

        void d();

        void e(boolean arg1);

        void onWindowVisibilityChanged(int arg1);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }
    }

    static final class NoSystemUiLayoutFlagView extends View {
        NoSystemUiLayoutFlagView(Context context0) {
            super(context0);
            this.setWillNotDraw(true);
        }

        @Override  // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final NestedScrollingParentHelper E;
    private final NoSystemUiLayoutFlagView F;
    private static final String G = "ActionBarOverlayLayout";
    private static final int H = 600;
    static final int[] I;
    private static final WindowInsetsCompat J;
    private static final Rect K;
    private int a;
    private int b;
    private ContentFrameLayout c;
    ActionBarContainer d;
    private DecorToolbar e;
    private Drawable f;
    private boolean g;
    private boolean h;
    private boolean i;
    boolean j;
    private int k;
    private int l;
    private final Rect m;
    private final Rect n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    @NonNull
    private WindowInsetsCompat u;
    @NonNull
    private WindowInsetsCompat v;
    @NonNull
    private WindowInsetsCompat w;
    @NonNull
    private WindowInsetsCompat x;
    private ActionBarVisibilityCallback y;
    private OverScroller z;

    static {
        ActionBarOverlayLayout.I = new int[]{attr.actionBarSize, 0x1010059};
        ActionBarOverlayLayout.J = new Builder().h(Insets.d(0, 1, 0, 1)).a();
        ActionBarOverlayLayout.K = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public ActionBarOverlayLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = WindowInsetsCompat.c;
        this.v = WindowInsetsCompat.c;
        this.w = WindowInsetsCompat.c;
        this.x = WindowInsetsCompat.c;
        this.B = new AnimatorListenerAdapter() {
            final ActionBarOverlayLayout a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                ActionBarOverlayLayout.this.A = null;
                ActionBarOverlayLayout.this.j = false;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                ActionBarOverlayLayout.this.A = null;
                ActionBarOverlayLayout.this.j = false;
            }
        };
        this.C = new Runnable() {
            final ActionBarOverlayLayout a;

            @Override
            public void run() {
                ActionBarOverlayLayout.this.z();
                ActionBarOverlayLayout.this.A = ActionBarOverlayLayout.this.d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
            }
        };
        this.D = new Runnable() {
            final ActionBarOverlayLayout a;

            @Override
            public void run() {
                ActionBarOverlayLayout.this.z();
                ActionBarOverlayLayout.this.A = ActionBarOverlayLayout.this.d.animate().translationY(((float)(-ActionBarOverlayLayout.this.d.getHeight()))).setListener(ActionBarOverlayLayout.this.B);
            }
        };
        this.A(context0);
        this.E = new NestedScrollingParentHelper(this);
        NoSystemUiLayoutFlagView actionBarOverlayLayout$NoSystemUiLayoutFlagView0 = new NoSystemUiLayoutFlagView(context0);
        this.F = actionBarOverlayLayout$NoSystemUiLayoutFlagView0;
        this.addView(actionBarOverlayLayout$NoSystemUiLayoutFlagView0);
    }

    private void A(Context context0) {
        TypedArray typedArray0 = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.I);
        boolean z = false;
        this.a = typedArray0.getDimensionPixelSize(0, 0);
        Drawable drawable0 = typedArray0.getDrawable(1);
        this.f = drawable0;
        if(drawable0 == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        typedArray0.recycle();
        this.z = new OverScroller(context0);
    }

    public boolean B() {
        return this.i;
    }

    public boolean C() {
        return this.g;
    }

    private void D() {
        this.z();
        this.postDelayed(this.D, 600L);
    }

    private void E() {
        this.z();
        this.postDelayed(this.C, 600L);
    }

    void F() {
        if(this.c == null) {
            this.c = (ContentFrameLayout)this.findViewById(id.action_bar_activity_content);
            this.d = (ActionBarContainer)this.findViewById(id.action_bar_container);
            this.e = this.y(this.findViewById(id.action_bar));
        }
    }

    private void G() {
        this.z();
        this.C.run();
    }

    private boolean H(float f) {
        this.z.fling(0, 0, 0, ((int)f), 0, 0, 0x80000000, 0x7FFFFFFF);
        return this.z.getFinalY() > this.d.getHeight();
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void a(View view0, View view1, int v, int v1) {
        if(v1 == 0) {
            this.onNestedScrollAccepted(view0, view1, v);
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean b() {
        this.F();
        return this.e.b();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean c() {
        this.F();
        return this.e.c();
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean d() {
        this.F();
        return this.e.d();
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        if(this.f != null) {
            int v = this.d.getVisibility() == 0 ? ((int)(((float)this.d.getBottom()) + this.d.getTranslationY() + 0.5f)) : 0;
            this.f.setBounds(0, v, this.getWidth(), this.f.getIntrinsicHeight() + v);
            this.f.draw(canvas0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean e() {
        this.F();
        return this.e.e();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean f() {
        this.F();
        return this.e.f();
    }

    @Override  // android.view.View
    protected boolean fitSystemWindows(Rect rect0) {
        return super.fitSystemWindows(rect0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void g(Menu menu0, Callback menuPresenter$Callback0) {
        this.F();
        this.e.g(menu0, menuPresenter$Callback0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.w();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.x(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    public int getActionBarHideOffset() {
        return this.d == null ? 0 : -((int)this.d.getTranslationY());
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public CharSequence getTitle() {
        this.F();
        return this.e.getTitle();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void h() {
        this.F();
        this.e.h();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean i() {
        this.F();
        return this.e.i();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public boolean j() {
        this.F();
        return this.e.j();
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void k(SparseArray sparseArray0) {
        this.F();
        this.e.z(sparseArray0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void l(View view0, int v) {
        if(v == 0) {
            this.onStopNestedScroll(view0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void m(SparseArray sparseArray0) {
        this.F();
        this.e.R(sparseArray0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void n(View view0, int v, int v1, int v2, int v3, int v4) {
        if(v4 == 0) {
            this.onNestedScroll(view0, v, v1, v2, v3);
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void o(int v) {
        this.F();
        switch(v) {
            case 2: {
                this.e.s();
                return;
            }
            case 5: {
                this.e.D();
                return;
            }
            case 109: {
                this.setOverlayMode(true);
            }
        }
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets0) {
        this.F();
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.M(windowInsets0, this);
        Rect rect0 = new Rect(windowInsetsCompat0.p(), windowInsetsCompat0.r(), windowInsetsCompat0.q(), windowInsetsCompat0.o());
        boolean z = this.t(this.d, rect0, true, true, false, true);
        ViewCompat.p(this, windowInsetsCompat0, this.m);
        WindowInsetsCompat windowInsetsCompat1 = windowInsetsCompat0.x(this.m.left, this.m.top, this.m.right, this.m.bottom);
        this.u = windowInsetsCompat1;
        boolean z1 = true;
        if(!this.v.equals(windowInsetsCompat1)) {
            this.v = this.u;
            z = true;
        }
        if(this.n.equals(this.m)) {
            z1 = z;
        }
        else {
            this.n.set(this.m);
        }
        if(z1) {
            this.requestLayout();
        }
        return windowInsetsCompat0.a().c().b().K();
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.A(this.getContext());
        ViewCompat.D1(this);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z();
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingTop();
        for(int v7 = 0; v7 < v4; ++v7) {
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                LayoutParams actionBarOverlayLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v8 = view0.getMeasuredWidth();
                int v9 = view0.getMeasuredHeight();
                int v10 = actionBarOverlayLayout$LayoutParams0.leftMargin + v5;
                int v11 = actionBarOverlayLayout$LayoutParams0.topMargin + v6;
                view0.layout(v10, v11, v8 + v10, v9 + v11);
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v5;
        this.F();
        this.measureChildWithMargins(this.d, v, 0, v1, 0);
        LayoutParams actionBarOverlayLayout$LayoutParams0 = (LayoutParams)this.d.getLayoutParams();
        int v2 = Math.max(0, this.d.getMeasuredWidth() + actionBarOverlayLayout$LayoutParams0.leftMargin + actionBarOverlayLayout$LayoutParams0.rightMargin);
        int v3 = Math.max(0, this.d.getMeasuredHeight() + actionBarOverlayLayout$LayoutParams0.topMargin + actionBarOverlayLayout$LayoutParams0.bottomMargin);
        int v4 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        boolean z = (ViewCompat.H0(this) & 0x100) != 0;
        if(z) {
            v5 = this.a;
            if(this.h && this.d.getTabContainer() != null) {
                v5 += this.a;
            }
        }
        else {
            v5 = this.d.getVisibility() == 8 ? 0 : this.d.getMeasuredHeight();
        }
        this.o.set(this.m);
        this.w = this.u;
        if(this.g || z || !this.v()) {
            Insets insets0 = Insets.d(this.w.p(), this.w.r() + v5, this.w.q(), this.w.o());
            this.w = new Builder(this.w).h(insets0).a();
        }
        else {
            this.o.top += v5;
            this.o.bottom = this.o.bottom;
            this.w = this.w.x(0, v5, 0, 0);
        }
        this.t(this.c, this.o, true, true, true, true);
        if(!this.x.equals(this.w)) {
            this.x = this.w;
            ViewCompat.q(this.c, this.w);
        }
        this.measureChildWithMargins(this.c, v, 0, v1, 0);
        LayoutParams actionBarOverlayLayout$LayoutParams1 = (LayoutParams)this.c.getLayoutParams();
        int v6 = Math.max(v2, this.c.getMeasuredWidth() + actionBarOverlayLayout$LayoutParams1.leftMargin + actionBarOverlayLayout$LayoutParams1.rightMargin);
        int v7 = Math.max(v3, this.c.getMeasuredHeight() + actionBarOverlayLayout$LayoutParams1.topMargin + actionBarOverlayLayout$LayoutParams1.bottomMargin);
        int v8 = View.combineMeasuredStates(v4, this.c.getMeasuredState());
        int v9 = this.getPaddingLeft();
        int v10 = this.getPaddingRight();
        int v11 = Math.max(v7 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(v6 + (v9 + v10), this.getSuggestedMinimumWidth()), v, v8), View.resolveSizeAndState(v11, v1, v8 << 16));
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(this.i && z) {
            if(this.H(f1)) {
                this.r();
            }
            else {
                this.G();
            }
            this.j = true;
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        int v4 = this.k + v1;
        this.k = v4;
        this.setActionBarHideOffset(v4);
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.E.b(view0, view1, v);
        this.k = this.getActionBarHideOffset();
        this.z();
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.y;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.d();
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return (v & 2) == 0 || this.d.getVisibility() != 0 ? false : this.i;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view0) {
        if(this.i && !this.j) {
            if(this.k <= this.d.getHeight()) {
                this.E();
            }
            else {
                this.D();
            }
        }
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.y;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.b();
        }
    }

    @Override  // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int v) {
        super.onWindowSystemUiVisibilityChanged(v);
        this.F();
        int v1 = this.l ^ v;
        this.l = v;
        int v2 = (v & 0x100) == 0 ? 0 : 1;
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.y;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.e(((boolean)(v2 ^ 1)));
            if((v & 4) == 0 || v2 == 0) {
                this.y.a();
            }
            else {
                this.y.c();
            }
        }
        if((v1 & 0x100) != 0 && this.y != null) {
            ViewCompat.D1(this);
        }
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.b = v;
        ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0 = this.y;
        if(actionBarOverlayLayout$ActionBarVisibilityCallback0 != null) {
            actionBarOverlayLayout$ActionBarVisibilityCallback0.onWindowVisibilityChanged(v);
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void p(View view0, int v, int v1, int[] arr_v, int v2) {
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void q() {
        this.F();
        this.e.v();
    }

    private void r() {
        this.z();
        this.D.run();
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void s(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        this.n(view0, v, v1, v2, v3, v4);
    }

    public void setActionBarHideOffset(int v) {
        this.z();
        int v1 = Math.max(0, Math.min(v, this.d.getHeight()));
        this.d.setTranslationY(((float)(-v1)));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarOverlayLayout$ActionBarVisibilityCallback0) {
        this.y = actionBarOverlayLayout$ActionBarVisibilityCallback0;
        if(this.getWindowToken() != null) {
            this.y.onWindowVisibilityChanged(this.b);
            int v = this.l;
            if(v != 0) {
                this.onWindowSystemUiVisibilityChanged(v);
                ViewCompat.D1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if(z != this.i) {
            this.i = z;
            if(!z) {
                this.z();
                this.setActionBarHideOffset(0);
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int v) {
        this.F();
        this.e.setIcon(v);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setIcon(Drawable drawable0) {
        this.F();
        this.e.setIcon(drawable0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int v) {
        this.F();
        this.e.setLogo(v);
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int v) {
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback window$Callback0) {
        this.F();
        this.e.setWindowCallback(window$Callback0);
    }

    @Override  // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence0) {
        this.F();
        this.e.setWindowTitle(charSequence0);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private boolean t(@NonNull View view0, @NonNull Rect rect0, boolean z, boolean z1, boolean z2, boolean z3) {
        boolean z4;
        LayoutParams actionBarOverlayLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(z) {
            int v = rect0.left;
            if(actionBarOverlayLayout$LayoutParams0.leftMargin == v) {
                z4 = false;
            }
            else {
                actionBarOverlayLayout$LayoutParams0.leftMargin = v;
                z4 = true;
            }
        }
        else {
            z4 = false;
        }
        if(z1) {
            int v1 = rect0.top;
            if(actionBarOverlayLayout$LayoutParams0.topMargin != v1) {
                actionBarOverlayLayout$LayoutParams0.topMargin = v1;
                z4 = true;
            }
        }
        if(z3) {
            int v2 = rect0.right;
            if(actionBarOverlayLayout$LayoutParams0.rightMargin != v2) {
                actionBarOverlayLayout$LayoutParams0.rightMargin = v2;
                z4 = true;
            }
        }
        if(z2) {
            int v3 = rect0.bottom;
            if(actionBarOverlayLayout$LayoutParams0.bottomMargin != v3) {
                actionBarOverlayLayout$LayoutParams0.bottomMargin = v3;
                return true;
            }
        }
        return z4;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean u(View view0, View view1, int v, int v1) {
        return v1 == 0 && this.onStartNestedScroll(view0, view1, v);
    }

    private boolean v() {
        ViewCompat.p(this.F, ActionBarOverlayLayout.J, this.p);
        return !this.p.equals(ActionBarOverlayLayout.K);
    }

    protected LayoutParams w() {
        return new LayoutParams(-1, -1);
    }

    public LayoutParams x(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    private DecorToolbar y(View view0) {
        if(view0 instanceof DecorToolbar) {
            return (DecorToolbar)view0;
        }
        if(!(view0 instanceof Toolbar)) {
            throw new IllegalStateException("Can\'t make a decor toolbar out of " + view0.getClass().getSimpleName());
        }
        return ((Toolbar)view0).getWrapper();
    }

    void z() {
        this.removeCallbacks(this.C);
        this.removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator0 = this.A;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
    }
}

