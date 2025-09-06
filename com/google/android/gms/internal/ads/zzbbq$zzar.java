package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzar extends zzgxr implements zzbbq.zzas {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzar zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzbbq.zzar zzbbq$zzar0 = new zzbbq.zzar();
        zzbbq.zzar.zzd = zzbbq$zzar0;
        zzgxr.zzbZ(zzbbq.zzar.class, zzbbq$zzar0);
    }

    private void zzE() {
        this.zzf &= -2;
        this.zzg = 0;
    }

    private void zzF() {
        this.zzf &= -5;
        this.zzi = 0;
    }

    private void zzG() {
        this.zzf &= -3;
        this.zzh = 0;
    }

    private void zzH(int v) {
        this.zzf |= 1;
        this.zzg = v;
    }

    private void zzI(int v) {
        this.zzf |= 4;
        this.zzi = v;
    }

    private void zzJ(int v) {
        this.zzf |= 2;
        this.zzh = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzas
    public int zza() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzas
    public int zzb() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzas
    public int zzc() {
        return this.zzh;
    }

    public static zzbbq.zzar.zza zzd() {
        return (zzbbq.zzar.zza)zzbbq.zzar.zzd.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzar.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzbbq.zzar();
            }
            case 4: {
                return new zzbbq.zzar.zza(null);
            }
            case 5: {
                return zzbbq.zzar.zzd;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzar.zze;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzar.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzar.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzar.zzd);
                            zzbbq.zzar.zze = zzgzk0;
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

    public static zzbbq.zzar.zza zzf(zzbbq.zzar zzbbq$zzar0) {
        return (zzbbq.zzar.zza)zzbbq.zzar.zzd.zzba(zzbbq$zzar0);
    }

    public static zzbbq.zzar zzh() {
        return zzbbq.zzar.zzd;
    }

    public static zzbbq.zzar zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzar)zzgxr.zzbk(zzbbq.zzar.zzd, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzas
    public boolean zzj() {
        return (this.zzf & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzas
    public boolean zzk() {
        return (this.zzf & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzas
    public boolean zzl() {
        return (this.zzf & 2) != 0;
    }

    public static zzbbq.zzar zzm(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzar)zzgxr.zzbl(zzbbq.zzar.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzar zzn(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzar)zzgxr.zzbm(zzbbq.zzar.zzd, zzgwj0);
    }

    public static zzbbq.zzar zzo(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzar)zzgxr.zzbn(zzbbq.zzar.zzd, zzgwp0);
    }

    public static zzbbq.zzar zzp(InputStream inputStream0) throws IOException {
        return (zzbbq.zzar)zzgxr.zzbo(zzbbq.zzar.zzd, inputStream0);
    }

    public static zzbbq.zzar zzq(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzar)zzgxr.zzbp(zzbbq.zzar.zzd, byteBuffer0);
    }

    public static zzbbq.zzar zzr(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzar)zzgxr.zzbq(zzbbq.zzar.zzd, arr_b);
    }

    public static zzbbq.zzar zzs(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzar)zzgxr.zzbr(zzbbq.zzar.zzd, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzar zzt(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzar)zzgxr.zzbs(zzbbq.zzar.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzar zzu(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzar)zzgxr.zzbu(zzbbq.zzar.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzar zzv(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzar)zzgxr.zzbv(zzbbq.zzar.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzar zzw(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzar)zzgxr.zzbx(zzbbq.zzar.zzd, arr_b, zzgxb0);
    }

    public static zzgzk zzx() {
        return zzbbq.zzar.zzd.zzbN();
    }
}

