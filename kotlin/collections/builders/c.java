package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class c {
    @l
    public static final Object[] d(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        return new Object[v];
    }

    @l
    public static final Object[] e(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        Object[] arr_object1 = Arrays.copyOf(arr_object, v);
        L.o(arr_object1, "copyOf(...)");
        return arr_object1;
    }

    public static final void f(@l Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        arr_object[v] = null;
    }

    public static final void g(@l Object[] arr_object, int v, int v1) {
        L.p(arr_object, "<this>");
        while(v < v1) {
            c.f(arr_object, v);
            ++v;
        }
    }

    private static final boolean h(Object[] arr_object, int v, int v1, List list0) {
        if(v1 != list0.size()) {
            return false;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!L.g(arr_object[v + v2], list0.get(v2))) {
                return false;
            }
        }
        return true;
    }

    private static final int i(Object[] arr_object, int v, int v1) {
        int v2 = 1;
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object0 = arr_object[v + v3];
            v2 = v2 * 0x1F + (object0 == null ? 0 : object0.hashCode());
        }
        return v2;
    }

    private static final String j(Object[] arr_object, int v, int v1, Collection collection0) {
        StringBuilder stringBuilder0 = new StringBuilder(v1 * 3 + 2);
        stringBuilder0.append("[");
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v2 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = arr_object[v + v2];
            if(object0 == collection0) {
                stringBuilder0.append("(this Collection)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append("]");
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }
}

