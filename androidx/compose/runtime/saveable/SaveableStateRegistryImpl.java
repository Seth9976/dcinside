package androidx.compose.runtime.saveable;

import A3.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1#2:160\n361#3,7:161\n215#4,2:168\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n119#1:161,7\n134#1:168,2\n*E\n"})
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    @l
    private final Function1 a;
    @l
    private final Map b;
    @l
    private final Map c;

    public SaveableStateRegistryImpl(@m Map map0, @l Function1 function10) {
        L.p(function10, "canBeSaved");
        Map map1;
        super();
        this.a = function10;
        if(map0 == null) {
            map1 = new LinkedHashMap();
        }
        else {
            map1 = Y.J0(map0);
            if(map1 == null) {
                map1 = new LinkedHashMap();
            }
        }
        this.b = map1;
        this.c = new LinkedHashMap();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean a(@l Object object0) {
        L.p(object0, "value");
        return ((Boolean)this.a.invoke(object0)).booleanValue();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Map c() {
        Map map0 = Y.J0(this.b);
        for(Object object0: this.c.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            List list0 = (List)((Map.Entry)object0).getValue();
            if(list0.size() == 1) {
                Object object1 = ((a)list0.get(0)).invoke();
                if(object1 == null) {
                    continue;
                }
                if(!this.a(object1)) {
                    throw new IllegalStateException("Check failed.");
                }
                map0.put(s, u.s(new Object[]{object1}));
            }
            else {
                int v = list0.size();
                ArrayList arrayList0 = new ArrayList(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object2 = ((a)list0.get(v1)).invoke();
                    if(object2 != null && !this.a(object2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    arrayList0.add(object2);
                }
                map0.put(s, arrayList0);
            }
        }
        return map0;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Entry e(@l String s, @l a a0) {
        L.p(s, "key");
        L.p(a0, "valueProvider");
        if(v.x3(s)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map map0 = this.c;
        ArrayList arrayList0 = map0.get(s);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            map0.put(s, arrayList0);
        }
        arrayList0.add(a0);
        return new Entry() {
            @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry$Entry
            public void a() {
                List list0 = (List)s.c.remove(a0);
                if(list0 != null) {
                    list0.remove(this.c);
                }
                if(list0 != null && !list0.isEmpty()) {
                    s.c.put(a0, list0);
                }
            }
        };
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m
    public Object f(@l String s) {
        L.p(s, "key");
        List list0 = (List)this.b.remove(s);
        if(list0 != null && !list0.isEmpty()) {
            if(list0.size() > 1) {
                List list1 = list0.subList(1, list0.size());
                this.b.put(s, list1);
            }
            return list0.get(0);
        }
        return null;
    }
}

