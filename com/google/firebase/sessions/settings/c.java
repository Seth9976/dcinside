package com.google.firebase.sessions.settings;

import android.os.Build.VERSION;
import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import com.google.firebase.installations.k;
import com.google.firebase.sessions.b;
import com.google.firebase.sessions.t;
import java.util.Arrays;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.r;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import org.json.JSONException;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,164:1\n107#2,10:165\n*S KotlinDebug\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n*L\n68#1:165,10\n*E\n"})
public final class c implements h {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final g a;
    @l
    private final k b;
    @l
    private final b c;
    @l
    private final com.google.firebase.sessions.settings.a d;
    @l
    private final D e;
    @l
    private final kotlinx.coroutines.sync.a f;
    @l
    private static final a g = null;
    @Deprecated
    @l
    public static final String h = "SessionConfigFetcher";
    @Deprecated
    @l
    public static final String i = "/";

    static {
        c.g = new a(null);
    }

    public c(@l g g0, @l k k0, @l b b0, @l com.google.firebase.sessions.settings.a a0, @l DataStore dataStore0) {
        static final class com.google.firebase.sessions.settings.c.c extends N implements A3.a {
            final DataStore e;

            com.google.firebase.sessions.settings.c.c(DataStore dataStore0) {
                this.e = dataStore0;
                super(0);
            }

            @l
            public final com.google.firebase.sessions.settings.g b() {
                return new com.google.firebase.sessions.settings.g(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(g0, "backgroundDispatcher");
        L.p(k0, "firebaseInstallationsApi");
        L.p(b0, "appInfo");
        L.p(a0, "configsFetcher");
        L.p(dataStore0, "dataStore");
        super();
        this.a = g0;
        this.b = k0;
        this.c = b0;
        this.d = a0;
        this.e = E.a(new com.google.firebase.sessions.settings.c.c(dataStore0));
        this.f = kotlinx.coroutines.sync.c.b(false, 1, null);
    }

    @Override  // com.google.firebase.sessions.settings.h
    @m
    public Double a() {
        return this.h().l();
    }

    @Override  // com.google.firebase.sessions.settings.h
    @m
    public Object b(@l d d0) {
        @f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {170, 76, 94}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
        static final class com.google.firebase.sessions.settings.c.d extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            final c n;
            int o;

            com.google.firebase.sessions.settings.c.d(c c0, d d0) {
                this.n = c0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.o |= 0x80000000;
                return this.n.b(this);
            }
        }


        @f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {0, 0, 0, 1, 1, 2}, l = {0x7D, 0x80, 0x83, 0x85, 0x86, 0x88}, m = "invokeSuspend", n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
        @s0({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings$updateSettings$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
        static final class e extends o implements A3.o {
            Object k;
            Object l;
            int m;
            Object n;
            final c o;

            e(c c0, d d0) {
                this.o = c0;
                super(2, d0);
            }

            @m
            public final Object a(@l JSONObject jSONObject0, @m d d0) {
                return ((e)this.create(jSONObject0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new e(this.o, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((JSONObject)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                S0 s00;
                kotlin.jvm.internal.l0.h l0$h4;
                kotlin.jvm.internal.l0.h l0$h3;
                Boolean boolean0;
                kotlin.jvm.internal.l0.h l0$h1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        JSONObject jSONObject0 = (JSONObject)this.n;
                        Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject0);
                        kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
                        l0$h1 = new kotlin.jvm.internal.l0.h();
                        kotlin.jvm.internal.l0.h l0$h2 = new kotlin.jvm.internal.l0.h();
                        if(jSONObject0.has("app_quality")) {
                            Object object2 = jSONObject0.get("app_quality");
                            L.n(object2, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject1 = (JSONObject)object2;
                            try {
                                boolean0 = jSONObject1.has("sessions_enabled") ? ((Boolean)jSONObject1.get("sessions_enabled")) : null;
                            }
                            catch(JSONException jSONException0) {
                                boolean0 = null;
                                goto label_31;
                            }
                            try {
                                if(jSONObject1.has("sampling_rate")) {
                                    l0$h0.a = (Double)jSONObject1.get("sampling_rate");
                                }
                                if(jSONObject1.has("session_timeout_seconds")) {
                                    l0$h1.a = (Integer)jSONObject1.get("session_timeout_seconds");
                                }
                                if(jSONObject1.has("cache_duration")) {
                                    l0$h2.a = (Integer)jSONObject1.get("cache_duration");
                                }
                                goto label_34;
                            }
                            catch(JSONException jSONException0) {
                            }
                        label_31:
                            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", jSONException0);
                        }
                        else {
                            boolean0 = null;
                        }
                    label_34:
                        if(boolean0 == null) {
                            l0$h4 = l0$h0;
                            l0$h3 = l0$h2;
                        }
                        else {
                            com.google.firebase.sessions.settings.g g0 = this.o.h();
                            this.n = l0$h0;
                            this.k = l0$h1;
                            this.l = l0$h2;
                            this.m = 1;
                            if(g0.t(boolean0, this) == object1) {
                                return object1;
                            }
                            l0$h3 = l0$h2;
                            l0$h4 = l0$h0;
                        }
                        goto label_54;
                    }
                    case 1: {
                        l0$h3 = (kotlin.jvm.internal.l0.h)this.l;
                        kotlin.jvm.internal.l0.h l0$h5 = (kotlin.jvm.internal.l0.h)this.k;
                        kotlin.jvm.internal.l0.h l0$h6 = (kotlin.jvm.internal.l0.h)this.n;
                        f0.n(object0);
                        l0$h1 = l0$h5;
                        l0$h4 = l0$h6;
                    label_54:
                        if(((Integer)l0$h1.a) != null) {
                            com.google.firebase.sessions.settings.g g1 = this.o.h();
                            this.n = l0$h4;
                            this.k = l0$h3;
                            this.l = null;
                            this.m = 2;
                            if(g1.s(((Integer)l0$h1.a), this) == object1) {
                                return object1;
                            }
                        }
                        goto label_65;
                    }
                    case 2: {
                        l0$h3 = (kotlin.jvm.internal.l0.h)this.k;
                        l0$h4 = (kotlin.jvm.internal.l0.h)this.n;
                        f0.n(object0);
                    label_65:
                        if(((Double)l0$h4.a) != null) {
                            com.google.firebase.sessions.settings.g g2 = this.o.h();
                            this.n = l0$h3;
                            this.k = null;
                            this.l = null;
                            this.m = 3;
                            if(g2.o(((Double)l0$h4.a), this) == object1) {
                                return object1;
                            }
                        }
                        goto label_75;
                    }
                    case 3: {
                        l0$h3 = (kotlin.jvm.internal.l0.h)this.n;
                        f0.n(object0);
                    label_75:
                        if(((Integer)l0$h3.a) == null) {
                            s00 = null;
                        }
                        else {
                            com.google.firebase.sessions.settings.g g3 = this.o.h();
                            this.n = null;
                            this.k = null;
                            this.l = null;
                            this.m = 4;
                            if(g3.p(((Integer)l0$h3.a), this) == object1) {
                                return object1;
                            }
                            s00 = S0.a;
                        }
                        goto label_89;
                    }
                    case 4: {
                        f0.n(object0);
                        s00 = S0.a;
                    label_89:
                        if(s00 == null) {
                            com.google.firebase.sessions.settings.g g4 = this.o.h();
                            this.n = null;
                            this.k = null;
                            this.l = null;
                            this.m = 5;
                            if(g4.p(kotlin.coroutines.jvm.internal.b.f(86400), this) == object1) {
                                return object1;
                            }
                        }
                        break;
                    }
                    case 5: {
                        f0.n(object0);
                        break;
                    }
                    case 6: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.google.firebase.sessions.settings.g g5 = this.o.h();
                this.n = null;
                this.k = null;
                this.l = null;
                this.m = 6;
                return g5.q(kotlin.coroutines.jvm.internal.b.g(System.currentTimeMillis()), this) == object1 ? object1 : S0.a;
            }
        }


        @f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.google.firebase.sessions.settings.c.f extends o implements A3.o {
            int k;
            Object l;

            com.google.firebase.sessions.settings.c.f(d d0) {
                super(2, d0);
            }

            @m
            public final Object a(@l String s, @m d d0) {
                return ((com.google.firebase.sessions.settings.c.f)this.create(s, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.google.firebase.sessions.settings.c.f(d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((String)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String)this.l));
                return S0.a;
            }
        }

        kotlinx.coroutines.sync.a a2;
        String s;
        c c0;
        kotlinx.coroutines.sync.a a1;
        com.google.firebase.sessions.settings.c.d c$d0;
        if(d0 instanceof com.google.firebase.sessions.settings.c.d) {
            c$d0 = (com.google.firebase.sessions.settings.c.d)d0;
            int v = c$d0.o;
            if((v & 0x80000000) == 0) {
                c$d0 = new com.google.firebase.sessions.settings.c.d(this, d0);
            }
            else {
                c$d0.o = v ^ 0x80000000;
            }
        }
        else {
            c$d0 = new com.google.firebase.sessions.settings.c.d(this, d0);
        }
        Object object0 = c$d0.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(c$d0.o) {
            case 0: {
                f0.n(object0);
                if(!this.f.c() && !this.h().i()) {
                    return S0.a;
                }
                kotlinx.coroutines.sync.a a0 = this.f;
                c$d0.k = this;
                c$d0.l = a0;
                c$d0.o = 1;
                if(a0.h(null, c$d0) == object1) {
                    return object1;
                }
                a1 = a0;
                c0 = this;
                goto label_28;
            }
            case 1: {
                a1 = (kotlinx.coroutines.sync.a)c$d0.l;
                c0 = (c)c$d0.k;
                f0.n(object0);
                try {
                label_28:
                    if(!c0.h().i()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        goto label_36;
                    }
                    c$d0.k = c0;
                    c$d0.l = a1;
                    c$d0.o = 2;
                    object0 = t.c.a(c0.b, c$d0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    a2 = a1;
                    a2.i(null);
                    throw throwable0;
                }
            label_36:
                a1.i(null);
                return S0.a;
            }
            case 2: {
                a1 = (kotlinx.coroutines.sync.a)c$d0.l;
                c0 = (c)c$d0.k;
                try {
                    f0.n(object0);
                label_41:
                    s = ((t)object0).b();
                    if(L.g(s, "")) {
                        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        goto label_44;
                    }
                    goto label_46;
                }
                catch(Throwable throwable0) {
                    a2 = a1;
                    a2.i(null);
                    throw throwable0;
                }
            label_44:
                a1.i(null);
                return S0.a;
                try {
                label_46:
                    V v1 = r0.a("X-Crashlytics-Installation-ID", s);
                    String s1 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    L.o(s1, "format(format, *args)");
                    V v2 = r0.a("X-Crashlytics-Device-Model", c0.i(s1));
                    String s2 = Build.VERSION.INCREMENTAL;
                    L.o(s2, "INCREMENTAL");
                    V v3 = r0.a("X-Crashlytics-OS-Build-Version", c0.i(s2));
                    String s3 = Build.VERSION.RELEASE;
                    L.o(s3, "RELEASE");
                    Map map0 = Y.W(new V[]{v1, v2, v3, r0.a("X-Crashlytics-OS-Display-Version", c0.i(s3)), r0.a("X-Crashlytics-API-Client-Version", c0.c.n())});
                    Log.d("SessionConfigFetcher", "Fetching settings from server.");
                    e c$e0 = new e(c0, null);
                    com.google.firebase.sessions.settings.c.f c$f0 = new com.google.firebase.sessions.settings.c.f(null);
                    c$d0.k = a1;
                    c$d0.l = null;
                    c$d0.o = 3;
                    if(c0.d.a(map0, c$e0, c$f0, c$d0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    a2 = a1;
                    a2.i(null);
                    throw throwable0;
                }
                a2 = a1;
                break;
            }
            case 3: {
                a2 = (kotlinx.coroutines.sync.a)c$d0.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                a2.i(null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a2.i(null);
        return S0.a;
    }

    @Override  // com.google.firebase.sessions.settings.h
    @m
    public Boolean c() {
        return this.h().m();
    }

    @Override  // com.google.firebase.sessions.settings.h
    @m
    public kotlin.time.e d() {
        Integer integer0 = this.h().k();
        return integer0 == null ? null : kotlin.time.e.f(kotlin.time.g.m0(((int)integer0), kotlin.time.h.e));
    }

    @Override  // com.google.firebase.sessions.settings.h
    public boolean e() {
        return this.h().i();
    }

    @VisibleForTesting
    public final void g() {
        @f(c = "com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1", f = "RemoteSettings.kt", i = {}, l = {0x97}, m = "invokeSuspend", n = {}, s = {})
        static final class com.google.firebase.sessions.settings.c.b extends o implements A3.o {
            int k;
            final c l;

            com.google.firebase.sessions.settings.c.b(c c0, d d0) {
                this.l = c0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.google.firebase.sessions.settings.c.b(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.google.firebase.sessions.settings.c.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.google.firebase.sessions.settings.g g0 = this.l.h();
                        this.k = 1;
                        return g0.j(this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        kotlinx.coroutines.k.f(P.a(this.a), null, null, new com.google.firebase.sessions.settings.c.b(this, null), 3, null);
    }

    private final com.google.firebase.sessions.settings.g h() {
        return (com.google.firebase.sessions.settings.g)this.e.getValue();
    }

    private final String i(String s) {
        return new r("/").m(s, "");
    }
}

