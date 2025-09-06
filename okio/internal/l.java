package okio.internal;

import A3.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jeb.synthetic.FIN;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import okio.Z;
import okio.e0;
import okio.n;
import okio.t;
import okio.v;

@s0({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"})
public final class l {
    private static final int a = 0x4034B50;
    private static final int b = 0x2014B50;
    private static final int c = 101010256;
    private static final int d = 0x7064B50;
    private static final int e = 0x6064B50;
    public static final int f = 8;
    public static final int g = 0;
    private static final int h = 1;
    private static final int i = 1;
    private static final long j = 0xFFFFFFFFL;
    private static final int k = 1;
    private static final int l = 0x5455;

    private static final Map a(List list0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n1#1,328:1\n156#2:329\n*E\n"})
        public static final class a implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((k)object0).a(), ((k)object1).a());
            }
        }

        k k1;
        e0 e00 = okio.e0.a.h(e0.b, "/", false, 1, null);
        Map map0 = Y.j0(new V[]{r0.a(e00, new k(e00, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null))});
        Iterator iterator0 = u.u5(list0, new a()).iterator();
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            k k0 = (k)object0;
            if(((k)map0.put(k0.a(), k0)) == null) {
                while(true) {
                    e0 e01 = k0.a().t();
                    if(e01 == null) {
                        continue label_3;
                    }
                    k1 = (k)map0.get(e01);
                    if(k1 != null) {
                        break;
                    }
                    k k2 = new k(e01, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                    map0.put(e01, k2);
                    k2.b().add(k0.a());
                    k0 = k2;
                }
                k1.b().add(k0.a());
            }
        }
        return map0;
    }

    private static final Long b(int v, int v1) {
        if(v1 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
        gregorianCalendar0.set(14, 0);
        gregorianCalendar0.set((v >> 9 & 0x7F) + 1980, (v >> 5 & 15) - 1, v & 0x1F, v1 >> 11 & 0x1F, v1 >> 5 & 0x3F, (v1 & 0x1F) << 1);
        return gregorianCalendar0.getTime().getTime();
    }

    private static final String c(int v) [...] // 潜在的解密器

    @y4.l
    public static final okio.s0 d(@y4.l e0 e00, @y4.l v v0, @y4.l Function1 function10) throws IOException {
        okio.s0 s00;
        int v4;
        n n0;
        L.p(e00, "zipPath");
        L.p(v0, "fileSystem");
        L.p(function10, "predicate");
        t t0 = v0.F(e00);
        try {
            long v1 = t0.size() - 22L;
            if(v1 < 0L) {
                throw new IOException("not a zip: size=" + t0.size());
            }
            long v3 = Math.max(v1 - 0x10000L, 0L);
            while(true) {
                n0 = Z.e(t0.f0(v1));
                v4 = FIN.finallyOpen$NT();
                if(n0.H3() == 101010256) {
                    break;
                }
                FIN.finallyCodeBegin$NT(v4);
                n0.close();
                FIN.finallyCodeEnd$NT(v4);
                --v1;
                if(v1 < v3) {
                    throw new IOException("not a zip: end of central directory signature not found");
                }
            }
            h h0 = l.g(n0);
            String s = n0.C0(((long)h0.b()));
            FIN.finallyExec$NT(v4);
            if(v1 - 20L > 0L) {
                n n1 = Z.e(t0.f0(v1 - 20L));
                try {
                    if(n1.H3() == 0x7064B50) {
                        int v5 = n1.H3();
                        long v6 = n1.r0();
                        if(n1.H3() != 1 || v5 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        n n2 = Z.e(t0.f0(v6));
                        try {
                            int v7 = n2.H3();
                            if(v7 != 0x6064B50) {
                                throw new IOException("bad zip: expected 0x6064b50 but was " + l.c(v7));
                            }
                            h0 = l.k(n2, h0);
                        }
                        catch(Throwable throwable2) {
                            c.a(n2, throwable2);
                            throw throwable2;
                        }
                        c.a(n2, null);
                    }
                }
                catch(Throwable throwable1) {
                    c.a(n1, throwable1);
                    throw throwable1;
                }
                c.a(n1, null);
            }
            ArrayList arrayList0 = new ArrayList();
            n n3 = Z.e(t0.f0(h0.a()));
            try {
                long v8 = h0.c();
                for(long v2 = 0L; v2 < v8; ++v2) {
                    k k0 = l.f(n3);
                    if(k0.h() >= h0.a()) {
                        throw new IOException("bad zip: local file header offset >= central directory offset");
                    }
                    if(((Boolean)function10.invoke(k0)).booleanValue()) {
                        arrayList0.add(k0);
                    }
                }
            }
            catch(Throwable throwable3) {
                c.a(n3, throwable3);
                throw throwable3;
            }
            c.a(n3, null);
            s00 = new okio.s0(e00, v0, l.a(arrayList0), s);
        }
        catch(Throwable throwable0) {
            c.a(t0, throwable0);
            throw throwable0;
        }
        c.a(t0, null);
        return s00;
    }

    public static okio.s0 e(e0 e00, v v0, Function1 function10, int v1, Object object0) throws IOException {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @y4.l
            public final Boolean a(@y4.l k k0) {
                L.p(k0, "it");
                return true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((k)object0));
            }
        }

        if((v1 & 4) != 0) {
            function10 = b.e;
        }
        return l.d(e00, v0, function10);
    }

    @y4.l
    public static final k f(@y4.l n n0) throws IOException {
        static final class okio.internal.l.c extends N implements o {
            final kotlin.jvm.internal.l0.a e;
            final long f;
            final g g;
            final n h;
            final g i;
            final g j;

            okio.internal.l.c(kotlin.jvm.internal.l0.a l0$a0, long v, g l0$g0, n n0, g l0$g1, g l0$g2) {
                this.e = l0$a0;
                this.f = v;
                this.g = l0$g0;
                this.h = n0;
                this.i = l0$g1;
                this.j = l0$g2;
                super(2);
            }

            public final void a(int v, long v1) {
                if(v == 1) {
                    kotlin.jvm.internal.l0.a l0$a0 = this.e;
                    if(l0$a0.a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    l0$a0.a = true;
                    if(v1 < this.f) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    this.g.a = this.g.a == 0xFFFFFFFFL ? this.h.r0() : this.g.a;
                    long v2 = 0L;
                    this.i.a = this.i.a == 0xFFFFFFFFL ? this.h.r0() : 0L;
                    g l0$g0 = this.j;
                    if(l0$g0.a == 0xFFFFFFFFL) {
                        v2 = this.h.r0();
                    }
                    l0$g0.a = v2;
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Number)object0).intValue(), ((Number)object1).longValue());
                return S0.a;
            }
        }

        L.p(n0, "<this>");
        int v = n0.H3();
        if(v != 0x2014B50) {
            throw new IOException("bad zip: expected 0x2014b50 but was " + l.c(v));
        }
        n0.skip(4L);
        int v1 = n0.q0();
        if((v1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + l.c(v1 & 0xFFFF));
        }
        int v2 = n0.q0();
        int v3 = n0.q0();
        Long long0 = l.b(n0.q0() & 0xFFFF, v3 & 0xFFFF);
        long v4 = ((long)n0.H3()) & 0xFFFFFFFFL;
        g l0$g0 = new g();
        l0$g0.a = ((long)n0.H3()) & 0xFFFFFFFFL;
        g l0$g1 = new g();
        l0$g1.a = ((long)n0.H3()) & 0xFFFFFFFFL;
        int v5 = n0.q0();
        int v6 = n0.q0();
        int v7 = n0.q0();
        n0.skip(8L);
        g l0$g2 = new g();
        l0$g2.a = ((long)n0.H3()) & 0xFFFFFFFFL;
        String s = n0.C0(((long)(v5 & 0xFFFF)));
        if(kotlin.text.v.V2(s, '\u0000', false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long v8 = l0$g1.a == 0xFFFFFFFFL ? 8L : 0L;
        long v9 = Long.compare(l0$g0.a, 0xFFFFFFFFL) == 0 ? v8 + 8L : v8;
        if(l0$g2.a == 0xFFFFFFFFL) {
            v9 += 8L;
        }
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        l.h(n0, v6 & 0xFFFF, new okio.internal.l.c(l0$a0, v9, l0$g1, n0, l0$g0, l0$g2));
        if(v9 > 0L && !l0$a0.a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String s1 = n0.C0(((long)(v7 & 0xFFFF)));
        return new k(okio.e0.a.h(e0.b, "/", false, 1, null).v(s), kotlin.text.v.N1(s, "/", false, 2, null), s1, v4, l0$g0.a, l0$g1.a, v2 & 0xFFFF, long0, l0$g2.a);
    }

    private static final h g(n n0) throws IOException {
        int v = n0.q0();
        int v1 = n0.q0();
        int v2 = n0.q0();
        if(((long)(v2 & 0xFFFF)) != ((long)(n0.q0() & 0xFFFF)) || (v & 0xFFFF) != 0 || (v1 & 0xFFFF) != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        n0.skip(4L);
        return new h(((long)(v2 & 0xFFFF)), 0xFFFFFFFFL & ((long)n0.H3()), n0.q0() & 0xFFFF);
    }

    private static final void h(n n0, int v, o o0) {
        for(long v1 = (long)v; v1 != 0L; v1 = v1 - 4L - v3) {
            if(v1 < 4L) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int v2 = n0.q0() & 0xFFFF;
            long v3 = ((long)n0.q0()) & 0xFFFFL;
            if(v1 - 4L < v3) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            n0.X2(v3);
            long v4 = n0.E().size();
            o0.invoke(v2, v3);
            long v5 = n0.E().size() + v3 - v4;
            int v6 = Long.compare(v5, 0L);
            if(v6 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + v2);
            }
            if(v6 > 0) {
                n0.E().skip(v5);
            }
        }
    }

    @y4.l
    public static final okio.u i(@y4.l n n0, @y4.l okio.u u0) {
        L.p(n0, "<this>");
        L.p(u0, "basicMetadata");
        okio.u u1 = l.j(n0, u0);
        L.m(u1);
        return u1;
    }

    private static final okio.u j(n n0, okio.u u0) {
        static final class d extends N implements o {
            final n e;
            final kotlin.jvm.internal.l0.h f;
            final kotlin.jvm.internal.l0.h g;
            final kotlin.jvm.internal.l0.h h;

            d(n n0, kotlin.jvm.internal.l0.h l0$h0, kotlin.jvm.internal.l0.h l0$h1, kotlin.jvm.internal.l0.h l0$h2) {
                this.e = n0;
                this.f = l0$h0;
                this.g = l0$h1;
                this.h = l0$h2;
                super(2);
            }

            public final void a(int v, long v1) {
                long v2 = 1L;
                if(v == 0x5455) {
                    if(v1 < 1L) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    int v3 = this.e.readByte();
                    boolean z = false;
                    boolean z1 = (v3 & 1) == 1;
                    boolean z2 = (v3 & 2) == 2;
                    if((v3 & 4) == 4) {
                        z = true;
                    }
                    n n0 = this.e;
                    if(z1) {
                        v2 = 5L;
                    }
                    if(z2) {
                        v2 += 4L;
                    }
                    if(z) {
                        v2 += 4L;
                    }
                    if(v1 < v2) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if(z1) {
                        this.f.a = (long)(((long)n0.H3()) * 1000L);
                    }
                    if(z2) {
                        this.g.a = (long)(((long)this.e.H3()) * 1000L);
                    }
                    if(z) {
                        this.h.a = (long)(((long)this.e.H3()) * 1000L);
                    }
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Number)object0).intValue(), ((Number)object1).longValue());
                return S0.a;
            }
        }

        kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
        l0$h0.a = u0 == null ? null : u0.g();
        kotlin.jvm.internal.l0.h l0$h1 = new kotlin.jvm.internal.l0.h();
        kotlin.jvm.internal.l0.h l0$h2 = new kotlin.jvm.internal.l0.h();
        int v = n0.H3();
        if(v != 0x4034B50) {
            throw new IOException("bad zip: expected 0x4034b50 but was " + l.c(v));
        }
        n0.skip(2L);
        int v1 = n0.q0();
        if((v1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + l.c(v1 & 0xFFFF));
        }
        n0.skip(18L);
        long v2 = ((long)n0.q0()) & 0xFFFFL;
        int v3 = n0.q0();
        n0.skip(v2);
        if(u0 == null) {
            n0.skip(((long)(v3 & 0xFFFF)));
            return null;
        }
        l.h(n0, v3 & 0xFFFF, new d(n0, l0$h0, l0$h1, l0$h2));
        return new okio.u(u0.k(), u0.j(), null, u0.h(), ((Long)l0$h2.a), ((Long)l0$h0.a), ((Long)l0$h1.a), null, 0x80, null);
    }

    private static final h k(n n0, h h0) throws IOException {
        n0.skip(12L);
        int v = n0.H3();
        int v1 = n0.H3();
        long v2 = n0.r0();
        if(v2 != n0.r0() || v != 0 || v1 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        n0.skip(8L);
        return new h(v2, n0.r0(), h0.b());
    }

    public static final void l(@y4.l n n0) {
        L.p(n0, "<this>");
        l.j(n0, null);
    }
}

