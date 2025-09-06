package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class zzgs {
    @GuardedBy("DirectBootUtils.class")
    @Nullable
    private static UserManager zza;
    private static volatile boolean zzb;

    static {
        zzgs.zzb = false;
    }

    @ChecksSdkIntAtLeast(api = 24)
    public static boolean zza() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    public static boolean zza(Context context0) {
        return !zzgs.zzc(context0);
    }

    // 去混淆评级： 低(40)
    public static boolean zzb(Context context0) {
        return zzgs.zzc(context0);
    }

    @TargetApi(24)
    @RequiresApi(24)
    private static boolean zzc(Context context0) {
        if(zzgs.zzb) {
            return true;
        }
        synchronized(zzgs.class) {
            if(zzgs.zzb) {
                return true;
            }
            boolean z = zzgs.zzd(context0);
            if(z) {
                zzgs.zzb = true;
            }
            return z;
        }
    }

    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    @RequiresApi(24)
    private static boolean zzd(Context context0) {
        boolean z = true;
        int v = 1;
        while(true) {
            if(zzgs.zza == null) {
                zzgs.zza = (UserManager)context0.getSystemService(UserManager.class);
            }
            UserManager userManager0 = zzgs.zza;
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
                zzgs.zza = null;
                ++v;
                continue;
            }
            z = false;
            break;
        }
        if(z) {
            zzgs.zza = null;
        }
        return z;
    }
}

