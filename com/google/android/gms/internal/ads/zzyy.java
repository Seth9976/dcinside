package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.Executors;

public final class zzyy {
    public static final zzyr zza;
    public static final zzyr zzb;
    private final zzzg zzc;
    @Nullable
    private zzys zzd;
    @Nullable
    private IOException zze;

    static {
        zzyy.zza = new zzyr(2, 0x8000000000000001L, null);
        zzyy.zzb = new zzyr(3, 0x8000000000000001L, null);
    }

    public zzyy(String s) {
        zzzg zzzg0 = zzze.zza(Executors.newSingleThreadExecutor(new zzeg("ExoPlayer:Loader:ProgressiveMediaPeriod")), new zzyp());
        super();
        this.zzc = zzzg0;
    }

    public final long zza(zzyt zzyt0, zzyq zzyq0, int v) {
        Looper looper0 = Looper.myLooper();
        zzcw.zzb(looper0);
        this.zze = null;
        long v1 = SystemClock.elapsedRealtime();
        new zzys(this, looper0, zzyt0, zzyq0, v, v1).zzc(0L);
        return v1;
    }

    public static zzyr zzb(boolean z, long v) {
        return new zzyr(((int)z), v, null);
    }

    public final void zzg() {
        zzys zzys0 = this.zzd;
        zzcw.zzb(zzys0);
        zzys0.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int v) throws IOException {
        IOException iOException0 = this.zze;
        if(iOException0 != null) {
            throw iOException0;
        }
        zzys zzys0 = this.zzd;
        if(zzys0 != null) {
            zzys0.zzb(v);
        }
    }

    public final void zzj(@Nullable zzyu zzyu0) {
        zzys zzys0 = this.zzd;
        if(zzys0 != null) {
            zzys0.zza(true);
        }
        zzyv zzyv0 = new zzyv(zzyu0);
        this.zzc.execute(zzyv0);
        this.zzc.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}

