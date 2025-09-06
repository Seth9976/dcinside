package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class zzzs extends Surface {
    public final boolean zza;
    private static int zzb;
    private static boolean zzc;
    private final zzzq zzd;
    private boolean zze;

    zzzs(zzzq zzzq0, SurfaceTexture surfaceTexture0, boolean z, zzzr zzzr0) {
        super(surfaceTexture0);
        this.zzd = zzzq0;
        this.zza = z;
    }

    @Override  // android.view.Surface
    public final void release() {
        super.release();
        synchronized(this.zzd) {
            if(!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }

    public static zzzs zza(Context context0, boolean z) {
        int v = 0;
        zzcw.zzf(!z || zzzs.zzb(context0));
        zzzq zzzq0 = new zzzq();
        if(z) {
            v = zzzs.zzb;
        }
        return zzzq0.zza(v);
    }

    public static boolean zzb(Context context0) {
        int v1;
        synchronized(zzzs.class) {
            if(!zzzs.zzc) {
                if(!zzdf.zzb(context0)) {
                    v1 = 0;
                }
                else if(zzdf.zzc()) {
                    v1 = 1;
                }
                else {
                    v1 = 2;
                }
                zzzs.zzb = v1;
                zzzs.zzc = true;
            }
            return zzzs.zzb != 0;
        }
    }
}

