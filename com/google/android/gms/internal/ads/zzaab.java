package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import h4.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class zzaab implements zzaac, zzabh {
    final zzaah zza;
    private final int zzb;
    private final ArrayList zzc;
    private final zzaaj zzd;
    @Nullable
    private zzab zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzabe zzo;
    private Executor zzp;

    public zzaab(zzaah zzaah0, Context context0) {
        this.zza = zzaah0;
        super();
        this.zzb = zzei.zzK(context0) ? 1 : 5;
        this.zzc = new ArrayList();
        this.zzd = new zzaaj();
        this.zzk = 0x8000000000000001L;
        this.zzo = zzabe.zzb;
        this.zzp = zzaah.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzaac
    public final void zzA(zzaah zzaah0, zzcd zzcd0) {
        this.zzp.execute(new zzzy(this, this.zzo, zzcd0));
    }

    private final void zzB() {
        if(this.zze == null) {
            return;
        }
        new ArrayList(this.zzc);
        zzab zzab0 = this.zze;
        zzab0.getClass();
        zzz zzz0 = zzab0.zzb();
        zzz0.zzB(zzaah.zzw(zzab0.zzC));
        zzz0.zzag();
        zzcw.zzb(null);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final Surface zza() {
        zzcw.zzf(false);
        zzcw.zzb(null);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        this.zza.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzc() {
        this.zza.zzh.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzd(boolean z) {
        this.zzl = false;
        this.zzk = 0x8000000000000001L;
        zzaah.zzl(this.zza, z);
        this.zzn = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zze(zzab zzab0) throws zzabg {
        zzaah.zzc(this.zza, zzab0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzf(boolean z) {
        this.zza.zzh.zzf(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzg(int v, zzab zzab0) {
        boolean z = false;
        zzcw.zzf(false);
        this.zze = zzab0;
        if(!this.zzl) {
            this.zzB();
            this.zzl = true;
            this.zzm = false;
            this.zzn = 0x8000000000000001L;
            return;
        }
        if(this.zzk != 0x8000000000000001L) {
            z = true;
        }
        zzcw.zzf(z);
        this.zzm = true;
        this.zzn = this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzh() {
        this.zza.zzh.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzi(boolean z) {
        this.zza.zzh.zzi(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzj() {
        this.zza.zzh.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzk() {
        this.zza.zzh.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzl() {
        this.zza.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzm(long v, long v1) throws zzabg {
        zzaah.zzn(this.zza, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzn(int v) {
        this.zza.zzh.zzn(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzo(zzabe zzabe0, Executor executor0) {
        this.zzo = zzabe0;
        this.zzp = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzp(Surface surface0, zzdz zzdz0) {
        this.zza.zzt(surface0, zzdz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzq(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        zzaah.zzo(this.zza, f);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzr(long v, long v1, long v2, long v3) {
        this.zzj |= this.zzg != v1 || this.zzh != v2;
        this.zzf = v;
        this.zzg = v1;
        this.zzh = v2;
        this.zzi = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzs(List list0) {
        if(this.zzc.equals(list0)) {
            return;
        }
        this.zzc.clear();
        this.zzc.addAll(list0);
        this.zzc.addAll(this.zza.zzg);
        this.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzt(zzaai zzaai0) {
        this.zza.zzk = zzaai0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final boolean zzu(long v, boolean z, long v1, long v2, zzabf zzabf0) throws zzabg {
        zzcw.zzf(false);
        long v3 = v - this.zzh;
        try {
            if(this.zza.zzd.zza(v3, v1, v2, this.zzf, z, this.zzd) != 4) {
                goto label_8;
            }
            return false;
        }
        catch(zzib zzib0) {
            zzab zzab0 = this.zze;
            zzcw.zzb(zzab0);
            throw new zzabg(zzib0, zzab0);
        }
    label_8:
        if(v3 < this.zzi && !z) {
            ((zzzm)zzabf0).zzd.zzaQ(((zzzm)zzabf0).zza, ((zzzm)zzabf0).zzb, ((zzzm)zzabf0).zzc);
            return true;
        }
        zzaah.zzn(this.zza, v1, v2);
        if(!this.zzm) {
        }
        else if(this.zzn == 0x8000000000000001L || zzaah.zzu(this.zza, this.zzn)) {
            this.zzB();
            this.zzm = false;
            this.zzn = 0x8000000000000001L;
        }
        else {
            return false;
        }
        zzcw.zzb(null);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final boolean zzv() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    @e(expression = {"videoFrameProcessor"}, result = true)
    public final boolean zzw() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final boolean zzx(boolean z) {
        return zzaah.zzv(this.zza, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzaac
    public final void zzy(zzaah zzaah0) {
        this.zzp.execute(new zzzz(this, this.zzo));
    }

    @Override  // com.google.android.gms.internal.ads.zzaac
    public final void zzz(zzaah zzaah0) {
        this.zzp.execute(new zzaaa(this, this.zzo));
    }
}

