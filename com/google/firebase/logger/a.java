package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

@s0({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,196:1\n26#2:197\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n*L\n78#1:197\n*E\n"})
public abstract class a {
    @s0({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$AndroidLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    static final class com.google.firebase.logger.a.a extends a {
        public final class com.google.firebase.logger.a.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[d.values().length];
                try {
                    arr_v[d.b.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[d.c.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[d.d.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[d.e.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[d.f.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                com.google.firebase.logger.a.a.a.a = arr_v;
            }
        }

        public com.google.firebase.logger.a.a(@l String s, boolean z, @l d a$d0) {
            L.p(s, "tag");
            L.p(a$d0, "minLevel");
            super(s, z, a$d0, null);
        }

        @Override  // com.google.firebase.logger.a
        public int x(@l d a$d0, @l String s, @l Object[] arr_object, @m Throwable throwable0) {
            L.p(a$d0, "level");
            L.p(s, "format");
            L.p(arr_object, "args");
            if(arr_object.length != 0) {
                Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                s = String.format(s, Arrays.copyOf(arr_object1, arr_object1.length));
                L.o(s, "format(format, *args)");
            }
            switch(a$d0) {
                case 1: {
                    String s5 = this.q();
                    return throwable0 == null ? Log.v(s5, s) : Log.v(s5, s, throwable0);
                }
                case 2: {
                    String s4 = this.q();
                    return throwable0 == null ? Log.d(s4, s) : Log.d(s4, s, throwable0);
                }
                case 3: {
                    String s3 = this.q();
                    return throwable0 == null ? Log.i(s3, s) : Log.i(s3, s, throwable0);
                }
                case 4: {
                    String s2 = this.q();
                    return throwable0 == null ? Log.w(s2, s) : Log.w(s2, s, throwable0);
                }
                case 5: {
                    String s1 = this.q();
                    return throwable0 == null ? Log.e(s1, s) : Log.e(s1, s, throwable0);
                }
                default: {
                    throw new J();
                }
            }
        }
    }

    @s0({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n73#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n*L\n180#1:197,2\n180#1:199\n*E\n"})
    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        @n
        public final a a(@l String s, boolean z, @l d a$d0) {
            L.p(s, "tag");
            L.p(a$d0, "minLevel");
            ConcurrentHashMap concurrentHashMap0 = a.e;
            com.google.firebase.logger.a.a a$a0 = concurrentHashMap0.get(s);
            if(a$a0 == null) {
                a$a0 = new com.google.firebase.logger.a.a(s, z, a$d0);
                Object object0 = concurrentHashMap0.putIfAbsent(s, a$a0);
                if(object0 != null) {
                    a$a0 = object0;
                }
            }
            L.o(a$a0, "loggers.getOrPut(tag) { …tag, enabled, minLevel) }");
            return a$a0;
        }

        public static a b(b a$b0, String s, boolean z, d a$d0, int v, Object object0) {
            if((v & 2) != 0) {
                z = true;
            }
            if((v & 4) != 0) {
                a$d0 = d.d;
            }
            return a$b0.a(s, z, a$d0);
        }

        @VisibleForTesting
        @l
        @n
        public final c c(@l String s, boolean z, @l d a$d0) {
            L.p(s, "tag");
            L.p(a$d0, "minLevel");
            c a$c0 = new c(s, z, a$d0);
            a.e.put(s, a$c0);
            return a$c0;
        }

        public static c d(b a$b0, String s, boolean z, d a$d0, int v, Object object0) {
            if((v & 2) != 0) {
                z = true;
            }
            if((v & 4) != 0) {
                a$d0 = d.c;
            }
            return a$b0.c(s, z, a$d0);
        }
    }

    @VisibleForTesting
    @s0({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1747#2,3:197\n1747#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n*L\n144#1:197,3\n148#1:200,3\n*E\n"})
    public static final class c extends a {
        @l
        private final List f;

        public c(@l String s, boolean z, @l d a$d0) {
            L.p(s, "tag");
            L.p(a$d0, "minLevel");
            super(s, z, a$d0, null);
            this.f = new ArrayList();
        }

        @VisibleForTesting
        public final void P() {
            this.f.clear();
        }

        @VisibleForTesting
        public final boolean Q(@l String s) {
            L.p(s, "message");
            Iterable iterable0 = this.f;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(v.W2(((String)object0), s, false, 2, null)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }

        @VisibleForTesting
        public final boolean R(@l Function1 function10) {
            L.p(function10, "predicate");
            Iterable iterable0 = this.f;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(((Boolean)function10.invoke(object0)).booleanValue()) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }

        private final String S(d a$d0, String s, Object[] arr_object, Throwable throwable0) {
            if(arr_object.length != 0) {
                Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                s = String.format(s, Arrays.copyOf(arr_object1, arr_object1.length));
                L.o(s, "format(format, *args)");
            }
            if(throwable0 != null) {
                String s1 = a$d0 + ' ' + s + ' ' + Log.getStackTraceString(throwable0);
                return s1 == null ? a$d0 + ' ' + s : s1;
            }
            return a$d0 + ' ' + s;
        }

        @Override  // com.google.firebase.logger.a
        public int x(@l d a$d0, @l String s, @l Object[] arr_object, @m Throwable throwable0) {
            L.p(a$d0, "level");
            L.p(s, "format");
            L.p(arr_object, "args");
            String s1 = this.S(a$d0, s, arr_object, throwable0);
            System.out.println("Log: " + s1);
            this.f.add(s1);
            return s1.length();
        }
    }

    public static enum d {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int a;

        private d(int v1) {
            this.a = v1;
        }

        private static final d[] a() [...] // Inlined contents

        public final int b() {
            return this.a;
        }
    }

    @l
    private final String a;
    private boolean b;
    @l
    private d c;
    @l
    public static final b d;
    @l
    private static final ConcurrentHashMap e;

    static {
        a.d = new b(null);
        a.e = new ConcurrentHashMap();
    }

    private a(String s, boolean z, d a$d0) {
        this.a = s;
        this.b = z;
        this.c = a$d0;
    }

    public a(String s, boolean z, d a$d0, w w0) {
        this(s, z, a$d0);
    }

    public final void A(boolean z) {
        this.b = z;
    }

    public final void B(@l d a$d0) {
        L.p(a$d0, "<set-?>");
        this.c = a$d0;
    }

    @VisibleForTesting
    @l
    @n
    public static final c C(@l String s, boolean z, @l d a$d0) {
        return a.d.c(s, z, a$d0);
    }

    @j
    public final int D(@l String s) {
        L.p(s, "msg");
        return a.H(this, s, null, 2, null);
    }

    @j
    public final int E(@l String s, @m Throwable throwable0) {
        L.p(s, "msg");
        return a.z(this, d.b, s, null, throwable0, 4, null);
    }

    @j
    public final int F(@l String s, @l Object[] arr_object) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return a.I(this, s, arr_object, null, 4, null);
    }

    @j
    public final int G(@l String s, @l Object[] arr_object, @m Throwable throwable0) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return this.y(d.b, s, arr_object, throwable0);
    }

    public static int H(a a0, String s, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if((v & 2) != 0) {
            throwable0 = null;
        }
        return a0.E(s, throwable0);
    }

    public static int I(a a0, String s, Object[] arr_object, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if((v & 4) != 0) {
            throwable0 = null;
        }
        return a0.G(s, arr_object, throwable0);
    }

    @j
    public final int J(@l String s) {
        L.p(s, "msg");
        return a.N(this, s, null, 2, null);
    }

    @j
    public final int K(@l String s, @m Throwable throwable0) {
        L.p(s, "msg");
        return a.z(this, d.e, s, null, throwable0, 4, null);
    }

    @j
    public final int L(@l String s, @l Object[] arr_object) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return a.O(this, s, arr_object, null, 4, null);
    }

    @j
    public final int M(@l String s, @l Object[] arr_object, @m Throwable throwable0) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return this.y(d.e, s, arr_object, throwable0);
    }

    public static int N(a a0, String s, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if((v & 2) != 0) {
            throwable0 = null;
        }
        return a0.K(s, throwable0);
    }

    public static int O(a a0, String s, Object[] arr_object, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if((v & 4) != 0) {
            throwable0 = null;
        }
        return a0.M(s, arr_object, throwable0);
    }

    @j
    public final int b(@l String s) {
        L.p(s, "msg");
        return a.f(this, s, null, 2, null);
    }

    @j
    public final int c(@l String s, @m Throwable throwable0) {
        L.p(s, "msg");
        return a.z(this, d.c, s, null, throwable0, 4, null);
    }

    @j
    public final int d(@l String s, @l Object[] arr_object) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return a.g(this, s, arr_object, null, 4, null);
    }

    @j
    public final int e(@l String s, @l Object[] arr_object, @m Throwable throwable0) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return this.y(d.c, s, arr_object, throwable0);
    }

    public static int f(a a0, String s, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if((v & 2) != 0) {
            throwable0 = null;
        }
        return a0.c(s, throwable0);
    }

    public static int g(a a0, String s, Object[] arr_object, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if((v & 4) != 0) {
            throwable0 = null;
        }
        return a0.e(s, arr_object, throwable0);
    }

    @j
    public final int h(@l String s) {
        L.p(s, "msg");
        return a.l(this, s, null, 2, null);
    }

    @j
    public final int i(@l String s, @m Throwable throwable0) {
        L.p(s, "msg");
        return a.z(this, d.f, s, null, throwable0, 4, null);
    }

    @j
    public final int j(@l String s, @l Object[] arr_object) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return a.m(this, s, arr_object, null, 4, null);
    }

    @j
    public final int k(@l String s, @l Object[] arr_object, @m Throwable throwable0) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return this.y(d.f, s, arr_object, throwable0);
    }

    public static int l(a a0, String s, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if((v & 2) != 0) {
            throwable0 = null;
        }
        return a0.i(s, throwable0);
    }

    public static int m(a a0, String s, Object[] arr_object, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if((v & 4) != 0) {
            throwable0 = null;
        }
        return a0.k(s, arr_object, throwable0);
    }

    public final boolean n() {
        return this.b;
    }

    @l
    @n
    public static final a o(@l String s, boolean z, @l d a$d0) {
        return a.d.a(s, z, a$d0);
    }

    @l
    public final d p() {
        return this.c;
    }

    @l
    public final String q() {
        return this.a;
    }

    @j
    public final int r(@l String s) {
        L.p(s, "msg");
        return a.v(this, s, null, 2, null);
    }

    @j
    public final int s(@l String s, @m Throwable throwable0) {
        L.p(s, "msg");
        return a.z(this, d.d, s, null, throwable0, 4, null);
    }

    @j
    public final int t(@l String s, @l Object[] arr_object) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return a.w(this, s, arr_object, null, 4, null);
    }

    @j
    public final int u(@l String s, @l Object[] arr_object, @m Throwable throwable0) {
        L.p(s, "format");
        L.p(arr_object, "args");
        return this.y(d.d, s, arr_object, throwable0);
    }

    public static int v(a a0, String s, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if((v & 2) != 0) {
            throwable0 = null;
        }
        return a0.s(s, throwable0);
    }

    public static int w(a a0, String s, Object[] arr_object, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if((v & 4) != 0) {
            throwable0 = null;
        }
        return a0.u(s, arr_object, throwable0);
    }

    public abstract int x(@l d arg1, @l String arg2, @l Object[] arg3, @m Throwable arg4);

    // 去混淆评级： 低(30)
    private final int y(d a$d0, String s, Object[] arr_object, Throwable throwable0) {
        return !this.b || this.c.b() > a$d0.b() && !Log.isLoggable(this.a, a$d0.b()) ? 0 : this.x(a$d0, s, arr_object, throwable0);
    }

    static int z(a a0, d a$d0, String s, Object[] arr_object, Throwable throwable0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if((v & 4) != 0) {
            arr_object = new Object[0];
        }
        return a0.y(a$d0, s, arr_object, throwable0);
    }
}

