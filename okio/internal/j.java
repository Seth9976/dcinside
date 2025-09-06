package okio.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import okio.Z;
import okio.e0;
import okio.m0;
import okio.o0;
import okio.t;
import okio.u;
import okio.v;
import y4.l;
import y4.m;

@s0({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
public final class j extends v {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final e0 b() {
            return j.i;
        }

        private final boolean c(e0 e00) {
            return !kotlin.text.v.M1(e00.p(), ".class", true);
        }

        @l
        public final e0 d(@l e0 e00, @l e0 e01) {
            L.p(e00, "<this>");
            L.p(e01, "base");
            return this.b().v(kotlin.text.v.k2(kotlin.text.v.e4(e00.toString(), e01.toString()), '\\', '/', false, 4, null));
        }
    }

    @l
    private final ClassLoader e;
    @l
    private final v f;
    @l
    private final D g;
    @l
    private static final a h;
    @l
    private static final e0 i;

    static {
        j.h = new a(null);
        j.i = okio.e0.a.h(e0.b, "/", false, 1, null);
    }

    public j(@l ClassLoader classLoader0, boolean z, @l v v0) {
        static final class b extends N implements A3.a {
            final j e;

            b(j j0) {
                this.e = j0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final List invoke() {
                ClassLoader classLoader0 = this.e.e;
                return this.e.T(classLoader0);
            }
        }

        L.p(classLoader0, "classLoader");
        L.p(v0, "systemFileSystem");
        super();
        this.e = classLoader0;
        this.f = v0;
        this.g = E.a(new b(this));
        if(z) {
            this.S().size();
        }
    }

    public j(ClassLoader classLoader0, boolean z, v v0, int v1, w w0) {
        if((v1 & 4) != 0) {
            v0 = v.b;
        }
        this(classLoader0, z, v0);
    }

    @Override  // okio.v
    @m
    public u E(@l e0 e00) {
        L.p(e00, "path");
        if(!j.h.c(e00)) {
            return null;
        }
        String s = this.W(e00);
        for(Object object0: this.S()) {
            u u0 = ((v)((V)object0).a()).E(((e0)((V)object0).b()).v(s));
            if(u0 != null) {
                return u0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // okio.v
    @l
    public t F(@l e0 e00) {
        L.p(e00, "file");
        if(!j.h.c(e00)) {
            throw new FileNotFoundException("file not found: " + e00);
        }
        String s = this.W(e00);
        for(Object object0: this.S()) {
            v v0 = (v)((V)object0).a();
            e0 e01 = (e0)((V)object0).b();
            try {
                return v0.F(e01.v(s));
            }
            catch(FileNotFoundException unused_ex) {
            }
        }
        throw new FileNotFoundException("file not found: " + e00);
    }

    @Override  // okio.v
    @l
    public t H(@l e0 e00, boolean z, boolean z1) {
        L.p(e00, "file");
        throw new IOException("resources are not writable");
    }

    @Override  // okio.v
    @l
    public m0 K(@l e0 e00, boolean z) {
        L.p(e00, "file");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.v
    @l
    public o0 M(@l e0 e00) {
        L.p(e00, "file");
        if(!j.h.c(e00)) {
            throw new FileNotFoundException("file not found: " + e00);
        }
        String s = e0.E(j.i, e00, false, 2, null).u(j.i).toString();
        InputStream inputStream0 = this.e.getResourceAsStream(s);
        if(inputStream0 != null) {
            o0 o00 = Z.u(inputStream0);
            if(o00 != null) {
                return o00;
            }
        }
        throw new FileNotFoundException("file not found: " + e00);
    }

    private final e0 R(e0 e00) {
        return j.i.B(e00, true);
    }

    private final List S() {
        return (List)this.g.getValue();
    }

    private final List T(ClassLoader classLoader0) {
        Enumeration enumeration0 = classLoader0.getResources("");
        L.o(enumeration0, "getResources(...)");
        ArrayList arrayList0 = Collections.list(enumeration0);
        L.o(arrayList0, "list(this)");
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            L.m(((URL)object0));
            V v0 = this.U(((URL)object0));
            if(v0 != null) {
                arrayList1.add(v0);
            }
        }
        Enumeration enumeration1 = classLoader0.getResources("META-INF/MANIFEST.MF");
        L.o(enumeration1, "getResources(...)");
        ArrayList arrayList2 = Collections.list(enumeration1);
        L.o(arrayList2, "list(this)");
        ArrayList arrayList3 = new ArrayList();
        for(Object object1: arrayList2) {
            L.m(((URL)object1));
            V v1 = this.V(((URL)object1));
            if(v1 != null) {
                arrayList3.add(v1);
            }
        }
        return kotlin.collections.u.D4(arrayList1, arrayList3);
    }

    private final V U(URL uRL0) {
        if(!L.g(uRL0.getProtocol(), "file")) {
            return null;
        }
        File file0 = new File(uRL0.toURI());
        e0 e00 = okio.e0.a.g(e0.b, file0, false, 1, null);
        return r0.a(this.f, e00);
    }

    private final V V(URL uRL0) {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @l
            public final Boolean a(@l k k0) {
                L.p(k0, "entry");
                return Boolean.valueOf(j.h.c(k0.a()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((k)object0));
            }
        }

        String s = uRL0.toString();
        L.o(s, "toString(...)");
        if(!kotlin.text.v.v2(s, "jar:file:", false, 2, null)) {
            return null;
        }
        int v = kotlin.text.v.H3(s, "!", 0, false, 6, null);
        if(v == -1) {
            return null;
        }
        String s1 = s.substring(4, v);
        L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        File file0 = new File(URI.create(s1));
        return r0.a(okio.internal.l.d(okio.e0.a.g(e0.b, file0, false, 1, null), this.f, c.e), j.i);
    }

    private final String W(e0 e00) {
        return this.R(e00).u(j.i).toString();
    }

    @Override  // okio.v
    @l
    public m0 e(@l e0 e00, boolean z) {
        L.p(e00, "file");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.v
    public void g(@l e0 e00, @l e0 e01) {
        L.p(e00, "source");
        L.p(e01, "target");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.v
    @l
    public e0 h(@l e0 e00) {
        L.p(e00, "path");
        return this.R(e00);
    }

    @Override  // okio.v
    public void n(@l e0 e00, boolean z) {
        L.p(e00, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.v
    public void p(@l e0 e00, @l e0 e01) {
        L.p(e00, "source");
        L.p(e01, "target");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.v
    public void r(@l e0 e00, boolean z) {
        L.p(e00, "path");
        throw new IOException(this + " is read-only");
    }

    @Override  // okio.v
    @l
    public List y(@l e0 e00) {
        L.p(e00, "dir");
        String s = this.W(e00);
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        boolean z = false;
        for(Object object0: this.S()) {
            v v0 = (v)((V)object0).a();
            e0 e01 = (e0)((V)object0).b();
            try {
                Iterable iterable0 = v0.y(e01.v(s));
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: iterable0) {
                    if(j.h.c(((e0)object1))) {
                        arrayList0.add(object1);
                    }
                }
                ArrayList arrayList1 = new ArrayList(kotlin.collections.u.b0(arrayList0, 10));
                for(Object object2: arrayList0) {
                    arrayList1.add(j.h.d(((e0)object2), e01));
                }
                kotlin.collections.u.q0(linkedHashSet0, arrayList1);
                z = true;
            }
            catch(IOException unused_ex) {
            }
        }
        if(!z) {
            throw new FileNotFoundException("file not found: " + e00);
        }
        return kotlin.collections.u.V5(linkedHashSet0);
    }

    @Override  // okio.v
    @m
    public List z(@l e0 e00) {
        L.p(e00, "dir");
        String s = this.W(e00);
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        Iterator iterator0 = this.S().iterator();
        boolean z = false;
        while(true) {
            List list0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            e0 e01 = (e0)((V)object0).b();
            List list1 = ((v)((V)object0).a()).z(e01.v(s));
            if(list1 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list1) {
                    if(j.h.c(((e0)object1))) {
                        arrayList0.add(object1);
                    }
                }
                ArrayList arrayList1 = new ArrayList(kotlin.collections.u.b0(arrayList0, 10));
                for(Object object2: arrayList0) {
                    arrayList1.add(j.h.d(((e0)object2), e01));
                }
                list0 = arrayList1;
            }
            if(list0 != null) {
                kotlin.collections.u.q0(linkedHashSet0, list0);
                z = true;
            }
        }
        return z ? kotlin.collections.u.V5(linkedHashSet0) : null;
    }
}

