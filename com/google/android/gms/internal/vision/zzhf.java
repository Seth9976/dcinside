package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzhf implements zzkk {
    protected int zza;

    public zzhf() {
        this.zza = 0;
    }

    protected static void zza(Iterable iterable0, List list0) {
        zzjf.zza(iterable0);
        if(iterable0 instanceof zzjv) {
            List list1 = ((zzjv)iterable0).zzd();
            int v = list0.size();
            for(Object object0: list1) {
                if(object0 == null) {
                    String s = "Element at index " + (((zzjv)list0).size() - v) + " is null.";
                    for(int v1 = ((zzjv)list0).size() - 1; v1 >= v; --v1) {
                        ((zzjv)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzht) {
                    ((zzjv)list0).zza(((zzht)object0));
                }
                else {
                    ((zzjv)list0).add(((String)object0));
                }
            }
            return;
        }
        if(iterable0 instanceof zzkw) {
            list0.addAll(((Collection)iterable0));
            return;
        }
        if(list0 instanceof ArrayList && iterable0 instanceof Collection) {
            ((ArrayList)list0).ensureCapacity(list0.size() + ((Collection)iterable0).size());
        }
        int v2 = list0.size();
        for(Object object1: iterable0) {
            if(object1 == null) {
                String s1 = "Element at index " + (list0.size() - v2) + " is null.";
                for(int v3 = list0.size() - 1; v3 >= v2; --v3) {
                    list0.remove(v3);
                }
                throw new NullPointerException(s1);
            }
            list0.add(object1);
        }
    }

    void zzb(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.vision.zzkk
    public final zzht zzg() {
        try {
            zzib zzib0 = zzht.zzc(this.zzm());
            this.zza(zzib0.zzb());
            return zzib0.zza();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a " + "ByteString" + " threw an IOException (should never happen).", iOException0);
        }
    }

    public final byte[] zzh() {
        try {
            byte[] arr_b = new byte[this.zzm()];
            zzii zzii0 = zzii.zza(arr_b);
            this.zza(zzii0);
            zzii0.zzb();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a " + "byte array" + " threw an IOException (should never happen).", iOException0);
        }
    }

    int zzi() {
        throw new UnsupportedOperationException();
    }
}

