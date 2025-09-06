package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzan extends zzgxr implements zzbbq.zzao {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zzbbq.zzan zzd;
    private static volatile zzgzk zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private zzbbq.zzap zzi;

    static {
        zzbbq.zzan zzbbq$zzan0 = new zzbbq.zzan();
        zzbbq.zzan.zzd = zzbbq$zzan0;
        zzgxr.zzbZ(zzbbq.zzan.class, zzbbq$zzan0);
    }

    private zzbbq.zzan() {
        this.zzg = "";
    }

    private void zzH() {
        this.zzf &= -2;
        this.zzg = "";
    }

    private void zzI() {
        this.zzi = null;
        this.zzf &= -5;
    }

    private void zzJ() {
        this.zzf &= -3;
        this.zzh = 0;
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

    private void zzL(String s) {
        s.getClass();
        this.zzf |= 1;
        this.zzg = s;
    }

    private void zzM(zzgwj zzgwj0) {
        this.zzg = zzgwj0.zzx();
        this.zzf |= 1;
    }

    private void zzN(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzi = zzbbq$zzap0;
        this.zzf |= 4;
    }

    private void zzO(zzbbq.zzq zzbbq$zzq0) {
        this.zzh = zzbbq$zzq0.zza();
        this.zzf |= 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzao
    public zzbbq.zzq zza() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzh);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    public static zzbbq.zzan.zza zzb() {
        return (zzbbq.zzan.zza)zzbbq.zzan.zzd.zzaZ();
    }

    public static zzbbq.zzan.zza zzc(zzbbq.zzan zzbbq$zzan0) {
        return (zzbbq.zzan.zza)zzbbq.zzan.zzd.zzba(zzbbq$zzan0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzan.zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", zzbbq.zzq.zze(), "zzi"});
            }
            case 3: {
                return new zzbbq.zzan();
            }
            case 4: {
                return new zzbbq.zzan.zza(null);
            }
            case 5: {
                return zzbbq.zzan.zzd;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzbbq.zzan.zze;
                if(zzgzk0 == null) {
                    synchronized(zzbbq.zzan.class) {
                        zzgzk0 = zzbbq.zzan.zze;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzan.zzd);
                            zzbbq.zzan.zze = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    public static zzbbq.zzan zzf() {
        return zzbbq.zzan.zzd;
    }

    public static zzbbq.zzan zzg(InputStream inputStream0) throws IOException {
        return (zzbbq.zzan)zzgxr.zzbk(zzbbq.zzan.zzd, inputStream0);
    }

    public static zzbbq.zzan zzh(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzan)zzgxr.zzbl(zzbbq.zzan.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzan zzi(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzan)zzgxr.zzbm(zzbbq.zzan.zzd, zzgwj0);
    }

    public static zzbbq.zzan zzj(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzan)zzgxr.zzbn(zzbbq.zzan.zzd, zzgwp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzao
    public zzbbq.zzap zzk() {
        return this.zzi == null ? zzbbq.zzap.zzi() : this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzao
    public zzgwj zzl() {
        return zzgwj.zzw(this.zzg);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzao
    public String zzm() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzao
    public boolean zzn() {
        return (this.zzf & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzao
    public boolean zzo() {
        return (this.zzf & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzao
    public boolean zzp() {
        return (this.zzf & 2) != 0;
    }

    public static zzbbq.zzan zzq(InputStream inputStream0) throws IOException {
        return (zzbbq.zzan)zzgxr.zzbo(zzbbq.zzan.zzd, inputStream0);
    }

    public static zzbbq.zzan zzr(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzan)zzgxr.zzbp(zzbbq.zzan.zzd, byteBuffer0);
    }

    public static zzbbq.zzan zzs(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzan)zzgxr.zzbq(zzbbq.zzan.zzd, arr_b);
    }

    public static zzbbq.zzan zzt(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzan)zzgxr.zzbr(zzbbq.zzan.zzd, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzan zzu(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzan)zzgxr.zzbs(zzbbq.zzan.zzd, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzan zzv(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzan)zzgxr.zzbu(zzbbq.zzan.zzd, inputStream0, zzgxb0);
    }

    public static zzbbq.zzan zzw(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzan)zzgxr.zzbv(zzbbq.zzan.zzd, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzan zzx(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzan)zzgxr.zzbx(zzbbq.zzan.zzd, arr_b, zzgxb0);
    }

    public static zzgzk zzy() {
        return zzbbq.zzan.zzd.zzbN();
    }
}

