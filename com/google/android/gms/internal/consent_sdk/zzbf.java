package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.e;
import com.google.android.ump.f.a;

public final class zzbf implements a {
    @Override  // com.google.android.ump.f$a
    public final void onConsentFormLoadFailure(e e0) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=" + e0.b());
    }
}

