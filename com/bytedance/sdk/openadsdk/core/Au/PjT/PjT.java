package com.bytedance.sdk.openadsdk.core.Au.PjT;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class PjT {
    public static float PjT(Context context0) {
        return (float)qZS.ReZ(context0, ((float)qZS.qj(context0)));
    }

    @NonNull
    public static Pair PjT(Window window0, int v) {
        float[] arr_f = new float[2];
        View view0 = window0.getDecorView();
        arr_f[0] = (float)(view0.getWidth() - view0.getPaddingLeft() * 2);
        arr_f[1] = (float)(view0.getHeight() - view0.getPaddingTop() * 2);
        arr_f[0] = (float)qZS.ReZ(window0.getContext(), arr_f[0]);
        float f = (float)qZS.ReZ(window0.getContext(), arr_f[1]);
        arr_f[1] = f;
        if(arr_f[0] < 10.0f || f < 10.0f) {
            int v1 = qZS.ReZ(window0.getContext(), qZS.PjT());
            arr_f = PjT.PjT(window0.getContext(), v1, v);
        }
        float f1 = Math.max(arr_f[0], arr_f[1]);
        float f2 = Math.min(arr_f[0], arr_f[1]);
        if(v == 1) {
            arr_f[0] = f2;
            arr_f[1] = f1;
            return new Pair(((float)arr_f[0]), ((float)arr_f[1]));
        }
        arr_f[0] = f1;
        arr_f[1] = f2;
        return new Pair(((float)arr_f[0]), ((float)arr_f[1]));
    }

    private static float[] PjT(Context context0, int v, int v1) {
        float f = PjT.PjT(context0);
        float f1 = PjT.Zh(context0);
        if((v1 == 1 ? 1 : 0) != (f > f1 ? 1 : 0)) {
            float f2 = f + f1;
            f1 = f2 - f1;
            f = f2 - f1;
        }
        return v1 == 1 ? new float[]{f1, f - ((float)v)} : new float[]{f1 - ((float)v), f};
    }

    public static float Zh(Context context0) {
        return (float)qZS.ReZ(context0, ((float)qZS.xf(context0)));
    }
}

