package com.google.firebase.crashlytics;

import W1.b;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.C;
import com.google.firebase.crashlytics.internal.common.I;
import com.google.firebase.crashlytics.internal.common.N;
import com.google.firebase.crashlytics.internal.common.f;
import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.concurrency.l;
import com.google.firebase.crashlytics.internal.d;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import h2.a;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class j {
    @VisibleForTesting
    final C a;
    static final String b = "clx";
    static final String c = "crash";
    static final int d = 500;

    private j(@NonNull C c0) {
        this.a = c0;
    }

    @NonNull
    public Task b() {
        return this.a.m();
    }

    public void c() {
        this.a.n();
    }

    public boolean d() {
        return this.a.o();
    }

    @NonNull
    public static j e() {
        j j0 = (j)h.p().l(j.class);
        if(j0 == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        return j0;
    }

    @Nullable
    static j f(@NonNull h h0, @NonNull k k0, @NonNull a a0, @NonNull a a1, @NonNull a a2, ExecutorService executorService0, ExecutorService executorService1) {
        com.google.firebase.crashlytics.internal.common.a a3;
        Context context0 = h0.n();
        g.f().g("Initializing Firebase Crashlytics 19.2.0 for com.dcinside.app.android");
        l l0 = new l(executorService0, executorService1);
        com.google.firebase.crashlytics.internal.persistence.g g0 = new com.google.firebase.crashlytics.internal.persistence.g(context0);
        I i0 = new I(h0);
        N n0 = new N(context0, "com.dcinside.app.android", k0, i0);
        d d0 = new d(a0);
        com.google.firebase.crashlytics.d d1 = new com.google.firebase.crashlytics.d(a1);
        m m0 = new m(i0, g0);
        com.google.firebase.sessions.api.a.e(m0);
        com.google.firebase.crashlytics.internal.l l1 = new com.google.firebase.crashlytics.internal.l(a2);
        C c0 = new C(h0, n0, d0, i0, d1.e(), d1.d(), g0, m0, l1, l0);
        String s = h0.s().j();
        String s1 = i.n(context0);
        List list0 = i.j(context0);
        g.f().b("Mapping file ID is: " + s1);
        for(Object object0: list0) {
            g.f().b(String.format("Build id for %s on %s: %s", ((f)object0).c(), ((f)object0).a(), ((f)object0).b()));
        }
        com.google.firebase.crashlytics.internal.f f0 = new com.google.firebase.crashlytics.internal.f(context0);
        try {
            a3 = com.google.firebase.crashlytics.internal.common.a.a(context0, n0, s, s1, list0, f0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            g.f().e("Error retrieving app package info.", packageManager$NameNotFoundException0);
            return null;
        }
        g.f().k("Installer package name is: " + a3.d);
        com.google.firebase.crashlytics.internal.settings.g g1 = com.google.firebase.crashlytics.internal.settings.g.l(context0, s, n0, new b(), a3.f, a3.g, g0, i0);
        g1.o(l0).addOnFailureListener((Exception exception0) -> g.f().e("Error fetching settings.", exception0));
        if(c0.N(a3, g1)) {
            c0.r(g1);
        }
        return new j(c0);
    }

    public boolean g() {
        return this.a.w();
    }

    // 检测为 Lambda 实现
    private static void h(Exception exception0) [...]

    public void i(@NonNull String s) {
        this.a.I(s);
    }

    public void j(@NonNull Throwable throwable0) {
        if(throwable0 == null) {
            g.f().m("A null value was passed to recordException. Ignoring.");
            return;
        }
        this.a.J(throwable0);
    }

    public void k() {
        this.a.O();
    }

    public void l(@Nullable Boolean boolean0) {
        this.a.P(boolean0);
    }

    public void m(boolean z) {
        this.a.P(Boolean.valueOf(z));
    }

    public void n(@NonNull String s, double f) {
        this.a.Q(s, Double.toString(f));
    }

    public void o(@NonNull String s, float f) {
        this.a.Q(s, Float.toString(f));
    }

    public void p(@NonNull String s, int v) {
        this.a.Q(s, Integer.toString(v));
    }

    public void q(@NonNull String s, long v) {
        this.a.Q(s, Long.toString(v));
    }

    public void r(@NonNull String s, @NonNull String s1) {
        this.a.Q(s, s1);
    }

    public void s(@NonNull String s, boolean z) {
        this.a.Q(s, Boolean.toString(z));
    }

    public void t(@NonNull com.google.firebase.crashlytics.h h0) {
        this.a.R(h0.a);
    }

    public void u(@NonNull String s) {
        this.a.T(s);
    }
}

