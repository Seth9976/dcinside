package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzb extends zzgxr implements zzbbq.zzc {
    public static final int zza = 1;
    private static final zzbbq.zzb zzb;
    private static volatile zzgzk zzc;
    private zzgyd zzd;

    static {
        zzbbq.zzb zzbbq$zzb0 = new zzbbq.zzb();
        zzbbq.zzb.zzb = zzbbq$zzb0;
        zzgxr.zzbZ(zzbbq.zzb.class, zzbbq$zzb0);
    }

    private zzbbq.zzb() {
        this.zzd = zzgxr.zzbK();
    }

    private void zzD(Iterable iterable0) {
        this.zzH();
        zzgvs.zzaQ(iterable0, this.zzd);
    }

    private void zzE(zzbbq.zzb.zza zzbbq$zzb$zza0) {
        zzbbq$zzb$zza0.getClass();
        this.zzH();
        this.zzd.add(zzbbq$zzb$zza0);
    }

    private void zzF(int v, zzbbq.zzb.zza zzbbq$zzb$zza0) {
        zzbbq$zzb$zza0.getClass();
        this.zzH();
        this.zzd.add(v, zzbbq$zzb$zza0);
    }

    private void zzG() {
        this.zzd = zzgxr.zzbK();
    }

    private void zzH() {
        zzgyd zzgyd0 = this.zzd;
        if(!zzgyd0.zzc()) {
            this.zzd = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzI(int v) {
        this.zzH();
        this.zzd.remove(v);
    }

    private void zzJ(int v, zzbbq.zzb.zza zzbbq$zzb$zza0) {
        zzbbq$zzb$zza0.getClass();
        this.zzH();
        this.zzd.set(v, zzbbq$zzb$zza0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzc
    public int zza() {
        return this.zzd.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzc
    public zzbbq.zzb.zza zzb(int v) {
        return (zzbbq.zzb.zza)this.zzd.get(v);
    }

    public zzbbq.zzb.zzb zzc(int v) {
        return (zzbbq.zzb.zzb)this.zzd.get(v);
    }

    public static zzbbq.zzb.zzc zzd() {
        return (zzbbq.zzb.zzc)zzbbq.zzb.zzb.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzb.zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzbbq.zzb.zza.class});
            }
            case 3: {
                return new zzbbq.zzb();
            }
            case 4: {
                return new zzbbq.zzb.zzc(null);
            }
            case 5: {
                return zzbbq.zzb.zzb;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzb.zzc;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzb.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzb.zzc;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzb.zzb);
                            zzbbq.zzb.zzc = zzgzk0;
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

    public static zzbbq.zzb.zzc zzf(zzbbq.zzb zzbbq$zzb0) {
        return (zzbbq.zzb.zzc)zzbbq.zzb.zzb.zzba(zzbbq$zzb0);
    }

    public static zzbbq.zzb zzh() {
        return zzbbq.zzb.zzb;
    }

    public static zzbbq.zzb zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb)zzgxr.zzbk(zzbbq.zzb.zzb, inputStream0);
    }

    public static zzbbq.zzb zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb)zzgxr.zzbl(zzbbq.zzb.zzb, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzb)zzgxr.zzbm(zzbbq.zzb.zzb, zzgwj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzc
    public List zzl() {
        return this.zzd;
    }

    public static zzbbq.zzb zzm(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzb)zzgxr.zzbn(zzbbq.zzb.zzb, zzgwp0);
    }

    public static zzbbq.zzb zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzb)zzgxr.zzbo(zzbbq.zzb.zzb, inputStream0);
    }

    public static zzbbq.zzb zzo(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzb)zzgxr.zzbp(zzbbq.zzb.zzb, byteBuffer0);
    }

    public static zzbbq.zzb zzp(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzb)zzgxr.zzbq(zzbbq.zzb.zzb, arr_b);
    }

    public static zzbbq.zzb zzq(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb)zzgxr.zzbr(zzbbq.zzb.zzb, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzb zzr(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb)zzgxr.zzbs(zzbbq.zzb.zzb, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzb zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzb)zzgxr.zzbu(zzbbq.zzb.zzb, inputStream0, zzgxb0);
    }

    public static zzbbq.zzb zzt(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb)zzgxr.zzbv(zzbbq.zzb.zzb, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzb zzu(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzb)zzgxr.zzbx(zzbbq.zzb.zzb, arr_b, zzgxb0);
    }

    public static zzgzk zzv() {
        return zzbbq.zzb.zzb.zzbN();
    }

    public List zzw() {
        return this.zzd;
    }
}

