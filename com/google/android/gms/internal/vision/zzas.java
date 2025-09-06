package com.google.android.gms.internal.vision;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

public class zzas {
    @GuardedBy("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb;
    @GuardedBy("DirectBootUtils.class")
    private static boolean zzc;

    static {
        zzas.zzb = false;
        zzas.zzc = false;
    }

    public static boolean zza() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    public static boolean zza(Context context0) {
        return zzas.zzc(context0);
    }

    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    @RequiresApi(24)
    private static boolean zzb(Context context0) {
        boolean z = true;
        int v = 1;
        while(true) {
            if(zzas.zza == null) {
                zzas.zza = (UserManager)context0.getSystemService(UserManager.class);
            }
            UserManager userManager0 = zzas.zza;
            if(userManager0 == null) {
                return true;
            }
            try {
                if(userManager0.isUserUnlocked() || !userManager0.isUserRunning(Process.myUserHandle())) {
                    break;
                }
            }
            catch(NullPointerException nullPointerException0) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", nullPointerException0);
                zzas.zza = null;
                ++v;
                continue;
            }
            z = false;
            break;
        }
        if(z) {
            zzas.zza = null;
        }
        return z;
    }

    @TargetApi(24)
    @RequiresApi(24)
    private static boolean zzc(Context context0) {
        if(zzas.zzb) {
            return true;
        }
        synchronized(zzas.class) {
            if(zzas.zzb) {
                return true;
            }
            boolean z = zzas.zzb(context0);
            if(z) {
                zzas.zzb = true;
            }
            return z;
        }
    }
}

