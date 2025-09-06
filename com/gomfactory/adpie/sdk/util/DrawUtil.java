package com.gomfactory.adpie.sdk.util;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

public class DrawUtil {
    public static ShapeDrawable cornerDrawable(Context context0, int v, int v1, boolean z, boolean z1, boolean z2, boolean z3) {
        int v2 = DisplayUtil.dpToPx(context0, v1);
        float[] arr_f = new float[8];
        if(z) {
            arr_f[0] = (float)v2;
            arr_f[1] = (float)v2;
        }
        else {
            arr_f[0] = 0.0f;
            arr_f[1] = 0.0f;
        }
        if(z1) {
            arr_f[2] = (float)v2;
            arr_f[3] = (float)v2;
        }
        else {
            arr_f[2] = 0.0f;
            arr_f[3] = 0.0f;
        }
        if(z2) {
            arr_f[4] = (float)v2;
            arr_f[5] = (float)v2;
        }
        else {
            arr_f[4] = 0.0f;
            arr_f[5] = 0.0f;
        }
        if(z3) {
            arr_f[6] = (float)v2;
            arr_f[7] = (float)v2;
        }
        else {
            arr_f[6] = 0.0f;
            arr_f[7] = 0.0f;
        }
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(arr_f, null, null));
        shapeDrawable0.getPaint().setColor(v);
        return shapeDrawable0;
    }
}

