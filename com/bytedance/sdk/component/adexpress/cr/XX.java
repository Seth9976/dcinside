package com.bytedance.sdk.component.adexpress.cr;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import java.lang.reflect.Method;

public class XX {
    private static boolean PjT;

    public static float PjT(Context context0, float f) {
        if(context0 == null) {
            context0 = PjT.PjT().ReZ().Zh();
        }
        return f * XX.cr(context0) + 0.5f;
    }

    public static int PjT(float f, float f1, float f2, float f3) {
        return ((int)(f * 255.0f + 0.5f)) << 24 | ((int)(f1 * 255.0f + 0.5f)) << 16 | ((int)(f2 * 255.0f + 0.5f)) << 8 | ((int)(f3 * 255.0f + 0.5f));
    }

    public static int PjT(Context context0) {
        if(context0 == null) {
            context0 = PjT.PjT().ReZ().Zh();
        }
        return context0.getResources().getDisplayMetrics().widthPixels;
    }

    private static String PjT(String s) [...] // 潜在的解密器

    public static float ReZ(Context context0, float f) {
        if(context0 == null) {
            context0 = PjT.PjT().ReZ().Zh();
        }
        return f * XX.cr(context0);
    }

    public static String ReZ(@NonNull Context context0) [...] // 潜在的解密器

    public static int Zh(Context context0) {
        if(context0 == null) {
            context0 = PjT.PjT().ReZ().Zh();
        }
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        display0.getRealMetrics(displayMetrics0);
        return displayMetrics0.heightPixels;
    }

    public static int Zh(Context context0, float f) {
        if(context0 == null) {
            context0 = PjT.PjT().ReZ().Zh();
        }
        float f1 = XX.cr(context0);
        if(f1 <= 0.0f) {
            f1 = 1.0f;
        }
        return (int)(f / f1 + 0.5f);
    }

    private static float cr(Context context0) {
        if(XX.PjT) {
            try {
                Class class0 = context0.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method method0 = class0.getDeclaredMethod("getDeviceDensity", null);
                method0.setAccessible(true);
                return ((float)(((int)(((Integer)method0.invoke(class0, null)))))) / 160.0f;
            }
            catch(Exception unused_ex) {
            }
        }
        return context0.getResources().getDisplayMetrics().density;
    }
}

