package com.google.android.material.bottomnavigation;

import android.content.Context;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.navigation.d;

@RestrictTo({Scope.b})
public class a extends d {
    public a(@NonNull Context context0) {
        super(context0);
    }

    @Override  // com.google.android.material.navigation.d
    @DimenRes
    protected int getItemDefaultMarginResId() {
        return dimen.design_bottom_navigation_margin;
    }

    @Override  // com.google.android.material.navigation.d
    @LayoutRes
    protected int getItemLayoutResId() {
        return layout.design_bottom_navigation_item;
    }
}

