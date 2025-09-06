package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class zzgzf implements zzgzv {
    private static final int[] zza;
    private static final Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgzc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhah zzm;
    private final zzgxc zzn;

    static {
        zzgzf.zza = new int[0];
        zzgzf.zzb = zzhao.zzi();
    }

    private zzgzf(int[] arr_v, Object[] arr_object, int v, int v1, zzgzc zzgzc0, boolean z, int[] arr_v1, int v2, int v3, zzgzi zzgzi0, zzgyp zzgyp0, zzhah zzhah0, zzgxc zzgxc0, zzgyx zzgyx0) {
        this.zzc = arr_v;
        this.zzd = arr_object;
        this.zze = v;
        this.zzf = v1;
        this.zzi = zzgzc0 instanceof zzgxr;
        this.zzh = zzgxc0 != null && zzgzc0 instanceof zzgxn;
        this.zzj = arr_v1;
        this.zzk = v2;
        this.zzl = v3;
        this.zzm = zzhah0;
        this.zzn = zzgxc0;
        this.zzg = zzgzc0;
    }

    private final Object zzA(Object object0, int v) {
        zzgzv zzgzv0 = this.zzx(v);
        int v1 = this.zzu(v);
        if(!this.zzN(object0, v)) {
            return zzgzv0.zze();
        }
        Object object1 = zzgzf.zzb.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(zzgzf.zzQ(object1)) {
            return object1;
        }
        Object object2 = zzgzv0.zze();
        if(object1 != null) {
            zzgzv0.zzg(object2, object1);
        }
        return object2;
    }

    private final Object zzB(Object object0, int v, int v1) {
        zzgzv zzgzv0 = this.zzx(v1);
        if(!this.zzR(object0, v, v1)) {
            return zzgzv0.zze();
        }
        int v2 = this.zzu(v1);
        Object object1 = zzgzf.zzb.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(zzgzf.zzQ(object1)) {
            return object1;
        }
        Object object2 = zzgzv0.zze();
        if(object1 != null) {
            zzgzv0.zzg(object2, object1);
        }
        return object2;
    }

    private static Field zzC(Class class0, String s) {
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

    private static void zzD(Object object0) {
        if(!zzgzf.zzQ(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
    }

    private final void zzE(Object object0, Object object1, int v) {
        if(!this.zzN(object1, v)) {
            return;
        }
        int v1 = this.zzu(v);
        Unsafe unsafe0 = zzgzf.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1.toString());
        }
        zzgzv zzgzv0 = this.zzx(v);
        if(!this.zzN(object0, v)) {
            if(zzgzf.zzQ(object2)) {
                Object object3 = zzgzv0.zze();
                zzgzv0.zzg(object3, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.zzH(object0, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!zzgzf.zzQ(object4)) {
            Object object5 = zzgzv0.zze();
            zzgzv0.zzg(object5, object4);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzgzv0.zzg(object4, object2);
    }

    private final void zzF(Object object0, Object object1, int v) {
        int v1 = this.zzc[v];
        if(!this.zzR(object1, v1, v)) {
            return;
        }
        int v2 = this.zzu(v);
        Unsafe unsafe0 = zzgzf.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1.toString());
        }
        zzgzv zzgzv0 = this.zzx(v);
        if(!this.zzR(object0, v1, v)) {
            if(zzgzf.zzQ(object2)) {
                Object object3 = zzgzv0.zze();
                zzgzv0.zzg(object3, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            this.zzI(object0, v1, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!zzgzf.zzQ(object4)) {
            Object object5 = zzgzv0.zze();
            zzgzv0.zzg(object5, object4);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzgzv0.zzg(object4, object2);
    }

    private final void zzG(Object object0, int v, zzgzp zzgzp0) throws IOException {
        if(zzgzf.zzM(v)) {
            zzhao.zzv(object0, ((long)(v & 0xFFFFF)), zzgzp0.zzs());
            return;
        }
        if(this.zzi) {
            zzhao.zzv(object0, ((long)(v & 0xFFFFF)), zzgzp0.zzr());
            return;
        }
        zzhao.zzv(object0, ((long)(v & 0xFFFFF)), zzgzp0.zzp());
    }

    private final void zzH(Object object0, int v) {
        int v1 = this.zzr(v);
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        zzhao.zzt(object0, ((long)(0xFFFFF & v1)), 1 << (v1 >>> 20) | zzhao.zzd(object0, ((long)(0xFFFFF & v1))));
    }

    private final void zzI(Object object0, int v, int v1) {
        zzhao.zzt(object0, ((long)(this.zzr(v1) & 0xFFFFF)), v);
    }

    private final void zzJ(Object object0, int v, Object object1) {
        int v1 = this.zzu(v);
        zzgzf.zzb.putObject(object0, ((long)(v1 & 0xFFFFF)), object1);
        this.zzH(object0, v);
    }

    private final void zzK(Object object0, int v, int v1, Object object1) {
        int v2 = this.zzu(v1);
        zzgzf.zzb.putObject(object0, ((long)(v2 & 0xFFFFF)), object1);
        this.zzI(object0, v, v1);
    }

    private final boolean zzL(Object object0, Object object1, int v) {
        return this.zzN(object0, v) == this.zzN(object1, v);
    }

    private static boolean zzM(int v) {
        return (v & 0x20000000) != 0;
    }

    private final boolean zzN(Object object0, int v) {
        int v1 = this.zzr(v);
        if(((long)(v1 & 0xFFFFF)) == 0xFFFFFL) {
            int v2 = this.zzu(v);
            switch(v2 >>> 20 & 0xFF) {
                case 0: {
                    return Double.doubleToRawLongBits(zzhao.zzb(object0, ((long)(v2 & 0xFFFFF)))) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(zzhao.zzc(object0, ((long)(v2 & 0xFFFFF)))) != 0;
                }
                case 2: {
                    return zzhao.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return zzhao.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return zzhao.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return zzhao.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return zzhao.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return zzhao.zzz(object0, ((long)(v2 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = zzhao.zzh(object0, ((long)(v2 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzgwj)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzgwj.zzb.equals(object1);
                }
                case 9: {
                    return zzhao.zzh(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = zzhao.zzh(object0, ((long)(v2 & 0xFFFFF)));
                    return !zzgwj.zzb.equals(object2);
                }
                case 11: {
                    return zzhao.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return zzhao.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return zzhao.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return zzhao.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return zzhao.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return zzhao.zzf(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return zzhao.zzh(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (zzhao.zzd(object0, ((long)(v1 & 0xFFFFF))) & 1 << (v1 >>> 20)) != 0;
    }

    private final boolean zzO(Object object0, int v, int v1, int v2, int v3) {
        return v1 == 0xFFFFF ? this.zzN(object0, v) : (v2 & v3) != 0;
    }

    private static boolean zzP(Object object0, int v, zzgzv zzgzv0) {
        return zzgzv0.zzl(zzhao.zzh(object0, ((long)(v & 0xFFFFF))));
    }

    private static boolean zzQ(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof zzgxr ? ((zzgxr)object0).zzcd() : true;
    }

    private final boolean zzR(Object object0, int v, int v1) {
        return zzhao.zzd(object0, ((long)(this.zzr(v1) & 0xFFFFF))) == v;
    }

    private static boolean zzS(Object object0, long v) {
        return ((Boolean)zzhao.zzh(object0, v)).booleanValue();
    }

    private static final void zzT(int v, Object object0, zzhaw zzhaw0) throws IOException {
        if(object0 instanceof String) {
            zzhaw0.zzG(v, ((String)object0));
            return;
        }
        zzhaw0.zzd(v, ((zzgwj)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final int zza(Object object0) {
        int v44;
        int v42;
        int v41;
        int v40;
        int v37;
        int v33;
        int v25;
        int v24;
        int v23;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v11;
        int v10;
        int v9;
        Unsafe unsafe0 = zzgzf.zzb;
        int v = 0xFFFFF;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v2 < this.zzc.length) {
            int v4 = this.zzu(v2);
            int v5 = v4 >>> 20 & 0xFF;
            int v6 = this.zzc[v2];
            int v7 = this.zzc[v2 + 2];
            int v8 = v7 & 0xFFFFF;
            if(v5 <= 17) {
                if(v8 != v) {
                    v1 = v8 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v8));
                    v = v8;
                }
                v9 = v;
                v10 = v1;
                v11 = 1 << (v7 >>> 20);
            }
            else {
                v9 = v;
                v10 = v1;
                v11 = 0;
            }
            boolean z = v5 < zzgxh.zzJ.zza();
            long v12 = (long)(v4 & 0xFFFFF);
            switch(v5) {
                case 0: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v13 = zzgww.zzD(v6 << 3);
                        v17 = v13 + 8;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 1: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v14 = zzgww.zzD(v6 << 3);
                        v17 = v14 + 4;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 2: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(unsafe0.getLong(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 3: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(unsafe0.getLong(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 4: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(unsafe0.getInt(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 5: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v13 = zzgww.zzD(v6 << 3);
                        v17 = v13 + 8;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 6: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v14 = zzgww.zzD(v6 << 3);
                        v17 = v14 + 4;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 7: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v17 = zzgww.zzD(v6 << 3) + 1;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 8: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        Object object1 = unsafe0.getObject(object0, v12);
                        if(object1 instanceof zzgwj) {
                            v18 = zzgww.zzD(v6 << 3);
                            v19 = ((zzgwj)object1).zzd();
                            v20 = zzgww.zzD(v19);
                            goto label_355;
                        }
                        else {
                            v15 = zzgww.zzD(v6 << 3);
                            v16 = zzgww.zzC(((String)object1));
                            goto label_385;
                        }
                        goto label_63;
                    }
                    break;
                }
                case 9: {
                label_63:
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v17 = zzgzx.zzh(v6, unsafe0.getObject(object0, v12), this.zzx(v2));
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 10: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v18 = zzgww.zzD(v6 << 3);
                        v19 = ((zzgwj)unsafe0.getObject(object0, v12)).zzd();
                        v20 = zzgww.zzD(v19);
                        goto label_355;
                    }
                    break;
                }
                case 11: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzD(unsafe0.getInt(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 12: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(unsafe0.getInt(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 13: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v14 = zzgww.zzD(v6 << 3);
                        v17 = v14 + 4;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 14: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v13 = zzgww.zzD(v6 << 3);
                        v17 = v13 + 8;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 15: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        int v21 = unsafe0.getInt(object0, v12);
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzD(v21 >> 0x1F ^ v21 + v21);
                        goto label_385;
                    }
                    break;
                }
                case 16: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        long v22 = unsafe0.getLong(object0, v12);
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(v22 >> 0x3F ^ v22 + v22);
                        goto label_385;
                    }
                    break;
                }
                case 17: {
                    if(this.zzO(object0, v2, v9, v10, v11)) {
                        v17 = zzgww.zzy(v6, ((zzgzc)unsafe0.getObject(object0, v12)), this.zzx(v2));
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 18: {
                    v17 = zzgzx.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v17;
                    break;
                }
                case 19: {
                    v17 = zzgzx.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v17;
                    break;
                }
                case 20: {
                    List list0 = (List)unsafe0.getObject(object0, v12);
                    v23 = list0.size() == 0 ? 0 : zzgzx.zzg(list0) + list0.size() * zzgww.zzD(v6 << 3);
                    v3 += v23;
                    break;
                }
                case 21: {
                    List list1 = (List)unsafe0.getObject(object0, v12);
                    v24 = list1.size();
                    if(v24 != 0) {
                        v15 = zzgzx.zzl(list1);
                        v25 = zzgww.zzD(v6 << 3);
                        v16 = v24 * v25;
                        goto label_385;
                    }
                    v17 = 0;
                    v3 += v17;
                    break;
                }
                case 22: {
                    List list2 = (List)unsafe0.getObject(object0, v12);
                    v24 = list2.size();
                    if(v24 != 0) {
                        v15 = zzgzx.zzf(list2);
                        v25 = zzgww.zzD(v6 << 3);
                        v16 = v24 * v25;
                        goto label_385;
                    }
                    v17 = 0;
                    v3 += v17;
                    break;
                }
                case 23: {
                    v17 = zzgzx.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v17;
                    break;
                }
                case 24: {
                    v17 = zzgzx.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v17;
                    break;
                }
                case 25: {
                    int v26 = ((List)unsafe0.getObject(object0, v12)).size();
                    if(v26 != 0) {
                        v17 = v26 * (zzgww.zzD(v6 << 3) + 1);
                        v3 += v17;
                        break;
                    }
                    v17 = 0;
                    v3 += v17;
                    break;
                }
                case 26: {
                    List list3 = (List)unsafe0.getObject(object0, v12);
                    int v27 = list3.size();
                    if(v27 == 0) {
                        v23 = 0;
                    }
                    else {
                        v23 = zzgww.zzD(v6 << 3) * v27;
                        if(list3 instanceof zzgyo) {
                            zzgyo zzgyo0 = (zzgyo)list3;
                            for(int v28 = 0; v28 < v27; ++v28) {
                                Object object2 = zzgyo0.zzc();
                                if(object2 instanceof zzgwj) {
                                    int v29 = ((zzgwj)object2).zzd();
                                    v23 += zzgww.zzD(v29) + v29;
                                }
                                else {
                                    v23 += zzgww.zzC(((String)object2));
                                }
                            }
                        }
                        else {
                            for(int v30 = 0; v30 < v27; ++v30) {
                                Object object3 = list3.get(v30);
                                if(object3 instanceof zzgwj) {
                                    int v31 = ((zzgwj)object3).zzd();
                                    v23 += zzgww.zzD(v31) + v31;
                                }
                                else {
                                    v23 += zzgww.zzC(((String)object3));
                                }
                            }
                        }
                    }
                    v3 += v23;
                    break;
                }
                case 27: {
                    List list4 = (List)unsafe0.getObject(object0, v12);
                    zzgzv zzgzv0 = this.zzx(v2);
                    int v32 = list4.size();
                    if(v32 == 0) {
                        v33 = 0;
                    }
                    else {
                        v33 = zzgww.zzD(v6 << 3) * v32;
                        for(int v34 = 0; v34 < v32; ++v34) {
                            Object object4 = list4.get(v34);
                            if(object4 instanceof zzgyn) {
                                int v35 = ((zzgyn)object4).zza();
                                v33 += zzgww.zzD(v35) + v35;
                            }
                            else {
                                v33 += zzgww.zzA(((zzgzc)object4), zzgzv0);
                            }
                        }
                    }
                    v3 += v33;
                    break;
                }
                case 28: {
                    List list5 = (List)unsafe0.getObject(object0, v12);
                    int v36 = list5.size();
                    if(v36 == 0) {
                        v37 = 0;
                    }
                    else {
                        v37 = v36 * zzgww.zzD(v6 << 3);
                        for(int v38 = 0; v38 < list5.size(); ++v38) {
                            int v39 = ((zzgwj)list5.get(v38)).zzd();
                            v37 += zzgww.zzD(v39) + v39;
                        }
                    }
                    v3 += v37;
                    break;
                }
                case 29: {
                    List list6 = (List)unsafe0.getObject(object0, v12);
                    v24 = list6.size();
                    if(v24 != 0) {
                        v15 = zzgzx.zzk(list6);
                        v25 = zzgww.zzD(v6 << 3);
                        v16 = v24 * v25;
                        goto label_385;
                    }
                    v17 = 0;
                    v3 += v17;
                    break;
                }
                case 30: {
                    List list7 = (List)unsafe0.getObject(object0, v12);
                    v24 = list7.size();
                    if(v24 != 0) {
                        v15 = zzgzx.zza(list7);
                        v25 = zzgww.zzD(v6 << 3);
                        v16 = v24 * v25;
                        goto label_385;
                    }
                    v17 = 0;
                    v3 += v17;
                    break;
                }
                case 0x1F: {
                    v17 = zzgzx.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v17;
                    break;
                }
                case 0x20: {
                    v17 = zzgzx.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v17;
                    break;
                }
                case 33: {
                    List list8 = (List)unsafe0.getObject(object0, v12);
                    v24 = list8.size();
                    if(v24 != 0) {
                        v15 = zzgzx.zzi(list8);
                        v25 = zzgww.zzD(v6 << 3);
                        v16 = v24 * v25;
                        goto label_385;
                    }
                    v17 = 0;
                    v3 += v17;
                    break;
                }
                case 34: {
                    List list9 = (List)unsafe0.getObject(object0, v12);
                    v24 = list9.size();
                    if(v24 == 0) {
                        v17 = 0;
                        v3 += v17;
                        break;
                    }
                    else {
                        v15 = zzgzx.zzj(list9);
                        v16 = v24 * zzgww.zzD(v6 << 3);
                        goto label_385;
                    }
                    goto label_224;
                }
                case 35: {
                label_224:
                    v40 = zzgzx.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 36: {
                    v40 = zzgzx.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 37: {
                    v40 = zzgzx.zzg(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 38: {
                    v40 = zzgzx.zzl(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 39: {
                    v40 = zzgzx.zzf(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 40: {
                    v40 = zzgzx.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 41: {
                    v40 = zzgzx.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 42: {
                    v40 = ((List)unsafe0.getObject(object0, v12)).size();
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 43: {
                    v40 = zzgzx.zzk(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 44: {
                    v40 = zzgzx.zza(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 45: {
                    v40 = zzgzx.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 46: {
                    v40 = zzgzx.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                        break;
                    }
                    break;
                }
                case 0x2F: {
                    v40 = zzgzx.zzi(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v41 = zzgww.zzD(v6 << 3);
                        v42 = zzgww.zzD(v40);
                        v37 = v41 + v42 + v40;
                        v3 += v37;
                    }
                    break;
                }
                case 0x30: {
                    v40 = zzgzx.zzj(((List)unsafe0.getObject(object0, v12)));
                    if(v40 > 0) {
                        v3 += zzgww.zzD(v6 << 3) + zzgww.zzD(v40) + v40;
                    }
                    break;
                }
                case 49: {
                    List list10 = (List)unsafe0.getObject(object0, v12);
                    zzgzv zzgzv1 = this.zzx(v2);
                    int v43 = list10.size();
                    if(v43 == 0) {
                        v44 = 0;
                    }
                    else {
                        v44 = 0;
                        for(int v45 = 0; v45 < v43; ++v45) {
                            v44 += zzgww.zzy(v6, ((zzgzc)list10.get(v45)), zzgzv1);
                        }
                    }
                    v3 += v44;
                    break;
                }
                case 50: {
                    Object object5 = unsafe0.getObject(object0, v12);
                    Object object6 = this.zzz(v2);
                    zzgyw zzgyw0 = (zzgyw)object5;
                    zzgyv zzgyv0 = (zzgyv)object6;
                    if(!zzgyw0.isEmpty()) {
                        Iterator iterator0 = zzgyw0.entrySet().iterator();
                        if(iterator0.hasNext()) {
                            Object object7 = iterator0.next();
                            ((Map.Entry)object7).getKey();
                            ((Map.Entry)object7).getValue();
                            throw null;
                        }
                    }
                    break;
                }
                case 51: {
                    if(this.zzR(object0, v6, v2)) {
                        v13 = zzgww.zzD(v6 << 3);
                        v17 = v13 + 8;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.zzR(object0, v6, v2)) {
                        v14 = zzgww.zzD(v6 << 3);
                        v17 = v14 + 4;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.zzR(object0, v6, v2)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(zzgzf.zzv(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 54: {
                    if(this.zzR(object0, v6, v2)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(zzgzf.zzv(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 55: {
                    if(this.zzR(object0, v6, v2)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(zzgzf.zzp(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 56: {
                    if(this.zzR(object0, v6, v2)) {
                        v13 = zzgww.zzD(v6 << 3);
                        v17 = v13 + 8;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.zzR(object0, v6, v2)) {
                        v14 = zzgww.zzD(v6 << 3);
                        v17 = v14 + 4;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 58: {
                    if(this.zzR(object0, v6, v2)) {
                        v17 = zzgww.zzD(v6 << 3) + 1;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.zzR(object0, v6, v2)) {
                        Object object8 = unsafe0.getObject(object0, v12);
                        if(object8 instanceof zzgwj) {
                            v18 = zzgww.zzD(v6 << 3);
                            v19 = ((zzgwj)object8).zzd();
                            v20 = zzgww.zzD(v19);
                        label_355:
                            v17 = v18 + (v20 + v19);
                            v3 += v17;
                            break;
                        }
                        else {
                            v15 = zzgww.zzD(v6 << 3);
                            v16 = zzgww.zzC(((String)object8));
                            goto label_385;
                        }
                        goto label_360;
                    }
                    break;
                }
                case 60: {
                label_360:
                    if(this.zzR(object0, v6, v2)) {
                        v17 = zzgzx.zzh(v6, unsafe0.getObject(object0, v12), this.zzx(v2));
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.zzR(object0, v6, v2)) {
                        v19 = ((zzgwj)unsafe0.getObject(object0, v12)).zzd();
                        v17 = zzgww.zzD(v6 << 3) + (zzgww.zzD(v19) + v19);
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.zzR(object0, v6, v2)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzD(zzgzf.zzp(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zzR(object0, v6, v2)) {
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzE(zzgzf.zzp(object0, v12));
                        goto label_385;
                    }
                    break;
                }
                case 0x40: {
                    if(this.zzR(object0, v6, v2)) {
                        v17 = zzgww.zzD(v6 << 3) + 4;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 65: {
                    if(this.zzR(object0, v6, v2)) {
                        v17 = zzgww.zzD(v6 << 3) + 8;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.zzR(object0, v6, v2)) {
                        int v46 = zzgzf.zzp(object0, v12);
                        v15 = zzgww.zzD(v6 << 3);
                        v16 = zzgww.zzD(v46 >> 0x1F ^ v46 + v46);
                    label_385:
                        v17 = v15 + v16;
                        v3 += v17;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.zzR(object0, v6, v2)) {
                        long v47 = zzgzf.zzv(object0, v12);
                        v17 = zzgww.zzD(v6 << 3) + zzgww.zzE(v47 >> 0x3F ^ v47 + v47);
                        v3 += v17;
                    }
                    break;
                }
                case 68: {
                    if(this.zzR(object0, v6, v2)) {
                        v3 += zzgww.zzy(v6, ((zzgzc)unsafe0.getObject(object0, v12)), this.zzx(v2));
                    }
                }
            }
            v2 += 3;
            v = v9;
            v1 = v10;
        }
        int v48 = v3 + ((zzgxr)object0).zzt.zza();
        if(this.zzh) {
            zzgxg zzgxg0 = ((zzgxn)object0).zza;
            int v49 = zzgxg0.zza.zzc();
            int v51 = 0;
            for(int v50 = 0; v50 < v49; ++v50) {
                Map.Entry map$Entry0 = zzgxg0.zza.zzg(v50);
                v51 += zzgxg.zzc(((zzgxf)((zzgzz)map$Entry0).zza()), map$Entry0.getValue());
            }
            for(Object object9: zzgxg0.zza.zzd()) {
                v51 += zzgxg.zzc(((zzgxf)((Map.Entry)object9).getKey()), ((Map.Entry)object9).getValue());
            }
            return v48 + v51;
        }
        return v48;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final int zzb(Object object0) {
        int v8;
        int v7;
        long v6;
        int v1 = 0;
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v2 = this.zzu(v);
            int v3 = this.zzc[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch(v2 >>> 20 & 0xFF) {
                case 0: {
                    v6 = Double.doubleToLongBits(zzhao.zzb(object0, v4));
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 1: {
                    v7 = v1 * 53;
                    v8 = Float.floatToIntBits(zzhao.zzc(object0, v4));
                    v1 = v7 + v8;
                    break;
                }
                case 2: {
                    v6 = zzhao.zzf(object0, v4);
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 3: {
                    v6 = zzhao.zzf(object0, v4);
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 4: {
                    v7 = v1 * 53;
                    v8 = zzhao.zzd(object0, v4);
                    v1 = v7 + v8;
                    break;
                }
                case 5: {
                    v6 = zzhao.zzf(object0, v4);
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 6: {
                    v1 = v1 * 53 + zzhao.zzd(object0, v4);
                    break;
                }
                case 7: {
                    v1 = v1 * 53 + zzgye.zza(zzhao.zzz(object0, v4));
                    break;
                }
                case 8: {
                    v1 = v1 * 53 + ((String)zzhao.zzh(object0, v4)).hashCode();
                    break;
                }
                case 9: {
                    Object object1 = zzhao.zzh(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = v1 * 53 + zzhao.zzh(object0, v4).hashCode();
                    break;
                }
                case 11: {
                    v1 = v1 * 53 + zzhao.zzd(object0, v4);
                    break;
                }
                case 12: {
                    v1 = v1 * 53 + zzhao.zzd(object0, v4);
                    break;
                }
                case 13: {
                    v1 = v1 * 53 + zzhao.zzd(object0, v4);
                    break;
                }
                case 14: {
                    v6 = zzhao.zzf(object0, v4);
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 15: {
                    v1 = v1 * 53 + zzhao.zzd(object0, v4);
                    break;
                }
                case 16: {
                    v6 = zzhao.zzf(object0, v4);
                    v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    break;
                }
                case 17: {
                    Object object2 = zzhao.zzh(object0, v4);
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
                    v1 = v1 * 53 + zzhao.zzh(object0, v4).hashCode();
                    break;
                }
                case 50: {
                    v1 = v1 * 53 + zzhao.zzh(object0, v4).hashCode();
                    break;
                }
                case 51: {
                    if(this.zzR(object0, v3, v)) {
                        v6 = Double.doubleToLongBits(zzgzf.zzn(object0, v4));
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 52: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + Float.floatToIntBits(zzgzf.zzo(object0, v4));
                    }
                    break;
                }
                case 53: {
                    if(this.zzR(object0, v3, v)) {
                        v6 = zzgzf.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 54: {
                    if(this.zzR(object0, v3, v)) {
                        v6 = zzgzf.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 55: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgzf.zzp(object0, v4);
                    }
                    break;
                }
                case 56: {
                    if(this.zzR(object0, v3, v)) {
                        v6 = zzgzf.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 57: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgzf.zzp(object0, v4);
                    }
                    break;
                }
                case 58: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgye.zza(zzgzf.zzS(object0, v4));
                    }
                    break;
                }
                case 59: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + ((String)zzhao.zzh(object0, v4)).hashCode();
                    }
                    break;
                }
                case 60: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzhao.zzh(object0, v4).hashCode();
                    }
                    break;
                }
                case 61: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzhao.zzh(object0, v4).hashCode();
                    }
                    break;
                }
                case 62: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgzf.zzp(object0, v4);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgzf.zzp(object0, v4);
                    }
                    break;
                }
                case 0x40: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgzf.zzp(object0, v4);
                    }
                    break;
                }
                case 65: {
                    if(this.zzR(object0, v3, v)) {
                        v6 = zzgzf.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 66: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzgzf.zzp(object0, v4);
                    }
                    break;
                }
                case 67: {
                    if(this.zzR(object0, v3, v)) {
                        v6 = zzgzf.zzv(object0, v4);
                        v1 = v1 * 53 + ((int)(v6 ^ v6 >>> 0x20));
                    }
                    break;
                }
                case 68: {
                    if(this.zzR(object0, v3, v)) {
                        v1 = v1 * 53 + zzhao.zzh(object0, v4).hashCode();
                    }
                }
            }
        }
        int v9 = v1 * 53 + ((zzgxr)object0).zzt.hashCode();
        return this.zzh ? v9 * 53 + ((zzgxn)object0).zza.zza.hashCode() : v9;
    }

    final int zzc(Object object0, byte[] arr_b, int v, int v1, int v2, zzgvx zzgvx0) throws IOException {
        Object object10;
        int v93;
        Object object11;
        int v90;
        int v89;
        Unsafe unsafe8;
        int v88;
        int v83;
        int v45;
        int v44;
        int v60;
        int v77;
        int v57;
        int v47;
        int v67;
        long v42;
        int v40;
        int v39;
        Unsafe unsafe4;
        Object object5;
        int v38;
        int v37;
        Unsafe unsafe3;
        int v28;
        int v27;
        int v26;
        int v30;
        Unsafe unsafe2;
        Object object2;
        zzgvx zzgvx3;
        int v17;
        int v16;
        int v15;
        int v14;
        Unsafe unsafe1;
        int v13;
        int v12;
        int v10;
        zzgvx zzgvx1 = zzgvx0;
        Object object1 = object0;
        zzgvx zzgvx2 = zzgvx0;
        zzgzf.zzD(object0);
        Unsafe unsafe0 = zzgzf.zzb;
        int v3 = v;
        int v4 = -1;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0xFFFFF;
        while(true) {
            if(v3 >= v1) {
                unsafe1 = unsafe0;
                object10 = object1;
                v93 = v3;
                break;
            }
            int v9 = arr_b[v3];
            if(v9 < 0) {
                v10 = zzgvy.zzi(v9, arr_b, v3 + 1, zzgvx2);
                v9 = zzgvx2.zza;
            }
            else {
                v10 = v3 + 1;
            }
            int v11 = v9 >>> 3;
            if(v11 <= v4) {
                v12 = this.zzq(v11);
            }
            else if(v11 < this.zze || v11 > this.zzf) {
                v12 = -1;
            }
            else {
                v12 = this.zzs(v11, v5 / 3);
            }
            if(v12 == -1) {
                v13 = v9;
                unsafe1 = unsafe0;
                v14 = v11;
                v15 = v10;
                v16 = v8;
                v17 = 0;
                zzgvx3 = zzgvx2;
                object2 = object1;
            }
            else {
                int v18 = v9 & 7;
                int[] arr_v = this.zzc;
                int v19 = arr_v[v12 + 1];
                int v20 = v19 >>> 20 & 0xFF;
                long v21 = (long)(v19 & 0xFFFFF);
                if(v20 <= 17) {
                    int v22 = arr_v[v12 + 2];
                    int v23 = 1 << (v22 >>> 20);
                    int v24 = v22 & 0xFFFFF;
                    if(v24 == v8) {
                        v16 = v8;
                    }
                    else {
                        if(v8 == 0xFFFFF) {
                            unsafe2 = unsafe0;
                        }
                        else {
                            unsafe2 = unsafe0;
                            unsafe2.putInt(object1, ((long)v8), v7);
                        }
                        v16 = v24;
                        v7 = v24 == 0xFFFFF ? 0 : unsafe2.getInt(object1, ((long)v24));
                        unsafe0 = unsafe2;
                    }
                    switch(v20) {
                        case 0: {
                        label_74:
                            v26 = v12;
                            v27 = v11;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 1) {
                                v3 = v10 + 8;
                                v7 |= v23;
                                zzhao.zzr(object1, v21, Double.longBitsToDouble(zzgvy.zzn(arr_b, v10)));
                                unsafe0 = unsafe3;
                                v4 = v27;
                                goto label_147;
                            }
                            break;
                        }
                        case 1: {
                            v26 = v12;
                            v27 = v11;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 5) {
                                v3 = v10 + 4;
                                v7 |= v23;
                                zzhao.zzs(object1, v21, Float.intBitsToFloat(zzgvy.zzb(arr_b, v10)));
                                unsafe0 = unsafe3;
                                v4 = v27;
                                goto label_147;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v26 = v12;
                            v27 = v11;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 0) {
                                v7 |= v23;
                                int v29 = zzgvy.zzk(arr_b, v10, zzgvx1);
                                unsafe3.putLong(object0, v21, zzgvx1.zzb);
                                v3 = v29;
                                unsafe0 = unsafe3;
                                v4 = v27;
                                goto label_147;
                            }
                            break;
                        }
                        case 7: {
                        label_137:
                            v26 = v12;
                            v30 = v11;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 0) {
                                v7 |= v23;
                                v3 = zzgvy.zzk(arr_b, v10, zzgvx1);
                                zzhao.zzp(object1, v21, zzgvx1.zzb != 0L);
                                v4 = v30;
                                unsafe0 = unsafe3;
                            label_147:
                                zzgvx2 = zzgvx1;
                                v5 = v26;
                                v8 = v16;
                                v6 = v28;
                                continue;
                            }
                            v27 = v30;
                            break;
                        }
                        case 8: {
                            v26 = v12;
                            v30 = v11;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 2) {
                                if(zzgzf.zzM(v19)) {
                                    v3 = zzgvy.zzh(arr_b, v10, zzgvx1);
                                    int v31 = zzgvx1.zza;
                                    if(v31 >= 0) {
                                        if(v31 == 0) {
                                            zzgvx1.zzc = "";
                                        }
                                        else {
                                            zzgvx1.zzc = zzhat.zzh(arr_b, v3, v31);
                                            v3 += v31;
                                        }
                                        v7 |= v23;
                                        goto label_179;
                                    }
                                }
                                else {
                                    int v32 = zzgvy.zzh(arr_b, v10, zzgvx1);
                                    int v33 = zzgvx1.zza;
                                    if(v33 >= 0) {
                                        if(v33 == 0) {
                                            zzgvx1.zzc = "";
                                        }
                                        else {
                                            zzgvx1.zzc = new String(arr_b, v32, v33, zzgye.zza);
                                            v32 += v33;
                                        }
                                        v7 |= v23;
                                        v3 = v32;
                                    label_179:
                                        unsafe3.putObject(object1, v21, zzgvx1.zzc);
                                        v4 = v30;
                                        unsafe0 = unsafe3;
                                        zzgvx2 = zzgvx1;
                                        v5 = v26;
                                        v8 = v16;
                                        v6 = v28;
                                        continue;
                                    }
                                }
                                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                            }
                            v27 = v30;
                            break;
                        }
                        case 9: {
                            zzgvx2 = zzgvx0;
                            v26 = v12;
                            v30 = v11;
                            v6 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 2) {
                                v7 |= v23;
                                Object object4 = this.zzA(object1, v26);
                                v3 = zzgvy.zzm(object4, this.zzx(v26), arr_b, v10, v1, zzgvx0);
                                this.zzJ(object1, v26, object4);
                                unsafe0 = unsafe3;
                                v4 = v30;
                                v5 = v26;
                                v8 = v16;
                                continue;
                            }
                            else {
                                zzgvx1 = zzgvx2;
                                v28 = v6;
                            }
                            v27 = v30;
                            break;
                        }
                        case 10: {
                            zzgvx2 = zzgvx0;
                            v26 = v12;
                            v30 = v11;
                            v6 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 2) {
                                v7 |= v23;
                                v3 = zzgvy.zza(arr_b, v10, zzgvx2);
                                unsafe3.putObject(object1, v21, zzgvx2.zzc);
                                goto label_235;
                            }
                            else {
                                zzgvx1 = zzgvx2;
                                v28 = v6;
                                v27 = v30;
                                break;
                            }
                            goto label_220;
                        }
                        case 4: 
                        case 11: {
                            v26 = v12;
                            v27 = v11;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 0) {
                                v7 |= v23;
                                v3 = zzgvy.zzh(arr_b, v10, zzgvx1);
                                unsafe3.putInt(object1, v21, zzgvx1.zza);
                                unsafe0 = unsafe3;
                                v4 = v27;
                                goto label_147;
                            }
                            break;
                        }
                        case 12: {
                        label_220:
                            zzgvx2 = zzgvx0;
                            v26 = v12;
                            v30 = v11;
                            unsafe3 = unsafe0;
                            if(v18 == 0) {
                                v3 = zzgvy.zzh(arr_b, v10, zzgvx2);
                                int v34 = zzgvx2.zza;
                                zzgxx zzgxx0 = this.zzw(v26);
                                if((v19 & 0x80000000) != 0 && zzgxx0 != null && !zzgxx0.zza(v34)) {
                                    v6 = v9;
                                    zzgzf.zzd(object0).zzj(v6, ((long)v34));
                                }
                                else {
                                    v6 = v9;
                                    v7 |= v23;
                                    unsafe3.putInt(object1, v21, v34);
                                }
                            label_235:
                                v4 = v30;
                                unsafe0 = unsafe3;
                                v5 = v26;
                                v8 = v16;
                                continue;
                            }
                            else {
                                v27 = v30;
                                zzgvx1 = zzgvx2;
                                v28 = v9;
                                break;
                            }
                            goto label_242;
                        }
                        case 6: 
                        case 13: {
                        label_125:
                            v26 = v12;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 5) {
                                v3 = v10 + 4;
                                v7 |= v23;
                                unsafe3.putInt(object1, v21, zzgvy.zzb(arr_b, v10));
                                v4 = v11;
                                unsafe0 = unsafe3;
                                goto label_147;
                            }
                            else {
                                v27 = v11;
                                break;
                            }
                            goto label_137;
                        }
                        case 5: 
                        case 14: {
                            v26 = v12;
                            v28 = v9;
                            unsafe3 = unsafe0;
                            if(v18 == 1) {
                                v7 |= v23;
                                unsafe3.putLong(object0, v21, zzgvy.zzn(arr_b, v10));
                                v3 = v10 + 8;
                                unsafe0 = unsafe3;
                                v4 = v11;
                                goto label_147;
                            }
                            else {
                                v27 = v11;
                                break;
                            }
                            goto label_125;
                        }
                        case 15: {
                        label_242:
                            zzgvx2 = zzgvx0;
                            v26 = v12;
                            unsafe3 = unsafe0;
                            if(v18 == 0) {
                                v7 |= v23;
                                v3 = zzgvy.zzh(arr_b, v10, zzgvx2);
                                unsafe3.putInt(object1, v21, zzgvx2.zza >>> 1 ^ -(zzgvx2.zza & 1));
                                v4 = v11;
                                unsafe0 = unsafe3;
                                v5 = v26;
                                v6 = v9;
                                v8 = v16;
                                continue;
                            }
                            else {
                                v27 = v11;
                                zzgvx1 = zzgvx2;
                            }
                            v28 = v9;
                            break;
                        }
                        case 16: {
                            if(v18 == 0) {
                                v7 |= v23;
                                int v35 = zzgvy.zzk(arr_b, v10, zzgvx0);
                                v4 = v11;
                                unsafe0.putLong(object0, v21, zzgvx0.zzb >>> 1 ^ -(1L & zzgvx0.zzb));
                                v3 = v35;
                                zzgvx2 = zzgvx0;
                                v5 = v12;
                                v6 = v9;
                                v8 = v16;
                                continue;
                            }
                            else {
                                unsafe3 = unsafe0;
                                v26 = v12;
                                v27 = v11;
                                v28 = v9;
                            }
                            break;
                        }
                        default: {
                            if(v18 == 3) {
                                Object object3 = this.zzA(object1, v12);
                                int v25 = zzgvy.zzl(object3, this.zzx(v12), arr_b, v10, v1, v11 << 3 | 4, zzgvx0);
                                this.zzJ(object1, v12, object3);
                                v7 |= v23;
                                v5 = v12;
                                v3 = v25;
                                v6 = v9;
                                v8 = v16;
                                zzgvx2 = zzgvx0;
                                v4 = v11;
                                continue;
                            }
                            else {
                                v26 = v12;
                                v27 = v11;
                                v28 = v9;
                                unsafe3 = unsafe0;
                                break;
                            }
                            goto label_74;
                        }
                    }
                    object2 = object1;
                    v14 = v27;
                    v15 = v10;
                    v17 = v26;
                    zzgvx3 = zzgvx1;
                    unsafe1 = unsafe3;
                    v13 = v28;
                }
                else {
                    v16 = v8;
                    if(v20 == 27) {
                        if(v18 == 2) {
                            zzgyd zzgyd0 = (zzgyd)unsafe0.getObject(object1, v21);
                            if(!zzgyd0.zzc()) {
                                int v36 = zzgyd0.size();
                                zzgyd0 = zzgyd0.zzf((v36 == 0 ? 10 : v36 + v36));
                                unsafe0.putObject(object1, v21, zzgyd0);
                            }
                            zzgvx2 = zzgvx0;
                            v5 = v12;
                            v6 = v9;
                            v4 = v11;
                            v8 = v16;
                            v3 = zzgvy.zze(this.zzx(v12), v9, arr_b, v10, v1, zzgyd0, zzgvx0);
                            continue;
                        }
                        else {
                            v37 = v7;
                            v38 = v9;
                            object5 = object1;
                            unsafe4 = unsafe0;
                            v39 = v12;
                            v40 = v11;
                            zzgvx3 = zzgvx0;
                            goto label_723;
                        }
                        goto label_305;
                    }
                    else {
                    label_305:
                        v37 = v7;
                        zzgvx3 = zzgvx0;
                        if(v20 <= 49) {
                            Unsafe unsafe5 = zzgzf.zzb;
                            zzgyd zzgyd1 = (zzgyd)unsafe5.getObject(object1, v21);
                            if(zzgyd1.zzc()) {
                                v42 = (long)v19;
                            }
                            else {
                                int v41 = zzgyd1.size();
                                v42 = (long)v19;
                                zzgyd zzgyd2 = zzgyd1.zzf(v41 + v41);
                                unsafe5.putObject(object1, v21, zzgyd2);
                                zzgyd1 = zzgyd2;
                            }
                            switch(v20) {
                                case 26: {
                                    v45 = v9;
                                    zzgyd zzgyd3 = zzgyd1;
                                    v17 = v12;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        if((v42 & 0x20000000L) == 0L) {
                                            v67 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                            int v68 = zzgvx3.zza;
                                            if(v68 >= 0) {
                                                if(v68 == 0) {
                                                    zzgyd3.add("");
                                                    goto label_545;
                                                }
                                                else {
                                                    zzgyd3.add(new String(arr_b, v67, v68, zzgye.zza));
                                                }
                                            alab1:
                                                while(true) {
                                                    v67 += v68;
                                                    while(true) {
                                                    label_545:
                                                        if(v67 >= v1) {
                                                            break alab1;
                                                        }
                                                        int v69 = zzgvy.zzh(arr_b, v67, zzgvx3);
                                                        if(v45 != zzgvx3.zza) {
                                                            break alab1;
                                                        }
                                                        v67 = zzgvy.zzh(arr_b, v69, zzgvx3);
                                                        v68 = zzgvx3.zza;
                                                        if(v68 < 0) {
                                                            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if(v68 != 0) {
                                                            zzgyd3.add(new String(arr_b, v67, v68, zzgye.zza));
                                                            break;
                                                        }
                                                        zzgyd3.add("");
                                                    }
                                                }
                                                v44 = v11;
                                                v3 = v67;
                                                break;
                                            }
                                        }
                                        else {
                                            v67 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                            int v70 = zzgvx3.zza;
                                            if(v70 >= 0) {
                                                if(v70 == 0) {
                                                    zzgyd3.add("");
                                                    goto label_571;
                                                }
                                                else {
                                                    int v71 = v67 + v70;
                                                    if(!zzhat.zzi(arr_b, v67, v71)) {
                                                        throw new zzgyg("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzgyd3.add(new String(arr_b, v67, v70, zzgye.zza));
                                                    v67 = v71;
                                                label_571:
                                                    while(v67 < v1) {
                                                        int v72 = zzgvy.zzh(arr_b, v67, zzgvx3);
                                                        if(v45 != zzgvx3.zza) {
                                                            break;
                                                        }
                                                        v67 = zzgvy.zzh(arr_b, v72, zzgvx3);
                                                        int v73 = zzgvx3.zza;
                                                        if(v73 < 0) {
                                                            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if(v73 == 0) {
                                                            zzgyd3.add("");
                                                        }
                                                        else {
                                                            int v74 = v67 + v73;
                                                            if(!zzhat.zzi(arr_b, v67, v74)) {
                                                                throw new zzgyg("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzgyd3.add(new String(arr_b, v67, v73, zzgye.zza));
                                                            v67 = v74;
                                                        }
                                                    }
                                                    v44 = v11;
                                                    v3 = v67;
                                                    break;
                                                }
                                            }
                                        }
                                        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                    }
                                    else {
                                        v44 = v11;
                                        v3 = v10;
                                        break;
                                    }
                                    goto label_594;
                                }
                                case 28: {
                                label_594:
                                    v45 = v9;
                                    v44 = v11;
                                    if(v18 == 2) {
                                        v3 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v75 = zzgvx3.zza;
                                        if(v75 < 0) {
                                            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if(v75 > arr_b.length - v3) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        if(v75 == 0) {
                                            zzgyd1.add(zzgwj.zzb);
                                            goto label_606;
                                        }
                                        else {
                                            zzgyd1.add(zzgwj.zzv(arr_b, v3, v75));
                                        }
                                    alab2:
                                        while(true) {
                                            v3 += v75;
                                            while(true) {
                                            label_606:
                                                if(v3 >= v1) {
                                                    goto label_673;
                                                }
                                                int v76 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                                if(v45 != zzgvx3.zza) {
                                                    goto label_673;
                                                }
                                                v3 = zzgvy.zzh(arr_b, v76, zzgvx3);
                                                v75 = zzgvx3.zza;
                                                if(v75 < 0) {
                                                    throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if(v75 > arr_b.length - v3) {
                                                    break alab2;
                                                }
                                                if(v75 != 0) {
                                                    zzgyd1.add(zzgwj.zzv(arr_b, v3, v75));
                                                    break;
                                                }
                                                zzgyd1.add(zzgwj.zzb);
                                            }
                                        }
                                        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                    }
                                    v17 = v12;
                                    unsafe4 = unsafe0;
                                    v3 = v10;
                                    break;
                                }
                                case 18: 
                                case 35: {
                                label_337:
                                    v45 = v9;
                                    v17 = v12;
                                    v44 = v11;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        zzgwy zzgwy0 = (zzgwy)zzgyd1;
                                        v47 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v48 = zzgvx3.zza;
                                        int v49 = v47 + v48;
                                        if(v49 > arr_b.length) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        zzgwy0.zzi(zzgwy0.size() + v48 / 8);
                                        while(v47 < v49) {
                                            zzgwy0.zzh(Double.longBitsToDouble(zzgvy.zzn(arr_b, v47)));
                                            v47 += 8;
                                        }
                                        if(v47 != v49) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        v3 = v47;
                                        break;
                                    }
                                    else if(v18 == 1) {
                                        v3 = v10 + 8;
                                        zzgwy zzgwy1 = (zzgwy)zzgyd1;
                                        zzgwy1.zzh(Double.longBitsToDouble(zzgvy.zzn(arr_b, v10)));
                                        while(v3 < v1) {
                                            int v50 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            zzgwy1.zzh(Double.longBitsToDouble(zzgvy.zzn(arr_b, v50)));
                                            v3 = v50 + 8;
                                        }
                                        break;
                                    }
                                    v3 = v10;
                                    break;
                                }
                                case 19: 
                                case 36: {
                                    v45 = v9;
                                    v17 = v12;
                                    v44 = v11;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        zzgxi zzgxi0 = (zzgxi)zzgyd1;
                                        v47 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v51 = zzgvx3.zza;
                                        int v52 = v47 + v51;
                                        if(v52 > arr_b.length) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        zzgxi0.zzi(zzgxi0.size() + v51 / 4);
                                        while(v47 < v52) {
                                            zzgxi0.zzh(Float.intBitsToFloat(zzgvy.zzb(arr_b, v47)));
                                            v47 += 4;
                                        }
                                        if(v47 != v52) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        v3 = v47;
                                        break;
                                    }
                                    else if(v18 == 5) {
                                        v3 = v10 + 4;
                                        zzgxi zzgxi1 = (zzgxi)zzgyd1;
                                        zzgxi1.zzh(Float.intBitsToFloat(zzgvy.zzb(arr_b, v10)));
                                        while(v3 < v1) {
                                            int v53 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            zzgxi1.zzh(Float.intBitsToFloat(zzgvy.zzb(arr_b, v53)));
                                            v3 = v53 + 4;
                                        }
                                        break;
                                    }
                                    v3 = v10;
                                    break;
                                }
                                case 20: 
                                case 21: 
                                case 37: 
                                case 38: {
                                    v45 = v9;
                                    v17 = v12;
                                    v44 = v11;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        zzgyr zzgyr0 = (zzgyr)zzgyd1;
                                        v47 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v54 = zzgvx3.zza + v47;
                                        while(v47 < v54) {
                                            v47 = zzgvy.zzk(arr_b, v47, zzgvx3);
                                            zzgyr0.zzg(zzgvx3.zzb);
                                        }
                                        if(v47 != v54) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        v3 = v47;
                                        break;
                                    }
                                    else if(v18 == 0) {
                                        zzgyr zzgyr1 = (zzgyr)zzgyd1;
                                        int v55 = zzgvy.zzk(arr_b, v10, zzgvx3);
                                        zzgyr1.zzg(zzgvx3.zzb);
                                        while(v55 < v1) {
                                            int v56 = zzgvy.zzh(arr_b, v55, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            v55 = zzgvy.zzk(arr_b, v56, zzgvx3);
                                            zzgyr1.zzg(zzgvx3.zzb);
                                        }
                                        v3 = v55;
                                        break;
                                    }
                                    v3 = v10;
                                    break;
                                }
                                case 25: 
                                case 42: {
                                    v45 = v9;
                                    v17 = v12;
                                    v57 = v11;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        zzgvz zzgvz0 = (zzgvz)zzgyd1;
                                        v3 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v65 = zzgvx3.zza + v3;
                                        while(v3 < v65) {
                                            v3 = zzgvy.zzk(arr_b, v3, zzgvx3);
                                            zzgvz0.zzg(zzgvx3.zzb != 0L);
                                        }
                                        if(v3 != v65) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        v44 = v57;
                                    }
                                    else if(v18 == 0) {
                                        zzgvz zzgvz1 = (zzgvz)zzgyd1;
                                        v3 = zzgvy.zzk(arr_b, v10, zzgvx3);
                                        zzgvz1.zzg(zzgvx3.zzb != 0L);
                                        while(v3 < v1) {
                                            int v66 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            v3 = zzgvy.zzk(arr_b, v66, zzgvx3);
                                            zzgvz1.zzg(zzgvx3.zzb != 0L);
                                        }
                                        v44 = v57;
                                    }
                                    else {
                                        v44 = v57;
                                        v3 = v10;
                                    }
                                    break;
                                }
                                case 22: 
                                case 29: 
                                case 39: 
                                case 43: {
                                    v45 = v9;
                                    v17 = v12;
                                    v57 = v11;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        v3 = zzgvy.zzf(arr_b, v10, zzgyd1, zzgvx3);
                                        v44 = v57;
                                    }
                                    else if(v18 == 0) {
                                        v44 = v57;
                                        v3 = zzgvy.zzj(v45, arr_b, v10, v1, zzgyd1, zzgvx0);
                                    }
                                    else {
                                        v44 = v57;
                                        v3 = v10;
                                    }
                                    break;
                                }
                                case 30: 
                                case 44: {
                                    v45 = v9;
                                    v44 = v11;
                                    if(v18 == 2) {
                                        v77 = zzgvy.zzf(arr_b, v10, zzgyd1, zzgvx3);
                                        zzgzx.zzn(object0, v44, zzgyd1, this.zzw(v12), null, this.zzm);
                                        v3 = v77;
                                        goto label_673;
                                    }
                                    else if(v18 == 0) {
                                        v77 = zzgvy.zzj(v45, arr_b, v10, v1, zzgyd1, zzgvx0);
                                        zzgzx.zzn(object0, v44, zzgyd1, this.zzw(v12), null, this.zzm);
                                        v3 = v77;
                                        goto label_673;
                                    }
                                    v17 = v12;
                                    unsafe4 = unsafe0;
                                    v3 = v10;
                                    break;
                                }
                                case 24: 
                                case 0x1F: 
                                case 41: 
                                case 45: {
                                    v45 = v9;
                                    v17 = v12;
                                    v57 = v11;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        zzgxs zzgxs0 = (zzgxs)zzgyd1;
                                        v3 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v62 = zzgvx3.zza;
                                        int v63 = v3 + v62;
                                        if(v63 > arr_b.length) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        zzgxs0.zzj(zzgxs0.size() + v62 / 4);
                                        while(v3 < v63) {
                                            zzgxs0.zzi(zzgvy.zzb(arr_b, v3));
                                            v3 += 4;
                                        }
                                        if(v3 != v63) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        v44 = v57;
                                        break;
                                    }
                                    else if(v18 == 5) {
                                        v60 = v10 + 4;
                                        zzgxs zzgxs1 = (zzgxs)zzgyd1;
                                        zzgxs1.zzi(zzgvy.zzb(arr_b, v10));
                                        while(v60 < v1) {
                                            int v64 = zzgvy.zzh(arr_b, v60, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            zzgxs1.zzi(zzgvy.zzb(arr_b, v64));
                                            v60 = v64 + 4;
                                        }
                                        v3 = v60;
                                        v44 = v57;
                                        break;
                                    }
                                    v44 = v57;
                                    v3 = v10;
                                    break;
                                }
                                case 23: 
                                case 0x20: 
                                case 40: 
                                case 46: {
                                    v45 = v9;
                                    v17 = v12;
                                    v57 = v11;
                                    unsafe4 = unsafe0;
                                    if(v18 == 2) {
                                        zzgyr zzgyr2 = (zzgyr)zzgyd1;
                                        v3 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v58 = zzgvx3.zza;
                                        int v59 = v3 + v58;
                                        if(v59 > arr_b.length) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        zzgyr2.zzi(zzgyr2.size() + v58 / 8);
                                        while(v3 < v59) {
                                            zzgyr2.zzg(zzgvy.zzn(arr_b, v3));
                                            v3 += 8;
                                        }
                                        if(v3 != v59) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        v44 = v57;
                                        break;
                                    }
                                    else if(v18 == 1) {
                                        v60 = v10 + 8;
                                        zzgyr zzgyr3 = (zzgyr)zzgyd1;
                                        zzgyr3.zzg(zzgvy.zzn(arr_b, v10));
                                        while(v60 < v1) {
                                            int v61 = zzgvy.zzh(arr_b, v60, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            zzgyr3.zzg(zzgvy.zzn(arr_b, v61));
                                            v60 = v61 + 8;
                                        }
                                        v3 = v60;
                                        v44 = v57;
                                        break;
                                    }
                                    v44 = v57;
                                    v3 = v10;
                                    break;
                                }
                                case 33: 
                                case 0x2F: {
                                    v45 = v9;
                                    v44 = v11;
                                    if(v18 == 2) {
                                        zzgxs zzgxs2 = (zzgxs)zzgyd1;
                                        v3 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v78 = zzgvx3.zza + v3;
                                        while(v3 < v78) {
                                            v3 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                            zzgxs2.zzi(zzgvx3.zza >>> 1 ^ -(zzgvx3.zza & 1));
                                        }
                                        if(v3 != v78) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        goto label_673;
                                    }
                                    else if(v18 == 0) {
                                        zzgxs zzgxs3 = (zzgxs)zzgyd1;
                                        v3 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        zzgxs3.zzi(zzgvx3.zza >>> 1 ^ -(zzgvx3.zza & 1));
                                        while(v3 < v1) {
                                            int v79 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            v3 = zzgvy.zzh(arr_b, v79, zzgvx3);
                                            zzgxs3.zzi(zzgvx3.zza >>> 1 ^ -(zzgvx3.zza & 1));
                                        }
                                        goto label_673;
                                    }
                                    v17 = v12;
                                    unsafe4 = unsafe0;
                                    v3 = v10;
                                    break;
                                }
                                case 34: 
                                case 0x30: {
                                    v45 = v9;
                                    v44 = v11;
                                    if(v18 == 2) {
                                        zzgyr zzgyr4 = (zzgyr)zzgyd1;
                                        v3 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                        int v80 = zzgvx3.zza + v3;
                                        while(v3 < v80) {
                                            v3 = zzgvy.zzk(arr_b, v3, zzgvx3);
                                            zzgyr4.zzg(zzgvx3.zzb >>> 1 ^ -(1L & zzgvx3.zzb));
                                        }
                                        if(v3 != v80) {
                                            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    label_673:
                                        v17 = v12;
                                        unsafe4 = unsafe0;
                                    }
                                    else if(v18 == 0) {
                                        zzgyr zzgyr5 = (zzgyr)zzgyd1;
                                        v3 = zzgvy.zzk(arr_b, v10, zzgvx3);
                                        zzgyr5.zzg(zzgvx3.zzb >>> 1 ^ -(1L & zzgvx3.zzb));
                                        while(v3 < v1) {
                                            int v81 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            v3 = zzgvy.zzk(arr_b, v81, zzgvx3);
                                            zzgyr5.zzg(zzgvx3.zzb >>> 1 ^ -(1L & zzgvx3.zzb));
                                        }
                                        v17 = v12;
                                        unsafe4 = unsafe0;
                                    }
                                    else {
                                        v17 = v12;
                                        unsafe4 = unsafe0;
                                        v3 = v10;
                                    }
                                    break;
                                }
                                default: {
                                    if(v18 == 3) {
                                        int v43 = v9 & -8 | 4;
                                        zzgzv zzgzv0 = this.zzx(v12);
                                        v44 = v11;
                                        v45 = v9;
                                        v3 = zzgvy.zzc(zzgzv0, arr_b, v10, v1, v43, zzgvx0);
                                        zzgyd1.add(zzgvx3.zzc);
                                        while(v3 < v1) {
                                            int v46 = zzgvy.zzh(arr_b, v3, zzgvx3);
                                            if(v45 != zzgvx3.zza) {
                                                break;
                                            }
                                            v3 = zzgvy.zzc(zzgzv0, arr_b, v46, v1, v43, zzgvx0);
                                            zzgyd1.add(zzgvx3.zzc);
                                        }
                                        goto label_673;
                                    }
                                    else {
                                        v45 = v9;
                                        v17 = v12;
                                        v44 = v11;
                                        unsafe4 = unsafe0;
                                        v3 = v10;
                                        break;
                                    }
                                    goto label_337;
                                }
                            }
                            if(v3 == v10) {
                                object2 = object0;
                                v15 = v3;
                                v13 = v45;
                                v14 = v44;
                                goto label_728;
                            }
                            else {
                                v4 = v44;
                                unsafe0 = unsafe4;
                                zzgvx2 = zzgvx3;
                                v7 = v37;
                                v8 = v16;
                                v5 = v17;
                                v6 = v45;
                                object1 = object0;
                                continue;
                            }
                            goto label_707;
                        }
                        else {
                        label_707:
                            v40 = v11;
                            unsafe4 = unsafe0;
                            if(v20 == 50) {
                                if(v18 == 2) {
                                    Unsafe unsafe6 = zzgzf.zzb;
                                    Object object6 = this.zzz(v12);
                                    Object object7 = unsafe6.getObject(object0, v21);
                                    if(zzgyx.zza(object7)) {
                                        zzgyw zzgyw0 = zzgyw.zza().zzb();
                                        zzgyx.zzb(zzgyw0, object7);
                                        unsafe6.putObject(object0, v21, zzgyw0);
                                    }
                                    zzgyv zzgyv0 = (zzgyv)object6;
                                    throw null;
                                }
                                object5 = object0;
                                v38 = v9;
                                v39 = v12;
                            label_723:
                                object2 = object5;
                                v17 = v39;
                                v14 = v40;
                                v13 = v38;
                                v15 = v10;
                            label_728:
                                unsafe1 = unsafe4;
                                v7 = v37;
                            }
                            else {
                                unsafe1 = unsafe4;
                                Unsafe unsafe7 = zzgzf.zzb;
                                long v82 = (long)(arr_v[v12 + 2] & 0xFFFFF);
                                switch(v20) {
                                    case 51: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 1) {
                                            v83 = v10 + 8;
                                            unsafe7.putObject(object2, v21, Double.longBitsToDouble(zzgvy.zzn(arr_b, v10)));
                                            unsafe7.putInt(object2, v82, v14);
                                            goto label_931;
                                        }
                                        break;
                                    }
                                    case 52: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 5) {
                                            v83 = v10 + 4;
                                            unsafe7.putObject(object2, v21, Float.intBitsToFloat(zzgvy.zzb(arr_b, v10)));
                                            unsafe7.putInt(object2, v82, v14);
                                            goto label_931;
                                        }
                                        break;
                                    }
                                    case 53: 
                                    case 54: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 0) {
                                            v83 = zzgvy.zzk(arr_b, v10, zzgvx3);
                                            unsafe7.putObject(object2, v21, zzgvx3.zzb);
                                            unsafe7.putInt(object2, v82, v14);
                                            goto label_931;
                                        }
                                        break;
                                    }
                                    case 58: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 0) {
                                            v83 = zzgvy.zzk(arr_b, v10, zzgvx3);
                                            unsafe7.putObject(object2, v21, Boolean.valueOf(zzgvx3.zzb != 0L));
                                            unsafe7.putInt(object2, v82, v14);
                                            goto label_931;
                                        }
                                        break;
                                    }
                                    case 59: {
                                        zzgvx3 = zzgvx0;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 2) {
                                            int v84 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                            int v85 = zzgvx3.zza;
                                            if(v85 == 0) {
                                                v17 = v12;
                                                unsafe7.putObject(object2, v21, "");
                                            }
                                            else {
                                                v17 = v12;
                                                int v86 = v84 + v85;
                                                if((v19 & 0x20000000) != 0 && !zzhat.zzi(arr_b, v84, v86)) {
                                                    throw new zzgyg("Protocol message had invalid UTF-8.");
                                                }
                                                unsafe7.putObject(object2, v21, new String(arr_b, v84, v85, zzgye.zza));
                                                v84 = v86;
                                            }
                                            unsafe7.putInt(object2, v82, v14);
                                            v83 = v84;
                                            goto label_931;
                                        }
                                        else {
                                            v17 = v12;
                                            break;
                                        }
                                        goto label_833;
                                    }
                                    case 60: {
                                    label_833:
                                        v13 = v9;
                                        if(v18 == 2) {
                                            Object object8 = this.zzB(object0, v40, v12);
                                            zzgvx3 = zzgvx0;
                                            int v87 = zzgvy.zzm(object8, this.zzx(v12), arr_b, v10, v1, zzgvx0);
                                            this.zzK(object0, v40, v12, object8);
                                            v83 = v87;
                                            v17 = v12;
                                            v14 = v40;
                                            object2 = object0;
                                            goto label_931;
                                        }
                                        else {
                                            zzgvx3 = zzgvx0;
                                            v14 = v40;
                                            object2 = object0;
                                            v17 = v12;
                                            break;
                                        }
                                        goto label_849;
                                    }
                                    case 61: {
                                    label_849:
                                        v88 = v40;
                                        unsafe8 = unsafe1;
                                        v13 = v9;
                                        if(v18 == 2) {
                                            v89 = zzgvy.zza(arr_b, v10, zzgvx0);
                                            unsafe7.putObject(object0, v21, zzgvx0.zzc);
                                            unsafe7.putInt(object0, v82, v88);
                                            v17 = v12;
                                            goto label_902;
                                        }
                                        else {
                                            v14 = v88;
                                            v17 = v12;
                                            unsafe1 = unsafe8;
                                            zzgvx3 = zzgvx0;
                                            object2 = object0;
                                            break;
                                        }
                                        goto label_861;
                                    }
                                    case 55: 
                                    case 62: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 0) {
                                            v83 = zzgvy.zzh(arr_b, v10, zzgvx3);
                                            unsafe7.putObject(object2, v21, zzgvx3.zza);
                                            unsafe7.putInt(object2, v82, v14);
                                            goto label_931;
                                        }
                                        break;
                                    }
                                    case 0x3F: {
                                    label_861:
                                        v88 = v40;
                                        unsafe8 = unsafe1;
                                        v90 = v9;
                                        if(v18 == 0) {
                                            v89 = zzgvy.zzh(arr_b, v10, zzgvx0);
                                            int v91 = zzgvx0.zza;
                                            zzgxx zzgxx1 = this.zzw(v12);
                                            if(zzgxx1 != null && !zzgxx1.zza(v91)) {
                                                v13 = v90;
                                                zzgzf.zzd(object0).zzj(v13, ((long)v91));
                                            }
                                            else {
                                                v13 = v90;
                                                unsafe7.putObject(object0, v21, v91);
                                                unsafe7.putInt(object0, v82, v88);
                                            }
                                            v17 = v12;
                                            goto label_902;
                                        }
                                        goto label_887;
                                    }
                                    case 57: 
                                    case 0x40: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 5) {
                                            v83 = v10 + 4;
                                            unsafe7.putObject(object2, v21, zzgvy.zzb(arr_b, v10));
                                            unsafe7.putInt(object2, v82, v14);
                                            goto label_931;
                                        }
                                        break;
                                    }
                                    case 56: 
                                    case 65: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                        if(v18 == 1) {
                                            v83 = v10 + 8;
                                            unsafe7.putObject(object2, v21, zzgvy.zzn(arr_b, v10));
                                            unsafe7.putInt(object2, v82, v14);
                                            goto label_931;
                                        }
                                        break;
                                    }
                                    case 66: {
                                        v88 = v40;
                                        unsafe8 = unsafe1;
                                        v90 = v9;
                                        if(v18 == 0) {
                                            v89 = zzgvy.zzh(arr_b, v10, zzgvx0);
                                            unsafe7.putObject(object0, v21, ((int)(zzgvx0.zza >>> 1 ^ -(zzgvx0.zza & 1))));
                                            unsafe7.putInt(object0, v82, v88);
                                            v17 = v12;
                                            v13 = v90;
                                            goto label_902;
                                        }
                                    label_887:
                                        v14 = v88;
                                        v17 = v12;
                                        v13 = v90;
                                        unsafe1 = unsafe8;
                                        zzgvx3 = zzgvx0;
                                        object2 = object0;
                                        break;
                                    }
                                    case 67: {
                                        v88 = v40;
                                        if(v18 == 0) {
                                            v89 = zzgvy.zzk(arr_b, v10, zzgvx0);
                                            unsafe8 = unsafe1;
                                            unsafe7.putObject(object0, v21, ((long)(zzgvx0.zzb >>> 1 ^ -(1L & zzgvx0.zzb))));
                                            unsafe7.putInt(object0, v82, v88);
                                            v17 = v12;
                                            v13 = v9;
                                        label_902:
                                            unsafe1 = unsafe8;
                                            zzgvx3 = zzgvx0;
                                            object2 = object0;
                                            v83 = v89;
                                            v14 = v88;
                                            goto label_931;
                                        }
                                        else {
                                            v14 = v88;
                                            zzgvx3 = zzgvx0;
                                            v17 = v12;
                                            object2 = object0;
                                            v13 = v9;
                                            break;
                                        }
                                        goto label_914;
                                    }
                                    case 68: {
                                    label_914:
                                        if(v18 == 3) {
                                            Object object9 = this.zzB(object0, v40, v12);
                                            int v92 = zzgvy.zzl(object9, this.zzx(v12), arr_b, v10, v1, v9 & -8 | 4, zzgvx0);
                                            this.zzK(object0, v40, v12, object9);
                                            v14 = v40;
                                            zzgvx3 = zzgvx0;
                                            v17 = v12;
                                            v83 = v92;
                                            v13 = v9;
                                            object2 = object0;
                                            goto label_931;
                                        }
                                        else {
                                            zzgvx3 = zzgvx0;
                                            object2 = object0;
                                            v17 = v12;
                                            v14 = v40;
                                            v13 = v9;
                                        }
                                        break;
                                    }
                                    default: {
                                        zzgvx3 = zzgvx0;
                                        v17 = v12;
                                        v14 = v40;
                                        v13 = v9;
                                        object2 = object0;
                                    }
                                }
                                v83 = v10;
                            label_931:
                                if(v83 == v10) {
                                    v15 = v83;
                                    v7 = v37;
                                }
                                else {
                                    v4 = v14;
                                    v3 = v83;
                                    object1 = object2;
                                    v6 = v13;
                                    zzgvx2 = zzgvx3;
                                    v7 = v37;
                                    v8 = v16;
                                    unsafe0 = unsafe1;
                                    v5 = v17;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            if(v13 != v2 || v2 == 0) {
                if(this.zzh) {
                    zzgxb zzgxb0 = zzgvx3.zzd;
                    if(zzgxb0 != zzgxb.zza) {
                        if(zzgxb0.zzc(this.zzg, v14) == null) {
                            v4 = v14;
                            object11 = object2;
                            v3 = zzgvy.zzg(v13, arr_b, v15, v1, zzgzf.zzd(object0), zzgvx0);
                            goto label_960;
                        }
                        zzgxn zzgxn0 = (zzgxn)object2;
                        throw null;
                    }
                }
                v4 = v14;
                object11 = object2;
                v3 = zzgvy.zzg(v13, arr_b, v15, v1, zzgzf.zzd(object0), zzgvx0);
            label_960:
                v6 = v13;
                object1 = object11;
                zzgvx2 = zzgvx3;
                v8 = v16;
                unsafe0 = unsafe1;
                v5 = v17;
                continue;
            }
            else {
                v93 = v15;
                object10 = object2;
                v6 = v13;
                v8 = v16;
            }
            break;
        }
        if(v8 != 0xFFFFF) {
            unsafe1.putInt(object10, ((long)v8), v7);
        }
        for(int v94 = this.zzk; v94 < this.zzl; ++v94) {
            this.zzy(object0, this.zzj[v94], null, this.zzm, object0);
        }
        if(v2 == 0) {
            if(v93 != v1) {
                throw new zzgyg("Failed to parse the message.");
            }
            return v93;
        }
        if(v93 > v1 || v6 != v2) {
            throw new zzgyg("Failed to parse the message.");
        }
        return v93;
    }

    static zzhai zzd(Object object0) {
        zzhai zzhai0 = ((zzgxr)object0).zzt;
        if(zzhai0 == zzhai.zzc()) {
            zzhai0 = zzhai.zzf();
            ((zzgxr)object0).zzt = zzhai0;
        }
        return zzhai0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final Object zze() {
        return ((zzgxr)this.zzg).zzbj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(Object object0) {
        if(zzgzf.zzQ(object0)) {
            if(object0 instanceof zzgxr) {
                ((zzgxr)object0).zzbT();
                ((zzgxr)object0).zzbS();
                ((zzgxr)object0).zzbV();
            }
            int[] arr_v = this.zzc;
            for(int v = 0; v < arr_v.length; v += 3) {
                int v1 = this.zzu(v);
                long v2 = (long)(0xFFFFF & v1);
                switch(v1 >>> 20 & 0xFF) {
                    case 9: 
                    case 17: {
                        if(this.zzN(object0, v)) {
                            this.zzx(v).zzf(zzgzf.zzb.getObject(object0, v2));
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
                        ((zzgyd)zzhao.zzh(object0, v2)).zzb();
                        break;
                    }
                    case 50: {
                        Unsafe unsafe0 = zzgzf.zzb;
                        Object object1 = unsafe0.getObject(object0, v2);
                        if(object1 != null) {
                            ((zzgyw)object1).zzc();
                            unsafe0.putObject(object0, v2, object1);
                        }
                        break;
                    }
                    case 60: 
                    case 68: {
                        if(this.zzR(object0, this.zzc[v], v)) {
                            this.zzx(v).zzf(zzgzf.zzb.getObject(object0, v2));
                        }
                    }
                }
            }
            this.zzm.zzi(object0);
            if(this.zzh) {
                this.zzn.zza(object0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Object object0, Object object1) {
        zzgzf.zzD(object0);
        object1.getClass();
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzu(v);
            int v2 = this.zzc[v];
            long v3 = (long)(0xFFFFF & v1);
            switch(v1 >>> 20 & 0xFF) {
                case 0: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzr(object0, v3, zzhao.zzb(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 1: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzs(object0, v3, zzhao.zzc(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 2: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzu(object0, v3, zzhao.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 3: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzu(object0, v3, zzhao.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 4: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzt(object0, v3, zzhao.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 5: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzu(object0, v3, zzhao.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 6: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzt(object0, v3, zzhao.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 7: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzp(object0, v3, zzhao.zzz(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 8: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzv(object0, v3, zzhao.zzh(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 9: {
                    this.zzE(object0, object1, v);
                    break;
                }
                case 10: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzv(object0, v3, zzhao.zzh(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 11: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzt(object0, v3, zzhao.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 12: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzt(object0, v3, zzhao.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 13: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzt(object0, v3, zzhao.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 14: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzu(object0, v3, zzhao.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 15: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzt(object0, v3, zzhao.zzd(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 16: {
                    if(this.zzN(object1, v)) {
                        zzhao.zzu(object0, v3, zzhao.zzf(object1, v3));
                        this.zzH(object0, v);
                    }
                    break;
                }
                case 17: {
                    this.zzE(object0, object1, v);
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
                    zzgyd zzgyd0 = (zzgyd)zzhao.zzh(object0, v3);
                    zzgyd zzgyd1 = (zzgyd)zzhao.zzh(object1, v3);
                    int v4 = zzgyd0.size();
                    int v5 = zzgyd1.size();
                    if(v4 > 0 && v5 > 0) {
                        if(!zzgyd0.zzc()) {
                            zzgyd0 = zzgyd0.zzf(v5 + v4);
                        }
                        zzgyd0.addAll(zzgyd1);
                    }
                    if(v4 > 0) {
                        zzgyd1 = zzgyd0;
                    }
                    zzhao.zzv(object0, v3, zzgyd1);
                    break;
                }
                case 50: {
                    zzhao.zzv(object0, v3, zzgyx.zzb(zzhao.zzh(object0, v3), zzhao.zzh(object1, v3)));
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
                    if(this.zzR(object1, v2, v)) {
                        zzhao.zzv(object0, v3, zzhao.zzh(object1, v3));
                        this.zzI(object0, v2, v);
                    }
                    break;
                }
                case 60: {
                    this.zzF(object0, object1, v);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.zzR(object1, v2, v)) {
                        zzhao.zzv(object0, v3, zzhao.zzh(object1, v3));
                        this.zzI(object0, v2, v);
                    }
                    break;
                }
                case 68: {
                    this.zzF(object0, object1, v);
                }
            }
        }
        zzgzx.zzq(this.zzm, object0, object1);
        if(this.zzh) {
            zzgzx.zzp(this.zzn, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzh(Object object0, zzgzp zzgzp0, zzgxb zzgxb0) throws IOException {
        int v4;
        int v3;
        int v1;
        int v;
        zzgxb0.getClass();
        zzgzf.zzD(object0);
        zzhah zzhah0 = this.zzm;
        Object object1 = null;
    alab1:
        while(true) {
            while(true) {
                try {
                    while(true) {
                    label_4:
                        v = zzgzp0.zzc();
                        v1 = this.zzq(v);
                        if(v1 >= 0) {
                            goto label_26;
                        }
                        if(v == 0x7FFFFFFF) {
                            goto label_20;
                        }
                        if((this.zzh ? zzgxb0.zzc(this.zzg, v) : null) != null) {
                            zzgxn zzgxn0 = (zzgxn)object0;
                            throw null;
                        }
                        if(object1 == null) {
                            object1 = zzhah0.zza(object0);
                        }
                        if(!zzhah0.zzk(object1, zzgzp0, 0)) {
                            break;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    goto label_259;
                }
                for(int v2 = this.zzk; v2 < this.zzl; ++v2) {
                    this.zzy(object0, this.zzj[v2], object1, zzhah0, object0);
                }
                break alab1;
                try {
                label_20:
                    v3 = this.zzk;
                }
                catch(Throwable throwable0) {
                    goto label_259;
                }
                while(v3 < this.zzl) {
                    this.zzy(object0, this.zzj[v3], object1, zzhah0, object0);
                    ++v3;
                }
                break alab1;
                try {
                label_26:
                    v4 = this.zzu(v1);
                    try {
                        switch(v4 >>> 20 & 0xFF) {
                            case 0: {
                                goto label_50;
                            }
                            case 1: {
                                goto label_53;
                            }
                            case 2: {
                                goto label_56;
                            }
                            case 3: {
                                goto label_59;
                            }
                            case 4: {
                                goto label_62;
                            }
                            case 5: {
                                goto label_65;
                            }
                            case 6: {
                                goto label_68;
                            }
                            case 7: {
                                goto label_71;
                            }
                            case 8: {
                                goto label_74;
                            }
                            case 9: {
                                goto label_77;
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
                                goto label_111;
                            }
                            case 19: {
                                goto label_113;
                            }
                            case 20: {
                                goto label_115;
                            }
                            case 21: {
                                goto label_117;
                            }
                            case 22: {
                                goto label_119;
                            }
                            case 23: {
                                goto label_121;
                            }
                            case 24: {
                                goto label_123;
                            }
                            case 25: {
                                goto label_125;
                            }
                            case 26: {
                                goto label_127;
                            }
                            case 27: {
                                goto label_132;
                            }
                            case 28: {
                                goto label_135;
                            }
                            case 29: {
                                goto label_137;
                            }
                            case 30: {
                                goto label_139;
                            }
                            case 0x1F: {
                                goto label_143;
                            }
                            case 0x20: {
                                goto label_145;
                            }
                            case 33: {
                                goto label_147;
                            }
                            case 34: {
                                goto label_149;
                            }
                            case 35: {
                                goto label_151;
                            }
                            case 36: {
                                goto label_153;
                            }
                            case 37: {
                                goto label_155;
                            }
                            case 38: {
                                goto label_157;
                            }
                            case 39: {
                                goto label_159;
                            }
                            case 40: {
                                goto label_161;
                            }
                            case 41: {
                                goto label_163;
                            }
                            case 42: {
                                goto label_165;
                            }
                            case 43: {
                                goto label_167;
                            }
                            case 44: {
                                goto label_169;
                            }
                            case 45: {
                                goto label_173;
                            }
                            case 46: {
                                goto label_175;
                            }
                            case 0x2F: {
                                goto label_177;
                            }
                            case 0x30: {
                                goto label_179;
                            }
                            case 49: {
                                goto label_181;
                            }
                            case 50: {
                                goto label_29;
                            }
                            case 51: {
                                goto label_184;
                            }
                            case 52: {
                                goto label_187;
                            }
                            case 53: {
                                goto label_190;
                            }
                            case 54: {
                                goto label_193;
                            }
                            case 55: {
                                goto label_196;
                            }
                            case 56: {
                                goto label_199;
                            }
                            case 57: {
                                goto label_202;
                            }
                            case 58: {
                                goto label_205;
                            }
                            case 59: {
                                goto label_208;
                            }
                            case 60: {
                                goto label_211;
                            }
                            case 61: {
                                goto label_215;
                            }
                            case 62: {
                                goto label_218;
                            }
                            case 0x3F: {
                                goto label_221;
                            }
                            case 0x40: {
                                goto label_229;
                            }
                            case 65: {
                                goto label_232;
                            }
                            case 66: {
                                goto label_235;
                            }
                            case 67: {
                                goto label_238;
                            }
                            case 68: {
                                goto label_241;
                            }
                        }
                    }
                    catch(zzgyf unused_ex) {
                        goto label_245;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_259;
                }
                goto label_41;
                try {
                label_29:
                    Object object2 = this.zzz(v1);
                    long v5 = (long)(this.zzu(v1) & 0xFFFFF);
                    zzgyw zzgyw0 = zzhao.zzh(object0, v5);
                    if(zzgyw0 == null) {
                        zzhao.zzv(object0, v5, zzgyw.zza().zzb());
                    }
                    else if(zzgyx.zza(zzgyw0)) {
                        zzgyw zzgyw1 = zzgyw.zza().zzb();
                        zzgyx.zzb(zzgyw1, zzgyw0);
                        zzhao.zzv(object0, v5, zzgyw1);
                    }
                    zzgyv zzgyv0 = (zzgyv)object2;
                    throw null;
                label_41:
                    if(object1 == null) {
                        object1 = zzhah0.zza(object0);
                    }
                    if(zzhah0.zzk(object1, zzgzp0, 0)) {
                        goto label_4;
                    }
                    break;
                }
                catch(zzgyf unused_ex) {
                    goto label_245;
                }
                catch(Throwable throwable0) {
                    goto label_259;
                }
            }
            for(int v6 = this.zzk; v6 < this.zzl; ++v6) {
                this.zzy(object0, this.zzj[v6], object1, zzhah0, object0);
            }
            break;
            try {
                try {
                label_50:
                    zzhao.zzr(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zza());
                    this.zzH(object0, v1);
                    goto label_4;
                label_53:
                    zzhao.zzs(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzb());
                    this.zzH(object0, v1);
                    goto label_4;
                label_56:
                    zzhao.zzu(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzl());
                    this.zzH(object0, v1);
                    goto label_4;
                label_59:
                    zzhao.zzu(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzo());
                    this.zzH(object0, v1);
                    goto label_4;
                label_62:
                    zzhao.zzt(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzg());
                    this.zzH(object0, v1);
                    goto label_4;
                label_65:
                    zzhao.zzu(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzk());
                    this.zzH(object0, v1);
                    goto label_4;
                label_68:
                    zzhao.zzt(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzf());
                    this.zzH(object0, v1);
                    goto label_4;
                label_71:
                    zzhao.zzp(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzN());
                    this.zzH(object0, v1);
                    goto label_4;
                label_74:
                    this.zzG(object0, v4, zzgzp0);
                    this.zzH(object0, v1);
                    goto label_4;
                label_77:
                    zzgzc zzgzc0 = (zzgzc)this.zzA(object0, v1);
                    zzgzp0.zzu(zzgzc0, this.zzx(v1), zzgxb0);
                    this.zzJ(object0, v1, zzgzc0);
                    goto label_4;
                label_81:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzp());
                    this.zzH(object0, v1);
                    goto label_4;
                label_84:
                    zzhao.zzt(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzj());
                    this.zzH(object0, v1);
                    goto label_4;
                label_87:
                    int v7 = zzgzp0.zze();
                    zzgxx zzgxx0 = this.zzw(v1);
                    if(zzgxx0 == null || zzgxx0.zza(v7)) {
                        zzhao.zzt(object0, ((long)(v4 & 0xFFFFF)), v7);
                        this.zzH(object0, v1);
                    }
                    else {
                        object1 = zzgzx.zzo(object0, v, v7, object1, zzhah0);
                    }
                    goto label_4;
                label_95:
                    zzhao.zzt(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzh());
                    this.zzH(object0, v1);
                    goto label_4;
                label_98:
                    zzhao.zzu(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzm());
                    this.zzH(object0, v1);
                    goto label_4;
                label_101:
                    zzhao.zzt(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzi());
                    this.zzH(object0, v1);
                    goto label_4;
                label_104:
                    zzhao.zzu(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzn());
                    this.zzH(object0, v1);
                    goto label_4;
                label_107:
                    zzgzc zzgzc1 = (zzgzc)this.zzA(object0, v1);
                    zzgzp0.zzt(zzgzc1, this.zzx(v1), zzgxb0);
                    this.zzJ(object0, v1, zzgzc1);
                    goto label_4;
                label_111:
                    zzgzp0.zzx(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_113:
                    zzgzp0.zzB(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_115:
                    zzgzp0.zzE(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_117:
                    zzgzp0.zzM(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_119:
                    zzgzp0.zzD(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_121:
                    zzgzp0.zzA(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_123:
                    zzgzp0.zzz(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_125:
                    zzgzp0.zzv(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_127:
                    if(zzgzf.zzM(v4)) {
                        ((zzgwq)zzgzp0).zzK(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))), true);
                    }
                    else {
                        ((zzgwq)zzgzp0).zzK(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))), false);
                    }
                    goto label_4;
                label_132:
                    zzgzv zzgzv0 = this.zzx(v1);
                    zzgzp0.zzF(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))), zzgzv0, zzgxb0);
                    goto label_4;
                label_135:
                    zzgzp0.zzw(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_137:
                    zzgzp0.zzL(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_139:
                    List list0 = zzgyp.zza(object0, ((long)(v4 & 0xFFFFF)));
                    zzgzp0.zzy(list0);
                    object1 = zzgzx.zzn(object0, v, list0, this.zzw(v1), object1, zzhah0);
                    goto label_4;
                label_143:
                    zzgzp0.zzG(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_145:
                    zzgzp0.zzH(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_147:
                    zzgzp0.zzI(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_149:
                    zzgzp0.zzJ(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_151:
                    zzgzp0.zzx(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_153:
                    zzgzp0.zzB(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_155:
                    zzgzp0.zzE(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_157:
                    zzgzp0.zzM(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_159:
                    zzgzp0.zzD(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_161:
                    zzgzp0.zzA(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_163:
                    zzgzp0.zzz(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_165:
                    zzgzp0.zzv(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_167:
                    zzgzp0.zzL(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_169:
                    List list1 = zzgyp.zza(object0, ((long)(v4 & 0xFFFFF)));
                    zzgzp0.zzy(list1);
                    object1 = zzgzx.zzn(object0, v, list1, this.zzw(v1), object1, zzhah0);
                    goto label_4;
                label_173:
                    zzgzp0.zzG(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_175:
                    zzgzp0.zzH(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_177:
                    zzgzp0.zzI(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_179:
                    zzgzp0.zzJ(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))));
                    goto label_4;
                label_181:
                    zzgzv zzgzv1 = this.zzx(v1);
                    zzgzp0.zzC(zzgyp.zza(object0, ((long)(v4 & 0xFFFFF))), zzgzv1, zzgxb0);
                    goto label_4;
                label_184:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zza());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_187:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzb());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_190:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzl());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_193:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzo());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_196:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzg());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_199:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzk());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_202:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzf());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_205:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), Boolean.valueOf(zzgzp0.zzN()));
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_208:
                    this.zzG(object0, v4, zzgzp0);
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_211:
                    zzgzc zzgzc2 = (zzgzc)this.zzB(object0, v, v1);
                    zzgzp0.zzu(zzgzc2, this.zzx(v1), zzgxb0);
                    this.zzK(object0, v, v1, zzgzc2);
                    goto label_4;
                label_215:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzp());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_218:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzj());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_221:
                    int v8 = zzgzp0.zze();
                    zzgxx zzgxx1 = this.zzw(v1);
                    if(zzgxx1 == null || zzgxx1.zza(v8)) {
                        zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), v8);
                        this.zzI(object0, v, v1);
                    }
                    else {
                        object1 = zzgzx.zzo(object0, v, v8, object1, zzhah0);
                    }
                    goto label_4;
                label_229:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzh());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_232:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzm());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_235:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzi());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_238:
                    zzhao.zzv(object0, ((long)(v4 & 0xFFFFF)), zzgzp0.zzn());
                    this.zzI(object0, v, v1);
                    goto label_4;
                label_241:
                    zzgzc zzgzc3 = (zzgzc)this.zzB(object0, v, v1);
                    zzgzp0.zzt(zzgzc3, this.zzx(v1), zzgxb0);
                    this.zzK(object0, v, v1, zzgzc3);
                    goto label_4;
                }
                catch(zzgyf unused_ex) {
                }
            label_245:
                if(object1 == null) {
                    object1 = zzhah0.zza(object0);
                }
                if(zzhah0.zzk(object1, zzgzp0, 0)) {
                    continue;
                }
                else {
                    goto label_248;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_259;
            }
        label_248:
            for(int v9 = this.zzk; v9 < this.zzl; ++v9) {
                this.zzy(object0, this.zzj[v9], object1, zzhah0, object0);
            }
            break;
        }
        if(object1 != null) {
            zzhah0.zzj(object0, object1);
        }
        return;
    label_259:
        for(int v10 = this.zzk; v10 < this.zzl; ++v10) {
            this.zzy(object0, this.zzj[v10], object1, zzhah0, object0);
        }
        if(object1 != null) {
            zzhah0.zzj(object0, object1);
        }
        throw throwable0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzi(Object object0, byte[] arr_b, int v, int v1, zzgvx zzgvx0) throws IOException {
        this.zzc(object0, arr_b, v, v1, 0, zzgvx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final void zzj(Object object0, zzhaw zzhaw0) throws IOException {
        int[] arr_v2;
        Iterator iterator2;
        Map.Entry map$Entry2;
        int v9;
        int v8;
        Map.Entry map$Entry1;
        Iterator iterator1;
        Map.Entry map$Entry0;
        if(this.zzh) {
            zzgxg zzgxg0 = ((zzgxn)object0).zza;
            if(zzgxg0.zza.isEmpty()) {
                map$Entry0 = null;
                iterator1 = null;
            }
            else {
                Iterator iterator0 = zzgxg0.zzf();
                Object object1 = iterator0.next();
                map$Entry0 = (Map.Entry)object1;
                iterator1 = iterator0;
            }
        }
        else {
            map$Entry0 = null;
            iterator1 = null;
        }
        int[] arr_v = this.zzc;
        Unsafe unsafe0 = zzgzf.zzb;
        int v = 0xFFFFF;
        int v2 = 0;
        for(int v1 = 0; v2 < arr_v.length; v1 = v9) {
            int v3 = this.zzu(v2);
            int[] arr_v1 = this.zzc;
            int v4 = v3 >>> 20 & 0xFF;
            int v5 = arr_v1[v2];
            if(v4 <= 17) {
                int v6 = arr_v1[v2 + 2];
                int v7 = v6 & 0xFFFFF;
                if(v7 == v) {
                    map$Entry1 = map$Entry0;
                }
                else {
                    if(v7 == 0xFFFFF) {
                        map$Entry1 = map$Entry0;
                        v1 = 0;
                    }
                    else {
                        map$Entry1 = map$Entry0;
                        v1 = unsafe0.getInt(object0, ((long)v7));
                    }
                    v = v7;
                }
                v8 = 1 << (v6 >>> 20);
                v9 = v1;
                map$Entry2 = map$Entry1;
            }
            else {
                v9 = v1;
                map$Entry2 = map$Entry0;
                v8 = 0;
            }
            while(map$Entry2 != null && ((zzgxo)map$Entry2.getKey()).zza <= v5) {
                this.zzn.zzb(zzhaw0, map$Entry2);
                if(iterator1.hasNext()) {
                    Object object2 = iterator1.next();
                    map$Entry2 = (Map.Entry)object2;
                }
                else {
                    map$Entry2 = null;
                }
            }
            long v10 = (long)(v3 & 0xFFFFF);
            switch(v4) {
                case 0: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzf(v5, zzhao.zzb(object0, v10));
                    }
                    break;
                }
                case 1: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzo(v5, zzhao.zzc(object0, v10));
                    }
                    break;
                }
                case 2: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzt(v5, unsafe0.getLong(object0, v10));
                    }
                    break;
                }
                case 3: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzK(v5, unsafe0.getLong(object0, v10));
                    }
                    break;
                }
                case 4: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzr(v5, unsafe0.getInt(object0, v10));
                    }
                    break;
                }
                case 5: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzm(v5, unsafe0.getLong(object0, v10));
                    }
                    break;
                }
                case 6: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzk(v5, unsafe0.getInt(object0, v10));
                    }
                    break;
                }
                case 7: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzb(v5, zzhao.zzz(object0, v10));
                    }
                    break;
                }
                case 8: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzgzf.zzT(v5, unsafe0.getObject(object0, v10), zzhaw0);
                    }
                    break;
                }
                case 9: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzv(v5, unsafe0.getObject(object0, v10), this.zzx(v2));
                    }
                    break;
                }
                case 10: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzd(v5, ((zzgwj)unsafe0.getObject(object0, v10)));
                    }
                    break;
                }
                case 11: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzI(v5, unsafe0.getInt(object0, v10));
                    }
                    break;
                }
                case 12: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzi(v5, unsafe0.getInt(object0, v10));
                    }
                    break;
                }
                case 13: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzx(v5, unsafe0.getInt(object0, v10));
                    }
                    break;
                }
                case 14: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzz(v5, unsafe0.getLong(object0, v10));
                    }
                    break;
                }
                case 15: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzB(v5, unsafe0.getInt(object0, v10));
                    }
                    break;
                }
                case 16: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzD(v5, unsafe0.getLong(object0, v10));
                    }
                    break;
                }
                case 17: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    if(this.zzO(object0, v2, v, v9, v8)) {
                        zzhaw0.zzq(v5, unsafe0.getObject(object0, v10), this.zzx(v2));
                    }
                    break;
                }
                case 18: {
                    zzgzx.zzt(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 19: {
                    zzgzx.zzx(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 20: {
                    zzgzx.zzA(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 21: {
                    zzgzx.zzI(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 22: {
                    zzgzx.zzz(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 23: {
                    zzgzx.zzw(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 24: {
                    zzgzx.zzv(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 25: {
                    zzgzx.zzr(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 26: {
                    zzgzx.zzG(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 27: {
                    zzgzx.zzB(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, this.zzx(v2));
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 28: {
                    zzgzx.zzs(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 29: {
                    zzgzx.zzH(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 30: {
                    zzgzx.zzu(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 0x1F: {
                    zzgzx.zzC(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 0x20: {
                    zzgzx.zzD(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 33: {
                    zzgzx.zzE(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 34: {
                    zzgzx.zzF(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, false);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 35: {
                    zzgzx.zzt(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 36: {
                    zzgzx.zzx(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 37: {
                    zzgzx.zzA(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 38: {
                    zzgzx.zzI(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 39: {
                    zzgzx.zzz(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 40: {
                    zzgzx.zzw(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 41: {
                    zzgzx.zzv(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 42: {
                    zzgzx.zzr(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 43: {
                    zzgzx.zzH(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 44: {
                    zzgzx.zzu(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 45: {
                    zzgzx.zzC(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 46: {
                    zzgzx.zzD(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 0x2F: {
                    zzgzx.zzE(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 0x30: {
                    zzgzx.zzF(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, true);
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 49: {
                    zzgzx.zzy(this.zzc[v2], ((List)unsafe0.getObject(object0, v10)), zzhaw0, this.zzx(v2));
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 50: {
                    if(unsafe0.getObject(object0, v10) != null) {
                        zzgyv zzgyv0 = (zzgyv)this.zzz(v2);
                        throw null;
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 51: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzf(v5, zzgzf.zzn(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 52: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzo(v5, zzgzf.zzo(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 53: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzt(v5, zzgzf.zzv(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 54: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzK(v5, zzgzf.zzv(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 55: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzr(v5, zzgzf.zzp(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 56: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzm(v5, zzgzf.zzv(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 57: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzk(v5, zzgzf.zzp(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 58: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzb(v5, zzgzf.zzS(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 59: {
                    if(this.zzR(object0, v5, v2)) {
                        zzgzf.zzT(v5, unsafe0.getObject(object0, v10), zzhaw0);
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 60: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzv(v5, unsafe0.getObject(object0, v10), this.zzx(v2));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 61: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzd(v5, ((zzgwj)unsafe0.getObject(object0, v10)));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 62: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzI(v5, zzgzf.zzp(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 0x3F: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzi(v5, zzgzf.zzp(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 0x40: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzx(v5, zzgzf.zzp(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 65: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzz(v5, zzgzf.zzv(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 66: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzB(v5, zzgzf.zzp(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 67: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzD(v5, zzgzf.zzv(object0, v10));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                case 68: {
                    if(this.zzR(object0, v5, v2)) {
                        zzhaw0.zzq(v5, unsafe0.getObject(object0, v10), this.zzx(v2));
                    }
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
                default: {
                    iterator2 = iterator1;
                    arr_v2 = arr_v;
                    break;
                }
            }
            v2 += 3;
            map$Entry0 = map$Entry2;
            iterator1 = iterator2;
            arr_v = arr_v2;
        }
        while(map$Entry0 != null) {
            this.zzn.zzb(zzhaw0, map$Entry0);
            if(iterator1.hasNext()) {
                Object object3 = iterator1.next();
                map$Entry0 = (Map.Entry)object3;
            }
            else {
                map$Entry0 = null;
            }
        }
        ((zzgxr)object0).zzt.zzl(zzhaw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzk(Object object0, Object object1) {
        boolean z;
        int v = 0;
        while(v < this.zzc.length) {
            int v1 = this.zzu(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch(v1 >>> 20 & 0xFF) {
                case 0: {
                    if(this.zzL(object0, object1, v) && Double.doubleToLongBits(zzhao.zzb(object0, v2)) == Double.doubleToLongBits(zzhao.zzb(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 1: {
                    if(this.zzL(object0, object1, v) && Float.floatToIntBits(zzhao.zzc(object0, v2)) == Float.floatToIntBits(zzhao.zzc(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 2: {
                    if(this.zzL(object0, object1, v) && zzhao.zzf(object0, v2) == zzhao.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 3: {
                    if(this.zzL(object0, object1, v) && zzhao.zzf(object0, v2) == zzhao.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 4: {
                    if(this.zzL(object0, object1, v) && zzhao.zzd(object0, v2) == zzhao.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 5: {
                    if(this.zzL(object0, object1, v) && zzhao.zzf(object0, v2) == zzhao.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 6: {
                    if(this.zzL(object0, object1, v) && zzhao.zzd(object0, v2) == zzhao.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 7: {
                    if(this.zzL(object0, object1, v) && zzhao.zzz(object0, v2) == zzhao.zzz(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 8: {
                    if(this.zzL(object0, object1, v) && zzgzx.zzJ(zzhao.zzh(object0, v2), zzhao.zzh(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 9: {
                    if(this.zzL(object0, object1, v) && zzgzx.zzJ(zzhao.zzh(object0, v2), zzhao.zzh(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 10: {
                    if(this.zzL(object0, object1, v) && zzgzx.zzJ(zzhao.zzh(object0, v2), zzhao.zzh(object1, v2))) {
                        break;
                    }
                    return false;
                }
                case 11: {
                    if(this.zzL(object0, object1, v) && zzhao.zzd(object0, v2) == zzhao.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 12: {
                    if(this.zzL(object0, object1, v) && zzhao.zzd(object0, v2) == zzhao.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 13: {
                    if(this.zzL(object0, object1, v) && zzhao.zzd(object0, v2) == zzhao.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 14: {
                    if(this.zzL(object0, object1, v) && zzhao.zzf(object0, v2) == zzhao.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 15: {
                    if(this.zzL(object0, object1, v) && zzhao.zzd(object0, v2) == zzhao.zzd(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 16: {
                    if(this.zzL(object0, object1, v) && zzhao.zzf(object0, v2) == zzhao.zzf(object1, v2)) {
                        break;
                    }
                    return false;
                }
                case 17: {
                    if(this.zzL(object0, object1, v) && zzgzx.zzJ(zzhao.zzh(object0, v2), zzhao.zzh(object1, v2))) {
                        break;
                    }
                    return false;
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
                    z = zzgzx.zzJ(zzhao.zzh(object0, v2), zzhao.zzh(object1, v2));
                    goto label_45;
                }
                case 50: {
                    z = zzgzx.zzJ(zzhao.zzh(object0, v2), zzhao.zzh(object1, v2));
                label_45:
                    if(!z) {
                        return false;
                    }
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
                    int v3 = this.zzr(v);
                    if(zzhao.zzd(object0, ((long)(v3 & 0xFFFFF))) != zzhao.zzd(object1, ((long)(v3 & 0xFFFFF))) || !zzgzx.zzJ(zzhao.zzh(object0, v2), zzhao.zzh(object1, v2))) {
                        return false;
                    }
                }
            }
            v += 3;
        }
        if(!((zzgxr)object0).zzt.equals(((zzgxr)object1).zzt)) {
            return false;
        }
        return this.zzh ? ((zzgxn)object0).zza.equals(((zzgxn)object1).zza) : true;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzl(Object object0) {
        int v10;
        int v9;
        int v = 0xFFFFF;
        int v2 = 0;
        for(int v1 = 0; v2 < this.zzk; v1 = v9) {
            int v3 = this.zzj[v2];
            int v4 = this.zzc[v3];
            int v5 = this.zzu(v3);
            int v6 = this.zzc[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 == v) {
                v10 = v;
                v9 = v1;
            }
            else {
                if(v7 != 0xFFFFF) {
                    v1 = zzgzf.zzb.getInt(object0, ((long)v7));
                }
                v9 = v1;
                v10 = v7;
            }
            if((0x10000000 & v5) != 0 && !this.zzO(object0, v3, v10, v9, v8)) {
                return false;
            }
            switch(v5 >>> 20 & 0xFF) {
                case 9: 
                case 17: {
                    if(this.zzO(object0, v3, v10, v9, v8) && !zzgzf.zzP(object0, v5, this.zzx(v3))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)zzhao.zzh(object0, ((long)(v5 & 0xFFFFF)));
                    if(!list0.isEmpty()) {
                        zzgzv zzgzv0 = this.zzx(v3);
                        for(int v11 = 0; v11 < list0.size(); ++v11) {
                            if(!zzgzv0.zzl(list0.get(v11))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    if(!((zzgyw)zzhao.zzh(object0, ((long)(v5 & 0xFFFFF)))).isEmpty()) {
                        zzgyv zzgyv0 = (zzgyv)this.zzz(v3);
                        throw null;
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.zzR(object0, v4, v3) && !zzgzf.zzP(object0, v5, this.zzx(v3))) {
                        return false;
                    }
                }
            }
            ++v2;
            v = v10;
        }
        return !this.zzh || ((zzgxn)object0).zza.zzi();
    }

    static zzgzf zzm(Class class0, zzgyz zzgyz0, zzgzi zzgzi0, zzgyp zzgyp0, zzhah zzhah0, zzgxc zzgxc0, zzgyx zzgyx0) {
        int v97;
        Field field3;
        int v96;
        int v94;
        int v87;
        int v85;
        String s1;
        int v84;
        int v83;
        Class class2;
        zzgzo zzgzo1;
        int v82;
        int v81;
        int v80;
        Field field1;
        Field field0;
        int v77;
        int v76;
        int v75;
        int v69;
        int v63;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int[] arr_v;
        int v2;
        if(zzgyz0 instanceof zzgzo) {
            zzgzo zzgzo0 = (zzgzo)zzgyz0;
            String s = zzgzo0.zzd();
            int v = s.length();
            if(s.charAt(0) >= 0xD800) {
                for(int v1 = 1; true; v1 = v2) {
                    v2 = v1 + 1;
                    if(s.charAt(v1) < 0xD800) {
                        break;
                    }
                }
            }
            else {
                v2 = 1;
            }
            int v3 = v2 + 1;
            int v4 = s.charAt(v2);
            if(v4 >= 0xD800) {
                int v5 = v4 & 0x1FFF;
                int v6 = 13;
                int v7;
                while((v7 = s.charAt(v3)) >= 0xD800) {
                    v5 |= (v7 & 0x1FFF) << v6;
                    v6 += 13;
                    ++v3;
                }
                v4 = v5 | v7 << v6;
                ++v3;
            }
            if(v4 == 0) {
                arr_v = zzgzf.zza;
                v8 = 0;
                v9 = 0;
                v10 = 0;
                v11 = 0;
                v12 = 0;
                v13 = 0;
                v14 = 0;
            }
            else {
                int v15 = v3 + 1;
                int v16 = s.charAt(v3);
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
                int v26 = s.charAt(v20);
                if(v26 >= 0xD800) {
                    int v27 = v26 & 0x1FFF;
                    int v28 = 13;
                    int v29;
                    while((v29 = s.charAt(v25)) >= 0xD800) {
                        v27 |= (v29 & 0x1FFF) << v28;
                        v28 += 13;
                        ++v25;
                    }
                    v26 = v27 | v29 << v28;
                    ++v25;
                }
                int v30 = v25 + 1;
                int v31 = s.charAt(v25);
                if(v31 >= 0xD800) {
                    int v32 = v31 & 0x1FFF;
                    int v33 = 13;
                    int v34;
                    while((v34 = s.charAt(v30)) >= 0xD800) {
                        v32 |= (v34 & 0x1FFF) << v33;
                        v33 += 13;
                        ++v30;
                    }
                    v31 = v32 | v34 << v33;
                    ++v30;
                }
                int v35 = v30 + 1;
                v10 = s.charAt(v30);
                if(v10 >= 0xD800) {
                    int v36 = v10 & 0x1FFF;
                    int v37 = 13;
                    int v38;
                    while((v38 = s.charAt(v35)) >= 0xD800) {
                        v36 |= (v38 & 0x1FFF) << v37;
                        v37 += 13;
                        ++v35;
                    }
                    v10 = v36 | v38 << v37;
                    ++v35;
                }
                int v39 = v35 + 1;
                v11 = s.charAt(v35);
                if(v11 >= 0xD800) {
                    int v40 = v11 & 0x1FFF;
                    int v41 = 13;
                    int v42;
                    while((v42 = s.charAt(v39)) >= 0xD800) {
                        v40 |= (v42 & 0x1FFF) << v41;
                        v41 += 13;
                        ++v39;
                    }
                    v11 = v40 | v42 << v41;
                    ++v39;
                }
                int v43 = v39 + 1;
                int v44 = s.charAt(v39);
                if(v44 >= 0xD800) {
                    int v45 = v44 & 0x1FFF;
                    int v46 = 13;
                    int v47;
                    while((v47 = s.charAt(v43)) >= 0xD800) {
                        v45 |= (v47 & 0x1FFF) << v46;
                        v46 += 13;
                        ++v43;
                    }
                    v44 = v45 | v47 << v46;
                    ++v43;
                }
                int v48 = v43 + 1;
                int v49 = s.charAt(v43);
                if(v49 >= 0xD800) {
                    int v50 = v49 & 0x1FFF;
                    int v51 = 13;
                    int v52;
                    while((v52 = s.charAt(v48)) >= 0xD800) {
                        v50 |= (v52 & 0x1FFF) << v51;
                        v51 += 13;
                        ++v48;
                    }
                    v49 = v50 | v52 << v51;
                    ++v48;
                }
                v12 = v26;
                v14 = v49;
                v9 = v16 * 2 + v21;
                arr_v = new int[v49 + v11 + v44];
                v13 = v31;
                v8 = v16;
                v3 = v48;
            }
            Unsafe unsafe0 = zzgzf.zzb;
            Object[] arr_object = zzgzo0.zze();
            Class class1 = zzgzo0.zza().getClass();
            int v53 = v14 + v11;
            int[] arr_v1 = new int[v10 * 3];
            Object[] arr_object1 = new Object[v10 + v10];
            int v54 = v14;
            int v55 = v53;
            int v56 = 0;
            int v57 = 0;
            while(v3 < v) {
                int v58 = s.charAt(v3);
                if(v58 >= 0xD800) {
                    int v59 = v58 & 0x1FFF;
                    int v60 = v3 + 1;
                    int v61 = 13;
                    int v62;
                    while((v62 = s.charAt(v60)) >= 0xD800) {
                        v59 |= (v62 & 0x1FFF) << v61;
                        v61 += 13;
                        ++v60;
                    }
                    v58 = v59 | v62 << v61;
                    v63 = v60 + 1;
                }
                else {
                    v63 = v3 + 1;
                }
                int v64 = s.charAt(v63);
                if(v64 >= 0xD800) {
                    int v65 = v64 & 0x1FFF;
                    int v66 = v63 + 1;
                    int v67 = 13;
                    int v68;
                    while((v68 = s.charAt(v66)) >= 0xD800) {
                        v65 |= (v68 & 0x1FFF) << v67;
                        v67 += 13;
                        ++v66;
                    }
                    v64 = v65 | v68 << v67;
                    v69 = v66 + 1;
                }
                else {
                    v69 = v63 + 1;
                }
                if((v64 & 0x400) != 0) {
                    arr_v[v56] = v57;
                    ++v56;
                }
                int v70 = v64 & 0x800;
                if((v64 & 0xFF) >= 51) {
                    int v71 = s.charAt(v69);
                    if(v71 >= 0xD800) {
                        int v72 = v71 & 0x1FFF;
                        int v73 = v69 + 1;
                        int v74 = 13;
                        while(true) {
                            v75 = s.charAt(v73);
                            v76 = v12;
                            if(v75 < 0xD800) {
                                break;
                            }
                            v72 |= (v75 & 0x1FFF) << v74;
                            v74 += 13;
                            ++v73;
                            v12 = v76;
                        }
                        v71 = v72 | v75 << v74;
                        v77 = v73 + 1;
                    }
                    else {
                        v76 = v12;
                        v77 = v69 + 1;
                    }
                    switch((v64 & 0xFF) - 51) {
                        case 12: {
                            if(zzgzo0.zzc() == 1 || v70 != 0) {
                                arr_object1[v57 / 3 + v57 / 3 + 1] = arr_object[v9];
                                ++v9;
                            }
                            else {
                                v70 = 0;
                            }
                            break;
                        }
                        case 9: 
                        case 17: {
                            arr_object1[v57 / 3 + v57 / 3 + 1] = arr_object[v9];
                            ++v9;
                        }
                    }
                    int v78 = v71 + v71;
                    Object object0 = arr_object[v78];
                    if(object0 instanceof Field) {
                        field0 = (Field)object0;
                    }
                    else {
                        field0 = zzgzf.zzC(class1, ((String)object0));
                        arr_object[v78] = field0;
                    }
                    int v79 = (int)unsafe0.objectFieldOffset(field0);
                    Object object1 = arr_object[v78 + 1];
                    if(object1 instanceof Field) {
                        field1 = (Field)object1;
                    }
                    else {
                        field1 = zzgzf.zzC(class1, ((String)object1));
                        arr_object[v78 + 1] = field1;
                    }
                    v80 = (int)unsafe0.objectFieldOffset(field1);
                    v81 = v79;
                    v82 = v70;
                    zzgzo1 = zzgzo0;
                    class2 = class1;
                    v83 = v77;
                    v84 = v58;
                    s1 = s;
                    v85 = 0;
                }
                else {
                    v76 = v12;
                    int v86 = v9 + 1;
                    Field field2 = zzgzf.zzC(class1, ((String)arr_object[v9]));
                    v84 = v58;
                    switch(v64 & 0xFF) {
                        case 9: 
                        case 17: {
                            zzgzo1 = zzgzo0;
                            arr_object1[v57 / 3 + v57 / 3 + 1] = field2.getType();
                            s1 = s;
                            break;
                        }
                        case 27: {
                            zzgzo1 = zzgzo0;
                            v87 = v9 + 2;
                            arr_object1[v57 / 3 + v57 / 3 + 1] = arr_object[v86];
                            s1 = s;
                            v86 = v87;
                            break;
                        }
                        case 12: 
                        case 30: 
                        case 44: {
                            zzgzo1 = zzgzo0;
                            if(zzgzo0.zzc() == 1 || v70 != 0) {
                                v87 = v9 + 2;
                                arr_object1[v57 / 3 + v57 / 3 + 1] = arr_object[v86];
                                s1 = s;
                                v86 = v87;
                            }
                            else {
                                s1 = s;
                                v70 = 0;
                            }
                            break;
                        }
                        case 49: {
                            zzgzo1 = zzgzo0;
                            arr_object1[v57 / 3 + v57 / 3 + 1] = arr_object[v86];
                            s1 = s;
                            v86 = v9 + 2;
                            break;
                        }
                        case 50: {
                            arr_v[v54] = v57;
                            int v88 = v57 / 3 + v57 / 3;
                            arr_object1[v88] = arr_object[v86];
                            if(v70 == 0) {
                                v86 = v9 + 2;
                                ++v54;
                                v70 = 0;
                                zzgzo1 = zzgzo0;
                                s1 = s;
                            }
                            else {
                                v86 = v9 + 3;
                                arr_object1[v88 + 1] = arr_object[v9 + 2];
                                s1 = s;
                                ++v54;
                                zzgzo1 = zzgzo0;
                            }
                            break;
                        }
                        default: {
                            zzgzo1 = zzgzo0;
                            s1 = s;
                            break;
                        }
                    }
                    v81 = (int)unsafe0.objectFieldOffset(field2);
                    if((v64 & 0x1000) == 0 || (v64 & 0xFF) > 17) {
                        v96 = v70;
                        class2 = class1;
                        v97 = v69;
                        v85 = 0;
                        v80 = 0xFFFFF;
                    }
                    else {
                        int v89 = v69 + 1;
                        int v90 = s1.charAt(v69);
                        if(v90 >= 0xD800) {
                            int v91 = v90 & 0x1FFF;
                            int v92 = 13;
                            int v93;
                            while((v93 = s1.charAt(v89)) >= 0xD800) {
                                v91 |= (v93 & 0x1FFF) << v92;
                                v92 += 13;
                                ++v89;
                            }
                            v90 = v91 | v93 << v92;
                            v94 = v89 + 1;
                        }
                        else {
                            v94 = v89;
                        }
                        int v95 = v90 / 0x20 + v8 * 2;
                        Object object2 = arr_object[v95];
                        v96 = v70;
                        if(object2 instanceof Field) {
                            field3 = (Field)object2;
                        }
                        else {
                            field3 = zzgzf.zzC(class1, ((String)object2));
                            arr_object[v95] = field3;
                        }
                        class2 = class1;
                        v85 = v90 % 0x20;
                        v97 = v94;
                        v80 = (int)unsafe0.objectFieldOffset(field3);
                    }
                    if((v64 & 0xFF) < 18 || (v64 & 0xFF) > 49) {
                        v83 = v97;
                        v9 = v86;
                    }
                    else {
                        arr_v[v55] = v81;
                        ++v55;
                        v9 = v86;
                        v83 = v97;
                    }
                    v82 = v96;
                }
                arr_v1[v57] = v84;
                int v98 = v57 + 2;
                arr_v1[v57 + 1] = ((v64 & 0x200) == 0 ? 0 : 0x20000000) | ((v64 & 0x100) == 0 ? 0 : 0x10000000) | (v82 == 0 ? 0 : 0x80000000) | (v64 & 0xFF) << 20 | v81;
                v57 += 3;
                arr_v1[v98] = v85 << 20 | v80;
                s = s1;
                zzgzo0 = zzgzo1;
                v12 = v76;
                v3 = v83;
                class1 = class2;
            }
            return new zzgzf(arr_v1, arr_object1, v12, v13, zzgzo0.zza(), false, arr_v, v14, v53, zzgzi0, zzgyp0, zzhah0, zzgxc0, zzgyx0);
        }
        zzhae zzhae0 = (zzhae)zzgyz0;
        throw null;
    }

    private static double zzn(Object object0, long v) {
        return (double)(((Double)zzhao.zzh(object0, v)));
    }

    private static float zzo(Object object0, long v) {
        return (float)(((Float)zzhao.zzh(object0, v)));
    }

    private static int zzp(Object object0, long v) {
        return (int)(((Integer)zzhao.zzh(object0, v)));
    }

    private final int zzq(int v) {
        return v < this.zze || v > this.zzf ? -1 : this.zzs(v, 0);
    }

    private final int zzr(int v) {
        return this.zzc[v + 2];
    }

    private final int zzs(int v, int v1) {
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

    private static int zzt(int v) [...] // Inlined contents

    private final int zzu(int v) {
        return this.zzc[v + 1];
    }

    private static long zzv(Object object0, long v) {
        return (long)(((Long)zzhao.zzh(object0, v)));
    }

    private final zzgxx zzw(int v) {
        return (zzgxx)this.zzd[v / 3 * 2 + 1];
    }

    private final zzgzv zzx(int v) {
        Object[] arr_object = this.zzd;
        int v1 = v / 3 + v / 3;
        zzgzv zzgzv0 = (zzgzv)arr_object[v1];
        if(zzgzv0 != null) {
            return zzgzv0;
        }
        zzgzv zzgzv1 = zzgzm.zza().zzb(((Class)arr_object[v1 + 1]));
        this.zzd[v1] = zzgzv1;
        return zzgzv1;
    }

    private final Object zzy(Object object0, int v, Object object1, zzhah zzhah0, Object object2) {
        int v1 = this.zzc[v];
        Object object3 = zzhao.zzh(object0, ((long)(this.zzu(v) & 0xFFFFF)));
        if(object3 == null || this.zzw(v) == null) {
            return object1;
        }
        zzgyw zzgyw0 = (zzgyw)object3;
        zzgyv zzgyv0 = (zzgyv)this.zzz(v);
        throw null;
    }

    private final Object zzz(int v) {
        return this.zzd[v / 3 + v / 3];
    }
}

