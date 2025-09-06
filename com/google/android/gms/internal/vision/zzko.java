package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import sun.misc.Unsafe;

final class zzko implements zzlc {
    private static final int[] zza;
    private static final Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzks zzo;
    private final zzju zzp;
    private final zzlu zzq;
    private final zziq zzr;
    private final zzkh zzs;

    static {
        zzko.zza = new int[0];
        zzko.zzb = zzma.zzc();
    }

    private zzko(int[] arr_v, Object[] arr_object, int v, int v1, zzkk zzkk0, boolean z, boolean z1, int[] arr_v1, int v2, int v3, zzks zzks0, zzju zzju0, zzlu zzlu0, zziq zziq0, zzkh zzkh0) {
        this.zzc = arr_v;
        this.zzd = arr_object;
        this.zze = v;
        this.zzf = v1;
        this.zzi = zzkk0 instanceof zzjb;
        this.zzj = z;
        this.zzh = zziq0 != null && zziq0.zza(zzkk0);
        this.zzk = false;
        this.zzl = arr_v1;
        this.zzm = v2;
        this.zzn = v3;
        this.zzo = zzks0;
        this.zzp = zzju0;
        this.zzq = zzlu0;
        this.zzr = zziq0;
        this.zzg = zzkk0;
        this.zzs = zzkh0;
    }

    private final int zza(int v, int v1) {
        return v < this.zze || v > this.zzf ? -1 : this.zzb(v, v1);
    }

    private static int zza(zzlu zzlu0, Object object0) {
        return zzlu0.zzf(zzlu0.zzb(object0));
    }

    private final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, int v8, zzhn zzhn0) throws IOException {
        int v10;
        Unsafe unsafe0 = zzko.zzb;
        long v9 = (long)(this.zzc[v8 + 2] & 0xFFFFF);
        switch(v6) {
            case 51: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, zzhl.zzc(arr_b, v));
                    v10 = v + 8;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 52: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, zzhl.zzd(arr_b, v));
                    v10 = v + 4;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 53: 
            case 54: {
                if(v4 == 0) {
                    v10 = zzhl.zzb(arr_b, v, zzhn0);
                    unsafe0.putObject(object0, v7, zzhn0.zzb);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 58: {
                if(v4 == 0) {
                    v10 = zzhl.zzb(arr_b, v, zzhn0);
                    unsafe0.putObject(object0, v7, Boolean.valueOf(zzhn0.zzb != 0L));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 59: {
                if(v4 == 2) {
                    v10 = zzhl.zza(arr_b, v, zzhn0);
                    int v11 = zzhn0.zza;
                    if(v11 == 0) {
                        unsafe0.putObject(object0, v7, "");
                    }
                    else {
                        if((v5 & 0x20000000) != 0 && !zzmd.zza(arr_b, v10, v10 + v11)) {
                            throw zzjk.zzh();
                        }
                        unsafe0.putObject(object0, v7, new String(arr_b, v10, v11, zzjf.zza));
                        v10 += v11;
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 60: {
                if(v4 == 2) {
                    v10 = zzhl.zza(this.zza(v8), arr_b, v, v1, zzhn0);
                    Object object1 = unsafe0.getInt(object0, v9) == v3 ? unsafe0.getObject(object0, v7) : null;
                    if(object1 == null) {
                        unsafe0.putObject(object0, v7, zzhn0.zzc);
                    }
                    else {
                        unsafe0.putObject(object0, v7, zzjf.zza(object1, zzhn0.zzc));
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 61: {
                if(v4 == 2) {
                    v10 = zzhl.zze(arr_b, v, zzhn0);
                    unsafe0.putObject(object0, v7, zzhn0.zzc);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 55: 
            case 62: {
                if(v4 == 0) {
                    v10 = zzhl.zza(arr_b, v, zzhn0);
                    unsafe0.putObject(object0, v7, zzhn0.zza);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 0x3F: {
                if(v4 == 0) {
                    int v12 = zzhl.zza(arr_b, v, zzhn0);
                    int v13 = zzhn0.zza;
                    zzjg zzjg0 = this.zzc(v8);
                    if(zzjg0 != null && !zzjg0.zza(v13)) {
                        zzko.zze(object0).zza(v2, ((long)v13));
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
                    unsafe0.putObject(object0, v7, zzhl.zza(arr_b, v));
                    v10 = v + 4;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 56: 
            case 65: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, zzhl.zzb(arr_b, v));
                    v10 = v + 8;
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 66: {
                if(v4 == 0) {
                    v10 = zzhl.zza(arr_b, v, zzhn0);
                    unsafe0.putObject(object0, v7, ((int)(-(zzhn0.zza & 1) ^ zzhn0.zza >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 67: {
                if(v4 == 0) {
                    v10 = zzhl.zzb(arr_b, v, zzhn0);
                    unsafe0.putObject(object0, v7, ((long)(-(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1)));
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 68: {
                if(v4 == 3) {
                    v10 = zzhl.zza(this.zza(v8), arr_b, v, v1, v2 & -8 | 4, zzhn0);
                    Object object2 = unsafe0.getInt(object0, v9) == v3 ? unsafe0.getObject(object0, v7) : null;
                    if(object2 == null) {
                        unsafe0.putObject(object0, v7, zzhn0.zzc);
                    }
                    else {
                        unsafe0.putObject(object0, v7, zzjf.zza(object2, zzhn0.zzc));
                    }
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

    private final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, long v6, int v7, long v8, zzhn zzhn0) throws IOException {
        int v19;
        int v11;
        int v9 = v;
        Unsafe unsafe0 = zzko.zzb;
        zzjl zzjl0 = (zzjl)unsafe0.getObject(object0, v8);
        if(!zzjl0.zza()) {
            int v10 = zzjl0.size();
            zzjl0 = zzjl0.zza((v10 == 0 ? 10 : v10 << 1));
            unsafe0.putObject(object0, v8, zzjl0);
        }
    alab1:
        switch(v7) {
            case 26: {
                if(v4 == 2) {
                    if((v6 & 0x20000000L) == 0L) {
                        v9 = zzhl.zza(arr_b, v9, zzhn0);
                        int v21 = zzhn0.zza;
                        if(v21 < 0) {
                            throw zzjk.zzb();
                        }
                        if(v21 == 0) {
                            zzjl0.add("");
                            goto label_129;
                        }
                        else {
                            zzjl0.add(new String(arr_b, v9, v21, zzjf.zza));
                        }
                    alab2:
                        while(true) {
                            v9 += v21;
                            while(true) {
                            label_129:
                                if(v9 >= v1) {
                                    break alab1;
                                }
                                int v22 = zzhl.zza(arr_b, v9, zzhn0);
                                if(v2 != zzhn0.zza) {
                                    break alab1;
                                }
                                v9 = zzhl.zza(arr_b, v22, zzhn0);
                                v21 = zzhn0.zza;
                                if(v21 < 0) {
                                    break alab2;
                                }
                                if(v21 != 0) {
                                    zzjl0.add(new String(arr_b, v9, v21, zzjf.zza));
                                    break;
                                }
                                zzjl0.add("");
                            }
                        }
                        throw zzjk.zzb();
                    }
                    else {
                        v9 = zzhl.zza(arr_b, v9, zzhn0);
                        int v23 = zzhn0.zza;
                        if(v23 < 0) {
                            throw zzjk.zzb();
                        }
                        if(v23 == 0) {
                            zzjl0.add("");
                            goto label_152;
                        }
                        else {
                            int v24 = v9 + v23;
                            if(!zzmd.zza(arr_b, v9, v24)) {
                                throw zzjk.zzh();
                            }
                            zzjl0.add(new String(arr_b, v9, v23, zzjf.zza));
                        alab3:
                            while(true) {
                                v9 = v24;
                                while(true) {
                                label_152:
                                    if(v9 >= v1) {
                                        break alab1;
                                    }
                                    int v25 = zzhl.zza(arr_b, v9, zzhn0);
                                    if(v2 != zzhn0.zza) {
                                        break alab1;
                                    }
                                    v9 = zzhl.zza(arr_b, v25, zzhn0);
                                    int v26 = zzhn0.zza;
                                    if(v26 < 0) {
                                        throw zzjk.zzb();
                                    }
                                    if(v26 != 0) {
                                        v24 = v9 + v26;
                                        if(!zzmd.zza(arr_b, v9, v24)) {
                                            break alab3;
                                        }
                                        zzjl0.add(new String(arr_b, v9, v26, zzjf.zza));
                                        break;
                                    }
                                    zzjl0.add("");
                                }
                            }
                            throw zzjk.zzh();
                        }
                    }
                }
                break;
            }
            case 27: {
                return v4 == 2 ? zzhl.zza(this.zza(v5), v2, arr_b, v, v1, zzjl0, zzhn0) : v9;
            }
            case 28: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v27 = zzhn0.zza;
                    if(v27 < 0) {
                        throw zzjk.zzb();
                    }
                    if(v27 > arr_b.length - v11) {
                        throw zzjk.zza();
                    }
                    if(v27 == 0) {
                        zzjl0.add(zzht.zza);
                        goto label_179;
                    }
                    else {
                        zzjl0.add(zzht.zza(arr_b, v11, v27));
                    }
                alab4:
                    while(true) {
                        v11 += v27;
                        while(true) {
                        label_179:
                            if(v11 >= v1) {
                                return v11;
                            }
                            int v28 = zzhl.zza(arr_b, v11, zzhn0);
                            if(v2 != zzhn0.zza) {
                                return v11;
                            }
                            v11 = zzhl.zza(arr_b, v28, zzhn0);
                            v27 = zzhn0.zza;
                            if(v27 < 0) {
                                throw zzjk.zzb();
                            }
                            if(v27 > arr_b.length - v11) {
                                break alab4;
                            }
                            if(v27 != 0) {
                                zzjl0.add(zzht.zza(arr_b, v11, v27));
                                break;
                            }
                            zzjl0.add(zzht.zza);
                        }
                    }
                    throw zzjk.zza();
                }
                break;
            }
            case 18: 
            case 35: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v12 = zzhn0.zza + v11;
                    while(v11 < v12) {
                        ((zzin)zzjl0).zza(zzhl.zzc(arr_b, v11));
                        v11 += 8;
                    }
                    if(v11 != v12) {
                        throw zzjk.zza();
                    }
                    return v11;
                }
                if(v4 == 1) {
                    ((zzin)zzjl0).zza(zzhl.zzc(arr_b, v));
                    while(true) {
                        v11 = v9 + 8;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzhl.zza(arr_b, v11, zzhn0);
                        if(v2 != zzhn0.zza) {
                            return v11;
                        }
                        ((zzin)zzjl0).zza(zzhl.zzc(arr_b, v9));
                    }
                }
                break;
            }
            case 19: 
            case 36: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v13 = zzhn0.zza + v11;
                    while(v11 < v13) {
                        ((zzja)zzjl0).zza(zzhl.zzd(arr_b, v11));
                        v11 += 4;
                    }
                    if(v11 != v13) {
                        throw zzjk.zza();
                    }
                    return v11;
                }
                if(v4 == 5) {
                    ((zzja)zzjl0).zza(zzhl.zzd(arr_b, v));
                    while(true) {
                        v11 = v9 + 4;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzhl.zza(arr_b, v11, zzhn0);
                        if(v2 != zzhn0.zza) {
                            return v11;
                        }
                        ((zzja)zzjl0).zza(zzhl.zzd(arr_b, v9));
                    }
                }
                break;
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v14 = zzhn0.zza + v11;
                    while(v11 < v14) {
                        v11 = zzhl.zzb(arr_b, v11, zzhn0);
                        ((zzjy)zzjl0).zza(zzhn0.zzb);
                    }
                    if(v11 != v14) {
                        throw zzjk.zza();
                    }
                    return v11;
                }
                if(v4 == 0) {
                    v11 = zzhl.zzb(arr_b, v9, zzhn0);
                    ((zzjy)zzjl0).zza(zzhn0.zzb);
                    while(v11 < v1) {
                        int v15 = zzhl.zza(arr_b, v11, zzhn0);
                        if(v2 != zzhn0.zza) {
                            return v11;
                        }
                        v11 = zzhl.zzb(arr_b, v15, zzhn0);
                        ((zzjy)zzjl0).zza(zzhn0.zzb);
                    }
                    return v11;
                }
                break;
            }
            case 25: 
            case 42: {
                switch(v4) {
                    case 0: {
                        v9 = zzhl.zzb(arr_b, v9, zzhn0);
                        ((zzhr)zzjl0).zza(zzhn0.zzb != 0L);
                        while(v9 < v1) {
                            int v18 = zzhl.zza(arr_b, v9, zzhn0);
                            if(v2 != zzhn0.zza) {
                                break alab1;
                            }
                            v9 = zzhl.zzb(arr_b, v18, zzhn0);
                            ((zzhr)zzjl0).zza(zzhn0.zzb != 0L);
                        }
                        return v9;
                    }
                    case 2: {
                        v19 = zzhl.zza(arr_b, v9, zzhn0);
                        int v20 = zzhn0.zza + v19;
                        while(v19 < v20) {
                            v19 = zzhl.zzb(arr_b, v19, zzhn0);
                            ((zzhr)zzjl0).zza(zzhn0.zzb != 0L);
                        }
                        if(v19 != v20) {
                            throw zzjk.zza();
                        }
                        return v19;
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
                    return zzhl.zza(arr_b, v9, zzjl0, zzhn0);
                }
                return v4 == 0 ? zzhl.zza(v2, arr_b, v, v1, zzjl0, zzhn0) : v9;
            }
            case 30: 
            case 44: {
                if(v4 == 2) {
                    v19 = zzhl.zza(arr_b, v9, zzjl0, zzhn0);
                }
                else if(v4 == 0) {
                    v19 = zzhl.zza(v2, arr_b, v, v1, zzjl0, zzhn0);
                }
                else {
                    break;
                }
                zzlx zzlx0 = ((zzjb)object0).zzb;
                if(zzlx0 == zzlx.zza()) {
                    zzlx0 = null;
                }
                zzlx zzlx1 = (zzlx)zzle.zza(v3, zzjl0, this.zzc(v5), zzlx0, this.zzq);
                if(zzlx1 != null) {
                    ((zzjb)object0).zzb = zzlx1;
                }
                return v19;
            }
            case 24: 
            case 0x1F: 
            case 41: 
            case 45: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v17 = zzhn0.zza + v11;
                    while(v11 < v17) {
                        ((zzjd)zzjl0).zzc(zzhl.zza(arr_b, v11));
                        v11 += 4;
                    }
                    if(v11 != v17) {
                        throw zzjk.zza();
                    }
                    return v11;
                }
                if(v4 == 5) {
                    ((zzjd)zzjl0).zzc(zzhl.zza(arr_b, v));
                    while(true) {
                        v11 = v9 + 4;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzhl.zza(arr_b, v11, zzhn0);
                        if(v2 != zzhn0.zza) {
                            return v11;
                        }
                        ((zzjd)zzjl0).zzc(zzhl.zza(arr_b, v9));
                    }
                }
                break;
            }
            case 23: 
            case 0x20: 
            case 40: 
            case 46: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v16 = zzhn0.zza + v11;
                    while(v11 < v16) {
                        ((zzjy)zzjl0).zza(zzhl.zzb(arr_b, v11));
                        v11 += 8;
                    }
                    if(v11 != v16) {
                        throw zzjk.zza();
                    }
                    return v11;
                }
                if(v4 == 1) {
                    ((zzjy)zzjl0).zza(zzhl.zzb(arr_b, v));
                    while(true) {
                        v11 = v9 + 8;
                        if(v11 >= v1) {
                            return v11;
                        }
                        v9 = zzhl.zza(arr_b, v11, zzhn0);
                        if(v2 != zzhn0.zza) {
                            return v11;
                        }
                        ((zzjy)zzjl0).zza(zzhl.zzb(arr_b, v9));
                    }
                }
                break;
            }
            case 33: 
            case 0x2F: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v29 = zzhn0.zza + v11;
                    while(v11 < v29) {
                        v11 = zzhl.zza(arr_b, v11, zzhn0);
                        ((zzjd)zzjl0).zzc(-(zzhn0.zza & 1) ^ zzhn0.zza >>> 1);
                    }
                    if(v11 != v29) {
                        throw zzjk.zza();
                    }
                    return v11;
                }
                if(v4 == 0) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    ((zzjd)zzjl0).zzc(-(zzhn0.zza & 1) ^ zzhn0.zza >>> 1);
                    while(v11 < v1) {
                        int v30 = zzhl.zza(arr_b, v11, zzhn0);
                        if(v2 != zzhn0.zza) {
                            return v11;
                        }
                        v11 = zzhl.zza(arr_b, v30, zzhn0);
                        ((zzjd)zzjl0).zzc(-(zzhn0.zza & 1) ^ zzhn0.zza >>> 1);
                    }
                    return v11;
                }
                break;
            }
            case 34: 
            case 0x30: {
                if(v4 == 2) {
                    v11 = zzhl.zza(arr_b, v9, zzhn0);
                    int v31 = zzhn0.zza + v11;
                    while(v11 < v31) {
                        v11 = zzhl.zzb(arr_b, v11, zzhn0);
                        ((zzjy)zzjl0).zza(-(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1);
                    }
                    if(v11 != v31) {
                        throw zzjk.zza();
                    }
                    return v11;
                }
                if(v4 == 0) {
                    v11 = zzhl.zzb(arr_b, v9, zzhn0);
                    ((zzjy)zzjl0).zza(-(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1);
                    while(v11 < v1) {
                        int v32 = zzhl.zza(arr_b, v11, zzhn0);
                        if(v2 != zzhn0.zza) {
                            break;
                        }
                        v11 = zzhl.zzb(arr_b, v32, zzhn0);
                        ((zzjy)zzjl0).zza(-(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1);
                    }
                    return v11;
                }
                break;
            }
            case 49: {
                if(v4 == 3) {
                    zzlc zzlc0 = this.zza(v5);
                    int v33 = v2 & -8 | 4;
                    v9 = zzhl.zza(zzlc0, arr_b, v, v1, v33, zzhn0);
                    zzjl0.add(zzhn0.zzc);
                    while(true) {
                        if(v9 >= v1) {
                            break;
                        }
                        int v34 = zzhl.zza(arr_b, v9, zzhn0);
                        if(v2 != zzhn0.zza) {
                            break;
                        }
                        v9 = zzhl.zza(zzlc0, arr_b, v34, v1, v33, zzhn0);
                        zzjl0.add(zzhn0.zzc);
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

    private final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, long v3, zzhn zzhn0) throws IOException {
        Unsafe unsafe0 = zzko.zzb;
        Object object1 = this.zzb(v2);
        Object object2 = unsafe0.getObject(object0, v3);
        if(this.zzs.zzd(object2)) {
            Object object3 = this.zzs.zzf(object1);
            this.zzs.zza(object3, object2);
            unsafe0.putObject(object0, v3, object3);
            object2 = object3;
        }
        zzkf zzkf0 = this.zzs.zzb(object1);
        Map map0 = this.zzs.zza(object2);
        int v4 = zzhl.zza(arr_b, v, zzhn0);
        int v5 = zzhn0.zza;
        if(v5 < 0 || v5 > v1 - v4) {
            throw zzjk.zza();
        }
        int v6 = v5 + v4;
        Object object4 = zzkf0.zzb;
        Object object5 = zzkf0.zzd;
        while(v4 < v6) {
            int v7 = v4 + 1;
            int v8 = arr_b[v4];
            if(v8 < 0) {
                v7 = zzhl.zza(v8, arr_b, v7, zzhn0);
                v8 = zzhn0.zza;
            }
            switch(v8 >>> 3) {
                case 1: {
                    if((v8 & 7) == zzkf0.zza.zzb()) {
                        v4 = zzko.zza(arr_b, v7, v1, zzkf0.zza, null, zzhn0);
                        object4 = zzhn0.zzc;
                        continue;
                    }
                    break;
                }
                case 2: {
                    if((v8 & 7) == zzkf0.zzc.zzb()) {
                        Class class0 = zzkf0.zzd.getClass();
                        v4 = zzko.zza(arr_b, v7, v1, zzkf0.zzc, class0, zzhn0);
                        object5 = zzhn0.zzc;
                        continue;
                    }
                }
            }
            v4 = zzhl.zza(v8, arr_b, v7, v1, zzhn0);
        }
        if(v4 != v6) {
            throw zzjk.zzg();
        }
        map0.put(object4, object5);
        return v6;
    }

    private static int zza(byte[] arr_b, int v, int v1, zzml zzml0, Class class0, zzhn zzhn0) throws IOException {
        int v2;
        switch(zzml0) {
            case 1: {
                v2 = zzhl.zzb(arr_b, v, zzhn0);
                zzhn0.zzc = Boolean.valueOf(zzhn0.zzb != 0L);
                return v2;
            }
            case 2: {
                return zzhl.zze(arr_b, v, zzhn0);
            }
            case 3: {
                zzhn0.zzc = zzhl.zzc(arr_b, v);
                return v + 8;
            }
            case 4: 
            case 5: {
                zzhn0.zzc = zzhl.zza(arr_b, v);
                return v + 4;
            }
            case 6: 
            case 7: {
                zzhn0.zzc = zzhl.zzb(arr_b, v);
                return v + 8;
            }
            case 8: {
                zzhn0.zzc = zzhl.zzd(arr_b, v);
                return v + 4;
            }
            case 9: 
            case 10: 
            case 11: {
                v2 = zzhl.zza(arr_b, v, zzhn0);
                zzhn0.zzc = zzhn0.zza;
                return v2;
            }
            case 12: 
            case 13: {
                v2 = zzhl.zzb(arr_b, v, zzhn0);
                zzhn0.zzc = zzhn0.zzb;
                return v2;
            }
            case 14: {
                return zzhl.zza(zzky.zza().zza(class0), arr_b, v, v1, zzhn0);
            }
            case 15: {
                v2 = zzhl.zza(arr_b, v, zzhn0);
                zzhn0.zzc = (int)(-(zzhn0.zza & 1) ^ zzhn0.zza >>> 1);
                return v2;
            }
            case 16: {
                v2 = zzhl.zzb(arr_b, v, zzhn0);
                zzhn0.zzc = (long)(-(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1);
                return v2;
            }
            case 17: {
                return zzhl.zzd(arr_b, v, zzhn0);
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    static zzko zza(Class class0, zzki zzki0, zzks zzks0, zzju zzju0, zzlu zzlu0, zziq zziq0, zzkh zzkh0) {
        Field field3;
        int v90;
        int v84;
        int v83;
        int v82;
        String s1;
        zzla zzla1;
        int v81;
        int v80;
        int v79;
        Field field1;
        Field field0;
        int v71;
        int v70;
        int v69;
        int v64;
        int v63;
        int v62;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int[] arr_v;
        int v3;
        if(zzki0 instanceof zzla) {
            zzla zzla0 = (zzla)zzki0;
            int v = 0;
            boolean z = zzla0.zza() == zzkz.zzb;
            String s = zzla0.zzd();
            int v1 = s.length();
            if(s.charAt(0) >= 0xD800) {
                for(int v2 = 1; true; v2 = v3) {
                    v3 = v2 + 1;
                    if(s.charAt(v2) < 0xD800) {
                        break;
                    }
                }
            }
            else {
                v3 = 1;
            }
            int v4 = v3 + 1;
            int v5 = s.charAt(v3);
            if(v5 >= 0xD800) {
                int v6 = v5 & 0x1FFF;
                int v7 = 13;
                int v8;
                while((v8 = s.charAt(v4)) >= 0xD800) {
                    v6 |= (v8 & 0x1FFF) << v7;
                    v7 += 13;
                    ++v4;
                }
                v5 = v6 | v8 << v7;
                ++v4;
            }
            if(v5 == 0) {
                arr_v = zzko.zza;
                v9 = 0;
                v10 = 0;
                v11 = 0;
                v12 = 0;
                v13 = 0;
                v14 = 0;
            }
            else {
                int v15 = v4 + 1;
                int v16 = s.charAt(v4);
                if(v16 >= 0xD800) {
                    int v17 = v16 & 0x1FFF;
                    int v18 = 13;
                    int v19;
                    while((v19 = s.charAt(v15)) >= 0xD800) {
                        v17 |= (v19 & 0x1FFF) << v18;
                        v18 += 13;
                        ++v15;
                    }
                    v16 = v17 | v19 << v18;
                    ++v15;
                }
                int v20 = v15 + 1;
                int v21 = s.charAt(v15);
                if(v21 >= 0xD800) {
                    int v22 = v21 & 0x1FFF;
                    int v23 = 13;
                    int v24;
                    while((v24 = s.charAt(v20)) >= 0xD800) {
                        v22 |= (v24 & 0x1FFF) << v23;
                        v23 += 13;
                        ++v20;
                    }
                    v21 = v22 | v24 << v23;
                    ++v20;
                }
                int v25 = v20 + 1;
                v10 = s.charAt(v20);
                if(v10 >= 0xD800) {
                    int v26 = v10 & 0x1FFF;
                    int v27 = 13;
                    int v28;
                    while((v28 = s.charAt(v25)) >= 0xD800) {
                        v26 |= (v28 & 0x1FFF) << v27;
                        v27 += 13;
                        ++v25;
                    }
                    v10 = v26 | v28 << v27;
                    ++v25;
                }
                int v29 = v25 + 1;
                v11 = s.charAt(v25);
                if(v11 >= 0xD800) {
                    int v30 = v11 & 0x1FFF;
                    int v31 = 13;
                    int v32;
                    while((v32 = s.charAt(v29)) >= 0xD800) {
                        v30 |= (v32 & 0x1FFF) << v31;
                        v31 += 13;
                        ++v29;
                    }
                    v11 = v30 | v32 << v31;
                    ++v29;
                }
                int v33 = v29 + 1;
                v12 = s.charAt(v29);
                if(v12 >= 0xD800) {
                    int v34 = v12 & 0x1FFF;
                    int v35 = 13;
                    int v36;
                    while((v36 = s.charAt(v33)) >= 0xD800) {
                        v34 |= (v36 & 0x1FFF) << v35;
                        v35 += 13;
                        ++v33;
                    }
                    v12 = v34 | v36 << v35;
                    ++v33;
                }
                int v37 = v33 + 1;
                v13 = s.charAt(v33);
                if(v13 >= 0xD800) {
                    int v38 = v13 & 0x1FFF;
                    int v39 = 13;
                    int v40;
                    while((v40 = s.charAt(v37)) >= 0xD800) {
                        v38 |= (v40 & 0x1FFF) << v39;
                        v39 += 13;
                        ++v37;
                    }
                    v13 = v38 | v40 << v39;
                    ++v37;
                }
                int v41 = v37 + 1;
                int v42 = s.charAt(v37);
                if(v42 >= 0xD800) {
                    int v43 = v42 & 0x1FFF;
                    int v44 = 13;
                    int v45;
                    while((v45 = s.charAt(v41)) >= 0xD800) {
                        v43 |= (v45 & 0x1FFF) << v44;
                        v44 += 13;
                        ++v41;
                    }
                    v42 = v43 | v45 << v44;
                    ++v41;
                }
                int v46 = v41 + 1;
                v14 = s.charAt(v41);
                if(v14 >= 0xD800) {
                    int v47 = v14 & 0x1FFF;
                    int v48 = v46;
                    int v49 = 13;
                    int v50;
                    while((v50 = s.charAt(v48)) >= 0xD800) {
                        v47 |= (v50 & 0x1FFF) << v49;
                        v49 += 13;
                        ++v48;
                    }
                    v14 = v47 | v50 << v49;
                    v46 = v48 + 1;
                }
                v9 = (v16 << 1) + v21;
                arr_v = new int[v14 + v13 + v42];
                v = v16;
                v4 = v46;
            }
            Unsafe unsafe0 = zzko.zzb;
            Object[] arr_object = zzla0.zze();
            Class class1 = zzla0.zzc().getClass();
            int[] arr_v1 = new int[v12 * 3];
            Object[] arr_object1 = new Object[v12 << 1];
            int v51 = v14 + v13;
            int v52 = v9;
            int v53 = v14;
            int v54 = v4;
            int v55 = v51;
            int v56 = 0;
            int v57 = 0;
            while(v54 < v1) {
                int v58 = s.charAt(v54);
                if(v58 >= 0xD800) {
                    int v59 = v58 & 0x1FFF;
                    int v60 = v54 + 1;
                    int v61 = 13;
                    while(true) {
                        v62 = s.charAt(v60);
                        v63 = v1;
                        if(v62 < 0xD800) {
                            break;
                        }
                        v59 |= (v62 & 0x1FFF) << v61;
                        v61 += 13;
                        ++v60;
                        v1 = v63;
                    }
                    v58 = v59 | v62 << v61;
                    v64 = v60 + 1;
                }
                else {
                    v63 = v1;
                    v64 = v54 + 1;
                }
                int v65 = s.charAt(v64);
                if(v65 >= 0xD800) {
                    int v66 = v65 & 0x1FFF;
                    int v67 = v64 + 1;
                    int v68 = 13;
                    while(true) {
                        v69 = s.charAt(v67);
                        v70 = v14;
                        if(v69 < 0xD800) {
                            break;
                        }
                        v66 |= (v69 & 0x1FFF) << v68;
                        v68 += 13;
                        ++v67;
                        v14 = v70;
                    }
                    v65 = v66 | v69 << v68;
                    v71 = v67 + 1;
                }
                else {
                    v70 = v14;
                    v71 = v64 + 1;
                }
                if((v65 & 0x400) != 0) {
                    arr_v[v56] = v57;
                    ++v56;
                }
                if((v65 & 0xFF) >= 51) {
                    int v72 = v71 + 1;
                    int v73 = s.charAt(v71);
                    if(v73 >= 0xD800) {
                        int v74 = v73 & 0x1FFF;
                        int v75 = 13;
                        int v76;
                        while((v76 = s.charAt(v72)) >= 0xD800) {
                            v74 |= (v76 & 0x1FFF) << v75;
                            v75 += 13;
                            ++v72;
                        }
                        v73 = v74 | v76 << v75;
                        ++v72;
                    }
                    switch((v65 & 0xFF) - 51) {
                        case 12: {
                            if(!z) {
                                arr_object1[(v57 / 3 << 1) + 1] = arr_object[v52];
                                ++v52;
                            }
                            break;
                        }
                        case 9: 
                        case 17: {
                            arr_object1[(v57 / 3 << 1) + 1] = arr_object[v52];
                            ++v52;
                        }
                    }
                    Object object0 = arr_object[v73 << 1];
                    if(object0 instanceof Field) {
                        field0 = (Field)object0;
                    }
                    else {
                        field0 = zzko.zza(class1, ((String)object0));
                        arr_object[v73 << 1] = field0;
                    }
                    int v77 = (int)unsafe0.objectFieldOffset(field0);
                    int v78 = (v73 << 1) + 1;
                    Object object1 = arr_object[v78];
                    if(object1 instanceof Field) {
                        field1 = (Field)object1;
                    }
                    else {
                        field1 = zzko.zza(class1, ((String)object1));
                        arr_object[v78] = field1;
                    }
                    v79 = v52;
                    v80 = v77;
                    v81 = v72;
                    zzla1 = zzla0;
                    s1 = s;
                    v82 = (int)unsafe0.objectFieldOffset(field1);
                    v83 = 0;
                }
                else {
                    Field field2 = zzko.zza(class1, ((String)arr_object[v52]));
                    zzla1 = zzla0;
                    switch(v65 & 0xFF) {
                        case 9: 
                        case 17: {
                            arr_object1[(v57 / 3 << 1) + 1] = field2.getType();
                            v84 = v52 + 1;
                            break;
                        }
                        case 12: 
                        case 30: 
                        case 44: {
                            if(!z) {
                                arr_object1[(v57 / 3 << 1) + 1] = arr_object[v52 + 1];
                                v84 = v52 + 2;
                                break;
                            }
                            v84 = v52 + 1;
                            break;
                        }
                        case 27: 
                        case 49: {
                            arr_object1[(v57 / 3 << 1) + 1] = arr_object[v52 + 1];
                            v84 = v52 + 2;
                            break;
                        }
                        case 50: {
                            arr_v[v53] = v57;
                            int v85 = v57 / 3 << 1;
                            arr_object1[v85] = arr_object[v52 + 1];
                            if((v65 & 0x800) == 0) {
                                ++v53;
                                v84 = v52 + 2;
                            }
                            else {
                                arr_object1[v85 + 1] = arr_object[v52 + 2];
                                ++v53;
                                v84 = v52 + 3;
                            }
                            break;
                        }
                        default: {
                            v84 = v52 + 1;
                            break;
                        }
                    }
                    v80 = (int)unsafe0.objectFieldOffset(field2);
                    if((v65 & 0x1000) != 0x1000 || (v65 & 0xFF) > 17) {
                        v79 = v84;
                        s1 = s;
                        v82 = 0xFFFFF;
                        v81 = v71;
                        v83 = 0;
                    }
                    else {
                        int v86 = v71 + 1;
                        int v87 = s.charAt(v71);
                        if(v87 >= 0xD800) {
                            int v88 = v87 & 0x1FFF;
                            int v89 = 13;
                            while(true) {
                                v81 = v86 + 1;
                                v90 = s.charAt(v86);
                                if(v90 < 0xD800) {
                                    break;
                                }
                                v88 |= (v90 & 0x1FFF) << v89;
                                v89 += 13;
                                v86 = v81;
                            }
                            v87 = v88 | v90 << v89;
                        }
                        else {
                            v81 = v86;
                        }
                        int v91 = (v << 1) + v87 / 0x20;
                        Object object2 = arr_object[v91];
                        if(object2 instanceof Field) {
                            field3 = (Field)object2;
                        }
                        else {
                            field3 = zzko.zza(class1, ((String)object2));
                            arr_object[v91] = field3;
                        }
                        v79 = v84;
                        s1 = s;
                        v83 = v87 % 0x20;
                        v82 = (int)unsafe0.objectFieldOffset(field3);
                    }
                    if((v65 & 0xFF) >= 18 && (v65 & 0xFF) <= 49) {
                        arr_v[v55] = v80;
                        ++v55;
                    }
                }
                arr_v1[v57] = v58;
                int v92 = v57 + 2;
                arr_v1[v57 + 1] = ((v65 & 0x100) == 0 ? 0 : 0x10000000) | ((v65 & 0x200) == 0 ? 0 : 0x20000000) | (v65 & 0xFF) << 20 | v80;
                v57 += 3;
                arr_v1[v92] = v82 | v83 << 20;
                s = s1;
                v52 = v79;
                v54 = v81;
                v1 = v63;
                v14 = v70;
                zzla0 = zzla1;
            }
            return new zzko(arr_v1, arr_object1, v10, v11, zzla0.zzc(), z, false, arr_v, v14, v51, zzks0, zzju0, zzlu0, zziq0, zzkh0);
        }
        ((zzlr)zzki0).zza();
        throw new NoSuchMethodError();
    }

    private final zzlc zza(int v) {
        int v1 = v / 3 << 1;
        zzlc zzlc0 = (zzlc)this.zzd[v1];
        if(zzlc0 != null) {
            return zzlc0;
        }
        zzlc zzlc1 = zzky.zza().zza(((Class)this.zzd[v1 + 1]));
        this.zzd[v1] = zzlc1;
        return zzlc1;
    }

    private final Object zza(int v, int v1, Map map0, zzjg zzjg0, Object object0, zzlu zzlu0) {
        Object object1 = this.zzb(v);
        zzkf zzkf0 = this.zzs.zzb(object1);
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object2;
            if(!zzjg0.zza(((int)(((Integer)map$Entry0.getValue()))))) {
                if(object0 == null) {
                    object0 = zzlu0.zza();
                }
                zzib zzib0 = zzht.zzc(zzkc.zza(zzkf0, map$Entry0.getKey(), map$Entry0.getValue()));
                zzii zzii0 = zzib0.zzb();
                try {
                    zzkc.zza(zzii0, zzkf0, map$Entry0.getKey(), map$Entry0.getValue());
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                zzlu0.zza(object0, v1, zzib0.zza());
                iterator0.remove();
            }
        }
        return object0;
    }

    private final Object zza(Object object0, int v, Object object1, zzlu zzlu0) {
        int v1 = this.zzc[v];
        Object object2 = zzma.zzf(object0, ((long)(this.zzd(v) & 0xFFFFF)));
        if(object2 == null) {
            return object1;
        }
        zzjg zzjg0 = this.zzc(v);
        return zzjg0 == null ? object1 : this.zza(v, v1, this.zzs.zza(object2), zzjg0, object1, zzlu0);
    }

    private static Field zza(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            throw new RuntimeException("Field " + s + " for " + class0.getName() + " not found. Known fields are " + Arrays.toString(arr_field));
        }
    }

    private static List zza(Object object0, long v) {
        return (List)zzma.zzf(object0, v);
    }

    private static void zza(int v, Object object0, zzmr zzmr0) throws IOException {
        if(object0 instanceof String) {
            zzmr0.zza(v, ((String)object0));
            return;
        }
        zzmr0.zza(v, ((zzht)object0));
    }

    private static void zza(zzlu zzlu0, Object object0, zzmr zzmr0) throws IOException {
        zzlu0.zza(zzlu0.zzb(object0), zzmr0);
    }

    private final void zza(zzmr zzmr0, int v, Object object0, int v1) throws IOException {
        if(object0 != null) {
            Object object1 = this.zzb(v1);
            zzmr0.zza(v, this.zzs.zzb(object1), this.zzs.zzc(object0));
        }
    }

    private final void zza(Object object0, int v, zzld zzld0) throws IOException {
        if(zzko.zzf(v)) {
            zzma.zza(object0, ((long)(v & 0xFFFFF)), zzld0.zzm());
            return;
        }
        if(this.zzi) {
            zzma.zza(object0, ((long)(v & 0xFFFFF)), zzld0.zzl());
            return;
        }
        zzma.zza(object0, ((long)(v & 0xFFFFF)), zzld0.zzn());
    }

    private final void zza(Object object0, Object object1, int v) {
        int v1 = this.zzd(v);
        if(!this.zza(object1, v)) {
            return;
        }
        Object object2 = zzma.zzf(object0, ((long)(v1 & 0xFFFFF)));
        Object object3 = zzma.zzf(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 != null && object3 != null) {
            zzma.zza(object0, ((long)(v1 & 0xFFFFF)), zzjf.zza(object2, object3));
            this.zzb(object0, v);
            return;
        }
        if(object3 != null) {
            zzma.zza(object0, ((long)(v1 & 0xFFFFF)), object3);
            this.zzb(object0, v);
        }
    }

    private final boolean zza(Object object0, int v) {
        int v1 = this.zze(v);
        if(((long)(v1 & 0xFFFFF)) == 0xFFFFFL) {
            int v2 = this.zzd(v);
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    return zzma.zze(object0, ((long)(v2 & 0xFFFFF))) != 0.0;
                }
                case 1: {
                    return zzma.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0.0f;
                }
                case 2: {
                    return zzma.zzb(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return zzma.zzb(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return zzma.zza(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return zzma.zzb(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return zzma.zza(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return zzma.zzc(object0, ((long)(v2 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = zzma.zzf(object0, ((long)(v2 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzht)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzht.zza.equals(object1);
                }
                case 9: {
                    return zzma.zzf(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = zzma.zzf(object0, ((long)(v2 & 0xFFFFF)));
                    return !zzht.zza.equals(object2);
                }
                case 11: {
                    return zzma.zza(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return zzma.zza(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return zzma.zza(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return zzma.zzb(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return zzma.zza(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return zzma.zzb(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return zzma.zzf(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (zzma.zza(object0, ((long)(v1 & 0xFFFFF))) & 1 << (v1 >>> 20)) != 0;
    }

    private final boolean zza(Object object0, int v, int v1) {
        return zzma.zza(object0, ((long)(this.zze(v1) & 0xFFFFF))) == v;
    }

    private final boolean zza(Object object0, int v, int v1, int v2, int v3) {
        return v1 == 0xFFFFF ? this.zza(object0, v) : (v2 & v3) != 0;
    }

    private static boolean zza(Object object0, int v, zzlc zzlc0) {
        return zzlc0.zzd(zzma.zzf(object0, ((long)(v & 0xFFFFF))));
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final int zza(Object object0) {
        int v7;
        int v6;
        int v1 = 0;
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v2 = this.zzd(v);
            int v3 = this.zzc[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    v6 = v1 * 53;
                    v7 = zzjf.zza(Double.doubleToLongBits(zzma.zze(object0, v4)));
                    v1 = v6 + v7;
                    break;
                }
                case 1: {
                    v6 = v1 * 53;
                    v7 = Float.floatToIntBits(zzma.zzd(object0, v4));
                    v1 = v6 + v7;
                    break;
                }
                case 2: {
                    v1 = v1 * 53 + zzjf.zza(zzma.zzb(object0, v4));
                    break;
                }
                case 3: {
                    v1 = v1 * 53 + zzjf.zza(zzma.zzb(object0, v4));
                    break;
                }
                case 4: {
                    v1 = v1 * 53 + zzma.zza(object0, v4);
                    break;
                }
                case 5: {
                    v1 = v1 * 53 + zzjf.zza(zzma.zzb(object0, v4));
                    break;
                }
                case 6: {
                    v1 = v1 * 53 + zzma.zza(object0, v4);
                    break;
                }
                case 7: {
                    v1 = v1 * 53 + zzjf.zza(zzma.zzc(object0, v4));
                    break;
                }
                case 8: {
                    v1 = v1 * 53 + ((String)zzma.zzf(object0, v4)).hashCode();
                    break;
                }
                case 9: {
                    Object object1 = zzma.zzf(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = v1 * 53 + zzma.zzf(object0, v4).hashCode();
                    break;
                }
                case 11: {
                    v1 = v1 * 53 + zzma.zza(object0, v4);
                    break;
                }
                case 12: {
                    v1 = v1 * 53 + zzma.zza(object0, v4);
                    break;
                }
                case 13: {
                    v1 = v1 * 53 + zzma.zza(object0, v4);
                    break;
                }
                case 14: {
                    v1 = v1 * 53 + zzjf.zza(zzma.zzb(object0, v4));
                    break;
                }
                case 15: {
                    v1 = v1 * 53 + zzma.zza(object0, v4);
                    break;
                }
                case 16: {
                    v1 = v1 * 53 + zzjf.zza(zzma.zzb(object0, v4));
                    break;
                }
                case 17: {
                    Object object2 = zzma.zzf(object0, v4);
                    if(object2 != null) {
                        v5 = object2.hashCode();
                    }
                    v1 = v1 * 53 + v5;
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
                    v1 = v1 * 53 + zzma.zzf(object0, v4).hashCode();
                    break;
                }
                case 50: {
                    v1 = v1 * 53 + zzma.zzf(object0, v4).hashCode();
                    break;
                }
                case 51: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzjf.zza(Double.doubleToLongBits(zzko.zzb(object0, v4)));
                    }
                    break;
                }
                case 52: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + Float.floatToIntBits(zzko.zzc(object0, v4));
                    }
                    break;
                }
                case 53: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzjf.zza(zzko.zze(object0, v4));
                    }
                    break;
                }
                case 54: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzjf.zza(zzko.zze(object0, v4));
                    }
                    break;
                }
                case 55: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzko.zzd(object0, v4);
                    }
                    break;
                }
                case 56: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzjf.zza(zzko.zze(object0, v4));
                    }
                    break;
                }
                case 57: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzko.zzd(object0, v4);
                    }
                    break;
                }
                case 58: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzjf.zza(zzko.zzf(object0, v4));
                    }
                    break;
                }
                case 59: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + ((String)zzma.zzf(object0, v4)).hashCode();
                    }
                    break;
                }
                case 60: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzma.zzf(object0, v4).hashCode();
                    }
                    break;
                }
                case 61: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzma.zzf(object0, v4).hashCode();
                    }
                    break;
                }
                case 62: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzko.zzd(object0, v4);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzko.zzd(object0, v4);
                    }
                    break;
                }
                case 0x40: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzko.zzd(object0, v4);
                    }
                    break;
                }
                case 65: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzjf.zza(zzko.zze(object0, v4));
                    }
                    break;
                }
                case 66: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzko.zzd(object0, v4);
                    }
                    break;
                }
                case 67: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzjf.zza(zzko.zze(object0, v4));
                    }
                    break;
                }
                case 68: {
                    if(this.zza(object0, v3, v)) {
                        v1 = v1 * 53 + zzma.zzf(object0, v4).hashCode();
                    }
                }
            }
        }
        int v8 = v1 * 53 + this.zzq.zzb(object0).hashCode();
        return this.zzh ? v8 * 53 + this.zzr.zza(object0).hashCode() : v8;
    }

    final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, zzhn zzhn0) throws IOException {
        Double double0;
        Double double1;
        int v40;
        int v39;
        int v38;
        int v37;
        int v36;
        int v35;
        int v31;
        int v30;
        int v28;
        int v27;
        int v26;
        int v25;
        long v24;
        int v17;
        int v16;
        boolean z;
        int v15;
        int v14;
        int v11;
        int v10;
        Unsafe unsafe0 = zzko.zzb;
        int v3 = v;
        int v4 = -1;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0xFFFFF;
        while(true) {
            if(v3 < v1) {
                int v9 = arr_b[v3];
                if(v9 < 0) {
                    v10 = zzhl.zza(v9, arr_b, v3 + 1, zzhn0);
                    v11 = zzhn0.zza;
                }
                else {
                    v11 = v9;
                    v10 = v3 + 1;
                }
                int v12 = v11 >>> 3;
                int v13 = v12 <= v4 ? this.zzg(v12) : this.zza(v12, v5 / 3);
                if(v13 == -1) {
                    v14 = v12;
                    v15 = v10;
                    z = true;
                    v16 = 0;
                    v17 = v11;
                    goto label_277;
                }
                else {
                    int[] arr_v = this.zzc;
                    int v18 = arr_v[v13 + 1];
                    int v19 = (v18 & 0xFF00000) >>> 20;
                    long v20 = (long)(v18 & 0xFFFFF);
                    if(v19 <= 17) {
                        int v21 = arr_v[v13 + 2];
                        int v22 = 1 << (v21 >>> 20);
                        int v23 = v21 & 0xFFFFF;
                        if(v23 == v8) {
                            v24 = v20;
                        }
                        else {
                            if(v8 == 0xFFFFF) {
                                v24 = v20;
                            }
                            else {
                                v24 = v20;
                                unsafe0.putInt(object0, ((long)v8), v7);
                            }
                            v7 = unsafe0.getInt(object0, ((long)v23));
                            v8 = v23;
                        }
                        switch(v19) {
                            case 0: {
                                v25 = v13;
                                v26 = v12;
                                v27 = v10;
                                v28 = v11;
                                if((v11 & 7) == 1) {
                                    zzma.zza(object0, v24, zzhl.zzc(arr_b, v27));
                                    v3 = v27 + 8;
                                    v7 |= v22;
                                    v6 = v28;
                                    v4 = v26;
                                    v5 = v25;
                                    continue;
                                }
                                break;
                            }
                            case 1: {
                                v25 = v13;
                                v26 = v12;
                                v27 = v10;
                                v28 = v11;
                                if((v11 & 7) == 5) {
                                    zzma.zza(object0, v24, zzhl.zzd(arr_b, v27));
                                    v3 = v27 + 4;
                                    v7 |= v22;
                                    v6 = v28;
                                    v4 = v26;
                                    v5 = v25;
                                    continue;
                                }
                                break;
                            }
                            case 2: 
                            case 3: {
                                v25 = v13;
                                v26 = v12;
                                v28 = v11;
                                if((v11 & 7) == 0) {
                                    int v29 = zzhl.zzb(arr_b, v10, zzhn0);
                                    unsafe0.putLong(object0, v24, zzhn0.zzb);
                                    v7 |= v22;
                                    v6 = v28;
                                    v3 = v29;
                                    v4 = v26;
                                    v5 = v25;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    break;
                                }
                                goto label_72;
                            }
                            case 7: {
                            label_109:
                                v25 = v13;
                                v30 = v12;
                                v28 = v11;
                                if((v11 & 7) == 0) {
                                    v3 = zzhl.zzb(arr_b, v10, zzhn0);
                                    zzma.zza(object0, v24, zzhn0.zzb != 0L);
                                    v7 |= v22;
                                    v6 = v28;
                                    v5 = v25;
                                    v4 = v30;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    v26 = v30;
                                    break;
                                }
                                goto label_121;
                            }
                            case 8: {
                            label_121:
                                v25 = v13;
                                v30 = v12;
                                v28 = v11;
                                if((v11 & 7) == 2) {
                                    v3 = (0x20000000 & v18) == 0 ? zzhl.zzc(arr_b, v10, zzhn0) : zzhl.zzd(arr_b, v10, zzhn0);
                                    unsafe0.putObject(object0, v24, zzhn0.zzc);
                                    v7 |= v22;
                                    v6 = v28;
                                    v5 = v25;
                                    v4 = v30;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    v26 = v30;
                                    break;
                                }
                                goto label_134;
                            }
                            case 9: {
                            label_134:
                                v25 = v13;
                                v30 = v12;
                                if((v11 & 7) == 2) {
                                    v3 = zzhl.zza(this.zza(v25), arr_b, v10, v1, zzhn0);
                                    if((v7 & v22) == 0) {
                                        unsafe0.putObject(object0, v24, zzhn0.zzc);
                                    }
                                    else {
                                        unsafe0.putObject(object0, v24, zzjf.zza(unsafe0.getObject(object0, v24), zzhn0.zzc));
                                    }
                                    v7 |= v22;
                                    v6 = v11;
                                    v5 = v25;
                                    v4 = v30;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    v28 = v11;
                                }
                                v26 = v30;
                                break;
                            }
                            case 10: {
                                v25 = v13;
                                v30 = v12;
                                v31 = v11;
                                if((v11 & 7) == 2) {
                                    v3 = zzhl.zze(arr_b, v10, zzhn0);
                                    unsafe0.putObject(object0, v24, zzhn0.zzc);
                                    goto label_176;
                                }
                                v27 = v10;
                                v28 = v31;
                                v26 = v30;
                                break;
                            }
                            case 4: 
                            case 11: {
                            label_72:
                                v25 = v13;
                                v26 = v12;
                                v28 = v11;
                                if((v11 & 7) == 0) {
                                    v3 = zzhl.zza(arr_b, v10, zzhn0);
                                    unsafe0.putInt(object0, v24, zzhn0.zza);
                                    v7 |= v22;
                                    v6 = v28;
                                    v4 = v26;
                                    v5 = v25;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    break;
                                }
                                goto label_84;
                            }
                            case 12: {
                                v25 = v13;
                                v30 = v12;
                                v31 = v11;
                                if((v11 & 7) == 0) {
                                    v3 = zzhl.zza(arr_b, v10, zzhn0);
                                    int v32 = zzhn0.zza;
                                    zzjg zzjg0 = this.zzc(v25);
                                    if(zzjg0 == null || zzjg0.zza(v32)) {
                                        unsafe0.putInt(object0, v24, v32);
                                        goto label_176;
                                    }
                                    else {
                                        zzko.zze(object0).zza(v31, ((long)v32));
                                        v4 = v30;
                                        v6 = v31;
                                        v5 = v25;
                                        continue;
                                    }
                                    goto label_170;
                                }
                                v27 = v10;
                                v28 = v31;
                                v26 = v30;
                                break;
                            }
                            case 6: 
                            case 13: {
                            label_96:
                                v25 = v13;
                                v26 = v12;
                                v28 = v11;
                                if((v11 & 7) == 5) {
                                    unsafe0.putInt(object0, v24, zzhl.zza(arr_b, v10));
                                    v3 = v10 + 4;
                                    v7 |= v22;
                                    v6 = v28;
                                    v5 = v25;
                                    v4 = v26;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    break;
                                }
                                goto label_109;
                            }
                            case 5: 
                            case 14: {
                            label_84:
                                v25 = v13;
                                v26 = v12;
                                v28 = v11;
                                if((v11 & 7) == 1) {
                                    unsafe0.putLong(object0, v24, zzhl.zzb(arr_b, v10));
                                    v3 = v10 + 8;
                                    v7 |= v22;
                                    v6 = v28;
                                    v4 = v26;
                                    v5 = v25;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    break;
                                }
                                goto label_96;
                            }
                            case 15: {
                            label_170:
                                v25 = v13;
                                v30 = v12;
                                v31 = v11;
                                if((v11 & 7) == 0) {
                                    v3 = zzhl.zza(arr_b, v10, zzhn0);
                                    unsafe0.putInt(object0, v24, -(zzhn0.zza & 1) ^ zzhn0.zza >>> 1);
                                label_176:
                                    v7 |= v22;
                                    v4 = v30;
                                    v6 = v31;
                                    v5 = v25;
                                    continue;
                                }
                                v27 = v10;
                                v28 = v31;
                                v26 = v30;
                                break;
                            }
                            case 16: {
                                v25 = v13;
                                if((v11 & 7) == 0) {
                                    int v33 = zzhl.zzb(arr_b, v10, zzhn0);
                                    unsafe0.putLong(object0, v24, -(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1);
                                    v7 |= v22;
                                    v4 = v12;
                                    v6 = v11;
                                    v5 = v25;
                                    v3 = v33;
                                    continue;
                                }
                                else {
                                    v27 = v10;
                                    v28 = v11;
                                    v26 = v12;
                                    break;
                                }
                                goto label_199;
                            }
                            case 17: {
                            label_199:
                                if((v11 & 7) == 3) {
                                    v3 = zzhl.zza(this.zza(v13), arr_b, v10, v1, v12 << 3 | 4, zzhn0);
                                    if((v7 & v22) == 0) {
                                        unsafe0.putObject(object0, v24, zzhn0.zzc);
                                    }
                                    else {
                                        unsafe0.putObject(object0, v24, zzjf.zza(unsafe0.getObject(object0, v24), zzhn0.zzc));
                                    }
                                    v7 |= v22;
                                    v4 = v12;
                                    v6 = v11;
                                    v5 = v13;
                                    continue;
                                }
                            label_210:
                                v25 = v13;
                                v26 = v12;
                                v27 = v10;
                                v28 = v11;
                                break;
                            }
                            default: {
                                goto label_210;
                            }
                        }
                        v15 = v27;
                        v14 = v26;
                        v16 = v25;
                        z = true;
                        v17 = v28;
                        goto label_277;
                    }
                    else if(v19 == 27) {
                        if((v11 & 7) == 2) {
                            zzjl zzjl0 = (zzjl)unsafe0.getObject(object0, v20);
                            if(!zzjl0.zza()) {
                                int v34 = zzjl0.size();
                                zzjl0 = zzjl0.zza((v34 == 0 ? 10 : v34 << 1));
                                unsafe0.putObject(object0, v20, zzjl0);
                            }
                            v3 = zzhl.zza(this.zza(v13), v11, arr_b, v10, v1, zzjl0, zzhn0);
                            v6 = v11;
                            v4 = v12;
                            v5 = v13;
                            continue;
                        }
                        else {
                            v35 = v7;
                            v14 = v12;
                            v36 = v8;
                            v16 = v13;
                            z = true;
                            v17 = v11;
                            v15 = v10;
                            v7 = v35;
                            v8 = v36;
                            goto label_277;
                        }
                        goto label_240;
                    }
                    else {
                    label_240:
                        v35 = v7;
                        if(v19 <= 49) {
                            v36 = v8;
                            v14 = v12;
                            z = true;
                            v16 = v13;
                            v3 = this.zza(object0, arr_b, v10, v1, v11, v12, v11 & 7, v13, ((long)v18), v19, v20, zzhn0);
                            if(v3 == v10) {
                                goto label_263;
                            }
                            else {
                                goto label_257;
                            }
                            goto label_249;
                        }
                        else {
                        label_249:
                            v36 = v8;
                            v14 = v12;
                            v16 = v13;
                            z = true;
                            if(v19 == 50) {
                                if((v11 & 7) == 2) {
                                    v3 = this.zza(object0, arr_b, v10, v1, v16, v20, zzhn0);
                                    if(v3 != v10) {
                                    label_257:
                                        v6 = v11;
                                        v4 = v14;
                                        v7 = v35;
                                        v5 = v16;
                                        v8 = v36;
                                        continue;
                                    }
                                label_263:
                                    v17 = v11;
                                    v15 = v3;
                                }
                                else {
                                    v17 = v11;
                                    v15 = v10;
                                }
                                v7 = v35;
                                v8 = v36;
                                goto label_277;
                            }
                            else {
                                v3 = this.zza(object0, arr_b, v10, v1, v11, v14, v11 & 7, v18, v19, v20, v16, zzhn0);
                                if(v3 == v10) {
                                    v17 = v11;
                                    v15 = v3;
                                    v7 = v35;
                                    v8 = v36;
                                label_277:
                                    if(v17 == v2 && v2 != 0) {
                                        v3 = v15;
                                        v37 = v7;
                                        v6 = v17;
                                        break;
                                    }
                                    if(this.zzh) {
                                        zzio zzio0 = zzio.zzb();
                                        if(zzhn0.zzd != zzio0) {
                                            v38 = v14;
                                            zze zzjb$zze0 = zzhn0.zzd.zza(this.zzg, v38);
                                            if(zzjb$zze0 == null) {
                                                v3 = zzhl.zza(v17, arr_b, v15, v1, zzko.zze(object0), zzhn0);
                                                v39 = v7;
                                                v40 = v8;
                                            }
                                            else {
                                                ((zzc)object0).zza();
                                                zziu zziu0 = ((zzc)object0).zzc;
                                                zzml zzml0 = zzjb$zze0.zzd.zzc;
                                                if(zzml0 != zzml.zzn) {
                                                    int[] arr_v1 = zzhk.zza;
                                                    switch(arr_v1[zzml0.ordinal()]) {
                                                        case 1: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            double1 = zzhl.zzc(arr_b, v15);
                                                            v15 += 8;
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 2: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            double1 = zzhl.zzd(arr_b, v15);
                                                            v15 += 4;
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 3: 
                                                        case 4: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zzb(arr_b, v15, zzhn0);
                                                            double1 = zzhn0.zzb;
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 5: 
                                                        case 6: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zza(arr_b, v15, zzhn0);
                                                            double1 = zzhn0.zza;
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 7: 
                                                        case 8: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            double1 = zzhl.zzb(arr_b, v15);
                                                            v15 += 8;
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 9: 
                                                        case 10: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            double1 = zzhl.zza(arr_b, v15);
                                                            v15 += 4;
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 11: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zzb(arr_b, v15, zzhn0);
                                                            if(zzhn0.zzb == 0L) {
                                                                z = false;
                                                            }
                                                            double1 = Boolean.valueOf(z);
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 12: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zza(arr_b, v15, zzhn0);
                                                            double1 = (int)(-(zzhn0.zza & 1) ^ zzhn0.zza >>> 1);
                                                            double0 = double1;
                                                            break;
                                                        }
                                                        case 13: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zzb(arr_b, v15, zzhn0);
                                                            double0 = (long)(-(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1);
                                                            break;
                                                        }
                                                        case 14: {
                                                            throw new IllegalStateException("Shouldn\'t reach here.");
                                                        }
                                                        case 15: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zze(arr_b, v15, zzhn0);
                                                            double0 = zzhn0.zzc;
                                                            break;
                                                        }
                                                        case 16: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zzc(arr_b, v15, zzhn0);
                                                            double0 = zzhn0.zzc;
                                                            break;
                                                        }
                                                        case 17: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            v15 = zzhl.zza(zzky.zza().zza(zzjb$zze0.zzc.getClass()), arr_b, v15, v1, v38 << 3 | 4, zzhn0);
                                                            double0 = zzhn0.zzc;
                                                            break;
                                                        }
                                                        case 18: {
                                                            v15 = zzhl.zza(zzky.zza().zza(zzjb$zze0.zzc.getClass()), arr_b, v15, v1, zzhn0);
                                                            double0 = zzhn0.zzc;
                                                            v39 = v7;
                                                            v40 = v8;
                                                            break;
                                                        }
                                                        default: {
                                                            v39 = v7;
                                                            v40 = v8;
                                                            double0 = null;
                                                            break;
                                                        }
                                                    }
                                                    zzf zzjb$zzf0 = zzjb$zze0.zzd;
                                                    if(zzjb$zzf0.zzd) {
                                                        zziu0.zzb(zzjb$zzf0, double0);
                                                    }
                                                    else {
                                                        switch(arr_v1[zzjb$zzf0.zzc.ordinal()]) {
                                                            case 17: 
                                                            case 18: {
                                                                Object object1 = zziu0.zza(zzjb$zze0.zzd);
                                                                if(object1 != null) {
                                                                    double0 = zzjf.zza(object1, double0);
                                                                }
                                                            }
                                                        }
                                                        zziu0.zza(zzjb$zze0.zzd, double0);
                                                    }
                                                    v3 = v15;
                                                    goto label_389;
                                                }
                                                zzhl.zza(arr_b, v15, zzhn0);
                                                throw null;
                                            }
                                        }
                                    }
                                    else {
                                        v39 = v7;
                                        v38 = v14;
                                        v40 = v8;
                                        v3 = zzhl.zza(v17, arr_b, v15, v1, zzko.zze(object0), zzhn0);
                                    }
                                label_389:
                                    v6 = v17;
                                    v4 = v38;
                                    v5 = v16;
                                    v7 = v39;
                                    v8 = v40;
                                }
                                else {
                                    v6 = v11;
                                    v4 = v14;
                                    v7 = v35;
                                    v5 = v16;
                                    v8 = v36;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            v37 = v7;
            break;
        }
        if(v8 != 0xFFFFF) {
            unsafe0.putInt(object0, ((long)v8), v37);
        }
        int v41 = this.zzm;
        zzlx zzlx0 = null;
        while(v41 < this.zzn) {
            zzlx0 = (zzlx)this.zza(object0, this.zzl[v41], zzlx0, this.zzq);
            ++v41;
        }
        if(zzlx0 != null) {
            this.zzq.zzb(object0, zzlx0);
        }
        if(v2 == 0) {
            if(v3 != v1) {
                throw zzjk.zzg();
            }
            return v3;
        }
        if(v3 > v1 || v6 != v2) {
            throw zzjk.zzg();
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final Object zza() {
        return this.zzo.zza(this.zzg);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zza(Object object0, zzld zzld0, zzio zzio0) throws IOException {
        int v10;
        int v4;
        int v3;
        int v1;
        int v;
        zzio0.getClass();
        zzlu zzlu0 = this.zzq;
        zziq zziq0 = this.zzr;
        zziu zziu0 = null;
        Object object1 = null;
        while(true) {
        alab1:
            while(true) {
                try {
                    while(true) {
                    label_5:
                        v = zzld0.zza();
                        v1 = this.zzg(v);
                        if(v1 >= 0) {
                            goto label_35;
                        }
                        if(v == 0x7FFFFFFF) {
                            goto label_27;
                        }
                        Object object2 = this.zzh ? zziq0.zza(zzio0, this.zzg, v) : null;
                        if(object2 == null) {
                            zzlu0.zza(zzld0);
                            if(object1 == null) {
                                object1 = zzlu0.zzc(object0);
                            }
                            if(!zzlu0.zza(object1, zzld0)) {
                                break;
                            }
                        }
                        else {
                            if(zziu0 == null) {
                                zziu0 = zziq0.zzb(object0);
                            }
                            object1 = zziq0.zza(zzld0, object2, zzio0, zziu0, object1, zzlu0);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    goto label_276;
                }
                for(int v2 = this.zzm; v2 < this.zzn; ++v2) {
                    object1 = this.zza(object0, this.zzl[v2], object1, zzlu0);
                }
                if(object1 != null) {
                    zzlu0.zzb(object0, object1);
                }
                return;
                try {
                label_27:
                    v3 = this.zzm;
                }
                catch(Throwable throwable0) {
                    goto label_276;
                }
                while(v3 < this.zzn) {
                    object1 = this.zza(object0, this.zzl[v3], object1, zzlu0);
                    ++v3;
                }
                if(object1 != null) {
                    zzlu0.zzb(object0, object1);
                }
                return;
                try {
                label_35:
                    v4 = this.zzd(v1);
                    switch((0xFF00000 & v4) >>> 20) {
                        case 0: {
                            goto label_48;
                        }
                        case 1: {
                            goto label_51;
                        }
                        case 2: {
                            goto label_54;
                        }
                        case 3: {
                            goto label_57;
                        }
                        case 4: {
                            goto label_60;
                        }
                        case 5: {
                            goto label_63;
                        }
                        case 6: {
                            goto label_66;
                        }
                        case 7: {
                            goto label_69;
                        }
                        case 8: {
                            goto label_72;
                        }
                        case 9: {
                            goto label_75;
                        }
                        case 10: {
                            goto label_81;
                        }
                        case 11: {
                            goto label_84;
                        }
                        case 12: {
                            goto label_87;
                        }
                        case 13: {
                            goto label_95;
                        }
                        case 14: {
                            goto label_98;
                        }
                        case 15: {
                            goto label_101;
                        }
                        case 16: {
                            goto label_104;
                        }
                        case 17: {
                            goto label_107;
                        }
                        case 18: {
                            goto label_113;
                        }
                        case 19: {
                            goto label_115;
                        }
                        case 20: {
                            goto label_117;
                        }
                        case 21: {
                            goto label_119;
                        }
                        case 22: {
                            goto label_121;
                        }
                        case 23: {
                            goto label_123;
                        }
                        case 24: {
                            goto label_125;
                        }
                        case 25: {
                            goto label_127;
                        }
                        case 26: {
                            goto label_129;
                        }
                        case 27: {
                            goto label_134;
                        }
                        case 28: {
                            goto label_137;
                        }
                        case 29: {
                            goto label_139;
                        }
                        case 30: {
                            goto label_141;
                        }
                        case 0x1F: {
                            goto label_145;
                        }
                        case 0x20: {
                            goto label_147;
                        }
                        case 33: {
                            goto label_149;
                        }
                        case 34: {
                            goto label_151;
                        }
                        case 35: {
                            goto label_153;
                        }
                        case 36: {
                            goto label_155;
                        }
                        case 37: {
                            goto label_157;
                        }
                        case 38: {
                            goto label_159;
                        }
                        case 39: {
                            goto label_161;
                        }
                        case 40: {
                            goto label_163;
                        }
                        case 41: {
                            goto label_165;
                        }
                        case 42: {
                            goto label_167;
                        }
                        case 43: {
                            goto label_169;
                        }
                        case 44: {
                            goto label_171;
                        }
                        case 45: {
                            goto label_175;
                        }
                        case 46: {
                            goto label_177;
                        }
                        case 0x2F: {
                            goto label_179;
                        }
                        case 0x30: {
                            goto label_181;
                        }
                        case 49: {
                            goto label_183;
                        }
                        case 50: {
                            goto label_186;
                        }
                        case 51: {
                            goto label_200;
                        }
                        case 52: {
                            goto label_203;
                        }
                        case 53: {
                            goto label_206;
                        }
                        case 54: {
                            goto label_209;
                        }
                        case 55: {
                            goto label_212;
                        }
                        case 56: {
                            goto label_215;
                        }
                        case 57: {
                            goto label_218;
                        }
                        case 58: {
                            goto label_221;
                        }
                        case 59: {
                            goto label_224;
                        }
                        case 60: {
                            goto label_227;
                        }
                        case 61: {
                            goto label_234;
                        }
                        case 62: {
                            goto label_237;
                        }
                        case 0x3F: {
                            goto label_240;
                        }
                        case 0x40: {
                            goto label_248;
                        }
                        case 65: {
                            goto label_251;
                        }
                        case 66: {
                            goto label_254;
                        }
                        case 67: {
                            goto label_257;
                        }
                        case 68: {
                            goto label_260;
                        }
                        default: {
                            try {
                                if(object1 == null) {
                                    object1 = zzlu0.zza();
                                }
                                if(zzlu0.zza(object1, zzld0)) {
                                    break;
                                }
                                break alab1;
                            }
                            catch(zzjn unused_ex) {
                                goto label_263;
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    goto label_276;
                }
            }
            for(int v5 = this.zzm; v5 < this.zzn; ++v5) {
                object1 = this.zza(object0, this.zzl[v5], object1, zzlu0);
            }
            if(object1 != null) {
                zzlu0.zzb(object0, object1);
            }
            return;
            try {
                try {
                label_48:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzd());
                    this.zzb(object0, v1);
                    goto label_5;
                label_51:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zze());
                    this.zzb(object0, v1);
                    goto label_5;
                label_54:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzg());
                    this.zzb(object0, v1);
                    goto label_5;
                label_57:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzf());
                    this.zzb(object0, v1);
                    goto label_5;
                label_60:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzh());
                    this.zzb(object0, v1);
                    goto label_5;
                label_63:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzi());
                    this.zzb(object0, v1);
                    goto label_5;
                label_66:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzj());
                    this.zzb(object0, v1);
                    goto label_5;
                label_69:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzk());
                    this.zzb(object0, v1);
                    goto label_5;
                label_72:
                    this.zza(object0, v4, zzld0);
                    this.zzb(object0, v1);
                    goto label_5;
                label_75:
                    if(this.zza(object0, v1)) {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzjf.zza(zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), zzld0.zza(this.zza(v1), zzio0)));
                    }
                    else {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zza(this.zza(v1), zzio0));
                        this.zzb(object0, v1);
                    }
                    goto label_5;
                label_81:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzn());
                    this.zzb(object0, v1);
                    goto label_5;
                label_84:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzo());
                    this.zzb(object0, v1);
                    goto label_5;
                label_87:
                    int v6 = zzld0.zzp();
                    zzjg zzjg0 = this.zzc(v1);
                    if(zzjg0 == null || zzjg0.zza(v6)) {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), v6);
                        this.zzb(object0, v1);
                    }
                    else {
                        object1 = zzle.zza(v, v6, object1, zzlu0);
                    }
                    goto label_5;
                label_95:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzq());
                    this.zzb(object0, v1);
                    goto label_5;
                label_98:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzr());
                    this.zzb(object0, v1);
                    goto label_5;
                label_101:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzs());
                    this.zzb(object0, v1);
                    goto label_5;
                label_104:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzt());
                    this.zzb(object0, v1);
                    goto label_5;
                label_107:
                    if(this.zza(object0, v1)) {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzjf.zza(zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), zzld0.zzb(this.zza(v1), zzio0)));
                    }
                    else {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzb(this.zza(v1), zzio0));
                        this.zzb(object0, v1);
                    }
                    goto label_5;
                label_113:
                    zzld0.zza(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_115:
                    zzld0.zzb(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_117:
                    zzld0.zzd(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_119:
                    zzld0.zzc(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_121:
                    zzld0.zze(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_123:
                    zzld0.zzf(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_125:
                    zzld0.zzg(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_127:
                    zzld0.zzh(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_129:
                    if(zzko.zzf(v4)) {
                        zzld0.zzj(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    else {
                        zzld0.zzi(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    }
                    goto label_5;
                label_134:
                    zzlc zzlc0 = this.zza(v1);
                    zzld0.zza(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))), zzlc0, zzio0);
                    goto label_5;
                label_137:
                    zzld0.zzk(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_139:
                    zzld0.zzl(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_141:
                    List list0 = this.zzp.zza(object0, ((long)(v4 & 0xFFFFF)));
                    zzld0.zzm(list0);
                    object1 = zzle.zza(v, list0, this.zzc(v1), object1, zzlu0);
                    goto label_5;
                label_145:
                    zzld0.zzn(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_147:
                    zzld0.zzo(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_149:
                    zzld0.zzp(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_151:
                    zzld0.zzq(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_153:
                    zzld0.zza(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_155:
                    zzld0.zzb(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_157:
                    zzld0.zzd(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_159:
                    zzld0.zzc(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_161:
                    zzld0.zze(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_163:
                    zzld0.zzf(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_165:
                    zzld0.zzg(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_167:
                    zzld0.zzh(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_169:
                    zzld0.zzl(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_171:
                    List list1 = this.zzp.zza(object0, ((long)(v4 & 0xFFFFF)));
                    zzld0.zzm(list1);
                    object1 = zzle.zza(v, list1, this.zzc(v1), object1, zzlu0);
                    goto label_5;
                label_175:
                    zzld0.zzn(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_177:
                    zzld0.zzo(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_179:
                    zzld0.zzp(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_181:
                    zzld0.zzq(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_5;
                label_183:
                    zzlc zzlc1 = this.zza(v1);
                    zzld0.zzb(this.zzp.zza(object0, ((long)(v4 & 0xFFFFF))), zzlc1, zzio0);
                    goto label_5;
                label_186:
                    Object object3 = this.zzb(v1);
                    long v7 = (long)(this.zzd(v1) & 0xFFFFF);
                    Object object4 = zzma.zzf(object0, v7);
                    if(object4 == null) {
                        object4 = this.zzs.zzf(object3);
                        zzma.zza(object0, v7, object4);
                    }
                    else if(this.zzs.zzd(object4)) {
                        Object object5 = this.zzs.zzf(object3);
                        this.zzs.zza(object5, object4);
                        zzma.zza(object0, v7, object5);
                        object4 = object5;
                    }
                    zzld0.zza(this.zzs.zza(object4), this.zzs.zzb(object3), zzio0);
                    goto label_5;
                label_200:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzd());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_203:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zze());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_206:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzg());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_209:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzf());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_212:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzh());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_215:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzi());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_218:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzj());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_221:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), Boolean.valueOf(zzld0.zzk()));
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_224:
                    this.zza(object0, v4, zzld0);
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_227:
                    if(this.zza(object0, v, v1)) {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzjf.zza(zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), zzld0.zza(this.zza(v1), zzio0)));
                    }
                    else {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zza(this.zza(v1), zzio0));
                        this.zzb(object0, v1);
                    }
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_234:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzn());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_237:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzo());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_240:
                    int v8 = zzld0.zzp();
                    zzjg zzjg1 = this.zzc(v1);
                    if(zzjg1 == null || zzjg1.zza(v8)) {
                        zzma.zza(object0, ((long)(v4 & 0xFFFFF)), v8);
                        this.zzb(object0, v, v1);
                    }
                    else {
                        object1 = zzle.zza(v, v8, object1, zzlu0);
                    }
                    goto label_5;
                label_248:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzq());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_251:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzr());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_254:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzs());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_257:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzt());
                    this.zzb(object0, v, v1);
                    goto label_5;
                label_260:
                    zzma.zza(object0, ((long)(v4 & 0xFFFFF)), zzld0.zzb(this.zza(v1), zzio0));
                    this.zzb(object0, v, v1);
                    goto label_5;
                }
                catch(zzjn unused_ex) {
                }
            label_263:
                zzlu0.zza(zzld0);
                if(object1 == null) {
                    object1 = zzlu0.zzc(object0);
                }
                if(zzlu0.zza(object1, zzld0)) {
                    goto label_5;
                }
                break;
            }
            catch(Throwable throwable0) {
                goto label_276;
            }
        }
        for(int v9 = this.zzm; v9 < this.zzn; ++v9) {
            object1 = this.zza(object0, this.zzl[v9], object1, zzlu0);
        }
        if(object1 != null) {
            zzlu0.zzb(object0, object1);
        }
        return;
        try {
        label_276:
            v10 = this.zzm;
        }
        catch(Throwable throwable0) {
            goto label_276;
        }
        while(v10 < this.zzn) {
            object1 = this.zza(object0, this.zzl[v10], object1, zzlu0);
            ++v10;
        }
        if(object1 != null) {
            zzlu0.zzb(object0, object1);
        }
        throw throwable0;
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zza(Object object0, zzmr zzmr0) throws IOException {
        Map.Entry map$Entry1;
        Iterator iterator1;
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(zzmr0.zza() == zzmq.zzb) {
            zzko.zza(this.zzq, object0, zzmr0);
            if(this.zzh) {
                zziu zziu0 = this.zzr.zza(object0);
                if(zziu0.zza.isEmpty()) {
                    iterator0 = null;
                    map$Entry0 = null;
                }
                else {
                    iterator0 = zziu0.zze();
                    Object object1 = iterator0.next();
                    map$Entry0 = (Map.Entry)object1;
                }
            }
            else {
                iterator0 = null;
                map$Entry0 = null;
            }
            for(int v = this.zzc.length - 3; v >= 0; v -= 3) {
                int v1 = this.zzd(v);
                int v2 = this.zzc[v];
                while(map$Entry0 != null && this.zzr.zza(map$Entry0) > v2) {
                    this.zzr.zza(zzmr0, map$Entry0);
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
                            zzmr0.zza(v2, zzma.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.zza(object0, v)) {
                            zzmr0.zza(v2, zzma.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zza(object0, v)) {
                            zzmr0.zza(v2, zzma.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzc(v2, zzma.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzc(v2, zzma.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzd(v2, zzma.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzd(v2, zzma.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.zza(object0, v)) {
                            zzmr0.zza(v2, zzma.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.zza(object0, v)) {
                            zzko.zza(v2, zzma.zzf(object0, ((long)(v1 & 0xFFFFF))), zzmr0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.zza(object0, v)) {
                            zzmr0.zza(v2, zzma.zzf(object0, ((long)(v1 & 0xFFFFF))), this.zza(v));
                        }
                        break;
                    }
                    case 10: {
                        if(this.zza(object0, v)) {
                            zzmr0.zza(v2, ((zzht)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.zza(object0, v)) {
                            zzmr0.zze(v2, zzma.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzb(v2, zzma.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.zza(object0, v)) {
                            zzmr0.zza(v2, zzma.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzb(v2, zzma.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzf(v2, zzma.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.zza(object0, v)) {
                            zzmr0.zze(v2, zzma.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.zza(object0, v)) {
                            zzmr0.zzb(v2, zzma.zzf(object0, ((long)(v1 & 0xFFFFF))), this.zza(v));
                        }
                        break;
                    }
                    case 18: {
                        zzle.zza(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 19: {
                        zzle.zzb(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 20: {
                        zzle.zzc(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 21: {
                        zzle.zzd(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 22: {
                        zzle.zzh(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 23: {
                        zzle.zzf(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 24: {
                        zzle.zzk(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 25: {
                        zzle.zzn(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 26: {
                        zzle.zza(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0);
                        break;
                    }
                    case 27: {
                        zzle.zza(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, this.zza(v));
                        break;
                    }
                    case 28: {
                        zzle.zzb(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0);
                        break;
                    }
                    case 29: {
                        zzle.zzi(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 30: {
                        zzle.zzm(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 0x1F: {
                        zzle.zzl(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 0x20: {
                        zzle.zzg(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 33: {
                        zzle.zzj(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 34: {
                        zzle.zze(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 35: {
                        zzle.zza(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 36: {
                        zzle.zzb(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 37: {
                        zzle.zzc(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 38: {
                        zzle.zzd(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 39: {
                        zzle.zzh(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 40: {
                        zzle.zzf(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 41: {
                        zzle.zzk(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 42: {
                        zzle.zzn(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 43: {
                        zzle.zzi(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 44: {
                        zzle.zzm(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 45: {
                        zzle.zzl(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 46: {
                        zzle.zzg(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 0x2F: {
                        zzle.zzj(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 0x30: {
                        zzle.zze(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 49: {
                        zzle.zzb(this.zzc[v], ((List)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))), zzmr0, this.zza(v));
                        break;
                    }
                    case 50: {
                        this.zza(zzmr0, v2, zzma.zzf(object0, ((long)(v1 & 0xFFFFF))), v);
                        break;
                    }
                    case 51: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zza(v2, zzko.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zza(v2, zzko.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zza(v2, zzko.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzc(v2, zzko.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzc(v2, zzko.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzd(v2, zzko.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzd(v2, zzko.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zza(v2, zzko.zzf(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 59: {
                        if(this.zza(object0, v2, v)) {
                            zzko.zza(v2, zzma.zzf(object0, ((long)(v1 & 0xFFFFF))), zzmr0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zza(v2, zzma.zzf(object0, ((long)(v1 & 0xFFFFF))), this.zza(v));
                        }
                        break;
                    }
                    case 61: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zza(v2, ((zzht)zzma.zzf(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zze(v2, zzko.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzb(v2, zzko.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zza(v2, zzko.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzb(v2, zzko.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzf(v2, zzko.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zze(v2, zzko.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.zza(object0, v2, v)) {
                            zzmr0.zzb(v2, zzma.zzf(object0, ((long)(v1 & 0xFFFFF))), this.zza(v));
                        }
                    }
                }
            }
            while(map$Entry0 != null) {
                this.zzr.zza(zzmr0, map$Entry0);
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
        if(this.zzj) {
            if(this.zzh) {
                zziu zziu1 = this.zzr.zza(object0);
                if(zziu1.zza.isEmpty()) {
                    iterator1 = null;
                    map$Entry1 = null;
                }
                else {
                    iterator1 = zziu1.zzd();
                    Object object4 = iterator1.next();
                    map$Entry1 = (Map.Entry)object4;
                }
            }
            else {
                iterator1 = null;
                map$Entry1 = null;
            }
            for(int v3 = 0; v3 < this.zzc.length; v3 += 3) {
                int v4 = this.zzd(v3);
                int v5 = this.zzc[v3];
                while(map$Entry1 != null && this.zzr.zza(map$Entry1) <= v5) {
                    this.zzr.zza(zzmr0, map$Entry1);
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
                            zzmr0.zza(v5, zzma.zze(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zza(v5, zzma.zzd(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zza(v5, zzma.zzb(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzc(v5, zzma.zzb(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzc(v5, zzma.zza(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzd(v5, zzma.zzb(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzd(v5, zzma.zza(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zza(v5, zzma.zzc(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.zza(object0, v3)) {
                            zzko.zza(v5, zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), zzmr0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zza(v5, zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), this.zza(v3));
                        }
                        break;
                    }
                    case 10: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zza(v5, ((zzht)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zze(v5, zzma.zza(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzb(v5, zzma.zza(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zza(v5, zzma.zza(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzb(v5, zzma.zzb(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzf(v5, zzma.zza(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zze(v5, zzma.zzb(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.zza(object0, v3)) {
                            zzmr0.zzb(v5, zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), this.zza(v3));
                        }
                        break;
                    }
                    case 18: {
                        zzle.zza(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 19: {
                        zzle.zzb(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 20: {
                        zzle.zzc(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 21: {
                        zzle.zzd(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 22: {
                        zzle.zzh(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 23: {
                        zzle.zzf(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 24: {
                        zzle.zzk(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 25: {
                        zzle.zzn(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 26: {
                        zzle.zza(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0);
                        break;
                    }
                    case 27: {
                        zzle.zza(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, this.zza(v3));
                        break;
                    }
                    case 28: {
                        zzle.zzb(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0);
                        break;
                    }
                    case 29: {
                        zzle.zzi(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 30: {
                        zzle.zzm(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 0x1F: {
                        zzle.zzl(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 0x20: {
                        zzle.zzg(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 33: {
                        zzle.zzj(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 34: {
                        zzle.zze(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, false);
                        break;
                    }
                    case 35: {
                        zzle.zza(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 36: {
                        zzle.zzb(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 37: {
                        zzle.zzc(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 38: {
                        zzle.zzd(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 39: {
                        zzle.zzh(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 40: {
                        zzle.zzf(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 41: {
                        zzle.zzk(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 42: {
                        zzle.zzn(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 43: {
                        zzle.zzi(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 44: {
                        zzle.zzm(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 45: {
                        zzle.zzl(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 46: {
                        zzle.zzg(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 0x2F: {
                        zzle.zzj(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 0x30: {
                        zzle.zze(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, true);
                        break;
                    }
                    case 49: {
                        zzle.zzb(this.zzc[v3], ((List)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))), zzmr0, this.zza(v3));
                        break;
                    }
                    case 50: {
                        this.zza(zzmr0, v5, zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), v3);
                        break;
                    }
                    case 51: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zza(v5, zzko.zzb(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zza(v5, zzko.zzc(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zza(v5, zzko.zze(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzc(v5, zzko.zze(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzc(v5, zzko.zzd(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzd(v5, zzko.zze(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzd(v5, zzko.zzd(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zza(v5, zzko.zzf(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 59: {
                        if(this.zza(object0, v5, v3)) {
                            zzko.zza(v5, zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), zzmr0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zza(v5, zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), this.zza(v3));
                        }
                        break;
                    }
                    case 61: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zza(v5, ((zzht)zzma.zzf(object0, ((long)(v4 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zze(v5, zzko.zzd(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzb(v5, zzko.zzd(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zza(v5, zzko.zzd(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzb(v5, zzko.zze(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzf(v5, zzko.zzd(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zze(v5, zzko.zze(object0, ((long)(v4 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.zza(object0, v5, v3)) {
                            zzmr0.zzb(v5, zzma.zzf(object0, ((long)(v4 & 0xFFFFF))), this.zza(v3));
                        }
                    }
                }
            }
            while(map$Entry1 != null) {
                this.zzr.zza(zzmr0, map$Entry1);
                if(iterator1.hasNext()) {
                    Object object6 = iterator1.next();
                    map$Entry1 = (Map.Entry)object6;
                }
                else {
                    map$Entry1 = null;
                }
            }
            zzko.zza(this.zzq, object0, zzmr0);
            return;
        }
        this.zzb(object0, zzmr0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzhn zzhn0) throws IOException {
        int v28;
        int v27;
        Unsafe unsafe4;
        int v23;
        int v22;
        int v21;
        Unsafe unsafe3;
        Unsafe unsafe2;
        int v13;
        Unsafe unsafe1;
        int v12;
        int v11;
        int v9;
        int v8;
        if(this.zzj) {
            Unsafe unsafe0 = zzko.zzb;
            int v2 = v;
            int v3 = -1;
            int v4 = 0;
            int v5 = 0;
            int v6 = 0xFFFFF;
            while(v2 < v1) {
                int v7 = arr_b[v2];
                if(v7 < 0) {
                    v8 = zzhl.zza(v7, arr_b, v2 + 1, zzhn0);
                    v9 = zzhn0.zza;
                }
                else {
                    v9 = v7;
                    v8 = v2 + 1;
                }
                int v10 = v9 >>> 3 <= v3 ? this.zzg(v9 >>> 3) : this.zza(v9 >>> 3, v4 / 3);
                if(v10 == -1) {
                    v11 = v8;
                    v12 = v9 >>> 3;
                    unsafe1 = unsafe0;
                    v13 = 0;
                    v2 = zzhl.zza(v9, arr_b, v11, v1, zzko.zze(object0), zzhn0);
                    v4 = v13;
                    v3 = v12;
                }
                else {
                    int[] arr_v = this.zzc;
                    int v14 = arr_v[v10 + 1];
                    int v15 = (v14 & 0xFF00000) >>> 20;
                    long v16 = (long)(v14 & 0xFFFFF);
                    int v17 = v14;
                    if(v15 <= 17) {
                        int v18 = arr_v[v10 + 2];
                        int v19 = 1 << (v18 >>> 20);
                        int v20 = v18 & 0xFFFFF;
                        if(v20 == v6) {
                            unsafe3 = unsafe0;
                        }
                        else {
                            if(v6 == 0xFFFFF) {
                                unsafe2 = unsafe0;
                            }
                            else {
                                unsafe2 = unsafe0;
                                unsafe2.putInt(object0, ((long)v6), v5);
                            }
                            if(v20 != 0xFFFFF) {
                                v5 = unsafe2.getInt(object0, ((long)v20));
                            }
                            unsafe3 = unsafe2;
                            v6 = v20;
                        }
                        switch(v15) {
                            case 0: {
                                v12 = v9 >>> 3;
                                v21 = v8;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 1) {
                                    zzma.zza(object0, v16, zzhl.zzc(arr_b, v21));
                                    v2 = v21 + 8;
                                    goto label_159;
                                }
                                break;
                            }
                            case 1: {
                                v12 = v9 >>> 3;
                                v21 = v8;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 5) {
                                    zzma.zza(object0, v16, zzhl.zzd(arr_b, v21));
                                    v2 = v21 + 4;
                                    goto label_159;
                                }
                                break;
                            }
                            case 2: 
                            case 3: {
                                v12 = v9 >>> 3;
                                v21 = v8;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 0) {
                                    int v24 = zzhl.zzb(arr_b, v21, zzhn0);
                                    unsafe4.putLong(object0, v16, zzhn0.zzb);
                                    v5 |= v19;
                                    unsafe0 = unsafe4;
                                    v4 = v22;
                                    v2 = v24;
                                    v6 = v23;
                                    v3 = v12;
                                    continue;
                                }
                                break;
                            }
                            case 7: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 0) {
                                    v2 = zzhl.zzb(arr_b, v8, zzhn0);
                                    zzma.zza(object0, v16, zzhn0.zzb != 0L);
                                    goto label_159;
                                }
                                v21 = v8;
                                break;
                            }
                            case 8: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 2) {
                                    v2 = (v17 & 0x20000000) == 0 ? zzhl.zzc(arr_b, v8, zzhn0) : zzhl.zzd(arr_b, v8, zzhn0);
                                    unsafe4.putObject(object0, v16, zzhn0.zzc);
                                    goto label_159;
                                }
                                v21 = v8;
                                break;
                            }
                            case 9: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 2) {
                                    v2 = zzhl.zza(this.zza(v22), arr_b, v8, v1, zzhn0);
                                    Object object1 = unsafe4.getObject(object0, v16);
                                    if(object1 == null) {
                                        unsafe4.putObject(object0, v16, zzhn0.zzc);
                                    }
                                    else {
                                        unsafe4.putObject(object0, v16, zzjf.zza(object1, zzhn0.zzc));
                                    }
                                    goto label_159;
                                }
                                v21 = v8;
                                break;
                            }
                            case 10: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 2) {
                                    v2 = zzhl.zze(arr_b, v8, zzhn0);
                                    unsafe4.putObject(object0, v16, zzhn0.zzc);
                                    goto label_159;
                                }
                                v21 = v8;
                                break;
                            }
                            case 4: 
                            case 11: {
                                v12 = v9 >>> 3;
                                v21 = v8;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 0) {
                                    v2 = zzhl.zza(arr_b, v21, zzhn0);
                                    unsafe4.putInt(object0, v16, zzhn0.zza);
                                    goto label_159;
                                }
                                break;
                            }
                            case 12: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 0) {
                                    v2 = zzhl.zza(arr_b, v8, zzhn0);
                                    unsafe4.putInt(object0, v16, zzhn0.zza);
                                    goto label_159;
                                }
                                v21 = v8;
                                break;
                            }
                            case 6: 
                            case 13: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 5) {
                                    unsafe4.putInt(object0, v16, zzhl.zza(arr_b, v8));
                                    v2 = v8 + 4;
                                    goto label_159;
                                }
                                v21 = v8;
                                break;
                            }
                            case 5: 
                            case 14: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 1) {
                                    unsafe4.putLong(object0, v16, zzhl.zzb(arr_b, v8));
                                    v2 = v8 + 8;
                                    goto label_159;
                                }
                                v21 = v8;
                                break;
                            }
                            case 15: {
                                v12 = v9 >>> 3;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                                if((v9 & 7) == 0) {
                                    v2 = zzhl.zza(arr_b, v8, zzhn0);
                                    unsafe4.putInt(object0, v16, -(zzhn0.zza & 1) ^ zzhn0.zza >>> 1);
                                label_159:
                                    v5 |= v19;
                                    unsafe0 = unsafe4;
                                    v4 = v22;
                                    v6 = v23;
                                    v3 = v12;
                                    continue;
                                }
                                v21 = v8;
                                break;
                            }
                            case 16: {
                                if((v9 & 7) == 0) {
                                    int v25 = zzhl.zzb(arr_b, v8, zzhn0);
                                    unsafe3.putLong(object0, v16, -(zzhn0.zzb & 1L) ^ zzhn0.zzb >>> 1);
                                    v5 |= v19;
                                    unsafe0 = unsafe3;
                                    v4 = v10;
                                    v2 = v25;
                                    v3 = v9 >>> 3;
                                    continue;
                                }
                                else {
                                    v12 = v9 >>> 3;
                                    v23 = v6;
                                    unsafe4 = unsafe3;
                                    v21 = v8;
                                    v22 = v10;
                                }
                                break;
                            }
                            default: {
                                v12 = v9 >>> 3;
                                v21 = v8;
                                v22 = v10;
                                v23 = v6;
                                unsafe4 = unsafe3;
                            }
                        }
                        v11 = v21;
                        unsafe1 = unsafe4;
                        v13 = v22;
                        v6 = v23;
                        v2 = zzhl.zza(v9, arr_b, v11, v1, zzko.zze(object0), zzhn0);
                        v4 = v13;
                        v3 = v12;
                    }
                    else {
                        v12 = v9 >>> 3;
                        if(v15 == 27) {
                            if((v9 & 7) == 2) {
                                zzjl zzjl0 = (zzjl)unsafe0.getObject(object0, v16);
                                if(!zzjl0.zza()) {
                                    int v26 = zzjl0.size();
                                    zzjl0 = zzjl0.zza((v26 == 0 ? 10 : v26 << 1));
                                    unsafe0.putObject(object0, v16, zzjl0);
                                }
                                v2 = zzhl.zza(this.zza(v10), v9, arr_b, v8, v1, zzjl0, zzhn0);
                                v4 = v10;
                                v3 = v12;
                                continue;
                            }
                            else {
                                v13 = v10;
                                unsafe1 = unsafe0;
                                v11 = v8;
                                v2 = zzhl.zza(v9, arr_b, v11, v1, zzko.zze(object0), zzhn0);
                                v4 = v13;
                                v3 = v12;
                                goto label_241;
                            }
                            goto label_202;
                        }
                        else {
                        label_202:
                            v13 = v10;
                            if(v15 <= 49) {
                                v27 = v5;
                                v28 = v6;
                                unsafe1 = unsafe0;
                                v2 = this.zza(object0, arr_b, v8, v1, v9, v12, v9 & 7, v13, ((long)v17), v15, v16, zzhn0);
                                if(v2 == v8) {
                                    v11 = v2;
                                    v5 = v27;
                                    v6 = v28;
                                    v2 = zzhl.zza(v9, arr_b, v11, v1, zzko.zze(object0), zzhn0);
                                    v4 = v13;
                                    v3 = v12;
                                    goto label_241;
                                }
                            }
                            else {
                                v27 = v5;
                                unsafe1 = unsafe0;
                                v28 = v6;
                                if(v15 != 50) {
                                    v2 = this.zza(object0, arr_b, v8, v1, v9, v12, v9 & 7, v17, v15, v16, v13, zzhn0);
                                    if(v2 == v8) {
                                        v11 = v2;
                                        v5 = v27;
                                        v6 = v28;
                                        v2 = zzhl.zza(v9, arr_b, v11, v1, zzko.zze(object0), zzhn0);
                                        v4 = v13;
                                        v3 = v12;
                                        goto label_241;
                                    }
                                }
                                else if((v9 & 7) == 2) {
                                    v2 = this.zza(object0, arr_b, v8, v1, v13, v16, zzhn0);
                                    if(v2 == v8) {
                                        v11 = v2;
                                        v5 = v27;
                                        v6 = v28;
                                        v2 = zzhl.zza(v9, arr_b, v11, v1, zzko.zze(object0), zzhn0);
                                        v4 = v13;
                                        v3 = v12;
                                        goto label_241;
                                    }
                                }
                                else {
                                    v11 = v8;
                                    v5 = v27;
                                    v6 = v28;
                                    v2 = zzhl.zza(v9, arr_b, v11, v1, zzko.zze(object0), zzhn0);
                                    v4 = v13;
                                    v3 = v12;
                                    goto label_241;
                                }
                            }
                            v4 = v13;
                            v3 = v12;
                            v5 = v27;
                            v6 = v28;
                        }
                    }
                }
            label_241:
                unsafe0 = unsafe1;
            }
            if(v6 != 0xFFFFF) {
                unsafe0.putInt(object0, ((long)v6), v5);
            }
            if(v2 != v1) {
                throw zzjk.zzg();
            }
            return;
        }
        this.zza(object0, arr_b, v, v1, 0, zzhn0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final boolean zza(Object object0, Object object1) {
        for(int v = 0; true; v += 3) {
            boolean z = true;
            if(v >= this.zzc.length) {
                break;
            }
            int v1 = this.zzd(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(!this.zzc(object0, object1, v) || Double.doubleToLongBits(zzma.zze(object0, v2)) != Double.doubleToLongBits(zzma.zze(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 1: {
                    if(!this.zzc(object0, object1, v) || Float.floatToIntBits(zzma.zzd(object0, v2)) != Float.floatToIntBits(zzma.zzd(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 2: {
                    if(!this.zzc(object0, object1, v) || zzma.zzb(object0, v2) != zzma.zzb(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 3: {
                    if(!this.zzc(object0, object1, v) || zzma.zzb(object0, v2) != zzma.zzb(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 4: {
                    if(!this.zzc(object0, object1, v) || zzma.zza(object0, v2) != zzma.zza(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 5: {
                    if(!this.zzc(object0, object1, v) || zzma.zzb(object0, v2) != zzma.zzb(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 6: {
                    if(!this.zzc(object0, object1, v) || zzma.zza(object0, v2) != zzma.zza(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 7: {
                    if(!this.zzc(object0, object1, v) || zzma.zzc(object0, v2) != zzma.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 8: {
                    if(!this.zzc(object0, object1, v) || !zzle.zza(zzma.zzf(object0, v2), zzma.zzf(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 9: {
                    if(!this.zzc(object0, object1, v) || !zzle.zza(zzma.zzf(object0, v2), zzma.zzf(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 10: {
                    if(!this.zzc(object0, object1, v) || !zzle.zza(zzma.zzf(object0, v2), zzma.zzf(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 11: {
                    if(!this.zzc(object0, object1, v) || zzma.zza(object0, v2) != zzma.zza(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 12: {
                    if(!this.zzc(object0, object1, v) || zzma.zza(object0, v2) != zzma.zza(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 13: {
                    if(!this.zzc(object0, object1, v) || zzma.zza(object0, v2) != zzma.zza(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 14: {
                    if(!this.zzc(object0, object1, v) || zzma.zzb(object0, v2) != zzma.zzb(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 15: {
                    if(!this.zzc(object0, object1, v) || zzma.zza(object0, v2) != zzma.zza(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 16: {
                    if(!this.zzc(object0, object1, v) || zzma.zzb(object0, v2) != zzma.zzb(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 17: {
                    if(!this.zzc(object0, object1, v) || !zzle.zza(zzma.zzf(object0, v2), zzma.zzf(object1, v2))) {
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
                case 49: {
                    z = zzle.zza(zzma.zzf(object0, v2), zzma.zzf(object1, v2));
                    break;
                }
                case 50: {
                    z = zzle.zza(zzma.zzf(object0, v2), zzma.zzf(object1, v2));
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
                    int v3 = this.zze(v);
                    if(zzma.zza(object0, ((long)(v3 & 0xFFFFF))) != zzma.zza(object1, ((long)(v3 & 0xFFFFF))) || !zzle.zza(zzma.zzf(object0, v2), zzma.zzf(object1, v2))) {
                        z = false;
                    }
                }
            }
            if(!z) {
                return false;
            }
        }
        if(!this.zzq.zzb(object0).equals(this.zzq.zzb(object1))) {
            return false;
        }
        return this.zzh ? this.zzr.zza(object0).equals(this.zzr.zza(object1)) : true;
    }

    private static double zzb(Object object0, long v) {
        return (double)(((Double)zzma.zzf(object0, v)));
    }

    private final int zzb(int v, int v1) {
        int v2 = this.zzc.length / 3 - 1;
        while(v1 <= v2) {
            int v3 = v2 + v1 >>> 1;
            int v4 = v3 * 3;
            int v5 = this.zzc[v4];
            if(v == v5) {
                return v4;
            }
            if(v < v5) {
                v2 = v3 - 1;
            }
            else {
                v1 = v3 + 1;
            }
        }
        return -1;
    }

    private final Object zzb(int v) {
        return this.zzd[v / 3 << 1];
    }

    private final void zzb(Object object0, int v) {
        int v1 = this.zze(v);
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        zzma.zza(object0, ((long)(0xFFFFF & v1)), 1 << (v1 >>> 20) | zzma.zza(object0, ((long)(0xFFFFF & v1))));
    }

    private final void zzb(Object object0, int v, int v1) {
        zzma.zza(object0, ((long)(this.zze(v1) & 0xFFFFF)), v);
    }

    private final void zzb(Object object0, zzmr zzmr0) throws IOException {
        int v8;
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(this.zzh) {
            zziu zziu0 = this.zzr.zza(object0);
            if(zziu0.zza.isEmpty()) {
                iterator0 = null;
                map$Entry0 = null;
            }
            else {
                iterator0 = zziu0.zzd();
                Object object1 = iterator0.next();
                map$Entry0 = (Map.Entry)object1;
            }
        }
        else {
            iterator0 = null;
            map$Entry0 = null;
        }
        Unsafe unsafe0 = zzko.zzb;
        int v1 = 0xFFFFF;
        int v2 = 0;
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v3 = this.zzd(v);
            int[] arr_v = this.zzc;
            int v4 = arr_v[v];
            int v5 = (v3 & 0xFF00000) >>> 20;
            if(v5 <= 17) {
                int v6 = arr_v[v + 2];
                int v7 = v6 & 0xFFFFF;
                if(v7 != v1) {
                    v2 = unsafe0.getInt(object0, ((long)v7));
                    v1 = v7;
                }
                v8 = 1 << (v6 >>> 20);
            }
            else {
                v8 = 0;
            }
            while(map$Entry0 != null && this.zzr.zza(map$Entry0) <= v4) {
                this.zzr.zza(zzmr0, map$Entry0);
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
                        zzmr0.zza(v4, zzma.zze(object0, v9));
                    }
                    break;
                }
                case 1: {
                    if((v8 & v2) != 0) {
                        zzmr0.zza(v4, zzma.zzd(object0, v9));
                    }
                    break;
                }
                case 2: {
                    if((v8 & v2) != 0) {
                        zzmr0.zza(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 3: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzc(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 4: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzc(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 5: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzd(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 6: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzd(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 7: {
                    if((v8 & v2) != 0) {
                        zzmr0.zza(v4, zzma.zzc(object0, v9));
                    }
                    break;
                }
                case 8: {
                    if((v8 & v2) != 0) {
                        zzko.zza(v4, unsafe0.getObject(object0, v9), zzmr0);
                    }
                    break;
                }
                case 9: {
                    if((v8 & v2) != 0) {
                        zzmr0.zza(v4, unsafe0.getObject(object0, v9), this.zza(v));
                    }
                    break;
                }
                case 10: {
                    if((v8 & v2) != 0) {
                        zzmr0.zza(v4, ((zzht)unsafe0.getObject(object0, v9)));
                    }
                    break;
                }
                case 11: {
                    if((v8 & v2) != 0) {
                        zzmr0.zze(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 12: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzb(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 13: {
                    if((v8 & v2) != 0) {
                        zzmr0.zza(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 14: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzb(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 15: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzf(v4, unsafe0.getInt(object0, v9));
                    }
                    break;
                }
                case 16: {
                    if((v8 & v2) != 0) {
                        zzmr0.zze(v4, unsafe0.getLong(object0, v9));
                    }
                    break;
                }
                case 17: {
                    if((v8 & v2) != 0) {
                        zzmr0.zzb(v4, unsafe0.getObject(object0, v9), this.zza(v));
                    }
                    break;
                }
                case 18: {
                    zzle.zza(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 19: {
                    zzle.zzb(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 20: {
                    zzle.zzc(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 21: {
                    zzle.zzd(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 22: {
                    zzle.zzh(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 23: {
                    zzle.zzf(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 24: {
                    zzle.zzk(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 25: {
                    zzle.zzn(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 26: {
                    zzle.zza(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0);
                    break;
                }
                case 27: {
                    zzle.zza(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, this.zza(v));
                    break;
                }
                case 28: {
                    zzle.zzb(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0);
                    break;
                }
                case 29: {
                    zzle.zzi(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 30: {
                    zzle.zzm(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 0x1F: {
                    zzle.zzl(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 0x20: {
                    zzle.zzg(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 33: {
                    zzle.zzj(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 34: {
                    zzle.zze(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, false);
                    break;
                }
                case 35: {
                    zzle.zza(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 36: {
                    zzle.zzb(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 37: {
                    zzle.zzc(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 38: {
                    zzle.zzd(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 39: {
                    zzle.zzh(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 40: {
                    zzle.zzf(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 41: {
                    zzle.zzk(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 42: {
                    zzle.zzn(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 43: {
                    zzle.zzi(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 44: {
                    zzle.zzm(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 45: {
                    zzle.zzl(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 46: {
                    zzle.zzg(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 0x2F: {
                    zzle.zzj(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 0x30: {
                    zzle.zze(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, true);
                    break;
                }
                case 49: {
                    zzle.zzb(this.zzc[v], ((List)unsafe0.getObject(object0, v9)), zzmr0, this.zza(v));
                    break;
                }
                case 50: {
                    this.zza(zzmr0, v4, unsafe0.getObject(object0, v9), v);
                    break;
                }
                case 51: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zza(v4, zzko.zzb(object0, v9));
                    }
                    break;
                }
                case 52: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zza(v4, zzko.zzc(object0, v9));
                    }
                    break;
                }
                case 53: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zza(v4, zzko.zze(object0, v9));
                    }
                    break;
                }
                case 54: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzc(v4, zzko.zze(object0, v9));
                    }
                    break;
                }
                case 55: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzc(v4, zzko.zzd(object0, v9));
                    }
                    break;
                }
                case 56: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzd(v4, zzko.zze(object0, v9));
                    }
                    break;
                }
                case 57: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzd(v4, zzko.zzd(object0, v9));
                    }
                    break;
                }
                case 58: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zza(v4, zzko.zzf(object0, v9));
                    }
                    break;
                }
                case 59: {
                    if(this.zza(object0, v4, v)) {
                        zzko.zza(v4, unsafe0.getObject(object0, v9), zzmr0);
                    }
                    break;
                }
                case 60: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zza(v4, unsafe0.getObject(object0, v9), this.zza(v));
                    }
                    break;
                }
                case 61: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zza(v4, ((zzht)unsafe0.getObject(object0, v9)));
                    }
                    break;
                }
                case 62: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zze(v4, zzko.zzd(object0, v9));
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzb(v4, zzko.zzd(object0, v9));
                    }
                    break;
                }
                case 0x40: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zza(v4, zzko.zzd(object0, v9));
                    }
                    break;
                }
                case 65: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzb(v4, zzko.zze(object0, v9));
                    }
                    break;
                }
                case 66: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzf(v4, zzko.zzd(object0, v9));
                    }
                    break;
                }
                case 67: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zze(v4, zzko.zze(object0, v9));
                    }
                    break;
                }
                case 68: {
                    if(this.zza(object0, v4, v)) {
                        zzmr0.zzb(v4, unsafe0.getObject(object0, v9), this.zza(v));
                    }
                }
            }
        }
        while(map$Entry0 != null) {
            this.zzr.zza(zzmr0, map$Entry0);
            if(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                map$Entry0 = (Map.Entry)object3;
            }
            else {
                map$Entry0 = null;
            }
        }
        zzko.zza(this.zzq, object0, zzmr0);
    }

    private final void zzb(Object object0, Object object1, int v) {
        int v1 = this.zzd(v);
        int v2 = this.zzc[v];
        if(!this.zza(object1, v2, v)) {
            return;
        }
        Object object2 = this.zza(object0, v2, v) ? zzma.zzf(object0, ((long)(v1 & 0xFFFFF))) : null;
        Object object3 = zzma.zzf(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 != null && object3 != null) {
            zzma.zza(object0, ((long)(v1 & 0xFFFFF)), zzjf.zza(object2, object3));
            this.zzb(object0, v2, v);
            return;
        }
        if(object3 != null) {
            zzma.zza(object0, ((long)(v1 & 0xFFFFF)), object3);
            this.zzb(object0, v2, v);
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final int zzb(Object object0) {
        int v28;
        int v27;
        int v26;
        int v25;
        int v24;
        int v23;
        int v22;
        int v20;
        int v10;
        int v9;
        int v8;
        int v7;
        if(this.zzj) {
            Unsafe unsafe0 = zzko.zzb;
            int v1 = 0;
            for(int v = 0; v < this.zzc.length; v += 3) {
                int v2 = this.zzd(v);
                int v3 = (v2 & 0xFF00000) >>> 20;
                int v4 = this.zzc[v];
                long v5 = (long)(v2 & 0xFFFFF);
                if(v3 >= zziv.zza.zza() && v3 <= zziv.zzb.zza()) {
                    int v6 = this.zzc[v + 2];
                }
                switch(v3) {
                    case 0: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzb(v4, 0.0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzb(v4, 0.0f);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzd(v4, zzma.zzb(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zze(v4, zzma.zzb(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzf(v4, zzma.zza(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzg(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzi(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzb(v4, true);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if(this.zza(object0, v)) {
                            Object object1 = zzma.zzf(object0, v5);
                            v7 = object1 instanceof zzht ? zzii.zzc(v4, ((zzht)object1)) : zzii.zzb(v4, ((String)object1));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if(this.zza(object0, v)) {
                            v7 = zzle.zza(v4, zzma.zzf(object0, v5), this.zza(v));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzc(v4, ((zzht)zzma.zzf(object0, v5)));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzg(v4, zzma.zza(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzk(v4, zzma.zza(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzj(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzh(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzh(v4, zzma.zza(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzf(v4, zzma.zzb(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 17: {
                        if(this.zza(object0, v)) {
                            v7 = zzii.zzc(v4, ((zzkk)zzma.zzf(object0, v5)), this.zza(v));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 18: {
                        v7 = zzle.zzi(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 19: {
                        v7 = zzle.zzh(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 20: {
                        v7 = zzle.zza(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 21: {
                        v7 = zzle.zzb(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 22: {
                        v7 = zzle.zze(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 23: {
                        v7 = zzle.zzi(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 24: {
                        v7 = zzle.zzh(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 25: {
                        v7 = zzle.zzj(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 26: {
                        v7 = zzle.zza(v4, zzko.zza(object0, v5));
                        v1 += v7;
                        break;
                    }
                    case 27: {
                        v7 = zzle.zza(v4, zzko.zza(object0, v5), this.zza(v));
                        v1 += v7;
                        break;
                    }
                    case 28: {
                        v7 = zzle.zzb(v4, zzko.zza(object0, v5));
                        v1 += v7;
                        break;
                    }
                    case 29: {
                        v7 = zzle.zzf(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 30: {
                        v7 = zzle.zzd(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 0x1F: {
                        v7 = zzle.zzh(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 0x20: {
                        v7 = zzle.zzi(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 33: {
                        v7 = zzle.zzg(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 34: {
                        v7 = zzle.zzc(v4, zzko.zza(object0, v5), false);
                        v1 += v7;
                        break;
                    }
                    case 35: {
                        v8 = zzle.zzi(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 36: {
                        v8 = zzle.zzh(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 37: {
                        v8 = zzle.zza(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 38: {
                        v8 = zzle.zzb(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 39: {
                        v8 = zzle.zze(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 40: {
                        v8 = zzle.zzi(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 41: {
                        v8 = zzle.zzh(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 42: {
                        v8 = zzle.zzj(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 43: {
                        v8 = zzle.zzf(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 44: {
                        v8 = zzle.zzd(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 45: {
                        v8 = zzle.zzh(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 46: {
                        v8 = zzle.zzi(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x2F: {
                        v8 = zzle.zzg(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v9 = zzii.zze(v4);
                            v10 = zzii.zzg(v8);
                            v7 = v9 + v10 + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x30: {
                        v8 = zzle.zzc(((List)unsafe0.getObject(object0, v5)));
                        if(v8 > 0) {
                            v7 = zzii.zze(v4) + zzii.zzg(v8) + v8;
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 49: {
                        v7 = zzle.zzb(v4, zzko.zza(object0, v5), this.zza(v));
                        v1 += v7;
                        break;
                    }
                    case 50: {
                        Object object2 = zzma.zzf(object0, v5);
                        Object object3 = this.zzb(v);
                        v7 = this.zzs.zza(v4, object2, object3);
                        v1 += v7;
                        break;
                    }
                    case 51: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzb(v4, 0.0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzb(v4, 0.0f);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzd(v4, zzko.zze(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zze(v4, zzko.zze(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzf(v4, zzko.zzd(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzg(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzi(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzb(v4, true);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if(this.zza(object0, v4, v)) {
                            Object object4 = zzma.zzf(object0, v5);
                            v7 = object4 instanceof zzht ? zzii.zzc(v4, ((zzht)object4)) : zzii.zzb(v4, ((String)object4));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzle.zza(v4, zzma.zzf(object0, v5), this.zza(v));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzc(v4, ((zzht)zzma.zzf(object0, v5)));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzg(v4, zzko.zzd(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzk(v4, zzko.zzd(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzj(v4, 0);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzh(v4, 0L);
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzh(v4, zzko.zzd(object0, v5));
                            v1 += v7;
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if(this.zza(object0, v4, v)) {
                            v7 = zzii.zzf(v4, zzko.zze(object0, v5));
                            v1 += v7;
                        }
                        break;
                    }
                    case 68: {
                        if(this.zza(object0, v4, v)) {
                            v1 += zzii.zzc(v4, ((zzkk)zzma.zzf(object0, v5)), this.zza(v));
                        }
                    }
                }
            }
            return v1 + zzko.zza(this.zzq, object0);
        }
        Unsafe unsafe1 = zzko.zzb;
        int v12 = 0;
        int v13 = 0xFFFFF;
        int v14 = 0;
        for(int v11 = 0; v11 < this.zzc.length; v11 += 3) {
            int v15 = this.zzd(v11);
            int[] arr_v = this.zzc;
            int v16 = arr_v[v11];
            int v17 = (v15 & 0xFF00000) >>> 20;
            if(v17 <= 17) {
                int v18 = arr_v[v11 + 2];
                int v19 = v18 & 0xFFFFF;
                v20 = 1 << (v18 >>> 20);
                if(v19 != v13) {
                    v14 = unsafe1.getInt(object0, ((long)v19));
                    v13 = v19;
                }
            }
            else {
                v20 = 0;
            }
            long v21 = (long)(v15 & 0xFFFFF);
            switch(v17) {
                case 0: {
                    if((v14 & v20) != 0) {
                        v12 += zzii.zzb(v16, 0.0);
                    }
                    break;
                }
                case 1: {
                    if((v14 & v20) != 0) {
                        v12 += zzii.zzb(v16, 0.0f);
                    }
                    break;
                }
                case 2: {
                    if((v20 & v14) != 0) {
                        v22 = zzii.zzd(v16, unsafe1.getLong(object0, v21));
                        v12 += v22;
                        break;
                    }
                    break;
                }
                case 3: {
                    if((v20 & v14) != 0) {
                        v22 = zzii.zze(v16, unsafe1.getLong(object0, v21));
                        v12 += v22;
                        break;
                    }
                    break;
                }
                case 4: {
                    if((v20 & v14) != 0) {
                        v22 = zzii.zzf(v16, unsafe1.getInt(object0, v21));
                        v12 += v22;
                    }
                    break;
                }
                case 5: {
                    if((v14 & v20) != 0) {
                        v12 += zzii.zzg(v16, 0L);
                    }
                    break;
                }
                case 6: {
                    if((v14 & v20) != 0) {
                        v12 += zzii.zzi(v16, 0);
                    }
                    break;
                }
                case 7: {
                    if((v14 & v20) != 0) {
                        v23 = zzii.zzb(v16, true);
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 8: {
                    if((v14 & v20) != 0) {
                        Object object5 = unsafe1.getObject(object0, v21);
                        v24 = object5 instanceof zzht ? zzii.zzc(v16, ((zzht)object5)) : zzii.zzb(v16, ((String)object5));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 9: {
                    if((v14 & v20) != 0) {
                        v24 = zzle.zza(v16, unsafe1.getObject(object0, v21), this.zza(v11));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 10: {
                    if((v14 & v20) != 0) {
                        v24 = zzii.zzc(v16, ((zzht)unsafe1.getObject(object0, v21)));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 11: {
                    if((v14 & v20) != 0) {
                        v24 = zzii.zzg(v16, unsafe1.getInt(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 12: {
                    if((v14 & v20) != 0) {
                        v24 = zzii.zzk(v16, unsafe1.getInt(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 13: {
                    if((v14 & v20) != 0) {
                        v23 = zzii.zzj(v16, 0);
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 14: {
                    if((v14 & v20) != 0) {
                        v24 = zzii.zzh(v16, 0L);
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 15: {
                    if((v14 & v20) != 0) {
                        v24 = zzii.zzh(v16, unsafe1.getInt(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 16: {
                    if((v14 & v20) != 0) {
                        v24 = zzii.zzf(v16, unsafe1.getLong(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 17: {
                    if((v14 & v20) != 0) {
                        v24 = zzii.zzc(v16, ((zzkk)unsafe1.getObject(object0, v21)), this.zza(v11));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 18: {
                    v24 = zzle.zzi(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v24;
                    break;
                }
                case 19: {
                    v25 = zzle.zzh(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 20: {
                    v25 = zzle.zza(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 21: {
                    v25 = zzle.zzb(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 22: {
                    v25 = zzle.zze(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 23: {
                    v25 = zzle.zzi(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 24: {
                    v25 = zzle.zzh(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 25: {
                    v25 = zzle.zzj(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 26: {
                    v24 = zzle.zza(v16, ((List)unsafe1.getObject(object0, v21)));
                    v12 += v24;
                    break;
                }
                case 27: {
                    v24 = zzle.zza(v16, ((List)unsafe1.getObject(object0, v21)), this.zza(v11));
                    v12 += v24;
                    break;
                }
                case 28: {
                    v24 = zzle.zzb(v16, ((List)unsafe1.getObject(object0, v21)));
                    v12 += v24;
                    break;
                }
                case 29: {
                    v24 = zzle.zzf(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v24;
                    break;
                }
                case 30: {
                    v25 = zzle.zzd(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 0x1F: {
                    v25 = zzle.zzh(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 0x20: {
                    v25 = zzle.zzi(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 33: {
                    v25 = zzle.zzg(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    v12 += v25;
                    break;
                }
                case 34: {
                    v12 += zzle.zzc(v16, ((List)unsafe1.getObject(object0, v21)), false);
                    break;
                }
                case 35: {
                    v26 = zzle.zzi(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 36: {
                    v26 = zzle.zzh(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 37: {
                    v26 = zzle.zza(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 38: {
                    v26 = zzle.zzb(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 39: {
                    v26 = zzle.zze(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 40: {
                    v26 = zzle.zzi(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 41: {
                    v26 = zzle.zzh(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 42: {
                    v26 = zzle.zzj(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 43: {
                    v26 = zzle.zzf(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 44: {
                    v26 = zzle.zzd(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 45: {
                    v26 = zzle.zzh(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 46: {
                    v26 = zzle.zzi(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 0x2F: {
                    v26 = zzle.zzg(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v27 = zzii.zze(v16);
                        v28 = zzii.zzg(v26);
                        v23 = v27 + v28 + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 0x30: {
                    v26 = zzle.zzc(((List)unsafe1.getObject(object0, v21)));
                    if(v26 > 0) {
                        v23 = zzii.zze(v16) + zzii.zzg(v26) + v26;
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 49: {
                    v24 = zzle.zzb(v16, ((List)unsafe1.getObject(object0, v21)), this.zza(v11));
                    v12 += v24;
                    break;
                }
                case 50: {
                    Object object6 = unsafe1.getObject(object0, v21);
                    Object object7 = this.zzb(v11);
                    v24 = this.zzs.zza(v16, object6, object7);
                    v12 += v24;
                    break;
                }
                case 51: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzb(v16, 0.0);
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.zza(object0, v16, v11)) {
                        v23 = zzii.zzb(v16, 0.0f);
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzd(v16, zzko.zze(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zze(v16, zzko.zze(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzf(v16, zzko.zzd(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzg(v16, 0L);
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.zza(object0, v16, v11)) {
                        v23 = zzii.zzi(v16, 0);
                        v12 += v23;
                        break;
                    }
                    break;
                }
                case 58: {
                    if(this.zza(object0, v16, v11)) {
                        v23 = zzii.zzb(v16, true);
                        v12 += v23;
                    }
                    break;
                }
                case 59: {
                    if(this.zza(object0, v16, v11)) {
                        Object object8 = unsafe1.getObject(object0, v21);
                        v24 = object8 instanceof zzht ? zzii.zzc(v16, ((zzht)object8)) : zzii.zzb(v16, ((String)object8));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzle.zza(v16, unsafe1.getObject(object0, v21), this.zza(v11));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzc(v16, ((zzht)unsafe1.getObject(object0, v21)));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzg(v16, zzko.zzd(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzk(v16, zzko.zzd(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.zza(object0, v16, v11)) {
                        v12 += zzii.zzj(v16, 0);
                    }
                    break;
                }
                case 65: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzh(v16, 0L);
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzh(v16, zzko.zzd(object0, v21));
                        v12 += v24;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.zza(object0, v16, v11)) {
                        v24 = zzii.zzf(v16, zzko.zze(object0, v21));
                        v12 += v24;
                    }
                    break;
                }
                case 68: {
                    if(this.zza(object0, v16, v11)) {
                        v12 += zzii.zzc(v16, ((zzkk)unsafe1.getObject(object0, v21)), this.zza(v11));
                    }
                }
            }
        }
        int v29 = 0;
        int v30 = v12 + zzko.zza(this.zzq, object0);
        if(this.zzh) {
            zziu zziu0 = this.zzr.zza(object0);
            for(int v31 = 0; v31 < zziu0.zza.zzc(); ++v31) {
                Map.Entry map$Entry0 = zziu0.zza.zzb(v31);
                v29 += zziu.zzc(((zziw)map$Entry0.getKey()), map$Entry0.getValue());
            }
            for(Object object9: zziu0.zza.zzd()) {
                v29 += zziu.zzc(((zziw)((Map.Entry)object9).getKey()), ((Map.Entry)object9).getValue());
            }
            return v30 + v29;
        }
        return v30;
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zzb(Object object0, Object object1) {
        object1.getClass();
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzd(v);
            long v2 = (long)(0xFFFFF & v1);
            int v3 = this.zzc[v];
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zze(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 1: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 2: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzb(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 3: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzb(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 4: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 5: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzb(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 6: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 7: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 8: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzf(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 9: {
                    this.zza(object0, object1, v);
                    break;
                }
                case 10: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzf(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 11: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 12: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 13: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 14: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzb(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 15: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 16: {
                    if(this.zza(object1, v)) {
                        zzma.zza(object0, v2, zzma.zzb(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
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
                    this.zzp.zza(object0, object1, v2);
                    break;
                }
                case 50: {
                    zzle.zza(this.zzs, object0, object1, v2);
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
                        zzma.zza(object0, v2, zzma.zzf(object1, v2));
                        this.zzb(object0, v3, v);
                    }
                    break;
                }
                case 60: {
                    this.zzb(object0, object1, v);
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
                        zzma.zza(object0, v2, zzma.zzf(object1, v2));
                        this.zzb(object0, v3, v);
                    }
                    break;
                }
                case 68: {
                    this.zzb(object0, object1, v);
                }
            }
        }
        zzle.zza(this.zzq, object0, object1);
        if(this.zzh) {
            zzle.zza(this.zzr, object0, object1);
        }
    }

    private static float zzc(Object object0, long v) {
        return (float)(((Float)zzma.zzf(object0, v)));
    }

    private final zzjg zzc(int v) {
        return (zzjg)this.zzd[(v / 3 << 1) + 1];
    }

    private final boolean zzc(Object object0, Object object1, int v) {
        return this.zza(object0, v) == this.zza(object1, v);
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final void zzc(Object object0) {
        int v1;
        for(int v = this.zzm; true; ++v) {
            v1 = this.zzn;
            if(v >= v1) {
                break;
            }
            long v2 = (long)(this.zzd(this.zzl[v]) & 0xFFFFF);
            Object object1 = zzma.zzf(object0, v2);
            if(object1 != null) {
                zzma.zza(object0, v2, this.zzs.zze(object1));
            }
        }
        while(v1 < this.zzl.length) {
            this.zzp.zzb(object0, ((long)this.zzl[v1]));
            ++v1;
        }
        this.zzq.zzd(object0);
        if(this.zzh) {
            this.zzr.zzc(object0);
        }
    }

    private final int zzd(int v) {
        return this.zzc[v + 1];
    }

    private static int zzd(Object object0, long v) {
        return (int)(((Integer)zzma.zzf(object0, v)));
    }

    @Override  // com.google.android.gms.internal.vision.zzlc
    public final boolean zzd(Object object0) {
        int v10;
        int v9;
        int v = 0xFFFFF;
        int v1 = 0;
        int v2 = 0;
        while(v2 < this.zzm) {
            int v3 = this.zzl[v2];
            int v4 = this.zzc[v3];
            int v5 = this.zzd(v3);
            int v6 = this.zzc[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 == v) {
                v10 = v;
                v9 = v1;
            }
            else {
                if(v7 != 0xFFFFF) {
                    v1 = zzko.zzb.getInt(object0, ((long)v7));
                }
                v9 = v1;
                v10 = v7;
            }
            if((0x10000000 & v5) != 0 && !this.zza(object0, v3, v10, v9, v8)) {
                return false;
            }
            switch((0xFF00000 & v5) >>> 20) {
                case 9: 
                case 17: {
                    if(this.zza(object0, v3, v10, v9, v8) && !zzko.zza(object0, v5, this.zza(v3))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)zzma.zzf(object0, ((long)(v5 & 0xFFFFF)));
                    if(!list0.isEmpty()) {
                        zzlc zzlc1 = this.zza(v3);
                        for(int v11 = 0; v11 < list0.size(); ++v11) {
                            if(!zzlc1.zzd(list0.get(v11))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    Object object1 = zzma.zzf(object0, ((long)(v5 & 0xFFFFF)));
                    Map map0 = this.zzs.zzc(object1);
                    if(!map0.isEmpty()) {
                        Object object2 = this.zzb(v3);
                        if(this.zzs.zzb(object2).zzc.zza() == zzmo.zzi) {
                            zzlc zzlc0 = null;
                            Iterator iterator0 = map0.values().iterator();
                            while(true) {
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object3 = iterator0.next();
                                if(zzlc0 == null) {
                                    zzlc0 = zzky.zza().zza(object3.getClass());
                                }
                                if(zzlc0.zzd(object3)) {
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
                    if(this.zza(object0, v4, v3) && !zzko.zza(object0, v5, this.zza(v3))) {
                        return false;
                    }
                }
            }
            ++v2;
            v = v10;
            v1 = v9;
        }
        return !this.zzh || this.zzr.zza(object0).zzf();
    }

    private final int zze(int v) {
        return this.zzc[v + 2];
    }

    private static long zze(Object object0, long v) {
        return (long)(((Long)zzma.zzf(object0, v)));
    }

    private static zzlx zze(Object object0) {
        zzlx zzlx0 = ((zzjb)object0).zzb;
        if(zzlx0 == zzlx.zza()) {
            zzlx0 = zzlx.zzb();
            ((zzjb)object0).zzb = zzlx0;
        }
        return zzlx0;
    }

    private static boolean zzf(int v) {
        return (v & 0x20000000) != 0;
    }

    private static boolean zzf(Object object0, long v) {
        return ((Boolean)zzma.zzf(object0, v)).booleanValue();
    }

    private final int zzg(int v) {
        return v < this.zze || v > this.zzf ? -1 : this.zzb(v, 0);
    }
}

