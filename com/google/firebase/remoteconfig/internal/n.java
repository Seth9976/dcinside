package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.k;
import com.google.firebase.installations.p;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.s;
import com.google.firebase.remoteconfig.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class n {
    public static class a {
        @Retention(RetentionPolicy.SOURCE)
        public @interface com.google.firebase.remoteconfig.internal.n.a.a {
            public static final int h2 = 0;
            public static final int i2 = 1;
            public static final int j2 = 2;

        }

        private final Date a;
        private final int b;
        private final h c;
        @Nullable
        private final String d;

        private a(Date date0, int v, h h0, @Nullable String s) {
            this.a = date0;
            this.b = v;
            this.c = h0;
            this.d = s;
        }

        public static a a(Date date0, h h0) {
            return new a(date0, 1, h0, null);
        }

        public static a b(h h0, String s) {
            return new a(h0.h(), 0, h0, s);
        }

        public static a c(Date date0) {
            return new a(date0, 2, null, null);
        }

        Date d() {
            return this.a;
        }

        public h e() {
            return this.c;
        }

        @Nullable
        String f() {
            return this.d;
        }

        int g() {
            return this.b;
        }
    }

    public static enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String a;

        private b(String s1) {
            this.a = s1;
        }

        private static b[] a() [...] // Inlined contents

        String b() {
            return this.a;
        }
    }

    private final k a;
    private final h2.b b;
    private final Executor c;
    private final Clock d;
    private final Random e;
    private final g f;
    private final ConfigFetchHttpClient g;
    private final q h;
    private final Map i;
    public static final long j = 0L;
    @VisibleForTesting
    static final int[] k = null;
    @VisibleForTesting
    static final int l = 429;
    @VisibleForTesting
    static final String m = "_fot";
    private static final String n = "X-Firebase-RC-Fetch-Type";

    static {
        n.j = TimeUnit.HOURS.toSeconds(12L);
        n.k = new int[]{2, 4, 8, 16, 0x20, 0x40, 0x80, 0x100};
    }

    public n(k k0, h2.b b0, Executor executor0, Clock clock0, Random random0, g g0, ConfigFetchHttpClient configFetchHttpClient0, q q0, Map map0) {
        this.a = k0;
        this.b = b0;
        this.c = executor0;
        this.d = clock0;
        this.e = random0;
        this.f = g0;
        this.g = configFetchHttpClient0;
        this.h = q0;
        this.i = map0;
    }

    private boolean A(com.google.firebase.remoteconfig.internal.q.a q$a0, int v) {
        return q$a0.b() > 1 || v == 429;
    }

    private com.google.firebase.remoteconfig.internal.q.a B(int v, Date date0) {
        if(this.u(v)) {
            this.C(date0);
        }
        return this.h.b();
    }

    private void C(Date date0) {
        int v = this.h.b().b();
        long v1 = this.r(v + 1);
        Date date1 = new Date(date0.getTime() + v1);
        this.h.m(v + 1, date1);
    }

    private void D(Task task0, Date date0) {
        if(task0.isSuccessful()) {
            this.h.t(date0);
            return;
        }
        Exception exception0 = task0.getException();
        if(exception0 == null) {
            return;
        }
        if(exception0 instanceof s) {
            this.h.u();
            return;
        }
        this.h.s();
    }

    private boolean f(long v, Date date0) {
        Date date1 = this.h.g();
        return date1.equals(q.f) ? false : date0.before(new Date(date1.getTime() + TimeUnit.SECONDS.toMillis(v)));
    }

    private u g(u u0) throws com.google.firebase.remoteconfig.q {
        int v = u0.b();
        switch(v) {
            case 401: {
                return new u(u0.b(), "Fetch failed: The request did not have the required credentials. Please make sure your google-services.json is valid.", u0);
            }
            case 403: {
                return new u(u0.b(), "Fetch failed: The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.", u0);
            }
            case 429: {
                throw new com.google.firebase.remoteconfig.q("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            case 500: {
                return new u(u0.b(), "Fetch failed: There was an internal server error.", u0);
            }
            default: {
                return v == 502 || v == 503 || v == 504 ? new u(u0.b(), "Fetch failed: The server is unavailable. Please try again later.", u0) : new u(u0.b(), "Fetch failed: The server returned an unexpected error.", u0);
            }
        }
    }

    private String h(long v) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(v)));
    }

    public Task i() {
        return this.j(this.h.i());
    }

    public Task j(long v) {
        HashMap hashMap0 = new HashMap(this.i);
        hashMap0.put("X-Firebase-RC-Fetch-Type", "BASE/" + 1);
        Task task0 = this.f.f();
        i i0 = (Task task0) -> this.m(task0, v, hashMap0);
        return task0.continueWithTask(this.c, i0);
    }

    @WorkerThread
    private a k(String s, String s1, Date date0, Map map0) throws r {
        try {
            HttpURLConnection httpURLConnection0 = this.g.d();
            Map map1 = this.t();
            String s2 = this.h.e();
            Long long0 = this.q();
            a n$a0 = this.g.fetch(httpURLConnection0, s, s1, map1, s2, map0, long0, date0);
            if(n$a0.e() != null) {
                this.h.q(n$a0.e().k());
            }
            if(n$a0.f() != null) {
                this.h.p(n$a0.f());
            }
            this.h.k();
            return n$a0;
        }
        catch(u u0) {
        }
        com.google.firebase.remoteconfig.internal.q.a q$a0 = this.B(u0.b(), date0);
        if(this.A(q$a0, u0.b())) {
            throw new s(q$a0.a().getTime());
        }
        throw this.g(u0);
    }

    private Task l(String s, String s1, Date date0, Map map0) {
        try {
            a n$a0 = this.k(s, s1, date0, map0);
            if(n$a0.g() != 0) {
                return Tasks.forResult(n$a0);
            }
            Task task0 = this.f.m(n$a0.e());
            m m0 = (h h0) -> Tasks.forResult(n$a0);
            return task0.onSuccessTask(this.c, m0);
        }
        catch(r r0) {
            return Tasks.forException(r0);
        }
    }

    private Task m(Task task0, long v, Map map0) {
        Task task1;
        Date date0 = new Date(this.d.currentTimeMillis());
        if(task0.isSuccessful() && this.f(v, date0)) {
            return Tasks.forResult(a.c(date0));
        }
        Date date1 = this.p(date0);
        if(date1 == null) {
            Task task2 = this.a.getId();
            Task task3 = this.a.b(false);
            Task task4 = Tasks.whenAllComplete(new Task[]{task2, task3});
            j j0 = (Task task2) -> {
                if(!task2.isSuccessful()) {
                    return Tasks.forException(new com.google.firebase.remoteconfig.q("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
                }
                return task3.isSuccessful() ? this.l(((String)task2.getResult()), ((p)task3.getResult()).b(), date0, map0) : Tasks.forException(new com.google.firebase.remoteconfig.q("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
            };
            task1 = task4.continueWithTask(this.c, j0);
        }
        else {
            task1 = Tasks.forException(new s(this.h(date1.getTime() - date0.getTime()), date1.getTime()));
        }
        com.google.firebase.remoteconfig.internal.k k0 = (Task task0) -> {
            this.D(task0, date0);
            return task0;
        };
        return task1.continueWithTask(this.c, k0);
    }

    public Task n(b n$b0, int v) {
        HashMap hashMap0 = new HashMap(this.i);
        hashMap0.put("X-Firebase-RC-Fetch-Type", n$b0.b() + "/" + v);
        Task task0 = this.f.f();
        l l0 = (Task task0) -> this.m(task0, 0L, hashMap0);
        return task0.continueWithTask(this.c, l0);
    }

    @VisibleForTesting
    public h2.b o() {
        return this.b;
    }

    @Nullable
    private Date p(Date date0) {
        Date date1 = this.h.b().a();
        return date0.before(date1) ? date1 : null;
    }

    @WorkerThread
    private Long q() {
        com.google.firebase.analytics.connector.a a0 = (com.google.firebase.analytics.connector.a)this.b.get();
        return a0 == null ? null : ((Long)a0.g(true).get("_fot"));
    }

    private long r(int v) {
        long v1 = TimeUnit.MINUTES.toMillis(((long)n.k[Math.min(v, n.k.length) - 1]));
        return v1 / 2L + ((long)this.e.nextInt(((int)v1)));
    }

    public long s() {
        return this.h.h();
    }

    @WorkerThread
    private Map t() {
        Map map0 = new HashMap();
        com.google.firebase.analytics.connector.a a0 = (com.google.firebase.analytics.connector.a)this.b.get();
        if(a0 == null) {
            return map0;
        }
        for(Object object0: a0.g(false).entrySet()) {
            map0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue().toString());
        }
        return map0;
    }

    private boolean u(int v) {
        return v == 429 || v == 502 || v == 503 || v == 504;
    }

    // 检测为 Lambda 实现
    private Task v(long v, Map map0, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task w(a n$a0, h h0) throws Exception [...]

    // 检测为 Lambda 实现
    private Task x(Task task0, Task task1, Date date0, Map map0, Task task2) throws Exception [...]

    // 检测为 Lambda 实现
    private Task y(Date date0, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private Task z(Map map0, Task task0) throws Exception [...]
}

