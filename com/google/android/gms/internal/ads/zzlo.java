package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

final class zzlo {
    private final zzlj zza;
    private final int zzb;
    private boolean zzc;

    public zzlo(zzlj zzlj0, int v) {
        this.zza = zzlj0;
        this.zzb = v;
        this.zzc = false;
    }

    private static final void zzA(zzlj zzlj0) {
        if(zzlj0.zzcT() == 2) {
            zzlj0.zzP();
        }
    }

    // 去混淆评级： 低(20)
    public final int zza() {
        return zzlo.zzz(this.zza) ? 1 : 0;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final long zzc(@Nullable zzkl zzkl0) {
        zzcw.zzf(this.zzy(zzkl0));
        return this.zza.zzcV();
    }

    public final void zzd(zzia zzia0) {
        zzlj zzlj0 = this.zza;
        if(!zzlo.zzz(zzlj0)) {
            return;
        }
        zzia0.zzd(zzlj0);
        zzlo.zzA(zzlj0);
        zzlj0.zzr();
    }

    public final void zze(zzln zzln0, zzab[] arr_zzab, zzvy zzvy0, long v, boolean z, boolean z1, long v1, long v2, zzug zzug0, zzia zzia0) throws zzib {
        this.zzc = true;
        this.zza.zzs(zzln0, arr_zzab, zzvy0, v, z, z1, v1, v2, zzug0);
        zzia0.zze(this.zza);
    }

    public final void zzf() {
        if(zzlo.zzz(this.zza)) {
            this.zza.zzt();
        }
    }

    public final void zzg(int v, @Nullable Object object0) throws zzib {
        this.zza.zzu(11, object0);
    }

    public final void zzh() throws IOException {
        this.zza.zzw();
    }

    public final void zzi() {
        this.zza.zzG();
        this.zzc = false;
    }

    public final void zzj(long v, long v1) throws zzib {
        if(zzlo.zzz(this.zza)) {
            this.zza.zzV(v, v1);
        }
    }

    public final void zzk(zzab[] arr_zzab, zzvy zzvy0, long v, long v1, zzug zzug0) throws zzib {
        this.zza.zzH(arr_zzab, zzvy0, v, v1, zzug0);
    }

    public final void zzl() {
        if(this.zzc) {
            this.zza.zzI();
            this.zzc = false;
        }
    }

    public final void zzm(long v) throws zzib {
        if(zzlo.zzz(this.zza)) {
            this.zza.zzJ(v);
        }
    }

    public final void zzn(long v) {
        zzlj zzlj0 = this.zza;
        zzlj0.zzK();
        if(!(zzlj0 instanceof zzwn)) {
            return;
        }
        zzwn zzwn0 = (zzwn)zzlj0;
        throw null;
    }

    public final void zzo(float f, float f1) throws zzib {
        this.zza.zzM(f, f1);
    }

    public final void zzp(zzbq zzbq0) {
        this.zza.zzN(zzbq0);
    }

    public final void zzq(@Nullable Object object0) throws zzib {
        if(this.zza.zzb() == 2) {
            this.zza.zzu(1, object0);
        }
    }

    public final void zzr() throws zzib {
        if(this.zza.zzcT() == 1) {
            this.zza.zzO();
        }
    }

    public final void zzs() {
        if(zzlo.zzz(this.zza)) {
            zzlo.zzA(this.zza);
        }
    }

    // 去混淆评级： 低(30)
    public final boolean zzt(zzkl zzkl0) throws IOException {
        boolean z = zzkl0.zzc[this.zzb] != this.zza.zzp();
        return z || !z && this.zza.zzQ() || this.zza.zzX() || this.zza.zzW();
    }

    public final boolean zzu(zzkl zzkl0) {
        zzvy zzvy0 = zzkl0.zzc[this.zzb];
        return this.zza.zzp() == zzvy0 && (zzvy0 == null || this.zza.zzQ());
    }

    public final boolean zzv() {
        return this.zza.zzQ();
    }

    public final boolean zzw() {
        return this.zza.zzR();
    }

    public final boolean zzx() {
        return this.zza.zzW();
    }

    public final boolean zzy(@Nullable zzkl zzkl0) {
        return (zzkl0 == null || (zzkl0.zzc[this.zzb] == null || this.zza.zzp() != zzkl0.zzc[this.zzb]) ? null : this.zza) != null;
    }

    private static boolean zzz(zzlj zzlj0) {
        return zzlj0.zzcT() != 0;
    }
}

