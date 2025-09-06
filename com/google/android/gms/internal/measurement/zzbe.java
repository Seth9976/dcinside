package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzbe {
    private static zzaf zza(zzaf zzaf0, zzh zzh0, zzal zzal0) {
        return zzbe.zza(zzaf0, zzh0, zzal0, null, null);
    }

    private static zzaf zza(zzaf zzaf0, zzh zzh0, zzal zzal0, Boolean boolean0, Boolean boolean1) {
        zzaf zzaf1 = new zzaf();
        Iterator iterator0 = zzaf0.zzg();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            int v = (int)(((Integer)object0));
            if(zzaf0.zzc(v)) {
                zzaq zzaq0 = zzal0.zza(zzh0, Arrays.asList(new zzaq[]{zzaf0.zza(v), new zzai(((double)v)), zzaf0}));
                if(zzaq0.zzd().equals(boolean0)) {
                    return zzaf1;
                }
                if(boolean1 == null || zzaq0.zzd().equals(boolean1)) {
                    zzaf1.zzb(v, zzaq0);
                }
            }
        }
        return zzaf1;
    }

    private static zzaq zza(zzaf zzaf0, zzh zzh0, List list0, boolean z) {
        zzaq zzaq1;
        zzg.zzb("reduce", 1, list0);
        zzg.zzc("reduce", 2, list0);
        zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
        if(!(zzaq0 instanceof zzal)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if(list0.size() == 2) {
            zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
            if(zzaq1 instanceof zzaj) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        }
        else {
            if(zzaf0.zzb() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaq1 = null;
        }
        int v = zzaf0.zzb();
        int v1 = z ? 0 : v - 1;
        if(zzaq1 == null) {
            zzaq1 = zzaf0.zza(v1);
            v1 += (z ? 1 : -1);
        }
        while(((z ? v - 1 : 0) - v1) * (z ? 1 : -1) >= 0) {
            if(zzaf0.zzc(v1)) {
                zzaq1 = ((zzal)zzaq0).zza(zzh0, Arrays.asList(new zzaq[]{zzaq1, zzaf0.zza(v1), new zzai(((double)v1)), zzaf0}));
                if(zzaq1 instanceof zzaj) {
                    throw new IllegalStateException("Reduce operation failed");
                }
            }
            v1 += (z ? 1 : -1);
        }
        return zzaq1;
    }

    public static zzaq zza(String s, zzaf zzaf0, zzh zzh0, List list0) {
        zzal zzal0;
        double f5;
        s.hashCode();
        switch(s) {
            case "concat": {
                zzaq zzaq0 = (zzaf)zzaf0.zzc();
                if(!list0.isEmpty()) {
                    for(Object object0: list0) {
                        zzaq zzaq1 = zzh0.zza(((zzaq)object0));
                        if(zzaq1 instanceof zzaj) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int v = ((zzaf)zzaq0).zzb();
                        if(zzaq1 instanceof zzaf) {
                            zzaf zzaf1 = (zzaf)zzaq1;
                            Iterator iterator1 = zzaf1.zzg();
                            while(iterator1.hasNext()) {
                                Object object1 = iterator1.next();
                                ((zzaf)zzaq0).zzb(((int)(((Integer)object1))) + v, zzaf1.zza(((int)(((Integer)object1)))));
                            }
                        }
                        else {
                            ((zzaf)zzaq0).zzb(v, zzaq1);
                        }
                    }
                }
                return zzaq0;
            }
            case "every": {
                zzg.zza("every", 1, list0);
                zzaq zzaq15 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq15 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                return zzaf0.zzb() == 0 || zzbe.zza(zzaf0, zzh0, ((zzar)zzaq15), Boolean.FALSE, Boolean.TRUE).zzb() == zzaf0.zzb() ? zzaq.zzh : zzaq.zzi;
            }
            case "filter": {
                zzg.zza("filter", 1, list0);
                zzaq zzaq2 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq2 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(zzaf0.zza() == 0) {
                    return new zzaf();
                }
                zzaf zzaf2 = (zzaf)zzaf0.zzc();
                zzaf zzaf3 = zzbe.zza(zzaf0, zzh0, ((zzar)zzaq2), null, Boolean.TRUE);
                zzaq zzaq3 = new zzaf();
                Iterator iterator2 = zzaf3.zzg();
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    ((zzaf)zzaq3).zza(zzaf2.zza(((int)(((Integer)object2)))));
                }
                return zzaq3;
            }
            case "forEach": {
                zzg.zza("forEach", 1, list0);
                zzaq zzaq6 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq6 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(zzaf0.zza() == 0) {
                    return zzaq.zzc;
                }
                zzbe.zza(zzaf0, zzh0, ((zzar)zzaq6));
                return zzaq.zzc;
            }
            case "indexOf": {
                zzg.zzc("indexOf", 2, list0);
                zzaq zzaq19 = list0.isEmpty() ? zzaq.zzc : zzh0.zza(((zzaq)list0.get(0)));
                if(list0.size() > 1) {
                    f5 = zzg.zza(((double)zzh0.zza(((zzaq)list0.get(1))).zze()));
                    if(f5 >= ((double)zzaf0.zzb())) {
                        return new zzai(-1.0);
                    }
                    if(f5 < 0.0) {
                        f5 += (double)zzaf0.zzb();
                    }
                }
                else {
                    f5 = 0.0;
                }
                Iterator iterator9 = zzaf0.zzg();
                while(iterator9.hasNext()) {
                    Object object9 = iterator9.next();
                    int v15 = (int)(((Integer)object9));
                    double f6 = (double)v15;
                    if(Double.compare(f6, f5) >= 0 && zzg.zza(zzaf0.zza(v15), zzaq19)) {
                        return new zzai(f6);
                    }
                    if(false) {
                        break;
                    }
                }
                return new zzai(-1.0);
            }
            case "join": {
                zzg.zzc("join", 1, list0);
                if(zzaf0.zzb() == 0) {
                    return zzaq.zzj;
                }
                if(!list0.isEmpty()) {
                    zzaq zzaq12 = zzh0.zza(((zzaq)list0.get(0)));
                    return zzaq12 instanceof zzao || zzaq12 instanceof zzax ? new zzas("") : new zzas(zzaf0.zzb(zzaq12.zzf()));
                }
                return new zzas("");
            }
            case "lastIndexOf": {
                zzg.zzc("lastIndexOf", 2, list0);
                zzaq zzaq7 = list0.isEmpty() ? zzaq.zzc : zzh0.zza(((zzaq)list0.get(0)));
                double f = (double)(zzaf0.zzb() - 1);
                if(list0.size() > 1) {
                    zzaq zzaq8 = zzh0.zza(((zzaq)list0.get(1)));
                    f = Double.isNaN(((double)zzaq8.zze())) ? ((double)(zzaf0.zzb() - 1)) : zzg.zza(((double)zzaq8.zze()));
                    if(f < 0.0) {
                        f += (double)zzaf0.zzb();
                    }
                }
                if(f < 0.0) {
                    return new zzai(-1.0);
                }
                for(int v6 = (int)Math.min(zzaf0.zzb(), f); v6 >= 0; --v6) {
                    if(zzaf0.zzc(v6) && zzg.zza(zzaf0.zza(v6), zzaq7)) {
                        return new zzai(((double)v6));
                    }
                }
                return new zzai(-1.0);
            }
            case "map": {
                zzg.zza("map", 1, list0);
                zzaq zzaq10 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq10 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                return zzaf0.zzb() == 0 ? new zzaf() : zzbe.zza(zzaf0, zzh0, ((zzar)zzaq10));
            }
            case "pop": {
                zzg.zza("pop", 0, list0);
                int v8 = zzaf0.zzb();
                if(v8 == 0) {
                    return zzaq.zzc;
                }
                zzaq zzaq11 = zzaf0.zza(v8 - 1);
                zzaf0.zzb(v8 - 1);
                return zzaq11;
            }
            case "push": {
                if(!list0.isEmpty()) {
                    for(Object object6: list0) {
                        zzaf0.zza(zzh0.zza(((zzaq)object6)));
                    }
                }
                return new zzai(((double)zzaf0.zzb()));
            }
            case "reduce": {
                return zzbe.zza(zzaf0, zzh0, list0, true);
            }
            case "reduceRight": {
                return zzbe.zza(zzaf0, zzh0, list0, false);
            }
            case "reverse": {
                zzg.zza("reverse", 0, list0);
                int v12 = zzaf0.zzb();
                if(v12 != 0) {
                    for(int v13 = 0; v13 < v12 / 2; ++v13) {
                        if(zzaf0.zzc(v13)) {
                            zzaq zzaq18 = zzaf0.zza(v13);
                            zzaf0.zzb(v13, null);
                            int v14 = v12 - 1 - v13;
                            if(zzaf0.zzc(v14)) {
                                zzaf0.zzb(v13, zzaf0.zza(v14));
                            }
                            zzaf0.zzb(v14, zzaq18);
                        }
                    }
                }
                return zzaf0;
            }
            case "shift": {
                zzg.zza("shift", 0, list0);
                if(zzaf0.zzb() == 0) {
                    return zzaq.zzc;
                }
                zzaq zzaq16 = zzaf0.zza(0);
                zzaf0.zzb(0);
                return zzaq16;
            }
            case "slice": {
                zzg.zzc("slice", 2, list0);
                if(list0.isEmpty()) {
                    return zzaf0.zzc();
                }
                double f1 = (double)zzaf0.zzb();
                double f2 = zzg.zza(((double)zzh0.zza(((zzaq)list0.get(0))).zze()));
                double f3 = f2 < 0.0 ? Math.max(f2 + f1, 0.0) : Math.min(f2, f1);
                if(list0.size() == 2) {
                    double f4 = zzg.zza(((double)zzh0.zza(((zzaq)list0.get(1))).zze()));
                    f1 = f4 < 0.0 ? Math.max(f1 + f4, 0.0) : Math.min(f1, f4);
                }
                zzaq zzaq17 = new zzaf();
                for(int v11 = (int)f3; ((double)v11) < f1; ++v11) {
                    ((zzaf)zzaq17).zza(zzaf0.zza(v11));
                }
                return zzaq17;
            }
            case "some": {
                zzg.zza("some", 1, list0);
                zzaq zzaq13 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq13 instanceof zzal)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(zzaf0.zzb() != 0) {
                    Iterator iterator7 = zzaf0.zzg();
                    while(iterator7.hasNext()) {
                        Object object7 = iterator7.next();
                        int v9 = (int)(((Integer)object7));
                        if(zzaf0.zzc(v9) && ((zzal)zzaq13).zza(zzh0, Arrays.asList(new zzaq[]{zzaf0.zza(v9), new zzai(((double)v9)), zzaf0})).zzd().booleanValue()) {
                            return zzaq.zzh;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return zzaq.zzi;
            }
            case "sort": {
                zzg.zzc("sort", 1, list0);
                if(zzaf0.zzb() >= 2) {
                    List list1 = zzaf0.zzi();
                    if(list0.isEmpty()) {
                        zzal0 = null;
                    }
                    else {
                        zzaq zzaq14 = zzh0.zza(((zzaq)list0.get(0)));
                        if(!(zzaq14 instanceof zzal)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzal0 = (zzal)zzaq14;
                    }
                    Collections.sort(list1, new zzbh(zzal0, zzh0));
                    zzaf0.zzj();
                    int v10 = 0;
                    for(Object object8: list1) {
                        zzaf0.zzb(v10, ((zzaq)object8));
                        ++v10;
                    }
                }
                return zzaf0;
            }
            case "splice": {
                if(list0.isEmpty()) {
                    return new zzaf();
                }
                int v1 = (int)zzg.zza(((double)zzh0.zza(((zzaq)list0.get(0))).zze()));
                if(v1 < 0) {
                    v1 = Math.max(0, v1 + zzaf0.zzb());
                }
                else if(v1 > zzaf0.zzb()) {
                    v1 = zzaf0.zzb();
                }
                int v2 = zzaf0.zzb();
                zzaq zzaq4 = new zzaf();
                if(list0.size() > 1) {
                    int v3 = Math.max(0, ((int)zzg.zza(((double)zzh0.zza(((zzaq)list0.get(1))).zze()))));
                    if(v3 > 0) {
                        for(int v4 = v1; v4 < Math.min(v2, v1 + v3); ++v4) {
                            ((zzaf)zzaq4).zza(zzaf0.zza(v1));
                            zzaf0.zzb(v1);
                        }
                    }
                    if(list0.size() > 2) {
                        for(int v5 = 2; v5 < list0.size(); ++v5) {
                            zzaq zzaq5 = zzh0.zza(((zzaq)list0.get(v5)));
                            if(zzaq5 instanceof zzaj) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzaf0.zza(v1 + v5 - 2, zzaq5);
                        }
                    }
                    return zzaq4;
                }
                while(v1 < v2) {
                    ((zzaf)zzaq4).zza(zzaf0.zza(v1));
                    zzaf0.zzb(v1, null);
                    ++v1;
                }
                return zzaq4;
            }
            case "toString": {
                zzg.zza("toString", 0, list0);
                return new zzas("");
            }
            case "unshift": {
                if(!list0.isEmpty()) {
                    zzaf zzaf4 = new zzaf();
                    for(Object object3: list0) {
                        zzaq zzaq9 = zzh0.zza(((zzaq)object3));
                        if(zzaq9 instanceof zzaj) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzaf4.zza(zzaq9);
                    }
                    int v7 = zzaf4.zzb();
                    Iterator iterator4 = zzaf0.zzg();
                    while(iterator4.hasNext()) {
                        Object object4 = iterator4.next();
                        zzaf4.zzb(((int)(((Integer)object4))) + v7, zzaf0.zza(((int)(((Integer)object4)))));
                    }
                    zzaf0.zzj();
                    Iterator iterator5 = zzaf4.zzg();
                    while(iterator5.hasNext()) {
                        Object object5 = iterator5.next();
                        zzaf0.zzb(((int)(((Integer)object5))), zzaf4.zza(((int)(((Integer)object5)))));
                    }
                }
                return new zzai(((double)zzaf0.zzb()));
            }
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
        }
    }
}

