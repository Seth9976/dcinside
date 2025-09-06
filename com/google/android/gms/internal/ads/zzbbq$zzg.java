package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzg extends zzgxr implements zzbbq.zzh {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzg zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private String zzg;
    private zzgyd zzh;
    private int zzi;

    static {
        zzbbq.zzg zzbbq$zzg0 = new zzbbq.zzg();
        zzbbq.zzg.zzd = zzbbq$zzg0;
        zzgxr.zzbZ(zzbbq.zzg.class, zzbbq$zzg0);
    }

    private zzbbq.zzg() {
        this.zzg = "";
        this.zzh = zzgxr.zzbK();
    }

    public static zzgzk zzA() {
        return zzbbq.zzg.zzd.zzbN();
    }

    public List zzB() {
        return this.zzh;
    }

    private void zzN(Iterable iterable0) {
        this.zzT();
        zzgvs.zzaQ(iterable0, this.zzh);
    }

    private void zzO(zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzT();
        this.zzh.add(zzbbq$zzd0);
    }

    private void zzP(int v, zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzT();
        this.zzh.add(v, zzbbq$zzd0);
    }

    private void zzQ() {
        this.zzf &= -2;
        this.zzg = zzbbq.zzg.zzh().zzs();
    }

    private void zzR() {
        this.zzf &= -3;
        this.zzi = 0;
    }

    private void zzS() {
        this.zzh = zzgxr.zzbK();
    }

    private void zzT() {
        zzgyd zzgyd0 = this.zzh;
        if(!zzgyd0.zzc()) {
            this.zzh = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzU(int v) {
        this.zzT();
        this.zzh.remove(v);
    }

    private void zzV(String s) {
        s.getClass();
        this.zzf |= 1;
        this.zzg = s;
    }

    private void zzW(zzgwj zzgwj0) {
        this.zzg = zzgwj0.zzx();
        this.zzf |= 1;
    }

    private void zzX(zzbbq.zzq zzbbq$zzq0) {
        this.zzi = zzbbq$zzq0.zza();
        this.zzf |= 2;
    }

    private void zzY(int v, zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzT();
        this.zzh.set(v, zzbbq$zzd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public int zza() {
        return this.zzh.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public zzbbq.zzd zzb(int v) {
        return (zzbbq.zzd)this.zzh.get(v);
    }

    public zzbbq.zze zzc(int v) {
        return (zzbbq.zze)this.zzh.get(v);
    }

    public static zzbbq.zzg.zza zzd() {
        return (zzbbq.zzg.zza)zzbbq.zzg.zzd.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzg.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", zzbbq.zzd.class, "zzi", zzbbq.zzq.zze()});
            }
            case 3: {
                return new zzbbq.zzg();
            }
            case 4: {
                return new zzbbq.zzg.zza(null);
            }
            case 5: {
                return zzbbq.zzg.zzd;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzg.zze;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzg.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzg.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzg.zzd);
                            zzbbq.zzg.zze = zzgzk0;
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

    public static zzbbq.zzg.zza zzf(zzbbq.zzg zzbbq$zzg0) {
        return (zzbbq.zzg.zza)zzbbq.zzg.zzd.zzba(zzbbq$zzg0);
    }

    public static zzbbq.zzg zzh() {
        return zzbbq.zzg.zzd;
    }

    public static zzbbq.zzg zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzg)zzgxr.zzbk(zzbbq.zzg.zzd, inputStream0);
    }

    public static zzbbq.zzg zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzg)zzgxr.zzbl(zzbbq.zzg.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzg zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzg)zzgxr.zzbm(zzbbq.zzg.zzd, zzgwj0);
    }

    public static zzbbq.zzg zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzg)zzgxr.zzbn(zzbbq.zzg.zzd, zzgwp0);
    }

    public static zzbbq.zzg zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzg)zzgxr.zzbo(zzbbq.zzg.zzd, inputStream0);
    }

    public static zzbbq.zzg zzn(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzg)zzgxr.zzbp(zzbbq.zzg.zzd, byteBuffer0);
    }

    public static zzbbq.zzg zzo(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzg)zzgxr.zzbq(zzbbq.zzg.zzd, arr_b);
    }

    public static zzbbq.zzg zzp(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzg)zzgxr.zzbr(zzbbq.zzg.zzd, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public zzbbq.zzq zzq() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzi);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public zzgwj zzr() {
        return zzgwj.zzw(this.zzg);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public String zzs() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public List zzt() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public boolean zzu() {
        return (this.zzf & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzh
    public boolean zzv() {
        return (this.zzf & 2) != 0;
    }

    public static zzbbq.zzg zzw(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzg)zzgxr.zzbs(zzbbq.zzg.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzg zzx(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzg)zzgxr.zzbu(zzbbq.zzg.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzg zzy(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzg)zzgxr.zzbv(zzbbq.zzg.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzg zzz(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzg)zzgxr.zzbx(zzbbq.zzg.zzd, arr_b, zzgxb0);
    }
}

