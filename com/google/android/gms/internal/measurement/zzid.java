package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzid implements zzlb {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzaf();
    }

    private final String zza(String s) [...] // 潜在的解密器

    protected static void zza(Iterable iterable0, List list0) {
        zzjv.zza(iterable0);
        if(iterable0 instanceof zzkj) {
            List list1 = ((zzkj)iterable0).zza();
            int v = list0.size();
            for(Object object0: list1) {
                if(object0 == null) {
                    String s = "Element at index " + (((zzkj)list0).size() - v) + " is null.";
                    for(int v1 = ((zzkj)list0).size() - 1; v1 >= v; --v1) {
                        ((zzkj)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzik) {
                    ((zzkj)list0).zza(((zzik)object0));
                }
                else if(object0 instanceof byte[]) {
                    ((zzkj)list0).zza(zzik.zza(((byte[])object0)));
                }
                else {
                    ((zzkj)list0).add(((String)object0));
                }
            }
            return;
        }
        if(iterable0 instanceof zzlo) {
            list0.addAll(((Collection)iterable0));
            return;
        }
        if(iterable0 instanceof Collection) {
            int v2 = ((Collection)iterable0).size();
            if(list0 instanceof ArrayList) {
                ((ArrayList)list0).ensureCapacity(list0.size() + v2);
            }
            if(list0 instanceof zzlp) {
                ((zzlp)list0).zzb(list0.size() + v2);
            }
        }
        int v3 = list0.size();
        if(iterable0 instanceof List && iterable0 instanceof RandomAccess) {
            int v4 = ((List)iterable0).size();
            for(int v5 = 0; v5 < v4; ++v5) {
                Object object1 = ((List)iterable0).get(v5);
                if(object1 == null) {
                    zzid.zza(list0, v3);
                }
                list0.add(object1);
            }
            return;
        }
        for(Object object2: iterable0) {
            if(object2 == null) {
                zzid.zza(list0, v3);
            }
            list0.add(object2);
        }
    }

    private static void zza(List list0, int v) {
        String s = "Element at index " + (list0.size() - v) + " is null.";
        for(int v1 = list0.size() - 1; v1 >= v; --v1) {
            list0.remove(v1);
        }
        throw new NullPointerException(s);
    }

    public abstract zzid zza(zziw arg1, zzjg arg2) throws IOException;

    public zzid zza(byte[] arr_b, int v, int v1) throws zzkb {
        try {
            zziw zziw0 = zziw.zza(arr_b, 0, v1, false);
            this.zzb(zziw0, zzjg.zza);
            zziw0.zzc(0);
            return this;
        }
        catch(zzkb zzkb0) {
            throw zzkb0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.measurement.zzid from a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    public zzid zza(byte[] arr_b, int v, int v1, zzjg zzjg0) throws zzkb {
        try {
            zziw zziw0 = zziw.zza(arr_b, 0, v1, false);
            this.zzb(zziw0, zzjg0);
            zziw0.zzc(0);
            return this;
        }
        catch(zzkb zzkb0) {
            throw zzkb0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.measurement.zzid from a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final zzlb zza(byte[] arr_b) throws zzkb {
        return this.zza(arr_b, 0, arr_b.length);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final zzlb zza(byte[] arr_b, zzjg zzjg0) throws zzkb {
        return this.zza(arr_b, 0, arr_b.length, zzjg0);
    }

    public abstract zzid zzaf();

    public zzlb zzb(zziw zziw0, zzjg zzjg0) throws IOException {
        return this.zza(zziw0, zzjg0);
    }
}

