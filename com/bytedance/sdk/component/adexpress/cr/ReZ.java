package com.bytedance.sdk.component.adexpress.cr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;

public class ReZ {
    public static Drawable PjT(Context context0, int v, int v1, int v2) {
        Drawable drawable0 = new GradientDrawable();
        ((GradientDrawable)drawable0).setShape(1);
        if(context0 != null) {
            ((GradientDrawable)drawable0).setStroke(v, v1);
        }
        ((GradientDrawable)drawable0).setColor(v2);
        return drawable0;
    }

    public static Drawable PjT(Context context0, XX xX0) {
        return context0 == null || xX0 == null ? null : ReZ.PjT(context0, ((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, xX0.ub())), xX0.xE(), xX0.Yo());
    }
}

