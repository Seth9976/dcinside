package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.b.a;
import com.google.android.ump.f.b;

public final class zzbl implements b {
    public final Activity zza;
    public final a zzb;

    public zzbl(Activity activity0, a b$a0) {
        this.zza = activity0;
        this.zzb = b$a0;
    }

    @Override  // com.google.android.ump.f$b
    public final void onConsentFormLoadSuccess(com.google.android.ump.b b0) {
        b0.show(this.zza, this.zzb);
    }
}

