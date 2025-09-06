package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.f;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.metrics.validator.e;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import j..util.concurrent.ConcurrentHashMap;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class i implements f {
    private final j a;
    private final Timer b;
    private final Map c;
    private boolean d;
    private boolean e;
    private static final a f;

    static {
        i.f = a.e();
    }

    public i(String s, String s1, k k0, Timer timer0) {
        this.d = false;
        this.e = false;
        this.c = new ConcurrentHashMap();
        this.b = timer0;
        j j0 = j.d(k0).E(s).s(s1);
        this.a = j0;
        j0.u();
        if(!com.google.firebase.perf.config.a.h().N()) {
            i.f.g("HttpMetric feature is disabled. URL %s", new Object[]{s});
            this.e = true;
        }
    }

    public i(URL uRL0, String s, k k0, Timer timer0) {
        this(uRL0.toString(), s, k0, timer0);
    }

    private void a(@NonNull String s, @NonNull String s1) {
        if(this.d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if(!this.c.containsKey(s) && this.c.size() >= 5) {
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
        e.d(s, s1);
    }

    public void b() {
        long v = this.b.d();
        this.a.B(v);
    }

    public void c() {
        long v = this.b.d();
        this.a.D(v);
    }

    public void d(int v) {
        this.a.t(v);
    }

    public void e(long v) {
        this.a.x(v);
    }

    public void f(@Nullable String s) {
        this.a.z(s);
    }

    public void g(long v) {
        this.a.A(v);
    }

    @Override  // com.google.firebase.perf.f
    @Nullable
    public String getAttribute(@NonNull String s) {
        return (String)this.c.get(s);
    }

    @Override  // com.google.firebase.perf.f
    @NonNull
    public Map getAttributes() {
        return new HashMap(this.c);
    }

    public void h() {
        this.b.h();
        this.a.y(this.b.f());
    }

    public void i() {
        if(this.e) {
            return;
        }
        long v = this.b.d();
        this.a.C(v).r(this.c).c();
        this.d = true;
    }

    @Override  // com.google.firebase.perf.f
    public void putAttribute(@NonNull String s, @NonNull String s1) {
        boolean z = true;
        try {
            s = s.trim();
            s1 = s1.trim();
            this.a(s, s1);
            Object[] arr_object = {s, s1, this.a.h()};
            i.f.b("Setting attribute \'%s\' to %s on network request \'%s\'", arr_object);
        }
        catch(Exception exception0) {
            i.f.d("Cannot set attribute \'%s\' with value \'%s\' (%s)", new Object[]{s, s1, exception0.getMessage()});
            z = false;
        }
        if(z) {
            this.c.put(s, s1);
        }
    }

    @Override  // com.google.firebase.perf.f
    public void removeAttribute(@NonNull String s) {
        if(this.d) {
            i.f.c("Can\'t remove a attribute from a HttpMetric that\'s stopped.");
            return;
        }
        this.c.remove(s);
    }
}

