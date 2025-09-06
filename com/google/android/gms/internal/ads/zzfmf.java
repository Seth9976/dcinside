package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

public final class zzfmf {
    private static UiModeManager zza;

    static {
    }

    public static zzfkv zza() {
        UiModeManager uiModeManager0 = zzfmf.zza;
        if(uiModeManager0 != null) {
            switch(uiModeManager0.getCurrentModeType()) {
                case 1: {
                    return zzfkv.zzb;
                }
                case 4: {
                    return zzfkv.zza;
                }
                default: {
                    return zzfkv.zzc;
                }
            }
        }
        return zzfkv.zzc;
    }

    public static void zzb(Context context0) {
        if(context0 != null) {
            zzfmf.zza = (UiModeManager)context0.getSystemService("uimode");
        }
    }
}

