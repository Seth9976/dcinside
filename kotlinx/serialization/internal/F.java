package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.h;
import kotlinx.serialization.i;
import y4.l;

@b0
@h
public final class f extends y {
    @l
    private final kotlinx.serialization.descriptors.f b;

    public f(@l i i0) {
        L.p(i0, "element");
        super(i0);
        this.b = new e(i0.getDescriptor());
    }

    @Override  // kotlinx.serialization.internal.a
    public Object a() {
        return this.q();
    }

    @Override  // kotlinx.serialization.internal.a
    public int b(Object object0) {
        return this.r(((ArrayList)object0));
    }

    @Override  // kotlinx.serialization.internal.a
    public void c(Object object0, int v) {
        this.s(((ArrayList)object0), v);
    }

    @Override  // kotlinx.serialization.internal.x
    @l
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.b;
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.u(((List)object0));
    }

    @Override  // kotlinx.serialization.internal.a
    public Object l(Object object0) {
        return this.v(((ArrayList)object0));
    }

    @Override  // kotlinx.serialization.internal.x
    public void n(Object object0, int v, Object object1) {
        this.t(((ArrayList)object0), v, object1);
    }

    @l
    protected ArrayList q() {
        return new ArrayList();
    }

    protected int r(@l ArrayList arrayList0) {
        L.p(arrayList0, "<this>");
        return arrayList0.size();
    }

    protected void s(@l ArrayList arrayList0, int v) {
        L.p(arrayList0, "<this>");
        arrayList0.ensureCapacity(v);
    }

    protected void t(@l ArrayList arrayList0, int v, Object object0) {
        L.p(arrayList0, "<this>");
        arrayList0.add(v, object0);
    }

    @l
    protected ArrayList u(@l List list0) {
        L.p(list0, "<this>");
        ArrayList arrayList0 = list0 instanceof ArrayList ? ((ArrayList)list0) : null;
        return arrayList0 == null ? new ArrayList(list0) : arrayList0;
    }

    @l
    protected List v(@l ArrayList arrayList0) {
        L.p(arrayList0, "<this>");
        return arrayList0;
    }
}

