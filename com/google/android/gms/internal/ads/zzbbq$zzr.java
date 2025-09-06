package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbbq.zzr extends zzgxr implements zzbbq.zzs {
    private int zzA;
    private zzgxz zzB;
    private zzgxz zzC;
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
    private static final zzgya zzk;
    private static final zzgya zzl;
    private static final zzbbq.zzr zzm;
    private static volatile zzgzk zzn;
    private int zzo;
    private int zzp;
    private String zzu;
    private zzbbq.zzar zzv;
    private int zzw;
    private String zzx;
    private String zzy;
    private int zzz;

    static {
        zzbbq.zzr.zzk = new zzgya() {
            public zzbbq.zzd.zza zza(int v) {
                zzbbq.zzd.zza zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb(v);
                return zzbbq$zzd$zza0 == null ? zzbbq.zzd.zza.zza : zzbbq$zzd$zza0;
            }

            @Override  // com.google.android.gms.internal.ads.zzgya
            public Object zzb(int v) {
                return this.zza(v);
            }
        };
        zzbbq.zzr.zzl = new zzgya() {
            public zzbbq.zzd.zza zza(int v) {
                zzbbq.zzd.zza zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb(v);
                return zzbbq$zzd$zza0 == null ? zzbbq.zzd.zza.zza : zzbbq$zzd$zza0;
            }

            @Override  // com.google.android.gms.internal.ads.zzgya
            public Object zzb(int v) {
                return this.zza(v);
            }
        };
        zzbbq.zzr zzbbq$zzr0 = new zzbbq.zzr();
        zzbbq.zzr.zzm = zzbbq$zzr0;
        zzgxr.zzbZ(zzbbq.zzr.class, zzbbq$zzr0);
    }

    private zzbbq.zzr() {
        this.zzu = "";
        this.zzx = "";
        this.zzy = "";
        this.zzB = zzgxr.zzbG();
        this.zzC = zzgxr.zzbG();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzbbq.zzab.zzc zzK() {
        zzbbq.zzab.zzc zzbbq$zzab$zzc0 = zzbbq.zzab.zzc.zzb(this.zzz);
        return zzbbq$zzab$zzc0 == null ? zzbbq.zzab.zzc.zza : zzbbq$zzab$zzc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzbbq.zzar zzL() {
        return this.zzv == null ? zzbbq.zzar.zzh() : this.zzv;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzgwj zzM() {
        return zzgwj.zzw(this.zzx);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzgwj zzN() {
        return zzgwj.zzw(this.zzy);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzgwj zzO() {
        return zzgwj.zzw(this.zzu);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public String zzP() [...] // 潜在的解密器

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public String zzQ() {
        return this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public String zzR() {
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public List zzS() {
        return new zzgyb(this.zzC, zzbbq.zzr.zzl);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public List zzT() {
        return new zzgyb(this.zzB, zzbbq.zzr.zzk);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzU() {
        return (this.zzo & 0x80) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzV() {
        return (this.zzo & 16) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzW() {
        return (this.zzo & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzX() {
        return (this.zzo & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzY() {
        return (this.zzo & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzZ() {
        return (this.zzo & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public int zza() {
        return this.zzp;
    }

    private void zzaA() {
        this.zzo &= -3;
        this.zzu = zzbbq.zzr.zzk().zzR();
    }

    private void zzaB() {
        this.zzo &= -2;
        this.zzp = 0;
    }

    private void zzaC() {
        this.zzv = null;
        this.zzo &= -5;
    }

    private void zzaD() {
        this.zzo &= -9;
        this.zzw = 0;
    }

    private void zzaE() {
        this.zzC = zzgxr.zzbG();
    }

    private void zzaF() {
        this.zzB = zzgxr.zzbG();
    }

    private void zzaG() {
        zzgxz zzgxz0 = this.zzC;
        if(!zzgxz0.zzc()) {
            this.zzC = zzgxr.zzbH(zzgxz0);
        }
    }

    private void zzaH() {
        zzgxz zzgxz0 = this.zzB;
        if(!zzgxz0.zzc()) {
            this.zzB = zzgxr.zzbH(zzgxz0);
        }
    }

    private void zzaI(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        zzbbq.zzar zzbbq$zzar1 = this.zzv;
        if(zzbbq$zzar1 != null && zzbbq$zzar1 != zzbbq.zzar.zzh()) {
            zzbbq.zzar.zza zzbbq$zzar$zza0 = zzbbq.zzar.zzf(zzbbq$zzar1);
            zzbbq$zzar$zza0.zzbj(zzbbq$zzar0);
            zzbbq$zzar0 = (zzbbq.zzar)zzbbq$zzar$zza0.zzbo();
        }
        this.zzv = zzbbq$zzar0;
        this.zzo |= 4;
    }

    private void zzaJ(zzbbq.zza.zza zzbbq$zza$zza0) {
        this.zzA = zzbbq$zza$zza0.zza();
        this.zzo |= 0x80;
    }

    private void zzaK(String s) {
        s.getClass();
        this.zzo |= 16;
        this.zzx = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzaa() {
        return (this.zzo & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public boolean zzab() {
        return (this.zzo & 8) != 0;
    }

    private void zzas(Iterable iterable0) {
        this.zzaG();
        for(Object object0: iterable0) {
            this.zzC.zzi(((zzbbq.zzd.zza)object0).zza());
        }
    }

    private void zzat(Iterable iterable0) {
        this.zzaH();
        for(Object object0: iterable0) {
            this.zzB.zzi(((zzbbq.zzd.zza)object0).zza());
        }
    }

    private void zzau(zzbbq.zzd.zza zzbbq$zzd$zza0) {
        zzbbq$zzd$zza0.getClass();
        this.zzaG();
        this.zzC.zzi(zzbbq$zzd$zza0.zza());
    }

    private void zzav(zzbbq.zzd.zza zzbbq$zzd$zza0) {
        zzbbq$zzd$zza0.getClass();
        this.zzaH();
        this.zzB.zzi(zzbbq$zzd$zza0.zza());
    }

    private void zzaw() {
        this.zzo &= 0xFFFFFF7F;
        this.zzA = 0;
    }

    private void zzax() {
        this.zzo &= -17;
        this.zzx = "";
    }

    private void zzay() {
        this.zzo &= -65;
        this.zzz = 0;
    }

    private void zzaz() {
        this.zzo &= -33;
        this.zzy = zzbbq.zzr.zzk().zzQ();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public int zzb() {
        return this.zzC.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public int zzc() {
        return this.zzB.size();
    }

    private void zzcf(zzgwj zzgwj0) {
        this.zzx = zzgwj0.zzx();
        this.zzo |= 16;
    }

    private void zzcg(zzbbq.zzab.zzc zzbbq$zzab$zzc0) {
        this.zzz = zzbbq$zzab$zzc0.zza();
        this.zzo |= 0x40;
    }

    private void zzch(String s) {
        s.getClass();
        this.zzo |= 0x20;
        this.zzy = s;
    }

    private void zzci(zzgwj zzgwj0) {
        this.zzy = zzgwj0.zzx();
        this.zzo |= 0x20;
    }

    private void zzcj(String s) {
        s.getClass();
        this.zzo |= 2;
        this.zzu = s;
    }

    private void zzck(zzgwj zzgwj0) {
        this.zzu = zzgwj0.zzx();
        this.zzo |= 2;
    }

    private void zzcl(int v) {
        this.zzo |= 1;
        this.zzp = v;
    }

    private void zzcm(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        this.zzv = zzbbq$zzar0;
        this.zzo |= 4;
    }

    private void zzcn(zzbbq.zzo.zzb zzbbq$zzo$zzb0) {
        this.zzw = zzbbq$zzo$zzb0.zza();
        this.zzo |= 8;
    }

    private void zzco(int v, zzbbq.zzd.zza zzbbq$zzd$zza0) {
        zzbbq$zzd$zza0.getClass();
        this.zzaG();
        this.zzC.zze(v, zzbbq$zzd$zza0.zza());
    }

    private void zzcp(int v, zzbbq.zzd.zza zzbbq$zzd$zza0) {
        zzbbq$zzd$zza0.getClass();
        this.zzaH();
        this.zzB.zze(v, zzbbq$zzd$zza0.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzbbq.zza.zza zzd() {
        zzbbq.zza.zza zzbbq$zza$zza0 = zzbbq.zza.zza.zzb(this.zzA);
        return zzbbq$zza$zza0 == null ? zzbbq.zza.zza.zza : zzbbq$zza$zza0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzr.zzm, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000Bဈ\u0004\fဈ\u0005\r᠌\u0006\u000E᠌\u0007\u000Fࠞ\u0010ࠞ", new Object[]{"zzo", "zzp", "zzu", "zzv", "zzw", zzbbq.zzo.zzb.zze(), "zzx", "zzy", "zzz", zzbbq.zzab.zzc.zze(), "zzA", zzbbq.zza.zza.zze(), "zzB", zzbbq.zzd.zza.zze(), "zzC", zzbbq.zzd.zza.zze()});
            }
            case 3: {
                return new zzbbq.zzr();
            }
            case 4: {
                return new zzbbq.zzr.zza(null);
            }
            case 5: {
                return zzbbq.zzr.zzm;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzr.zzn;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzr.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzr.zzn;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzr.zzm);
                            zzbbq.zzr.zzn = zzgzk0;
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

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzbbq.zzd.zza zze(int v) {
        zzbbq.zzd.zza zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb(this.zzC.zzd(v));
        return zzbbq$zzd$zza0 == null ? zzbbq.zzd.zza.zza : zzbbq$zzd$zza0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzbbq.zzd.zza zzf(int v) {
        zzbbq.zzd.zza zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb(this.zzB.zzd(v));
        return zzbbq$zzd$zza0 == null ? zzbbq.zzd.zza.zza : zzbbq$zzd$zza0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzs
    public zzbbq.zzo.zzb zzg() {
        zzbbq.zzo.zzb zzbbq$zzo$zzb0 = zzbbq.zzo.zzb.zzb(this.zzw);
        return zzbbq$zzo$zzb0 == null ? zzbbq.zzo.zzb.zza : zzbbq$zzo$zzb0;
    }

    public static zzbbq.zzr.zza zzh() {
        return (zzbbq.zzr.zza)zzbbq.zzr.zzm.zzaZ();
    }

    public static zzbbq.zzr.zza zzi(zzbbq.zzr zzbbq$zzr0) {
        return (zzbbq.zzr.zza)zzbbq.zzr.zzm.zzba(zzbbq$zzr0);
    }

    public static zzbbq.zzr zzk() {
        return zzbbq.zzr.zzm;
    }

    public static zzbbq.zzr zzl(InputStream inputStream0) throws IOException {
        return (zzbbq.zzr)zzgxr.zzbk(zzbbq.zzr.zzm, inputStream0);
    }

    public static zzbbq.zzr zzm(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzr)zzgxr.zzbl(zzbbq.zzr.zzm, inputStream0, zzgxb0);
    }

    public static zzbbq.zzr zzn(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzr)zzgxr.zzbm(zzbbq.zzr.zzm, zzgwj0);
    }

    public static zzbbq.zzr zzo(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzr)zzgxr.zzbn(zzbbq.zzr.zzm, zzgwp0);
    }

    public static zzbbq.zzr zzp(InputStream inputStream0) throws IOException {
        return (zzbbq.zzr)zzgxr.zzbo(zzbbq.zzr.zzm, inputStream0);
    }

    public static zzbbq.zzr zzq(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzr)zzgxr.zzbp(zzbbq.zzr.zzm, byteBuffer0);
    }

    public static zzbbq.zzr zzr(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzr)zzgxr.zzbq(zzbbq.zzr.zzm, arr_b);
    }

    public static zzbbq.zzr zzs(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzr)zzgxr.zzbr(zzbbq.zzr.zzm, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzr zzt(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzr)zzgxr.zzbs(zzbbq.zzr.zzm, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzr zzu(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzr)zzgxr.zzbu(zzbbq.zzr.zzm, inputStream0, zzgxb0);
    }

    public static zzbbq.zzr zzv(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzr)zzgxr.zzbv(zzbbq.zzr.zzm, byteBuffer0, zzgxb0);
    }

    public static zzbbq.zzr zzw(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzr)zzgxr.zzbx(zzbbq.zzr.zzm, arr_b, zzgxb0);
    }

    public static zzgzk zzx() {
        return zzbbq.zzr.zzm.zzbN();
    }
}

