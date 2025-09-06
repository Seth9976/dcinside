package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

public final class zzhfl extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhfl(zzbdm zzbdm0) {
        this.zza = new WeakReference(zzbdm0);
    }

    @Override  // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName0, CustomTabsClient customTabsClient0) {
        zzbdm zzbdm0 = (zzbdm)this.zza.get();
        if(zzbdm0 != null) {
            zzbdm0.zzc(customTabsClient0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zzbdm zzbdm0 = (zzbdm)this.zza.get();
        if(zzbdm0 != null) {
            zzbdm0.zzd();
        }
    }
}

