package io.realm.transformer.build;

import io.realm.transformer.b;
import io.realm.transformer.c;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import javassist.g;
import kotlin.collections.u;
import kotlin.io.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import kotlin.text.v;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.RegularFile;
import y4.l;

public abstract class f {
    @l
    private final c a;
    @l
    private final List b;
    @l
    private final FileSystem c;
    @l
    private final ConfigurableFileCollection d;
    protected b e;
    protected Set f;
    private Set g;
    protected List h;
    @l
    private final Map i;

    public f(@l c c0, @l List list0, @l FileSystem fileSystem0, @l ConfigurableFileCollection configurableFileCollection0) {
        L.p(c0, "metadata");
        L.p(list0, "allJars");
        L.p(fileSystem0, "output");
        L.p(configurableFileCollection0, "inputs");
        super();
        this.a = c0;
        this.b = list0;
        this.c = fileSystem0;
        this.d = configurableFileCollection0;
        this.i = new LinkedHashMap();
    }

    private final void a(g g0) {
        try {
            for(Object object0: this.a.o()) {
                String s = ((File)object0).getAbsolutePath();
                L.o(s, "it.absolutePath");
                io.realm.transformer.f.a().n("Add boot class " + s + " to class pool.");
                g0.a(s);
            }
        }
        catch(Exception exception0) {
            io.realm.transformer.f.a().h("Cannot get bootClasspath caused by: ", exception0);
        }
    }

    private final void b(FileSystem fileSystem0, String s, InputStream inputStream0) {
        Path path0 = fileSystem0.getPath(s, new String[0]);
        Path path1 = path0.getParent();
        if(path1 != null) {
            L.o(path1, "parent");
            Files.createDirectories(path1, new FileAttribute[0]);
        }
        OutputStream outputStream0 = Files.newOutputStream(path0, new OpenOption[]{StandardOpenOption.CREATE});
        try {
            L.o(outputStream0, "stream");
            kotlin.io.b.l(inputStream0, outputStream0, 0, 2, null);
            outputStream0.close();
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(outputStream0, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(outputStream0, null);
    }

    @l
    protected final String c(@l File file0, @l String s) {
        L.p(file0, "<this>");
        L.p(s, "dirPath");
        String s1 = file0.getAbsolutePath();
        L.o(s1, "absolutePath");
        String s2 = s1.substring(s.length() + 1, file0.getAbsolutePath().length() - 6);
        L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
        return v.k2(s2, File.separatorChar, '.', false, 4, null);
    }

    @l
    public final Set d() {
        final class a extends H implements Function1 {
            public static final a a;

            static {
                a.a = new a();
            }

            a() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @l
            public final Boolean invoke(@l File file0) {
                L.p(file0, "p0");
                return Boolean.valueOf(file0.isFile());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((File)object0));
            }
        }


        static final class io.realm.transformer.build.f.b extends N implements Function1 {
            final f e;

            io.realm.transformer.build.f.b(f f0) {
                this.e = f0;
                super(1);
            }

            @l
            public final Boolean a(@l File file0) {
                L.p(file0, "file");
                return Boolean.valueOf(this.e.w(file0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }


        static final class io.realm.transformer.build.f.c extends N implements Function1 {
            public static final io.realm.transformer.build.f.c e;

            static {
                io.realm.transformer.build.f.c.e = new io.realm.transformer.build.f.c();
            }

            io.realm.transformer.build.f.c() {
                super(1);
            }

            @l
            public final Boolean a(@l File file0) {
                L.p(file0, "file");
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
            final f e;
            final String f;

            d(f f0, String s) {
                this.e = f0;
                this.f = s;
                super(1);
            }

            @l
            public final String a(@l File file0) {
                L.p(file0, "it");
                return this.e.c(file0, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }

        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)this.d)) {
            String s = ((File)object0).getAbsolutePath();
            L.o(s, "directory.absolutePath");
            L.o(((File)object0), "directory");
            u.r0(arrayList0, p.k1(p.p0(p.p0(p.p0(m.N(((File)object0), null, 1, null), a.a), new io.realm.transformer.build.f.b(this)), io.realm.transformer.build.f.c.e), new d(this, s)));
        }
        return u.a6(arrayList0);
    }

    private final Set e(ConfigurableFileCollection configurableFileCollection0) {
        ArrayList arrayList3;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)configurableFileCollection0)) {
            JarFile jarFile0 = new JarFile(((File)object0));
            try {
                Enumeration enumeration0 = jarFile0.entries();
                L.o(enumeration0, "jarFile.entries()");
                ArrayList arrayList1 = Collections.list(enumeration0);
                L.o(arrayList1, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                for(Object object1: arrayList1) {
                    JarEntry jarEntry0 = (JarEntry)object1;
                    if(!jarEntry0.isDirectory()) {
                        String s = jarEntry0.getName();
                        L.o(s, "jarEntry.name");
                        if(v.N1(s, ".class", false, 2, null)) {
                            arrayList2.add(object1);
                        }
                    }
                }
                arrayList3 = new ArrayList(u.b0(arrayList2, 10));
                for(Object object2: arrayList2) {
                    String s1 = ((JarEntry)object2).getName();
                    L.o(s1, "jarEntry.name");
                    String s2 = s1.substring(0, s1.length() - 6);
                    L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList3.add(v.k2(v.k2(s2, '/', '.', false, 4, null), '\\', '.', false, 4, null));
                }
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(jarFile0, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(jarFile0, null);
            u.q0(arrayList0, arrayList3);
        }
        return u.a6(arrayList0);
    }

    public final void f() {
        for(Object object0: this.i.entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            javassist.l l0 = (javassist.l)((Map.Entry)object0).getValue();
            String s = v.k2(((String)object1), '.', '/', false, 4, null);
            byte[] arr_b = l0.M0();
            L.o(arr_b, "clazz.toBytecode()");
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            this.b(this.c, s + ".class", byteArrayInputStream0);
        }
    }

    public final void g() {
        final class e extends H implements Function1 {
            public static final e a;

            static {
                e.a = new e();
            }

            e() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @l
            public final Boolean invoke(@l File file0) {
                L.p(file0, "p0");
                return Boolean.valueOf(file0.isFile());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((File)object0));
            }
        }


        static final class io.realm.transformer.build.f.f extends N implements Function1 {
            public static final io.realm.transformer.build.f.f e;

            static {
                io.realm.transformer.build.f.f.e = new io.realm.transformer.build.f.f();
            }

            io.realm.transformer.build.f.f() {
                super(1);
            }

            @l
            public final Boolean a(@l File file0) {
                L.p(file0, "it");
                String s = file0.getAbsolutePath();
                L.o(s, "it.absolutePath");
                return Boolean.valueOf(v.N1(s, ".class", false, 2, null));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((File)object0));
            }
        }

        for(Object object0: ((Iterable)this.d)) {
            String s = ((File)object0).getAbsolutePath() + "/";
            for(Object object1: p.u0(p.p0(m.N(((File)object0), null, 1, null), e.a), io.realm.transformer.build.f.f.e)) {
                String s1 = ((File)object1).getAbsolutePath();
                L.o(s1, "file.absolutePath");
                String s2 = v.k2(v.e4(s1, s), File.separatorChar, '/', false, 4, null);
                FileInputStream fileInputStream0 = new FileInputStream(((File)object1));
                this.b(this.c, s2, fileInputStream0);
            }
        }
        for(Object object2: this.b) {
            JarFile jarFile0 = new JarFile(((RegularFile)object2).getAsFile());
            try {
                Enumeration enumeration0 = jarFile0.entries();
                L.o(enumeration0, "jarFile.entries()");
                ArrayList arrayList0 = Collections.list(enumeration0);
                L.o(arrayList0, "list(this)");
                for(Object object3: arrayList0) {
                    JarEntry jarEntry0 = (JarEntry)object3;
                    InputStream inputStream0 = jarFile0.getInputStream(jarEntry0);
                    try {
                        String s3 = jarEntry0.getName();
                        L.o(s3, "jarEntry.name");
                        L.o(inputStream0, "it");
                        this.b(this.c, s3, inputStream0);
                    }
                    catch(Throwable throwable1) {
                        kotlin.io.c.a(inputStream0, throwable1);
                        throw throwable1;
                    }
                    kotlin.io.c.a(inputStream0, null);
                }
            }
            catch(Throwable throwable0) {
                kotlin.io.c.a(jarFile0, throwable0);
                throw throwable0;
            }
            kotlin.io.c.a(jarFile0, null);
        }
        this.j().close();
    }

    protected abstract void h(@l Set arg1, @l Set arg2);

    @l
    protected abstract List i(@l Set arg1);

    @l
    protected final b j() {
        b b0 = this.e;
        if(b0 != null) {
            return b0;
        }
        L.S("classPool");
        return null;
    }

    @l
    public final ConfigurableFileCollection k() {
        return this.d;
    }

    @l
    protected final FileSystem l() {
        return this.c;
    }

    @l
    protected final Set m() {
        Set set0 = this.f;
        if(set0 != null) {
            return set0;
        }
        L.S("outputClassNames");
        return null;
    }

    @l
    protected final List n() {
        List list0 = this.h;
        if(list0 != null) {
            return list0;
        }
        L.S("outputModelClasses");
        return null;
    }

    @l
    protected final Map o() {
        return this.i;
    }

    public final boolean p() {
        return this.m().isEmpty();
    }

    public final void q() {
        static final class io.realm.transformer.build.f.g extends N implements Function1 {
            public static final io.realm.transformer.build.f.g e;

            static {
                io.realm.transformer.build.f.g.e = new io.realm.transformer.build.f.g();
            }

            io.realm.transformer.build.f.g() {
                super(1);
            }

            @l
            public final CharSequence a(@l javassist.l l0) {
                L.p(l0, "it");
                CharSequence charSequence0 = l0.X();
                L.o(charSequence0, "it.name");
                return charSequence0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((javassist.l)object0));
            }
        }

        javassist.l l0 = this.j().s("io.realm.internal.RealmProxyMediator");
        L.o(l0, "classPool.get(\"io.realm.…rnal.RealmProxyMediator\")");
        Pattern pattern0 = Pattern.compile("^io\\.realm\\.[^.]+Mediator$");
        L.o(pattern0, "compile(\"^io\\\\.realm\\\\.[^.]+Mediator$\")");
        Set set0 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: set0) {
            if(pattern0.matcher(((String)object0)).find()) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(this.j().R(((String)object1)));
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: arrayList1) {
            if(((javassist.l)object2).c0().equals(l0)) {
                arrayList2.add(object2);
            }
        }
        io.realm.transformer.f.a().n("Proxy Mediator Classes: " + u.m3(arrayList2, ",", null, null, 0, null, io.realm.transformer.build.f.g.e, 30, null));
        for(Object object3: arrayList2) {
            io.realm.transformer.a.a.e(((javassist.l)object3));
            String s = ((javassist.l)object3).X();
            L.o(s, "it.name");
            this.i.put(s, ((javassist.l)object3));
        }
    }

    public abstract void r();

    public final void s(@l ConfigurableFileCollection configurableFileCollection0) {
        L.p(configurableFileCollection0, "referencedInputs");
        this.g = this.e(configurableFileCollection0);
        this.t(new b(this.d, configurableFileCollection0));
        this.a(this.j());
        io.realm.transformer.f.a().n("ClassPool contains Realm classes: " + (this.j().e0("io.realm.RealmList") != null));
        Set set0 = this.m();
        Set set1 = this.g;
        if(set1 == null) {
            L.S("outputReferencedClassNames");
            set1 = null;
        }
        this.h(set0, set1);
    }

    protected final void t(@l b b0) {
        L.p(b0, "<set-?>");
        this.e = b0;
    }

    protected final void u(@l Set set0) {
        L.p(set0, "<set-?>");
        this.f = set0;
    }

    protected final void v(@l List list0) {
        L.p(list0, "<set-?>");
        this.h = list0;
    }

    public abstract boolean w(@l File arg1);

    public abstract void x();

    public final void y() {
        for(Object object0: this.n()) {
            io.realm.transformer.f.a().n("Modify model class: " + ((javassist.l)object0).X());
            io.realm.transformer.a.a.a(((javassist.l)object0));
            b b0 = this.j();
            io.realm.transformer.a.a.b(((javassist.l)object0), b0);
            io.realm.transformer.a.a.c(((javassist.l)object0));
            String s = ((javassist.l)object0).X();
            L.o(s, "it.name");
            this.i.put(s, ((javassist.l)object0));
        }
    }
}

