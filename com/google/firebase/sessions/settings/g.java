package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences.Key;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import java.io.IOException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.j;
import y4.l;
import y4.m;

public final class g {
    static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        public final Key a() {
            return g.h;
        }

        @l
        public final Key b() {
            return g.i;
        }

        @l
        public final Key c() {
            return g.g;
        }

        @l
        public final Key d() {
            return g.f;
        }

        @l
        public final Key e() {
            return g.e;
        }
    }

    @l
    private final DataStore a;
    private e b;
    @l
    private static final b c = null;
    @Deprecated
    @l
    public static final String d = "SettingsCache";
    @l
    private static final Key e;
    @l
    private static final Key f;
    @l
    private static final Key g;
    @l
    private static final Key h;
    @l
    private static final Key i;

    static {
        g.c = new b(null);
        g.e = PreferencesKeys.a("firebase_sessions_enabled");
        g.f = PreferencesKeys.b("firebase_sessions_sampling_rate");
        g.g = PreferencesKeys.d("firebase_sessions_restart_timeout");
        g.h = PreferencesKeys.d("firebase_sessions_cache_duration");
        g.i = PreferencesKeys.e("firebase_sessions_cache_updated_time");
    }

    public g(@l DataStore dataStore0) {
        @f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            Object k;
            int l;
            final g m;

            a(g g0, d d0) {
                this.m = g0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new a(this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                g g1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        g g0 = this.m;
                        i i0 = g0.a.getData();
                        this.k = g0;
                        this.l = 1;
                        Object object2 = k.v0(i0, this);
                        if(object2 == object1) {
                            return object1;
                        }
                        g1 = g0;
                        object0 = object2;
                        break;
                    }
                    case 1: {
                        g1 = (g)this.k;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                g1.r(((Preferences)object0).e());
                return S0.a;
            }
        }

        L.p(dataStore0, "dataStore");
        super();
        this.a = dataStore0;
        j.b(null, new a(this, null), 1, null);
    }

    public final boolean i() {
        e e0 = this.b;
        e e1 = null;
        if(e0 == null) {
            L.S("sessionConfigs");
            e0 = null;
        }
        Long long0 = e0.i();
        e e2 = this.b;
        if(e2 == null) {
            L.S("sessionConfigs");
        }
        else {
            e1 = e2;
        }
        Integer integer0 = e1.h();
        return long0 == null || integer0 == null || (System.currentTimeMillis() - ((long)long0)) / 1000L >= ((long)(((int)integer0)));
    }

    @VisibleForTesting
    @m
    public final Object j(@l d d0) {
        @f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {103}, m = "removeConfigs$com_google_firebase_firebase_sessions", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.d {
            Object k;
            final g l;
            int m;

            c(g g0, d d0) {
                this.l = g0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.k = object0;
                this.m |= 0x80000000;
                return this.l.j(this);
            }
        }


        @f(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.google.firebase.sessions.settings.g.d extends o implements A3.o {
            int k;
            Object l;
            final g m;

            com.google.firebase.sessions.settings.g.d(g g0, d d0) {
                this.m = g0;
                super(2, d0);
            }

            @m
            public final Object a(@l MutablePreferences mutablePreferences0, @m d d0) {
                return ((com.google.firebase.sessions.settings.g.d)this.create(mutablePreferences0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.google.firebase.sessions.settings.g.d(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((MutablePreferences)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                MutablePreferences mutablePreferences0 = (MutablePreferences)this.l;
                mutablePreferences0.g();
                this.m.r(mutablePreferences0);
                return S0.a;
            }
        }

        c g$c0;
        if(d0 instanceof c) {
            g$c0 = (c)d0;
            int v = g$c0.m;
            if((v & 0x80000000) == 0) {
                g$c0 = new c(this, d0);
            }
            else {
                g$c0.m = v ^ 0x80000000;
            }
        }
        else {
            g$c0 = new c(this, d0);
        }
        Object object0 = g$c0.k;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(g$c0.m) {
            case 0: {
                f0.n(object0);
                try {
                    com.google.firebase.sessions.settings.g.d g$d0 = new com.google.firebase.sessions.settings.g.d(this, null);
                    g$c0.m = 1;
                    if(PreferencesKt.a(this.a, g$d0, g$c0) == object1) {
                        return object1;
                    }
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to remove config values: " + iOException0);
                }
                return S0.a;
            }
            case 1: {
                try {
                    f0.n(object0);
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to remove config values: " + iOException0);
                }
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public final Integer k() {
        e e0 = this.b;
        if(e0 == null) {
            L.S("sessionConfigs");
            e0 = null;
        }
        return e0.k();
    }

    @m
    public final Double l() {
        e e0 = this.b;
        if(e0 == null) {
            L.S("sessionConfigs");
            e0 = null;
        }
        return e0.l();
    }

    @m
    public final Boolean m() {
        e e0 = this.b;
        if(e0 == null) {
            L.S("sessionConfigs");
            e0 = null;
        }
        return e0.j();
    }

    private final Object n(Key preferences$Key0, Object object0, d d0) {
        @f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {0x77}, m = "updateConfigValue", n = {}, s = {})
        static final class com.google.firebase.sessions.settings.g.e extends kotlin.coroutines.jvm.internal.d {
            Object k;
            final g l;
            int m;

            com.google.firebase.sessions.settings.g.e(g g0, d d0) {
                this.l = g0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.k = object0;
                this.m |= 0x80000000;
                return this.l.n(null, null, this);
            }
        }


        @f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.google.firebase.sessions.settings.g.f extends o implements A3.o {
            int k;
            Object l;
            final Object m;
            final Key n;
            final g o;

            com.google.firebase.sessions.settings.g.f(Object object0, Key preferences$Key0, g g0, d d0) {
                this.m = object0;
                this.n = preferences$Key0;
                this.o = g0;
                super(2, d0);
            }

            @m
            public final Object a(@l MutablePreferences mutablePreferences0, @m d d0) {
                return ((com.google.firebase.sessions.settings.g.f)this.create(mutablePreferences0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.google.firebase.sessions.settings.g.f(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((MutablePreferences)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                MutablePreferences mutablePreferences0 = (MutablePreferences)this.l;
                Object object1 = this.m;
                if(object1 == null) {
                    mutablePreferences0.n(this.n);
                }
                else {
                    mutablePreferences0.o(this.n, object1);
                }
                this.o.r(mutablePreferences0);
                return S0.a;
            }
        }

        com.google.firebase.sessions.settings.g.e g$e0;
        if(d0 instanceof com.google.firebase.sessions.settings.g.e) {
            g$e0 = (com.google.firebase.sessions.settings.g.e)d0;
            int v = g$e0.m;
            if((v & 0x80000000) == 0) {
                g$e0 = new com.google.firebase.sessions.settings.g.e(this, d0);
            }
            else {
                g$e0.m = v ^ 0x80000000;
            }
        }
        else {
            g$e0 = new com.google.firebase.sessions.settings.g.e(this, d0);
        }
        Object object1 = g$e0.k;
        Object object2 = kotlin.coroutines.intrinsics.b.l();
        switch(g$e0.m) {
            case 0: {
                f0.n(object1);
                try {
                    com.google.firebase.sessions.settings.g.f g$f0 = new com.google.firebase.sessions.settings.g.f(object0, preferences$Key0, this, null);
                    g$e0.m = 1;
                    if(PreferencesKt.a(this.a, g$f0, g$e0) == object2) {
                        return object2;
                    }
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to update cache config value: " + iOException0);
                }
                return S0.a;
            }
            case 1: {
                try {
                    f0.n(object1);
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to update cache config value: " + iOException0);
                }
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public final Object o(@m Double double0, @l d d0) {
        Object object0 = this.n(g.f, double0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @m
    public final Object p(@m Integer integer0, @l d d0) {
        Object object0 = this.n(g.h, integer0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @m
    public final Object q(@m Long long0, @l d d0) {
        Object object0 = this.n(g.i, long0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    private final void r(Preferences preferences0) {
        this.b = new e(((Boolean)preferences0.c(g.e)), ((Double)preferences0.c(g.f)), ((Integer)preferences0.c(g.g)), ((Integer)preferences0.c(g.h)), ((Long)preferences0.c(g.i)));
    }

    @m
    public final Object s(@m Integer integer0, @l d d0) {
        Object object0 = this.n(g.g, integer0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @m
    public final Object t(@m Boolean boolean0, @l d d0) {
        Object object0 = this.n(g.e, boolean0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }
}

