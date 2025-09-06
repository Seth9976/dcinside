package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzap extends zzgxr implements zzbbq.zzaq {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzap zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbbq.zzap zzbbq$zzap0 = new zzbbq.zzap();
        zzbbq.zzap.zzc = zzbbq$zzap0;
        zzgxr.zzbZ(zzbbq.zzap.class, zzbbq$zzap0);
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaq
    public int zza() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaq
    public int zzb() {
        return this.zzf;
    }

    public static zzbbq.zzap.zza zzc() {
        return (zzbbq.zzap.zza)zzbbq.zzap.zzc.zzaZ();
    }

    public static zzbbq.zzap.zza zzd(zzbbq.zzap zzbbq$zzap0) {
        return (zzbbq.zzap.zza)zzbbq.zzap.zzc.zzba(zzbbq$zzap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzap.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbbq.zzap();
            }
            case 4: {
                return new zzbbq.zzap.zza(null);
            }
            case 5: {
                return zzbbq.zzap.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzap.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzap.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzap.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzap.zzc);
                            zzbbq.zzap.zzd = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaq
    public boolean zzg() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaq
    public boolean zzh() {
        return (this.zze & 1) != 0;
    }

    public static zzbbq.zzap zzi() {
        return zzbbq.zzap.zzc;
    }

    public static zzbbq.zzap zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzap)zzgxr.zzbk(zzbbq.zzap.zzc, inputStream0);
    }

    public static zzbbq.zzap zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzap)zzgxr.zzbl(zzbbq.zzap.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzap zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzap)zzgxr.zzbm(zzbbq.zzap.zzc, zzgwj0);
    }

    public static zzbbq.zzap zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzap)zzgxr.zzbn(zzbbq.zzap.zzc, zzgwp0);
    }

    public static zzbbq.zzap zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzap)zzgxr.zzbo(zzbbq.zzap.zzc, inputStream0);
    }

    public static zzbbq.zzap zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzap)zzgxr.zzbp(zzbbq.zzap.zzc, byteBuffer0);
    }

    public static zzbbq.zzap zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzap)zzgxr.zzbq(zzbbq.zzap.zzc, arr_b);
    }

    public static zzbbq.zzap zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzap)zzgxr.zzbr(zzbbq.zzap.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzap zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzap)zzgxr.zzbs(zzbbq.zzap.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzap zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzap)zzgxr.zzbu(zzbbq.zzap.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzap zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzap)zzgxr.zzbv(zzbbq.zzap.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzap zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzap)zzgxr.zzbx(zzbbq.zzap.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzap.zzc.zzbN();
    }
}

