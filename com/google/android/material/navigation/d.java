package com.google.android.material.navigation;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.integer;
import com.google.android.material.R.string;
import com.google.android.material.animation.b;
import com.google.android.material.motion.j;

@RestrictTo({Scope.b})
public abstract class d extends FrameLayout implements ItemView {
    static class com.google.android.material.navigation.d.d {
        private static final float a = 0.4f;
        private static final float b = 1.0f;
        private static final float c = 0.2f;

        private com.google.android.material.navigation.d.d() {
        }

        com.google.android.material.navigation.d.d(a d$a0) {
        }

        protected float a(@FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
            int v = Float.compare(f1, 0.0f);
            float f2 = v == 0 ? 0.8f : 0.0f;
            return v == 0 ? b.b(0.0f, 1.0f, f2, 1.0f, f) : b.b(0.0f, 1.0f, f2, 0.2f, f);
        }

        protected float b(@FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
            return 0.4f + f * 0.6f;
        }

        protected float c(@FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
            return 1.0f;
        }

        public void d(@FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1, @NonNull View view0) {
            view0.setScaleX(this.b(f, f1));
            view0.setScaleY(this.c(f, f1));
            view0.setAlpha(this.a(f, f1));
        }
    }

    static class e extends com.google.android.material.navigation.d.d {
        private e() {
            super(null);
        }

        e(a d$a0) {
        }

        @Override  // com.google.android.material.navigation.d$d
        protected float c(float f, float f1) {
            return this.b(f, f1);
        }
    }

    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    @Nullable
    private com.google.android.material.badge.a F;
    private static final int G = -1;
    private static final int[] H;
    private static final com.google.android.material.navigation.d.d I;
    private static final com.google.android.material.navigation.d.d J;
    private boolean a;
    private ColorStateList b;
    @Nullable
    Drawable c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    @Nullable
    private final FrameLayout l;
    @Nullable
    private final View m;
    private final ImageView n;
    private final ViewGroup o;
    private final TextView p;
    private final TextView q;
    private int r;
    @StyleRes
    private int s;
    @Nullable
    private MenuItemImpl t;
    @Nullable
    private ColorStateList u;
    @Nullable
    private Drawable v;
    @Nullable
    private Drawable w;
    private ValueAnimator x;
    private com.google.android.material.navigation.d.d y;
    private float z;

    static {
        d.H = new int[]{0x10100A0};
        d.I = new com.google.android.material.navigation.d.d(null);
        d.J = new e(null);
    }

    public d(@NonNull Context context0) {
        class a implements View.OnLayoutChangeListener {
            final d a;

            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                if(d.this.n.getVisibility() == 0) {
                    ImageView imageView0 = d.this.n;
                    d.this.y(imageView0);
                }
            }
        }

        super(context0);
        this.a = false;
        this.r = -1;
        this.s = 0;
        this.y = d.I;
        this.z = 0.0f;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = 0;
        LayoutInflater.from(context0).inflate(this.getItemLayoutResId(), this, true);
        this.l = (FrameLayout)this.findViewById(id.navigation_bar_item_icon_container);
        this.m = this.findViewById(id.navigation_bar_item_active_indicator_view);
        ImageView imageView0 = (ImageView)this.findViewById(id.navigation_bar_item_icon_view);
        this.n = imageView0;
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(id.navigation_bar_item_labels_group);
        this.o = viewGroup0;
        TextView textView0 = (TextView)this.findViewById(id.navigation_bar_item_small_label_view);
        this.p = textView0;
        TextView textView1 = (TextView)this.findViewById(id.navigation_bar_item_large_label_view);
        this.q = textView1;
        this.setBackgroundResource(0x7F080437);  // drawable:mtrl_navigation_bar_item_background
        this.d = this.getResources().getDimensionPixelSize(this.getItemDefaultMarginResId());
        this.e = viewGroup0.getPaddingBottom();
        this.f = this.getResources().getDimensionPixelSize(dimen.m3_navigation_item_active_indicator_label_padding);
        ViewCompat.b2(textView0, 2);
        ViewCompat.b2(textView1, 2);
        this.setFocusable(true);
        this.i(textView0.getTextSize(), textView1.getTextSize());
        if(imageView0 != null) {
            imageView0.addOnLayoutChangeListener(new a(this));
        }
    }

    private void A() {
        if(this.n()) {
            this.y = d.J;
            return;
        }
        this.y = d.I;
    }

    private static void B(@NonNull View view0, int v) {
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), v);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean d() {
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        FrameLayout frameLayout0 = this.l;
        if(frameLayout0 != null && this.A) {
            frameLayout0.dispatchTouchEvent(motionEvent0);
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void e(boolean z, char c) {
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void f(@NonNull MenuItemImpl menuItemImpl0, int v) {
        this.t = menuItemImpl0;
        this.setCheckable(menuItemImpl0.isCheckable());
        this.setChecked(menuItemImpl0.isChecked());
        this.setEnabled(menuItemImpl0.isEnabled());
        this.setIcon(menuItemImpl0.getIcon());
        this.setTitle(menuItemImpl0.getTitle());
        this.setId(menuItemImpl0.getItemId());
        if(!TextUtils.isEmpty(menuItemImpl0.getContentDescription())) {
            this.setContentDescription(menuItemImpl0.getContentDescription());
        }
        CharSequence charSequence0 = TextUtils.isEmpty(menuItemImpl0.getTooltipText()) ? menuItemImpl0.getTitle() : menuItemImpl0.getTooltipText();
        if(Build.VERSION.SDK_INT > 23) {
            TooltipCompat.a(this, charSequence0);
        }
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        this.a = true;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        return this.m == null ? null : this.m.getBackground();
    }

    @Nullable
    public com.google.android.material.badge.a getBadge() {
        return this.F;
    }

    private View getIconOrContainer() {
        View view0 = this.l;
        return view0 == null ? this.n : view0;
    }

    @DrawableRes
    protected int getItemBackgroundResId() [...] // 潜在的解密器

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.t;
    }

    @DimenRes
    protected int getItemDefaultMarginResId() {
        return dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.r;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup0 = (ViewGroup)this.getParent();
        int v = viewGroup0.indexOfChild(this);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof d && view0.getVisibility() == 0) {
                ++v2;
            }
        }
        return v2;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams()).topMargin + this.getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        int v = this.F == null ? 0 : this.F.getMinimumWidth() - this.F.u();
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams();
        return Math.max(v, frameLayout$LayoutParams0.leftMargin) + this.n.getMeasuredWidth() + Math.max(v, frameLayout$LayoutParams0.rightMargin);
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.o.getLayoutParams();
        int v = this.getSuggestedIconHeight();
        return this.o.getVisibility() == 0 ? v + this.f + frameLayout$LayoutParams0.topMargin + this.o.getMeasuredHeight() + frameLayout$LayoutParams0.bottomMargin : v + frameLayout$LayoutParams0.topMargin + this.o.getMeasuredHeight() + frameLayout$LayoutParams0.bottomMargin;
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.o.getLayoutParams();
        int v = frameLayout$LayoutParams0.leftMargin + this.o.getMeasuredWidth() + frameLayout$LayoutParams0.rightMargin;
        return Math.max(this.getSuggestedIconWidth(), v);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean h() {
        return true;
    }

    private void i(float f, float f1) {
        this.g = f - f1;
        this.h = f1 * 1.0f / f;
        this.i = f * 1.0f / f1;
    }

    void j() {
        this.r();
        this.t = null;
        this.z = 0.0f;
        this.a = false;
    }

    private static Drawable k(@NonNull ColorStateList colorStateList0) {
        return new RippleDrawable(com.google.android.material.ripple.b.a(colorStateList0), null, null);
    }

    @Nullable
    private FrameLayout l(View view0) {
        return view0 != this.n || !com.google.android.material.badge.d.a ? null : ((FrameLayout)this.n.getParent());
    }

    private boolean m() {
        return this.F != null;
    }

    private boolean n() {
        return this.D && this.j == 2;
    }

    private void o(@FloatRange(from = 0.0, to = 1.0) float f) {
        class c implements ValueAnimator.AnimatorUpdateListener {
            final float a;
            final d b;

            c(float f) {
                this.a = f;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                d.this.s(f, this.a);
            }
        }

        if(this.A && this.a && ViewCompat.T0(this)) {
            ValueAnimator valueAnimator0 = this.x;
            if(valueAnimator0 != null) {
                valueAnimator0.cancel();
                this.x = null;
            }
            ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{this.z, f});
            this.x = valueAnimator1;
            valueAnimator1.addUpdateListener(new c(this, f));
            this.x.setInterpolator(j.g(this.getContext(), attr.motionEasingEmphasizedInterpolator, b.b));
            ValueAnimator valueAnimator2 = this.x;
            Context context0 = this.getContext();
            int v = this.getResources().getInteger(integer.material_motion_duration_long_1);
            valueAnimator2.setDuration(((long)j.f(context0, attr.motionDurationLong2, v)));
            this.x.start();
            return;
        }
        this.s(f, f);
    }

    @Override  // android.view.ViewGroup
    @NonNull
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.t != null && this.t.isCheckable() && this.t.isChecked()) {
            View.mergeDrawableStates(arr_v, d.H);
        }
        return arr_v;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(this.F != null && this.F.isVisible()) {
            CharSequence charSequence0 = this.t.getTitle();
            if(!TextUtils.isEmpty(this.t.getContentDescription())) {
                charSequence0 = this.t.getContentDescription();
            }
            accessibilityNodeInfo0.setContentDescription(charSequence0 + ", " + this.F.r());
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0);
        accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(0, 1, this.getItemVisiblePosition(), 1, false, this.isSelected()));
        if(this.isSelected()) {
            accessibilityNodeInfoCompat0.l1(false);
            accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.j);
        }
        accessibilityNodeInfoCompat0.X1(this.getResources().getString(string.item_view_role_description));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        class com.google.android.material.navigation.d.b implements Runnable {
            final int a;
            final d b;

            com.google.android.material.navigation.d.b(int v) {
                this.a = v;
                super();
            }

            @Override
            public void run() {
                d.this.z(this.a);
            }
        }

        super.onSizeChanged(v, v1, v2, v3);
        this.post(new com.google.android.material.navigation.d.b(this, v));
    }

    private void p() {
        MenuItemImpl menuItemImpl0 = this.t;
        if(menuItemImpl0 != null) {
            this.setChecked(menuItemImpl0.isChecked());
        }
    }

    private void q() {
        Drawable drawable0 = this.c;
        Drawable drawable1 = null;
        boolean z = true;
        if(this.b != null) {
            Drawable drawable2 = this.getActiveIndicatorDrawable();
            if(this.A && this.getActiveIndicatorDrawable() != null && this.l != null && drawable2 != null) {
                drawable1 = new RippleDrawable(com.google.android.material.ripple.b.e(this.b), null, drawable2);
                z = false;
            }
            else if(drawable0 == null) {
                drawable0 = d.k(this.b);
            }
        }
        FrameLayout frameLayout0 = this.l;
        if(frameLayout0 != null) {
            frameLayout0.setPadding(0, 0, 0, 0);
            this.l.setForeground(drawable1);
        }
        ViewCompat.R1(this, drawable0);
        if(Build.VERSION.SDK_INT >= 26) {
            this.setDefaultFocusHighlightEnabled(z);
        }
    }

    void r() {
        this.x(this.n);
    }

    private void s(@FloatRange(from = 0.0, to = 1.0) float f, float f1) {
        View view0 = this.m;
        if(view0 != null) {
            this.y.d(f, f1, view0);
        }
        this.z = f;
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable0) {
        View view0 = this.m;
        if(view0 == null) {
            return;
        }
        view0.setBackgroundDrawable(drawable0);
        this.q();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.A = z;
        this.q();
        View view0 = this.m;
        if(view0 != null) {
            view0.setVisibility((z ? 0 : 8));
            this.requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int v) {
        this.C = v;
        this.z(this.getWidth());
    }

    public void setActiveIndicatorLabelPadding(int v) {
        if(this.f != v) {
            this.f = v;
            this.p();
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int v) {
        this.E = v;
        this.z(this.getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.D = z;
    }

    public void setActiveIndicatorWidth(int v) {
        this.B = v;
        this.z(this.getWidth());
    }

    void setBadge(@NonNull com.google.android.material.badge.a a0) {
        if(this.F == a0) {
            return;
        }
        if(this.m() && this.n != null) {
            Log.w("NavigationBar", "Multiple badges shouldn\'t be attached to one item.");
            this.x(this.n);
        }
        this.F = a0;
        ImageView imageView0 = this.n;
        if(imageView0 != null) {
            this.w(imageView0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setCheckable(boolean z) {
        this.refreshDrawableState();
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setChecked(boolean z) {
        int v = this.q.getWidth();
        this.q.setPivotX(((float)(v / 2)));
        float f = (float)this.q.getBaseline();
        this.q.setPivotY(f);
        int v1 = this.p.getWidth();
        this.p.setPivotX(((float)(v1 / 2)));
        float f1 = (float)this.p.getBaseline();
        this.p.setPivotY(f1);
        this.o((z ? 1.0f : 0.0f));
        switch(this.j) {
            case -1: {
                if(!this.k) {
                    d.B(this.o, this.e);
                    if(z) {
                        d.v(this.getIconOrContainer(), ((int)(((float)this.d) + this.g)), 49);
                        d.u(this.q, 1.0f, 1.0f, 0);
                        d.u(this.p, this.h, this.h, 4);
                    }
                    else {
                        d.v(this.getIconOrContainer(), this.d, 49);
                        d.u(this.q, this.i, this.i, 4);
                        d.u(this.p, 1.0f, 1.0f, 0);
                    }
                }
                else if(z) {
                    d.v(this.getIconOrContainer(), this.d, 49);
                    d.B(this.o, this.e);
                    this.q.setVisibility(0);
                    this.p.setVisibility(4);
                }
                else {
                    d.v(this.getIconOrContainer(), this.d, 17);
                    d.B(this.o, 0);
                    this.q.setVisibility(4);
                    this.p.setVisibility(4);
                }
                break;
            }
            case 0: {
                if(z) {
                    d.v(this.getIconOrContainer(), this.d, 49);
                    d.B(this.o, this.e);
                    this.q.setVisibility(0);
                }
                else {
                    d.v(this.getIconOrContainer(), this.d, 17);
                    d.B(this.o, 0);
                    this.q.setVisibility(4);
                }
                this.p.setVisibility(4);
                break;
            }
            case 1: {
                d.B(this.o, this.e);
                if(z) {
                    d.v(this.getIconOrContainer(), ((int)(((float)this.d) + this.g)), 49);
                    d.u(this.q, 1.0f, 1.0f, 0);
                    d.u(this.p, this.h, this.h, 4);
                }
                else {
                    d.v(this.getIconOrContainer(), this.d, 49);
                    d.u(this.q, this.i, this.i, 4);
                    d.u(this.p, 1.0f, 1.0f, 0);
                }
                break;
            }
            case 2: {
                d.v(this.getIconOrContainer(), this.d, 17);
                this.q.setVisibility(8);
                this.p.setVisibility(8);
            }
        }
        this.refreshDrawableState();
        this.setSelected(z);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.p.setEnabled(z);
        this.q.setEnabled(z);
        this.n.setEnabled(z);
        if(z) {
            ViewCompat.s2(this, PointerIconCompat.c(this.getContext(), 1002));
            return;
        }
        ViewCompat.s2(this, null);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setIcon(@Nullable Drawable drawable0) {
        if(drawable0 == this.v) {
            return;
        }
        this.v = drawable0;
        if(drawable0 != null) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                drawable0 = drawable$ConstantState0.newDrawable();
            }
            drawable0 = DrawableCompat.r(drawable0).mutate();
            this.w = drawable0;
            ColorStateList colorStateList0 = this.u;
            if(colorStateList0 != null) {
                DrawableCompat.o(drawable0, colorStateList0);
            }
        }
        this.n.setImageDrawable(drawable0);
    }

    public void setIconSize(int v) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.n.getLayoutParams();
        frameLayout$LayoutParams0.width = v;
        frameLayout$LayoutParams0.height = v;
        this.n.setLayoutParams(frameLayout$LayoutParams0);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList0) {
        this.u = colorStateList0;
        if(this.t != null) {
            Drawable drawable0 = this.w;
            if(drawable0 != null) {
                DrawableCompat.o(drawable0, colorStateList0);
                this.w.invalidateSelf();
            }
        }
    }

    public void setItemBackground(int v) {
        this.setItemBackground((v == 0 ? null : ContextCompat.getDrawable(this.getContext(), v)));
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        if(drawable0 != null && drawable0.getConstantState() != null) {
            drawable0 = drawable0.getConstantState().newDrawable().mutate();
        }
        this.c = drawable0;
        this.q();
    }

    public void setItemPaddingBottom(int v) {
        if(this.e != v) {
            this.e = v;
            this.p();
        }
    }

    public void setItemPaddingTop(int v) {
        if(this.d != v) {
            this.d = v;
            this.p();
        }
    }

    public void setItemPosition(int v) {
        this.r = v;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList0) {
        this.b = colorStateList0;
        this.q();
    }

    public void setLabelVisibilityMode(int v) {
        if(this.j != v) {
            this.j = v;
            this.A();
            this.z(this.getWidth());
            this.p();
        }
    }

    public void setShifting(boolean z) {
        if(this.k != z) {
            this.k = z;
            this.p();
        }
    }

    public void setTextAppearanceActive(@StyleRes int v) {
        this.s = v;
        d.t(this.q, v);
        this.i(this.p.getTextSize(), this.q.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.setTextAppearanceActive(this.s);
        Typeface typeface0 = this.q.getTypeface();
        this.q.setTypeface(typeface0, ((int)z));
    }

    public void setTextAppearanceInactive(@StyleRes int v) {
        d.t(this.p, v);
        this.i(this.p.getTextSize(), this.q.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            this.p.setTextColor(colorStateList0);
            this.q.setTextColor(colorStateList0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setTitle(@Nullable CharSequence charSequence0) {
        this.p.setText(charSequence0);
        this.q.setText(charSequence0);
        if(this.t == null || TextUtils.isEmpty(this.t.getContentDescription())) {
            this.setContentDescription(charSequence0);
        }
        if(this.t != null && !TextUtils.isEmpty(this.t.getTooltipText())) {
            charSequence0 = this.t.getTooltipText();
        }
        if(Build.VERSION.SDK_INT > 23) {
            TooltipCompat.a(this, charSequence0);
        }
    }

    private static void t(TextView textView0, @StyleRes int v) {
        TextViewCompat.D(textView0, v);
        int v1 = com.google.android.material.resources.d.i(textView0.getContext(), v, 0);
        if(v1 != 0) {
            textView0.setTextSize(0, ((float)v1));
        }
    }

    private static void u(@NonNull View view0, float f, float f1, int v) {
        view0.setScaleX(f);
        view0.setScaleY(f1);
        view0.setVisibility(v);
    }

    private static void v(@NonNull View view0, int v, int v1) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        frameLayout$LayoutParams0.topMargin = v;
        frameLayout$LayoutParams0.bottomMargin = v;
        frameLayout$LayoutParams0.gravity = v1;
        view0.setLayoutParams(frameLayout$LayoutParams0);
    }

    private void w(@Nullable View view0) {
        if(!this.m()) {
            return;
        }
        if(view0 != null) {
            this.setClipChildren(false);
            this.setClipToPadding(false);
            com.google.android.material.badge.d.d(this.F, view0, this.l(view0));
        }
    }

    private void x(@Nullable View view0) {
        if(!this.m()) {
            return;
        }
        if(view0 != null) {
            this.setClipChildren(true);
            this.setClipToPadding(true);
            com.google.android.material.badge.d.j(this.F, view0);
        }
        this.F = null;
    }

    private void y(View view0) {
        if(!this.m()) {
            return;
        }
        com.google.android.material.badge.d.m(this.F, view0, this.l(view0));
    }

    private void z(int v) {
        if(this.m != null && v > 0) {
            int v1 = Math.min(this.B, v - this.E * 2);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.m.getLayoutParams();
            frameLayout$LayoutParams0.height = this.n() ? v1 : this.C;
            frameLayout$LayoutParams0.width = v1;
            this.m.setLayoutParams(frameLayout$LayoutParams0);
        }
    }
}

