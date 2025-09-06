package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,992:1\n26#2:993\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n623#1:993\n*E\n"})
public final class PersistentVectorBuilder extends f implements Builder {
    @l
    private PersistentList a;
    @m
    private Object[] b;
    @l
    private Object[] c;
    private int d;
    @l
    private MutabilityOwnership e;
    @m
    private Object[] f;
    @l
    private Object[] g;
    private int h;

    public PersistentVectorBuilder(@l PersistentList persistentList0, @m Object[] arr_object, @l Object[] arr_object1, int v) {
        L.p(persistentList0, "vector");
        L.p(arr_object1, "vectorTail");
        super();
        this.a = persistentList0;
        this.b = arr_object;
        this.c = arr_object1;
        this.d = v;
        this.e = new MutabilityOwnership();
        this.f = this.b;
        this.g = this.c;
        this.h = this.a.size();
    }

    private final void A(Object[] arr_object, int v, int v1) {
        if(v1 == 0) {
            this.f = null;
            if(arr_object == null) {
                arr_object = new Object[0];
            }
            this.g = arr_object;
            this.h = v;
            this.d = 0;
            return;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        L.m(arr_object);
        Object[] arr_object1 = this.z(arr_object, v1, v, objectRef0);
        L.m(arr_object1);
        Object object0 = objectRef0.a();
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.g = (Object[])object0;
        this.h = v;
        if(arr_object1[1] == null) {
            this.f = (Object[])arr_object1[0];
            this.d = v1 - 5;
            return;
        }
        this.f = arr_object1;
        this.d = v1;
    }

    private final Object[] B(Object[] arr_object, int v, int v1, Iterator iterator0) {
        if(!iterator0.hasNext() || v1 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v1 == 0) {
            return iterator0.next();
        }
        Object[] arr_object1 = this.q(arr_object);
        int v2 = v >> v1 & 0x1F;
        arr_object1[v2] = this.B(((Object[])arr_object1[v2]), v, v1 - 5, iterator0);
        while(true) {
            ++v2;
            if(v2 >= 0x20 || !iterator0.hasNext()) {
                break;
            }
            arr_object1[v2] = this.B(((Object[])arr_object1[v2]), 0, v1 - 5, iterator0);
        }
        return arr_object1;
    }

    private final Object[] C(Object[] arr_object, int v, Object[][] arr2_object) {
        Iterator iterator0 = i.a(arr2_object);
        int v1 = this.d;
        Object[] arr_object1 = v >> 5 >= 1 << v1 ? this.q(arr_object) : this.B(arr_object, v, v1, iterator0);
        while(iterator0.hasNext()) {
            this.d += 5;
            arr_object1 = this.x(arr_object1);
            this.B(arr_object1, 1 << this.d, this.d, iterator0);
        }
        return arr_object1;
    }

    private final void D(Object[] arr_object, Object[] arr_object1, Object[] arr_object2) {
        int v = this.d;
        if(this.size() >> 5 > 1 << v) {
            this.f = this.E(this.x(arr_object), arr_object1, this.d + 5);
            this.g = arr_object2;
            this.d += 5;
            this.h = this.size() + 1;
            return;
        }
        if(arr_object == null) {
            this.f = arr_object1;
            this.g = arr_object2;
            this.h = this.size() + 1;
            return;
        }
        this.f = this.E(arr_object, arr_object1, v);
        this.g = arr_object2;
        this.h = this.size() + 1;
    }

    private final Object[] E(Object[] arr_object, Object[] arr_object1, int v) {
        int v1 = this.size() - 1 >> v & 0x1F;
        Object[] arr_object2 = this.q(arr_object);
        if(v == 5) {
            arr_object2[v1] = arr_object1;
            return arr_object2;
        }
        arr_object2[v1] = this.E(((Object[])arr_object2[v1]), arr_object1, v - 5);
        return arr_object2;
    }

    private final int F(Function1 function10, Object[] arr_object, int v, int v1, ObjectRef objectRef0, List list0, List list1) {
        if(this.o(arr_object)) {
            list0.add(arr_object);
        }
        Object object0 = objectRef0.a();
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] arr_object1 = (Object[])object0;
        for(int v2 = 0; v2 < v; ++v2) {
            Object object1 = arr_object[v2];
            if(!((Boolean)function10.invoke(object1)).booleanValue()) {
                if(v1 == 0x20) {
                    arr_object1 = list0.isEmpty() ? this.u() : ((Object[])list0.remove(list0.size() - 1));
                    v1 = 0;
                }
                arr_object1[v1] = object1;
                ++v1;
            }
        }
        objectRef0.b(arr_object1);
        if(((Object[])object0) != objectRef0.a()) {
            list1.add(((Object[])object0));
        }
        return v1;
    }

    private final int G(Function1 function10, Object[] arr_object, int v, ObjectRef objectRef0) {
        Object[] arr_object1 = arr_object;
        int v2 = v;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                if(z) {
                    arr_object1[v2] = object0;
                    ++v2;
                }
            }
            else if(!z) {
                arr_object1 = this.q(arr_object);
                z = true;
                v2 = v1;
            }
        }
        objectRef0.b(arr_object1);
        return v2;
    }

    private final boolean H(Function1 function10) {
        Object[] arr_object;
        int v = this.W();
        ObjectRef objectRef0 = new ObjectRef(null);
        if(this.f == null) {
            return this.I(function10, v, objectRef0) != v;
        }
        ListIterator listIterator0 = this.p(0);
        int v1;
        for(v1 = 0x20; v1 == 0x20 && listIterator0.hasNext(); v1 = this.G(function10, ((Object[])listIterator0.next()), 0x20, objectRef0)) {
        }
        if(v1 == 0x20) {
            listIterator0.hasNext();
            int v2 = this.I(function10, v, objectRef0);
            if(v2 == 0) {
                this.A(this.f, this.size(), this.d);
            }
            return v2 != v;
        }
        int v3 = listIterator0.previousIndex() << 5;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        int v4;
        for(v4 = v1; listIterator0.hasNext(); v4 = this.F(function10, ((Object[])listIterator0.next()), 0x20, v4, objectRef0, arrayList1, arrayList0)) {
        }
        int v5 = this.F(function10, this.g, v, v4, objectRef0, arrayList1, arrayList0);
        Object object0 = objectRef0.a();
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        kotlin.collections.l.M1(((Object[])object0), null, v5, 0x20);
        if(arrayList0.isEmpty()) {
            arr_object = this.f;
            L.m(arr_object);
        }
        else {
            arr_object = this.B(this.f, v3, this.d, arrayList0.iterator());
        }
        int v6 = v3 + (arrayList0.size() << 5);
        this.f = this.N(arr_object, v6);
        this.g = (Object[])object0;
        this.h = v6 + v5;
        return true;
    }

    private final int I(Function1 function10, int v, ObjectRef objectRef0) {
        int v1 = this.G(function10, this.g, v, objectRef0);
        if(v1 == v) {
            boolean z = objectRef0.a() != this.g;
            return v;
        }
        Object object0 = objectRef0.a();
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        kotlin.collections.l.M1(((Object[])object0), null, v1, v);
        this.g = (Object[])object0;
        this.h = this.size() - (v - v1);
        return v1;
    }

    public final boolean J(@l Function1 function10) {
        L.p(function10, "predicate");
        boolean z = this.H(function10);
        if(z) {
            ++this.modCount;
        }
        return z;
    }

    private final Object[] K(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        int v3 = 0x1F;
        if(v == 0) {
            Object object0 = arr_object[v2];
            Object[] arr_object1 = kotlin.collections.l.B0(arr_object, this.q(arr_object), v2, v2 + 1, 0x20);
            arr_object1[0x1F] = objectRef0.a();
            objectRef0.b(object0);
            return arr_object1;
        }
        if(arr_object[0x1F] == null) {
            v3 = this.O() - 1 >> v & 0x1F;
        }
        Object[] arr_object2 = this.q(arr_object);
        if(v2 + 1 <= v3) {
            while(true) {
                Object object1 = arr_object2[v3];
                L.n(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                arr_object2[v3] = this.K(((Object[])object1), v - 5, 0, objectRef0);
                if(v3 == v2 + 1) {
                    break;
                }
                --v3;
            }
        }
        Object object2 = arr_object2[v2];
        L.n(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = this.K(((Object[])object2), v - 5, v1, objectRef0);
        return arr_object2;
    }

    private final Object M(Object[] arr_object, int v, int v1, int v2) {
        int v3 = this.size() - v;
        if(v3 == 1) {
            Object object0 = this.g[0];
            this.A(arr_object, v, v1);
            return object0;
        }
        Object[] arr_object1 = this.g;
        Object object1 = arr_object1[v2];
        Object[] arr_object2 = kotlin.collections.l.B0(arr_object1, this.q(arr_object1), v2, v2 + 1, v3);
        arr_object2[v3 - 1] = null;
        this.f = arr_object;
        this.g = arr_object2;
        this.h = v + v3 - 1;
        this.d = v1;
        return object1;
    }

    private final Object[] N(Object[] arr_object, int v) {
        int v1;
        if((v & 0x1F) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v == 0) {
            this.d = 0;
            return null;
        }
        while(true) {
            v1 = this.d;
            if(v - 1 >> v1 != 0) {
                break;
            }
            this.d = v1 - 5;
            Object object0 = arr_object[0];
            L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object = (Object[])object0;
        }
        return this.y(arr_object, v - 1, v1);
    }

    private final int O() {
        return this.size() > 0x20 ? this.size() - 1 & 0xFFFFFFE0 : 0;
    }

    private final Object[] P(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        Object[] arr_object1 = this.q(arr_object);
        if(v == 0) {
            if(arr_object1 != arr_object) {
                ++this.modCount;
            }
            objectRef0.b(arr_object1[v2]);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object object1 = arr_object1[v2];
        L.n(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object1[v2] = this.P(((Object[])object1), v - 5, v1, object0, objectRef0);
        return arr_object1;
    }

    public final void S(int v) {
        this.d = v;
    }

    private final Object[] U(int v, int v1, Object[][] arr2_object, int v2, Object[] arr_object) {
        if(this.f == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ListIterator listIterator0 = this.p(this.O() >> 5);
        while(listIterator0.previousIndex() != v) {
            Object[] arr_object1 = (Object[])listIterator0.previous();
            kotlin.collections.l.B0(arr_object1, arr_object, 0, 0x20 - v1, 0x20);
            arr_object = this.r(arr_object1, v1);
            --v2;
            arr2_object[v2] = arr_object;
        }
        return (Object[])listIterator0.previous();
    }

    private final void V(Collection collection0, int v, Object[] arr_object, int v1, Object[][] arr2_object, int v2, Object[] arr_object1) {
        Object[] arr_object3;
        if(v2 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] arr_object2 = this.q(arr_object);
        arr2_object[0] = arr_object2;
        int v4 = v + collection0.size() - 1 & 0x1F;
        int v5 = v1 - (v & 0x1F) + v4;
        if(v5 < 0x20) {
            kotlin.collections.l.B0(arr_object2, arr_object1, v4 + 1, v & 0x1F, v1);
        }
        else {
            if(v2 == 1) {
                arr_object3 = arr_object2;
            }
            else {
                arr_object3 = this.u();
                --v2;
                arr2_object[v2] = arr_object3;
            }
            int v6 = v1 - (v5 - 0x1F);
            kotlin.collections.l.B0(arr_object2, arr_object1, 0, v6, v1);
            kotlin.collections.l.B0(arr_object2, arr_object3, v4 + 1, v & 0x1F, v6);
            arr_object1 = arr_object3;
        }
        Iterator iterator0 = collection0.iterator();
        this.d(arr_object2, v & 0x1F, iterator0);
        for(int v3 = 1; v3 < v2; ++v3) {
            arr2_object[v3] = this.d(this.u(), 0, iterator0);
        }
        this.d(arr_object1, 0, iterator0);
    }

    private final int W() {
        return this.X(this.size());
    }

    private final int X(int v) {
        return v > 0x20 ? v - (v - 1 & 0xFFFFFFE0) : v;
    }

    @Override  // kotlin.collections.f
    public int a() {
        return this.h;
    }

    @Override  // kotlin.collections.f
    public void add(int v, Object object0) {
        ListImplementation.b(v, this.size());
        if(v == this.size()) {
            this.add(object0);
            return;
        }
        ++this.modCount;
        int v1 = this.O();
        if(v >= v1) {
            this.m(this.f, v - v1, object0);
            return;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object = this.f;
        L.m(arr_object);
        this.m(this.l(arr_object, this.d, v, object0, objectRef0), 0, objectRef0.a());
    }

    @Override
    public boolean add(Object object0) {
        ++this.modCount;
        int v = this.W();
        if(v < 0x20) {
            Object[] arr_object = this.q(this.g);
            arr_object[v] = object0;
            this.g = arr_object;
            this.h = this.size() + 1;
            return true;
        }
        Object[] arr_object1 = this.x(object0);
        this.D(this.f, this.g, arr_object1);
        return true;
    }

    @Override
    public boolean addAll(int v, @l Collection collection0) {
        Object[] arr_object1;
        L.p(collection0, "elements");
        ListImplementation.b(v, this.size());
        if(v == this.size()) {
            return this.addAll(collection0);
        }
        if(collection0.isEmpty()) {
            return false;
        }
        ++this.modCount;
        int v1 = v >> 5 << 5;
        int v2 = (this.size() - v1 + collection0.size() - 1) / 0x20;
        if(v2 == 0) {
            Object[] arr_object = kotlin.collections.l.B0(this.g, this.q(this.g), (v + collection0.size() - 1 & 0x1F) + 1, v & 0x1F, this.W());
            this.d(arr_object, v & 0x1F, collection0.iterator());
            this.g = arr_object;
            this.h = this.size() + collection0.size();
            return true;
        }
        Object[][] arr2_object = new Object[v2][];
        int v3 = this.W();
        int v4 = this.X(this.size() + collection0.size());
        if(v >= this.O()) {
            arr_object1 = this.u();
            this.V(collection0, v, this.g, v3, arr2_object, v2, arr_object1);
        }
        else if(v4 > v3) {
            int v5 = v4 - v3;
            arr_object1 = this.r(this.g, v5);
            this.k(collection0, v, v5, arr2_object, v2, arr_object1);
        }
        else {
            int v6 = v3 - v4;
            arr_object1 = kotlin.collections.l.B0(this.g, this.u(), 0, v6, v3);
            Object[] arr_object2 = this.r(this.g, 0x20 - v6);
            arr2_object[v2 - 1] = arr_object2;
            this.k(collection0, v, 0x20 - v6, arr2_object, v2 - 1, arr_object2);
        }
        this.f = this.C(this.f, v1, arr2_object);
        this.g = arr_object1;
        this.h = this.size() + collection0.size();
        return true;
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        ++this.modCount;
        int v = this.W();
        Iterator iterator0 = collection0.iterator();
        if(0x20 - v >= collection0.size()) {
            this.g = this.d(this.q(this.g), v, iterator0);
            this.h = this.size() + collection0.size();
            return true;
        }
        int v1 = (collection0.size() + v - 1) / 0x20;
        Object[][] arr2_object = new Object[v1][];
        arr2_object[0] = this.d(this.q(this.g), v, iterator0);
        for(int v2 = 1; v2 < v1; ++v2) {
            arr2_object[v2] = this.d(this.u(), 0, iterator0);
        }
        this.f = this.C(this.f, this.O(), arr2_object);
        this.g = this.d(this.u(), 0, iterator0);
        this.h = this.size() + collection0.size();
        return true;
    }

    @Override  // kotlin.collections.f
    public Object b(int v) {
        ListImplementation.a(v, this.size());
        ++this.modCount;
        int v1 = this.O();
        if(v >= v1) {
            return this.M(this.f, v1, this.d, v - v1);
        }
        ObjectRef objectRef0 = new ObjectRef(this.g[0]);
        Object[] arr_object = this.f;
        L.m(arr_object);
        this.M(this.K(arr_object, this.d, v, objectRef0), v1, this.d, 0);
        return objectRef0.a();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList$Builder
    @l
    public PersistentList build() {
        PersistentList persistentList0;
        if(this.f != this.b || this.g != this.c) {
            this.e = new MutabilityOwnership();
            this.b = this.f;
            Object[] arr_object = this.g;
            this.c = arr_object;
            if(this.f != null) {
                Object[] arr_object2 = this.f;
                L.m(arr_object2);
                persistentList0 = new PersistentVector(arr_object2, this.g, this.size(), this.d);
            }
            else if(arr_object.length == 0) {
                persistentList0 = UtilsKt.b();
            }
            else {
                Object[] arr_object1 = Arrays.copyOf(this.g, this.size());
                L.o(arr_object1, "copyOf(this, newSize)");
                persistentList0 = new SmallPersistentVector(arr_object1);
            }
        }
        else {
            persistentList0 = this.a;
        }
        this.a = persistentList0;
        return persistentList0;
    }

    private final Object[] c(int v) {
        if(this.O() <= v) {
            return this.g;
        }
        Object[] arr_object = this.f;
        L.m(arr_object);
        for(int v1 = this.d; v1 > 0; v1 -= 5) {
            Object object0 = arr_object[v >> v1 & 0x1F];
            L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object = (Object[])object0;
        }
        return arr_object;
    }

    private final Object[] d(Object[] arr_object, int v, Iterator iterator0) {
        while(v < 0x20 && iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arr_object[v] = object0;
            ++v;
        }
        return arr_object;
    }

    public final int g() {
        return this.modCount;
    }

    @Override
    public Object get(int v) {
        ListImplementation.a(v, this.size());
        return this.c(v)[v & 0x1F];
    }

    @m
    public final Object[] h() {
        return this.f;
    }

    public final int i() {
        return this.d;
    }

    @Override
    @l
    public Iterator iterator() {
        return this.listIterator();
    }

    @l
    public final Object[] j() {
        return this.g;
    }

    private final void k(Collection collection0, int v, int v1, Object[][] arr2_object, int v2, Object[] arr_object) {
        if(this.f == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object[] arr_object1 = this.U(v >> 5, v1, arr2_object, v2, arr_object);
        int v3 = v2 - ((this.O() >> 5) - 1 - (v >> 5));
        if(v3 < v2) {
            arr_object = arr2_object[v3];
            L.m(arr_object);
        }
        this.V(collection0, v, arr_object1, 0x20, arr2_object, v3, arr_object);
    }

    private final Object[] l(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        if(v == 0) {
            objectRef0.b(arr_object[0x1F]);
            Object[] arr_object1 = kotlin.collections.l.B0(arr_object, this.q(arr_object), v2 + 1, v2, 0x1F);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object[] arr_object2 = this.q(arr_object);
        Object object1 = arr_object2[v2];
        L.n(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = this.l(((Object[])object1), v - 5, v1, object0, objectRef0);
        while(true) {
            ++v2;
            if(v2 >= 0x20) {
                break;
            }
            Object object2 = arr_object2[v2];
            if(object2 == null) {
                break;
            }
            L.n(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object2[v2] = this.l(((Object[])object2), v - 5, 0, objectRef0.a(), objectRef0);
        }
        return arr_object2;
    }

    @Override
    @l
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        ListImplementation.b(v, this.size());
        return new PersistentVectorMutableIterator(this, v);
    }

    private final void m(Object[] arr_object, int v, Object object0) {
        int v1 = this.W();
        Object[] arr_object1 = this.q(this.g);
        if(v1 < 0x20) {
            kotlin.collections.l.B0(this.g, arr_object1, v + 1, v, v1);
            arr_object1[v] = object0;
            this.f = arr_object;
            this.g = arr_object1;
            this.h = this.size() + 1;
            return;
        }
        Object[] arr_object2 = this.g;
        Object object1 = arr_object2[0x1F];
        kotlin.collections.l.B0(arr_object2, arr_object1, v + 1, v, 0x1F);
        arr_object1[v] = object0;
        this.D(arr_object, arr_object1, this.x(object1));
    }

    private final boolean o(Object[] arr_object) {
        return arr_object.length == 33 && arr_object[0x20] == this.e;
    }

    private final ListIterator p(int v) {
        if(this.f == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int v1 = this.O();
        ListImplementation.b(v, v1 >> 5);
        int v2 = this.d;
        if(v2 == 0) {
            Object[] arr_object = this.f;
            L.m(arr_object);
            return new SingleElementListIterator(arr_object, v);
        }
        Object[] arr_object1 = this.f;
        L.m(arr_object1);
        return new TrieIterator(arr_object1, v, v1 >> 5, v2 / 5);
    }

    private final Object[] q(Object[] arr_object) {
        if(arr_object == null) {
            return this.u();
        }
        return this.o(arr_object) ? arr_object : kotlin.collections.l.K0(arr_object, this.u(), 0, 0, s.B(arr_object.length, 0x20), 6, null);
    }

    // 去混淆评级： 低(20)
    private final Object[] r(Object[] arr_object, int v) {
        return this.o(arr_object) ? kotlin.collections.l.B0(arr_object, arr_object, v, 0, 0x20 - v) : kotlin.collections.l.B0(arr_object, this.u(), v, 0, 0x20 - v);
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.J(new Function1() {
            final Collection e;

            {
                this.e = collection0;
                super(1);
            }

            @l
            public final Boolean a(Object object0) {
                return Boolean.valueOf(this.e.contains(object0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        });
    }

    @Override  // kotlin.collections.f
    public Object set(int v, Object object0) {
        ListImplementation.a(v, this.size());
        if(this.O() <= v) {
            Object[] arr_object = this.q(this.g);
            if(arr_object != this.g) {
                ++this.modCount;
            }
            Object object1 = arr_object[v & 0x1F];
            arr_object[v & 0x1F] = object0;
            this.g = arr_object;
            return object1;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object1 = this.f;
        L.m(arr_object1);
        this.f = this.P(arr_object1, this.d, v, object0, objectRef0);
        return objectRef0.a();
    }

    private final Object[] u() {
        Object[] arr_object = new Object[33];
        arr_object[0x20] = this.e;
        return arr_object;
    }

    private final Object[] x(Object object0) {
        Object[] arr_object = new Object[33];
        arr_object[0] = object0;
        arr_object[0x20] = this.e;
        return arr_object;
    }

    private final Object[] y(Object[] arr_object, int v, int v1) {
        if(v1 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v1 == 0) {
            return arr_object;
        }
        int v2 = v >> v1 & 0x1F;
        Object object0 = arr_object[v2];
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] arr_object1 = this.y(((Object[])object0), v, v1 - 5);
        if(v2 < 0x1F && arr_object[v2 + 1] != null) {
            if(this.o(arr_object)) {
                kotlin.collections.l.M1(arr_object, null, v2 + 1, 0x20);
            }
            arr_object = kotlin.collections.l.B0(arr_object, this.u(), 0, 0, v2 + 1);
        }
        if(arr_object1 != arr_object[v2]) {
            arr_object = this.q(arr_object);
            arr_object[v2] = arr_object1;
        }
        return arr_object;
    }

    private final Object[] z(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 - 1 >> v & 0x1F;
        if(v == 5) {
            objectRef0.b(arr_object[v2]);
            arr_object1 = null;
        }
        else {
            Object object0 = arr_object[v2];
            L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object1 = this.z(((Object[])object0), v - 5, v1, objectRef0);
        }
        if(arr_object1 == null && v2 == 0) {
            return null;
        }
        Object[] arr_object2 = this.q(arr_object);
        arr_object2[v2] = arr_object1;
        return arr_object2;
    }
}

