package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

@RestrictTo({Scope.b})
public final class e extends MenuBuilder {
    @NonNull
    private final Class Q;
    private final int R;

    public e(@NonNull Context context0, @NonNull Class class0, int v) {
        super(context0);
        this.Q = class0;
        this.R = v;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    protected MenuItem a(int v, int v1, int v2, @NonNull CharSequence charSequence0) {
        if(this.size() + 1 <= this.R) {
            this.n0();
            MenuItem menuItem0 = super.a(v, v1, v2, charSequence0);
            if(menuItem0 instanceof MenuItemImpl) {
                ((MenuItemImpl)menuItem0).w(true);
            }
            this.m0();
            return menuItem0;
        }
        String s = this.Q.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + s + " is " + this.R + ". Limit can be checked with " + s + "#getMaxItemCount()");
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public SubMenu addSubMenu(int v, int v1, int v2, @NonNull CharSequence charSequence0) {
        throw new UnsupportedOperationException(this.Q.getSimpleName() + " does not support submenus");
    }

    public int o0() {
        return this.R;
    }
}

