package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.d;
import com.google.firebase.h;
import com.google.firebase.q;
import com.google.firebase.s;
import com.google.firebase.sessions.settings.f;
import java.util.Collection;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.m;

public final class l {
    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @y4.l
        public final l a() {
            Object object0 = q.c(d.a).l(l.class);
            L.o(object0, "Firebase.app[FirebaseSessions::class.java]");
            return (l)object0;
        }
    }

    @y4.l
    private final h a;
    @y4.l
    private final f b;
    @y4.l
    public static final b c = null;
    @y4.l
    private static final String d = "FirebaseSessions";

    static {
        l.c = new b(null);
    }

    public l(@y4.l h h0, @y4.l f f0, @y4.l g g0, @y4.l K k0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", i = {}, l = {45, 49}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nFirebaseSessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n2624#2,3:83\n*S KotlinDebug\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n*L\n46#1:83,3\n*E\n"})
        static final class a extends o implements A3.o {
            int k;
            final l l;
            final g m;
            final K n;

            a(l l0, g g0, K k0, kotlin.coroutines.d d0) {
                this.l = l0;
                this.m = g0;
                this.n = k0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.l
            public final kotlin.coroutines.d create(@m Object object0, @y4.l kotlin.coroutines.d d0) {
                return new a(this.l, this.m, this.n, d0);
            }

            // 检测为 Lambda 实现
            private static final void f(String s, s s1) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@y4.l O o0, @m kotlin.coroutines.d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        object0 = com.google.firebase.sessions.api.a.a.c(this);
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_9;
                    }
                    case 1: {
                        f0.n(object0);
                    label_9:
                        Iterable iterable0 = ((Map)object0).values();
                        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                            for(Object object2: iterable0) {
                                if(!((com.google.firebase.sessions.api.b)object2).a()) {
                                    continue;
                                }
                                this.k = 2;
                                if(this.l.b.g(this) == object1) {
                                    return object1;
                                }
                                goto label_21;
                            }
                        }
                        Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                        return S0.a;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                f0.n(object0);
            label_21:
                if(!this.l.b.d()) {
                    Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                    return S0.a;
                }
                I i0 = new I(this.m);
                i0.i(this.n);
                M.a.e(i0);
                this.l.a.h((String s, s s1) -> {
                    Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
                    M.a.e(null);
                });
                return S0.a;
            }
        }

        L.p(h0, "firebaseApp");
        L.p(f0, "settings");
        L.p(g0, "backgroundDispatcher");
        L.p(k0, "lifecycleServiceBinder");
        super();
        this.a = h0;
        this.b = f0;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context context0 = h0.n().getApplicationContext();
        if(context0 instanceof Application) {
            ((Application)context0).registerActivityLifecycleCallbacks(M.a);
            k.f(P.a(g0), null, null, new a(this, g0, k0, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + context0.getClass() + '.');
    }
}

