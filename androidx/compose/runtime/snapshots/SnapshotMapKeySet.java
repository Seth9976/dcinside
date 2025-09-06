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

@s0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1855#2,2:361\n1726#2,3:406\n84#3,2:363\n129#3,4:365\n133#3:370\n121#3:371\n134#3,5:373\n86#3,7:378\n139#3,3:385\n125#3:388\n142#3,5:394\n149#3,3:402\n93#3:405\n70#4:369\n2180#5:372\n2073#5,2:389\n1686#5:391\n2075#5,2:392\n2077#5,3:399\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n227#1:361,2\n237#1:406,3\n234#1:363,2\n234#1:365,4\n234#1:370\n234#1:371\n234#1:373,5\n234#1:378,7\n234#1:385,3\n234#1:388\n234#1:394,5\n234#1:402,3\n234#1:405\n234#1:369\n234#1:372\n234#1:389,2\n234#1:391\n234#1:392,2\n234#1:399,3\n*E\n"})
final class SnapshotMapKeySet extends SnapshotMapSet {
    public SnapshotMapKeySet(@l SnapshotStateMap snapshotStateMap0) {
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
        return this.a().containsKey(object0);
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.a().containsKey(object0)) {
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
    public StateMapMutableKeysIterator g() {
        return new StateMapMutableKeysIterator(this.a(), ((ImmutableSet)this.a().m().g().entrySet()).iterator());
    }

    @Override
    public Iterator iterator() {
        return this.g();
    }

    @Override
    public boolean remove(Object object0) {
        return this.a().remove(object0) != null;
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        boolean z;
        L.p(collection0, "elements");
        Iterator iterator0 = collection0.iterator();
    alab1:
        while(true) {
            for(z = false; true; z = true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if(this.a().remove(object0) == null && !z) {
                    break;
                }
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
                if(!set0.contains(map$Entry0.getKey())) {
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

