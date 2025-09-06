package androidx.compose.runtime.snapshots;

import A3.a;
import A3.o;
import androidx.compose.runtime.SnapshotThreadLocal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.S0;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.y;
import y4.l;

@s0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#1:2192\n1686#1:2195\n1686#1:2197\n1686#1:2199\n1686#1:2207\n1686#1:2211\n1686#1:2214\n1686#1:2216\n1686#1:2218\n1686#1:2220\n1686#1:2222\n1686#1:2224\n70#2:2193\n70#2:2194\n70#2:2196\n70#2:2198\n70#2:2200\n70#2:2208\n70#2:2212\n70#2:2215\n70#2:2217\n70#2:2219\n70#2:2221\n70#2:2223\n70#2:2225\n33#3,6:2201\n1855#4,2:2209\n1#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n596#1:2192\n1739#1:2195\n1757#1:2197\n1766#1:2199\n1772#1:2207\n1841#1:2211\n1985#1:2214\n1994#1:2216\n2062#1:2218\n2074#1:2220\n2102#1:2222\n2167#1:2224\n596#1:2193\n1686#1:2194\n1739#1:2196\n1757#1:2198\n1766#1:2200\n1772#1:2208\n1841#1:2212\n1985#1:2215\n1994#1:2217\n2062#1:2219\n2074#1:2221\n2102#1:2223\n2167#1:2225\n1767#1:2201,6\n1773#1:2209,2\n*E\n"})
public final class SnapshotKt {
    @l
    private static final Function1 a;
    private static final int b;
    @l
    private static final SnapshotThreadLocal c;
    @l
    private static final Object d;
    @l
    private static SnapshotIdSet e;
    private static int f;
    @l
    private static final SnapshotDoubleIndexHeap g;
    @l
    private static final List h;
    @l
    private static final List i;
    @l
    private static final AtomicReference j;
    @l
    private static final Snapshot k;

    static {
        SnapshotKt.a = SnapshotKt.emptyLambda.1.e;
        SnapshotKt.c = new SnapshotThreadLocal();
        SnapshotKt.d = new Object();
        SnapshotKt.e = SnapshotIdSet.e.a();
        SnapshotKt.f = 1;
        SnapshotKt.g = new SnapshotDoubleIndexHeap();
        SnapshotKt.h = new ArrayList();
        SnapshotKt.i = new ArrayList();
        SnapshotKt.f = 3;
        GlobalSnapshot globalSnapshot0 = new GlobalSnapshot(2, SnapshotIdSet.e.a());
        SnapshotKt.e = SnapshotKt.e.p(globalSnapshot0.g());
        AtomicReference atomicReference0 = new AtomicReference(globalSnapshot0);
        SnapshotKt.j = atomicReference0;
        Object object0 = atomicReference0.get();
        L.o(object0, "currentGlobalSnapshot.get()");
        SnapshotKt.k = (Snapshot)object0;
    }

    static Snapshot A(Snapshot snapshot0, Function1 function10, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        return SnapshotKt.z(snapshot0, function10, z);
    }

    @b0
    @l
    public static final StateRecord B(@l StateRecord stateRecord0) {
        StateRecord stateRecord2;
        L.p(stateRecord0, "r");
        Companion snapshot$Companion0 = Snapshot.e;
        Snapshot snapshot0 = snapshot$Companion0.b();
        StateRecord stateRecord1 = SnapshotKt.U(stateRecord0, snapshot0.g(), snapshot0.h());
        if(stateRecord1 == null) {
            synchronized(SnapshotKt.E()) {
                Snapshot snapshot1 = snapshot$Companion0.b();
                stateRecord2 = SnapshotKt.U(stateRecord0, snapshot1.g(), snapshot1.h());
            }
            if(stateRecord2 != null) {
                return stateRecord2;
            }
            SnapshotKt.T();
            throw new y();
        }
        return stateRecord1;
    }

    @b0
    @l
    public static final StateRecord C(@l StateRecord stateRecord0, @l Snapshot snapshot0) {
        L.p(stateRecord0, "r");
        L.p(snapshot0, "snapshot");
        StateRecord stateRecord1 = SnapshotKt.U(stateRecord0, snapshot0.g(), snapshot0.h());
        if(stateRecord1 != null) {
            return stateRecord1;
        }
        SnapshotKt.T();
        throw new y();
    }

    @l
    public static final Snapshot D() {
        Snapshot snapshot0 = (Snapshot)SnapshotKt.c.a();
        if(snapshot0 == null) {
            Object object0 = SnapshotKt.j.get();
            L.o(object0, "currentGlobalSnapshot.get()");
            return (Snapshot)object0;
        }
        return snapshot0;
    }

    @l
    public static final Object E() {
        return SnapshotKt.d;
    }

    @b0
    public static void F() {
    }

    @l
    public static final Snapshot G() {
        return SnapshotKt.k;
    }

    @b0
    public static void H() {
    }

    private static final Function1 I(Function1 function10, Function1 function11, boolean z) {
        if(!z) {
            function11 = null;
        }
        if(function10 != null && function11 != null && !L.g(function10, function11)) {
            return new Function1(function10, function11) {
                final Function1 e;
                final Function1 f;

                {
                    this.e = function10;
                    this.f = function11;
                    super(1);
                }

                public final void a(@l Object object0) {
                    L.p(object0, "state");
                    this.e.invoke(object0);
                    this.f.invoke(object0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(object0);
                    return S0.a;
                }
            };
        }
        return function10 == null ? function11 : function10;
    }

    static Function1 J(Function1 function10, Function1 function11, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        return SnapshotKt.I(function10, function11, z);
    }

    private static final Function1 K(Function1 function10, Function1 function11) {
        if(function10 != null && function11 != null && !L.g(function10, function11)) {
            return new Function1(function10, function11) {
                final Function1 e;
                final Function1 f;

                {
                    this.e = function10;
                    this.f = function11;
                    super(1);
                }

                public final void a(@l Object object0) {
                    L.p(object0, "state");
                    this.e.invoke(object0);
                    this.f.invoke(object0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(object0);
                    return S0.a;
                }
            };
        }
        return function10 == null ? function11 : function10;
    }

    @l
    public static final StateRecord L(@l StateRecord stateRecord0, @l StateObject stateObject0) {
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        StateRecord stateRecord1 = SnapshotKt.d0(stateObject0);
        if(stateRecord1 != null) {
            stateRecord1.f(0x7FFFFFFF);
            return stateRecord1;
        }
        stateRecord1 = stateRecord0.b();
        stateRecord1.f(0x7FFFFFFF);
        stateRecord1.e(stateObject0.h());
        L.n(stateRecord1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$13");
        stateObject0.d(stateRecord1);
        L.n(stateRecord1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return stateRecord1;
    }

    @l
    public static final StateRecord M(@l StateRecord stateRecord0, @l StateObject stateObject0, @l Snapshot snapshot0) {
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        L.p(snapshot0, "snapshot");
        synchronized(SnapshotKt.E()) {
            return SnapshotKt.N(stateRecord0, stateObject0, snapshot0);
        }
    }

    private static final StateRecord N(StateRecord stateRecord0, StateObject stateObject0, Snapshot snapshot0) {
        StateRecord stateRecord1 = SnapshotKt.L(stateRecord0, stateObject0);
        stateRecord1.a(stateRecord0);
        stateRecord1.f(snapshot0.g());
        return stateRecord1;
    }

    @b0
    public static final void O(@l Snapshot snapshot0, @l StateObject stateObject0) {
        L.p(snapshot0, "snapshot");
        L.p(stateObject0, "state");
        Function1 function10 = snapshot0.m();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
    }

    private static final Map P(MutableSnapshot mutableSnapshot0, MutableSnapshot mutableSnapshot1, SnapshotIdSet snapshotIdSet0) {
        Set set0 = mutableSnapshot1.i();
        int v = mutableSnapshot0.g();
        if(set0 == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSet1 = mutableSnapshot1.h().p(mutableSnapshot1.g()).o(mutableSnapshot1.L());
        Map map0 = null;
        for(Object object0: set0) {
            StateObject stateObject0 = (StateObject)object0;
            StateRecord stateRecord0 = stateObject0.h();
            StateRecord stateRecord1 = SnapshotKt.U(stateRecord0, v, snapshotIdSet0);
            if(stateRecord1 == null) {
                continue;
            }
            StateRecord stateRecord2 = SnapshotKt.U(stateRecord0, v, snapshotIdSet1);
            if(stateRecord2 == null || L.g(stateRecord1, stateRecord2)) {
                continue;
            }
            StateRecord stateRecord3 = SnapshotKt.U(stateRecord0, mutableSnapshot1.g(), mutableSnapshot1.h());
            if(stateRecord3 != null) {
                StateRecord stateRecord4 = stateObject0.g(stateRecord2, stateRecord1, stateRecord3);
                if(stateRecord4 != null) {
                    if(map0 == null) {
                        map0 = new HashMap();
                    }
                    map0.put(stateRecord1, stateRecord4);
                    continue;
                }
                return null;
            }
            SnapshotKt.T();
            throw new y();
        }
        return map0;
    }

    public static final Object Q(@l StateRecord stateRecord0, @l StateObject stateObject0, @l StateRecord stateRecord1, @l Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        L.p(stateRecord1, "candidate");
        L.p(function10, "block");
        synchronized(SnapshotKt.E()) {
            snapshot0 = Snapshot.e.b();
            object1 = function10.invoke(SnapshotKt.R(stateRecord0, stateObject0, snapshot0, stateRecord1));
        }
        SnapshotKt.O(snapshot0, stateObject0);
        return object1;
    }

    @l
    public static final StateRecord R(@l StateRecord stateRecord0, @l StateObject stateObject0, @l Snapshot snapshot0, @l StateRecord stateRecord1) {
        StateRecord stateRecord2;
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        L.p(snapshot0, "snapshot");
        L.p(stateRecord1, "candidate");
        if(snapshot0.k()) {
            snapshot0.t(stateObject0);
        }
        int v = snapshot0.g();
        if(stateRecord1.d() == v) {
            return stateRecord1;
        }
        synchronized(SnapshotKt.E()) {
            stateRecord2 = SnapshotKt.L(stateRecord0, stateObject0);
        }
        stateRecord2.f(v);
        snapshot0.t(stateObject0);
        return stateRecord2;
    }

    private static final boolean S(StateObject stateObject0) {
        StateRecord stateRecord2;
        StateRecord stateRecord0 = stateObject0.h();
        int v = SnapshotKt.g.f(2);
        StateRecord stateRecord1 = null;
        int v1 = 0;
        while(stateRecord0 != null) {
            int v2 = stateRecord0.d();
            if(v2 != 0) {
                if(v2 > v - 1) {
                    ++v1;
                }
                else if(stateRecord1 == null) {
                    stateRecord1 = stateRecord0;
                }
                else {
                    if(stateRecord0.d() < stateRecord1.d()) {
                        stateRecord2 = stateRecord1;
                        stateRecord1 = stateRecord0;
                    }
                    else {
                        stateRecord2 = stateRecord0;
                    }
                    stateRecord1.f(0);
                    stateRecord1.a(stateRecord2);
                    stateRecord1 = stateRecord2;
                }
            }
            stateRecord0 = stateRecord0.c();
        }
        return v1 < 1;
    }

    private static final Void T() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    private static final StateRecord U(StateRecord stateRecord0, int v, SnapshotIdSet snapshotIdSet0) {
        StateRecord stateRecord1 = null;
        while(stateRecord0 != null) {
            if(SnapshotKt.f0(stateRecord0, v, snapshotIdSet0) && (stateRecord1 == null || stateRecord1.d() < stateRecord0.d())) {
                stateRecord1 = stateRecord0;
            }
            stateRecord0 = stateRecord0.c();
        }
        return stateRecord1 == null ? null : stateRecord1;
    }

    @l
    public static final StateRecord V(@l StateRecord stateRecord0, @l StateObject stateObject0) {
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        Companion snapshot$Companion0 = Snapshot.e;
        Snapshot snapshot0 = snapshot$Companion0.b();
        Function1 function10 = snapshot0.j();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
        StateRecord stateRecord1 = SnapshotKt.U(stateRecord0, snapshot0.g(), snapshot0.h());
        if(stateRecord1 == null) {
            synchronized(SnapshotKt.E()) {
                Snapshot snapshot1 = snapshot$Companion0.b();
                StateRecord stateRecord2 = stateObject0.h();
                L.n(stateRecord2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
                StateRecord stateRecord3 = SnapshotKt.U(stateRecord2, snapshot1.g(), snapshot1.h());
                if(stateRecord3 != null) {
                    return stateRecord3;
                }
                SnapshotKt.T();
            }
            throw new y();
        }
        return stateRecord1;
    }

    @l
    public static final StateRecord W(@l StateRecord stateRecord0, @l StateObject stateObject0, @l Snapshot snapshot0) {
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        L.p(snapshot0, "snapshot");
        Function1 function10 = snapshot0.j();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
        StateRecord stateRecord1 = SnapshotKt.U(stateRecord0, snapshot0.g(), snapshot0.h());
        if(stateRecord1 != null) {
            return stateRecord1;
        }
        SnapshotKt.T();
        throw new y();
    }

    public static final void X(int v) {
        SnapshotKt.g.h(v);
    }

    private static final Void Y() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @b0
    public static final Object Z(@l a a0) {
        L.p(a0, "block");
        synchronized(SnapshotKt.E()) {
            return a0.invoke();
        }
    }

    private static final Object a0(Snapshot snapshot0, Function1 function10) {
        Object object0 = function10.invoke(SnapshotKt.e.j(snapshot0.g()));
        synchronized(SnapshotKt.E()) {
            SnapshotKt.f = 3;
            SnapshotKt.e = SnapshotKt.e.j(snapshot0.g());
            GlobalSnapshot globalSnapshot0 = new GlobalSnapshot(2, SnapshotKt.e);
            SnapshotKt.j.set(globalSnapshot0);
            snapshot0.d();
            SnapshotKt.e = SnapshotKt.e.p(2);
            return object0;
        }
    }

    private static final Snapshot b0(Function1 function10) {
        return (Snapshot)SnapshotKt.x(new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            @l
            public final Snapshot a(@l SnapshotIdSet snapshotIdSet0) {
                L.p(snapshotIdSet0, "invalid");
                Snapshot snapshot0 = (Snapshot)this.e.invoke(snapshotIdSet0);
                synchronized(SnapshotKt.E()) {
                    SnapshotKt.e = SnapshotKt.e.p(snapshot0.g());
                    return snapshot0;
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SnapshotIdSet)object0));
            }
        });
    }

    public static final int c0(int v, @l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "invalid");
        int v1 = snapshotIdSet0.m(v);
        synchronized(SnapshotKt.E()) {
            return SnapshotKt.g.a(v1);
        }
    }

    private static final StateRecord d0(StateObject stateObject0) {
        StateRecord stateRecord0 = stateObject0.h();
        int v = SnapshotKt.g.f(2);
        SnapshotIdSet snapshotIdSet0 = SnapshotIdSet.e.a();
        StateRecord stateRecord1 = null;
        while(stateRecord0 != null) {
            if(stateRecord0.d() == 0) {
                return stateRecord0;
            }
            if(SnapshotKt.f0(stateRecord0, v - 1, snapshotIdSet0)) {
                if(stateRecord1 == null) {
                    stateRecord1 = stateRecord0;
                    goto label_12;
                }
                return stateRecord0.d() < stateRecord1.d() ? stateRecord0 : stateRecord1;
            }
        label_12:
            stateRecord0 = stateRecord0.c();
        }
        return null;
    }

    private static final boolean e0(int v, int v1, SnapshotIdSet snapshotIdSet0) {
        return v1 != 0 && v1 <= v && !snapshotIdSet0.l(v1);
    }

    private static final boolean f0(StateRecord stateRecord0, int v, SnapshotIdSet snapshotIdSet0) {
        return SnapshotKt.e0(v, stateRecord0.d(), snapshotIdSet0);
    }

    private static final void g0(Snapshot snapshot0) {
        if(!SnapshotKt.e.l(snapshot0.g())) {
            throw new IllegalStateException("Snapshot is not open");
        }
    }

    public static final int h() [...] // 潜在的解密器

    public static final Object h0(@l StateRecord stateRecord0, @l Function1 function10) {
        L.p(stateRecord0, "<this>");
        L.p(function10, "block");
        return function10.invoke(SnapshotKt.B(stateRecord0));
    }

    public static final Object i0(@l StateRecord stateRecord0, @l StateObject stateObject0, @l Snapshot snapshot0, @l Function1 function10) {
        Object object1;
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        L.p(snapshot0, "snapshot");
        L.p(function10, "block");
        synchronized(SnapshotKt.E()) {
            object1 = function10.invoke(SnapshotKt.k0(stateRecord0, stateObject0, snapshot0));
        }
        SnapshotKt.O(snapshot0, stateObject0);
        return object1;
    }

    public static final Object j0(@l StateRecord stateRecord0, @l StateObject stateObject0, @l Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        L.p(function10, "block");
        synchronized(SnapshotKt.E()) {
            snapshot0 = Snapshot.e.b();
            object1 = function10.invoke(SnapshotKt.k0(stateRecord0, stateObject0, snapshot0));
        }
        SnapshotKt.O(snapshot0, stateObject0);
        return object1;
    }

    @b0
    @l
    public static final StateRecord k0(@l StateRecord stateRecord0, @l StateObject stateObject0, @l Snapshot snapshot0) {
        L.p(stateRecord0, "<this>");
        L.p(stateObject0, "state");
        L.p(snapshot0, "snapshot");
        if(snapshot0.k()) {
            snapshot0.t(stateObject0);
        }
        StateRecord stateRecord1 = SnapshotKt.U(stateRecord0, snapshot0.g(), snapshot0.h());
        if(stateRecord1 != null) {
            if(stateRecord1.d() == snapshot0.g()) {
                return stateRecord1;
            }
            StateRecord stateRecord2 = SnapshotKt.M(stateRecord1, stateObject0, snapshot0);
            snapshot0.t(stateObject0);
            return stateRecord2;
        }
        SnapshotKt.T();
        throw new y();
    }

    @l
    public static final SnapshotIdSet w(@l SnapshotIdSet snapshotIdSet0, int v, int v1) {
        L.p(snapshotIdSet0, "<this>");
        while(v < v1) {
            snapshotIdSet0 = snapshotIdSet0.p(v);
            ++v;
        }
        return snapshotIdSet0;
    }

    private static final Object x(Function1 function10) {
        List list0;
        Object object2;
        Object object1;
        L.n(SnapshotKt.k, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        GlobalSnapshot globalSnapshot0 = (GlobalSnapshot)SnapshotKt.k;
        synchronized(SnapshotKt.E()) {
            object1 = SnapshotKt.j.get();
            L.o(object1, "currentGlobalSnapshot.get()");
            object2 = SnapshotKt.a0(((Snapshot)object1), function10);
        }
        Set set0 = ((GlobalSnapshot)object1).i();
        if(set0 != null) {
            synchronized(SnapshotKt.E()) {
                list0 = u.Y5(SnapshotKt.h);
            }
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((o)list0.get(v3)).invoke(set0, object1);
            }
        }
        synchronized(SnapshotKt.E()) {
            if(set0 != null) {
                for(Object object5: set0) {
                    SnapshotKt.S(((StateObject)object5));
                }
            }
            return object2;
        }
    }

    private static final void y() {
        SnapshotKt.x(androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3.e);

        final class androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3 extends N implements Function1 {
            public static final androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3 e;

            static {
                androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3.e = new androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3();
            }

            androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3() {
                super(1);
            }

            public final void a(@l SnapshotIdSet snapshotIdSet0) {
                L.p(snapshotIdSet0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SnapshotIdSet)object0));
                return S0.a;
            }
        }

    }

    private static final Snapshot z(Snapshot snapshot0, Function1 function10, boolean z) {
        if(!(snapshot0 instanceof MutableSnapshot) && snapshot0 != null) {
            return new TransparentObserverSnapshot(snapshot0, function10, false, z);
        }
        return snapshot0 instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot(((MutableSnapshot)snapshot0), function10, null, false, z) : new TransparentObserverMutableSnapshot(null, function10, null, false, z);
    }
}

