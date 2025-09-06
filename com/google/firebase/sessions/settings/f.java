package com.google.firebase.sessions.settings;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.google.firebase.d;
import com.google.firebase.installations.k;
import com.google.firebase.q;
import com.google.firebase.sessions.D;
import com.google.firebase.sessions.w;
import com.google.firebase.sessions.y;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import kotlin.properties.e;
import kotlin.reflect.o;
import y4.l;
import y4.m;

public final class f {
    static final class a extends N implements Function1 {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(1);
        }

        @l
        public final Preferences a(@l CorruptionException corruptionException0) {
            L.p(corruptionException0, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + w.a.e() + '.', corruptionException0);
            return PreferencesFactory.b();
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.a(((CorruptionException)object0));
        }
    }

    public static final class b {
        static final o[] a;

        static {
            b.a = new o[]{m0.v(new j0(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
        }

        private b() {
        }

        public b(kotlin.jvm.internal.w w0) {
        }

        private final DataStore b(Context context0) {
            return (DataStore)f.e.getValue(context0, b.a[0]);
        }

        @l
        public final f c() {
            Object object0 = q.c(d.a).l(f.class);
            L.o(object0, "Firebase.app[SessionsSettings::class.java]");
            return (f)object0;
        }
    }

    @l
    private final h a;
    @l
    private final h b;
    @l
    public static final b c = null;
    @l
    private static final String d = "SessionsSettings";
    @l
    private static final e e;

    static {
        f.c = new b(null);
        f.e = PreferenceDataStoreDelegateKt.b(y.a.b(), new ReplaceFileCorruptionHandler(a.e), null, null, 12, null);
    }

    private f(Context context0, g g0, g g1, k k0, com.google.firebase.sessions.b b0) {
        this(new com.google.firebase.sessions.settings.b(context0), new c(g1, k0, b0, new com.google.firebase.sessions.settings.d(b0, g0, null, 4, null), f.c.b(context0)));
    }

    public f(@l com.google.firebase.h h0, @l g g0, @l g g1, @l k k0) {
        L.p(h0, "firebaseApp");
        L.p(g0, "blockingDispatcher");
        L.p(g1, "backgroundDispatcher");
        L.p(k0, "firebaseInstallationsApi");
        Context context0 = h0.n();
        L.o(context0, "firebaseApp.applicationContext");
        this(context0, g0, g1, k0, D.a.c(h0));
    }

    public f(@l h h0, @l h h1) {
        L.p(h0, "localOverrideSettings");
        L.p(h1, "remoteSettings");
        super();
        this.a = h0;
        this.b = h1;
    }

    public final double b() {
        Double double0 = this.a.a();
        if(double0 != null) {
            double f = double0.doubleValue();
            if(this.e(f)) {
                return f;
            }
        }
        Double double1 = this.b.a();
        if(double1 != null) {
            double f1 = double1.doubleValue();
            return this.e(f1) ? f1 : 1.0;
        }
        return 1.0;
    }

    public final long c() {
        kotlin.time.e e0 = this.a.d();
        if(e0 != null) {
            long v = e0.A0();
            if(this.f(v)) {
                return v;
            }
        }
        kotlin.time.e e1 = this.b.d();
        if(e1 != null) {
            long v1 = e1.A0();
            return this.f(v1) ? v1 : kotlin.time.g.m0(30, kotlin.time.h.f);
        }
        return kotlin.time.g.m0(30, kotlin.time.h.f);
    }

    public final boolean d() {
        Boolean boolean0 = this.a.c();
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        Boolean boolean1 = this.b.c();
        return boolean1 == null ? true : boolean1.booleanValue();
    }

    private final boolean e(double f) {
        return 0.0 <= f && f <= 1.0;
    }

    // 去混淆评级： 低(20)
    private final boolean f(long v) {
        return kotlin.time.e.f0(v) && kotlin.time.e.a0(v);
    }

    @m
    public final Object g(@l kotlin.coroutines.d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {0x8A, 0x8B}, m = "updateSettings", n = {"this"}, s = {"L$0"})
        static final class com.google.firebase.sessions.settings.f.c extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            final f m;
            int n;

            com.google.firebase.sessions.settings.f.c(f f0, kotlin.coroutines.d d0) {
                this.m = f0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.g(this);
            }
        }

        f f0;
        com.google.firebase.sessions.settings.f.c f$c0;
        if(d0 instanceof com.google.firebase.sessions.settings.f.c) {
            f$c0 = (com.google.firebase.sessions.settings.f.c)d0;
            int v = f$c0.n;
            if((v & 0x80000000) == 0) {
                f$c0 = new com.google.firebase.sessions.settings.f.c(this, d0);
            }
            else {
                f$c0.n = v ^ 0x80000000;
            }
        }
        else {
            f$c0 = new com.google.firebase.sessions.settings.f.c(this, d0);
        }
        Object object0 = f$c0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(f$c0.n) {
            case 0: {
                f0.n(object0);
                f$c0.k = this;
                f$c0.n = 1;
                if(this.a.b(f$c0) == object1) {
                    return object1;
                }
                f0 = this;
                break;
            }
            case 1: {
                f0 = (f)f$c0.k;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f$c0.k = null;
        f$c0.n = 2;
        return f0.b.b(f$c0) == object1 ? object1 : S0.a;
    }
}

