package com.google.firebase.sessions.api;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import j..util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.sync.c;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nFirebaseSessionsDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,114:1\n442#2:115\n392#2:116\n1238#3,2:117\n1241#3:129\n107#4,10:119\n*S KotlinDebug\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n*L\n89#1:115\n89#1:116\n89#1:117,2\n89#1:129\n90#1:119,10\n*E\n"})
public final class a {
    static final class com.google.firebase.sessions.api.a.a {
        @l
        private final kotlinx.coroutines.sync.a a;
        @m
        private b b;

        public com.google.firebase.sessions.api.a.a(@l kotlinx.coroutines.sync.a a0, @m b b0) {
            L.p(a0, "mutex");
            super();
            this.a = a0;
            this.b = b0;
        }

        public com.google.firebase.sessions.api.a.a(kotlinx.coroutines.sync.a a0, b b0, int v, w w0) {
            if((v & 2) != 0) {
                b0 = null;
            }
            this(a0, b0);
        }

        @l
        public final kotlinx.coroutines.sync.a a() {
            return this.a;
        }

        @m
        public final b b() {
            return this.b;
        }

        @l
        public final com.google.firebase.sessions.api.a.a c(@l kotlinx.coroutines.sync.a a0, @m b b0) {
            L.p(a0, "mutex");
            return new com.google.firebase.sessions.api.a.a(a0, b0);
        }

        public static com.google.firebase.sessions.api.a.a d(com.google.firebase.sessions.api.a.a a$a0, kotlinx.coroutines.sync.a a0, b b0, int v, Object object0) {
            if((v & 1) != 0) {
                a0 = a$a0.a;
            }
            if((v & 2) != 0) {
                b0 = a$a0.b;
            }
            return a$a0.c(a0, b0);
        }

        @l
        public final kotlinx.coroutines.sync.a e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.google.firebase.sessions.api.a.a)) {
                return false;
            }
            return L.g(this.a, ((com.google.firebase.sessions.api.a.a)object0).a) ? L.g(this.b, ((com.google.firebase.sessions.api.a.a)object0).b) : false;
        }

        @m
        public final b f() {
            return this.b;
        }

        public final void g(@m b b0) {
            this.b = b0;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
        }
    }

    @l
    public static final a a = null;
    @l
    private static final String b = "SessionsDependencies";
    private static final Map c;

    static {
        a.a = new a();
        a.c = DesugarCollections.synchronizedMap(new LinkedHashMap());
    }

    @n
    public static final void a(@l com.google.firebase.sessions.api.b.a b$a0) {
        L.p(b$a0, "subscriberName");
        if(b$a0 == com.google.firebase.sessions.api.b.a.b) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map map0 = a.c;
        if(map0.containsKey(b$a0)) {
            Log.d("SessionsDependencies", "Dependency " + b$a0 + " already added.");
            return;
        }
        L.o(map0, "dependencies");
        map0.put(b$a0, new com.google.firebase.sessions.api.a.a(c.a(true), null, 2, null));
        Log.d("SessionsDependencies", "Dependency to " + b$a0 + " added.");
    }

    private final com.google.firebase.sessions.api.a.a b(com.google.firebase.sessions.api.b.a b$a0) {
        L.o(a.c, "dependencies");
        Object object0 = a.c.get(b$a0);
        if(object0 == null) {
            throw new IllegalStateException("Cannot get dependency " + b$a0 + ". Dependencies should be added at class load time.");
        }
        L.o(object0, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
        return (com.google.firebase.sessions.api.a.a)object0;
    }

    @m
    public final Object c(@l d d0) {
        @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", i = {0, 0, 0}, l = {0x7C}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$3"})
        static final class com.google.firebase.sessions.api.a.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            Object p;
            Object q;
            final a r;
            int s;

            com.google.firebase.sessions.api.a.b(a a0, d d0) {
                this.r = a0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.q = object0;
                this.s |= 0x80000000;
                return this.r.c(this);
            }
        }

        b b0;
        Map map1;
        com.google.firebase.sessions.api.b.a b$a0;
        kotlinx.coroutines.sync.a a0;
        Object object2;
        Map map0;
        Iterator iterator0;
        com.google.firebase.sessions.api.a.b a$b0;
        if(d0 instanceof com.google.firebase.sessions.api.a.b) {
            a$b0 = (com.google.firebase.sessions.api.a.b)d0;
            int v = a$b0.s;
            if((v & 0x80000000) == 0) {
                a$b0 = new com.google.firebase.sessions.api.a.b(this, d0);
            }
            else {
                a$b0.s = v ^ 0x80000000;
            }
        }
        else {
            a$b0 = new com.google.firebase.sessions.api.a.b(this, d0);
        }
        Object object0 = a$b0.q;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(a$b0.s) {
            case 0: {
                f0.n(object0);
                L.o(a.c, "dependencies");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(Y.j(a.c.size()));
                iterator0 = a.c.entrySet().iterator();
                map0 = linkedHashMap0;
                goto label_33;
            }
            case 1: {
                object2 = a$b0.p;
                map0 = (Map)a$b0.o;
                a0 = (kotlinx.coroutines.sync.a)a$b0.n;
                b$a0 = (com.google.firebase.sessions.api.b.a)a$b0.m;
                iterator0 = (Iterator)a$b0.l;
                map1 = (Map)a$b0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            try {
                b0 = a.a.d(b$a0);
            }
            finally {
                a0.i(null);
            }
            map0.put(object2, b0);
            map0 = map1;
        label_33:
            if(!iterator0.hasNext()) {
                break;
            }
            Object object3 = iterator0.next();
            object2 = ((Map.Entry)object3).getKey();
            b$a0 = (com.google.firebase.sessions.api.b.a)((Map.Entry)object3).getKey();
            a0 = ((com.google.firebase.sessions.api.a.a)((Map.Entry)object3).getValue()).e();
            a$b0.k = map0;
            a$b0.l = iterator0;
            a$b0.m = b$a0;
            a$b0.n = a0;
            a$b0.o = map0;
            a$b0.p = object2;
            a$b0.s = 1;
            if(a0.h(null, a$b0) == object1) {
                return object1;
            }
            map1 = map0;
        }
        return map0;
    }

    @VisibleForTesting
    @l
    public final b d(@l com.google.firebase.sessions.api.b.a b$a0) {
        L.p(b$a0, "subscriberName");
        b b0 = this.b(b$a0).f();
        if(b0 == null) {
            throw new IllegalStateException("Subscriber " + b$a0 + " has not been registered.");
        }
        return b0;
    }

    @n
    public static final void e(@l b b0) {
        L.p(b0, "subscriber");
        com.google.firebase.sessions.api.b.a b$a0 = b0.b();
        com.google.firebase.sessions.api.a.a a$a0 = a.a.b(b$a0);
        if(a$a0.f() != null) {
            Log.d("SessionsDependencies", "Subscriber " + b$a0 + " already registered.");
            return;
        }
        a$a0.g(b0);
        Log.d("SessionsDependencies", "Subscriber " + b$a0 + " registered.");
        kotlinx.coroutines.sync.a.a.d(a$a0.e(), null, 1, null);
    }

    @VisibleForTesting
    public final void f() {
        a.c.clear();
    }
}

