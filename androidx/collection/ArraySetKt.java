package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ArraySetKt {
    public static final int a = 4;

    public static final void a(@l ArraySet arraySet0, @l ArraySet arraySet1) {
        L.p(arraySet0, "<this>");
        L.p(arraySet1, "array");
        int v = arraySet1.h();
        arraySet0.b(arraySet0.h() + v);
        if(arraySet0.h() != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                arraySet0.add(arraySet1.o(v1));
            }
        }
        else if(v > 0) {
            kotlin.collections.l.I0(arraySet1.d(), arraySet0.d(), 0, 0, v, 6, null);
            kotlin.collections.l.K0(arraySet1.c(), arraySet0.c(), 0, 0, v, 6, null);
            if(arraySet0.h() != 0) {
                throw new ConcurrentModificationException();
            }
            arraySet0.m(v);
        }
    }

    public static final boolean b(@l ArraySet arraySet0, @l Collection collection0) {
        L.p(arraySet0, "<this>");
        L.p(collection0, "elements");
        arraySet0.b(arraySet0.h() + collection0.size());
        boolean z = false;
        for(Object object0: collection0) {
            z |= arraySet0.add(object0);
        }
        return z;
    }

    public static final boolean c(@l ArraySet arraySet0, Object object0) {
        int v2;
        int v1;
        L.p(arraySet0, "<this>");
        int v = arraySet0.h();
        if(object0 == null) {
            v1 = ArraySetKt.p(arraySet0);
            v2 = 0;
        }
        else {
            int v3 = object0.hashCode();
            v2 = v3;
            v1 = ArraySetKt.n(arraySet0, object0, v3);
        }
        int v4 = 8;
        if(v1 >= 0) {
            return false;
        }
        if(v >= arraySet0.d().length) {
            if(v >= 8) {
                v4 = (v >> 1) + v;
            }
            else if(v < 4) {
                v4 = 4;
            }
            int[] arr_v = arraySet0.d();
            Object[] arr_object = arraySet0.c();
            ArraySetKt.d(arraySet0, v4);
            if(v != arraySet0.h()) {
                throw new ConcurrentModificationException();
            }
            if(arraySet0.d().length != 0) {
                kotlin.collections.l.I0(arr_v, arraySet0.d(), 0, 0, arr_v.length, 6, null);
                kotlin.collections.l.K0(arr_object, arraySet0.c(), 0, 0, arr_object.length, 6, null);
            }
        }
        if(~v1 < v) {
            kotlin.collections.l.z0(arraySet0.d(), arraySet0.d(), -v1, ~v1, v);
            kotlin.collections.l.B0(arraySet0.c(), arraySet0.c(), -v1, ~v1, v);
        }
        if(v != arraySet0.h() || ~v1 >= arraySet0.d().length) {
            throw new ConcurrentModificationException();
        }
        arraySet0.d()[~v1] = v2;
        arraySet0.c()[~v1] = object0;
        arraySet0.m(arraySet0.h() + 1);
        return true;
    }

    public static final void d(@l ArraySet arraySet0, int v) {
        L.p(arraySet0, "<this>");
        arraySet0.l(new int[v]);
        arraySet0.k(new Object[v]);
    }

    @l
    public static final ArraySet e() {
        return new ArraySet(0, 1, null);
    }

    @l
    public static final ArraySet f(@l Object[] arr_object) {
        L.p(arr_object, "values");
        ArraySet arraySet0 = new ArraySet(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            arraySet0.add(arr_object[v]);
        }
        return arraySet0;
    }

    public static final int g(@l ArraySet arraySet0, int v) {
        L.p(arraySet0, "<this>");
        try {
            return ContainerHelpersKt.a(arraySet0.d(), arraySet0.h(), v);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new ConcurrentModificationException();
        }
    }

    public static final void h(@l ArraySet arraySet0) {
        L.p(arraySet0, "<this>");
        if(arraySet0.h() != 0) {
            arraySet0.l(ContainerHelpersKt.a);
            arraySet0.k(ContainerHelpersKt.c);
            arraySet0.m(0);
        }
        if(arraySet0.h() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean i(@l ArraySet arraySet0, @l Collection collection0) {
        L.p(arraySet0, "<this>");
        L.p(collection0, "elements");
        for(Object object0: collection0) {
            if(!arraySet0.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static final boolean j(@l ArraySet arraySet0, Object object0) {
        L.p(arraySet0, "<this>");
        return arraySet0.indexOf(object0) >= 0;
    }

    public static final void k(@l ArraySet arraySet0, int v) {
        L.p(arraySet0, "<this>");
        int v1 = arraySet0.h();
        if(arraySet0.d().length < v) {
            int[] arr_v = arraySet0.d();
            Object[] arr_object = arraySet0.c();
            ArraySetKt.d(arraySet0, v);
            if(arraySet0.h() > 0) {
                kotlin.collections.l.I0(arr_v, arraySet0.d(), 0, 0, arraySet0.h(), 6, null);
                kotlin.collections.l.K0(arr_object, arraySet0.c(), 0, 0, arraySet0.h(), 6, null);
            }
        }
        if(arraySet0.h() != v1) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean l(@l ArraySet arraySet0, @m Object object0) {
        L.p(arraySet0, "<this>");
        if(arraySet0 == object0) {
            return true;
        }
        if(!(object0 instanceof Set) || arraySet0.size() != ((Set)object0).size()) {
            return false;
        }
        try {
            int v = arraySet0.h();
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    return true;
                }
                if(!((Set)object0).contains(arraySet0.o(v1))) {
                    break;
                }
            }
        }
        catch(NullPointerException | ClassCastException unused_ex) {
        }
        return false;
    }

    public static final int m(@l ArraySet arraySet0) {
        L.p(arraySet0, "<this>");
        int[] arr_v = arraySet0.d();
        int v = arraySet0.h();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    public static final int n(@l ArraySet arraySet0, @m Object object0, int v) {
        L.p(arraySet0, "<this>");
        int v1 = arraySet0.h();
        if(v1 == 0) {
            return -1;
        }
        int v2 = ArraySetKt.g(arraySet0, v);
        if(v2 < 0) {
            return v2;
        }
        if(L.g(object0, arraySet0.c()[v2])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && arraySet0.d()[v3] == v; ++v3) {
            if(L.g(object0, arraySet0.c()[v3])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && arraySet0.d()[v4] == v; --v4) {
            if(L.g(object0, arraySet0.c()[v4])) {
                return v4;
            }
        }
        return ~v3;
    }

    public static final int o(@l ArraySet arraySet0, @m Object object0) {
        L.p(arraySet0, "<this>");
        return object0 == null ? ArraySetKt.p(arraySet0) : ArraySetKt.n(arraySet0, object0, object0.hashCode());
    }

    public static final int p(@l ArraySet arraySet0) {
        L.p(arraySet0, "<this>");
        return ArraySetKt.n(arraySet0, null, 0);
    }

    public static final boolean q(@l ArraySet arraySet0) {
        L.p(arraySet0, "<this>");
        return arraySet0.h() <= 0;
    }

    public static final boolean r(@l ArraySet arraySet0, @l ArraySet arraySet1) {
        L.p(arraySet0, "<this>");
        L.p(arraySet1, "array");
        int v = arraySet1.h();
        int v1 = arraySet0.h();
        for(int v2 = 0; v2 < v; ++v2) {
            arraySet0.remove(arraySet1.o(v2));
        }
        return v1 != arraySet0.h();
    }

    public static final boolean s(@l ArraySet arraySet0, @l Collection collection0) {
        L.p(arraySet0, "<this>");
        L.p(collection0, "elements");
        boolean z = false;
        for(Object object0: collection0) {
            z |= arraySet0.remove(object0);
        }
        return z;
    }

    public static final Object t(@l ArraySet arraySet0, int v) {
        int v1 = 8;
        L.p(arraySet0, "<this>");
        int v2 = arraySet0.h();
        Object object0 = arraySet0.c()[v];
        if(v2 <= 1) {
            arraySet0.clear();
            return object0;
        }
        if(arraySet0.d().length <= 8 || arraySet0.h() >= arraySet0.d().length / 3) {
            if(v < v2 - 1) {
                kotlin.collections.l.z0(arraySet0.d(), arraySet0.d(), v, v + 1, v2);
                kotlin.collections.l.B0(arraySet0.c(), arraySet0.c(), v, v + 1, v2);
            }
            arraySet0.c()[v2 - 1] = null;
        }
        else {
            if(arraySet0.h() > 8) {
                v1 = arraySet0.h() + (arraySet0.h() >> 1);
            }
            int[] arr_v = arraySet0.d();
            Object[] arr_object = arraySet0.c();
            ArraySetKt.d(arraySet0, v1);
            if(v > 0) {
                kotlin.collections.l.I0(arr_v, arraySet0.d(), 0, 0, v, 6, null);
                kotlin.collections.l.K0(arr_object, arraySet0.c(), 0, 0, v, 6, null);
            }
            if(v < v2 - 1) {
                kotlin.collections.l.z0(arr_v, arraySet0.d(), v, v + 1, v2);
                kotlin.collections.l.B0(arr_object, arraySet0.c(), v, v + 1, v2);
            }
        }
        if(v2 != arraySet0.h()) {
            throw new ConcurrentModificationException();
        }
        arraySet0.m(v2 - 1);
        return object0;
    }

    public static final boolean u(@l ArraySet arraySet0, Object object0) {
        L.p(arraySet0, "<this>");
        int v = arraySet0.indexOf(object0);
        if(v >= 0) {
            arraySet0.j(v);
            return true;
        }
        return false;
    }

    public static final boolean v(@l ArraySet arraySet0, @l Collection collection0) {
        L.p(arraySet0, "<this>");
        L.p(collection0, "elements");
        int v = arraySet0.h() - 1;
        boolean z = false;
        while(-1 < v) {
            if(!u.W1(collection0, arraySet0.c()[v])) {
                arraySet0.j(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @l
    public static final String w(@l ArraySet arraySet0) {
        L.p(arraySet0, "<this>");
        if(arraySet0.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arraySet0.h() * 14);
        stringBuilder0.append('{');
        int v = arraySet0.h();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = arraySet0.o(v1);
            if(object0 == arraySet0) {
                stringBuilder0.append("(this Set)");
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

    public static final Object x(@l ArraySet arraySet0, int v) {
        L.p(arraySet0, "<this>");
        return arraySet0.c()[v];
    }
}

