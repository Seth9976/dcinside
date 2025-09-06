package kotlinx.serialization.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class d0 extends y {
    @l
    private final f b;

    public d0(@l i i0) {
        L.p(i0, "eSerializer");
        super(i0);
        this.b = new c0(i0.getDescriptor());
    }

    @Override  // kotlinx.serialization.internal.a
    public Object a() {
        return this.q();
    }

    @Override  // kotlinx.serialization.internal.a
    public int b(Object object0) {
        return this.r(((LinkedHashSet)object0));
    }

    @Override  // kotlinx.serialization.internal.a
    public void c(Object object0, int v) {
        this.s(((LinkedHashSet)object0), v);
    }

    @Override  // kotlinx.serialization.internal.x
    @l
    public f getDescriptor() {
        return this.b;
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.u(((Set)object0));
    }

    @Override  // kotlinx.serialization.internal.a
    public Object l(Object object0) {
        return this.v(((LinkedHashSet)object0));
    }

    @Override  // kotlinx.serialization.internal.x
    public void n(Object object0, int v, Object object1) {
        this.t(((LinkedHashSet)object0), v, object1);
    }

    @l
    protected LinkedHashSet q() {
        return new LinkedHashSet();
    }

    protected int r(@l LinkedHashSet linkedHashSet0) {
        L.p(linkedHashSet0, "<this>");
        return linkedHashSet0.size();
    }

    protected void s(@l LinkedHashSet linkedHashSet0, int v) {
        L.p(linkedHashSet0, "<this>");
    }

    protected void t(@l LinkedHashSet linkedHashSet0, int v, Object object0) {
        L.p(linkedHashSet0, "<this>");
        linkedHashSet0.add(object0);
    }

    @l
    protected LinkedHashSet u(@l Set set0) {
        L.p(set0, "<this>");
        LinkedHashSet linkedHashSet0 = set0 instanceof LinkedHashSet ? ((LinkedHashSet)set0) : null;
        return linkedHashSet0 == null ? new LinkedHashSet(set0) : linkedHashSet0;
    }

    @l
    protected Set v(@l LinkedHashSet linkedHashSet0) {
        L.p(linkedHashSet0, "<this>");
        return linkedHashSet0;
    }
}

