package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.m;

public final class TrieNodeKt {
    public static final int a = 0x20;
    public static final int b = 5;
    public static final int c = 0x1F;
    public static final int d = 30;

    private static final Object[] c(Object[] arr_object, int v, Object object0) {
        Object[] arr_object1 = new Object[arr_object.length + 1];
        l.K0(arr_object, arr_object1, 0, 0, v, 6, null);
        l.B0(arr_object, arr_object1, v + 1, v, arr_object.length);
        arr_object1[v] = object0;
        return arr_object1;
    }

    private static final int d(Object[] arr_object, Object[] arr_object1, int v, Function1 function10) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                arr_object1[v + v2] = arr_object[v1];
                ++v2;
            }
        }
        return v2;
    }

    static int e(Object[] arr_object, Object[] arr_object1, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            function10 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1.e;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            if(((Boolean)function10.invoke(arr_object[v2])).booleanValue()) {
                arr_object1[v + v3] = arr_object[v2];
                ++v3;
            }
        }
        return v3;

        @s0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n*L\n1#1,851:1\n*E\n"})
        public final class androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1 extends N implements Function1 {
            public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1 e;

            static {
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1.e = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1();
            }

            public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1() {
                super(1);
            }

            @y4.l
            public final Boolean a(@m Object object0) {
                return object0 == TrieNode.d.a() ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

    }

    public static final int f(int v, int v1) [...] // Inlined contents

    private static final Object[] g(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        l.K0(arr_object, arr_object1, 0, 0, v, 6, null);
        l.B0(arr_object, arr_object1, v, v + 1, arr_object.length);
        return arr_object1;
    }
}

