package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.k;
import com.google.firebase.installations.p;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.tasks.c;
import y4.l;
import y4.m;

public final class t {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final Object a(@l k k0, @l d d0) {
            @f(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", i = {0, 1}, l = {0x20, 40}, m = "create", n = {"firebaseInstallations", "authToken"}, s = {"L$0", "L$0"})
            static final class com.google.firebase.sessions.t.a.a extends kotlin.coroutines.jvm.internal.d {
                Object k;
                Object l;
                final a m;
                int n;

                com.google.firebase.sessions.t.a.a(a t$a0, d d0) {
                    this.m = t$a0;
                    super(d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return this.m.a(null, this);
                }
            }

            String s1;
            k k1;
            com.google.firebase.sessions.t.a.a t$a$a0;
            if(d0 instanceof com.google.firebase.sessions.t.a.a) {
                t$a$a0 = (com.google.firebase.sessions.t.a.a)d0;
                int v = t$a$a0.n;
                if((v & 0x80000000) == 0) {
                    t$a$a0 = new com.google.firebase.sessions.t.a.a(this, d0);
                }
                else {
                    t$a$a0.n = v ^ 0x80000000;
                }
            }
            else {
                t$a$a0 = new com.google.firebase.sessions.t.a.a(this, d0);
            }
            Object object0 = t$a$a0.l;
            Object object1 = b.l();
            switch(t$a$a0.n) {
                case 0: {
                    f0.n(object0);
                    try {
                        Task task0 = k0.b(false);
                        L.o(task0, "firebaseInstallations.getToken(false)");
                        t$a$a0.k = k0;
                        t$a$a0.n = 1;
                        object0 = c.i(task0, t$a$a0);
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_23;
                    }
                    catch(Exception exception0) {
                        goto label_29;
                    }
                }
                case 1: {
                    k0 = (k)t$a$a0.k;
                    try {
                        f0.n(object0);
                    label_23:
                        String s = ((p)object0).b();
                        L.o(s, "{\n          firebaseInst…).await().token\n        }");
                        k1 = k0;
                        s1 = s;
                    }
                    catch(Exception exception0) {
                    label_29:
                        Log.w("InstallationId", "Error getting authentication token.", exception0);
                        k1 = k0;
                        s1 = "";
                    }
                    try {
                        Task task1 = k1.getId();
                        L.o(task1, "firebaseInstallations.id");
                        t$a$a0.k = s1;
                        t$a$a0.n = 2;
                        object0 = c.i(task1, t$a$a0);
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_41;
                    }
                    catch(Exception exception1) {
                        Log.w("InstallationId", "Error getting Firebase installation id .", exception1);
                        return new t("", s1, null);
                    }
                }
                case 2: {
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            s1 = (String)t$a$a0.k;
            try {
                f0.n(object0);
            label_41:
                L.o(object0, "{\n          firebaseInst…ions.id.await()\n        }");
                return new t(((String)object0), s1, null);
            }
            catch(Exception exception1) {
                Log.w("InstallationId", "Error getting Firebase installation id .", exception1);
                return new t("", s1, null);
            }
        }
    }

    @l
    private final String a;
    @l
    private final String b;
    @l
    public static final a c = null;
    @l
    private static final String d = "InstallationId";

    static {
        t.c = new a(null);
    }

    private t(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public t(String s, String s1, w w0) {
        this(s, s1);
    }

    @l
    public final String a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.a;
    }
}

