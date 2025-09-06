package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

public final class zzbvu extends ContextWrapper {
    @Override  // android.content.ContextWrapper
    public final Context getApplicationContext() {
        throw null;
    }

    @Override  // android.content.ContextWrapper
    public final ApplicationInfo getApplicationInfo() {
        synchronized(this) {
            throw null;
        }
    }

    @Override  // android.content.ContextWrapper
    public final String getPackageName() {
        synchronized(this) {
            throw null;
        }
    }

    @Override  // android.content.ContextWrapper
    public final String getPackageResourcePath() {
        synchronized(this) {
            throw null;
        }
    }

    @Override  // android.content.ContextWrapper
    public final void startActivity(Intent intent0) {
        synchronized(this) {
            throw null;
        }
    }

    public static Context zza(Context context0) {
        if(!(context0 instanceof zzbvu)) {
            Context context1 = context0.getApplicationContext();
            return context1 == null ? context0 : context1;
        }
        return ((zzbvu)context0).getBaseContext();
    }
}

