package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.j;
import kotlin.ranges.s;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c.b;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.h;
import kotlinx.serialization.i;
import y4.l;

@h
public abstract class k0 extends a {
    @l
    private final i a;
    @l
    private final i b;

    private k0(i i0, i i1) {
        super(null);
        this.a = i0;
        this.b = i1;
    }

    public k0(i i0, i i1, w w0) {
        this(i0, i1);
    }

    @Override  // kotlinx.serialization.internal.a
    public void g(c c0, Object object0, int v, int v1) {
        this.p(c0, ((Map)object0), v, v1);
    }

    @Override  // kotlinx.serialization.i
    @l
    public abstract f getDescriptor();

    @Override  // kotlinx.serialization.internal.a
    public void h(c c0, int v, Object object0, boolean z) {
        this.q(c0, v, ((Map)object0), z);
    }

    @l
    public final i m() {
        return this.a;
    }

    @l
    public final i n() {
        return this.b;
    }

    protected abstract void o(@l Map arg1, int arg2, Object arg3, Object arg4);

    protected final void p(@l c c0, @l Map map0, int v, int v1) {
        L.p(c0, "decoder");
        L.p(map0, "builder");
        if(v1 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        j j0 = s.B1(s.W1(0, v1 * 2), 2);
        int v2 = j0.g();
        int v3 = j0.h();
        int v4 = j0.i();
        if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
            while(true) {
                this.q(c0, v + v2, map0, false);
                if(v2 == v3) {
                    break;
                }
                v2 += v4;
            }
        }
    }

    protected final void q(@l c c0, int v, @l Map map0, boolean z) {
        Object object2;
        int v1;
        L.p(c0, "decoder");
        L.p(map0, "builder");
        Object object0 = b.d(c0, this.getDescriptor(), v, this.a, null, 8, null);
        if(z) {
            v1 = c0.w(this.getDescriptor());
            if(v1 != v + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + v + ", returned index for value: " + v1).toString());
            }
        }
        else {
            v1 = v + 1;
        }
        if(!map0.containsKey(object0) || this.b.getDescriptor().getKind() instanceof e) {
            object2 = b.d(c0, this.getDescriptor(), v1, this.b, null, 8, null);
        }
        else {
            f f0 = this.getDescriptor();
            Object object1 = Y.K(map0, object0);
            object2 = c0.p(f0, v1, this.b, object1);
        }
        map0.put(object0, object2);
    }

    @Override  // kotlinx.serialization.internal.a
    public void serialize(@l g g0, Object object0) {
        L.p(g0, "encoder");
        int v = this.e(object0);
        f f0 = this.getDescriptor();
        d d0 = g0.z(f0, v);
        int v1 = 0;
        Iterator iterator0 = this.d(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Object object2 = ((Map.Entry)object1).getKey();
            Object object3 = ((Map.Entry)object1).getValue();
            int v2 = v1 + 1;
            d0.G(this.getDescriptor(), v1, this.m(), object2);
            v1 += 2;
            d0.G(this.getDescriptor(), v2, this.n(), object3);
        }
        d0.c(f0);
    }
}

