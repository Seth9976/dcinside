package kotlin.io;

import A3.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1288#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
class q extends p {
    public static final boolean Q(@l File file0, @l File file1, boolean z, @l o o0) {
        static final class b extends N implements o {
            final o e;

            b(o o0) {
                this.e = o0;
                super(2);
            }

            public final void a(File file0, IOException iOException0) {
                L.p(file0, "f");
                L.p(iOException0, "e");
                if(this.e.invoke(file0, iOException0) == u.b) {
                    throw new x(file0);
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((File)object0), ((IOException)object1));
                return S0.a;
            }
        }

        L.p(file0, "<this>");
        L.p(file1, "target");
        L.p(o0, "onError");
        if(!file0.exists()) {
            return o0.invoke(file0, new t(file0, null, "The source file doesn\'t exist.", 2, null)) != u.b;
        }
        try {
            Iterator iterator0 = p.P(file0).k(new b(o0)).iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return true;
                }
                Object object0 = iterator0.next();
                File file2 = (File)object0;
                if(!file2.exists()) {
                    if(o0.invoke(file2, new t(file2, null, "The source file doesn\'t exist.", 2, null)) != u.b) {
                        continue;
                    }
                    return false;
                }
                File file3 = new File(file1, q.q0(file2, file0));
                if(file3.exists() && (!file2.isDirectory() || !file3.isDirectory()) && (!z || !m.Y(file3) || !file3.isDirectory() && !file3.delete())) {
                    if(o0.invoke(file3, new h(file2, file3, "The destination file already exists.")) != u.b) {
                        continue;
                    }
                    return false;
                }
                if(file2.isDirectory()) {
                    file3.mkdirs();
                }
                else if(m.T(file2, file3, z, 0, 4, null).length() != file2.length() && o0.invoke(file2, new IOException("Source file wasn\'t copied completely, length of destination file differs.")) == u.b) {
                    break;
                }
            }
        }
        catch(x unused_ex) {
        }
        return false;
    }

    public static boolean R(File file0, File file1, boolean z, o o0, int v, Object object0) {
        static final class a extends N implements o {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(2);
            }

            public final Void a(File file0, IOException iOException0) {
                L.p(file0, "<anonymous parameter 0>");
                L.p(iOException0, "exception");
                throw iOException0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((File)object0), ((IOException)object1));
            }
        }

        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            o0 = a.e;
        }
        return q.Q(file0, file1, z, o0);
    }

    @l
    public static final File S(@l File file0, @l File file1, boolean z, int v) {
        L.p(file0, "<this>");
        L.p(file1, "target");
        if(!file0.exists()) {
            throw new t(file0, null, "The source file doesn\'t exist.", 2, null);
        }
        if(file1.exists()) {
            if(!z) {
                throw new h(file0, file1, "The destination file already exists.");
            }
            if(!file1.delete()) {
                throw new h(file0, file1, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if(!file0.isDirectory()) {
            File file2 = file1.getParentFile();
            if(file2 != null) {
                file2.mkdirs();
            }
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            try {
                FileOutputStream fileOutputStream0 = new FileOutputStream(file1);
                try {
                    kotlin.io.b.k(fileInputStream0, fileOutputStream0, v);
                }
                catch(Throwable throwable1) {
                    c.a(fileOutputStream0, throwable1);
                    throw throwable1;
                }
                c.a(fileOutputStream0, null);
            }
            catch(Throwable throwable0) {
                c.a(fileInputStream0, throwable0);
                throw throwable0;
            }
            c.a(fileInputStream0, null);
        }
        else if(!file1.mkdirs()) {
            throw new j(file0, file1, "Failed to create target directory.");
        }
        return file1;
    }

    public static File T(File file0, File file1, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0x2000;
        }
        return q.S(file0, file1, z, v);
    }

    @k(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @l
    public static final File U(@l String s, @y4.m String s1, @y4.m File file0) {
        L.p(s, "prefix");
        File file1 = File.createTempFile(s, s1, file0);
        file1.delete();
        if(!file1.mkdir()) {
            throw new IOException("Unable to create temporary directory " + file1 + '.');
        }
        L.m(file1);
        return file1;
    }

    public static File V(String s, String s1, File file0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "tmp";
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            file0 = null;
        }
        return q.U(s, s1, file0);
    }

    @k(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @l
    public static final File W(@l String s, @y4.m String s1, @y4.m File file0) {
        L.p(s, "prefix");
        File file1 = File.createTempFile(s, s1, file0);
        L.o(file1, "createTempFile(...)");
        return file1;
    }

    public static File X(String s, String s1, File file0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "tmp";
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            file0 = null;
        }
        return q.W(s, s1, file0);
    }

    public static boolean Y(@l File file0) {
        boolean z;
        L.p(file0, "<this>");
        Iterator iterator0 = p.O(file0).iterator();
    alab1:
        while(true) {
            for(z = true; true; z = false) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if((((File)object0).delete() || !((File)object0).exists()) && z) {
                    break;
                }
            }
        }
        return z;
    }

    public static final boolean Z(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "other");
        i i0 = n.f(file0);
        i i1 = n.f(file1);
        if(i1.i()) {
            return L.g(file0, file1);
        }
        int v = i0.h() - i1.h();
        return v >= 0 ? i0.g().subList(v, i0.h()).equals(i1.g()) : false;
    }

    public static final boolean a0(@l File file0, @l String s) {
        L.p(file0, "<this>");
        L.p(s, "other");
        return q.Z(file0, new File(s));
    }

    @l
    public static String b0(@l File file0) {
        L.p(file0, "<this>");
        String s = file0.getName();
        L.o(s, "getName(...)");
        return v.s5(s, '.', "");
    }

    @l
    public static final String c0(@l File file0) {
        L.p(file0, "<this>");
        int v = File.separatorChar;
        String s = file0.getPath();
        L.o(s, "getPath(...)");
        return v == 0x2F ? s : v.k2(s, ((char)v), '/', false, 4, null);
    }

    @l
    public static String d0(@l File file0) {
        L.p(file0, "<this>");
        String s = file0.getName();
        L.o(s, "getName(...)");
        return v.D5(s, ".", null, 2, null);
    }

    @l
    public static final File e0(@l File file0) {
        L.p(file0, "<this>");
        i i0 = n.f(file0);
        List list0 = q.f0(i0.g());
        L.o("/", "separator");
        return m.l0(i0.e(), kotlin.collections.u.m3(list0, "/", null, null, 0, null, null, 62, null));
    }

    private static final List f0(List list0) {
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            File file0 = (File)object0;
            String s = file0.getName();
            if(L.g(s, ".")) {
            }
            else if(!L.g(s, "..")) {
                list1.add(file0);
            }
            else if(list1.isEmpty() || L.g(((File)kotlin.collections.u.p3(list1)).getName(), "..")) {
                list1.add(file0);
            }
            else {
                list1.remove(list1.size() - 1);
            }
        }
        return list1;
    }

    private static final i g0(i i0) {
        return new i(i0.e(), q.f0(i0.g()));
    }

    @l
    public static final File h0(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "base");
        return new File(q.q0(file0, file1));
    }

    @y4.m
    public static final File i0(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "base");
        String s = q.r0(file0, file1);
        return s == null ? null : new File(s);
    }

    @l
    public static final File j0(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "base");
        String s = q.r0(file0, file1);
        return s == null ? file0 : new File(s);
    }

    @l
    public static final File k0(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "relative");
        if(n.d(file1)) {
            return file1;
        }
        String s = file0.toString();
        L.o(s, "toString(...)");
        if(s.length() != 0) {
            int v = File.separatorChar;
            return v.b3(s, ((char)v), false, 2, null) ? new File(s + file1) : new File(s + ((char)v) + file1);
        }
        return new File(s + file1);
    }

    @l
    public static File l0(@l File file0, @l String s) {
        L.p(file0, "<this>");
        L.p(s, "relative");
        return q.k0(file0, new File(s));
    }

    @l
    public static final File m0(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "relative");
        i i0 = n.f(file0);
        return i0.h() == 0 ? q.k0(q.k0(i0.e(), new File("..")), file1) : q.k0(q.k0(i0.e(), i0.j(0, i0.h() - 1)), file1);
    }

    @l
    public static final File n0(@l File file0, @l String s) {
        L.p(file0, "<this>");
        L.p(s, "relative");
        return q.m0(file0, new File(s));
    }

    public static final boolean o0(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "other");
        i i0 = n.f(file0);
        i i1 = n.f(file1);
        if(!L.g(i0.e(), i1.e())) {
            return false;
        }
        return i0.h() < i1.h() ? false : i0.g().subList(0, i1.h()).equals(i1.g());
    }

    public static boolean p0(@l File file0, @l String s) {
        L.p(file0, "<this>");
        L.p(s, "other");
        return q.o0(file0, new File(s));
    }

    @l
    public static final String q0(@l File file0, @l File file1) {
        L.p(file0, "<this>");
        L.p(file1, "base");
        String s = q.r0(file0, file1);
        if(s == null) {
            throw new IllegalArgumentException("this and base files have different roots: " + file0 + " and " + file1 + '.');
        }
        return s;
    }

    private static final String r0(File file0, File file1) {
        i i0 = q.g0(n.f(file0));
        i i1 = q.g0(n.f(file1));
        if(!L.g(i0.e(), i1.e())) {
            return null;
        }
        int v = i1.h();
        int v1 = i0.h();
        int v2 = Math.min(v1, v);
        int v3;
        for(v3 = 0; v3 < v2 && L.g(i0.g().get(v3), i1.g().get(v3)); ++v3) {
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        int v4 = v - 1;
        if(v3 <= v4) {
            while(true) {
                if(L.g(((File)i1.g().get(v4)).getName(), "..")) {
                    return null;
                }
                stringBuilder0.append("..");
                if(v4 != v3) {
                    stringBuilder0.append(File.separatorChar);
                }
                if(v4 == v3) {
                    break;
                }
                --v4;
            }
        }
        if(v3 < v1) {
            if(v3 < v) {
                stringBuilder0.append(File.separatorChar);
            }
            List list0 = kotlin.collections.u.c2(i0.g(), v3);
            L.o("/", "separator");
            kotlin.collections.u.k3(list0, stringBuilder0, "/", null, null, 0, null, null, 0x7C, null);
        }
        return stringBuilder0.toString();
    }
}

