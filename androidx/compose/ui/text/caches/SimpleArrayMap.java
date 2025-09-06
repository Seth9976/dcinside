package androidx.compose.ui.text.caches;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;
import z3.j;

public final class SimpleArrayMap {
    @l
    private int[] a;
    @l
    private Object[] b;
    private int c;

    @j
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    @j
    public SimpleArrayMap(int v) {
        if(v == 0) {
            this.a = ContainerHelpersKt.a;
            this.b = ContainerHelpersKt.b;
        }
        else {
            this.a = new int[v];
            this.b = new Object[v << 1];
        }
        this.c = 0;
    }

    public SimpleArrayMap(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public SimpleArrayMap(@m SimpleArrayMap simpleArrayMap0) {
        this(0, 1, null);
        if(simpleArrayMap0 != null) {
            this.o(simpleArrayMap0);
        }
    }

    public final void a() {
        if(this.c > 0) {
            this.a = ContainerHelpersKt.a;
            this.b = ContainerHelpersKt.b;
            this.c = 0;
        }
        if(this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean b(Object object0) {
        return this.i(object0) >= 0;
    }

    public final boolean c(Object object0) {
        return this.k(object0) >= 0;
    }

    public final void d(int v) {
        int v1 = this.c;
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, v);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.b, v << 1);
            L.o(arr_object, "copyOf(this, newSize)");
            this.b = arr_object;
        }
        if(this.c != v1) {
            throw new ConcurrentModificationException();
        }
    }

    @m
    public final Object e(Object object0) {
        int v = this.i(object0);
        return v < 0 ? null : this.b[(v << 1) + 1];
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        try {
            if(object0 instanceof SimpleArrayMap) {
                int v = this.c;
                if(v != ((SimpleArrayMap)object0).c) {
                    return false;
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object1 = this.m(v1);
                    Object object2 = this.z(v1);
                    Object object3 = ((SimpleArrayMap)object0).e(object1);
                    if(object2 == null) {
                        if(object3 != null || !((SimpleArrayMap)object0).b(object1)) {
                            return false;
                        }
                    }
                    else if(!L.g(object2, object3)) {
                        return false;
                    }
                }
                return true;
            }
            if(!(object0 instanceof Map) || this.c != ((Map)object0).size()) {
                return false;
            }
            int v2 = this.c;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object4 = this.m(v3);
                Object object5 = this.z(v3);
                Object object6 = ((Map)object0).get(object4);
                if(object5 == null) {
                    if(object6 != null || !((Map)object0).containsKey(object4)) {
                        return false;
                    }
                }
                else if(!L.g(object5, object6)) {
                    return false;
                }
            }
            return true;
        }
        catch(NullPointerException | ClassCastException unused_ex) {
        }
        return false;
    }

    public final Object f(Object object0, Object object1) {
        int v = this.i(object0);
        return v < 0 ? object1 : this.b[(v << 1) + 1];
    }

    protected final int g() {
        return this.c;
    }

    protected final int h(@l Object object0, int v) {
        L.p(object0, "key");
        int v1 = this.c;
        if(v1 == 0) {
            return -1;
        }
        int v2 = ContainerHelpersKt.a(this.a, v1, v);
        if(v2 < 0) {
            return v2;
        }
        if(L.g(object0, this.b[v2 << 1])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.a[v3] == v; ++v3) {
            if(L.g(object0, this.b[v3 << 1])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.a[v4] == v; --v4) {
            if(L.g(object0, this.b[v4 << 1])) {
                return v4;
            }
        }
        return ~v3;
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.a;
        Object[] arr_object = this.b;
        int v = this.c;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 1; v2 < v; v1 += 2) {
            Object object0 = arr_object[v1];
            v3 += (object0 == null ? 0 : object0.hashCode()) ^ arr_v[v2];
            ++v2;
        }
        return v3;
    }

    public final int i(@m Object object0) {
        return object0 == null ? this.j() : this.h(object0, object0.hashCode());
    }

    protected final int j() {
        int v = this.c;
        if(v == 0) {
            return -1;
        }
        int v1 = ContainerHelpersKt.a(this.a, v, 0);
        if(v1 < 0) {
            return v1;
        }
        if(this.b[v1 << 1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.a[v2] == 0; ++v2) {
            if(this.b[v2 << 1] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.a[v3] == 0; --v3) {
            if(this.b[v3 << 1] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    public final int k(Object object0) {
        int v = this.c << 1;
        Object[] arr_object = this.b;
        if(object0 == null) {
            for(int v1 = 1; v1 < v; v1 += 2) {
                if(arr_object[v1] == null) {
                    return v1 >> 1;
                }
            }
            return -1;
        }
        for(int v2 = 1; v2 < v; v2 += 2) {
            if(L.g(object0, arr_object[v2])) {
                return v2 >> 1;
            }
        }
        return -1;
    }

    public final boolean l() {
        return this.c <= 0;
    }

    public final Object m(int v) {
        return this.b[v << 1];
    }

    @m
    public final Object n(Object object0, Object object1) {
        int v2;
        int v1;
        int v = this.c;
        if(object0 == null) {
            v1 = this.j();
            v2 = 0;
        }
        else {
            v2 = object0.hashCode();
            v1 = this.h(object0, v2);
        }
        if(v1 >= 0) {
            int v3 = (v1 << 1) + 1;
            Object[] arr_object = this.b;
            Object object2 = arr_object[v3];
            arr_object[v3] = object1;
            return object2;
        }
        int v4 = 8;
        int[] arr_v = this.a;
        if(v >= arr_v.length) {
            if(v >= 8) {
                v4 = (v >> 1) + v;
            }
            else if(v < 4) {
                v4 = 4;
            }
            int[] arr_v1 = Arrays.copyOf(arr_v, v4);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.b, v4 << 1);
            L.o(arr_object1, "copyOf(this, newSize)");
            this.b = arr_object1;
            if(v != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if(~v1 < v) {
            kotlin.collections.l.z0(this.a, this.a, -v1, ~v1, v);
            kotlin.collections.l.B0(this.b, this.b, -v1 << 1, ~v1 << 1, this.c << 1);
        }
        int v5 = this.c;
        if(v == v5) {
            int[] arr_v2 = this.a;
            if(~v1 < arr_v2.length) {
                arr_v2[~v1] = v2;
                Object[] arr_object2 = this.b;
                arr_object2[~v1 << 1] = object0;
                arr_object2[(~v1 << 1) + 1] = object1;
                this.c = v5 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void o(@l SimpleArrayMap simpleArrayMap0) {
        L.p(simpleArrayMap0, "array");
        int v = simpleArrayMap0.c;
        this.d(this.c + v);
        if(this.c != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.n(simpleArrayMap0.m(v1), simpleArrayMap0.z(v1));
            }
        }
        else if(v > 0) {
            kotlin.collections.l.z0(simpleArrayMap0.a, this.a, 0, 0, v);
            kotlin.collections.l.B0(simpleArrayMap0.b, this.b, 0, 0, v << 1);
            this.c = v;
        }
    }

    @m
    public final Object p(Object object0, Object object1) {
        Object object2 = this.e(object0);
        return object2 == null ? this.n(object0, object1) : object2;
    }

    @m
    public final Object q(Object object0) {
        int v = this.i(object0);
        return v < 0 ? null : this.s(v);
    }

    public final boolean r(Object object0, Object object1) {
        int v = this.i(object0);
        if(v >= 0 && L.g(object1, this.z(v))) {
            this.s(v);
            return true;
        }
        return false;
    }

    @m
    public final Object s(int v) {
        Object[] arr_object = this.b;
        Object object0 = arr_object[(v << 1) + 1];
        int v1 = this.c;
        if(v1 <= 1) {
            this.a();
            return object0;
        }
        int[] arr_v = this.a;
        int v2 = 8;
        if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
            if(v < v1 - 1) {
                kotlin.collections.l.z0(arr_v, arr_v, v, v + 1, v1);
                kotlin.collections.l.B0(this.b, this.b, v << 1, v + 1 << 1, v1 << 1);
            }
            Object[] arr_object1 = this.b;
            int v3 = v1 - 1 << 1;
            arr_object1[v3] = null;
            arr_object1[v3 + 1] = null;
        }
        else {
            if(v1 > 8) {
                v2 = v1 + (v1 >> 1);
            }
            int[] arr_v1 = new int[v2];
            this.a = arr_v1;
            this.b = new Object[v2 << 1];
            if(v > 0) {
                kotlin.collections.l.z0(arr_v, arr_v1, 0, 0, v);
                kotlin.collections.l.B0(arr_object, this.b, 0, 0, v << 1);
            }
            if(v < v1 - 1) {
                kotlin.collections.l.z0(arr_v, this.a, v, v + 1, v1);
                kotlin.collections.l.B0(arr_object, this.b, v << 1, v + 1 << 1, v1 << 1);
            }
        }
        if(v1 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = v1 - 1;
        return object0;
    }

    @m
    public final Object t(Object object0, Object object1) {
        int v = this.i(object0);
        return v < 0 ? null : this.v(v, object1);
    }

    @Override
    @l
    public String toString() {
        if(this.l()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.c * 28);
        stringBuilder0.append('{');
        int v = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.m(v1);
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.z(v1);
            if(object1 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        L.o(s, "buffer.toString()");
        return s;
    }

    public final boolean u(Object object0, Object object1, Object object2) {
        int v = this.i(object0);
        if(v >= 0 && this.z(v) == object1) {
            this.v(v, object2);
            return true;
        }
        return false;
    }

    public final Object v(int v, Object object0) {
        int v1 = (v << 1) + 1;
        Object[] arr_object = this.b;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    protected final void w(int v) {
        this.c = v;
    }

    @i(name = "size")
    public final int x() {
        return this.c;
    }

    public static void y() {
    }

    public final Object z(int v) {
        return this.b[(v << 1) + 1];
    }
}

