package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public final class zzawy extends zzaxr {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzawy(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, Map map0, View view0, Context context0) {
        super(zzawd0, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", zzasc0, v, 85);
        this.zzh = map0;
        this.zzi = view0;
        this.zzj = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] arr_v = {this.zzc(1), this.zzc(2)};
        long[] arr_v1 = (long[])this.zze.invoke(null, arr_v, (this.zzj == null ? this.zza.zzb() : this.zzj), this.zzi);
        long v = arr_v1[0];
        this.zzh.put(1, ((long)arr_v1[1]));
        long v1 = arr_v1[2];
        this.zzh.put(2, ((long)arr_v1[3]));
        synchronized(this.zzd) {
            this.zzd.zzv(v);
            this.zzd.zzu(v1);
        }
    }

    private final long zzc(int v) {
        Integer integer0 = v;
        return this.zzh.containsKey(integer0) ? ((long)(((Long)this.zzh.get(integer0)))) : 0x8000000000000000L;
    }
}

