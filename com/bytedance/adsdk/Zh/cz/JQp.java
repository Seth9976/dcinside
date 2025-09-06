package com.bytedance.adsdk.Zh.cz;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.Zh.ReZ.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.fDm;

public class JQp {
    private static final PointF PjT;

    static {
        JQp.PjT = new PointF();
    }

    public static float PjT(float f, float f1, float f2) [...] // Inlined contents

    static int PjT(float f, float f1) {
        return JQp.PjT(((int)f), ((int)f1));
    }

    private static int PjT(int v, int v1) {
        return v - v1 * JQp.Zh(v, v1);
    }

    public static int PjT(int v, int v1, float f) {
        return (int)(((float)v) + f * ((float)(v1 - v)));
    }

    public static int PjT(int v, int v1, int v2) {
        return Math.max(v1, Math.min(v2, v));
    }

    public static PointF PjT(PointF pointF0, PointF pointF1) {
        return new PointF(pointF0.x + pointF1.x, pointF0.y + pointF1.y);
    }

    public static void PjT(fDm fDm0, Path path0) {
        path0.reset();
        PointF pointF0 = fDm0.PjT();
        path0.moveTo(pointF0.x, pointF0.y);
        JQp.PjT.set(pointF0.x, pointF0.y);
        for(int v = 0; v < fDm0.ReZ().size(); ++v) {
            PjT pjT0 = (PjT)fDm0.ReZ().get(v);
            PointF pointF1 = pjT0.PjT();
            PointF pointF2 = pjT0.Zh();
            PointF pointF3 = pjT0.ReZ();
            PointF pointF4 = JQp.PjT;
            if(!pointF1.equals(pointF4) || !pointF2.equals(pointF3)) {
                path0.cubicTo(pointF1.x, pointF1.y, pointF2.x, pointF2.y, pointF3.x, pointF3.y);
            }
            else {
                path0.lineTo(pointF3.x, pointF3.y);
            }
            pointF4.set(pointF3.x, pointF3.y);
        }
        if(fDm0.Zh()) {
            path0.close();
        }
    }

    public static boolean ReZ(float f, float f1, float f2) {
        return f >= f1 && f <= f2;
    }

    public static float Zh(float f, float f1, float f2) {
        return Math.max(f1, Math.min(f2, f));
    }

    private static int Zh(int v, int v1) {
        int v2 = v / v1;
        return (v ^ v1) >= 0 || v % v1 == 0 ? v2 : v2 - 1;
    }
}

