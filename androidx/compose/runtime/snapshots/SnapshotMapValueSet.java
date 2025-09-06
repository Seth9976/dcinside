package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.y;
import y4.l;

@s0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n84#2,2:361\n129#2,4:363\n133#2:368\n121#2:369\n134#2,5:371\n86#2,7:376\n139#2,3:383\n125#2:386\n142#2,5:392\n149#2,3:400\n93#2:403\n84#2,2:404\n129#2,4:406\n133#2:411\n121#2:412\n134#2,5:414\n86#2,7:419\n139#2,3:426\n125#2:429\n142#2,5:435\n149#2,3:443\n93#2:446\n70#3:367\n70#3:410\n2180#4:370\n2073#4,2:387\n1686#4:389\n2075#4,2:390\n2077#4,3:397\n2180#4:413\n2073#4,2:430\n1686#4:432\n2075#4,2:433\n2077#4,3:440\n1726#5,3:447\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n250#1:361,2\n250#1:363,4\n250#1:368\n250#1:369\n250#1:371,5\n250#1:376,7\n250#1:383,3\n250#1:386\n250#1:392,5\n250#1:400,3\n250#1:403\n254#1:404,2\n254#1:406,4\n254#1:411\n254#1:412\n254#1:414,5\n254#1:419,7\n254#1:426,3\n254#1:429\n254#1:435,5\n254#1:443,3\n254#1:446\n250#1:367\n254#1:410\n250#1:370\n250#1:387,2\n250#1:389\n250#1:390,2\n250#1:397,3\n254#1:413\n254#1:430,2\n254#1:432\n254#1:433,2\n254#1:440,3\n258#1:447,3\n*E\n"})
final class SnapshotMapValueSet extends SnapshotMapSet {
    public SnapshotMapValueSet(@l SnapshotStateMap snapshotStateMap0) {
        L.p(snapshotStateMap0, "map");
        super(snapshotStateMap0);
    }

    @Override
    public boolean add(Object object0) {
        return ((Boolean)this.c(object0)).booleanValue();
    }

    @Override
    public boolean addAll(Collection collection0) {
        return ((Boolean)this.d(collection0)).booleanValue();
    }

    @l
    public Void c(Object object0) {
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a().containsValue(object0);
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.a().containsValue(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @l
    public Void d(@l Collection collection0) {
        L.p(collection0, "elements");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @l
    public StateMapMutableValuesIterator g() {
        return new StateMapMutableValuesIterator(this.a(), ((ImmutableSet)this.a().m().g().entrySet()).iterator());
    }

    @Override
    public Iterator iterator() {
        return this.g();
    }

    @Override
    public boolean remove(Object object0) {
        return this.a().u(object0);
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z1;
        L.p(collection0, "elements");
        Set set0 = u.a6(collection0);
        SnapshotStateMap snapshotStateMap0 = this.a();
        boolean z = false;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = snapshotStateMap0.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v1 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            Iterator iterator0 = snapshotStateMap0.entrySet().iterator();
            while(true) {
                z1 = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(set0.contains(map$Entry0.getValue())) {
                    persistentMap$Builder0.remove(map$Entry0.getKey());
                    z = true;
                }
            }
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(L.g(persistentMap1, persistentMap0)) {
                break;
            }
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = snapshotStateMap0.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.k0(((StateMapStateRecord)stateRecord1), snapshotStateMap0, snapshot0);
                    if(snapshotStateMap$StateMapStateRecord1.h() == v1) {
                        snapshotStateMap$StateMapStateRecord1.i(persistentMap1);
                        snapshotStateMap$StateMapStateRecord1.j(snapshotStateMap$StateMapStateRecord1.h() + 1);
                    }
                    else {
                        z1 = false;
                    }
                }
                SnapshotKt.O(snapshot0, snapshotStateMap0);
            }
            if(z1) {
                return z;
            }
        }
        return z;
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z1;
        L.p(collection0, "elements");
        Set set0 = u.a6(collection0);
        SnapshotStateMap snapshotStateMap0 = this.a();
        boolean z = false;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = snapshotStateMap0.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v1 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            Iterator iterator0 = snapshotStateMap0.entrySet().iterator();
            while(true) {
                z1 = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(!set0.contains(map$Entry0.getValue())) {
                    persistentMap$Builder0.remove(map$Entry0.getKey());
                    z = true;
                }
            }
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(L.g(persistentMap1, persistentMap0)) {
                break;
            }
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord1 = snapshotStateMap0.h();
                L.n(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized(SnapshotKt.E()) {
                    snapshot0 = Snapshot.e.b();
                    StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.k0(((StateMapStateRecord)stateRecord1), snapshotStateMap0, snapshot0);
                    if(snapshotStateMap$StateMapStateRecord1.h() == v1) {
                        snapshotStateMap$StateMapStateRecord1.i(persistentMap1);
                        snapshotStateMap$StateMapStateRecord1.j(snapshotStateMap$StateMapStateRecord1.h() + 1);
                    }
                    else {
                        z1 = false;
                    }
                }
                SnapshotKt.O(snapshot0, snapshotStateMap0);
            }
            if(z1) {
                return z;
            }
        }
        return z;
    }
}

