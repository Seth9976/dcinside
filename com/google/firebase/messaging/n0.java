package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;

class n0 implements Runnable {
    @VisibleForTesting
    class a extends BroadcastReceiver {
        @GuardedBy("this")
        @Nullable
        private n0 a;
        final n0 b;

        public a(n0 n01) {
            this.a = n01;
        }

        public void a() {
            if(n0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            n0.this.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            synchronized(this) {
                n0 n00 = this.a;
                if(n00 == null) {
                    return;
                }
                if(!n00.i()) {
                    return;
                }
                if(n0.j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.a.d.n(this.a, 0L);
                context0.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    private final Context a;
    private final Q b;
    private final PowerManager.WakeLock c;
    private final m0 d;
    private final long e;
    private static final Object f;
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    private static Boolean g;
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    private static Boolean h;

    static {
        n0.f = new Object();
    }

    n0(m0 m00, Context context0, Q q0, long v) {
        this.d = m00;
        this.a = context0;
        this.e = v;
        this.b = q0;
        this.c = ((PowerManager)context0.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String s) [...] // Inlined contents

    private static boolean f(Context context0) {
        Boolean boolean0;
        synchronized(n0.f) {
            boolean0 = Boolean.valueOf((n0.h == null ? n0.g(context0, "android.permission.ACCESS_NETWORK_STATE", null) : n0.h.booleanValue()));
            n0.h = boolean0;
        }
        return boolean0.booleanValue();
    }

    private static boolean g(Context context0, String s, Boolean boolean0) {
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        boolean z = context0.checkCallingOrSelfPermission(s) == 0;
        if(!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + s + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    private static boolean h(Context context0) {
        Boolean boolean0;
        synchronized(n0.f) {
            boolean0 = Boolean.valueOf((n0.g == null ? n0.g(context0, "android.permission.WAKE_LOCK", null) : n0.g.booleanValue()));
            n0.g = boolean0;
        }
        return boolean0.booleanValue();
    }

    private boolean i() {
        synchronized(this) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)this.a.getSystemService("connectivity");
            NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getActiveNetworkInfo();
            return networkInfo0 != null && networkInfo0.isConnected();
        }
    }

    // 去混淆评级： 低(30)
    private static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock powerManager$WakeLock0;
        if(n0.h(this.a)) {
            this.c.acquire(f.c);
        }
        try {
            this.d.p(true);
            if(!this.b.g()) {
                goto label_18;
            }
            if(n0.f(this.a) && !this.i()) {
                goto label_12;
            }
            if(this.d.t()) {
                this.d.p(false);
            }
            else {
                this.d.u(this.e);
            }
        }
        catch(IOException iOException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        if(n0.h(this.a)) {
            try {
                powerManager$WakeLock0 = this.c;
                goto label_25;
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                return;
            }
            try {
            label_12:
                new a(this, this).a();
            }
            catch(IOException iOException0) {
                goto label_21;
            }
            catch(Throwable throwable0) {
                goto label_31;
            }
            if(n0.h(this.a)) {
                try {
                    this.c.release();
                    return;
                }
                catch(RuntimeException unused_ex) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                }
            }
            return;
            try {
                try {
                label_18:
                    this.d.p(false);
                    goto label_36;
                }
                catch(IOException iOException0) {
                }
            label_21:
                Log.e("FirebaseMessaging", "Failed to sync topics. Won\'t retry sync. " + iOException0.getMessage());
                this.d.p(false);
            }
            catch(Throwable throwable0) {
                goto label_31;
            }
            if(n0.h(this.a)) {
                try {
                    powerManager$WakeLock0 = this.c;
                label_25:
                    powerManager$WakeLock0.release();
                }
                catch(RuntimeException unused_ex) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                }
                return;
            }
        }
        return;
    label_31:
        if(n0.h(this.a)) {
            try {
                this.c.release();
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            }
        }
        throw throwable0;
    label_36:
        if(n0.h(this.a)) {
            try {
                this.c.release();
            }
            catch(RuntimeException unused_ex) {
                Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            }
        }
    }
}

