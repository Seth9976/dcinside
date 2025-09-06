package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzh;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.util.ArrayUtils;

public final class zzbau extends zzc {
    zzbau(Context context0, Looper looper0, BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0) {
        super(zzbvu.zza(context0), looper0, 0x7B, baseGmsClient$BaseConnectionCallbacks0, baseGmsClient$BaseOnConnectionFailedListener0, null);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterface0 instanceof zzbax ? ((zzbax)iInterface0) : new zzbax(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzh.zzb;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        Feature[] arr_feature = this.getAvailableFeatures();
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && ArrayUtils.contains(arr_feature, zzh.zza);
    }

    public final zzbax zzq() throws DeadObjectException {
        return (zzbax)super.getService();
    }
}

