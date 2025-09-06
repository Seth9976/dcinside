package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzbj extends zzgxr implements zzbbq.zzbk {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzbj zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private zzbbq.zzaw zzg;

    static {
        zzbbq.zzbj zzbbq$zzbj0 = new zzbbq.zzbj();
        zzbbq.zzbj.zzc = zzbbq$zzbj0;
        zzgxr.zzbZ(zzbbq.zzbj.class, zzbbq$zzbj0);
    }

    private zzbbq.zzbj() {
        this.zzf = 1000;
    }

    private void zzB() {
        this.zzg = null;
        this.zze &= -3;
    }

    private void zzC() {
        this.zze &= -2;
        this.zzf = 1000;
    }

    private void zzD(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        zzbbq.zzaw zzbbq$zzaw1 = this.zzg;
        if(zzbbq$zzaw1 != null && zzbbq$zzaw1 != zzbbq.zzaw.zzg()) {
            zzbbq.zzaw.zza zzbbq$zzaw$zza0 = zzbbq.zzaw.zzb(zzbbq$zzaw1);
            zzbbq$zzaw$zza0.zzbj(zzbbq$zzaw0);
            zzbbq$zzaw0 = (zzbbq.zzaw)zzbbq$zzaw$zza0.zzbo();
        }
        this.zzg = zzbbq$zzaw0;
        this.zze |= 2;
    }

    private void zzE(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        this.zzg = zzbbq$zzaw0;
        this.zze |= 2;
    }

    private void zzF(zzbbq.zzq zzbbq$zzq0) {
        this.zzf = zzbbq$zzq0.zza();
        this.zze |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbk
    public zzbbq.zzq zza() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzf);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbk
    public zzbbq.zzaw zzb() {
        return this.zzg == null ? zzbbq.zzaw.zzg() : this.zzg;
    }

    public static zzbbq.zzbj.zza zzc() {
        return (zzbbq.zzbj.zza)zzbbq.zzbj.zzc.zzaZ();
    }

    public static zzbbq.zzbj.zza zzd(zzbbq.zzbj zzbbq$zzbj0) {
        return (zzbbq.zzbj.zza)zzbbq.zzbj.zzc.zzba(zzbbq$zzbj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzbj.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbbq.zzq.zze(), "zzg"});
            }
            case 3: {
                return new zzbbq.zzbj();
            }
            case 4: {
                return new zzbbq.zzbj.zza(null);
            }
            case 5: {
                return zzbbq.zzbj.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzbj.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzbj.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzbj.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzbj.zzc);
                            zzbbq.zzbj.zzd = zzgzk0;
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

    public static zzbbq.zzbj zzg() {
        return zzbbq.zzbj.zzc;
    }

    public static zzbbq.zzbj zzh(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbj)zzgxr.zzbk(zzbbq.zzbj.zzc, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbk
    public boolean zzi() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbk
    public boolean zzj() {
        return (this.zze & 1) != 0;
    }

    public static zzbbq.zzbj zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbj)zzgxr.zzbl(zzbbq.zzbj.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbj zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzbj)zzgxr.zzbm(zzbbq.zzbj.zzc, zzgwj0);
    }

    public static zzbbq.zzbj zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzbj)zzgxr.zzbn(zzbbq.zzbj.zzc, zzgwp0);
    }

    public static zzbbq.zzbj zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbj)zzgxr.zzbo(zzbbq.zzbj.zzc, inputStream0);
    }

    public static zzbbq.zzbj zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzbj)zzgxr.zzbp(zzbbq.zzbj.zzc, byteBuffer0);
    }

    public static zzbbq.zzbj zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzbj)zzgxr.zzbq(zzbbq.zzbj.zzc, arr_b);
    }

    public static zzbbq.zzbj zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbj)zzgxr.zzbr(zzbbq.zzbj.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzbj zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbj)zzgxr.zzbs(zzbbq.zzbj.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzbj zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbj)zzgxr.zzbu(zzbbq.zzbj.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbj zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbj)zzgxr.zzbv(zzbbq.zzbj.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzbj zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbj)zzgxr.zzbx(zzbbq.zzbj.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzbj.zzc.zzbN();
    }
}

