package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.collections.l;
import kotlin.jvm.internal.L;

public final class TrieNodeKt {
    public static final int a = 0x20;
    public static final int b = 5;
    public static final int c = 0x1F;
    public static final int d = 2;
    public static final int e = 30;

    public static final int f(int v, int v1) [...] // Inlined contents

    private static final Object[] g(Object[] arr_object, int v, Object object0, Object object1) {
        Object[] arr_object1 = new Object[arr_object.length + 2];
        l.K0(arr_object, arr_object1, 0, 0, v, 6, null);
        l.B0(arr_object, arr_object1, v + 2, v, arr_object.length);
        arr_object1[v] = object0;
        arr_object1[v + 1] = object1;
        return arr_object1;
    }

    private static final Object[] h(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[arr_object.length - 2];
        l.K0(arr_object, arr_object1, 0, 0, v, 6, null);
        l.B0(arr_object, arr_object1, v, v + 2, arr_object.length);
        return arr_object1;
    }

    private static final Object[] i(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        l.K0(arr_object, arr_object1, 0, 0, v, 6, null);
        l.B0(arr_object, arr_object1, v, v + 1, arr_object.length);
        return arr_object1;
    }

    private static final Object[] j(Object[] arr_object, int v, int v1, TrieNode trieNode0) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        l.K0(arr_object, arr_object1, 0, 0, v, 6, null);
        l.B0(arr_object, arr_object1, v, v + 2, v1);
        arr_object1[v1 - 2] = trieNode0;
        l.B0(arr_object, arr_object1, v1 - 1, v1, arr_object.length);
        return arr_object1;
    }

    private static final Object[] k(Object[] arr_object, int v, int v1, Object object0, Object object1) {
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 1);
        L.o(arr_object1, "copyOf(this, newSize)");
        l.B0(arr_object1, arr_object1, v + 2, v + 1, arr_object.length);
        l.B0(arr_object1, arr_object1, v1 + 2, v1, v);
        arr_object1[v1] = object0;
        arr_object1[v1 + 1] = object1;
        return arr_object1;
    }
}

