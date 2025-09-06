package com.google.firebase.installations;

import U1.a;
import U1.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import com.google.firebase.concurrent.A;
import com.google.firebase.h;
import com.google.firebase.heartbeatinfo.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new g[]{g.h(k.class).h("fire-installations").b(w.m(h.class)).b(w.k(j.class)).b(w.l(K.a(a.class, ExecutorService.class))).b(w.l(K.a(b.class, Executor.class))).f((i i0) -> new com.google.firebase.installations.j(((h)i0.a(h.class)), i0.e(j.class), ((ExecutorService)i0.j(K.a(a.class, ExecutorService.class))), A.h(((Executor)i0.j(K.a(b.class, Executor.class)))))).d(), com.google.firebase.heartbeatinfo.i.a(), com.google.firebase.platforminfo.h.b("fire-installations", "18.0.0")});
    }

    // 检测为 Lambda 实现
    private static k lambda$getComponents$0(i i0) [...]
}

