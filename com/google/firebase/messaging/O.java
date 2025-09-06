package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.dash.offline.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@KeepForSdk
public class o {
    private final Context a;
    private final Executor b;
    private static final String c = "rawData";
    private static final String d = "gcm.rawData64";
    private static final Object e;
    @GuardedBy("lock")
    private static u0 f;

    static {
        o.e = new Object();
    }

    public o(Context context0) {
        this.a = context0;
        this.b = new a();
    }

    public o(Context context0, ExecutorService executorService0) {
        this.a = context0;
        this.b = executorService0;
    }

    private static Task e(Context context0, Intent intent0, boolean z) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        u0 u00 = o.f(context0, "com.google.firebase.MESSAGING_EVENT");
        if(z) {
            if(e0.b().e(context0)) {
                p0.i(context0, u00, intent0);
                return Tasks.forResult(-1);
            }
            u00.c(intent0);
            return Tasks.forResult(-1);
        }
        return u00.c(intent0).continueWith(new a(), (Task task0) -> -1);
    }

    private static u0 f(Context context0, String s) {
        synchronized(o.e) {
            if(o.f == null) {
                o.f = new u0(context0, s);
            }
            return o.f;
        }
    }

    // 检测为 Lambda 实现
    private static Integer g(Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Integer h(Context context0, Intent intent0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Integer i(Task task0) throws Exception [...]

    // 去混淆评级： 低(40)
    // 检测为 Lambda 实现
    private static Task j(Context context0, Intent intent0, boolean z, Task task0) throws Exception [...]

    @KeepForSdk
    public Task k(Intent intent0) {
        String s = intent0.getStringExtra("gcm.rawData64");
        if(s != null) {
            intent0.putExtra("rawData", Base64.decode(s, 0));
            intent0.removeExtra("gcm.rawData64");
        }
        return this.n(this.a, intent0);
    }

    @VisibleForTesting
    public static void l() {
        synchronized(o.e) {
            o.f = null;
        }
    }

    @VisibleForTesting
    public static void m(u0 u00) {
        synchronized(o.e) {
            o.f = u00;
        }
    }

    @SuppressLint({"InlinedApi"})
    public Task n(Context context0, Intent intent0) {
        if((intent0.getFlags() & 0x10000000) == 0) {
            return o.e(context0, intent0, false);
        }
        l l0 = () -> e0.b().h(context0, intent0);
        Task task0 = Tasks.call(this.b, l0);
        m m0 = (Task task0) -> // 去混淆评级： 低(40)
        (((int)(((Integer)task0.getResult()))) == 402 ? o.e(context0, intent0, true).continueWith(new a(), (Task task0) -> 403) : task0);
        return task0.continueWithTask(this.b, m0);
    }
}

