package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzm extends zzgxr implements zzbbq.zzn {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final zzbbq.zzm zzi;
    private static volatile zzgzk zzj;
    private int zzk;
    private String zzl;
    private zzbbq.zzap zzm;
    private int zzn;
    private zzbbq.zzar zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;

    static {
        zzbbq.zzm zzbbq$zzm0 = new zzbbq.zzm();
        zzbbq.zzm.zzi = zzbbq$zzm0;
        zzgxr.zzbZ(zzbbq.zzm.class, zzbbq$zzm0);
    }

    private zzbbq.zzm() {
        this.zzl = "";
        this.zzu = 1000;
        this.zzv = 1000;
        this.zzw = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public zzbbq.zzap zzA() {
        return this.zzm == null ? zzbbq.zzap.zzi() : this.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public zzbbq.zzar zzB() {
        return this.zzo == null ? zzbbq.zzar.zzh() : this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public zzgwj zzC() {
        return zzgwj.zzw(this.zzl);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public String zzD() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzE() {
        return (this.zzk & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzF() {
        return (this.zzk & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzG() {
        return (this.zzk & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzH() {
        return (this.zzk & 0x80) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzI() {
        return (this.zzk & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzJ() {
        return (this.zzk & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzK() {
        return (this.zzk & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public boolean zzL() {
        return (this.zzk & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public int zza() {
        return this.zzp;
    }

    private void zzac() {
        this.zzk &= -2;
        this.zzl = "";
    }

    private void zzad() {
        this.zzk &= -33;
        this.zzu = 1000;
    }

    private void zzae() {
        this.zzk &= -65;
        this.zzv = 1000;
    }

    private void zzaf() {
        this.zzk &= 0xFFFFFF7F;
        this.zzw = 1000;
    }

    private void zzag() {
        this.zzm = null;
        this.zzk &= -3;
    }

    private void zzah() {
        this.zzk &= -17;
        this.zzp = 0;
    }

    private void zzai() {
        this.zzk &= -5;
        this.zzn = 0;
    }

    private void zzaj() {
        this.zzo = null;
        this.zzk &= -9;
    }

    private void zzak(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzm;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzm = zzbbq$zzap0;
        this.zzk |= 2;
    }

    private void zzal(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        zzbbq.zzar zzbbq$zzar1 = this.zzo;
        if(zzbbq$zzar1 != null && zzbbq$zzar1 != zzbbq.zzar.zzh()) {
            zzbbq.zzar.zza zzbbq$zzar$zza0 = zzbbq.zzar.zzf(zzbbq$zzar1);
            zzbbq$zzar$zza0.zzbj(zzbbq$zzar0);
            zzbbq$zzar0 = (zzbbq.zzar)zzbbq$zzar$zza0.zzbo();
        }
        this.zzo = zzbbq$zzar0;
        this.zzk |= 8;
    }

    private void zzam(String s) {
        s.getClass();
        this.zzk |= 1;
        this.zzl = s;
    }

    private void zzan(zzgwj zzgwj0) {
        this.zzl = zzgwj0.zzx();
        this.zzk |= 1;
    }

    private void zzao(zzbbq.zzq zzbbq$zzq0) {
        this.zzu = zzbbq$zzq0.zza();
        this.zzk |= 0x20;
    }

    private void zzap(zzbbq.zzq zzbbq$zzq0) {
        this.zzv = zzbbq$zzq0.zza();
        this.zzk |= 0x40;
    }

    private void zzaq(zzbbq.zzq zzbbq$zzq0) {
        this.zzw = zzbbq$zzq0.zza();
        this.zzk |= 0x80;
    }

    private void zzar(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzm = zzbbq$zzap0;
        this.zzk |= 2;
    }

    private void zzas(int v) {
        this.zzk |= 16;
        this.zzp = v;
    }

    private void zzat(int v) {
        this.zzk |= 4;
        this.zzn = v;
    }

    private void zzau(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        this.zzo = zzbbq$zzar0;
        this.zzk |= 8;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public int zzb() {
        return this.zzn;
    }

    public static zzbbq.zzm.zza zzc() {
        return (zzbbq.zzm.zza)zzbbq.zzm.zzi.zzaZ();
    }

    public static zzbbq.zzm.zza zzd(zzbbq.zzm zzbbq$zzm0) {
        return (zzbbq.zzm.zza)zzbbq.zzm.zzi.zzba(zzbbq$zzm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzm.zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzbbq.zzq.zze(), "zzv", zzbbq.zzq.zze(), "zzw", zzbbq.zzq.zze()});
            }
            case 3: {
                return new zzbbq.zzm();
            }
            case 4: {
                return new zzbbq.zzm.zza(null);
            }
            case 5: {
                return zzbbq.zzm.zzi;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzm.zzj;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzm.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzm.zzj;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzm.zzi);
                            zzbbq.zzm.zzj = zzgzk0;
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

    public static zzbbq.zzm zzg() {
        return zzbbq.zzm.zzi;
    }

    public static zzbbq.zzm zzh(InputStream inputStream0) throws IOException {
        return (zzbbq.zzm)zzgxr.zzbk(zzbbq.zzm.zzi, inputStream0);
    }

    public static zzbbq.zzm zzi(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzm)zzgxr.zzbl(zzbbq.zzm.zzi, inputStream0, zzgxb0);
    }

    public static zzbbq.zzm zzj(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzm)zzgxr.zzbm(zzbbq.zzm.zzi, zzgwj0);
    }

    public static zzbbq.zzm zzk(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzm)zzgxr.zzbn(zzbbq.zzm.zzi, zzgwp0);
    }

    public static zzbbq.zzm zzl(InputStream inputStream0) throws IOException {
        return (zzbbq.zzm)zzgxr.zzbo(zzbbq.zzm.zzi, inputStream0);
    }

    public static zzbbq.zzm zzm(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzm)zzgxr.zzbp(zzbbq.zzm.zzi, byteBuffer0);
    }

    public static zzbbq.zzm zzn(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzm)zzgxr.zzbq(zzbbq.zzm.zzi, arr_b);
    }

    public static zzbbq.zzm zzo(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzm)zzgxr.zzbr(zzbbq.zzm.zzi, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzm zzp(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzm)zzgxr.zzbs(zzbbq.zzm.zzi, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzm zzq(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzm)zzgxr.zzbu(zzbbq.zzm.zzi, inputStream0, zzgxb0);
    }

    public static zzbbq.zzm zzr(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzm)zzgxr.zzbv(zzbbq.zzm.zzi, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzm zzs(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzm)zzgxr.zzbx(zzbbq.zzm.zzi, arr_b, zzgxb0);
    }

    public static zzgzk zzt() {
        return zzbbq.zzm.zzi.zzbN();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public zzbbq.zzq zzx() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzu);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public zzbbq.zzq zzy() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzv);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzn
    public zzbbq.zzq zzz() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzw);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }
}

