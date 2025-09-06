package androidx.compose.runtime.snapshots;

import B3.g;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@Stable
@s0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n157#1:367\n125#1:368\n158#1,2:374\n162#1:379\n129#1,4:380\n133#1:385\n121#1:386\n134#1,8:388\n125#1:396\n142#1,5:402\n149#1,3:410\n129#1,4:413\n133#1:418\n121#1:419\n134#1,8:421\n125#1:429\n142#1,5:435\n149#1,3:443\n129#1,4:446\n133#1:451\n121#1:452\n134#1,8:454\n125#1:462\n142#1,5:468\n149#1,3:476\n129#1,4:482\n133#1:487\n121#1:488\n134#1,8:490\n125#1:498\n142#1,5:504\n149#1,3:512\n121#1:515\n121#1:528\n125#1:531\n121#1:541\n125#1:544\n2180#2:363\n2073#2,2:369\n1686#2:371\n2075#2,2:372\n2077#2,3:376\n2180#2:387\n2073#2,2:397\n1686#2:399\n2075#2,2:400\n2077#2,3:407\n2180#2:420\n2073#2,2:430\n1686#2:432\n2075#2,2:433\n2077#2,3:440\n2180#2:453\n2073#2,2:463\n1686#2:465\n2075#2,2:466\n2077#2,3:473\n2180#2:489\n2073#2,2:499\n1686#2:501\n2075#2,2:502\n2077#2,3:509\n2180#2:516\n2180#2:517\n2073#2,2:518\n1686#2:520\n2075#2,5:522\n2180#2:529\n2073#2,2:532\n1686#2:534\n2075#2,5:536\n2180#2:542\n2073#2,2:545\n1686#2:547\n2075#2,5:549\n70#3:366\n70#3:384\n70#3:417\n70#3:450\n70#3:486\n70#3:521\n70#3:527\n70#3:530\n70#3:535\n70#3:543\n70#3:548\n288#4,2:479\n1#5:481\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:367\n69#1:368\n69#1:374,2\n69#1:379\n70#1:380,4\n70#1:385\n70#1:386\n70#1:388,8\n70#1:396\n70#1:402,5\n70#1:410,3\n71#1:413,4\n71#1:418\n71#1:419\n71#1:421,8\n71#1:429\n71#1:435,5\n71#1:443,3\n72#1:446,4\n72#1:451\n72#1:452\n72#1:454,8\n72#1:462\n72#1:468,5\n72#1:476,3\n85#1:482,4\n85#1:487\n85#1:488\n85#1:490,8\n85#1:498\n85#1:504,5\n85#1:512,3\n117#1:515\n133#1:528\n141#1:531\n154#1:541\n157#1:544\n69#1:363\n69#1:369,2\n69#1:371\n69#1:372,2\n69#1:376,3\n70#1:387\n70#1:397,2\n70#1:399\n70#1:400,2\n70#1:407,3\n71#1:420\n71#1:430,2\n71#1:432\n71#1:433,2\n71#1:440,3\n72#1:453\n72#1:463,2\n72#1:465\n72#1:466,2\n72#1:473,3\n85#1:489\n85#1:499,2\n85#1:501\n85#1:502,2\n85#1:509,3\n117#1:516\n121#1:517\n125#1:518,2\n125#1:520\n125#1:522,5\n133#1:529\n141#1:532,2\n141#1:534\n141#1:536,5\n154#1:542\n157#1:545,2\n157#1:547\n157#1:549,5\n69#1:366\n70#1:384\n71#1:417\n72#1:450\n85#1:486\n125#1:521\n132#1:527\n140#1:530\n141#1:535\n156#1:543\n157#1:548\n77#1:479,2\n*E\n"})
public final class SnapshotStateMap implements g, StateObject, Map {
    @s0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,360:1\n70#2:361\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n174#1:361\n*E\n"})
    public static final class StateMapStateRecord extends StateRecord {
        @l
        private PersistentMap d;
        private int e;

        public StateMapStateRecord(@l PersistentMap persistentMap0) {
            L.p(persistentMap0, "map");
            super();
            this.d = persistentMap0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void a(@l StateRecord stateRecord0) {
            L.p(stateRecord0, "value");
            synchronized(SnapshotStateMapKt.a) {
                this.d = ((StateMapStateRecord)stateRecord0).d;
                this.e = ((StateMapStateRecord)stateRecord0).e;
            }
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord b() {
            return new StateMapStateRecord(this.d);
        }

        @l
        public final PersistentMap g() {
            return this.d;
        }

        public final int h() {
            return this.e;
        }

        public final void i(@l PersistentMap persistentMap0) {
            L.p(persistentMap0, "<set-?>");
            this.d = persistentMap0;
        }

        public final void j(int v) {
            this.e = v;
        }
    }

    @l
    private StateRecord a;
    @l
    private final Set b;
    @l
    private final Set c;
    @l
    private final Collection d;
    public static final int e;

    static {
    }

    public SnapshotStateMap() {
        this.a = new StateMapStateRecord(ExtensionsKt.C());
        this.b = new SnapshotMapEntrySet(this);
        this.c = new SnapshotMapKeySet(this);
        this.d = new SnapshotMapValueSet(this);
    }

    public final boolean a(@l Function1 function10) {
        L.p(function10, "predicate");
        for(Object object0: ((ImmutableSet)this.m().g().entrySet())) {
            if(!((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean b(@l Function1 function10) {
        L.p(function10, "predicate");
        for(Object object0: ((ImmutableSet)this.m().g().entrySet())) {
            if(((Boolean)function10.invoke(((Map.Entry)object0))).booleanValue()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @l
    @i(name = "getDebuggerDisplayValue")
    public final Map c() {
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0))).g();
    }

    @Override
    public void clear() {
        Snapshot snapshot0;
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
        PersistentMap persistentMap0 = ExtensionsKt.C();
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.g()) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)stateRecord1;
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord2 = (StateMapStateRecord)SnapshotKt.k0(snapshotStateMap$StateMapStateRecord1, this, snapshot0);
                    snapshotStateMap$StateMapStateRecord2.i(persistentMap0);
                    snapshotStateMap$StateMapStateRecord2.j(snapshotStateMap$StateMapStateRecord2.h() + 1);
                }
                SnapshotKt.O(snapshot0, this);
            }
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.m().g().containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.m().g().containsValue(object0);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void d(@l StateRecord stateRecord0) {
        L.p(stateRecord0, "value");
        this.a = (StateMapStateRecord)stateRecord0;
    }

    @Override
    public final Set entrySet() {
        return this.i();
    }

    public static void f() {
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public StateRecord g(StateRecord stateRecord0, StateRecord stateRecord1, StateRecord stateRecord2) {
        return a.a(this, stateRecord0, stateRecord1, stateRecord2);
    }

    @Override
    @m
    public Object get(Object object0) {
        return this.m().g().get(object0);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord h() {
        return this.a;
    }

    @l
    public Set i() {
        return this.b;
    }

    @Override
    public boolean isEmpty() {
        return this.m().g().isEmpty();
    }

    @l
    public Set j() {
        return this.c;
    }

    @Override
    public final Set keySet() {
        return this.j();
    }

    public final int l() {
        return this.m().h();
    }

    @l
    public final StateMapStateRecord m() {
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord)SnapshotKt.V(((StateMapStateRecord)stateRecord0), this);
    }

    public static void o() {
    }

    @Override
    @m
    public Object put(Object object0, Object object1) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z;
        Object object3;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v1 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            object3 = persistentMap$Builder0.put(object0, object1);
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(L.g(persistentMap1, persistentMap0)) {
                break;
            }
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.k0(((StateMapStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateMap$StateMapStateRecord1.h() == v1) {
                        snapshotStateMap$StateMapStateRecord1.i(persistentMap1);
                        z = true;
                        snapshotStateMap$StateMapStateRecord1.j(snapshotStateMap$StateMapStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return object3;
            }
        }
        return object3;
    }

    @Override
    public void putAll(@l Map map0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z;
        L.p(map0, "from");
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v1 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            persistentMap$Builder0.putAll(map0);
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(L.g(persistentMap1, persistentMap0)) {
                break;
            }
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.k0(((StateMapStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateMap$StateMapStateRecord1.h() == v1) {
                        snapshotStateMap$StateMapStateRecord1.i(persistentMap1);
                        z = true;
                        snapshotStateMap$StateMapStateRecord1.j(snapshotStateMap$StateMapStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return;
            }
        }
    }

    public int q() {
        return this.m().g().size();
    }

    @l
    public Collection r() {
        return this.d;
    }

    @Override
    @m
    public Object remove(Object object0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z;
        Object object2;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v1 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            object2 = persistentMap$Builder0.remove(object0);
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(L.g(persistentMap1, persistentMap0)) {
                break;
            }
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.k0(((StateMapStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateMap$StateMapStateRecord1.h() == v1) {
                        snapshotStateMap$StateMapStateRecord1.i(persistentMap1);
                        z = true;
                        snapshotStateMap$StateMapStateRecord1.j(snapshotStateMap$StateMapStateRecord1.h() + 1);
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return object2;
            }
        }
        return object2;
    }

    private final Object s(Function1 function10) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z;
        Object object1;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v1 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            object1 = function10.invoke(persistentMap$Builder0);
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(L.g(persistentMap1, persistentMap0)) {
                break;
            }
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.k0(((StateMapStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateMap$StateMapStateRecord1.h() == v1) {
                        snapshotStateMap$StateMapStateRecord1.i(persistentMap1);
                        snapshotStateMap$StateMapStateRecord1.j(snapshotStateMap$StateMapStateRecord1.h() + 1);
                        z = true;
                    }
                    else {
                        z = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z) {
                return object1;
            }
        }
        return object1;
    }

    @Override
    public final int size() {
        return this.q();
    }

    public final boolean t(@l Function1 function10) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z1;
        L.p(function10, "predicate");
        boolean z = false;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = this.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v1 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            for(Object object1: this.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(((Boolean)function10.invoke(map$Entry0)).booleanValue()) {
                    persistentMap$Builder0.remove(map$Entry0.getKey());
                    z = true;
                }
            }
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(L.g(persistentMap1, persistentMap0)) {
                break;
            }
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.k0(((StateMapStateRecord)stateRecord1), this, snapshot0);
                    if(snapshotStateMap$StateMapStateRecord1.h() == v1) {
                        snapshotStateMap$StateMapStateRecord1.i(persistentMap1);
                        snapshotStateMap$StateMapStateRecord1.j(snapshotStateMap$StateMapStateRecord1.h() + 1);
                        z1 = true;
                    }
                    else {
                        z1 = false;
                    }
                }
                SnapshotKt.O(snapshot0, this);
            }
            if(z1) {
                return z;
            }
        }
        return z;
    }

    public final boolean u(Object object0) {
        Object object1 = null;
        for(Object object2: this.entrySet()) {
            if(L.g(((Map.Entry)object2).getValue(), object0)) {
                object1 = object2;
                break;
            }
        }
        if(((Map.Entry)object1) != null) {
            this.remove(((Map.Entry)object1).getKey());
            return true;
        }
        return false;
    }

    @l
    public final Map v() {
        return this.m().g();
    }

    @Override
    public final Collection values() {
        return this.r();
    }

    private final void w(Function1 function10) {
        Snapshot snapshot0;
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
        PersistentMap persistentMap0 = (PersistentMap)function10.invoke(snapshotStateMap$StateMapStateRecord0.g());
        if(persistentMap0 != snapshotStateMap$StateMapStateRecord0.g()) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = this.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)stateRecord1;
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord2 = (StateMapStateRecord)SnapshotKt.k0(snapshotStateMap$StateMapStateRecord1, this, snapshot0);
                    snapshotStateMap$StateMapStateRecord2.i(persistentMap0);
                    snapshotStateMap$StateMapStateRecord2.j(snapshotStateMap$StateMapStateRecord2.h() + 1);
                }
                SnapshotKt.O(snapshot0, this);
            }
        }
    }

    private final Object x(Function1 function10) {
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return function10.invoke(SnapshotKt.B(((StateMapStateRecord)stateRecord0)));
    }

    private final Object y(Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        StateRecord stateRecord0 = this.h();
        L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        synchronized(SnapshotKt.E()) {
            snapshot0 = Snapshot.e.b();
            object1 = function10.invoke(SnapshotKt.k0(((StateMapStateRecord)stateRecord0), this, snapshot0));
        }
        SnapshotKt.O(snapshot0, this);
        return object1;
    }
}

