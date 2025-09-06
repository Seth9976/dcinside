package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdbj {
    protected final Map zza;

    protected zzdbj(Set set0) {
        this.zza = new HashMap();
        this.zzp(set0);
    }

    public final void zzk(zzddk zzddk0) {
        synchronized(this) {
            this.zzo(zzddk0.zza, zzddk0.zzb);
        }
    }

    public final void zzo(Object object0, Executor executor0) {
        synchronized(this) {
            this.zza.put(object0, executor0);
        }
    }

    public final void zzp(Set set0) {
        synchronized(this) {
            for(Object object0: set0) {
                this.zzk(((zzddk)object0));
            }
        }
    }

    protected final void zzq(zzdbi zzdbi0) {
        synchronized(this) {
            for(Object object0: this.zza.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                ((Executor)((Map.Entry)object0).getValue()).execute(new zzdbh(zzdbi0, object1));
            }
        }
    }
}

