package kotlinx.coroutines.debug.internal;

import A3.o;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.S0;
import kotlin.V;
import kotlin.b0;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.ranges.s;
import kotlin.sequences.p;
import kotlin.text.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.internal.Q;
import y4.l;
import z3.f;
import z3.i;

@b0
@s0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,616:1\n146#1:634\n147#1,4:636\n152#1,5:641\n146#1:646\n147#1,4:648\n152#1,5:653\n1#2:617\n1#2:635\n1#2:647\n766#3:618\n857#3,2:619\n1208#3,2:621\n1238#3,4:623\n1855#3,2:661\n350#3,7:669\n1819#3,8:676\n603#4:627\n603#4:640\n603#4:652\n603#4:658\n1313#4,2:659\n37#5,2:628\n37#5,2:630\n37#5,2:632\n1627#6,6:663\n1735#6,6:684\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n241#1:634\n241#1:636,4\n241#1:641,5\n248#1:646\n248#1:648,4\n248#1:653,5\n241#1:635\n248#1:647\n106#1:618\n106#1:619,2\n107#1:621,2\n107#1:623,4\n303#1:661,2\n412#1:669,7\n502#1:676,8\n150#1:627\n241#1:640\n248#1:652\n283#1:658\n284#1:659,2\n207#1:628,2\n208#1:630,2\n209#1:632,2\n351#1:663,6\n554#1:684,6\n*E\n"})
public final class g {
    public static final class a implements d, e {
        @l
        @f
        public final d a;
        @l
        @f
        public final kotlinx.coroutines.debug.internal.e b;

        public a(@l d d0, @l kotlinx.coroutines.debug.internal.e e0) {
            this.a = d0;
            this.b = e0;
        }

        private final m a() {
            return this.b.d();
        }

        @Override  // kotlin.coroutines.jvm.internal.e
        @y4.m
        public e getCallerFrame() {
            m m0 = this.a();
            return m0 == null ? null : m0.getCallerFrame();
        }

        @Override  // kotlin.coroutines.d
        @l
        public kotlin.coroutines.g getContext() {
            return this.a.getContext();
        }

        @Override  // kotlin.coroutines.jvm.internal.e
        @y4.m
        public StackTraceElement getStackTraceElement() {
            m m0 = this.a();
            return m0 == null ? null : m0.getStackTraceElement();
        }

        @Override  // kotlin.coroutines.d
        public void resumeWith(@l Object object0) {
            g.a.G(this);
            this.a.resumeWith(object0);
        }

        @Override
        @l
        public String toString() {
            return this.a.toString();
        }
    }

    final class b {
        private static final AtomicIntegerFieldUpdater a;
        private static final AtomicLongFieldUpdater b;
        private volatile int installations$volatile;
        private volatile long sequenceNumber$volatile;

        static {
            b.a = AtomicIntegerFieldUpdater.newUpdater(b.class, "installations$volatile");
            b.b = AtomicLongFieldUpdater.newUpdater(b.class, "sequenceNumber$volatile");
        }

        private b() {
            super();
        }

        public b(w w0) {
        }

        private final int c() {
            return this.installations$volatile;
        }

        private final long e() {
            return this.sequenceNumber$volatile;
        }

        private final void g(int v) {
            this.installations$volatile = v;
        }

        private final void h(long v) {
            this.sequenceNumber$volatile = v;
        }
    }

    @l
    public static final g a;
    @l
    private static final StackTraceElement b;
    @l
    private static final SimpleDateFormat c;
    @y4.m
    private static Thread d;
    @l
    private static final kotlinx.coroutines.debug.internal.b e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    @y4.m
    private static final Function1 i;
    @l
    private static final kotlinx.coroutines.debug.internal.b j;
    private static final b k;

    static {
        g g0 = new g();
        g.a = g0;
        g.b = new _COROUTINE.a().b();
        g.c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        g.e = new kotlinx.coroutines.debug.internal.b(false, 1, null);
        g.f = true;
        g.h = true;
        g.i = g0.u();
        g.j = new kotlinx.coroutines.debug.internal.b(true);
        g.k = new b(null);
    }

    private final boolean A(a g$a0) {
        kotlin.coroutines.g g0 = g$a0.b.c();
        if(g0 != null) {
            I0 i00 = (I0)g0.get(I0.B8);
            if(i00 == null || !i00.k()) {
                return false;
            }
            g.e.remove(g$a0);
            return true;
        }
        return false;
    }

    @i(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean B() {
        return b.a.get(g.k) > 0;
    }

    private final boolean C(StackTraceElement stackTraceElement0) {
        return v.v2(stackTraceElement0.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final a D(d d0) {
        e e0 = d0 instanceof e ? ((e)d0) : null;
        return e0 == null ? null : this.E(e0);
    }

    private final a E(e e0) {
        do {
            if(e0 instanceof a) {
                return (a)e0;
            }
            e0 = e0.getCallerFrame();
        }
        while(e0 != null);
        return null;
    }

    private final void F(PrintStream printStream0, List list0) {
        for(Object object0: list0) {
            printStream0.print("\n\tat " + ((StackTraceElement)object0));
        }
    }

    private final void G(a g$a0) {
        g.e.remove(g$a0);
        e e0 = g$a0.b.f();
        if(e0 != null) {
            e e1 = this.K(e0);
            if(e1 != null) {
                g.j.remove(e1);
            }
        }
    }

    @l
    public final d H(@l d d0) {
        if(!this.B()) {
            return d0;
        }
        if(g.h && d0.getContext() == kotlin.coroutines.i.a) {
            return d0;
        }
        if(this.D(d0) != null) {
            return d0;
        }
        return g.g ? this.e(d0, this.R(this.L(new Exception()))) : this.e(d0, null);
    }

    public final void I(@l d d0) {
        this.V(d0, "RUNNING");
    }

    public final void J(@l d d0) {
        this.V(d0, "SUSPENDED");
    }

    private final e K(e e0) {
        do {
            e0 = e0.getCallerFrame();
            if(e0 == null) {
                return null;
            }
        }
        while(e0.getStackTraceElement() == null);
        return e0;
    }

    private final List L(Throwable throwable0) {
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        int v = -1;
        int v1 = arr_stackTraceElement.length - 1;
        if(v1 >= 0) {
            while(true) {
                if(L.g(arr_stackTraceElement[v1].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    v = v1;
                    break;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        int v2 = v + 1;
        if(!g.f) {
            int v3 = arr_stackTraceElement.length - v2;
            List list0 = new ArrayList(v3);
            for(int v4 = 0; v4 < v3; ++v4) {
                ((ArrayList)list0).add(arr_stackTraceElement[v4 + v2]);
            }
            return list0;
        }
        List list1 = new ArrayList(arr_stackTraceElement.length - v2 + 1);
        while(v2 < arr_stackTraceElement.length) {
            if(this.C(arr_stackTraceElement[v2])) {
                list1.add(arr_stackTraceElement[v2]);
                int v5;
                for(v5 = v2 + 1; v5 < arr_stackTraceElement.length && this.C(arr_stackTraceElement[v5]); ++v5) {
                }
                int v6;
                for(v6 = v5 - 1; v6 > v2 && arr_stackTraceElement[v6].getFileName() == null; --v6) {
                }
                if(v6 > v2 && v6 < v5 - 1) {
                    list1.add(arr_stackTraceElement[v6]);
                }
                list1.add(arr_stackTraceElement[v5 - 1]);
                v2 = v5;
            }
            else {
                list1.add(arr_stackTraceElement[v2]);
                ++v2;
            }
        }
        return list1;
    }

    public final void M(boolean z) {
        g.g = z;
    }

    public final void N(boolean z) {
        g.h = z;
    }

    public final void O(boolean z) {
        g.f = z;
    }

    private final void P() {
        static final class kotlinx.coroutines.debug.internal.g.i extends N implements A3.a {
            public static final kotlinx.coroutines.debug.internal.g.i e;

            static {
                kotlinx.coroutines.debug.internal.g.i.e = new kotlinx.coroutines.debug.internal.g.i();
            }

            kotlinx.coroutines.debug.internal.g.i() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                g.j.s();
            }
        }

        g.d = kotlin.concurrent.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, kotlinx.coroutines.debug.internal.g.i.e, 21, null);
    }

    private final void Q() {
        Thread thread0 = g.d;
        if(thread0 == null) {
            return;
        }
        g.d = null;
        thread0.interrupt();
        thread0.join();
    }

    private final m R(List list0) {
        e e0 = null;
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                e0 = new m(e0, ((StackTraceElement)listIterator0.previous()));
            }
        }
        return new m(e0, g.b);
    }

    private final String S(Object object0) {
        return h.b(object0.toString());
    }

    public final void T() {
        if(!this.B()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if(b.a.decrementAndGet(g.k) != 0) {
            return;
        }
        this.Q();
        g.e.clear();
        g.j.clear();
        Function1 function10 = g.i;
        if(function10 != null) {
            function10.invoke(Boolean.FALSE);
        }
    }

    private final void U(e e0, String s) {
        boolean z;
        if(!this.B()) {
            return;
        }
        kotlinx.coroutines.debug.internal.b b0 = g.j;
        kotlinx.coroutines.debug.internal.e e1 = (kotlinx.coroutines.debug.internal.e)b0.remove(e0);
        if(e1 == null) {
            a g$a0 = this.E(e0);
            if(g$a0 != null) {
                e1 = g$a0.b;
                if(e1 != null) {
                    e e2 = e1.f();
                    e e3 = e2 == null ? null : this.K(e2);
                    if(e3 != null) {
                        b0.remove(e3);
                    }
                    z = true;
                label_16:
                    L.n(e0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
                    e1.j(s, ((d)e0), z);
                    e e4 = this.K(e0);
                    if(e4 == null) {
                        return;
                    }
                    b0.put(e4, e1);
                }
            }
        }
        else {
            z = false;
            goto label_16;
        }
    }

    private final void V(d d0, String s) {
        if(!this.B()) {
            return;
        }
        if(g.h && d0.getContext() == kotlin.coroutines.i.a) {
            return;
        }
        if(L.g(s, "RUNNING")) {
            e e0 = d0 instanceof e ? ((e)d0) : null;
            if(e0 == null) {
                return;
            }
            this.U(e0, s);
            return;
        }
        a g$a0 = this.D(d0);
        if(g$a0 == null) {
            return;
        }
        this.W(g$a0, d0, s);
    }

    private final void W(a g$a0, d d0, String s) {
        if(!this.B()) {
            return;
        }
        g$a0.b.j(s, d0, true);
    }

    private final void d(I0 i00, Map map0, StringBuilder stringBuilder0, String s) {
        kotlinx.coroutines.debug.internal.e e0 = (kotlinx.coroutines.debug.internal.e)map0.get(i00);
        if(e0 != null) {
            StackTraceElement stackTraceElement0 = (StackTraceElement)u.G2(e0.h());
            stringBuilder0.append(s + this.s(i00) + ", continuation is " + e0.g() + " at line " + stackTraceElement0 + '\n');
            s = s + '\t';
        }
        else if(!(i00 instanceof Q)) {
            stringBuilder0.append(s + this.s(i00) + '\n');
            s = s + '\t';
        }
        for(Object object0: i00.u0()) {
            this.d(((I0)object0), map0, stringBuilder0, s);
        }
    }

    private final d e(d d0, m m0) {
        if(!this.B()) {
            return d0;
        }
        d d1 = new a(d0, new kotlinx.coroutines.debug.internal.e(d0.getContext(), m0, b.b.incrementAndGet(g.k)));
        kotlinx.coroutines.debug.internal.b b0 = g.e;
        b0.put(d1, Boolean.TRUE);
        if(!this.B()) {
            b0.clear();
        }
        return d1;
    }

    @i(name = "dumpCoroutines")
    public final void f(@l PrintStream printStream0) {
        synchronized(printStream0) {
            g.a.j(printStream0);
        }
    }

    @l
    public final List g() {
        @s0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n241#3:618\n*E\n"})
        public static final class c extends N implements Function1 {
            public c() {
                super(1);
            }

            @y4.m
            public final Object a(@l a g$a0) {
                if(!g.a.A(g$a0)) {
                    kotlin.coroutines.g g0 = g$a0.b.c();
                    return g0 == null ? null : new kotlinx.coroutines.debug.internal.d(g$a0.b, g0);
                }
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((a)object0));
            }
        }

        if(!this.B()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        return p.c3(p.p1(p.K2(u.A1(this.q()), new kotlinx.coroutines.debug.internal.g.d()), new c()));
    }

    @l
    public final Object[] h() {
        String s1;
        List list0 = this.g();
        int v = list0.size();
        ArrayList arrayList0 = new ArrayList(v);
        ArrayList arrayList1 = new ArrayList(v);
        ArrayList arrayList2 = new ArrayList(v);
        for(Object object0: list0) {
            kotlin.coroutines.g g0 = ((kotlinx.coroutines.debug.internal.d)object0).a();
            kotlinx.coroutines.N n0 = (kotlinx.coroutines.N)g0.get(kotlinx.coroutines.N.b);
            Long long0 = null;
            if(n0 == null) {
                s1 = null;
            }
            else {
                String s = n0.j1();
                if(s != null) {
                    s1 = this.S(s);
                }
            }
            K k0 = (K)g0.get(K.a);
            String s2 = k0 == null ? null : this.S(k0);
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("\n                {\n                    \"name\": ");
            stringBuilder0.append(s1);
            stringBuilder0.append(",\n                    \"id\": ");
            M m0 = (M)g0.get(M.b);
            if(m0 != null) {
                long0 = m0.j1();
            }
            stringBuilder0.append(long0);
            stringBuilder0.append(",\n                    \"dispatcher\": ");
            stringBuilder0.append(s2);
            stringBuilder0.append(",\n                    \"sequenceNumber\": ");
            stringBuilder0.append(((kotlinx.coroutines.debug.internal.d)object0).f());
            stringBuilder0.append(",\n                    \"state\": \"");
            stringBuilder0.append(((kotlinx.coroutines.debug.internal.d)object0).g());
            stringBuilder0.append("\"\n                } \n                ");
            arrayList2.add(v.p(stringBuilder0.toString()));
            arrayList1.add(((kotlinx.coroutines.debug.internal.d)object0).d());
            arrayList0.add(((kotlinx.coroutines.debug.internal.d)object0).e());
        }
        return new Object[]{'[' + u.m3(arrayList2, null, null, null, 0, null, null, 0x3F, null) + ']', arrayList0.toArray(new Thread[0]), arrayList1.toArray(new e[0]), list0.toArray(new kotlinx.coroutines.debug.internal.d[0])};
    }

    private final List i(o o0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n150#2:329\n*E\n"})
        public static final class kotlinx.coroutines.debug.internal.g.d implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((a)object0).b.b, ((a)object1).b.b);
            }
        }


        @s0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,616:1\n1#2:617\n*E\n"})
        public static final class kotlinx.coroutines.debug.internal.g.e extends N implements Function1 {
            final o e;

            public kotlinx.coroutines.debug.internal.g.e(o o0) {
                this.e = o0;
                super(1);
            }

            @y4.m
            public final Object a(@l a g$a0) {
                if(!g.a.A(g$a0)) {
                    kotlin.coroutines.g g0 = g$a0.b.c();
                    return g0 == null ? null : this.e.invoke(g$a0, g0);
                }
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((a)object0));
            }
        }

        if(!this.B()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        return p.c3(p.p1(p.K2(u.A1(this.q()), new kotlinx.coroutines.debug.internal.g.d()), new kotlinx.coroutines.debug.internal.g.e(o0)));
    }

    private final void j(PrintStream printStream0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n283#2:329\n*E\n"})
        public static final class kotlinx.coroutines.debug.internal.g.f implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((a)object0).b.b, ((a)object1).b.b);
            }
        }


        static final class kotlinx.coroutines.debug.internal.g.g extends N implements Function1 {
            public static final kotlinx.coroutines.debug.internal.g.g e;

            static {
                kotlinx.coroutines.debug.internal.g.g.e = new kotlinx.coroutines.debug.internal.g.g();
            }

            kotlinx.coroutines.debug.internal.g.g() {
                super(1);
            }

            @l
            public final Boolean a(@l a g$a0) {
                return Boolean.valueOf(!g.a.A(g$a0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((a)object0));
            }
        }

        if(!this.B()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream0.print("Coroutines dump 2025/09/06 02:29:19");
        for(Object object0: p.K2(p.p0(u.A1(this.q()), kotlinx.coroutines.debug.internal.g.g.e), new kotlinx.coroutines.debug.internal.g.f())) {
            kotlinx.coroutines.debug.internal.e e0 = ((a)object0).b;
            List list0 = e0.h();
            g g0 = g.a;
            List list1 = g0.n(e0.g(), e0.lastObservedThread, list0);
            String s = !L.g(e0.g(), "RUNNING") || list1 != list0 ? e0.g() : e0.g() + " (Last suspension stacktrace, not an actual stacktrace)";
            printStream0.print("\n\nCoroutine " + ((a)object0).a + ", state: " + s);
            if(list0.isEmpty()) {
                printStream0.print("\n\tat " + g.b);
                g0.F(printStream0, e0.e());
            }
            else {
                g0.F(printStream0, list1);
            }
        }
    }

    @l
    public final List k() {
        @s0({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n248#3:618\n*E\n"})
        public static final class kotlinx.coroutines.debug.internal.g.h extends N implements Function1 {
            public kotlinx.coroutines.debug.internal.g.h() {
                super(1);
            }

            @y4.m
            public final Object a(@l a g$a0) {
                if(!g.a.A(g$a0)) {
                    kotlin.coroutines.g g0 = g$a0.b.c();
                    return g0 == null ? null : new j(g$a0.b, g0);
                }
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((a)object0));
            }
        }

        if(!this.B()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        return p.c3(p.p1(p.K2(u.A1(this.q()), new kotlinx.coroutines.debug.internal.g.d()), new kotlinx.coroutines.debug.internal.g.h()));
    }

    @l
    public final List l(@l kotlinx.coroutines.debug.internal.d d0, @l List list0) {
        return this.n(d0.g(), d0.e(), list0);
    }

    @l
    public final String m(@l kotlinx.coroutines.debug.internal.d d0) {
        List list0 = this.l(d0, d0.h());
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s = ((StackTraceElement)object0).getFileName();
            arrayList0.add(v.p(("\n                {\n                    \"declaringClass\": \"" + ((StackTraceElement)object0).getClassName() + "\",\n                    \"methodName\": \"" + ((StackTraceElement)object0).getMethodName() + "\",\n                    \"fileName\": " + (s == null ? null : this.S(s)) + ",\n                    \"lineNumber\": " + ((StackTraceElement)object0).getLineNumber() + "\n                }\n                ")));
        }
        return '[' + u.m3(arrayList0, null, null, null, 0, null, null, 0x3F, null) + ']';
    }

    private final List n(String s, Thread thread0, List list0) {
        Object object0;
        if(L.g(s, "RUNNING") && thread0 != null) {
            try {
                object0 = e0.b(thread0.getStackTrace());
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            if(e0.i(object0)) {
                object0 = null;
            }
            if(((StackTraceElement[])object0) == null) {
                return list0;
            }
            int v1;
            for(v1 = 0; true; ++v1) {
                if(v1 >= ((StackTraceElement[])object0).length) {
                    v1 = -1;
                    break;
                }
                StackTraceElement stackTraceElement0 = ((StackTraceElement[])object0)[v1];
                if(L.g(stackTraceElement0.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && L.g(stackTraceElement0.getMethodName(), "resumeWith") && L.g(stackTraceElement0.getFileName(), "ContinuationImpl.kt")) {
                    break;
                }
            }
            V v2 = this.o(v1, ((StackTraceElement[])object0), list0);
            int v3 = ((Number)v2.a()).intValue();
            int v4 = ((Number)v2.b()).intValue();
            if(v3 == -1) {
                return list0;
            }
            List list1 = new ArrayList(list0.size() + v1 - v3 - 1 - v4);
            for(int v = 0; v < v1 - v4; ++v) {
                list1.add(((StackTraceElement[])object0)[v]);
            }
            int v5 = v3 + 1;
            int v6 = list0.size();
            while(v5 < v6) {
                list1.add(list0.get(v5));
                ++v5;
            }
            return list1;
        }
        return list0;
    }

    private final V o(int v, StackTraceElement[] arr_stackTraceElement, List list0) {
        for(int v1 = 0; v1 < 3; ++v1) {
            int v2 = g.a.p(v - 1 - v1, arr_stackTraceElement, list0);
            if(v2 != -1) {
                return r0.a(v2, v1);
            }
        }
        return r0.a(-1, 0);
    }

    private final int p(int v, StackTraceElement[] arr_stackTraceElement, List list0) {
        StackTraceElement stackTraceElement0 = (StackTraceElement)kotlin.collections.l.Pe(arr_stackTraceElement, v);
        if(stackTraceElement0 == null) {
            return -1;
        }
        int v1 = 0;
        for(Object object0: list0) {
            StackTraceElement stackTraceElement1 = (StackTraceElement)object0;
            if(L.g(stackTraceElement1.getFileName(), stackTraceElement0.getFileName()) && L.g(stackTraceElement1.getClassName(), stackTraceElement0.getClassName()) && L.g(stackTraceElement1.getMethodName(), stackTraceElement0.getMethodName())) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    private final Set q() {
        return g.e.keySet();
    }

    // 去混淆评级： 低(20)
    private final String s(I0 i00) {
        return i00 instanceof Q0 ? ((Q0)i00).F1() : i00.toString();
    }

    private static void t(I0 i00) {
    }

    private final Function1 u() {
        Object object2;
        Object object0 = null;
        try {
            Object object1 = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            L.n(object1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            object2 = e0.b(((Function1)v0.q(object1, 1)));
        }
        catch(Throwable throwable0) {
            object2 = e0.b(f0.a(throwable0));
        }
        if(!e0.i(object2)) {
            object0 = object2;
        }
        return (Function1)object0;
    }

    public final boolean v() [...] // 潜在的解密器

    public final boolean w() {
        return g.h;
    }

    public final boolean x() {
        return g.f;
    }

    @l
    public final String y(@l I0 i00) {
        if(!this.B()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set set0 = this.q();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: set0) {
            if(((a)object0).a.getContext().get(I0.B8) != null) {
                arrayList0.add(object0);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(s.u(Y.j(u.b0(arrayList0, 10)), 16));
        for(Object object1: arrayList0) {
            linkedHashMap0.put(M0.B(((a)object1).a.getContext()), ((a)object1).b);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        g.a.d(i00, linkedHashMap0, stringBuilder0, "");
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    public final void z() {
        if(b.a.incrementAndGet(g.k) > 1) {
            return;
        }
        this.P();
        Function1 function10 = g.i;
        if(function10 != null) {
            function10.invoke(Boolean.TRUE);
        }
    }
}

