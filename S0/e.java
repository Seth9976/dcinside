package S0;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum e {
    @s0({"SMAP\nImageLoadStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoadStatus.kt\ncom/facebook/fresco/ui/common/ImageLoadStatus$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,40:1\n1310#2,2:41\n*S KotlinDebug\n*F\n+ 1 ImageLoadStatus.kt\ncom/facebook/fresco/ui/common/ImageLoadStatus$Companion\n*L\n37#1:41,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final e a(int v) {
            e[] arr_e = e.c;
            int v1 = 0;
            while(v1 < arr_e.length) {
                e e0 = arr_e[v1];
                if(e0.d() != v) {
                    ++v1;
                    continue;
                }
                return e0;
            }
            return null;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            try {
                arr_v[e.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.h.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.j.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    ERROR(5),
    EMPTY_EVENT(7),
    RELEASED(8);

    private final int a;
    @l
    public static final a b;
    @l
    private static final e[] c;
    private static final e[] k;
    private static final kotlin.enums.a l;

    static {
        e.k = arr_e;
        L.p(arr_e, "entries");
        e.l = new d(arr_e);
        e.b = new a(null);
        e.c = (e[])e.k.clone();
    }

    private e(int v1) {
        this.a = v1;
    }

    private static final e[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a c() {
        return e.l;
    }

    public final int d() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        switch(this) {
            case 1: {
                return "requested";
            }
            case 2: {
                return "success";
            }
            case 3: {
                return "intermediate_available";
            }
            case 4: {
                return "error";
            }
            case 5: {
                return "released";
            }
            default: {
                return "unknown";
            }
        }
    }
}

