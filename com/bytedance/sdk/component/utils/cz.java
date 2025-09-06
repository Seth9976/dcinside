package com.bytedance.sdk.component.utils;

import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;

public class cz {
    public static boolean PjT(byte[] arr_b) {
        if(arr_b == null) {
            return false;
        }
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        return bitmapFactory$Options0.outWidth > 0;
    }

    public static boolean Zh(byte[] arr_b) {
        return arr_b != null && arr_b.length >= 3 && arr_b[0] == 71 && arr_b[1] == 73 && arr_b[2] == 70;
    }
}

