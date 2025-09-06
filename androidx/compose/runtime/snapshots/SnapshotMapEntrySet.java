package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.r0;
import kotlin.ranges.s;
import kotlin.y;
import y4.l;

@s0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1179#2,2:361\n1253#2,4:363\n1726#2,3:410\n84#3,2:367\n129#3,4:369\n133#3:374\n121#3:375\n134#3,5:377\n86#3,7:382\n139#3,3:389\n125#3:392\n142#3,5:398\n149#3,3:406\n93#3:409\n70#4:373\n2180#5:376\n2073#5,2:393\n1686#5:395\n2075#5,2:396\n2077#5,3:403\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n209#1:361,2\n209#1:363,4\n216#1:410,3\n210#1:367,2\n210#1:369,4\n210#1:374\n210#1:375\n210#1:377,5\n210#1:382,7\n210#1:389,3\n210#1:392\n210#1:398,5\n210#1:406,3\n210#1:409\n210#1:373\n210#1:376\n210#1:393,2\n210#1:395\n210#1:396,2\n210#1:403,3\n*E\n"})
final class SnapshotMapEntrySet extends SnapshotMapSet {
    public SnapshotMapEntrySet(@l SnapshotStateMap snapshotStateMap0) {
        L.p(snapshotStateMap0, "map");
        super(snapshotStateMap0);
    }

    @Override
    public boolean add(Object object0) {
        return ((Boolean)this.c(((Map.Entry)object0))).booleanValue();
    }

    @Override
    public boolean addAll(Collection collection0) {
        return ((Boolean)this.d(collection0)).booleanValue();
    }

    @l
    public Void c(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override
    public final boolean contains(Object object0) {
        return v0.I(object0) ? this.g(((Map.Entry)object0)) : false;
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(((Map.Entry)object0))) {
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

    public boolean g(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        return L.g(this.a().get(map$Entry0.getKey()), map$Entry0.getValue());
    }

    public boolean h(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        return this.a().remove(map$Entry0.getKey()) != null;
    }

    @Override
    @l
    public Iterator iterator() {
        return new StateMapMutableEntriesIterator(this.a(), ((ImmutableSet)this.a().m().g().entrySet()).iterator());
    }

    @Override
    public final boolean remove(Object object0) {
        return v0.I(object0) ? this.h(((Map.Entry)object0)) : false;
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
                if(this.a().remove(((Map.Entry)object0).getKey()) == null && !z) {
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
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(s.u(Y.j(u.b0(collection0, 10)), 16));
        for(Object object0: collection0) {
            V v0 = r0.a(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            linkedHashMap0.put(v0.e(), v0.f());
        }
        SnapshotStateMap snapshotStateMap0 = this.a();
        boolean z = false;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = snapshotStateMap0.h();
                L.n(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.B(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.g();
                int v2 = snapshotStateMap$StateMapStateRecord0.h();
            }
            L.m(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            Iterator iterator1 = snapshotStateMap0.entrySet().iterator();
            while(true) {
                z1 = true;
                if(!iterator1.hasNext()) {
                    break;
                }
                Object object2 = iterator1.next();
                Map.Entry map$Entry0 = (Map.Entry)object2;
                if(!linkedHashMap0.containsKey(map$Entry0.getKey()) || !L.g(linkedHashMap0.get(map$Entry0.getKey()), map$Entry0.getValue())) {
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
                    if(snapshotStateMap$StateMapStateRecord1.h() == v2) {
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

