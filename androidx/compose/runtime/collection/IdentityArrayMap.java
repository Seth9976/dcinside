package androidx.compose.runtime.collection;

import A3.o;
import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,208:1\n118#1,22:209\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n142#1:209,22\n*E\n"})
public final class IdentityArrayMap {
    @l
    private Object[] a;
    @l
    private Object[] b;
    private int c;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public IdentityArrayMap(int v) {
        this.a = new Object[v];
        this.b = new Object[v];
    }

    public IdentityArrayMap(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final void a() {
        this.c = 0;
        kotlin.collections.l.V1(this.a, null, 0, 0, 6, null);
        kotlin.collections.l.V1(this.b, null, 0, 0, 6, null);
    }

    public final boolean b(@l Object object0) {
        L.p(object0, "key");
        return this.c(object0) >= 0;
    }

    private final int c(Object object0) {
        int v = ActualJvm_jvmKt.b(object0);
        int v1 = this.c - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            Object object1 = this.a[v3];
            int v4 = ActualJvm_jvmKt.b(object1);
            if(v4 < v) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > v) {
                v1 = v3 - 1;
                continue;
            }
            return object0 == object1 ? v3 : this.d(v3, object0, v);
        }
        return -(v2 + 1);
    }

    private final int d(int v, Object object0, int v1) {
        for(int v2 = v - 1; -1 < v2; --v2) {
            Object object1 = this.a[v2];
            if(object1 == object0) {
                return v2;
            }
            if(ActualJvm_jvmKt.b(object1) != v1) {
                break;
            }
        }
        int v3 = v + 1;
        int v4 = this.c;
        while(v3 < v4) {
            Object object2 = this.a[v3];
            if(object2 == object0) {
                return v3;
            }
            if(ActualJvm_jvmKt.b(object2) != v1) {
                return -(v3 + 1);
            }
            ++v3;
        }
        return -(this.c + 1);
    }

    public final void e(@l o o0) {
        L.p(o0, "block");
        int v = this.h();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.g()[v1];
            L.n(object0, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            o0.invoke(object0, this.i()[v1]);
        }
    }

    @m
    public final Object f(@l Object object0) {
        L.p(object0, "key");
        int v = this.c(object0);
        return v < 0 ? null : this.b[v];
    }

    @l
    public final Object[] g() {
        return this.a;
    }

    public final int h() {
        return this.c;
    }

    @l
    public final Object[] i() {
        return this.b;
    }

    public final boolean j() {
        return this.c == 0;
    }

    public final boolean k() {
        return this.c > 0;
    }

    @m
    public final Object l(@l Object object0) {
        L.p(object0, "key");
        int v = this.c(object0);
        if(v >= 0) {
            Object[] arr_object = this.b;
            Object object1 = arr_object[v];
            int v1 = this.c;
            Object[] arr_object1 = this.a;
            kotlin.collections.l.B0(arr_object1, arr_object1, v, v + 1, v1);
            kotlin.collections.l.B0(arr_object, arr_object, v, v + 1, v1);
            arr_object1[v1 - 1] = null;
            arr_object[v1 - 1] = null;
            this.c = v1 - 1;
            return object1;
        }
        return null;
    }

    public final void m(@l o o0) {
        L.p(o0, "block");
        int v = this.h();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.g()[v1];
            L.n(object0, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if(!((Boolean)o0.invoke(object0, this.i()[v1])).booleanValue()) {
                if(v2 != v1) {
                    this.g()[v2] = object0;
                    this.i()[v2] = this.i()[v1];
                }
                ++v2;
            }
        }
        if(this.h() > v2) {
            int v3 = this.h();
            for(int v4 = v2; v4 < v3; ++v4) {
                this.g()[v4] = null;
                this.i()[v4] = null;
            }
            this.q(v2);
        }
    }

    public final void n(@l Function1 function10) {
        L.p(function10, "block");
        int v = this.h();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.g()[v1];
            L.n(object0, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if(!((Boolean)function10.invoke(this.i()[v1])).booleanValue()) {
                if(v2 != v1) {
                    this.g()[v2] = object0;
                    this.i()[v2] = this.i()[v1];
                }
                ++v2;
            }
        }
        if(this.h() > v2) {
            int v3 = this.h();
            for(int v4 = v2; v4 < v3; ++v4) {
                this.g()[v4] = null;
                this.i()[v4] = null;
            }
            this.q(v2);
        }
    }

    public final void o(@l Object object0, Object object1) {
        L.p(object0, "key");
        int v = this.c(object0);
        if(v >= 0) {
            this.b[v] = object1;
            return;
        }
        int v1 = this.c;
        Object[] arr_object = this.a;
        boolean z = v1 == arr_object.length;
        Object[] arr_object1 = z ? new Object[v1 * 2] : arr_object;
        kotlin.collections.l.B0(arr_object, arr_object1, -v, -(v + 1), v1);
        if(z) {
            kotlin.collections.l.K0(this.a, arr_object1, 0, 0, -(v + 1), 6, null);
        }
        arr_object1[-(v + 1)] = object0;
        this.a = arr_object1;
        Object[] arr_object2 = z ? new Object[this.c * 2] : this.b;
        kotlin.collections.l.B0(this.b, arr_object2, -v, -(v + 1), this.c);
        if(z) {
            kotlin.collections.l.K0(this.b, arr_object2, 0, 0, -(v + 1), 6, null);
        }
        arr_object2[-(v + 1)] = object1;
        this.b = arr_object2;
        ++this.c;
    }

    public final void p(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.a = arr_object;
    }

    public final void q(int v) {
        this.c = v;
    }

    public final void r(@l Object[] arr_object) {
        L.p(arr_object, "<set-?>");
        this.b = arr_object;
    }
}

