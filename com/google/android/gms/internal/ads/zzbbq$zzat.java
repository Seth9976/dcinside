package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzat extends zzgxr implements zzbbq.zzbi {
    private zzbbq.zzbj zzA;
    private zzbbq.zzau zzB;
    private zzbbq.zzbc zzC;
    private zzbbq.zzay zzD;
    private int zzE;
    private int zzF;
    private zzbbq.zzap zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final zzbbq.zzat zzu;
    private static volatile zzgzk zzv;
    private int zzw;
    private zzbbq.zzba zzx;
    private zzbbq.zzbe zzy;
    private zzbbq.zzbg zzz;

    static {
        zzbbq.zzat zzbbq$zzat0 = new zzbbq.zzat();
        zzbbq.zzat.zzu = zzbbq$zzat0;
        zzgxr.zzbZ(zzbbq.zzat.class, zzbbq$zzat0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public int zza() {
        return this.zzK;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzaA() {
        return (this.zzw & 0x8000) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzaB() {
        return (this.zzw & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzau zzaf() {
        return this.zzB == null ? zzbbq.zzau.zzg() : this.zzB;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzay zzag() {
        return this.zzD == null ? zzbbq.zzay.zzi() : this.zzD;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzba zzah() {
        return this.zzx == null ? zzbbq.zzba.zzi() : this.zzx;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzbc zzai() {
        return this.zzC == null ? zzbbq.zzbc.zzh() : this.zzC;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzbe zzaj() {
        return this.zzy == null ? zzbbq.zzbe.zzj() : this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzbg zzak() {
        return this.zzz == null ? zzbbq.zzbg.zzh() : this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzbj zzal() {
        return this.zzA == null ? zzbbq.zzbj.zzg() : this.zzA;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzam() {
        return (this.zzw & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzan() {
        return (this.zzw & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzao() {
        return (this.zzw & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzap() {
        return (this.zzw & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzaq() {
        return (this.zzw & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzar() {
        return (this.zzw & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzas() {
        return (this.zzw & 0x2000) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzat() {
        return (this.zzw & 0x4000) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzau() {
        return (this.zzw & 0x400) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzav() {
        return (this.zzw & 0x80) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzaw() {
        return (this.zzw & 0x100) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzax() {
        return (this.zzw & 0x800) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzay() {
        return (this.zzw & 0x1000) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public boolean zzaz() {
        return (this.zzw & 0x200) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public int zzb() {
        return this.zzL;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public int zzc() {
        return this.zzH;
    }

    private void zzcA(zzbbq.zzbg zzbbq$zzbg0) {
        zzbbq$zzbg0.getClass();
        zzbbq.zzbg zzbbq$zzbg1 = this.zzz;
        if(zzbbq$zzbg1 != null && zzbbq$zzbg1 != zzbbq.zzbg.zzh()) {
            zzbbq.zzbg.zza zzbbq$zzbg$zza0 = zzbbq.zzbg.zzf(zzbbq$zzbg1);
            zzbbq$zzbg$zza0.zzbj(zzbbq$zzbg0);
            zzbbq$zzbg0 = (zzbbq.zzbg)zzbbq$zzbg$zza0.zzbo();
        }
        this.zzz = zzbbq$zzbg0;
        this.zzw |= 4;
    }

    private void zzcB(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        zzbbq.zzap zzbbq$zzap1 = this.zzG;
        if(zzbbq$zzap1 != null && zzbbq$zzap1 != zzbbq.zzap.zzi()) {
            zzbbq.zzap.zza zzbbq$zzap$zza0 = zzbbq.zzap.zzd(zzbbq$zzap1);
            zzbbq$zzap$zza0.zzbj(zzbbq$zzap0);
            zzbbq$zzap0 = (zzbbq.zzap)zzbbq$zzap$zza0.zzbo();
        }
        this.zzG = zzbbq$zzap0;
        this.zzw |= 0x200;
    }

    private void zzcC(zzbbq.zzbj zzbbq$zzbj0) {
        zzbbq$zzbj0.getClass();
        zzbbq.zzbj zzbbq$zzbj1 = this.zzA;
        if(zzbbq$zzbj1 != null && zzbbq$zzbj1 != zzbbq.zzbj.zzg()) {
            zzbbq.zzbj.zza zzbbq$zzbj$zza0 = zzbbq.zzbj.zzd(zzbbq$zzbj1);
            zzbbq$zzbj$zza0.zzbj(zzbbq$zzbj0);
            zzbbq$zzbj0 = (zzbbq.zzbj)zzbbq$zzbj$zza0.zzbo();
        }
        this.zzA = zzbbq$zzbj0;
        this.zzw |= 8;
    }

    private void zzcD(zzbbq.zzau zzbbq$zzau0) {
        zzbbq$zzau0.getClass();
        this.zzB = zzbbq$zzau0;
        this.zzw |= 16;
    }

    private void zzcE(zzbbq.zzay zzbbq$zzay0) {
        zzbbq$zzay0.getClass();
        this.zzD = zzbbq$zzay0;
        this.zzw |= 0x40;
    }

    private void zzcF(zzbbq.zzba zzbbq$zzba0) {
        zzbbq$zzba0.getClass();
        this.zzx = zzbbq$zzba0;
        this.zzw |= 1;
    }

    private void zzcG(zzbbq.zzbc zzbbq$zzbc0) {
        zzbbq$zzbc0.getClass();
        this.zzC = zzbbq$zzbc0;
        this.zzw |= 0x20;
    }

    private void zzcH(zzbbq.zzbe zzbbq$zzbe0) {
        zzbbq$zzbe0.getClass();
        this.zzy = zzbbq$zzbe0;
        this.zzw |= 2;
    }

    private void zzcI(zzbbq.zzbg zzbbq$zzbg0) {
        zzbbq$zzbg0.getClass();
        this.zzz = zzbbq$zzbg0;
        this.zzw |= 4;
    }

    private void zzcJ(int v) {
        this.zzw |= 0x2000;
        this.zzK = v;
    }

    private void zzcK(int v) {
        this.zzw |= 0x4000;
        this.zzL = v;
    }

    private void zzcL(int v) {
        this.zzw |= 0x400;
        this.zzH = v;
    }

    private void zzcM(int v) {
        this.zzw |= 0x80;
        this.zzE = v;
    }

    private void zzcN(int v) {
        this.zzw |= 0x100;
        this.zzF = v;
    }

    private void zzcO(int v) {
        this.zzw |= 0x800;
        this.zzI = v;
    }

    private void zzcP(int v) {
        this.zzw |= 0x1000;
        this.zzJ = v;
    }

    private void zzcQ(zzbbq.zzap zzbbq$zzap0) {
        zzbbq$zzap0.getClass();
        this.zzG = zzbbq$zzap0;
        this.zzw |= 0x200;
    }

    private void zzcR(long v) {
        this.zzw |= 0x8000;
        this.zzM = v;
    }

    private void zzcS(zzbbq.zzbj zzbbq$zzbj0) {
        zzbbq$zzbj0.getClass();
        this.zzA = zzbbq$zzbj0;
        this.zzw |= 8;
    }

    private void zzcf() {
        this.zzB = null;
        this.zzw &= -17;
    }

    private void zzcg() {
        this.zzD = null;
        this.zzw &= -65;
    }

    private void zzch() {
        this.zzx = null;
        this.zzw &= -2;
    }

    private void zzci() {
        this.zzC = null;
        this.zzw &= -33;
    }

    private void zzcj() {
        this.zzy = null;
        this.zzw &= -3;
    }

    private void zzck() {
        this.zzz = null;
        this.zzw &= -5;
    }

    private void zzcl() {
        this.zzw &= 0xFFFFDFFF;
        this.zzK = 0;
    }

    private void zzcm() {
        this.zzw &= 0xFFFFBFFF;
        this.zzL = 0;
    }

    private void zzcn() {
        this.zzw &= 0xFFFFFBFF;
        this.zzH = 0;
    }

    private void zzco() {
        this.zzw &= 0xFFFFFF7F;
        this.zzE = 0;
    }

    private void zzcp() {
        this.zzw &= 0xFFFFFEFF;
        this.zzF = 0;
    }

    private void zzcq() {
        this.zzw &= 0xFFFFF7FF;
        this.zzI = 0;
    }

    private void zzcr() {
        this.zzw &= 0xFFFFEFFF;
        this.zzJ = 0;
    }

    private void zzcs() {
        this.zzG = null;
        this.zzw &= 0xFFFFFDFF;
    }

    private void zzct() {
        this.zzw &= 0xFFFF7FFF;
        this.zzM = 0L;
    }

    private void zzcu() {
        this.zzA = null;
        this.zzw &= -9;
    }

    private void zzcv(zzbbq.zzau zzbbq$zzau0) {
        zzbbq$zzau0.getClass();
        zzbbq.zzau zzbbq$zzau1 = this.zzB;
        if(zzbbq$zzau1 != null && zzbbq$zzau1 != zzbbq.zzau.zzg()) {
            zzbbq.zzau.zza zzbbq$zzau$zza0 = zzbbq.zzau.zzd(zzbbq$zzau1);
            zzbbq$zzau$zza0.zzbj(zzbbq$zzau0);
            zzbbq$zzau0 = (zzbbq.zzau)zzbbq$zzau$zza0.zzbo();
        }
        this.zzB = zzbbq$zzau0;
        this.zzw |= 16;
    }

    private void zzcw(zzbbq.zzay zzbbq$zzay0) {
        zzbbq$zzay0.getClass();
        zzbbq.zzay zzbbq$zzay1 = this.zzD;
        if(zzbbq$zzay1 != null && zzbbq$zzay1 != zzbbq.zzay.zzi()) {
            zzbbq.zzay.zza zzbbq$zzay$zza0 = zzbbq.zzay.zzg(zzbbq$zzay1);
            zzbbq$zzay$zza0.zzbj(zzbbq$zzay0);
            zzbbq$zzay0 = (zzbbq.zzay)zzbbq$zzay$zza0.zzbo();
        }
        this.zzD = zzbbq$zzay0;
        this.zzw |= 0x40;
    }

    private void zzcx(zzbbq.zzba zzbbq$zzba0) {
        zzbbq$zzba0.getClass();
        zzbbq.zzba zzbbq$zzba1 = this.zzx;
        if(zzbbq$zzba1 != null && zzbbq$zzba1 != zzbbq.zzba.zzi()) {
            zzbbq.zzba.zza zzbbq$zzba$zza0 = zzbbq.zzba.zzg(zzbbq$zzba1);
            zzbbq$zzba$zza0.zzbj(zzbbq$zzba0);
            zzbbq$zzba0 = (zzbbq.zzba)zzbbq$zzba$zza0.zzbo();
        }
        this.zzx = zzbbq$zzba0;
        this.zzw |= 1;
    }

    private void zzcy(zzbbq.zzbc zzbbq$zzbc0) {
        zzbbq$zzbc0.getClass();
        zzbbq.zzbc zzbbq$zzbc1 = this.zzC;
        if(zzbbq$zzbc1 != null && zzbbq$zzbc1 != zzbbq.zzbc.zzh()) {
            zzbbq.zzbc.zza zzbbq$zzbc$zza0 = zzbbq.zzbc.zzf(zzbbq$zzbc1);
            zzbbq$zzbc$zza0.zzbj(zzbbq$zzbc0);
            zzbbq$zzbc0 = (zzbbq.zzbc)zzbbq$zzbc$zza0.zzbo();
        }
        this.zzC = zzbbq$zzbc0;
        this.zzw |= 0x20;
    }

    private void zzcz(zzbbq.zzbe zzbbq$zzbe0) {
        zzbbq$zzbe0.getClass();
        zzbbq.zzbe zzbbq$zzbe1 = this.zzy;
        if(zzbbq$zzbe1 != null && zzbbq$zzbe1 != zzbbq.zzbe.zzj()) {
            zzbbq.zzbe.zza zzbbq$zzbe$zza0 = zzbbq.zzbe.zzh(zzbbq$zzbe1);
            zzbbq$zzbe$zza0.zzbj(zzbbq$zzbe0);
            zzbbq$zzbe0 = (zzbbq.zzbe)zzbbq$zzbe$zza0.zzbo();
        }
        this.zzy = zzbbq$zzbe0;
        this.zzw |= 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public int zzd() {
        return this.zzE;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzat.zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000Bဉ\u0006\fင\u0007\rင\b\u000Eဉ\t\u000Fင\n\u0010င\u000B\u0011င\f\u0012င\r\u0013င\u000E\u0014ဃ\u000F", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
            }
            case 3: {
                return new zzbbq.zzat();
            }
            case 4: {
                return new zzbbq.zzat.zza(null);
            }
            case 5: {
                return zzbbq.zzat.zzu;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzat.zzv;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzat.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzat.zzv;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzat.zzu);
                            zzbbq.zzat.zzv = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public int zze() {
        return this.zzF;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public int zzf() {
        return this.zzI;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public int zzg() {
        return this.zzJ;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public long zzh() {
        return this.zzM;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzbi
    public zzbbq.zzap zzi() {
        return this.zzG == null ? zzbbq.zzap.zzi() : this.zzG;
    }

    public static zzbbq.zzat.zza zzj() {
        return (zzbbq.zzat.zza)zzbbq.zzat.zzu.zzaZ();
    }

    public static zzbbq.zzat.zza zzk(zzbbq.zzat zzbbq$zzat0) {
        return (zzbbq.zzat.zza)zzbbq.zzat.zzu.zzba(zzbbq$zzat0);
    }

    public static zzbbq.zzat zzm() {
        return zzbbq.zzat.zzu;
    }

    public static zzbbq.zzat zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzat)zzgxr.zzbk(zzbbq.zzat.zzu, inputStream0);
    }

    public static zzbbq.zzat zzo(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzat)zzgxr.zzbl(zzbbq.zzat.zzu, inputStream0, zzgxb0);
    }

    public static zzbbq.zzat zzp(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzat)zzgxr.zzbm(zzbbq.zzat.zzu, zzgwj0);
    }

    public static zzbbq.zzat zzq(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzat)zzgxr.zzbn(zzbbq.zzat.zzu, zzgwp0);
    }

    public static zzbbq.zzat zzr(InputStream inputStream0) throws IOException {
        return (zzbbq.zzat)zzgxr.zzbo(zzbbq.zzat.zzu, inputStream0);
    }

    public static zzbbq.zzat zzs(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzat)zzgxr.zzbp(zzbbq.zzat.zzu, byteBuffer0);
    }

    public static zzbbq.zzat zzt(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzat)zzgxr.zzbq(zzbbq.zzat.zzu, arr_b);
    }

    public static zzbbq.zzat zzu(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzat)zzgxr.zzbr(zzbbq.zzat.zzu, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzat zzv(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzat)zzgxr.zzbs(zzbbq.zzat.zzu, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzat zzw(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzat)zzgxr.zzbu(zzbbq.zzat.zzu, inputStream0, zzgxb0);
    }

    public static zzbbq.zzat zzx(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzat)zzgxr.zzbv(zzbbq.zzat.zzu, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzat zzy(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzat)zzgxr.zzbx(zzbbq.zzat.zzu, arr_b, zzgxb0);
    }

    public static zzgzk zzz() {
        return zzbbq.zzat.zzu.zzbN();
    }
}

