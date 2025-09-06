package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;

public final class zzawn extends zzaxr {
    private final Activity zzh;
    private final View zzi;

    public zzawn(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, View view0, Activity activity0) {
        super(zzawd0, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", zzasc0, v, 62);
        this.zzi = view0;
        this.zzh = activity0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if(this.zzi == null) {
            return;
        }
        Boolean boolean0 = (Boolean)zzbe.zzc().zza(zzbcl.zzcJ);
        Object[] arr_object = (Object[])this.zze.invoke(null, this.zzi, this.zzh, boolean0);
        synchronized(this.zzd) {
            this.zzd.zzc(((long)(((Long)arr_object[0]))));
            this.zzd.zze(((long)(((Long)arr_object[1]))));
            if(boolean0.booleanValue()) {
                this.zzd.zzd(((String)arr_object[2]));
            }
        }
    }
}

