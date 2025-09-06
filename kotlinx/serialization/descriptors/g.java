package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.D;
import kotlin.E;
import kotlin.collections.P;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.r0;
import kotlin.ranges.s;
import kotlinx.serialization.internal.n;
import kotlinx.serialization.internal.u0;
import kotlinx.serialization.internal.x0;
import y4.l;
import y4.m;

public final class g implements f, n {
    @l
    private final String a;
    @l
    private final j b;
    private final int c;
    @l
    private final List d;
    @l
    private final Set e;
    @l
    private final String[] f;
    @l
    private final f[] g;
    @l
    private final List[] h;
    @l
    private final boolean[] i;
    @l
    private final Map j;
    @l
    private final f[] k;
    @l
    private final D l;

    public g(@l String s, @l j j0, int v, @l List list0, @l a a0) {
        static final class kotlinx.serialization.descriptors.g.a extends N implements A3.a {
            final g e;

            kotlinx.serialization.descriptors.g.a(g g0) {
                this.e = g0;
                super(0);
            }

            @l
            public final Integer b() {
                f[] arr_f = this.e.k;
                return x0.b(this.e, arr_f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(s, "serialName");
        L.p(j0, "kind");
        L.p(list0, "typeParameters");
        L.p(a0, "builder");
        super();
        this.a = s;
        this.b = j0;
        this.c = v;
        this.d = a0.c();
        this.e = u.T5(a0.g());
        Object[] arr_object = a0.g().toArray(new String[0]);
        L.n(arr_object, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f = (String[])arr_object;
        this.g = u0.e(a0.f());
        Object[] arr_object1 = a0.e().toArray(new List[0]);
        L.n(arr_object1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.h = (List[])arr_object1;
        this.i = u.N5(a0.h());
        Iterable iterable0 = kotlin.collections.l.Fz(((String[])arr_object));
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(r0.a(((P)object0).f(), ((P)object0).e()));
        }
        this.j = Y.B0(arrayList0);
        this.k = u0.e(list0);
        this.l = E.a(new kotlinx.serialization.descriptors.g.a(this));
    }

    @Override  // kotlinx.serialization.internal.n
    @l
    public Set a() {
        return this.e;
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean b() {
        return false;
    }

    @Override  // kotlinx.serialization.descriptors.f
    public int c(@l String s) {
        L.p(s, "name");
        Integer integer0 = (Integer)this.j.get(s);
        return integer0 == null ? -3 : ((int)integer0);
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public f d(int v) {
        return this.g[v];
    }

    @Override  // kotlinx.serialization.descriptors.f
    public int e() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this != object0) {
            if(object0 instanceof g && (L.g(this.h(), ((f)object0).h()) && Arrays.equals(this.k, ((g)object0).k) && this.e() == ((f)object0).e())) {
                int v = this.e();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!L.g(this.d(v1).h(), ((f)object0).d(v1).h()) || !L.g(this.d(v1).getKind(), ((f)object0).d(v1).getKind())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public String f(int v) {
        return this.f[v];
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public List g(int v) {
        return this.h[v];
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public List getAnnotations() {
        return this.d;
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public j getKind() {
        return this.b;
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public String h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.k();
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean i(int v) {
        return this.i[v];
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return false;
    }

    private final int k() {
        return ((Number)this.l.getValue()).intValue();
    }

    @Override
    @l
    public String toString() {
        static final class b extends N implements Function1 {
            final g e;

            b(g g0) {
                this.e = g0;
                super(1);
            }

            @l
            public final CharSequence a(int v) {
                return this.e.f(v) + ": " + this.e.d(v).h();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

        return u.m3(s.W1(0, this.e()), ", ", this.h() + '(', ")", 0, null, new b(this), 24, null);
    }
}

