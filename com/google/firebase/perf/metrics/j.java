package com.google.firebase.perf.metrics;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.a;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.m;
import com.google.firebase.perf.v1.q.d;
import com.google.firebase.perf.v1.q.e;
import com.google.firebase.perf.v1.q;
import com.google.firebase.perf.v1.u;
import j..util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class j extends b implements a {
    private final List a;
    private final GaugeManager b;
    private final k c;
    private final com.google.firebase.perf.v1.q.b d;
    private final WeakReference e;
    @Nullable
    private String f;
    private boolean g;
    private boolean h;
    private static final com.google.firebase.perf.logging.a i = null;
    private static final char j = '\u001F';
    private static final char k = '\u007F';

    static {
        j.i = com.google.firebase.perf.logging.a.e();
    }

    private j(k k0) {
        this(k0, com.google.firebase.perf.application.a.c(), GaugeManager.getInstance());
    }

    public j(k k0, com.google.firebase.perf.application.a a0, GaugeManager gaugeManager0) {
        super(a0);
        this.d = q.dc();
        this.e = new WeakReference(this);
        this.c = k0;
        this.b = gaugeManager0;
        this.a = DesugarCollections.synchronizedList(new ArrayList());
        this.registerForAppState();
    }

    public j A(long v) {
        this.d.Zb(v);
        return this;
    }

    public j B(long v) {
        this.d.ac(v);
        return this;
    }

    public j C(long v) {
        this.d.bc(v);
        if(SessionManager.getInstance().perfSession().f()) {
            this.b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e());
        }
        return this;
    }

    public j D(long v) {
        this.d.cc(v);
        return this;
    }

    public j E(@Nullable String s) {
        if(s != null) {
            String s1 = m.f(m.e(s), 2000);
            this.d.dc(s1);
        }
        return this;
    }

    public j F(@Nullable String s) {
        this.f = s;
        return this;
    }

    @Override  // com.google.firebase.perf.session.a
    public void a(PerfSession perfSession0) {
        if(perfSession0 == null) {
            j.i.l("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        if(this.l() && !this.o()) {
            this.a.add(perfSession0);
        }
    }

    public q c() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        this.unregisterForAppState();
        u[] arr_u = PerfSession.c(this.f());
        if(arr_u != null) {
            List list0 = Arrays.asList(arr_u);
            this.d.ub(list0);
        }
        q q0 = (q)this.d.build();
        if(!com.google.firebase.perf.network.j.c(this.f)) {
            j.i.a("Dropping network request from a \'User-Agent\' that is not allowed");
            return q0;
        }
        if(!this.g) {
            this.c.G(q0, this.getAppState());
            this.g = true;
            return q0;
        }
        if(this.h) {
            j.i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return q0;
    }

    public static j d(k k0) {
        return new j(k0);
    }

    @VisibleForTesting
    void e() {
        this.d.clear();
    }

    @VisibleForTesting
    List f() {
        ArrayList arrayList0;
        synchronized(this.a) {
            arrayList0 = new ArrayList();
            for(Object object0: this.a) {
                PerfSession perfSession0 = (PerfSession)object0;
                if(perfSession0 != null) {
                    arrayList0.add(perfSession0);
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public long g() {
        return this.d.na();
    }

    public String h() {
        return this.d.F0();
    }

    public boolean i() {
        return this.d.T6();
    }

    private boolean l() {
        return this.d.b1();
    }

    @VisibleForTesting
    boolean m() {
        return this.g;
    }

    private boolean o() {
        return this.d.d5();
    }

    private static boolean q(String s) {
        if(s.length() > 0x80) {
            return false;
        }
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(v1 > 0x1F && v1 <= 0x7F) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    public j r(Map map0) {
        this.d.Ab().Mb(map0);
        return this;
    }

    public j s(@Nullable String s) {
        if(s != null) {
            d q$d0 = d.b;
            String s1 = s.toUpperCase();
            s1.hashCode();
            switch(s1) {
                case "CONNECT": {
                    q$d0 = d.k;
                    break;
                }
                case "DELETE": {
                    q$d0 = d.f;
                    break;
                }
                case "GET": {
                    q$d0 = d.c;
                    break;
                }
                case "HEAD": {
                    q$d0 = d.g;
                    break;
                }
                case "OPTIONS": {
                    q$d0 = d.i;
                    break;
                }
                case "PATCH": {
                    q$d0 = d.h;
                    break;
                }
                case "POST": {
                    q$d0 = d.e;
                    break;
                }
                case "PUT": {
                    q$d0 = d.d;
                    break;
                }
                case "TRACE": {
                    q$d0 = d.j;
                }
            }
            this.d.Rb(q$d0);
        }
        return this;
    }

    public j t(int v) {
        this.d.Sb(v);
        return this;
    }

    public void u() {
        this.h = true;
    }

    public j v() {
        this.d.Tb(e.c);
        return this;
    }

    @VisibleForTesting
    void w() {
        this.g = true;
    }

    public j x(long v) {
        this.d.Wb(v);
        return this;
    }

    public j y(long v) {
        PerfSession perfSession0 = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        this.d.Qb(v);
        this.a(perfSession0);
        if(perfSession0.f()) {
            this.b.collectGaugeMetricOnce(perfSession0.e());
        }
        return this;
    }

    public j z(@Nullable String s) {
        if(s == null) {
            this.d.Gb();
            return this;
        }
        if(j.q(s)) {
            this.d.Xb(s);
            return this;
        }
        j.i.l("The content type of the response is not a valid content-type:" + s);
        return this;
    }
}

