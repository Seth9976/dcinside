package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View.MeasureSpec;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.navigation.d;

@RestrictTo({Scope.b})
final class a extends d {
    public a(@NonNull Context context0) {
        super(context0);
    }

    @Override  // com.google.android.material.navigation.d
    @DimenRes
    protected int getItemDefaultMarginResId() {
        return dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override  // com.google.android.material.navigation.d
    @LayoutRes
    protected int getItemLayoutResId() {
        return layout.mtrl_navigation_rail_item;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(View.MeasureSpec.getMode(v1) == 0) {
            int v2 = View.MeasureSpec.getSize(v1);
            int v3 = Math.max(this.getMeasuredHeight(), v2);
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), v3);
        }
    }
}

