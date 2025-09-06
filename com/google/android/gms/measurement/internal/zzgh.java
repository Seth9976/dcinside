package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgh {
    private static final AtomicReference zza;
    private static final AtomicReference zzb;
    private static final AtomicReference zzc;
    private final zzgk zzd;

    static {
        zzgh.zza = new AtomicReference();
        zzgh.zzb = new AtomicReference();
        zzgh.zzc = new AtomicReference();
    }

    public zzgh(zzgk zzgk0) {
        this.zzd = zzgk0;
    }

    private static String zza(String s, String[] arr_s, String[] arr_s1, AtomicReference atomicReference0) {
        String[] arr_s2;
        Preconditions.checkNotNull(arr_s);
        Preconditions.checkNotNull(arr_s1);
        Preconditions.checkNotNull(atomicReference0);
        Preconditions.checkArgument(arr_s.length == arr_s1.length);
        for(int v = 0; v < arr_s.length; ++v) {
            if(Objects.equals(s, arr_s[v])) {
                synchronized(atomicReference0) {
                    arr_s2 = (String[])atomicReference0.get();
                    if(arr_s2 == null) {
                        arr_s2 = new String[arr_s1.length];
                        atomicReference0.set(arr_s2);
                    }
                    if(arr_s2[v] == null) {
                        arr_s2[v] = arr_s1[v] + "(" + arr_s[v] + ")";
                    }
                }
                return arr_s2[v];
            }
        }
        return s;
    }

    private final String zza(Object[] arr_object) {
        if(arr_object == null) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            String s = object0 instanceof Bundle ? this.zza(((Bundle)object0)) : String.valueOf(object0);
            if(s != null) {
                if(stringBuilder0.length() != 1) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    protected final String zza(Bundle bundle0) {
        String s;
        if(bundle0 == null) {
            return null;
        }
        if(!this.zzd.zza()) {
            return bundle0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Bundle[{");
        for(Object object0: bundle0.keySet()) {
            if(stringBuilder0.length() != 8) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.zzb(((String)object0)));
            stringBuilder0.append("=");
            Object object1 = bundle0.get(((String)object0));
            if(object1 instanceof Bundle) {
                s = this.zza(new Object[]{object1});
            }
            else if(object1 instanceof Object[]) {
                s = this.zza(((Object[])object1));
            }
            else {
                s = object1 instanceof ArrayList ? this.zza(((ArrayList)object1).toArray()) : String.valueOf(object1);
            }
            stringBuilder0.append(s);
        }
        stringBuilder0.append("}]");
        return stringBuilder0.toString();
    }

    protected final String zza(zzbf zzbf0) {
        String s = null;
        if(zzbf0 == null) {
            return null;
        }
        if(!this.zzd.zza()) {
            return zzbf0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("origin=");
        stringBuilder0.append(zzbf0.zzc);
        stringBuilder0.append(",name=");
        stringBuilder0.append(this.zza(zzbf0.zza));
        stringBuilder0.append(",params=");
        zzbe zzbe0 = zzbf0.zzb;
        if(zzbe0 != null) {
            s = this.zzd.zza() ? this.zza(zzbe0.zzb()) : zzbe0.toString();
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    protected final String zza(String s) {
        if(s == null) {
            return null;
        }
        return this.zzd.zza() ? zzgh.zza(s, zzji.zzc, zzji.zza, zzgh.zza) : s;
    }

    protected final String zzb(String s) {
        if(s == null) {
            return null;
        }
        return this.zzd.zza() ? zzgh.zza(s, zzjk.zzb, zzjk.zza, zzgh.zzb) : s;
    }

    protected final String zzc(String s) {
        if(s == null) {
            return null;
        }
        if(!this.zzd.zza()) {
            return s;
        }
        return s.startsWith("_exp_") ? "experiment_id(" + s + ")" : zzgh.zza(s, zzjj.zzb, zzjj.zza, zzgh.zzc);
    }
}

