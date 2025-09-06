package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;

public final class zzk extends RemoteCreator {
    private zzbuj zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterface0 instanceof zzbz ? ((zzbz)iInterface0) : new zzbz(iBinder0);
    }

    @Nullable
    public final zzby zza(Context context0, zzs zzs0, String s, zzbpe zzbpe0, int v) {
        zzbcl.zza(context0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                IBinder iBinder0 = ((zzbz)com.google.android.gms.ads.internal.util.client.zzs.zzb(context0, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzj())).zze(iObjectWrapper0, zzs0, s, zzbpe0, 244410000, v);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
                }
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
                goto label_21;
            }
        }
        else {
            try {
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
                IBinder iBinder1 = ((zzbz)this.getRemoteCreatorInstance(context0)).zze(iObjectWrapper1, zzs0, s, zzbpe0, 244410000, v);
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterface1 instanceof zzby ? ((zzby)iInterface1) : new zzbw(iBinder1);
                }
                return null;
            }
            catch(RemoteException | RemoteCreatorException remoteException0) {
            }
            zzo.zzf("Could not create remote AdManager.", remoteException0);
            return null;
        }
        try {
            return null;
        }
        catch(zzr | RemoteException | NullPointerException zzr0) {
        }
    label_21:
        zzbuj zzbuj0 = zzbuh.zza(context0);
        this.zza = zzbuj0;
        zzbuj0.zzh(zzr0, "AdManagerCreator.newAdManagerByDynamiteLoader");
        zzo.zzl("#007 Could not call remote method.", zzr0);
        return null;
    }
}

