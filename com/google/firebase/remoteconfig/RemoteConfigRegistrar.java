package com.google.firebase.remoteconfig;

import U1.b;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import t2.a;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        K k0 = K.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(new g[]{g.i(B.class, new Class[]{a.class}).h("fire-rc").b(w.m(Context.class)).b(w.l(k0)).b(w.m(h.class)).b(w.m(k.class)).b(w.m(com.google.firebase.abt.component.a.class)).b(w.k(com.google.firebase.analytics.connector.a.class)).f((i i0) -> new B(((Context)i0.a(Context.class)), ((ScheduledExecutorService)i0.j(k0)), ((h)i0.a(h.class)), ((k)i0.a(k.class)), ((com.google.firebase.abt.component.a)i0.a(com.google.firebase.abt.component.a.class)).b("frc"), i0.e(com.google.firebase.analytics.connector.a.class))).e().d(), com.google.firebase.platforminfo.h.b("fire-rc", "22.0.0")});
    }

    // 检测为 Lambda 实现
    private static B lambda$getComponents$0(K k0, i i0) [...]
}

