package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class zzha extends zzfu implements Cloneable {
    private String tag;
    public long zzbjf;
    public long zzbjg;
    private long zzbjh;
    public int zzbji;
    private String zzbjj;
    private int zzbjk;
    private boolean zzbjl;
    private zzhb[] zzbjm;
    private byte[] zzbjn;
    private zzd zzbjo;
    public byte[] zzbjp;
    private String zzbjq;
    private String zzbjr;
    private zzgy zzbjs;
    private String zzbjt;
    public long zzbju;
    private zzgz zzbjv;
    public byte[] zzbjw;
    private String zzbjx;
    private int zzbjy;
    private int[] zzbjz;
    private long zzbka;
    private zzs zzbkb;
    public boolean zzbkc;

    public zzha() {
        this.zzbjf = 0L;
        this.zzbjg = 0L;
        this.zzbjh = 0L;
        this.tag = "";
        this.zzbji = 0;
        this.zzbjj = "";
        this.zzbjk = 0;
        this.zzbjl = false;
        this.zzbjm = zzhb.zzge();
        this.zzbjn = zzgb.zzse;
        this.zzbjo = null;
        this.zzbjp = zzgb.zzse;
        this.zzbjq = "";
        this.zzbjr = "";
        this.zzbjs = null;
        this.zzbjt = "";
        this.zzbju = 180000L;
        this.zzbjv = null;
        this.zzbjw = zzgb.zzse;
        this.zzbjx = "";
        this.zzbjy = 0;
        this.zzbjz = zzgb.zzrx;
        this.zzbka = 0L;
        this.zzbkb = null;
        this.zzbkc = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final Object clone() throws CloneNotSupportedException {
        return this.zzgd();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzha)) {
            return false;
        }
        zzha zzha0 = (zzha)object0;
        if(this.zzbjf != zzha0.zzbjf) {
            return false;
        }
        if(this.zzbjg != zzha0.zzbjg) {
            return false;
        }
        String s = this.tag;
        if(s == null) {
            if(zzha0.tag != null) {
                return false;
            }
        }
        else if(!s.equals(zzha0.tag)) {
            return false;
        }
        if(this.zzbji != zzha0.zzbji) {
            return false;
        }
        String s1 = this.zzbjj;
        if(s1 == null) {
            if(zzha0.zzbjj != null) {
                return false;
            }
        }
        else if(!s1.equals(zzha0.zzbjj)) {
            return false;
        }
        if(!zzfy.equals(this.zzbjm, zzha0.zzbjm)) {
            return false;
        }
        if(!Arrays.equals(this.zzbjn, zzha0.zzbjn)) {
            return false;
        }
        zzd zzge$zzd0 = this.zzbjo;
        if(zzge$zzd0 == null) {
            if(zzha0.zzbjo != null) {
                return false;
            }
        }
        else if(!zzge$zzd0.equals(zzha0.zzbjo)) {
            return false;
        }
        if(!Arrays.equals(this.zzbjp, zzha0.zzbjp)) {
            return false;
        }
        String s2 = this.zzbjq;
        if(s2 == null) {
            if(zzha0.zzbjq != null) {
                return false;
            }
        }
        else if(!s2.equals(zzha0.zzbjq)) {
            return false;
        }
        String s3 = this.zzbjr;
        if(s3 == null) {
            if(zzha0.zzbjr != null) {
                return false;
            }
        }
        else if(!s3.equals(zzha0.zzbjr)) {
            return false;
        }
        zzgy zzgy0 = this.zzbjs;
        if(zzgy0 == null) {
            if(zzha0.zzbjs != null) {
                return false;
            }
        }
        else if(!zzgy0.equals(zzha0.zzbjs)) {
            return false;
        }
        String s4 = this.zzbjt;
        if(s4 == null) {
            if(zzha0.zzbjt != null) {
                return false;
            }
        }
        else if(!s4.equals(zzha0.zzbjt)) {
            return false;
        }
        if(this.zzbju != zzha0.zzbju) {
            return false;
        }
        zzgz zzgz0 = this.zzbjv;
        if(zzgz0 == null) {
            if(zzha0.zzbjv != null) {
                return false;
            }
        }
        else if(!zzgz0.equals(zzha0.zzbjv)) {
            return false;
        }
        if(!Arrays.equals(this.zzbjw, zzha0.zzbjw)) {
            return false;
        }
        String s5 = this.zzbjx;
        if(s5 == null) {
            if(zzha0.zzbjx != null) {
                return false;
            }
        }
        else if(!s5.equals(zzha0.zzbjx)) {
            return false;
        }
        if(!zzfy.equals(this.zzbjz, zzha0.zzbjz)) {
            return false;
        }
        zzs zzge$zzs0 = this.zzbkb;
        if(zzge$zzs0 == null) {
            if(zzha0.zzbkb != null) {
                return false;
            }
        }
        else if(!zzge$zzs0.equals(zzha0.zzbkb)) {
            return false;
        }
        if(this.zzbkc != zzha0.zzbkc) {
            return false;
        }
        return this.zzrj == null || this.zzrj.isEmpty() ? zzha0.zzrj == null || zzha0.zzrj.isEmpty() : this.zzrj.equals(zzha0.zzrj);
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((0x20FA9768 + ((int)(this.zzbjf ^ this.zzbjf >>> 0x20))) * 0x1F + ((int)(this.zzbjg ^ this.zzbjg >>> 0x20))) * 961 + (this.tag == null ? 0 : this.tag.hashCode())) * 0x1F + this.zzbji) * 0x1F;
        int v2 = this.zzbjj == null ? 0 : this.zzbjj.hashCode();
        int v3 = 0x4D5;
        int v4 = zzfy.hashCode(this.zzbjm);
        int v5 = Arrays.hashCode(this.zzbjn);
        int v6 = this.zzbjo == null ? 0 : this.zzbjo.hashCode();
        int v7 = Arrays.hashCode(this.zzbjp);
        zzgz zzgz0 = this.zzbjv;
        int v8 = (((((((((((v1 + v2) * 961 + 0x4D5) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + (this.zzbjq == null ? 0 : this.zzbjq.hashCode())) * 0x1F + (this.zzbjr == null ? 0 : this.zzbjr.hashCode())) * 0x1F + (this.zzbjs == null ? 0 : this.zzbjs.hashCode())) * 0x1F + (this.zzbjt == null ? 0 : this.zzbjt.hashCode())) * 0x1F + ((int)(this.zzbju ^ this.zzbju >>> 0x20))) * 0x1F;
        int v9 = zzgz0 == null ? 0 : zzgz0.hashCode();
        int v10 = Arrays.hashCode(this.zzbjw);
        int v11 = this.zzbjx == null ? 0 : this.zzbjx.hashCode();
        int v12 = zzfy.hashCode(this.zzbjz);
        int v13 = this.zzbkb == null ? 0 : this.zzbkb.hashCode();
        if(this.zzbkc) {
            v3 = 0x4CF;
        }
        if(this.zzrj != null && !this.zzrj.isEmpty()) {
            v = this.zzrj.hashCode();
        }
        return ((((((v8 + v9) * 0x1F + v10) * 0x1F + v11) * 961 + v12) * 961 + v13) * 0x1F + v3) * 0x1F + v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final void zza(zzfs zzfs0) throws IOException {
        long v = this.zzbjf;
        if(v != 0L) {
            zzfs0.zzi(1, v);
        }
        if(this.tag != null && !this.tag.equals("")) {
            zzfs0.zza(2, this.tag);
        }
        if(this.zzbjm != null && this.zzbjm.length > 0) {
            for(int v2 = 0; true; ++v2) {
                zzhb[] arr_zzhb = this.zzbjm;
                if(v2 >= arr_zzhb.length) {
                    break;
                }
                zzhb zzhb0 = arr_zzhb[v2];
                if(zzhb0 != null) {
                    zzfs0.zza(3, zzhb0);
                }
            }
        }
        byte[] arr_b = zzgb.zzse;
        if(!Arrays.equals(this.zzbjn, arr_b)) {
            zzfs0.zza(4, this.zzbjn);
        }
        if(!Arrays.equals(this.zzbjp, arr_b)) {
            zzfs0.zza(6, this.zzbjp);
        }
        zzgy zzgy0 = this.zzbjs;
        if(zzgy0 != null) {
            zzfs0.zza(7, zzgy0);
        }
        if(this.zzbjq != null && !this.zzbjq.equals("")) {
            zzfs0.zza(8, this.zzbjq);
        }
        zzd zzge$zzd0 = this.zzbjo;
        if(zzge$zzd0 != null) {
            zzfs0.zze(9, zzge$zzd0);
        }
        int v3 = this.zzbji;
        if(v3 != 0) {
            zzfs0.zzc(11, v3);
        }
        if(this.zzbjr != null && !this.zzbjr.equals("")) {
            zzfs0.zza(13, this.zzbjr);
        }
        if(this.zzbjt != null && !this.zzbjt.equals("")) {
            zzfs0.zza(14, this.zzbjt);
        }
        long v4 = this.zzbju;
        if(v4 != 180000L) {
            zzfs0.zzb(15, 0);
            zzfs0.zzn(v4 >> 0x3F ^ v4 << 1);
        }
        zzgz zzgz0 = this.zzbjv;
        if(zzgz0 != null) {
            zzfs0.zza(16, zzgz0);
        }
        long v5 = this.zzbjg;
        if(v5 != 0L) {
            zzfs0.zzi(17, v5);
        }
        if(!Arrays.equals(this.zzbjw, arr_b)) {
            zzfs0.zza(18, this.zzbjw);
        }
        if(this.zzbjz != null && this.zzbjz.length > 0) {
            for(int v1 = 0; true; ++v1) {
                int[] arr_v = this.zzbjz;
                if(v1 >= arr_v.length) {
                    break;
                }
                zzfs0.zzc(20, arr_v[v1]);
            }
        }
        zzs zzge$zzs0 = this.zzbkb;
        if(zzge$zzs0 != null) {
            zzfs0.zze(23, zzge$zzs0);
        }
        if(this.zzbjx != null && !this.zzbjx.equals("")) {
            zzfs0.zza(24, this.zzbjx);
        }
        if(this.zzbkc) {
            zzfs0.zzb(25, true);
        }
        if(this.zzbjj != null && !this.zzbjj.equals("")) {
            zzfs0.zza(26, this.zzbjj);
        }
        super.zza(zzfs0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    protected final int zzen() {
        int[] arr_v;
        int v = super.zzen();
        long v1 = this.zzbjf;
        if(v1 != 0L) {
            v += zzfs.zzd(1, v1);
        }
        if(this.tag != null && !this.tag.equals("")) {
            v += zzfs.zzb(2, this.tag);
        }
        if(this.zzbjm != null && this.zzbjm.length > 0) {
            for(int v3 = 0; true; ++v3) {
                zzhb[] arr_zzhb = this.zzbjm;
                if(v3 >= arr_zzhb.length) {
                    break;
                }
                zzhb zzhb0 = arr_zzhb[v3];
                if(zzhb0 != null) {
                    v += zzfs.zzb(3, zzhb0);
                }
            }
        }
        byte[] arr_b = zzgb.zzse;
        if(!Arrays.equals(this.zzbjn, arr_b)) {
            v += zzfs.zzb(4, this.zzbjn);
        }
        if(!Arrays.equals(this.zzbjp, arr_b)) {
            v += zzfs.zzb(6, this.zzbjp);
        }
        zzgy zzgy0 = this.zzbjs;
        if(zzgy0 != null) {
            v += zzfs.zzb(7, zzgy0);
        }
        if(this.zzbjq != null && !this.zzbjq.equals("")) {
            v += zzfs.zzb(8, this.zzbjq);
        }
        zzd zzge$zzd0 = this.zzbjo;
        if(zzge$zzd0 != null) {
            v += zzbn.zzc(9, zzge$zzd0);
        }
        int v4 = this.zzbji;
        if(v4 != 0) {
            v += zzfs.zzs(v4) + 1;
        }
        if(this.zzbjr != null && !this.zzbjr.equals("")) {
            v += zzfs.zzb(13, this.zzbjr);
        }
        if(this.zzbjt != null && !this.zzbjt.equals("")) {
            v += zzfs.zzb(14, this.zzbjt);
        }
        long v5 = this.zzbju;
        if(v5 != 180000L) {
            v += zzfs.zzo(v5 >> 0x3F ^ v5 << 1) + 1;
        }
        zzgz zzgz0 = this.zzbjv;
        if(zzgz0 != null) {
            v += zzfs.zzb(16, zzgz0);
        }
        long v6 = this.zzbjg;
        if(v6 != 0L) {
            v += zzfs.zzd(17, v6);
        }
        if(!Arrays.equals(this.zzbjw, arr_b)) {
            v += zzfs.zzb(18, this.zzbjw);
        }
        if(this.zzbjz != null && this.zzbjz.length > 0) {
            int v7 = 0;
            for(int v2 = 0; true; ++v2) {
                arr_v = this.zzbjz;
                if(v2 >= arr_v.length) {
                    break;
                }
                v7 += zzfs.zzs(arr_v[v2]);
            }
            v = v + v7 + arr_v.length * 2;
        }
        zzs zzge$zzs0 = this.zzbkb;
        if(zzge$zzs0 != null) {
            v += zzbn.zzc(23, zzge$zzs0);
        }
        if(this.zzbjx != null && !this.zzbjx.equals("")) {
            v += zzfs.zzb(24, this.zzbjx);
        }
        if(this.zzbkc) {
            v += 3;
        }
        return this.zzbjj == null || this.zzbjj.equals("") ? v : v + zzfs.zzb(26, this.zzbjj);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfu zzeo() throws CloneNotSupportedException {
        return (zzha)this.clone();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzfu
    public final zzfz zzep() throws CloneNotSupportedException {
        return (zzha)this.clone();
    }

    private final zzha zzgd() {
        zzhb[] arr_zzhb;
        zzha zzha0;
        try {
            zzha0 = (zzha)super.zzeo();
            arr_zzhb = this.zzbjm;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
        if(arr_zzhb != null && arr_zzhb.length > 0) {
            zzha0.zzbjm = new zzhb[arr_zzhb.length];
            for(int v = 0; true; ++v) {
                zzhb[] arr_zzhb1 = this.zzbjm;
                if(v >= arr_zzhb1.length) {
                    break;
                }
                zzhb zzhb0 = arr_zzhb1[v];
                if(zzhb0 != null) {
                    zzhb[] arr_zzhb2 = zzha0.zzbjm;
                    arr_zzhb2[v] = (zzhb)zzhb0.clone();
                }
            }
        }
        zzd zzge$zzd0 = this.zzbjo;
        if(zzge$zzd0 != null) {
            zzha0.zzbjo = zzge$zzd0;
        }
        zzgy zzgy0 = this.zzbjs;
        if(zzgy0 != null) {
            zzha0.zzbjs = (zzgy)zzgy0.clone();
        }
        zzgz zzgz0 = this.zzbjv;
        if(zzgz0 != null) {
            zzha0.zzbjv = (zzgz)zzgz0.clone();
        }
        int[] arr_v = this.zzbjz;
        if(arr_v != null && arr_v.length > 0) {
            zzha0.zzbjz = (int[])arr_v.clone();
        }
        zzs zzge$zzs0 = this.zzbkb;
        if(zzge$zzs0 != null) {
            zzha0.zzbkb = zzge$zzs0;
        }
        return zzha0;
    }
}

