package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzb.zzg extends zzgxr implements zzbbq.zzb.zzh {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzb.zzg zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzbbq.zzb.zzg zzbbq$zzb$zzg0 = new zzbbq.zzb.zzg();
        zzbbq.zzb.zzg.zzd = zzbbq$zzb$zzg0;
        zzgxr.zzbZ(zzbbq.zzb.zzg.class, zzbbq$zzb$zzg0);
    }

    private void zzE() {
        this.zzf &= -2;
        this.zzg = false;
    }

    private void zzF() {
        this.zzf &= -3;
        this.zzh = false;
    }

    private void zzG() {
        this.zzf &= -5;
        this.zzi = 0;
    }

    private void zzH(boolean z) {
        this.zzf |= 1;
        this.zzg = z;
    }

    private void zzI(boolean z) {
        this.zzf |= 2;
        this.zzh = z;
    }

    private void zzJ(int v) {
        this.zzf |= 4;
        this.zzi = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzh
    public int zza() {
        return this.zzi;
    }

    public static zzbbq.zzb.zzg.zza zzb() {
        return (zzbbq.zzb.zzg.zza)zzbbq.zzb.zzg.zzd.zzaZ();
    }

    public static zzbbq.zzb.zzg.zza zzc(zzbbq.zzb.zzg zzbbq$zzb$zzg0) {
        return (zzbbq.zzb.zzg.zza)zzbbq.zzb.zzg.zzd.zzba(zzbbq$zzb$zzg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzb.zzg.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzbbq.zzb.zzg();
            }
            case 4: {
                return new zzbbq.zzb.zzg.zza(null);
            }
            case 5: {
                return zzbbq.zzb.zzg.zzd;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzb.zzg.zze;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzb.zzg.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzb.zzg.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzb.zzg.zzd);
                            zzbbq.zzb.zzg.zze = zzgzk0;
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

    public static zzbbq.zzb.zzg zzf() {
        return zzbbq.zzb.zzg.zzd;
    }

    public static zzbbq.zzb.zzg zzg(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb.zzg)zzgxr.zzbk(zzbbq.zzb.zzg.zzd, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzh
    public boolean zzh() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzh
    public boolean zzi() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzh
    public boolean zzj() {
        return (this.zzf & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzh
    public boolean zzk() {
        return (this.zzf & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzh
    public boolean zzl() {
        return (this.zzf & 4) != 0;
    }

    public static zzbbq.zzb.zzg zzm(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zzg)zzgxr.zzbl(zzbbq.zzb.zzg.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb.zzg zzn(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzb.zzg)zzgxr.zzbm(zzbbq.zzb.zzg.zzd, zzgwj0);
    }

    public static zzbbq.zzb.zzg zzo(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzb.zzg)zzgxr.zzbn(zzbbq.zzb.zzg.zzd, zzgwp0);
    }

    public static zzbbq.zzb.zzg zzp(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb.zzg)zzgxr.zzbo(zzbbq.zzb.zzg.zzd, inputStream0);
    }

    public static zzbbq.zzb.zzg zzq(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzb.zzg)zzgxr.zzbp(zzbbq.zzb.zzg.zzd, byteBuffer0);
    }

    public static zzbbq.zzb.zzg zzr(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzb.zzg)zzgxr.zzbq(zzbbq.zzb.zzg.zzd, arr_b);
    }

    public static zzbbq.zzb.zzg zzs(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zzg)zzgxr.zzbr(zzbbq.zzb.zzg.zzd, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzb.zzg zzt(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zzg)zzgxr.zzbs(zzbbq.zzb.zzg.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzb.zzg zzu(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zzg)zzgxr.zzbu(zzbbq.zzb.zzg.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb.zzg zzv(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zzg)zzgxr.zzbv(zzbbq.zzb.zzg.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzb.zzg zzw(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zzg)zzgxr.zzbx(zzbbq.zzb.zzg.zzd, arr_b, zzgxb0);
    }

    public static zzgzk zzx() {
        return zzbbq.zzb.zzg.zzd.zzbN();
    }
}

