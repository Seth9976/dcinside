package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import sun.misc.Unsafe;

final class zzlg implements zzlu {
    private static final int[] zza;
    private static final Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlk zzn;
    private final zzkm zzo;
    private final zzmk zzp;
    private final zzji zzq;
    private final zzkv zzr;

    static {
        zzlg.zza = new int[0];
        zzlg.zzb = zzml.zzb();
    }

    private zzlg(int[] arr_v, Object[] arr_object, int v, int v1, zzlc zzlc0, boolean z, int[] arr_v1, int v2, int v3, zzlk zzlk0, zzkm zzkm0, zzmk zzmk0, zzji zzji0, zzkv zzkv0) {
        this.zzc = arr_v;
        this.zzd = arr_object;
        this.zze = v;
        this.zzf = v1;
        this.zzi = zzlc0 instanceof zzjt;
        this.zzh = zzji0 != null && zzji0.zza(zzlc0);
        this.zzj = false;
        this.zzk = arr_v1;
        this.zzl = v2;
        this.zzm = v3;
        this.zzn = zzlk0;
        this.zzo = zzkm0;
        this.zzp = zzmk0;
        this.zzq = zzji0;
        this.zzg = zzlc0;
        this.zzr = zzkv0;
    }

    private static double zza(Object object0, long v) {
        return (double)(((Double)zzml.zze(object0, v)));
    }

    private final int zza(int v) {
        return v < this.zze || v > this.zzf ? -1 : this.zza(v, 0);
    }

    private final int zza(int v, int v1) {
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

    private static int zza(byte[] arr_b, int v, int v1, zzms zzms0, Class class0, zzij zzij0) throws IOException {
        int v2;
        switch(zzms0) {
            case 1: {
                v2 = zzig.zzd(arr_b, v, zzij0);
                zzij0.zzc = Boolean.valueOf(zzij0.zzb != 0L);
                return v2;
            }
            case 2: {
                return zzig.zza(arr_b, v, zzij0);
            }
            case 3: {
                zzij0.zzc = zzig.zza(arr_b, v);
                return v + 8;
            }
            case 4: 
            case 5: {
                zzij0.zzc = zzig.zzc(arr_b, v);
                return v + 4;
            }
            case 6: 
            case 7: {
                zzij0.zzc = zzig.zzd(arr_b, v);
                return v + 8;
            }
            case 8: {
                zzij0.zzc = zzig.zzb(arr_b, v);
                return v + 4;
            }
            case 9: 
            case 10: 
            case 11: {
                v2 = zzig.zzc(arr_b, v, zzij0);
                zzij0.zzc = zzij0.zza;
                return v2;
            }
            case 12: 
            case 13: {
                v2 = zzig.zzd(arr_b, v, zzij0);
                zzij0.zzc = zzij0.zzb;
                return v2;
            }
            case 14: {
                return zzig.zza(zzlq.zza().zza(class0), arr_b, v, v1, zzij0);
            }
            case 15: {
                v2 = zzig.zzc(arr_b, v, zzij0);
                zzij0.zzc = (int)(-(zzij0.zza & 1) ^ zzij0.zza >>> 1);
                return v2;
            }
            case 16: {
                v2 = zzig.zzd(arr_b, v, zzij0);
                zzij0.zzc = (long)(-(zzij0.zzb & 1L) ^ zzij0.zzb >>> 1);
                return v2;
            }
            case 17: {
                return zzig.zzb(arr_b, v, zzij0);
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    static zzlg zza(Class class0, zzla zzla0, zzlk zzlk0, zzkm zzkm0, zzmk zzmk0, zzji zzji0, zzkv zzkv0) {
        Field field3;
        int v84;
        int v83;
        int v82;
        zzls zzls1;
        int v81;
        int v80;
        int v79;
        String s1;
        int v78;
        Field field1;
        Field field0;
        int v70;
        int v69;
        int v68;
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
        if(zzla0 instanceof zzls) {
            zzls zzls0 = (zzls)zzla0;
            String s = zzls0.zzd();
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
                arr_v = zzlg.zza;
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
                v8 = v16;
                v14 = v49;
                v3 = v48;
                v13 = v31;
                v12 = v26;
                v9 = (v16 << 1) + v21;
                arr_v = new int[v49 + v11 + v44];
            }
            Unsafe unsafe0 = zzlg.zzb;
            Object[] arr_object = zzls0.zze();
            Class class1 = zzls0.zza().getClass();
            int[] arr_v1 = new int[v10 * 3];
            Object[] arr_object1 = new Object[v10 << 1];
            int v53 = v14 + v11;
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
                    while(true) {
                        v68 = s.charAt(v66);
                        v69 = v;
                        if(v68 < 0xD800) {
                            break;
                        }
                        v65 |= (v68 & 0x1FFF) << v67;
                        v67 += 13;
                        ++v66;
                        v = v69;
                    }
                    v64 = v65 | v68 << v67;
                    v70 = v66 + 1;
                }
                else {
                    v69 = v;
                    v70 = v63 + 1;
                }
                if((v64 & 0x400) != 0) {
                    arr_v[v57] = v56;
                    ++v57;
                }
                if((v64 & 0xFF) >= 51) {
                    int v71 = v70 + 1;
                    int v72 = s.charAt(v70);
                    if(v72 >= 0xD800) {
                        int v73 = v72 & 0x1FFF;
                        int v74 = 13;
                        int v75;
                        while((v75 = s.charAt(v71)) >= 0xD800) {
                            v73 |= (v75 & 0x1FFF) << v74;
                            v74 += 13;
                            ++v71;
                        }
                        v72 = v73 | v75 << v74;
                        ++v71;
                    }
                    switch((v64 & 0xFF) - 51) {
                        case 12: {
                            if(zzls0.zzb().equals(zzln.zza) || (v64 & 0x800) != 0) {
                                arr_object1[(v56 / 3 << 1) + 1] = arr_object[v9];
                                ++v9;
                            }
                            break;
                        }
                        case 9: 
                        case 17: {
                            arr_object1[(v56 / 3 << 1) + 1] = arr_object[v9];
                            ++v9;
                        }
                    }
                    Object object0 = arr_object[v72 << 1];
                    if(object0 instanceof Field) {
                        field0 = (Field)object0;
                    }
                    else {
                        field0 = zzlg.zza(class1, ((String)object0));
                        arr_object[v72 << 1] = field0;
                    }
                    int v76 = (int)unsafe0.objectFieldOffset(field0);
                    int v77 = (v72 << 1) + 1;
                    Object object1 = arr_object[v77];
                    if(object1 instanceof Field) {
                        field1 = (Field)object1;
                    }
                    else {
                        field1 = zzlg.zza(class1, ((String)object1));
                        arr_object[v77] = field1;
                    }
                    v78 = (int)unsafe0.objectFieldOffset(field1);
                    s1 = s;
                    v79 = v76;
                    v80 = v9;
                    v81 = 0;
                    zzls1 = zzls0;
                    v82 = v58;
                    v83 = v71;
                }
                else {
                    Field field2 = zzlg.zza(class1, ((String)arr_object[v9]));
                    v82 = v58;
                    switch(v64 & 0xFF) {
                        case 9: 
                        case 17: {
                            zzls1 = zzls0;
                            arr_object1[(v56 / 3 << 1) + 1] = field2.getType();
                            v84 = v9 + 1;
                            break;
                        }
                        case 12: 
                        case 30: 
                        case 44: {
                            zzls1 = zzls0;
                            if(zzls0.zzb() == zzln.zza || (v64 & 0x800) != 0) {
                                arr_object1[(v56 / 3 << 1) + 1] = arr_object[v9 + 1];
                                v84 = v9 + 2;
                                break;
                            }
                            v84 = v9 + 1;
                            break;
                        }
                        case 27: 
                        case 49: {
                            zzls1 = zzls0;
                            arr_object1[(v56 / 3 << 1) + 1] = arr_object[v9 + 1];
                            v84 = v9 + 2;
                            break;
                        }
                        case 50: {
                            arr_v[v54] = v56;
                            int v85 = v56 / 3 << 1;
                            arr_object1[v85] = arr_object[v9 + 1];
                            if((v64 & 0x800) == 0) {
                                ++v54;
                                zzls1 = zzls0;
                                v84 = v9 + 2;
                            }
                            else {
                                arr_object1[v85 + 1] = arr_object[v9 + 2];
                                zzls1 = zzls0;
                                ++v54;
                                v84 = v9 + 3;
                            }
                            break;
                        }
                        default: {
                            zzls1 = zzls0;
                            v84 = v9 + 1;
                            break;
                        }
                    }
                    v79 = (int)unsafe0.objectFieldOffset(field2);
                    if((v64 & 0x1000) == 0 || (v64 & 0xFF) > 17) {
                        v80 = v84;
                        s1 = s;
                        v83 = v70;
                        v81 = 0;
                        v78 = 0xFFFFF;
                    }
                    else {
                        v83 = v70 + 1;
                        int v86 = s.charAt(v70);
                        if(v86 >= 0xD800) {
                            int v87 = v86 & 0x1FFF;
                            int v88 = 13;
                            int v89;
                            while((v89 = s.charAt(v83)) >= 0xD800) {
                                v87 |= (v89 & 0x1FFF) << v88;
                                v88 += 13;
                                ++v83;
                            }
                            v86 = v87 | v89 << v88;
                            ++v83;
                        }
                        int v90 = (v8 << 1) + v86 / 0x20;
                        Object object2 = arr_object[v90];
                        if(object2 instanceof Field) {
                            field3 = (Field)object2;
                        }
                        else {
                            field3 = zzlg.zza(class1, ((String)object2));
                            arr_object[v90] = field3;
                        }
                        v80 = v84;
                        s1 = s;
                        v81 = v86 % 0x20;
                        v78 = (int)unsafe0.objectFieldOffset(field3);
                    }
                    if((v64 & 0xFF) >= 18 && (v64 & 0xFF) <= 49) {
                        arr_v[v55] = v79;
                        ++v55;
                    }
                }
                arr_v1[v56] = v82;
                int v91 = v56 + 2;
                arr_v1[v56 + 1] = ((v64 & 0x200) == 0 ? 0 : 0x20000000) | ((v64 & 0x100) == 0 ? 0 : 0x10000000) | ((v64 & 0x800) == 0 ? 0 : 0x80000000) | (v64 & 0xFF) << 20 | v79;
                v56 += 3;
                arr_v1[v91] = v81 << 20 | v78;
                s = s1;
                v9 = v80;
                zzls0 = zzls1;
                v = v69;
                v3 = v83;
            }
            return new zzlg(arr_v1, arr_object1, v12, v13, zzls0.zza(), false, arr_v, v14, v53, zzlk0, zzkm0, zzmk0, zzji0, zzkv0);
        }
        zzmd zzmd0 = (zzmd)zzla0;
        throw new NoSuchMethodError();
    }

    private final Object zza(int v, int v1, Map map0, zzjx zzjx0, Object object0, zzmk zzmk0, Object object1) {
        Object object2 = this.zzf(v);
        zzkt zzkt0 = this.zzr.zza(object2);
        Iterator iterator0 = map0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object3 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object3;
            if(!zzjx0.zza(((int)(((Integer)map$Entry0.getValue()))))) {
                if(object0 == null) {
                    object0 = zzmk0.zzc(object1);
                }
                zzit zzit0 = zzik.zzc(zzku.zza(zzkt0, map$Entry0.getKey(), map$Entry0.getValue()));
                zzjc zzjc0 = zzit0.zzb();
                try {
                    zzku.zza(zzjc0, zzkt0, map$Entry0.getKey(), map$Entry0.getValue());
                }
                catch(IOException iOException0) {
                    throw new RuntimeException(iOException0);
                }
                zzmk0.zza(object0, v1, zzit0.zza());
                iterator0.remove();
            }
        }
        return object0;
    }

    private final Object zza(Object object0, int v) {
        zzlu zzlu0 = this.zze(v);
        int v1 = this.zzc(v);
        if(!this.zzc(object0, v)) {
            return zzlu0.zza();
        }
        Object object1 = zzlg.zzb.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(zzlg.zzg(object1)) {
            return object1;
        }
        Object object2 = zzlu0.zza();
        if(object1 != null) {
            zzlu0.zza(object2, object1);
        }
        return object2;
    }

    private final Object zza(Object object0, int v, int v1) {
        zzlu zzlu0 = this.zze(v1);
        if(!this.zzc(object0, v, v1)) {
            return zzlu0.zza();
        }
        int v2 = this.zzc(v1);
        Object object1 = zzlg.zzb.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(zzlg.zzg(object1)) {
            return object1;
        }
        Object object2 = zzlu0.zza();
        if(object1 != null) {
            zzlu0.zza(object2, object1);
        }
        return object2;
    }

    private final Object zza(Object object0, int v, Object object1, zzmk zzmk0, Object object2) {
        int v1 = this.zzc[v];
        Object object3 = zzml.zze(object0, ((long)(this.zzc(v) & 0xFFFFF)));
        if(object3 == null) {
            return object1;
        }
        zzjx zzjx0 = this.zzd(v);
        return zzjx0 == null ? object1 : this.zza(v, v1, this.zzr.zze(object3), zzjx0, object1, zzmk0, object2);
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

    private static void zza(int v, Object object0, zznb zznb0) throws IOException {
        if(object0 instanceof String) {
            zznb0.zza(v, ((String)object0));
            return;
        }
        zznb0.zza(v, ((zzik)object0));
    }

    private static void zza(zzmk zzmk0, Object object0, zznb zznb0) throws IOException {
        zzmk0.zzb(zzmk0.zzd(object0), zznb0);
    }

    private final void zza(zznb zznb0, int v, Object object0, int v1) throws IOException {
        if(object0 != null) {
            Object object1 = this.zzf(v1);
            zznb0.zza(v, this.zzr.zza(object1), this.zzr.zzd(object0));
        }
    }

    private final void zza(Object object0, int v, int v1, Object object1) {
        int v2 = this.zzc(v1);
        zzlg.zzb.putObject(object0, ((long)(v2 & 0xFFFFF)), object1);
        this.zzb(object0, v, v1);
    }

    private final void zza(Object object0, int v, zzlr zzlr0) throws IOException {
        if(zzlg.zzg(v)) {
            zzml.zza(object0, ((long)(v & 0xFFFFF)), zzlr0.zzr());
            return;
        }
        if(this.zzi) {
            zzml.zza(object0, ((long)(v & 0xFFFFF)), zzlr0.zzq());
            return;
        }
        zzml.zza(object0, ((long)(v & 0xFFFFF)), zzlr0.zzp());
    }

    private final void zza(Object object0, int v, Object object1) {
        int v1 = this.zzc(v);
        zzlg.zzb.putObject(object0, ((long)(v1 & 0xFFFFF)), object1);
        this.zzb(object0, v);
    }

    private final void zza(Object object0, Object object1, int v) {
        if(!this.zzc(object1, v)) {
            return;
        }
        int v1 = this.zzc(v);
        Unsafe unsafe0 = zzlg.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v1 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1);
        }
        zzlu zzlu0 = this.zze(v);
        if(!this.zzc(object0, v)) {
            if(zzlg.zzg(object2)) {
                Object object3 = zzlu0.zza();
                zzlu0.zza(object3, object2);
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object2);
            }
            this.zzb(object0, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v1 & 0xFFFFF)));
        if(!zzlg.zzg(object4)) {
            Object object5 = zzlu0.zza();
            zzlu0.zza(object5, object4);
            unsafe0.putObject(object0, ((long)(v1 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzlu0.zza(object4, object2);
    }

    private final boolean zza(Object object0, int v, int v1, int v2, int v3) {
        return v1 == 0xFFFFF ? this.zzc(object0, v) : (v2 & v3) != 0;
    }

    private static boolean zza(Object object0, int v, zzlu zzlu0) {
        return zzlu0.zze(zzml.zze(object0, ((long)(v & 0xFFFFF))));
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object object0) {
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v11;
        int v10;
        int v9;
        Unsafe unsafe0 = zzlg.zzb;
        int v = 0xFFFFF;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; v2 < this.zzc.length; v1 = v10) {
            int v4 = this.zzc(v2);
            int v5 = (0xFF00000 & v4) >>> 20;
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
            long v12 = (long)(v4 & 0xFFFFF);
            boolean z = v5 < zzjn.zza.zza();
            switch(v5) {
                case 0: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzjc.zza(v6, 0.0);
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 1: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzjc.zza(v6, 0.0f);
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 2: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzjc.zzd(v6, unsafe0.getLong(object0, v12));
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 3: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzjc.zzg(v6, unsafe0.getLong(object0, v12));
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 4: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzjc.zzg(v6, unsafe0.getInt(object0, v12));
                        v3 += v13;
                        break;
                    }
                    break;
                }
                case 5: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v13 = zzjc.zzc(v6, 0L);
                        v3 += v13;
                    }
                    break;
                }
                case 6: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v3 += zzjc.zzf(v6, 0);
                    }
                    break;
                }
                case 7: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zzb(v6, true);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 8: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        Object object1 = unsafe0.getObject(object0, v12);
                        v14 = object1 instanceof zzik ? zzjc.zzc(v6, ((zzik)object1)) : zzjc.zzb(v6, ((String)object1));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 9: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzlw.zza(v6, unsafe0.getObject(object0, v12), this.zze(v2));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 10: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zzc(v6, ((zzik)unsafe0.getObject(object0, v12)));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 11: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zzj(v6, unsafe0.getInt(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 12: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zze(v6, unsafe0.getInt(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 13: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v15 = zzjc.zzh(v6, 0);
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 14: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zze(v6, 0L);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 15: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zzi(v6, unsafe0.getInt(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 16: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zzf(v6, unsafe0.getLong(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 17: {
                    if(this.zza(object0, v2, v9, v10, v11)) {
                        v14 = zzjc.zzb(v6, ((zzlc)unsafe0.getObject(object0, v12)), this.zze(v2));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 18: {
                    v14 = zzlw.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 19: {
                    v14 = zzlw.zzc(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 20: {
                    v14 = zzlw.zzf(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 21: {
                    v14 = zzlw.zzj(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 22: {
                    v14 = zzlw.zze(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 23: {
                    v14 = zzlw.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 24: {
                    v14 = zzlw.zzc(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 25: {
                    v14 = zzlw.zza(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 26: {
                    v14 = zzlw.zzb(v6, ((List)unsafe0.getObject(object0, v12)));
                    v3 += v14;
                    break;
                }
                case 27: {
                    v14 = zzlw.zzb(v6, ((List)unsafe0.getObject(object0, v12)), this.zze(v2));
                    v3 += v14;
                    break;
                }
                case 28: {
                    v14 = zzlw.zza(v6, ((List)unsafe0.getObject(object0, v12)));
                    v3 += v14;
                    break;
                }
                case 29: {
                    v14 = zzlw.zzi(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 30: {
                    v14 = zzlw.zzb(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 0x1F: {
                    v14 = zzlw.zzc(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 0x20: {
                    v14 = zzlw.zzd(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 33: {
                    v14 = zzlw.zzg(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 34: {
                    v14 = zzlw.zzh(v6, ((List)unsafe0.getObject(object0, v12)), false);
                    v3 += v14;
                    break;
                }
                case 35: {
                    v16 = zzlw.zzd(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 36: {
                    v16 = zzlw.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 37: {
                    v16 = zzlw.zzf(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 38: {
                    v16 = zzlw.zzj(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 39: {
                    v16 = zzlw.zze(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 40: {
                    v16 = zzlw.zzd(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 41: {
                    v16 = zzlw.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 42: {
                    v16 = zzlw.zza(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 43: {
                    v16 = zzlw.zzi(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 44: {
                    v16 = zzlw.zzb(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 45: {
                    v16 = zzlw.zzc(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 46: {
                    v16 = zzlw.zzd(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 0x2F: {
                    v16 = zzlw.zzg(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v17 = zzjc.zzi(v6);
                        v18 = zzjc.zzj(v16);
                        v15 = v17 + v18 + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 0x30: {
                    v16 = zzlw.zzh(((List)unsafe0.getObject(object0, v12)));
                    if(v16 > 0) {
                        v15 = zzjc.zzi(v6) + zzjc.zzj(v16) + v16;
                        v3 += v15;
                        break;
                    }
                    break;
                }
                case 49: {
                    v14 = zzlw.zza(v6, ((List)unsafe0.getObject(object0, v12)), this.zze(v2));
                    v3 += v14;
                    break;
                }
                case 50: {
                    Object object2 = unsafe0.getObject(object0, v12);
                    Object object3 = this.zzf(v2);
                    v14 = this.zzr.zza(v6, object2, object3);
                    v3 += v14;
                    break;
                }
                case 51: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zza(v6, 0.0);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 52: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zza(v6, 0.0f);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 53: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzd(v6, zzlg.zzd(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 54: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzg(v6, zzlg.zzd(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 55: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzg(v6, zzlg.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 56: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzc(v6, 0L);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 57: {
                    if(this.zzc(object0, v6, v2)) {
                        v15 = zzjc.zzf(v6, 0);
                        v3 += v15;
                    }
                    break;
                }
                case 58: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzb(v6, true);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 59: {
                    if(this.zzc(object0, v6, v2)) {
                        Object object4 = unsafe0.getObject(object0, v12);
                        v14 = object4 instanceof zzik ? zzjc.zzc(v6, ((zzik)object4)) : zzjc.zzb(v6, ((String)object4));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 60: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzlw.zza(v6, unsafe0.getObject(object0, v12), this.zze(v2));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 61: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzc(v6, ((zzik)unsafe0.getObject(object0, v12)));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 62: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzj(v6, zzlg.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zze(v6, zzlg.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 0x40: {
                    if(this.zzc(object0, v6, v2)) {
                        v3 += zzjc.zzh(v6, 0);
                    }
                    break;
                }
                case 65: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zze(v6, 0L);
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 66: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzi(v6, zzlg.zzc(object0, v12));
                        v3 += v14;
                        break;
                    }
                    break;
                }
                case 67: {
                    if(this.zzc(object0, v6, v2)) {
                        v14 = zzjc.zzf(v6, zzlg.zzd(object0, v12));
                        v3 += v14;
                    }
                    break;
                }
                case 68: {
                    if(this.zzc(object0, v6, v2)) {
                        v3 += zzjc.zzb(v6, ((zzlc)unsafe0.getObject(object0, v12)), this.zze(v2));
                    }
                }
            }
            v2 += 3;
            v = v9;
        }
        int v19 = 0;
        Object object5 = this.zzp.zzd(object0);
        int v20 = v3 + this.zzp.zza(object5);
        if(this.zzh) {
            zzjm zzjm0 = this.zzq.zza(object0);
            int v21 = zzjm0.zza.zza();
            for(int v22 = 0; v22 < v21; ++v22) {
                Map.Entry map$Entry0 = zzjm0.zza.zza(v22);
                v19 += zzjm.zza(((zzjo)map$Entry0.getKey()), map$Entry0.getValue());
            }
            for(Object object6: zzjm0.zza.zzb()) {
                v19 += zzjm.zza(((zzjo)((Map.Entry)object6).getKey()), ((Map.Entry)object6).getValue());
            }
            return v20 + v19;
        }
        return v20;
    }

    final int zza(Object object0, byte[] arr_b, int v, int v1, int v2, zzij zzij0) throws IOException {
        int v100;
        int v93;
        int v92;
        int v90;
        int v89;
        Unsafe unsafe10;
        int v87;
        int v86;
        Object object8;
        int v76;
        int v73;
        int v72;
        int v71;
        Unsafe unsafe8;
        int v70;
        int v69;
        int v51;
        Unsafe unsafe7;
        int v50;
        int v49;
        zzij zzij6;
        zzij zzij5;
        Unsafe unsafe6;
        int v40;
        int v39;
        int v38;
        Unsafe unsafe5;
        zzij zzij4;
        int v37;
        int v27;
        Unsafe unsafe2;
        int v31;
        int v28;
        zzij zzij2;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        Unsafe unsafe1;
        int v14;
        int v13;
        int v10;
        zzij zzij1 = zzij0;
        zzlg.zzf(object0);
        Unsafe unsafe0 = zzlg.zzb;
        int v3 = v;
        int v4 = -1;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0xFFFFF;
        while(true) {
            if(v3 >= v1) {
                unsafe1 = unsafe0;
                v100 = v3;
                break;
            }
            int v9 = arr_b[v3];
            if(v9 < 0) {
                v10 = zzig.zza(v9, arr_b, v3 + 1, zzij1);
                v9 = zzij1.zza;
            }
            else {
                v10 = v3 + 1;
            }
            int v11 = v9 >>> 3;
            int v12 = v9 & 7;
            if(v11 > v4) {
                v13 = v11 < this.zze || v11 > this.zzf ? -1 : this.zza(v11, v5 / 3);
            }
            else {
                v13 = this.zza(v11);
            }
            v5 = v13;
            if(v5 == -1) {
                v14 = v9;
                unsafe1 = unsafe0;
                v15 = v11;
                v16 = v10;
                v17 = v7;
                v18 = v8;
                v19 = 0;
                zzij2 = zzij1;
            }
            else {
                int[] arr_v = this.zzc;
                int v20 = arr_v[v5 + 1];
                int v21 = (v20 & 0xFF00000) >>> 20;
                int v22 = v20;
                long v23 = (long)(v20 & 0xFFFFF);
                if(v21 <= 17) {
                    int v24 = arr_v[v5 + 2];
                    int v25 = 1 << (v24 >>> 20);
                    int v26 = v24 & 0xFFFFF;
                    if(v26 == v8) {
                        v17 = v7;
                        v18 = v8;
                    }
                    else {
                        if(v8 != 0xFFFFF) {
                            unsafe0.putInt(object0, ((long)v8), v7);
                        }
                        v18 = v26;
                        v17 = v26 == 0xFFFFF ? 0 : unsafe0.getInt(object0, ((long)v26));
                    }
                    switch(v21) {
                        case 0: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 1) {
                                zzml.zza(object0, v23, zzig.zza(arr_b, v10));
                                v3 = v10 + 8;
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 1: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 5) {
                                zzml.zza(object0, v23, zzig.zzb(arr_b, v10));
                                v3 = v10 + 4;
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 0) {
                                int v29 = zzig.zzd(arr_b, v10, zzij0);
                                unsafe2.putLong(object0, v23, zzij0.zzb);
                                zzij1 = zzij0;
                                unsafe0 = unsafe2;
                                v4 = v27;
                                v8 = v18;
                                v7 = v17 | v25;
                                v3 = v29;
                                v6 = v28;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 0) {
                                v3 = zzig.zzd(arr_b, v10, zzij0);
                                zzml.zzc(object0, v23, zzij0.zzb != 0L);
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 8: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 2) {
                                if(zzlg.zzg(v22)) {
                                    v3 = zzig.zzb(arr_b, v10, zzij0);
                                }
                                else {
                                    v3 = zzig.zzc(arr_b, v10, zzij0);
                                    int v30 = zzij0.zza;
                                    if(v30 < 0) {
                                        throw zzkb.zzf();
                                    }
                                    if(v30 == 0) {
                                        zzij0.zzc = "";
                                    }
                                    else {
                                        zzij0.zzc = new String(arr_b, v3, v30, zzjv.zza);
                                        v3 += v30;
                                    }
                                }
                                unsafe2.putObject(object0, v23, zzij0.zzc);
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 9: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 2) {
                                Object object1 = this.zza(object0, v5);
                                v3 = zzig.zza(object1, this.zze(v5), arr_b, v10, v1, zzij0);
                                this.zza(object0, v5, object1);
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 10: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 2) {
                                v3 = zzig.zza(arr_b, v10, zzij0);
                                unsafe2.putObject(object0, v23, zzij0.zzc);
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 4: 
                        case 11: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 0) {
                                v3 = zzig.zzc(arr_b, v10, zzij0);
                                unsafe2.putInt(object0, v23, zzij0.zza);
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 12: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 0) {
                                v3 = zzig.zzc(arr_b, v10, zzij0);
                                int v32 = zzij0.zza;
                                zzjx zzjx0 = this.zzd(v5);
                                if((v22 & 0x80000000) == 0 || zzjx0 == null || zzjx0.zza(v32)) {
                                    unsafe2.putInt(object0, v23, v32);
                                }
                                else {
                                    zzlg.zzc(object0).zza(v28, ((long)v32));
                                    zzij1 = zzij0;
                                    v6 = v28;
                                    unsafe0 = unsafe2;
                                    v4 = v27;
                                    v7 = v17;
                                    v8 = v18;
                                    continue;
                                }
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 6: 
                        case 13: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 5) {
                                unsafe2.putInt(object0, v23, zzig.zzc(arr_b, v10));
                                v3 = v10 + 4;
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 5: 
                        case 14: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 1) {
                                unsafe2.putLong(object0, v23, zzig.zzd(arr_b, v10));
                                v3 = v10 + 8;
                                v31 = v17 | v25;
                                goto label_171;
                            }
                            break;
                        }
                        case 15: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            if(v12 == 0) {
                                v3 = zzig.zzc(arr_b, v10, zzij0);
                                unsafe2.putInt(object0, v23, -(zzij0.zza & 1) ^ zzij0.zza >>> 1);
                                v31 = v17 | v25;
                            label_171:
                                zzij1 = zzij0;
                                v6 = v28;
                                unsafe0 = unsafe2;
                                v4 = v27;
                                v8 = v18;
                                v7 = v31;
                                continue;
                            }
                            break;
                        }
                        case 16: {
                            if(v12 == 0) {
                                int v33 = zzig.zzd(arr_b, v10, zzij0);
                                unsafe0.putLong(object0, v23, -(zzij0.zzb & 1L) ^ zzij0.zzb >>> 1);
                                zzij1 = zzij0;
                                v6 = v9;
                                v4 = v11;
                                v8 = v18;
                                v7 = v17 | v25;
                                v3 = v33;
                                continue;
                            }
                            else {
                                unsafe2 = unsafe0;
                                v27 = v11;
                            }
                            v28 = v9;
                            break;
                        }
                        case 17: {
                            if(v12 == 3) {
                                Object object2 = this.zza(object0, v5);
                                int v34 = zzig.zza(object2, this.zze(v5), arr_b, v10, v1, v11 << 3 | 4, zzij0);
                                this.zza(object0, v5, object2);
                                v7 = v17 | v25;
                                v3 = v34;
                                v4 = v11;
                                v6 = v9;
                                v8 = v18;
                                zzij1 = zzij0;
                                continue;
                            }
                            else {
                                unsafe2 = unsafe0;
                                v27 = v11;
                                v28 = v9;
                            }
                            break;
                        }
                        default: {
                            unsafe2 = unsafe0;
                            v27 = v11;
                            v28 = v9;
                            break;
                        }
                    }
                    v16 = v10;
                    unsafe1 = unsafe2;
                    v15 = v27;
                    v19 = v5;
                    zzij2 = zzij0;
                    v14 = v28;
                }
                else {
                    zzij zzij3 = zzij1;
                    Unsafe unsafe3 = unsafe0;
                    int v35 = v9;
                    if(v21 == 27) {
                        if(v12 == 2) {
                            zzkc zzkc0 = (zzkc)unsafe3.getObject(object0, v23);
                            if(!zzkc0.zzc()) {
                                int v36 = zzkc0.size();
                                zzkc0 = zzkc0.zza((v36 == 0 ? 10 : v36 << 1));
                                unsafe3.putObject(object0, v23, zzkc0);
                            }
                            v3 = zzig.zzb(this.zze(v5), v35, arr_b, v10, v1, zzkc0, zzij0);
                            v4 = v11;
                            v6 = v35;
                            unsafe0 = unsafe3;
                            continue;
                        }
                        else {
                            v17 = v7;
                            v18 = v8;
                            unsafe1 = unsafe3;
                            v37 = v5;
                            zzij4 = zzij1;
                            v16 = v10;
                            goto label_751;
                        }
                        goto label_235;
                    }
                    else {
                    label_235:
                        v17 = v7;
                        v18 = v8;
                        if(v21 <= 49) {
                            Unsafe unsafe4 = zzlg.zzb;
                            zzkc zzkc1 = (zzkc)unsafe4.getObject(object0, v23);
                            if(zzkc1.zzc()) {
                                unsafe5 = unsafe3;
                            }
                            else {
                                unsafe5 = unsafe3;
                                zzkc zzkc2 = zzkc1.zza(zzkc1.size() << 1);
                                unsafe4.putObject(object0, v23, zzkc2);
                                zzkc1 = zzkc2;
                            }
                            switch(v21) {
                                case 26: {
                                    zzij6 = zzij1;
                                    v38 = v10;
                                    v49 = v5;
                                    v50 = v35;
                                    unsafe7 = unsafe5;
                                    if(v12 == 2) {
                                        if((((long)v22) & 0x20000000L) == 0L) {
                                            v51 = zzig.zzc(arr_b, v38, zzij6);
                                            int v61 = zzij6.zza;
                                            if(v61 >= 0) {
                                                if(v61 == 0) {
                                                    zzkc1.add("");
                                                    goto label_461;
                                                }
                                                else {
                                                    zzkc1.add(new String(arr_b, v51, v61, zzjv.zza));
                                                }
                                            alab1:
                                                while(true) {
                                                    v51 += v61;
                                                    while(true) {
                                                    label_461:
                                                        if(v51 >= v1) {
                                                            goto label_499;
                                                        }
                                                        int v62 = zzig.zzc(arr_b, v51, zzij6);
                                                        if(v50 != zzij6.zza) {
                                                            goto label_499;
                                                        }
                                                        v51 = zzig.zzc(arr_b, v62, zzij6);
                                                        v61 = zzij6.zza;
                                                        if(v61 < 0) {
                                                            break alab1;
                                                        }
                                                        if(v61 != 0) {
                                                            zzkc1.add(new String(arr_b, v51, v61, zzjv.zza));
                                                            break;
                                                        }
                                                        zzkc1.add("");
                                                    }
                                                }
                                                throw zzkb.zzf();
                                            }
                                        }
                                        else {
                                            v51 = zzig.zzc(arr_b, v38, zzij6);
                                            int v63 = zzij6.zza;
                                            if(v63 >= 0) {
                                                if(v63 == 0) {
                                                    zzkc1.add("");
                                                    goto label_484;
                                                }
                                                else {
                                                    int v64 = v51 + v63;
                                                    if(!zzmp.zzc(arr_b, v51, v64)) {
                                                        throw zzkb.zzd();
                                                    }
                                                    zzkc1.add(new String(arr_b, v51, v63, zzjv.zza));
                                                alab2:
                                                    while(true) {
                                                        v51 = v64;
                                                        while(true) {
                                                        label_484:
                                                            if(v51 >= v1) {
                                                                goto label_499;
                                                            }
                                                            int v65 = zzig.zzc(arr_b, v51, zzij6);
                                                            if(v50 != zzij6.zza) {
                                                                goto label_499;
                                                            }
                                                            v51 = zzig.zzc(arr_b, v65, zzij6);
                                                            int v66 = zzij6.zza;
                                                            if(v66 < 0) {
                                                                throw zzkb.zzf();
                                                            }
                                                            if(v66 != 0) {
                                                                v64 = v51 + v66;
                                                                if(!zzmp.zzc(arr_b, v51, v64)) {
                                                                    break alab2;
                                                                }
                                                                zzkc1.add(new String(arr_b, v51, v66, zzjv.zza));
                                                                break;
                                                            }
                                                            zzkc1.add("");
                                                        }
                                                    }
                                                    throw zzkb.zzd();
                                                label_499:
                                                    v40 = v50;
                                                    zzij5 = zzij6;
                                                    v3 = v51;
                                                    unsafe6 = unsafe7;
                                                    v39 = v49;
                                                    break;
                                                }
                                            }
                                        }
                                        throw zzkb.zzf();
                                    }
                                label_507:
                                    v40 = v50;
                                    zzij5 = zzij6;
                                    unsafe6 = unsafe7;
                                    v39 = v49;
                                    goto label_651;
                                }
                                case 28: {
                                    v38 = v10;
                                    v40 = v35;
                                    zzij5 = zzij1;
                                    if(v12 == 2) {
                                        v3 = zzig.zzc(arr_b, v38, zzij5);
                                        int v67 = zzij5.zza;
                                        if(v67 < 0) {
                                            throw zzkb.zzf();
                                        }
                                        if(v67 > arr_b.length - v3) {
                                            throw zzkb.zzi();
                                        }
                                        if(v67 == 0) {
                                            zzkc1.add(zzik.zza);
                                            goto label_525;
                                        }
                                        else {
                                            zzkc1.add(zzik.zza(arr_b, v3, v67));
                                        }
                                    alab3:
                                        while(true) {
                                            v3 += v67;
                                            while(true) {
                                            label_525:
                                                if(v3 >= v1) {
                                                    goto label_539;
                                                }
                                                int v68 = zzig.zzc(arr_b, v3, zzij5);
                                                if(v40 != zzij5.zza) {
                                                    goto label_539;
                                                }
                                                v3 = zzig.zzc(arr_b, v68, zzij5);
                                                v67 = zzij5.zza;
                                                if(v67 < 0) {
                                                    throw zzkb.zzf();
                                                }
                                                if(v67 > arr_b.length - v3) {
                                                    break alab3;
                                                }
                                                if(v67 != 0) {
                                                    zzkc1.add(zzik.zza(arr_b, v3, v67));
                                                    break;
                                                }
                                                zzkc1.add(zzik.zza);
                                            }
                                        }
                                        throw zzkb.zzi();
                                    label_539:
                                        v39 = v5;
                                        unsafe6 = unsafe5;
                                        break;
                                    }
                                    else {
                                        v39 = v5;
                                        unsafe6 = unsafe5;
                                        goto label_651;
                                    }
                                    goto label_547;
                                }
                                case 18: 
                                case 35: {
                                    v38 = v10;
                                    v39 = v5;
                                    v40 = v35;
                                    unsafe6 = unsafe5;
                                    zzij5 = zzij1;
                                    if(v12 == 2) {
                                        zzje zzje0 = (zzje)zzkc1;
                                        v3 = zzig.zzc(arr_b, v38, zzij5);
                                        int v41 = zzij5.zza;
                                        int v42 = v3 + v41;
                                        if(v42 > arr_b.length) {
                                            throw zzkb.zzi();
                                        }
                                        zzje0.zzc(zzje0.size() + v41 / 8);
                                        while(v3 < v42) {
                                            zzje0.zza(zzig.zza(arr_b, v3));
                                            v3 += 8;
                                        }
                                        if(v3 != v42) {
                                            throw zzkb.zzi();
                                        }
                                    }
                                    else {
                                        if(v12 == 1) {
                                            zzje zzje1 = (zzje)zzkc1;
                                            zzje1.zza(zzig.zza(arr_b, v38));
                                            for(v3 = v38 + 8; v3 < v1; v3 = v43 + 8) {
                                                int v43 = zzig.zzc(arr_b, v3, zzij5);
                                                if(v40 != zzij5.zza) {
                                                    break;
                                                }
                                                zzje1.zza(zzig.zza(arr_b, v43));
                                            }
                                            break;
                                        }
                                        else {
                                            goto label_309;
                                        }
                                        goto label_279;
                                    }
                                    break;
                                }
                                case 19: 
                                case 36: {
                                label_279:
                                    v38 = v10;
                                    v39 = v5;
                                    v40 = v35;
                                    unsafe6 = unsafe5;
                                    zzij5 = zzij1;
                                    if(v12 == 2) {
                                        zzjs zzjs0 = (zzjs)zzkc1;
                                        v3 = zzig.zzc(arr_b, v38, zzij5);
                                        int v44 = zzij5.zza;
                                        int v45 = v3 + v44;
                                        if(v45 > arr_b.length) {
                                            throw zzkb.zzi();
                                        }
                                        zzjs0.zzc(zzjs0.size() + v44 / 4);
                                        while(v3 < v45) {
                                            zzjs0.zza(zzig.zzb(arr_b, v3));
                                            v3 += 4;
                                        }
                                        if(v3 != v45) {
                                            throw zzkb.zzi();
                                        }
                                    }
                                    else {
                                        if(v12 == 5) {
                                            zzjs zzjs1 = (zzjs)zzkc1;
                                            zzjs1.zza(zzig.zzb(arr_b, v38));
                                            for(v3 = v38 + 4; v3 < v1; v3 = v46 + 4) {
                                                int v46 = zzig.zzc(arr_b, v3, zzij5);
                                                if(v40 != zzij5.zza) {
                                                    break;
                                                }
                                                zzjs1.zza(zzig.zzb(arr_b, v46));
                                            }
                                            break;
                                        }
                                    label_309:
                                        v3 = v38;
                                    }
                                    break;
                                }
                                case 20: 
                                case 21: 
                                case 37: 
                                case 38: {
                                    v38 = v10;
                                    v39 = v5;
                                    v40 = v35;
                                    unsafe6 = unsafe5;
                                    zzij5 = zzij1;
                                    if(v12 == 2) {
                                        zzkn zzkn0 = (zzkn)zzkc1;
                                        v3 = zzig.zzc(arr_b, v38, zzij5);
                                        int v47 = zzij5.zza + v3;
                                        while(v3 < v47) {
                                            v3 = zzig.zzd(arr_b, v3, zzij5);
                                            zzkn0.zza(zzij5.zzb);
                                        }
                                        if(v3 != v47) {
                                            throw zzkb.zzi();
                                        }
                                    }
                                    else {
                                        if(v12 == 0) {
                                            zzkn zzkn1 = (zzkn)zzkc1;
                                            v3 = zzig.zzd(arr_b, v38, zzij5);
                                            zzkn1.zza(zzij5.zzb);
                                            while(v3 < v1) {
                                                int v48 = zzig.zzc(arr_b, v3, zzij5);
                                                if(v40 != zzij5.zza) {
                                                    break;
                                                }
                                                v3 = zzig.zzd(arr_b, v48, zzij5);
                                                zzkn1.zza(zzij5.zzb);
                                            }
                                            break;
                                        }
                                        goto label_651;
                                    }
                                    break;
                                }
                                case 25: 
                                case 42: {
                                    zzij6 = zzij1;
                                    v38 = v10;
                                    v49 = v5;
                                    v50 = v35;
                                    unsafe7 = unsafe5;
                                    if(v12 == 2) {
                                        zzii zzii0 = (zzii)zzkc1;
                                        v51 = zzig.zzc(arr_b, v38, zzij6);
                                        int v59 = zzij6.zza + v51;
                                        while(v51 < v59) {
                                            v51 = zzig.zzd(arr_b, v51, zzij6);
                                            zzii0.zza(zzij6.zzb != 0L);
                                        }
                                        if(v51 != v59) {
                                            throw zzkb.zzi();
                                        }
                                        goto label_499;
                                    }
                                    else if(v12 == 0) {
                                        zzii zzii1 = (zzii)zzkc1;
                                        v51 = zzig.zzd(arr_b, v38, zzij6);
                                        zzii1.zza(zzij6.zzb != 0L);
                                        while(v51 < v1) {
                                            int v60 = zzig.zzc(arr_b, v51, zzij6);
                                            if(v50 != zzij6.zza) {
                                                break;
                                            }
                                            v51 = zzig.zzd(arr_b, v60, zzij6);
                                            zzii1.zza(zzij6.zzb != 0L);
                                        }
                                        goto label_499;
                                    }
                                    goto label_507;
                                }
                                case 22: 
                                case 29: 
                                case 39: 
                                case 43: {
                                    zzij6 = zzij1;
                                    v38 = v10;
                                    v49 = v5;
                                    v50 = v35;
                                    unsafe7 = unsafe5;
                                    if(v12 == 2) {
                                        v51 = zzig.zza(arr_b, v38, zzkc1, zzij6);
                                        goto label_499;
                                    }
                                    else {
                                        v40 = v50;
                                        zzij5 = zzij6;
                                        if(v12 == 0) {
                                            unsafe6 = unsafe7;
                                            v3 = zzig.zza(v50, arr_b, v38, v1, zzkc1, zzij0);
                                            v39 = v49;
                                            break;
                                        }
                                        else {
                                            unsafe6 = unsafe7;
                                            v39 = v49;
                                            goto label_651;
                                        }
                                    }
                                    goto label_355;
                                }
                                case 30: 
                                case 44: {
                                label_547:
                                    v40 = v35;
                                    if(v12 == 2) {
                                        zzij5 = zzij1;
                                        v69 = zzig.zza(arr_b, v10, zzkc1, zzij1);
                                        v70 = v5;
                                        v38 = v10;
                                        unsafe8 = unsafe5;
                                        goto label_561;
                                    }
                                    else if(v12 == 0) {
                                        zzij5 = zzij1;
                                        unsafe8 = unsafe5;
                                        v70 = v5;
                                        v38 = v10;
                                        v69 = zzig.zza(v40, arr_b, v10, v1, zzkc1, zzij0);
                                    label_561:
                                        zzlw.zza(object0, v11, zzkc1, this.zzd(v70), null, this.zzp);
                                        v39 = v70;
                                        unsafe6 = unsafe8;
                                        v3 = v69;
                                        break;
                                    }
                                    else {
                                        v38 = v10;
                                        zzij5 = zzij1;
                                        v39 = v5;
                                        unsafe6 = unsafe5;
                                        goto label_651;
                                    }
                                    goto label_570;
                                }
                                case 24: 
                                case 0x1F: 
                                case 41: 
                                case 45: {
                                    zzij6 = zzij1;
                                    v38 = v10;
                                    v49 = v5;
                                    v50 = v35;
                                    unsafe7 = unsafe5;
                                    if(v12 == 2) {
                                        zzjw zzjw0 = (zzjw)zzkc1;
                                        v51 = zzig.zzc(arr_b, v38, zzij6);
                                        int v56 = zzij6.zza;
                                        int v57 = v51 + v56;
                                        if(v57 > arr_b.length) {
                                            throw zzkb.zzi();
                                        }
                                        zzjw0.zze(zzjw0.size() + v56 / 4);
                                        while(v51 < v57) {
                                            zzjw0.zzd(zzig.zzc(arr_b, v51));
                                            v51 += 4;
                                        }
                                        if(v51 != v57) {
                                            throw zzkb.zzi();
                                        }
                                        goto label_499;
                                    }
                                    else if(v12 == 5) {
                                        zzjw zzjw1 = (zzjw)zzkc1;
                                        zzjw1.zzd(zzig.zzc(arr_b, v38));
                                        for(v54 = v38 + 4; v54 < v1; v54 = v58 + 4) {
                                            int v58 = zzig.zzc(arr_b, v54, zzij6);
                                            if(v50 != zzij6.zza) {
                                                break;
                                            }
                                            zzjw1.zzd(zzig.zzc(arr_b, v58));
                                        }
                                    label_414:
                                        v40 = v50;
                                        unsafe6 = unsafe7;
                                        v39 = v49;
                                        v3 = v54;
                                        zzij5 = zzij6;
                                        break;
                                    }
                                    goto label_507;
                                }
                                case 23: 
                                case 0x20: 
                                case 40: 
                                case 46: {
                                label_355:
                                    zzij6 = zzij1;
                                    v38 = v10;
                                    v49 = v5;
                                    v50 = v35;
                                    unsafe7 = unsafe5;
                                    if(v12 == 2) {
                                        zzkn zzkn2 = (zzkn)zzkc1;
                                        v51 = zzig.zzc(arr_b, v38, zzij6);
                                        int v52 = zzij6.zza;
                                        int v53 = v51 + v52;
                                        if(v53 > arr_b.length) {
                                            throw zzkb.zzi();
                                        }
                                        zzkn2.zzd(zzkn2.size() + v52 / 8);
                                        while(v51 < v53) {
                                            zzkn2.zza(zzig.zzd(arr_b, v51));
                                            v51 += 8;
                                        }
                                        if(v51 != v53) {
                                            throw zzkb.zzi();
                                        }
                                        goto label_499;
                                    }
                                    else if(v12 == 1) {
                                        zzkn zzkn3 = (zzkn)zzkc1;
                                        zzkn3.zza(zzig.zzd(arr_b, v38));
                                        int v54;
                                        for(v54 = v38 + 8; v54 < v1; v54 = v55 + 8) {
                                            int v55 = zzig.zzc(arr_b, v54, zzij6);
                                            if(v50 != zzij6.zza) {
                                                break;
                                            }
                                            zzkn3.zza(zzig.zzd(arr_b, v55));
                                        }
                                        goto label_414;
                                    }
                                    goto label_507;
                                }
                                case 33: 
                                case 0x2F: {
                                label_570:
                                    v71 = v10;
                                    v72 = v5;
                                    v40 = v35;
                                    if(v12 == 2) {
                                        zzjw zzjw2 = (zzjw)zzkc1;
                                        v73 = zzig.zzc(arr_b, v71, zzij1);
                                        int v74 = zzij1.zza + v73;
                                        while(v73 < v74) {
                                            v73 = zzig.zzc(arr_b, v73, zzij3);
                                            zzjw2.zzd(-(zzij3.zza & 1) ^ zzij3.zza >>> 1);
                                        }
                                        if(v73 != v74) {
                                            throw zzkb.zzi();
                                        }
                                        goto label_624;
                                    }
                                    else if(v12 == 0) {
                                        zzjw zzjw3 = (zzjw)zzkc1;
                                        v73 = zzig.zzc(arr_b, v71, zzij1);
                                        zzjw3.zzd(-(zzij1.zza & 1) ^ zzij1.zza >>> 1);
                                        while(v73 < v1) {
                                            int v75 = zzig.zzc(arr_b, v73, zzij3);
                                            if(v40 != zzij3.zza) {
                                                break;
                                            }
                                            v73 = zzig.zzc(arr_b, v75, zzij3);
                                            zzjw3.zzd(-(zzij3.zza & 1) ^ zzij3.zza >>> 1);
                                        }
                                        goto label_624;
                                    }
                                    else {
                                        zzij5 = zzij1;
                                        v39 = v72;
                                        v38 = v71;
                                        unsafe6 = unsafe5;
                                        goto label_651;
                                    }
                                    goto label_598;
                                }
                                case 34: 
                                case 0x30: {
                                label_598:
                                    v71 = v10;
                                    v72 = v5;
                                    if(v12 == 2) {
                                        zzkn zzkn4 = (zzkn)zzkc1;
                                        v76 = zzig.zzc(arr_b, v71, zzij1);
                                        int v77 = zzij1.zza + v76;
                                        while(v76 < v77) {
                                            v76 = zzig.zzd(arr_b, v76, zzij3);
                                            zzkn4.zza(-(zzij3.zzb & 1L) ^ zzij3.zzb >>> 1);
                                        }
                                        if(v76 != v77) {
                                            throw zzkb.zzi();
                                        }
                                        goto label_639;
                                    }
                                    else if(v12 == 0) {
                                        zzkn zzkn5 = (zzkn)zzkc1;
                                        v73 = zzig.zzd(arr_b, v71, zzij1);
                                        zzkn5.zza(-(zzij1.zzb & 1L) ^ zzij1.zzb >>> 1);
                                        while(true) {
                                            if(v73 < v1) {
                                                int v78 = zzig.zzc(arr_b, v73, zzij3);
                                                v40 = v35;
                                                if(v40 == zzij3.zza) {
                                                    v73 = zzig.zzd(arr_b, v78, zzij3);
                                                    zzkn5.zza(-(zzij3.zzb & 1L) ^ zzij3.zzb >>> 1);
                                                    v35 = v40;
                                                    continue;
                                                }
                                                else {
                                                    break;
                                                }
                                            }
                                            v40 = v35;
                                            break;
                                        }
                                    label_624:
                                        zzij5 = zzij1;
                                        v3 = v73;
                                        v39 = v72;
                                        v38 = v71;
                                        unsafe6 = unsafe5;
                                        break;
                                    }
                                    else {
                                        zzij5 = zzij1;
                                        v39 = v72;
                                        v38 = v71;
                                        v40 = v35;
                                    }
                                    unsafe6 = unsafe5;
                                    goto label_651;
                                }
                                case 49: {
                                    if(v12 == 3) {
                                        v71 = v10;
                                        v72 = v5;
                                        v76 = zzig.zza(this.zze(v5), v35, arr_b, v10, v1, zzkc1, zzij0);
                                    label_639:
                                        zzij5 = zzij1;
                                        v3 = v76;
                                        v39 = v72;
                                        v38 = v71;
                                        v40 = v35;
                                        unsafe6 = unsafe5;
                                        break;
                                    }
                                label_646:
                                    v38 = v10;
                                    v39 = v5;
                                    v40 = v35;
                                    unsafe6 = unsafe5;
                                    zzij5 = zzij1;
                                label_651:
                                    v3 = v38;
                                    break;
                                }
                                default: {
                                    goto label_646;
                                }
                            }
                            if(v3 == v38) {
                                unsafe1 = unsafe6;
                                v14 = v40;
                                v15 = v11;
                                v19 = v39;
                                zzij2 = zzij5;
                                v16 = v3;
                                goto label_935;
                            }
                            else {
                                zzij1 = zzij5;
                                v6 = v40;
                                v7 = v17;
                                v8 = v18;
                                v5 = v39;
                                unsafe0 = unsafe6;
                                v4 = v11;
                                continue;
                            }
                            goto label_668;
                        }
                        else {
                        label_668:
                            int v79 = v5;
                            int v80 = v35;
                            zzij4 = zzij1;
                            if(v21 == 50) {
                                if(v12 == 2) {
                                    Unsafe unsafe9 = zzlg.zzb;
                                    Object object3 = this.zzf(v79);
                                    Object object4 = unsafe9.getObject(object0, v23);
                                    if(this.zzr.zzf(object4)) {
                                        Object object5 = this.zzr.zzb(object3);
                                        this.zzr.zza(object5, object4);
                                        unsafe9.putObject(object0, v23, object5);
                                        object4 = object5;
                                    }
                                    zzkt zzkt0 = this.zzr.zza(object3);
                                    Map map0 = this.zzr.zze(object4);
                                    int v81 = zzig.zzc(arr_b, v10, zzij4);
                                    int v82 = zzij4.zza;
                                    if(v82 < 0 || v82 > v1 - v81) {
                                        throw zzkb.zzi();
                                    }
                                    int v83 = v81 + v82;
                                    Object object6 = zzkt0.zzd;
                                    Object object7 = zzkt0.zzb;
                                    while(v81 < v83) {
                                        int v84 = v81 + 1;
                                        int v85 = arr_b[v81];
                                        if(v85 < 0) {
                                            v84 = zzig.zza(v85, arr_b, v84, zzij4);
                                            v85 = zzij4.zza;
                                        }
                                        switch(v85 >>> 3) {
                                            case 1: {
                                                object8 = object7;
                                                v86 = v80;
                                                v87 = v79;
                                                unsafe10 = unsafe3;
                                                if((v85 & 7) == zzkt0.zza.zza()) {
                                                    v81 = zzlg.zza(arr_b, v84, v1, zzkt0.zza, null, zzij0);
                                                    object7 = zzij4.zzc;
                                                    goto label_724;
                                                }
                                                break;
                                            }
                                            case 2: {
                                                if((v85 & 7) == zzkt0.zzc.zza()) {
                                                    Class class0 = zzkt0.zzd.getClass();
                                                    v86 = v80;
                                                    unsafe10 = unsafe3;
                                                    v87 = v79;
                                                    object8 = object7;
                                                    v81 = zzlg.zza(arr_b, v84, v1, zzkt0.zzc, class0, zzij0);
                                                    object6 = zzij4.zzc;
                                                    goto label_723;
                                                }
                                                else {
                                                    object8 = object7;
                                                    v86 = v80;
                                                    v87 = v79;
                                                    unsafe10 = unsafe3;
                                                }
                                                break;
                                            }
                                            default: {
                                                object8 = object7;
                                                v86 = v80;
                                                v87 = v79;
                                                unsafe10 = unsafe3;
                                            }
                                        }
                                        v81 = zzig.zza(v85, arr_b, v84, v1, zzij4);
                                    label_723:
                                        object7 = object8;
                                    label_724:
                                        v79 = v87;
                                        v80 = v86;
                                        unsafe3 = unsafe10;
                                    }
                                    unsafe1 = unsafe3;
                                    v35 = v80;
                                    v37 = v79;
                                    if(v81 == v83) {
                                        map0.put(object7, object6);
                                        if(v83 == v10) {
                                            v16 = v83;
                                            goto label_751;
                                        }
                                        else {
                                            v3 = v83;
                                            zzij1 = zzij4;
                                            v5 = v37;
                                            v4 = v11;
                                            v6 = v35;
                                            v7 = v17;
                                            v8 = v18;
                                            unsafe0 = unsafe1;
                                            continue;
                                        }
                                    }
                                    throw zzkb.zzg();
                                }
                                else {
                                    unsafe1 = unsafe3;
                                    v35 = v80;
                                    v37 = v79;
                                    v16 = v10;
                                }
                            label_751:
                                v15 = v11;
                                v14 = v35;
                                v19 = v37;
                                zzij2 = zzij4;
                            }
                            else {
                                unsafe1 = unsafe3;
                                Unsafe unsafe11 = zzlg.zzb;
                                long v88 = (long)(arr_v[v79 + 2] & 0xFFFFF);
                                switch(v21) {
                                    case 51: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        v15 = v11;
                                        v19 = v79;
                                        if(v12 == 1) {
                                            unsafe11.putObject(object0, v23, zzig.zza(arr_b, v10));
                                            v89 = v10 + 8;
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v89;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 52: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        v15 = v11;
                                        v19 = v79;
                                        if(v12 == 5) {
                                            unsafe11.putObject(object0, v23, zzig.zzb(arr_b, v10));
                                            v89 = v10 + 4;
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v89;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 53: 
                                    case 54: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        v15 = v11;
                                        v19 = v79;
                                        if(v12 == 0) {
                                            v90 = zzig.zzd(arr_b, v10, zzij2);
                                            unsafe11.putObject(object0, v23, zzij2.zzb);
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v90;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 58: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        v15 = v11;
                                        v19 = v79;
                                        if(v12 == 0) {
                                            v90 = zzig.zzd(arr_b, v10, zzij2);
                                            unsafe11.putObject(object0, v23, Boolean.valueOf(zzij2.zzb != 0L));
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v90;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 59: {
                                        v14 = v80;
                                        v15 = v11;
                                        v19 = v79;
                                        zzij2 = zzij4;
                                        if(v12 == 2) {
                                            v90 = zzig.zzc(arr_b, v10, zzij2);
                                            int v91 = zzij2.zza;
                                            if(v91 == 0) {
                                                unsafe11.putObject(object0, v23, "");
                                            }
                                            else {
                                                if((0x20000000 & v22) != 0 && !zzmp.zzc(arr_b, v90, v90 + v91)) {
                                                    throw zzkb.zzd();
                                                }
                                                unsafe11.putObject(object0, v23, new String(arr_b, v90, v91, zzjv.zza));
                                                v90 += v91;
                                            }
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v90;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 60: {
                                        v92 = v79;
                                        v93 = v11;
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        if(v12 == 2) {
                                            Object object9 = this.zza(object0, v93, v92);
                                            v3 = zzig.zza(object9, this.zze(v92), arr_b, v10, v1, zzij0);
                                            this.zza(object0, v93, v92, object9);
                                            v15 = v93;
                                            v19 = v92;
                                            break;
                                        }
                                        v19 = v92;
                                        v15 = v93;
                                        v3 = v10;
                                        break;
                                    }
                                    case 61: {
                                        v93 = v11;
                                        v14 = v80;
                                        v92 = v79;
                                        zzij2 = zzij4;
                                        if(v12 == 2) {
                                            int v94 = zzig.zza(arr_b, v10, zzij2);
                                            unsafe11.putObject(object0, v23, zzij2.zzc);
                                            unsafe11.putInt(object0, v88, v93);
                                            v3 = v94;
                                            v19 = v92;
                                            v15 = v93;
                                            break;
                                        }
                                        v19 = v92;
                                        v15 = v93;
                                        v3 = v10;
                                        break;
                                    }
                                    case 55: 
                                    case 62: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        v15 = v11;
                                        v19 = v79;
                                        if(v12 == 0) {
                                            v90 = zzig.zzc(arr_b, v10, zzij2);
                                            unsafe11.putObject(object0, v23, zzij2.zza);
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v90;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 0x3F: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        if(v12 == 0) {
                                            int v95 = zzig.zzc(arr_b, v10, zzij2);
                                            int v96 = zzij2.zza;
                                            zzjx zzjx1 = this.zzd(v79);
                                            if(zzjx1 == null || zzjx1.zza(v96)) {
                                                unsafe11.putObject(object0, v23, v96);
                                                unsafe11.putInt(object0, v88, v11);
                                            }
                                            else {
                                                zzlg.zzc(object0).zza(v14, ((long)v96));
                                            }
                                            v3 = v95;
                                            v15 = v11;
                                            v19 = v79;
                                        }
                                        else {
                                            v15 = v11;
                                            v19 = v79;
                                            v3 = v10;
                                        }
                                        break;
                                    }
                                    case 57: 
                                    case 0x40: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        v15 = v11;
                                        v19 = v79;
                                        if(v12 == 5) {
                                            unsafe11.putObject(object0, v23, zzig.zzc(arr_b, v10));
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v10 + 4;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 56: 
                                    case 65: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        v15 = v11;
                                        v19 = v79;
                                        if(v12 == 1) {
                                            unsafe11.putObject(object0, v23, zzig.zzd(arr_b, v10));
                                            v89 = v10 + 8;
                                            unsafe11.putInt(object0, v88, v15);
                                            v3 = v89;
                                            break;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 66: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        if(v12 == 0) {
                                            int v97 = zzig.zzc(arr_b, v10, zzij2);
                                            unsafe11.putObject(object0, v23, ((int)(-(zzij2.zza & 1) ^ zzij2.zza >>> 1)));
                                            unsafe11.putInt(object0, v88, v11);
                                            v3 = v97;
                                            v15 = v11;
                                            v19 = v79;
                                        }
                                        else {
                                            v15 = v11;
                                            v19 = v79;
                                            v3 = v10;
                                        }
                                        break;
                                    }
                                    case 67: {
                                        v14 = v80;
                                        zzij2 = zzij4;
                                        if(v12 == 0) {
                                            int v98 = zzig.zzd(arr_b, v10, zzij2);
                                            unsafe11.putObject(object0, v23, ((long)(-(zzij2.zzb & 1L) ^ zzij2.zzb >>> 1)));
                                            unsafe11.putInt(object0, v88, v11);
                                            v3 = v98;
                                            v15 = v11;
                                            v19 = v79;
                                            break;
                                        }
                                        else {
                                            v19 = v79;
                                            v15 = v11;
                                        }
                                        v3 = v10;
                                        break;
                                    }
                                    case 68: {
                                        if(v12 == 3) {
                                            Object object10 = this.zza(object0, v11, v79);
                                            int v99 = zzig.zza(object10, this.zze(v79), arr_b, v10, v1, v80 & -8 | 4, zzij0);
                                            this.zza(object0, v11, v79, object10);
                                            zzij2 = zzij0;
                                            v19 = v79;
                                            v14 = v80;
                                            v15 = v11;
                                            v3 = v99;
                                        }
                                        else {
                                            v15 = v11;
                                            v14 = v80;
                                            v19 = v79;
                                            zzij2 = zzij0;
                                            v3 = v10;
                                        }
                                        break;
                                    }
                                    default: {
                                        v15 = v11;
                                        v14 = v80;
                                        v19 = v79;
                                        zzij2 = zzij4;
                                        v3 = v10;
                                        break;
                                    }
                                }
                                if(v3 == v10) {
                                    v16 = v3;
                                }
                                else {
                                    goto label_960;
                                }
                            }
                        }
                    }
                }
            }
        label_935:
            if(v14 != v2 || v2 == 0) {
                if(!this.zzh || zzij2.zzd == zzjg.zza) {
                    zzij1 = zzij0;
                    v3 = zzig.zza(v14, arr_b, v16, v1, zzlg.zzc(object0), zzij1);
                    v5 = v19;
                    v7 = v17;
                    v8 = v18;
                    unsafe0 = unsafe1;
                    v6 = v14;
                    v4 = v15;
                }
                else {
                    v3 = zzig.zza(v14, arr_b, v16, v1, object0, this.zzg, this.zzp, zzij0);
                    v4 = v15;
                    v6 = v14;
                    v5 = v19;
                    v7 = v17;
                    v8 = v18;
                    unsafe0 = unsafe1;
                    zzij1 = zzij0;
                }
                continue;
            label_960:
                zzij1 = zzij0;
                v4 = v15;
                v5 = v19;
                v7 = v17;
                v8 = v18;
                unsafe0 = unsafe1;
                v6 = v14;
                continue;
            }
            else {
                v100 = v16;
                v6 = v14;
                v7 = v17;
                v8 = v18;
            }
            break;
        }
        if(v8 != 0xFFFFF) {
            unsafe1.putInt(object0, ((long)v8), v7);
        }
        int v101 = this.zzl;
        zzmj zzmj0 = null;
        while(v101 < this.zzm) {
            zzmj0 = (zzmj)this.zza(object0, this.zzk[v101], zzmj0, this.zzp, object0);
            ++v101;
        }
        if(zzmj0 != null) {
            this.zzp.zzb(object0, zzmj0);
        }
        if(v2 == 0) {
            if(v100 != v1) {
                throw zzkb.zzg();
            }
            return v100;
        }
        if(v100 > v1 || v6 != v2) {
            throw zzkb.zzg();
        }
        return v100;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final Object zza() {
        return this.zzn.zza(this.zzg);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, zzlr zzlr0, zzjg zzjg0) throws IOException {
        zzjx zzjx1;
        List list1;
        Object object6;
        int v4;
        int v3;
        Object object5;
        Object object4;
        zzjm zzjm1;
        Object object3;
        int v1;
        int v;
        Object object1 = object0;
        zzjg zzjg1 = zzjg0;
        zzjg0.getClass();
        zzlg.zzf(object0);
        zzmk zzmk0 = this.zzp;
        zzji zzji0 = this.zzq;
        Object object2 = null;
        zzjm zzjm0 = null;
        while(true) {
            try {
            label_8:
                v = zzlr0.zzc();
                v1 = this.zza(v);
                if(v1 < 0) {
                    goto label_11;
                }
                goto label_53;
            }
            catch(Throwable throwable0) {
                object4 = object1;
                goto label_395;
            }
        label_11:
            if(v == 0x7FFFFFFF) {
                for(int v2 = this.zzl; v2 < this.zzm; ++v2) {
                    object2 = this.zza(object0, this.zzk[v2], object2, zzmk0, object0);
                }
                if(object2 != null) {
                    zzmk0.zzb(object1, object2);
                }
                return;
            }
            try {
                object3 = this.zzh ? zzji0.zza(zzjg1, this.zzg, v) : null;
                if(object3 == null) {
                    goto label_34;
                }
                else {
                    zzjm1 = zzjm0 == null ? zzji0.zzb(object1) : zzjm0;
                    object5 = object1;
                    object2 = zzji0.zza(object0, zzlr0, object3, zzjg0, zzjm1, object2, zzmk0);
                    zzjm0 = zzjm1;
                    object1 = object5;
                    goto label_8;
                }
                goto label_53;
            }
            catch(Throwable throwable0) {
                object4 = object1;
                goto label_395;
            }
            try {
                object5 = object1;
                object2 = zzji0.zza(object0, zzlr0, object3, zzjg0, zzjm1, object2, zzmk0);
                zzjm0 = zzjm1;
                object1 = object5;
                goto label_8;
            label_34:
                object5 = object1;
                zzmk0.zza(zzlr0);
                if(object2 == null) {
                    object2 = zzmk0.zzc(object5);
                }
                if(zzmk0.zza(object2, zzlr0, 0)) {
                    object1 = object5;
                    goto label_8;
                }
                v3 = this.zzl;
            }
            catch(Throwable throwable0) {
                object4 = object5;
                goto label_395;
            }
            while(v3 < this.zzm) {
                object2 = this.zza(object0, this.zzk[v3], object2, zzmk0, object0);
                ++v3;
            }
            if(object2 != null) {
                zzmk0.zzb(object5, object2);
            }
            return;
            try {
            label_53:
                object4 = object1;
                v4 = this.zzc(v1);
                switch((0xFF00000 & v4) >>> 20) {
                    case 0: {
                        goto label_70;
                    }
                    case 1: {
                        goto label_75;
                    }
                    case 2: {
                        goto label_80;
                    }
                    case 3: {
                        goto label_85;
                    }
                    case 4: {
                        goto label_90;
                    }
                    case 5: {
                        goto label_95;
                    }
                    case 6: {
                        goto label_100;
                    }
                    case 7: {
                        goto label_105;
                    }
                    case 8: {
                        goto label_110;
                    }
                    case 9: {
                        goto label_115;
                    }
                    case 10: {
                        goto label_121;
                    }
                    case 11: {
                        goto label_126;
                    }
                    case 12: {
                        goto label_131;
                    }
                    case 13: {
                        goto label_141;
                    }
                    case 14: {
                        goto label_146;
                    }
                    case 15: {
                        goto label_151;
                    }
                    case 16: {
                        goto label_156;
                    }
                    case 17: {
                        goto label_161;
                    }
                    case 18: {
                        goto label_167;
                    }
                    case 19: {
                        goto label_171;
                    }
                    case 20: {
                        goto label_175;
                    }
                    case 21: {
                        goto label_179;
                    }
                    case 22: {
                        goto label_183;
                    }
                    case 23: {
                        goto label_187;
                    }
                    case 24: {
                        goto label_191;
                    }
                    case 25: {
                        goto label_195;
                    }
                    case 26: {
                        goto label_199;
                    }
                    case 27: {
                        goto label_206;
                    }
                    case 28: {
                        goto label_211;
                    }
                    case 29: {
                        goto label_215;
                    }
                    case 30: {
                        goto label_219;
                    }
                    case 0x1F: {
                        goto label_225;
                    }
                    case 0x20: {
                        goto label_229;
                    }
                    case 33: {
                        goto label_233;
                    }
                    case 34: {
                        goto label_237;
                    }
                    case 35: {
                        goto label_241;
                    }
                    case 36: {
                        goto label_245;
                    }
                    case 37: {
                        goto label_249;
                    }
                    case 38: {
                        goto label_253;
                    }
                    case 39: {
                        goto label_257;
                    }
                    case 40: {
                        goto label_261;
                    }
                    case 41: {
                        goto label_265;
                    }
                    case 42: {
                        goto label_269;
                    }
                    case 43: {
                        goto label_273;
                    }
                    case 44: {
                        goto label_280;
                    }
                    case 45: {
                        goto label_287;
                    }
                    case 46: {
                        goto label_289;
                    }
                    case 0x2F: {
                        goto label_291;
                    }
                    case 0x30: {
                        goto label_293;
                    }
                    case 49: {
                        goto label_295;
                    }
                    case 50: {
                        goto label_298;
                    }
                    case 51: {
                        goto label_312;
                    }
                    case 52: {
                        goto label_315;
                    }
                    case 53: {
                        goto label_318;
                    }
                    case 54: {
                        goto label_321;
                    }
                    case 55: {
                        goto label_324;
                    }
                    case 56: {
                        goto label_327;
                    }
                    case 57: {
                        goto label_330;
                    }
                    case 58: {
                        goto label_333;
                    }
                    case 59: {
                        goto label_336;
                    }
                    case 60: {
                        goto label_339;
                    }
                    case 61: {
                        goto label_343;
                    }
                    case 62: {
                        goto label_346;
                    }
                    case 0x3F: {
                        goto label_349;
                    }
                    case 0x40: {
                        goto label_357;
                    }
                    case 65: {
                        goto label_360;
                    }
                    case 66: {
                        goto label_363;
                    }
                    case 67: {
                        goto label_366;
                    }
                    case 68: {
                        goto label_369;
                    }
                    default: {
                        if(object2 == null) {
                            try {
                                object2 = zzmk0.zzc(object4);
                            }
                            catch(zzke unused_ex) {
                                goto label_373;
                            }
                        }
                        try {
                            if(!zzmk0.zza(object2, zzlr0, 0)) {
                                goto label_62;
                            }
                            goto label_403;
                        }
                        catch(zzke unused_ex) {
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_395;
            }
            zzjg zzjg2 = zzjg1;
            goto label_376;
        label_62:
            for(int v5 = this.zzl; v5 < this.zzm; ++v5) {
                object2 = this.zza(object0, this.zzk[v5], object2, zzmk0, object0);
            }
            if(object2 != null) {
                zzmk0.zzb(object4, object2);
            }
            return;
            try {
            label_70:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zza());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_75:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzb());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_80:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzl());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_85:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzo());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_90:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzg());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_95:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzk());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_100:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzf());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_105:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zzc(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzs());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_110:
                object6 = object2;
                zzjg2 = zzjg1;
                this.zza(object4, v4, zzlr0);
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_115:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlc zzlc0 = (zzlc)this.zza(object4, v1);
                zzlr0.zzb(zzlc0, this.zze(v1), zzjg2);
                this.zza(object4, v1, zzlc0);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_121:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzp());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_126:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzj());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_131:
                object6 = object2;
                zzjg2 = zzjg1;
                int v6 = zzlr0.zze();
                zzjx zzjx0 = this.zzd(v1);
                if(zzjx0 == null || zzjx0.zza(v6)) {
                    zzml.zza(object4, ((long)(v4 & 0xFFFFF)), v6);
                    this.zzb(object4, v1);
                    object2 = object6;
                }
                else {
                    object2 = zzlw.zza(object4, v, v6, object6, zzmk0);
                }
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_141:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzh());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_146:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzm());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_151:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzi());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_156:
                object6 = object2;
                zzjg2 = zzjg1;
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzn());
                this.zzb(object4, v1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_161:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlc zzlc1 = (zzlc)this.zza(object4, v1);
                zzlr0.zza(zzlc1, this.zze(v1), zzjg2);
                this.zza(object4, v1, zzlc1);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_167:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzc(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_171:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzg(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_175:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzi(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_179:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzq(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_183:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzh(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_187:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzf(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_191:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zze(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_195:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zza(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_199:
                object6 = object2;
                zzjg2 = zzjg1;
                if(zzlg.zzg(v4)) {
                    zzlr0.zzo(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                }
                else {
                    zzlr0.zzn(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                }
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_206:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlu zzlu0 = this.zze(v1);
                zzlr0.zzb(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))), zzlu0, zzjg2);
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_211:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzb(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_215:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzp(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_219:
                object6 = object2;
                zzjg2 = zzjg1;
                List list0 = this.zzo.zza(object4, ((long)(v4 & 0xFFFFF)));
                zzlr0.zzd(list0);
                object2 = zzlw.zza(object0, v, list0, this.zzd(v1), object6, zzmk0);
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_225:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzj(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_229:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzk(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_233:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzl(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_237:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzm(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_241:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzc(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_245:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzg(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_249:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzi(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_253:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzq(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_257:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzh(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_261:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzf(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_265:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zze(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_269:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zza(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                object2 = object6;
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            label_273:
                object6 = object2;
                zzjg2 = zzjg1;
                zzlr0.zzp(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
            }
            catch(zzke unused_ex) {
                goto label_375;
            }
            catch(Throwable throwable0) {
                goto label_392;
            }
            object2 = object6;
            zzjg1 = zzjg2;
            object1 = object4;
            goto label_8;
            try {
            label_280:
                list1 = this.zzo.zza(object4, ((long)(v4 & 0xFFFFF)));
                zzlr0.zzd(list1);
                zzjx1 = this.zzd(v1);
                object6 = object2;
                zzjg2 = zzjg1;
            }
            catch(zzke unused_ex) {
                goto label_373;
            }
            catch(Throwable throwable0) {
                goto label_395;
            }
            try {
                object2 = zzlw.zza(object0, v, list1, zzjx1, object6, zzmk0);
                zzjg1 = zzjg2;
                object1 = object4;
                goto label_8;
            }
            catch(zzke unused_ex) {
                goto label_375;
            }
            catch(Throwable throwable0) {
                goto label_392;
            }
            try {
            label_287:
                zzlr0.zzj(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_403;
            label_289:
                zzlr0.zzk(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_403;
            label_291:
                zzlr0.zzl(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_403;
            label_293:
                zzlr0.zzm(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))));
                goto label_403;
            label_295:
                zzlu zzlu1 = this.zze(v1);
                zzlr0.zza(this.zzo.zza(object4, ((long)(v4 & 0xFFFFF))), zzlu1, zzjg1);
                goto label_403;
            label_298:
                Object object7 = this.zzf(v1);
                long v7 = (long)(this.zzc(v1) & 0xFFFFF);
                Object object8 = zzml.zze(object4, v7);
                if(object8 == null) {
                    object8 = this.zzr.zzb(object7);
                    zzml.zza(object4, v7, object8);
                }
                else if(this.zzr.zzf(object8)) {
                    Object object9 = this.zzr.zzb(object7);
                    this.zzr.zza(object9, object8);
                    zzml.zza(object4, v7, object9);
                    object8 = object9;
                }
                zzlr0.zza(this.zzr.zze(object8), this.zzr.zza(object7), zzjg1);
                goto label_403;
            label_312:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zza());
                this.zzb(object4, v, v1);
                goto label_403;
            label_315:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzb());
                this.zzb(object4, v, v1);
                goto label_403;
            label_318:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzl());
                this.zzb(object4, v, v1);
                goto label_403;
            label_321:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzo());
                this.zzb(object4, v, v1);
                goto label_403;
            label_324:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzg());
                this.zzb(object4, v, v1);
                goto label_403;
            label_327:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzk());
                this.zzb(object4, v, v1);
                goto label_403;
            label_330:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzf());
                this.zzb(object4, v, v1);
                goto label_403;
            label_333:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), Boolean.valueOf(zzlr0.zzs()));
                this.zzb(object4, v, v1);
                goto label_403;
            label_336:
                this.zza(object4, v4, zzlr0);
                this.zzb(object4, v, v1);
                goto label_403;
            label_339:
                zzlc zzlc2 = (zzlc)this.zza(object4, v, v1);
                zzlr0.zzb(zzlc2, this.zze(v1), zzjg1);
                this.zza(object4, v, v1, zzlc2);
                goto label_403;
            label_343:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzp());
                this.zzb(object4, v, v1);
                goto label_403;
            label_346:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzj());
                this.zzb(object4, v, v1);
                goto label_403;
            label_349:
                int v8 = zzlr0.zze();
                zzjx zzjx2 = this.zzd(v1);
                if(zzjx2 == null || zzjx2.zza(v8)) {
                    zzml.zza(object4, ((long)(v4 & 0xFFFFF)), v8);
                    this.zzb(object4, v, v1);
                }
                else {
                    object2 = zzlw.zza(object4, v, v8, object2, zzmk0);
                }
                goto label_403;
            label_357:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzh());
                this.zzb(object4, v, v1);
                goto label_403;
            label_360:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzm());
                this.zzb(object4, v, v1);
                goto label_403;
            label_363:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzi());
                this.zzb(object4, v, v1);
                goto label_403;
            label_366:
                zzml.zza(object4, ((long)(v4 & 0xFFFFF)), zzlr0.zzn());
                this.zzb(object4, v, v1);
                goto label_403;
            label_369:
                zzlc zzlc3 = (zzlc)this.zza(object4, v, v1);
                zzlr0.zza(zzlc3, this.zze(v1), zzjg1);
                this.zza(object4, v, v1, zzlc3);
                goto label_403;
            }
            catch(zzke unused_ex) {
            label_373:
                object6 = object2;
                zzjg2 = zzjg1;
            label_375:
                object2 = object6;
                try {
                label_376:
                    zzmk0.zza(zzlr0);
                    if(object2 == null) {
                        object2 = zzmk0.zzc(object4);
                    }
                    if(!zzmk0.zza(object2, zzlr0, 0)) {
                        goto label_380;
                    }
                    zzjg1 = zzjg2;
                    object1 = object4;
                    goto label_8;
                }
                catch(Throwable throwable0) {
                    goto label_395;
                }
            label_380:
                for(int v9 = this.zzl; v9 < this.zzm; ++v9) {
                    object2 = this.zza(object0, this.zzk[v9], object2, zzmk0, object0);
                }
                if(object2 != null) {
                    zzmk0.zzb(object4, object2);
                }
                return;
                try {
                    zzjg1 = zzjg2;
                    object1 = object4;
                    goto label_8;
                label_392:
                    object2 = object6;
                }
                catch(zzke unused_ex) {
                    goto label_375;
                }
                catch(Throwable throwable0) {
                    goto label_392;
                }
            }
            catch(Throwable throwable0) {
            }
        label_395:
            for(int v10 = this.zzl; v10 < this.zzm; ++v10) {
                object2 = this.zza(object0, this.zzk[v10], object2, zzmk0, object0);
            }
            if(object2 != null) {
                zzmk0.zzb(object4, object2);
            }
            throw throwable0;
        label_403:
            object1 = object4;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, zznb zznb0) throws IOException {
        Unsafe unsafe1;
        int v18;
        int v17;
        Map.Entry map$Entry3;
        int v16;
        int v14;
        int v13;
        int v12;
        Map.Entry map$Entry2;
        Iterator iterator3;
        Iterator iterator2;
        Map.Entry map$Entry1;
        Map.Entry map$Entry0;
        Iterator iterator0;
        if(zznb0.zza() == 2) {
            zzlg.zza(this.zzp, object0, zznb0);
            if(this.zzh) {
                zzjm zzjm0 = this.zzq.zza(object0);
                if(zzjm0.zza.isEmpty()) {
                    iterator0 = null;
                    map$Entry0 = null;
                }
                else {
                    iterator0 = zzjm0.zzc();
                    Object object1 = iterator0.next();
                    map$Entry0 = (Map.Entry)object1;
                }
            }
            else {
                iterator0 = null;
                map$Entry0 = null;
            }
            for(int v = this.zzc.length - 3; v >= 0; v -= 3) {
                int v1 = this.zzc(v);
                int v2 = this.zzc[v];
                while(map$Entry0 != null && this.zzq.zza(map$Entry0) > v2) {
                    this.zzq.zza(zznb0, map$Entry0);
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
                        if(this.zzc(object0, v)) {
                            zznb0.zza(v2, zzml.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 1: {
                        if(this.zzc(object0, v)) {
                            zznb0.zza(v2, zzml.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzb(v2, zzml.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 3: {
                        if(this.zzc(object0, v)) {
                            zznb0.zze(v2, zzml.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 4: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzc(v2, zzml.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 5: {
                        if(this.zzc(object0, v)) {
                            zznb0.zza(v2, zzml.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 6: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzb(v2, zzml.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 7: {
                        if(this.zzc(object0, v)) {
                            zznb0.zza(v2, zzml.zzh(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 8: {
                        if(this.zzc(object0, v)) {
                            zzlg.zza(v2, zzml.zze(object0, ((long)(v1 & 0xFFFFF))), zznb0);
                        }
                        break;
                    }
                    case 9: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzb(v2, zzml.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                        break;
                    }
                    case 10: {
                        if(this.zzc(object0, v)) {
                            zznb0.zza(v2, ((zzik)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 11: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzf(v2, zzml.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 12: {
                        if(this.zzc(object0, v)) {
                            zznb0.zza(v2, zzml.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 13: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzd(v2, zzml.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 14: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzc(v2, zzml.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 15: {
                        if(this.zzc(object0, v)) {
                            zznb0.zze(v2, zzml.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 16: {
                        if(this.zzc(object0, v)) {
                            zznb0.zzd(v2, zzml.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 17: {
                        if(this.zzc(object0, v)) {
                            zznb0.zza(v2, zzml.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                        break;
                    }
                    case 18: {
                        zzlw.zzb(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 19: {
                        zzlw.zzf(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 20: {
                        zzlw.zzh(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 21: {
                        zzlw.zzn(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 22: {
                        zzlw.zzg(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 23: {
                        zzlw.zze(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 24: {
                        zzlw.zzd(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 25: {
                        zzlw.zza(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 26: {
                        zzlw.zzb(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0);
                        break;
                    }
                    case 27: {
                        zzlw.zzb(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, this.zze(v));
                        break;
                    }
                    case 28: {
                        zzlw.zza(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0);
                        break;
                    }
                    case 29: {
                        zzlw.zzm(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 30: {
                        zzlw.zzc(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 0x1F: {
                        zzlw.zzi(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 0x20: {
                        zzlw.zzj(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 33: {
                        zzlw.zzk(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 34: {
                        zzlw.zzl(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, false);
                        break;
                    }
                    case 35: {
                        zzlw.zzb(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 36: {
                        zzlw.zzf(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 37: {
                        zzlw.zzh(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 38: {
                        zzlw.zzn(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 39: {
                        zzlw.zzg(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 40: {
                        zzlw.zze(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 41: {
                        zzlw.zzd(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 42: {
                        zzlw.zza(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 43: {
                        zzlw.zzm(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 44: {
                        zzlw.zzc(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 45: {
                        zzlw.zzi(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 46: {
                        zzlw.zzj(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 0x2F: {
                        zzlw.zzk(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 0x30: {
                        zzlw.zzl(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, true);
                        break;
                    }
                    case 49: {
                        zzlw.zza(this.zzc[v], ((List)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))), zznb0, this.zze(v));
                        break;
                    }
                    case 50: {
                        this.zza(zznb0, v2, zzml.zze(object0, ((long)(v1 & 0xFFFFF))), v);
                        break;
                    }
                    case 51: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zza(v2, zzlg.zza(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zza(v2, zzlg.zzb(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 53: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzb(v2, zzlg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 54: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zze(v2, zzlg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 55: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzc(v2, zzlg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 56: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zza(v2, zzlg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 57: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzb(v2, zzlg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 58: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zza(v2, zzlg.zze(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 59: {
                        if(this.zzc(object0, v2, v)) {
                            zzlg.zza(v2, zzml.zze(object0, ((long)(v1 & 0xFFFFF))), zznb0);
                        }
                        break;
                    }
                    case 60: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzb(v2, zzml.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                        break;
                    }
                    case 61: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zza(v2, ((zzik)zzml.zze(object0, ((long)(v1 & 0xFFFFF)))));
                        }
                        break;
                    }
                    case 62: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzf(v2, zzlg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zza(v2, zzlg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzd(v2, zzlg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 65: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzc(v2, zzlg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 66: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zze(v2, zzlg.zzc(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 67: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zzd(v2, zzlg.zzd(object0, ((long)(v1 & 0xFFFFF))));
                        }
                        break;
                    }
                    case 68: {
                        if(this.zzc(object0, v2, v)) {
                            zznb0.zza(v2, zzml.zze(object0, ((long)(v1 & 0xFFFFF))), this.zze(v));
                        }
                    }
                }
            }
            while(map$Entry0 != null) {
                this.zzq.zza(zznb0, map$Entry0);
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
        if(this.zzh) {
            zzjm zzjm1 = this.zzq.zza(object0);
            if(zzjm1.zza.isEmpty()) {
                map$Entry1 = null;
                iterator2 = null;
            }
            else {
                Iterator iterator1 = zzjm1.zzd();
                Object object4 = iterator1.next();
                map$Entry1 = (Map.Entry)object4;
                iterator2 = iterator1;
            }
        }
        else {
            map$Entry1 = null;
            iterator2 = null;
        }
        int v3 = this.zzc.length;
        Unsafe unsafe0 = zzlg.zzb;
        int v4 = 0xFFFFF;
        int v5 = 0;
        int v6 = 0;
        while(v6 < v3) {
            int v7 = this.zzc(v6);
            int[] arr_v = this.zzc;
            int v8 = arr_v[v6];
            int v9 = (v7 & 0xFF00000) >>> 20;
            if(v9 <= 17) {
                int v10 = arr_v[v6 + 2];
                int v11 = v10 & 0xFFFFF;
                if(v11 == v4) {
                    iterator3 = iterator2;
                }
                else {
                    if(v11 == 0xFFFFF) {
                        iterator3 = iterator2;
                        v5 = 0;
                    }
                    else {
                        iterator3 = iterator2;
                        v5 = unsafe0.getInt(object0, ((long)v11));
                    }
                    v4 = v11;
                }
                map$Entry2 = map$Entry1;
                v12 = v5;
                v13 = 1 << (v10 >>> 20);
                v14 = v4;
            }
            else {
                iterator3 = iterator2;
                v14 = v4;
                map$Entry2 = map$Entry1;
                v12 = v5;
                v13 = 0;
            }
            while(map$Entry2 != null && this.zzq.zza(map$Entry2) <= v8) {
                this.zzq.zza(zznb0, map$Entry2);
                if(iterator3.hasNext()) {
                    Object object5 = iterator3.next();
                    map$Entry2 = (Map.Entry)object5;
                }
                else {
                    map$Entry2 = null;
                }
            }
            long v15 = (long)(v7 & 0xFFFFF);
            switch(v9) {
                case 0: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zza(v8, zzml.zza(object0, v15));
                    }
                    break;
                }
                case 1: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zza(v8, zzml.zzb(object0, v15));
                    }
                    break;
                }
                case 2: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zzb(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 3: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zze(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 4: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zzc(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 5: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zza(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 6: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zzb(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 7: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zza(v8, zzml.zzh(object0, v15));
                    }
                    break;
                }
                case 8: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zzlg.zza(v8, unsafe1.getObject(object0, v15), zznb0);
                    }
                    break;
                }
                case 9: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zzb(v8, unsafe1.getObject(object0, v15), this.zze(v18));
                    }
                    break;
                }
                case 10: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zza(v8, ((zzik)unsafe1.getObject(object0, v15)));
                    }
                    break;
                }
                case 11: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zzf(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 12: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zza(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 13: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zzd(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 14: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zzc(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 15: {
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v18, v16, v12, v13)) {
                        zznb0.zze(v8, unsafe1.getInt(object0, v15));
                    }
                    break;
                }
                case 16: {
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    v16 = v14;
                    if(this.zza(object0, v18, v14, v12, v13)) {
                        zznb0.zzd(v8, unsafe1.getLong(object0, v15));
                    }
                    break;
                }
                case 17: {
                    map$Entry3 = map$Entry2;
                    v18 = v6;
                    v17 = v3;
                    unsafe1 = unsafe0;
                    if(this.zza(object0, v6, v14, v12, v13)) {
                        zznb0.zza(v8, unsafe1.getObject(object0, v15), this.zze(v18));
                    }
                    v16 = v14;
                    break;
                }
                case 18: {
                    zzlw.zzb(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 19: {
                    zzlw.zzf(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 20: {
                    zzlw.zzh(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 21: {
                    zzlw.zzn(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 22: {
                    zzlw.zzg(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 23: {
                    zzlw.zze(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 24: {
                    zzlw.zzd(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 25: {
                    zzlw.zza(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 26: {
                    zzlw.zzb(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0);
                    goto label_532;
                }
                case 27: {
                    zzlw.zzb(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, this.zze(v6));
                    goto label_532;
                }
                case 28: {
                    zzlw.zza(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0);
                    goto label_532;
                }
                case 29: {
                    zzlw.zzm(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 30: {
                    zzlw.zzc(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 0x1F: {
                    zzlw.zzi(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 0x20: {
                    zzlw.zzj(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 33: {
                    zzlw.zzk(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 34: {
                    zzlw.zzl(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, false);
                    goto label_532;
                }
                case 35: {
                    zzlw.zzb(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 36: {
                    zzlw.zzf(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 37: {
                    zzlw.zzh(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 38: {
                    zzlw.zzn(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 39: {
                    zzlw.zzg(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 40: {
                    zzlw.zze(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 41: {
                    zzlw.zzd(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 42: {
                    zzlw.zza(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 43: {
                    zzlw.zzm(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 44: {
                    zzlw.zzc(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 45: {
                    zzlw.zzi(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 46: {
                    zzlw.zzj(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 0x2F: {
                    zzlw.zzk(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 0x30: {
                    zzlw.zzl(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, true);
                    goto label_532;
                }
                case 49: {
                    zzlw.zza(this.zzc[v6], ((List)unsafe0.getObject(object0, v15)), zznb0, this.zze(v6));
                    goto label_532;
                }
                case 50: {
                    this.zza(zznb0, v8, unsafe0.getObject(object0, v15), v6);
                    goto label_532;
                }
                case 51: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zza(v8, zzlg.zza(object0, v15));
                    }
                    goto label_532;
                }
                case 52: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zza(v8, zzlg.zzb(object0, v15));
                    }
                    goto label_532;
                }
                case 53: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzb(v8, zzlg.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 54: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zze(v8, zzlg.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 55: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzc(v8, zzlg.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 56: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zza(v8, zzlg.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 57: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzb(v8, zzlg.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 58: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zza(v8, zzlg.zze(object0, v15));
                    }
                    goto label_532;
                }
                case 59: {
                    if(this.zzc(object0, v8, v6)) {
                        zzlg.zza(v8, unsafe0.getObject(object0, v15), zznb0);
                    }
                    goto label_532;
                }
                case 60: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzb(v8, unsafe0.getObject(object0, v15), this.zze(v6));
                    }
                    goto label_532;
                }
                case 61: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zza(v8, ((zzik)unsafe0.getObject(object0, v15)));
                    }
                    goto label_532;
                }
                case 62: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzf(v8, zzlg.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 0x3F: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zza(v8, zzlg.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 0x40: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzd(v8, zzlg.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 65: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzc(v8, zzlg.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 66: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zze(v8, zzlg.zzc(object0, v15));
                    }
                    goto label_532;
                }
                case 67: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zzd(v8, zzlg.zzd(object0, v15));
                    }
                    goto label_532;
                }
                case 68: {
                    if(this.zzc(object0, v8, v6)) {
                        zznb0.zza(v8, unsafe0.getObject(object0, v15), this.zze(v6));
                    }
                label_532:
                    v16 = v14;
                    map$Entry3 = map$Entry2;
                    v17 = v3;
                    v18 = v6;
                    unsafe1 = unsafe0;
                    break;
                }
                default: {
                    goto label_532;
                }
            }
            v6 = v18 + 3;
            v5 = v12;
            unsafe0 = unsafe1;
            iterator2 = iterator3;
            map$Entry1 = map$Entry3;
            v3 = v17;
            v4 = v16;
        }
        while(map$Entry1 != null) {
            this.zzq.zza(zznb0, map$Entry1);
            if(iterator2.hasNext()) {
                Object object6 = iterator2.next();
                map$Entry1 = (Map.Entry)object6;
            }
            else {
                map$Entry1 = null;
            }
        }
        zzlg.zza(this.zzp, object0, zznb0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, Object object1) {
        zzlg.zzf(object0);
        object1.getClass();
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzc(v);
            long v2 = (long)(0xFFFFF & v1);
            int v3 = this.zzc[v];
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zza(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 1: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzb(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 2: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 3: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 4: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 5: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 6: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 7: {
                    if(this.zzc(object1, v)) {
                        zzml.zzc(object0, v2, zzml.zzh(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 8: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zze(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 9: {
                    this.zza(object0, object1, v);
                    break;
                }
                case 10: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zze(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 11: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 12: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 13: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 14: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzd(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 15: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzc(object1, v2));
                        this.zzb(object0, v);
                    }
                    break;
                }
                case 16: {
                    if(this.zzc(object1, v)) {
                        zzml.zza(object0, v2, zzml.zzd(object1, v2));
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
                    this.zzo.zza(object0, object1, v2);
                    break;
                }
                case 50: {
                    zzlw.zza(this.zzr, object0, object1, v2);
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
                    if(this.zzc(object1, v3, v)) {
                        zzml.zza(object0, v2, zzml.zze(object1, v2));
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
                    if(this.zzc(object1, v3, v)) {
                        zzml.zza(object0, v2, zzml.zze(object1, v2));
                        this.zzb(object0, v3, v);
                    }
                    break;
                }
                case 68: {
                    this.zzb(object0, object1, v);
                }
            }
        }
        zzlw.zza(this.zzp, object0, object1);
        if(this.zzh) {
            zzlw.zza(this.zzq, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzij zzij0) throws IOException {
        this.zza(object0, arr_b, v, v1, 0, zzij0);
    }

    private static float zzb(Object object0, long v) {
        return (float)(((Float)zzml.zze(object0, v)));
    }

    private final int zzb(int v) {
        return this.zzc[v + 2];
    }

    private final void zzb(Object object0, int v) {
        int v1 = this.zzb(v);
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        zzml.zza(object0, ((long)(0xFFFFF & v1)), 1 << (v1 >>> 20) | zzml.zzc(object0, ((long)(0xFFFFF & v1))));
    }

    private final void zzb(Object object0, int v, int v1) {
        zzml.zza(object0, ((long)(this.zzb(v1) & 0xFFFFF)), v);
    }

    private final void zzb(Object object0, Object object1, int v) {
        int v1 = this.zzc[v];
        if(!this.zzc(object1, v1, v)) {
            return;
        }
        int v2 = this.zzc(v);
        Unsafe unsafe0 = zzlg.zzb;
        Object object2 = unsafe0.getObject(object1, ((long)(v2 & 0xFFFFF)));
        if(object2 == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[v] + " is present but null: " + object1);
        }
        zzlu zzlu0 = this.zze(v);
        if(!this.zzc(object0, v1, v)) {
            if(zzlg.zzg(object2)) {
                Object object3 = zzlu0.zza();
                zzlu0.zza(object3, object2);
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object3);
            }
            else {
                unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object2);
            }
            this.zzb(object0, v1, v);
            return;
        }
        Object object4 = unsafe0.getObject(object0, ((long)(v2 & 0xFFFFF)));
        if(!zzlg.zzg(object4)) {
            Object object5 = zzlu0.zza();
            zzlu0.zza(object5, object4);
            unsafe0.putObject(object0, ((long)(v2 & 0xFFFFF)), object5);
            object4 = object5;
        }
        zzlu0.zza(object4, object2);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object object0) {
        int v7;
        int v6;
        int v1 = 0;
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v2 = this.zzc(v);
            int v3 = this.zzc[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    v6 = v1 * 53;
                    v7 = zzjv.zza(Double.doubleToLongBits(zzml.zza(object0, v4)));
                    v1 = v6 + v7;
                    break;
                }
                case 1: {
                    v6 = v1 * 53;
                    v7 = Float.floatToIntBits(zzml.zzb(object0, v4));
                    v1 = v6 + v7;
                    break;
                }
                case 2: {
                    v1 = v1 * 53 + zzjv.zza(zzml.zzd(object0, v4));
                    break;
                }
                case 3: {
                    v1 = v1 * 53 + zzjv.zza(zzml.zzd(object0, v4));
                    break;
                }
                case 4: {
                    v1 = v1 * 53 + zzml.zzc(object0, v4);
                    break;
                }
                case 5: {
                    v1 = v1 * 53 + zzjv.zza(zzml.zzd(object0, v4));
                    break;
                }
                case 6: {
                    v1 = v1 * 53 + zzml.zzc(object0, v4);
                    break;
                }
                case 7: {
                    v1 = v1 * 53 + zzjv.zza(zzml.zzh(object0, v4));
                    break;
                }
                case 8: {
                    v1 = v1 * 53 + ((String)zzml.zze(object0, v4)).hashCode();
                    break;
                }
                case 9: {
                    Object object1 = zzml.zze(object0, v4);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = v1 * 53 + zzml.zze(object0, v4).hashCode();
                    break;
                }
                case 11: {
                    v1 = v1 * 53 + zzml.zzc(object0, v4);
                    break;
                }
                case 12: {
                    v1 = v1 * 53 + zzml.zzc(object0, v4);
                    break;
                }
                case 13: {
                    v1 = v1 * 53 + zzml.zzc(object0, v4);
                    break;
                }
                case 14: {
                    v1 = v1 * 53 + zzjv.zza(zzml.zzd(object0, v4));
                    break;
                }
                case 15: {
                    v1 = v1 * 53 + zzml.zzc(object0, v4);
                    break;
                }
                case 16: {
                    v1 = v1 * 53 + zzjv.zza(zzml.zzd(object0, v4));
                    break;
                }
                case 17: {
                    Object object2 = zzml.zze(object0, v4);
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
                    v1 = v1 * 53 + zzml.zze(object0, v4).hashCode();
                    break;
                }
                case 50: {
                    v1 = v1 * 53 + zzml.zze(object0, v4).hashCode();
                    break;
                }
                case 51: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzjv.zza(Double.doubleToLongBits(zzlg.zza(object0, v4)));
                    }
                    break;
                }
                case 52: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + Float.floatToIntBits(zzlg.zzb(object0, v4));
                    }
                    break;
                }
                case 53: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzjv.zza(zzlg.zzd(object0, v4));
                    }
                    break;
                }
                case 54: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzjv.zza(zzlg.zzd(object0, v4));
                    }
                    break;
                }
                case 55: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzlg.zzc(object0, v4);
                    }
                    break;
                }
                case 56: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzjv.zza(zzlg.zzd(object0, v4));
                    }
                    break;
                }
                case 57: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzlg.zzc(object0, v4);
                    }
                    break;
                }
                case 58: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzjv.zza(zzlg.zze(object0, v4));
                    }
                    break;
                }
                case 59: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + ((String)zzml.zze(object0, v4)).hashCode();
                    }
                    break;
                }
                case 60: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzml.zze(object0, v4).hashCode();
                    }
                    break;
                }
                case 61: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzml.zze(object0, v4).hashCode();
                    }
                    break;
                }
                case 62: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzlg.zzc(object0, v4);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzlg.zzc(object0, v4);
                    }
                    break;
                }
                case 0x40: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzlg.zzc(object0, v4);
                    }
                    break;
                }
                case 65: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzjv.zza(zzlg.zzd(object0, v4));
                    }
                    break;
                }
                case 66: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzlg.zzc(object0, v4);
                    }
                    break;
                }
                case 67: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzjv.zza(zzlg.zzd(object0, v4));
                    }
                    break;
                }
                case 68: {
                    if(this.zzc(object0, v3, v)) {
                        v1 = v1 * 53 + zzml.zze(object0, v4).hashCode();
                    }
                }
            }
        }
        int v8 = v1 * 53 + this.zzp.zzd(object0).hashCode();
        return this.zzh ? v8 * 53 + this.zzq.zza(object0).hashCode() : v8;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzb(Object object0, Object object1) {
        for(int v = 0; true; v += 3) {
            boolean z = true;
            if(v >= this.zzc.length) {
                break;
            }
            int v1 = this.zzc(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch((v1 & 0xFF00000) >>> 20) {
                case 0: {
                    if(!this.zzc(object0, object1, v) || Double.doubleToLongBits(zzml.zza(object0, v2)) != Double.doubleToLongBits(zzml.zza(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 1: {
                    if(!this.zzc(object0, object1, v) || Float.floatToIntBits(zzml.zzb(object0, v2)) != Float.floatToIntBits(zzml.zzb(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 2: {
                    if(!this.zzc(object0, object1, v) || zzml.zzd(object0, v2) != zzml.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 3: {
                    if(!this.zzc(object0, object1, v) || zzml.zzd(object0, v2) != zzml.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 4: {
                    if(!this.zzc(object0, object1, v) || zzml.zzc(object0, v2) != zzml.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 5: {
                    if(!this.zzc(object0, object1, v) || zzml.zzd(object0, v2) != zzml.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 6: {
                    if(!this.zzc(object0, object1, v) || zzml.zzc(object0, v2) != zzml.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 7: {
                    if(!this.zzc(object0, object1, v) || zzml.zzh(object0, v2) != zzml.zzh(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 8: {
                    if(!this.zzc(object0, object1, v) || !zzlw.zza(zzml.zze(object0, v2), zzml.zze(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 9: {
                    if(!this.zzc(object0, object1, v) || !zzlw.zza(zzml.zze(object0, v2), zzml.zze(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 10: {
                    if(!this.zzc(object0, object1, v) || !zzlw.zza(zzml.zze(object0, v2), zzml.zze(object1, v2))) {
                        z = false;
                    }
                    break;
                }
                case 11: {
                    if(!this.zzc(object0, object1, v) || zzml.zzc(object0, v2) != zzml.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 12: {
                    if(!this.zzc(object0, object1, v) || zzml.zzc(object0, v2) != zzml.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 13: {
                    if(!this.zzc(object0, object1, v) || zzml.zzc(object0, v2) != zzml.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 14: {
                    if(!this.zzc(object0, object1, v) || zzml.zzd(object0, v2) != zzml.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 15: {
                    if(!this.zzc(object0, object1, v) || zzml.zzc(object0, v2) != zzml.zzc(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 16: {
                    if(!this.zzc(object0, object1, v) || zzml.zzd(object0, v2) != zzml.zzd(object1, v2)) {
                        z = false;
                    }
                    break;
                }
                case 17: {
                    if(!this.zzc(object0, object1, v) || !zzlw.zza(zzml.zze(object0, v2), zzml.zze(object1, v2))) {
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
                    z = zzlw.zza(zzml.zze(object0, v2), zzml.zze(object1, v2));
                    break;
                }
                case 50: {
                    z = zzlw.zza(zzml.zze(object0, v2), zzml.zze(object1, v2));
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
                    int v3 = this.zzb(v);
                    if(zzml.zzc(object0, ((long)(v3 & 0xFFFFF))) != zzml.zzc(object1, ((long)(v3 & 0xFFFFF))) || !zzlw.zza(zzml.zze(object0, v2), zzml.zze(object1, v2))) {
                        z = false;
                    }
                }
            }
            if(!z) {
                return false;
            }
        }
        if(!this.zzp.zzd(object0).equals(this.zzp.zzd(object1))) {
            return false;
        }
        return this.zzh ? this.zzq.zza(object0).equals(this.zzq.zza(object1)) : true;
    }

    private final int zzc(int v) {
        return this.zzc[v + 1];
    }

    private static int zzc(Object object0, long v) {
        return (int)(((Integer)zzml.zze(object0, v)));
    }

    static zzmj zzc(Object object0) {
        zzmj zzmj0 = ((zzjt)object0).zzb;
        if(zzmj0 == zzmj.zzc()) {
            zzmj0 = zzmj.zzd();
            ((zzjt)object0).zzb = zzmj0;
        }
        return zzmj0;
    }

    private final boolean zzc(Object object0, int v) {
        int v1 = this.zzb(v);
        if(((long)(v1 & 0xFFFFF)) == 0xFFFFFL) {
            int v2 = this.zzc(v);
            switch((v2 & 0xFF00000) >>> 20) {
                case 0: {
                    return Double.doubleToRawLongBits(zzml.zza(object0, ((long)(v2 & 0xFFFFF)))) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(zzml.zzb(object0, ((long)(v2 & 0xFFFFF)))) != 0;
                }
                case 2: {
                    return zzml.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 3: {
                    return zzml.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 4: {
                    return zzml.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 5: {
                    return zzml.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 6: {
                    return zzml.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 7: {
                    return zzml.zzh(object0, ((long)(v2 & 0xFFFFF)));
                }
                case 8: {
                    Object object1 = zzml.zze(object0, ((long)(v2 & 0xFFFFF)));
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzik)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzik.zza.equals(object1);
                }
                case 9: {
                    return zzml.zze(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                case 10: {
                    Object object2 = zzml.zze(object0, ((long)(v2 & 0xFFFFF)));
                    return !zzik.zza.equals(object2);
                }
                case 11: {
                    return zzml.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 12: {
                    return zzml.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 13: {
                    return zzml.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 14: {
                    return zzml.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 15: {
                    return zzml.zzc(object0, ((long)(v2 & 0xFFFFF))) != 0;
                }
                case 16: {
                    return zzml.zzd(object0, ((long)(v2 & 0xFFFFF))) != 0L;
                }
                case 17: {
                    return zzml.zze(object0, ((long)(v2 & 0xFFFFF))) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (zzml.zzc(object0, ((long)(v1 & 0xFFFFF))) & 1 << (v1 >>> 20)) != 0;
    }

    private final boolean zzc(Object object0, int v, int v1) {
        return zzml.zzc(object0, ((long)(this.zzb(v1) & 0xFFFFF))) == v;
    }

    private final boolean zzc(Object object0, Object object1, int v) {
        return this.zzc(object0, v) == this.zzc(object1, v);
    }

    private static long zzd(Object object0, long v) {
        return (long)(((Long)zzml.zze(object0, v)));
    }

    private final zzjx zzd(int v) {
        return (zzjx)this.zzd[(v / 3 << 1) + 1];
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final void zzd(Object object0) {
        if(!zzlg.zzg(object0)) {
            return;
        }
        if(object0 instanceof zzjt) {
            ((zzjt)object0).zzc(0x7FFFFFFF);
            ((zzjt)object0).zza = 0;
            ((zzjt)object0).zzcm();
        }
        for(int v = 0; v < this.zzc.length; v += 3) {
            int v1 = this.zzc(v);
            long v2 = (long)(0xFFFFF & v1);
            switch((v1 & 0xFF00000) >>> 20) {
                case 9: 
                case 17: {
                    if(this.zzc(object0, v)) {
                        this.zze(v).zzd(zzlg.zzb.getObject(object0, v2));
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
                    this.zzo.zzb(object0, v2);
                    break;
                }
                case 50: {
                    Unsafe unsafe0 = zzlg.zzb;
                    Object object1 = unsafe0.getObject(object0, v2);
                    if(object1 != null) {
                        unsafe0.putObject(object0, v2, this.zzr.zzc(object1));
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.zzc(object0, this.zzc[v], v)) {
                        this.zze(v).zzd(zzlg.zzb.getObject(object0, v2));
                    }
                }
            }
        }
        this.zzp.zzf(object0);
        if(this.zzh) {
            this.zzq.zzc(object0);
        }
    }

    private final zzlu zze(int v) {
        int v1 = v / 3 << 1;
        zzlu zzlu0 = (zzlu)this.zzd[v1];
        if(zzlu0 != null) {
            return zzlu0;
        }
        zzlu zzlu1 = zzlq.zza().zza(((Class)this.zzd[v1 + 1]));
        this.zzd[v1] = zzlu1;
        return zzlu1;
    }

    private static boolean zze(Object object0, long v) {
        return ((Boolean)zzml.zze(object0, v)).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlu
    public final boolean zze(Object object0) {
        int v10;
        int v9;
        int v = 0xFFFFF;
        int v1 = 0;
        int v2 = 0;
        while(v2 < this.zzl) {
            int v3 = this.zzk[v2];
            int v4 = this.zzc[v3];
            int v5 = this.zzc(v3);
            int v6 = this.zzc[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 == v) {
                v10 = v;
                v9 = v1;
            }
            else {
                if(v7 != 0xFFFFF) {
                    v1 = zzlg.zzb.getInt(object0, ((long)v7));
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
                    if(this.zza(object0, v3, v10, v9, v8) && !zzlg.zza(object0, v5, this.zze(v3))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)zzml.zze(object0, ((long)(v5 & 0xFFFFF)));
                    if(!list0.isEmpty()) {
                        zzlu zzlu1 = this.zze(v3);
                        for(int v11 = 0; v11 < list0.size(); ++v11) {
                            if(!zzlu1.zze(list0.get(v11))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    Object object1 = zzml.zze(object0, ((long)(v5 & 0xFFFFF)));
                    Map map0 = this.zzr.zzd(object1);
                    if(!map0.isEmpty()) {
                        Object object2 = this.zzf(v3);
                        if(this.zzr.zza(object2).zzc.zzb() == zzmz.zzi) {
                            zzlu zzlu0 = null;
                            Iterator iterator0 = map0.values().iterator();
                            while(true) {
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object3 = iterator0.next();
                                if(zzlu0 == null) {
                                    zzlu0 = zzlq.zza().zza(object3.getClass());
                                }
                                if(zzlu0.zze(object3)) {
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
                    if(this.zzc(object0, v4, v3) && !zzlg.zza(object0, v5, this.zze(v3))) {
                        return false;
                    }
                }
            }
            ++v2;
            v = v10;
            v1 = v9;
        }
        return !this.zzh || this.zzq.zza(object0).zzg();
    }

    private final Object zzf(int v) {
        return this.zzd[v / 3 << 1];
    }

    private static void zzf(Object object0) {
        if(!zzlg.zzg(object0)) {
            throw new IllegalArgumentException("Mutating immutable message: " + object0);
        }
    }

    private static boolean zzg(int v) {
        return (v & 0x20000000) != 0;
    }

    private static boolean zzg(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 instanceof zzjt ? ((zzjt)object0).zzco() : true;
    }
}

