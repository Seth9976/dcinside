package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public abstract class AbstractApplier implements Applier {
    private final Object a;
    @l
    private final List b;
    private Object c;
    public static final int d = 8;

    static {
    }

    public AbstractApplier(Object object0) {
        this.a = object0;
        this.b = new ArrayList();
        this.c = object0;
    }

    @Override  // androidx.compose.runtime.Applier
    public Object a() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.Applier
    public void c() {
    }

    @Override  // androidx.compose.runtime.Applier
    public final void clear() {
        this.b.clear();
        this.n(this.a);
        this.l();
    }

    @Override  // androidx.compose.runtime.Applier
    public void d() {
    }

    @Override  // androidx.compose.runtime.Applier
    public void h(Object object0) {
        this.b.add(this.a());
        this.n(object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void i() {
        if(this.b.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        this.n(this.b.remove(this.b.size() - 1));
    }

    public final Object j() {
        return this.a;
    }

    protected final void k(@l List list0, int v, int v1, int v2) {
        L.p(list0, "<this>");
        int v3 = v <= v1 ? v1 - v2 : v1;
        if(v2 == 1) {
            if(v != v1 + 1 && v != v1 - 1) {
                list0.add(v3, list0.remove(v));
                return;
            }
            list0.set(v, list0.set(v1, list0.get(v)));
            return;
        }
        List list1 = list0.subList(v, v2 + v);
        List list2 = u.Y5(list1);
        list1.clear();
        list0.addAll(v3, list2);
    }

    protected abstract void l();

    protected final void m(@l List list0, int v, int v1) {
        L.p(list0, "<this>");
        if(v1 == 1) {
            list0.remove(v);
            return;
        }
        list0.subList(v, v1 + v).clear();
    }

    protected void n(Object object0) {
        this.c = object0;
    }
}

