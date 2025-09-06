package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.internal.b;
import kotlinx.coroutines.flow.internal.r;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,741:1\n24#2,4:742\n24#2,4:748\n24#2,4:770\n24#2,4:777\n24#2,4:789\n24#2,4:803\n24#2,4:817\n16#3:746\n16#3:752\n16#3:774\n16#3:781\n16#3:793\n16#3:807\n16#3:821\n326#4:747\n1#5:753\n90#6,2:754\n92#6,2:757\n94#6:760\n90#6,2:782\n92#6,2:785\n94#6:788\n90#6,2:810\n92#6,2:813\n94#6:816\n13309#7:756\n13310#7:759\n13309#7:784\n13310#7:787\n13309#7:812\n13310#7:815\n318#8,9:761\n327#8,2:775\n318#8,9:794\n327#8,2:808\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n361#1:742,4\n401#1:748,4\n495#1:770,4\n516#1:777,4\n636#1:789,4\n671#1:803,4\n699#1:817,4\n361#1:746\n401#1:752\n495#1:774\n516#1:781\n636#1:793\n671#1:807\n699#1:821\n383#1:747\n463#1:754,2\n463#1:757,2\n463#1:760\n539#1:782,2\n539#1:785,2\n539#1:788\n686#1:810,2\n686#1:813,2\n686#1:816\n463#1:756\n463#1:759\n539#1:784\n539#1:787\n686#1:812\n686#1:815\n493#1:761,9\n493#1:775,2\n670#1:794,9\n670#1:808,2\n*E\n"})
public class J extends b implements D, c, r {
    static final class a implements k0 {
        @l
        @f
        public final J a;
        @f
        public long b;
        @m
        @f
        public final Object c;
        @l
        @f
        public final d d;

        public a(@l J j0, long v, @m Object object0, @l d d0) {
            this.a = j0;
            this.b = v;
            this.c = object0;
            this.d = d0;
        }

        @Override  // kotlinx.coroutines.k0
        public void dispose() {
            this.a.B(this);
        }
    }

    public final class kotlinx.coroutines.flow.J.b {
        public static final int[] a;

        static {
            int[] arr_v = new int[i.values().length];
            try {
                arr_v[i.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[i.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[i.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            kotlinx.coroutines.flow.J.b.a = arr_v;
        }
    }

    private final int e;
    private final int f;
    @l
    private final i g;
    @m
    private Object[] h;
    private long i;
    private long j;
    private int k;
    private int l;

    public J(int v, int v1, @l i i0) {
        this.e = v;
        this.f = v1;
        this.g = i0;
    }

    private final Object A(L l0, d d0) {
        S0 s00;
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        synchronized(this) {
            if(this.X(l0) < 0L) {
                l0.b = p0;
            }
            else {
                p0.resumeWith(S0.a);
            }
            s00 = S0.a;
        }
        Object object0 = p0.x();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : s00;
    }

    // 检测为 Lambda 实现
    private final void B(a j$a0) [...]

    private final void C() {
        if(this.f == 0 && this.l <= 1) {
            return;
        }
        Object[] arr_object = this.h;
        kotlin.jvm.internal.L.m(arr_object);
        while(this.l > 0 && K.f(arr_object, this.N() + ((long)this.T()) - 1L) == K.a) {
            --this.l;
            K.g(arr_object, this.N() + ((long)this.T()), null);
        }
    }

    static Object D(J j0, j j1, d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
        static final class kotlinx.coroutines.flow.J.c extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            final J p;
            int q;

            kotlinx.coroutines.flow.J.c(J j0, d d0) {
                this.p = j0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.q |= 0x80000000;
                return J.D(this.p, null, this);
            }
        }

        j j6;
        I0 i01;
        I0 i00;
        Throwable throwable1;
        J j3;
        L l1;
        j j2;
        kotlinx.coroutines.flow.J.c j$c0;
        if(d0 instanceof kotlinx.coroutines.flow.J.c) {
            j$c0 = (kotlinx.coroutines.flow.J.c)d0;
            int v = j$c0.q;
            if((v & 0x80000000) == 0) {
                j$c0 = new kotlinx.coroutines.flow.J.c(j0, d0);
            }
            else {
                j$c0.q = v ^ 0x80000000;
            }
        }
        else {
            j$c0 = new kotlinx.coroutines.flow.J.c(j0, d0);
        }
        Object object0 = j$c0.o;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(j$c0.q) {
            case 0: {
                f0.n(object0);
                L l0 = (L)j0.h();
                try {
                    if(j1 instanceof Y) {
                        j$c0.k = j0;
                        j$c0.l = j1;
                        j$c0.m = l0;
                        j$c0.q = 1;
                        if(((Y)j1).a(j$c0) == object1) {
                            return object1;
                        }
                    }
                    j2 = j1;
                    l1 = l0;
                    i00 = (I0)j$c0.getContext().get(I0.B8);
                    goto label_58;
                }
                catch(Throwable throwable0) {
                    j3 = j0;
                    throwable1 = throwable0;
                    l1 = l0;
                    j3.l(l1);
                    throw throwable1;
                }
            }
            case 1: {
                l1 = (L)j$c0.m;
                j j4 = (j)j$c0.l;
                J j5 = (J)j$c0.k;
                try {
                    f0.n(object0);
                    j2 = j4;
                    j0 = j5;
                }
                catch(Throwable throwable1) {
                    j3 = j5;
                    j3.l(l1);
                    throw throwable1;
                }
                try {
                    i00 = (I0)j$c0.getContext().get(I0.B8);
                    goto label_58;
                }
                catch(Throwable throwable2) {
                    j3 = j0;
                    throwable1 = throwable2;
                    j3.l(l1);
                    throw throwable1;
                }
            }
            case 2: {
                i01 = (I0)j$c0.n;
                l1 = (L)j$c0.m;
                j6 = (j)j$c0.l;
                j3 = (J)j$c0.k;
                break;
            }
            case 3: {
                i01 = (I0)j$c0.n;
                l1 = (L)j$c0.m;
                j6 = (j)j$c0.l;
                j3 = (J)j$c0.k;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            f0.n(object0);
            j2 = j6;
            i00 = i01;
            j0 = j3;
        }
        catch(Throwable throwable1) {
            j3.l(l1);
            throw throwable1;
        }
        try {
            do {
                while(true) {
                label_58:
                    Object object2 = j0.Y(l1);
                    if(object2 != K.a) {
                        break;
                    }
                    j$c0.k = j0;
                    j$c0.l = j2;
                    j$c0.m = l1;
                    j$c0.n = i00;
                    j$c0.q = 2;
                    if(j0.A(l1, j$c0) == object1) {
                        return object1;
                    }
                }
                if(i00 != null) {
                    M0.A(i00);
                }
                j$c0.k = j0;
                j$c0.l = j2;
                j$c0.m = l1;
                j$c0.n = i00;
                j$c0.q = 3;
            }
            while(j2.emit(object2, j$c0) != object1);
            return object1;
        }
        catch(Throwable throwable2) {
            j3 = j0;
            throwable1 = throwable2;
        }
        j3.l(l1);
        throw throwable1;
    }

    private final void E(long v) {
        if(this.b != 0) {
            kotlinx.coroutines.flow.internal.d[] arr_d = this.a;
            if(arr_d != null) {
                for(int v1 = 0; v1 < arr_d.length; ++v1) {
                    kotlinx.coroutines.flow.internal.d d0 = arr_d[v1];
                    if(d0 != null) {
                        long v2 = ((L)d0).a;
                        if(v2 >= 0L && v2 < v) {
                            ((L)d0).a = v;
                        }
                    }
                }
            }
        }
        this.j = v;
    }

    @l
    protected L F() {
        return new L();
    }

    @l
    protected L[] G(int v) {
        return new L[v];
    }

    private final void H() {
        Object[] arr_object = this.h;
        kotlin.jvm.internal.L.m(arr_object);
        K.g(arr_object, this.N(), null);
        --this.k;
        long v = this.N();
        if(this.i < v + 1L) {
            this.i = v + 1L;
        }
        if(this.j < v + 1L) {
            this.E(v + 1L);
        }
    }

    static Object I(J j0, Object object0, d d0) {
        if(j0.d(object0)) {
            return S0.a;
        }
        Object object1 = j0.J(object0, d0);
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    private final Object J(Object object0, d d0) {
        a j$a0;
        d[] arr_d1;
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        d[] arr_d = kotlinx.coroutines.flow.internal.c.a;
        synchronized(this) {
            if(this.V(object0)) {
                p0.resumeWith(S0.a);
                arr_d1 = this.L(arr_d);
                j$a0 = null;
            }
            else {
                a j$a1 = () -> synchronized(this) {
                    if(this.b < this.N()) {
                        return;
                    }
                    Object[] arr_object = this.h;
                    kotlin.jvm.internal.L.m(arr_object);
                    if(K.f(arr_object, this.b) != this) {
                        return;
                    }
                    K.g(arr_object, this.b, K.a);
                    this.C();
                };
                this.K(j$a1);
                ++this.l;
                if(this.f == 0) {
                    arr_d = this.L(arr_d);
                }
                arr_d1 = arr_d;
                j$a0 = j$a1;
            }
        }
        if(j$a0 != null) {
            kotlinx.coroutines.r.a(p0, j$a0);
        }
        for(int v1 = 0; v1 < arr_d1.length; ++v1) {
            d d1 = arr_d1[v1];
            if(d1 != null) {
                d1.resumeWith(S0.a);
            }
        }
        Object object1 = p0.x();
        if(object1 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    private final void K(Object object0) {
        int v = this.T();
        Object[] arr_object = this.h;
        if(arr_object == null) {
            arr_object = this.U(null, 0, 2);
        }
        else if(v >= arr_object.length) {
            arr_object = this.U(arr_object, v, arr_object.length * 2);
        }
        K.g(arr_object, this.N() + ((long)v), object0);
    }

    private final d[] L(d[] arr_d) {
        int v = arr_d.length;
        if(this.b != 0) {
            kotlinx.coroutines.flow.internal.d[] arr_d1 = this.a;
            if(arr_d1 != null) {
                for(int v1 = 0; v1 < arr_d1.length; ++v1) {
                    kotlinx.coroutines.flow.internal.d d0 = arr_d1[v1];
                    if(d0 != null) {
                        d d1 = ((L)d0).b;
                        if(d1 != null && this.X(((L)d0)) >= 0L) {
                            if(v >= arr_d.length) {
                                arr_d = Arrays.copyOf(arr_d, Math.max(2, arr_d.length * 2));
                                kotlin.jvm.internal.L.o(arr_d, "copyOf(...)");
                            }
                            arr_d[v] = d1;
                            ((L)d0).b = null;
                            ++v;
                        }
                    }
                }
            }
        }
        return arr_d;
    }

    private final long M() {
        return this.N() + ((long)this.k);
    }

    private final long N() {
        return Math.min(this.j, this.i);
    }

    protected final Object O() {
        Object[] arr_object = this.h;
        kotlin.jvm.internal.L.m(arr_object);
        return K.f(arr_object, this.i + ((long)this.S()) - 1L);
    }

    protected static void P() {
    }

    private final Object Q(long v) {
        Object[] arr_object = this.h;
        kotlin.jvm.internal.L.m(arr_object);
        Object object0 = K.f(arr_object, v);
        return object0 instanceof a ? ((a)object0).c : object0;
    }

    private final long R() {
        return this.N() + ((long)this.k) + ((long)this.l);
    }

    private final int S() {
        return (int)(this.N() + ((long)this.k) - this.i);
    }

    private final int T() {
        return this.k + this.l;
    }

    private final Object[] U(Object[] arr_object, int v, int v1) {
        if(v1 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] arr_object1 = new Object[v1];
        this.h = arr_object1;
        if(arr_object == null) {
            return arr_object1;
        }
        long v2 = this.N();
        for(int v3 = 0; v3 < v; ++v3) {
            long v4 = ((long)v3) + v2;
            K.g(arr_object1, v4, K.f(arr_object, v4));
        }
        return arr_object1;
    }

    private final boolean V(Object object0) {
        if(this.m() == 0) {
            return this.W(object0);
        }
        if(this.k >= this.f && this.j <= this.i) {
            switch(this.g) {
                case 1: {
                    return false;
                }
                case 2: {
                    return true;
                }
            }
        }
        this.K(object0);
        int v = this.k + 1;
        this.k = v;
        if(v > this.f) {
            this.H();
        }
        if(this.S() > this.e) {
            this.Z(this.i + 1L, this.j, this.M(), this.R());
        }
        return true;
    }

    private final boolean W(Object object0) {
        if(this.e == 0) {
            return true;
        }
        this.K(object0);
        int v = this.k + 1;
        this.k = v;
        if(v > this.e) {
            this.H();
        }
        this.j = this.N() + ((long)this.k);
        return true;
    }

    private final long X(L l0) {
        long v = l0.a;
        if(v < this.M()) {
            return v;
        }
        if(this.f > 0) {
            return -1L;
        }
        if(v > this.N()) {
            return -1L;
        }
        return this.l == 0 ? -1L : v;
    }

    private final Object Y(L l0) {
        V v2;
        d[] arr_d = kotlinx.coroutines.flow.internal.c.a;
        synchronized(this) {
            long v1 = this.X(l0);
            if(v1 < 0L) {
                v2 = K.a;
            }
            else {
                long v3 = l0.a;
                Object object0 = this.Q(v1);
                l0.a = v1 + 1L;
                arr_d = this.a0(v3);
                v2 = object0;
            }
        }
        for(int v4 = 0; v4 < arr_d.length; ++v4) {
            d d0 = arr_d[v4];
            if(d0 != null) {
                d0.resumeWith(S0.a);
            }
        }
        return v2;
    }

    private final void Z(long v, long v1, long v2, long v3) {
        long v4 = Math.min(v1, v);
        for(long v5 = this.N(); v5 < v4; ++v5) {
            Object[] arr_object = this.h;
            kotlin.jvm.internal.L.m(arr_object);
            K.g(arr_object, v5, null);
        }
        this.i = v;
        this.j = v1;
        this.k = (int)(v2 - v4);
        this.l = (int)(v3 - v2);
    }

    @Override  // kotlinx.coroutines.flow.I
    @l
    public List a() {
        synchronized(this) {
            int v1 = this.S();
            if(v1 == 0) {
                return u.H();
            }
            List list1 = new ArrayList(v1);
            Object[] arr_object = this.h;
            kotlin.jvm.internal.L.m(arr_object);
            for(int v2 = 0; v2 < v1; ++v2) {
                list1.add(K.f(arr_object, this.i + ((long)v2)));
            }
            return list1;
        }
    }

    @l
    public final d[] a0(long v) {
        long v12;
        long v10;
        if(v > this.j) {
            return kotlinx.coroutines.flow.internal.c.a;
        }
        long v1 = this.N();
        long v2 = this.f != 0 || this.l <= 0 ? ((long)this.k) + v1 : ((long)this.k) + v1 + 1L;
        if(this.b != 0) {
            kotlinx.coroutines.flow.internal.d[] arr_d = this.a;
            if(arr_d != null) {
                for(int v3 = 0; v3 < arr_d.length; ++v3) {
                    kotlinx.coroutines.flow.internal.d d0 = arr_d[v3];
                    if(d0 != null) {
                        long v4 = ((L)d0).a;
                        if(v4 >= 0L && v4 < v2) {
                            v2 = v4;
                        }
                    }
                }
            }
        }
        if(v2 <= this.j) {
            return kotlinx.coroutines.flow.internal.c.a;
        }
        long v5 = this.M();
        int v6 = this.m() <= 0 ? this.l : Math.min(this.l, this.f - ((int)(v5 - v2)));
        d[] arr_d1 = kotlinx.coroutines.flow.internal.c.a;
        long v7 = ((long)this.l) + v5;
        if(v6 > 0) {
            arr_d1 = new d[v6];
            Object[] arr_object = this.h;
            kotlin.jvm.internal.L.m(arr_object);
            long v8 = v5;
            int v9 = 0;
            while(true) {
                if(v5 >= v7) {
                    v10 = v2;
                    v12 = v7;
                    break;
                }
                Object object0 = K.f(arr_object, v5);
                v10 = v2;
                V v11 = K.a;
                if(object0 == v11) {
                    v12 = v7;
                }
                else {
                    kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    v12 = v7;
                    arr_d1[v9] = ((a)object0).d;
                    K.g(arr_object, v5, v11);
                    K.g(arr_object, v8, ((a)object0).c);
                    ++v8;
                    if(v9 + 1 >= v6) {
                        break;
                    }
                    ++v9;
                }
                ++v5;
                v2 = v10;
                v7 = v12;
            }
            v5 = v8;
        }
        else {
            v10 = v2;
            v12 = v7;
        }
        long v13 = this.m() == 0 ? v5 : v10;
        long v14 = Math.max(this.i, v5 - ((long)Math.min(this.e, ((int)(v5 - v1)))));
        if(this.f == 0 && v14 < v12) {
            Object[] arr_object1 = this.h;
            kotlin.jvm.internal.L.m(arr_object1);
            if(kotlin.jvm.internal.L.g(K.f(arr_object1, v14), K.a)) {
                ++v5;
                ++v14;
            }
        }
        this.Z(v14, v13, v5, v12);
        this.C();
        return arr_d1.length == 0 ? arr_d1 : this.L(arr_d1);
    }

    @Override  // kotlinx.coroutines.flow.D
    public void b() {
        synchronized(this) {
            this.Z(this.M(), this.j, this.M(), this.R());
        }
    }

    public final long b0() {
        long v = this.i;
        if(v < this.j) {
            this.j = v;
        }
        return v;
    }

    @Override  // kotlinx.coroutines.flow.internal.r
    @l
    public kotlinx.coroutines.flow.i c(@l g g0, int v, @l i i0) {
        return K.e(this, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.I, kotlinx.coroutines.flow.i
    @m
    public Object collect(@l j j0, @l d d0) {
        return J.D(this, j0, d0);
    }

    @Override  // kotlinx.coroutines.flow.D
    public boolean d(Object object0) {
        boolean z;
        d[] arr_d = kotlinx.coroutines.flow.internal.c.a;
        synchronized(this) {
            if(this.V(object0)) {
                arr_d = this.L(arr_d);
                z = true;
            }
            else {
                z = false;
            }
        }
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            if(d0 != null) {
                d0.resumeWith(S0.a);
            }
        }
        return z;
    }

    @Override  // kotlinx.coroutines.flow.D
    @m
    public Object emit(Object object0, @l d d0) {
        return J.I(this, object0, d0);
    }

    @Override  // kotlinx.coroutines.flow.internal.b
    public kotlinx.coroutines.flow.internal.d i() {
        return this.F();
    }

    @Override  // kotlinx.coroutines.flow.internal.b
    public kotlinx.coroutines.flow.internal.d[] j(int v) {
        return this.G(v);
    }

    public static final Object o(J j0, L l0, d d0) {
        return j0.A(l0, d0);
    }

    public static final Object q(J j0, Object object0, d d0) {
        return j0.J(object0, d0);
    }
}

