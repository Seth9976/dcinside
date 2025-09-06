package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;

final class zzbdj extends CustomTabsCallback {
    final zzbdk zza;

    zzbdj(zzbdk zzbdk0) {
        this.zza = zzbdk0;
        super();
    }

    @Override  // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int v, @Nullable Bundle bundle0) {
        this.zza.zze(v);
    }
}

