package com.google.firebase.perf;

import U1.d;
import androidx.annotation.Keep;
import com.google.android.datatransport.m;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.perf.injection.components.a;
import com.google.firebase.remoteconfig.B;
import com.google.firebase.u;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    @Override  // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List getComponents() {
        K k0 = K.a(d.class, Executor.class);
        return Arrays.asList(new g[]{g.h(e.class).h("fire-perf").b(w.m(h.class)).b(w.o(B.class)).b(w.m(k.class)).b(w.o(m.class)).b(w.m(b.class)).f((i i0) -> {
            i0.a(b.class);
            return a.b().b(new com.google.firebase.perf.injection.modules.a(((h)i0.a(h.class)), ((k)i0.a(k.class)), i0.e(B.class), i0.e(m.class))).a().a();
        }).d(), g.h(b.class).h("fire-perf-early").b(w.m(h.class)).b(w.k(u.class)).b(w.l(k0)).e().f((i i0) -> new b(((h)i0.a(h.class)), ((u)i0.e(u.class).get()), ((Executor)i0.j(k0)))).d(), com.google.firebase.platforminfo.h.b("fire-perf", "21.0.1")});
    }

    // 检测为 Lambda 实现
    private static b lambda$getComponents$0(K k0, i i0) [...]

    // 检测为 Lambda 实现
    private static e providesFirebasePerformance(i i0) [...]
}

