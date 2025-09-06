package com.google.common.io;

import J1.c;
import J1.d;
import O1.l;
import com.google.common.base.C;
import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.base.M;
import com.google.common.collect.O2;
import com.google.common.collect.a3;
import com.google.common.collect.z3;
import com.google.common.graph.k0;
import com.google.common.graph.l0;
import com.google.common.hash.p;
import j..util.DesugarCollections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jeb.synthetic.TWR;

@c
@d
@q
public final class t {
    class b implements k0 {
        b() {
            super();
        }

        public Iterable N(File file0) {
            if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    return DesugarCollections.unmodifiableList(Arrays.asList(arr_file));
                }
            }
            return O2.A();
        }

        @Override  // com.google.common.graph.k0
        public Iterable a(Object object0) {
            return this.N(((File)object0));
        }
    }

    static final class com.google.common.io.t.c extends f {
        private final File a;
        private final a3 b;

        private com.google.common.io.t.c(File file0, s[] arr_s) {
            this.a = (File)H.E(file0);
            this.b = a3.y(arr_s);
        }

        com.google.common.io.t.c(File file0, s[] arr_s, a t$a0) {
            this(file0, arr_s);
        }

        @Override  // com.google.common.io.f
        public OutputStream c() throws IOException {
            return this.f();
        }

        public FileOutputStream f() throws IOException {
            boolean z = this.b.contains(s.a);
            return new FileOutputStream(this.a, z);
        }

        @Override
        public String toString() {
            return "Files.asByteSink(" + this.a + ", " + this.b + ")";
        }
    }

    static final class com.google.common.io.t.d extends g {
        private final File a;

        private com.google.common.io.t.d(File file0) {
            this.a = (File)H.E(file0);
        }

        com.google.common.io.t.d(File file0, a t$a0) {
            this(file0);
        }

        @Override  // com.google.common.io.g
        public InputStream m() throws IOException {
            return this.t();
        }

        @Override  // com.google.common.io.g
        public byte[] o() throws IOException {
            byte[] arr_b;
            n n0 = n.a();
            try {
                FileInputStream fileInputStream0 = (FileInputStream)n0.b(this.t());
                arr_b = h.v(fileInputStream0, fileInputStream0.getChannel().size());
            }
            catch(Throwable throwable0) {
                try {
                    throw n0.c(throwable0);
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(n0, throwable1);
                    throw throwable1;
                }
            }
            n0.close();
            return arr_b;
        }

        @Override  // com.google.common.io.g
        public long p() throws IOException {
            if(!this.a.isFile()) {
                throw new FileNotFoundException(this.a.toString());
            }
            return this.a.length();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.io.g
        public C q() {
            return this.a.isFile() ? C.f(this.a.length()) : C.a();
        }

        public FileInputStream t() throws IOException {
            return new FileInputStream(this.a);
        }

        @Override
        public String toString() {
            return "Files.asByteSource(" + this.a + ")";
        }
    }

    static abstract enum e implements I {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.io.t.e.a extends e {
            com.google.common.io.t.e.a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.base.I
            public boolean apply(Object object0) {
                return this.b(((File)object0));
            }

            public boolean b(File file0) {
                return file0.isDirectory();
            }

            @Override
            public String toString() {
                return "Files.isDirectory()";
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.io.t.e.b extends e {
            com.google.common.io.t.e.b(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.base.I
            public boolean apply(Object object0) {
                return this.b(((File)object0));
            }

            public boolean b(File file0) {
                return file0.isFile();
            }

            @Override
            public String toString() {
                return "Files.isFile()";
            }
        }

        IS_DIRECTORY /* 警告！未生成枚举子类：com.google.common.io.t$e$a */,
        IS_FILE /* 警告！未生成枚举子类：com.google.common.io.t$e$b */;

        private e() {
        }

        e(a t$a0) {
            this();
        }

        private static e[] a() [...] // Inlined contents
    }

    private static final k0 a;

    static {
        t.a = new b();
    }

    @O1.a
    @l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    @E
    @Deprecated
    public static Object A(File file0, Charset charset0, y y0) throws IOException {
        return t.e(file0, charset0).q(y0);
    }

    public static List B(File file0, Charset charset0) throws IOException {
        class a implements y {
            final List a;

            a() {
                super();
                this.a = z3.q();
            }

            @Override  // com.google.common.io.y
            public boolean a(String s) {
                this.a.add(s);
                return true;
            }

            public List b() {
                return this.a;
            }

            @Override  // com.google.common.io.y
            public Object getResult() {
                return this.b();
            }
        }

        return (List)t.e(file0, charset0).q(new a());
    }

    public static String C(String s) {
        H.E(s);
        if(s.length() == 0) {
            return ".";
        }
        Iterable iterable0 = M.h('/').g().n(s);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            String s1 = (String)object0;
            s1.hashCode();
            if(s1.equals(".")) {
            }
            else if(!s1.equals("..")) {
                arrayList0.add(s1);
            }
            else if(arrayList0.size() > 0 && !((String)arrayList0.get(arrayList0.size() - 1)).equals("..")) {
                arrayList0.remove(arrayList0.size() - 1);
            }
            else {
                arrayList0.add("..");
            }
        }
        String s2 = com.google.common.base.y.o('/').k(arrayList0);
        if(s.charAt(0) == 0x2F) {
            s2 = "/" + s2;
        }
        while(s2.startsWith("/../")) {
            s2 = s2.substring(3);
        }
        if(s2.equals("/..")) {
            return "/";
        }
        return "".equals(s2) ? "." : s2;
    }

    public static byte[] D(File file0) throws IOException {
        return t.c(file0).o();
    }

    @l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    @Deprecated
    public static String E(File file0, Charset charset0) throws IOException {
        return t.e(file0, charset0).n();
    }

    public static void F(File file0) throws IOException {
        H.E(file0);
        if(!file0.createNewFile() && !file0.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to update modification time of " + file0);
        }
    }

    @l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    @Deprecated
    public static void G(CharSequence charSequence0, File file0, Charset charset0) throws IOException {
        t.d(file0, charset0, new s[0]).c(charSequence0);
    }

    public static void H(byte[] arr_b, File file0) throws IOException {
        t.b(file0, new s[0]).d(arr_b);
    }

    @l(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    @Deprecated
    public static void a(CharSequence charSequence0, File file0, Charset charset0) throws IOException {
        t.d(file0, charset0, new s[]{s.a}).c(charSequence0);
    }

    public static f b(File file0, s[] arr_s) {
        return new com.google.common.io.t.c(file0, arr_s, null);
    }

    public static g c(File file0) {
        return new com.google.common.io.t.d(file0, null);
    }

    public static j d(File file0, Charset charset0, s[] arr_s) {
        return t.b(file0, arr_s).a(charset0);
    }

    public static k e(File file0, Charset charset0) {
        return t.c(file0).a(charset0);
    }

    public static void f(File file0, File file1) throws IOException {
        H.y(!file0.equals(file1), "Source %s and destination %s must be different", file0, file1);
        t.c(file0).f(t.b(file1, new s[0]));
    }

    public static void g(File file0, OutputStream outputStream0) throws IOException {
        t.c(file0).g(outputStream0);
    }

    @l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    @Deprecated
    public static void h(File file0, Charset charset0, Appendable appendable0) throws IOException {
        t.e(file0, charset0).f(appendable0);
    }

    public static void i(File file0) throws IOException {
        H.E(file0);
        File file1 = file0.getCanonicalFile().getParentFile();
        if(file1 == null) {
            return;
        }
        file1.mkdirs();
        if(!file1.isDirectory()) {
            throw new IOException("Unable to create parent directories of " + file0);
        }
    }

    @J1.a
    @Deprecated
    public static File j() {
        return com.google.common.io.I.a.a();
    }

    public static boolean k(File file0, File file1) throws IOException {
        H.E(file0);
        H.E(file1);
        if(file0 != file1 && !file0.equals(file1)) {
            long v = file0.length();
            long v1 = file1.length();
            return v == 0L || v1 == 0L || v == v1 ? t.c(file0).e(t.c(file1)) : false;
        }
        return true;
    }

    public static l0 l() {
        return l0.h(t.a);
    }

    public static String m(String s) {
        H.E(s);
        String s1 = new File(s).getName();
        int v = s1.lastIndexOf(46);
        return v == -1 ? "" : s1.substring(v + 1);
    }

    public static String n(String s) {
        H.E(s);
        String s1 = new File(s).getName();
        int v = s1.lastIndexOf(46);
        return v == -1 ? s1 : s1.substring(0, v);
    }

    @l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    @Deprecated
    public static p o(File file0, com.google.common.hash.q q0) throws IOException {
        return t.c(file0).j(q0);
    }

    public static I p() {
        return e.a;
    }

    public static I q() {
        return e.b;
    }

    public static MappedByteBuffer r(File file0) throws IOException {
        H.E(file0);
        return t.s(file0, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer s(File file0, FileChannel.MapMode fileChannel$MapMode0) throws IOException {
        return t.u(file0, fileChannel$MapMode0, -1L);
    }

    public static MappedByteBuffer t(File file0, FileChannel.MapMode fileChannel$MapMode0, long v) throws IOException {
        H.p(v >= 0L, "size (%s) may not be negative", v);
        return t.u(file0, fileChannel$MapMode0, v);
    }

    private static MappedByteBuffer u(File file0, FileChannel.MapMode fileChannel$MapMode0, long v) throws IOException {
        MappedByteBuffer mappedByteBuffer0;
        H.E(file0);
        H.E(fileChannel$MapMode0);
        n n0 = n.a();
        try {
            Closeable closeable0 = n0.b(((RandomAccessFile)n0.b(new RandomAccessFile(file0, (fileChannel$MapMode0 == FileChannel.MapMode.READ_ONLY ? "r" : "rw")))).getChannel());
            if(v == -1L) {
                v = ((FileChannel)closeable0).size();
            }
            mappedByteBuffer0 = ((FileChannel)closeable0).map(fileChannel$MapMode0, 0L, v);
            goto label_13;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw n0.c(throwable0);
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(n0, throwable1);
            throw throwable1;
        }
    label_13:
        n0.close();
        return mappedByteBuffer0;
    }

    public static void v(File file0, File file1) throws IOException {
        H.E(file0);
        H.E(file1);
        H.y(!file0.equals(file1), "Source %s and destination %s must be different", file0, file1);
        if(!file0.renameTo(file1)) {
            t.f(file0, file1);
            if(!file0.delete()) {
                throw file1.delete() ? new IOException("Unable to delete " + file0) : new IOException("Unable to delete " + file1);
            }
        }
    }

    public static BufferedReader w(File file0, Charset charset0) throws FileNotFoundException {
        H.E(file0);
        H.E(charset0);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0));
    }

    public static BufferedWriter x(File file0, Charset charset0) throws FileNotFoundException {
        H.E(file0);
        H.E(charset0);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), charset0));
    }

    @O1.a
    @l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    @E
    @Deprecated
    public static Object y(File file0, com.google.common.io.e e0) throws IOException {
        return t.c(file0).n(e0);
    }

    @l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    @Deprecated
    @o3.a
    public static String z(File file0, Charset charset0) throws IOException {
        return t.e(file0, charset0).o();
    }
}

