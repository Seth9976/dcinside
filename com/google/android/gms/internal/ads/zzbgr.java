package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbgr {
    private final zzbgq zza;

    @VisibleForTesting
    public zzbgr(zzbgq zzbgq0) {
        Context context0;
        this.zza = zzbgq0;
        try {
            context0 = (Context)ObjectWrapper.unwrap(zzbgq0.zzh());
        }
        catch(NullPointerException | RemoteException nullPointerException0) {
            zzo.zzh("", nullPointerException0);
            context0 = null;
        }
        if(context0 != null) {
            MediaView mediaView0 = new MediaView(context0);
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(mediaView0);
                this.zza.zzs(iObjectWrapper0);
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("", remoteException0);
            }
        }
    }

    public final zzbgq zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        try {
            return this.zza.zzi();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return null;
        }
    }
}

