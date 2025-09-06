package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzawq extends zzaxr {
    private static final zzaxs zzh;
    private final Context zzi;

    static {
        zzawq.zzh = new zzaxs();
    }

    public zzawq(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, Context context0) {
        super(zzawd0, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", zzasc0, v, 29);
        this.zzi = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzn("E");
        AtomicReference atomicReference0 = zzawq.zzh.zza("com.dcinside.app.android");
        if(atomicReference0.get() == null) {
            synchronized(atomicReference0) {
                if(atomicReference0.get() == null) {
                    atomicReference0.set(((String)this.zze.invoke(null, this.zzi)));
                }
            }
        }
        String s = (String)atomicReference0.get();
        synchronized(this.zzd) {
            String s1 = zzatr.zza(s.getBytes(), true);
            this.zzd.zzn(s1);
        }
    }
}

