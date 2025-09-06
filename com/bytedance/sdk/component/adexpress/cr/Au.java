package com.bytedance.sdk.component.adexpress.cr;

import android.graphics.drawable.GradientDrawable;

public class Au {
    public static GradientDrawable PjT(int v, Integer integer0, int[] arr_v, int[] arr_v1, Integer integer1, Integer integer2) {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(v);
        if(integer0 != null) {
            gradientDrawable0.setColor(((int)integer0));
        }
        int v1 = arr_v == null ? 0 : arr_v.length;
        if(v1 == 1) {
            gradientDrawable0.setCornerRadius(((float)arr_v[0]));
        }
        else if(v1 == 4) {
            gradientDrawable0.setCornerRadii(new float[]{((float)arr_v[0]), ((float)arr_v[0]), ((float)arr_v[1]), ((float)arr_v[1]), ((float)arr_v[2]), ((float)arr_v[2]), ((float)arr_v[3]), ((float)arr_v[3])});
        }
        if(arr_v1 != null && arr_v1.length == 2) {
            gradientDrawable0.setSize(arr_v1[0], arr_v1[1]);
        }
        if(integer1 != null && integer2 != null) {
            gradientDrawable0.setStroke(((int)integer1), ((int)integer2));
        }
        return gradientDrawable0;
    }
}

