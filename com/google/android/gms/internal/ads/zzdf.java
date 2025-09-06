package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;

public final class zzdf {
    public static void zza(boolean z, String s) throws zzde {
        if(!z) {
            throw new zzde(s);
        }
    }

    // 去混淆评级： 低(40)
    public static boolean zzb(Context context0) {
        return zzei.zza >= 24 && (zzei.zza >= 26 || !"samsung".equals(zzei.zzc) && !"XT1650".equals(zzei.zzd)) && (zzei.zza >= 26 || context0.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) ? zzdf.zzd("EGL_EXT_protected_content") : false;
    }

    public static boolean zzc() {
        return zzdf.zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String s) {
        String s1 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 0x3055);
        return s1 != null && s1.contains(s);
    }
}

