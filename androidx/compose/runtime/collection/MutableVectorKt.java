package androidx.compose.runtime.collection;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1194:1\n1161#1,2:1195\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1182#1:1195,2\n*E\n"})
public final class MutableVectorKt {
    public static final MutableVector a(int v) {
        L.y(0, "T?");
        return new MutableVector(new Object[v], 0);
    }

    public static final MutableVector b(int v, Function1 function10) {
        L.p(function10, "init");
        L.y(0, "T");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function10.invoke(v1);
        }
        return new MutableVector(arr_object, v);
    }

    public static MutableVector c(int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        L.y(0, "T?");
        return new MutableVector(new Object[v], 0);
    }

    private static final void f(List list0, int v) {
        int v1 = list0.size();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("Index " + v + " is out of bounds. The list has " + v1 + " elements.");
        }
    }

    private static final void g(List list0, int v, int v1) {
        int v2 = list0.size();
        if(v > v1) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + v + ") is greater than toIndex (" + v1 + ").");
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + v + ") is less than 0.");
        }
        if(v1 > v2) {
            throw new IndexOutOfBoundsException("toIndex (" + v1 + ") is more than than the list size (" + v2 + ')');
        }
    }

    public static final MutableVector h() {
        L.y(0, "T?");
        return new MutableVector(new Object[16], 0);
    }

    public static final MutableVector i(Object[] arr_object) {
        L.p(arr_object, "elements");
        return new MutableVector(arr_object, arr_object.length);
    }
}

