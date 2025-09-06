package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class cr {
    public static Drawable PjT() {
        Drawable drawable0 = new GradientDrawable();
        ((GradientDrawable)drawable0).setShape(1);
        ((GradientDrawable)drawable0).setStroke(qZS.Zh(ub.PjT(), 1.0f), Color.parseColor("#33FFFFFF"));
        ((GradientDrawable)drawable0).setColor(Color.parseColor("#99333333"));
        return drawable0;
    }

    public static Drawable Zh() {
        Drawable drawable0 = new GradientDrawable();
        ((GradientDrawable)drawable0).setShape(0);
        ((GradientDrawable)drawable0).setCornerRadius(((float)qZS.Zh(ub.PjT(), 44.0f)));
        ((GradientDrawable)drawable0).setStroke(qZS.Zh(ub.PjT(), 1.0f), Color.parseColor("#33FFFFFF"));
        ((GradientDrawable)drawable0).setColor(Color.parseColor("#99333333"));
        return drawable0;
    }
}

