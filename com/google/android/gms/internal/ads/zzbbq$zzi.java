package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzi extends zzgxr implements zzbbq.zzj {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final zzbbq.zzi zzf;
    private static volatile zzgzk zzg;
    private int zzh;
    private String zzi;
    private zzgyd zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzbbq.zzi zzbbq$zzi0 = new zzbbq.zzi();
        zzbbq.zzi.zzf = zzbbq$zzi0;
        zzgxr.zzbZ(zzbbq.zzi.class, zzbbq$zzi0);
    }

    private zzbbq.zzi() {
        this.zzi = "";
        this.zzj = zzgxr.zzbK();
        this.zzk = 1000;
        this.zzl = 1000;
        this.zzm = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public boolean zzA() {
        return (this.zzh & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public boolean zzB() {
        return (this.zzh & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public boolean zzC() {
        return (this.zzh & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public boolean zzD() {
        return (this.zzh & 2) != 0;
    }

    public static zzgzk zzE() {
        return zzbbq.zzi.zzf.zzbN();
    }

    public List zzF() {
        return this.zzj;
    }

    private void zzV(Iterable iterable0) {
        this.zzad();
        zzgvs.zzaQ(iterable0, this.zzj);
    }

    private void zzW(zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzad();
        this.zzj.add(zzbbq$zzd0);
    }

    private void zzX(int v, zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzad();
        this.zzj.add(v, zzbbq$zzd0);
    }

    private void zzY() {
        this.zzh &= -9;
        this.zzm = 1000;
    }

    private void zzZ() {
        this.zzh &= -2;
        this.zzi = zzbbq.zzi.zzh().zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public int zza() {
        return this.zzj.size();
    }

    private void zzaa() {
        this.zzh &= -5;
        this.zzl = 1000;
    }

    private void zzab() {
        this.zzh &= -3;
        this.zzk = 1000;
    }

    private void zzac() {
        this.zzj = zzgxr.zzbK();
    }

    private void zzad() {
        zzgyd zzgyd0 = this.zzj;
        if(!zzgyd0.zzc()) {
            this.zzj = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzae(int v) {
        this.zzad();
        this.zzj.remove(v);
    }

    private void zzaf(zzbbq.zzq zzbbq$zzq0) {
        this.zzm = zzbbq$zzq0.zza();
        this.zzh |= 8;
    }

    private void zzag(String s) {
        s.getClass();
        this.zzh |= 1;
        this.zzi = s;
    }

    private void zzah(zzgwj zzgwj0) {
        this.zzi = zzgwj0.zzx();
        this.zzh |= 1;
    }

    private void zzai(zzbbq.zzq zzbbq$zzq0) {
        this.zzl = zzbbq$zzq0.zza();
        this.zzh |= 4;
    }

    private void zzaj(zzbbq.zzq zzbbq$zzq0) {
        this.zzk = zzbbq$zzq0.zza();
        this.zzh |= 2;
    }

    private void zzak(int v, zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzad();
        this.zzj.set(v, zzbbq$zzd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public zzbbq.zzd zzb(int v) {
        return (zzbbq.zzd)this.zzj.get(v);
    }

    public zzbbq.zze zzc(int v) {
        return (zzbbq.zze)this.zzj.get(v);
    }

    public static zzbbq.zzi.zza zzd() {
        return (zzbbq.zzi.zza)zzbbq.zzi.zzf.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzi.zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", zzbbq.zzd.class, "zzk", zzbbq.zzq.zze(), "zzl", zzbbq.zzq.zze(), "zzm", zzbbq.zzq.zze()});
            }
            case 3: {
                return new zzbbq.zzi();
            }
            case 4: {
                return new zzbbq.zzi.zza(null);
            }
            case 5: {
                return zzbbq.zzi.zzf;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzi.zzg;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzi.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzi.zzg;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzi.zzf);
                            zzbbq.zzi.zzg = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
            default: {
                throw null;
            }
        }
    }

    public static zzbbq.zzi.zza zzf(zzbbq.zzi zzbbq$zzi0) {
        return (zzbbq.zzi.zza)zzbbq.zzi.zzf.zzba(zzbbq$zzi0);
    }

    public static zzbbq.zzi zzh() {
        return zzbbq.zzi.zzf;
    }

    public static zzbbq.zzi zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzi)zzgxr.zzbk(zzbbq.zzi.zzf, inputStream0);
    }

    public static zzbbq.zzi zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzi)zzgxr.zzbl(zzbbq.zzi.zzf, inputStream0, zzgxb0);
    }

    public static zzbbq.zzi zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzi)zzgxr.zzbm(zzbbq.zzi.zzf, zzgwj0);
    }

    public static zzbbq.zzi zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzi)zzgxr.zzbn(zzbbq.zzi.zzf, zzgwp0);
    }

    public static zzbbq.zzi zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzi)zzgxr.zzbo(zzbbq.zzi.zzf, inputStream0);
    }

    public static zzbbq.zzi zzn(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzi)zzgxr.zzbp(zzbbq.zzi.zzf, byteBuffer0);
    }

    public static zzbbq.zzi zzo(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzi)zzgxr.zzbq(zzbbq.zzi.zzf, arr_b);
    }

    public static zzbbq.zzi zzp(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzi)zzgxr.zzbr(zzbbq.zzi.zzf, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzi zzq(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzi)zzgxr.zzbs(zzbbq.zzi.zzf, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzi zzr(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzi)zzgxr.zzbu(zzbbq.zzi.zzf, inputStream0, zzgxb0);
    }

    public static zzbbq.zzi zzs(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzi)zzgxr.zzbv(zzbbq.zzi.zzf, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzi zzt(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzi)zzgxr.zzbx(zzbbq.zzi.zzf, arr_b, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public zzbbq.zzq zzu() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzm);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public zzbbq.zzq zzv() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzl);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public zzbbq.zzq zzw() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzk);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public zzgwj zzx() {
        return zzgwj.zzw(this.zzi);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public String zzy() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzj
    public List zzz() {
        return this.zzj;
    }
}

