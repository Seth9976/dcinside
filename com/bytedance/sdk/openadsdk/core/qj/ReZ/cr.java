package com.bytedance.sdk.openadsdk.core.qj.ReZ;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class cr {
    public static final List PjT;

    static {
        cr.PjT = Arrays.asList(new String[]{"video/mp4", "video/3gpp"});
    }

    private static double PjT(int v) {
        int v1 = Math.max(v, 0);
        return 700 > v1 || v1 > 1500 ? Math.min(((float)Math.abs(700 - v1)) / 700.0f, ((float)Math.abs(1500 - v1)) / 1500.0f) : 0.0;
    }

    private static double PjT(int v, double f, int v1, int v2) {
        double f1 = 0.0;
        double f2 = f > 0.0 ? Math.abs(f - (v2 <= 0 ? 0.0 : ((double)v1) / ((double)v2))) : 0.0;
        if(v > 0) {
            f1 = (double)Math.abs((v - v1) / v);
        }
        return f2 + f1;
    }

    public static double PjT(int v, double f, int v1, int v2, int v3, @Nullable String s) {
        return cr.PjT(s) * (1.0 / (cr.PjT(v, f, v1, v2) + 1.0 + cr.PjT(v3)));
    }

    private static double PjT(String s) {
        if(s == null) {
            s = "";
        }
        return s.hashCode() != 0x4F62635D || !s.equals("video/mp4") ? 1.0 : 1.5;
    }
}

