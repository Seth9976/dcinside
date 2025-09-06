package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaxg extends zzaxr {
    public zzaxg(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", zzasc0, v, 73);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int v = 1;
            boolean z = ((Boolean)this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasc zzasc0 = this.zzd;
            if(z) {
                v = 2;
            }
            zzasc0.zzaf(v);
        }
        catch(InvocationTargetException unused_ex) {
            this.zzd.zzaf(3);
        }
    }
}

