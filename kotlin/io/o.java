package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.f;
import y4.l;

@s0({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
class o extends n {
    @l
    public static final String A(@l File file0, @l Charset charset0) {
        String s;
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        InputStreamReader inputStreamReader0 = new InputStreamReader(new FileInputStream(file0), charset0);
        try {
            s = y.k(inputStreamReader0);
        }
        catch(Throwable throwable0) {
            c.a(inputStreamReader0, throwable0);
            throw throwable0;
        }
        c.a(inputStreamReader0, null);
        return s;
    }

    public static String B(File file0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        return o.A(file0, charset0);
    }

    @kotlin.internal.f
    private static final InputStreamReader C(File file0, Charset charset0) {
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new InputStreamReader(new FileInputStream(file0), charset0);
    }

    static InputStreamReader D(File file0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new InputStreamReader(new FileInputStream(file0), charset0);
    }

    public static final Object E(@l File file0, @l Charset charset0, @l Function1 function10) {
        Object object0;
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        L.p(function10, "block");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0), 0x2000);
        try {
            object0 = function10.invoke(y.h(bufferedReader0));
        }
        catch(Throwable throwable0) {
            c.a(bufferedReader0, throwable0);
            throw throwable0;
        }
        c.a(bufferedReader0, null);
        return object0;
    }

    public static Object F(File file0, Charset charset0, Function1 function10, int v, Object object0) {
        Object object1;
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        L.p(function10, "block");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0), 0x2000);
        try {
            object1 = function10.invoke(y.h(bufferedReader0));
        }
        catch(Throwable throwable0) {
            c.a(bufferedReader0, throwable0);
            throw throwable0;
        }
        c.a(bufferedReader0, null);
        return object1;
    }

    public static void G(@l File file0, @l byte[] arr_b) {
        L.p(file0, "<this>");
        L.p(arr_b, "array");
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        try {
            fileOutputStream0.write(arr_b);
        }
        catch(Throwable throwable0) {
            c.a(fileOutputStream0, throwable0);
            throw throwable0;
        }
        c.a(fileOutputStream0, null);
    }

    public static void H(@l File file0, @l String s, @l Charset charset0) {
        L.p(file0, "<this>");
        L.p(s, "text");
        L.p(charset0, "charset");
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        try {
            m.J(fileOutputStream0, s, charset0);
        }
        catch(Throwable throwable0) {
            c.a(fileOutputStream0, throwable0);
            throw throwable0;
        }
        c.a(fileOutputStream0, null);
    }

    public static void I(File file0, String s, Charset charset0, int v, Object object0) {
        if((v & 2) != 0) {
            charset0 = f.b;
        }
        m.H(file0, s, charset0);
    }

    public static void J(@l OutputStream outputStream0, @l String s, @l Charset charset0) {
        L.p(outputStream0, "<this>");
        L.p(s, "text");
        L.p(charset0, "charset");
        if(s.length() < 0x4000) {
            byte[] arr_b = s.getBytes(charset0);
            L.o(arr_b, "getBytes(...)");
            outputStream0.write(arr_b);
            return;
        }
        CharsetEncoder charsetEncoder0 = m.t(charset0);
        CharBuffer charBuffer0 = CharBuffer.allocate(0x2000);
        L.m(charsetEncoder0);
        ByteBuffer byteBuffer0 = m.n(0x2000, charsetEncoder0);
        int v1 = 0;
        for(int v = 0; v < s.length(); v = v3) {
            int v2 = Math.min(0x2000 - v1, s.length() - v);
            int v3 = v + v2;
            L.o(charBuffer0.array(), "array(...)");
            charBuffer0.limit(v2 + v1);
            v1 = 1;
            if(!charsetEncoder0.encode(charBuffer0, byteBuffer0, v3 == s.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream0.write(byteBuffer0.array(), 0, byteBuffer0.position());
            if(charBuffer0.position() == charBuffer0.limit()) {
                v1 = 0;
            }
            else {
                charBuffer0.put(0, charBuffer0.get());
            }
            charBuffer0.clear();
            byteBuffer0.clear();
        }
    }

    @kotlin.internal.f
    private static final OutputStreamWriter K(File file0, Charset charset0) {
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new OutputStreamWriter(new FileOutputStream(file0), charset0);
    }

    static OutputStreamWriter L(File file0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new OutputStreamWriter(new FileOutputStream(file0), charset0);
    }

    public static final void g(@l File file0, @l byte[] arr_b) {
        L.p(file0, "<this>");
        L.p(arr_b, "array");
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0, true);
        try {
            fileOutputStream0.write(arr_b);
        }
        catch(Throwable throwable0) {
            c.a(fileOutputStream0, throwable0);
            throw throwable0;
        }
        c.a(fileOutputStream0, null);
    }

    public static final void h(@l File file0, @l String s, @l Charset charset0) {
        L.p(file0, "<this>");
        L.p(s, "text");
        L.p(charset0, "charset");
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0, true);
        try {
            m.J(fileOutputStream0, s, charset0);
        }
        catch(Throwable throwable0) {
            c.a(fileOutputStream0, throwable0);
            throw throwable0;
        }
        c.a(fileOutputStream0, null);
    }

    public static void i(File file0, String s, Charset charset0, int v, Object object0) {
        if((v & 2) != 0) {
            charset0 = f.b;
        }
        o.h(file0, s, charset0);
    }

    @kotlin.internal.f
    private static final BufferedReader j(File file0, Charset charset0, int v) {
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0), v);
    }

    static BufferedReader k(File file0, Charset charset0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charset0 = f.b;
        }
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0), v);
    }

    @kotlin.internal.f
    private static final BufferedWriter l(File file0, Charset charset0, int v) {
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), charset0), v);
    }

    static BufferedWriter m(File file0, Charset charset0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charset0 = f.b;
        }
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), charset0), v);
    }

    @l
    public static ByteBuffer n(int v, @l CharsetEncoder charsetEncoder0) {
        L.p(charsetEncoder0, "encoder");
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v * ((int)(((float)Math.ceil(charsetEncoder0.maxBytesPerChar())))));
        L.o(byteBuffer0, "allocate(...)");
        return byteBuffer0;
    }

    public static final void o(@l File file0, int v, @l A3.o o0) {
        L.p(file0, "<this>");
        L.p(o0, "action");
        byte[] arr_b = new byte[s.u(v, 0x200)];
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        try {
            int v1;
            while((v1 = fileInputStream0.read(arr_b)) > 0) {
                o0.invoke(arr_b, v1);
            }
        }
        catch(Throwable throwable0) {
            c.a(fileInputStream0, throwable0);
            throw throwable0;
        }
        c.a(fileInputStream0, null);
    }

    public static final void p(@l File file0, @l A3.o o0) {
        L.p(file0, "<this>");
        L.p(o0, "action");
        o.o(file0, 0x1000, o0);
    }

    public static final void q(@l File file0, @l Charset charset0, @l Function1 function10) {
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        L.p(function10, "action");
        y.g(new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0)), function10);
    }

    public static void r(File file0, Charset charset0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        o.q(file0, charset0, function10);
    }

    @kotlin.internal.f
    private static final FileInputStream s(File file0) {
        L.p(file0, "<this>");
        return new FileInputStream(file0);
    }

    public static CharsetEncoder t(@l Charset charset0) {
        L.p(charset0, "<this>");
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
        return charsetEncoder0.onMalformedInput(codingErrorAction0).onUnmappableCharacter(codingErrorAction0);
    }

    @kotlin.internal.f
    private static final FileOutputStream u(File file0) {
        L.p(file0, "<this>");
        return new FileOutputStream(file0);
    }

    @kotlin.internal.f
    private static final PrintWriter v(File file0, Charset charset0) {
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), charset0), 0x2000));
    }

    static PrintWriter w(File file0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        L.p(file0, "<this>");
        L.p(charset0, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), charset0), 0x2000));
    }

    @l
    public static byte[] x(@l File file0) {
        byte[] arr_b;
        L.p(file0, "<this>");
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        try {
            long v = file0.length();
            if(v > 0x7FFFFFFFL) {
                throw new OutOfMemoryError("File " + file0 + " is too big (" + v + " bytes) to fit in memory.");
            }
            arr_b = new byte[((int)v)];
            int v1 = (int)v;
            int v2;
            for(v2 = 0; v1 > 0; v2 += v3) {
                int v3 = fileInputStream0.read(arr_b, v2, v1);
                if(v3 < 0) {
                    break;
                }
                v1 -= v3;
            }
            if(v1 > 0) {
                arr_b = Arrays.copyOf(arr_b, v2);
                L.o(arr_b, "copyOf(...)");
            }
            else {
                int v4 = fileInputStream0.read();
                if(v4 != -1) {
                    g g0 = new g(0x2001);
                    g0.write(v4);
                    b.l(fileInputStream0, g0, 0, 2, null);
                    int v5 = g0.size() + ((int)v);
                    if(v5 < 0) {
                        throw new OutOfMemoryError("File " + file0 + " is too big to fit in memory.");
                    }
                    byte[] arr_b1 = g0.a();
                    byte[] arr_b2 = Arrays.copyOf(arr_b, v5);
                    L.o(arr_b2, "copyOf(...)");
                    arr_b = kotlin.collections.l.v0(arr_b1, arr_b2, ((int)v), 0, g0.size());
                }
            }
        }
        catch(Throwable throwable0) {
            c.a(fileInputStream0, throwable0);
            throw throwable0;
        }
        c.a(fileInputStream0, null);
        return arr_b;
    }

    @l
    public static final List y(@l File file0, @l Charset charset0) {
        static final class a extends N implements Function1 {
            final ArrayList e;

            a(ArrayList arrayList0) {
                this.e = arrayList0;
                super(1);
            }

            public final void b(String s) {
                L.p(s, "it");
                this.e.add(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        L.p(file0, "<this>");
        L.p(charset0, "charset");
        List list0 = new ArrayList();
        o.q(file0, charset0, new a(((ArrayList)list0)));
        return list0;
    }

    public static List z(File file0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = f.b;
        }
        return o.y(file0, charset0);
    }
}

