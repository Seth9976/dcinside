package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzah extends zzgxr implements zzbbq.zzak {
    private int zzA;
    private int zzB;
    private zzbbq.zzai zzC;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final zzbbq.zzah zzl;
    private static volatile zzgzk zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        zzbbq.zzah zzbbq$zzah0 = new zzbbq.zzah();
        zzbbq.zzah.zzl = zzbbq$zzah0;
        zzgxr.zzbZ(zzbbq.zzah.class, zzbbq$zzah0);
    }

    private zzbbq.zzah() {
        this.zzo = 1000;
        this.zzp = 1000;
    }

    public static zzgzk zzA() {
        return zzbbq.zzah.zzl.zzbN();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public zzbbq.zzai zzI() {
        return this.zzC == null ? zzbbq.zzai.zzi() : this.zzC;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzJ() {
        return (this.zzn & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzK() {
        return (this.zzn & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzL() {
        return (this.zzn & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzM() {
        return (this.zzn & 0x80) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzN() {
        return (this.zzn & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzO() {
        return (this.zzn & 0x200) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzP() {
        return (this.zzn & 0x100) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzQ() {
        return (this.zzn & 0x400) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzR() {
        return (this.zzn & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzS() {
        return (this.zzn & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public boolean zzT() {
        return (this.zzn & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zza() {
        return this.zzy;
    }

    private void zzaA(int v) {
        this.zzn |= 8;
        this.zzv = v;
    }

    private void zzaB(int v) {
        this.zzn |= 0x200;
        this.zzB = v;
    }

    private void zzaC(int v) {
        this.zzn |= 0x100;
        this.zzA = v;
    }

    private void zzaD(zzbbq.zzai zzbbq$zzai0) {
        zzbbq$zzai0.getClass();
        this.zzC = zzbbq$zzai0;
        this.zzn |= 0x400;
    }

    private void zzaE(int v) {
        this.zzn |= 4;
        this.zzu = v;
    }

    private void zzaF(int v) {
        this.zzn |= 0x20;
        this.zzx = v;
    }

    private void zzaG(int v) {
        this.zzn |= 16;
        this.zzw = v;
    }

    private void zzak() {
        this.zzn &= -3;
        this.zzp = 1000;
    }

    private void zzal() {
        this.zzn &= -2;
        this.zzo = 1000;
    }

    private void zzam() {
        this.zzn &= -65;
        this.zzy = 0;
    }

    private void zzan() {
        this.zzn &= 0xFFFFFF7F;
        this.zzz = 0;
    }

    private void zzao() {
        this.zzn &= -9;
        this.zzv = 0;
    }

    private void zzap() {
        this.zzn &= 0xFFFFFDFF;
        this.zzB = 0;
    }

    private void zzaq() {
        this.zzn &= 0xFFFFFEFF;
        this.zzA = 0;
    }

    private void zzar() {
        this.zzC = null;
        this.zzn &= 0xFFFFFBFF;
    }

    private void zzas() {
        this.zzn &= -5;
        this.zzu = 0;
    }

    private void zzat() {
        this.zzn &= -33;
        this.zzx = 0;
    }

    private void zzau() {
        this.zzn &= -17;
        this.zzw = 0;
    }

    private void zzav(zzbbq.zzai zzbbq$zzai0) {
        zzbbq$zzai0.getClass();
        zzbbq.zzai zzbbq$zzai1 = this.zzC;
        if(zzbbq$zzai1 != null && zzbbq$zzai1 != zzbbq.zzai.zzi()) {
            zzbbq.zzai.zza zzbbq$zzai$zza0 = zzbbq.zzai.zzd(zzbbq$zzai1);
            zzbbq$zzai$zza0.zzbj(zzbbq$zzai0);
            zzbbq$zzai0 = (zzbbq.zzai)zzbbq$zzai$zza0.zzbo();
        }
        this.zzC = zzbbq$zzai0;
        this.zzn |= 0x400;
    }

    private void zzaw(zzbbq.zzq zzbbq$zzq0) {
        this.zzp = zzbbq$zzq0.zza();
        this.zzn |= 2;
    }

    private void zzax(zzbbq.zzq zzbbq$zzq0) {
        this.zzo = zzbbq$zzq0.zza();
        this.zzn |= 1;
    }

    private void zzay(int v) {
        this.zzn |= 0x40;
        this.zzy = v;
    }

    private void zzaz(int v) {
        this.zzn |= 0x80;
        this.zzz = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zzb() {
        return this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zzc() {
        return this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zzd() {
        return this.zzB;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzah.zzl, "\u0004\u000B\u0000\u0001\u0001\u000B\u000B\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000Bဉ\n", new Object[]{"zzn", "zzo", zzbbq.zzq.zze(), "zzp", zzbbq.zzq.zze(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
            }
            case 3: {
                return new zzbbq.zzah();
            }
            case 4: {
                return new zzbbq.zzah.zza(null);
            }
            case 5: {
                return zzbbq.zzah.zzl;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzah.zzm;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzah.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzah.zzm;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzah.zzl);
                            zzbbq.zzah.zzm = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zze() {
        return this.zzA;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zzf() {
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zzg() {
        return this.zzx;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public int zzh() {
        return this.zzw;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public zzbbq.zzq zzi() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzp);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzak
    public zzbbq.zzq zzj() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzo);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    public static zzbbq.zzah.zza zzk() {
        return (zzbbq.zzah.zza)zzbbq.zzah.zzl.zzaZ();
    }

    public static zzbbq.zzah.zza zzl(zzbbq.zzah zzbbq$zzah0) {
        return (zzbbq.zzah.zza)zzbbq.zzah.zzl.zzba(zzbbq$zzah0);
    }

    public static zzbbq.zzah zzn() {
        return zzbbq.zzah.zzl;
    }

    public static zzbbq.zzah zzo(InputStream inputStream0) throws IOException {
        return (zzbbq.zzah)zzgxr.zzbk(zzbbq.zzah.zzl, inputStream0);
    }

    public static zzbbq.zzah zzp(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzah)zzgxr.zzbl(zzbbq.zzah.zzl, inputStream0, zzgxb0);
    }

    public static zzbbq.zzah zzq(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzah)zzgxr.zzbm(zzbbq.zzah.zzl, zzgwj0);
    }

    public static zzbbq.zzah zzr(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzah)zzgxr.zzbn(zzbbq.zzah.zzl, zzgwp0);
    }

    public static zzbbq.zzah zzs(InputStream inputStream0) throws IOException {
        return (zzbbq.zzah)zzgxr.zzbo(zzbbq.zzah.zzl, inputStream0);
    }

    public static zzbbq.zzah zzt(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzah)zzgxr.zzbp(zzbbq.zzah.zzl, byteBuffer0);
    }

    public static zzbbq.zzah zzu(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzah)zzgxr.zzbq(zzbbq.zzah.zzl, arr_b);
    }

    public static zzbbq.zzah zzv(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzah)zzgxr.zzbr(zzbbq.zzah.zzl, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzah zzw(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzah)zzgxr.zzbs(zzbbq.zzah.zzl, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzah zzx(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzah)zzgxr.zzbu(zzbbq.zzah.zzl, inputStream0, zzgxb0);
    }

    public static zzbbq.zzah zzy(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzah)zzgxr.zzbv(zzbbq.zzah.zzl, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzah zzz(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzah)zzgxr.zzbx(zzbbq.zzah.zzl, arr_b, zzgxb0);
    }
}

