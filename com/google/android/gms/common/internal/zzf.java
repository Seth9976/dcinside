package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class zzf extends zza {
    @Nullable
    public final IBinder zze;
    final BaseGmsClient zzf;

    @BinderThread
    public zzf(BaseGmsClient baseGmsClient0, @Nullable int v, @Nullable IBinder iBinder0, Bundle bundle0) {
        this.zzf = baseGmsClient0;
        super(baseGmsClient0, v, bundle0);
        this.zze = iBinder0;
    }

    @Override  // com.google.android.gms.common.internal.zza
    protected final void zzb(ConnectionResult connectionResult0) {
        if(this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult0);
        }
        this.zzf.onConnectionFailed(connectionResult0);
    }

    @Override  // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
        String s;
        try {
            Preconditions.checkNotNull(this.zze);
            s = this.zze.getInterfaceDescriptor();
        }
        catch(RemoteException unused_ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if(!this.zzf.getServiceDescriptor().equals(s)) {
            Log.w("GmsClient", "service descriptor mismatch: " + this.zzf.getServiceDescriptor() + " vs. " + s);
            return false;
        }
        IInterface iInterface0 = this.zzf.createServiceInterface(this.zze);
        if(iInterface0 != null && (BaseGmsClient.zzn(this.zzf, 2, 4, iInterface0) || BaseGmsClient.zzn(this.zzf, 3, 4, iInterface0))) {
            this.zzf.zzC = null;
            if(this.zzf.zzw != null) {
                this.zzf.zzw.onConnected(null);
            }
            return true;
        }
        return false;
    }
}

