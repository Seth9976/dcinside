package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class gK extends cz {
    public Zh PjT;

    public gK(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    protected GradientDrawable PjT(GradientDrawable.Orientation gradientDrawable$Orientation0, @ColorInt int[] arr_v) {
        Zh zh0 = new Zh(gradientDrawable$Orientation0, arr_v);
        this.PjT = zh0;
        return zh0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    protected Zh PjT(Bitmap bitmap0) {
        Zh zh0 = new PjT(bitmap0, this.PjT);
        this.PjT = zh0;
        return zh0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        return super.SM();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    protected GradientDrawable getDrawable() {
        Zh zh0 = new Zh();
        this.PjT = zh0;
        return zh0;
    }
}

