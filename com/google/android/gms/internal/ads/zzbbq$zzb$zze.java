package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzb.zze extends zzgxr implements zzbbq.zzb.zzf {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzb.zze zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbbq.zzb.zze zzbbq$zzb$zze0 = new zzbbq.zzb.zze();
        zzbbq.zzb.zze.zzc = zzbbq$zzb$zze0;
        zzgxr.zzbZ(zzbbq.zzb.zze.class, zzbbq$zzb$zze0);
    }

    private void zzA() {
        this.zze &= -2;
        this.zzf = false;
    }

    private void zzB() {
        this.zze &= -3;
        this.zzg = 0;
    }

    private void zzC(boolean z) {
        this.zze |= 1;
        this.zzf = z;
    }

    private void zzD(int v) {
        this.zze |= 2;
        this.zzg = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzf
    public int zza() {
        return this.zzg;
    }

    public static zzbbq.zzb.zze.zza zzb() {
        return (zzbbq.zzb.zze.zza)zzbbq.zzb.zze.zzc.zzaZ();
    }

    public static zzbbq.zzb.zze.zza zzc(zzbbq.zzb.zze zzbbq$zzb$zze0) {
        return (zzbbq.zzb.zze.zza)zzbbq.zzb.zze.zzc.zzba(zzbbq$zzb$zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzb.zze.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbbq.zzb.zze();
            }
            case 4: {
                return new zzbbq.zzb.zze.zza(null);
            }
            case 5: {
                return zzbbq.zzb.zze.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzb.zze.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzb.zze.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzb.zze.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzb.zze.zzc);
                            zzbbq.zzb.zze.zzd = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzf
    public boolean zzf() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzf
    public boolean zzg() {
        return (this.zze & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzf
    public boolean zzh() {
        return (this.zze & 2) != 0;
    }

    public static zzbbq.zzb.zze zzi() {
        return zzbbq.zzb.zze.zzc;
    }

    public static zzbbq.zzb.zze zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb.zze)zzgxr.zzbk(zzbbq.zzb.zze.zzc, inputStream0);
    }

    public static zzbbq.zzb.zze zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zze)zzgxr.zzbl(zzbbq.zzb.zze.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb.zze zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzb.zze)zzgxr.zzbm(zzbbq.zzb.zze.zzc, zzgwj0);
    }

    public static zzbbq.zzb.zze zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzb.zze)zzgxr.zzbn(zzbbq.zzb.zze.zzc, zzgwp0);
    }

    public static zzbbq.zzb.zze zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb.zze)zzgxr.zzbo(zzbbq.zzb.zze.zzc, inputStream0);
    }

    public static zzbbq.zzb.zze zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzb.zze)zzgxr.zzbp(zzbbq.zzb.zze.zzc, byteBuffer0);
    }

    public static zzbbq.zzb.zze zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzb.zze)zzgxr.zzbq(zzbbq.zzb.zze.zzc, arr_b);
    }

    public static zzbbq.zzb.zze zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zze)zzgxr.zzbr(zzbbq.zzb.zze.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzb.zze zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zze)zzgxr.zzbs(zzbbq.zzb.zze.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzb.zze zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zze)zzgxr.zzbu(zzbbq.zzb.zze.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb.zze zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zze)zzgxr.zzbv(zzbbq.zzb.zze.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzb.zze zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zze)zzgxr.zzbx(zzbbq.zzb.zze.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzb.zze.zzc.zzbN();
    }
}

