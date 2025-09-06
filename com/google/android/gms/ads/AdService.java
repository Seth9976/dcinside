package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpa;

@KeepForSdk
public class AdService extends IntentService {
    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override  // android.app.IntentService
    protected final void onHandleIntent(@NonNull Intent intent0) {
        try {
            zzbc.zza().zzo(this, new zzbpa()).zze(intent0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzg(("RemoteException calling handleNotificationIntent: " + remoteException0.toString()));
        }
    }
}

