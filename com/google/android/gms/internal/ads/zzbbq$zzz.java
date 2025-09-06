package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzz extends zzgxr implements zzbbq.zzaa {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final zzbbq.zzz zze;
    private static volatile zzgzk zzf;
    private int zzg;
    private zzbbq.zzv zzh;
    private zzgyd zzi;
    private int zzj;
    private zzbbq.zzap zzk;

    static {
        zzbbq.zzz zzbbq$zzz0 = new zzbbq.zzz();
        zzbbq.zzz.zze = zzbbq$zzz0;
        zzgxr.zzbZ(zzbbq.zzz.class, zzbbq$zzz0);
    }

    private zzbbq.zzz() {
        this.zzi = zzgxr.zzbK();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public boolean zzA() {
        return (this.zzg & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public boolean zzB() {
        return (this.zzg & 2) != 0;
    }

    public List zzC() {
        return this.zzi;
    }

    private void zzR(Iterable iterable0) {
        this.zzY();
        zzgvs.zzaQ(iterable0, this.zzi);
    }

    private void zzS(zzbbq.zzan zzbbq$zzan0) {
        zzbbq$zzan0.getClass();
        this.zzY();
        this.zzi.add(zzbbq$zzan0);
    }

    private void zzT(int v, zzbbq.zzan zzbbq$zzan0) {
        zzbbq$zzan0.getClass();
        this.zzY();
        this.zzi.add(v, zzbbq$zzan0);
    }

    private void zzU() {
        this.zzh = null;
        this.zzg &= -2;
    }

    private void zzV() {
        this.zzk = null;
        this.zzg &= -5;
    }

    private void zzW() {
        this.zzg &= -3;
        this.zzj = 0;
    }

    private void zzX() {
        this.zzi = zzgxr.zzbK();
    }

    private void zzY() {
        zzgyd zzgyd0 = this.zzi;
        if(!zzgyd0.zzc()) {
            this.zzi = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzZ(zzbbq.zzv zzbbq$zzv0) {
        zzbbq$zzv0.getClass();
        zzbbq.zzv zzbbq$zzv1 = this.zzh;
        if(zzbbq$zzv1 != null && zzbbq$zzv1 != zzbbq.zzv.zzh()) {
            zzbbq.zzv.zza zzbbq$zzv$zza0 = zzbbq.zzv.zzf(zzbbq$zzv1);
            zzbbq$zzv$zza0.zzbj(zzbbq$zzv0);
            zzbbq$zzv0 = (zzbbq.zzv)zzbbq$zzv$zza0.zzbo();
        }
        this.zzh = zzbbq$zzv0;
        this.zzg |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public int zza() {
        return this.zzi.size();
    }

    private void zzaa(zzbbq.zzap zzbbq$zzap0) {
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

    private void zzab(int v) {
        this.zzY();
        this.zzi.remove(v);
    }

    private void zzac(zzbbq.zzv zzbbq$zzv0) {
        zzbbq$zzv0.getClass();
        this.zzh = zzbbq$zzv0;
        this.zzg |= 1;
    }

    private void zzad(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzk = zzbbq$zzap0;
        this.zzg |= 4;
    }

    private void zzae(zzbbq.zzq zzbbq$zzq0) {
        this.zzj = zzbbq$zzq0.zza();
        this.zzg |= 2;
    }

    private void zzaf(int v, zzbbq.zzan zzbbq$zzan0) {
        zzbbq$zzan0.getClass();
        this.zzY();
        this.zzi.set(v, zzbbq$zzan0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public zzbbq.zzq zzb() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzj);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public zzbbq.zzv zzc() {
        return this.zzh == null ? zzbbq.zzv.zzh() : this.zzh;
    }

    public static zzbbq.zzz.zza zzd() {
        return (zzbbq.zzz.zza)zzbbq.zzz.zze.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzz.zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001B\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzbbq.zzan.class, "zzj", zzbbq.zzq.zze(), "zzk"});
            }
            case 3: {
                return new zzbbq.zzz();
            }
            case 4: {
                return new zzbbq.zzz.zza(null);
            }
            case 5: {
                return zzbbq.zzz.zze;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzz.zzf;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzz.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzz.zzf;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzz.zze);
                            zzbbq.zzz.zzf = zzgzk0;
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

    public static zzbbq.zzz.zza zzf(zzbbq.zzz zzbbq$zzz0) {
        return (zzbbq.zzz.zza)zzbbq.zzz.zze.zzba(zzbbq$zzz0);
    }

    public static zzbbq.zzz zzh() {
        return zzbbq.zzz.zze;
    }

    public static zzbbq.zzz zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzz)zzgxr.zzbk(zzbbq.zzz.zze, inputStream0);
    }

    public static zzbbq.zzz zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzz)zzgxr.zzbl(zzbbq.zzz.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzz zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzz)zzgxr.zzbm(zzbbq.zzz.zze, zzgwj0);
    }

    public static zzbbq.zzz zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzz)zzgxr.zzbn(zzbbq.zzz.zze, zzgwp0);
    }

    public static zzbbq.zzz zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzz)zzgxr.zzbo(zzbbq.zzz.zze, inputStream0);
    }

    public static zzbbq.zzz zzn(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzz)zzgxr.zzbp(zzbbq.zzz.zze, byteBuffer0);
    }

    public static zzbbq.zzz zzo(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzz)zzgxr.zzbq(zzbbq.zzz.zze, arr_b);
    }

    public static zzbbq.zzz zzp(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzz)zzgxr.zzbr(zzbbq.zzz.zze, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzz zzq(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzz)zzgxr.zzbs(zzbbq.zzz.zze, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzz zzr(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzz)zzgxr.zzbu(zzbbq.zzz.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzz zzs(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzz)zzgxr.zzbv(zzbbq.zzz.zze, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzz zzt(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzz)zzgxr.zzbx(zzbbq.zzz.zze, arr_b, zzgxb0);
    }

    public zzbbq.zzao zzu(int v) {
        return (zzbbq.zzao)this.zzi.get(v);
    }

    public static zzgzk zzv() {
        return zzbbq.zzz.zze.zzbN();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public zzbbq.zzan zzw(int v) {
        return (zzbbq.zzan)this.zzi.get(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public zzbbq.zzap zzx() {
        return this.zzk == null ? zzbbq.zzap.zzi() : this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public List zzy() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaa
    public boolean zzz() {
        return (this.zzg & 1) != 0;
    }
}

