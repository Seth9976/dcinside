package com.google.android.gms.cloudmessaging;

import android.os.Build.VERSION;
import android.util.Log;
import j..util.Objects;

public final class zzc extends ClassLoader {
    @Override
    protected final Class loadClass(String s, boolean z) throws ClassNotFoundException {
        if(Objects.equals(s, "com.google.android.gms.iid.MessengerCompat")) {
            if(Log.isLoggable("CloudMessengerCompat", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzd.class;
        }
        return super.loadClass(s, z);
    }
}

