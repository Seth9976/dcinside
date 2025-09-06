package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzbe extends zzgxr implements zzbbq.zzbf {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final zzbbq.zzbe zzg;
    private static volatile zzgzk zzh;
    private int zzi;
    private int zzj;
    private zzbbq.zzaw zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        zzbbq.zzbe zzbbq$zzbe0 = new zzbbq.zzbe();
        zzbbq.zzbe.zzg = zzbbq$zzbe0;
        zzgxr.zzbZ(zzbbq.zzbe.class, zzbbq$zzbe0);
    }

    private zzbbq.zzbe() {
        this.zzj = 1000;
    }

    public static zzbbq.zzbe zzA(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbe)zzgxr.zzbv(zzbbq.zzbe.zzg, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzbe zzB(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbe)zzgxr.zzbx(zzbbq.zzbe.zzg, arr_b, zzgxb0);
    }

    public static zzgzk zzC() {
        return zzbbq.zzbe.zzg.zzbN();
    }

    private void zzQ() {
        this.zzi &= -33;
        this.zzo = 0L;
    }

    private void zzR() {
        this.zzk = null;
        this.zzi &= -3;
    }

    private void zzS() {
        this.zzi &= -2;
        this.zzj = 1000;
    }

    private void zzT() {
        this.zzi &= -17;
        this.zzn = 0;
    }

    private void zzU() {
        this.zzi &= -5;
        this.zzl = 0;
    }

    private void zzV() {
        this.zzi &= -9;
        this.zzm = 0;
    }

    private void zzW(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        zzbbq.zzaw zzbbq$zzaw1 = this.zzk;
        if(zzbbq$zzaw1 != null && zzbbq$zzaw1 != zzbbq.zzaw.zzg()) {
            zzbbq.zzaw.zza zzbbq$zzaw$zza0 = zzbbq.zzaw.zzb(zzbbq$zzaw1);
            zzbbq$zzaw$zza0.zzbj(zzbbq$zzaw0);
            zzbbq$zzaw0 = (zzbbq.zzaw)zzbbq$zzaw$zza0.zzbo();
        }
        this.zzk = zzbbq$zzaw0;
        this.zzi |= 2;
    }

    private void zzX(long v) {
        this.zzi |= 0x20;
        this.zzo = v;
    }

    private void zzY(zzbbq.zzaw zzbbq$zzaw0) {
        zzbbq$zzaw0.getClass();
        this.zzk = zzbbq$zzaw0;
        this.zzi |= 2;
    }

    private void zzZ(zzbbq.zzq zzbbq$zzq0) {
        this.zzj = zzbbq$zzq0.zza();
        this.zzi |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public int zza() {
        return this.zzn;
    }

    private void zzaa(int v) {
        this.zzi |= 16;
        this.zzn = v;
    }

    private void zzab(int v) {
        this.zzi |= 4;
        this.zzl = v;
    }

    private void zzac(int v) {
        this.zzi |= 8;
        this.zzm = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public int zzb() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public int zzc() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public long zzd() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzbe.zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", zzbbq.zzq.zze(), "zzk", "zzl", "zzm", "zzn", "zzo"});
            }
            case 3: {
                return new zzbbq.zzbe();
            }
            case 4: {
                return new zzbbq.zzbe.zza(null);
            }
            case 5: {
                return zzbbq.zzbe.zzg;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzbe.zzh;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzbe.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzbe.zzh;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzbe.zzg);
                            zzbbq.zzbe.zzh = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public zzbbq.zzq zze() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzj);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public zzbbq.zzaw zzf() {
        return this.zzk == null ? zzbbq.zzaw.zzg() : this.zzk;
    }

    public static zzbbq.zzbe.zza zzg() {
        return (zzbbq.zzbe.zza)zzbbq.zzbe.zzg.zzaZ();
    }

    public static zzbbq.zzbe.zza zzh(zzbbq.zzbe zzbbq$zzbe0) {
        return (zzbbq.zzbe.zza)zzbbq.zzbe.zzg.zzba(zzbbq$zzbe0);
    }

    public static zzbbq.zzbe zzj() {
        return zzbbq.zzbe.zzg;
    }

    public static zzbbq.zzbe zzk(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbe)zzgxr.zzbk(zzbbq.zzbe.zzg, inputStream0);
    }

    public static zzbbq.zzbe zzl(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbe)zzgxr.zzbl(zzbbq.zzbe.zzg, inputStream0, zzgxb0);
    }

    public static zzbbq.zzbe zzm(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzbe)zzgxr.zzbm(zzbbq.zzbe.zzg, zzgwj0);
    }

    public static zzbbq.zzbe zzn(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzbe)zzgxr.zzbn(zzbbq.zzbe.zzg, zzgwp0);
    }

    public static zzbbq.zzbe zzo(InputStream inputStream0) throws IOException {
        return (zzbbq.zzbe)zzgxr.zzbo(zzbbq.zzbe.zzg, inputStream0);
    }

    public static zzbbq.zzbe zzp(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzbe)zzgxr.zzbp(zzbbq.zzbe.zzg, byteBuffer0);
    }

    public static zzbbq.zzbe zzq(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzbe)zzgxr.zzbq(zzbbq.zzbe.zzg, arr_b);
    }

    public static zzbbq.zzbe zzr(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzbe)zzgxr.zzbr(zzbbq.zzbe.zzg, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzbe zzs(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbe)zzgxr.zzbs(zzbbq.zzbe.zzg, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzbe zzt(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzbe)zzgxr.zzbu(zzbbq.zzbe.zzg, inputStream0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public boolean zzu() {
        return (this.zzi & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public boolean zzv() {
        return (this.zzi & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public boolean zzw() {
        return (this.zzi & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public boolean zzx() {
        return (this.zzi & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public boolean zzy() {
        return (this.zzi & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbf
    public boolean zzz() {
        return (this.zzi & 8) != 0;
    }
}

