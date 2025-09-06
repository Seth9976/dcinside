package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.k;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.o;
import kotlin.sequences.p;
import okio.Z;
import okio.e0;
import okio.o0;
import okio.v;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
@i(name = "-FileSystem")
public final class c {
    @m
    public static final Object a(@l o o0, @l v v0, @l k k0, @l e0 e00, boolean z, boolean z1, @l d d0) {
        @f(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {0x74, 0x87, 0x91}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            boolean p;
            boolean q;
            Object r;
            int s;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.r = object0;
                this.s |= 0x80000000;
                return c.a(null, null, null, null, false, false, this);
            }
        }

        Iterator iterator0;
        boolean z6;
        boolean z5;
        e0 e04;
        k k2;
        boolean z2;
        o o1;
        v v3;
        k k1;
        a c$a0;
        if(d0 instanceof a) {
            c$a0 = (a)d0;
            int v1 = c$a0.s;
            if((v1 & 0x80000000) == 0) {
                c$a0 = new a(d0);
            }
            else {
                c$a0.s = v1 ^ 0x80000000;
            }
        }
        else {
            c$a0 = new a(d0);
        }
        Object object0 = c$a0.r;
        Object object1 = b.l();
        int v2 = 0;
        switch(c$a0.s) {
            case 0: {
                f0.n(object0);
                if(z1) {
                    k1 = k0;
                }
                else {
                    c$a0.k = o0;
                    c$a0.l = v0;
                    k1 = k0;
                    c$a0.m = k1;
                    c$a0.n = e00;
                    c$a0.p = z;
                    c$a0.q = false;
                    c$a0.s = 1;
                    if(o0.a(e00, c$a0) == object1) {
                        return object1;
                    }
                }
                v3 = v0;
                o1 = o0;
                z2 = z;
                goto label_43;
            }
            case 1: {
                boolean z3 = c$a0.q;
                boolean z4 = c$a0.p;
                e0 e01 = (e0)c$a0.n;
                k1 = (k)c$a0.m;
                v3 = (v)c$a0.l;
                o1 = (o)c$a0.k;
                f0.n(object0);
                z1 = z3;
                z2 = z4;
                e00 = e01;
            label_43:
                List list0 = v3.z(e00);
                if(list0 == null) {
                    list0 = u.H();
                }
                if(!list0.isEmpty()) {
                    e0 e02 = e00;
                    while(true) {
                        if(z2 && k1.contains(e02)) {
                            throw new IOException("symlink cycle at " + e00);
                        }
                        e0 e03 = c.h(v3, e02);
                        if(e03 == null) {
                            if(!z2 && v2 != 0) {
                                break;
                            }
                            k1.addLast(e02);
                            try {
                                k2 = k1;
                                e04 = e00;
                                z5 = z2;
                                z6 = z1;
                                iterator0 = list0.iterator();
                                goto label_71;
                            }
                            catch(Throwable throwable0) {
                                k2.removeLast();
                                throw throwable0;
                            }
                        }
                        ++v2;
                        e02 = e03;
                    }
                }
                goto label_91;
            }
            case 2: {
                break;
            }
            case 3: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        z6 = c$a0.q;
        z5 = c$a0.p;
        iterator0 = (Iterator)c$a0.o;
        e04 = (e0)c$a0.n;
        k2 = (k)c$a0.m;
        v3 = (v)c$a0.l;
        o1 = (o)c$a0.k;
        try {
            f0.n(object0);
            while(true) {
            label_71:
                if(!iterator0.hasNext()) {
                    goto label_88;
                }
                Object object2 = iterator0.next();
                c$a0.k = o1;
                c$a0.l = v3;
                c$a0.m = k2;
                c$a0.n = e04;
                c$a0.o = iterator0;
                c$a0.p = z5;
                c$a0.q = z6;
                c$a0.s = 2;
                if(c.a(o1, v3, k2, ((e0)object2), z5, z6, c$a0) == object1) {
                    break;
                }
            }
            return object1;
        }
        catch(Throwable throwable0) {
            k2.removeLast();
            throw throwable0;
        }
    label_88:
        k2.removeLast();
        z1 = z6;
        e00 = e04;
    label_91:
        if(z1) {
            c$a0.k = null;
            c$a0.l = null;
            c$a0.m = null;
            c$a0.n = null;
            c$a0.o = null;
            c$a0.s = 3;
            return o1.a(e00, c$a0) == object1 ? object1 : S0.a;
        }
        return S0.a;
    }

    public static final void b(@l v v0, @l e0 e00, @l e0 e01) throws IOException {
        Long long1;
        Throwable throwable4;
        Long long0;
        okio.m m0;
        L.p(v0, "<this>");
        L.p(e00, "source");
        L.p(e01, "target");
        o0 o00 = v0.M(e00);
        Throwable throwable0 = null;
        try {
            m0 = Z.d(v0.J(e01));
        }
        catch(Throwable throwable1) {
            goto label_27;
        }
        try {
            long0 = m0.K2(o00);
        }
        catch(Throwable throwable2) {
            if(m0 != null) {
                try {
                    m0.close();
                }
                catch(Throwable throwable3) {
                    try {
                        kotlin.o.a(throwable2, throwable3);
                        throwable4 = throwable2;
                        long0 = null;
                        goto label_21;
                    }
                    catch(Throwable throwable1) {
                        goto label_27;
                    }
                }
            }
            throwable4 = throwable2;
            long0 = null;
            goto label_21;
        }
        try {
            m0.close();
            throwable4 = null;
        }
        catch(Throwable throwable4) {
        }
        try {
        label_21:
            if(throwable4 != null) {
                throw throwable4;
            }
            L.m(long0);
            long1 = long0.longValue();
            goto label_35;
        label_27:
            if(o00 != null) {
                goto label_28;
            }
            throwable0 = throwable1;
            long1 = null;
            goto label_39;
        }
        catch(Throwable throwable1) {
            goto label_27;
        }
        try {
        label_28:
            o00.close();
        }
        catch(Throwable throwable5) {
            kotlin.o.a(throwable1, throwable5);
        }
        throwable0 = throwable1;
        long1 = null;
        goto label_39;
    label_35:
        if(o00 != null) {
            try {
                o00.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_39:
        if(throwable0 != null) {
            throw throwable0;
        }
        L.m(long1);
    }

    public static final void c(@l v v0, @l e0 e00, boolean z) throws IOException {
        L.p(v0, "<this>");
        L.p(e00, "dir");
        k k0 = new k();
        for(e0 e01 = e00; e01 != null && !v0.w(e01); e01 = e01.t()) {
            k0.addFirst(e01);
        }
        if(z && k0.isEmpty()) {
            throw new IOException(e00 + " already exists.");
        }
        for(Object object0: k0) {
            v0.m(((e0)object0));
        }
    }

    public static final void d(@l v v0, @l e0 e00, boolean z) throws IOException {
        @f(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
        static final class okio.internal.c.b extends kotlin.coroutines.jvm.internal.k implements A3.o {
            int l;
            private Object m;
            final v n;
            final e0 o;

            okio.internal.c.b(v v0, e0 e00, d d0) {
                this.n = v0;
                this.o = e00;
                super(2, d0);
            }

            @m
            public final Object a(@l o o0, @m d d0) {
                return ((okio.internal.c.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new okio.internal.c.b(this.n, this.o, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        o o0 = (o)this.m;
                        k k0 = new k();
                        this.l = 1;
                        return c.a(o0, this.n, k0, this.o, false, true, this) == object1 ? object1 : S0.a;
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

        L.p(v0, "<this>");
        L.p(e00, "fileOrDirectory");
        Iterator iterator0 = p.b(new okio.internal.c.b(v0, e00, null)).iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v0.r(((e0)object0), z && !iterator0.hasNext());
        }
    }

    public static final boolean e(@l v v0, @l e0 e00) throws IOException {
        L.p(v0, "<this>");
        L.p(e00, "path");
        return v0.E(e00) != null;
    }

    @l
    public static final kotlin.sequences.m f(@l v v0, @l e0 e00, boolean z) throws IOException {
        @f(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {0x60}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
        static final class okio.internal.c.c extends kotlin.coroutines.jvm.internal.k implements A3.o {
            Object l;
            Object m;
            int n;
            private Object o;
            final e0 p;
            final v q;
            final boolean r;

            okio.internal.c.c(e0 e00, v v0, boolean z, d d0) {
                this.p = e00;
                this.q = v0;
                this.r = z;
                super(2, d0);
            }

            @m
            public final Object a(@l o o0, @m d d0) {
                return ((okio.internal.c.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new okio.internal.c.c(this.p, this.q, this.r, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Iterator iterator0;
                k k1;
                o o1;
                Object object1 = b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        o o0 = (o)this.o;
                        k k0 = new k();
                        k0.addLast(this.p);
                        o1 = o0;
                        k1 = k0;
                        iterator0 = this.q.y(this.p).iterator();
                        break;
                    }
                    case 1: {
                        iterator0 = (Iterator)this.m;
                        k k2 = (k)this.l;
                        o o2 = (o)this.o;
                        f0.n(object0);
                        k1 = k2;
                        o1 = o2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    this.o = o1;
                    this.l = k1;
                    this.m = iterator0;
                    this.n = 1;
                    if(c.a(o1, this.q, k1, ((e0)object2), this.r, false, this) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        L.p(v0, "<this>");
        L.p(e00, "dir");
        return p.b(new okio.internal.c.c(e00, v0, z, null));
    }

    @l
    public static final okio.u g(@l v v0, @l e0 e00) throws IOException {
        L.p(v0, "<this>");
        L.p(e00, "path");
        okio.u u0 = v0.E(e00);
        if(u0 == null) {
            throw new FileNotFoundException("no such file: " + e00);
        }
        return u0;
    }

    @m
    public static final e0 h(@l v v0, @l e0 e00) throws IOException {
        L.p(v0, "<this>");
        L.p(e00, "path");
        e0 e01 = v0.D(e00).i();
        if(e01 == null) {
            return null;
        }
        e0 e02 = e00.t();
        L.m(e02);
        return e02.A(e01);
    }
}

