package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzac extends zzgxr implements zzbbq.zzad {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzac zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private zzbbq.zzap zzg;

    static {
        zzbbq.zzac zzbbq$zzac0 = new zzbbq.zzac();
        zzbbq.zzac.zzc = zzbbq$zzac0;
        zzgxr.zzbZ(zzbbq.zzac.class, zzbbq$zzac0);
    }

    private void zzB() {
        this.zzg = null;
        this.zze &= -3;
    }

    private void zzC() {
        this.zze &= -2;
        this.zzf = 0;
    }

    private void zzD(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzg;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzg = zzbbq$zzap0;
        this.zze |= 2;
    }

    private void zzE(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzg = zzbbq$zzap0;
        this.zze |= 2;
    }

    private void zzF(zzbbq.zzq zzbbq$zzq0) {
        this.zzf = zzbbq$zzq0.zza();
        this.zze |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzad
    public zzbbq.zzq zza() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzf);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    public static zzbbq.zzac.zza zzb() {
        return (zzbbq.zzac.zza)zzbbq.zzac.zzc.zzaZ();
    }

    public static zzbbq.zzac.zza zzc(zzbbq.zzac zzbbq$zzac0) {
        return (zzbbq.zzac.zza)zzbbq.zzac.zzc.zzba(zzbbq$zzac0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzac.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbbq.zzq.zze(), "zzg"});
            }
            case 3: {
                return new zzbbq.zzac();
            }
            case 4: {
                return new zzbbq.zzac.zza(null);
            }
            case 5: {
                return zzbbq.zzac.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzac.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzac.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzac.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzac.zzc);
                            zzbbq.zzac.zzd = zzgzk0;
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

    public static zzbbq.zzac zzf() {
        return zzbbq.zzac.zzc;
    }

    public static zzbbq.zzac zzg(InputStream inputStream0) throws IOException {
        return (zzbbq.zzac)zzgxr.zzbk(zzbbq.zzac.zzc, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzad
    public zzbbq.zzap zzh() {
        return this.zzg == null ? zzbbq.zzap.zzi() : this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzad
    public boolean zzi() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzad
    public boolean zzj() {
        return (this.zze & 1) != 0;
    }

    public static zzbbq.zzac zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzac)zzgxr.zzbl(zzbbq.zzac.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzac zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzac)zzgxr.zzbm(zzbbq.zzac.zzc, zzgwj0);
    }

    public static zzbbq.zzac zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzac)zzgxr.zzbn(zzbbq.zzac.zzc, zzgwp0);
    }

    public static zzbbq.zzac zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzac)zzgxr.zzbo(zzbbq.zzac.zzc, inputStream0);
    }

    public static zzbbq.zzac zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzac)zzgxr.zzbp(zzbbq.zzac.zzc, byteBuffer0);
    }

    public static zzbbq.zzac zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzac)zzgxr.zzbq(zzbbq.zzac.zzc, arr_b);
    }

    public static zzbbq.zzac zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzac)zzgxr.zzbr(zzbbq.zzac.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzac zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzac)zzgxr.zzbs(zzbbq.zzac.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzac zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzac)zzgxr.zzbu(zzbbq.zzac.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzac zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzac)zzgxr.zzbv(zzbbq.zzac.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzac zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzac)zzgxr.zzbx(zzbbq.zzac.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzac.zzc.zzbN();
    }
}

