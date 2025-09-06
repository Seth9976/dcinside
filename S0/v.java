package S0;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum v {
    @s0({"SMAP\nVisibilityState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityState.kt\ncom/facebook/fresco/ui/common/VisibilityState$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n1310#2,2:22\n*S KotlinDebug\n*F\n+ 1 VisibilityState.kt\ncom/facebook/fresco/ui/common/VisibilityState$Companion\n*L\n18#1:22,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final v a(int v) {
            v[] arr_v = v.c;
            int v1 = 0;
            while(v1 < arr_v.length) {
                v v2 = arr_v[v1];
                if(v2.d() != v) {
                    ++v1;
                    continue;
                }
                return v2;
            }
            return null;
        }
    }

    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);

    private final int a;
    @l
    public static final a b;
    @l
    private static final v[] c;
    private static final v[] g;
    private static final kotlin.enums.a h;

    static {
        v.g = arr_v;
        L.p(arr_v, "entries");
        v.h = new d(arr_v);
        v.b = new a(null);
        v.c = (v[])v.g.clone();
    }

    private v(int v1) {
        this.a = v1;
    }

    private static final v[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a c() {
        return v.h;
    }

    public final int d() {
        return this.a;
    }
}

