package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

@RestrictTo({Scope.c})
public class ActionBarContextView extends AbsActionBarView {
    private CharSequence j;
    private CharSequence k;
    private View l;
    private View m;
    private View n;
    private LinearLayout o;
    private TextView p;
    private TextView q;
    private int r;
    private int s;
    private boolean t;
    private int u;

    public ActionBarContextView(@NonNull Context context0) {
        this(context0, null);
    }

    public ActionBarContextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, styleable.ActionMode, v, 0);
        this.setBackground(tintTypedArray0.h(styleable.ActionMode_background));
        this.r = tintTypedArray0.u(styleable.ActionMode_titleTextStyle, 0);
        this.s = tintTypedArray0.u(styleable.ActionMode_subtitleTextStyle, 0);
        this.e = tintTypedArray0.q(styleable.ActionMode_height, 0);
        this.u = tintTypedArray0.u(styleable.ActionMode_closeItemLayout, layout.abc_action_mode_close_item_material);
        tintTypedArray0.I();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public void c(int v) {
        super.c(v);
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean d() {
        return super.d();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public void e() {
        super.e();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean f() {
        return this.d == null ? false : this.d.E();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean g() {
        return super.g();
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean h() {
        return this.d == null ? false : this.d.H();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean i() {
        return super.i();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public void m() {
        super.m();
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public ViewPropertyAnimatorCompat n(int v, long v1) {
        return super.n(v, v1);
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean o() {
        return this.d == null ? false : this.d.Q();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter0 = this.d;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.E();
            this.d.F();
        }
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        return super.onHoverEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        boolean z1 = ViewUtils.b(this);
        int v4 = z1 ? v2 - v - this.getPaddingRight() : this.getPaddingLeft();
        int v5 = this.getPaddingTop();
        int v6 = v3 - v1 - this.getPaddingTop() - this.getPaddingBottom();
        if(this.l != null && this.l.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
            int v7 = z1 ? viewGroup$MarginLayoutParams0.leftMargin : viewGroup$MarginLayoutParams0.rightMargin;
            int v8 = AbsActionBarView.k(v4, (z1 ? viewGroup$MarginLayoutParams0.rightMargin : viewGroup$MarginLayoutParams0.leftMargin), z1);
            v4 = AbsActionBarView.k(v8 + this.l(this.l, v8, v5, v6, z1), v7, z1);
        }
        int v9 = this.o == null || this.n != null || this.o.getVisibility() == 8 ? v4 : v4 + this.l(this.o, v4, v5, v6, z1);
        View view0 = this.n;
        if(view0 != null) {
            this.l(view0, v9, v5, v6, z1);
        }
        int v10 = z1 ? this.getPaddingLeft() : v2 - v - this.getPaddingRight();
        ActionMenuView actionMenuView0 = this.c;
        if(actionMenuView0 != null) {
            this.l(actionMenuView0, v10, v5, v6, !z1);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = 0x40000000;
        if(View.MeasureSpec.getMode(v) != 0x40000000) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = this.e > 0 ? this.e : View.MeasureSpec.getSize(v1);
        int v5 = this.getPaddingTop() + this.getPaddingBottom();
        int v6 = v3 - this.getPaddingLeft() - this.getPaddingRight();
        int v7 = v4 - v5;
        int v8 = View.MeasureSpec.makeMeasureSpec(v7, 0x80000000);
        View view0 = this.l;
        if(view0 != null) {
            int v10 = this.j(view0, v6, v8, 0);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
            v6 = v10 - (viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin);
        }
        if(this.c != null && this.c.getParent() == this) {
            v6 = this.j(this.c, v6, v8, 0);
        }
        LinearLayout linearLayout0 = this.o;
        if(linearLayout0 != null && this.n == null) {
            if(this.t) {
                this.o.measure(0, v8);
                int v11 = this.o.getMeasuredWidth();
                boolean z = v11 <= v6;
                if(z) {
                    v6 -= v11;
                }
                this.o.setVisibility((z ? 0 : 8));
            }
            else {
                v6 = this.j(linearLayout0, v6, v8, 0);
            }
        }
        View view1 = this.n;
        if(view1 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            int v12 = viewGroup$LayoutParams0.width;
            if(v12 >= 0) {
                v6 = Math.min(v12, v6);
            }
            int v13 = viewGroup$LayoutParams0.height;
            if(v13 == -2) {
                v2 = 0x80000000;
            }
            if(v13 >= 0) {
                v7 = Math.min(v13, v7);
            }
            this.n.measure(View.MeasureSpec.makeMeasureSpec(v6, (v12 == -2 ? 0x80000000 : 0x40000000)), View.MeasureSpec.makeMeasureSpec(v7, v2));
        }
        if(this.e <= 0) {
            int v14 = this.getChildCount();
            int v15 = 0;
            for(int v9 = 0; v9 < v14; ++v9) {
                int v16 = this.getChildAt(v9).getMeasuredHeight() + v5;
                if(v16 > v15) {
                    v15 = v16;
                }
            }
            this.setMeasuredDimension(v3, v15);
            return;
        }
        this.setMeasuredDimension(v3, v4);
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return super.onTouchEvent(motionEvent0);
    }

    public void p() {
        if(this.l == null) {
            this.t();
        }
    }

    public void q(ActionMode actionMode0) {
        View view0 = this.l;
        if(view0 == null) {
            View view1 = LayoutInflater.from(this.getContext()).inflate(this.u, this, false);
            this.l = view1;
            this.addView(view1);
        }
        else if(view0.getParent() == null) {
            this.addView(this.l);
        }
        View view2 = this.l.findViewById(id.action_mode_close_button);
        this.m = view2;
        view2.setOnClickListener(new View.OnClickListener() {
            final ActionBarContextView b;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                actionMode0.c();
            }
        });
        MenuBuilder menuBuilder0 = (MenuBuilder)actionMode0.e();
        ActionMenuPresenter actionMenuPresenter0 = this.d;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.B();
        }
        ActionMenuPresenter actionMenuPresenter1 = new ActionMenuPresenter(this.getContext());
        this.d = actionMenuPresenter1;
        actionMenuPresenter1.O(true);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder0.c(this.d, this.b);
        ActionMenuView actionMenuView0 = (ActionMenuView)this.d.m(this);
        this.c = actionMenuView0;
        actionMenuView0.setBackground(null);
        this.addView(this.c, viewGroup$LayoutParams0);
    }

    private void r() {
        if(this.o == null) {
            LayoutInflater.from(this.getContext()).inflate(layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout0 = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.o = linearLayout0;
            this.p = (TextView)linearLayout0.findViewById(id.action_bar_title);
            this.q = (TextView)this.o.findViewById(id.action_bar_subtitle);
            if(this.r != 0) {
                this.p.setTextAppearance(this.getContext(), this.r);
            }
            if(this.s != 0) {
                this.q.setTextAppearance(this.getContext(), this.s);
            }
        }
        this.p.setText(this.j);
        this.q.setText(this.k);
        boolean z = TextUtils.isEmpty(this.j);
        boolean z1 = TextUtils.isEmpty(this.k);
        int v = 8;
        this.q.setVisibility((z1 ? 8 : 0));
        LinearLayout linearLayout1 = this.o;
        if(!z || !z1) {
            v = 0;
        }
        linearLayout1.setVisibility(v);
        if(this.o.getParent() == null) {
            this.addView(this.o);
        }
    }

    public boolean s() {
        return this.t;
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int v) {
        this.e = v;
    }

    public void setCustomView(View view0) {
        View view1 = this.n;
        if(view1 != null) {
            this.removeView(view1);
        }
        this.n = view0;
        if(view0 != null) {
            LinearLayout linearLayout0 = this.o;
            if(linearLayout0 != null) {
                this.removeView(linearLayout0);
                this.o = null;
            }
        }
        if(view0 != null) {
            this.addView(view0);
        }
        this.requestLayout();
    }

    public void setSubtitle(CharSequence charSequence0) {
        this.k = charSequence0;
        this.r();
    }

    public void setTitle(CharSequence charSequence0) {
        this.j = charSequence0;
        this.r();
        ViewCompat.M1(this, charSequence0);
    }

    public void setTitleOptional(boolean z) {
        if(z != this.t) {
            this.requestLayout();
        }
        this.t = z;
    }

    @Override  // androidx.appcompat.widget.AbsActionBarView
    public void setVisibility(int v) {
        super.setVisibility(v);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        this.removeAllViews();
        this.n = null;
        this.c = null;
        this.d = null;
        View view0 = this.m;
        if(view0 != null) {
            view0.setOnClickListener(null);
        }
    }
}

