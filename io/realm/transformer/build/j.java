package io.realm.transformer.build;

import io.realm.transformer.c;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.u;
import kotlin.io.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import kotlin.text.v;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.work.ChangeType;
import org.gradle.work.FileChange;
import y4.l;

public final class j extends f {
    @l
    private final Iterable j;
    private Map k;

    public j(@l c c0, @l Iterable iterable0, @l List list0, @l ConfigurableFileCollection configurableFileCollection0, @l FileSystem fileSystem0) {
        L.p(c0, "metadata");
        L.p(iterable0, "fileChanges");
        L.p(list0, "inputJars");
        L.p(configurableFileCollection0, "inputDirectories");
        L.p(fileSystem0, "output");
        super(c0, list0, fileSystem0, configurableFileCollection0);
        this.j = iterable0;
    }

    private final void A() {
        static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(1);
            }

            @l
            public final Boolean a(@l FileChange fileChange0) {
                L.p(fileChange0, "details");
                return fileChange0.getChangeType() == ChangeType.REMOVED;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((FileChange)object0));
            }
        }


        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            public final File a(@l FileChange fileChange0) {
                L.p(fileChange0, "it");
                return fileChange0.getFile();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((FileChange)object0));
            }
        }


        static final class io.realm.transformer.build.j.c extends N implements Function1 {
            public static final io.realm.transformer.build.j.c e;

            static {
                io.realm.transformer.build.j.c.e = new io.realm.transformer.build.j.c();
            }

            io.realm.transformer.build.j.c() {
                super(1);
            }

            @l
            public final Boolean a(File file0) {
                String s = file0.getAbsolutePath();
                L.o(s, "file.absolutePath");
                return Boolean.valueOf(v.N1(s, ".class", false, 2, null));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }


        static final class d extends N implements Function1 {
            final String e;

            d(String s) {
                this.e = s;
                super(1);
            }

            @l
            public final Boolean a(File file0) {
                L.o(file0, "file");
                return Boolean.valueOf(m.p0(file0, this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }


        static final class e extends N implements Function1 {
            final j e;
            final String f;

            e(j j0, String s) {
                this.e = j0;
                this.f = s;
                super(1);
            }

            @l
            public final String a(File file0) {
                L.o(file0, "it");
                return this.e.c(file0, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }

        for(Object object0: ((Iterable)this.k())) {
            String s = ((File)object0).getAbsolutePath();
            L.o(s, "directory.absolutePath");
            for(Object object1: p.k1(p.p0(p.p0(p.k1(p.p0(u.A1(this.j), a.e), b.e), io.realm.transformer.build.j.c.e), new d(s)), new e(this, s))) {
                String s1 = v.k2(((String)object1), '.', '/', false, 4, null);
                io.realm.transformer.f.a().n("Deleting output entry: " + (s1 + ".class"));
                Path path0 = this.l().getPath(s1 + ".class", new String[0]);
                L.o(path0, "output.getPath(zipEntryPath)");
                Files.deleteIfExists(path0);
            }
        }
    }

    @Override  // io.realm.transformer.build.f
    protected void h(@l Set set0, @l Set set1) {
        L.p(set0, "outputClassNames");
        L.p(set1, "outputReferencedClassNames");
        this.v(this.i(set0));
    }

    @Override  // io.realm.transformer.build.f
    @l
    protected List i(@l Set set0) {
        L.p(set0, "classNames");
        javassist.l l0 = this.j().s("io.realm.internal.RealmObjectProxy");
        L.o(l0, "classPool.get(\"io.realm.…ternal.RealmObjectProxy\")");
        ArrayList arrayList0 = new ArrayList(u.b0(set0, 10));
        for(Object object0: set0) {
            arrayList0.add(this.j().R(((String)object0)));
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((javassist.l)object1).e0(h3.f.class) || m3.a.a(((javassist.l)object1).c0())) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: arrayList1) {
            L.o(((javassist.l)object2), "it");
            if(!m3.a.b(((javassist.l)object2), l0)) {
                arrayList2.add(object2);
            }
        }
        List list0 = new ArrayList();
        for(Object object3: arrayList2) {
            if(!((javassist.l)object3).X().equals("io.realm.RealmObject")) {
                list0.add(object3);
            }
        }
        return list0;
    }

    @Override  // io.realm.transformer.build.f
    public void r() {
        this.z();
        this.u(this.d());
        io.realm.transformer.f.a().n("Incremental build. Files being processed: " + this.m().size() + ".");
        io.realm.transformer.f.a().n("Incremental files: " + u.m3(this.m(), ",", null, null, 0, null, null, 62, null));
    }

    @Override  // io.realm.transformer.build.f
    public boolean w(@l File file0) {
        L.p(file0, "<this>");
        Map map0 = this.k;
        if(map0 == null) {
            L.S("fileChangeMap");
            map0 = null;
        }
        return map0.containsKey(file0.getAbsolutePath());
    }

    @Override  // io.realm.transformer.build.f
    public void x() {
        for(Object object0: this.m()) {
            io.realm.transformer.f.a().n("Modify accessors in class: " + ((String)object0));
            javassist.l l0 = this.j().R(((String)object0));
            L.o(l0, "classPool.getCtClass(className)");
            io.realm.transformer.b b0 = this.j();
            io.realm.transformer.a.a.g(io.realm.transformer.a.a, b0, l0, null, 4, null);
            this.o().put(((String)object0), l0);
        }
    }

    private final void z() {
        kotlin.sequences.m m0 = u.A1(this.j);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: m0) {
            String s = ((FileChange)object0).getFile().getAbsolutePath();
            L.o(s, "details.file.absolutePath");
            linkedHashMap0.put(s, object0);
        }
        this.k = linkedHashMap0;
        this.A();
    }
}

