package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsx;

@KeepForSdk
public final class NotificationHandlerActivity extends Activity {
    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override  // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        try {
            zzbsx zzbsx0 = zzbc.zza().zzo(this, new zzbpa());
            if(zzbsx0 == null) {
                zzo.zzg("OfflineUtils is null");
                return;
            }
            zzbsx0.zze(this.getIntent());
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzg(("RemoteException calling handleNotificationIntent: " + remoteException0.toString()));
    }

    @Override  // android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.finish();
    }
}

