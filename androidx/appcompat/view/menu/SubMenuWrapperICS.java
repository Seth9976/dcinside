package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportSubMenu;

@RestrictTo({Scope.c})
class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {
    private final SupportSubMenu p;

    SubMenuWrapperICS(Context context0, SupportSubMenu supportSubMenu0) {
        super(context0, supportSubMenu0);
        this.p = supportSubMenu0;
    }

    @Override  // android.view.SubMenu
    public void clearHeader() {
        this.p.clearHeader();
    }

    @Override  // android.view.SubMenu
    public MenuItem getItem() {
        return this.e(this.p.getItem());
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(int v) {
        this.p.setHeaderIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable0) {
        this.p.setHeaderIcon(drawable0);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(int v) {
        this.p.setHeaderTitle(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence0) {
        this.p.setHeaderTitle(charSequence0);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderView(View view0) {
        this.p.setHeaderView(view0);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(int v) {
        this.p.setIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable0) {
        this.p.setIcon(drawable0);
        return this;
    }
}

