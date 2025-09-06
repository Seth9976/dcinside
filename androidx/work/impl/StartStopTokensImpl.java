package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nStartStopToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokensImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n361#2,7:105\n467#2,7:112\n1855#3,2:119\n*S KotlinDebug\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokensImpl\n*L\n65#1:105,7\n73#1:112,7\n74#1:119,2\n*E\n"})
final class StartStopTokensImpl implements StartStopTokens {
    @l
    private final Map b;

    public StartStopTokensImpl() {
        this.b = new LinkedHashMap();
    }

    @Override  // androidx.work.impl.StartStopTokens
    public StartStopToken a(WorkSpec workSpec0) {
        return f.a(this, workSpec0);
    }

    @Override  // androidx.work.impl.StartStopTokens
    public boolean b(@l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        return this.b.containsKey(workGenerationalId0);
    }

    @Override  // androidx.work.impl.StartStopTokens
    @m
    public StartStopToken c(@l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        return (StartStopToken)this.b.remove(workGenerationalId0);
    }

    @Override  // androidx.work.impl.StartStopTokens
    public StartStopToken d(WorkSpec workSpec0) {
        return f.b(this, workSpec0);
    }

    @Override  // androidx.work.impl.StartStopTokens
    @l
    public StartStopToken e(@l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        Map map0 = this.b;
        StartStopToken startStopToken0 = map0.get(workGenerationalId0);
        if(startStopToken0 == null) {
            startStopToken0 = new StartStopToken(workGenerationalId0);
            map0.put(workGenerationalId0, startStopToken0);
        }
        return startStopToken0;
    }

    @Override  // androidx.work.impl.StartStopTokens
    @l
    public List remove(@l String s) {
        L.p(s, "workSpecId");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(L.g(((WorkGenerationalId)map$Entry0.getKey()).f(), s)) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        for(Object object1: linkedHashMap0.keySet()) {
            this.b.remove(((WorkGenerationalId)object1));
        }
        return u.V5(linkedHashMap0.values());
    }
}

