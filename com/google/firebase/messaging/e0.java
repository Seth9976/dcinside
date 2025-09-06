package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
public class e0 {
    @GuardedBy("this")
    @Nullable
    private String a;
    private Boolean b;
    private Boolean c;
    private final Queue d;
    public static final int e = -1;
    @KeepForSdk
    public static final int f = 500;
    static final int g = 404;
    static final int h = 401;
    static final int i = 402;
    static final int j = 403;
    static final String k = "com.google.firebase.MESSAGING_EVENT";
    private static final String l = "wrapped_intent";
    private static final String m = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    private static e0 n;

    private e0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new ArrayDeque();
    }

    private int a(Context context0, Intent intent0) {
        ComponentName componentName0;
        String s = this.f(context0, intent0);
        if(s != null) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + s);
            }
            intent0.setClassName("com.dcinside.app.android", s);
        }
        try {
            if(this.e(context0)) {
                componentName0 = p0.k(context0, intent0);
            }
            else {
                componentName0 = context0.startService(intent0);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if(componentName0 == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        }
        catch(SecurityException securityException0) {
        }
        catch(IllegalStateException illegalStateException0) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + illegalStateException0);
            return 402;
        }
        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", securityException0);
        return 401;
    }

    static e0 b() {
        synchronized(e0.class) {
            if(e0.n == null) {
                e0.n = new e0();
            }
            return e0.n;
        }
    }

    @MainThread
    Intent c() {
        return (Intent)this.d.poll();
    }

    boolean d(Context context0) {
        if(this.c == null) {
            this.c = Boolean.valueOf(context0.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if(!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c.booleanValue();
    }

    boolean e(Context context0) {
        if(this.b == null) {
            this.b = Boolean.valueOf(context0.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if(!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b.booleanValue();
    }

    @Nullable
    private String f(Context context0, Intent intent0) {
        synchronized(this) {
            String s = this.a;
            if(s != null) {
                return s;
            }
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent0, 0);
            if(resolveInfo0 != null) {
                ServiceInfo serviceInfo0 = resolveInfo0.serviceInfo;
                if(serviceInfo0 != null) {
                    if("com.dcinside.app.android".equals(serviceInfo0.packageName)) {
                        String s1 = serviceInfo0.name;
                        if(s1 != null) {
                            this.a = s1.startsWith(".") ? "com.dcinside.app.android" + serviceInfo0.name : serviceInfo0.name;
                            return this.a;
                        }
                    }
                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo0.packageName + "/" + serviceInfo0.name);
                    return null;
                }
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        }
    }

    @VisibleForTesting
    public static void g(e0 e00) {
        e0.n = e00;
    }

    @MainThread
    public int h(Context context0, Intent intent0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.d.offer(intent0);
        Intent intent1 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent1.setPackage("com.dcinside.app.android");
        return this.a(context0, intent1);
    }
}

