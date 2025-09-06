package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.reflect.g;
import kotlin.reflect.s;
import kotlin.reflect.t;
import kotlinx.serialization.d;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.i;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import y4.l;
import y4.m;

public final class u0 {
    @l
    private static final f[] a;

    static {
        u0.a = new f[0];
    }

    @l
    public static final Set a(@l f f0) {
        L.p(f0, "<this>");
        if(f0 instanceof n) {
            return ((n)f0).a();
        }
        Set set0 = new HashSet(f0.e());
        int v = f0.e();
        for(int v1 = 0; v1 < v; ++v1) {
            set0.add(f0.f(v1));
        }
        return set0;
    }

    @b0
    @l
    public static final d b(@l d d0) {
        L.p(d0, "<this>");
        return d0;
    }

    @b0
    @l
    public static final i c(@l i i0) {
        L.p(i0, "<this>");
        return i0;
    }

    @b0
    @l
    public static final w d(@l w w0) {
        L.p(w0, "<this>");
        return w0;
    }

    @l
    public static final f[] e(@m List list0) {
        if(list0 == null || list0.isEmpty()) {
            list0 = null;
        }
        if(list0 != null) {
            Object[] arr_object = list0.toArray(new f[0]);
            L.n(arr_object, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return ((f[])arr_object) == null ? u0.a : ((f[])arr_object);
        }
        return u0.a;
    }

    public static final int f(@l Iterable iterable0, @l Function1 function10) {
        L.p(iterable0, "<this>");
        L.p(function10, "selector");
        int v = 1;
        for(Object object0: iterable0) {
            Object object1 = function10.invoke(object0);
            v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
        }
        return v;
    }

    private static void g() {
    }

    @l
    public static final kotlin.reflect.d h(@l s s0) {
        L.p(s0, "<this>");
        g g0 = s0.p();
        if(!(g0 instanceof kotlin.reflect.d)) {
            throw g0 instanceof t ? new IllegalStateException(("Captured type paramerer " + g0 + " from generic non-reified function. Such functionality cannot be supported as " + g0 + " is erased, either specify serializer explicitly or make calling function inline with reified " + g0).toString()) : new IllegalStateException(("Only KClass supported as classifier, got " + g0).toString());
        }
        return (kotlin.reflect.d)g0;
    }

    @l
    public static final Void i(@l kotlin.reflect.d d0) {
        L.p(d0, "<this>");
        throw new v("Serializer for class \'" + d0.u() + "\' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}

