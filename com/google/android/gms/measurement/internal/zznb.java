package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzdh;
import w4.d;

public final class zznb extends zzh {
    protected final zznj zza;
    protected final zznh zzb;
    private Handler zzc;
    private boolean zzd;
    private final zzng zze;

    zznb(zzhy zzhy0) {
        super(zzhy0);
        this.zzd = true;
        this.zza = new zznj(this);
        this.zzb = new zznh(this);
        this.zze = new zzng(this);
    }

    static void zza(zznb zznb0, long v) {
        zznb0.zzt();
        zznb0.zzab();
        zznb0.zzj().zzp().zza("Activity paused, time", v);
        zznb0.zze.zza(v);
        if(zznb0.zze().zzw()) {
            zznb0.zzb.zzb(v);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    @WorkerThread
    final void zza(boolean z) {
        this.zzt();
        this.zzd = z;
    }

    public final boolean zza(boolean z, boolean z1, long v) {
        return this.zzb.zza(z, z1, v);
    }

    @WorkerThread
    final boolean zzaa() {
        this.zzt();
        return this.zzd;
    }

    @WorkerThread
    private final void zzab() {
        this.zzt();
        if(this.zzc == null) {
            this.zzc = new zzdh(Looper.getMainLooper());
        }
    }

    static void zzb(zznb zznb0, long v) {
        zznb0.zzt();
        zznb0.zzab();
        zznb0.zzj().zzp().zza("Activity resumed, time", v);
        if(!zznb0.zze().zza(zzbh.zzco)) {
            if(zznb0.zze().zzw() || zznb0.zzk().zzn.zza()) {
                zznb0.zzb.zzc(v);
            }
        }
        else if(zznb0.zze().zzw() || zznb0.zzd) {
            zznb0.zzb.zzc(v);
        }
        zznb0.zze.zza();
        zznj zznj0 = zznb0.zza;
        zznj0.zza.zzt();
        if(zznj0.zza.zzu.zzac()) {
            zznj0.zza(zznj0.zza.zzb().currentTimeMillis(), false);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzb zzc() {
        return super.zzc();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzgg zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzgf zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzjq zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzlj zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zzls zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final zznb zzp() {
        return super.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    public final void zzt() {
        super.zzt();
    }

    @Override  // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return false;
    }
}

