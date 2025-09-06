package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder.ItemInvoker;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;

public class ActionMenuView extends LinearLayoutCompat implements ItemInvoker, MenuView {
    @RestrictTo({Scope.c})
    public interface ActionMenuChildView {
        boolean b();

        boolean c();
    }

    static class ActionMenuPresenterCallback implements Callback {
        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public void c(@NonNull MenuBuilder menuBuilder0, boolean z) {
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public boolean d(@NonNull MenuBuilder menuBuilder0) {
            return false;
        }
    }

    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = false;
        }

        LayoutParams(int v, int v1, boolean z) {
            super(v, v1);
            this.a = z;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(LayoutParams actionMenuView$LayoutParams0) {
            super(actionMenuView$LayoutParams0);
            this.a = actionMenuView$LayoutParams0.a;
        }
    }

    class MenuBuilderCallback implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        final ActionMenuView a;

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public boolean a(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
            OnMenuItemClickListener actionMenuView$OnMenuItemClickListener0 = ActionMenuView.this.M;
            return actionMenuView$OnMenuItemClickListener0 != null && actionMenuView$OnMenuItemClickListener0.onMenuItemClick(menuItem0);
        }

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public void b(@NonNull MenuBuilder menuBuilder0) {
            androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0 = ActionMenuView.this.H;
            if(menuBuilder$Callback0 != null) {
                menuBuilder$Callback0.b(menuBuilder0);
            }
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem arg1);
    }

    private MenuBuilder B;
    private Context C;
    private int D;
    private boolean E;
    private ActionMenuPresenter F;
    private Callback G;
    androidx.appcompat.view.menu.MenuBuilder.Callback H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    OnMenuItemClickListener M;
    private static final String N = "ActionMenuView";
    static final int O = 56;
    static final int P = 4;

    public ActionMenuView(@NonNull Context context0) {
        this(context0, null);
    }

    public ActionMenuView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setBaselineAligned(false);
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        this.K = (int)(56.0f * displayMetrics0.density);
        this.L = (int)(displayMetrics0.density * 4.0f);
        this.C = context0;
        this.D = 0;
    }

    public void F() {
        ActionMenuPresenter actionMenuPresenter0 = this.F;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.B();
        }
    }

    protected LayoutParams G() {
        LayoutParams actionMenuView$LayoutParams0 = new LayoutParams(-2, -2);
        actionMenuView$LayoutParams0.gravity = 16;
        return actionMenuView$LayoutParams0;
    }

    public LayoutParams H(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    protected LayoutParams I(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 != null) {
            LayoutParams actionMenuView$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? new LayoutParams(((LayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
            if(actionMenuView$LayoutParams0.gravity <= 0) {
                actionMenuView$LayoutParams0.gravity = 16;
            }
            return actionMenuView$LayoutParams0;
        }
        return this.G();
    }

    @RestrictTo({Scope.c})
    public LayoutParams J() {
        LayoutParams actionMenuView$LayoutParams0 = this.G();
        actionMenuView$LayoutParams0.a = true;
        return actionMenuView$LayoutParams0;
    }

    @RestrictTo({Scope.c})
    protected boolean K(int v) {
        boolean z = false;
        if(v == 0) {
            return false;
        }
        View view0 = this.getChildAt(v - 1);
        View view1 = this.getChildAt(v);
        if(v < this.getChildCount() && view0 instanceof ActionMenuChildView) {
            z = ((ActionMenuChildView)view0).b();
        }
        return v > 0 && view1 instanceof ActionMenuChildView ? z | ((ActionMenuChildView)view1).c() : z;
    }

    public boolean L() {
        return this.F != null && this.F.E();
    }

    @RestrictTo({Scope.c})
    public boolean M() {
        return this.F != null && this.F.G();
    }

    public boolean N() {
        return this.F != null && this.F.H();
    }

    @RestrictTo({Scope.c})
    public boolean O() {
        return this.E;
    }

    static int P(View view0, int v, int v1, int v2, int v3) {
        LayoutParams actionMenuView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v4 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v2) - v3, View.MeasureSpec.getMode(v2));
        ActionMenuItemView actionMenuItemView0 = view0 instanceof ActionMenuItemView ? ((ActionMenuItemView)view0) : null;
        boolean z = false;
        boolean z1 = actionMenuItemView0 != null && actionMenuItemView0.v();
        int v5 = 2;
        if(v1 <= 0 || z1 && v1 < 2) {
            v5 = 0;
        }
        else {
            view0.measure(View.MeasureSpec.makeMeasureSpec(v1 * v, 0x80000000), v4);
            int v6 = view0.getMeasuredWidth();
            int v7 = v6 / v;
            if(v6 % v != 0) {
                ++v7;
            }
            if(!z1 || v7 >= 2) {
                v5 = v7;
            }
        }
        if(!actionMenuView$LayoutParams0.a && z1) {
            z = true;
        }
        actionMenuView$LayoutParams0.d = z;
        actionMenuView$LayoutParams0.b = v5;
        view0.measure(View.MeasureSpec.makeMeasureSpec(v * v5, 0x40000000), v4);
        return v5;
    }

    private void Q(int v, int v1) {
        int v35;
        int v33;
        int v30;
        int v29;
        int v20;
        int v2 = View.MeasureSpec.getMode(v1);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getSize(v1);
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingTop() + this.getPaddingBottom();
        int v8 = ViewGroup.getChildMeasureSpec(v1, v7, -2);
        int v9 = v3 - (v5 + v6);
        int v10 = this.K;
        int v11 = v9 / v10;
        if(v11 == 0) {
            this.setMeasuredDimension(v9, 0);
            return;
        }
        int v12 = v10 + v9 % v10 / v11;
        int v13 = this.getChildCount();
        int v14 = 0;
        boolean z = false;
        int v16 = 0;
        int v17 = 0;
        int v18 = 0;
        long v19 = 0L;
        for(int v15 = 0; v15 < v13; ++v15) {
            View view0 = this.getChildAt(v15);
            if(view0.getVisibility() != 8) {
                if(view0 instanceof ActionMenuItemView) {
                    v20 = v16 + 1;
                    view0.setPadding(this.L, 0, this.L, 0);
                }
                else {
                    v20 = v16 + 1;
                }
                LayoutParams actionMenuView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                actionMenuView$LayoutParams0.f = false;
                actionMenuView$LayoutParams0.c = 0;
                actionMenuView$LayoutParams0.b = 0;
                actionMenuView$LayoutParams0.d = false;
                actionMenuView$LayoutParams0.leftMargin = 0;
                actionMenuView$LayoutParams0.rightMargin = 0;
                actionMenuView$LayoutParams0.e = view0 instanceof ActionMenuItemView && ((ActionMenuItemView)view0).v();
                int v21 = ActionMenuView.P(view0, v12, (actionMenuView$LayoutParams0.a ? 1 : v11), v8, v7);
                v17 = Math.max(v17, v21);
                if(actionMenuView$LayoutParams0.d) {
                    ++v18;
                }
                if(actionMenuView$LayoutParams0.a) {
                    z = true;
                }
                v11 -= v21;
                v14 = Math.max(v14, view0.getMeasuredHeight());
                if(v21 == 1) {
                    v19 |= (long)(1 << v15);
                }
                v16 = v20;
            }
        }
        int v22 = !z || v16 != 2 ? 0 : 1;
        int v23 = 0;
        while(true) {
            if(v18 <= 0 || v11 <= 0) {
                goto label_100;
            }
            int v24 = 0;
            int v26 = 0x7FFFFFFF;
            long v27 = 0L;
            for(int v25 = 0; v25 < v13; ++v25) {
                LayoutParams actionMenuView$LayoutParams1 = (LayoutParams)this.getChildAt(v25).getLayoutParams();
                if(actionMenuView$LayoutParams1.d) {
                    int v28 = actionMenuView$LayoutParams1.b;
                    if(v28 < v26) {
                        v27 = 1L << v25;
                        v26 = v28;
                        v24 = 1;
                    }
                    else if(v28 == v26) {
                        ++v24;
                        v27 |= 1L << v25;
                    }
                }
            }
            v29 = v23;
            v30 = v14;
            v19 |= v27;
            if(v24 <= v11) {
                int v31 = v26 + 1;
                int v32 = 0;
                while(v32 < v13) {
                    View view1 = this.getChildAt(v32);
                    LayoutParams actionMenuView$LayoutParams2 = (LayoutParams)view1.getLayoutParams();
                    if((v27 & ((long)(1 << v32))) == 0L) {
                        if(actionMenuView$LayoutParams2.b == v31) {
                            v19 |= (long)(1 << v32);
                        }
                        v33 = v22;
                    }
                    else {
                        if(v22 == 0 || !actionMenuView$LayoutParams2.e || v11 != 1) {
                            v33 = v22;
                        }
                        else {
                            v33 = v22;
                            view1.setPadding(this.L + v12, 0, this.L, 0);
                        }
                        ++actionMenuView$LayoutParams2.b;
                        actionMenuView$LayoutParams2.f = true;
                        --v11;
                    }
                    ++v32;
                    v22 = v33;
                }
                v14 = v30;
                v23 = 1;
                continue;
            label_100:
                v29 = v23;
                v30 = v14;
            }
            break;
        }
        boolean z1 = !z && v16 == 1;
        if(v11 <= 0 || v19 == 0L || v11 >= v16 - 1 && !z1 && v17 <= 1) {
            v35 = v29;
        }
        else {
            float f = (float)Long.bitCount(v19);
            if(!z1) {
                if(Long.compare(v19 & 1L, 0L) != 0 && !((LayoutParams)this.getChildAt(0).getLayoutParams()).e) {
                    f -= 0.5f;
                }
                if((v19 & ((long)(1 << v13 - 1))) != 0L && !((LayoutParams)this.getChildAt(v13 - 1).getLayoutParams()).e) {
                    f -= 0.5f;
                }
            }
            int v34 = f > 0.0f ? ((int)(((float)(v11 * v12)) / f)) : 0;
            v35 = v29;
            for(int v36 = 0; v36 < v13; ++v36) {
                if((v19 & ((long)(1 << v36))) != 0L) {
                    View view2 = this.getChildAt(v36);
                    LayoutParams actionMenuView$LayoutParams3 = (LayoutParams)view2.getLayoutParams();
                    if(view2 instanceof ActionMenuItemView) {
                        actionMenuView$LayoutParams3.c = v34;
                        actionMenuView$LayoutParams3.f = true;
                        if(v36 == 0 && !actionMenuView$LayoutParams3.e) {
                            actionMenuView$LayoutParams3.leftMargin = -v34 / 2;
                        }
                        v35 = 1;
                    }
                    else if(actionMenuView$LayoutParams3.a) {
                        actionMenuView$LayoutParams3.c = v34;
                        actionMenuView$LayoutParams3.f = true;
                        actionMenuView$LayoutParams3.rightMargin = -v34 / 2;
                        v35 = 1;
                    }
                    else {
                        if(v36 != 0) {
                            actionMenuView$LayoutParams3.leftMargin = v34 / 2;
                        }
                        if(v36 != v13 - 1) {
                            actionMenuView$LayoutParams3.rightMargin = v34 / 2;
                        }
                    }
                }
            }
        }
        if(v35 != 0) {
            for(int v37 = 0; v37 < v13; ++v37) {
                View view3 = this.getChildAt(v37);
                LayoutParams actionMenuView$LayoutParams4 = (LayoutParams)view3.getLayoutParams();
                if(actionMenuView$LayoutParams4.f) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(actionMenuView$LayoutParams4.b * v12 + actionMenuView$LayoutParams4.c, 0x40000000), v8);
                }
            }
        }
        this.setMeasuredDimension(v9, (v2 == 0x40000000 ? v4 : v30));
    }

    @RestrictTo({Scope.c})
    public MenuBuilder R() {
        return this.B;
    }

    @RestrictTo({Scope.c})
    public void S(Callback menuPresenter$Callback0, androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0) {
        this.G = menuPresenter$Callback0;
        this.H = menuBuilder$Callback0;
    }

    public boolean T() {
        return this.F != null && this.F.Q();
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    @RestrictTo({Scope.c})
    public void a(MenuBuilder menuBuilder0) {
        this.B = menuBuilder0;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$ItemInvoker
    @RestrictTo({Scope.c})
    public boolean g(MenuItemImpl menuItemImpl0) {
        return this.B.P(menuItemImpl0, 0);
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.G();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.H(attributeSet0);
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.I(viewGroup$LayoutParams0);
    }

    public Menu getMenu() {
        if(this.B == null) {
            Context context0 = this.getContext();
            MenuBuilder menuBuilder0 = new MenuBuilder(context0);
            this.B = menuBuilder0;
            menuBuilder0.Y(new MenuBuilderCallback(this));
            ActionMenuPresenter actionMenuPresenter0 = new ActionMenuPresenter(context0);
            this.F = actionMenuPresenter0;
            actionMenuPresenter0.O(true);
            ActionMenuPresenter actionMenuPresenter1 = this.F;
            Callback menuPresenter$Callback0 = this.G;
            if(menuPresenter$Callback0 == null) {
                menuPresenter$Callback0 = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter1.k(menuPresenter$Callback0);
            this.B.c(this.F, this.C);
            this.F.M(this);
        }
        return this.B;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        this.getMenu();
        return this.F.D();
    }

    public int getPopupTheme() {
        return this.D;
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    @RestrictTo({Scope.c})
    public int getWindowAnimations() {
        return 0;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams o() {
        return this.G();
    }

    @Override  // android.view.View
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        ActionMenuPresenter actionMenuPresenter0 = this.F;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.f(false);
            if(this.F.H()) {
                this.F.E();
                this.F.Q();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v15;
        int v14;
        if(!this.I) {
            super.onLayout(z, v, v1, v2, v3);
            return;
        }
        int v4 = this.getChildCount();
        int v5 = (v3 - v1) / 2;
        int v6 = this.getDividerWidth();
        int v7 = v2 - v;
        int v8 = v7 - this.getPaddingRight() - this.getPaddingLeft();
        boolean z1 = ViewUtils.b(this);
        int v10 = 0;
        int v11 = 0;
        for(int v9 = 0; v9 < v4; ++v9) {
            View view0 = this.getChildAt(v9);
            if(view0.getVisibility() != 8) {
                LayoutParams actionMenuView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(actionMenuView$LayoutParams0.a) {
                    int v12 = view0.getMeasuredWidth();
                    if(this.K(v9)) {
                        v12 += v6;
                    }
                    int v13 = view0.getMeasuredHeight();
                    if(z1) {
                        v14 = this.getPaddingLeft() + actionMenuView$LayoutParams0.leftMargin;
                        v15 = v14 + v12;
                    }
                    else {
                        v15 = this.getWidth() - this.getPaddingRight() - actionMenuView$LayoutParams0.rightMargin;
                        v14 = v15 - v12;
                    }
                    int v16 = v5 - v13 / 2;
                    view0.layout(v14, v16, v15, v13 + v16);
                    v8 -= v12;
                    v10 = 1;
                }
                else {
                    v8 -= view0.getMeasuredWidth() + actionMenuView$LayoutParams0.leftMargin + actionMenuView$LayoutParams0.rightMargin;
                    this.K(v9);
                    ++v11;
                }
            }
        }
        if(v4 == 1 && v10 == 0) {
            View view1 = this.getChildAt(0);
            int v17 = view1.getMeasuredWidth();
            int v18 = view1.getMeasuredHeight();
            int v19 = v7 / 2 - v17 / 2;
            int v20 = v5 - v18 / 2;
            view1.layout(v19, v20, v17 + v19, v18 + v20);
            return;
        }
        int v21 = v11 - (v10 ^ 1);
        int v22 = Math.max(0, (v21 <= 0 ? 0 : v8 / v21));
        if(z1) {
            int v23 = this.getWidth() - this.getPaddingRight();
            for(int v24 = 0; v24 < v4; ++v24) {
                View view2 = this.getChildAt(v24);
                LayoutParams actionMenuView$LayoutParams1 = (LayoutParams)view2.getLayoutParams();
                if(view2.getVisibility() != 8 && !actionMenuView$LayoutParams1.a) {
                    int v25 = v23 - actionMenuView$LayoutParams1.rightMargin;
                    int v26 = view2.getMeasuredWidth();
                    int v27 = view2.getMeasuredHeight();
                    int v28 = v5 - v27 / 2;
                    view2.layout(v25 - v26, v28, v25, v27 + v28);
                    v23 = v25 - (v26 + actionMenuView$LayoutParams1.leftMargin + v22);
                }
            }
            return;
        }
        int v29 = this.getPaddingLeft();
        for(int v30 = 0; v30 < v4; ++v30) {
            View view3 = this.getChildAt(v30);
            LayoutParams actionMenuView$LayoutParams2 = (LayoutParams)view3.getLayoutParams();
            if(view3.getVisibility() != 8 && !actionMenuView$LayoutParams2.a) {
                int v31 = v29 + actionMenuView$LayoutParams2.leftMargin;
                int v32 = view3.getMeasuredWidth();
                int v33 = view3.getMeasuredHeight();
                int v34 = v5 - v33 / 2;
                view3.layout(v31, v34, v31 + v32, v33 + v34);
                v29 = v31 + (v32 + actionMenuView$LayoutParams2.rightMargin + v22);
            }
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected void onMeasure(int v, int v1) {
        boolean z = this.I;
        boolean z1 = View.MeasureSpec.getMode(v) == 0x40000000;
        this.I = z1;
        if(z != z1) {
            this.J = 0;
        }
        int v2 = View.MeasureSpec.getSize(v);
        if(this.I) {
            MenuBuilder menuBuilder0 = this.B;
            if(menuBuilder0 != null && v2 != this.J) {
                this.J = v2;
                menuBuilder0.O(true);
            }
        }
        int v3 = this.getChildCount();
        if(this.I && v3 > 0) {
            this.Q(v, v1);
            return;
        }
        for(int v4 = 0; v4 < v3; ++v4) {
            LayoutParams actionMenuView$LayoutParams0 = (LayoutParams)this.getChildAt(v4).getLayoutParams();
            actionMenuView$LayoutParams0.rightMargin = 0;
            actionMenuView$LayoutParams0.leftMargin = 0;
        }
        super.onMeasure(v, v1);
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams p(AttributeSet attributeSet0) {
        return this.H(attributeSet0);
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams q(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.I(viewGroup$LayoutParams0);
    }

    @RestrictTo({Scope.c})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.F.K(z);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener actionMenuView$OnMenuItemClickListener0) {
        this.M = actionMenuView$OnMenuItemClickListener0;
    }

    public void setOverflowIcon(@Nullable Drawable drawable0) {
        this.getMenu();
        this.F.N(drawable0);
    }

    @RestrictTo({Scope.c})
    public void setOverflowReserved(boolean z) {
        this.E = z;
    }

    public void setPopupTheme(@StyleRes int v) {
        if(this.D != v) {
            this.D = v;
            if(v == 0) {
                this.C = this.getContext();
                return;
            }
            this.C = new ContextThemeWrapper(this.getContext(), v);
        }
    }

    @RestrictTo({Scope.a})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter0) {
        this.F = actionMenuPresenter0;
        actionMenuPresenter0.M(this);
    }
}

