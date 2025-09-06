package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzbg extends zzgxr implements zzbbq.zzbh {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzbg zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private int zzg;
    private zzbbq.zzaw zzh;
    private zzbbq.zzap zzi;

    static {
        zzbbq.zzbg zzbbq$zzbg0 = new zzbbq.zzbg();
        zzbbq.zzbg.zzd = zzbbq$zzbg0;
        zzgxr.zzbZ(zzbbq.zzbg.class, zzbbq$zzbg0);
    }

    private zzbbq.zzbg() {
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbh
    public zzbbq.zzq zza() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzg);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbh
    public zzbbq.zzap zzb() {
        return this.zzi == null ? zzbbq.zzap.zzi() : this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbh
    public zzbbq.zzaw zzc() {
        return this.zzh == null ? zzbbq.zzaw.zzg() : this.zzh;
    }

    public static zzbbq.zzbg.zza zzd() {
        return (zzbbq.zzbg.zza)zzbbq.zzbg.zzd.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzbg.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzbbq.zzq.zze(), "zzh", "zzi"});
            }
            case 3: {
                return new zzbbq.zzbg();
            }
            case 4: {
                return new zzbbq.zzbg.zza(null);
            }
            case 5: {
                return zzbbq.zzbg.zzd;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzbbq.zzbg.zze;
                if(zzgzk0 == null) {
                    synchronized(zzbbq.zzbg.class) {
                        zzgzk0 = zzbbq.zzbg.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzbg.zzd);
                            zzbbq.zzbg.zze = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    public static zzbbq.zzbg.zza zzf(zzbbq.zzbg zzbbq$zzbg0) {
        return (zzbbq.zzbg.zza)zzbbq.zzbg.zzd.zzba(zzbbq$zzbg0);
    }

    public static zzbbq.zzbg zzh() {
        return zzbbq.zzbg.zzd;
    }

    public static zzbbq.zzbg zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbg)zzgxr.zzbk(zzbbq.zzbg.zzd, inputStream0);
    }

    public static zzbbq.zzbg zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbg)zzgxr.zzbl(zzbbq.zzbg.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbg zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzbg)zzgxr.zzbm(zzbbq.zzbg.zzd, zzgwj0);
    }

    public static zzbbq.zzbg zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzbg)zzgxr.zzbn(zzbbq.zzbg.zzd, zzgwp0);
    }

    public static zzbbq.zzbg zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbg)zzgxr.zzbo(zzbbq.zzbg.zzd, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbh
    public boolean zzn() {
        return (this.zzf & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbh
    public boolean zzo() {
        return (this.zzf & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbh
    public boolean zzp() {
        return (this.zzf & 1) != 0;
    }

    public static zzbbq.zzbg zzq(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzbg)zzgxr.zzbp(zzbbq.zzbg.zzd, byteBuffer0);
    }

    public static zzbbq.zzbg zzr(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzbg)zzgxr.zzbq(zzbbq.zzbg.zzd, arr_b);
    }

    public static zzbbq.zzbg zzs(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbg)zzgxr.zzbr(zzbbq.zzbg.zzd, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzbg zzt(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbg)zzgxr.zzbs(zzbbq.zzbg.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzbg zzu(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbg)zzgxr.zzbu(zzbbq.zzbg.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbg zzv(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbg)zzgxr.zzbv(zzbbq.zzbg.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzbg zzw(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbg)zzgxr.zzbx(zzbbq.zzbg.zzd, arr_b, zzgxb0);
    }

    public static zzgzk zzx() {
        return zzbbq.zzbg.zzd.zzbN();
    }
}

