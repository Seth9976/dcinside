package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView.ScaleType;
import com.bytedance.sdk.openadsdk.gK.PjT.Zh;

public class xE {
    public interface PjT {
        void PjT();

        void PjT(Zh arg1);
    }

    public static Drawable PjT(byte[] arr_b, int v) {
        if(arr_b != null && arr_b.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
            }
            catch(Throwable unused_ex) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }

    public static void PjT(com.bytedance.sdk.openadsdk.gK.PjT pjT0, int v, int v1, PjT xE$PjT0, String s) {
        xE.PjT(pjT0, v, v1, xE$PjT0, s, 0);
    }

    public static void PjT(com.bytedance.sdk.openadsdk.gK.PjT pjT0, int v, int v1, PjT xE$PjT0, String s, int v2) {
        com.bytedance.sdk.openadsdk.gK.Zh.PjT().ReZ().PjT(pjT0, new com.bytedance.sdk.openadsdk.gK.PjT.PjT.PjT() {
            @Override  // com.bytedance.sdk.openadsdk.gK.PjT.PjT$PjT
            public void PjT(int v, String s, Throwable throwable0) {
                PjT xE$PjT0 = xE$PjT0;
                if(xE$PjT0 != null) {
                    xE$PjT0.PjT();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.gK.PjT.PjT$PjT
            public void PjT(String s, Zh zh0) {
                if(zh0.cr()) {
                    PjT xE$PjT0 = xE$PjT0;
                    if(xE$PjT0 != null) {
                        xE$PjT0.PjT(zh0);
                        return;
                    }
                }
                PjT xE$PjT1 = xE$PjT0;
                if(xE$PjT1 != null) {
                    xE$PjT1.PjT();
                }
            }
        }, v, v1, ImageView.ScaleType.CENTER_INSIDE, s, v2, null);
    }
}

