package com.google.firebase.messaging;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.core.app.NotificationCompat.Builder;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class g {
    private final ExecutorService a;
    private final Context b;
    private final S c;
    private static final int d = 5;

    public g(Context context0, S s0, ExecutorService executorService0) {
        this.a = executorService0;
        this.b = context0;
        this.c = s0;
    }

    boolean a() {
        if(this.c.a("gcm.n.noui")) {
            return true;
        }
        if(this.b()) {
            return false;
        }
        M m0 = this.d();
        a e$a0 = e.e(this.b, this.c);
        this.e(e$a0.a, m0);
        this.c(e$a0);
        return true;
    }

    private boolean b() {
        if(((KeyguardManager)this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        int v = Process.myPid();
        List list0 = ((ActivityManager)this.b.getSystemService("activity")).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.pid == v) {
                    return activityManager$RunningAppProcessInfo0.importance == 100;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    private void c(a e$a0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        NotificationManager notificationManager0 = (NotificationManager)this.b.getSystemService("notification");
        Notification notification0 = e$a0.a.h();
        notificationManager0.notify(e$a0.b, e$a0.c, notification0);
    }

    @Nullable
    private M d() {
        M m0 = M.e(this.c.p("gcm.n.image"));
        if(m0 != null) {
            m0.j(this.a);
        }
        return m0;
    }

    private void e(Builder notificationCompat$Builder0, @Nullable M m0) {
        if(m0 == null) {
            return;
        }
        try {
            Bitmap bitmap0 = (Bitmap)Tasks.await(m0.f(), 5L, TimeUnit.SECONDS);
            notificationCompat$Builder0.b0(bitmap0);
            notificationCompat$Builder0.z0(new BigPictureStyle().D(bitmap0).B(null));
        }
        catch(ExecutionException executionException0) {
            Log.w("FirebaseMessaging", "Failed to download image: " + executionException0.getCause());
        }
        catch(InterruptedException unused_ex) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            m0.close();
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException unused_ex) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            m0.close();
        }
    }
}

