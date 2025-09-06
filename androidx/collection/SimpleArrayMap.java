package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;
import z3.j;

@s0({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
public class SimpleArrayMap {
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
        this.a = v == 0 ? ContainerHelpersKt.a : new int[v];
        this.b = v == 0 ? ContainerHelpersKt.c : new Object[v << 1];
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
            this.h(simpleArrayMap0);
        }
    }

    @i(name = "__restricted$indexOfValue")
    public final int a(Object object0) {
        int v = this.c * 2;
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

    public void b(int v) {
        int v1 = this.c;
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, v);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.b, v * 2);
            L.o(arr_object, "copyOf(this, newSize)");
            this.b = arr_object;
        }
        if(this.c != v1) {
            throw new ConcurrentModificationException();
        }
    }

    private final Object c(Object object0, Object object1) {
        int v = this.e(object0);
        return v < 0 ? object1 : this.b[(v << 1) + 1];
    }

    public void clear() {
        if(this.c > 0) {
            this.a = ContainerHelpersKt.a;
            this.b = ContainerHelpersKt.c;
            this.c = 0;
        }
        if(this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object object0) {
        return this.e(object0) >= 0;
    }

    public boolean containsValue(Object object0) {
        return this.a(object0) >= 0;
    }

    private final int d(Object object0, int v) {
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

    public int e(Object object0) {
        return object0 == null ? this.f() : this.d(object0, object0.hashCode());
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        try {
            if(object0 instanceof SimpleArrayMap) {
                if(this.size() != ((SimpleArrayMap)object0).size()) {
                    return false;
                }
                int v = this.c;
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object1 = this.g(v1);
                    Object object2 = this.l(v1);
                    Object object3 = ((SimpleArrayMap)object0).get(object1);
                    if(object2 == null) {
                        if(object3 != null || !((SimpleArrayMap)object0).containsKey(object1)) {
                            return false;
                        }
                    }
                    else if(!L.g(object2, object3)) {
                        return false;
                    }
                }
                return true;
            }
            if(!(object0 instanceof Map) || this.size() != ((Map)object0).size()) {
                return false;
            }
            int v2 = this.c;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object4 = this.g(v3);
                Object object5 = this.l(v3);
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

    private final int f() {
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

    public Object g(int v) {
        if(v < 0 || v >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
        }
        return this.b[v << 1];
    }

    @m
    public Object get(Object object0) {
        int v = this.e(object0);
        return v < 0 ? null : this.b[(v << 1) + 1];
    }

    public Object getOrDefault(@m Object object0, Object object1) {
        int v = this.e(object0);
        return v < 0 ? object1 : this.b[(v << 1) + 1];
    }

    public void h(@l SimpleArrayMap simpleArrayMap0) {
        L.p(simpleArrayMap0, "map");
        int v = simpleArrayMap0.c;
        this.b(this.c + v);
        if(this.c != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.put(simpleArrayMap0.g(v1), simpleArrayMap0.l(v1));
            }
        }
        else if(v > 0) {
            kotlin.collections.l.z0(simpleArrayMap0.a, this.a, 0, 0, v);
            kotlin.collections.l.B0(simpleArrayMap0.b, this.b, 0, 0, v << 1);
            this.c = v;
        }
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

    public Object i(int v) {
        if(v >= 0) {
            int v1 = this.c;
            if(v < v1) {
                Object[] arr_object = this.b;
                Object object0 = arr_object[(v << 1) + 1];
                if(v1 <= 1) {
                    this.clear();
                    return object0;
                }
                int[] arr_v = this.a;
                int v2 = 8;
                if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
                    if(v < v1 - 1) {
                        kotlin.collections.l.z0(arr_v, arr_v, v, v + 1, v1);
                        kotlin.collections.l.B0(this.b, this.b, v << 1, v + 1 << 1, v1 << 1);
                    }
                    Object[] arr_object2 = this.b;
                    int v3 = v1 - 1 << 1;
                    arr_object2[v3] = null;
                    arr_object2[v3 + 1] = null;
                }
                else {
                    if(v1 > 8) {
                        v2 = v1 + (v1 >> 1);
                    }
                    int[] arr_v1 = Arrays.copyOf(arr_v, v2);
                    L.o(arr_v1, "copyOf(this, newSize)");
                    this.a = arr_v1;
                    Object[] arr_object1 = Arrays.copyOf(this.b, v2 << 1);
                    L.o(arr_object1, "copyOf(this, newSize)");
                    this.b = arr_object1;
                    if(v1 != this.c) {
                        throw new ConcurrentModificationException();
                    }
                    if(v > 0) {
                        kotlin.collections.l.z0(arr_v, this.a, 0, 0, v);
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
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public Object j(int v, Object object0) {
        if(v < 0 || v >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
        }
        int v1 = (v << 1) + 1;
        Object[] arr_object = this.b;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    public Object l(int v) {
        if(v < 0 || v >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + v).toString());
        }
        return this.b[(v << 1) + 1];
    }

    @m
    public Object put(Object object0, Object object1) {
        int v = this.c;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = object0 == null ? this.f() : this.d(object0, v1);
        if(v2 >= 0) {
            int v3 = (v2 << 1) + 1;
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
        if(~v2 < v) {
            kotlin.collections.l.z0(this.a, this.a, -v2, ~v2, v);
            kotlin.collections.l.B0(this.b, this.b, -v2 << 1, ~v2 << 1, this.c << 1);
        }
        int v5 = this.c;
        if(v == v5) {
            int[] arr_v2 = this.a;
            if(~v2 < arr_v2.length) {
                arr_v2[~v2] = v1;
                Object[] arr_object2 = this.b;
                arr_object2[~v2 << 1] = object0;
                arr_object2[(~v2 << 1) + 1] = object1;
                this.c = v5 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @m
    public Object putIfAbsent(Object object0, Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? this.put(object0, object1) : object2;
    }

    @m
    public Object remove(Object object0) {
        int v = this.e(object0);
        return v < 0 ? null : this.i(v);
    }

    public boolean remove(Object object0, Object object1) {
        int v = this.e(object0);
        if(v >= 0 && L.g(object1, this.l(v))) {
            this.i(v);
            return true;
        }
        return false;
    }

    @m
    public Object replace(Object object0, Object object1) {
        int v = this.e(object0);
        return v < 0 ? null : this.j(v, object1);
    }

    public boolean replace(Object object0, Object object1, Object object2) {
        int v = this.e(object0);
        if(v >= 0 && L.g(object1, this.l(v))) {
            this.j(v, object2);
            return true;
        }
        return false;
    }

    public int size() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.c * 28);
        stringBuilder0.append('{');
        int v = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.g(v1);
            if(object0 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.l(v1);
            if(object1 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder(capacity).…builderAction).toString()");
        return s;
    }
}

