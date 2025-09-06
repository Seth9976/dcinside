package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzaf extends zzgxr implements zzbbq.zzag {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final zzbbq.zzaf zzi;
    private static volatile zzgzk zzj;
    private int zzk;
    private zzgyd zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private String zzp;
    private String zzu;
    private long zzv;
    private int zzw;

    static {
        zzbbq.zzaf zzbbq$zzaf0 = new zzbbq.zzaf();
        zzbbq.zzaf.zzi = zzbbq$zzaf0;
        zzgxr.zzbZ(zzbbq.zzaf.class, zzbbq$zzaf0);
    }

    private zzbbq.zzaf() {
        this.zzl = zzgxr.zzbK();
        this.zzp = "";
        this.zzu = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public zzgwj zzG() {
        return zzgwj.zzw(this.zzp);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public zzgwj zzH() {
        return zzgwj.zzw(this.zzu);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public String zzI() {
        return this.zzp;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public String zzJ() {
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public List zzK() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public boolean zzL() {
        return (this.zzk & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public boolean zzM() {
        return (this.zzk & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public boolean zzN() {
        return (this.zzk & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public boolean zzO() {
        return (this.zzk & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public boolean zzP() {
        return (this.zzk & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public boolean zzQ() {
        return (this.zzk & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public boolean zzR() {
        return (this.zzk & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public int zza() {
        return this.zzw;
    }

    private void zzaA(int v) {
        this.zzk |= 1;
        this.zzm = v;
    }

    private void zzaB(long v) {
        this.zzk |= 0x20;
        this.zzv = v;
    }

    private void zzaC(int v, zzbbq.zzaf.zza zzbbq$zzaf$zza0) {
        zzbbq$zzaf$zza0.getClass();
        this.zzat();
        this.zzl.set(v, zzbbq$zzaf$zza0);
    }

    private void zzaD(int v) {
        this.zzk |= 2;
        this.zzn = v;
    }

    private void zzaE(long v) {
        this.zzk |= 4;
        this.zzo = v;
    }

    private void zzai(Iterable iterable0) {
        this.zzat();
        zzgvs.zzaQ(iterable0, this.zzl);
    }

    private void zzaj(zzbbq.zzaf.zza zzbbq$zzaf$zza0) {
        zzbbq$zzaf$zza0.getClass();
        this.zzat();
        this.zzl.add(zzbbq$zzaf$zza0);
    }

    private void zzak(int v, zzbbq.zzaf.zza zzbbq$zzaf$zza0) {
        zzbbq$zzaf$zza0.getClass();
        this.zzat();
        this.zzl.add(v, zzbbq$zzaf$zza0);
    }

    private void zzal() {
        this.zzk &= -9;
        this.zzp = zzbbq.zzaf.zzl().zzI();
    }

    private void zzam() {
        this.zzk &= -65;
        this.zzw = 0;
    }

    private void zzan() {
        this.zzk &= -17;
        this.zzu = zzbbq.zzaf.zzl().zzJ();
    }

    private void zzao() {
        this.zzk &= -2;
        this.zzm = 0;
    }

    private void zzap() {
        this.zzk &= -33;
        this.zzv = 0L;
    }

    private void zzaq() {
        this.zzl = zzgxr.zzbK();
    }

    private void zzar() {
        this.zzk &= -3;
        this.zzn = 0;
    }

    private void zzas() {
        this.zzk &= -5;
        this.zzo = 0L;
    }

    private void zzat() {
        zzgyd zzgyd0 = this.zzl;
        if(!zzgyd0.zzc()) {
            this.zzl = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzau(int v) {
        this.zzat();
        this.zzl.remove(v);
    }

    private void zzav(String s) {
        s.getClass();
        this.zzk |= 8;
        this.zzp = s;
    }

    private void zzaw(zzgwj zzgwj0) {
        this.zzp = zzgwj0.zzx();
        this.zzk |= 8;
    }

    private void zzax(int v) {
        this.zzk |= 0x40;
        this.zzw = v;
    }

    private void zzay(String s) {
        s.getClass();
        this.zzk |= 16;
        this.zzu = s;
    }

    private void zzaz(zzgwj zzgwj0) {
        this.zzu = zzgwj0.zzx();
        this.zzk |= 16;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public int zzb() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public int zzc() {
        return this.zzl.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public int zzd() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzaf.zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001B\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", zzbbq.zzaf.zza.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
            }
            case 3: {
                return new zzbbq.zzaf();
            }
            case 4: {
                return new zzbbq.zzaf.zzc(null);
            }
            case 5: {
                return zzbbq.zzaf.zzi;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzaf.zzj;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzaf.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzaf.zzj;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzaf.zzi);
                            zzbbq.zzaf.zzj = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public long zze() {
        return this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public long zzf() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzag
    public zzbbq.zzaf.zza zzg(int v) {
        return (zzbbq.zzaf.zza)this.zzl.get(v);
    }

    public zzbbq.zzaf.zzb zzh(int v) {
        return (zzbbq.zzaf.zzb)this.zzl.get(v);
    }

    public static zzbbq.zzaf.zzc zzi() {
        return (zzbbq.zzaf.zzc)zzbbq.zzaf.zzi.zzaZ();
    }

    public static zzbbq.zzaf.zzc zzj(zzbbq.zzaf zzbbq$zzaf0) {
        return (zzbbq.zzaf.zzc)zzbbq.zzaf.zzi.zzba(zzbbq$zzaf0);
    }

    public static zzbbq.zzaf zzl() {
        return zzbbq.zzaf.zzi;
    }

    public static zzbbq.zzaf zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zzaf)zzgxr.zzbk(zzbbq.zzaf.zzi, inputStream0);
    }

    public static zzbbq.zzaf zzn(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaf)zzgxr.zzbl(zzbbq.zzaf.zzi, inputStream0, zzgxb0);
    }

    public static zzbbq.zzaf zzo(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzaf)zzgxr.zzbm(zzbbq.zzaf.zzi, zzgwj0);
    }

    public static zzbbq.zzaf zzp(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzaf)zzgxr.zzbn(zzbbq.zzaf.zzi, zzgwp0);
    }

    public static zzbbq.zzaf zzq(InputStream inputStream0) throws IOException {
        return (zzbbq.zzaf)zzgxr.zzbo(zzbbq.zzaf.zzi, inputStream0);
    }

    public static zzbbq.zzaf zzr(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzaf)zzgxr.zzbp(zzbbq.zzaf.zzi, byteBuffer0);
    }

    public static zzbbq.zzaf zzs(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzaf)zzgxr.zzbq(zzbbq.zzaf.zzi, arr_b);
    }

    public static zzbbq.zzaf zzt(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaf)zzgxr.zzbr(zzbbq.zzaf.zzi, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzaf zzu(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaf)zzgxr.zzbs(zzbbq.zzaf.zzi, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzaf zzv(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaf)zzgxr.zzbu(zzbbq.zzaf.zzi, inputStream0, zzgxb0);
    }

    public static zzbbq.zzaf zzw(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaf)zzgxr.zzbv(zzbbq.zzaf.zzi, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzaf zzx(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaf)zzgxr.zzbx(zzbbq.zzaf.zzi, arr_b, zzgxb0);
    }

    public static zzgzk zzy() {
        return zzbbq.zzaf.zzi.zzbN();
    }

    public List zzz() {
        return this.zzl;
    }
}

