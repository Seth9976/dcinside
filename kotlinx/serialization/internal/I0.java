package kotlinx.serialization.internal;

import java.util.Map.Entry;
import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.k.c;
import kotlinx.serialization.i;
import y4.l;
import y4.m;

@b0
public final class i0 extends Z {
    static final class a implements B3.a, Map.Entry {
        private final Object a;
        private final Object b;

        public a(Object object0, Object object1) {
            this.a = object0;
            this.b = object1;
        }

        public final Object a() {
            return this.getKey();
        }

        public final Object b() {
            return this.getValue();
        }

        @l
        public final a c(Object object0, Object object1) {
            return new a(object0, object1);
        }

        public static a d(a i0$a0, Object object0, Object object1, int v, Object object2) {
            if((v & 1) != 0) {
                object0 = i0$a0.getKey();
            }
            if((v & 2) != 0) {
                object1 = i0$a0.getValue();
            }
            return i0$a0.c(object0, object1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            return L.g(this.getKey(), ((a)object0).getKey()) ? L.g(this.getValue(), ((a)object0).getValue()) : false;
        }

        @Override
        public Object getKey() {
            return this.a;
        }

        @Override
        public Object getValue() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.getKey() == null ? 0 : this.getKey().hashCode();
            if(this.getValue() != null) {
                v = this.getValue().hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        public Object setValue(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        @l
        public String toString() {
            return "MapEntry(key=" + this.getKey() + ", value=" + this.getValue() + ')';
        }
    }

    @l
    private final f c;

    public i0(@l i i0, @l i i1) {
        static final class b extends N implements Function1 {
            final i e;
            final i f;

            b(i i0, i i1) {
                this.e = i0;
                this.f = i1;
                super(1);
            }

            public final void a(@l kotlinx.serialization.descriptors.a a0) {
                L.p(a0, "$this$buildSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(a0, "key", this.e.getDescriptor(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(a0, "value", this.f.getDescriptor(), null, false, 12, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((kotlinx.serialization.descriptors.a)object0));
                return S0.a;
            }
        }

        L.p(i0, "keySerializer");
        L.p(i1, "valueSerializer");
        super(i0, i1, null);
        b i0$b0 = new b(i0, i1);
        this.c = kotlinx.serialization.descriptors.i.e("kotlin.collections.Map.Entry", c.a, new f[0], i0$b0);
    }

    @Override  // kotlinx.serialization.internal.Z
    public Object a(Object object0) {
        return this.f(((Map.Entry)object0));
    }

    @Override  // kotlinx.serialization.internal.Z
    public Object c(Object object0) {
        return this.g(((Map.Entry)object0));
    }

    @Override  // kotlinx.serialization.internal.Z
    public Object e(Object object0, Object object1) {
        return this.h(object0, object1);
    }

    protected Object f(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "<this>");
        return map$Entry0.getKey();
    }

    protected Object g(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "<this>");
        return map$Entry0.getValue();
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return this.c;
    }

    @l
    protected Map.Entry h(Object object0, Object object1) {
        return new a(object0, object1);
    }
}

