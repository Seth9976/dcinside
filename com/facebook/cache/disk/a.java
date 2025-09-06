package com.facebook.cache.disk;

import android.os.Environment;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.m;
import j..util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;
import k1.n.a;
import k1.n;
import o3.h;
import v0.b;

@n(a.a)
public class com.facebook.cache.disk.a implements f {
    class com.facebook.cache.disk.a.a implements b {
        private final List a;
        final com.facebook.cache.disk.a b;

        private com.facebook.cache.disk.a.a() {
            this.a = new ArrayList();
        }

        com.facebook.cache.disk.a.a(com.facebook.cache.disk.b b0) {
        }

        @Override  // v0.b
        public void a(File file0) {
            c a$c0 = com.facebook.cache.disk.a.this.w(file0);
            if(a$c0 != null && a$c0.a == ".cnt") {
                com.facebook.cache.disk.a.b a$b0 = new com.facebook.cache.disk.a.b(a$c0.b, file0, null);
                this.a.add(a$b0);
            }
        }

        @Override  // v0.b
        public void b(File file0) {
        }

        @Override  // v0.b
        public void c(File file0) {
        }

        public List d() {
            return DesugarCollections.unmodifiableList(this.a);
        }
    }

    @VisibleForTesting
    static class com.facebook.cache.disk.a.b implements com.facebook.cache.disk.f.c {
        private final String a;
        private final r0.c b;
        private long c;
        private long d;

        private com.facebook.cache.disk.a.b(String s, File file0) {
            com.facebook.common.internal.n.i(file0);
            this.a = (String)com.facebook.common.internal.n.i(s);
            this.b = r0.c.b(file0);
            this.c = -1L;
            this.d = -1L;
        }

        com.facebook.cache.disk.a.b(String s, File file0, com.facebook.cache.disk.b b0) {
            this(s, file0);
        }

        @Override  // com.facebook.cache.disk.f$c
        public r0.a R() {
            return this.a();
        }

        public r0.c a() {
            return this.b;
        }

        @Override  // com.facebook.cache.disk.f$c
        public String getId() {
            return this.a;
        }

        @Override  // com.facebook.cache.disk.f$c
        public long getSize() {
            if(this.c < 0L) {
                this.c = this.b.size();
            }
            return this.c;
        }

        @Override  // com.facebook.cache.disk.f$c
        public long getTimestamp() {
            if(this.d < 0L) {
                this.d = this.b.d().lastModified();
            }
            return this.d;
        }
    }

    static class c {
        @d
        public final String a;
        public final String b;

        private c(@d String s, String s1) {
            this.a = s;
            this.b = s1;
        }

        c(String s, String s1, com.facebook.cache.disk.b b0) {
            this(s, s1);
        }

        public File a(File file0) throws IOException {
            return File.createTempFile((this.b + "."), ".tmp", file0);
        }

        @h
        public static c b(File file0) {
            String s = file0.getName();
            int v = s.lastIndexOf(46);
            if(v <= 0) {
                return null;
            }
            String s1 = com.facebook.cache.disk.a.u(s.substring(v));
            if(s1 == null) {
                return null;
            }
            String s2 = s.substring(0, v);
            if(s1.equals(".tmp")) {
                int v1 = s2.lastIndexOf(46);
                if(v1 <= 0) {
                    return null;
                }
                s2 = s2.substring(0, v1);
            }
            return new c(s1, s2);
        }

        // 去混淆评级： 低(20)
        public String c(String s) {
            return s + "/" + this.b + this.a;
        }

        @Override
        public String toString() {
            return this.a + "(" + this.b + ")";
        }
    }

    public @interface d {
        public static final String L = ".cnt";
        public static final String M = ".tmp";

    }

    static class e extends IOException {
        public e(long v, long v1) {
            super("File was not written completely. Expected: " + v + ", found: " + v1);
        }
    }

    @VisibleForTesting
    class com.facebook.cache.disk.a.f implements com.facebook.cache.disk.f.d {
        private final String a;
        @VisibleForTesting
        final File b;
        final com.facebook.cache.disk.a c;

        public com.facebook.cache.disk.a.f(String s, File file0) {
            this.a = s;
            this.b = file0;
        }

        // 去混淆评级： 低(20)
        @Override  // com.facebook.cache.disk.f$d
        public boolean A() {
            return !this.b.exists() || this.b.delete();
        }

        @Override  // com.facebook.cache.disk.f$d
        public r0.a B(Object object0, long v) throws IOException {
            com.facebook.cache.common.b.a b$a0;
            File file0 = com.facebook.cache.disk.a.this.s(this.a);
            try {
                v0.c.b(this.b, file0);
            }
            catch(v0.c.d c$d0) {
                Throwable throwable0 = c$d0.getCause();
                if(throwable0 == null) {
                    b$a0 = com.facebook.cache.common.b.a.j;
                }
                else if(throwable0 instanceof v0.c.c) {
                    b$a0 = com.facebook.cache.common.b.a.i;
                }
                else if(throwable0 instanceof FileNotFoundException) {
                    b$a0 = com.facebook.cache.common.b.a.h;
                }
                else {
                    b$a0 = com.facebook.cache.common.b.a.j;
                }
                com.facebook.cache.disk.a.this.d.a(b$a0, com.facebook.cache.disk.a.f, "commit", c$d0);
                throw c$d0;
            }
            if(file0.exists()) {
                file0.setLastModified(v);
            }
            return r0.c.b(file0);
        }

        @Override  // com.facebook.cache.disk.f$d
        public void C(m m0, Object object0) throws IOException {
            long v;
            FileOutputStream fileOutputStream0;
            try {
                fileOutputStream0 = new FileOutputStream(this.b);
            }
            catch(FileNotFoundException fileNotFoundException0) {
                com.facebook.cache.disk.a.this.d.a(com.facebook.cache.common.b.a.g, com.facebook.cache.disk.a.f, "updateResource", fileNotFoundException0);
                throw fileNotFoundException0;
            }
            try {
                com.facebook.common.internal.e e0 = new com.facebook.common.internal.e(fileOutputStream0);
                m0.a(e0);
                e0.flush();
                v = e0.a();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(fileOutputStream0, throwable0);
                throw throwable0;
            }
            fileOutputStream0.close();
            if(this.b.length() != v) {
                throw new e(v, this.b.length());
            }
        }

        @Override  // com.facebook.cache.disk.f$d
        public r0.a D(Object object0) throws IOException {
            return this.B(object0, com.facebook.cache.disk.a.this.e.now());
        }
    }

    class g implements b {
        private boolean a;
        final com.facebook.cache.disk.a b;

        private g() {
        }

        g(com.facebook.cache.disk.b b0) {
        }

        @Override  // v0.b
        public void a(File file0) {
            if(!this.a || !this.d(file0)) {
                file0.delete();
            }
        }

        @Override  // v0.b
        public void b(File file0) {
            if(!com.facebook.cache.disk.a.this.a.equals(file0) && !this.a) {
                file0.delete();
            }
            if(this.a && file0.equals(com.facebook.cache.disk.a.this.c)) {
                this.a = false;
            }
        }

        @Override  // v0.b
        public void c(File file0) {
            if(!this.a && file0.equals(com.facebook.cache.disk.a.this.c)) {
                this.a = true;
            }
        }

        private boolean d(File file0) {
            c a$c0 = com.facebook.cache.disk.a.this.w(file0);
            boolean z = false;
            if(a$c0 == null) {
                return false;
            }
            String s = a$c0.a;
            if(s == ".tmp") {
                return this.e(file0);
            }
            if(s == ".cnt") {
                z = true;
            }
            com.facebook.common.internal.n.o(z);
            return true;
        }

        private boolean e(File file0) {
            return file0.lastModified() > com.facebook.cache.disk.a.this.e.now() - com.facebook.cache.disk.a.k;
        }
    }

    private final File a;
    private final boolean b;
    private final File c;
    private final com.facebook.cache.common.b d;
    private final com.facebook.common.time.a e;
    private static final Class f = null;
    private static final String g = ".cnt";
    private static final String h = ".tmp";
    private static final String i = "v2";
    private static final int j = 100;
    static final long k;

    static {
        com.facebook.cache.disk.a.f = com.facebook.cache.disk.a.class;
        com.facebook.cache.disk.a.k = TimeUnit.MINUTES.toMillis(30L);
    }

    public com.facebook.cache.disk.a(File file0, int v, com.facebook.cache.common.b b0) {
        com.facebook.common.internal.n.i(file0);
        this.a = file0;
        this.b = com.facebook.cache.disk.a.A(file0, b0);
        this.c = new File(file0, com.facebook.cache.disk.a.z(v));
        this.d = b0;
        this.D();
        this.e = com.facebook.common.time.g.a();
    }

    private static boolean A(File file0, com.facebook.cache.common.b b0) {
        String s1;
        try {
            File file1 = Environment.getExternalStorageDirectory();
            if(file1 != null) {
                String s = file1.toString();
                try {
                    s1 = null;
                    s1 = file0.getCanonicalPath();
                    return s1.contains(s);
                }
                catch(IOException iOException0) {
                    b0.a(com.facebook.cache.common.b.a.q, com.facebook.cache.disk.a.f, "failed to read folder to check if external: " + s1, iOException0);
                    return false;
                }
            }
        }
        catch(Exception exception0) {
            b0.a(com.facebook.cache.common.b.a.q, com.facebook.cache.disk.a.f, "failed to get the external storage directory!", exception0);
        }
        return false;
    }

    private void B(File file0, String s) throws IOException {
        try {
            v0.c.a(file0);
        }
        catch(v0.c.a c$a0) {
            this.d.a(com.facebook.cache.common.b.a.k, com.facebook.cache.disk.a.f, s, c$a0);
            throw c$a0;
        }
    }

    private boolean C(String s, boolean z) {
        File file0 = this.s(s);
        boolean z1 = file0.exists();
        if(z && z1) {
            file0.setLastModified(this.e.now());
        }
        return z1;
    }

    private void D() {
        if(!this.a.exists()) {
            goto label_3;
        }
        if(!this.c.exists()) {
            v0.a.b(this.a);
            try {
            label_3:
                v0.c.a(this.c);
            }
            catch(v0.c.a unused_ex) {
                this.d.a(com.facebook.cache.common.b.a.k, com.facebook.cache.disk.a.f, "version directory could not be created: " + this.c, null);
            }
        }
    }

    private String E(byte[] arr_b) {
        if(arr_b.length >= 2) {
            int v = arr_b[0];
            if(v == -1 && arr_b[1] == -40) {
                return "jpg";
            }
            if(v == 0xFFFFFF89 && arr_b[1] == 80) {
                return "png";
            }
            if(v == 82 && arr_b[1] == 73) {
                return "webp";
            }
            return v != 71 || arr_b[1] != 73 ? "undefined" : "gif";
        }
        return "undefined";
    }

    @Override  // com.facebook.cache.disk.f
    public Collection T() throws IOException {
        return this.t();
    }

    @Override  // com.facebook.cache.disk.f
    public com.facebook.cache.disk.f.a a() throws IOException {
        List list0 = this.t();
        com.facebook.cache.disk.f.a f$a0 = new com.facebook.cache.disk.f.a();
        for(Object object0: list0) {
            com.facebook.cache.disk.f.b f$b0 = this.r(((com.facebook.cache.disk.f.c)object0));
            String s = f$b0.c;
            Integer integer0 = (Integer)f$a0.b.get(s);
            if(integer0 == null) {
                f$a0.b.put(s, 1);
            }
            else {
                f$a0.b.put(s, ((int)(((int)integer0) + 1)));
            }
            f$a0.a.add(f$b0);
        }
        return f$a0;
    }

    @Override  // com.facebook.cache.disk.f
    public void b() {
        v0.a.a(this.a);
    }

    @Override  // com.facebook.cache.disk.f
    public long c(com.facebook.cache.disk.f.c f$c0) {
        return this.q(((com.facebook.cache.disk.a.b)f$c0).a().d());
    }

    @Override  // com.facebook.cache.disk.f
    public com.facebook.cache.disk.f.d d(String s, Object object0) throws IOException {
        c a$c0 = new c(".tmp", s, null);
        File file0 = this.x(a$c0.b);
        if(!file0.exists()) {
            this.B(file0, "insert");
        }
        try {
            return new com.facebook.cache.disk.a.f(this, s, a$c0.a(file0));
        }
        catch(IOException iOException0) {
            this.d.a(com.facebook.cache.common.b.a.f, com.facebook.cache.disk.a.f, "insert", iOException0);
            throw iOException0;
        }
    }

    @Override  // com.facebook.cache.disk.f
    public boolean e(String s, Object object0) {
        return this.C(s, false);
    }

    @Override  // com.facebook.cache.disk.f
    public String f() {
        String s = this.a.getAbsolutePath();
        return "_" + s.substring(s.lastIndexOf(0x2F) + 1, s.length()) + "_" + s.hashCode();
    }

    @Override  // com.facebook.cache.disk.f
    public void g() {
        g a$g0 = new g(this, null);
        v0.a.c(this.a, a$g0);
    }

    @Override  // com.facebook.cache.disk.f
    public boolean h(String s, Object object0) {
        return this.C(s, true);
    }

    @Override  // com.facebook.cache.disk.f
    @h
    public r0.a i(String s, Object object0) {
        File file0 = this.s(s);
        if(file0.exists()) {
            file0.setLastModified(this.e.now());
            return r0.c.c(file0);
        }
        return null;
    }

    @Override  // com.facebook.cache.disk.f
    public boolean isEnabled() {
        return true;
    }

    @Override  // com.facebook.cache.disk.f
    public boolean isExternal() {
        return this.b;
    }

    private long q(File file0) {
        if(!file0.exists()) {
            return 0L;
        }
        long v = file0.length();
        return file0.delete() ? v : -1L;
    }

    private com.facebook.cache.disk.f.b r(com.facebook.cache.disk.f.c f$c0) throws IOException {
        byte[] arr_b = ((com.facebook.cache.disk.a.b)f$c0).a().read();
        String s = this.E(arr_b);
        if(s.equals("undefined") && arr_b.length >= 4) {
            String s1 = String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", ((byte)arr_b[0]), ((byte)arr_b[1]), ((byte)arr_b[2]), ((byte)arr_b[3]));
            return new com.facebook.cache.disk.f.b(((com.facebook.cache.disk.a.b)f$c0).getId(), ((com.facebook.cache.disk.a.b)f$c0).a().d().getPath(), s, ((float)((com.facebook.cache.disk.a.b)f$c0).getSize()), s1);
        }
        return new com.facebook.cache.disk.f.b(((com.facebook.cache.disk.a.b)f$c0).getId(), ((com.facebook.cache.disk.a.b)f$c0).a().d().getPath(), s, ((float)((com.facebook.cache.disk.a.b)f$c0).getSize()), "");
    }

    @Override  // com.facebook.cache.disk.f
    public long remove(String s) {
        return this.q(this.s(s));
    }

    @VisibleForTesting
    File s(String s) {
        return new File(this.v(s));
    }

    public List t() throws IOException {
        com.facebook.cache.disk.a.a a$a0 = new com.facebook.cache.disk.a.a(this, null);
        v0.a.c(this.c, a$a0);
        return a$a0.d();
    }

    @d
    @h
    private static String u(String s) {
        if(".cnt".equals(s)) {
            return ".cnt";
        }
        return ".tmp".equals(s) ? ".tmp" : null;
    }

    private String v(String s) {
        c a$c0 = new c(".cnt", s, null);
        return a$c0.c(this.y(a$c0.b));
    }

    @h
    private c w(File file0) {
        c a$c0 = c.b(file0);
        if(a$c0 == null) {
            return null;
        }
        return this.x(a$c0.b).equals(file0.getParentFile()) ? a$c0 : null;
    }

    private File x(String s) {
        return new File(this.y(s));
    }

    // 去混淆评级： 低(20)
    private String y(String s) {
        return this.c + "/" + Math.abs(s.hashCode() % 100);
    }

    @VisibleForTesting
    static String z(int v) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, v);
    }
}

