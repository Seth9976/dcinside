package com.google.common.reflect;

import com.google.common.base.H;
import com.google.common.base.M;
import com.google.common.base.e;
import com.google.common.collect.D3;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import com.google.common.collect.V1;
import com.google.common.collect.a3;
import com.google.common.collect.u5;
import com.google.common.io.g;
import com.google.common.io.k;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import jeb.synthetic.FIN;

@d
public final class c {
    public static final class a extends com.google.common.reflect.c.c {
        private final String d;

        a(File file0, String s, ClassLoader classLoader0) {
            super(file0, s, classLoader0);
            this.d = c.e(s);
        }

        public String g() {
            return this.d;
        }

        public String h() {
            return l.b(this.d);
        }

        public String i() {
            int v = this.d.lastIndexOf(36);
            if(v != -1) {
                return e.m('0', '9').V(this.d.substring(v + 1));
            }
            String s = this.h();
            return s.isEmpty() ? this.d : this.d.substring(s.length() + 1);
        }

        public boolean j() {
            return this.d.indexOf(36) == -1;
        }

        public Class k() {
            try {
                return this.c.loadClass(this.d);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException(classNotFoundException0);
            }
        }

        @Override  // com.google.common.reflect.c$c
        public String toString() {
            return this.d;
        }
    }

    static final class b {
        final File a;
        private final ClassLoader b;

        b(File file0, ClassLoader classLoader0) {
            this.a = (File)H.E(file0);
            this.b = (ClassLoader)H.E(classLoader0);
        }

        public final File a() {
            return this.a;
        }

        private void b(File file0, Set set0, com.google.common.collect.a3.a a3$a0) throws IOException {
            try {
                if(!file0.exists()) {
                    return;
                }
            }
            catch(SecurityException securityException0) {
                c.b.warning("Cannot access " + file0 + ": " + securityException0);
                return;
            }
            if(file0.isDirectory()) {
                this.c(file0, a3$a0);
                return;
            }
            this.e(file0, set0, a3$a0);
        }

        private void c(File file0, com.google.common.collect.a3.a a3$a0) throws IOException {
            HashSet hashSet0 = new HashSet();
            hashSet0.add(file0.getCanonicalFile());
            this.d(file0, "", hashSet0, a3$a0);
        }

        private void d(File file0, String s, Set set0, com.google.common.collect.a3.a a3$a0) throws IOException {
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                c.b.warning("Cannot read directory " + file0);
                return;
            }
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                String s1 = file1.getName();
                if(file1.isDirectory()) {
                    File file2 = file1.getCanonicalFile();
                    if(set0.add(file2)) {
                        this.d(file2, s + s1 + "/", set0, a3$a0);
                        set0.remove(file2);
                    }
                }
                else {
                    String s2 = s + s1;
                    if(!s2.equals("META-INF/MANIFEST.MF")) {
                        a3$a0.j(com.google.common.reflect.c.c.e(file1, s2, this.b));
                    }
                }
            }
        }

        private void e(File file0, Set set0, com.google.common.collect.a3.a a3$a0) throws IOException {
            JarFile jarFile0;
            try {
                jarFile0 = new JarFile(file0);
            }
            catch(IOException unused_ex) {
                return;
            }
            int v = FIN.finallyOpen$NT();
            u5 u50 = c.h(file0, jarFile0.getManifest()).i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                File file1 = (File)object0;
                if(set0.add(file1.getCanonicalFile())) {
                    this.b(file1, set0, a3$a0);
                }
            }
            this.f(jarFile0, a3$a0);
            try {
                FIN.finallyCodeBegin$NT(v);
                jarFile0.close();
                FIN.finallyCodeEnd$NT(v);
            }
            catch(IOException unused_ex) {
            }
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof b && this.a.equals(((b)object0).a) && this.b.equals(((b)object0).b);
        }

        private void f(JarFile jarFile0, com.google.common.collect.a3.a a3$a0) {
            Enumeration enumeration0 = jarFile0.entries();
            while(enumeration0.hasMoreElements()) {
                JarEntry jarEntry0 = (JarEntry)enumeration0.nextElement();
                if(!jarEntry0.isDirectory() && !jarEntry0.getName().equals("META-INF/MANIFEST.MF")) {
                    a3$a0.j(com.google.common.reflect.c.c.e(new File(jarFile0.getName()), jarEntry0.getName(), this.b));
                }
            }
        }

        public a3 g() throws IOException {
            return this.h(new HashSet());
        }

        public a3 h(Set set0) throws IOException {
            com.google.common.collect.a3.a a3$a0 = a3.n();
            set0.add(this.a);
            this.b(this.a, set0, a3$a0);
            return a3$a0.o();
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return this.a.toString();
        }
    }

    public static class com.google.common.reflect.c.c {
        private final File a;
        private final String b;
        final ClassLoader c;

        com.google.common.reflect.c.c(File file0, String s, ClassLoader classLoader0) {
            this.a = (File)H.E(file0);
            this.b = (String)H.E(s);
            this.c = (ClassLoader)H.E(classLoader0);
        }

        public final g a() {
            return com.google.common.io.H.a(this.f());
        }

        public final k b(Charset charset0) {
            return com.google.common.io.H.b(this.f(), charset0);
        }

        final File c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        static com.google.common.reflect.c.c e(File file0, String s, ClassLoader classLoader0) {
            return s.endsWith(".class") ? new a(file0, s, classLoader0) : new com.google.common.reflect.c.c(file0, s, classLoader0);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof com.google.common.reflect.c.c && this.b.equals(((com.google.common.reflect.c.c)object0).b) && this.c == ((com.google.common.reflect.c.c)object0).c;
        }

        public final URL f() {
            URL uRL0 = this.c.getResource(this.b);
            if(uRL0 == null) {
                throw new NoSuchElementException(this.b);
            }
            return uRL0;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode();
        }

        @Override
        public String toString() {
            return this.b;
        }
    }

    private final a3 a;
    private static final Logger b = null;
    private static final M c = null;
    private static final String d = ".class";

    static {
        c.b = Logger.getLogger("com.google.common.reflect.c");
        c.c = M.j(" ").g();
    }

    private c(a3 a30) {
        this.a = a30;
    }

    public static c b(ClassLoader classLoader0) throws IOException {
        a3 a30 = c.m(classLoader0);
        HashSet hashSet0 = new HashSet();
        u5 u50 = a30.i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            hashSet0.add(((b)object0).a());
        }
        com.google.common.collect.a3.a a3$a0 = a3.n();
        u5 u51 = a30.i();
        while(u51.hasNext()) {
            Object object1 = u51.next();
            a3$a0.l(((b)object1).h(hashSet0));
        }
        return new c(a3$a0.o());
    }

    public a3 c() {
        return V1.u(this.a).p(a.class).J();
    }

    private static O2 d(ClassLoader classLoader0) {
        if(classLoader0 instanceof URLClassLoader) {
            return O2.x(((URLClassLoader)classLoader0).getURLs());
        }
        return classLoader0.equals(ClassLoader.getSystemClassLoader()) ? c.n() : O2.A();
    }

    @J1.e
    static String e(String s) {
        return s.substring(0, s.length() - 6).replace('/', '.');
    }

    @J1.e
    static Q2 f(ClassLoader classLoader0) {
        LinkedHashMap linkedHashMap0 = D3.c0();
        ClassLoader classLoader1 = classLoader0.getParent();
        if(classLoader1 != null) {
            linkedHashMap0.putAll(c.f(classLoader1));
        }
        u5 u50 = c.d(classLoader0).i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            URL uRL0 = (URL)object0;
            if(uRL0.getProtocol().equals("file")) {
                File file0 = c.o(uRL0);
                if(!linkedHashMap0.containsKey(file0)) {
                    linkedHashMap0.put(file0, classLoader0);
                }
            }
        }
        return Q2.g(linkedHashMap0);
    }

    @J1.e
    static URL g(File file0, String s) throws MalformedURLException {
        return new URL(file0.toURI().toURL(), s);
    }

    @J1.e
    static a3 h(File file0, @o3.a Manifest manifest0) {
        URL uRL0;
        if(manifest0 == null) {
            return a3.B();
        }
        com.google.common.collect.a3.a a3$a0 = a3.n();
        String s = manifest0.getMainAttributes().getValue("Class-Path");
        if(s != null) {
            for(Object object0: c.c.n(s)) {
                String s1 = (String)object0;
                try {
                    uRL0 = c.g(file0, s1);
                }
                catch(MalformedURLException unused_ex) {
                    c.b.warning("Invalid Class-Path entry: " + s1);
                    continue;
                }
                if(uRL0.getProtocol().equals("file")) {
                    a3$a0.j(c.o(uRL0));
                }
            }
        }
        return a3$a0.o();
    }

    public a3 i() {
        return this.a;
    }

    public a3 j() {
        return V1.u(this.a).p(a.class).o(new com.google.common.reflect.b()).J();
    }

    public a3 k(String s) {
        H.E(s);
        com.google.common.collect.a3.a a3$a0 = a3.n();
        u5 u50 = this.j().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            a c$a0 = (a)object0;
            if(c$a0.h().equals(s)) {
                a3$a0.j(c$a0);
            }
        }
        return a3$a0.o();
    }

    public a3 l(String s) {
        H.E(s);
        com.google.common.collect.a3.a a3$a0 = a3.n();
        u5 u50 = this.j().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            a c$a0 = (a)object0;
            if(c$a0.g().startsWith(s + '.')) {
                a3$a0.j(c$a0);
            }
        }
        return a3$a0.o();
    }

    static a3 m(ClassLoader classLoader0) {
        com.google.common.collect.a3.a a3$a0 = a3.n();
        u5 u50 = c.f(classLoader0).m().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            a3$a0.j(new b(((File)((Map.Entry)object0).getKey()), ((ClassLoader)((Map.Entry)object0).getValue())));
        }
        return a3$a0.o();
    }

    @J1.e
    static O2 n() {
        com.google.common.collect.O2.a o2$a0 = O2.n();
        for(Object object0: M.j(":").n(".")) {
            String s = (String)object0;
            try {
                try {
                    o2$a0.j(new File(s).toURI().toURL());
                }
                catch(SecurityException unused_ex) {
                    o2$a0.j(new URL("file", null, new File(s).getAbsolutePath()));
                }
            }
            catch(MalformedURLException malformedURLException0) {
                c.b.log(Level.WARNING, "malformed classpath entry: " + s, malformedURLException0);
            }
        }
        return o2$a0.n();
    }

    @J1.e
    static File o(URL uRL0) {
        H.d(uRL0.getProtocol().equals("file"));
        try {
            return new File(uRL0.toURI());
        }
        catch(URISyntaxException unused_ex) {
            return new File(uRL0.getPath());
        }
    }
}

