package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzaf.zza extends zzgxr implements zzbbq.zzaf.zzb {
    private zzbbq.zzab zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
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
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final zzgya zzn;
    private static final zzbbq.zzaf.zza zzo;
    private static volatile zzgzk zzp;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private zzgxz zzz;

    static {
        zzbbq.zzaf.zza.zzn = new zzgya() {
            public zzbbq.zzd.zza zza(int v) {
                zzbbq.zzd.zza zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb(v);
                return zzbbq$zzd$zza0 == null ? zzbbq.zzd.zza.zza : zzbbq$zzd$zza0;
            }

            @Override  // com.google.android.gms.internal.ads.zzgya
            public Object zzb(int v) {
                return this.zza(v);
            }
        };
        zzbbq.zzaf.zza zzbbq$zzaf$zza0 = new zzbbq.zzaf.zza();
        zzbbq.zzaf.zza.zzo = zzbbq$zzaf$zza0;
        zzgxr.zzbZ(zzbbq.zzaf.zza.class, zzbbq$zzaf$zza0);
    }

    private zzbbq.zzaf.zza() {
        this.zzz = zzgxr.zzbG();
    }

    public static zzbbq.zzaf.zza zzA(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaf.zza)zzgxr.zzbu(zzbbq.zzaf.zza.zzo, inputStream0, zzgxb0);
    }

    public static zzbbq.zzaf.zza zzB(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaf.zza)zzgxr.zzbv(zzbbq.zzaf.zza.zzo, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzaf.zza zzC(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaf.zza)zzgxr.zzbx(zzbbq.zzaf.zza.zzo, arr_b, zzgxb0);
    }

    public static zzgzk zzD() {
        return zzbbq.zzaf.zza.zzo.zzbN();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzaf.zzd zzR() {
        zzbbq.zzaf.zzd zzbbq$zzaf$zzd0 = zzbbq.zzaf.zzd.zzb(this.zzG);
        return zzbbq$zzaf$zzd0 == null ? zzbbq.zzaf.zzd.zza : zzbbq$zzaf$zzd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public List zzS() {
        return new zzgyb(this.zzz, zzbbq.zzaf.zza.zzn);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzT() {
        return (this.zzu & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzU() {
        return (this.zzu & 0x80) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzV() {
        return (this.zzu & 0x100) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzW() {
        return (this.zzu & 0x400) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzX() {
        return (this.zzu & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzY() {
        return (this.zzu & 0x200) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzZ() {
        return (this.zzu & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public int zza() {
        return this.zzz.size();
    }

    private void zzaA() {
        this.zzu &= 0xFFFFFEFF;
        this.zzE = 0;
    }

    private void zzaB() {
        this.zzu &= 0xFFFFFBFF;
        this.zzG = 0;
    }

    private void zzaC() {
        this.zzA = null;
        this.zzu &= -17;
    }

    private void zzaD() {
        this.zzu &= 0xFFFFFDFF;
        this.zzF = 0;
    }

    private void zzaE() {
        this.zzu &= -9;
        this.zzy = 0L;
    }

    private void zzaF() {
        this.zzu &= -5;
        this.zzx = 0L;
    }

    private void zzaG() {
        this.zzu &= -3;
        this.zzw = 0;
    }

    private void zzaH() {
        this.zzu &= -2;
        this.zzv = 0L;
    }

    private void zzaI() {
        this.zzu &= 0xFFFFF7FF;
        this.zzH = 0L;
    }

    private void zzaJ() {
        this.zzu &= -33;
        this.zzB = 0;
    }

    private void zzaK() {
        zzgxz zzgxz0 = this.zzz;
        if(!zzgxz0.zzc()) {
            this.zzz = zzgxr.zzbH(zzgxz0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzaa() {
        return (this.zzu & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzab() {
        return (this.zzu & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzac() {
        return (this.zzu & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzad() {
        return (this.zzu & 0x800) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public boolean zzae() {
        return (this.zzu & 0x20) != 0;
    }

    private void zzav(Iterable iterable0) {
        this.zzaK();
        for(Object object0: iterable0) {
            this.zzz.zzi(((zzbbq.zzd.zza)object0).zza());
        }
    }

    private void zzaw(zzbbq.zzd.zza zzbbq$zzd$zza0) {
        zzbbq$zzd$zza0.getClass();
        this.zzaK();
        this.zzz.zzi(zzbbq$zzd$zza0.zza());
    }

    private void zzax() {
        this.zzu &= -65;
        this.zzC = 0;
    }

    private void zzay() {
        this.zzu &= 0xFFFFFF7F;
        this.zzD = 0;
    }

    private void zzaz() {
        this.zzz = zzgxr.zzbG();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public int zzb() {
        return this.zzE;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public long zzc() {
        return this.zzy;
    }

    private void zzcf(zzbbq.zzab zzbbq$zzab0) {
        zzbbq$zzab0.getClass();
        zzbbq.zzab zzbbq$zzab1 = this.zzA;
        if(zzbbq$zzab1 != null && zzbbq$zzab1 != zzbbq.zzab.zzd()) {
            zzbbq.zzab.zza zzbbq$zzab$zza0 = zzbbq.zzab.zzb(zzbbq$zzab1);
            zzbbq$zzab$zza0.zzbj(zzbbq$zzab0);
            zzbbq$zzab0 = (zzbbq.zzab)zzbbq$zzab$zza0.zzbo();
        }
        this.zzA = zzbbq$zzab0;
        this.zzu |= 16;
    }

    private void zzcg(zzbbq.zzq zzbbq$zzq0) {
        this.zzC = zzbbq$zzq0.zza();
        this.zzu |= 0x40;
    }

    private void zzch(zzbbq.zzq zzbbq$zzq0) {
        this.zzD = zzbbq$zzq0.zza();
        this.zzu |= 0x80;
    }

    private void zzci(int v, zzbbq.zzd.zza zzbbq$zzd$zza0) {
        zzbbq$zzd$zza0.getClass();
        this.zzaK();
        this.zzz.zze(v, zzbbq$zzd$zza0.zza());
    }

    private void zzcj(int v) {
        this.zzu |= 0x100;
        this.zzE = v;
    }

    private void zzck(zzbbq.zzaf.zzd zzbbq$zzaf$zzd0) {
        this.zzG = zzbbq$zzaf$zzd0.zza();
        this.zzu |= 0x400;
    }

    private void zzcl(zzbbq.zzab zzbbq$zzab0) {
        zzbbq$zzab0.getClass();
        this.zzA = zzbbq$zzab0;
        this.zzu |= 16;
    }

    private void zzcm(zzbbq.zzq zzbbq$zzq0) {
        this.zzF = zzbbq$zzq0.zza();
        this.zzu |= 0x200;
    }

    private void zzcn(long v) {
        this.zzu |= 8;
        this.zzy = v;
    }

    private void zzco(long v) {
        this.zzu |= 4;
        this.zzx = v;
    }

    private void zzcp(zzbbq.zzq zzbbq$zzq0) {
        this.zzw = zzbbq$zzq0.zza();
        this.zzu |= 2;
    }

    private void zzcq(long v) {
        this.zzu |= 1;
        this.zzv = v;
    }

    private void zzcr(long v) {
        this.zzu |= 0x800;
        this.zzH = v;
    }

    private void zzcs(zzbbq.zzq zzbbq$zzq0) {
        this.zzB = zzbbq$zzq0.zza();
        this.zzu |= 0x20;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public long zzd() {
        return this.zzx;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzaf.zza.zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000B᠌\t\f᠌\n\rဂ\u000B", new Object[]{"zzu", "zzv", "zzw", zzbbq.zzq.zze(), "zzx", "zzy", "zzz", zzbbq.zzd.zza.zze(), "zzA", "zzB", zzbbq.zzq.zze(), "zzC", zzbbq.zzq.zze(), "zzD", zzbbq.zzq.zze(), "zzE", "zzF", zzbbq.zzq.zze(), "zzG", zzbbq.zzaf.zzd.zze(), "zzH"});
            }
            case 3: {
                return new zzbbq.zzaf.zza();
            }
            case 4: {
                return new zzbbq.zzaf.zza.zza(null);
            }
            case 5: {
                return zzbbq.zzaf.zza.zzo;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzaf.zza.zzp;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzaf.zza.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzaf.zza.zzp;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzaf.zza.zzo);
                            zzbbq.zzaf.zza.zzp = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public long zze() {
        return this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public long zzf() {
        return this.zzH;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzd.zza zzg(int v) {
        zzbbq.zzd.zza zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb(this.zzz.zzd(v));
        return zzbbq$zzd$zza0 == null ? zzbbq.zzd.zza.zza : zzbbq$zzd$zza0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzq zzh() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzC);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzq zzi() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzD);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzq zzj() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzF);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzq zzk() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzw);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzq zzl() {
        zzbbq.zzq zzbbq$zzq0 = zzbbq.zzq.zzb(this.zzB);
        return zzbbq$zzq0 == null ? zzbbq.zzq.zza : zzbbq$zzq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzaf$zzb
    public zzbbq.zzab zzm() {
        return this.zzA == null ? zzbbq.zzab.zzd() : this.zzA;
    }

    public static zzbbq.zzaf.zza.zza zzn() {
        return (zzbbq.zzaf.zza.zza)zzbbq.zzaf.zza.zzo.zzaZ();
    }

    public static zzbbq.zzaf.zza.zza zzo(zzbbq.zzaf.zza zzbbq$zzaf$zza0) {
        return (zzbbq.zzaf.zza.zza)zzbbq.zzaf.zza.zzo.zzba(zzbbq$zzaf$zza0);
    }

    public static zzbbq.zzaf.zza zzq() {
        return zzbbq.zzaf.zza.zzo;
    }

    public static zzbbq.zzaf.zza zzr(InputStream inputStream0) throws IOException {
        return (zzbbq.zzaf.zza)zzgxr.zzbk(zzbbq.zzaf.zza.zzo, inputStream0);
    }

    public static zzbbq.zzaf.zza zzs(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaf.zza)zzgxr.zzbl(zzbbq.zzaf.zza.zzo, inputStream0, zzgxb0);
    }

    public static zzbbq.zzaf.zza zzt(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzaf.zza)zzgxr.zzbm(zzbbq.zzaf.zza.zzo, zzgwj0);
    }

    public static zzbbq.zzaf.zza zzu(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzaf.zza)zzgxr.zzbn(zzbbq.zzaf.zza.zzo, zzgwp0);
    }

    public static zzbbq.zzaf.zza zzv(InputStream inputStream0) throws IOException {
        return (zzbbq.zzaf.zza)zzgxr.zzbo(zzbbq.zzaf.zza.zzo, inputStream0);
    }

    public static zzbbq.zzaf.zza zzw(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzaf.zza)zzgxr.zzbp(zzbbq.zzaf.zza.zzo, byteBuffer0);
    }

    public static zzbbq.zzaf.zza zzx(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzaf.zza)zzgxr.zzbq(zzbbq.zzaf.zza.zzo, arr_b);
    }

    public static zzbbq.zzaf.zza zzy(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzaf.zza)zzgxr.zzbr(zzbbq.zzaf.zza.zzo, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzaf.zza zzz(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzaf.zza)zzgxr.zzbs(zzbbq.zzaf.zza.zzo, zzgwp0, zzgxb0);
    }
}

