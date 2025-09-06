package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,255:1\n243#2:256\n256#2,6:257\n248#2,14:263\n267#2,8:277\n267#2,8:285\n278#2,9:293\n291#2,5:302\n299#2,8:307\n315#2,9:315\n349#2,12:324\n328#2,18:336\n363#2,26:354\n392#2,5:380\n400#2,5:385\n409#2,2:390\n328#2,18:392\n412#2:410\n416#2:411\n420#2,6:412\n328#2,18:418\n427#2:436\n432#2,6:437\n328#2,18:443\n441#2:461\n446#2,6:462\n328#2,18:468\n453#2,2:486\n458#2,2:488\n328#2,18:490\n461#2:508\n466#2,2:509\n328#2,18:511\n469#2,6:529\n479#2:535\n484#2:536\n489#2,8:537\n500#2,6:545\n328#2,18:551\n507#2,10:569\n520#2,21:579\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412,6\n192#1:418,18\n192#1:436\n204#1:437,6\n204#1:443,18\n204#1:461\n212#1:462,6\n212#1:468,18\n212#1:486,2\n219#1:488,2\n219#1:490,18\n219#1:508\n228#1:509,2\n228#1:511,18\n228#1:529,6\n231#1:535\n234#1:536\n239#1:537,8\n245#1:545,6\n245#1:551,18\n245#1:569,10\n253#1:579,21\n*E\n"})
public class LongSparseArray implements Cloneable {
    @f
    public boolean a;
    @f
    public long[] b;
    @f
    public Object[] c;
    @f
    public int d;

    @j
    public LongSparseArray() {
        this(0, 1, null);
    }

    @j
    public LongSparseArray(int v) {
        if(v == 0) {
            this.b = ContainerHelpersKt.b;
            this.c = ContainerHelpersKt.c;
            return;
        }
        int v1 = ContainerHelpersKt.f(v);
        this.b = new long[v1];
        this.c = new Object[v1];
    }

    public LongSparseArray(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 10;
        }
        this(v);
    }

    public void a(long v, Object object0) {
        int v1 = this.d;
        if(v1 != 0 && v <= this.b[v1 - 1]) {
            this.n(v, object0);
            return;
        }
        if(this.a) {
            long[] arr_v = this.b;
            if(v1 >= arr_v.length) {
                Object[] arr_object = this.c;
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
                this.a = false;
                this.d = v3;
            }
        }
        int v4 = this.d;
        if(v4 >= this.b.length) {
            int v5 = ContainerHelpersKt.f(v4 + 1);
            long[] arr_v1 = Arrays.copyOf(this.b, v5);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.b = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.c, v5);
            L.o(arr_object1, "copyOf(this, newSize)");
            this.c = arr_object1;
        }
        this.b[v4] = v;
        this.c[v4] = object0;
        this.d = v4 + 1;
    }

    public void b() {
        int v = this.d;
        Object[] arr_object = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        this.d = 0;
        this.a = false;
    }

    @l
    public LongSparseArray c() {
        Object object0 = super.clone();
        L.n(object0, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        ((LongSparseArray)object0).b = (long[])this.b.clone();
        ((LongSparseArray)object0).c = (Object[])this.c.clone();
        return (LongSparseArray)object0;
    }

    @Override
    public Object clone() {
        return this.c();
    }

    public boolean d(long v) {
        return this.j(v) >= 0;
    }

    public boolean e(Object object0) {
        return this.k(object0) >= 0;
    }

    @k(message = "Alias for `remove(key)`.", replaceWith = @c0(expression = "remove(key)", imports = {}))
    public void f(long v) {
        int v1 = ContainerHelpersKt.b(this.b, this.d, v);
        if(v1 >= 0 && this.c[v1] != LongSparseArrayKt.a) {
            this.c[v1] = LongSparseArrayKt.a;
            this.a = true;
        }
    }

    @m
    public Object g(long v) {
        int v1 = ContainerHelpersKt.b(this.b, this.d, v);
        return v1 < 0 || this.c[v1] == LongSparseArrayKt.a ? null : this.c[v1];
    }

    public Object h(long v, Object object0) {
        int v1 = ContainerHelpersKt.b(this.b, this.d, v);
        return v1 < 0 || this.c[v1] == LongSparseArrayKt.a ? object0 : this.c[v1];
    }

    public int j(long v) {
        if(this.a) {
            int v1 = this.d;
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
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
            this.a = false;
            this.d = v3;
        }
        return ContainerHelpersKt.b(this.b, this.d, v);
    }

    public int k(Object object0) {
        int v = 0;
        if(this.a) {
            int v1 = this.d;
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
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
            this.a = false;
            this.d = v3;
        }
        int v4 = this.d;
        while(v < v4) {
            if(this.c[v] != object0) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    public boolean l() {
        return this.w() == 0;
    }

    public long m(int v) {
        if(v >= 0) {
            int v1 = this.d;
            if(v < v1) {
                if(this.a) {
                    long[] arr_v = this.b;
                    Object[] arr_object = this.c;
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
                    this.a = false;
                    this.d = v3;
                }
                return this.b[v];
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public void n(long v, Object object0) {
        int v1 = ContainerHelpersKt.b(this.b, this.d, v);
        if(v1 >= 0) {
            this.c[v1] = object0;
            return;
        }
        int v2 = ~v1;
        if(v2 < this.d && this.c[v2] == LongSparseArrayKt.a) {
            this.b[v2] = v;
            this.c[v2] = object0;
            return;
        }
        if(this.a) {
            int v3 = this.d;
            long[] arr_v = this.b;
            if(v3 >= arr_v.length) {
                Object[] arr_object = this.c;
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
                this.a = false;
                this.d = v5;
                v2 = ~ContainerHelpersKt.b(this.b, v5, v);
            }
        }
        int v6 = this.d;
        if(v6 >= this.b.length) {
            int v7 = ContainerHelpersKt.f(v6 + 1);
            long[] arr_v1 = Arrays.copyOf(this.b, v7);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.b = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.c, v7);
            L.o(arr_object1, "copyOf(this, newSize)");
            this.c = arr_object1;
        }
        int v8 = this.d;
        if(v8 - v2 != 0) {
            kotlin.collections.l.A0(this.b, this.b, v2 + 1, v2, v8);
            kotlin.collections.l.B0(this.c, this.c, v2 + 1, v2, this.d);
        }
        this.b[v2] = v;
        this.c[v2] = object0;
        ++this.d;
    }

    public void o(@l LongSparseArray longSparseArray0) {
        L.p(longSparseArray0, "other");
        int v = longSparseArray0.w();
        for(int v1 = 0; v1 < v; ++v1) {
            this.n(longSparseArray0.m(v1), longSparseArray0.x(v1));
        }
    }

    @m
    public Object p(long v, Object object0) {
        Object object1 = this.g(v);
        if(object1 == null) {
            this.n(v, object0);
        }
        return object1;
    }

    public void q(long v) {
        int v1 = ContainerHelpersKt.b(this.b, this.d, v);
        if(v1 >= 0 && this.c[v1] != LongSparseArrayKt.a) {
            this.c[v1] = LongSparseArrayKt.a;
            this.a = true;
        }
    }

    public boolean r(long v, Object object0) {
        int v1 = this.j(v);
        if(v1 >= 0 && L.g(object0, this.x(v1))) {
            this.s(v1);
            return true;
        }
        return false;
    }

    public void s(int v) {
        if(this.c[v] != LongSparseArrayKt.a) {
            this.c[v] = LongSparseArrayKt.a;
            this.a = true;
        }
    }

    @m
    public Object t(long v, Object object0) {
        int v1 = this.j(v);
        if(v1 >= 0) {
            Object[] arr_object = this.c;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
            return object1;
        }
        return null;
    }

    @Override
    @l
    public String toString() {
        if(this.w() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.d * 28);
        stringBuilder0.append('{');
        int v = this.d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.m(v1));
            stringBuilder0.append('=');
            Object object0 = this.x(v1);
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

    public boolean u(long v, Object object0, Object object1) {
        int v1 = this.j(v);
        if(v1 >= 0 && L.g(this.c[v1], object0)) {
            this.c[v1] = object1;
            return true;
        }
        return false;
    }

    public void v(int v, Object object0) {
        if(v >= 0) {
            int v1 = this.d;
            if(v < v1) {
                if(this.a) {
                    long[] arr_v = this.b;
                    Object[] arr_object = this.c;
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
                    this.a = false;
                    this.d = v3;
                }
                this.c[v] = object0;
                return;
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public int w() {
        if(this.a) {
            int v = this.d;
            long[] arr_v = this.b;
            Object[] arr_object = this.c;
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
            this.a = false;
            this.d = v2;
        }
        return this.d;
    }

    public Object x(int v) {
        if(v >= 0) {
            int v1 = this.d;
            if(v < v1) {
                if(this.a) {
                    long[] arr_v = this.b;
                    Object[] arr_object = this.c;
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
                    this.a = false;
                    this.d = v3;
                }
                return this.c[v];
            }
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }
}

