package com.google.firebase.crashlytics;

import U1.b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import com.google.firebase.crashlytics.internal.concurrency.l;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.sessions.api.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    private final K a;
    private final K b;
    private static final String c = "fire-cls";

    static {
        a.a(com.google.firebase.sessions.api.b.a.a);
    }

    public CrashlyticsRegistrar() {
        this.a = K.a(U1.a.class, ExecutorService.class);
        this.b = K.a(b.class, ExecutorService.class);
    }

    // 检测为 Lambda 实现
    private j b(i i0) [...]

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new g[]{g.h(j.class).h("fire-cls").b(w.m(h.class)).b(w.m(k.class)).b(w.l(this.a)).b(w.l(this.b)).b(w.b(com.google.firebase.crashlytics.internal.a.class)).b(w.b(com.google.firebase.analytics.connector.a.class)).b(w.b(t2.a.class)).f((i i0) -> {
            l.g(false);
            return j.f(((h)i0.a(h.class)), ((k)i0.a(k.class)), i0.k(com.google.firebase.crashlytics.internal.a.class), i0.k(com.google.firebase.analytics.connector.a.class), i0.k(t2.a.class), ((ExecutorService)i0.j(this.a)), ((ExecutorService)i0.j(this.b)));
        }).e().d(), com.google.firebase.platforminfo.h.b("fire-cls", "19.2.0")});
    }
}

