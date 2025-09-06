package com.google.android.gms.flags;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzb {
    private boolean zzj;
    private zzc zzk;

    public zzb() {
        this.zzj = false;
        this.zzk = null;
    }

    public final void initialize(Context context0) {
        synchronized(this) {
            if(this.zzj) {
                return;
            }
            try {
                zzc zzc0 = zzd.asInterface(DynamiteModule.load(context0, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.flags").instantiate("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.zzk = zzc0;
                zzc0.init(ObjectWrapper.wrap(context0));
                this.zzj = true;
            }
            catch(LoadingException | RemoteException dynamiteModule$LoadingException0) {
                Log.w("FlagValueProvider", "Failed to initialize flags module.", dynamiteModule$LoadingException0);
            }
        }
    }

    public final Object zzb(Flag flag0) {
        synchronized(this) {
            if(!this.zzj) {
                return flag0.zzb();
            }
        }
        return flag0.zza(this.zzk);
    }
}

