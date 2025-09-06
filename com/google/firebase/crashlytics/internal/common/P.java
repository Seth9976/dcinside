package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.j;
import com.google.firebase.crashlytics.internal.concurrency.l;
import com.google.firebase.crashlytics.internal.h;
import com.google.firebase.crashlytics.internal.metadata.e;
import com.google.firebase.crashlytics.internal.metadata.o;
import com.google.firebase.crashlytics.internal.persistence.g;
import com.google.firebase.crashlytics.internal.settings.d;
import com.google.firebase.crashlytics.internal.settings.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

class p {
    private static final String A = "com.crashlytics.version-control-info";
    private static final String B = "version-control-info.textproto";
    private static final String C = "META-INF/";
    private final Context a;
    private final I b;
    private final D c;
    private final o d;
    private final l e;
    private final N f;
    private final g g;
    private final a h;
    private final e i;
    private final com.google.firebase.crashlytics.internal.a j;
    private final com.google.firebase.crashlytics.internal.analytics.a k;
    private final m l;
    private final f0 m;
    private G n;
    private k o;
    final TaskCompletionSource p;
    final TaskCompletionSource q;
    final TaskCompletionSource r;
    final AtomicBoolean s;
    static final String t = "fatal";
    static final String u = "timestamp";
    static final String v = "_ae";
    static final String w = ".ae";
    static final FilenameFilter x = null;
    static final int y = 1;
    private static final String z = "Crashlytics Android SDK/%s";

    static {
        p.x = (File file0, String s) -> s.startsWith(".ae");
    }

    p(Context context0, N n0, I i0, g g0, D d0, a a0, o o0, e e0, f0 f00, com.google.firebase.crashlytics.internal.a a1, com.google.firebase.crashlytics.internal.analytics.a a2, m m0, l l0) {
        this.o = null;
        this.p = new TaskCompletionSource();
        this.q = new TaskCompletionSource();
        this.r = new TaskCompletionSource();
        this.s = new AtomicBoolean(false);
        this.a = context0;
        this.f = n0;
        this.b = i0;
        this.g = g0;
        this.c = d0;
        this.h = a0;
        this.d = o0;
        this.i = e0;
        this.j = a1;
        this.k = a2;
        this.l = m0;
        this.m = f00;
        this.e = l0;
    }

    boolean A(k k0) {
        l.c();
        if(this.L()) {
            com.google.firebase.crashlytics.internal.g.f().m("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.internal.g.f().k("Finalizing previously open sessions.");
        try {
            this.v(true, k0, true);
        }
        catch(Exception exception0) {
            com.google.firebase.crashlytics.internal.g.f().e("Unable to finalize previously open sessions.", exception0);
            return false;
        }
        com.google.firebase.crashlytics.internal.g.f().k("Closed all previously open sessions.");
        return true;
    }

    private static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    @Nullable
    private String C() {
        SortedSet sortedSet0 = this.m.s();
        return sortedSet0.isEmpty() ? null : ((String)sortedSet0.first());
    }

    private static long D() [...] // 潜在的解密器

    @NonNull
    static List E(h h0, String s, g g0, byte[] arr_b) {
        File file0 = g0.r(s, "user-data");
        File file1 = g0.r(s, "keys");
        File file2 = g0.r(s, "rollouts-state");
        List list0 = new ArrayList();
        list0.add(new com.google.firebase.crashlytics.internal.common.g("logs_file", "logs", arr_b));
        list0.add(new L("crash_meta_file", "metadata", h0.h()));
        list0.add(new L("session_meta_file", "session", h0.g()));
        list0.add(new L("app_meta_file", "app", h0.e()));
        list0.add(new L("device_meta_file", "device", h0.a()));
        list0.add(new L("os_meta_file", "os", h0.f()));
        list0.add(p.T(h0));
        list0.add(new L("user_meta_file", "user", file0));
        list0.add(new L("keys_file", "keys", file1));
        list0.add(new L("rollouts_file", "rollouts", file2));
        return list0;
    }

    private InputStream F(String s) {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        if(classLoader0 == null) {
            com.google.firebase.crashlytics.internal.g.f().m("Couldn\'t get Class Loader");
            return null;
        }
        InputStream inputStream0 = classLoader0.getResourceAsStream(s);
        if(inputStream0 == null) {
            com.google.firebase.crashlytics.internal.g.f().g("No version control information found");
            return null;
        }
        return inputStream0;
    }

    private static long G(long v) [...] // Inlined contents

    o H() {
        return this.d;
    }

    String I() throws IOException {
        InputStream inputStream0 = this.F("META-INF/version-control-info.textproto");
        if(inputStream0 == null) {
            return null;
        }
        com.google.firebase.crashlytics.internal.g.f().b("Read version control info");
        return Base64.encodeToString(p.V(inputStream0), 0);
    }

    // 检测为 Lambda 实现
    void J(@NonNull k k0, @NonNull Thread thread0, @NonNull Throwable throwable0) [...]

    void K(@NonNull k k0, @NonNull Thread thread0, @NonNull Throwable throwable0, boolean z) {
        class b implements Callable {
            final long a;
            final Throwable b;
            final Thread c;
            final k d;
            final boolean e;
            final p f;

            b(long v, Throwable throwable0, Thread thread0, k k0, boolean z) {
                this.a = v;
                this.b = throwable0;
                this.c = thread0;
                this.d = k0;
                this.e = z;
                super();
            }

            public Task a() throws Exception {
                class com.google.firebase.crashlytics.internal.common.p.b.a implements SuccessContinuation {
                    final String a;
                    final b b;

                    com.google.firebase.crashlytics.internal.common.p.b.a(String s) {
                        this.a = s;
                        super();
                    }

                    @NonNull
                    public Task a(@Nullable d d0) throws Exception {
                        String s = null;
                        if(d0 == null) {
                            com.google.firebase.crashlytics.internal.g.f().m("Received null app settings, cannot send reports at crash time.");
                            return Tasks.forResult(null);
                        }
                        Task task0 = p.this.Q();
                        f0 f00 = p.this.m;
                        j j0 = p.this.e.a;
                        if(b.this.e) {
                            s = this.a;
                        }
                        return Tasks.whenAll(new Task[]{task0, f00.B(j0, s)});
                    }

                    @Override  // com.google.android.gms.tasks.SuccessContinuation
                    @NonNull
                    public Task then(@Nullable Object object0) throws Exception {
                        return this.a(((d)object0));
                    }
                }

                long v = p.c(this.a);
                String s = p.this.C();
                if(s == null) {
                    com.google.firebase.crashlytics.internal.g.f().d("Tried to write a fatal exception while no session was open.");
                    return Tasks.forResult(null);
                }
                p.this.c.a();
                p.this.m.w(this.b, this.c, s, v);
                p.this.x(this.a);
                p.this.u(this.d);
                p.this.w("68BB1F3E020D000104610F6B951E7F98", Boolean.valueOf(this.e));
                if(!p.this.b.d()) {
                    return Tasks.forResult(null);
                }
                Task task0 = this.d.b();
                com.google.firebase.crashlytics.internal.common.p.b.a p$b$a0 = new com.google.firebase.crashlytics.internal.common.p.b.a(this, s);
                return task0.onSuccessTask(p.this.e.a, p$b$a0);
            }

            @Override
            public Object call() throws Exception {
                return this.a();
            }
        }

        synchronized(this) {
            com.google.firebase.crashlytics.internal.g.f().b("Handling uncaught exception \"" + throwable0 + "\" from thread " + thread0.getName());
            b p$b0 = new b(this, System.currentTimeMillis(), throwable0, thread0, k0, z);
            Task task0 = this.e.a.s(p$b0);
            if(!z) {
                try {
                    i0.b(task0);
                }
                catch(TimeoutException unused_ex) {
                    com.google.firebase.crashlytics.internal.g.f().d("Cannot send reports. Timed out while fetching settings.");
                }
                catch(Exception exception0) {
                    com.google.firebase.crashlytics.internal.g.f().e("Error handling uncaught exception", exception0);
                }
            }
        }
    }

    boolean L() {
        return this.n != null && this.n.a();
    }

    // 检测为 Lambda 实现
    private void M(String s) [...]

    // 检测为 Lambda 实现
    private static boolean N(File file0, String s) [...]

    List O() {
        return this.g.i(p.x);
    }

    private Task P(long v) {
        class com.google.firebase.crashlytics.internal.common.p.e implements Callable {
            final long a;
            final p b;

            com.google.firebase.crashlytics.internal.common.p.e(long v) {
                this.a = v;
                super();
            }

            public Void a() throws Exception {
                Bundle bundle0 = new Bundle();
                bundle0.putInt("fatal", 1);
                bundle0.putLong("timestamp", this.a);
                p.this.k.a("_ae", bundle0);
                return null;
            }

            @Override
            public Object call() throws Exception {
                return this.a();
            }
        }

        if(p.B()) {
            com.google.firebase.crashlytics.internal.g.f().m("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        com.google.firebase.crashlytics.internal.g.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new com.google.firebase.crashlytics.internal.common.p.e(this, v));
    }

    private Task Q() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.O()) {
            File file0 = (File)object0;
            try {
                arrayList0.add(this.P(Long.parseLong(file0.getName().substring(3))));
            }
            catch(NumberFormatException unused_ex) {
                com.google.firebase.crashlytics.internal.g.f().m("Could not parse app exception timestamp from file " + file0.getName());
            }
            file0.delete();
        }
        return Tasks.whenAll(arrayList0);
    }

    void R(Thread thread0, Throwable throwable0) {
        k k0 = this.o;
        if(k0 == null) {
            com.google.firebase.crashlytics.internal.g.f().m("settingsProvider not set");
            return;
        }
        this.K(k0, thread0, throwable0, true);
    }

    private static boolean S(String s, File file0, com.google.firebase.crashlytics.internal.model.F.a f$a0) {
        if(file0 == null || !file0.exists()) {
            com.google.firebase.crashlytics.internal.g.f().m("No minidump data found for session " + s);
        }
        if(f$a0 == null) {
            com.google.firebase.crashlytics.internal.g.f().g("No Tombstones data found for session " + s);
        }
        return (file0 == null || !file0.exists()) && f$a0 == null;
    }

    private static Q T(h h0) {
        File file0 = h0.d();
        return file0 != null && file0.exists() ? new L("minidump_file", "minidump", file0) : new com.google.firebase.crashlytics.internal.common.g("minidump_file", "minidump", new byte[]{0});
    }

    void U(String s) {
        n n0 = () -> this.w(s, Boolean.FALSE);
        this.e.a.q(n0);
    }

    private static byte[] V(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    void W() {
        try {
            String s = this.I();
            if(s != null) {
                this.a0("com.crashlytics.version-control-info", s);
                com.google.firebase.crashlytics.internal.g.f().g("Saved version control info");
            }
        }
        catch(IOException iOException0) {
            com.google.firebase.crashlytics.internal.g.f().n("Unable to save version control info", iOException0);
        }
    }

    Task X() {
        this.q.trySetResult(Boolean.TRUE);
        return this.r.getTask();
    }

    void Y(String s, String s1) {
        try {
            this.d.p(s, s1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(this.a != null && i.v(this.a)) {
                throw illegalArgumentException0;
            }
            com.google.firebase.crashlytics.internal.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void Z(Map map0) {
        this.d.q(map0);
    }

    void a0(String s, String s1) {
        try {
            this.d.r(s, s1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(this.a != null && i.v(this.a)) {
                throw illegalArgumentException0;
            }
            com.google.firebase.crashlytics.internal.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void b0(String s) {
        this.d.t(s);
    }

    static long c(long v) {
        return v / 1000L;
    }

    void c0(Task task0) {
        class com.google.firebase.crashlytics.internal.common.p.d implements SuccessContinuation {
            final Task a;
            final p b;

            com.google.firebase.crashlytics.internal.common.p.d(Task task0) {
                this.a = task0;
                super();
            }

            @NonNull
            public Task a(@Nullable Boolean boolean0) throws Exception {
                class com.google.firebase.crashlytics.internal.common.p.d.a implements SuccessContinuation {
                    final com.google.firebase.crashlytics.internal.common.p.d a;

                    @NonNull
                    public Task a(@Nullable d d0) throws Exception {
                        if(d0 == null) {
                            com.google.firebase.crashlytics.internal.g.f().m("Received null app settings at app startup. Cannot send cached reports");
                            return Tasks.forResult(null);
                        }
                        p.this.Q();
                        p.this.m.A(p.this.e.a);
                        p.this.r.trySetResult(null);
                        return Tasks.forResult(null);
                    }

                    @Override  // com.google.android.gms.tasks.SuccessContinuation
                    @NonNull
                    public Task then(@Nullable Object object0) throws Exception {
                        return this.a(((d)object0));
                    }
                }

                if(!boolean0.booleanValue()) {
                    com.google.firebase.crashlytics.internal.g.f().k("Deleting cached crash reports...");
                    p.r(p.this.O());
                    p.this.m.z();
                    p.this.r.trySetResult(null);
                    return Tasks.forResult(null);
                }
                com.google.firebase.crashlytics.internal.g.f().b("Sending cached crash reports...");
                p.this.b.c(boolean0.booleanValue());
                com.google.firebase.crashlytics.internal.common.p.d.a p$d$a0 = new com.google.firebase.crashlytics.internal.common.p.d.a(this);
                return this.a.onSuccessTask(p.this.e.a, p$d$a0);
            }

            @Override  // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task then(@Nullable Object object0) throws Exception {
                return this.a(((Boolean)object0));
            }
        }

        if(!this.m.p()) {
            com.google.firebase.crashlytics.internal.g.f().k("No crash reports are available to be sent.");
            this.p.trySetResult(Boolean.FALSE);
            return;
        }
        com.google.firebase.crashlytics.internal.g.f().k("Crash reports are available to be sent.");
        Task task1 = this.d0();
        com.google.firebase.crashlytics.internal.common.p.d p$d0 = new com.google.firebase.crashlytics.internal.common.p.d(this, task0);
        task1.onSuccessTask(this.e.a, p$d0);
    }

    private Task d0() {
        class c implements SuccessContinuation {
            final p a;

            @NonNull
            public Task a(@Nullable Void void0) throws Exception {
                return Tasks.forResult(Boolean.TRUE);
            }

            @Override  // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task then(@Nullable Object object0) throws Exception {
                return this.a(((Void)object0));
            }
        }

        if(this.b.d()) {
            com.google.firebase.crashlytics.internal.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.internal.g.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.internal.g.f().k("Notifying that unsent reports are available.");
        this.p.trySetResult(Boolean.TRUE);
        Task task0 = this.b.j().onSuccessTask(new c(this));
        com.google.firebase.crashlytics.internal.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return com.google.firebase.crashlytics.internal.concurrency.b.c(task0, this.q.getTask());
    }

    private void e0(String s) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            List list0 = ((ActivityManager)this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if(list0.size() != 0) {
                e e0 = new e(this.g, s);
                o o0 = o.m(s, this.g, this.e);
                this.m.y(s, list0, e0, o0);
                return;
            }
            com.google.firebase.crashlytics.internal.g.f().k("No ApplicationExitInfo available. Session: " + s);
            return;
        }
        com.google.firebase.crashlytics.internal.g.f().k("ANR feature enabled, but device is API " + v);
    }

    void f0(@NonNull Thread thread0, @NonNull Throwable throwable0) {
        long v = System.currentTimeMillis();
        if(!this.L()) {
            String s = this.C();
            if(s == null) {
                com.google.firebase.crashlytics.internal.g.f().m("Tried to write a non-fatal exception while no session was open.");
                return;
            }
            this.m.x(throwable0, thread0, s, v / 1000L);
        }
    }

    void g0(long v, String s) {
        if(!this.L()) {
            this.i.g(v, s);
        }
    }

    @NonNull
    Task n() {
        if(!this.s.compareAndSet(false, true)) {
            com.google.firebase.crashlytics.internal.g.f().m("checkForUnsentReports should only be called once per execution.");
            return Tasks.forResult(Boolean.FALSE);
        }
        return this.p.getTask();
    }

    private static com.google.firebase.crashlytics.internal.model.G.a o(N n0, a a0) {
        String s = n0.a().c();
        int v = J.b(a0.d).c();
        return com.google.firebase.crashlytics.internal.model.G.a.b(n0.f(), a0.f, a0.g, s, v, a0.h);
    }

    private static com.google.firebase.crashlytics.internal.model.G.b p(Context context0) {
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        long v = ((long)statFs0.getBlockCount()) * ((long)statFs0.getBlockSize());
        return com.google.firebase.crashlytics.internal.model.G.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context0), v, i.x(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static com.google.firebase.crashlytics.internal.model.G.c q() {
        return com.google.firebase.crashlytics.internal.model.G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.z());
    }

    private static void r(List list0) {
        for(Object object0: list0) {
            ((File)object0).delete();
        }
    }

    Task s() {
        this.q.trySetResult(Boolean.FALSE);
        return this.r.getTask();
    }

    boolean t() {
        l.c();
        if(!this.c.c()) {
            String s = this.C();
            return s != null && this.j.d(s);
        }
        com.google.firebase.crashlytics.internal.g.f().k("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void u(k k0) {
        this.v(false, k0, false);
    }

    private void v(boolean z, k k0, boolean z1) {
        String s1;
        l.c();
        ArrayList arrayList0 = new ArrayList(this.m.s());
        if(arrayList0.size() <= ((int)z)) {
            com.google.firebase.crashlytics.internal.g.f().k("No open sessions to be closed.");
            return;
        }
        String s = (String)arrayList0.get(((int)z));
        if(!z1 || !k0.a().b.b) {
            com.google.firebase.crashlytics.internal.g.f().k("ANR feature disabled.");
        }
        else {
            this.e0(s);
        }
        if(z1 && this.j.d(s)) {
            this.z(s);
        }
        if(((int)z) == 0) {
            this.l.e(null);
            s1 = null;
        }
        else {
            s1 = (String)arrayList0.get(0);
        }
        this.m.m(0x68BB1F31L, s1);
    }

    private void w(String s, Boolean boolean0) {
        com.google.firebase.crashlytics.internal.g.f().b("Opening a new session with ID " + s);
        Locale locale0 = Locale.US;
        com.google.firebase.crashlytics.internal.model.G g0 = com.google.firebase.crashlytics.internal.model.G.b(p.o(this.f, this.h), p.q(), p.p(this.a));
        this.j.a(s, String.format(locale0, "Crashlytics Android SDK/%s", "19.2.0"), 0x68BB1F36L, g0);
        if(boolean0.booleanValue() && s != null) {
            this.d.s(s);
        }
        this.i.e(s);
        this.l.e(s);
        this.m.t(s, 0x68BB1F36L);
    }

    private void x(long v) {
        try {
            if(!this.g.h(".ae" + v).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        }
        catch(IOException iOException0) {
            com.google.firebase.crashlytics.internal.g.f().n("Could not create app exception marker file.", iOException0);
        }
    }

    void y(String s, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0, k k0) {
        class com.google.firebase.crashlytics.internal.common.p.a implements com.google.firebase.crashlytics.internal.common.G.a {
            final p a;

            @Override  // com.google.firebase.crashlytics.internal.common.G$a
            public void a(@NonNull k k0, @NonNull Thread thread0, @NonNull Throwable throwable0) {
                p.this.J(k0, thread0, throwable0);
            }
        }

        this.o = k0;
        this.U(s);
        G g0 = new G((k k0, Thread thread0, Throwable throwable0) -> p.this.K(k0, thread0, throwable0, false), k0, thread$UncaughtExceptionHandler0, this.j);
        this.n = g0;
        Thread.setDefaultUncaughtExceptionHandler(g0);
    }

    private void z(String s) {
        com.google.firebase.crashlytics.internal.g.f().k("Finalizing native report for session " + s);
        h h0 = this.j.b(s);
        File file0 = h0.d();
        com.google.firebase.crashlytics.internal.model.F.a f$a0 = h0.b();
        if(p.S(s, file0, f$a0)) {
            com.google.firebase.crashlytics.internal.g.f().m("No native core present");
            return;
        }
        long v = file0.lastModified();
        e e0 = new e(this.g, s);
        File file1 = this.g.l(s);
        if(!file1.isDirectory()) {
            com.google.firebase.crashlytics.internal.g.f().m("Couldn\'t create directory to store native session files, aborting.");
            return;
        }
        this.x(v);
        byte[] arr_b = e0.b();
        List list0 = p.E(h0, s, this.g, arr_b);
        S.b(file1, list0);
        com.google.firebase.crashlytics.internal.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.m.l(s, list0, f$a0);
        e0.a();
    }
}

