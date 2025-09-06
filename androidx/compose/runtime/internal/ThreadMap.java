package androidx.compose.runtime.internal;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nThreadMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n12904#2,3:112\n*S KotlinDebug\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:112,3\n*E\n"})
public final class ThreadMap {
    private final int a;
    @l
    private final long[] b;
    @l
    private final Object[] c;

    public ThreadMap(int v, @l long[] arr_v, @l Object[] arr_object) {
        L.p(arr_v, "keys");
        L.p(arr_object, "values");
        super();
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
    }

    private final int a(long v) {
        int v1 = 0;
        int v2 = this.a - 1;
        switch(v2) {
            case -1: {
                return -1;
            }
            case 0: {
                long v5 = this.b[0];
                if(v5 == v) {
                    return 0;
                }
                return v5 <= v ? -1 : -2;
            }
            default: {
                while(v1 <= v2) {
                    int v3 = v1 + v2 >>> 1;
                    int v4 = Long.compare(this.b[v3] - v, 0L);
                    if(v4 < 0) {
                        v1 = v3 + 1;
                        continue;
                    }
                    if(v4 > 0) {
                        v2 = v3 - 1;
                        continue;
                    }
                    return v3;
                }
                return -(v1 + 1);
            }
        }
    }

    @m
    public final Object b(long v) {
        int v1 = this.a(v);
        return v1 < 0 ? null : this.c[v1];
    }

    @l
    public final ThreadMap c(long v, @m Object object0) {
        int v1 = this.a;
        Object[] arr_object = this.c;
        int v2 = 0;
        int v4 = 0;
        for(int v3 = 0; v3 < arr_object.length; ++v3) {
            if(arr_object[v3] != null) {
                ++v4;
            }
        }
        long[] arr_v = new long[v4 + 1];
        Object[] arr_object1 = new Object[v4 + 1];
        if(v4 + 1 > 1) {
            int v5;
            for(v5 = 0; v2 < v4 + 1 && v5 < v1; ++v5) {
                long v6 = this.b[v5];
                Object object1 = this.c[v5];
                if(v6 > v) {
                    arr_v[v2] = v;
                    arr_object1[v2] = object0;
                    ++v2;
                    break;
                }
                if(object1 != null) {
                    arr_v[v2] = v6;
                    arr_object1[v2] = object1;
                    ++v2;
                }
            }
            if(v5 == v1) {
                arr_v[v4] = v;
                arr_object1[v4] = object0;
                return new ThreadMap(v4 + 1, arr_v, arr_object1);
            }
            while(v2 < v4 + 1) {
                long v7 = this.b[v5];
                Object object2 = this.c[v5];
                if(object2 != null) {
                    arr_v[v2] = v7;
                    arr_object1[v2] = object2;
                    ++v2;
                }
                ++v5;
            }
            return new ThreadMap(v4 + 1, arr_v, arr_object1);
        }
        arr_v[0] = v;
        arr_object1[0] = object0;
        return new ThreadMap(v4 + 1, arr_v, arr_object1);
    }

    public final boolean d(long v, @m Object object0) {
        int v1 = this.a(v);
        if(v1 < 0) {
            return false;
        }
        this.c[v1] = object0;
        return true;
    }
}

