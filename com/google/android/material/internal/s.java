package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

@RestrictTo({Scope.b})
public class s extends MenuBuilder {
    public s(Context context0) {
        super(context0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.a(v, v1, v2, charSequence0);
        SubMenu subMenu0 = new u(this.x(), this, menuItemImpl0);
        menuItemImpl0.A(((SubMenuBuilder)subMenu0));
        return subMenu0;
    }
}

