package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({Scope.a})
public final class DirectedAcyclicGraph {
    private final Pool a;
    private final SimpleArrayMap b;
    private final ArrayList c;
    private final HashSet d;

    public DirectedAcyclicGraph() {
        this.a = new SimplePool(10);
        this.b = new SimpleArrayMap();
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    public void a(@NonNull Object object0, @NonNull Object object1) {
        if(!this.b.containsKey(object0) || !this.b.containsKey(object1)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList0 = (ArrayList)this.b.get(object0);
        if(arrayList0 == null) {
            arrayList0 = this.f();
            this.b.put(object0, arrayList0);
        }
        arrayList0.add(object1);
    }

    public void b(@NonNull Object object0) {
        if(!this.b.containsKey(object0)) {
            this.b.put(object0, null);
        }
    }

    public void c() {
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = (ArrayList)this.b.l(v1);
            if(arrayList0 != null) {
                this.k(arrayList0);
            }
        }
        this.b.clear();
    }

    public boolean d(@NonNull Object object0) {
        return this.b.containsKey(object0);
    }

    private void e(Object object0, ArrayList arrayList0, HashSet hashSet0) {
        if(arrayList0.contains(object0)) {
            return;
        }
        if(hashSet0.contains(object0)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet0.add(object0);
        ArrayList arrayList1 = (ArrayList)this.b.get(object0);
        if(arrayList1 != null) {
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                this.e(arrayList1.get(v1), arrayList0, hashSet0);
            }
        }
        hashSet0.remove(object0);
        arrayList0.add(object0);
    }

    @NonNull
    private ArrayList f() {
        ArrayList arrayList0 = (ArrayList)this.a.b();
        return arrayList0 == null ? new ArrayList() : arrayList0;
    }

    @Nullable
    public List g(@NonNull Object object0) {
        return (List)this.b.get(object0);
    }

    @Nullable
    public List h(@NonNull Object object0) {
        int v = this.b.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = (ArrayList)this.b.l(v1);
            if(arrayList0 != null && arrayList0.contains(object0)) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                ((ArrayList)list0).add(this.b.g(v1));
            }
        }
        return list0;
    }

    @NonNull
    public ArrayList i() {
        this.c.clear();
        this.d.clear();
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.e(this.b.g(v1), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(@NonNull Object object0) {
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = (ArrayList)this.b.l(v1);
            if(arrayList0 != null && arrayList0.contains(object0)) {
                return true;
            }
        }
        return false;
    }

    private void k(@NonNull ArrayList arrayList0) {
        arrayList0.clear();
        this.a.a(arrayList0);
    }

    int l() {
        return this.b.size();
    }
}

