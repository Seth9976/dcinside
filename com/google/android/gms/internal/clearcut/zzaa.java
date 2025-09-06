package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

public class zzaa {
    private static volatile UserManager zzdc;
    private static volatile boolean zzdd;

    static {
        zzaa.zzdd = false;
    }

    // 去混淆评级： 低(40)
    public static boolean zze(Context context0) {
        return !zzaa.zzf(context0);
    }

    private static boolean zzf() [...] // 潜在的解密器

    @TargetApi(24)
    private static boolean zzf(Context context0) {
        boolean z = zzaa.zzdd;
        if(!z) {
            UserManager userManager0 = zzaa.zzdc;
            if(userManager0 == null) {
                synchronized(zzaa.class) {
                    userManager0 = zzaa.zzdc;
                    if(userManager0 == null) {
                        UserManager userManager1 = (UserManager)context0.getSystemService(UserManager.class);
                        zzaa.zzdc = userManager1;
                        if(userManager1 == null) {
                            zzaa.zzdd = true;
                            return true;
                        }
                        userManager0 = userManager1;
                    }
                }
            }
            z = userManager0.isUserUnlocked();
            zzaa.zzdd = z;
            if(z) {
                zzaa.zzdc = null;
            }
        }
        return z;
    }
}

