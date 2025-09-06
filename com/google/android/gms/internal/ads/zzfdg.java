package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

public final class zzfdg {
    public static void zza(Context context0, boolean z) {
        if(z) {
            zzo.zzi("This request is sent from a test device.");
            return;
        }
        zzo.zzi(("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzf.zzy(context0) + "\")) to get test ads on this device."));
    }

    public static void zzb(int v, Throwable throwable0, String s) {
        zzo.zzi(("Ad failed to load : " + v));
        zze.zzb(s, throwable0);
        if(v == 3) {
            return;
        }
        zzv.zzp().zzv(throwable0, s);
    }
}

