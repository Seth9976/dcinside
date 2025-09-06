package kotlin.jvm.internal;

import java.util.List;
import kotlin.collections.u;
import kotlin.h0;
import kotlin.reflect.t;
import kotlin.reflect.v;
import y4.l;
import y4.m;

@h0(version = "1.4")
@s0({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class w0 implements t {
    public static final class a {
        public final class kotlin.jvm.internal.w0.a.a {
            public static final int[] a;

            static {
                int[] arr_v = new int[v.values().length];
                try {
                    arr_v[v.a.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[v.b.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[v.c.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                kotlin.jvm.internal.w0.a.a.a = arr_v;
            }
        }

        private a() {
        }

        public a(w w0) {
        }

        @l
        public final String a(@l t t0) {
            L.p(t0, "typeParameter");
            StringBuilder stringBuilder0 = new StringBuilder();
            switch(t0.e()) {
                case 2: {
                    stringBuilder0.append("in ");
                    break;
                }
                case 3: {
                    stringBuilder0.append("out ");
                }
            }
            stringBuilder0.append(t0.getName());
            String s = stringBuilder0.toString();
            L.o(s, "toString(...)");
            return s;
        }
    }

    @m
    private final Object a;
    @l
    private final String b;
    @l
    private final v c;
    private final boolean d;
    @m
    private volatile List e;
    @l
    public static final a f;

    static {
        w0.f = new a(null);
    }

    public w0(@m Object object0, @l String s, @l v v0, boolean z) {
        L.p(s, "name");
        L.p(v0, "variance");
        super();
        this.a = object0;
        this.b = s;
        this.c = v0;
        this.d = z;
    }

    @Override  // kotlin.reflect.t
    public boolean a() {
        return this.d;
    }

    public static void c() {
    }

    @Override  // kotlin.reflect.t
    @l
    public v e() {
        return this.c;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof w0 && L.g(this.a, ((w0)object0).a) && L.g(this.getName(), ((w0)object0).getName());
    }

    public final void f(@l List list0) {
        L.p(list0, "upperBounds");
        if(this.e != null) {
            throw new IllegalStateException(("Upper bounds of type parameter \'" + this + "\' have already been initialized.").toString());
        }
        this.e = list0;
    }

    @Override  // kotlin.reflect.t
    @l
    public String getName() {
        return this.b;
    }

    @Override  // kotlin.reflect.t
    @l
    public List getUpperBounds() {
        List list0 = this.e;
        if(list0 == null) {
            list0 = u.k(m0.n(Object.class));
            this.e = list0;
        }
        return list0;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.getName().hashCode() : this.a.hashCode() * 0x1F + this.getName().hashCode();
    }

    @Override
    @l
    public String toString() {
        return w0.f.a(this);
    }
}

