package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.drawable;
import androidx.appcompat.R.id;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

@RestrictTo({Scope.c})
public class ToolbarWidgetWrapper implements DecorToolbar {
    Toolbar a;
    private int b;
    private View c;
    private Spinner d;
    private View e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    CharSequence j;
    private CharSequence k;
    private CharSequence l;
    Window.Callback m;
    boolean n;
    private ActionMenuPresenter o;
    private int p;
    private int q;
    private Drawable r;
    private static final String s = "ToolbarWidgetWrapper";
    private static final int t = 3;
    private static final long u = 200L;

    public ToolbarWidgetWrapper(Toolbar toolbar0, boolean z) {
        this(toolbar0, z, string.abc_action_bar_up_description, drawable.abc_ic_ab_back_material);
    }

    public ToolbarWidgetWrapper(Toolbar toolbar0, boolean z, int v, int v1) {
        this.p = 0;
        this.q = 0;
        this.a = toolbar0;
        this.j = toolbar0.getTitle();
        this.k = toolbar0.getSubtitle();
        this.i = this.j != null;
        this.h = toolbar0.getNavigationIcon();
        TintTypedArray tintTypedArray0 = TintTypedArray.G(toolbar0.getContext(), null, styleable.ActionBar, attr.actionBarStyle, 0);
        this.r = tintTypedArray0.h(styleable.ActionBar_homeAsUpIndicator);
        if(z) {
            CharSequence charSequence0 = tintTypedArray0.x(styleable.ActionBar_title);
            if(!TextUtils.isEmpty(charSequence0)) {
                this.setTitle(charSequence0);
            }
            CharSequence charSequence1 = tintTypedArray0.x(styleable.ActionBar_subtitle);
            if(!TextUtils.isEmpty(charSequence1)) {
                this.F(charSequence1);
            }
            Drawable drawable0 = tintTypedArray0.h(styleable.ActionBar_logo);
            if(drawable0 != null) {
                this.x(drawable0);
            }
            Drawable drawable1 = tintTypedArray0.h(styleable.ActionBar_icon);
            if(drawable1 != null) {
                this.setIcon(drawable1);
            }
            if(this.h == null) {
                Drawable drawable2 = this.r;
                if(drawable2 != null) {
                    this.E(drawable2);
                }
            }
            this.m(tintTypedArray0.o(styleable.ActionBar_displayOptions, 0));
            int v2 = tintTypedArray0.u(styleable.ActionBar_customNavigationLayout, 0);
            if(v2 != 0) {
                this.C(LayoutInflater.from(this.a.getContext()).inflate(v2, this.a, false));
                this.m(this.b | 16);
            }
            int v3 = tintTypedArray0.q(styleable.ActionBar_height, 0);
            if(v3 > 0) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
                viewGroup$LayoutParams0.height = v3;
                this.a.setLayoutParams(viewGroup$LayoutParams0);
            }
            int v4 = tintTypedArray0.f(styleable.ActionBar_contentInsetStart, -1);
            int v5 = tintTypedArray0.f(styleable.ActionBar_contentInsetEnd, -1);
            if(v4 >= 0 || v5 >= 0) {
                this.a.L(Math.max(v4, 0), Math.max(v5, 0));
            }
            int v6 = tintTypedArray0.u(styleable.ActionBar_titleTextStyle, 0);
            if(v6 != 0) {
                this.a.Q(this.a.getContext(), v6);
            }
            int v7 = tintTypedArray0.u(styleable.ActionBar_subtitleTextStyle, 0);
            if(v7 != 0) {
                this.a.O(this.a.getContext(), v7);
            }
            int v8 = tintTypedArray0.u(styleable.ActionBar_popupTheme, 0);
            if(v8 != 0) {
                this.a.setPopupTheme(v8);
            }
        }
        else {
            this.b = this.T();
        }
        tintTypedArray0.I();
        this.L(v);
        this.l = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new View.OnClickListener() {
            final ActionMenuItem a;
            final ToolbarWidgetWrapper b;

            {
                this.a = new ActionMenuItem(toolbarWidgetWrapper0.a.getContext(), 0, 0x102002C, 0, 0, toolbarWidgetWrapper0.j);
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Window.Callback window$Callback0 = ToolbarWidgetWrapper.this.m;
                if(window$Callback0 != null && ToolbarWidgetWrapper.this.n) {
                    window$Callback0.onMenuItemSelected(0, this.a);
                }
            }
        });
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void A(int v) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.I(v, 200L);
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.y();
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int B() {
        return this.b;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void C(View view0) {
        View view1 = this.e;
        if(view1 != null && (this.b & 16) != 0) {
            this.a.removeView(view1);
        }
        this.e = view0;
        if(view0 != null && (this.b & 16) != 0) {
            this.a.addView(view0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void D() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void E(Drawable drawable0) {
        this.h = drawable0;
        this.X();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void F(CharSequence charSequence0) {
        this.k = charSequence0;
        if((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void G(int v) {
        Spinner spinner0 = this.d;
        if(spinner0 == null) {
            throw new IllegalStateException("Can\'t set dropdown selected position without an adapter");
        }
        spinner0.setSelection(v);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public Menu H() {
        return this.a.getMenu();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public ViewPropertyAnimatorCompat I(int v, long v1) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = ViewCompat.h(this.a);
        return v == 0 ? viewPropertyAnimatorCompat0.b(1.0f).s(v1).u(new ViewPropertyAnimatorListenerAdapter() {
            private boolean a;
            final ToolbarWidgetWrapper c;

            {
                int v = 0;  // 捕获的参数
                this.a = false;
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void a(View view0) {
                this.a = true;
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                if(!this.a) {
                    ToolbarWidgetWrapper.this.a.setVisibility(0);
                }
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void c(View view0) {
                ToolbarWidgetWrapper.this.a.setVisibility(0);
            }
        }) : viewPropertyAnimatorCompat0.b(0.0f).s(v1).u(new ViewPropertyAnimatorListenerAdapter() {
            private boolean a;
            final ToolbarWidgetWrapper c;

            {
                int v = v;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = false;
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void a(View view0) {
                this.a = true;
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                if(!this.a) {
                    ToolbarWidgetWrapper.this.a.setVisibility(v);
                }
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void c(View view0) {
                ToolbarWidgetWrapper.this.a.setVisibility(0);
            }
        });
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public ViewGroup J() {
        return this.a;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void K(boolean z) {
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void L(int v) {
        if(v == this.q) {
            return;
        }
        this.q = v;
        if(TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            this.r(this.q);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void M(ScrollingTabContainerView scrollingTabContainerView0) {
        View view0 = this.c;
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            Toolbar toolbar0 = this.a;
            if(viewParent0 == toolbar0) {
                toolbar0.removeView(this.c);
            }
        }
        this.c = scrollingTabContainerView0;
        if(scrollingTabContainerView0 != null && this.p == 2) {
            this.a.addView(scrollingTabContainerView0, 0);
            LayoutParams toolbar$LayoutParams0 = (LayoutParams)this.c.getLayoutParams();
            toolbar$LayoutParams0.width = -2;
            toolbar$LayoutParams0.height = -2;
            toolbar$LayoutParams0.a = 0x800053;
            scrollingTabContainerView0.setAllowCollapse(true);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean N() {
        return this.c != null;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void O(int v) {
        this.E((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void P(Callback menuPresenter$Callback0, androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0) {
        this.a.N(menuPresenter$Callback0, menuBuilder$Callback0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void Q(SpinnerAdapter spinnerAdapter0, AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        this.U();
        this.d.setAdapter(spinnerAdapter0);
        this.d.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void R(SparseArray sparseArray0) {
        this.a.restoreHierarchyState(sparseArray0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public CharSequence S() {
        return this.a.getSubtitle();
    }

    private int T() {
        if(this.a.getNavigationIcon() != null) {
            this.r = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void U() {
        if(this.d == null) {
            this.d = new AppCompatSpinner(this.getContext(), null, attr.actionDropDownStyle);
            LayoutParams toolbar$LayoutParams0 = new LayoutParams(-2, -2, 0x800013);
            this.d.setLayoutParams(toolbar$LayoutParams0);
        }
    }

    private void V(CharSequence charSequence0) {
        this.j = charSequence0;
        if((this.b & 8) != 0) {
            this.a.setTitle(charSequence0);
            if(this.i) {
                ViewCompat.M1(this.a.getRootView(), charSequence0);
            }
        }
    }

    private void W() {
        if((this.b & 4) != 0) {
            if(TextUtils.isEmpty(this.l)) {
                this.a.setNavigationContentDescription(this.q);
                return;
            }
            this.a.setNavigationContentDescription(this.l);
        }
    }

    private void X() {
        if((this.b & 4) != 0) {
            this.a.setNavigationIcon((this.h == null ? this.r : this.h));
            return;
        }
        this.a.setNavigationIcon(null);
    }

    private void Y() {
        Drawable drawable0;
        int v = this.b;
        if((v & 2) == 0) {
            drawable0 = null;
        }
        else if((v & 1) != 0) {
            drawable0 = this.g;
            if(drawable0 == null) {
                drawable0 = this.f;
            }
        }
        else {
            drawable0 = this.f;
        }
        this.a.setLogo(drawable0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void a(Drawable drawable0) {
        this.a.setBackground(drawable0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean b() {
        return this.a.d();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean c() {
        return this.a.T();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        this.a.e();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean d() {
        return this.a.B();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean e() {
        return this.f != null;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean f() {
        return this.a.w();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void g(Menu menu0, Callback menuPresenter$Callback0) {
        if(this.o == null) {
            ActionMenuPresenter actionMenuPresenter0 = new ActionMenuPresenter(this.a.getContext());
            this.o = actionMenuPresenter0;
            actionMenuPresenter0.s(id.action_menu_presenter);
        }
        this.o.k(menuPresenter$Callback0);
        this.a.M(((MenuBuilder)menu0), this.o);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public Context getContext() {
        return this.a.getContext();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
        return this.a.getVisibility();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void h() {
        this.n = true;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean i() {
        return this.g != null;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean j() {
        return this.a.A();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean k() {
        return this.a.v();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean l() {
        return this.a.C();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void m(int v) {
        int v1 = this.b ^ v;
        this.b = v;
        if(v1 != 0) {
            if((v1 & 4) != 0) {
                if((v & 4) != 0) {
                    this.W();
                }
                this.X();
            }
            if((v1 & 3) != 0) {
                this.Y();
            }
            if((v1 & 8) != 0) {
                if((v & 8) == 0) {
                    this.a.setTitle(null);
                    this.a.setSubtitle(null);
                }
                else {
                    this.a.setTitle(this.j);
                    this.a.setSubtitle(this.k);
                }
            }
            if((v1 & 16) != 0) {
                View view0 = this.e;
                if(view0 != null) {
                    if((v & 16) != 0) {
                        this.a.addView(view0);
                        return;
                    }
                    this.a.removeView(view0);
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void n(CharSequence charSequence0) {
        this.l = charSequence0;
        this.W();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int o() {
        return this.p;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void p(int v) {
        int v1 = this.p;
        if(v != v1) {
            switch(v1) {
                case 1: {
                    Spinner spinner0 = this.d;
                    if(spinner0 != null) {
                        ViewParent viewParent0 = spinner0.getParent();
                        Toolbar toolbar0 = this.a;
                        if(viewParent0 == toolbar0) {
                            toolbar0.removeView(this.d);
                        }
                    }
                    break;
                }
                case 2: {
                    View view0 = this.c;
                    if(view0 != null) {
                        ViewParent viewParent1 = view0.getParent();
                        Toolbar toolbar1 = this.a;
                        if(viewParent1 == toolbar1) {
                            toolbar1.removeView(this.c);
                        }
                    }
                }
            }
            this.p = v;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        this.U();
                        this.a.addView(this.d, 0);
                        return;
                    }
                    case 2: {
                        View view1 = this.c;
                        if(view1 != null) {
                            this.a.addView(view1, 0);
                            LayoutParams toolbar$LayoutParams0 = (LayoutParams)this.c.getLayoutParams();
                            toolbar$LayoutParams0.width = -2;
                            toolbar$LayoutParams0.height = -2;
                            toolbar$LayoutParams0.a = 0x800053;
                            return;
                        }
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Invalid navigation mode " + v);
                    }
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int q() {
        return this.d == null ? 0 : this.d.getSelectedItemPosition();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void r(int v) {
        this.n((v == 0 ? null : this.getContext().getString(v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int v) {
        this.setIcon((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setIcon(Drawable drawable0) {
        this.f = drawable0;
        this.Y();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int v) {
        this.x((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setTitle(CharSequence charSequence0) {
        this.i = true;
        this.V(charSequence0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int v) {
        this.a.setVisibility(v);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(Window.Callback window$Callback0) {
        this.m = window$Callback0;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence0) {
        if(!this.i) {
            this.V(charSequence0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int t() {
        return this.d == null ? 0 : this.d.getCount();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void u(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void v() {
        this.a.f();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public View w() {
        return this.e;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void x(Drawable drawable0) {
        this.g = drawable0;
        this.Y();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void y(Drawable drawable0) {
        if(this.r != drawable0) {
            this.r = drawable0;
            this.X();
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void z(SparseArray sparseArray0) {
        this.a.saveHierarchyState(sparseArray0);
    }
}

