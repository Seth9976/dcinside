package com.google.firebase.perf.config;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.util.e;
import com.google.firebase.perf.util.f;

public class a {
    private final RemoteConfigManager a;
    private e b;
    private com.google.firebase.perf.config.e c;
    private static final com.google.firebase.perf.logging.a d;
    private static volatile a e;

    static {
        a.d = com.google.firebase.perf.logging.a.e();
    }

    @VisibleForTesting
    public a(@Nullable RemoteConfigManager remoteConfigManager0, @Nullable e e0, @Nullable com.google.firebase.perf.config.e e1) {
        if(remoteConfigManager0 == null) {
            remoteConfigManager0 = RemoteConfigManager.getInstance();
        }
        this.a = remoteConfigManager0;
        if(e0 == null) {
            e0 = new e();
        }
        this.b = e0;
        if(e1 == null) {
            e1 = com.google.firebase.perf.config.e.h();
        }
        this.c = e1;
    }

    public long A() {
        l b$l0 = l.g();
        f f0 = this.q(b$l0);
        if(f0.d() && this.M(((long)(((Long)f0.c()))))) {
            return (long)(((Long)f0.c()));
        }
        f f1 = this.x(b$l0);
        if(f1.d() && this.M(((long)(((Long)f1.c()))))) {
            this.c.n("com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs", ((long)(((Long)f1.c()))));
            return (long)(((Long)f1.c()));
        }
        f f2 = this.e(b$l0);
        return !f2.d() || !this.M(((long)(((Long)f2.c())))) ? ((long)b$l0.f()) : ((long)(((Long)f2.c())));
    }

    public long B() {
        m b$m0 = m.h();
        f f0 = this.q(b$m0);
        if(f0.d() && this.M(((long)(((Long)f0.c()))))) {
            return (long)(((Long)f0.c()));
        }
        f f1 = this.x(b$m0);
        if(f1.d() && this.M(((long)(((Long)f1.c()))))) {
            this.c.n("com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs", ((long)(((Long)f1.c()))));
            return (long)(((Long)f1.c()));
        }
        f f2 = this.e(b$m0);
        if(f2.d() && this.M(((long)(((Long)f2.c()))))) {
            return (long)(((Long)f2.c()));
        }
        return this.a.isLastFetchFailed() ? ((long)b$m0.g()) : ((long)b$m0.f());
    }

    public long C() {
        n b$n0 = n.g();
        f f0 = this.q(b$n0);
        if(f0.d() && this.P(((long)(((Long)f0.c()))))) {
            return (long)(((Long)f0.c()));
        }
        f f1 = this.x(b$n0);
        if(f1.d() && this.P(((long)(((Long)f1.c()))))) {
            this.c.n("com.google.firebase.perf.SessionsMaxDurationMinutes", ((long)(((Long)f1.c()))));
            return (long)(((Long)f1.c()));
        }
        f f2 = this.e(b$n0);
        return !f2.d() || !this.P(((long)(((Long)f2.c())))) ? ((long)b$n0.f()) : ((long)(((Long)f2.c())));
    }

    public long D() {
        o b$o0 = o.g();
        f f0 = this.q(b$o0);
        if(f0.d() && this.M(((long)(((Long)f0.c()))))) {
            return (long)(((Long)f0.c()));
        }
        f f1 = this.x(b$o0);
        if(f1.d() && this.M(((long)(((Long)f1.c()))))) {
            this.c.n("com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs", ((long)(((Long)f1.c()))));
            return (long)(((Long)f1.c()));
        }
        f f2 = this.e(b$o0);
        return !f2.d() || !this.M(((long)(((Long)f2.c())))) ? ((long)b$o0.f()) : ((long)(((Long)f2.c())));
    }

    public long E() {
        p b$p0 = p.h();
        f f0 = this.q(b$p0);
        if(f0.d() && this.M(((long)(((Long)f0.c()))))) {
            return (long)(((Long)f0.c()));
        }
        f f1 = this.x(b$p0);
        if(f1.d() && this.M(((long)(((Long)f1.c()))))) {
            this.c.n("com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs", ((long)(((Long)f1.c()))));
            return (long)(((Long)f1.c()));
        }
        f f2 = this.e(b$p0);
        if(f2.d() && this.M(((long)(((Long)f2.c()))))) {
            return (long)(((Long)f2.c()));
        }
        return this.a.isLastFetchFailed() ? ((long)b$p0.g()) : ((long)b$p0.f());
    }

    public double F() {
        q b$q0 = q.h();
        f f0 = this.p(b$q0);
        if(f0.d()) {
            double f1 = (double)(((Double)f0.c()));
            if(this.O(f1 / 100.0)) {
                return f1 / 100.0;
            }
        }
        f f2 = this.w(b$q0);
        if(f2.d() && this.O(((double)(((Double)f2.c()))))) {
            this.c.m("com.google.firebase.perf.SessionSamplingRate", ((double)(((Double)f2.c()))));
            return (double)(((Double)f2.c()));
        }
        f f3 = this.d(b$q0);
        if(f3.d() && this.O(((double)(((Double)f3.c()))))) {
            return (double)(((Double)f3.c()));
        }
        return this.a.isLastFetchFailed() ? ((double)b$q0.g()) : ((double)b$q0.f());
    }

    public long G() {
        r b$r0 = r.g();
        f f0 = this.x(b$r0);
        if(f0.d() && this.K(((long)(((Long)f0.c()))))) {
            this.c.n("com.google.firebase.perf.TraceEventCountBackground", ((long)(((Long)f0.c()))));
            return (long)(((Long)f0.c()));
        }
        f f1 = this.e(b$r0);
        return !f1.d() || !this.K(((long)(((Long)f1.c())))) ? ((long)b$r0.f()) : ((long)(((Long)f1.c())));
    }

    public long H() {
        s b$s0 = s.g();
        f f0 = this.x(b$s0);
        if(f0.d() && this.K(((long)(((Long)f0.c()))))) {
            this.c.n("com.google.firebase.perf.TraceEventCountForeground", ((long)(((Long)f0.c()))));
            return (long)(((Long)f0.c()));
        }
        f f1 = this.e(b$s0);
        return !f1.d() || !this.K(((long)(((Long)f1.c())))) ? ((long)b$s0.f()) : ((long)(((Long)f1.c())));
    }

    public double I() {
        t b$t0 = t.h();
        f f0 = this.w(b$t0);
        if(f0.d() && this.O(((double)(((Double)f0.c()))))) {
            this.c.m("com.google.firebase.perf.TraceSamplingRate", ((double)(((Double)f0.c()))));
            return (double)(((Double)f0.c()));
        }
        f f1 = this.d(b$t0);
        if(f1.d() && this.O(((double)(((Double)f1.c()))))) {
            return (double)(((Double)f1.c()));
        }
        return this.a.isLastFetchFailed() ? ((double)b$t0.g()) : ((double)b$t0.f());
    }

    public boolean J() {
        f f0 = this.v(k.g());
        return this.c(b.g()).d() || f0.d();
    }

    private boolean K(long v) {
        return v >= 0L;
    }

    private boolean L(String s) {
        if(s.trim().isEmpty()) {
            return false;
        }
        String[] arr_s = s.split(";");
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].trim().equals("21.0.1")) {
                return true;
            }
        }
        return false;
    }

    private boolean M(long v) {
        return v >= 0L;
    }

    public boolean N() {
        Boolean boolean0 = this.k();
        return (boolean0 == null || boolean0.booleanValue()) && this.n();
    }

    // 去混淆评级： 低(20)
    private boolean O(double f) {
        return 0L <= ((long)f) && ((long)f) <= 0x3FF0000000000000L;
    }

    private boolean P(long v) {
        return v > 0L;
    }

    private boolean Q(long v) {
        return v > 0L;
    }

    public void R(Context context0) {
        boolean z = com.google.firebase.perf.util.m.c(context0);
        a.d.i(z);
        this.c.l(context0);
    }

    public void S(Context context0) {
        this.R(context0.getApplicationContext());
    }

    @VisibleForTesting
    public void T(com.google.firebase.perf.config.e e0) {
        this.c = e0;
    }

    public void U(Boolean boolean0) {
        if(this.j().booleanValue()) {
            return;
        }
        if(boolean0 != null) {
            this.c.p("isEnabled", Boolean.TRUE.equals(boolean0));
            return;
        }
        this.c.b("isEnabled");
    }

    public void V(e e0) {
        this.b = e0;
    }

    @VisibleForTesting
    public static void a() {
        a.e = null;
    }

    public String b() {
        com.google.firebase.perf.config.b.e b$e0 = com.google.firebase.perf.config.b.e.g();
        if(com.google.firebase.perf.a.d.booleanValue()) {
            return "FIREPERF";
        }
        long v = (long)(((Long)this.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L)));
        if(com.google.firebase.perf.config.b.e.i(v)) {
            String s = com.google.firebase.perf.config.b.e.h(v);
            if(s != null) {
                this.c.o("com.google.firebase.perf.LogSourceName", s);
                return s;
            }
        }
        f f0 = this.f(b$e0);
        return f0.d() ? ((String)f0.c()) : "FIREPERF";
    }

    private f c(c c0) {
        return this.c.e(c0.c());
    }

    private f d(c c0) {
        return this.c.f(c0.c());
    }

    private f e(c c0) {
        return this.c.i(c0.c());
    }

    private f f(c c0) {
        return this.c.j(c0.c());
    }

    public double g() {
        d b$d0 = d.g();
        f f0 = this.p(b$d0);
        if(f0.d()) {
            double f1 = (double)(((Double)f0.c()));
            if(this.O(f1 / 100.0)) {
                return f1 / 100.0;
            }
        }
        f f2 = this.w(b$d0);
        if(f2.d() && this.O(((double)(((Double)f2.c()))))) {
            this.c.m("com.google.firebase.perf.FragmentSamplingRate", ((double)(((Double)f2.c()))));
            return (double)(((Double)f2.c()));
        }
        f f3 = this.d(b$d0);
        return !f3.d() || !this.O(((double)(((Double)f3.c())))) ? ((double)b$d0.f()) : ((double)(((Double)f3.c())));
    }

    public static a h() {
        synchronized(a.class) {
            if(a.e == null) {
                a.e = new a(null, null, null);
            }
            return a.e;
        }
    }

    public boolean i() {
        com.google.firebase.perf.config.b.c b$c0 = com.google.firebase.perf.config.b.c.g();
        f f0 = this.o(b$c0);
        if(f0.d()) {
            return ((Boolean)f0.c()).booleanValue();
        }
        f f1 = this.v(b$c0);
        if(f1.d()) {
            this.c.p("com.google.firebase.perf.ExperimentTTID", ((Boolean)f1.c()).booleanValue());
            return ((Boolean)f1.c()).booleanValue();
        }
        f f2 = this.c(b$c0);
        return f2.d() ? ((Boolean)f2.c()).booleanValue() : b$c0.f().booleanValue();
    }

    @Nullable
    public Boolean j() {
        com.google.firebase.perf.config.b.a b$a0 = com.google.firebase.perf.config.b.a.g();
        f f0 = this.o(b$a0);
        return f0.d() ? ((Boolean)f0.c()) : b$a0.f();
    }

    @Nullable
    public Boolean k() {
        if(this.j().booleanValue()) {
            return false;
        }
        b b$b0 = b.g();
        f f0 = this.c(b$b0);
        if(f0.d()) {
            return (Boolean)f0.c();
        }
        f f1 = this.o(b$b0);
        return f1.d() ? ((Boolean)f1.c()) : null;
    }

    private boolean l() {
        k b$k0 = k.g();
        f f0 = this.v(b$k0);
        if(f0.d()) {
            if(this.a.isLastFetchFailed()) {
                return false;
            }
            this.c.p("com.google.firebase.perf.SdkEnabled", ((Boolean)f0.c()).booleanValue());
            return ((Boolean)f0.c()).booleanValue();
        }
        f f1 = this.c(b$k0);
        return f1.d() ? ((Boolean)f1.c()).booleanValue() : b$k0.f().booleanValue();
    }

    private boolean m() {
        j b$j0 = j.g();
        f f0 = this.y(b$j0);
        if(f0.d()) {
            this.c.o("com.google.firebase.perf.SdkDisabledVersions", ((String)f0.c()));
            return this.L(((String)f0.c()));
        }
        f f1 = this.f(b$j0);
        return f1.d() ? this.L(((String)f1.c())) : this.L("");
    }

    // 去混淆评级： 低(20)
    public boolean n() {
        return this.l() && !this.m();
    }

    private f o(c c0) {
        return this.b.b(c0.d());
    }

    private f p(c c0) {
        return this.b.c(c0.d());
    }

    private f q(c c0) {
        return this.b.e(c0.d());
    }

    public long r() {
        com.google.firebase.perf.config.b.f b$f0 = com.google.firebase.perf.config.b.f.g();
        f f0 = this.x(b$f0);
        if(f0.d() && this.K(((long)(((Long)f0.c()))))) {
            this.c.n("com.google.firebase.perf.NetworkEventCountBackground", ((long)(((Long)f0.c()))));
            return (long)(((Long)f0.c()));
        }
        f f1 = this.e(b$f0);
        return !f1.d() || !this.K(((long)(((Long)f1.c())))) ? ((long)b$f0.f()) : ((long)(((Long)f1.c())));
    }

    public long s() {
        g b$g0 = g.g();
        f f0 = this.x(b$g0);
        if(f0.d() && this.K(((long)(((Long)f0.c()))))) {
            this.c.n("com.google.firebase.perf.NetworkEventCountForeground", ((long)(((Long)f0.c()))));
            return (long)(((Long)f0.c()));
        }
        f f1 = this.e(b$g0);
        return !f1.d() || !this.K(((long)(((Long)f1.c())))) ? ((long)b$g0.f()) : ((long)(((Long)f1.c())));
    }

    public double t() {
        h b$h0 = h.h();
        f f0 = this.w(b$h0);
        if(f0.d() && this.O(((double)(((Double)f0.c()))))) {
            this.c.m("com.google.firebase.perf.NetworkRequestSamplingRate", ((double)(((Double)f0.c()))));
            return (double)(((Double)f0.c()));
        }
        f f1 = this.d(b$h0);
        if(f1.d() && this.O(((double)(((Double)f1.c()))))) {
            return (double)(((Double)f1.c()));
        }
        return this.a.isLastFetchFailed() ? ((double)b$h0.g()) : ((double)b$h0.f());
    }

    public long u() {
        i b$i0 = i.g();
        f f0 = this.x(b$i0);
        if(f0.d() && this.Q(((long)(((Long)f0.c()))))) {
            this.c.n("com.google.firebase.perf.TimeLimitSec", ((long)(((Long)f0.c()))));
            return (long)(((Long)f0.c()));
        }
        f f1 = this.e(b$i0);
        return !f1.d() || !this.Q(((long)(((Long)f1.c())))) ? ((long)b$i0.f()) : ((long)(((Long)f1.c())));
    }

    private f v(c c0) {
        return this.a.getBoolean(c0.e());
    }

    private f w(c c0) {
        return this.a.getDouble(c0.e());
    }

    private f x(c c0) {
        return this.a.getLong(c0.e());
    }

    private f y(c c0) {
        return this.a.getString(c0.e());
    }

    private Long z(c c0) {
        String s = c0.e();
        if(s == null) {
            return (Long)c0.a();
        }
        Long long0 = (Long)c0.a();
        return (Long)this.a.getRemoteConfigValueOrDefault(s, long0);
    }
}

