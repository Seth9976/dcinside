package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzb.zza extends zzgxr implements zzbbq.zzb.zzb {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzb.zza zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private int zzg;
    private zzbbq.zzb.zze zzh;
    private zzbbq.zzb.zzg zzi;

    static {
        zzbbq.zzb.zza zzbbq$zzb$zza0 = new zzbbq.zzb.zza();
        zzbbq.zzb.zza.zzd = zzbbq$zzb$zza0;
        zzgxr.zzbZ(zzbbq.zzb.zza.class, zzbbq$zzb$zza0);
    }

    private void zzG() {
        this.zzf &= -2;
        this.zzg = 0;
    }

    private void zzH() {
        this.zzh = null;
        this.zzf &= -3;
    }

    private void zzI() {
        this.zzi = null;
        this.zzf &= -5;
    }

    private void zzJ(zzbbq.zzb.zze zzbbq$zzb$zze0) {
        zzbbq$zzb$zze0.getClass();
        zzbbq.zzb.zze zzbbq$zzb$zze1 = this.zzh;
        if(zzbbq$zzb$zze1 != null && zzbbq$zzb$zze1 != zzbbq.zzb.zze.zzi()) {
            zzbbq.zzb.zze.zza zzbbq$zzb$zze$zza0 = zzbbq.zzb.zze.zzc(zzbbq$zzb$zze1);
            zzbbq$zzb$zze$zza0.zzbj(zzbbq$zzb$zze0);
            zzbbq$zzb$zze0 = (zzbbq.zzb.zze)zzbbq$zzb$zze$zza0.zzbo();
        }
        this.zzh = zzbbq$zzb$zze0;
        this.zzf |= 2;
    }

    private void zzK(zzbbq.zzb.zzg zzbbq$zzb$zzg0) {
        zzbbq$zzb$zzg0.getClass();
        zzbbq.zzb.zzg zzbbq$zzb$zzg1 = this.zzi;
        if(zzbbq$zzb$zzg1 != null && zzbbq$zzb$zzg1 != zzbbq.zzb.zzg.zzf()) {
            zzbbq.zzb.zzg.zza zzbbq$zzb$zzg$zza0 = zzbbq.zzb.zzg.zzc(zzbbq$zzb$zzg1);
            zzbbq$zzb$zzg$zza0.zzbj(zzbbq$zzb$zzg0);
            zzbbq$zzb$zzg0 = (zzbbq.zzb.zzg)zzbbq$zzb$zzg$zza0.zzbo();
        }
        this.zzi = zzbbq$zzb$zzg0;
        this.zzf |= 4;
    }

    private void zzL(zzbbq.zzb.zzd zzbbq$zzb$zzd0) {
        this.zzg = zzbbq$zzb$zzd0.zza();
        this.zzf |= 1;
    }

    private void zzM(zzbbq.zzb.zze zzbbq$zzb$zze0) {
        zzbbq$zzb$zze0.getClass();
        this.zzh = zzbbq$zzb$zze0;
        this.zzf |= 2;
    }

    private void zzN(zzbbq.zzb.zzg zzbbq$zzb$zzg0) {
        zzbbq$zzb$zzg0.getClass();
        this.zzi = zzbbq$zzb$zzg0;
        this.zzf |= 4;
    }

    public static zzbbq.zzb.zza.zza zza() {
        return (zzbbq.zzb.zza.zza)zzbbq.zzb.zza.zzd.zzaZ();
    }

    public static zzbbq.zzb.zza.zza zzb(zzbbq.zzb.zza zzbbq$zzb$zza0) {
        return (zzbbq.zzb.zza.zza)zzbbq.zzb.zza.zzd.zzba(zzbbq$zzb$zza0);
    }

    public static zzbbq.zzb.zza zzd() {
        return zzbbq.zzb.zza.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzb.zza.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzbbq.zzb.zzd.zze(), "zzh", "zzi"});
            }
            case 3: {
                return new zzbbq.zzb.zza();
            }
            case 4: {
                return new zzbbq.zzb.zza.zza(null);
            }
            case 5: {
                return zzbbq.zzb.zza.zzd;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzbbq.zzb.zza.zze;
                if(zzgzk0 == null) {
                    synchronized(zzbbq.zzb.zza.class) {
                        zzgzk0 = zzbbq.zzb.zza.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzb.zza.zzd);
                            zzbbq.zzb.zza.zze = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    public static zzbbq.zzb.zza zzf(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb.zza)zzgxr.zzbk(zzbbq.zzb.zza.zzd, inputStream0);
    }

    public static zzbbq.zzb.zza zzg(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zza)zzgxr.zzbl(zzbbq.zzb.zza.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb.zza zzh(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzb.zza)zzgxr.zzbm(zzbbq.zzb.zza.zzd, zzgwj0);
    }

    public static zzbbq.zzb.zza zzi(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzb.zza)zzgxr.zzbn(zzbbq.zzb.zza.zzd, zzgwp0);
    }

    public static zzbbq.zzb.zza zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb.zza)zzgxr.zzbo(zzbbq.zzb.zza.zzd, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzb
    public zzbbq.zzb.zzd zzk() {
        zzbbq.zzb.zzd zzbbq$zzb$zzd0 = zzbbq.zzb.zzd.zzb(this.zzg);
        return zzbbq$zzb$zzd0 == null ? zzbbq.zzb.zzd.zza : zzbbq$zzb$zzd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzb
    public zzbbq.zzb.zze zzl() {
        return this.zzh == null ? zzbbq.zzb.zze.zzi() : this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzb
    public zzbbq.zzb.zzg zzm() {
        return this.zzi == null ? zzbbq.zzb.zzg.zzf() : this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzb
    public boolean zzn() {
        return (this.zzf & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzb
    public boolean zzo() {
        return (this.zzf & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzb$zzb
    public boolean zzp() {
        return (this.zzf & 4) != 0;
    }

    public static zzbbq.zzb.zza zzq(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzb.zza)zzgxr.zzbp(zzbbq.zzb.zza.zzd, byteBuffer0);
    }

    public static zzbbq.zzb.zza zzr(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzb.zza)zzgxr.zzbq(zzbbq.zzb.zza.zzd, arr_b);
    }

    public static zzbbq.zzb.zza zzs(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zza)zzgxr.zzbr(zzbbq.zzb.zza.zzd, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzb.zza zzt(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zza)zzgxr.zzbs(zzbbq.zzb.zza.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzb.zza zzu(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb.zza)zzgxr.zzbu(zzbbq.zzb.zza.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb.zza zzv(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zza)zzgxr.zzbv(zzbbq.zzb.zza.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzb.zza zzw(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb.zza)zzgxr.zzbx(zzbbq.zzb.zza.zzd, arr_b, zzgxb0);
    }

    public static zzgzk zzx() {
        return zzbbq.zzb.zza.zzd.zzbN();
    }
}

