package com.google.firebase.messaging;

import Z1.d;
import androidx.annotation.Keep;
import com.google.android.datatransport.m;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.w;
import com.google.firebase.h;
import com.google.firebase.heartbeatinfo.k;
import com.google.firebase.platforminfo.i;
import g2.a;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Override  // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List getComponents() {
        K k0 = K.a(d.class, m.class);
        return Arrays.asList(new g[]{g.h(FirebaseMessaging.class).h("fire-fcm").b(w.m(h.class)).b(w.i(a.class)).b(w.k(i.class)).b(w.k(k.class)).b(w.m(com.google.firebase.installations.k.class)).b(w.j(k0)).b(w.m(e2.d.class)).f((com.google.firebase.components.i i0) -> new FirebaseMessaging(((h)i0.a(h.class)), ((a)i0.a(a.class)), i0.e(i.class), i0.e(k.class), ((com.google.firebase.installations.k)i0.a(com.google.firebase.installations.k.class)), i0.g(k0), ((e2.d)i0.a(e2.d.class)))).c().d(), com.google.firebase.platforminfo.h.b("fire-fcm", "24.0.2")});
    }

    // 检测为 Lambda 实现
    private static FirebaseMessaging lambda$getComponents$0(K k0, com.google.firebase.components.i i0) [...]
}

