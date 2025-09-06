package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public final class zzbup extends zzc {
    public zzbup(Context context0, Looper looper0, BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0) {
        super(zzbvu.zza(context0), looper0, 8, baseGmsClient$BaseConnectionCallbacks0, baseGmsClient$BaseOnConnectionFailedListener0, null);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterface0 instanceof zzbuy ? ((zzbuy)iInterface0) : new zzbuw(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbuy zzp() throws DeadObjectException {
        return (zzbuy)super.getService();
    }
}

