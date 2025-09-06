package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class e implements c {
    private static final String a = "ConnectivityMonitor";
    private static final String b = "android.permission.ACCESS_NETWORK_STATE";

    @Override  // com.bumptech.glide.manager.c
    @NonNull
    public b a(@NonNull Context context0, @NonNull a b$a0) {
        boolean z = ContextCompat.checkSelfPermission(context0, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if(Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", (z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"));
        }
        return z ? new d(context0, b$a0) : new m();
    }
}

