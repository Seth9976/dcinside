package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.C;
import com.google.firebase.h;
import com.google.firebase.installations.local.d;
import com.google.firebase.installations.remote.f.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class j implements k {
    class a implements ThreadFactory {
        private final AtomicInteger a;

        a() {
            super();
            this.a = new AtomicInteger(1);
        }

        @Override
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable0) {
            return new Thread(runnable0, String.format("firebase-installations-executor-%d", this.a.getAndIncrement()));
        }
    }

    static class c {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            c.b = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.b[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.b[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[com.google.firebase.installations.remote.d.b.values().length];
            c.a = arr_v1;
            try {
                arr_v1[com.google.firebase.installations.remote.d.b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                c.a[com.google.firebase.installations.remote.d.b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final h a;
    private final com.google.firebase.installations.remote.c b;
    private final com.google.firebase.installations.local.c c;
    private final u d;
    private final C e;
    private final s f;
    private final Object g;
    private final ExecutorService h;
    private final Executor i;
    @GuardedBy("this")
    private String j;
    @GuardedBy("FirebaseInstallations.this")
    private Set k;
    @GuardedBy("lock")
    private final List l;
    private static final Object m = null;
    private static final String n = "generatefid.lock";
    private static final String o = "CHIME_ANDROID_SDK";
    private static final int p = 0;
    private static final int q = 1;
    private static final long r = 30L;
    private static final ThreadFactory s = null;
    private static final String t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";

    static {
        j.m = new Object();
        j.s = new a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    j(h h0, @NonNull h2.b b0, @NonNull ExecutorService executorService0, @NonNull Executor executor0) {
        this(executorService0, executor0, h0, new com.google.firebase.installations.remote.c(h0.n(), b0), new com.google.firebase.installations.local.c(h0), u.c(), new C(() -> new com.google.firebase.installations.local.b(h0)), new s());
    }

    @SuppressLint({"ThreadPoolCreation"})
    j(ExecutorService executorService0, Executor executor0, h h0, com.google.firebase.installations.remote.c c0, com.google.firebase.installations.local.c c1, u u0, C c2, s s0) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = h0;
        this.b = c0;
        this.c = c1;
        this.d = u0;
        this.e = c2;
        this.f = s0;
        this.h = executorService0;
        this.i = executor0;
    }

    private void A(d d0) {
        synchronized(j.m) {
            com.google.firebase.installations.d d1 = com.google.firebase.installations.d.a(this.a.n(), "generatefid.lock");
            try {
                this.c.c(d0);
            }
            catch(Throwable throwable0) {
                if(d1 != null) {
                    d1.b();
                }
                throw throwable0;
            }
            if(d1 != null) {
                d1.b();
            }
        }
    }

    // 检测为 Lambda 实现
    private void B(boolean z) [...]

    // 检测为 Lambda 实现
    private void C() [...]

    // 检测为 Lambda 实现
    private void D(boolean z) [...]

    // 检测为 Lambda 实现
    private static com.google.firebase.installations.local.b E(h h0) [...]

    private void F() {
        Preconditions.checkNotEmpty(this.r(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.z(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.q(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(u.h(this.r()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(u.g(this.q()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    // 去混淆评级： 低(22)
    private String G(d d0) {
        if(!this.a.r().equals("CHIME_ANDROID_SDK") && !this.a.B() || !d0.m()) {
            return "dlp9v4MiT5iL0yRmCaFwGv";
        }
        String s = this.t().f();
        return TextUtils.isEmpty(s) ? "dlp9v4MiT5iL0yRmCaFwGv" : s;
    }

    private d H(d d0) throws l {
        String s = d0.d() == null || d0.d().length() != 11 ? null : this.t().i();
        String s1 = this.q();
        String s2 = d0.d();
        String s3 = this.z();
        String s4 = this.r();
        com.google.firebase.installations.remote.d d1 = this.b.d(s1, s2, s3, s4, s);
        switch(c.a[d1.e().ordinal()]) {
            case 1: {
                return d0.s(d1.c(), d1.d(), this.d.b(), d1.b().c(), d1.b().d());
            }
            case 2: {
                return d0.q("BAD CONFIG");
            }
            default: {
                throw new l("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.l.a.b);
            }
        }
    }

    private void I(Exception exception0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((t)object1).a(exception0)) {
                    iterator0.remove();
                }
            }
        }
    }

    private void J(d d0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((t)object1).b(d0)) {
                    iterator0.remove();
                }
            }
        }
    }

    private void K(String s) {
        synchronized(this) {
            this.j = s;
        }
    }

    private void L(d d0, d d1) {
        synchronized(this) {
            if(this.k.size() != 0 && !TextUtils.equals(d0.d(), d1.d())) {
                for(Object object0: this.k) {
                    ((i2.a)object0).a(d1.d());
                }
            }
        }
    }

    @Override  // com.google.firebase.installations.k
    @NonNull
    public Task a() {
        com.google.firebase.installations.h h0 = () -> {
            this.K(null);
            d d0 = this.w();
            if(d0.k()) {
                String s = this.q();
                String s1 = d0.d();
                String s2 = this.z();
                String s3 = d0.f();
                this.b.e(s, s1, s2, s3);
            }
            this.A(d0.r());
            return null;
        };
        return Tasks.call(this.h, h0);
    }

    @Override  // com.google.firebase.installations.k
    @NonNull
    public Task b(boolean z) {
        this.F();
        Task task0 = this.j();
        i i0 = () -> this.o(z);
        this.h.execute(i0);
        return task0;
    }

    @Override  // com.google.firebase.installations.k
    @NonNull
    public i2.b c(@NonNull i2.a a0) {
        class com.google.firebase.installations.j.b implements i2.b {
            final i2.a a;
            final j b;

            com.google.firebase.installations.j.b(i2.a a0) {
                this.a = a0;
                super();
            }

            @Override  // i2.b
            public void a() {
                synchronized(j.this) {
                    j.this.k.remove(this.a);
                }
            }
        }

        synchronized(this) {
            this.k.add(a0);
            return new com.google.firebase.installations.j.b(this, a0);
        }
    }

    @Override  // com.google.firebase.installations.k
    @NonNull
    public Task getId() {
        this.F();
        String s = this.s();
        if(s != null) {
            return Tasks.forResult(s);
        }
        Task task0 = this.k();
        g g0 = () -> this.o(false);
        this.h.execute(g0);
        return task0;
    }

    private Task j() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.l(new n(this.d, taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    private Task k() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.l(new o(taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    private void l(t t0) {
        synchronized(this.g) {
            this.l.add(t0);
        }
    }

    // 检测为 Lambda 实现
    private Void m() throws l [...]

    private void n(boolean z) {
        d d1;
        d d0 = this.w();
        try {
            if(d0.i() || d0.l()) {
                d1 = this.H(d0);
            }
            else {
                if(!z && !this.d.f(d0)) {
                    return;
                }
                d1 = this.p(d0);
            }
        }
        catch(l l0) {
            this.I(l0);
            return;
        }
        this.A(d1);
        this.L(d0, d1);
        if(d1.k()) {
            this.K(d1.d());
        }
        if(d1.i()) {
            this.I(new l(com.google.firebase.installations.l.a.a));
            return;
        }
        if(d1.j()) {
            this.I(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            return;
        }
        this.J(d1);
    }

    private final void o(boolean z) {
        d d0 = this.y();
        if(z) {
            d0 = d0.p();
        }
        this.J(d0);
        f f0 = () -> this.n(z);
        this.i.execute(f0);
    }

    private d p(@NonNull d d0) throws l {
        String s = this.q();
        String s1 = d0.d();
        String s2 = this.z();
        String s3 = d0.f();
        com.google.firebase.installations.remote.f f0 = this.b.f(s, s1, s2, s3);
        switch(f0.b()) {
            case 1: {
                return d0.o(f0.c(), f0.d(), this.d.b());
            }
            case 2: {
                return d0.q("BAD CONFIG");
            }
            case 3: {
                this.K(null);
                return d0.r();
            }
            default: {
                throw new l("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.l.a.b);
            }
        }
    }

    @Nullable
    String q() {
        return this.a.s().i();
    }

    @VisibleForTesting
    String r() {
        return this.a.s().j();
    }

    private String s() {
        synchronized(this) {
        }
        return this.j;
    }

    private com.google.firebase.installations.local.b t() {
        return (com.google.firebase.installations.local.b)this.e.get();
    }

    @NonNull
    public static j u() {
        return j.v(h.p());
    }

    @NonNull
    public static j v(@NonNull h h0) {
        Preconditions.checkArgument(h0 != null, "Null is not a valid value of FirebaseApp.");
        return (j)h0.l(k.class);
    }

    private d w() {
        d d1;
        synchronized(j.m) {
            com.google.firebase.installations.d d0 = com.google.firebase.installations.d.a(this.a.n(), "generatefid.lock");
            try {
                d1 = this.c.e();
            }
            catch(Throwable throwable0) {
                if(d0 != null) {
                    d0.b();
                }
                throw throwable0;
            }
            if(d0 != null) {
                d0.b();
            }
            return d1;
        }
    }

    @VisibleForTesting
    String x() {
        return this.a.r();
    }

    private d y() {
        synchronized(j.m) {
            com.google.firebase.installations.d d0 = com.google.firebase.installations.d.a(this.a.n(), "generatefid.lock");
            try {
                d d1 = this.c.e();
                if(d1.j()) {
                    d d2 = d1.t(this.G(d1));
                    d1 = this.c.c(d2);
                }
                return d1;
            }
            finally {
                if(d0 != null) {
                    d0.b();
                }
            }
        }
    }

    @Nullable
    String z() {
        return this.a.s().n();
    }
}

