package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzk extends zzgxr implements zzbbq.zzl {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final zzbbq.zzk zzg;
    private static volatile zzgzk zzh;
    private int zzi;
    private int zzj;
    private zzbbq.zzap zzk;
    private zzbbq.zzap zzl;
    private zzbbq.zzap zzm;
    private zzgyd zzn;
    private int zzo;

    static {
        zzbbq.zzk zzbbq$zzk0 = new zzbbq.zzk();
        zzbbq.zzk.zzg = zzbbq$zzk0;
        zzgxr.zzbZ(zzbbq.zzk.class, zzbbq$zzk0);
    }

    private zzbbq.zzk() {
        this.zzn = zzgxr.zzbK();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public zzbbq.zzap zzC() {
        return this.zzl == null ? zzbbq.zzap.zzi() : this.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public zzbbq.zzap zzD() {
        return this.zzk == null ? zzbbq.zzap.zzi() : this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public zzbbq.zzap zzE(int v) {
        return (zzbbq.zzap)this.zzn.get(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public zzbbq.zzap zzF() {
        return this.zzm == null ? zzbbq.zzap.zzi() : this.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public List zzG() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public boolean zzH() {
        return (this.zzi & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public boolean zzI() {
        return (this.zzi & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public boolean zzJ() {
        return (this.zzi & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public boolean zzK() {
        return (this.zzi & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public boolean zzL() {
        return (this.zzi & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public int zza() {
        return this.zzj;
    }

    private void zzaa(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzaj();
        this.zzn.add(zzbbq$zzap0);
    }

    private void zzab(int v, zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzaj();
        this.zzn.add(v, zzbbq$zzap0);
    }

    private void zzac(Iterable iterable0) {
        this.zzaj();
        zzgvs.zzaQ(iterable0, this.zzn);
    }

    private void zzad() {
        this.zzi &= -2;
        this.zzj = 0;
    }

    private void zzae() {
        this.zzl = null;
        this.zzi &= -5;
    }

    private void zzaf() {
        this.zzk = null;
        this.zzi &= -3;
    }

    private void zzag() {
        this.zzn = zzgxr.zzbK();
    }

    private void zzah() {
        this.zzm = null;
        this.zzi &= -9;
    }

    private void zzai() {
        this.zzi &= -17;
        this.zzo = 0;
    }

    private void zzaj() {
        zzgyd zzgyd0 = this.zzn;
        if(!zzgyd0.zzc()) {
            this.zzn = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzak(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzl;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzl = zzbbq$zzap0;
        this.zzi |= 4;
    }

    private void zzal(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzk;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzk = zzbbq$zzap0;
        this.zzi |= 2;
    }

    private void zzam(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzm;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzm = zzbbq$zzap0;
        this.zzi |= 8;
    }

    private void zzan(int v) {
        this.zzaj();
        this.zzn.remove(v);
    }

    private void zzao(int v) {
        this.zzi |= 1;
        this.zzj = v;
    }

    private void zzap(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzl = zzbbq$zzap0;
        this.zzi |= 4;
    }

    private void zzaq(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzk = zzbbq$zzap0;
        this.zzi |= 2;
    }

    private void zzar(int v, zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzaj();
        this.zzn.set(v, zzbbq$zzap0);
    }

    private void zzas(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzm = zzbbq$zzap0;
        this.zzi |= 8;
    }

    private void zzat(int v) {
        this.zzi |= 16;
        this.zzo = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public int zzb() {
        return this.zzn.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzl
    public int zzc() {
        return this.zzo;
    }

    public static zzbbq.zzk.zza zzd() {
        return (zzbbq.zzk.zza)zzbbq.zzk.zzg.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzk.zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001B\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzbbq.zzap.class, "zzo"});
            }
            case 3: {
                return new zzbbq.zzk();
            }
            case 4: {
                return new zzbbq.zzk.zza(null);
            }
            case 5: {
                return zzbbq.zzk.zzg;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzk.zzh;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzk.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzk.zzh;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzk.zzg);
                            zzbbq.zzk.zzh = zzgzk0;
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

    public static zzbbq.zzk.zza zzf(zzbbq.zzk zzbbq$zzk0) {
        return (zzbbq.zzk.zza)zzbbq.zzk.zzg.zzba(zzbbq$zzk0);
    }

    public static zzbbq.zzk zzh() {
        return zzbbq.zzk.zzg;
    }

    public static zzbbq.zzk zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zzk)zzgxr.zzbk(zzbbq.zzk.zzg, inputStream0);
    }

    public static zzbbq.zzk zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzk)zzgxr.zzbl(zzbbq.zzk.zzg, inputStream0, zzgxb0);
    }

    public static zzbbq.zzk zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzk)zzgxr.zzbm(zzbbq.zzk.zzg, zzgwj0);
    }

    public static zzbbq.zzk zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzk)zzgxr.zzbn(zzbbq.zzk.zzg, zzgwp0);
    }

    public static zzbbq.zzk zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzk)zzgxr.zzbo(zzbbq.zzk.zzg, inputStream0);
    }

    public static zzbbq.zzk zzn(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzk)zzgxr.zzbp(zzbbq.zzk.zzg, byteBuffer0);
    }

    public static zzbbq.zzk zzo(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzk)zzgxr.zzbq(zzbbq.zzk.zzg, arr_b);
    }

    public static zzbbq.zzk zzp(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzk)zzgxr.zzbr(zzbbq.zzk.zzg, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzk zzq(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzk)zzgxr.zzbs(zzbbq.zzk.zzg, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzk zzr(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzk)zzgxr.zzbu(zzbbq.zzk.zzg, inputStream0, zzgxb0);
    }

    public static zzbbq.zzk zzs(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzk)zzgxr.zzbv(zzbbq.zzk.zzg, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzk zzt(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzk)zzgxr.zzbx(zzbbq.zzk.zzg, arr_b, zzgxb0);
    }

    public zzbbq.zzaq zzu(int v) {
        return (zzbbq.zzaq)this.zzn.get(v);
    }

    public static zzgzk zzv() {
        return zzbbq.zzk.zzg.zzbN();
    }

    public List zzw() {
        return this.zzn;
    }
}

