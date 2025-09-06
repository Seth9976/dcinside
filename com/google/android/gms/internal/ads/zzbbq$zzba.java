package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzba extends zzgxr implements zzbbq.zzbb {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final zzbbq.zzba zzf;
    private static volatile zzgzk zzg;
    private int zzh;
    private int zzi;
    private zzbbq.zzaw zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzbbq.zzba zzbbq$zzba0 = new zzbbq.zzba();
        zzbbq.zzba.zzf = zzbbq$zzba0;
        zzgxr.zzbZ(zzbbq.zzba.class, zzbbq$zzba0);
    }

    private zzbbq.zzba() {
        this.zzi = 1000;
    }

    public static zzgzk zzA() {
        return zzbbq.zzba.zzf.zzbN();
    }

    private void zzM() {
        this.zzj = null;
        this.zzh &= -3;
    }

    private void zzN() {
        this.zzh &= -2;
        this.zzi = 1000;
    }

    private void zzO() {
        this.zzh &= -17;
        this.zzm = 0;
    }

    private void zzP() {
        this.zzh &= -5;
        this.zzk = 0;
    }

    private void zzQ() {
        this.zzh &= -9;
        this.zzl = 0;
    }

    private void zzR(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        zzbbq.zzaw zzbbq$zzaw1 = this.zzj;
        if(zzbbq$zzaw1 != null && zzbbq$zzaw1 != zzbbq.zzaw.zzg()) {
            zzbbq.zzaw.zza zzbbq$zzaw$zza0 = zzbbq.zzaw.zzb(zzbbq$zzaw1);
            zzbbq$zzaw$zza0.zzbj(zzbbq$zzaw0);
            zzbbq$zzaw0 = (zzbbq.zzaw)zzbbq$zzaw$zza0.zzbo();
        }
        this.zzj = zzbbq$zzaw0;
        this.zzh |= 2;
    }

    private void zzS(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        this.zzj = zzbbq$zzaw0;
        this.zzh |= 2;
    }

    private void zzT(zzbbq.zzq zzbbq$zzq0) {
        this.zzi = zzbbq$zzq0.zza();
        this.zzh |= 1;
    }

    private void zzU(int v) {
        this.zzh |= 16;
        this.zzm = v;
    }

    private void zzV(int v) {
        this.zzh |= 4;
        this.zzk = v;
    }

    private void zzW(int v) {
        this.zzh |= 8;
        this.zzl = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public int zza() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public int zzb() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public int zzc() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public zzbbq.zzq zzd() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzi);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzba.zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", zzbbq.zzq.zze(), "zzj", "zzk", "zzl", "zzm"});
            }
            case 3: {
                return new zzbbq.zzba();
            }
            case 4: {
                return new zzbbq.zzba.zza(null);
            }
            case 5: {
                return zzbbq.zzba.zzf;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzba.zzg;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzba.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzba.zzg;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzba.zzf);
                            zzbbq.zzba.zzg = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public zzbbq.zzaw zze() {
        return this.zzj == null ? zzbbq.zzaw.zzg() : this.zzj;
    }

    public static zzbbq.zzba.zza zzf() {
        return (zzbbq.zzba.zza)zzbbq.zzba.zzf.zzaZ();
    }

    public static zzbbq.zzba.zza zzg(zzbbq.zzba zzbbq$zzba0) {
        return (zzbbq.zzba.zza)zzbbq.zzba.zzf.zzba(zzbbq$zzba0);
    }

    public static zzbbq.zzba zzi() {
        return zzbbq.zzba.zzf;
    }

    public static zzbbq.zzba zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzba)zzgxr.zzbk(zzbbq.zzba.zzf, inputStream0);
    }

    public static zzbbq.zzba zzk(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzba)zzgxr.zzbl(zzbbq.zzba.zzf, inputStream0, zzgxb0);
    }

    public static zzbbq.zzba zzl(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzba)zzgxr.zzbm(zzbbq.zzba.zzf, zzgwj0);
    }

    public static zzbbq.zzba zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzba)zzgxr.zzbn(zzbbq.zzba.zzf, zzgwp0);
    }

    public static zzbbq.zzba zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzba)zzgxr.zzbo(zzbbq.zzba.zzf, inputStream0);
    }

    public static zzbbq.zzba zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzba)zzgxr.zzbp(zzbbq.zzba.zzf, byteBuffer0);
    }

    public static zzbbq.zzba zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzba)zzgxr.zzbq(zzbbq.zzba.zzf, arr_b);
    }

    public static zzbbq.zzba zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzba)zzgxr.zzbr(zzbbq.zzba.zzf, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public boolean zzr() {
        return (this.zzh & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public boolean zzs() {
        return (this.zzh & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public boolean zzt() {
        return (this.zzh & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public boolean zzu() {
        return (this.zzh & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbb
    public boolean zzv() {
        return (this.zzh & 8) != 0;
    }

    public static zzbbq.zzba zzw(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzba)zzgxr.zzbs(zzbbq.zzba.zzf, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzba zzx(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzba)zzgxr.zzbu(zzbbq.zzba.zzf, inputStream0, zzgxb0);
    }

    public static zzbbq.zzba zzy(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzba)zzgxr.zzbv(zzbbq.zzba.zzf, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzba zzz(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzba)zzgxr.zzbx(zzbbq.zzba.zzf, arr_b, zzgxb0);
    }
}

