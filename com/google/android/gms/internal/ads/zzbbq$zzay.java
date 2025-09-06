package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzay extends zzgxr implements zzbbq.zzaz {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final zzbbq.zzay zze;
    private static volatile zzgzk zzf;
    private int zzg;
    private zzbbq.zzar zzh;
    private int zzi;
    private zzbbq.zzaw zzj;
    private zzbbq.zzap zzk;

    static {
        zzbbq.zzay zzbbq$zzay0 = new zzbbq.zzay();
        zzbbq.zzay.zze = zzbbq$zzay0;
        zzgxr.zzbZ(zzbbq.zzay.class, zzbbq$zzay0);
    }

    private zzbbq.zzay() {
        this.zzi = 1000;
    }

    private void zzL() {
        this.zzj = null;
        this.zzg &= -5;
    }

    private void zzM() {
        this.zzk = null;
        this.zzg &= -9;
    }

    private void zzN() {
        this.zzg &= -3;
        this.zzi = 1000;
    }

    private void zzO() {
        this.zzh = null;
        this.zzg &= -2;
    }

    private void zzP(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        zzbbq.zzaw zzbbq$zzaw1 = this.zzj;
        if(zzbbq$zzaw1 != null && zzbbq$zzaw1 != zzbbq.zzaw.zzg()) {
            zzbbq.zzaw.zza zzbbq$zzaw$zza0 = zzbbq.zzaw.zzb(zzbbq$zzaw1);
            zzbbq$zzaw$zza0.zzbj(zzbbq$zzaw0);
            zzbbq$zzaw0 = (zzbbq.zzaw)zzbbq$zzaw$zza0.zzbo();
        }
        this.zzj = zzbbq$zzaw0;
        this.zzg |= 4;
    }

    private void zzQ(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzk;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzk = zzbbq$zzap0;
        this.zzg |= 8;
    }

    private void zzR(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        zzbbq.zzar zzbbq$zzar1 = this.zzh;
        if(zzbbq$zzar1 != null && zzbbq$zzar1 != zzbbq.zzar.zzh()) {
            zzbbq.zzar.zza zzbbq$zzar$zza0 = zzbbq.zzar.zzf(zzbbq$zzar1);
            zzbbq$zzar$zza0.zzbj(zzbbq$zzar0);
            zzbbq$zzar0 = (zzbbq.zzar)zzbbq$zzar$zza0.zzbo();
        }
        this.zzh = zzbbq$zzar0;
        this.zzg |= 1;
    }

    private void zzS(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        this.zzj = zzbbq$zzaw0;
        this.zzg |= 4;
    }

    private void zzT(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzk = zzbbq$zzap0;
        this.zzg |= 8;
    }

    private void zzU(zzbbq.zzq zzbbq$zzq0) {
        this.zzi = zzbbq$zzq0.zza();
        this.zzg |= 2;
    }

    private void zzV(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        this.zzh = zzbbq$zzar0;
        this.zzg |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public zzbbq.zzq zza() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzi);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public zzbbq.zzap zzb() {
        return this.zzk == null ? zzbbq.zzap.zzi() : this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public zzbbq.zzar zzc() {
        return this.zzh == null ? zzbbq.zzar.zzh() : this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public zzbbq.zzaw zzd() {
        return this.zzj == null ? zzbbq.zzaw.zzg() : this.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzay.zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", zzbbq.zzq.zze(), "zzj", "zzk"});
            }
            case 3: {
                return new zzbbq.zzay();
            }
            case 4: {
                return new zzbbq.zzay.zza(null);
            }
            case 5: {
                return zzbbq.zzay.zze;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzay.zzf;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzay.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzay.zzf;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzay.zze);
                            zzbbq.zzay.zzf = zzgzk0;
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

    public static zzbbq.zzay.zza zzf() {
        return (zzbbq.zzay.zza)zzbbq.zzay.zze.zzaZ();
    }

    public static zzbbq.zzay.zza zzg(zzbbq.zzay zzbbq$zzay0) {
        return (zzbbq.zzay.zza)zzbbq.zzay.zze.zzba(zzbbq$zzay0);
    }

    public static zzbbq.zzay zzi() {
        return zzbbq.zzay.zze;
    }

    public static zzbbq.zzay zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzay)zzgxr.zzbk(zzbbq.zzay.zze, inputStream0);
    }

    public static zzbbq.zzay zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzay)zzgxr.zzbl(zzbbq.zzay.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzay zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzay)zzgxr.zzbm(zzbbq.zzay.zze, zzgwj0);
    }

    public static zzbbq.zzay zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzay)zzgxr.zzbn(zzbbq.zzay.zze, zzgwp0);
    }

    public static zzbbq.zzay zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzay)zzgxr.zzbo(zzbbq.zzay.zze, inputStream0);
    }

    public static zzbbq.zzay zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzay)zzgxr.zzbp(zzbbq.zzay.zze, byteBuffer0);
    }

    public static zzbbq.zzay zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzay)zzgxr.zzbq(zzbbq.zzay.zze, arr_b);
    }

    public static zzbbq.zzay zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzay)zzgxr.zzbr(zzbbq.zzay.zze, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzay zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzay)zzgxr.zzbs(zzbbq.zzay.zze, zzgwp0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public boolean zzs() {
        return (this.zzg & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public boolean zzt() {
        return (this.zzg & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public boolean zzu() {
        return (this.zzg & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaz
    public boolean zzv() {
        return (this.zzg & 1) != 0;
    }

    public static zzbbq.zzay zzw(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzay)zzgxr.zzbu(zzbbq.zzay.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzay zzx(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzay)zzgxr.zzbv(zzbbq.zzay.zze, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzay zzy(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzay)zzgxr.zzbx(zzbbq.zzay.zze, arr_b, zzgxb0);
    }

    public static zzgzk zzz() {
        return zzbbq.zzay.zze.zzbN();
    }
}

