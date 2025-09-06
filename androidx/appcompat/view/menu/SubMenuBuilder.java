package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    private MenuBuilder Q;
    private MenuItemImpl R;

    public SubMenuBuilder(Context context0, MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        super(context0);
        this.Q = menuBuilder0;
        this.R = menuItemImpl0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public MenuBuilder G() {
        return this.Q.G();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean J() {
        return this.Q.J();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean K() {
        return this.Q.K();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean L() {
        return this.Q.L();
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public void Y(Callback menuBuilder$Callback0) {
        this.Q.Y(menuBuilder$Callback0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean g(MenuItemImpl menuItemImpl0) {
        return this.Q.g(menuItemImpl0);
    }

    @Override  // android.view.SubMenu
    public MenuItem getItem() {
        return this.R;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.view.menu.MenuBuilder
    boolean i(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        return super.i(menuBuilder0, menuItem0) || this.Q.i(menuBuilder0, menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public void k0(boolean z) {
        this.Q.k0(z);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public boolean n(MenuItemImpl menuItemImpl0) {
        return this.Q.n(menuItemImpl0);
    }

    public Menu o0() {
        return this.Q;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.Q.setGroupDividerEnabled(z);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(int v) {
        return (SubMenu)super.c0(v);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable0) {
        return (SubMenu)super.d0(drawable0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(int v) {
        return (SubMenu)super.f0(v);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence0) {
        return (SubMenu)super.g0(charSequence0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderView(View view0) {
        return (SubMenu)super.h0(view0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(int v) {
        this.R.setIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable0) {
        this.R.setIcon(drawable0);
        return this;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.Q.setQwertyMode(z);
    }

    // 去混淆评级： 低(25)
    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public String w() {
        int v = this.R == null ? 0 : this.R.getItemId();
        return v == 0 ? null : "android:menu:actionviewstates:" + v;
    }
}

