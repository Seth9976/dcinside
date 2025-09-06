package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.m;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.c;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import e2.b;
import e2.d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {
    class a {
        private final d a;
        @GuardedBy("this")
        private boolean b;
        @GuardedBy("this")
        @Nullable
        private b c;
        @GuardedBy("this")
        @Nullable
        private Boolean d;
        final FirebaseMessaging e;
        private static final String f = "firebase_messaging_auto_init_enabled";
        private static final String g = "com.google.firebase.messaging";
        private static final String h = "auto_init";

        a(d d0) {
            this.a = d0;
        }

        void b() {
            synchronized(this) {
                if(this.b) {
                    return;
                }
                Boolean boolean0 = this.e();
                this.d = boolean0;
                if(boolean0 == null) {
                    H h0 = (e2.a a0) -> if(this.c()) {
                        FirebaseMessaging.this.h0();
                    };
                    this.c = h0;
                    this.a.d(c.class, h0);
                }
                this.b = true;
            }
        }

        boolean c() {
            synchronized(this) {
                this.b();
                Boolean boolean0 = this.d;
                return boolean0 == null ? FirebaseMessaging.this.a.A() : boolean0.booleanValue();
            }
        }

        // 检测为 Lambda 实现
        private void d(e2.a a0) [...]

        @Nullable
        private Boolean e() {
            Context context0 = FirebaseMessaging.this.a.n();
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.messaging", 0);
            if(sharedPreferences0.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences0.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 != null) {
                    ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.dcinside.app.android", 0x80);
                    return applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo0.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            return null;
        }

        void f(boolean z) {
            synchronized(this) {
                this.b();
                b b0 = this.c;
                if(b0 != null) {
                    this.a.c(c.class, b0);
                    this.c = null;
                }
                SharedPreferences.Editor sharedPreferences$Editor0 = FirebaseMessaging.this.a.n().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                sharedPreferences$Editor0.putBoolean("auto_init", z);
                sharedPreferences$Editor0.apply();
                if(z) {
                    FirebaseMessaging.this.h0();
                }
                this.d = Boolean.valueOf(z);
            }
        }
    }

    private final h a;
    @Nullable
    private final g2.a b;
    private final Context c;
    private final K d;
    private final c0 e;
    private final a f;
    private final Executor g;
    private final Executor h;
    private final Task i;
    private final Q j;
    @GuardedBy("this")
    private boolean k;
    private final Application.ActivityLifecycleCallbacks l;
    static final String m = "FirebaseMessaging";
    static final String n = "com.google.android.gms";
    private static final String o = "com.google.android.gcm.intent.SEND";
    private static final String p = "app";
    @Deprecated
    public static final String q = "FCM";
    private static final long r = 30L;
    private static final long s = 0L;
    private static final String t = "";
    @GuardedBy("FirebaseMessaging.class")
    private static h0 u;
    @VisibleForTesting
    static h2.b v;
    @GuardedBy("FirebaseMessaging.class")
    @VisibleForTesting
    static ScheduledExecutorService w;

    static {
        FirebaseMessaging.s = TimeUnit.HOURS.toSeconds(8L);
        FirebaseMessaging.v = () -> null;
    }

    FirebaseMessaging(h h0, @Nullable g2.a a0, h2.b b0, d d0, Q q0, K k0, Executor executor0, Executor executor1, Executor executor2) {
        this.k = false;
        FirebaseMessaging.v = b0;
        this.a = h0;
        this.b = a0;
        this.f = new a(this, d0);
        Context context0 = h0.n();
        this.c = context0;
        r r0 = new r();
        this.l = r0;
        this.j = q0;
        this.d = k0;
        this.e = new c0(executor0);
        this.g = executor1;
        this.h = executor2;
        Context context1 = h0.n();
        if(context1 instanceof Application) {
            ((Application)context1).registerActivityLifecycleCallbacks(r0);
        }
        else {
            Log.w("FirebaseMessaging", "Context " + context1 + " was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if(a0 != null) {
            a0.a((String s) -> this.H(s));
        }
        executor1.execute(() -> if(this.I()) {
            this.h0();
        });
        Task task0 = m0.f(this, q0, k0, context0, p.i());
        this.i = task0;
        task0.addOnSuccessListener(executor1, (m0 m00) -> if(this.I()) {
            m00.r();
        });
        executor1.execute(() -> this.G());
    }

    FirebaseMessaging(h h0, @Nullable g2.a a0, h2.b b0, h2.b b1, k k0, h2.b b2, d d0) {
        this(h0, a0, b0, b1, k0, b2, d0, new Q(h0.n()));
    }

    FirebaseMessaging(h h0, @Nullable g2.a a0, h2.b b0, h2.b b1, k k0, h2.b b2, d d0, Q q0) {
        this(h0, a0, b2, d0, q0, new K(h0, q0, b0, b1, k0), p.h(), p.d(), p.c());
    }

    // 去混淆评级： 低(20)
    private String A() {
        return "[DEFAULT]".equals(this.a.r()) ? "" : this.a.t();
    }

    @NonNull
    public Task B() {
        g2.a a0 = this.b;
        if(a0 != null) {
            return a0.c();
        }
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        C c0 = () -> try {
            taskCompletionSource0.setResult(this.r());
        }
        catch(Exception exception0) {
            taskCompletionSource0.setException(exception0);
        };
        this.g.execute(c0);
        return taskCompletionSource0.getTask();
    }

    @Nullable
    @VisibleForTesting
    com.google.firebase.messaging.h0.a C() {
        return FirebaseMessaging.z(this.c).e(this.A(), Q.c(this.a));
    }

    Task D() {
        return this.i;
    }

    @Nullable
    public static m E() {
        return (m)FirebaseMessaging.v.get();
    }

    private void F() {
        Task task0 = this.d.f();
        D d0 = (CloudMessage cloudMessage0) -> if(cloudMessage0 != null) {
            O.y(cloudMessage0.getIntent());
            this.F();
        };
        task0.addOnSuccessListener(this.g, d0);
    }

    private void G() {
        X.c(this.c);
        boolean z = this.f0();
        Z.g(this.c, this.d, z);
        if(this.f0()) {
            this.F();
        }
    }

    private void H(String s) {
        if("[DEFAULT]".equals(this.a.r())) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.r());
            }
            Intent intent0 = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent0.putExtra("token", s);
            new o(this.c).k(intent0);
        }
    }

    public boolean I() {
        return this.f.c();
    }

    @VisibleForTesting
    boolean J() {
        return this.j.g();
    }

    public boolean K() {
        return X.d(this.c);
    }

    // 检测为 Lambda 实现
    private Task L(String s, com.google.firebase.messaging.h0.a h0$a0, String s1) throws Exception [...]

    // 检测为 Lambda 实现
    private Task M(String s, com.google.firebase.messaging.h0.a h0$a0) [...]

    private static m N() [...] // Inlined contents

    // 检测为 Lambda 实现
    private void O(TaskCompletionSource taskCompletionSource0) [...]

    // 检测为 Lambda 实现
    private void P(TaskCompletionSource taskCompletionSource0) [...]

    // 检测为 Lambda 实现
    private void Q(TaskCompletionSource taskCompletionSource0) [...]

    // 检测为 Lambda 实现
    private void R(CloudMessage cloudMessage0) [...]

    // 检测为 Lambda 实现
    private void S(String s) [...]

    // 检测为 Lambda 实现
    private void T() [...]

    // 检测为 Lambda 实现
    private void U(m0 m00) [...]

    // 检测为 Lambda 实现
    private void V() [...]

    // 检测为 Lambda 实现
    private void W(Void void0) [...]

    private static m X() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static Task Y(String s, m0 m00) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task Z(String s, m0 m00) throws Exception [...]

    @Deprecated
    public void a0(@NonNull RemoteMessage remoteMessage0) {
        if(TextUtils.isEmpty(remoteMessage0.getTo())) {
            throw new IllegalArgumentException("Missing \'to\'");
        }
        Intent intent0 = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent1 = new Intent();
        intent1.setPackage("com.google.example.invalidpackage");
        intent0.putExtra("app", PendingIntent.getBroadcast(this.c, 0, intent1, (Build.VERSION.SDK_INT < 23 ? 0 : 0x4000000)));
        intent0.setPackage("com.google.android.gms");
        remoteMessage0.i(intent0);
        this.c.sendOrderedBroadcast(intent0, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void b0(boolean z) {
        this.f.f(z);
    }

    public void c0(boolean z) {
        O.B(z);
        boolean z1 = this.f0();
        Z.g(this.c, this.d, z1);
    }

    @NonNull
    public Task d0(boolean z) {
        return X.f(this.g, this.c, z).addOnSuccessListener(new androidx.media3.exoplayer.dash.offline.a(), (Void void0) -> {
            boolean z = this.f0();
            Z.g(this.c, this.d, z);
        });
    }

    void e0(boolean z) {
        synchronized(this) {
            this.k = z;
        }
    }

    private boolean f0() {
        X.c(this.c);
        if(!X.d(this.c)) {
            return false;
        }
        return this.a.l(com.google.firebase.analytics.connector.a.class) == null ? O.a() && FirebaseMessaging.v != null : true;
    }

    private void g0() {
        synchronized(this) {
            if(!this.k) {
                this.j0(0L);
            }
        }
    }

    @Keep
    @NonNull
    static FirebaseMessaging getInstance(@NonNull h h0) {
        synchronized(FirebaseMessaging.class) {
            FirebaseMessaging firebaseMessaging0 = (FirebaseMessaging)h0.l(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging0, "Firebase Messaging component is not present");
            return firebaseMessaging0;
        }
    }

    // 检测为 Lambda 实现
    public static m h() [...]

    private void h0() {
        g2.a a0 = this.b;
        if(a0 != null) {
            a0.getToken();
            return;
        }
        if(this.k0(this.C())) {
            this.g0();
        }
    }

    @SuppressLint({"TaskMainThread"})
    @NonNull
    public Task i0(@NonNull String s) {
        s s1 = (m0 m00) -> m00.s(s);
        return this.i.onSuccessTask(s1);
    }

    void j0(long v) {
        synchronized(this) {
            this.w(new i0(this, Math.min(Math.max(30L, 2L * v), FirebaseMessaging.s)), v);
            this.k = true;
        }
    }

    // 检测为 Lambda 实现
    public static m k() [...]

    @VisibleForTesting
    boolean k0(@Nullable com.google.firebase.messaging.h0.a h0$a0) {
        return h0$a0 == null || h0$a0.b(this.j.a());
    }

    @SuppressLint({"TaskMainThread"})
    @NonNull
    public Task l0(@NonNull String s) {
        E e0 = (m0 m00) -> m00.v(s);
        return this.i.onSuccessTask(e0);
    }

    String r() throws IOException {
        g2.a a0 = this.b;
        if(a0 != null) {
            try {
                return (String)Tasks.await(a0.c());
            }
            catch(ExecutionException | InterruptedException executionException0) {
                throw new IOException(executionException0);
            }
        }
        com.google.firebase.messaging.h0.a h0$a0 = this.C();
        if(!this.k0(h0$a0)) {
            return h0$a0.a;
        }
        String s = Q.c(this.a);
        F f0 = () -> {
            Task task0 = this.d.g();
            A a0 = (String s1) -> {
                FirebaseMessaging.z(this.c).g(this.A(), s, s1, this.j.a());
                if(h0$a0 == null || !s1.equals(h0$a0.a)) {
                    this.H(s1);
                }
                return Tasks.forResult(s1);
            };
            return task0.onSuccessTask(this.h, a0);
        };
        Task task0 = this.e.b(s, f0);
        try {
            return (String)Tasks.await(task0);
        }
        catch(ExecutionException | InterruptedException executionException1) {
            throw new IOException(executionException1);
        }
    }

    @VisibleForTesting
    static void s() {
        synchronized(FirebaseMessaging.class) {
            FirebaseMessaging.u = null;
        }
    }

    static void t() {
        FirebaseMessaging.v = () -> null;
    }

    @NonNull
    public Task u() {
        if(this.b != null) {
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
            G g0 = () -> try {
                String s = Q.c(this.a);
                this.b.b(s, "FCM");
                taskCompletionSource0.setResult(null);
            }
            catch(Exception exception0) {
                taskCompletionSource0.setException(exception0);
            };
            this.g.execute(g0);
            return taskCompletionSource0.getTask();
        }
        if(this.C() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource1 = new TaskCompletionSource();
        p.f().execute(() -> try {
            Tasks.await(this.d.c());
            FirebaseMessaging.z(this.c).d(this.A(), Q.c(this.a));
            taskCompletionSource1.setResult(null);
        }
        catch(Exception exception0) {
            taskCompletionSource1.setException(exception0);
        });
        return taskCompletionSource1.getTask();
    }

    @NonNull
    public boolean v() {
        return O.a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    void w(Runnable runnable0, long v) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.w == null) {
                FirebaseMessaging.w = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            FirebaseMessaging.w.schedule(runnable0, v, TimeUnit.SECONDS);
        }
    }

    Context x() {
        return this.c;
    }

    @NonNull
    public static FirebaseMessaging y() {
        synchronized(FirebaseMessaging.class) {
            return FirebaseMessaging.getInstance(h.p());
        }
    }

    @NonNull
    private static h0 z(Context context0) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.u == null) {
                FirebaseMessaging.u = new h0(context0);
            }
            return FirebaseMessaging.u;
        }
    }
}

