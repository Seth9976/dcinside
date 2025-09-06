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
import z3.i;
import z3.j;

@s0({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
public class SparseArrayCompat implements Cloneable {
    @f
    public boolean a;
    @f
    public int[] b;
    @f
    public Object[] c;
    @f
    public int d;

    @j
    public SparseArrayCompat() {
        this(0, 1, null);
    }

    @j
    public SparseArrayCompat(int v) {
        if(v == 0) {
            this.b = ContainerHelpersKt.a;
            this.c = ContainerHelpersKt.c;
            return;
        }
        int v1 = ContainerHelpersKt.e(v);
        this.b = new int[v1];
        this.c = new Object[v1];
    }

    public SparseArrayCompat(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 10;
        }
        this(v);
    }

    public void a(int v, Object object0) {
        int v1 = this.d;
        if(v1 != 0 && v <= this.b[v1 - 1]) {
            this.o(v, object0);
            return;
        }
        if(this.a && v1 >= this.b.length) {
            SparseArrayCompatKt.z(this);
        }
        int v2 = this.d;
        if(v2 >= this.b.length) {
            int v3 = ContainerHelpersKt.e(v2 + 1);
            int[] arr_v = Arrays.copyOf(this.b, v3);
            L.o(arr_v, "copyOf(this, newSize)");
            this.b = arr_v;
            Object[] arr_object = Arrays.copyOf(this.c, v3);
            L.o(arr_object, "copyOf(this, newSize)");
            this.c = arr_object;
        }
        this.b[v2] = v;
        this.c[v2] = object0;
        this.d = v2 + 1;
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
    public SparseArrayCompat c() {
        Object object0 = super.clone();
        L.n(object0, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        ((SparseArrayCompat)object0).b = (int[])this.b.clone();
        ((SparseArrayCompat)object0).c = (Object[])this.c.clone();
        return (SparseArrayCompat)object0;
    }

    @Override
    public Object clone() {
        return this.c();
    }

    public boolean d(int v) {
        return this.k(v) >= 0;
    }

    public boolean e(Object object0) {
        if(this.a) {
            SparseArrayCompatKt.z(this);
        }
        int v = this.d;
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(this.c[v1] == object0) {
                break;
            }
        }
        return v1 >= 0;
    }

    @k(message = "Alias for remove(int).", replaceWith = @c0(expression = "remove(key)", imports = {}))
    public void f(int v) {
        this.r(v);
    }

    @m
    public Object g(int v) {
        return SparseArrayCompatKt.g(this, v);
    }

    public Object h(int v, Object object0) {
        return SparseArrayCompatKt.h(this, v, object0);
    }

    @i(name = "getIsEmpty")
    public final boolean j() {
        return this.m();
    }

    public int k(int v) {
        if(this.a) {
            SparseArrayCompatKt.z(this);
        }
        return ContainerHelpersKt.a(this.b, this.d, v);
    }

    public int l(Object object0) {
        if(this.a) {
            SparseArrayCompatKt.z(this);
        }
        int v = this.d;
        int v1 = 0;
        while(v1 < v) {
            if(this.c[v1] != object0) {
                ++v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    public boolean m() {
        return this.y() == 0;
    }

    public int n(int v) {
        if(this.a) {
            SparseArrayCompatKt.z(this);
        }
        return this.b[v];
    }

    public void o(int v, Object object0) {
        int v1 = ContainerHelpersKt.a(this.b, this.d, v);
        if(v1 >= 0) {
            this.c[v1] = object0;
            return;
        }
        int v2 = ~v1;
        if(v2 < this.d && this.c[v2] == SparseArrayCompatKt.a) {
            this.b[v2] = v;
            this.c[v2] = object0;
            return;
        }
        if(this.a && this.d >= this.b.length) {
            SparseArrayCompatKt.z(this);
            v2 = ~ContainerHelpersKt.a(this.b, this.d, v);
        }
        int v3 = this.d;
        if(v3 >= this.b.length) {
            int v4 = ContainerHelpersKt.e(v3 + 1);
            int[] arr_v = Arrays.copyOf(this.b, v4);
            L.o(arr_v, "copyOf(this, newSize)");
            this.b = arr_v;
            Object[] arr_object = Arrays.copyOf(this.c, v4);
            L.o(arr_object, "copyOf(this, newSize)");
            this.c = arr_object;
        }
        int v5 = this.d;
        if(v5 - v2 != 0) {
            kotlin.collections.l.z0(this.b, this.b, v2 + 1, v2, v5);
            kotlin.collections.l.B0(this.c, this.c, v2 + 1, v2, this.d);
        }
        this.b[v2] = v;
        this.c[v2] = object0;
        ++this.d;
    }

    public void p(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "other");
        int v = sparseArrayCompat0.y();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArrayCompat0.n(v1);
            Object object0 = sparseArrayCompat0.z(v1);
            int v3 = ContainerHelpersKt.a(this.b, this.d, v2);
            if(v3 >= 0) {
                this.c[v3] = object0;
            }
            else {
                int v4 = ~v3;
                if(v4 >= this.d || this.c[v4] != SparseArrayCompatKt.a) {
                    if(this.a && this.d >= this.b.length) {
                        SparseArrayCompatKt.z(this);
                        v4 = ~ContainerHelpersKt.a(this.b, this.d, v2);
                    }
                    int v5 = this.d;
                    if(v5 >= this.b.length) {
                        int v6 = ContainerHelpersKt.e(v5 + 1);
                        int[] arr_v = Arrays.copyOf(this.b, v6);
                        L.o(arr_v, "copyOf(this, newSize)");
                        this.b = arr_v;
                        Object[] arr_object = Arrays.copyOf(this.c, v6);
                        L.o(arr_object, "copyOf(this, newSize)");
                        this.c = arr_object;
                    }
                    int v7 = this.d;
                    if(v7 - v4 != 0) {
                        kotlin.collections.l.z0(this.b, this.b, v4 + 1, v4, v7);
                        kotlin.collections.l.B0(this.c, this.c, v4 + 1, v4, this.d);
                    }
                    this.b[v4] = v2;
                    this.c[v4] = object0;
                    ++this.d;
                }
                else {
                    this.b[v4] = v2;
                    this.c[v4] = object0;
                }
            }
        }
    }

    @m
    public Object q(int v, Object object0) {
        Object object1 = SparseArrayCompatKt.g(this, v);
        if(object1 == null) {
            int v1 = ContainerHelpersKt.a(this.b, this.d, v);
            if(v1 >= 0) {
                this.c[v1] = object0;
                return null;
            }
            int v2 = ~v1;
            if(v2 < this.d && this.c[v2] == SparseArrayCompatKt.a) {
                this.b[v2] = v;
                this.c[v2] = object0;
                return null;
            }
            if(this.a && this.d >= this.b.length) {
                SparseArrayCompatKt.z(this);
                v2 = ~ContainerHelpersKt.a(this.b, this.d, v);
            }
            int v3 = this.d;
            if(v3 >= this.b.length) {
                int v4 = ContainerHelpersKt.e(v3 + 1);
                int[] arr_v = Arrays.copyOf(this.b, v4);
                L.o(arr_v, "copyOf(this, newSize)");
                this.b = arr_v;
                Object[] arr_object = Arrays.copyOf(this.c, v4);
                L.o(arr_object, "copyOf(this, newSize)");
                this.c = arr_object;
            }
            int v5 = this.d;
            if(v5 - v2 != 0) {
                kotlin.collections.l.z0(this.b, this.b, v2 + 1, v2, v5);
                kotlin.collections.l.B0(this.c, this.c, v2 + 1, v2, this.d);
            }
            this.b[v2] = v;
            this.c[v2] = object0;
            ++this.d;
        }
        return object1;
    }

    public void r(int v) {
        SparseArrayCompatKt.p(this, v);
    }

    public boolean s(int v, @m Object object0) {
        int v1 = this.k(v);
        if(v1 >= 0 && L.g(object0, this.z(v1))) {
            this.t(v1);
            return true;
        }
        return false;
    }

    public void t(int v) {
        if(this.c[v] != SparseArrayCompatKt.a) {
            this.c[v] = SparseArrayCompatKt.a;
            this.a = true;
        }
    }

    @Override
    @l
    public String toString() {
        if(this.y() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.d * 28);
        stringBuilder0.append('{');
        int v = this.d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.n(v1));
            stringBuilder0.append('=');
            Object object0 = this.z(v1);
            if(object0 == this) {
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

    public void u(int v, int v1) {
        int v2 = Math.min(v1, v + v1);
        while(v < v2) {
            this.t(v);
            ++v;
        }
    }

    @m
    public Object v(int v, Object object0) {
        int v1 = this.k(v);
        if(v1 >= 0) {
            Object[] arr_object = this.c;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
            return object1;
        }
        return null;
    }

    public boolean w(int v, Object object0, Object object1) {
        int v1 = this.k(v);
        if(v1 >= 0 && L.g(this.c[v1], object0)) {
            this.c[v1] = object1;
            return true;
        }
        return false;
    }

    public void x(int v, Object object0) {
        if(this.a) {
            SparseArrayCompatKt.z(this);
        }
        this.c[v] = object0;
    }

    public int y() {
        if(this.a) {
            SparseArrayCompatKt.z(this);
        }
        return this.d;
    }

    public Object z(int v) {
        if(this.a) {
            SparseArrayCompatKt.z(this);
        }
        return this.c[v];
    }
}

