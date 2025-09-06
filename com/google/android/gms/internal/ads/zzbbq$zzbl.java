package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzbl extends zzgxr implements zzbbq.zzbm {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzbl zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbbq.zzbl zzbbq$zzbl0 = new zzbbq.zzbl();
        zzbbq.zzbl.zzc = zzbbq$zzbl0;
        zzgxr.zzbZ(zzbbq.zzbl.class, zzbbq$zzbl0);
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbm
    public int zza() {
        return this.zzg;
    }

    public static zzbbq.zzbl.zza zzb() {
        return (zzbbq.zzbl.zza)zzbbq.zzbl.zzc.zzaZ();
    }

    public static zzbbq.zzbl.zza zzc(zzbbq.zzbl zzbbq$zzbl0) {
        return (zzbbq.zzbl.zza)zzbbq.zzbl.zzc.zzba(zzbbq$zzbl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzbl.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbbq.zzbl();
            }
            case 4: {
                return new zzbbq.zzbl.zza(null);
            }
            case 5: {
                return zzbbq.zzbl.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzbl.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzbl.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzbl.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzbl.zzc);
                            zzbbq.zzbl.zzd = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbm
    public boolean zzf() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbm
    public boolean zzg() {
        return (this.zze & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbm
    public boolean zzh() {
        return (this.zze & 2) != 0;
    }

    public static zzbbq.zzbl zzi() {
        return zzbbq.zzbl.zzc;
    }

    public static zzbbq.zzbl zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbl)zzgxr.zzbk(zzbbq.zzbl.zzc, inputStream0);
    }

    public static zzbbq.zzbl zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbl)zzgxr.zzbl(zzbbq.zzbl.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbl zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzbl)zzgxr.zzbm(zzbbq.zzbl.zzc, zzgwj0);
    }

    public static zzbbq.zzbl zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzbl)zzgxr.zzbn(zzbbq.zzbl.zzc, zzgwp0);
    }

    public static zzbbq.zzbl zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbl)zzgxr.zzbo(zzbbq.zzbl.zzc, inputStream0);
    }

    public static zzbbq.zzbl zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzbl)zzgxr.zzbp(zzbbq.zzbl.zzc, byteBuffer0);
    }

    public static zzbbq.zzbl zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzbl)zzgxr.zzbq(zzbbq.zzbl.zzc, arr_b);
    }

    public static zzbbq.zzbl zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbl)zzgxr.zzbr(zzbbq.zzbl.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzbl zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbl)zzgxr.zzbs(zzbbq.zzbl.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzbl zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbl)zzgxr.zzbu(zzbbq.zzbl.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbl zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbl)zzgxr.zzbv(zzbbq.zzbl.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzbl zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbl)zzgxr.zzbx(zzbbq.zzbl.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzbl.zzc.zzbN();
    }
}

