package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar.OnMenuItemClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class ToolbarActionBar extends ActionBar {
    final class ActionMenuPresenterCallback implements Callback {
        private boolean a;
        final ToolbarActionBar b;

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public void c(@NonNull MenuBuilder menuBuilder0, boolean z) {
            if(this.a) {
                return;
            }
            this.a = true;
            ToolbarActionBar.this.i.v();
            ToolbarActionBar.this.j.onPanelClosed(108, menuBuilder0);
            this.a = false;
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public boolean d(@NonNull MenuBuilder menuBuilder0) {
            ToolbarActionBar.this.j.onMenuOpened(108, menuBuilder0);
            return true;
        }
    }

    final class MenuBuilderCallback implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        final ToolbarActionBar a;

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public boolean a(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
            return false;
        }

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public void b(@NonNull MenuBuilder menuBuilder0) {
            if(ToolbarActionBar.this.i.d()) {
                ToolbarActionBar.this.j.onPanelClosed(108, menuBuilder0);
                return;
            }
            if(ToolbarActionBar.this.j.onPreparePanel(0, null, menuBuilder0)) {
                ToolbarActionBar.this.j.onMenuOpened(108, menuBuilder0);
            }
        }
    }

    class ToolbarMenuCallback implements ActionBarMenuCallback {
        final ToolbarActionBar a;

        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback
        public boolean a(int v) {
            if(v == 0) {
                ToolbarActionBar toolbarActionBar0 = ToolbarActionBar.this;
                if(!toolbarActionBar0.l) {
                    toolbarActionBar0.i.h();
                    ToolbarActionBar.this.l = true;
                }
            }
            return false;
        }

        @Override  // androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback
        public View onCreatePanelView(int v) {
            return v == 0 ? new View(ToolbarActionBar.this.i.getContext()) : null;
        }
    }

    final DecorToolbar i;
    final Window.Callback j;
    final ActionBarMenuCallback k;
    boolean l;
    private boolean m;
    private boolean n;
    private ArrayList o;
    private final Runnable p;
    private final OnMenuItemClickListener q;

    ToolbarActionBar(@NonNull Toolbar toolbar0, @Nullable CharSequence charSequence0, @NonNull Window.Callback window$Callback0) {
        this.o = new ArrayList();
        this.p = () -> {
            Menu menu0 = ToolbarActionBar.this.D0();
            MenuBuilder menuBuilder0 = menu0 instanceof MenuBuilder ? ((MenuBuilder)menu0) : null;
            if(menuBuilder0 != null) {
                menuBuilder0.n0();
            }
            try {
                menu0.clear();
                if(!ToolbarActionBar.this.j.onCreatePanelMenu(0, menu0) || !ToolbarActionBar.this.j.onPreparePanel(0, null, menu0)) {
                    menu0.clear();
                }
            }
            finally {
                if(menuBuilder0 != null) {
                    menuBuilder0.m0();
                }
            }
        };
        androidx.appcompat.app.ToolbarActionBar.2 toolbarActionBar$20 = new OnMenuItemClickListener() {
            final ToolbarActionBar a;

            @Override  // androidx.appcompat.widget.Toolbar$OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem0) {
                return ToolbarActionBar.this.j.onMenuItemSelected(0, menuItem0);
            }
        };
        this.q = toolbarActionBar$20;
        Preconditions.l(toolbar0);
        ToolbarWidgetWrapper toolbarWidgetWrapper0 = new ToolbarWidgetWrapper(toolbar0, false);
        this.i = toolbarWidgetWrapper0;
        this.j = (Window.Callback)Preconditions.l(window$Callback0);
        toolbarWidgetWrapper0.setWindowCallback(window$Callback0);
        toolbar0.setOnMenuItemClickListener(toolbarActionBar$20);
        toolbarWidgetWrapper0.setWindowTitle(charSequence0);
        this.k = new ToolbarMenuCallback(this);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public CharSequence A() {
        return this.i.getTitle();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence0) {
        this.i.setWindowTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void B() {
        this.i.setVisibility(8);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void B0() {
        this.i.setVisibility(0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean C() {
        this.i.J().removeCallbacks(this.p);
        ViewCompat.x1(this.i.J(), this.p);
        return true;
    }

    private Menu D0() {
        if(!this.m) {
            ActionMenuPresenterCallback toolbarActionBar$ActionMenuPresenterCallback0 = new ActionMenuPresenterCallback(this);
            MenuBuilderCallback toolbarActionBar$MenuBuilderCallback0 = new MenuBuilderCallback(this);
            this.i.P(toolbarActionBar$ActionMenuPresenterCallback0, toolbarActionBar$MenuBuilderCallback0);
            this.m = true;
        }
        return this.i.H();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean E() {
        return this.i.getVisibility() == 0;
    }

    // 检测为 Lambda 实现
    void E0() [...]

    @Override  // androidx.appcompat.app.ActionBar
    public boolean F() {
        return super.F();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab G() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void H(Configuration configuration0) {
        super.H(configuration0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    void I() {
        this.i.J().removeCallbacks(this.p);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean J(int v, KeyEvent keyEvent0) {
        Menu menu0 = this.D0();
        if(menu0 != null) {
            menu0.setQwertyMode(KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1);
            return menu0.performShortcut(v, keyEvent0, 0);
        }
        return false;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean K(KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1) {
            this.L();
        }
        return true;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean L() {
        return this.i.c();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void M() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void N(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.o.remove(actionBar$OnMenuVisibilityListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void O(Tab actionBar$Tab0) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void P(int v) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean Q() {
        ViewGroup viewGroup0 = this.i.J();
        if(viewGroup0 != null && !viewGroup0.hasFocus()) {
            viewGroup0.requestFocus();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void R(Tab actionBar$Tab0) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void S(@Nullable Drawable drawable0) {
        this.i.a(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void T(int v) {
        this.U(LayoutInflater.from(this.i.getContext()).inflate(v, this.i.J(), false));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void U(View view0) {
        this.V(view0, new LayoutParams(-2, -2));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void V(View view0, LayoutParams actionBar$LayoutParams0) {
        if(view0 != null) {
            view0.setLayoutParams(actionBar$LayoutParams0);
        }
        this.i.C(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void W(boolean z) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void X(boolean z) {
        this.Z((z ? 4 : 0), 4);
    }

    @Override  // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public void Y(int v) {
        this.Z(v, -1);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void Z(int v, int v1) {
        int v2 = this.i.B();
        this.i.m(v & v1 | ~v1 & v2);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void a0(boolean z) {
        this.Z((z ? 16 : 0), 16);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void b0(boolean z) {
        this.Z((z ? 2 : 0), 2);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void c0(boolean z) {
        this.Z((z ? 8 : 0), 8);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void d0(boolean z) {
        this.Z(((int)z), 1);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void e0(float f) {
        ViewCompat.X1(this.i.J(), f);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void f(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.o.add(actionBar$OnMenuVisibilityListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void g(Tab actionBar$Tab0) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void h(Tab actionBar$Tab0, int v) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void h0(int v) {
        this.i.r(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void i(Tab actionBar$Tab0, int v, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void i0(CharSequence charSequence0) {
        this.i.n(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void j(Tab actionBar$Tab0, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void j0(int v) {
        this.i.O(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean k() {
        return this.i.f();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void k0(Drawable drawable0) {
        this.i.E(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean l() {
        if(this.i.k()) {
            this.i.collapseActionView();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void l0(boolean z) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void m(boolean z) {
        if(z == this.n) {
            return;
        }
        this.n = z;
        int v = this.o.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((OnMenuVisibilityListener)this.o.get(v1)).a(z);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void m0(int v) {
        this.i.setIcon(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public View n() {
        return this.i.w();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void n0(Drawable drawable0) {
        this.i.setIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int o() {
        return this.i.B();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void o0(SpinnerAdapter spinnerAdapter0, OnNavigationListener actionBar$OnNavigationListener0) {
        NavItemSelectedListener navItemSelectedListener0 = new NavItemSelectedListener(actionBar$OnNavigationListener0);
        this.i.Q(spinnerAdapter0, navItemSelectedListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public float p() {
        return ViewCompat.V(this.i.J());
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void p0(int v) {
        this.i.setLogo(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int q() {
        return this.i.getHeight();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void q0(Drawable drawable0) {
        this.i.x(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void r0(int v) {
        if(v == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.i.p(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int s() {
        return 0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void s0(int v) {
        if(this.i.o() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.i.G(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int t() {
        return 0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void t0(boolean z) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int u() {
        return -1;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void u0(Drawable drawable0) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab v() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable0) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public CharSequence w() {
        return this.i.S();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void w0(int v) {
        CharSequence charSequence0 = v == 0 ? null : this.i.getContext().getText(v);
        this.i.F(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab x(int v) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void x0(CharSequence charSequence0) {
        this.i.F(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int y() {
        return 0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void y0(int v) {
        CharSequence charSequence0 = v == 0 ? null : this.i.getContext().getText(v);
        this.i.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Context z() {
        return this.i.getContext();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void z0(CharSequence charSequence0) {
        this.i.setTitle(charSequence0);
    }

    class androidx.appcompat.app.ToolbarActionBar.1 implements Runnable {
        final ToolbarActionBar a;

        @Override
        public void run() {
            ToolbarActionBar.this.E0();
        }
    }

}

