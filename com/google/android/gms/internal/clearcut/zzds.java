package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import sun.misc.Unsafe;

final class zzds implements zzef {
    private static final Unsafe zzmh;
    private final int[] zzmi;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final zzdw zzmv;
    private final zzcy zzmw;
    private final zzex zzmx;
    private final zzbu zzmy;
    private final zzdj zzmz;

    static {
        zzds.zzmh = zzfd.zzef();
    }

    private zzds(int[] arr_v, Object[] arr_object, int v, int v1, int v2, zzdo zzdo0, boolean z, boolean z1, int[] arr_v1, int[] arr_v2, int[] arr_v3, zzdw zzdw0, zzcy zzcy0, zzex zzex0, zzbu zzbu0, zzdj zzdj0) {
        this.zzmi = arr_v;
        this.zzmj = arr_object;
        this.zzmk = v;
        this.zzml = v1;
        this.zzmm = v2;
        this.zzmp = zzdo0 instanceof zzcg;
        this.zzmq = z;
        this.zzmo = zzbu0 != null && zzbu0.zze(zzdo0);
        this.zzmr = false;
        this.zzms = arr_v1;
        this.zzmt = arr_v2;
        this.zzmu = arr_v3;
        this.zzmv = zzdw0;
        this.zzmw = zzcy0;
        this.zzmx = zzex0;
        this.zzmy = zzbu0;
        this.zzmn = zzdo0;
        this.zzmz = zzdj0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final boolean equals(Object object0, Object object1) {
        for(int v = 0; true; v += 4) {
            boolean z = true;
            if(v >= this.zzmi.length) {
                break;
            }
            int v1 = this.zzag(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzk(object0, v2) != zzfd.zzk(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 1: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzj(object0, v2) != zzfd.zzj(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 2: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzk(object0, v2) != zzfd.zzk(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 3: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzk(object0, v2) != zzfd.zzk(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 4: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzj(object0, v2) != zzfd.zzj(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 5: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzk(object0, v2) != zzfd.zzk(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 6: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzj(object0, v2) != zzfd.zzj(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 7: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzl(object0, v2) != zzfd.zzl(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 8: {
                    if(!this.zzc(object0, object1, v) || !zzeh.zzd(zzfd.zzo(object0, v2), zzfd.zzo(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 9: {
                    if(!this.zzc(object0, object1, v) || !zzeh.zzd(zzfd.zzo(object0, v2), zzfd.zzo(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 10: {
                    if(!this.zzc(object0, object1, v) || !zzeh.zzd(zzfd.zzo(object0, v2), zzfd.zzo(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 11: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzj(object0, v2) != zzfd.zzj(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 12: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzj(object0, v2) != zzfd.zzj(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 13: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzj(object0, v2) != zzfd.zzj(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 14: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzk(object0, v2) != zzfd.zzk(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 15: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzj(object0, v2) != zzfd.zzj(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 16: {
                    if(!this.zzc(object0, object1, v) || zzfd.zzk(object0, v2) != zzfd.zzk(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 17: {
                    if(!this.zzc(object0, object1, v) || !zzeh.zzd(zzfd.zzo(object0, v2), zzfd.zzo(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: 
                case 50: {
                    z = zzeh.zzd(zzfd.zzo(object0, v2), zzfd.zzo(object1, v2));
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    int v3 = this.zzah(v);
                    if(zzfd.zzj(object0, ((long)(v3 & 0xFFFFF))) != zzfd.zzj(object1, ((long)(v3 & 0xFFFFF))) || !zzeh.zzd(zzfd.zzo(object0, v2), zzfd.zzo(object1, v2))) {
                        z = false;
                    }
                }
            }
            if(!z) {
                return false;
            }
        }
        if(!this.zzmx.zzq(object0).equals(this.zzmx.zzq(object1))) {
            return false;
        }
        return this.zzmo ? this.zzmy.zza(object0).equals(this.zzmy.zza(object1)) : true;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final int hashCode(Object object0) {
        Object object1;
        long v6;
        int v1 = 0;
        for(int v = 0; v < this.zzmi.length; v += 4) {
            int v2 = this.zzag(v);
            int v3 = this.zzmi[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    v6 = Double.doubleToLongBits(zzfd.zzn(object0, v4));
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 1: {
                    v1 = v1 * 53 + Float.floatToIntBits(zzfd.zzm(object0, v4));
                    break;
                }
                case 7: {
                    v1 = v1 * 53 + zzci.zzc(zzfd.zzl(object0, v4));
                    break;
                }
                case 8: {
                    v1 = v1 * 53 + ((String)zzfd.zzo(object0, v4)).hashCode();
                    break;
                }
                case 9: {
                    object1 = zzfd.zzo(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 4: 
                case 6: 
                case 11: 
                case 12: 
                case 13: 
                case 15: {
                    v1 = v1 * 53 + zzfd.zzj(object0, v4);
                    break;
                }
                case 2: 
                case 3: 
                case 5: 
                case 14: 
                case 16: {
                    v6 = zzfd.zzk(object0, v4);
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 17: {
                    object1 = zzfd.zzo(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: 
                case 50: {
                    v1 = v1 * 53 + zzfd.zzo(object0, v4).hashCode();
                    break;
                }
                case 51: {
                    if(this.zza(object0, v3, v)) {
                        v6 = Double.doubleToLongBits(zzds.zze(object0, v4));
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 52: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + Float.floatToIntBits(zzds.zzf(object0, v4));
                    }
                    break;
                }
                case 53: {
                    if(this.zza(object0, v3, v)) {
                        v6 = zzds.zzh(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 54: {
                    if(this.zza(object0, v3, v)) {
                        v6 = zzds.zzh(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 55: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzds.zzg(object0, v4);
                    }
                    break;
                }
                case 56: {
                    if(this.zza(object0, v3, v)) {
                        v6 = zzds.zzh(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 57: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzds.zzg(object0, v4);
                    }
                    break;
                }
                case 58: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzci.zzc(zzds.zzi(object0, v4));
                    }
                    break;
                }
                case 59: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + ((String)zzfd.zzo(object0, v4)).hashCode();
                    }
                    break;
                }
                case 60: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzfd.zzo(object0, v4).hashCode();
                    }
                    break;
                }
                case 61: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzfd.zzo(object0, v4).hashCode();
                    }
                    break;
                }
                case 62: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzds.zzg(object0, v4);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzds.zzg(object0, v4);
                    }
                    break;
                }
                case 0x40: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzds.zzg(object0, v4);
                    }
                    break;
                }
                case 65: {
                    if(this.zza(object0, v3, v)) {
                        v6 = zzds.zzh(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 66: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzds.zzg(object0, v4);
                    }
                    break;
                }
                case 67: {
                    if(this.zza(object0, v3, v)) {
                        v6 = zzds.zzh(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 68: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzfd.zzo(object0, v4).hashCode();
                    }
                }
            }
        }
        int v7 = v1 * 53 + this.zzmx.zzq(object0).hashCode();
        return this.zzmo ? v7 * 53 + this.zzmy.zza(object0).hashCode() : v7;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final Object newInstance() {
        return this.zzmv.newInstance(this.zzmn);
    }

    private static int zza(int v, byte[] arr_b, int v1, int v2, Object object0, zzay zzay0) throws IOException {
        return zzax.zza(v, arr_b, v1, v2, zzds.zzn(object0), zzay0);
    }

    private static int zza(zzef zzef0, int v, byte[] arr_b, int v1, int v2, zzcn zzcn0, zzay zzay0) throws IOException {
        int v3;
        for(v3 = zzds.zza(zzef0, arr_b, v1, v2, zzay0); true; v3 = zzds.zza(zzef0, arr_b, v4, v2, zzay0)) {
            zzcn0.add(zzay0.zzff);
            if(v3 >= v2) {
                break;
            }
            int v4 = zzax.zza(arr_b, v3, zzay0);
            if(v != zzay0.zzfd) {
                break;
            }
        }
        return v3;
    }

    private static int zza(zzef zzef0, byte[] arr_b, int v, int v1, int v2, zzay zzay0) throws IOException {
        Object object0 = ((zzds)zzef0).newInstance();
        int v3 = ((zzds)zzef0).zza(object0, arr_b, v, v1, v2, zzay0);
        ((zzds)zzef0).zzc(object0);
        zzay0.zzff = object0;
        return v3;
    }

    private static int zza(zzef zzef0, byte[] arr_b, int v, int v1, zzay zzay0) throws IOException {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = zzax.zza(v3, arr_b, v2, zzay0);
            v3 = zzay0.zzfd;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzco.zzbl();
        }
        Object object0 = zzef0.newInstance();
        int v4 = v3 + v2;
        zzef0.zza(object0, arr_b, v2, v4, zzay0);
        zzef0.zzc(object0);
        zzay0.zzff = object0;
        return v4;
    }

    private static int zza(zzex zzex0, Object object0) {
        return zzex0.zzm(zzex0.zzq(object0));
    }

    private final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, int v8, zzay zzay0) throws IOException {
        int v11;
        int v10;
        Unsafe unsafe0 = zzds.zzmh;
        long v9 = (long)(this.zzmi[v8 + 2] & 0xFFFFF);
        switch(v6) {
            case 51: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, zzax.zze(arr_b, v));
                    v10 = v + 8;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 52: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, zzax.zzf(arr_b, v));
                    v10 = v + 4;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 53: 
            case 54: {
                if(v4 == 0) {
                    v10 = zzax.zzb(arr_b, v, zzay0);
                    unsafe0.putObject(object0, v7, zzay0.zzfe);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 58: {
                if(v4 == 0) {
                    v10 = zzax.zzb(arr_b, v, zzay0);
                    unsafe0.putObject(object0, v7, Boolean.valueOf(zzay0.zzfe != 0L));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 59: {
                if(v4 == 2) {
                    v10 = zzax.zza(arr_b, v, zzay0);
                    v11 = zzay0.zzfd;
                    if(v11 == 0) {
                        unsafe0.putObject(object0, v7, "");
                        unsafe0.putInt(object0, v9, v3);
                        return v10;
                    }
                    if((v5 & 0x20000000) != 0 && !zzff.zze(arr_b, v10, v10 + v11)) {
                        throw zzco.zzbp();
                    }
                    unsafe0.putObject(object0, v7, new String(arr_b, v10, v11, zzci.UTF_8));
                    v10 += v11;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 60: {
                if(v4 == 2) {
                    v10 = zzds.zza(this.zzad(v8), arr_b, v, v1, zzay0);
                    Object object1 = unsafe0.getInt(object0, v9) == v3 ? unsafe0.getObject(object0, v7) : null;
                    unsafe0.putObject(object0, v7, (object1 == null ? zzay0.zzff : zzci.zza(object1, zzay0.zzff)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 61: {
                if(v4 == 2) {
                    v10 = zzax.zza(arr_b, v, zzay0);
                    v11 = zzay0.zzfd;
                    if(v11 == 0) {
                        unsafe0.putObject(object0, v7, zzbb.zzfi);
                        unsafe0.putInt(object0, v9, v3);
                        return v10;
                    }
                    unsafe0.putObject(object0, v7, zzbb.zzb(arr_b, v10, v11));
                    v10 += v11;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 55: 
            case 62: {
                if(v4 == 0) {
                    v10 = zzax.zza(arr_b, v, zzay0);
                    unsafe0.putObject(object0, v7, zzay0.zzfd);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 0x3F: {
                if(v4 == 0) {
                    int v12 = zzax.zza(arr_b, v, zzay0);
                    int v13 = zzay0.zzfd;
                    zzck zzck0 = this.zzaf(v8);
                    if(zzck0 != null && zzck0.zzb(v13) == null) {
                        zzds.zzn(object0).zzb(v2, ((long)v13));
                        return v12;
                    }
                    unsafe0.putObject(object0, v7, v13);
                    unsafe0.putInt(object0, v9, v3);
                    return v12;
                }
                break;
            }
            case 57: 
            case 0x40: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, zzax.zzc(arr_b, v));
                    v10 = v + 4;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 56: 
            case 65: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, zzax.zzd(arr_b, v));
                    v10 = v + 8;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 66: {
                if(v4 == 0) {
                    v10 = zzax.zza(arr_b, v, zzay0);
                    unsafe0.putObject(object0, v7, ((int)(-(zzay0.zzfd & 1) ^ zzay0.zzfd >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 67: {
                if(v4 == 0) {
                    v10 = zzax.zzb(arr_b, v, zzay0);
                    unsafe0.putObject(object0, v7, ((long)(-(zzay0.zzfe & 1L) ^ zzay0.zzfe >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 68: {
                if(v4 == 3) {
                    v10 = zzds.zza(this.zzad(v8), arr_b, v, v1, v2 & -8 | 4, zzay0);
                    Object object2 = unsafe0.getInt(object0, v9) == v3 ? unsafe0.getObject(object0, v7) : null;
                    unsafe0.putObject(object0, v7, (object2 == null ? zzay0.zzff : zzci.zza(object2, zzay0.zzff)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    private final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, long v6, int v7, long v8, zzay zzay0) throws IOException {
        int v18;
        boolean z;
        int v11;
        String s1;
        int v23;
        String s;
        int v9 = v;
        Unsafe unsafe0 = zzds.zzmh;
        zzcn zzcn0 = (zzcn)unsafe0.getObject(object0, v8);
        if(!zzcn0.zzu()) {
            int v10 = zzcn0.size();
            zzcn0 = zzcn0.zzi((v10 == 0 ? 10 : v10 << 1));
            unsafe0.putObject(object0, v8, zzcn0);
        }
    alab1:
        switch(v7) {
            case 26: {
                if(v4 == 2) {
                    v9 = zzax.zza(arr_b, v9, zzay0);
                    if(Long.compare(v6 & 0x20000000L, 0L) == 0) {
                        int v20 = zzay0.zzfd;
                        if(v20 == 0) {
                            do {
                                zzcn0.add("");
                            label_126:
                                if(v9 >= v1) {
                                    break alab1;
                                }
                                int v21 = zzax.zza(arr_b, v9, zzay0);
                                if(v2 != zzay0.zzfd) {
                                    break alab1;
                                }
                                v9 = zzax.zza(arr_b, v21, zzay0);
                                v20 = zzay0.zzfd;
                            }
                            while(v20 == 0);
                        }
                        s = new String(arr_b, v9, v20, zzci.UTF_8);
                        zzcn0.add(s);
                        v9 += v20;
                        goto label_126;
                    }
                    else {
                        int v22 = zzay0.zzfd;
                        if(v22 == 0) {
                            zzcn0.add("");
                        }
                        else {
                            v23 = v9 + v22;
                            if(!zzff.zze(arr_b, v9, v23)) {
                                throw zzco.zzbp();
                            }
                            s1 = new String(arr_b, v9, v22, zzci.UTF_8);
                            zzcn0.add(s1);
                            v9 = v23;
                        }
                        while(true) {
                            if(v9 >= v1) {
                                break;
                            }
                            int v24 = zzax.zza(arr_b, v9, zzay0);
                            if(v2 != zzay0.zzfd) {
                                break;
                            }
                            v9 = zzax.zza(arr_b, v24, zzay0);
                            int v25 = zzay0.zzfd;
                            if(v25 == 0) {
                                zzcn0.add("");
                            }
                            else {
                                v23 = v9 + v25;
                                if(!zzff.zze(arr_b, v9, v23)) {
                                    throw zzco.zzbp();
                                }
                                s1 = new String(arr_b, v9, v25, zzci.UTF_8);
                                zzcn0.add(s1);
                                v9 = v23;
                            }
                        }
                    }
                }
                break;
            }
            case 27: {
                return v4 == 2 ? zzds.zza(this.zzad(v5), v2, arr_b, v, v1, zzcn0, zzay0) : v9;
            }
            case 28: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v26 = zzay0.zzfd;
                    if(v26 != 0) {
                        while(true) {
                            zzcn0.add(zzbb.zzb(arr_b, v11, v26));
                            v11 += v26;
                        label_165:
                            if(v11 >= v1) {
                                return v11;
                            }
                            int v27 = zzax.zza(arr_b, v11, zzay0);
                            if(v2 != zzay0.zzfd) {
                                return v11;
                            }
                            v11 = zzax.zza(arr_b, v27, zzay0);
                            int v28 = zzay0.zzfd;
                            if(v28 == 0) {
                                break;
                            }
                            v26 = v28;
                        }
                    }
                    zzcn0.add(zzbb.zzfi);
                    goto label_165;
                }
                break;
            }
            case 18: 
            case 35: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v12 = zzay0.zzfd + v11;
                    while(v11 < v12) {
                        ((zzbq)zzcn0).zzc(zzax.zze(arr_b, v11));
                        v11 += 8;
                    }
                    if(v11 != v12) {
                        throw zzco.zzbl();
                    }
                    return v11;
                }
                if(v4 == 1) {
                    ((zzbq)zzcn0).zzc(zzax.zze(arr_b, v));
                    while(true) {
                        v11 = v9 + 8;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzax.zza(arr_b, v11, zzay0);
                        if(v2 != zzay0.zzfd) {
                            return v11;
                        }
                        ((zzbq)zzcn0).zzc(zzax.zze(arr_b, v9));
                    }
                }
                break;
            }
            case 19: 
            case 36: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v13 = zzay0.zzfd + v11;
                    while(v11 < v13) {
                        ((zzce)zzcn0).zzc(zzax.zzf(arr_b, v11));
                        v11 += 4;
                    }
                    if(v11 != v13) {
                        throw zzco.zzbl();
                    }
                    return v11;
                }
                if(v4 == 5) {
                    ((zzce)zzcn0).zzc(zzax.zzf(arr_b, v));
                    while(true) {
                        v11 = v9 + 4;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzax.zza(arr_b, v11, zzay0);
                        if(v2 != zzay0.zzfd) {
                            return v11;
                        }
                        ((zzce)zzcn0).zzc(zzax.zzf(arr_b, v9));
                    }
                }
                break;
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v14 = zzay0.zzfd + v11;
                    while(v11 < v14) {
                        v11 = zzax.zzb(arr_b, v11, zzay0);
                        ((zzdc)zzcn0).zzm(zzay0.zzfe);
                    }
                    if(v11 != v14) {
                        throw zzco.zzbl();
                    }
                    return v11;
                }
                if(v4 == 0) {
                    while(true) {
                        v11 = zzax.zzb(arr_b, v9, zzay0);
                        ((zzdc)zzcn0).zzm(zzay0.zzfe);
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzax.zza(arr_b, v11, zzay0);
                        if(v2 != zzay0.zzfd) {
                            return v11;
                        }
                    }
                }
                break;
            }
            case 25: 
            case 42: {
                switch(v4) {
                    case 0: {
                        v9 = zzax.zzb(arr_b, v9, zzay0);
                        if(zzay0.zzfe == 0L) {
                            while(true) {
                                z = false;
                            label_102:
                                ((zzaz)zzcn0).addBoolean(z);
                                if(v9 >= v1) {
                                    break alab1;
                                }
                                int v17 = zzax.zza(arr_b, v9, zzay0);
                                if(v2 != zzay0.zzfd) {
                                    break alab1;
                                }
                                v9 = zzax.zzb(arr_b, v17, zzay0);
                                if(zzay0.zzfe != 0L) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        goto label_102;
                    }
                    case 2: {
                        v18 = zzax.zza(arr_b, v9, zzay0);
                        int v19 = zzay0.zzfd + v18;
                        while(v18 < v19) {
                            v18 = zzax.zzb(arr_b, v18, zzay0);
                            ((zzaz)zzcn0).addBoolean(zzay0.zzfe != 0L);
                        }
                        if(v18 != v19) {
                            throw zzco.zzbl();
                        }
                        return v18;
                    }
                    default: {
                        return v9;
                    }
                }
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if(v4 == 2) {
                    return zzax.zza(arr_b, v9, zzcn0, zzay0);
                }
                return v4 == 0 ? zzax.zza(v2, arr_b, v, v1, zzcn0, zzay0) : v9;
            }
            case 30: 
            case 44: {
                if(v4 == 2) {
                    v18 = zzax.zza(arr_b, v9, zzcn0, zzay0);
                }
                else if(v4 == 0) {
                    v18 = zzax.zza(v2, arr_b, v, v1, zzcn0, zzay0);
                }
                else {
                    break;
                }
                zzey zzey0 = ((zzcg)object0).zzjp;
                if(zzey0 == zzey.zzea()) {
                    zzey0 = null;
                }
                zzey zzey1 = (zzey)zzeh.zza(v3, zzcn0, this.zzaf(v5), zzey0, this.zzmx);
                if(zzey1 != null) {
                    ((zzcg)object0).zzjp = zzey1;
                }
                return v18;
            }
            case 24: 
            case 0x1F: 
            case 41: 
            case 45: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v16 = zzay0.zzfd + v11;
                    while(v11 < v16) {
                        ((zzch)zzcn0).zzac(zzax.zzc(arr_b, v11));
                        v11 += 4;
                    }
                    if(v11 != v16) {
                        throw zzco.zzbl();
                    }
                    return v11;
                }
                if(v4 == 5) {
                    ((zzch)zzcn0).zzac(zzax.zzc(arr_b, v));
                    while(true) {
                        v11 = v9 + 4;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzax.zza(arr_b, v11, zzay0);
                        if(v2 != zzay0.zzfd) {
                            return v11;
                        }
                        ((zzch)zzcn0).zzac(zzax.zzc(arr_b, v9));
                    }
                }
                break;
            }
            case 23: 
            case 0x20: 
            case 40: 
            case 46: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v15 = zzay0.zzfd + v11;
                    while(v11 < v15) {
                        ((zzdc)zzcn0).zzm(zzax.zzd(arr_b, v11));
                        v11 += 8;
                    }
                    if(v11 != v15) {
                        throw zzco.zzbl();
                    }
                    return v11;
                }
                if(v4 == 1) {
                    ((zzdc)zzcn0).zzm(zzax.zzd(arr_b, v));
                    while(true) {
                        v11 = v9 + 8;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzax.zza(arr_b, v11, zzay0);
                        if(v2 != zzay0.zzfd) {
                            return v11;
                        }
                        ((zzdc)zzcn0).zzm(zzax.zzd(arr_b, v9));
                    }
                }
                break;
            }
            case 33: 
            case 0x2F: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v29 = zzay0.zzfd + v11;
                    while(v11 < v29) {
                        v11 = zzax.zza(arr_b, v11, zzay0);
                        ((zzch)zzcn0).zzac(-(zzay0.zzfd & 1) ^ zzay0.zzfd >>> 1);
                    }
                    if(v11 != v29) {
                        throw zzco.zzbl();
                    }
                    return v11;
                }
                if(v4 == 0) {
                    while(true) {
                        v11 = zzax.zza(arr_b, v9, zzay0);
                        ((zzch)zzcn0).zzac(-(zzay0.zzfd & 1) ^ zzay0.zzfd >>> 1);
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzax.zza(arr_b, v11, zzay0);
                        if(v2 != zzay0.zzfd) {
                            return v11;
                        }
                    }
                }
                break;
            }
            case 34: 
            case 0x30: {
                if(v4 == 2) {
                    v11 = zzax.zza(arr_b, v9, zzay0);
                    int v30 = zzay0.zzfd + v11;
                    while(v11 < v30) {
                        v11 = zzax.zzb(arr_b, v11, zzay0);
                        ((zzdc)zzcn0).zzm(-(zzay0.zzfe & 1L) ^ zzay0.zzfe >>> 1);
                    }
                    if(v11 != v30) {
                        throw zzco.zzbl();
                    }
                    return v11;
                }
                if(v4 == 0) {
                    do {
                        v11 = zzax.zzb(arr_b, v9, zzay0);
                        ((zzdc)zzcn0).zzm(-(zzay0.zzfe & 1L) ^ zzay0.zzfe >>> 1);
                        if(v11 >= v1) {
                            break;
                        }
                        v9 = zzax.zza(arr_b, v11, zzay0);
                    }
                    while(v2 == zzay0.zzfd);
                    return v11;
                }
                break;
            }
            case 49: {
                if(v4 == 3) {
                    zzef zzef0 = this.zzad(v5);
                    int v31 = v2 & -8 | 4;
                    for(v9 = zzds.zza(zzef0, arr_b, v, v1, v31, zzay0); true; v9 = zzds.zza(zzef0, arr_b, v32, v1, v31, zzay0)) {
                        zzcn0.add(zzay0.zzff);
                        if(v9 >= v1) {
                            break;
                        }
                        int v32 = zzax.zza(arr_b, v9, zzay0);
                        if(v2 != zzay0.zzfd) {
                            break;
                        }
                    }
                }
                break;
            }
            default: {
                return v9;
            }
        }
        return v9;
    }

    private final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, long v4, zzay zzay0) throws IOException {
        Unsafe unsafe0 = zzds.zzmh;
        Object object1 = this.zzae(v2);
        Object object2 = unsafe0.getObject(object0, v4);
        if(this.zzmz.zzi(object2)) {
            Object object3 = this.zzmz.zzk(object1);
            this.zzmz.zzb(object3, object2);
            unsafe0.putObject(object0, v4, object3);
            object2 = object3;
        }
        zzdh zzdh0 = this.zzmz.zzl(object1);
        Map map0 = this.zzmz.zzg(object2);
        int v5 = zzax.zza(arr_b, v, zzay0);
        int v6 = zzay0.zzfd;
        if(v6 < 0 || v6 > v1 - v5) {
            throw zzco.zzbl();
        }
        int v7 = v6 + v5;
        Object object4 = zzdh0.zzmc;
        Object object5 = zzdh0.zzdu;
        while(v5 < v7) {
            int v8 = v5 + 1;
            int v9 = arr_b[v5];
            if(v9 < 0) {
                v8 = zzax.zza(v9, arr_b, v8, zzay0);
                v9 = zzay0.zzfd;
            }
            switch(v9 >>> 3) {
                case 1: {
                    if((v9 & 7) == zzdh0.zzmb.zzel()) {
                        v5 = zzds.zza(arr_b, v8, v1, zzdh0.zzmb, null, zzay0);
                        object4 = zzay0.zzff;
                        continue;
                    }
                    break;
                }
                case 2: {
                    if((v9 & 7) == zzdh0.zzmd.zzel()) {
                        Class class0 = zzdh0.zzdu.getClass();
                        v5 = zzds.zza(arr_b, v8, v1, zzdh0.zzmd, class0, zzay0);
                        object5 = zzay0.zzff;
                        continue;
                    }
                }
            }
            v5 = zzax.zza(v9, arr_b, v8, v1, zzay0);
        }
        if(v5 != v7) {
            throw zzco.zzbo();
        }
        map0.put(object4, object5);
        return v7;
    }

    private final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, zzay zzay0) throws IOException {
        int v35;
        int v34;
        int v33;
        int v32;
        int v31;
        int v30;
        int v29;
        int v27;
        int v26;
        int v25;
        int v21;
        int v20;
        int v19;
        int v18;
        int v9;
        int v8;
        Unsafe unsafe0 = zzds.zzmh;
        int v3 = v;
        int v4 = 0;
        int v5 = 0;
        int v6 = -1;
        while(true) {
            if(v3 >= v1) {
                v34 = v3;
                v35 = v4;
                v33 = v6;
                v32 = v5;
                break;
            }
            int v7 = arr_b[v3];
            if(v7 < 0) {
                v8 = zzax.zza(v7, arr_b, v3 + 1, zzay0);
                v9 = zzay0.zzfd;
            }
            else {
                v9 = v7;
                v8 = v3 + 1;
            }
            int v10 = this.zzai(v9 >>> 3);
            if(v10 == -1) {
                v30 = v8;
                v31 = v9;
                v29 = v5;
                v27 = v6;
            }
            else {
                int[] arr_v = this.zzmi;
                int v11 = arr_v[v10 + 1];
                int v12 = (v11 & 0xFF00000) >>> 20;
                long v13 = (long)(v11 & 0xFFFFF);
                int v14 = v11;
                if(v12 <= 17) {
                    int v15 = arr_v[v10 + 2];
                    boolean z = true;
                    int v16 = 1 << (v15 >>> 20);
                    int v17 = v15 & 0xFFFFF;
                    if(v17 == v6) {
                        v18 = v10;
                    }
                    else {
                        v18 = v10;
                        if(v6 != -1) {
                            unsafe0.putInt(object0, ((long)v6), v5);
                        }
                        v6 = v17;
                        v5 = unsafe0.getInt(object0, ((long)v17));
                    }
                    switch(v12) {
                        case 0: {
                            v19 = v9;
                            v20 = v6;
                            v21 = v8;
                            if((v9 & 7) == 1) {
                                zzfd.zza(object0, v13, zzax.zze(arr_b, v21));
                                v3 = v21 + 8;
                                v5 |= v16;
                                v4 = v19;
                                v6 = v20;
                                continue;
                            }
                            break;
                        }
                        case 1: {
                            v19 = v9;
                            v20 = v6;
                            v21 = v8;
                            if((v9 & 7) == 5) {
                                zzfd.zza(object0, v13, zzax.zzf(arr_b, v21));
                                v3 = v21 + 4;
                                v5 |= v16;
                                v4 = v19;
                                v6 = v20;
                                continue;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v19 = v9;
                            v20 = v6;
                            v21 = v8;
                            if((v9 & 7) == 0) {
                                int v22 = zzax.zzb(arr_b, v21, zzay0);
                                unsafe0.putLong(object0, v13, zzay0.zzfe);
                                v5 |= v16;
                                v3 = v22;
                                v4 = v19;
                                v6 = v20;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                            v19 = v9;
                            if((v9 & 7) == 0) {
                                v3 = zzax.zzb(arr_b, v8, zzay0);
                                if(zzay0.zzfe == 0L) {
                                    z = false;
                                }
                                zzfd.zza(object0, v13, z);
                                v5 |= v16;
                                v4 = v19;
                                continue;
                            }
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 8: {
                            v19 = v9;
                            if((v9 & 7) == 2) {
                                v3 = (v14 & 0x20000000) == 0 ? zzax.zzc(arr_b, v8, zzay0) : zzax.zzd(arr_b, v8, zzay0);
                                unsafe0.putObject(object0, v13, zzay0.zzff);
                                v5 |= v16;
                                v4 = v19;
                                continue;
                            }
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 9: {
                            v19 = v9;
                            if((v9 & 7) == 2) {
                                v3 = zzds.zza(this.zzad(v18), arr_b, v8, v1, zzay0);
                                unsafe0.putObject(object0, v13, ((v5 & v16) == 0 ? zzay0.zzff : zzci.zza(unsafe0.getObject(object0, v13), zzay0.zzff)));
                                v5 |= v16;
                                v4 = v19;
                                continue;
                            }
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 10: {
                            v19 = v9;
                            if((v9 & 7) == 2) {
                                v3 = zzax.zze(arr_b, v8, zzay0);
                                unsafe0.putObject(object0, v13, zzay0.zzff);
                                v5 |= v16;
                                v4 = v19;
                                continue;
                            }
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 4: 
                        case 11: {
                            v19 = v9;
                            v20 = v6;
                            v21 = v8;
                            if((v9 & 7) == 0) {
                                v3 = zzax.zza(arr_b, v21, zzay0);
                                unsafe0.putInt(object0, v13, zzay0.zzfd);
                                v5 |= v16;
                                v4 = v19;
                                v6 = v20;
                                continue;
                            }
                            break;
                        }
                        case 12: {
                            if((v9 & 7) == 0) {
                                v3 = zzax.zza(arr_b, v8, zzay0);
                                int v23 = zzay0.zzfd;
                                zzck zzck0 = this.zzaf(v18);
                                if(zzck0 != null && zzck0.zzb(v23) == null) {
                                    v19 = v9;
                                    zzds.zzn(object0).zzb(v19, ((long)v23));
                                }
                                else {
                                    v19 = v9;
                                    unsafe0.putInt(object0, v13, v23);
                                    v5 |= v16;
                                }
                                v4 = v19;
                                continue;
                            }
                            else {
                                v19 = v9;
                            }
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 6: 
                        case 13: {
                            v19 = v9;
                            if((v9 & 7) == 5) {
                                unsafe0.putInt(object0, v13, zzax.zzc(arr_b, v8));
                                v3 = v8 + 4;
                                v5 |= v16;
                                v4 = v19;
                                continue;
                            }
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 5: 
                        case 14: {
                            v19 = v9;
                            if((v9 & 7) == 1) {
                                unsafe0.putLong(object0, v13, zzax.zzd(arr_b, v8));
                                v3 = v8 + 8;
                                v5 |= v16;
                                v4 = v19;
                                continue;
                            }
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 15: {
                            if((v9 & 7) == 0) {
                                v3 = zzax.zza(arr_b, v8, zzay0);
                                unsafe0.putInt(object0, v13, -(zzay0.zzfd & 1) ^ zzay0.zzfd >>> 1);
                                v5 |= v16;
                                v4 = v9;
                                continue;
                            }
                            v19 = v9;
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 16: {
                            if((v9 & 7) == 0) {
                                int v24 = zzax.zzb(arr_b, v8, zzay0);
                                unsafe0.putLong(object0, v13, -(zzay0.zzfe & 1L) ^ zzay0.zzfe >>> 1);
                                v5 |= v16;
                                v3 = v24;
                                v4 = v9;
                                continue;
                            }
                            v19 = v9;
                            v20 = v6;
                            v21 = v8;
                            break;
                        }
                        case 17: {
                            if((v9 & 7) == 3) {
                                v3 = zzds.zza(this.zzad(v18), arr_b, v8, v1, v9 >>> 3 << 3 | 4, zzay0);
                                unsafe0.putObject(object0, v13, ((v5 & v16) == 0 ? zzay0.zzff : zzci.zza(unsafe0.getObject(object0, v13), zzay0.zzff)));
                                v5 |= v16;
                                v4 = v9;
                                continue;
                            }
                            else {
                                v19 = v9;
                                v20 = v6;
                                v21 = v8;
                            }
                            break;
                        }
                        default: {
                            v19 = v9;
                            v20 = v6;
                            v21 = v8;
                        }
                    }
                    v25 = v21;
                    v26 = v19;
                    v6 = v20;
                    goto label_204;
                }
                else {
                    v27 = v6;
                    if(v12 == 27) {
                        if((v9 & 7) == 2) {
                            zzcn zzcn0 = (zzcn)unsafe0.getObject(object0, v13);
                            if(!zzcn0.zzu()) {
                                int v28 = zzcn0.size();
                                zzcn0 = zzcn0.zzi((v28 == 0 ? 10 : v28 << 1));
                                unsafe0.putObject(object0, v13, zzcn0);
                            }
                            v4 = v9;
                            v3 = zzds.zza(this.zzad(v10), v4, arr_b, v8, v1, zzcn0, zzay0);
                            v6 = v27;
                            continue;
                        }
                        else {
                            v29 = v5;
                            v30 = v8;
                            v31 = v9;
                            goto label_200;
                        }
                        goto label_173;
                    }
                    else {
                    label_173:
                        if(v12 <= 49) {
                            v29 = v5;
                            v31 = v9;
                            v3 = this.zza(object0, arr_b, v8, v1, v9, v9 >>> 3, v9 & 7, v10, ((long)v14), v12, v13, zzay0);
                            if(v3 == v8) {
                                v25 = v3;
                                goto label_201;
                            }
                            else {
                                v6 = v27;
                                v4 = v31;
                                v5 = v29;
                                continue;
                            }
                            goto label_179;
                        }
                        else {
                        label_179:
                            v29 = v5;
                            v30 = v8;
                            v31 = v9;
                            if(v12 != 50) {
                                v3 = this.zza(object0, arr_b, v30, v1, v31, v9 >>> 3, v9 & 7, v14, v12, v13, v10, zzay0);
                                if(v3 == v30) {
                                    v25 = v3;
                                    goto label_201;
                                }
                                v6 = v27;
                                v4 = v31;
                                v5 = v29;
                                continue;
                            }
                            else if((v9 & 7) == 2) {
                                v3 = this.zza(object0, arr_b, v30, v1, v10, v9 >>> 3, v13, zzay0);
                                if(v3 == v30) {
                                    v25 = v3;
                                    goto label_201;
                                }
                                v6 = v27;
                                v4 = v31;
                                v5 = v29;
                                continue;
                            }
                        }
                    }
                }
            }
        label_200:
            v25 = v30;
        label_201:
            v6 = v27;
            v26 = v31;
            v5 = v29;
        label_204:
            if(v26 == v2 && v2 != 0) {
                v32 = v5;
                v33 = v6;
                v34 = v25;
                v35 = v26;
                break;
            }
            v3 = zzds.zza(v26, arr_b, v25, v1, object0, zzay0);
            v4 = v26;
        }
        if(v33 != -1) {
            unsafe0.putInt(object0, ((long)v33), v32);
        }
        int[] arr_v1 = this.zzmt;
        if(arr_v1 != null) {
            zzey zzey0 = null;
            for(int v36 = 0; v36 < arr_v1.length; ++v36) {
                int v37 = arr_v1[v36];
                zzex zzex0 = this.zzmx;
                int v38 = this.zzmi[v37];
                Object object1 = zzfd.zzo(object0, ((long)(this.zzag(v37) & 0xFFFFF)));
                if(object1 != null) {
                    zzck zzck1 = this.zzaf(v37);
                    if(zzck1 != null) {
                        zzey0 = this.zza(v37, v38, this.zzmz.zzg(object1), zzck1, zzey0, zzex0);
                    }
                }
            }
            if(zzey0 != null) {
                this.zzmx.zzf(object0, zzey0);
            }
        }
        if(v2 == 0) {
            if(v34 != v1) {
                throw zzco.zzbo();
            }
            return v34;
        }
        if(v34 > v1 || v35 != v2) {
            throw zzco.zzbo();
        }
        return v34;
    }

    private static int zza(byte[] arr_b, int v, int v1, zzfl zzfl0, Class class0, zzay zzay0) throws IOException {
        Integer integer1;
        Double double0;
        Integer integer0;
        int v2;
        switch(zzfl0) {
            case 1: {
                v2 = zzax.zzb(arr_b, v, zzay0);
                integer0 = Boolean.valueOf(zzay0.zzfe != 0L);
                break;
            }
            case 2: {
                return zzax.zze(arr_b, v, zzay0);
            }
            case 3: {
                double0 = zzax.zze(arr_b, v);
                zzay0.zzff = double0;
                return v + 8;
            }
            case 4: 
            case 5: {
                integer1 = zzax.zzc(arr_b, v);
                zzay0.zzff = integer1;
                return v + 4;
            }
            case 6: 
            case 7: {
                double0 = zzax.zzd(arr_b, v);
                zzay0.zzff = double0;
                return v + 8;
            }
            case 8: {
                integer1 = zzax.zzf(arr_b, v);
                zzay0.zzff = integer1;
                return v + 4;
            }
            case 9: 
            case 10: 
            case 11: {
                v2 = zzax.zza(arr_b, v, zzay0);
                integer0 = zzay0.zzfd;
                break;
            }
            case 12: 
            case 13: {
                v2 = zzax.zzb(arr_b, v, zzay0);
                integer0 = zzay0.zzfe;
                break;
            }
            case 14: {
                return zzds.zza(zzea.zzcm().zze(class0), arr_b, v, v1, zzay0);
            }
            case 15: {
                v2 = zzax.zza(arr_b, v, zzay0);
                integer0 = (int)(-(zzay0.zzfd & 1) ^ zzay0.zzfd >>> 1);
                break;
            }
            case 16: {
                v2 = zzax.zzb(arr_b, v, zzay0);
                integer0 = (long)(-(zzay0.zzfe & 1L) ^ zzay0.zzfe >>> 1);
                break;
            }
            case 17: {
                return zzax.zzd(arr_b, v, zzay0);
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
        zzay0.zzff = integer0;
        return v2;
    }

    static zzds zza(Class class0, zzdm zzdm0, zzdw zzdw0, zzcy zzcy0, zzex zzex0, zzbu zzbu0, zzdj zzdj0) {
        int v12;
        int v11;
        int v10;
        int v2;
        int v1;
        int v;
        if(zzdm0 instanceof zzec) {
            boolean z = ((zzec)zzdm0).zzcf() == zzg.zzkm;
            if(((zzec)zzdm0).getFieldCount() == 0) {
                v = 0;
                v1 = 0;
                v2 = 0;
            }
            else {
                int v3 = ((zzec)zzdm0).zzcp();
                int v4 = ((zzec)zzdm0).zzcq();
                v = ((zzec)zzdm0).zzcu();
                v1 = v3;
                v2 = v4;
            }
            int[] arr_v = new int[v << 2];
            Object[] arr_object = new Object[v << 1];
            int[] arr_v1 = ((zzec)zzdm0).zzcr() <= 0 ? null : new int[((zzec)zzdm0).zzcr()];
            int[] arr_v2 = ((zzec)zzdm0).zzcs() <= 0 ? null : new int[((zzec)zzdm0).zzcs()];
            zzed zzed0 = ((zzec)zzdm0).zzco();
            if(zzed0.next()) {
                int v5 = zzed0.zzcx();
                int v7 = 0;
                int v8 = 0;
                for(int v6 = 0; true; v6 += 4) {
                    if(v5 >= ((zzec)zzdm0).zzcv() || v6 >= v5 - v1 << 2) {
                        if(zzed0.zzda()) {
                            v10 = (int)zzfd.zza(zzed0.zzdb());
                            v11 = (int)zzfd.zza(zzed0.zzdc());
                            v12 = 0;
                        }
                        else {
                            v10 = (int)zzfd.zza(zzed0.zzdd());
                            if(zzed0.zzde()) {
                                v11 = (int)zzfd.zza(zzed0.zzdf());
                                v12 = zzed0.zzdg();
                            }
                            else {
                                v12 = 0;
                                v11 = 0;
                            }
                        }
                        arr_v[v6] = zzed0.zzcx();
                        arr_v[v6 + 1] = (zzed0.zzdi() ? 0x20000000 : 0) | (zzed0.zzdh() ? 0x10000000 : 0) | zzed0.zzcy() << 20 | v10;
                        arr_v[v6 + 2] = v12 << 20 | v11;
                        if(zzed0.zzdl() != null) {
                            int v13 = v6 / 4 << 1;
                            arr_object[v13] = zzed0.zzdl();
                            if(zzed0.zzdj() != null) {
                                arr_object[v13 + 1] = zzed0.zzdj();
                            }
                            else if(zzed0.zzdk() != null) {
                                arr_object[v13 + 1] = zzed0.zzdk();
                            }
                        }
                        else if(zzed0.zzdj() != null) {
                            arr_object[(v6 / 4 << 1) + 1] = zzed0.zzdj();
                        }
                        else if(zzed0.zzdk() != null) {
                            arr_object[(v6 / 4 << 1) + 1] = zzed0.zzdk();
                        }
                        int v14 = zzed0.zzcy();
                        if(v14 == zzcb.zziw.ordinal()) {
                            arr_v1[v7] = v6;
                            ++v7;
                        }
                        else if(v14 >= 18 && v14 <= 49) {
                            arr_v2[v8] = arr_v[v6 + 1] & 0xFFFFF;
                            ++v8;
                        }
                        if(!zzed0.next()) {
                            break;
                        }
                        v5 = zzed0.zzcx();
                    }
                    else {
                        for(int v9 = 0; v9 < 4; ++v9) {
                            arr_v[v6 + v9] = -1;
                        }
                    }
                }
            }
            return new zzds(arr_v, arr_object, v1, v2, ((zzec)zzdm0).zzcv(), ((zzec)zzdm0).zzch(), z, false, ((zzec)zzdm0).zzct(), arr_v1, arr_v2, zzdw0, zzcy0, zzex0, zzbu0, zzdj0);
        }
        ((zzes)zzdm0).zzcf();
        throw new NoSuchMethodError();
    }

    private final Object zza(int v, int v1, Map map0, zzck zzck0, Object object0, zzex zzex0) {
        Object object1 = this.zzae(v);
        zzdh zzdh0 = this.zzmz.zzl(object1);
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object2;
            if(zzck0.zzb(((int)(((Integer)map$Entry0.getValue())))) == null) {
                if(object0 == null) {
                    object0 = zzex0.zzdz();
                }
                zzbg zzbg0 = zzbb.zzk(zzdg.zza(zzdh0, map$Entry0.getKey(), map$Entry0.getValue()));
                zzbn zzbn0 = zzbg0.zzae();
                try {
                    zzdg.zza(zzbn0, zzdh0, map$Entry0.getKey(), map$Entry0.getValue());
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                zzex0.zza(object0, v1, zzbg0.zzad());
                iterator0.remove();
            }
        }
        return object0;
    }

    private static void zza(int v, Object object0, zzfr zzfr0) throws IOException {
        if(object0 instanceof String) {
            zzfr0.zza(v, ((String)object0));
            return;
        }
        zzfr0.zza(v, ((zzbb)object0));
    }

    private static void zza(zzex zzex0, Object object0, zzfr zzfr0) throws IOException {
        zzex0.zza(zzex0.zzq(object0), zzfr0);
    }

    private final void zza(zzfr zzfr0, int v, Object object0, int v1) throws IOException {
        if(object0 != null) {
            Object object1 = this.zzae(v1);
            zzfr0.zza(v, this.zzmz.zzl(object1), this.zzmz.zzh(object0));
        }
    }

    private final void zza(Object object0, Object object1, int v) {
        int v1 = this.zzag(v);
        if(!this.zza(object1, v)) {
            return;
        }
        Object object2 = zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)));
        Object object3 = zzfd.zzo(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 != null && object3 != null) {
            zzfd.zza(object0, ((long)(v1 & 0xFFFFF)), zzci.zza(object2, object3));
            this.zzb(object0, v);
            return;
        }
        if(object3 != null) {
            zzfd.zza(object0, ((long)(v1 & 0xFFFFF)), object3);
            this.zzb(object0, v);
        }
    }

    private final boolean zza(Object object0, int v) {
        if(this.zzmq) {
            int v1 = this.zzag(v);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    return zzfd.zzn(object0, ((long)(v1 & 0xFFFFF))) != 0.0;
                }
                case 1: {
                    return zzfd.zzm(object0, ((long)(v1 & 0xFFFFF))) != 0.0f;
                }
                case 2: {
                    return zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return zzfd.zzl(object0, ((long)(v1 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzbb)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzbb.zzfi.equals(object1);
                }
                case 9: {
                    return zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)));
                    return !zzbb.zzfi.equals(object2);
                }
                case 11: {
                    return zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        int v2 = this.zzah(v);
        return (zzfd.zzj(object0, ((long)(v2 & 0xFFFFF))) & 1 << (v2 >>> 20)) != 0;
    }

    private final boolean zza(Object object0, int v, int v1) {
        return zzfd.zzj(object0, ((long)(this.zzah(v1) & 0xFFFFF))) == v;
    }

    // 去混淆评级： 低(20)
    private final boolean zza(Object object0, int v, int v1, int v2) {
        return this.zzmq ? this.zza(object0, v) : (v1 & v2) != 0;
    }

    private static boolean zza(Object object0, int v, zzef zzef0) {
        return zzef0.zzo(zzfd.zzo(object0, ((long)(v & 0xFFFFF))));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zza(Object object0, zzfr zzfr0) throws IOException {
        Map.Entry map$Entry1;
        Iterator iterator1;
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(zzfr0.zzaj() == zzg.zzkp) {
            zzds.zza(this.zzmx, object0, zzfr0);
            if(this.zzmo) {
                zzby zzby0 = this.zzmy.zza(object0);
                if(zzby0.isEmpty()) {
                    iterator0 = null;
                    map$Entry0 = null;
                }
                else {
                    iterator0 = zzby0.descendingIterator();
                    Object object1 = iterator0.next();
                    map$Entry0 = (Map.Entry)object1;
                }
            }
            else {
                iterator0 = null;
                map$Entry0 = null;
            }
            for(int v = this.zzmi.length - 4; v >= 0; v -= 4) {
                int v1 = this.zzag(v);
                int v2 = this.zzmi[v];
                while(map$Entry0 != null && this.zzmy.zza(map$Entry0) > v2) {
                    this.zzmy.zza(zzfr0, map$Entry0);
                    if(iterator0.hasNext()) {
                        Object object2 = iterator0.next();
                        map$Entry0 = (Map.Entry)object2;
                    }
                    else {
                        map$Entry0 = null;
                    }
                }
                switch((v1 & 0xFF00000) >>> 20) {
                    case 0: {
                        if(this.zza(object0, v)) {
                            zzfr0.zza(v2, zzfd.zzn(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.zza(object0, v)) {
                            zzfr0.zza(v2, zzfd.zzm(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzi(v2, zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.zza(object0, v)) {
                            zzfr0.zza(v2, zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzc(v2, zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzc(v2, zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzf(v2, zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzb(v2, zzfd.zzl(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.zza(object0, v)) {
                            zzds.zza(v2, zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))), zzfr0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.zza(object0, v)) {
                            zzfr0.zza(v2, zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))), this.zzad(v));
                        }
                        break;
                    }
                    case 10: {
                        if(this.zza(object0, v)) {
                            zzfr0.zza(v2, ((zzbb)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzd(v2, zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzn(v2, zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzm(v2, zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzj(v2, zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.zza(object0, v)) {
                            zzfr0.zze(v2, zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzb(v2, zzfd.zzk(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.zza(object0, v)) {
                            zzfr0.zzb(v2, zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))), this.zzad(v));
                        }
                        break;
                    }
                    case 18: {
                        zzeh.zza(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 19: {
                        zzeh.zzb(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 20: {
                        zzeh.zzc(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 21: {
                        zzeh.zzd(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 22: {
                        zzeh.zzh(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 23: {
                        zzeh.zzf(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 24: {
                        zzeh.zzk(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 25: {
                        zzeh.zzn(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 26: {
                        zzeh.zza(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0);
                        break;
                    }
                    case 27: {
                        zzeh.zza(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, this.zzad(v));
                        break;
                    }
                    case 28: {
                        zzeh.zzb(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0);
                        break;
                    }
                    case 29: {
                        zzeh.zzi(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 30: {
                        zzeh.zzm(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 0x1F: {
                        zzeh.zzl(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 0x20: {
                        zzeh.zzg(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 33: {
                        zzeh.zzj(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 34: {
                        zzeh.zze(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 35: {
                        zzeh.zza(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 36: {
                        zzeh.zzb(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 37: {
                        zzeh.zzc(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 38: {
                        zzeh.zzd(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 39: {
                        zzeh.zzh(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 40: {
                        zzeh.zzf(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 41: {
                        zzeh.zzk(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 42: {
                        zzeh.zzn(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 43: {
                        zzeh.zzi(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 44: {
                        zzeh.zzm(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 45: {
                        zzeh.zzl(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 46: {
                        zzeh.zzg(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 0x2F: {
                        zzeh.zzj(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 0x30: {
                        zzeh.zze(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 49: {
                        zzeh.zzb(this.zzmi[v], ((List)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))), zzfr0, this.zzad(v));
                        break;
                    }
                    case 50: {
                        this.zza(zzfr0, v2, zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))), v);
                        break;
                    }
                    case 51: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zza(v2, zzds.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zza(v2, zzds.zzf(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzi(v2, zzds.zzh(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zza(v2, zzds.zzh(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzc(v2, zzds.zzg(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzc(v2, zzds.zzh(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzf(v2, zzds.zzg(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzb(v2, zzds.zzi(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 59: {
                        if(this.zza(object0, v2, v)) {
                            zzds.zza(v2, zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))), zzfr0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zza(v2, zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))), this.zzad(v));
                        }
                        break;
                    }
                    case 61: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zza(v2, ((zzbb)zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzd(v2, zzds.zzg(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzn(v2, zzds.zzg(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzm(v2, zzds.zzg(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzj(v2, zzds.zzh(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zze(v2, zzds.zzg(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzb(v2, zzds.zzh(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.zza(object0, v2, v)) {
                            zzfr0.zzb(v2, zzfd.zzo(object0, ((long)(v1 & 0xFFFFF))), this.zzad(v));
                        }
                    }
                }
            }
            while(map$Entry0 != null) {
                this.zzmy.zza(zzfr0, map$Entry0);
                if(iterator0.hasNext()) {
                    Object object3 = iterator0.next();
                    map$Entry0 = (Map.Entry)object3;
                }
                else {
                    map$Entry0 = null;
                }
            }
            return;
        }
        if(this.zzmq) {
            if(this.zzmo) {
                zzby zzby1 = this.zzmy.zza(object0);
                if(zzby1.isEmpty()) {
                    iterator1 = null;
                    map$Entry1 = null;
                }
                else {
                    iterator1 = zzby1.iterator();
                    Object object4 = iterator1.next();
                    map$Entry1 = (Map.Entry)object4;
                }
            }
            else {
                iterator1 = null;
                map$Entry1 = null;
            }
            for(int v3 = 0; v3 < this.zzmi.length; v3 += 4) {
                int v4 = this.zzag(v3);
                int v5 = this.zzmi[v3];
                while(map$Entry1 != null && this.zzmy.zza(map$Entry1) <= v5) {
                    this.zzmy.zza(zzfr0, map$Entry1);
                    if(iterator1.hasNext()) {
                        Object object5 = iterator1.next();
                        map$Entry1 = (Map.Entry)object5;
                    }
                    else {
                        map$Entry1 = null;
                    }
                }
                switch((v4 & 0xFF00000) >>> 20) {
                    case 0: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zza(v5, zzfd.zzn(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zza(v5, zzfd.zzm(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzi(v5, zzfd.zzk(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zza(v5, zzfd.zzk(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzc(v5, zzfd.zzj(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzc(v5, zzfd.zzk(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzf(v5, zzfd.zzj(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzb(v5, zzfd.zzl(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.zza(object0, v3)) {
                            zzds.zza(v5, zzfd.zzo(object0, ((long)(v4 & 0xFFFFF))), zzfr0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zza(v5, zzfd.zzo(object0, ((long)(v4 & 0xFFFFF))), this.zzad(v3));
                        }
                        break;
                    }
                    case 10: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zza(v5, ((zzbb)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzd(v5, zzfd.zzj(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzn(v5, zzfd.zzj(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzm(v5, zzfd.zzj(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzj(v5, zzfd.zzk(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zze(v5, zzfd.zzj(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzb(v5, zzfd.zzk(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.zza(object0, v3)) {
                            zzfr0.zzb(v5, zzfd.zzo(object0, ((long)(v4 & 0xFFFFF))), this.zzad(v3));
                        }
                        break;
                    }
                    case 18: {
                        zzeh.zza(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 19: {
                        zzeh.zzb(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 20: {
                        zzeh.zzc(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 21: {
                        zzeh.zzd(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 22: {
                        zzeh.zzh(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 23: {
                        zzeh.zzf(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 24: {
                        zzeh.zzk(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 25: {
                        zzeh.zzn(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 26: {
                        zzeh.zza(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0);
                        break;
                    }
                    case 27: {
                        zzeh.zza(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, this.zzad(v3));
                        break;
                    }
                    case 28: {
                        zzeh.zzb(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0);
                        break;
                    }
                    case 29: {
                        zzeh.zzi(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 30: {
                        zzeh.zzm(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 0x1F: {
                        zzeh.zzl(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 0x20: {
                        zzeh.zzg(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 33: {
                        zzeh.zzj(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 34: {
                        zzeh.zze(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, false);
                        break;
                    }
                    case 35: {
                        zzeh.zza(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 36: {
                        zzeh.zzb(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 37: {
                        zzeh.zzc(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 38: {
                        zzeh.zzd(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 39: {
                        zzeh.zzh(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 40: {
                        zzeh.zzf(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 41: {
                        zzeh.zzk(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 42: {
                        zzeh.zzn(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 43: {
                        zzeh.zzi(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 44: {
                        zzeh.zzm(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 45: {
                        zzeh.zzl(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 46: {
                        zzeh.zzg(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 0x2F: {
                        zzeh.zzj(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 0x30: {
                        zzeh.zze(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, true);
                        break;
                    }
                    case 49: {
                        zzeh.zzb(this.zzmi[v3], ((List)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))), zzfr0, this.zzad(v3));
                        break;
                    }
                    case 50: {
                        this.zza(zzfr0, v5, zzfd.zzo(object0, ((long)(v4 & 0xFFFFF))), v3);
                        break;
                    }
                    case 51: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zza(v5, zzds.zze(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zza(v5, zzds.zzf(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzi(v5, zzds.zzh(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zza(v5, zzds.zzh(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzc(v5, zzds.zzg(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzc(v5, zzds.zzh(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzf(v5, zzds.zzg(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzb(v5, zzds.zzi(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 59: {
                        if(this.zza(object0, v5, v3)) {
                            zzds.zza(v5, zzfd.zzo(object0, ((long)(v4 & 0xFFFFF))), zzfr0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zza(v5, zzfd.zzo(object0, ((long)(v4 & 0xFFFFF))), this.zzad(v3));
                        }
                        break;
                    }
                    case 61: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zza(v5, ((zzbb)zzfd.zzo(object0, ((long)(v4 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzd(v5, zzds.zzg(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzn(v5, zzds.zzg(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzm(v5, zzds.zzg(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzj(v5, zzds.zzh(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zze(v5, zzds.zzg(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzb(v5, zzds.zzh(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.zza(object0, v5, v3)) {
                            zzfr0.zzb(v5, zzfd.zzo(object0, ((long)(v4 & 0xFFFFF))), this.zzad(v3));
                        }
                    }
                }
            }
            while(map$Entry1 != null) {
                this.zzmy.zza(zzfr0, map$Entry1);
                if(iterator1.hasNext()) {
                    Object object6 = iterator1.next();
                    map$Entry1 = (Map.Entry)object6;
                }
                else {
                    map$Entry1 = null;
                }
            }
            zzds.zza(this.zzmx, object0, zzfr0);
            return;
        }
        this.zzb(object0, zzfr0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzay zzay0) throws IOException {
        Unsafe unsafe1;
        int v10;
        int v5;
        int v4;
        if(this.zzmq) {
            Unsafe unsafe0 = zzds.zzmh;
            int v2 = v;
            while(v2 < v1) {
                int v3 = arr_b[v2];
                if(v3 < 0) {
                    v4 = zzax.zza(v3, arr_b, v2 + 1, zzay0);
                    v5 = zzay0.zzfd;
                }
                else {
                    v5 = v3;
                    v4 = v2 + 1;
                }
                int v6 = this.zzai(v5 >>> 3);
                if(v6 >= 0) {
                    int v7 = this.zzmi[v6 + 1];
                    int v8 = (0xFF00000 & v7) >>> 20;
                    long v9 = (long)(0xFFFFF & v7);
                    if(v8 <= 17) {
                        boolean z = true;
                        switch(v8) {
                            case 0: {
                                if((v5 & 7) == 1) {
                                    zzfd.zza(object0, v9, zzax.zze(arr_b, v4));
                                    v2 = v4 + 8;
                                    continue;
                                }
                                break;
                            }
                            case 1: {
                                if((v5 & 7) == 5) {
                                    zzfd.zza(object0, v9, zzax.zzf(arr_b, v4));
                                    v2 = v4 + 4;
                                    continue;
                                }
                                break;
                            }
                            case 2: 
                            case 3: {
                                if((v5 & 7) == 0) {
                                    v10 = zzax.zzb(arr_b, v4, zzay0);
                                    unsafe0.putLong(object0, v9, zzay0.zzfe);
                                    v2 = v10;
                                    continue;
                                }
                                break;
                            }
                            case 7: {
                                if((v5 & 7) == 0) {
                                    v2 = zzax.zzb(arr_b, v4, zzay0);
                                    if(zzay0.zzfe == 0L) {
                                        z = false;
                                    }
                                    zzfd.zza(object0, v9, z);
                                    continue;
                                }
                                break;
                            }
                            case 8: {
                                if((v5 & 7) == 2) {
                                    v2 = (0x20000000 & v7) == 0 ? zzax.zzc(arr_b, v4, zzay0) : zzax.zzd(arr_b, v4, zzay0);
                                    unsafe0.putObject(object0, v9, zzay0.zzff);
                                    continue;
                                }
                                break;
                            }
                            case 9: {
                                if((v5 & 7) == 2) {
                                    v2 = zzds.zza(this.zzad(v6), arr_b, v4, v1, zzay0);
                                    Object object1 = unsafe0.getObject(object0, v9);
                                    unsafe0.putObject(object0, v9, (object1 == null ? zzay0.zzff : zzci.zza(object1, zzay0.zzff)));
                                    continue;
                                }
                                break;
                            }
                            case 10: {
                                if((v5 & 7) == 2) {
                                    v2 = zzax.zze(arr_b, v4, zzay0);
                                    unsafe0.putObject(object0, v9, zzay0.zzff);
                                    continue;
                                }
                                break;
                            }
                            case 4: 
                            case 11: {
                                if((v5 & 7) == 0) {
                                    v2 = zzax.zza(arr_b, v4, zzay0);
                                    unsafe0.putInt(object0, v9, zzay0.zzfd);
                                    continue;
                                }
                                break;
                            }
                            case 12: {
                                if((v5 & 7) == 0) {
                                    v2 = zzax.zza(arr_b, v4, zzay0);
                                    unsafe0.putInt(object0, v9, zzay0.zzfd);
                                    continue;
                                }
                                break;
                            }
                            case 6: 
                            case 13: {
                                if((v5 & 7) == 5) {
                                    unsafe0.putInt(object0, v9, zzax.zzc(arr_b, v4));
                                    v2 = v4 + 4;
                                    continue;
                                }
                                break;
                            }
                            case 5: 
                            case 14: {
                                if((v5 & 7) == 1) {
                                    unsafe0.putLong(object0, v9, zzax.zzd(arr_b, v4));
                                    v2 = v4 + 8;
                                    continue;
                                }
                                break;
                            }
                            case 15: {
                                if((v5 & 7) == 0) {
                                    v2 = zzax.zza(arr_b, v4, zzay0);
                                    unsafe0.putInt(object0, v9, -(zzay0.zzfd & 1) ^ zzay0.zzfd >>> 1);
                                    continue;
                                }
                                break;
                            }
                            case 16: {
                                if((v5 & 7) == 0) {
                                    v10 = zzax.zzb(arr_b, v4, zzay0);
                                    unsafe0.putLong(object0, v9, -(zzay0.zzfe & 1L) ^ zzay0.zzfe >>> 1);
                                    v2 = v10;
                                    continue;
                                }
                            }
                        }
                        unsafe1 = unsafe0;
                        v2 = zzds.zza(v5, arr_b, v4, v1, object0, zzay0);
                    }
                    else if(v8 == 27) {
                        if((v5 & 7) == 2) {
                            zzcn zzcn0 = (zzcn)unsafe0.getObject(object0, v9);
                            if(!zzcn0.zzu()) {
                                int v11 = zzcn0.size();
                                zzcn0 = zzcn0.zzi((v11 == 0 ? 10 : v11 << 1));
                                unsafe0.putObject(object0, v9, zzcn0);
                            }
                            v2 = zzds.zza(this.zzad(v6), v5, arr_b, v4, v1, zzcn0, zzay0);
                            continue;
                        }
                        else {
                            unsafe1 = unsafe0;
                            v2 = zzds.zza(v5, arr_b, v4, v1, object0, zzay0);
                            goto label_113;
                        }
                        goto label_92;
                    }
                    else {
                    label_92:
                        if(v8 <= 49) {
                            unsafe1 = unsafe0;
                            v2 = this.zza(object0, arr_b, v4, v1, v5, v5 >>> 3, v5 & 7, v6, ((long)v7), v8, v9, zzay0);
                            if(v2 == v4) {
                                v2 = zzds.zza(v5, arr_b, v2, v1, object0, zzay0);
                            }
                        }
                        else {
                            unsafe1 = unsafe0;
                            if(v8 != 50) {
                                v2 = this.zza(object0, arr_b, v4, v1, v5, v5 >>> 3, v5 & 7, v7, v8, v9, v6, zzay0);
                                if(v2 == v4) {
                                    v2 = zzds.zza(v5, arr_b, v2, v1, object0, zzay0);
                                }
                            }
                            else if((v5 & 7) == 2) {
                                v2 = this.zza(object0, arr_b, v4, v1, v6, v5 >>> 3, v9, zzay0);
                                if(v2 == v4) {
                                    v2 = zzds.zza(v5, arr_b, v2, v1, object0, zzay0);
                                }
                            }
                            else {
                                v2 = zzds.zza(v5, arr_b, v4, v1, object0, zzay0);
                            }
                        }
                    }
                }
                else {
                    unsafe1 = unsafe0;
                    v2 = zzds.zza(v5, arr_b, v4, v1, object0, zzay0);
                }
            label_113:
                unsafe0 = unsafe1;
            }
            if(v2 != v1) {
                throw zzco.zzbo();
            }
            return;
        }
        this.zza(object0, arr_b, v, v1, 0, zzay0);
    }

    private final zzef zzad(int v) {
        int v1 = v / 4 << 1;
        zzef zzef0 = (zzef)this.zzmj[v1];
        if(zzef0 != null) {
            return zzef0;
        }
        zzef zzef1 = zzea.zzcm().zze(((Class)this.zzmj[v1 + 1]));
        this.zzmj[v1] = zzef1;
        return zzef1;
    }

    private final Object zzae(int v) {
        return this.zzmj[v / 4 << 1];
    }

    private final zzck zzaf(int v) {
        return (zzck)this.zzmj[(v / 4 << 1) + 1];
    }

    private final int zzag(int v) {
        return this.zzmi[v + 1];
    }

    private final int zzah(int v) {
        return this.zzmi[v + 2];
    }

    private final int zzai(int v) {
        int v1 = this.zzmk;
        if(v >= v1) {
            int v2 = this.zzmm;
            if(v < v2) {
                int v3 = v - v1 << 2;
                return this.zzmi[v3] == v ? v3 : -1;
            }
            if(v <= this.zzml) {
                int v4 = v2 - v1;
                int v5 = this.zzmi.length / 4 - 1;
                while(v4 <= v5) {
                    int v6 = v5 + v4 >>> 1;
                    int v7 = v6 << 2;
                    int v8 = this.zzmi[v7];
                    if(v == v8) {
                        return v7;
                    }
                    if(v < v8) {
                        v5 = v6 - 1;
                    }
                    else {
                        v4 = v6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(Object object0, int v) {
        if(this.zzmq) {
            return;
        }
        int v1 = this.zzah(v);
        zzfd.zza(object0, ((long)(v1 & 0xFFFFF)), zzfd.zzj(object0, ((long)(v1 & 0xFFFFF))) | 1 << (v1 >>> 20));
    }

    private final void zzb(Object object0, int v, int v1) {
        zzfd.zza(object0, ((long)(this.zzah(v1) & 0xFFFFF)), v);
    }

    private final void zzb(Object object0, zzfr zzfr0) throws IOException {
        int v8;
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(this.zzmo) {
            zzby zzby0 = this.zzmy.zza(object0);
            if(zzby0.isEmpty()) {
                iterator0 = null;
                map$Entry0 = null;
            }
            else {
                iterator0 = zzby0.iterator();
                Object object1 = iterator0.next();
                map$Entry0 = (Map.Entry)object1;
            }
        }
        else {
            iterator0 = null;
            map$Entry0 = null;
        }
        Unsafe unsafe0 = zzds.zzmh;
        int v = -1;
        int v2 = 0;
        for(int v1 = 0; v1 < this.zzmi.length; v1 += 4) {
            int v3 = this.zzag(v1);
            int[] arr_v = this.zzmi;
            int v4 = arr_v[v1];
            int v5 = (0xFF00000 & v3) >>> 20;
            if(this.zzmq || v5 > 17) {
                v8 = 0;
            }
            else {
                int v6 = arr_v[v1 + 2];
                int v7 = v6 & 0xFFFFF;
                if(v7 != v) {
                    v2 = unsafe0.getInt(object0, ((long)v7));
                    v = v7;
                }
                v8 = 1 << (v6 >>> 20);
            }
            while(map$Entry0 != null && this.zzmy.zza(map$Entry0) <= v4) {
                this.zzmy.zza(zzfr0, map$Entry0);
                if(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    map$Entry0 = (Map.Entry)object2;
                }
                else {
                    map$Entry0 = null;
                }
            }
            long v9 = (long)(v3 & 0xFFFFF);
            switch(v5) {
                case 0: {
                    if((v8 & v2) != 0) {
                        zzfr0.zza(v4, zzfd.zzn(object0, v9));
                    }
                    break;
                }
                case 1: {
                    if((v8 & v2) != 0) {
                        zzfr0.zza(v4, zzfd.zzm(object0, v9));
                    }
                    break;
                }
                case 2: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzi(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 3: {
                    if((v8 & v2) != 0) {
                        zzfr0.zza(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 4: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzc(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 5: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzc(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 6: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzf(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 7: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzb(v4, zzfd.zzl(object0, v9));
                    }
                    break;
                }
                case 8: {
                    if((v8 & v2) != 0) {
                        zzds.zza(v4, unsafe0.getObject(object0, v9), zzfr0);
                    }
                    break;
                }
                case 9: {
                    if((v8 & v2) != 0) {
                        zzfr0.zza(v4, unsafe0.getObject(object0, v9), this.zzad(v1));
                    }
                    break;
                }
                case 10: {
                    if((v8 & v2) != 0) {
                        zzfr0.zza(v4, ((zzbb)unsafe0.getObject(object0, v9)));
                    }
                    break;
                }
                case 11: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzd(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 12: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzn(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 13: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzm(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 14: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzj(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 15: {
                    if((v8 & v2) != 0) {
                        zzfr0.zze(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 16: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzb(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 17: {
                    if((v8 & v2) != 0) {
                        zzfr0.zzb(v4, unsafe0.getObject(object0, v9), this.zzad(v1));
                    }
                    break;
                }
                case 18: {
                    zzeh.zza(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 19: {
                    zzeh.zzb(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 20: {
                    zzeh.zzc(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 21: {
                    zzeh.zzd(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 22: {
                    zzeh.zzh(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 23: {
                    zzeh.zzf(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 24: {
                    zzeh.zzk(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 25: {
                    zzeh.zzn(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 26: {
                    zzeh.zza(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0);
                    break;
                }
                case 27: {
                    zzeh.zza(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, this.zzad(v1));
                    break;
                }
                case 28: {
                    zzeh.zzb(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0);
                    break;
                }
                case 29: {
                    zzeh.zzi(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 30: {
                    zzeh.zzm(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 0x1F: {
                    zzeh.zzl(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 0x20: {
                    zzeh.zzg(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 33: {
                    zzeh.zzj(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 34: {
                    zzeh.zze(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, false);
                    break;
                }
                case 35: {
                    zzeh.zza(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 36: {
                    zzeh.zzb(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 37: {
                    zzeh.zzc(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 38: {
                    zzeh.zzd(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 39: {
                    zzeh.zzh(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 40: {
                    zzeh.zzf(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 41: {
                    zzeh.zzk(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 42: {
                    zzeh.zzn(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 43: {
                    zzeh.zzi(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 44: {
                    zzeh.zzm(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 45: {
                    zzeh.zzl(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 46: {
                    zzeh.zzg(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 0x2F: {
                    zzeh.zzj(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 0x30: {
                    zzeh.zze(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, true);
                    break;
                }
                case 49: {
                    zzeh.zzb(this.zzmi[v1], ((List)unsafe0.getObject(object0, v9)), zzfr0, this.zzad(v1));
                    break;
                }
                case 50: {
                    this.zza(zzfr0, v4, unsafe0.getObject(object0, v9), v1);
                    break;
                }
                case 51: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zza(v4, zzds.zze(object0, v9));
                    }
                    break;
                }
                case 52: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zza(v4, zzds.zzf(object0, v9));
                    }
                    break;
                }
                case 53: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzi(v4, zzds.zzh(object0, v9));
                    }
                    break;
                }
                case 54: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zza(v4, zzds.zzh(object0, v9));
                    }
                    break;
                }
                case 55: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzc(v4, zzds.zzg(object0, v9));
                    }
                    break;
                }
                case 56: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzc(v4, zzds.zzh(object0, v9));
                    }
                    break;
                }
                case 57: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzf(v4, zzds.zzg(object0, v9));
                    }
                    break;
                }
                case 58: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzb(v4, zzds.zzi(object0, v9));
                    }
                    break;
                }
                case 59: {
                    if(this.zza(object0, v4, v1)) {
                        zzds.zza(v4, unsafe0.getObject(object0, v9), zzfr0);
                    }
                    break;
                }
                case 60: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zza(v4, unsafe0.getObject(object0, v9), this.zzad(v1));
                    }
                    break;
                }
                case 61: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zza(v4, ((zzbb)unsafe0.getObject(object0, v9)));
                    }
                    break;
                }
                case 62: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzd(v4, zzds.zzg(object0, v9));
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzn(v4, zzds.zzg(object0, v9));
                    }
                    break;
                }
                case 0x40: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzm(v4, zzds.zzg(object0, v9));
                    }
                    break;
                }
                case 65: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzj(v4, zzds.zzh(object0, v9));
                    }
                    break;
                }
                case 66: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zze(v4, zzds.zzg(object0, v9));
                    }
                    break;
                }
                case 67: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzb(v4, zzds.zzh(object0, v9));
                    }
                    break;
                }
                case 68: {
                    if(this.zza(object0, v4, v1)) {
                        zzfr0.zzb(v4, unsafe0.getObject(object0, v9), this.zzad(v1));
                    }
                }
            }
        }
        while(map$Entry0 != null) {
            this.zzmy.zza(zzfr0, map$Entry0);
            if(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                map$Entry0 = (Map.Entry)object3;
            }
            else {
                map$Entry0 = null;
            }
        }
        zzds.zza(this.zzmx, object0, zzfr0);
    }

    private final void zzb(Object object0, Object object1, int v) {
        int v1 = this.zzag(v);
        int v2 = this.zzmi[v];
        if(!this.zza(object1, v2, v)) {
            return;
        }
        Object object2 = zzfd.zzo(object0, ((long)(v1 & 0xFFFFF)));
        Object object3 = zzfd.zzo(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 != null && object3 != null) {
            zzfd.zza(object0, ((long)(v1 & 0xFFFFF)), zzci.zza(object2, object3));
            this.zzb(object0, v2, v);
            return;
        }
        if(object3 != null) {
            zzfd.zza(object0, ((long)(v1 & 0xFFFFF)), object3);
            this.zzb(object0, v2, v);
        }
    }

    private final boolean zzc(Object object0, Object object1, int v) {
        return this.zza(object0, v) == this.zza(object1, v);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object object0) {
        int[] arr_v = this.zzmt;
        if(arr_v != null) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                long v2 = (long)(this.zzag(arr_v[v1]) & 0xFFFFF);
                Object object1 = zzfd.zzo(object0, v2);
                if(object1 != null) {
                    zzfd.zza(object0, v2, this.zzmz.zzj(object1));
                }
            }
        }
        int[] arr_v1 = this.zzmu;
        if(arr_v1 != null) {
            for(int v = 0; v < arr_v1.length; ++v) {
                this.zzmw.zza(object0, ((long)arr_v1[v]));
            }
        }
        this.zzmx.zzc(object0);
        if(this.zzmo) {
            this.zzmy.zzc(object0);
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object object0, Object object1) {
        object1.getClass();
        for(int v = 0; v < this.zzmi.length; v += 4) {
            int v1 = this.zzag(v);
            long v2 = (long)(0xFFFFF & v1);
            int v3 = this.zzmi[v];
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzn(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 1: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzm(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 2: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzk(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 3: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzk(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 4: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzj(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 5: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzk(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 6: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzj(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 7: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzl(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 8: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzo(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 10: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzo(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 11: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzj(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 12: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzj(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 13: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzj(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 14: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzk(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 15: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzj(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 16: {
                    if(this.zza(object1, v)) {
                        zzfd.zza(object0, v2, zzfd.zzk(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 9: 
                case 17: {
                    this.zza(object0, object1, v);
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.zzmw.zza(object0, object1, v2);
                    break;
                }
                case 50: {
                    zzeh.zza(this.zzmz, object0, object1, v2);
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if(this.zza(object1, v3, v)) {
                        zzfd.zza(object0, v2, zzfd.zzo(object1, v2));
                        this.zzb(object0, v3, v);
                    }
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.zza(object1, v3, v)) {
                        zzfd.zza(object0, v2, zzfd.zzo(object1, v2));
                        this.zzb(object0, v3, v);
                    }
                    break;
                }
                case 60: 
                case 68: {
                    this.zzb(object0, object1, v);
                }
            }
        }
        if(!this.zzmq) {
            zzeh.zza(this.zzmx, object0, object1);
            if(this.zzmo) {
                zzeh.zza(this.zzmy, object0, object1);
            }
        }
    }

    private static List zzd(Object object0, long v) {
        return (List)zzfd.zzo(object0, v);
    }

    private static double zze(Object object0, long v) {
        return (double)(((Double)zzfd.zzo(object0, v)));
    }

    private static float zzf(Object object0, long v) {
        return (float)(((Float)zzfd.zzo(object0, v)));
    }

    private static int zzg(Object object0, long v) {
        return (int)(((Integer)zzfd.zzo(object0, v)));
    }

    private static long zzh(Object object0, long v) {
        return (long)(((Long)zzfd.zzo(object0, v)));
    }

    private static boolean zzi(Object object0, long v) {
        return ((Boolean)zzfd.zzo(object0, v)).booleanValue();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final int zzm(Object object0) {
        int v24;
        int v23;
        Object object4;
        int v22;
        int v21;
        int v19;
        int v18;
        int v8;
        Object object1;
        int v7;
        if(this.zzmq) {
            Unsafe unsafe0 = zzds.zzmh;
            int v1 = 0;
            for(int v = 0; v < this.zzmi.length; v += 4) {
                int v2 = this.zzag(v);
                int v3 = (v2 & 0xFF00000) >>> 20;
                int v4 = this.zzmi[v];
                long v5 = (long)(v2 & 0xFFFFF);
                int v6 = v3 < zzcb.zzih.id() || v3 > zzcb.zziu.id() ? 0 : this.zzmi[v + 2] & 0xFFFFF;
                switch(v3) {
                    case 0: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzb(v4, 0.0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzb(v4, 0.0f);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzd(v4, zzfd.zzk(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zze(v4, zzfd.zzk(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzg(v4, zzfd.zzj(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzg(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzj(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzc(v4, true);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if(this.zza(object0, v)) {
                            object1 = zzfd.zzo(object0, v5);
                            v7 = object1 instanceof zzbb ? zzbn.zzc(v4, ((zzbb)object1)) : zzbn.zzb(v4, ((String)object1));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if(this.zza(object0, v)) {
                            v7 = zzeh.zzc(v4, zzfd.zzo(object0, v5), this.zzad(v));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if(this.zza(object0, v)) {
                            object1 = zzfd.zzo(object0, v5);
                            v7 = zzbn.zzc(v4, ((zzbb)object1));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzh(v4, zzfd.zzj(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzl(v4, zzfd.zzj(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzk(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzh(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzi(v4, zzfd.zzj(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzf(v4, zzfd.zzk(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 17: {
                        if(this.zza(object0, v)) {
                            v7 = zzbn.zzc(v4, ((zzdo)zzfd.zzo(object0, v5)), this.zzad(v));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 20: {
                        v7 = zzeh.zzo(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 21: {
                        v7 = zzeh.zzp(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 22: {
                        v7 = zzeh.zzs(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 25: {
                        v7 = zzeh.zzx(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 26: {
                        v7 = zzeh.zzc(v4, zzds.zzd(object0, v5));
                        v1 += v7;
                        break;
                    }
                    case 27: {
                        v7 = zzeh.zzc(v4, zzds.zzd(object0, v5), this.zzad(v));
                        v1 += v7;
                        break;
                    }
                    case 28: {
                        v7 = zzeh.zzd(v4, zzds.zzd(object0, v5));
                        v1 += v7;
                        break;
                    }
                    case 29: {
                        v7 = zzeh.zzt(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 30: {
                        v7 = zzeh.zzr(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 19: 
                    case 24: 
                    case 0x1F: {
                        v7 = zzeh.zzv(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 18: 
                    case 23: 
                    case 0x20: {
                        v7 = zzeh.zzw(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 33: {
                        v7 = zzeh.zzu(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 34: {
                        v7 = zzeh.zzq(v4, zzds.zzd(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 35: {
                        v8 = zzeh.zzi(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 36: {
                        v8 = zzeh.zzh(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 37: {
                        v8 = zzeh.zza(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 38: {
                        v8 = zzeh.zzb(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 39: {
                        v8 = zzeh.zze(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 40: {
                        v8 = zzeh.zzi(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 41: {
                        v8 = zzeh.zzh(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 42: {
                        v8 = zzeh.zzj(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 43: {
                        v8 = zzeh.zzf(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 44: {
                        v8 = zzeh.zzd(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 45: {
                        v8 = zzeh.zzh(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 46: {
                        v8 = zzeh.zzi(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x2F: {
                        v8 = zzeh.zzg(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x30: {
                        v8 = zzeh.zzc(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            if(this.zzmr) {
                                unsafe0.putInt(object0, ((long)v6), v8);
                            }
                            v7 = zzbn.zzr(v4) + zzbn.zzt(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 49: {
                        v7 = zzeh.zzd(v4, zzds.zzd(object0, v5), this.zzad(v));
                        v1 += v7;
                        break;
                    }
                    case 50: {
                        Object object2 = zzfd.zzo(object0, v5);
                        Object object3 = this.zzae(v);
                        v7 = this.zzmz.zzb(v4, object2, object3);
                        v1 += v7;
                        break;
                    }
                    case 51: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzb(v4, 0.0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzb(v4, 0.0f);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzd(v4, zzds.zzh(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zze(v4, zzds.zzh(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzg(v4, zzds.zzg(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzg(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzj(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzc(v4, true);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if(this.zza(object0, v4, v)) {
                            object1 = zzfd.zzo(object0, v5);
                            if(!(object1 instanceof zzbb)) {
                                v7 = zzbn.zzb(v4, ((String)object1));
                                v1 += v7;
                                break;
                            }
                            v7 = zzbn.zzc(v4, ((zzbb)object1));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzeh.zzc(v4, zzfd.zzo(object0, v5), this.zzad(v));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzc(v4, ((zzbb)zzfd.zzo(object0, v5)));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzh(v4, zzds.zzg(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzl(v4, zzds.zzg(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzk(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzh(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzi(v4, zzds.zzg(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzbn.zzf(v4, zzds.zzh(object0, v5));
                            v1 += v7;
                        }
                        break;
                    }
                    case 68: {
                        if(this.zza(object0, v4, v)) {
                            v1 += zzbn.zzc(v4, ((zzdo)zzfd.zzo(object0, v5)), this.zzad(v));
                        }
                    }
                }
            }
            return v1 + zzds.zza(this.zzmx, object0);
        }
        Unsafe unsafe1 = zzds.zzmh;
        int v9 = -1;
        int v11 = 0;
        int v12 = 0;
        for(int v10 = 0; v10 < this.zzmi.length; v10 += 4) {
            int v13 = this.zzag(v10);
            int[] arr_v = this.zzmi;
            int v14 = arr_v[v10];
            int v15 = (v13 & 0xFF00000) >>> 20;
            if(v15 <= 17) {
                int v16 = arr_v[v10 + 2];
                int v17 = v16 & 0xFFFFF;
                v18 = 1 << (v16 >>> 20);
                if(v17 != v9) {
                    v12 = unsafe1.getInt(object0, ((long)v17));
                    v9 = v17;
                }
                v19 = v16;
            }
            else {
                v19 = !this.zzmr || v15 < zzcb.zzih.id() || v15 > zzcb.zziu.id() ? 0 : this.zzmi[v10 + 2] & 0xFFFFF;
                v18 = 0;
            }
            long v20 = (long)(v13 & 0xFFFFF);
            switch(v15) {
                case 0: {
                    if((v12 & v18) != 0) {
                        v11 += zzbn.zzb(v14, 0.0);
                    }
                    break;
                }
                case 1: {
                    if((v12 & v18) != 0) {
                        v11 += zzbn.zzb(v14, 0.0f);
                    }
                    break;
                }
                case 2: {
                    if((v12 & v18) != 0) {
                        v21 = zzbn.zzd(v14, unsafe1.getLong(object0, v20));
                        v11 += v21;
                        break;
                    }
                    break;
                }
                case 3: {
                    if((v12 & v18) != 0) {
                        v21 = zzbn.zze(v14, unsafe1.getLong(object0, v20));
                        v11 += v21;
                        break;
                    }
                    break;
                }
                case 4: {
                    if((v12 & v18) != 0) {
                        v21 = zzbn.zzg(v14, unsafe1.getInt(object0, v20));
                        v11 += v21;
                    }
                    break;
                }
                case 5: {
                    if((v12 & v18) != 0) {
                        v11 += zzbn.zzg(v14, 0L);
                    }
                    break;
                }
                case 6: {
                    if((v12 & v18) != 0) {
                        v11 += zzbn.zzj(v14, 0);
                    }
                    break;
                }
                case 7: {
                    if((v12 & v18) != 0) {
                        v22 = zzbn.zzc(v14, true);
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 8: {
                    if((v12 & v18) != 0) {
                        object4 = unsafe1.getObject(object0, v20);
                        v22 = object4 instanceof zzbb ? zzbn.zzc(v14, ((zzbb)object4)) : zzbn.zzb(v14, ((String)object4));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 9: {
                    if((v12 & v18) != 0) {
                        v22 = zzeh.zzc(v14, unsafe1.getObject(object0, v20), this.zzad(v10));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 10: {
                    if((v12 & v18) != 0) {
                        object4 = unsafe1.getObject(object0, v20);
                        v22 = zzbn.zzc(v14, ((zzbb)object4));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 11: {
                    if((v12 & v18) != 0) {
                        v22 = zzbn.zzh(v14, unsafe1.getInt(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 12: {
                    if((v12 & v18) != 0) {
                        v22 = zzbn.zzl(v14, unsafe1.getInt(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 13: {
                    if((v12 & v18) != 0) {
                        v23 = zzbn.zzk(v14, 0);
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 14: {
                    if((v12 & v18) != 0) {
                        v22 = zzbn.zzh(v14, 0L);
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 15: {
                    if((v12 & v18) != 0) {
                        v22 = zzbn.zzi(v14, unsafe1.getInt(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 16: {
                    if((v12 & v18) != 0) {
                        v22 = zzbn.zzf(v14, unsafe1.getLong(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 17: {
                    if((v12 & v18) != 0) {
                        v22 = zzbn.zzc(v14, ((zzdo)unsafe1.getObject(object0, v20)), this.zzad(v10));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 20: {
                    v22 = zzeh.zzo(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 21: {
                    v22 = zzeh.zzp(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 22: {
                    v22 = zzeh.zzs(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 25: {
                    v22 = zzeh.zzx(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 26: {
                    v22 = zzeh.zzc(v14, ((List)unsafe1.getObject(object0, v20)));
                    v11 += v22;
                    break;
                }
                case 27: {
                    v22 = zzeh.zzc(v14, ((List)unsafe1.getObject(object0, v20)), this.zzad(v10));
                    v11 += v22;
                    break;
                }
                case 28: {
                    v22 = zzeh.zzd(v14, ((List)unsafe1.getObject(object0, v20)));
                    v11 += v22;
                    break;
                }
                case 29: {
                    v22 = zzeh.zzt(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 30: {
                    v22 = zzeh.zzr(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 19: 
                case 24: 
                case 0x1F: {
                    v22 = zzeh.zzv(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 18: 
                case 23: 
                case 0x20: {
                    v22 = zzeh.zzw(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 33: {
                    v22 = zzeh.zzu(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 34: {
                    v22 = zzeh.zzq(v14, ((List)unsafe1.getObject(object0, v20)), false);
                    v11 += v22;
                    break;
                }
                case 35: {
                    v24 = zzeh.zzi(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 36: {
                    v24 = zzeh.zzh(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 37: {
                    v24 = zzeh.zza(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 38: {
                    v24 = zzeh.zzb(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 39: {
                    v24 = zzeh.zze(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 40: {
                    v24 = zzeh.zzi(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 41: {
                    v24 = zzeh.zzh(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 42: {
                    v24 = zzeh.zzj(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 43: {
                    v24 = zzeh.zzf(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 44: {
                    v24 = zzeh.zzd(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 45: {
                    v24 = zzeh.zzh(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 46: {
                    v24 = zzeh.zzi(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 0x2F: {
                    v24 = zzeh.zzg(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 0x30: {
                    v24 = zzeh.zzc(((List)unsafe1.getObject(object0, v20)));
                    if(v24 > 0) {
                        if(this.zzmr) {
                            unsafe1.putInt(object0, ((long)v19), v24);
                        }
                        v23 = zzbn.zzr(v14) + zzbn.zzt(v24) + v24;
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 49: {
                    v22 = zzeh.zzd(v14, ((List)unsafe1.getObject(object0, v20)), this.zzad(v10));
                    v11 += v22;
                    break;
                }
                case 50: {
                    Object object5 = unsafe1.getObject(object0, v20);
                    Object object6 = this.zzae(v10);
                    v22 = this.zzmz.zzb(v14, object5, object6);
                    v11 += v22;
                    break;
                }
                case 51: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzb(v14, 0.0);
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.zza(object0, v14, v10)) {
                        v23 = zzbn.zzb(v14, 0.0f);
                        v11 += v23;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzd(v14, zzds.zzh(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zze(v14, zzds.zzh(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzg(v14, zzds.zzg(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzg(v14, 0L);
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.zza(object0, v14, v10)) {
                        v23 = zzbn.zzj(v14, 0);
                        v11 += v23;
                    }
                    break;
                }
                case 58: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzc(v14, true);
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.zza(object0, v14, v10)) {
                        object4 = unsafe1.getObject(object0, v20);
                        if(!(object4 instanceof zzbb)) {
                            v22 = zzbn.zzb(v14, ((String)object4));
                            v11 += v22;
                            break;
                        }
                        v22 = zzbn.zzc(v14, ((zzbb)object4));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzeh.zzc(v14, unsafe1.getObject(object0, v20), this.zzad(v10));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzc(v14, ((zzbb)unsafe1.getObject(object0, v20)));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzh(v14, zzds.zzg(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzl(v14, zzds.zzg(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.zza(object0, v14, v10)) {
                        v11 += zzbn.zzk(v14, 0);
                    }
                    break;
                }
                case 65: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzh(v14, 0L);
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzi(v14, zzds.zzg(object0, v20));
                        v11 += v22;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.zza(object0, v14, v10)) {
                        v22 = zzbn.zzf(v14, zzds.zzh(object0, v20));
                        v11 += v22;
                    }
                    break;
                }
                case 68: {
                    if(this.zza(object0, v14, v10)) {
                        v11 += zzbn.zzc(v14, ((zzdo)unsafe1.getObject(object0, v20)), this.zzad(v10));
                    }
                }
            }
        }
        int v25 = v11 + zzds.zza(this.zzmx, object0);
        return this.zzmo ? v25 + this.zzmy.zza(object0).zzas() : v25;
    }

    private static zzey zzn(Object object0) {
        zzey zzey0 = ((zzcg)object0).zzjp;
        if(zzey0 == zzey.zzea()) {
            zzey0 = zzey.zzeb();
            ((zzcg)object0).zzjp = zzey0;
        }
        return zzey0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(Object object0) {
        int v10;
        int v9;
        int[] arr_v = this.zzms;
        if(arr_v != null && arr_v.length != 0) {
            int v = arr_v.length;
            int v1 = -1;
            int v2 = 0;
            int v3 = 0;
            while(v2 < v) {
                int v4 = arr_v[v2];
                int v5 = this.zzai(v4);
                int v6 = this.zzag(v5);
                if(this.zzmq) {
                    v10 = v;
                    v9 = 0;
                }
                else {
                    int v7 = this.zzmi[v5 + 2];
                    int v8 = v7 & 0xFFFFF;
                    v9 = 1 << (v7 >>> 20);
                    if(v8 == v1) {
                        v10 = v;
                    }
                    else {
                        v10 = v;
                        v3 = zzds.zzmh.getInt(object0, ((long)v8));
                        v1 = v8;
                    }
                }
                if((0x10000000 & v6) != 0 && !this.zza(object0, v5, v3, v9)) {
                    return false;
                }
                switch((0xFF00000 & v6) >>> 20) {
                    case 9: 
                    case 17: {
                        if(this.zza(object0, v5, v3, v9) && !zzds.zza(object0, v6, this.zzad(v5))) {
                            return false;
                        }
                        break;
                    }
                    case 27: 
                    case 49: {
                        List list0 = (List)zzfd.zzo(object0, ((long)(v6 & 0xFFFFF)));
                        if(!list0.isEmpty()) {
                            zzef zzef1 = this.zzad(v5);
                            for(int v11 = 0; v11 < list0.size(); ++v11) {
                                if(!zzef1.zzo(list0.get(v11))) {
                                    return false;
                                }
                            }
                        }
                        break;
                    }
                    case 50: {
                        Object object1 = zzfd.zzo(object0, ((long)(v6 & 0xFFFFF)));
                        Map map0 = this.zzmz.zzh(object1);
                        if(!map0.isEmpty()) {
                            Object object2 = this.zzae(v5);
                            if(this.zzmz.zzl(object2).zzmd.zzek() == zzfq.zzrf) {
                                zzef zzef0 = null;
                                Iterator iterator0 = map0.values().iterator();
                                while(true) {
                                    if(!iterator0.hasNext()) {
                                        break;
                                    }
                                    Object object3 = iterator0.next();
                                    if(zzef0 == null) {
                                        zzef0 = zzea.zzcm().zze(object3.getClass());
                                    }
                                    if(zzef0.zzo(object3)) {
                                        continue;
                                    }
                                    return false;
                                }
                            }
                        }
                        break;
                    }
                    case 60: 
                    case 68: {
                        if(this.zza(object0, v4, v5) && !zzds.zza(object0, v6, this.zzad(v5))) {
                            return false;
                        }
                    }
                }
                ++v2;
                v = v10;
            }
            return !this.zzmo || this.zzmy.zza(object0).isInitialized();
        }
        return true;
    }
}

