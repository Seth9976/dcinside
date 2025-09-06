package com.dcinside.app.read;

import com.dcinside.app.model.Q;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.j;
import io.realm.F0;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

@s0({"SMAP\nCan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Can.kt\ncom/dcinside/app/read/Can\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n120#2,3:160\n124#2:164\n120#2,3:165\n124#2:169\n1#3:163\n1#3:168\n*S KotlinDebug\n*F\n+ 1 Can.kt\ncom/dcinside/app/read/Can\n*L\n32#1:160,3\n32#1:164\n93#1:165,3\n93#1:169\n32#1:163\n93#1:168\n*E\n"})
public final class f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final f a() {
            return f.h;
        }

        @l
        @n
        public final f b(@l Q q0) {
            L.p(q0, "postInfo");
            try {
                return new f(q0, null);
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                return f.h;
            }
        }

        @l
        @n
        public final f c(@l Q q0, @l j j0) {
            L.p(q0, "postInfo");
            L.p(j0, "reply");
            try {
                return new f(q0, j0, null);
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                return f.h;
            }
        }
    }

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    @l
    public static final a e = null;
    private static final int f = 1;
    private static final int g = 2;
    @l
    private static final f h;

    static {
        f.e = new a(null);
        f.h = new f();
    }

    private f() {
        this.d = false;
        this.c = false;
        this.b = false;
        this.a = false;
    }

    private f(Q q0) {
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        String s;
        boolean z = false;
        if(q0 != null && !q0.r1() && !L.g("1", q0.Q0())) {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                B b0 = B.E.V(f00);
                s = b0 == null ? null : b0.j6();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            String s1 = q0.S0();
            boolean z1 = true;
            boolean z2 = s1 != null && L.g(s1, s);
            int v = q0.x0();
            switch(q0.w0()) {
                case 1: {
                    z3 = true;
                    z4 = false;
                    break;
                }
                case 2: {
                    z3 = true;
                    z4 = true;
                    break;
                }
                default: {
                    z3 = false;
                    z4 = false;
                }
            }
            switch(v) {
                case 1: {
                    z5 = true;
                    z6 = false;
                    break;
                }
                case 2: {
                    z5 = true;
                    z6 = true;
                    break;
                }
                default: {
                    z5 = false;
                    z6 = false;
                }
            }
            if(!z2) {
                z1 = z3;
                z = z4;
            }
            this.b = z1;
            this.d = z;
            this.a = z5;
            this.c = z6;
            return;
        }
        this.d = false;
        this.c = false;
        this.b = false;
        this.a = false;
    }

    private f(Q q0, j j0) {
        boolean z2;
        int v;
        String s;
        Integer integer0;
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            B b0 = B.E.V(f00);
            integer0 = null;
            s = b0 == null ? null : b0.j6();
        }
        catch(Throwable throwable0) {
            c.a(f00, throwable0);
            throw throwable0;
        }
        c.a(f00, null);
        boolean z = Q.n0.b(q0, s);
        if(j0 != null) {
            integer0 = j0.b0();
        }
        boolean z1 = true;
        if(integer0 != null && ((int)integer0) == 2) {
            v = !z;
            z2 = true;
        }
        else if(integer0 == null || ((int)integer0) != 1) {
            v = 0;
            z2 = false;
        }
        else {
            v = 0;
            z2 = true;
        }
        if(z) {
            v = 0;
        }
        else {
            z1 = z2;
        }
        this.b = z1;
        this.d = v;
        this.a = false;
        this.c = false;
    }

    public f(Q q0, j j0, w w0) {
        this(q0, j0);
    }

    public f(Q q0, w w0) {
        this(q0);
    }

    @l
    @n
    public static final f b() {
        return f.e.a();
    }

    @l
    @n
    public static final f c(@l Q q0) {
        return f.e.b(q0);
    }

    @l
    @n
    public static final f d(@l Q q0, @l j j0) {
        return f.e.c(q0, j0);
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.a;
    }

    public final boolean h() {
        return this.c;
    }
}

