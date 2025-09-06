package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzab extends zzgxr implements zzbbq.zzae {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzab zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbbq.zzab zzbbq$zzab0 = new zzbbq.zzab();
        zzbbq.zzab.zzc = zzbbq$zzab0;
        zzgxr.zzbZ(zzbbq.zzab.class, zzbbq$zzab0);
    }

    private void zzA() {
        this.zze &= -2;
        this.zzf = 0;
    }

    private void zzB(zzbbq.zzab.zzb zzbbq$zzab$zzb0) {
        this.zzg = zzbbq$zzab$zzb0.zza();
        this.zze |= 2;
    }

    private void zzC(zzbbq.zzab.zzc zzbbq$zzab$zzc0) {
        this.zzf = zzbbq$zzab$zzc0.zza();
        this.zze |= 1;
    }

    public static zzbbq.zzab.zza zza() {
        return (zzbbq.zzab.zza)zzbbq.zzab.zzc.zzaZ();
    }

    public static zzbbq.zzab.zza zzb(zzbbq.zzab zzbbq$zzab0) {
        return (zzbbq.zzab.zza)zzbbq.zzab.zzc.zzba(zzbbq$zzab0);
    }

    public static zzbbq.zzab zzd() {
        return zzbbq.zzab.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzab.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zzbbq.zzab.zzc.zze(), "zzg", zzbbq.zzab.zzb.zze()});
            }
            case 3: {
                return new zzbbq.zzab();
            }
            case 4: {
                return new zzbbq.zzab.zza(null);
            }
            case 5: {
                return zzbbq.zzab.zzc;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzbbq.zzab.zzd;
                if(zzgzk0 == null) {
                    synchronized(zzbbq.zzab.class) {
                        zzgzk0 = zzbbq.zzab.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzab.zzc);
                            zzbbq.zzab.zzd = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzae
    public zzbbq.zzab.zzb zze() {
        zzbbq.zzab.zzb zzbbq$zzab$zzb0 = zzbbq.zzab.zzb.zzb(this.zzg);
        return zzbbq$zzab$zzb0 == null ? zzbbq.zzab.zzb.zza : zzbbq$zzab$zzb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzae
    public zzbbq.zzab.zzc zzf() {
        zzbbq.zzab.zzc zzbbq$zzab$zzc0 = zzbbq.zzab.zzc.zzb(this.zzf);
        return zzbbq$zzab$zzc0 == null ? zzbbq.zzab.zzc.zza : zzbbq$zzab$zzc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzae
    public boolean zzg() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzae
    public boolean zzh() {
        return (this.zze & 1) != 0;
    }

    public static zzbbq.zzab zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzab)zzgxr.zzbk(zzbbq.zzab.zzc, inputStream0);
    }

    public static zzbbq.zzab zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzab)zzgxr.zzbl(zzbbq.zzab.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzab zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzab)zzgxr.zzbm(zzbbq.zzab.zzc, zzgwj0);
    }

    public static zzbbq.zzab zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzab)zzgxr.zzbn(zzbbq.zzab.zzc, zzgwp0);
    }

    public static zzbbq.zzab zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzab)zzgxr.zzbo(zzbbq.zzab.zzc, inputStream0);
    }

    public static zzbbq.zzab zzn(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzab)zzgxr.zzbp(zzbbq.zzab.zzc, byteBuffer0);
    }

    public static zzbbq.zzab zzo(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzab)zzgxr.zzbq(zzbbq.zzab.zzc, arr_b);
    }

    public static zzbbq.zzab zzp(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzab)zzgxr.zzbr(zzbbq.zzab.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzab zzq(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzab)zzgxr.zzbs(zzbbq.zzab.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzab zzr(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzab)zzgxr.zzbu(zzbbq.zzab.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzab zzs(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzab)zzgxr.zzbv(zzbbq.zzab.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzab zzt(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzab)zzgxr.zzbx(zzbbq.zzab.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzu() {
        return zzbbq.zzab.zzc.zzbN();
    }

    private void zzz() {
        this.zze &= -3;
        this.zzg = 0;
    }
}

