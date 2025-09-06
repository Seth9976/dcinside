package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
public final class PersistentVector extends AbstractPersistentList implements PersistentList {
    @l
    private final Object[] c;
    @l
    private final Object[] d;
    private final int e;
    private final int f;

    public PersistentVector(@l Object[] arr_object, @l Object[] arr_object1, int v, int v1) {
        L.p(arr_object, "root");
        L.p(arr_object1, "tail");
        super();
        this.c = arr_object;
        this.d = arr_object1;
        this.e = v;
        this.f = v1;
        if(this.size() <= 0x20) {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + this.size()).toString());
        }
        boolean z = this.size() - (this.size() - 1 & 0xFFFFFFE0) > s.B(arr_object1.length, 0x20);
    }

    @Override  // kotlin.collections.c
    public int a() {
        return this.e;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList add(int v, Object object0) {
        ListImplementation.b(v, this.size());
        if(v == this.size()) {
            return this.add(object0);
        }
        int v1 = this.o();
        if(v >= v1) {
            return this.g(this.c, v - v1, object0);
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        return this.g(this.d(this.c, this.f, v, object0, objectRef0), 0, objectRef0.a());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList add(Object object0) {
        int v = this.size() - this.o();
        if(v < 0x20) {
            Object[] arr_object = Arrays.copyOf(this.d, 0x20);
            L.o(arr_object, "copyOf(this, newSize)");
            arr_object[v] = object0;
            return new PersistentVector(this.c, arr_object, this.size() + 1, this.f);
        }
        Object[] arr_object1 = UtilsKt.c(object0);
        return this.j(this.c, this.d, arr_object1);
    }

    private final Object[] b(int v) {
        if(this.o() <= v) {
            return this.d;
        }
        Object[] arr_object = this.c;
        for(int v1 = this.f; v1 > 0; v1 -= 5) {
            Object object0 = arr_object[v >> v1 & 0x1F];
            L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object = (Object[])object0;
        }
        return arr_object;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public Builder builder() {
        return this.c();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder builder() {
        return this.c();
    }

    @l
    public PersistentVectorBuilder c() {
        return new PersistentVectorBuilder(this, this.c, this.d, this.f);
    }

    private final Object[] d(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        if(v == 0) {
            if(v2 == 0) {
                arr_object1 = new Object[0x20];
            }
            else {
                arr_object1 = Arrays.copyOf(arr_object, 0x20);
                L.o(arr_object1, "copyOf(this, newSize)");
            }
            kotlin.collections.l.B0(arr_object, arr_object1, v2 + 1, v2, 0x1F);
            objectRef0.b(arr_object[0x1F]);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        L.o(arr_object2, "copyOf(this, newSize)");
        Object object1 = arr_object[v2];
        L.n(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = this.d(((Object[])object1), v - 5, v1, object0, objectRef0);
        for(int v3 = v2 + 1; v3 < 0x20 && arr_object2[v3] != null; ++v3) {
            Object object2 = arr_object[v3];
            L.n(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object2[v3] = this.d(((Object[])object2), v - 5, 0, objectRef0.a(), objectRef0);
        }
        return arr_object2;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection e(Function1 function10) {
        return this.e(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList e(@l Function1 function10) {
        L.p(function10, "predicate");
        PersistentVectorBuilder persistentVectorBuilder0 = this.c();
        persistentVectorBuilder0.J(function10);
        return persistentVectorBuilder0.build();
    }

    private final PersistentVector g(Object[] arr_object, int v, Object object0) {
        int v1 = this.size() - this.o();
        Object[] arr_object1 = Arrays.copyOf(this.d, 0x20);
        L.o(arr_object1, "copyOf(this, newSize)");
        if(v1 < 0x20) {
            kotlin.collections.l.B0(this.d, arr_object1, v + 1, v, v1);
            arr_object1[v] = object0;
            return new PersistentVector(arr_object, arr_object1, this.size() + 1, this.f);
        }
        Object object1 = this.d[0x1F];
        kotlin.collections.l.B0(this.d, arr_object1, v + 1, v, v1 - 1);
        arr_object1[v] = object0;
        return this.j(arr_object, arr_object1, UtilsKt.c(object1));
    }

    @Override  // kotlin.collections.c
    public Object get(int v) {
        ListImplementation.a(v, this.size());
        return this.b(v)[v & 0x1F];
    }

    private final Object[] h(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        if(v == 5) {
            objectRef0.b(arr_object[v2]);
            arr_object1 = null;
        }
        else {
            Object object0 = arr_object[v2];
            L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object1 = this.h(((Object[])object0), v - 5, v1, objectRef0);
        }
        if(arr_object1 == null && v2 == 0) {
            return null;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        L.o(arr_object2, "copyOf(this, newSize)");
        arr_object2[v2] = arr_object1;
        return arr_object2;
    }

    private final PersistentList i(Object[] arr_object, int v, int v1) {
        if(v1 == 0) {
            if(arr_object.length == 33) {
                arr_object = Arrays.copyOf(arr_object, 0x20);
                L.o(arr_object, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(arr_object);
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object1 = this.h(arr_object, v1, v - 1, objectRef0);
        L.m(arr_object1);
        Object object0 = objectRef0.a();
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        if(arr_object1[1] == null) {
            Object object1 = arr_object1[0];
            L.n(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new PersistentVector(((Object[])object1), ((Object[])object0), v, v1 - 5);
        }
        return new PersistentVector(arr_object1, ((Object[])object0), v, v1);
    }

    private final PersistentVector j(Object[] arr_object, Object[] arr_object1, Object[] arr_object2) {
        return this.size() >> 5 <= 1 << this.f ? new PersistentVector(this.k(arr_object, this.f, arr_object1), arr_object2, this.size() + 1, this.f) : new PersistentVector(this.k(UtilsKt.c(arr_object), this.f + 5, arr_object1), arr_object2, this.size() + 1, this.f + 5);
    }

    private final Object[] k(Object[] arr_object, int v, Object[] arr_object1) {
        Object[] arr_object2;
        int v1 = this.size() - 1 >> v & 0x1F;
        if(arr_object == null) {
            arr_object2 = new Object[0x20];
        }
        else {
            arr_object2 = Arrays.copyOf(arr_object, 0x20);
            L.o(arr_object2, "copyOf(this, newSize)");
            if(arr_object2 == null) {
                arr_object2 = new Object[0x20];
            }
        }
        if(v == 5) {
            arr_object2[v1] = arr_object1;
            return arr_object2;
        }
        arr_object2[v1] = this.k(((Object[])arr_object2[v1]), v - 5, arr_object1);
        return arr_object2;
    }

    private final Object[] l(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        int v3 = 0x1F;
        if(v == 0) {
            if(v2 == 0) {
                arr_object1 = new Object[0x20];
            }
            else {
                arr_object1 = Arrays.copyOf(arr_object, 0x20);
                L.o(arr_object1, "copyOf(this, newSize)");
            }
            kotlin.collections.l.B0(arr_object, arr_object1, v2, v2 + 1, 0x20);
            arr_object1[0x1F] = objectRef0.a();
            objectRef0.b(arr_object[v2]);
            return arr_object1;
        }
        if(arr_object[0x1F] == null) {
            v3 = this.o() - 1 >> v & 0x1F;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        L.o(arr_object2, "copyOf(this, newSize)");
        if(v2 + 1 <= v3) {
            while(true) {
                Object object0 = arr_object2[v3];
                L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                arr_object2[v3] = this.l(((Object[])object0), v - 5, 0, objectRef0);
                if(v3 == v2 + 1) {
                    break;
                }
                --v3;
            }
        }
        Object object1 = arr_object2[v2];
        L.n(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = this.l(((Object[])object1), v - 5, v1, objectRef0);
        return arr_object2;
    }

    @Override  // kotlin.collections.c
    @l
    public ListIterator listIterator(int v) {
        ListImplementation.b(v, this.size());
        return new PersistentVectorIterator(this.c, this.d, v, this.size(), this.f / 5 + 1);
    }

    private final PersistentList m(Object[] arr_object, int v, int v1, int v2) {
        int v3 = this.size() - v;
        if(v3 == 1) {
            return this.i(arr_object, v, v1);
        }
        Object[] arr_object1 = Arrays.copyOf(this.d, 0x20);
        L.o(arr_object1, "copyOf(this, newSize)");
        if(v2 < v3 - 1) {
            kotlin.collections.l.B0(this.d, arr_object1, v2, v2 + 1, v3);
        }
        arr_object1[v3 - 1] = null;
        return new PersistentVector(arr_object, arr_object1, v + v3 - 1, v1);
    }

    private final int o() {
        return this.size() - 1 & 0xFFFFFFE0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList o2(int v) {
        ListImplementation.a(v, this.size());
        int v1 = this.o();
        if(v >= v1) {
            return this.m(this.c, v1, this.f, v - v1);
        }
        ObjectRef objectRef0 = new ObjectRef(this.d[0]);
        return this.m(this.l(this.c, this.f, v, objectRef0), v1, this.f, 0);
    }

    private final Object[] p(Object[] arr_object, int v, int v1, Object object0) {
        int v2 = v1 >> v & 0x1F;
        Object[] arr_object1 = Arrays.copyOf(arr_object, 0x20);
        L.o(arr_object1, "copyOf(this, newSize)");
        if(v == 0) {
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object object1 = arr_object1[v2];
        L.n(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object1[v2] = this.p(((Object[])object1), v - 5, v1, object0);
        return arr_object1;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList set(int v, Object object0) {
        ListImplementation.a(v, this.size());
        if(this.o() <= v) {
            Object[] arr_object = Arrays.copyOf(this.d, 0x20);
            L.o(arr_object, "copyOf(this, newSize)");
            arr_object[v & 0x1F] = object0;
            return new PersistentVector(this.c, arr_object, this.size(), this.f);
        }
        return new PersistentVector(this.p(this.c, this.f, v, object0), this.d, this.size(), this.f);
    }
}

