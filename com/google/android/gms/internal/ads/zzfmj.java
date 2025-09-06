package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;

public final class zzfmj {
    private static int zza = 2;

    static {
    }

    public static void zza(@NonNull Context context0) {
        IntentFilter intentFilter0 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        context0.registerReceiver(new zzfmi(), intentFilter0);
    }

    public static int zzb() {
        return zzfmf.zza() == zzfkv.zza ? zzfmj.zza : 2;
    }
}

