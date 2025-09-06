package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class kotlinx.serialization.internal.b0 extends k0 {
    @l
    private final f c;

    public kotlinx.serialization.internal.b0(@l i i0, @l i i1) {
        L.p(i0, "kSerializer");
        L.p(i1, "vSerializer");
        super(i0, i1, null);
        this.c = new a0(i0.getDescriptor(), i1.getDescriptor());
    }

    @Override  // kotlinx.serialization.internal.a
    public Object a() {
        return this.r();
    }

    @Override  // kotlinx.serialization.internal.a
    public int b(Object object0) {
        return this.s(((LinkedHashMap)object0));
    }

    @Override  // kotlinx.serialization.internal.a
    public void c(Object object0, int v) {
        this.t(((LinkedHashMap)object0), v);
    }

    @Override  // kotlinx.serialization.internal.a
    public Iterator d(Object object0) {
        return this.u(((Map)object0));
    }

    @Override  // kotlinx.serialization.internal.a
    public int e(Object object0) {
        return this.v(((Map)object0));
    }

    @Override  // kotlinx.serialization.internal.k0
    @l
    public f getDescriptor() {
        return this.c;
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.x(((Map)object0));
    }

    @Override  // kotlinx.serialization.internal.a
    public Object l(Object object0) {
        return this.y(((LinkedHashMap)object0));
    }

    @Override  // kotlinx.serialization.internal.k0
    public void o(Map map0, int v, Object object0, Object object1) {
        this.w(((LinkedHashMap)map0), v, object0, object1);
    }

    @l
    protected LinkedHashMap r() {
        return new LinkedHashMap();
    }

    protected int s(@l LinkedHashMap linkedHashMap0) {
        L.p(linkedHashMap0, "<this>");
        return linkedHashMap0.size() * 2;
    }

    protected void t(@l LinkedHashMap linkedHashMap0, int v) {
        L.p(linkedHashMap0, "<this>");
    }

    @l
    protected Iterator u(@l Map map0) {
        L.p(map0, "<this>");
        return map0.entrySet().iterator();
    }

    protected int v(@l Map map0) {
        L.p(map0, "<this>");
        return map0.size();
    }

    protected void w(@l LinkedHashMap linkedHashMap0, int v, Object object0, Object object1) {
        L.p(linkedHashMap0, "<this>");
        linkedHashMap0.put(object0, object1);
    }

    @l
    protected LinkedHashMap x(@l Map map0) {
        L.p(map0, "<this>");
        LinkedHashMap linkedHashMap0 = map0 instanceof LinkedHashMap ? ((LinkedHashMap)map0) : null;
        return linkedHashMap0 == null ? new LinkedHashMap(map0) : linkedHashMap0;
    }

    @l
    protected Map y(@l LinkedHashMap linkedHashMap0) {
        L.p(linkedHashMap0, "<this>");
        return linkedHashMap0;
    }
}

