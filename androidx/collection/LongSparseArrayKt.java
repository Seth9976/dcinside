package androidx.collection;

import A3.a;
import A3.o;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.U;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
public final class LongSparseArrayKt {
    @l
    private static final Object a;

    static {
        LongSparseArrayKt.a = new Object();
    }

    public static final void A(@l LongSparseArray longSparseArray0, @l o o0) {
        L.p(longSparseArray0, "<this>");
        L.p(o0, "action");
        int v = longSparseArray0.w();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(longSparseArray0.m(v1), longSparseArray0.x(v1));
        }
    }

    public static final Object B(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        return longSparseArray0.h(v, object0);
    }

    public static final Object C(@l LongSparseArray longSparseArray0, long v, @l a a0) {
        L.p(longSparseArray0, "<this>");
        L.p(a0, "defaultValue");
        Object object0 = longSparseArray0.g(v);
        return object0 == null ? a0.invoke() : object0;
    }

    public static final int D(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        return longSparseArray0.w();
    }

    public static void E(LongSparseArray longSparseArray0) {
    }

    public static final boolean F(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        return !longSparseArray0.l();
    }

    @l
    public static final U G(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        return new U() {
            private int a;

            @Override  // kotlin.collections.U
            public long b() {
                int v = this.a;
                this.a = v + 1;
                return longSparseArray0.m(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < longSparseArray0.w();
            }
        };
    }

    @l
    public static final LongSparseArray H(@l LongSparseArray longSparseArray0, @l LongSparseArray longSparseArray1) {
        L.p(longSparseArray0, "<this>");
        L.p(longSparseArray1, "other");
        LongSparseArray longSparseArray2 = new LongSparseArray(longSparseArray0.w() + longSparseArray1.w());
        longSparseArray2.o(longSparseArray0);
        longSparseArray2.o(longSparseArray1);
        return longSparseArray2;
    }

    @k(level = m.c, message = "Replaced with member function. Remove extension import!")
    public static final boolean I(LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        return longSparseArray0.r(v, object0);
    }

    public static final void J(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        longSparseArray0.n(v, object0);
    }

    @l
    public static final Iterator K(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        return new Object() {
            private int a;

            public final int a() {
                return this.a;
            }

            public final void b(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < longSparseArray0.w();
            }

            @Override
            public Object next() {
                int v = this.a;
                this.a = v + 1;
                return longSparseArray0.x(v);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

    public static final void b(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        int v1 = longSparseArray0.d;
        if(v1 != 0 && v <= longSparseArray0.b[v1 - 1]) {
            longSparseArray0.n(v, object0);
            return;
        }
        if(longSparseArray0.a) {
            long[] arr_v = longSparseArray0.b;
            if(v1 >= arr_v.length) {
                Object[] arr_object = longSparseArray0.c;
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object1 = arr_object[v2];
                    if(object1 != LongSparseArrayKt.a) {
                        if(v2 != v3) {
                            arr_v[v3] = arr_v[v2];
                            arr_object[v3] = object1;
                            arr_object[v2] = null;
                        }
                        ++v3;
                    }
                }
                longSparseArray0.a = false;
                longSparseArray0.d = v3;
            }
        }
        int v4 = longSparseArray0.d;
        if(v4 >= longSparseArray0.b.length) {
            int v5 = ContainerHelpersKt.f(v4 + 1);
            long[] arr_v1 = Arrays.copyOf(longSparseArray0.b, v5);
            L.o(arr_v1, "copyOf(this, newSize)");
            longSparseArray0.b = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(longSparseArray0.c, v5);
            L.o(arr_object1, "copyOf(this, newSize)");
            longSparseArray0.c = arr_object1;
        }
        longSparseArray0.b[v4] = v;
        longSparseArray0.c[v4] = object0;
        longSparseArray0.d = v4 + 1;
    }

    public static final void c(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        int v = longSparseArray0.d;
        Object[] arr_object = longSparseArray0.c;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        longSparseArray0.d = 0;
        longSparseArray0.a = false;
    }

    public static final boolean d(@l LongSparseArray longSparseArray0, long v) {
        L.p(longSparseArray0, "<this>");
        return longSparseArray0.j(v) >= 0;
    }

    public static final boolean e(@l LongSparseArray longSparseArray0, Object object0) {
        L.p(longSparseArray0, "<this>");
        return longSparseArray0.k(object0) >= 0;
    }

    public static final void f(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        int v = longSparseArray0.d;
        long[] arr_v = longSparseArray0.b;
        Object[] arr_object = longSparseArray0.c;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 != LongSparseArrayKt.a) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_object[v2] = object0;
                    arr_object[v1] = null;
                }
                ++v2;
            }
        }
        longSparseArray0.a = false;
        longSparseArray0.d = v2;
    }

    @y4.m
    public static final Object g(@l LongSparseArray longSparseArray0, long v) {
        L.p(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.b(longSparseArray0.b, longSparseArray0.d, v);
        return v1 < 0 || longSparseArray0.c[v1] == LongSparseArrayKt.a ? null : longSparseArray0.c[v1];
    }

    public static final Object h(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.b(longSparseArray0.b, longSparseArray0.d, v);
        return v1 < 0 || longSparseArray0.c[v1] == LongSparseArrayKt.a ? object0 : longSparseArray0.c[v1];
    }

    public static final Object i(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.b(longSparseArray0.b, longSparseArray0.d, v);
        return v1 < 0 || longSparseArray0.c[v1] == LongSparseArrayKt.a ? object0 : longSparseArray0.c[v1];
    }

    public static final int j(@l LongSparseArray longSparseArray0, long v) {
        L.p(longSparseArray0, "<this>");
        if(longSparseArray0.a) {
            int v1 = longSparseArray0.d;
            long[] arr_v = longSparseArray0.b;
            Object[] arr_object = longSparseArray0.c;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = arr_object[v2];
                if(object0 != LongSparseArrayKt.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object0;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            longSparseArray0.a = false;
            longSparseArray0.d = v3;
        }
        return ContainerHelpersKt.b(longSparseArray0.b, longSparseArray0.d, v);
    }

    public static final int k(@l LongSparseArray longSparseArray0, Object object0) {
        L.p(longSparseArray0, "<this>");
        if(longSparseArray0.a) {
            int v1 = longSparseArray0.d;
            long[] arr_v = longSparseArray0.b;
            Object[] arr_object = longSparseArray0.c;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object1 = arr_object[v2];
                if(object1 != LongSparseArrayKt.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object1;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            longSparseArray0.a = false;
            longSparseArray0.d = v3;
        }
        int v4 = longSparseArray0.d;
        for(int v = 0; v < v4; ++v) {
            if(longSparseArray0.c[v] == object0) {
                return v;
            }
        }
        return -1;
    }

    public static final boolean l(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        return longSparseArray0.w() == 0;
    }

    public static final long m(@l LongSparseArray longSparseArray0, int v) {
        L.p(longSparseArray0, "<this>");
        if(v >= 0) {
            int v1 = longSparseArray0.d;
            if(v < v1) {
                if(longSparseArray0.a) {
                    long[] arr_v = longSparseArray0.b;
                    Object[] arr_object = longSparseArray0.c;
                    int v3 = 0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object0 = arr_object[v2];
                        if(object0 != LongSparseArrayKt.a) {
                            if(v2 != v3) {
                                arr_v[v3] = arr_v[v2];
                                arr_object[v3] = object0;
                                arr_object[v2] = null;
                            }
                            ++v3;
                        }
                    }
                    longSparseArray0.a = false;
                    longSparseArray0.d = v3;
                }
                return longSparseArray0.b[v];
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public static final void n(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.b(longSparseArray0.b, longSparseArray0.d, v);
        if(v1 >= 0) {
            longSparseArray0.c[v1] = object0;
            return;
        }
        int v2 = ~v1;
        if(v2 < longSparseArray0.d && longSparseArray0.c[v2] == LongSparseArrayKt.a) {
            longSparseArray0.b[v2] = v;
            longSparseArray0.c[v2] = object0;
            return;
        }
        if(longSparseArray0.a) {
            int v3 = longSparseArray0.d;
            long[] arr_v = longSparseArray0.b;
            if(v3 >= arr_v.length) {
                Object[] arr_object = longSparseArray0.c;
                int v5 = 0;
                for(int v4 = 0; v4 < v3; ++v4) {
                    Object object1 = arr_object[v4];
                    if(object1 != LongSparseArrayKt.a) {
                        if(v4 != v5) {
                            arr_v[v5] = arr_v[v4];
                            arr_object[v5] = object1;
                            arr_object[v4] = null;
                        }
                        ++v5;
                    }
                }
                longSparseArray0.a = false;
                longSparseArray0.d = v5;
                v2 = ~ContainerHelpersKt.b(longSparseArray0.b, v5, v);
            }
        }
        int v6 = longSparseArray0.d;
        if(v6 >= longSparseArray0.b.length) {
            int v7 = ContainerHelpersKt.f(v6 + 1);
            long[] arr_v1 = Arrays.copyOf(longSparseArray0.b, v7);
            L.o(arr_v1, "copyOf(this, newSize)");
            longSparseArray0.b = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(longSparseArray0.c, v7);
            L.o(arr_object1, "copyOf(this, newSize)");
            longSparseArray0.c = arr_object1;
        }
        int v8 = longSparseArray0.d;
        if(v8 - v2 != 0) {
            kotlin.collections.l.A0(longSparseArray0.b, longSparseArray0.b, v2 + 1, v2, v8);
            kotlin.collections.l.B0(longSparseArray0.c, longSparseArray0.c, v2 + 1, v2, longSparseArray0.d);
        }
        longSparseArray0.b[v2] = v;
        longSparseArray0.c[v2] = object0;
        ++longSparseArray0.d;
    }

    public static final void o(@l LongSparseArray longSparseArray0, @l LongSparseArray longSparseArray1) {
        L.p(longSparseArray0, "<this>");
        L.p(longSparseArray1, "other");
        int v = longSparseArray1.w();
        for(int v1 = 0; v1 < v; ++v1) {
            longSparseArray0.n(longSparseArray1.m(v1), longSparseArray1.x(v1));
        }
    }

    @y4.m
    public static final Object p(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        Object object1 = longSparseArray0.g(v);
        if(object1 == null) {
            longSparseArray0.n(v, object0);
        }
        return object1;
    }

    public static final void q(@l LongSparseArray longSparseArray0, long v) {
        L.p(longSparseArray0, "<this>");
        int v1 = ContainerHelpersKt.b(longSparseArray0.b, longSparseArray0.d, v);
        if(v1 >= 0 && longSparseArray0.c[v1] != LongSparseArrayKt.a) {
            longSparseArray0.c[v1] = LongSparseArrayKt.a;
            longSparseArray0.a = true;
        }
    }

    public static final boolean r(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        int v1 = longSparseArray0.j(v);
        if(v1 >= 0 && L.g(object0, longSparseArray0.x(v1))) {
            longSparseArray0.s(v1);
            return true;
        }
        return false;
    }

    public static final void s(@l LongSparseArray longSparseArray0, int v) {
        L.p(longSparseArray0, "<this>");
        if(longSparseArray0.c[v] != LongSparseArrayKt.a) {
            longSparseArray0.c[v] = LongSparseArrayKt.a;
            longSparseArray0.a = true;
        }
    }

    @y4.m
    public static final Object t(@l LongSparseArray longSparseArray0, long v, Object object0) {
        L.p(longSparseArray0, "<this>");
        int v1 = longSparseArray0.j(v);
        if(v1 >= 0) {
            Object[] arr_object = longSparseArray0.c;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
            return object1;
        }
        return null;
    }

    public static final boolean u(@l LongSparseArray longSparseArray0, long v, Object object0, Object object1) {
        L.p(longSparseArray0, "<this>");
        int v1 = longSparseArray0.j(v);
        if(v1 >= 0 && L.g(longSparseArray0.c[v1], object0)) {
            longSparseArray0.c[v1] = object1;
            return true;
        }
        return false;
    }

    public static final void v(@l LongSparseArray longSparseArray0, int v, Object object0) {
        L.p(longSparseArray0, "<this>");
        if(v >= 0) {
            int v1 = longSparseArray0.d;
            if(v < v1) {
                if(longSparseArray0.a) {
                    long[] arr_v = longSparseArray0.b;
                    Object[] arr_object = longSparseArray0.c;
                    int v3 = 0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object1 = arr_object[v2];
                        if(object1 != LongSparseArrayKt.a) {
                            if(v2 != v3) {
                                arr_v[v3] = arr_v[v2];
                                arr_object[v3] = object1;
                                arr_object[v2] = null;
                            }
                            ++v3;
                        }
                    }
                    longSparseArray0.a = false;
                    longSparseArray0.d = v3;
                }
                longSparseArray0.c[v] = object0;
                return;
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public static final int w(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        if(longSparseArray0.a) {
            int v = longSparseArray0.d;
            long[] arr_v = longSparseArray0.b;
            Object[] arr_object = longSparseArray0.c;
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 != LongSparseArrayKt.a) {
                    if(v1 != v2) {
                        arr_v[v2] = arr_v[v1];
                        arr_object[v2] = object0;
                        arr_object[v1] = null;
                    }
                    ++v2;
                }
            }
            longSparseArray0.a = false;
            longSparseArray0.d = v2;
        }
        return longSparseArray0.d;
    }

    @l
    public static final String x(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "<this>");
        if(longSparseArray0.w() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(longSparseArray0.d * 28);
        stringBuilder0.append('{');
        int v = longSparseArray0.d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(longSparseArray0.m(v1));
            stringBuilder0.append('=');
            Object object0 = longSparseArray0.x(v1);
            if(object0 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder(capacity).…builderAction).toString()");
        return s;
    }

    public static final Object y(@l LongSparseArray longSparseArray0, int v) {
        L.p(longSparseArray0, "<this>");
        if(v >= 0) {
            int v1 = longSparseArray0.d;
            if(v < v1) {
                if(longSparseArray0.a) {
                    long[] arr_v = longSparseArray0.b;
                    Object[] arr_object = longSparseArray0.c;
                    int v3 = 0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object0 = arr_object[v2];
                        if(object0 != LongSparseArrayKt.a) {
                            if(v2 != v3) {
                                arr_v[v3] = arr_v[v2];
                                arr_object[v3] = object0;
                                arr_object[v2] = null;
                            }
                            ++v3;
                        }
                    }
                    longSparseArray0.a = false;
                    longSparseArray0.d = v3;
                }
                return longSparseArray0.c[v];
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public static final boolean z(@l LongSparseArray longSparseArray0, long v) {
        L.p(longSparseArray0, "<this>");
        return longSparseArray0.d(v);
    }
}

