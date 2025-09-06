package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzaw extends zzgxr implements zzbbq.zzax {
    public static final int zza = 1;
    private static final zzbbq.zzaw zzb;
    private static volatile zzgzk zzc;
    private int zzd;
    private int zze;

    static {
        zzbbq.zzaw zzbbq$zzaw0 = new zzbbq.zzaw();
        zzbbq.zzaw.zzb = zzbbq$zzaw0;
        zzgxr.zzbZ(zzbbq.zzaw.class, zzbbq$zzaw0);
    }

    public static zzbbq.zzaw.zza zza() {
        return (zzbbq.zzaw.zza)zzbbq.zzaw.zzb.zzaZ();
    }

    public static zzbbq.zzaw.zza zzb(zzbbq.zzaw zzbbq$zzaw0) {
        return (zzbbq.zzaw.zza)zzbbq.zzaw.zzb.zzba(zzbbq$zzaw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzax
    public zzbbq.zzaw.zzb zzc() {
        zzbbq.zzaw.zzb zzbbq$zzaw$zzb0 = zzbbq.zzaw.zzb.zzb(this.zze);
        return zzbbq$zzaw$zzb0 == null ? zzbbq.zzaw.zzb.zza : zzbbq$zzaw$zzb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzax
    public boolean zzd() {
        return (this.zzd & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzaw.zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzbbq.zzaw.zzb.zze()});
            }
            case 3: {
                return new zzbbq.zzaw();
            }
            case 4: {
                return new zzbbq.zzaw.zza(null);
            }
            case 5: {
                return zzbbq.zzaw.zzb;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzaw.zzc;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzaw.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzaw.zzc;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzaw.zzb);
                            zzbbq.zzaw.zzc = zzgzk0;
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

    public static zzbbq.zzaw zzg() {
        return zzbbq.zzaw.zzb;
    }

    public static zzbbq.zzaw zzh(InputStream inputStream0) throws IOException {
        return (zzbbq.zzaw)zzgxr.zzbk(zzbbq.zzaw.zzb, inputStream0);
    }

    public static zzbbq.zzaw zzi(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaw)zzgxr.zzbl(zzbbq.zzaw.zzb, inputStream0, zzgxb0);
    }

    public static zzbbq.zzaw zzj(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzaw)zzgxr.zzbm(zzbbq.zzaw.zzb, zzgwj0);
    }

    public static zzbbq.zzaw zzk(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzaw)zzgxr.zzbn(zzbbq.zzaw.zzb, zzgwp0);
    }

    public static zzbbq.zzaw zzl(InputStream inputStream0) throws IOException {
        return (zzbbq.zzaw)zzgxr.zzbo(zzbbq.zzaw.zzb, inputStream0);
    }

    public static zzbbq.zzaw zzm(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzaw)zzgxr.zzbp(zzbbq.zzaw.zzb, byteBuffer0);
    }

    public static zzbbq.zzaw zzn(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzaw)zzgxr.zzbq(zzbbq.zzaw.zzb, arr_b);
    }

    public static zzbbq.zzaw zzo(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaw)zzgxr.zzbr(zzbbq.zzaw.zzb, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzaw zzp(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaw)zzgxr.zzbs(zzbbq.zzaw.zzb, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzaw zzq(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaw)zzgxr.zzbu(zzbbq.zzaw.zzb, inputStream0, zzgxb0);
    }

    public static zzbbq.zzaw zzr(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaw)zzgxr.zzbv(zzbbq.zzaw.zzb, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzaw zzs(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaw)zzgxr.zzbx(zzbbq.zzaw.zzb, arr_b, zzgxb0);
    }

    public static zzgzk zzt() {
        return zzbbq.zzaw.zzb.zzbN();
    }

    private void zzw() {
        this.zzd &= -2;
        this.zze = 0;
    }

    private void zzx(zzbbq.zzaw.zzb zzbbq$zzaw$zzb0) {
        this.zze = zzbbq$zzaw$zzb0.zza();
        this.zzd |= 1;
    }
}

