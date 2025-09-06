package androidx.compose.runtime.snapshots;

import A3.a;
import A3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.y;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n955#1,2:2192\n961#1,3:2196\n964#1,6:2201\n955#1,2:2227\n961#1,3:2231\n964#1,6:2236\n955#1,9:2252\n964#1,6:2263\n1686#2:2194\n1686#2:2199\n1686#2:2207\n1686#2:2221\n1686#2:2229\n1686#2:2234\n1686#2:2247\n1686#2:2250\n1686#2:2261\n1686#2:2269\n1686#2:2271\n70#3:2195\n70#3:2200\n70#3:2208\n70#3:2222\n70#3:2230\n70#3:2235\n70#3:2248\n70#3:2251\n70#3:2262\n70#3:2270\n70#3:2272\n33#4,6:2209\n33#4,6:2215\n33#4,4:2243\n38#4:2249\n1855#5,2:2223\n1855#5,2:2225\n184#6:2242\n1#7:2273\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n661#1:2192,2\n661#1:2196,3\n661#1:2201,6\n786#1:2227,2\n786#1:2231,3\n786#1:2236,6\n972#1:2252,9\n972#1:2263,6\n662#1:2194\n661#1:2199\n710#1:2207\n761#1:2221\n787#1:2229\n786#1:2234\n939#1:2247\n963#1:2250\n972#1:2261\n975#1:2269\n1000#1:2271\n662#1:2195\n661#1:2200\n710#1:2208\n761#1:2222\n787#1:2230\n786#1:2235\n939#1:2248\n963#1:2251\n972#1:2262\n975#1:2270\n1000#1:2272\n747#1:2209,6\n753#1:2215,6\n936#1:2243,4\n936#1:2249\n764#1:2223,2\n765#1:2225,2\n833#1:2242\n*E\n"})
public class MutableSnapshot extends Snapshot {
    @m
    private final Function1 g;
    @m
    private final Function1 h;
    @m
    private Set i;
    @l
    private SnapshotIdSet j;
    @l
    private int[] k;
    private int l;
    private boolean m;
    public static final int n = 8;

    static {
    }

    public MutableSnapshot(int v, @l SnapshotIdSet snapshotIdSet0, @m Function1 function10, @m Function1 function11) {
        L.p(snapshotIdSet0, "invalid");
        super(v, snapshotIdSet0, null);
        this.g = function10;
        this.h = function11;
        this.j = SnapshotIdSet.e.a();
        this.k = new int[0];
        this.l = 1;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot A(@m Function1 function10) {
        Snapshot snapshot0;
        this.F();
        this.a0();
        int v = this.g();
        this.O(this.g());
        synchronized(SnapshotKt.E()) {
            SnapshotKt.f = 3;
            SnapshotKt.e = SnapshotKt.e.p(2);
            snapshot0 = new NestedReadonlySnapshot(2, SnapshotKt.w(this.h(), v + 1, 2), function10, this);
        }
        if(!this.K() && !this.f()) {
            int v2 = this.g();
            synchronized(SnapshotKt.E()) {
                SnapshotKt.f = 3;
                this.y(2);
                SnapshotKt.e = SnapshotKt.e.p(this.g());
            }
            this.z(SnapshotKt.w(this.h(), v2 + 1, this.g()));
            return snapshot0;
        }
        return snapshot0;
    }

    private final void G() {
        Set set0 = this.i();
        if(set0 != null) {
            this.Z();
            this.U(null);
            int v = this.g();
            for(Object object0: set0) {
                for(StateRecord stateRecord0 = ((StateObject)object0).h(); stateRecord0 != null; stateRecord0 = stateRecord0.c()) {
                    if(stateRecord0.d() == v || u.W1(this.j, stateRecord0.d())) {
                        stateRecord0.f(0);
                    }
                }
            }
        }
        this.b();
    }

    public final Object H(@l a a0) {
        L.p(a0, "block");
        this.O(this.g());
        Object object0 = a0.invoke();
        if(!this.K() && !this.f()) {
            int v = this.g();
            synchronized(SnapshotKt.E()) {
                SnapshotKt.f = 3;
                this.y(2);
                SnapshotKt.e = SnapshotKt.e.p(this.g());
            }
            this.z(SnapshotKt.w(this.h(), v + 1, this.g()));
            return object0;
        }
        return object0;
    }

    public final void I() {
        this.O(this.g());
        if(!this.K() && !this.f()) {
            int v = this.g();
            synchronized(SnapshotKt.E()) {
                SnapshotKt.f = 3;
                this.y(2);
                SnapshotKt.e = SnapshotKt.e.p(this.g());
            }
            this.z(SnapshotKt.w(this.h(), v + 1, this.g()));
        }
    }

    @l
    public SnapshotApplyResult J() {
        V v0;
        SnapshotApplyResult snapshotApplyResult0;
        Map map0;
        Set set0 = this.i();
        if(set0 == null) {
            map0 = null;
        }
        else {
            Object object0 = SnapshotKt.j.get();
            L.o(object0, "currentGlobalSnapshot.get()");
            map0 = SnapshotKt.P(((MutableSnapshot)object0), this, SnapshotKt.e.j(((GlobalSnapshot)SnapshotKt.j.get()).g()));
        }
        synchronized(SnapshotKt.E()) {
            SnapshotKt.g0(this);
            if(set0 == null || set0.size() == 0) {
                goto label_24;
            }
            else {
                GlobalSnapshot globalSnapshot0 = (GlobalSnapshot)SnapshotKt.j.get();
                snapshotApplyResult0 = this.N(2, map0, SnapshotKt.e.j(globalSnapshot0.g()));
                if(L.g(snapshotApplyResult0, Success.b)) {
                    this.c();
                    L.o(globalSnapshot0, "previousGlobalSnapshot");
                    SnapshotKt.a0(globalSnapshot0, SnapshotKt.a);
                    Set set1 = globalSnapshot0.i();
                    this.U(null);
                    globalSnapshot0.U(null);
                    v0 = r0.a(u.Y5(SnapshotKt.h), set1);
                    goto label_34;
                }
                return snapshotApplyResult0;
            }
            goto label_34;
        }
        return snapshotApplyResult0;
    label_24:
        this.c();
        GlobalSnapshot globalSnapshot1 = (GlobalSnapshot)SnapshotKt.j.get();
        L.o(globalSnapshot1, "previousGlobalSnapshot");
        SnapshotKt.a0(globalSnapshot1, SnapshotKt.a);
        Set set2 = globalSnapshot1.i();
        v0 = set2 == null || set2.isEmpty() ? r0.a(u.H(), null) : r0.a(u.Y5(SnapshotKt.h), set2);
    label_34:
        List list0 = (List)v0.a();
        Set set3 = (Set)v0.b();
        this.m = true;
        if(set3 != null && !set3.isEmpty()) {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((o)list0.get(v3)).invoke(set3, this);
            }
        }
        if(set0 != null && !set0.isEmpty()) {
            int v4 = list0.size();
            for(int v1 = 0; v1 < v4; ++v1) {
                ((o)list0.get(v1)).invoke(set0, this);
            }
        }
        synchronized(SnapshotKt.E()) {
            this.v();
            if(set3 != null) {
                for(Object object3: set3) {
                    SnapshotKt.S(((StateObject)object3));
                }
            }
            if(set0 != null) {
                for(Object object4: set0) {
                    SnapshotKt.S(((StateObject)object4));
                }
            }
            return Success.b;
        }
    }

    public final boolean K() {
        return this.m;
    }

    @l
    public final SnapshotIdSet L() {
        return this.j;
    }

    @l
    public final int[] M() {
        return this.k;
    }

    @l
    public final SnapshotApplyResult N(int v, @m Map map0, @l SnapshotIdSet snapshotIdSet0) {
        StateRecord stateRecord5;
        L.p(snapshotIdSet0, "invalidSnapshots");
        SnapshotIdSet snapshotIdSet1 = this.h().p(this.g()).o(this.j);
        Set set0 = this.i();
        L.m(set0);
        List list0 = null;
        Collection collection0 = null;
        for(Object object0: set0) {
            StateObject stateObject0 = (StateObject)object0;
            StateRecord stateRecord0 = stateObject0.h();
            StateRecord stateRecord1 = SnapshotKt.U(stateRecord0, v, snapshotIdSet0);
            if(stateRecord1 == null) {
                continue;
            }
            StateRecord stateRecord2 = SnapshotKt.U(stateRecord0, this.g(), snapshotIdSet1);
            if(stateRecord2 == null || L.g(stateRecord1, stateRecord2)) {
                continue;
            }
            StateRecord stateRecord3 = SnapshotKt.U(stateRecord0, this.g(), this.h());
            if(stateRecord3 != null) {
                if(map0 == null) {
                    stateRecord5 = stateObject0.g(stateRecord2, stateRecord1, stateRecord3);
                }
                else {
                    StateRecord stateRecord4 = (StateRecord)map0.get(stateRecord1);
                    if(stateRecord4 != null) {
                        stateRecord5 = stateRecord4;
                    }
                }
                if(stateRecord5 == null) {
                    return new Failure(this);
                }
                if(L.g(stateRecord5, stateRecord3)) {
                    continue;
                }
                if(L.g(stateRecord5, stateRecord1)) {
                    if(list0 == null) {
                        list0 = new ArrayList();
                    }
                    list0.add(r0.a(stateObject0, stateRecord1.b()));
                    if(collection0 == null) {
                        collection0 = new ArrayList();
                    }
                    ((List)collection0).add(stateObject0);
                    continue;
                }
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add((L.g(stateRecord5, stateRecord2) ? r0.a(stateObject0, stateRecord2.b()) : r0.a(stateObject0, stateRecord5)));
                continue;
            }
            SnapshotKt.T();
            throw new y();
        }
        if(list0 != null) {
            this.I();
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                V v3 = (V)list0.get(v2);
                StateObject stateObject1 = (StateObject)v3.a();
                StateRecord stateRecord6 = (StateRecord)v3.b();
                stateRecord6.f(this.g());
                synchronized(SnapshotKt.E()) {
                    stateRecord6.e(stateObject1.h());
                    stateObject1.d(stateRecord6);
                }
            }
        }
        if(collection0 != null) {
            set0.removeAll(collection0);
        }
        return Success.b;
    }

    public final void O(int v) {
        synchronized(SnapshotKt.E()) {
            this.j = this.j.p(v);
        }
    }

    public final void P(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "snapshots");
        synchronized(SnapshotKt.E()) {
            this.j = this.j.o(snapshotIdSet0);
        }
    }

    public final void Q(int v) {
        if(v >= 0) {
            this.k = kotlin.collections.l.q3(this.k, v);
        }
    }

    public final void R(@l int[] arr_v) {
        L.p(arr_v, "handles");
        if(arr_v.length == 0) {
            return;
        }
        int[] arr_v1 = this.k;
        if(arr_v1.length == 0) {
            this.k = arr_v;
            return;
        }
        this.k = kotlin.collections.l.s3(arr_v1, arr_v);
    }

    public final void S() {
        for(int v = 0; v < this.k.length; ++v) {
            SnapshotKt.X(this.k[v]);
        }
    }

    public final void T(boolean z) {
        this.m = z;
    }

    public void U(@m Set set0) {
        this.i = set0;
    }

    public final void V(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "<set-?>");
        this.j = snapshotIdSet0;
    }

    public final void W(@l int[] arr_v) {
        L.p(arr_v, "<set-?>");
        this.k = arr_v;
    }

    @l
    public MutableSnapshot X(@m Function1 function10, @m Function1 function11) {
        MutableSnapshot mutableSnapshot0;
        this.F();
        this.a0();
        this.O(this.g());
        synchronized(SnapshotKt.E()) {
            SnapshotKt.f = 3;
            SnapshotKt.e = SnapshotKt.e.p(2);
            SnapshotIdSet snapshotIdSet0 = this.h();
            this.z(snapshotIdSet0.p(2));
            mutableSnapshot0 = new NestedMutableSnapshot(2, SnapshotKt.w(snapshotIdSet0, this.g() + 1, 2), SnapshotKt.J(function10, this.j(), false, 4, null), SnapshotKt.K(function11, this.m()), this);
        }
        if(!this.K() && !this.f()) {
            int v1 = this.g();
            synchronized(SnapshotKt.E()) {
                SnapshotKt.f = 3;
                this.y(2);
                SnapshotKt.e = SnapshotKt.e.p(this.g());
            }
            this.z(SnapshotKt.w(this.h(), v1 + 1, this.g()));
            return mutableSnapshot0;
        }
        return mutableSnapshot0;
    }

    public static MutableSnapshot Y(MutableSnapshot mutableSnapshot0, Function1 function10, Function1 function11, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if((v & 1) != 0) {
            function10 = null;
        }
        if((v & 2) != 0) {
            function11 = null;
        }
        return mutableSnapshot0.X(function10, function11);
    }

    public final void Z() {
        if(this.m) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    public final void a0() {
        if(this.m && this.d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void c() {
        SnapshotKt.e = SnapshotKt.e.j(this.g()).i(this.j);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void d() {
        if(!this.f()) {
            super.d();
            this.r(this);
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Set i() {
        return this.i;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Function1 j() {
        return this.g;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean k() {
        return false;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot l() {
        return this;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Function1 m() {
        return this.h;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean n() {
        Set set0 = this.i();
        return set0 != null && !set0.isEmpty() == 1;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void q(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        ++this.l;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void r(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        int v = this.l;
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.l = v - 1;
        if(v - 1 == 0 && !this.m) {
            this.G();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void s() {
        if(!this.m && !this.f()) {
            this.I();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void t(@l StateObject stateObject0) {
        L.p(stateObject0, "state");
        Set set0 = this.i();
        if(set0 == null) {
            set0 = new HashSet();
            this.U(set0);
        }
        set0.add(stateObject0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void v() {
        this.S();
        super.v();
    }
}

