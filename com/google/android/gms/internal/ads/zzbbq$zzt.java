package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzt extends zzgxr implements zzbbq.zzu {
    private zzbbq.zzm zzA;
    private zzbbq.zzo zzB;
    private zzbbq.zzab zzC;
    private zzbbq.zza zzD;
    private zzbbq.zzaf zzE;
    private zzbbq.zzbl zzF;
    private zzbbq.zzb zzG;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final zzbbq.zzt zzn;
    private static volatile zzgzk zzo;
    private int zzp;
    private int zzu;
    private String zzv;
    private int zzw;
    private int zzx;
    private zzbbq.zzar zzy;
    private zzgyc zzz;

    static {
        zzbbq.zzt zzbbq$zzt0 = new zzbbq.zzt();
        zzbbq.zzt.zzn = zzbbq$zzt0;
        zzgxr.zzbZ(zzbbq.zzt.class, zzbbq$zzt0);
    }

    private zzbbq.zzt() {
        this.zzv = "";
        this.zzx = 1000;
        this.zzz = zzgxr.zzbI();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public int zza() {
        return this.zzz.size();
    }

    private void zzaE(Iterable iterable0) {
        this.zzcn();
        zzgvs.zzaQ(iterable0, this.zzz);
    }

    private void zzaF(long v) {
        this.zzcn();
        this.zzz.zzg(v);
    }

    private void zzaG() {
        this.zzD = null;
        this.zzp &= 0xFFFFFEFF;
    }

    private void zzaH() {
        this.zzG = null;
        this.zzp &= 0xFFFFF7FF;
    }

    private void zzaI() {
        this.zzA = null;
        this.zzp &= -33;
    }

    private void zzaJ() {
        this.zzB = null;
        this.zzp &= -65;
    }

    private void zzaK() {
        this.zzp &= -3;
        this.zzv = zzbbq.zzt.zzm().zzah();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzab zzac() {
        return this.zzC == null ? zzbbq.zzab.zzd() : this.zzC;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzaf zzad() {
        return this.zzE == null ? zzbbq.zzaf.zzl() : this.zzE;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzar zzae() {
        return this.zzy == null ? zzbbq.zzar.zzh() : this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzbl zzaf() {
        return this.zzF == null ? zzbbq.zzbl.zzi() : this.zzF;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzgwj zzag() {
        return zzgwj.zzw(this.zzv);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public String zzah() {
        return this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public List zzai() {
        return this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzaj() {
        return (this.zzp & 0x100) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzak() {
        return (this.zzp & 0x800) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzal() {
        return (this.zzp & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzam() {
        return (this.zzp & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzan() {
        return (this.zzp & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzao() {
        return (this.zzp & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzap() {
        return (this.zzp & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzaq() {
        return (this.zzp & 0x80) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzar() {
        return (this.zzp & 0x200) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzas() {
        return (this.zzp & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzat() {
        return (this.zzp & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public boolean zzau() {
        return (this.zzp & 0x400) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public int zzb() {
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public int zzc() {
        return this.zzw;
    }

    private void zzcA(String s) {
        s.getClass();
        this.zzp |= 2;
        this.zzv = s;
    }

    private void zzcB(zzgwj zzgwj0) {
        this.zzv = zzgwj0.zzx();
        this.zzp |= 2;
    }

    private void zzcC(int v, long v1) {
        this.zzcn();
        this.zzz.zzd(v, v1);
    }

    private void zzcD(zzbbq.zzq zzbbq$zzq0) {
        this.zzx = zzbbq$zzq0.zza();
        this.zzp |= 8;
    }

    private void zzcE(int v) {
        this.zzp |= 1;
        this.zzu = v;
    }

    private void zzcF(zzbbq.zzab zzbbq$zzab0) {
        zzbbq$zzab0.getClass();
        this.zzC = zzbbq$zzab0;
        this.zzp |= 0x80;
    }

    private void zzcG(zzbbq.zzaf zzbbq$zzaf0) {
        zzbbq$zzaf0.getClass();
        this.zzE = zzbbq$zzaf0;
        this.zzp |= 0x200;
    }

    private void zzcH(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        this.zzy = zzbbq$zzar0;
        this.zzp |= 16;
    }

    private void zzcI(int v) {
        this.zzp |= 4;
        this.zzw = v;
    }

    private void zzcJ(zzbbq.zzbl zzbbq$zzbl0) {
        zzbbq$zzbl0.getClass();
        this.zzF = zzbbq$zzbl0;
        this.zzp |= 0x400;
    }

    private void zzcf() {
        this.zzz = zzgxr.zzbI();
    }

    private void zzcg() {
        this.zzp &= -9;
        this.zzx = 1000;
    }

    private void zzch() {
        this.zzp &= -2;
        this.zzu = 0;
    }

    private void zzci() {
        this.zzC = null;
        this.zzp &= 0xFFFFFF7F;
    }

    private void zzcj() {
        this.zzE = null;
        this.zzp &= 0xFFFFFDFF;
    }

    private void zzck() {
        this.zzy = null;
        this.zzp &= -17;
    }

    private void zzcl() {
        this.zzp &= -5;
        this.zzw = 0;
    }

    private void zzcm() {
        this.zzF = null;
        this.zzp &= 0xFFFFFBFF;
    }

    private void zzcn() {
        zzgyc zzgyc0 = this.zzz;
        if(!zzgyc0.zzc()) {
            this.zzz = zzgxr.zzbJ(zzgyc0);
        }
    }

    private void zzco(zzbbq.zza zzbbq$zza0) {
        zzbbq$zza0.getClass();
        zzbbq.zza zzbbq$zza1 = this.zzD;
        if(zzbbq$zza1 != null && zzbbq$zza1 != zzbbq.zza.zzh()) {
            zzbbq.zza.zzb zzbbq$zza$zzb0 = zzbbq.zza.zzf(zzbbq$zza1);
            zzbbq$zza$zzb0.zzbj(zzbbq$zza0);
            zzbbq$zza0 = (zzbbq.zza)zzbbq$zza$zzb0.zzbo();
        }
        this.zzD = zzbbq$zza0;
        this.zzp |= 0x100;
    }

    private void zzcp(zzbbq.zzb zzbbq$zzb0) {
        zzbbq$zzb0.getClass();
        zzbbq.zzb zzbbq$zzb1 = this.zzG;
        if(zzbbq$zzb1 != null && zzbbq$zzb1 != zzbbq.zzb.zzh()) {
            zzbbq.zzb.zzc zzbbq$zzb$zzc0 = zzbbq.zzb.zzf(zzbbq$zzb1);
            zzbbq$zzb$zzc0.zzbj(zzbbq$zzb0);
            zzbbq$zzb0 = (zzbbq.zzb)zzbbq$zzb$zzc0.zzbo();
        }
        this.zzG = zzbbq$zzb0;
        this.zzp |= 0x800;
    }

    private void zzcq(zzbbq.zzm zzbbq$zzm0) {
        zzbbq$zzm0.getClass();
        zzbbq.zzm zzbbq$zzm1 = this.zzA;
        if(zzbbq$zzm1 != null && zzbbq$zzm1 != zzbbq.zzm.zzg()) {
            zzbbq.zzm.zza zzbbq$zzm$zza0 = zzbbq.zzm.zzd(zzbbq$zzm1);
            zzbbq$zzm$zza0.zzbj(zzbbq$zzm0);
            zzbbq$zzm0 = (zzbbq.zzm)zzbbq$zzm$zza0.zzbo();
        }
        this.zzA = zzbbq$zzm0;
        this.zzp |= 0x20;
    }

    private void zzcr(zzbbq.zzo zzbbq$zzo0) {
        zzbbq$zzo0.getClass();
        zzbbq.zzo zzbbq$zzo1 = this.zzB;
        if(zzbbq$zzo1 != null && zzbbq$zzo1 != zzbbq.zzo.zzd()) {
            zzbbq.zzo.zza zzbbq$zzo$zza0 = zzbbq.zzo.zzb(zzbbq$zzo1);
            zzbbq$zzo$zza0.zzbj(zzbbq$zzo0);
            zzbbq$zzo0 = (zzbbq.zzo)zzbbq$zzo$zza0.zzbo();
        }
        this.zzB = zzbbq$zzo0;
        this.zzp |= 0x40;
    }

    private void zzcs(zzbbq.zzab zzbbq$zzab0) {
        zzbbq$zzab0.getClass();
        zzbbq.zzab zzbbq$zzab1 = this.zzC;
        if(zzbbq$zzab1 != null && zzbbq$zzab1 != zzbbq.zzab.zzd()) {
            zzbbq.zzab.zza zzbbq$zzab$zza0 = zzbbq.zzab.zzb(zzbbq$zzab1);
            zzbbq$zzab$zza0.zzbj(zzbbq$zzab0);
            zzbbq$zzab0 = (zzbbq.zzab)zzbbq$zzab$zza0.zzbo();
        }
        this.zzC = zzbbq$zzab0;
        this.zzp |= 0x80;
    }

    private void zzct(zzbbq.zzaf zzbbq$zzaf0) {
        zzbbq$zzaf0.getClass();
        zzbbq.zzaf zzbbq$zzaf1 = this.zzE;
        if(zzbbq$zzaf1 != null && zzbbq$zzaf1 != zzbbq.zzaf.zzl()) {
            zzbbq.zzaf.zzc zzbbq$zzaf$zzc0 = zzbbq.zzaf.zzj(zzbbq$zzaf1);
            zzbbq$zzaf$zzc0.zzbj(zzbbq$zzaf0);
            zzbbq$zzaf0 = (zzbbq.zzaf)zzbbq$zzaf$zzc0.zzbo();
        }
        this.zzE = zzbbq$zzaf0;
        this.zzp |= 0x200;
    }

    private void zzcu(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        zzbbq.zzar zzbbq$zzar1 = this.zzy;
        if(zzbbq$zzar1 != null && zzbbq$zzar1 != zzbbq.zzar.zzh()) {
            zzbbq.zzar.zza zzbbq$zzar$zza0 = zzbbq.zzar.zzf(zzbbq$zzar1);
            zzbbq$zzar$zza0.zzbj(zzbbq$zzar0);
            zzbbq$zzar0 = (zzbbq.zzar)zzbbq$zzar$zza0.zzbo();
        }
        this.zzy = zzbbq$zzar0;
        this.zzp |= 16;
    }

    private void zzcv(zzbbq.zzbl zzbbq$zzbl0) {
        zzbbq$zzbl0.getClass();
        zzbbq.zzbl zzbbq$zzbl1 = this.zzF;
        if(zzbbq$zzbl1 != null && zzbbq$zzbl1 != zzbbq.zzbl.zzi()) {
            zzbbq.zzbl.zza zzbbq$zzbl$zza0 = zzbbq.zzbl.zzc(zzbbq$zzbl1);
            zzbbq$zzbl$zza0.zzbj(zzbbq$zzbl0);
            zzbbq$zzbl0 = (zzbbq.zzbl)zzbbq$zzbl$zza0.zzbo();
        }
        this.zzF = zzbbq$zzbl0;
        this.zzp |= 0x400;
    }

    private void zzcw(zzbbq.zza zzbbq$zza0) {
        zzbbq$zza0.getClass();
        this.zzD = zzbbq$zza0;
        this.zzp |= 0x100;
    }

    private void zzcx(zzbbq.zzb zzbbq$zzb0) {
        zzbbq$zzb0.getClass();
        this.zzG = zzbbq$zzb0;
        this.zzp |= 0x800;
    }

    private void zzcy(zzbbq.zzm zzbbq$zzm0) {
        zzbbq$zzm0.getClass();
        this.zzA = zzbbq$zzm0;
        this.zzp |= 0x20;
    }

    private void zzcz(zzbbq.zzo zzbbq$zzo0) {
        zzbbq$zzo0.getClass();
        this.zzB = zzbbq$zzo0;
        this.zzp |= 0x40;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public long zzd(int v) {
        return this.zzz.zza(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzt.zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000Bဋ\u0002\f᠌\u0003\rဉ\u0004\u000E\u0015\u000Fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000B", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", zzbbq.zzq.zze(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
            }
            case 3: {
                return new zzbbq.zzt();
            }
            case 4: {
                return new zzbbq.zzt.zza(null);
            }
            case 5: {
                return zzbbq.zzt.zzn;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzt.zzo;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzt.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzt.zzo;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzt.zzn);
                            zzbbq.zzt.zzo = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zza zze() {
        return this.zzD == null ? zzbbq.zza.zzh() : this.zzD;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzb zzf() {
        return this.zzG == null ? zzbbq.zzb.zzh() : this.zzG;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzm zzg() {
        return this.zzA == null ? zzbbq.zzm.zzg() : this.zzA;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzo zzh() {
        return this.zzB == null ? zzbbq.zzo.zzd() : this.zzB;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzu
    public zzbbq.zzq zzi() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzx);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    public static zzbbq.zzt.zza zzj() {
        return (zzbbq.zzt.zza)zzbbq.zzt.zzn.zzaZ();
    }

    public static zzbbq.zzt.zza zzk(zzbbq.zzt zzbbq$zzt0) {
        return (zzbbq.zzt.zza)zzbbq.zzt.zzn.zzba(zzbbq$zzt0);
    }

    public static zzbbq.zzt zzm() {
        return zzbbq.zzt.zzn;
    }

    public static zzbbq.zzt zzn(InputStream inputStream0) throws IOException {
        return (zzbbq.zzt)zzgxr.zzbk(zzbbq.zzt.zzn, inputStream0);
    }

    public static zzbbq.zzt zzo(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzt)zzgxr.zzbl(zzbbq.zzt.zzn, inputStream0, zzgxb0);
    }

    public static zzbbq.zzt zzp(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzt)zzgxr.zzbm(zzbbq.zzt.zzn, zzgwj0);
    }

    public static zzbbq.zzt zzq(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzt)zzgxr.zzbn(zzbbq.zzt.zzn, zzgwp0);
    }

    public static zzbbq.zzt zzr(InputStream inputStream0) throws IOException {
        return (zzbbq.zzt)zzgxr.zzbo(zzbbq.zzt.zzn, inputStream0);
    }

    public static zzbbq.zzt zzs(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzt)zzgxr.zzbp(zzbbq.zzt.zzn, byteBuffer0);
    }

    public static zzbbq.zzt zzt(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzt)zzgxr.zzbq(zzbbq.zzt.zzn, arr_b);
    }

    public static zzbbq.zzt zzu(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzt)zzgxr.zzbr(zzbbq.zzt.zzn, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzt zzv(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzt)zzgxr.zzbs(zzbbq.zzt.zzn, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzt zzw(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzt)zzgxr.zzbu(zzbbq.zzt.zzn, inputStream0, zzgxb0);
    }

    public static zzbbq.zzt zzx(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzt)zzgxr.zzbv(zzbbq.zzt.zzn, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzt zzy(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzt)zzgxr.zzbx(zzbbq.zzt.zzn, arr_b, zzgxb0);
    }

    public static zzgzk zzz() {
        return zzbbq.zzt.zzn.zzbN();
    }
}

