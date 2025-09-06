package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.widget.TintTypedArray;

@RestrictTo({Scope.c})
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, ItemView {
    private MenuItemImpl a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private ImageView h;
    private LinearLayout i;
    private Drawable j;
    private int k;
    private Context l;
    private boolean m;
    private Drawable n;
    private boolean o;
    private LayoutInflater p;
    private boolean q;
    private static final String r = "ListMenuItemView";

    public ListMenuItemView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        TintTypedArray tintTypedArray0 = TintTypedArray.G(this.getContext(), attributeSet0, styleable.MenuView, v, 0);
        this.j = tintTypedArray0.h(styleable.MenuView_android_itemBackground);
        this.k = tintTypedArray0.u(styleable.MenuView_android_itemTextAppearance, -1);
        this.m = tintTypedArray0.a(styleable.MenuView_preserveIconSpacing, false);
        this.l = context0;
        this.n = tintTypedArray0.h(styleable.MenuView_subMenuArrow);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(null, new int[]{0x1010129}, attr.dropDownListViewStyle, 0);
        this.o = typedArray0.hasValue(0);
        tintTypedArray0.I();
        typedArray0.recycle();
    }

    private void a(View view0) {
        this.b(view0, -1);
    }

    @Override  // android.widget.AbsListView$SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect0) {
        if(this.h != null && this.h.getVisibility() == 0) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.h.getLayoutParams();
            rect0.top += this.h.getHeight() + linearLayout$LayoutParams0.topMargin + linearLayout$LayoutParams0.bottomMargin;
        }
    }

    private void b(View view0, int v) {
        LinearLayout linearLayout0 = this.i;
        if(linearLayout0 != null) {
            linearLayout0.addView(view0, v);
            return;
        }
        this.addView(view0, v);
    }

    private void c() {
        CheckBox checkBox0 = (CheckBox)this.getInflater().inflate(layout.abc_list_menu_item_checkbox, this, false);
        this.e = checkBox0;
        this.a(checkBox0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean d() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void e(boolean z, char c) {
        int v = !z || !this.a.D() ? 8 : 0;
        if(v == 0) {
            this.f.setText(this.a.k());
        }
        if(this.f.getVisibility() != v) {
            this.f.setVisibility(v);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void f(MenuItemImpl menuItemImpl0, int v) {
        this.a = menuItemImpl0;
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        this.setTitle(menuItemImpl0.l(this));
        this.setCheckable(menuItemImpl0.isCheckable());
        this.e(menuItemImpl0.D(), menuItemImpl0.j());
        this.setIcon(menuItemImpl0.getIcon());
        this.setEnabled(menuItemImpl0.isEnabled());
        this.setSubMenuArrowVisible(menuItemImpl0.hasSubMenu());
        this.setContentDescription(menuItemImpl0.getContentDescription());
    }

    private void g() {
        ImageView imageView0 = (ImageView)this.getInflater().inflate(layout.abc_list_menu_item_icon, this, false);
        this.b = imageView0;
        this.b(imageView0, 0);
    }

    private LayoutInflater getInflater() {
        if(this.p == null) {
            this.p = LayoutInflater.from(this.getContext());
        }
        return this.p;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public MenuItemImpl getItemData() {
        return this.a;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean h() {
        return this.q;
    }

    private void i() {
        RadioButton radioButton0 = (RadioButton)this.getInflater().inflate(layout.abc_list_menu_item_radio, this, false);
        this.c = radioButton0;
        this.a(radioButton0);
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.setBackground(this.j);
        TextView textView0 = (TextView)this.findViewById(id.title);
        this.d = textView0;
        int v = this.k;
        if(v != -1) {
            textView0.setTextAppearance(this.l, v);
        }
        this.f = (TextView)this.findViewById(id.shortcut);
        ImageView imageView0 = (ImageView)this.findViewById(id.submenuarrow);
        this.g = imageView0;
        if(imageView0 != null) {
            imageView0.setImageDrawable(this.n);
        }
        this.h = (ImageView)this.findViewById(id.group_divider);
        this.i = (LinearLayout)this.findViewById(id.content);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        if(this.b != null && this.m) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
            int v2 = viewGroup$LayoutParams0.height;
            if(v2 > 0 && linearLayout$LayoutParams0.width <= 0) {
                linearLayout$LayoutParams0.width = v2;
            }
        }
        super.onMeasure(v, v1);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setCheckable(boolean z) {
        CheckBox checkBox0;
        RadioButton radioButton0;
        if(!z && this.c == null && this.e == null) {
            return;
        }
        if(this.a.p()) {
            if(this.c == null) {
                this.i();
            }
            radioButton0 = this.c;
            checkBox0 = this.e;
        }
        else {
            if(this.e == null) {
                this.c();
            }
            radioButton0 = this.e;
            checkBox0 = this.c;
        }
        if(z) {
            radioButton0.setChecked(this.a.isChecked());
            if(radioButton0.getVisibility() != 0) {
                radioButton0.setVisibility(0);
            }
            if(checkBox0 != null && checkBox0.getVisibility() != 8) {
                checkBox0.setVisibility(8);
            }
        }
        else {
            CheckBox checkBox1 = this.e;
            if(checkBox1 != null) {
                checkBox1.setVisibility(8);
            }
            RadioButton radioButton1 = this.c;
            if(radioButton1 != null) {
                radioButton1.setVisibility(8);
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setChecked(boolean z) {
        RadioButton radioButton0;
        if(this.a.p()) {
            if(this.c == null) {
                this.i();
            }
            radioButton0 = this.c;
        }
        else {
            if(this.e == null) {
                this.c();
            }
            radioButton0 = this.e;
        }
        radioButton0.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView0 = this.h;
        if(imageView0 != null) {
            imageView0.setVisibility((this.o || !z ? 8 : 0));
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setIcon(Drawable drawable0) {
        boolean z = this.a.C() || this.q;
        if(!z && !this.m) {
            return;
        }
        ImageView imageView0 = this.b;
        if(imageView0 == null && drawable0 == null && !this.m) {
            return;
        }
        if(imageView0 == null) {
            this.g();
        }
        if(drawable0 == null && !this.m) {
            this.b.setVisibility(8);
            return;
        }
        ImageView imageView1 = this.b;
        if(!z) {
            drawable0 = null;
        }
        imageView1.setImageDrawable(drawable0);
        if(this.b.getVisibility() != 0) {
            this.b.setVisibility(0);
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView0 = this.g;
        if(imageView0 != null) {
            imageView0.setVisibility((z ? 0 : 8));
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setTitle(CharSequence charSequence0) {
        if(charSequence0 != null) {
            this.d.setText(charSequence0);
            if(this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
        else if(this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }
}

