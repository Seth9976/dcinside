package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzv extends zzgxr implements zzbbq.zzw {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final zzbbq.zzv zze;
    private static volatile zzgzk zzf;
    private int zzg;
    private String zzh;
    private int zzi;
    private zzgxz zzj;
    private zzbbq.zzap zzk;

    static {
        zzbbq.zzv zzbbq$zzv0 = new zzbbq.zzv();
        zzbbq.zzv.zze = zzbbq$zzv0;
        zzgxr.zzbZ(zzbbq.zzv.class, zzbbq$zzv0);
    }

    private zzbbq.zzv() {
        this.zzh = "";
        this.zzj = zzgxr.zzbG();
    }

    public static zzbbq.zzv zzA(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzv)zzgxr.zzbx(zzbbq.zzv.zze, arr_b, zzgxb0);
    }

    public static zzgzk zzB() {
        return zzbbq.zzv.zze.zzbN();
    }

    private void zzO(Iterable iterable0) {
        this.zzU();
        zzgvs.zzaQ(iterable0, this.zzj);
    }

    private void zzP(int v) {
        this.zzU();
        this.zzj.zzi(v);
    }

    private void zzQ() {
        this.zzg &= -2;
        this.zzh = zzbbq.zzv.zzh().zzs();
    }

    private void zzR() {
        this.zzk = null;
        this.zzg &= -5;
    }

    private void zzS() {
        this.zzg &= -3;
        this.zzi = 0;
    }

    private void zzT() {
        this.zzj = zzgxr.zzbG();
    }

    private void zzU() {
        zzgxz zzgxz0 = this.zzj;
        if(!zzgxz0.zzc()) {
            this.zzj = zzgxr.zzbH(zzgxz0);
        }
    }

    private void zzV(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzk;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzk = zzbbq$zzap0;
        this.zzg |= 4;
    }

    private void zzW(String s) {
        s.getClass();
        this.zzg |= 1;
        this.zzh = s;
    }

    private void zzX(zzgwj zzgwj0) {
        this.zzh = zzgwj0.zzx();
        this.zzg |= 1;
    }

    private void zzY(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzk = zzbbq$zzap0;
        this.zzg |= 4;
    }

    private void zzZ(zzbbq.zzq zzbbq$zzq0) {
        this.zzi = zzbbq$zzq0.zza();
        this.zzg |= 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public int zza(int v) {
        return this.zzj.zzd(v);
    }

    private void zzaa(int v, int v1) {
        this.zzU();
        this.zzj.zze(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public int zzb() {
        return this.zzj.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public zzbbq.zzq zzc() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzi);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    public static zzbbq.zzv.zza zzd() {
        return (zzbbq.zzv.zza)zzbbq.zzv.zze.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzv.zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzbbq.zzq.zze(), "zzj", "zzk"});
            }
            case 3: {
                return new zzbbq.zzv();
            }
            case 4: {
                return new zzbbq.zzv.zza(null);
            }
            case 5: {
                return zzbbq.zzv.zze;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzv.zzf;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzv.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzv.zzf;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzv.zze);
                            zzbbq.zzv.zzf = zzgzk0;
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

    public static zzbbq.zzv.zza zzf(zzbbq.zzv zzbbq$zzv0) {
        return (zzbbq.zzv.zza)zzbbq.zzv.zze.zzba(zzbbq$zzv0);
    }

    public static zzbbq.zzv zzh() {
        return zzbbq.zzv.zze;
    }

    public static zzbbq.zzv zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzv)zzgxr.zzbk(zzbbq.zzv.zze, inputStream0);
    }

    public static zzbbq.zzv zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzv)zzgxr.zzbl(zzbbq.zzv.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzv zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzv)zzgxr.zzbm(zzbbq.zzv.zze, zzgwj0);
    }

    public static zzbbq.zzv zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzv)zzgxr.zzbn(zzbbq.zzv.zze, zzgwp0);
    }

    public static zzbbq.zzv zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzv)zzgxr.zzbo(zzbbq.zzv.zze, inputStream0);
    }

    public static zzbbq.zzv zzn(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzv)zzgxr.zzbp(zzbbq.zzv.zze, byteBuffer0);
    }

    public static zzbbq.zzv zzo(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzv)zzgxr.zzbq(zzbbq.zzv.zze, arr_b);
    }

    public static zzbbq.zzv zzp(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzv)zzgxr.zzbr(zzbbq.zzv.zze, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public zzbbq.zzap zzq() {
        return this.zzk == null ? zzbbq.zzap.zzi() : this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public zzgwj zzr() {
        return zzgwj.zzw(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public String zzs() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public List zzt() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public boolean zzu() {
        return (this.zzg & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public boolean zzv() {
        return (this.zzg & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzw
    public boolean zzw() {
        return (this.zzg & 2) != 0;
    }

    public static zzbbq.zzv zzx(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzv)zzgxr.zzbs(zzbbq.zzv.zze, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzv zzy(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzv)zzgxr.zzbu(zzbbq.zzv.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzv zzz(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzv)zzgxr.zzbv(zzbbq.zzv.zze, byteBuffer0, zzgxb0);
    }
}

