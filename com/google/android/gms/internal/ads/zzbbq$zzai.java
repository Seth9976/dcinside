package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzai extends zzgxr implements zzbbq.zzaj {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzai zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbbq.zzai zzbbq$zzai0 = new zzbbq.zzai();
        zzbbq.zzai.zzc = zzbbq$zzai0;
        zzgxr.zzbZ(zzbbq.zzai.class, zzbbq$zzai0);
    }

    private void zzA() {
        this.zze &= -2;
        this.zzf = 0;
    }

    private void zzB() {
        this.zze &= -3;
        this.zzg = 0;
    }

    private void zzC(int v) {
        this.zze |= 1;
        this.zzf = v;
    }

    private void zzD(int v) {
        this.zze |= 2;
        this.zzg = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaj
    public int zza() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaj
    public int zzb() {
        return this.zzg;
    }

    public static zzbbq.zzai.zza zzc() {
        return (zzbbq.zzai.zza)zzbbq.zzai.zzc.zzaZ();
    }

    public static zzbbq.zzai.zza zzd(zzbbq.zzai zzbbq$zzai0) {
        return (zzbbq.zzai.zza)zzbbq.zzai.zzc.zzba(zzbbq$zzai0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzai.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzbbq.zzai();
            }
            case 4: {
                return new zzbbq.zzai.zza(null);
            }
            case 5: {
                return zzbbq.zzai.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzai.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzai.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzai.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzai.zzc);
                            zzbbq.zzai.zzd = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaj
    public boolean zzg() {
        return (this.zze & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaj
    public boolean zzh() {
        return (this.zze & 2) != 0;
    }

    public static zzbbq.zzai zzi() {
        return zzbbq.zzai.zzc;
    }

    public static zzbbq.zzai zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzai)zzgxr.zzbk(zzbbq.zzai.zzc, inputStream0);
    }

    public static zzbbq.zzai zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzai)zzgxr.zzbl(zzbbq.zzai.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzai zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzai)zzgxr.zzbm(zzbbq.zzai.zzc, zzgwj0);
    }

    public static zzbbq.zzai zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzai)zzgxr.zzbn(zzbbq.zzai.zzc, zzgwp0);
    }

    public static zzbbq.zzai zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzai)zzgxr.zzbo(zzbbq.zzai.zzc, inputStream0);
    }

    public static zzbbq.zzai zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzai)zzgxr.zzbp(zzbbq.zzai.zzc, byteBuffer0);
    }

    public static zzbbq.zzai zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzai)zzgxr.zzbq(zzbbq.zzai.zzc, arr_b);
    }

    public static zzbbq.zzai zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzai)zzgxr.zzbr(zzbbq.zzai.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzai zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzai)zzgxr.zzbs(zzbbq.zzai.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzai zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzai)zzgxr.zzbu(zzbbq.zzai.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzai zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzai)zzgxr.zzbv(zzbbq.zzai.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzai zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzai)zzgxr.zzbx(zzbbq.zzai.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzai.zzc.zzbN();
    }
}

