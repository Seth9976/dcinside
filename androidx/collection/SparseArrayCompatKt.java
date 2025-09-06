package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
public final class SparseArrayCompatKt {
    @l
    private static final Object a;

    static {
        SparseArrayCompatKt.a = new Object();
    }

    private static final Object A(SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        int v1 = ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
        if(v1 >= 0) {
            Object object1 = sparseArrayCompat0.c[v1];
            return object1 == SparseArrayCompatKt.a ? object0 : object1;
        }
        return object0;
    }

    public static final void c(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.d;
        if(v1 != 0 && v <= sparseArrayCompat0.b[v1 - 1]) {
            sparseArrayCompat0.o(v, object0);
            return;
        }
        if(sparseArrayCompat0.a && v1 >= sparseArrayCompat0.b.length) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        int v2 = sparseArrayCompat0.d;
        if(v2 >= sparseArrayCompat0.b.length) {
            int v3 = ContainerHelpersKt.e(v2 + 1);
            int[] arr_v = Arrays.copyOf(sparseArrayCompat0.b, v3);
            L.o(arr_v, "copyOf(this, newSize)");
            sparseArrayCompat0.b = arr_v;
            Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.c, v3);
            L.o(arr_object, "copyOf(this, newSize)");
            sparseArrayCompat0.c = arr_object;
        }
        sparseArrayCompat0.b[v2] = v;
        sparseArrayCompat0.c[v2] = object0;
        sparseArrayCompat0.d = v2 + 1;
    }

    public static final void d(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        int v = sparseArrayCompat0.d;
        Object[] arr_object = sparseArrayCompat0.c;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        sparseArrayCompat0.d = 0;
        sparseArrayCompat0.a = false;
    }

    public static final boolean e(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.k(v) >= 0;
    }

    public static final boolean f(@l SparseArrayCompat sparseArrayCompat0, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.a) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        int v = sparseArrayCompat0.d;
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(sparseArrayCompat0.c[v1] == object0) {
                break;
            }
        }
        return v1 >= 0;
    }

    @m
    public static final Object g(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
        if(v1 >= 0) {
            Object object0 = sparseArrayCompat0.c[v1];
            return object0 == SparseArrayCompatKt.a ? null : object0;
        }
        return null;
    }

    public static final Object h(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
        if(v1 >= 0) {
            Object object1 = sparseArrayCompat0.c[v1];
            return object1 == SparseArrayCompatKt.a ? object0 : object1;
        }
        return object0;
    }

    public static final int i(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.a) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        return ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
    }

    public static final int j(@l SparseArrayCompat sparseArrayCompat0, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.a) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        int v = sparseArrayCompat0.d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(sparseArrayCompat0.c[v1] == object0) {
                return v1;
            }
        }
        return -1;
    }

    public static final boolean k(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.y() == 0;
    }

    public static final int l(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.a) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        return sparseArrayCompat0.b[v];
    }

    public static final void m(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
        if(v1 >= 0) {
            sparseArrayCompat0.c[v1] = object0;
            return;
        }
        int v2 = ~v1;
        if(v2 < sparseArrayCompat0.d && sparseArrayCompat0.c[v2] == SparseArrayCompatKt.a) {
            sparseArrayCompat0.b[v2] = v;
            sparseArrayCompat0.c[v2] = object0;
            return;
        }
        if(sparseArrayCompat0.a && sparseArrayCompat0.d >= sparseArrayCompat0.b.length) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
            v2 = ~ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
        }
        int v3 = sparseArrayCompat0.d;
        if(v3 >= sparseArrayCompat0.b.length) {
            int v4 = ContainerHelpersKt.e(v3 + 1);
            int[] arr_v = Arrays.copyOf(sparseArrayCompat0.b, v4);
            L.o(arr_v, "copyOf(this, newSize)");
            sparseArrayCompat0.b = arr_v;
            Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.c, v4);
            L.o(arr_object, "copyOf(this, newSize)");
            sparseArrayCompat0.c = arr_object;
        }
        int v5 = sparseArrayCompat0.d;
        if(v5 - v2 != 0) {
            kotlin.collections.l.z0(sparseArrayCompat0.b, sparseArrayCompat0.b, v2 + 1, v2, v5);
            kotlin.collections.l.B0(sparseArrayCompat0.c, sparseArrayCompat0.c, v2 + 1, v2, sparseArrayCompat0.d);
        }
        sparseArrayCompat0.b[v2] = v;
        sparseArrayCompat0.c[v2] = object0;
        ++sparseArrayCompat0.d;
    }

    public static final void n(@l SparseArrayCompat sparseArrayCompat0, @l SparseArrayCompat sparseArrayCompat1) {
        L.p(sparseArrayCompat0, "<this>");
        L.p(sparseArrayCompat1, "other");
        int v = sparseArrayCompat1.y();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArrayCompat1.n(v1);
            Object object0 = sparseArrayCompat1.z(v1);
            int v3 = ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v2);
            if(v3 >= 0) {
                sparseArrayCompat0.c[v3] = object0;
            }
            else {
                int v4 = ~v3;
                if(v4 >= sparseArrayCompat0.d || sparseArrayCompat0.c[v4] != SparseArrayCompatKt.a) {
                    if(sparseArrayCompat0.a && sparseArrayCompat0.d >= sparseArrayCompat0.b.length) {
                        SparseArrayCompatKt.z(sparseArrayCompat0);
                        v4 = ~ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v2);
                    }
                    int v5 = sparseArrayCompat0.d;
                    if(v5 >= sparseArrayCompat0.b.length) {
                        int v6 = ContainerHelpersKt.e(v5 + 1);
                        int[] arr_v = Arrays.copyOf(sparseArrayCompat0.b, v6);
                        L.o(arr_v, "copyOf(this, newSize)");
                        sparseArrayCompat0.b = arr_v;
                        Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.c, v6);
                        L.o(arr_object, "copyOf(this, newSize)");
                        sparseArrayCompat0.c = arr_object;
                    }
                    int v7 = sparseArrayCompat0.d;
                    if(v7 - v4 != 0) {
                        kotlin.collections.l.z0(sparseArrayCompat0.b, sparseArrayCompat0.b, v4 + 1, v4, v7);
                        kotlin.collections.l.B0(sparseArrayCompat0.c, sparseArrayCompat0.c, v4 + 1, v4, sparseArrayCompat0.d);
                    }
                    sparseArrayCompat0.b[v4] = v2;
                    sparseArrayCompat0.c[v4] = object0;
                    ++sparseArrayCompat0.d;
                }
                else {
                    sparseArrayCompat0.b[v4] = v2;
                    sparseArrayCompat0.c[v4] = object0;
                }
            }
        }
    }

    @m
    public static final Object o(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        Object object1 = SparseArrayCompatKt.g(sparseArrayCompat0, v);
        if(object1 == null) {
            int v1 = ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
            if(v1 >= 0) {
                sparseArrayCompat0.c[v1] = object0;
                return null;
            }
            int v2 = ~v1;
            if(v2 < sparseArrayCompat0.d && sparseArrayCompat0.c[v2] == SparseArrayCompatKt.a) {
                sparseArrayCompat0.b[v2] = v;
                sparseArrayCompat0.c[v2] = object0;
                return null;
            }
            if(sparseArrayCompat0.a && sparseArrayCompat0.d >= sparseArrayCompat0.b.length) {
                SparseArrayCompatKt.z(sparseArrayCompat0);
                v2 = ~ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
            }
            int v3 = sparseArrayCompat0.d;
            if(v3 >= sparseArrayCompat0.b.length) {
                int v4 = ContainerHelpersKt.e(v3 + 1);
                int[] arr_v = Arrays.copyOf(sparseArrayCompat0.b, v4);
                L.o(arr_v, "copyOf(this, newSize)");
                sparseArrayCompat0.b = arr_v;
                Object[] arr_object = Arrays.copyOf(sparseArrayCompat0.c, v4);
                L.o(arr_object, "copyOf(this, newSize)");
                sparseArrayCompat0.c = arr_object;
            }
            int v5 = sparseArrayCompat0.d;
            if(v5 - v2 != 0) {
                kotlin.collections.l.z0(sparseArrayCompat0.b, sparseArrayCompat0.b, v2 + 1, v2, v5);
                kotlin.collections.l.B0(sparseArrayCompat0.c, sparseArrayCompat0.c, v2 + 1, v2, sparseArrayCompat0.d);
            }
            sparseArrayCompat0.b[v2] = v;
            sparseArrayCompat0.c[v2] = object0;
            ++sparseArrayCompat0.d;
        }
        return object1;
    }

    public static final void p(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = ContainerHelpersKt.a(sparseArrayCompat0.b, sparseArrayCompat0.d, v);
        if(v1 >= 0) {
            Object[] arr_object = sparseArrayCompat0.c;
            Object object0 = SparseArrayCompatKt.a;
            if(arr_object[v1] != object0) {
                arr_object[v1] = object0;
                sparseArrayCompat0.a = true;
            }
        }
    }

    public static final boolean q(@l SparseArrayCompat sparseArrayCompat0, int v, @m Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.k(v);
        if(v1 >= 0 && L.g(object0, sparseArrayCompat0.z(v1))) {
            sparseArrayCompat0.t(v1);
            return true;
        }
        return false;
    }

    public static final void r(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.c[v] != SparseArrayCompatKt.a) {
            sparseArrayCompat0.c[v] = SparseArrayCompatKt.a;
            sparseArrayCompat0.a = true;
        }
    }

    public static final void s(@l SparseArrayCompat sparseArrayCompat0, int v, int v1) {
        L.p(sparseArrayCompat0, "<this>");
        int v2 = Math.min(v1, v + v1);
        while(v < v2) {
            sparseArrayCompat0.t(v);
            ++v;
        }
    }

    @m
    public static final Object t(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.k(v);
        if(v1 >= 0) {
            Object[] arr_object = sparseArrayCompat0.c;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
            return object1;
        }
        return null;
    }

    public static final boolean u(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0, Object object1) {
        L.p(sparseArrayCompat0, "<this>");
        int v1 = sparseArrayCompat0.k(v);
        if(v1 >= 0 && L.g(sparseArrayCompat0.c[v1], object0)) {
            sparseArrayCompat0.c[v1] = object1;
            return true;
        }
        return false;
    }

    public static final void v(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.a) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        sparseArrayCompat0.c[v] = object0;
    }

    public static final int w(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.a) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        return sparseArrayCompat0.d;
    }

    @l
    public static final String x(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.y() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(sparseArrayCompat0.d * 28);
        stringBuilder0.append('{');
        int v = sparseArrayCompat0.d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(sparseArrayCompat0.n(v1));
            stringBuilder0.append('=');
            Object object0 = sparseArrayCompat0.z(v1);
            if(object0 == sparseArrayCompat0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        L.o(s, "buffer.toString()");
        return s;
    }

    public static final Object y(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        if(sparseArrayCompat0.a) {
            SparseArrayCompatKt.z(sparseArrayCompat0);
        }
        return sparseArrayCompat0.c[v];
    }

    private static final void z(SparseArrayCompat sparseArrayCompat0) {
        int v = sparseArrayCompat0.d;
        int[] arr_v = sparseArrayCompat0.b;
        Object[] arr_object = sparseArrayCompat0.c;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 != SparseArrayCompatKt.a) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_object[v2] = object0;
                    arr_object[v1] = null;
                }
                ++v2;
            }
        }
        sparseArrayCompat0.a = false;
        sparseArrayCompat0.d = v2;
    }
}

