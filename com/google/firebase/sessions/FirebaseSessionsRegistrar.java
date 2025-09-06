package com.google.firebase.sessions;

import U1.b;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.m;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.sessions.settings.f;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private static final a Companion = null;
    @l
    private static final String LIBRARY_NAME = "fire-sessions";
    @l
    private static final K backgroundDispatcher;
    @l
    private static final K blockingDispatcher;
    @l
    private static final K firebaseApp;
    @l
    private static final K firebaseInstallationsApi;
    @l
    private static final K sessionLifecycleServiceBinder;
    @l
    private static final K sessionsSettings;
    @l
    private static final K transportFactory;

    static {
        FirebaseSessionsRegistrar.Companion = new a(null);
        K k0 = K.b(h.class);
        L.o(k0, "unqualified(FirebaseApp::class.java)");
        FirebaseSessionsRegistrar.firebaseApp = k0;
        K k1 = K.b(k.class);
        L.o(k1, "unqualified(FirebaseInstallationsApi::class.java)");
        FirebaseSessionsRegistrar.firebaseInstallationsApi = k1;
        K k2 = K.a(U1.a.class, kotlinx.coroutines.K.class);
        L.o(k2, "qualified(Background::cl…neDispatcher::class.java)");
        FirebaseSessionsRegistrar.backgroundDispatcher = k2;
        K k3 = K.a(b.class, kotlinx.coroutines.K.class);
        L.o(k3, "qualified(Blocking::clas…neDispatcher::class.java)");
        FirebaseSessionsRegistrar.blockingDispatcher = k3;
        K k4 = K.b(m.class);
        L.o(k4, "unqualified(TransportFactory::class.java)");
        FirebaseSessionsRegistrar.transportFactory = k4;
        K k5 = K.b(f.class);
        L.o(k5, "unqualified(SessionsSettings::class.java)");
        FirebaseSessionsRegistrar.sessionsSettings = k5;
        K k6 = K.b(com.google.firebase.sessions.K.class);
        L.o(k6, "unqualified(SessionLifec…erviceBinder::class.java)");
        FirebaseSessionsRegistrar.sessionLifecycleServiceBinder = k6;
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    @l
    public List getComponents() {
        return u.O(new g[]{g.h(com.google.firebase.sessions.l.class).h("fire-sessions").b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.firebaseApp)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.sessionsSettings)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.backgroundDispatcher)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.sessionLifecycleServiceBinder)).f((i i0) -> {
            Object object0 = i0.j(FirebaseSessionsRegistrar.firebaseApp);
            L.o(object0, "container[firebaseApp]");
            Object object1 = i0.j(FirebaseSessionsRegistrar.sessionsSettings);
            L.o(object1, "container[sessionsSettings]");
            Object object2 = i0.j(FirebaseSessionsRegistrar.backgroundDispatcher);
            L.o(object2, "container[backgroundDispatcher]");
            Object object3 = i0.j(FirebaseSessionsRegistrar.sessionLifecycleServiceBinder);
            L.o(object3, "container[sessionLifecycleServiceBinder]");
            return new com.google.firebase.sessions.l(((h)object0), ((f)object1), ((kotlin.coroutines.g)object2), ((com.google.firebase.sessions.K)object3));
        }).e().d(), g.h(G.class).h("session-generator").f((i i0) -> new G(O.a, null, 2, null)).d(), g.h(E.class).h("session-publisher").b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.firebaseApp)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.firebaseInstallationsApi)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.sessionsSettings)).b(com.google.firebase.components.w.n(FirebaseSessionsRegistrar.transportFactory)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.backgroundDispatcher)).f((i i0) -> {
            Object object0 = i0.j(FirebaseSessionsRegistrar.firebaseApp);
            L.o(object0, "container[firebaseApp]");
            Object object1 = i0.j(FirebaseSessionsRegistrar.firebaseInstallationsApi);
            L.o(object1, "container[firebaseInstallationsApi]");
            Object object2 = i0.j(FirebaseSessionsRegistrar.sessionsSettings);
            L.o(object2, "container[sessionsSettings]");
            h2.b b0 = i0.g(FirebaseSessionsRegistrar.transportFactory);
            L.o(b0, "container.getProvider(transportFactory)");
            com.google.firebase.sessions.h h0 = new com.google.firebase.sessions.h(b0);
            Object object3 = i0.j(FirebaseSessionsRegistrar.backgroundDispatcher);
            L.o(object3, "container[backgroundDispatcher]");
            return new F(((h)object0), ((k)object1), ((f)object2), h0, ((kotlin.coroutines.g)object3));
        }).d(), g.h(f.class).h("sessions-settings").b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.firebaseApp)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.blockingDispatcher)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.backgroundDispatcher)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.firebaseInstallationsApi)).f((i i0) -> {
            Object object0 = i0.j(FirebaseSessionsRegistrar.firebaseApp);
            L.o(object0, "container[firebaseApp]");
            Object object1 = i0.j(FirebaseSessionsRegistrar.blockingDispatcher);
            L.o(object1, "container[blockingDispatcher]");
            Object object2 = i0.j(FirebaseSessionsRegistrar.backgroundDispatcher);
            L.o(object2, "container[backgroundDispatcher]");
            Object object3 = i0.j(FirebaseSessionsRegistrar.firebaseInstallationsApi);
            L.o(object3, "container[firebaseInstallationsApi]");
            return new f(((h)object0), ((kotlin.coroutines.g)object1), ((kotlin.coroutines.g)object2), ((k)object3));
        }).d(), g.h(z.class).h("sessions-datastore").b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.firebaseApp)).b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.backgroundDispatcher)).f((i i0) -> {
            Context context0 = ((h)i0.j(FirebaseSessionsRegistrar.firebaseApp)).n();
            L.o(context0, "container[firebaseApp].applicationContext");
            Object object0 = i0.j(FirebaseSessionsRegistrar.backgroundDispatcher);
            L.o(object0, "container[backgroundDispatcher]");
            return new A(context0, ((kotlin.coroutines.g)object0));
        }).d(), g.h(com.google.firebase.sessions.K.class).h("sessions-service-binder").b(com.google.firebase.components.w.l(FirebaseSessionsRegistrar.firebaseApp)).f((i i0) -> {
            Object object0 = i0.j(FirebaseSessionsRegistrar.firebaseApp);
            L.o(object0, "container[firebaseApp]");
            return new com.google.firebase.sessions.L(((h)object0));
        }).d(), com.google.firebase.platforminfo.h.b("fire-sessions", "2.0.5")});
    }

    // 检测为 Lambda 实现
    private static final com.google.firebase.sessions.l getComponents$lambda$0(i i0) [...]

    // 检测为 Lambda 实现
    private static final G getComponents$lambda$1(i i0) [...]

    // 检测为 Lambda 实现
    private static final E getComponents$lambda$2(i i0) [...]

    // 检测为 Lambda 实现
    private static final f getComponents$lambda$3(i i0) [...]

    // 检测为 Lambda 实现
    private static final z getComponents$lambda$4(i i0) [...]

    // 检测为 Lambda 实现
    private static final com.google.firebase.sessions.K getComponents$lambda$5(i i0) [...]
}

