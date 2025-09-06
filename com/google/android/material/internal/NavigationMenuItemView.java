package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.drawable;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;

@RestrictTo({Scope.b})
public class NavigationMenuItemView extends ForegroundLinearLayout implements ItemView {
    class a extends AccessibilityDelegateCompat {
        final NavigationMenuItemView d;

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.g(view0, accessibilityNodeInfoCompat0);
            accessibilityNodeInfoCompat0.i1(NavigationMenuItemView.this.J);
        }
    }

    private int H;
    private boolean I;
    boolean J;
    boolean K;
    private final CheckedTextView L;
    private FrameLayout M;
    private final AccessibilityDelegateCompat M8;
    private MenuItemImpl N;
    private static final int[] N8;
    private ColorStateList O;
    private boolean P;
    private Drawable Q;

    static {
        NavigationMenuItemView.N8 = new int[]{0x10100A0};
    }

    public NavigationMenuItemView(@NonNull Context context0) {
        this(context0, null);
    }

    public NavigationMenuItemView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public NavigationMenuItemView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.K = true;
        a navigationMenuItemView$a0 = new a(this);
        this.M8 = navigationMenuItemView$a0;
        this.setOrientation(0);
        LayoutInflater.from(context0).inflate(layout.design_navigation_menu_item, this, true);
        this.setIconSize(context0.getResources().getDimensionPixelSize(dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView0 = (CheckedTextView)this.findViewById(id.design_menu_item_text);
        this.L = checkedTextView0;
        checkedTextView0.setDuplicateParentStateEnabled(true);
        ViewCompat.J1(checkedTextView0, navigationMenuItemView$a0);
    }

    private void F() {
        if(this.J()) {
            this.L.setVisibility(8);
            FrameLayout frameLayout0 = this.M;
            if(frameLayout0 != null) {
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)frameLayout0.getLayoutParams();
                linearLayoutCompat$LayoutParams0.width = -1;
                this.M.setLayoutParams(linearLayoutCompat$LayoutParams0);
            }
        }
        else {
            this.L.setVisibility(0);
            FrameLayout frameLayout1 = this.M;
            if(frameLayout1 != null) {
                LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)frameLayout1.getLayoutParams();
                linearLayoutCompat$LayoutParams1.width = -2;
                this.M.setLayoutParams(linearLayoutCompat$LayoutParams1);
            }
        }
    }

    @Nullable
    private StateListDrawable G() {
        TypedValue typedValue0 = new TypedValue();
        if(this.getContext().getTheme().resolveAttribute(attr.colorControlHighlight, typedValue0, true)) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            ColorDrawable colorDrawable0 = new ColorDrawable(typedValue0.data);
            stateListDrawable0.addState(NavigationMenuItemView.N8, colorDrawable0);
            stateListDrawable0.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable0;
        }
        return null;
    }

    public void H(@NonNull MenuItemImpl menuItemImpl0, boolean z) {
        this.K = z;
        this.f(menuItemImpl0, 0);
    }

    public void I() {
        FrameLayout frameLayout0 = this.M;
        if(frameLayout0 != null) {
            frameLayout0.removeAllViews();
        }
        this.L.setCompoundDrawables(null, null, null, null);
    }

    private boolean J() {
        return this.N.getTitle() == null && this.N.getIcon() == null && this.N.getActionView() != null;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean d() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void e(boolean z, char c) {
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void f(@NonNull MenuItemImpl menuItemImpl0, int v) {
        this.N = menuItemImpl0;
        if(menuItemImpl0.getItemId() > 0) {
            this.setId(menuItemImpl0.getItemId());
        }
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        if(this.getBackground() == null) {
            ViewCompat.R1(this, this.G());
        }
        this.setCheckable(menuItemImpl0.isCheckable());
        this.setChecked(menuItemImpl0.isChecked());
        this.setEnabled(menuItemImpl0.isEnabled());
        this.setTitle(menuItemImpl0.getTitle());
        this.setIcon(menuItemImpl0.getIcon());
        this.setActionView(menuItemImpl0.getActionView());
        this.setContentDescription(menuItemImpl0.getContentDescription());
        TooltipCompat.a(this, menuItemImpl0.getTooltipText());
        this.F();
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public MenuItemImpl getItemData() {
        return this.N;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean h() {
        return true;
    }

    @Override  // android.view.ViewGroup
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.N != null && this.N.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(arr_v, NavigationMenuItemView.N8);
        }
        return arr_v;
    }

    private void setActionView(@Nullable View view0) {
        if(view0 != null) {
            if(this.M == null) {
                this.M = (FrameLayout)((ViewStub)this.findViewById(id.design_menu_item_action_area_stub)).inflate();
            }
            if(view0.getParent() != null) {
                ((ViewGroup)view0.getParent()).removeView(view0);
            }
            this.M.removeAllViews();
            this.M.addView(view0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setCheckable(boolean z) {
        this.refreshDrawableState();
        if(this.J != z) {
            this.J = z;
            this.M8.l(this.L, 0x800);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setChecked(boolean z) {
        this.refreshDrawableState();
        this.L.setChecked(z);
        Typeface typeface0 = this.L.getTypeface();
        this.L.setTypeface(typeface0, (!z || !this.K ? 0 : 1));
    }

    public void setHorizontalPadding(int v) {
        this.setPadding(v, this.getPaddingTop(), v, this.getPaddingBottom());
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null) {
            if(this.P) {
                Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                if(drawable$ConstantState0 != null) {
                    drawable0 = drawable$ConstantState0.newDrawable();
                }
                drawable0 = DrawableCompat.r(drawable0).mutate();
                DrawableCompat.o(drawable0, this.O);
            }
            drawable0.setBounds(0, 0, this.H, this.H);
        }
        else if(this.I) {
            if(this.Q == null) {
                Resources resources0 = this.getResources();
                Resources.Theme resources$Theme0 = this.getContext().getTheme();
                Drawable drawable1 = ResourcesCompat.g(resources0, drawable.navigation_empty_icon, resources$Theme0);
                this.Q = drawable1;
                if(drawable1 != null) {
                    drawable1.setBounds(0, 0, this.H, this.H);
                }
            }
            drawable0 = this.Q;
        }
        TextViewCompat.u(this.L, drawable0, null, null, null);
    }

    public void setIconPadding(int v) {
        this.L.setCompoundDrawablePadding(v);
    }

    public void setIconSize(@Dimension int v) {
        this.H = v;
    }

    void setIconTintList(ColorStateList colorStateList0) {
        this.O = colorStateList0;
        this.P = colorStateList0 != null;
        MenuItemImpl menuItemImpl0 = this.N;
        if(menuItemImpl0 != null) {
            this.setIcon(menuItemImpl0.getIcon());
        }
    }

    public void setMaxLines(int v) {
        this.L.setMaxLines(v);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.I = z;
    }

    public void setTextAppearance(int v) {
        TextViewCompat.D(this.L, v);
    }

    public void setTextColor(ColorStateList colorStateList0) {
        this.L.setTextColor(colorStateList0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setTitle(CharSequence charSequence0) {
        this.L.setText(charSequence0);
    }
}

