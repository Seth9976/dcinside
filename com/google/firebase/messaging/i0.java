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
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class i0 implements Runnable {
    @VisibleForTesting
    static class a extends BroadcastReceiver {
        @Nullable
        private i0 a;

        public a(i0 i00) {
            this.a = i00;
        }

        public void a() {
            if(i0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.a.b().registerReceiver(this, intentFilter0);
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            i0 i00 = this.a;
            if(i00 == null) {
                return;
            }
            if(!i00.d()) {
                return;
            }
            if(i0.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.a.c.w(this.a, 0L);
            this.a.b().unregisterReceiver(this);
            this.a = null;
        }
    }

    private final long a;
    private final PowerManager.WakeLock b;
    private final FirebaseMessaging c;
    @SuppressLint({"ThreadPoolCreation"})
    @VisibleForTesting
    ExecutorService d;

    @SuppressLint({"InvalidWakeLockTag"})
    @VisibleForTesting
    public i0(FirebaseMessaging firebaseMessaging0, long v) {
        this.d = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.c = firebaseMessaging0;
        this.a = v;
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)this.b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = powerManager$WakeLock0;
        powerManager$WakeLock0.setReferenceCounted(false);
    }

    Context b() {
        return this.c.x();
    }

    // 去混淆评级： 低(30)
    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    boolean d() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.b().getSystemService("connectivity");
        NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    @VisibleForTesting
    boolean e() throws IOException {
        try {
            if(this.c.r() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        }
        catch(IOException iOException0) {
        }
        catch(SecurityException unused_ex) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
        if(K.i(iOException0.getMessage())) {
            Log.w("FirebaseMessaging", "Token retrieval failed: " + iOException0.getMessage() + ". Will retry token retrieval");
            return false;
        }
        if(iOException0.getMessage() != null) {
            throw iOException0;
        }
        Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
        return false;
    }

    @Override
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if(e0.b().e(this.b())) {
            this.b.acquire();
        }
        try {
            this.c.e0(true);
            if(this.c.J()) {
                if(!e0.b().d(this.b()) || this.d()) {
                    if(this.e()) {
                        this.c.e0(false);
                    }
                    else {
                        this.c.j0(this.a);
                    }
                    goto label_9;
                }
                goto label_11;
            }
            goto label_15;
        }
        catch(IOException iOException0) {
            goto label_18;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
    label_9:
        if(!e0.b().e(this.b())) {
            return;
        }
        this.b.release();
        return;
        try {
        label_11:
            new a(this).a();
        }
        catch(IOException iOException0) {
            goto label_18;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        if(e0.b().e(this.b())) {
            this.b.release();
        }
        return;
        try {
            try {
            label_15:
                this.c.e0(false);
                goto label_28;
            }
            catch(IOException iOException0) {
            }
        label_18:
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + iOException0.getMessage() + ". Won\'t retry the operation.");
            this.c.e0(false);
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        if(!e0.b().e(this.b())) {
            return;
        }
        this.b.release();
        return;
    label_25:
        if(e0.b().e(this.b())) {
            this.b.release();
        }
        throw throwable0;
    label_28:
        if(e0.b().e(this.b())) {
            this.b.release();
        }
    }
}

