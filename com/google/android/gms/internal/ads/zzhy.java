package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

public final class zzhy implements zzkg {
    private final zzyk zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzhy() {
        zzyk zzyk0 = new zzyk(true, 0x10000);
        super();
        zzhy.zzl(2500, 0, "bufferForPlaybackMs", "0");
        zzhy.zzl(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzhy.zzl(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzhy.zzl(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzhy.zzl(50000, 50000, "maxBufferMs", "minBufferMs");
        zzhy.zzl(0, 0, "backBufferDurationMs", "0");
        this.zza = zzyk0;
        this.zzb = 50000000L;
        this.zzc = 50000000L;
        this.zzd = 2500000L;
        this.zze = 5000000L;
        this.zzf = 0L;
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    @VisibleForTesting
    final int zza() {
        int v = 0;
        for(Object object0: this.zzg.values()) {
            v += ((zzhw)object0).zzb;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final long zzb(zzog zzog0) {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zzc(zzog zzog0) {
        long v = Thread.currentThread().getId();
        zzcw.zzg(this.zzh == -1L || this.zzh == v, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = v;
        if(!this.zzg.containsKey(zzog0)) {
            zzhw zzhw0 = new zzhw(null);
            this.zzg.put(zzog0, zzhw0);
        }
        zzhw zzhw1 = (zzhw)this.zzg.get(zzog0);
        zzhw1.getClass();
        zzhw1.zzb = 0xC80000;
        zzhw1.zza = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zzd(zzog zzog0) {
        this.zzm(zzog0);
        if(this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzog zzog0) {
        this.zzm(zzog0);
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final void zzf(zzkf zzkf0, zzwj zzwj0, zzxv[] arr_zzxv) {
        zzhw zzhw0 = (zzhw)this.zzg.get(zzkf0.zza);
        zzhw0.getClass();
        int v1 = 0;
        for(int v = 0; true; ++v) {
            int v2 = 0xC80000;
            if(v >= arr_zzxv.length) {
                break;
            }
            zzxv zzxv0 = arr_zzxv[v];
            if(zzxv0 != null) {
                switch(zzxv0.zzg().zzc) {
                    case 0: {
                        v2 = 0x89A0000;
                        break;
                    }
                    case -1: 
                    case 1: {
                        break;
                    }
                    case 2: {
                        v2 = 0x7D00000;
                        break;
                    }
                    default: {
                        v2 = 0x20000;
                    }
                }
                v1 += v2;
            }
        }
        zzhw0.zzb = Math.max(0xC80000, v1);
        this.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(zzog zzog0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(zzkf zzkf0) {
        zzhw zzhw0 = (zzhw)this.zzg.get(zzkf0.zza);
        zzhw0.getClass();
        int v = this.zza.zza();
        int v1 = this.zza();
        long v2 = this.zzb;
        float f = zzkf0.zzc;
        if(f > 1.0f) {
            v2 = Math.min(zzei.zzq(v2, f), this.zzc);
        }
        long v3 = zzkf0.zzb;
        boolean z = false;
        if(v3 < Math.max(v2, 500000L)) {
            if(v < v1) {
                z = true;
            }
            zzhw0.zza = z;
            if(!z && v3 < 500000L) {
                zzdo.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                return zzhw0.zza;
            }
        }
        else if(v3 >= this.zzc || v >= v1) {
            zzhw0.zza = false;
        }
        return zzhw0.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzi(zzbq zzbq0, zzug zzug0, long v) {
        for(Object object0: this.zzg.values()) {
            if(((zzhw)object0).zza) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj(zzkf zzkf0) {
        long v = zzei.zzr(zzkf0.zzb, zzkf0.zzc);
        long v1 = zzkf0.zzd ? this.zze : this.zzd;
        long v2 = zzkf0.zze;
        if(v2 != 0x8000000000000001L) {
            v1 = Math.min(v2 / 2L, v1);
        }
        return v1 <= 0L || v >= v1 || this.zza.zza() >= this.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzkg
    public final zzyk zzk() {
        return this.zza;
    }

    private static void zzl(int v, int v1, String s, String s1) {
        zzcw.zze(v >= v1, s + " cannot be less than " + s1);
    }

    private final void zzm(zzog zzog0) {
        if(this.zzg.remove(zzog0) != null) {
            this.zzn();
        }
    }

    private final void zzn() {
        if(this.zzg.isEmpty()) {
            this.zza.zze();
            return;
        }
        int v = this.zza();
        this.zza.zzf(v);
    }
}

