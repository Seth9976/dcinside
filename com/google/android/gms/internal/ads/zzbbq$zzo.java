package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class zzbbq.zzo extends zzgxr implements zzbbq.zzp {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final zzbbq.zzo zze;
    private static volatile zzgzk zzf;
    private int zzg;
    private int zzh;
    private zzbbq.zzar zzi;
    private String zzj;
    private String zzk;

    static {
        zzbbq.zzo zzbbq$zzo0 = new zzbbq.zzo();
        zzbbq.zzo.zze = zzbbq$zzo0;
        zzgxr.zzbZ(zzbbq.zzo.class, zzbbq$zzo0);
    }

    private zzbbq.zzo() {
        this.zzj = "";
        this.zzk = "";
    }

    public static zzbbq.zzo zzA(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzo)zzgxr.zzbx(zzbbq.zzo.zze, arr_b, zzgxb0);
    }

    public static zzgzk zzB() {
        return zzbbq.zzo.zze.zzbN();
    }

    private void zzN() {
        this.zzg &= -5;
        this.zzj = "";
    }

    private void zzO() {
        this.zzi = null;
        this.zzg &= -3;
    }

    private void zzP() {
        this.zzg &= -2;
        this.zzh = 0;
    }

    private void zzQ() {
        this.zzg &= -9;
        this.zzk = "";
    }

    private void zzR(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        zzbbq.zzar zzbbq$zzar1 = this.zzi;
        if(zzbbq$zzar1 != null && zzbbq$zzar1 != zzbbq.zzar.zzh()) {
            zzbbq.zzar.zza zzbbq$zzar$zza0 = zzbbq.zzar.zzf(zzbbq$zzar1);
            zzbbq$zzar$zza0.zzbj(zzbbq$zzar0);
            zzbbq$zzar0 = (zzbbq.zzar)zzbbq$zzar$zza0.zzbo();
        }
        this.zzi = zzbbq$zzar0;
        this.zzg |= 2;
    }

    private void zzS(String s) {
        s.getClass();
        this.zzg |= 4;
        this.zzj = s;
    }

    private void zzT(zzgwj zzgwj0) {
        this.zzj = zzgwj0.zzx();
        this.zzg |= 4;
    }

    private void zzU(zzbbq.zzar zzbbq$zzar0) {
        zzbbq$zzar0.getClass();
        this.zzi = zzbbq$zzar0;
        this.zzg |= 2;
    }

    private void zzV(zzbbq.zzo.zzb zzbbq$zzo$zzb0) {
        this.zzh = zzbbq$zzo$zzb0.zza();
        this.zzg |= 1;
    }

    private void zzW(String s) {
        s.getClass();
        this.zzg |= 8;
        this.zzk = s;
    }

    private void zzX(zzgwj zzgwj0) {
        this.zzk = zzgwj0.zzx();
        this.zzg |= 8;
    }

    public static zzbbq.zzo.zza zza() {
        return (zzbbq.zzo.zza)zzbbq.zzo.zze.zzaZ();
    }

    public static zzbbq.zzo.zza zzb(zzbbq.zzo zzbbq$zzo0) {
        return (zzbbq.zzo.zza)zzbbq.zzo.zze.zzba(zzbbq$zzo0);
    }

    public static zzbbq.zzo zzd() {
        return zzbbq.zzo.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzbbq.zzo.zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", zzbbq.zzo.zzb.zze(), "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzbbq.zzo();
            }
            case 4: {
                return new zzbbq.zzo.zza(null);
            }
            case 5: {
                return zzbbq.zzo.zze;
            }
            case 6: {
                zzgzk zzgzk0 = zzbbq.zzo.zzf;
                if(zzgzk0 == null) {
                    Class class0 = zzbbq.zzo.class;
                    synchronized(class0) {
                        zzgzk0 = zzbbq.zzo.zzf;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzbbq.zzo.zze);
                            zzbbq.zzo.zzf = zzgzk0;
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

    public static zzbbq.zzo zzf(InputStream inputStream0) throws IOException {
        return (zzbbq.zzo)zzgxr.zzbk(zzbbq.zzo.zze, inputStream0);
    }

    public static zzbbq.zzo zzg(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzo)zzgxr.zzbl(zzbbq.zzo.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzo zzh(zzgwj zzgwj0) throws zzgyg {
        return (zzbbq.zzo)zzgxr.zzbm(zzbbq.zzo.zze, zzgwj0);
    }

    public static zzbbq.zzo zzi(zzgwp zzgwp0) throws IOException {
        return (zzbbq.zzo)zzgxr.zzbn(zzbbq.zzo.zze, zzgwp0);
    }

    public static zzbbq.zzo zzj(InputStream inputStream0) throws IOException {
        return (zzbbq.zzo)zzgxr.zzbo(zzbbq.zzo.zze, inputStream0);
    }

    public static zzbbq.zzo zzk(ByteBuffer byteBuffer0) throws zzgyg {
        return (zzbbq.zzo)zzgxr.zzbp(zzbbq.zzo.zze, byteBuffer0);
    }

    public static zzbbq.zzo zzl(byte[] arr_b) throws zzgyg {
        return (zzbbq.zzo)zzgxr.zzbq(zzbbq.zzo.zze, arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public zzbbq.zzo.zzb zzm() {
        zzbbq.zzo.zzb zzbbq$zzo$zzb0 = zzbbq.zzo.zzb.zzb(this.zzh);
        return zzbbq$zzo$zzb0 == null ? zzbbq.zzo.zzb.zza : zzbbq$zzo$zzb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public zzbbq.zzar zzn() {
        return this.zzi == null ? zzbbq.zzar.zzh() : this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public zzgwj zzo() {
        return zzgwj.zzw(this.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public zzgwj zzp() {
        return zzgwj.zzw(this.zzk);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public String zzq() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public String zzr() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public boolean zzs() {
        return (this.zzg & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public boolean zzt() {
        return (this.zzg & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public boolean zzu() {
        return (this.zzg & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbbq$zzp
    public boolean zzv() {
        return (this.zzg & 8) != 0;
    }

    public static zzbbq.zzo zzw(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzo)zzgxr.zzbr(zzbbq.zzo.zze, zzgwj0, zzgxb0);
    }

    public static zzbbq.zzo zzx(zzgwp zzgwp0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzo)zzgxr.zzbs(zzbbq.zzo.zze, zzgwp0, zzgxb0);
    }

    public static zzbbq.zzo zzy(InputStream inputStream0, zzgxb zzgxb0) throws IOException {
        return (zzbbq.zzo)zzgxr.zzbu(zzbbq.zzo.zze, inputStream0, zzgxb0);
    }

    public static zzbbq.zzo zzz(ByteBuffer byteBuffer0, zzgxb zzgxb0) throws zzgyg {
        return (zzbbq.zzo)zzgxr.zzbv(zzbbq.zzo.zze, byteBuffer0, zzgxb0);
    }
}

