package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzbc extends zzgxr implements zzbbq.zzbd {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzbc zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private int zzg;
    private zzbbq.zzaw zzh;
    private zzbbq.zzap zzi;

    static {
        zzbbq.zzbc zzbbq$zzbc0 = new zzbbq.zzbc();
        zzbbq.zzbc.zzd = zzbbq$zzbc0;
        zzgxr.zzbZ(zzbbq.zzbc.class, zzbbq$zzbc0);
    }

    private zzbbq.zzbc() {
        this.zzg = 1000;
    }

    private void zzG() {
        this.zzh = null;
        this.zzf &= -3;
    }

    private void zzH() {
        this.zzi = null;
        this.zzf &= -5;
    }

    private void zzI() {
        this.zzf &= -2;
        this.zzg = 1000;
    }

    private void zzJ(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        zzbbq.zzaw zzbbq$zzaw1 = this.zzh;
        if(zzbbq$zzaw1 != null && zzbbq$zzaw1 != zzbbq.zzaw.zzg()) {
            zzbbq.zzaw.zza zzbbq$zzaw$zza0 = zzbbq.zzaw.zzb(zzbbq$zzaw1);
            zzbbq$zzaw$zza0.zzbj(zzbbq$zzaw0);
            zzbbq$zzaw0 = (zzbbq.zzaw)zzbbq$zzaw$zza0.zzbo();
        }
        this.zzh = zzbbq$zzaw0;
        this.zzf |= 2;
    }

    private void zzK(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzi;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzi = zzbbq$zzap0;
        this.zzf |= 4;
    }

    private void zzL(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        this.zzh = zzbbq$zzaw0;
        this.zzf |= 2;
    }

    private void zzM(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzi = zzbbq$zzap0;
        this.zzf |= 4;
    }

    private void zzN(zzbbq.zzq zzbbq$zzq0) {
        this.zzg = zzbbq$zzq0.zza();
        this.zzf |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbd
    public zzbbq.zzq zza() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzg);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbd
    public zzbbq.zzap zzb() {
        return this.zzi == null ? zzbbq.zzap.zzi() : this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbd
    public zzbbq.zzaw zzc() {
        return this.zzh == null ? zzbbq.zzaw.zzg() : this.zzh;
    }

    public static zzbbq.zzbc.zza zzd() {
        return (zzbbq.zzbc.zza)zzbbq.zzbc.zzd.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzbc.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzbbq.zzq.zze(), "zzh", "zzi"});
            }
            case 3: {
                return new zzbbq.zzbc();
            }
            case 4: {
                return new zzbbq.zzbc.zza(null);
            }
            case 5: {
                return zzbbq.zzbc.zzd;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzbbq.zzbc.zze;
                if(zzgzk0 == null) {
                    synchronized(zzbbq.zzbc.class) {
                        zzgzk0 = zzbbq.zzbc.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzbc.zzd);
                            zzbbq.zzbc.zze = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    public static zzbbq.zzbc.zza zzf(zzbbq.zzbc zzbbq$zzbc0) {
        return (zzbbq.zzbc.zza)zzbbq.zzbc.zzd.zzba(zzbbq$zzbc0);
    }

    public static zzbbq.zzbc zzh() {
        return zzbbq.zzbc.zzd;
    }

    public static zzbbq.zzbc zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbc)zzgxr.zzbk(zzbbq.zzbc.zzd, inputStream0);
    }

    public static zzbbq.zzbc zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbc)zzgxr.zzbl(zzbbq.zzbc.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbc zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzbc)zzgxr.zzbm(zzbbq.zzbc.zzd, zzgwj0);
    }

    public static zzbbq.zzbc zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzbc)zzgxr.zzbn(zzbbq.zzbc.zzd, zzgwp0);
    }

    public static zzbbq.zzbc zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbc)zzgxr.zzbo(zzbbq.zzbc.zzd, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbd
    public boolean zzn() {
        return (this.zzf & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbd
    public boolean zzo() {
        return (this.zzf & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbd
    public boolean zzp() {
        return (this.zzf & 1) != 0;
    }

    public static zzbbq.zzbc zzq(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzbc)zzgxr.zzbp(zzbbq.zzbc.zzd, byteBuffer0);
    }

    public static zzbbq.zzbc zzr(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzbc)zzgxr.zzbq(zzbbq.zzbc.zzd, arr_b);
    }

    public static zzbbq.zzbc zzs(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbc)zzgxr.zzbr(zzbbq.zzbc.zzd, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzbc zzt(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbc)zzgxr.zzbs(zzbbq.zzbc.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzbc zzu(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbc)zzgxr.zzbu(zzbbq.zzbc.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbc zzv(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbc)zzgxr.zzbv(zzbbq.zzbc.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzbc zzw(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbc)zzgxr.zzbx(zzbbq.zzbc.zzd, arr_b, zzgxb0);
    }

    public static zzgzk zzx() {
        return zzbbq.zzbc.zzd.zzbN();
    }
}

