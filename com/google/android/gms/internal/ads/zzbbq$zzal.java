package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzal extends zzgxr implements zzbbq.zzam {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzal zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbbq.zzal zzbbq$zzal0 = new zzbbq.zzal();
        zzbbq.zzal.zzc = zzbbq$zzal0;
        zzgxr.zzbZ(zzbbq.zzal.class, zzbbq$zzal0);
    }

    private void zzA() {
        this.zze &= -3;
        this.zzg = 0;
    }

    private void zzB() {
        this.zze &= -2;
        this.zzf = 0;
    }

    private void zzC(int v) {
        this.zze |= 2;
        this.zzg = v;
    }

    private void zzD(int v) {
        this.zze |= 1;
        this.zzf = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzam
    public int zza() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzam
    public int zzb() {
        return this.zzf;
    }

    public static zzbbq.zzal.zza zzc() {
        return (zzbbq.zzal.zza)zzbbq.zzal.zzc.zzaZ();
    }

    public static zzbbq.zzal.zza zzd(zzbbq.zzal zzbbq$zzal0) {
        return (zzbbq.zzal.zza)zzbbq.zzal.zzc.zzba(zzbbq$zzal0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzal.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbbq.zzal();
            }
            case 4: {
                return new zzbbq.zzal.zza(null);
            }
            case 5: {
                return zzbbq.zzal.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzal.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzal.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzal.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzal.zzc);
                            zzbbq.zzal.zzd = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzam
    public boolean zzg() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzam
    public boolean zzh() {
        return (this.zze & 1) != 0;
    }

    public static zzbbq.zzal zzi() {
        return zzbbq.zzal.zzc;
    }

    public static zzbbq.zzal zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzal)zzgxr.zzbk(zzbbq.zzal.zzc, inputStream0);
    }

    public static zzbbq.zzal zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzal)zzgxr.zzbl(zzbbq.zzal.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzal zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzal)zzgxr.zzbm(zzbbq.zzal.zzc, zzgwj0);
    }

    public static zzbbq.zzal zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzal)zzgxr.zzbn(zzbbq.zzal.zzc, zzgwp0);
    }

    public static zzbbq.zzal zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzal)zzgxr.zzbo(zzbbq.zzal.zzc, inputStream0);
    }

    public static zzbbq.zzal zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzal)zzgxr.zzbp(zzbbq.zzal.zzc, byteBuffer0);
    }

    public static zzbbq.zzal zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzal)zzgxr.zzbq(zzbbq.zzal.zzc, arr_b);
    }

    public static zzbbq.zzal zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzal)zzgxr.zzbr(zzbbq.zzal.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzal zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzal)zzgxr.zzbs(zzbbq.zzal.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzal zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzal)zzgxr.zzbu(zzbbq.zzal.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzal zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzal)zzgxr.zzbv(zzbbq.zzal.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzal zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzal)zzgxr.zzbx(zzbbq.zzal.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzal.zzc.zzbN();
    }
}

