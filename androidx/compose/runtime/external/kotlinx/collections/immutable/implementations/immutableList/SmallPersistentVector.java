package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
public final class SmallPersistentVector extends AbstractPersistentList implements ImmutableList {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final SmallPersistentVector a() {
            return SmallPersistentVector.e;
        }
    }

    @l
    private final Object[] c;
    @l
    public static final Companion d;
    @l
    private static final SmallPersistentVector e;

    static {
        SmallPersistentVector.d = new Companion(null);
        SmallPersistentVector.e = new SmallPersistentVector(new Object[0]);
    }

    public SmallPersistentVector(@l Object[] arr_object) {
        L.p(arr_object, "buffer");
        super();
        this.c = arr_object;
    }

    @Override  // kotlin.collections.c
    public int a() {
        return this.c.length;
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
        if(this.size() < 0x20) {
            Object[] arr_object = this.c(this.size() + 1);
            kotlin.collections.l.K0(this.c, arr_object, 0, 0, v, 6, null);
            kotlin.collections.l.B0(this.c, arr_object, v + 1, v, this.size());
            arr_object[v] = object0;
            return new SmallPersistentVector(arr_object);
        }
        Object[] arr_object1 = Arrays.copyOf(this.c, this.c.length);
        L.o(arr_object1, "copyOf(this, size)");
        kotlin.collections.l.B0(this.c, arr_object1, v + 1, v, this.size() - 1);
        arr_object1[v] = object0;
        return new PersistentVector(arr_object1, UtilsKt.c(this.c[0x1F]), this.size() + 1, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList add(Object object0) {
        if(this.size() < 0x20) {
            Object[] arr_object = Arrays.copyOf(this.c, this.size() + 1);
            L.o(arr_object, "copyOf(this, newSize)");
            arr_object[this.size()] = object0;
            return new SmallPersistentVector(arr_object);
        }
        Object[] arr_object1 = UtilsKt.c(object0);
        return new PersistentVector(this.c, arr_object1, this.size() + 1, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    @l
    public PersistentList addAll(int v, @l Collection collection0) {
        L.p(collection0, "c");
        ListImplementation.b(v, this.size());
        if(this.size() + collection0.size() <= 0x20) {
            Object[] arr_object = this.c(this.size() + collection0.size());
            kotlin.collections.l.K0(this.c, arr_object, 0, 0, v, 6, null);
            kotlin.collections.l.B0(this.c, arr_object, collection0.size() + v, v, this.size());
            for(Object object0: collection0) {
                arr_object[v] = object0;
                ++v;
            }
            return new SmallPersistentVector(arr_object);
        }
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(v, collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    @l
    public PersistentList addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(this.size() + collection0.size() <= 0x20) {
            Object[] arr_object = Arrays.copyOf(this.c, this.size() + collection0.size());
            L.o(arr_object, "copyOf(this, newSize)");
            int v = this.size();
            for(Object object0: collection0) {
                arr_object[v] = object0;
                ++v;
            }
            return new SmallPersistentVector(arr_object);
        }
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public Builder builder() {
        return new PersistentVectorBuilder(this, null, this.c, 0);
    }

    private final Object[] c(int v) {
        return new Object[v];
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection e(Function1 function10) {
        return this.e(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList e(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.c;
        int v = this.size();
        int v1 = this.size();
        boolean z = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = this.c[v2];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                if(z) {
                    arr_object[v] = object0;
                    ++v;
                }
            }
            else if(!z) {
                arr_object = Arrays.copyOf(this.c, this.c.length);
                L.o(arr_object, "copyOf(this, size)");
                z = true;
                v = v2;
            }
        }
        if(v == this.size()) {
            return this;
        }
        return v == 0 ? SmallPersistentVector.e : new SmallPersistentVector(kotlin.collections.l.l1(arr_object, 0, v));
    }

    @Override  // kotlin.collections.c
    public Object get(int v) {
        ListImplementation.a(v, this.size());
        return this.c[v];
    }

    @Override  // kotlin.collections.c
    public int indexOf(Object object0) {
        return kotlin.collections.l.If(this.c, object0);
    }

    @Override  // kotlin.collections.c
    public int lastIndexOf(Object object0) {
        return kotlin.collections.l.Mh(this.c, object0);
    }

    @Override  // kotlin.collections.c
    @l
    public ListIterator listIterator(int v) {
        ListImplementation.b(v, this.size());
        return new BufferIterator(this.c, v, this.size());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList o2(int v) {
        ListImplementation.a(v, this.size());
        if(this.size() == 1) {
            return SmallPersistentVector.e;
        }
        Object[] arr_object = Arrays.copyOf(this.c, this.size() - 1);
        L.o(arr_object, "copyOf(this, newSize)");
        kotlin.collections.l.B0(this.c, arr_object, v, v + 1, this.size());
        return new SmallPersistentVector(arr_object);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList set(int v, Object object0) {
        ListImplementation.a(v, this.size());
        Object[] arr_object = Arrays.copyOf(this.c, this.c.length);
        L.o(arr_object, "copyOf(this, size)");
        arr_object[v] = object0;
        return new SmallPersistentVector(arr_object);
    }
}

