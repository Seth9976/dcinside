package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

public final class zzbw extends ContextWrapper {
    private Activity zza;

    public zzbw(Application application0) {
        super(application0);
    }

    @Override  // android.content.ContextWrapper
    public final Object getSystemService(String s) {
        Activity activity0 = this.zza;
        return activity0 == null ? super.getSystemService(s) : activity0.getSystemService(s);
    }

    @Override  // android.content.ContextWrapper
    public final void startActivity(Intent intent0) {
        Activity activity0 = this.zza;
        if(activity0 != null) {
            activity0.startActivity(intent0);
            return;
        }
        intent0.setFlags(0x10000000);
        super.startActivity(intent0);
    }

    public final void zza(Activity activity0) {
        this.zza = activity0;
    }
}

