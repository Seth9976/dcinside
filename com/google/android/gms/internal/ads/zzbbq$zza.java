package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zza extends zzgxr implements zzbbq.zzf {
    private zzbbq.zzx zzA;
    private zzbbq.zzz zzB;
    private zzgyd zzC;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final zzbbq.zza zzl;
    private static volatile zzgzk zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private zzbbq.zzg zzu;
    private zzbbq.zzi zzv;
    private zzgyd zzw;
    private zzbbq.zzk zzx;
    private zzbbq.zzah zzy;
    private zzbbq.zzac zzz;

    static {
        zzbbq.zza zzbbq$zza0 = new zzbbq.zza();
        zzbbq.zza.zzl = zzbbq$zza0;
        zzgxr.zzbZ(zzbbq.zza.class, zzbbq$zza0);
    }

    private zzbbq.zza() {
        this.zzp = 1000;
        this.zzw = zzgxr.zzbK();
        this.zzC = zzgxr.zzbK();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public int zza() {
        return this.zzw.size();
    }

    private void zzaF(Iterable iterable0) {
        this.zzcq();
        zzgvs.zzaQ(iterable0, this.zzw);
    }

    private void zzaG(Iterable iterable0) {
        this.zzcr();
        zzgvs.zzaQ(iterable0, this.zzC);
    }

    private void zzaH(zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzcq();
        this.zzw.add(zzbbq$zzd0);
    }

    private void zzaI(int v, zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzcq();
        this.zzw.add(v, zzbbq$zzd0);
    }

    private void zzaJ(zzbbq.zzat zzbbq$zzat0) {
        zzbbq$zzat0.getClass();
        this.zzcr();
        this.zzC.add(zzbbq$zzat0);
    }

    private void zzaK(int v, zzbbq.zzat zzbbq$zzat0) {
        zzbbq$zzat0.getClass();
        this.zzcr();
        this.zzC.add(v, zzbbq$zzat0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzd zzab(int v) {
        return (zzbbq.zzd)this.zzw.get(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzg zzac() {
        return this.zzu == null ? zzbbq.zzg.zzh() : this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzi zzad() {
        return this.zzv == null ? zzbbq.zzi.zzh() : this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzk zzae() {
        return this.zzx == null ? zzbbq.zzk.zzh() : this.zzx;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzq zzaf() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzp);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zzc : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzx zzag() {
        return this.zzA == null ? zzbbq.zzx.zzh() : this.zzA;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzz zzah() {
        return this.zzB == null ? zzbbq.zzz.zzh() : this.zzB;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzac zzai() {
        return this.zzz == null ? zzbbq.zzac.zzf() : this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzah zzaj() {
        return this.zzy == null ? zzbbq.zzah.zzn() : this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zzat zzak(int v) {
        return (zzbbq.zzat)this.zzC.get(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public List zzal() {
        return this.zzw;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public List zzam() {
        return this.zzC;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzan() {
        return (this.zzn & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzao() {
        return (this.zzn & 0x80) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzap() {
        return (this.zzn & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzaq() {
        return (this.zzn & 0x100) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzar() {
        return (this.zzn & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzas() {
        return (this.zzn & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzat() {
        return (this.zzn & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzau() {
        return (this.zzn & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public boolean zzav() {
        return (this.zzn & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public int zzb() {
        return this.zzC.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzf
    public zzbbq.zza.zza zzc() {
        zzbbq.zza.zza zzbbq$zza$zza0 = zzbbq.zza.zza.zzb(this.zzo);
        return zzbbq$zza$zza0 == null ? zzbbq.zza.zza.zza : zzbbq$zza$zza0;
    }

    private void zzcA(int v) {
        this.zzcr();
        this.zzC.remove(v);
    }

    private void zzcB(zzbbq.zza.zza zzbbq$zza$zza0) {
        this.zzo = zzbbq$zza$zza0.zza();
        this.zzn |= 1;
    }

    private void zzcC(zzbbq.zzx zzbbq$zzx0) {
        zzbbq$zzx0.getClass();
        this.zzA = zzbbq$zzx0;
        this.zzn |= 0x80;
    }

    private void zzcD(zzbbq.zzq zzbbq$zzq0) {
        this.zzp = zzbbq$zzq0.zza();
        this.zzn |= 2;
    }

    private void zzcE(zzbbq.zzz zzbbq$zzz0) {
        zzbbq$zzz0.getClass();
        this.zzB = zzbbq$zzz0;
        this.zzn |= 0x100;
    }

    private void zzcF(zzbbq.zzac zzbbq$zzac0) {
        zzbbq$zzac0.getClass();
        this.zzz = zzbbq$zzac0;
        this.zzn |= 0x40;
    }

    private void zzcG(int v, zzbbq.zzd zzbbq$zzd0) {
        zzbbq$zzd0.getClass();
        this.zzcq();
        this.zzw.set(v, zzbbq$zzd0);
    }

    private void zzcH(zzbbq.zzg zzbbq$zzg0) {
        zzbbq$zzg0.getClass();
        this.zzu = zzbbq$zzg0;
        this.zzn |= 4;
    }

    private void zzcI(zzbbq.zzi zzbbq$zzi0) {
        zzbbq$zzi0.getClass();
        this.zzv = zzbbq$zzi0;
        this.zzn |= 8;
    }

    private void zzcJ(zzbbq.zzah zzbbq$zzah0) {
        zzbbq$zzah0.getClass();
        this.zzy = zzbbq$zzah0;
        this.zzn |= 0x20;
    }

    private void zzcK(zzbbq.zzk zzbbq$zzk0) {
        zzbbq$zzk0.getClass();
        this.zzx = zzbbq$zzk0;
        this.zzn |= 16;
    }

    private void zzcL(int v, zzbbq.zzat zzbbq$zzat0) {
        zzbbq$zzat0.getClass();
        this.zzcr();
        this.zzC.set(v, zzbbq$zzat0);
    }

    private void zzcf() {
        this.zzn &= -2;
        this.zzo = 0;
    }

    private void zzcg() {
        this.zzA = null;
        this.zzn &= 0xFFFFFF7F;
    }

    private void zzch() {
        this.zzn &= -3;
        this.zzp = 1000;
    }

    private void zzci() {
        this.zzB = null;
        this.zzn &= 0xFFFFFEFF;
    }

    private void zzcj() {
        this.zzz = null;
        this.zzn &= -65;
    }

    private void zzck() {
        this.zzw = zzgxr.zzbK();
    }

    private void zzcl() {
        this.zzu = null;
        this.zzn &= -5;
    }

    private void zzcm() {
        this.zzv = null;
        this.zzn &= -9;
    }

    private void zzcn() {
        this.zzy = null;
        this.zzn &= -33;
    }

    private void zzco() {
        this.zzx = null;
        this.zzn &= -17;
    }

    private void zzcp() {
        this.zzC = zzgxr.zzbK();
    }

    private void zzcq() {
        zzgyd zzgyd0 = this.zzw;
        if(!zzgyd0.zzc()) {
            this.zzw = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzcr() {
        zzgyd zzgyd0 = this.zzC;
        if(!zzgyd0.zzc()) {
            this.zzC = zzgxr.zzbL(zzgyd0);
        }
    }

    private void zzcs(zzbbq.zzx zzbbq$zzx0) {
        zzbbq$zzx0.getClass();
        zzbbq.zzx zzbbq$zzx1 = this.zzA;
        if(zzbbq$zzx1 != null && zzbbq$zzx1 != zzbbq.zzx.zzh()) {
            zzbbq.zzx.zza zzbbq$zzx$zza0 = zzbbq.zzx.zzf(zzbbq$zzx1);
            zzbbq$zzx$zza0.zzbj(zzbbq$zzx0);
            zzbbq$zzx0 = (zzbbq.zzx)zzbbq$zzx$zza0.zzbo();
        }
        this.zzA = zzbbq$zzx0;
        this.zzn |= 0x80;
    }

    private void zzct(zzbbq.zzz zzbbq$zzz0) {
        zzbbq$zzz0.getClass();
        zzbbq.zzz zzbbq$zzz1 = this.zzB;
        if(zzbbq$zzz1 != null && zzbbq$zzz1 != zzbbq.zzz.zzh()) {
            zzbbq.zzz.zza zzbbq$zzz$zza0 = zzbbq.zzz.zzf(zzbbq$zzz1);
            zzbbq$zzz$zza0.zzbj(zzbbq$zzz0);
            zzbbq$zzz0 = (zzbbq.zzz)zzbbq$zzz$zza0.zzbo();
        }
        this.zzB = zzbbq$zzz0;
        this.zzn |= 0x100;
    }

    private void zzcu(zzbbq.zzac zzbbq$zzac0) {
        zzbbq$zzac0.getClass();
        zzbbq.zzac zzbbq$zzac1 = this.zzz;
        if(zzbbq$zzac1 != null && zzbbq$zzac1 != zzbbq.zzac.zzf()) {
            zzbbq.zzac.zza zzbbq$zzac$zza0 = zzbbq.zzac.zzc(zzbbq$zzac1);
            zzbbq$zzac$zza0.zzbj(zzbbq$zzac0);
            zzbbq$zzac0 = (zzbbq.zzac)zzbbq$zzac$zza0.zzbo();
        }
        this.zzz = zzbbq$zzac0;
        this.zzn |= 0x40;
    }

    private void zzcv(zzbbq.zzg zzbbq$zzg0) {
        zzbbq$zzg0.getClass();
        zzbbq.zzg zzbbq$zzg1 = this.zzu;
        if(zzbbq$zzg1 != null && zzbbq$zzg1 != zzbbq.zzg.zzh()) {
            zzbbq.zzg.zza zzbbq$zzg$zza0 = zzbbq.zzg.zzf(zzbbq$zzg1);
            zzbbq$zzg$zza0.zzbj(zzbbq$zzg0);
            zzbbq$zzg0 = (zzbbq.zzg)zzbbq$zzg$zza0.zzbo();
        }
        this.zzu = zzbbq$zzg0;
        this.zzn |= 4;
    }

    private void zzcw(zzbbq.zzi zzbbq$zzi0) {
        zzbbq$zzi0.getClass();
        zzbbq.zzi zzbbq$zzi1 = this.zzv;
        if(zzbbq$zzi1 != null && zzbbq$zzi1 != zzbbq.zzi.zzh()) {
            zzbbq.zzi.zza zzbbq$zzi$zza0 = zzbbq.zzi.zzf(zzbbq$zzi1);
            zzbbq$zzi$zza0.zzbj(zzbbq$zzi0);
            zzbbq$zzi0 = (zzbbq.zzi)zzbbq$zzi$zza0.zzbo();
        }
        this.zzv = zzbbq$zzi0;
        this.zzn |= 8;
    }

    private void zzcx(zzbbq.zzah zzbbq$zzah0) {
        zzbbq$zzah0.getClass();
        zzbbq.zzah zzbbq$zzah1 = this.zzy;
        if(zzbbq$zzah1 != null && zzbbq$zzah1 != zzbbq.zzah.zzn()) {
            zzbbq.zzah.zza zzbbq$zzah$zza0 = zzbbq.zzah.zzl(zzbbq$zzah1);
            zzbbq$zzah$zza0.zzbj(zzbbq$zzah0);
            zzbbq$zzah0 = (zzbbq.zzah)zzbbq$zzah$zza0.zzbo();
        }
        this.zzy = zzbbq$zzah0;
        this.zzn |= 0x20;
    }

    private void zzcy(zzbbq.zzk zzbbq$zzk0) {
        zzbbq$zzk0.getClass();
        zzbbq.zzk zzbbq$zzk1 = this.zzx;
        if(zzbbq$zzk1 != null && zzbbq$zzk1 != zzbbq.zzk.zzh()) {
            zzbbq.zzk.zza zzbbq$zzk$zza0 = zzbbq.zzk.zzf(zzbbq$zzk1);
            zzbbq$zzk$zza0.zzbj(zzbbq$zzk0);
            zzbbq$zzk0 = (zzbbq.zzk)zzbbq$zzk$zza0.zzbo();
        }
        this.zzx = zzbbq$zzk0;
        this.zzn |= 16;
    }

    private void zzcz(int v) {
        this.zzcq();
        this.zzw.remove(v);
    }

    public static zzbbq.zza.zzb zzd() {
        return (zzbbq.zza.zzb)zzbbq.zza.zzl.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zza.zzl, "\u0004\u000B\u0000\u0001\u0007\u0011\u000B\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000B\u001B\fဉ\u0004\rဉ\u0005\u000Eဉ\u0006\u000Fဉ\u0007\u0010ဉ\b\u0011\u001B", new Object[]{"zzn", "zzo", zzbbq.zza.zza.zze(), "zzp", zzbbq.zzq.zze(), "zzu", "zzv", "zzw", zzbbq.zzd.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", zzbbq.zzat.class});
            }
            case 3: {
                return new zzbbq.zza();
            }
            case 4: {
                return new zzbbq.zza.zzb(null);
            }
            case 5: {
                return zzbbq.zza.zzl;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zza.zzm;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zza.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zza.zzm;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zza.zzl);
                            zzbbq.zza.zzm = zzgzk0;
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

    public static zzbbq.zza.zzb zzf(zzbbq.zza zzbbq$zza0) {
        return (zzbbq.zza.zzb)zzbbq.zza.zzl.zzba(zzbbq$zza0);
    }

    public static zzbbq.zza zzh() {
        return zzbbq.zza.zzl;
    }

    public static zzbbq.zza zzi(InputStream inputStream0) throws IOException {
        return (zzbbq.zza)zzgxr.zzbk(zzbbq.zza.zzl, inputStream0);
    }

    public static zzbbq.zza zzj(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zza)zzgxr.zzbl(zzbbq.zza.zzl, inputStream0, zzgxb0);
    }

    public static zzbbq.zza zzk(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zza)zzgxr.zzbm(zzbbq.zza.zzl, zzgwj0);
    }

    public static zzbbq.zza zzl(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zza)zzgxr.zzbn(zzbbq.zza.zzl, zzgwp0);
    }

    public static zzbbq.zza zzm(InputStream inputStream0) throws IOException {
        return (zzbbq.zza)zzgxr.zzbo(zzbbq.zza.zzl, inputStream0);
    }

    public static zzbbq.zza zzn(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zza)zzgxr.zzbp(zzbbq.zza.zzl, byteBuffer0);
    }

    public static zzbbq.zza zzo(byte[] arr_b) throws zzgyg {
        return (zzbbq.zza)zzgxr.zzbq(zzbbq.zza.zzl, arr_b);
    }

    public static zzbbq.zza zzp(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zza)zzgxr.zzbr(zzbbq.zza.zzl, zzgwj0, zzgxb0);
    }

    public static zzbbq.zza zzq(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zza)zzgxr.zzbs(zzbbq.zza.zzl, zzgwp0, zzgxb0);
    }

    public static zzbbq.zza zzr(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zza)zzgxr.zzbu(zzbbq.zza.zzl, inputStream0, zzgxb0);
    }

    public static zzbbq.zza zzs(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zza)zzgxr.zzbv(zzbbq.zza.zzl, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zza zzt(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zza)zzgxr.zzbx(zzbbq.zza.zzl, arr_b, zzgxb0);
    }

    public zzbbq.zze zzu(int v) {
        return (zzbbq.zze)this.zzw.get(v);
    }

    public zzbbq.zzbi zzv(int v) {
        return (zzbbq.zzbi)this.zzC.get(v);
    }

    public static zzgzk zzw() {
        return zzbbq.zza.zzl.zzbN();
    }

    public List zzx() {
        return this.zzw;
    }

    public List zzy() {
        return this.zzC;
    }
}

