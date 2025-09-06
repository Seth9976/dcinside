package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Arrays;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nIdentityScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,315:1\n236#1,5:321\n241#1,17:342\n236#1,22:359\n61#1:381\n61#1:382\n61#1:383\n105#2,5:316\n146#2,16:326\n*S KotlinDebug\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n*L\n220#1:321,5\n220#1:342,17\n230#1:359,22\n270#1:381\n292#1:382\n302#1:383\n91#1:316,5\n221#1:326,16\n*E\n"})
public final class IdentityScopeMap {
    @l
    private int[] a;
    @l
    private Object[] b;
    @l
    private IdentityArraySet[] c;
    private int d;

    public IdentityScopeMap() {
        int[] arr_v = new int[50];
        for(int v = 0; v < 50; ++v) {
            arr_v[v] = v;
        }
        this.a = arr_v;
        this.b = new Object[50];
        this.c = new IdentityArraySet[50];
    }

    private final Object A(int v) {
        Object object0 = this.b[this.a[v]];
        L.m(object0);
        return object0;
    }

    public final boolean c(@l Object object0, @l Object object1) {
        L.p(object0, "value");
        L.p(object1, "scope");
        return this.i(object0).add(object1);
    }

    public final void d() {
        for(int v = 0; v < this.c.length; ++v) {
            IdentityArraySet identityArraySet0 = this.c[v];
            if(identityArraySet0 != null) {
                identityArraySet0.clear();
            }
            this.a[v] = v;
            this.b[v] = null;
        }
        this.d = 0;
    }

    public final boolean e(@l Object object0) {
        L.p(object0, "element");
        return this.f(object0) >= 0;
    }

    private final int f(Object object0) {
        int v = ActualJvm_jvmKt.b(object0);
        int v1 = this.d - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            Object object1 = this.b[this.a[v3]];
            L.m(object1);
            int v4 = ActualJvm_jvmKt.b(object1);
            if(v4 < v) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > v) {
                v1 = v3 - 1;
                continue;
            }
            return object0 == object1 ? v3 : this.g(v3, object0, v);
        }
        return -(v2 + 1);
    }

    private final int g(int v, Object object0, int v1) {
        for(int v2 = v - 1; -1 < v2; --v2) {
            Object object1 = this.b[this.a[v2]];
            L.m(object1);
            if(object1 == object0) {
                return v2;
            }
            if(ActualJvm_jvmKt.b(object1) != v1) {
                break;
            }
        }
        int v3 = v + 1;
        int v4 = this.d;
        while(v3 < v4) {
            Object object2 = this.b[this.a[v3]];
            L.m(object2);
            if(object2 == object0) {
                return v3;
            }
            if(ActualJvm_jvmKt.b(object2) != v1) {
                return -(v3 + 1);
            }
            ++v3;
        }
        return -(this.d + 1);
    }

    public final void h(@l Object object0, @l Function1 function10) {
        L.p(object0, "value");
        L.p(function10, "block");
        int v = this.f(object0);
        if(v >= 0) {
            IdentityArraySet identityArraySet0 = this.v(v);
            int v1 = identityArraySet0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                function10.invoke(identityArraySet0.get(v2));
            }
        }
    }

    private final IdentityArraySet i(Object object0) {
        int v;
        if(this.d > 0) {
            v = this.f(object0);
            if(v >= 0) {
                return this.v(v);
            }
        }
        else {
            v = -1;
        }
        int v1 = this.d;
        int[] arr_v = this.a;
        if(v1 < arr_v.length) {
            int v2 = arr_v[v1];
            this.b[v2] = object0;
            IdentityArraySet identityArraySet0 = this.c[v2];
            if(identityArraySet0 == null) {
                identityArraySet0 = new IdentityArraySet();
                this.c[v2] = identityArraySet0;
            }
            int v3 = this.d;
            if(-(v + 1) < v3) {
                kotlin.collections.l.z0(this.a, this.a, -v, -(v + 1), v3);
            }
            this.a[-(v + 1)] = v2;
            ++this.d;
            return identityArraySet0;
        }
        int v4 = arr_v.length * 2;
        Object[] arr_object = Arrays.copyOf(this.c, v4);
        L.o(arr_object, "copyOf(this, newSize)");
        this.c = (IdentityArraySet[])arr_object;
        IdentityArraySet identityArraySet1 = new IdentityArraySet();
        this.c[v1] = identityArraySet1;
        Object[] arr_object1 = Arrays.copyOf(this.b, v4);
        L.o(arr_object1, "copyOf(this, newSize)");
        this.b = arr_object1;
        arr_object1[v1] = object0;
        int[] arr_v1 = new int[v4];
        int v5 = this.d;
        while(true) {
            ++v5;
            if(v5 >= v4) {
                break;
            }
            arr_v1[v5] = v5;
        }
        int v6 = this.d;
        if(-(v + 1) < v6) {
            kotlin.collections.l.z0(this.a, arr_v1, -v, -(v + 1), v6);
        }
        arr_v1[-(v + 1)] = v1;
        if(-(v + 1) > 0) {
            kotlin.collections.l.I0(this.a, arr_v1, 0, 0, -(v + 1), 6, null);
        }
        this.a = arr_v1;
        ++this.d;
        return identityArraySet1;
    }

    @l
    public final IdentityArraySet[] j() {
        return this.c;
    }

    @b0
    public static void k() {
    }

    public final int l() {
        return this.d;
    }

    @b0
    public static void m() {
    }

    @l
    public final int[] n() {
        return this.a;
    }

    @b0
    public static void o() {
    }

    @l
    public final Object[] p() {
        return this.b;
    }

    @b0
    public static void q() {
    }

    public final boolean r(@l Object object0, @l Object object1) {
        L.p(object0, "value");
        L.p(object1, "scope");
        int v = this.f(object0);
        if(v >= 0) {
            int v1 = this.a[v];
            IdentityArraySet identityArraySet0 = this.c[v1];
            if(identityArraySet0 == null) {
                return false;
            }
            boolean z = identityArraySet0.remove(object1);
            if(identityArraySet0.size() == 0) {
                int v2 = this.d;
                if(v + 1 < v2) {
                    kotlin.collections.l.z0(this.a, this.a, v, v + 1, v2);
                }
                int v3 = this.d;
                this.a[v3 - 1] = v1;
                this.b[v1] = null;
                this.d = v3 - 1;
            }
            return z;
        }
        return false;
    }

    public final void s(@l Object object0) {
        L.p(object0, "scope");
        int v = this.l();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = this.n()[v1];
            IdentityArraySet identityArraySet0 = this.j()[v3];
            L.m(identityArraySet0);
            identityArraySet0.remove(object0);
            if(identityArraySet0.size() > 0) {
                if(v2 != v1) {
                    int v4 = this.n()[v2];
                    this.n()[v2] = v3;
                    this.n()[v1] = v4;
                }
                ++v2;
            }
        }
        int v5 = this.l();
        for(int v6 = v2; v6 < v5; ++v6) {
            this.p()[this.n()[v6]] = null;
        }
        this.x(v2);
    }

    public final void t(@l Function1 function10) {
        L.p(function10, "predicate");
        int v = this.l();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = this.n()[v1];
            IdentityArraySet identityArraySet0 = this.j()[v3];
            L.m(identityArraySet0);
            int v4 = identityArraySet0.size();
            int v6 = 0;
            for(int v5 = 0; v5 < v4; ++v5) {
                Object object0 = identityArraySet0.h()[v5];
                L.n(object0, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                    if(v6 != v5) {
                        identityArraySet0.h()[v6] = object0;
                    }
                    ++v6;
                }
            }
            int v7 = identityArraySet0.size();
            for(int v8 = v6; v8 < v7; ++v8) {
                identityArraySet0.h()[v8] = null;
            }
            identityArraySet0.l(v6);
            if(identityArraySet0.size() > 0) {
                if(v2 != v1) {
                    int v9 = this.n()[v2];
                    this.n()[v2] = v3;
                    this.n()[v1] = v9;
                }
                ++v2;
            }
        }
        int v10 = this.l();
        for(int v11 = v2; v11 < v10; ++v11) {
            this.p()[this.n()[v11]] = null;
        }
        this.x(v2);
    }

    private final void u(Function1 function10) {
        int v = this.l();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = this.n()[v1];
            IdentityArraySet identityArraySet0 = this.j()[v3];
            L.m(identityArraySet0);
            function10.invoke(identityArraySet0);
            if(identityArraySet0.size() > 0) {
                if(v2 != v1) {
                    int v4 = this.n()[v2];
                    this.n()[v2] = v3;
                    this.n()[v1] = v4;
                }
                ++v2;
            }
        }
        int v5 = this.l();
        for(int v6 = v2; v6 < v5; ++v6) {
            this.p()[this.n()[v6]] = null;
        }
        this.x(v2);
    }

    private final IdentityArraySet v(int v) {
        IdentityArraySet identityArraySet0 = this.c[this.a[v]];
        L.m(identityArraySet0);
        return identityArraySet0;
    }

    public final void w(@l IdentityArraySet[] arr_identityArraySet) {
        L.p(arr_identityArraySet, "<set-?>");
        this.c = arr_identityArraySet;
    }

    public final void x(int v) {
        this.d = v;
    }

    public final void y(@l int[] arr_v) {
        L.p(arr_v, "<set-?>");
        this.a = arr_v;
    }

    public final void z(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.b = arr_object;
    }
}

