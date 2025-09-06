package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class zzg {
    private final zzhy zza;
    @Nullable
    private Long zzaa;
    @Nullable
    private Long zzab;
    private long zzac;
    @Nullable
    private String zzad;
    private int zzae;
    private int zzaf;
    private long zzag;
    private String zzah;
    @Nullable
    private byte[] zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    @Nullable
    private String zzap;
    private boolean zzaq;
    private long zzar;
    private long zzas;
    private final String zzb;
    @Nullable
    private String zzc;
    @Nullable
    private String zzd;
    @Nullable
    private String zze;
    @Nullable
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    @Nullable
    private String zzj;
    private long zzk;
    @Nullable
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    @Nullable
    private String zzq;
    @Nullable
    private Boolean zzr;
    private long zzs;
    @Nullable
    private List zzt;
    @Nullable
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    @WorkerThread
    zzg(zzhy zzhy0, String s) {
        Preconditions.checkNotNull(zzhy0);
        Preconditions.checkNotEmpty(s);
        this.zza = zzhy0;
        this.zzb = s;
        zzhy0.zzl().zzt();
    }

    @WorkerThread
    public final int zza() {
        this.zza.zzl().zzt();
        return this.zzy;
    }

    @WorkerThread
    public final void zza(int v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzy != v;
        this.zzy = v;
    }

    @WorkerThread
    public final void zza(long v) {
        this.zza.zzl().zzt();
        long v1 = this.zzg + v;
        if(v1 > 0x7FFFFFFFL) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzgo.zza(this.zzb));
            v1 = v - 1L;
        }
        long v2 = this.zzag + 1L;
        if(v2 > 0x7FFFFFFFL) {
            this.zza.zzj().zzu().zza("Delivery index overflow. appId", zzgo.zza(this.zzb));
            v2 = 0L;
        }
        this.zzaq = true;
        this.zzg = v1;
        this.zzag = v2;
    }

    @WorkerThread
    public final void zza(@Nullable Boolean boolean0) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzr, boolean0);
        this.zzr = boolean0;
    }

    @WorkerThread
    public final void zza(@Nullable Long long0) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzaa, long0);
        this.zzaa = long0;
    }

    @WorkerThread
    public final void zza(@Nullable String s) {
        this.zza.zzl().zzt();
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzaq |= !Objects.equals(this.zzq, s);
        this.zzq = s;
    }

    @WorkerThread
    public final void zza(@Nullable List list0) {
        this.zza.zzl().zzt();
        if(!Objects.equals(this.zzt, list0)) {
            this.zzaq = true;
            this.zzt = list0 == null ? null : new ArrayList(list0);
        }
    }

    @WorkerThread
    public final void zza(boolean z) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzp != z;
        this.zzp = z;
    }

    @WorkerThread
    public final void zza(@Nullable byte[] arr_b) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzai != arr_b;
        this.zzai = arr_b;
    }

    @Nullable
    @WorkerThread
    public final String zzaa() {
        this.zza.zzl().zzt();
        return this.zzq;
    }

    @Nullable
    @WorkerThread
    public final String zzab() {
        this.zza.zzl().zzt();
        String s = this.zzap;
        this.zzg(null);
        return s;
    }

    @WorkerThread
    public final String zzac() {
        this.zza.zzl().zzt();
        return this.zzb;
    }

    @Nullable
    @WorkerThread
    public final String zzad() {
        this.zza.zzl().zzt();
        return this.zzc;
    }

    @Nullable
    @WorkerThread
    public final String zzae() {
        this.zza.zzl().zzt();
        return this.zzl;
    }

    @Nullable
    @WorkerThread
    public final String zzaf() {
        this.zza.zzl().zzt();
        return this.zzj;
    }

    @Nullable
    @WorkerThread
    public final String zzag() {
        this.zza.zzl().zzt();
        return this.zzf;
    }

    @Nullable
    @WorkerThread
    public final String zzah() {
        this.zza.zzl().zzt();
        return this.zzd;
    }

    @Nullable
    @WorkerThread
    public final String zzai() {
        this.zza.zzl().zzt();
        return this.zzap;
    }

    @Nullable
    @WorkerThread
    public final String zzaj() {
        this.zza.zzl().zzt();
        return this.zze;
    }

    @WorkerThread
    public final String zzak() {
        this.zza.zzl().zzt();
        return this.zzah;
    }

    @Nullable
    @WorkerThread
    public final String zzal() {
        this.zza.zzl().zzt();
        return this.zzu;
    }

    @Nullable
    @WorkerThread
    public final String zzam() {
        this.zza.zzl().zzt();
        return this.zzad;
    }

    @Nullable
    @WorkerThread
    public final List zzan() {
        this.zza.zzl().zzt();
        return this.zzt;
    }

    @WorkerThread
    public final void zzao() {
        this.zza.zzl().zzt();
        this.zzaq = false;
    }

    @WorkerThread
    public final void zzap() {
        this.zza.zzl().zzt();
        long v = this.zzg + 1L;
        if(v > 0x7FFFFFFFL) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzgo.zza(this.zzb));
            v = 0L;
        }
        this.zzaq = true;
        this.zzg = v;
    }

    @WorkerThread
    public final boolean zzaq() {
        this.zza.zzl().zzt();
        return this.zzp;
    }

    @WorkerThread
    public final boolean zzar() {
        this.zza.zzl().zzt();
        return this.zzo;
    }

    @WorkerThread
    public final boolean zzas() {
        this.zza.zzl().zzt();
        return this.zzaq;
    }

    @WorkerThread
    public final boolean zzat() {
        this.zza.zzl().zzt();
        return this.zzv;
    }

    @WorkerThread
    public final boolean zzau() {
        this.zza.zzl().zzt();
        return this.zzz;
    }

    @Nullable
    @WorkerThread
    public final byte[] zzav() {
        this.zza.zzl().zzt();
        return this.zzai;
    }

    @WorkerThread
    public final int zzb() {
        this.zza.zzl().zzt();
        return this.zzaf;
    }

    @WorkerThread
    public final void zzb(int v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzaf != v;
        this.zzaf = v;
    }

    @WorkerThread
    public final void zzb(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzk != v;
        this.zzk = v;
    }

    @WorkerThread
    public final void zzb(@Nullable Long long0) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzab, long0);
        this.zzab = long0;
    }

    @WorkerThread
    public final void zzb(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzc, s);
        this.zzc = s;
    }

    @WorkerThread
    public final void zzb(boolean z) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzo != z;
        this.zzo = z;
    }

    @WorkerThread
    public final int zzc() {
        this.zza.zzl().zzt();
        return this.zzae;
    }

    @WorkerThread
    public final void zzc(int v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzae != v;
        this.zzae = v;
    }

    @WorkerThread
    public final void zzc(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzac != v;
        this.zzac = v;
    }

    @WorkerThread
    public final void zzc(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzl, s);
        this.zzl = s;
    }

    @WorkerThread
    public final void zzc(boolean z) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzv != z;
        this.zzv = z;
    }

    @WorkerThread
    public final long zzd() {
        this.zza.zzl().zzt();
        return 0L;
    }

    @WorkerThread
    public final void zzd(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzar != v;
        this.zzar = v;
    }

    @WorkerThread
    public final void zzd(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzj, s);
        this.zzj = s;
    }

    @WorkerThread
    public final void zzd(boolean z) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzz != z;
        this.zzz = z;
    }

    @WorkerThread
    public final long zze() {
        this.zza.zzl().zzt();
        return this.zzk;
    }

    @WorkerThread
    public final void zze(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzam != v;
        this.zzam = v;
    }

    @WorkerThread
    public final void zze(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzf, s);
        this.zzf = s;
    }

    @WorkerThread
    public final long zzf() {
        this.zza.zzl().zzt();
        return this.zzac;
    }

    @WorkerThread
    public final void zzf(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzan != v;
        this.zzan = v;
    }

    @WorkerThread
    public final void zzf(@Nullable String s) {
        this.zza.zzl().zzt();
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzaq |= !Objects.equals(this.zzd, s);
        this.zzd = s;
    }

    @WorkerThread
    public final long zzg() {
        this.zza.zzl().zzt();
        return this.zzar;
    }

    @WorkerThread
    public final void zzg(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzal != v;
        this.zzal = v;
    }

    @WorkerThread
    public final void zzg(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzap, s);
        this.zzap = s;
    }

    @WorkerThread
    public final long zzh() {
        this.zza.zzl().zzt();
        return this.zzam;
    }

    @WorkerThread
    public final void zzh(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzak != v;
        this.zzak = v;
    }

    @WorkerThread
    public final void zzh(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zze, s);
        this.zze = s;
    }

    @WorkerThread
    public final long zzi() {
        this.zza.zzl().zzt();
        return this.zzan;
    }

    @WorkerThread
    public final void zzi(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzao != v;
        this.zzao = v;
    }

    @WorkerThread
    public final void zzi(String s) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzah != s;
        this.zzah = s;
    }

    @WorkerThread
    public final long zzj() {
        this.zza.zzl().zzt();
        return this.zzal;
    }

    @WorkerThread
    public final void zzj(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzaj != v;
        this.zzaj = v;
    }

    @WorkerThread
    public final void zzj(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzu, s);
        this.zzu = s;
    }

    @WorkerThread
    public final long zzk() {
        this.zza.zzl().zzt();
        return this.zzak;
    }

    @WorkerThread
    public final void zzk(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzn != v;
        this.zzn = v;
    }

    @WorkerThread
    public final void zzk(@Nullable String s) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzad != s;
        this.zzad = s;
    }

    @WorkerThread
    public final long zzl() {
        this.zza.zzl().zzt();
        return this.zzao;
    }

    @WorkerThread
    public final void zzl(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzs != v;
        this.zzs = v;
    }

    @WorkerThread
    public final long zzm() {
        this.zza.zzl().zzt();
        return this.zzaj;
    }

    @WorkerThread
    public final void zzm(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzas != v;
        this.zzas = v;
    }

    @WorkerThread
    public final long zzn() {
        this.zza.zzl().zzt();
        return this.zzn;
    }

    @WorkerThread
    public final void zzn(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzm != v;
        this.zzm = v;
    }

    @WorkerThread
    public final long zzo() {
        this.zza.zzl().zzt();
        return this.zzs;
    }

    @WorkerThread
    public final void zzo(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzag != v;
        this.zzag = v;
    }

    @WorkerThread
    public final long zzp() {
        this.zza.zzl().zzt();
        return this.zzas;
    }

    @WorkerThread
    public final void zzp(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzi != v;
        this.zzi = v;
    }

    @WorkerThread
    public final long zzq() {
        this.zza.zzl().zzt();
        return this.zzm;
    }

    @WorkerThread
    public final void zzq(long v) {
        boolean z = false;
        Preconditions.checkArgument(v >= 0L);
        this.zza.zzl().zzt();
        boolean z1 = this.zzaq;
        if(this.zzg != v) {
            z = true;
        }
        this.zzaq = z1 | z;
        this.zzg = v;
    }

    @WorkerThread
    public final long zzr() {
        this.zza.zzl().zzt();
        return this.zzag;
    }

    @WorkerThread
    public final void zzr(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzh != v;
        this.zzh = v;
    }

    @WorkerThread
    public final long zzs() {
        this.zza.zzl().zzt();
        return this.zzi;
    }

    @WorkerThread
    public final void zzs(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzx != v;
        this.zzx = v;
    }

    @WorkerThread
    public final long zzt() {
        this.zza.zzl().zzt();
        return this.zzg;
    }

    @WorkerThread
    public final void zzt(long v) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzw != v;
        this.zzw = v;
    }

    @WorkerThread
    public final long zzu() {
        this.zza.zzl().zzt();
        return this.zzh;
    }

    @WorkerThread
    public final long zzv() {
        this.zza.zzl().zzt();
        return this.zzx;
    }

    @WorkerThread
    public final long zzw() {
        this.zza.zzl().zzt();
        return this.zzw;
    }

    @Nullable
    @WorkerThread
    public final Boolean zzx() {
        this.zza.zzl().zzt();
        return this.zzr;
    }

    @Nullable
    @WorkerThread
    public final Long zzy() {
        this.zza.zzl().zzt();
        return this.zzaa;
    }

    @Nullable
    @WorkerThread
    public final Long zzz() {
        this.zza.zzl().zzt();
        return this.zzab;
    }
}

