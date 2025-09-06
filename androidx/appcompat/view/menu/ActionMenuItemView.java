package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.ActionMenuView.ActionMenuChildView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;

@RestrictTo({Scope.c})
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, ItemView, ActionMenuChildView {
    class ActionMenuItemForwardingListener extends ForwardingListener {
        final ActionMenuItemView j;

        @Override  // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu b() {
            PopupCallback actionMenuItemView$PopupCallback0 = ActionMenuItemView.this.m;
            return actionMenuItemView$PopupCallback0 == null ? null : actionMenuItemView$PopupCallback0.a();
        }

        @Override  // androidx.appcompat.widget.ForwardingListener
        protected boolean c() {
            ItemInvoker menuBuilder$ItemInvoker0 = ActionMenuItemView.this.k;
            if(menuBuilder$ItemInvoker0 != null && menuBuilder$ItemInvoker0.g(ActionMenuItemView.this.h)) {
                ShowableListMenu showableListMenu0 = this.b();
                return showableListMenu0 != null && showableListMenu0.b();
            }
            return false;
        }
    }

    public static abstract class PopupCallback {
        public abstract ShowableListMenu a();
    }

    MenuItemImpl h;
    private CharSequence i;
    private Drawable j;
    ItemInvoker k;
    private ForwardingListener l;
    PopupCallback m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private static final String s = "ActionMenuItemView";
    private static final int t = 0x20;

    public ActionMenuItemView(Context context0) {
        this(context0, null);
    }

    public ActionMenuItemView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ActionMenuItemView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        Resources resources0 = context0.getResources();
        this.n = this.w();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ActionMenuItemView, v, 0);
        this.p = typedArray0.getDimensionPixelSize(styleable.ActionMenuItemView_android_minWidth, 0);
        typedArray0.recycle();
        this.r = (int)(resources0.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener(this);
        this.q = -1;
        this.setSaveEnabled(false);
    }

    @Override  // androidx.appcompat.widget.ActionMenuView$ActionMenuChildView
    public boolean b() {
        return this.v();
    }

    @Override  // androidx.appcompat.widget.ActionMenuView$ActionMenuChildView
    public boolean c() {
        return this.v() && this.h.getIcon() == null;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean d() {
        return true;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void e(boolean z, char c) {
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void f(MenuItemImpl menuItemImpl0, int v) {
        this.h = menuItemImpl0;
        this.setIcon(menuItemImpl0.getIcon());
        this.setTitle(menuItemImpl0.l(this));
        this.setId(menuItemImpl0.getItemId());
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        this.setEnabled(menuItemImpl0.isEnabled());
        if(menuItemImpl0.hasSubMenu() && this.l == null) {
            this.l = new ActionMenuItemForwardingListener(this);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.TextView
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public MenuItemImpl getItemData() {
        return this.h;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean h() {
        return true;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ItemInvoker menuBuilder$ItemInvoker0 = this.k;
        if(menuBuilder$ItemInvoker0 != null) {
            menuBuilder$ItemInvoker0.g(this.h);
        }
    }

    @Override  // android.widget.TextView
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.n = this.w();
        this.x();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    protected void onMeasure(int v, int v1) {
        boolean z = this.v();
        if(z) {
            int v2 = this.q;
            if(v2 >= 0) {
                super.setPadding(v2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
            }
        }
        super.onMeasure(v, v1);
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = this.getMeasuredWidth();
        int v6 = v3 == 0x80000000 ? Math.min(v4, this.p) : this.p;
        if(v3 != 0x40000000 && this.p > 0 && v5 < v6) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), v1);
        }
        if(!z && this.j != null) {
            super.setPadding((this.getMeasuredWidth() - this.j.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }

    @Override  // android.widget.TextView
    public void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(null);
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.TextView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return !this.h.hasSubMenu() || (this.l == null || !this.l.onTouch(this, motionEvent0)) ? super.onTouchEvent(motionEvent0) : true;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setCheckable(boolean z) {
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if(this.o != z) {
            this.o = z;
            MenuItemImpl menuItemImpl0 = this.h;
            if(menuItemImpl0 != null) {
                menuItemImpl0.e();
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setIcon(Drawable drawable0) {
        this.j = drawable0;
        if(drawable0 != null) {
            int v = drawable0.getIntrinsicWidth();
            int v1 = drawable0.getIntrinsicHeight();
            int v2 = this.r;
            if(v > v2) {
                v1 = (int)(((float)v1) * (((float)v2) / ((float)v)));
                v = v2;
            }
            if(v1 > v2) {
                v = (int)(((float)v) * (((float)v2) / ((float)v1)));
            }
            else {
                v2 = v1;
            }
            drawable0.setBounds(0, 0, v, v2);
        }
        this.setCompoundDrawables(drawable0, null, null, null);
        this.x();
    }

    public void setItemInvoker(ItemInvoker menuBuilder$ItemInvoker0) {
        this.k = menuBuilder$ItemInvoker0;
    }

    @Override  // android.widget.TextView
    public void setPadding(int v, int v1, int v2, int v3) {
        this.q = v;
        super.setPadding(v, v1, v2, v3);
    }

    public void setPopupCallback(PopupCallback actionMenuItemView$PopupCallback0) {
        this.m = actionMenuItemView$PopupCallback0;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setTitle(CharSequence charSequence0) {
        this.i = charSequence0;
        this.x();
    }

    public boolean v() {
        return !TextUtils.isEmpty(this.getText());
    }

    private boolean w() {
        Configuration configuration0 = this.getContext().getResources().getConfiguration();
        return configuration0.screenWidthDp >= 480 || configuration0.screenWidthDp >= 640 && configuration0.screenHeightDp >= 480 || configuration0.orientation == 2;
    }

    private void x() {
        int v = !TextUtils.isEmpty(this.i) & (this.j == null || this.h.E() && (this.n || this.o) ? 1 : 0);
        CharSequence charSequence0 = null;
        this.setText((v == 0 ? null : this.i));
        CharSequence charSequence1 = this.h.getContentDescription();
        if(TextUtils.isEmpty(charSequence1)) {
            this.setContentDescription((v == 0 ? this.h.getTitle() : null));
        }
        else {
            this.setContentDescription(charSequence1);
        }
        CharSequence charSequence2 = this.h.getTooltipText();
        if(TextUtils.isEmpty(charSequence2)) {
            if(v == 0) {
                charSequence0 = this.h.getTitle();
            }
            TooltipCompat.a(this, charSequence0);
            return;
        }
        TooltipCompat.a(this, charSequence2);
    }
}

