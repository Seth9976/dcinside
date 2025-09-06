package com.bytedance.sdk.openadsdk.Owx;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

public class DWo {
    protected static final float[] JQp;
    public static WeakReference PjT;
    protected static final float[] ReZ;
    protected static final float[] Zh;
    protected static final float[] cr;

    static {
        DWo.Zh = new float[3];
        DWo.ReZ = new float[3];
        DWo.cr = new float[9];
        DWo.JQp = new float[3];
    }

    public static void PjT(Context context0, long v) {
        if(context0 == null) {
            return;
        }
        ((Vibrator)context0.getSystemService("vibrator")).vibrate(v);
    }

    public static void PjT(Context context0, SensorEventListener sensorEventListener0) {
    }

    public static void PjT(Context context0, SensorEventListener sensorEventListener0, int v) {
        if(sensorEventListener0 != null && context0 != null) {
            try {
                WeakReference weakReference0 = DWo.PjT;
                if(weakReference0 != null) {
                    weakReference0.get();
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void PjT(PjT pjT0) {
        DWo.PjT = new WeakReference(pjT0);
    }

    public static void ReZ(Context context0, SensorEventListener sensorEventListener0, int v) {
        if(sensorEventListener0 != null && context0 != null) {
            try {
                WeakReference weakReference0 = DWo.PjT;
                if(weakReference0 != null) {
                    weakReference0.get();
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void Zh(Context context0, SensorEventListener sensorEventListener0, int v) {
        if(sensorEventListener0 != null && context0 != null) {
            try {
                WeakReference weakReference0 = DWo.PjT;
                if(weakReference0 != null) {
                    weakReference0.get();
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void cr(Context context0, SensorEventListener sensorEventListener0, int v) {
        if(sensorEventListener0 != null && context0 != null) {
            try {
                WeakReference weakReference0 = DWo.PjT;
                if(weakReference0 != null) {
                    weakReference0.get();
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

