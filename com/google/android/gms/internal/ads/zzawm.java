package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class zzawm {
    private static final String[] zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private boolean zze;

    static {
        zzawm.zza = new String[]{"android:establish_vpn_service", "android:establish_vpn_manager"};
    }

    zzawm(@NonNull Context context0, @NonNull Executor executor0, @NonNull String[] arr_s) {
        this.zzb = 0L;
        this.zzc = 0L;
        this.zzd = -1L;
        this.zze = false;
        if(Build.VERSION.SDK_INT < 30) {
            return;
        }
        zzawl zzawl0 = new zzawl(this);
        try {
            ((AppOpsManager)context0.getSystemService("appops")).startWatchingActive(arr_s, executor0, zzawl0);
        }
        catch(NoSuchMethodError | IllegalArgumentException unused_ex) {
        }
    }

    public final long zzb() {
        long v = this.zzd;
        this.zzd = -1L;
        return v;
    }

    // 去混淆评级： 低(20)
    public final long zzc() {
        return this.zze ? this.zzc - this.zzb : -1L;
    }

    public static zzawm zzd(@NonNull Context context0, @NonNull Executor executor0) {
        return new zzawm(context0, executor0, zzawm.zza);
    }

    public final void zzh() {
        if(this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }
}

