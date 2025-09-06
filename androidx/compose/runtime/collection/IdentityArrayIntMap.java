package androidx.compose.runtime.collection;

import A3.o;
import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.b0;
import kotlin.jvm.internal.L;
import y4.l;

public final class IdentityArrayIntMap {
    private int a;
    @l
    private Object[] b;
    @l
    private int[] c;

    public IdentityArrayIntMap() {
        this.b = new Object[4];
        this.c = new int[4];
    }

    public final int a(@l Object object0, int v) {
        int v1;
        L.p(object0, "key");
        if(this.a > 0) {
            v1 = this.c(object0);
            if(v1 >= 0) {
                int[] arr_v = this.c;
                int v2 = arr_v[v1];
                arr_v[v1] = v;
                return v2;
            }
        }
        else {
            v1 = -1;
        }
        int v3 = this.a;
        Object[] arr_object = this.b;
        if(v3 == arr_object.length) {
            Object[] arr_object1 = new Object[arr_object.length * 2];
            int[] arr_v1 = new int[arr_object.length * 2];
            kotlin.collections.l.B0(arr_object, arr_object1, -v1, -(v1 + 1), v3);
            kotlin.collections.l.z0(this.c, arr_v1, -v1, -(v1 + 1), this.a);
            kotlin.collections.l.K0(this.b, arr_object1, 0, 0, -(v1 + 1), 6, null);
            kotlin.collections.l.I0(this.c, arr_v1, 0, 0, -(v1 + 1), 6, null);
            this.b = arr_object1;
            this.c = arr_v1;
        }
        else {
            kotlin.collections.l.B0(arr_object, arr_object, -v1, -(v1 + 1), v3);
            kotlin.collections.l.z0(this.c, this.c, -v1, -(v1 + 1), this.a);
        }
        this.b[-(v1 + 1)] = object0;
        this.c[-(v1 + 1)] = v;
        ++this.a;
        return -1;
    }

    public final boolean b(@l o o0) {
        L.p(o0, "predicate");
        int v = this.i();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.g()[v1];
            L.n(object0, "null cannot be cast to non-null type kotlin.Any");
            if(((Boolean)o0.invoke(object0, ((int)this.k()[v1]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final int c(Object object0) {
        int v = this.a - 1;
        int v1 = ActualJvm_jvmKt.b(object0);
        int v2 = 0;
        while(v2 <= v) {
            int v3 = v2 + v >>> 1;
            Object object1 = this.b[v3];
            int v4 = ActualJvm_jvmKt.b(object1);
            if(v4 < v1) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > v1) {
                v = v3 - 1;
                continue;
            }
            return object1 == object0 ? v3 : this.d(v3, object0, v1);
        }
        return -(v2 + 1);
    }

    private final int d(int v, Object object0, int v1) {
        for(int v2 = v - 1; -1 < v2; --v2) {
            Object object1 = this.b[v2];
            if(object1 == object0) {
                return v2;
            }
            if(ActualJvm_jvmKt.b(object1) != v1) {
                break;
            }
        }
        int v3 = v + 1;
        int v4 = this.a;
        while(v3 < v4) {
            Object object2 = this.b[v3];
            if(object2 == object0) {
                return v3;
            }
            if(ActualJvm_jvmKt.b(object2) != v1) {
                return -(v3 + 1);
            }
            ++v3;
        }
        return -(this.a + 1);
    }

    public final void e(@l o o0) {
        L.p(o0, "block");
        int v = this.i();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.g()[v1];
            L.n(object0, "null cannot be cast to non-null type kotlin.Any");
            o0.invoke(object0, ((int)this.k()[v1]));
        }
    }

    public final int f(@l Object object0) {
        L.p(object0, "key");
        int v = this.c(object0);
        if(v < 0) {
            throw new IllegalStateException("Key not found");
        }
        return this.c[v];
    }

    @l
    public final Object[] g() {
        return this.b;
    }

    @b0
    public static void h() {
    }

    public final int i() {
        return this.a;
    }

    @b0
    public static void j() {
    }

    @l
    public final int[] k() {
        return this.c;
    }

    @b0
    public static void l() {
    }

    public final boolean m(@l Object object0) {
        L.p(object0, "key");
        int v = this.c(object0);
        if(v >= 0) {
            int v1 = this.a;
            if(v < v1 - 1) {
                kotlin.collections.l.B0(this.b, this.b, v, v + 1, v1);
                kotlin.collections.l.z0(this.c, this.c, v, v + 1, this.a);
            }
            int v2 = this.a - 1;
            this.a = v2;
            this.b[v2] = null;
            return true;
        }
        return false;
    }

    public final void n(@l o o0) {
        L.p(o0, "predicate");
        int v = this.i();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.g()[v1];
            L.n(object0, "null cannot be cast to non-null type kotlin.Any");
            int v3 = this.k()[v1];
            if(!((Boolean)o0.invoke(object0, v3)).booleanValue()) {
                if(v2 != v1) {
                    this.g()[v2] = object0;
                    this.k()[v2] = v3;
                }
                ++v2;
            }
        }
        int v4 = this.i();
        for(int v5 = v2; v5 < v4; ++v5) {
            this.g()[v5] = null;
        }
        this.p(v2);
    }

    public final void o(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.b = arr_object;
    }

    public final void p(int v) {
        this.a = v;
    }

    public final void q(@l int[] arr_v) {
        L.p(arr_v, "<set-?>");
        this.c = arr_v;
    }
}

