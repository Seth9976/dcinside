package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

@RestrictTo({Scope.b})
public class u extends SubMenuBuilder {
    public u(Context context0, s s0, MenuItemImpl menuItemImpl0) {
        super(context0, s0, menuItemImpl0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    public void O(boolean z) {
        super.O(z);
        ((MenuBuilder)this.o0()).O(z);
    }
}

