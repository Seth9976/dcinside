package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

@RestrictTo({Scope.b})
public final class zzaah implements zzcc {
    private static final Executor zza;
    private final Context zzb;
    private final zzaab zzc;
    private final zzaal zzd;
    private final zzaaq zze;
    private final zzbl zzf;
    private final List zzg;
    private final zzabh zzh;
    private final zzcx zzi;
    private final CopyOnWriteArraySet zzj;
    private zzaai zzk;
    private zzdh zzl;
    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;

    static {
        zzaah.zza = new zzzu();
    }

    zzaah(zzzw zzzw0, zzaag zzaag0) {
        Context context0 = zzzw0.zza;
        this.zzb = context0;
        zzaab zzaab0 = new zzaab(this, context0);
        this.zzc = zzaab0;
        zzcx zzcx0 = zzzw0.zzf;
        this.zzi = zzcx0;
        zzaal zzaal0 = zzzw0.zzb;
        this.zzd = zzaal0;
        zzaal0.zzk(zzcx0);
        zzaaq zzaaq0 = new zzaaq(new zzzx(this, null), zzaal0);
        this.zze = zzaaq0;
        zzbl zzbl0 = zzzw0.zzd;
        zzcw.zzb(zzbl0);
        this.zzf = zzbl0;
        this.zzg = zzzw0.zze;
        this.zzh = new zzzh(zzaal0, zzaaq0);
        CopyOnWriteArraySet copyOnWriteArraySet0 = new CopyOnWriteArraySet();
        this.zzj = copyOnWriteArraySet0;
        this.zzo = 0;
        new zzz().zzag();
        copyOnWriteArraySet0.add(zzaab0);
    }

    static zzcb zzc(zzaah zzaah0, zzab zzab0) {
        zzcw.zzf(zzaah0.zzo == 0);
        zzk zzk0 = zzaah.zzw(zzab0.zzC);
        if(zzk0.zzd == 7 && zzei.zza < 34) {
            zzi zzi0 = zzk0.zzc();
            zzi0.zzd(6);
            zzk0 = zzi0.zzg();
        }
        Looper looper0 = Looper.myLooper();
        zzcw.zzb(looper0);
        zzdh zzdh0 = zzaah0.zzi.zzd(looper0, null);
        zzaah0.zzl = zzdh0;
        try {
            Objects.requireNonNull(zzdh0);
            zzzv zzzv0 = new zzzv(zzdh0);
            zzaah0.zzf.zza(zzaah0.zzb, zzk0, zzn.zza, zzaah0, zzzv0, zzfxn.zzn(), 0L);
            Pair pair0 = zzaah0.zzm;
            if(pair0 != null) {
                Surface surface0 = (Surface)pair0.first;
            }
            throw null;
        }
        catch(zzbz zzbz0) {
        }
        throw new zzabg(zzbz0, zzab0);
    }

    public final zzabh zzh() {
        return this.zzc;
    }

    static void zzl(zzaah zzaah0, boolean z) {
        if(zzaah0.zzo == 1) {
            ++zzaah0.zzn;
            zzaah0.zzh.zzd(z);
            zzdh zzdh0 = zzaah0.zzl;
            zzcw.zzb(zzdh0);
            zzdh0.zzh(() -> --zzaah0.zzn);
        }
    }

    static void zzm(zzaah zzaah0, long v, long v1, long v2) {
        zzaah0.zze.zzc(v1, v2);
    }

    static void zzn(zzaah zzaah0, long v, long v1) {
        zzaah0.zzh.zzm(v, v1);
    }

    static void zzo(zzaah zzaah0, float f) {
        zzaah0.zzh.zzq(f);
    }

    public final void zzq() {
        this.zzm = null;
    }

    // 检测为 Lambda 实现
    final void zzr() [...]

    public final void zzs() {
        if(this.zzo == 2) {
            return;
        }
        zzdh zzdh0 = this.zzl;
        if(zzdh0 != null) {
            zzdh0.zze(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzt(Surface surface0, zzdz zzdz0) {
        if(this.zzm != null && ((Surface)this.zzm.first).equals(surface0) && ((zzdz)this.zzm.second).equals(zzdz0)) {
            return;
        }
        this.zzm = Pair.create(surface0, zzdz0);
    }

    static boolean zzu(zzaah zzaah0, long v) {
        return zzaah0.zzn == 0 && zzaah0.zze.zze(v);
    }

    static boolean zzv(zzaah zzaah0, boolean z) {
        return zzaah0.zzh.zzx(false);
    }

    private static zzk zzw(@Nullable zzk zzk0) {
        return zzk0 == null || !zzk0.zzf() ? zzk.zza : zzk0;
    }
}

