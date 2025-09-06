package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzx extends zzgxr implements zzbbq.zzy {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final zzbbq.zzx zzc;
    private static volatile zzgzk zzd;
    private int zze;
    private int zzf;
    private zzgxz zzg;

    static {
        zzbbq.zzx zzbbq$zzx0 = new zzbbq.zzx();
        zzbbq.zzx.zzc = zzbbq$zzx0;
        zzgxr.zzbZ(zzbbq.zzx.class, zzbbq$zzx0);
    }

    private zzbbq.zzx() {
        this.zzg = zzgxr.zzbG();
    }

    private void zzD(Iterable iterable0) {
        this.zzH();
        zzgvs.zzaQ(iterable0, this.zzg);
    }

    private void zzE(int v) {
        this.zzH();
        this.zzg.zzi(v);
    }

    private void zzF() {
        this.zzg = zzgxr.zzbG();
    }

    private void zzG() {
        this.zze &= -2;
        this.zzf = 0;
    }

    private void zzH() {
        zzgxz zzgxz0 = this.zzg;
        if(!zzgxz0.zzc()) {
            this.zzg = zzgxr.zzbH(zzgxz0);
        }
    }

    private void zzI(int v, int v1) {
        this.zzH();
        this.zzg.zze(v, v1);
    }

    private void zzJ(zzbbq.zzq zzbbq$zzq0) {
        this.zzf = zzbbq$zzq0.zza();
        this.zze |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzy
    public int zza(int v) {
        return this.zzg.zzd(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzy
    public int zzb() {
        return this.zzg.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzy
    public zzbbq.zzq zzc() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzf);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    public static zzbbq.zzx.zza zzd() {
        return (zzbbq.zzx.zza)zzbbq.zzx.zzc.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzx.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzbbq.zzq.zze(), "zzg"});
            }
            case 3: {
                return new zzbbq.zzx();
            }
            case 4: {
                return new zzbbq.zzx.zza(null);
            }
            case 5: {
                return zzbbq.zzx.zzc;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzx.zzd;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzx.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzx.zzd;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzx.zzc);
                            zzbbq.zzx.zzd = zzgzk0;
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

    public static zzbbq.zzx.zza zzf(zzbbq.zzx zzbbq$zzx0) {
        return (zzbbq.zzx.zza)zzbbq.zzx.zzc.zzba(zzbbq$zzx0);
    }

    public static zzbbq.zzx zzh() {
        return zzbbq.zzx.zzc;
    }

    public static zzbbq.zzx zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzx)zzgxr.zzbk(zzbbq.zzx.zzc, inputStream0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzy
    public List zzj() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzy
    public boolean zzk() {
        return (this.zze & 1) != 0;
    }

    public static zzbbq.zzx zzl(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzx)zzgxr.zzbl(zzbbq.zzx.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzx zzm(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzx)zzgxr.zzbm(zzbbq.zzx.zzc, zzgwj0);
    }

    public static zzbbq.zzx zzn(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzx)zzgxr.zzbn(zzbbq.zzx.zzc, zzgwp0);
    }

    public static zzbbq.zzx zzo(InputStream inputStream0) throws IOException {
        return (zzbbq.zzx)zzgxr.zzbo(zzbbq.zzx.zzc, inputStream0);
    }

    public static zzbbq.zzx zzp(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzx)zzgxr.zzbp(zzbbq.zzx.zzc, byteBuffer0);
    }

    public static zzbbq.zzx zzq(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzx)zzgxr.zzbq(zzbbq.zzx.zzc, arr_b);
    }

    public static zzbbq.zzx zzr(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzx)zzgxr.zzbr(zzbbq.zzx.zzc, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzx zzs(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzx)zzgxr.zzbs(zzbbq.zzx.zzc, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzx zzt(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzx)zzgxr.zzbu(zzbbq.zzx.zzc, inputStream0, zzgxb0);
    }

    public static zzbbq.zzx zzu(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzx)zzgxr.zzbv(zzbbq.zzx.zzc, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzx zzv(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzx)zzgxr.zzbx(zzbbq.zzx.zzc, arr_b, zzgxb0);
    }

    public static zzgzk zzw() {
        return zzbbq.zzx.zzc.zzbN();
    }
}

