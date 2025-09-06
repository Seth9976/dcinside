package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import h4.m;
import java.io.IOException;
import java.util.List;

public final class zznx implements zzlt {
    private final zzcx zza;
    private final zzbo zzb;
    private final zzbp zzc;
    private final zznw zzd;
    private final SparseArray zze;
    private zzdn zzf;
    private zzbk zzg;
    private zzdh zzh;
    private boolean zzi;

    public zznx(zzcx zzcx0) {
        zzcx0.getClass();
        this.zza = zzcx0;
        this.zzf = new zzdn(zzei.zzz(), zzcx0, new zzmy());
        zzbo zzbo0 = new zzbo();
        this.zzb = zzbo0;
        this.zzc = new zzbp();
        this.zzd = new zznw(zzbo0);
        this.zze = new SparseArray();
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzA(zzab zzab0, @Nullable zzht zzht0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 1009, new zznl(zzlu0, zzab0, zzht0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzB(long v) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 1010, new zzmo(zzlu0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzC(Exception exception0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3F6, new zznt(zzlu0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzD(zzpg zzpg0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x407, new zzni(zzlu0, zzpg0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzE(zzpg zzpg0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x408, new zzns(zzlu0, zzpg0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzF(int v, long v1, long v2) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3F3, new zzmk(zzlu0, v, v1, v2));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzG(int v, long v1) {
        zzlu zzlu0 = this.zzac();
        this.zzZ(zzlu0, 0x3FA, new zzmu(zzlu0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzH(Object object0, long v) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 26, new zznp(zzlu0, object0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzI(int v, int v1, boolean z) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x409, new zzmx(zzlu0, v, v1, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzJ(Exception exception0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 1030, new zzmj(zzlu0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzK(String s, long v, long v1) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3F8, new zznr(zzlu0, s, v1, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzL(String s) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3FB, new zzmt(zzlu0, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzM(zzhs zzhs0) {
        zzlu zzlu0 = this.zzac();
        this.zzZ(zzlu0, 1020, new zzng(zzlu0, zzhs0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzN(zzhs zzhs0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3F7, new zznn(zzlu0, zzhs0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzO(long v, int v1) {
        zzlu zzlu0 = this.zzac();
        this.zzZ(zzlu0, 0x3FD, new zzna(zzlu0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzP(zzab zzab0, @Nullable zzht zzht0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3F9, new zznh(zzlu0, zzab0, zzht0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    @CallSuper
    public final void zzQ() {
        zzdh zzdh0 = this.zzh;
        zzcw.zzb(zzdh0);
        zzdh0.zzh(() -> {
            zzlu zzlu0 = this.zzU();
            this.zzZ(zzlu0, 0x404, new zzly(zzlu0));
            this.zzf.zze();
        });
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    @CallSuper
    public final void zzR(zzlw zzlw0) {
        this.zzf.zzf(zzlw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    @CallSuper
    public final void zzS(zzbk zzbk0, Looper looper0) {
        zzcw.zzf(this.zzg == null || this.zzd.zzb.isEmpty());
        zzbk0.getClass();
        this.zzg = zzbk0;
        this.zzh = this.zza.zzd(looper0, null);
        this.zzf = this.zzf.zza(looper0, (zzlw zzlw0, zzx zzx0) -> zzlw0.zzi(zzbk0, new zzlv(zzx0, this.zze)));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzT(List list0, @Nullable zzug zzug0) {
        zzbk zzbk0 = this.zzg;
        zzbk0.getClass();
        this.zzd.zzh(list0, zzug0, zzbk0);
    }

    protected final zzlu zzU() {
        return this.zzaa(this.zzd.zzb());
    }

    @m({"player"})
    protected final zzlu zzV(zzbq zzbq0, int v, @Nullable zzug zzug0) {
        boolean z = true;
        zzug zzug1 = zzbq0.zzo() ? null : zzug0;
        long v1 = this.zza.zzb();
        if(!zzbq0.equals(this.zzg.zzn()) || v != this.zzg.zzd()) {
            z = false;
        }
        long v2 = 0L;
        if(zzug1 == null || !zzug1.zzb()) {
            if(z) {
                v2 = this.zzg.zzj();
            }
            else if(!zzbq0.zzo()) {
                zzbq0.zze(v, this.zzc, 0L);
                v2 = zzei.zzv(0L);
            }
        }
        else if(z && this.zzg.zzb() == zzug1.zzb && this.zzg.zzc() == zzug1.zzc) {
            v2 = this.zzg.zzk();
        }
        zzbq zzbq1 = this.zzg.zzn();
        int v3 = this.zzg.zzd();
        long v4 = this.zzg.zzk();
        long v5 = this.zzg.zzm();
        return new zzlu(v1, zzbq0, v, zzug1, v2, zzbq1, v3, this.zzd.zzb(), v4, v5);
    }

    // 检测为 Lambda 实现
    public static void zzW(zznx zznx0) [...]

    // 检测为 Lambda 实现
    final void zzX(zzbk zzbk0, zzlw zzlw0, zzx zzx0) [...]

    @Override  // com.google.android.gms.internal.ads.zzyi
    public final void zzY(int v, long v1, long v2) {
        zzlu zzlu0 = this.zzaa(this.zzd.zzc());
        this.zzZ(zzlu0, 1006, new zzmh(zzlu0, v, v1, v2));
    }

    protected final void zzZ(zzlu zzlu0, int v, zzdk zzdk0) {
        this.zze.put(v, zzlu0);
        zzdn zzdn0 = this.zzf;
        zzdn0.zzd(v, zzdk0);
        zzdn0.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zza(zzbg zzbg0) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 13, new zzmd(zzlu0, zzbg0));
    }

    private final zzlu zzaa(@Nullable zzug zzug0) {
        this.zzg.getClass();
        zzbq zzbq0 = zzug0 == null ? null : this.zzd.zza(zzug0);
        if(zzug0 != null && zzbq0 != null) {
            return this.zzV(zzbq0, zzbq0.zzn(zzug0.zza, this.zzb).zzc, zzug0);
        }
        int v = this.zzg.zzd();
        zzbq zzbq1 = this.zzg.zzn();
        if(v >= zzbq1.zzc()) {
            zzbq1 = zzbq.zza;
        }
        return this.zzV(zzbq1, v, null);
    }

    private final zzlu zzab(int v, @Nullable zzug zzug0) {
        zzbk zzbk0 = this.zzg;
        zzbk0.getClass();
        if(zzug0 != null) {
            return this.zzd.zza(zzug0) == null ? this.zzV(zzbq.zza, v, zzug0) : this.zzaa(zzug0);
        }
        zzbq zzbq0 = zzbk0.zzn();
        if(v >= zzbq0.zzc()) {
            zzbq0 = zzbq.zza;
        }
        return this.zzV(zzbq0, v, null);
    }

    private final zzlu zzac() {
        return this.zzaa(this.zzd.zzd());
    }

    private final zzlu zzad() {
        return this.zzaa(this.zzd.zze());
    }

    private final zzlu zzae(@Nullable zzbd zzbd0) {
        if(zzbd0 instanceof zzib) {
            zzug zzug0 = ((zzib)zzbd0).zzh;
            return zzug0 == null ? this.zzU() : this.zzaa(zzug0);
        }
        return this.zzU();
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int v, @Nullable zzug zzug0, zzuc zzuc0) {
        zzlu zzlu0 = this.zzab(v, zzug0);
        this.zzZ(zzlu0, 1004, new zzmz(zzlu0, zzuc0));
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzag(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        zzlu zzlu0 = this.zzab(v, zzug0);
        this.zzZ(zzlu0, 1002, new zznb(zzlu0, zztx0, zzuc0));
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzah(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        zzlu zzlu0 = this.zzab(v, zzug0);
        this.zzZ(zzlu0, 1001, new zznf(zzlu0, zztx0, zzuc0));
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzai(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
        zzlu zzlu0 = this.zzab(v, zzug0);
        this.zzZ(zzlu0, 1003, new zzml(zzlu0, zztx0, zzuc0, iOException0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int v, @Nullable zzug zzug0, zztx zztx0, zzuc zzuc0) {
        zzlu zzlu0 = this.zzab(v, zzug0);
        this.zzZ(zzlu0, 1000, new zzmc(zzlu0, zztx0, zzuc0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzb(boolean z) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 3, new zzma(zzlu0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzc(boolean z) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 7, new zzmp(zzlu0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzd(@Nullable zzar zzar0, int v) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 1, new zzmf(zzlu0, zzar0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zze(zzav zzav0) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 14, new zznu(zzlu0, zzav0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzf(boolean z, int v) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 5, new zzmw(zzlu0, z, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzg(zzbe zzbe0) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 12, new zzlx(zzlu0, zzbe0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzh(int v) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 4, new zzne(zzlu0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzi(int v) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 6, new zzms(zzlu0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzj(zzbd zzbd0) {
        zzlu zzlu0 = this.zzae(zzbd0);
        this.zzZ(zzlu0, 10, new zznc(zzlu0, zzbd0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzk(@Nullable zzbd zzbd0) {
        zzlu zzlu0 = this.zzae(zzbd0);
        this.zzZ(zzlu0, 10, new zzmv(zzlu0, zzbd0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzl(boolean z, int v) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, -1, new zzmn(zzlu0, z, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzm(zzbi zzbi0, zzbi zzbi1, int v) {
        if(v == 1) {
            this.zzi = false;
            v = 1;
        }
        zzbk zzbk0 = this.zzg;
        zzbk0.getClass();
        this.zzd.zzg(zzbk0);
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 11, new zznm(zzlu0, v, zzbi0, zzbi1));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzn(boolean z) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 23, new zzmg(zzlu0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzo(int v, int v1) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 24, new zznv(zzlu0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzp(zzbq zzbq0, int v) {
        zzbk zzbk0 = this.zzg;
        zzbk0.getClass();
        this.zzd.zzi(zzbk0);
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 0, new zzme(zzlu0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzq(zzby zzby0) {
        zzlu zzlu0 = this.zzU();
        this.zzZ(zzlu0, 2, new zzmq(zzlu0, zzby0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzr(zzcd zzcd0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 25, new zznj(zzlu0, zzcd0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbh
    public final void zzs(float f) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 22, new zzmi(zzlu0, f));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    @CallSuper
    public final void zzt(zzlw zzlw0) {
        this.zzf.zzb(zzlw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzu() {
        if(!this.zzi) {
            zzlu zzlu0 = this.zzU();
            this.zzi = true;
            this.zzZ(zzlu0, -1, new zznk(zzlu0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzv(Exception exception0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x405, new zznq(zzlu0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzw(String s, long v, long v1) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3F0, new zzmr(zzlu0, s, v1, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzx(String s) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 0x3F4, new zzmb(zzlu0, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzy(zzhs zzhs0) {
        zzlu zzlu0 = this.zzac();
        this.zzZ(zzlu0, 0x3F5, new zznd(zzlu0, zzhs0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlt
    public final void zzz(zzhs zzhs0) {
        zzlu zzlu0 = this.zzad();
        this.zzZ(zzlu0, 1007, new zzlz(zzlu0, zzhs0));
    }
}

