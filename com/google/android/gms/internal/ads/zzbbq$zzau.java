package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzau extends zzgxr implements zzbbq.zzav {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzau zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private int zzg;
    private zzbbq.zzaw zzh;
    private zzbbq.zzap zzi;

    static {
        zzbbq.zzau zzbbq$zzau0 = new zzbbq.zzau();
        zzbbq.zzau.zzd = zzbbq$zzau0;
        zzgxr.zzbZ(zzbbq.zzau.class, zzbbq$zzau0);
    }

    private zzbbq.zzau() {
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzav
    public zzbbq.zzq zza() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzg);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzav
    public zzbbq.zzap zzb() {
        return this.zzi == null ? zzbbq.zzap.zzi() : this.zzi;
    }

    public static zzbbq.zzau.zza zzc() {
        return (zzbbq.zzau.zza)zzbbq.zzau.zzd.zzaZ();
    }

    public static zzbbq.zzau.zza zzd(zzbbq.zzau zzbbq$zzau0) {
        return (zzbbq.zzau.zza)zzbbq.zzau.zzd.zzba(zzbbq$zzau0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzau.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzbbq.zzq.zze(), "zzh", "zzi"});
            }
            case 3: {
                return new zzbbq.zzau();
            }
            case 4: {
                return new zzbbq.zzau.zza(null);
            }
            case 5: {
                return zzbbq.zzau.zzd;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzbbq.zzau.zze;
                if(zzgzk0 == null) {
                    synchronized(zzbbq.zzau.class) {
                        zzgzk0 = zzbbq.zzau.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzau.zzd);
                            zzbbq.zzau.zze = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    public static zzbbq.zzau zzg() {
        return zzbbq.zzau.zzd;
    }

    public static zzbbq.zzau zzh(InputStream inputStream0) throws IOException {
        return (zzbbq.zzau)zzgxr.zzbk(zzbbq.zzau.zzd, inputStream0);
    }

    public static zzbbq.zzau zzi(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzau)zzgxr.zzbl(zzbbq.zzau.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzau zzj(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzau)zzgxr.zzbm(zzbbq.zzau.zzd, zzgwj0);
    }

    public static zzbbq.zzau zzk(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzau)zzgxr.zzbn(zzbbq.zzau.zzd, zzgwp0);
    }

    public static zzbbq.zzau zzl(InputStream inputStream0) throws IOException {
        return (zzbbq.zzau)zzgxr.zzbo(zzbbq.zzau.zzd, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzav
    public zzbbq.zzaw zzm() {
        return this.zzh == null ? zzbbq.zzaw.zzg() : this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzav
    public boolean zzn() {
        return (this.zzf & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzav
    public boolean zzo() {
        return (this.zzf & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzav
    public boolean zzp() {
        return (this.zzf & 1) != 0;
    }

    public static zzbbq.zzau zzq(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzau)zzgxr.zzbp(zzbbq.zzau.zzd, byteBuffer0);
    }

    public static zzbbq.zzau zzr(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzau)zzgxr.zzbq(zzbbq.zzau.zzd, arr_b);
    }

    public static zzbbq.zzau zzs(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzau)zzgxr.zzbr(zzbbq.zzau.zzd, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzau zzt(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzau)zzgxr.zzbs(zzbbq.zzau.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzau zzu(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzau)zzgxr.zzbu(zzbbq.zzau.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzau zzv(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzau)zzgxr.zzbv(zzbbq.zzau.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzau zzw(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzau)zzgxr.zzbx(zzbbq.zzau.zzd, arr_b, zzgxb0);
    }

    public static zzgzk zzx() {
        return zzbbq.zzau.zzd.zzbN();
    }
}

