package com.kakao.adfit.ads.na;

import android.content.Context;
import android.graphics.Bitmap;
import com.kakao.adfit.a.h;
import com.kakao.adfit.a.r;
import com.kakao.adfit.a.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.u1;

public final class d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static abstract class b {
        public static final class com.kakao.adfit.ads.na.d.b.a extends b {
            public com.kakao.adfit.ads.na.d.b.a(String s) {
                L.p(s, "url");
                super(s, null);
            }
        }

        public static final class com.kakao.adfit.ads.na.d.b.b extends b {
            private final Bitmap b;

            public com.kakao.adfit.ads.na.d.b.b(String s, Bitmap bitmap0) {
                L.p(s, "url");
                L.p(bitmap0, "value");
                super(s, null);
                this.b = bitmap0;
            }

            public final Bitmap b() {
                return this.b;
            }
        }

        private final String a;

        private b(String s) {
            this.a = s;
        }

        public b(String s, w w0) {
            this(s);
        }

        public final String a() {
            return this.a;
        }
    }

    private final r a;
    private final HashMap b;
    public static final a c;

    static {
        d.c = new a(null);
    }

    public d(Context context0) {
        L.p(context0, "context");
        this(h.c.a(context0).e());
    }

    public d(r r0) {
        L.p(r0, "loader");
        super();
        this.a = r0;
        this.b = new HashMap();
    }

    public static Object a(d d0, String s, long v, kotlin.coroutines.d d1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 3000L;
        }
        return d0.b(s, v, d1);
    }

    public static Object a(d d0, List list0, List list1, long v, kotlin.coroutines.d d1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            list1 = u.H();
        }
        if((v1 & 4) != 0) {
            v = 3000L;
        }
        return d0.a(list0, list1, v, d1);
    }

    private final List a(List list0) {
        static final class f extends o implements A3.o {
            int a;
            private Object b;
            final d c;
            final String d;

            f(d d0, String s, kotlin.coroutines.d d1) {
                this.c = d0;
                this.d = s;
                super(2, d1);
            }

            public final Object a(j j0, kotlin.coroutines.d d0) {
                return ((f)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new f(this.c, this.d, d0);
                d1.b = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((j)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                j j0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.a) {
                    case 0: {
                        f0.n(object0);
                        j0 = (j)this.b;
                        this.b = j0;
                        this.a = 1;
                        object0 = d.a(this.c, this.d, 0L, this, 2, null);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        j0 = (j)this.b;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((Bitmap)object0) == null) {
                    com.kakao.adfit.ads.na.d.b.a d$b$a0 = new com.kakao.adfit.ads.na.d.b.a(this.d);
                    this.b = null;
                    this.a = 2;
                    return j0.emit(d$b$a0, this) == object1 ? object1 : S0.a;
                }
                com.kakao.adfit.ads.na.d.b.b d$b$b0 = new com.kakao.adfit.ads.na.d.b.b(this.d, ((Bitmap)object0));
                this.b = null;
                this.a = 3;
                return j0.emit(d$b$b0, this) == object1 ? object1 : S0.a;
            }
        }

        if(list0.isEmpty()) {
            return u.H();
        }
        List list1 = new ArrayList();
        for(Object object0: list0) {
            String s = (String)object0;
            if(this.a(s) == null) {
                list1.add(k.I0(new f(this, s, null)));
            }
        }
        return ((ArrayList)list1).isEmpty() ? u.H() : list1;
    }

    public final Bitmap a(String s) {
        L.p(s, "url");
        Bitmap bitmap0 = (Bitmap)this.b.get(s);
        if(bitmap0 == null) {
            bitmap0 = this.a.a(s);
            if(bitmap0 != null) {
                this.b.put(s, bitmap0);
                return bitmap0;
            }
            return null;
        }
        return bitmap0;
    }

    public final Object a(m m0, kotlin.coroutines.d d0) {
        String s;
        com.kakao.adfit.ads.na.m.d m$d0 = m0.i();
        if(m$d0 instanceof com.kakao.adfit.ads.na.m.b) {
            s = ((com.kakao.adfit.ads.na.m.b)m$d0).b();
        }
        else if(m$d0 instanceof com.kakao.adfit.ads.na.m.f) {
            com.kakao.adfit.ads.na.m.b m$b0 = ((com.kakao.adfit.ads.na.m.f)m$d0).b();
            s = m$b0 == null ? null : m$b0.b();
        }
        else {
            s = null;
        }
        List list0 = s == null ? u.H() : u.k(s);
        if(m0.k() != null) {
            return m0.a() == null ? d.a(this, list0, u.k(m0.k().b()), 0L, d0, 4, null) : d.a(this, list0, u.O(new String[]{m0.k().b(), m0.a().b()}), 0L, d0, 4, null);
        }
        return m0.a() == null ? d.a(this, list0, u.H(), 0L, d0, 4, null) : d.a(this, list0, u.k(m0.a().b()), 0L, d0, 4, null);
    }

    public final Object a(String s, long v, kotlin.coroutines.d d0) {
        static final class c extends o implements A3.o {
            int a;
            private Object b;
            final long c;
            final i d;
            final d e;
            final String f;

            c(long v, i i0, d d0, String s, kotlin.coroutines.d d1) {
                this.c = v;
                this.d = i0;
                this.e = d0;
                this.f = s;
                super(2, d1);
            }

            public final Object a(j j0, kotlin.coroutines.d d0) {
                return ((c)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new c(this.c, this.d, this.e, this.f, d0);
                d1.b = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((j)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                static final class com.kakao.adfit.ads.na.d.c.a extends o implements A3.o {
                    int a;
                    final i b;
                    final d c;
                    final String d;
                    final j e;

                    com.kakao.adfit.ads.na.d.c.a(i i0, d d0, String s, j j0, kotlin.coroutines.d d1) {
                        this.b = i0;
                        this.c = d0;
                        this.d = s;
                        this.e = j0;
                        super(2, d1);
                    }

                    public final Object a(O o0, kotlin.coroutines.d d0) {
                        return ((com.kakao.adfit.ads.na.d.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                        return new com.kakao.adfit.ads.na.d.c.a(this.b, this.c, this.d, this.e, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.a) {
                            case 0: {
                                f0.n(object0);
                                this.a = 1;
                                object0 = k.H1(this.b, this);
                                if(object0 == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 1: {
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
                        if(((v)object0) instanceof com.kakao.adfit.a.v.c) {
                            Bitmap bitmap0 = (Bitmap)((com.kakao.adfit.a.v.c)(((v)object0))).a();
                            this.c.b.put(this.d, bitmap0);
                            this.a = 2;
                            return this.e.emit(bitmap0, this) != object1 ? S0.a : object1;
                        }
                        if(((v)object0) instanceof com.kakao.adfit.a.v.b) {
                            throw ((com.kakao.adfit.a.v.b)(((v)object0))).a();
                        }
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.a) {
                    case 0: {
                        f0.n(object0);
                        com.kakao.adfit.ads.na.d.c.a d$c$a0 = new com.kakao.adfit.ads.na.d.c.a(this.d, this.e, this.f, ((j)this.b), null);
                        this.a = 1;
                        return u1.c(this.c, d$c$a0, this) == object1 ? object1 : S0.a;
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

        return k.I0(new c(v, this.a.b(s), this, s, null));
    }

    // 去混淆评级： 低(26)
    public final Object a(List list0, List list1, long v, kotlin.coroutines.d d0) {
        static final class e extends o implements A3.o {
            Object a;
            int b;
            private Object c;
            final long d;
            final List e;
            final long f;
            final d g;
            final List h;
            final List i;
            final List j;

            e(long v, List list0, long v1, d d0, List list1, List list2, List list3, kotlin.coroutines.d d1) {
                this.d = v;
                this.e = list0;
                this.f = v1;
                this.g = d0;
                this.h = list1;
                this.i = list2;
                this.j = list3;
                super(2, d1);
            }

            public final Object a(j j0, kotlin.coroutines.d d0) {
                return ((e)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new e(this.d, this.e, this.f, this.g, this.h, this.i, this.j, d0);
                d1.c = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((j)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                static final class com.kakao.adfit.ads.na.d.e.a extends o implements A3.o {
                    int a;
                    final List b;
                    final List c;
                    final d d;
                    final kotlin.jvm.internal.l0.a e;
                    final j f;

                    com.kakao.adfit.ads.na.d.e.a(List list0, List list1, d d0, kotlin.jvm.internal.l0.a l0$a0, j j0, kotlin.coroutines.d d1) {
                        this.b = list0;
                        this.c = list1;
                        this.d = d0;
                        this.e = l0$a0;
                        this.f = j0;
                        super(2, d1);
                    }

                    public final Object a(O o0, kotlin.coroutines.d d0) {
                        return ((com.kakao.adfit.ads.na.d.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                        return new com.kakao.adfit.ads.na.d.e.a(this.b, this.c, this.d, this.e, this.f, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        static final class com.kakao.adfit.ads.na.d.e.a.a implements j {
                            final d a;
                            final kotlin.jvm.internal.l0.a b;
                            final j c;

                            com.kakao.adfit.ads.na.d.e.a.a(d d0, kotlin.jvm.internal.l0.a l0$a0, j j0) {
                                this.a = d0;
                                this.b = l0$a0;
                                this.c = j0;
                                super();
                            }

                            public final Object a(b d$b0, kotlin.coroutines.d d0) {
                                if(d$b0 instanceof com.kakao.adfit.ads.na.d.b.b) {
                                    Bitmap bitmap0 = ((com.kakao.adfit.ads.na.d.b.b)d$b0).b();
                                    this.a.b.put(d$b0.a(), bitmap0);
                                    return S0.a;
                                }
                                if(d$b0 instanceof com.kakao.adfit.ads.na.d.b.a) {
                                    com.kakao.adfit.m.f.b(("Required image preparing failed. [url = " + d$b0.a() + ']'));
                                    kotlin.jvm.internal.l0.a l0$a0 = this.b;
                                    if(!l0$a0.a) {
                                        l0$a0.a = true;
                                        Object object0 = this.c.emit(kotlin.coroutines.jvm.internal.b.a(false), d0);
                                        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
                                    }
                                }
                                return S0.a;
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            public Object emit(Object object0, kotlin.coroutines.d d0) {
                                return this.a(((b)object0), d0);
                            }
                        }


                        static final class com.kakao.adfit.ads.na.d.e.a.b implements j {
                            final d a;

                            com.kakao.adfit.ads.na.d.e.a.b(d d0) {
                                this.a = d0;
                                super();
                            }

                            public final Object a(b d$b0, kotlin.coroutines.d d0) {
                                if(d$b0 instanceof com.kakao.adfit.ads.na.d.b.b) {
                                    Bitmap bitmap0 = ((com.kakao.adfit.ads.na.d.b.b)d$b0).b();
                                    this.a.b.put(d$b0.a(), bitmap0);
                                    return S0.a;
                                }
                                if(d$b0 instanceof com.kakao.adfit.ads.na.d.b.a) {
                                    com.kakao.adfit.m.f.e(("Optional image preparing failed. [url = " + d$b0.a() + ']'));
                                }
                                return S0.a;
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            public Object emit(Object object0, kotlin.coroutines.d d0) {
                                return this.a(((b)object0), d0);
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.a) {
                            case 0: {
                                f0.n(object0);
                                if(!this.b.isEmpty()) {
                                    i i0 = k.Y0(this.b);
                                    com.kakao.adfit.ads.na.d.e.a.a d$e$a$a0 = new com.kakao.adfit.ads.na.d.e.a.a(this.d, this.e, this.f);
                                    this.a = 1;
                                    if(i0.collect(d$e$a$a0, this) == object1) {
                                        return object1;
                                    }
                                }
                                break;
                            }
                            case 1: {
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
                        if(!this.c.isEmpty()) {
                            i i1 = k.Y0(this.c);
                            com.kakao.adfit.ads.na.d.e.a.b d$e$a$b0 = new com.kakao.adfit.ads.na.d.e.a.b(this.d);
                            this.a = 2;
                            if(i1.collect(d$e$a$b0, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                }

                kotlin.jvm.internal.l0.a l0$a1;
                j j1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.b) {
                    case 0: {
                        f0.n(object0);
                        j j0 = (j)this.c;
                        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
                        try {
                            com.kakao.adfit.ads.na.d.e.a d$e$a0 = new com.kakao.adfit.ads.na.d.e.a(this.i, this.j, this.g, l0$a0, j0, null);
                            this.c = j0;
                            this.a = l0$a0;
                            this.b = 1;
                            if(u1.c(this.d, d$e$a0, this) == object1) {
                                return object1;
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        j1 = j0;
                        l0$a1 = l0$a0;
                        break;
                    }
                    case 1: {
                        l0$a1 = (kotlin.jvm.internal.l0.a)this.a;
                        j1 = (j)this.c;
                        try {
                            f0.n(object0);
                        }
                        catch(Exception unused_ex) {
                        }
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(l0$a1.a) {
                    return S0.a;
                }
                List list0 = this.e;
                d d0 = this.g;
                if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                    for(Object object2: list0) {
                        if(d0.b.get(((String)object2)) == null) {
                            this.c = null;
                            this.a = null;
                            this.b = 2;
                            return j1.emit(kotlin.coroutines.jvm.internal.b.a(false), this) == object1 ? object1 : S0.a;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                this.c = null;
                this.a = null;
                this.b = 3;
                return j1.emit(kotlin.coroutines.jvm.internal.b.a(true), this) == object1 ? object1 : S0.a;
            }
        }

        List list2 = this.a(list0);
        List list3 = this.a(list1);
        return !list2.isEmpty() || !list3.isEmpty() ? k.I0(new e(v, list0, 0L, this, list1, list2, list3, null)) : k.L0(kotlin.coroutines.jvm.internal.b.a(true));
    }

    public final Object b(String s, long v, kotlin.coroutines.d d0) {
        static final class com.kakao.adfit.ads.na.d.d extends kotlin.coroutines.jvm.internal.d {
            Object a;
            final d b;
            int c;

            com.kakao.adfit.ads.na.d.d(d d0, kotlin.coroutines.d d1) {
                this.b = d0;
                super(d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                this.a = object0;
                this.c |= 0x80000000;
                return this.b.b(null, 0L, this);
            }
        }

        com.kakao.adfit.ads.na.d.d d$d0;
        if(d0 instanceof com.kakao.adfit.ads.na.d.d) {
            d$d0 = (com.kakao.adfit.ads.na.d.d)d0;
            int v1 = d$d0.c;
            if((v1 & 0x80000000) == 0) {
                d$d0 = new com.kakao.adfit.ads.na.d.d(this, d0);
            }
            else {
                d$d0.c = v1 ^ 0x80000000;
            }
        }
        else {
            d$d0 = new com.kakao.adfit.ads.na.d.d(this, d0);
        }
        Object object0 = d$d0.a;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        try {
            switch(d$d0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_18;
                }
                case 2: {
                    goto label_23;
                }
            }
        }
        catch(Exception unused_ex) {
            return null;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        f0.n(object0);
        try {
            d$d0.c = 1;
            object0 = this.a(s, v, d$d0);
            if(object0 == object1) {
                return object1;
            label_18:
                f0.n(object0);
            }
            d$d0.c = 2;
            object0 = k.H1(((i)object0), d$d0);
            if(object0 == object1) {
                return object1;
            label_23:
                f0.n(object0);
            }
            return (Bitmap)object0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

