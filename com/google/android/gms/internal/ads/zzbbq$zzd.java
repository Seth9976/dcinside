package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzd extends zzgxr implements zzbbq.zze {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzd zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private zzbbq.zzal zzg;

    static {
        zzbbq.zzd zzbbq$zzd0 = new zzbbq.zzd();
        zzbbq.zzd.zzc = zzbbq$zzd0;
        zzgxr.zzbZ(zzbbq.zzd.class, zzbbq$zzd0);
    }

    private void zzB() {
        this.zzg = null;
        this.zze &= -3;
    }

    private void zzC() {
        this.zze &= -2;
        this.zzf = 0;
    }

    private void zzD(zzbbq.zzal zzbbq$zzal0) {
        zzbbq$zzal0.getClass();
        zzbbq.zzal zzbbq$zzal1 = this.zzg;
        if(zzbbq$zzal1 != null && zzbbq$zzal1 != zzbbq.zzal.zzi()) {
            zzbbq.zzal.zza zzbbq$zzal$zza0 = zzbbq.zzal.zzd(zzbbq$zzal1);
            zzbbq$zzal$zza0.zzbj(zzbbq$zzal0);
            zzbbq$zzal0 = (zzbbq.zzal)zzbbq$zzal$zza0.zzbo();
        }
        this.zzg = zzbbq$zzal0;
        this.zze |= 2;
    }

    private void zzE(zzbbq.zzal zzbbq$zzal0) {
        zzbbq$zzal0.getClass();
        this.zzg = zzbbq$zzal0;
        this.zze |= 2;
    }

    private void zzF(zzbbq.zzd.zza zzbbq$zzd$zza0) {
        this.zzf = zzbbq$zzd$zza0.zza();
        this.zze |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zze
    public zzbbq.zzd.zza zza() {
        zzbbq.zzd.zza zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb(this.zzf);
        return zzbbq$zzd$zza0 == null ? zzbbq.zzd.zza.zza : zzbbq$zzd$zza0;
    }

    public static zzbbq.zzd.zzb zzb() {
        return (zzbbq.zzd.zzb)zzbbq.zzd.zzc.zzaZ();
    }

    public static zzbbq.zzd.zzb zzc(zzbbq.zzd zzbbq$zzd0) {
        return (zzbbq.zzd.zzb)zzbbq.zzd.zzc.zzba(zzbbq$zzd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzd.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbbq.zzd.zza.zze(), "zzg"});
            }
            case 3: {
                return new zzbbq.zzd();
            }
            case 4: {
                return new zzbbq.zzd.zzb(null);
            }
            case 5: {
                return zzbbq.zzd.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzd.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzd.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzd.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzd.zzc);
                            zzbbq.zzd.zzd = zzgzk0;
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

    public static zzbbq.zzd zzf() {
        return zzbbq.zzd.zzc;
    }

    public static zzbbq.zzd zzg(InputStream inputStream0) throws IOException {
        return (zzbbq.zzd)zzgxr.zzbk(zzbbq.zzd.zzc, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zze
    public zzbbq.zzal zzh() {
        return this.zzg == null ? zzbbq.zzal.zzi() : this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zze
    public boolean zzi() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zze
    public boolean zzj() {
        return (this.zze & 1) != 0;
    }

    public static zzbbq.zzd zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzd)zzgxr.zzbl(zzbbq.zzd.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzd zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzd)zzgxr.zzbm(zzbbq.zzd.zzc, zzgwj0);
    }

    public static zzbbq.zzd zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzd)zzgxr.zzbn(zzbbq.zzd.zzc, zzgwp0);
    }

    public static zzbbq.zzd zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzd)zzgxr.zzbo(zzbbq.zzd.zzc, inputStream0);
    }

    public static zzbbq.zzd zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzd)zzgxr.zzbp(zzbbq.zzd.zzc, byteBuffer0);
    }

    public static zzbbq.zzd zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzd)zzgxr.zzbq(zzbbq.zzd.zzc, arr_b);
    }

    public static zzbbq.zzd zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzd)zzgxr.zzbr(zzbbq.zzd.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzd zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzd)zzgxr.zzbs(zzbbq.zzd.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzd zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzd)zzgxr.zzbu(zzbbq.zzd.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzd zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzd)zzgxr.zzbv(zzbbq.zzd.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzd zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzd)zzgxr.zzbx(zzbbq.zzd.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzd.zzc.zzbN();
    }
}

