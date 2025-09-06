package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzdnv extends VideoLifecycleCallbacks {
    private final zzdif zza;

    public zzdnv(zzdif zzdif0) {
        this.zza = zzdif0;
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzee zzee0 = zzdnv.zza(this.zza);
        if(zzee0 == null) {
            return;
        }
        try {
            zzee0.zze();
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzee zzee0 = zzdnv.zza(this.zza);
        if(zzee0 == null) {
            return;
        }
        try {
            zzee0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzee zzee0 = zzdnv.zza(this.zza);
        if(zzee0 == null) {
            return;
        }
        try {
            zzee0.zzi();
        }
        catch(RemoteException remoteException0) {
            zzo.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    @Nullable
    private static zzee zza(zzdif zzdif0) {
        zzeb zzeb0 = zzdif0.zzj();
        if(zzeb0 == null) {
            return null;
        }
        try {
            return zzeb0.zzi();
        }
        catch(RemoteException unused_ex) {
            return null;
        }
    }
}

