package io.realm.transformer.build;

import io.realm.transformer.b;
import io.realm.transformer.c;
import java.io.File;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javassist.o;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.v;
import m3.a;
import org.gradle.api.file.ConfigurableFileCollection;
import y4.l;

public final class h extends f {
    private List j;

    public h(@l c c0, @l List list0, @l FileSystem fileSystem0, @l ConfigurableFileCollection configurableFileCollection0) {
        L.p(c0, "metadata");
        L.p(list0, "inputJars");
        L.p(fileSystem0, "output");
        L.p(configurableFileCollection0, "inputDirectories");
        super(c0, list0, fileSystem0, configurableFileCollection0);
    }

    @Override  // io.realm.transformer.build.f
    protected void h(@l Set set0, @l Set set1) {
        L.p(set0, "classNames");
        L.p(set1, "extraClassNames");
        List list0 = this.i(this.z(set0, set1));
        this.j = list0;
        if(list0 == null) {
            L.S("allModelClasses");
            list0 = null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(this.m().contains(((javassist.l)object0).X())) {
                arrayList0.add(object0);
            }
        }
        this.v(arrayList0);
    }

    @Override  // io.realm.transformer.build.f
    @l
    protected List i(@l Set set0) {
        L.p(set0, "classNames");
        javassist.l l0 = this.j().s("io.realm.internal.RealmObjectProxy");
        L.o(l0, "classPool.get(\"io.realm.…ternal.RealmObjectProxy\")");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: set0) {
            if(v.N1(((String)object0), "RealmProxy", false, 2, null)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(this.j().R(((String)object1)));
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: arrayList1) {
            L.o(((javassist.l)object2), "clazz");
            if(a.b(((javassist.l)object2), l0)) {
                arrayList2.add(object2);
            }
        }
        List list0 = new ArrayList(u.b0(arrayList2, 10));
        for(Object object3: arrayList2) {
            list0.add(((javassist.l)object3).c0());
        }
        return list0;
    }

    @Override  // io.realm.transformer.build.f
    public void r() {
        this.u(this.d());
        io.realm.transformer.f.a().n("Full build. Number of files being processed: " + this.m().size() + ".");
    }

    @Override  // io.realm.transformer.build.f
    public boolean w(@l File file0) {
        L.p(file0, "<this>");
        return true;
    }

    @Override  // io.realm.transformer.build.f
    public void x() {
        static final class io.realm.transformer.build.h.a extends N implements Function1 {
            public static final io.realm.transformer.build.h.a e;

            static {
                io.realm.transformer.build.h.a.e = new io.realm.transformer.build.h.a();
            }

            io.realm.transformer.build.h.a() {
                super(1);
            }

            @l
            public final CharSequence a(o o0) {
                CharSequence charSequence0 = o0.i();
                L.o(charSequence0, "it.name");
                return charSequence0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((o)object0));
            }
        }

        List list0 = this.j;
        if(list0 == null) {
            L.S("allModelClasses");
            list0 = null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            o[] arr_o = ((javassist.l)object0).G();
            L.o(arr_o, "ctClass.declaredFields");
            ArrayList arrayList1 = new ArrayList();
            for(int v = 0; v < arr_o.length; ++v) {
                o o0 = arr_o[v];
                L.o(o0, "ctField");
                if(io.realm.transformer.a.a.d(o0)) {
                    arrayList1.add(o0);
                }
            }
            u.q0(arrayList0, arrayList1);
        }
        io.realm.transformer.f.a().n("Managed Fields: " + u.m3(arrayList0, ",", null, null, 0, null, io.realm.transformer.build.h.a.e, 30, null));
        for(Object object1: this.m()) {
            String s = (String)object1;
            io.realm.transformer.f.a().n("Modifying accessors in class: " + s);
            try {
                javassist.l l0 = this.j().R(s);
                L.o(l0, "classPool.getCtClass(it)");
                if(l0.m0()) {
                    l0.k();
                }
                b b0 = this.j();
                io.realm.transformer.a.a.f(b0, l0, arrayList0);
                this.o().put(s, l0);
                continue;
            }
            catch(Exception exception0) {
            }
            throw new RuntimeException("Failed to transform " + s + ".", exception0);
        }
    }

    private final Set z(Set set0, Set set1) {
        Set set2 = new HashSet();
        set2.addAll(set0);
        set2.addAll(set1);
        return set2;
    }
}

