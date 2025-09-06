package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.text.f;
import kotlin.text.v;
import okio.internal.b;
import y4.l;
import z3.i;
import z3.j;
import z3.n;

@s0({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n43#2,7:365\n53#2:372\n56#2:373\n64#2,4:374\n68#2:379\n70#2:381\n76#2,23:382\n104#2,23:405\n131#2,2:428\n133#2,9:431\n145#2:440\n148#2:441\n151#2:442\n154#2:443\n162#2:444\n172#2,3:445\n171#2:448\n185#2,2:449\n190#2:451\n194#2:452\n198#2:453\n202#2:454\n206#2,7:455\n219#2:462\n223#2,8:463\n235#2,4:471\n244#2,5:475\n253#2,6:480\n259#2,9:487\n322#2,8:496\n131#2,2:504\n133#2,9:507\n333#2,9:516\n68#3:378\n74#3:380\n74#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
public class o implements Serializable, Comparable {
    @s0({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @y4.m
        @i(name = "-deprecated_decodeBase64")
        public final o a(@l String s) {
            L.p(s, "string");
            return this.h(s);
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @l
        @i(name = "-deprecated_decodeHex")
        public final o b(@l String s) {
            L.p(s, "string");
            return this.i(s);
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @l
        @i(name = "-deprecated_encodeString")
        public final o c(@l String s, @l Charset charset0) {
            L.p(s, "string");
            L.p(charset0, "charset");
            return this.j(s, charset0);
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @l
        @i(name = "-deprecated_encodeUtf8")
        public final o d(@l String s) {
            L.p(s, "string");
            return this.l(s);
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @l
        @i(name = "-deprecated_of")
        public final o e(@l ByteBuffer byteBuffer0) {
            L.p(byteBuffer0, "buffer");
            return this.m(byteBuffer0);
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @l
        @i(name = "-deprecated_of")
        public final o f(@l byte[] arr_b, int v, int v1) {
            L.p(arr_b, "array");
            return this.o(arr_b, v, v1);
        }

        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @l
        @i(name = "-deprecated_read")
        public final o g(@l InputStream inputStream0, int v) {
            L.p(inputStream0, "inputstream");
            return this.q(inputStream0, v);
        }

        @y4.m
        @n
        public final o h(@l String s) {
            L.p(s, "<this>");
            byte[] arr_b = okio.a.a(s);
            return arr_b == null ? null : new o(arr_b);
        }

        @l
        @n
        public final o i(@l String s) {
            L.p(s, "<this>");
            if(s.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + s).toString());
            }
            int v = s.length();
            byte[] arr_b = new byte[v / 2];
            for(int v1 = 0; v1 < v / 2; ++v1) {
                arr_b[v1] = (byte)((b.I(s.charAt(v1 * 2)) << 4) + b.I(s.charAt(v1 * 2 + 1)));
            }
            return new o(arr_b);
        }

        @l
        @i(name = "encodeString")
        @n
        public final o j(@l String s, @l Charset charset0) {
            L.p(s, "<this>");
            L.p(charset0, "charset");
            byte[] arr_b = s.getBytes(charset0);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            return new o(arr_b);
        }

        public static o k(a o$a0, String s, Charset charset0, int v, Object object0) {
            if((v & 1) != 0) {
                charset0 = f.b;
            }
            return o$a0.j(s, charset0);
        }

        @l
        @n
        public final o l(@l String s) {
            L.p(s, "<this>");
            o o0 = new o(t0.a(s));
            o0.c0(s);
            return o0;
        }

        @l
        @i(name = "of")
        @n
        public final o m(@l ByteBuffer byteBuffer0) {
            L.p(byteBuffer0, "<this>");
            byte[] arr_b = new byte[byteBuffer0.remaining()];
            byteBuffer0.get(arr_b);
            return new o(arr_b);
        }

        @l
        @n
        public final o n(@l byte[] arr_b) {
            L.p(arr_b, "data");
            byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
            L.o(arr_b1, "copyOf(this, size)");
            return new o(arr_b1);
        }

        @l
        @i(name = "of")
        @n
        public final o o(@l byte[] arr_b, int v, int v1) {
            L.p(arr_b, "<this>");
            int v2 = okio.i.m(arr_b, v1);
            okio.i.e(arr_b.length, v, v2);
            return new o(kotlin.collections.l.f1(arr_b, v, v2 + v));
        }

        public static o p(a o$a0, byte[] arr_b, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = 0;
            }
            if((v2 & 2) != 0) {
                v1 = 0xB669FD2E;
            }
            return o$a0.o(arr_b, v, v1);
        }

        @l
        @i(name = "read")
        @n
        public final o q(@l InputStream inputStream0, int v) throws IOException {
            L.p(inputStream0, "<this>");
            if(v < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
            }
            byte[] arr_b = new byte[v];
            for(int v1 = 0; v1 < v; v1 += v2) {
                int v2 = inputStream0.read(arr_b, v1, v - v1);
                if(v2 == -1) {
                    throw new EOFException();
                }
            }
            return new o(arr_b);
        }
    }

    @l
    private final byte[] a;
    private transient int b;
    @y4.m
    private transient String c;
    @l
    public static final a d = null;
    private static final long e = 1L;
    @l
    @z3.f
    public static final o f;

    static {
        o.d = new a(null);
        o.f = new o(new byte[0]);
    }

    public o(@l byte[] arr_b) {
        L.p(arr_b, "data");
        super();
        this.a = arr_b;
    }

    @l
    public o A(@l String s, @l o o0) {
        L.p(s, "algorithm");
        L.p(o0, "key");
        try {
            Mac mac0 = Mac.getInstance(s);
            mac0.init(new SecretKeySpec(o0.s0(), s));
            byte[] arr_b = mac0.doFinal(this.a);
            L.o(arr_b, "doFinal(...)");
            return new o(arr_b);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new IllegalArgumentException(invalidKeyException0);
        }
    }

    @l
    public o B(@l o o0) {
        L.p(o0, "key");
        return this.A("HmacSHA1", o0);
    }

    @l
    public o C(@l o o0) {
        L.p(o0, "key");
        return this.A("HmacSHA256", o0);
    }

    @l
    public o D(@l o o0) {
        L.p(o0, "key");
        return this.A("HmacSHA512", o0);
    }

    @j
    public final int E(@l o o0) {
        L.p(o0, "other");
        return o.I(this, o0, 0, 2, null);
    }

    @j
    public final int F(@l o o0, int v) {
        L.p(o0, "other");
        return this.H(o0.K(), v);
    }

    @j
    public final int G(@l byte[] arr_b) {
        L.p(arr_b, "other");
        return o.J(this, arr_b, 0, 2, null);
    }

    @j
    public int H(@l byte[] arr_b, int v) {
        L.p(arr_b, "other");
        int v1 = this.s().length - arr_b.length;
        int v2 = Math.max(v, 0);
        if(v2 <= v1) {
            while(!okio.i.d(this.s(), v2, arr_b, 0, arr_b.length)) {
                if(v2 == v1) {
                    return -1;
                }
                ++v2;
            }
            return v2;
        }
        return -1;
    }

    public static int I(o o0, o o1, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return o0.F(o1, v);
    }

    public static int J(o o0, byte[] arr_b, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return o0.H(arr_b, v);
    }

    @l
    public byte[] K() {
        return this.s();
    }

    public byte L(int v) {
        return this.s()[v];
    }

    @j
    public final int M(@l o o0) {
        L.p(o0, "other");
        return o.Q(this, o0, 0, 2, null);
    }

    @j
    public final int N(@l o o0, int v) {
        L.p(o0, "other");
        return this.P(o0.K(), v);
    }

    @j
    public final int O(@l byte[] arr_b) {
        L.p(arr_b, "other");
        return o.R(this, arr_b, 0, 2, null);
    }

    @j
    public int P(@l byte[] arr_b, int v) {
        L.p(arr_b, "other");
        int v1 = Math.min(okio.i.l(this, v), this.s().length - arr_b.length);
        while(-1 < v1) {
            if(!okio.i.d(this.s(), v1, arr_b, 0, arr_b.length)) {
                --v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    public static int Q(o o0, o o1, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if((v1 & 2) != 0) {
            v = 0xB669FD2E;
        }
        return o0.N(o1, v);
    }

    public static int R(o o0, byte[] arr_b, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if((v1 & 2) != 0) {
            v = 0xB669FD2E;
        }
        return o0.P(arr_b, v);
    }

    @l
    public final o S() {
        return this.k("MD5");
    }

    @l
    @i(name = "of")
    @n
    public static final o T(@l ByteBuffer byteBuffer0) {
        return o.d.m(byteBuffer0);
    }

    @l
    @n
    public static final o U(@l byte[] arr_b) {
        return o.d.n(arr_b);
    }

    @l
    @i(name = "of")
    @n
    public static final o V(@l byte[] arr_b, int v, int v1) {
        return o.d.o(arr_b, v, v1);
    }

    public boolean W(int v, @l o o0, int v1, int v2) {
        L.p(o0, "other");
        return o0.X(v1, this.s(), v, v2);
    }

    public boolean X(int v, @l byte[] arr_b, int v1, int v2) {
        L.p(arr_b, "other");
        return v >= 0 && v <= this.s().length - v2 && v1 >= 0 && v1 <= arr_b.length - v2 && okio.i.d(this.s(), v, arr_b, v1, v2);
    }

    @l
    @i(name = "read")
    @n
    public static final o Z(@l InputStream inputStream0, int v) throws IOException {
        return o.d.q(inputStream0, v);
    }

    @k(level = m.b, message = "moved to operator function", replaceWith = @c0(expression = "this[index]", imports = {}))
    @i(name = "-deprecated_getByte")
    public final byte a(int v) {
        return this.r(v);
    }

    private final void a0(ObjectInputStream objectInputStream0) throws IOException {
        int v = objectInputStream0.readInt();
        o o0 = o.d.q(objectInputStream0, v);
        o.class.getDeclaredField("a").setAccessible(true);
        this.a = o0.a;
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "size", imports = {}))
    @i(name = "-deprecated_size")
    public final int b() {
        return this.h0();
    }

    public final void b0(int v) {
        this.b = v;
    }

    @l
    public ByteBuffer c() {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.a).asReadOnlyBuffer();
        L.o(byteBuffer0, "asReadOnlyBuffer(...)");
        return byteBuffer0;
    }

    public final void c0(@y4.m String s) {
        this.c = s;
    }

    @Override
    public int compareTo(Object object0) {
        return this.f(((o)object0));
    }

    @l
    public String d() {
        return okio.a.c(this.s(), null, 1, null);
    }

    // 去混淆评级： 低(20)
    @l
    public String e() {
        return okio.a.b(this.s(), new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F});
    }

    @l
    public final o e0() {
        return this.k("SHA-1");
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 == this || object0 instanceof o && ((o)object0).h0() == this.s().length && ((o)object0).X(0, this.s(), 0, this.s().length);
    }

    public int f(@l o o0) {
        L.p(o0, "other");
        int v = this.h0();
        int v1 = o0.h0();
        int v2 = Math.min(v, v1);
        int v3 = 0;
        while(v3 < v2) {
            int v4 = this.r(v3) & 0xFF;
            int v5 = o0.r(v3) & 0xFF;
            if(v4 == v5) {
                ++v3;
                continue;
            }
            return v4 >= v5 ? 1 : -1;
        }
        if(v != v1) {
            return v >= v1 ? 1 : -1;
        }
        return 0;
    }

    @l
    public final o f0() {
        return this.k("SHA-256");
    }

    public void g(int v, @l byte[] arr_b, int v1, int v2) {
        L.p(arr_b, "target");
        kotlin.collections.l.v0(this.s(), arr_b, v1, v, v2 + v);
    }

    @l
    public final o g0() {
        return this.k("SHA-512");
    }

    public static void h(o o0, int v, byte[] arr_b, int v1, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        o0.g(v, arr_b, v1, v2);
    }

    @i(name = "size")
    public final int h0() {
        return this.w();
    }

    @Override
    public int hashCode() {
        int v = this.u();
        if(v == 0) {
            v = Arrays.hashCode(this.s());
            this.b0(v);
        }
        return v;
    }

    @y4.m
    @n
    public static final o i(@l String s) {
        return o.d.h(s);
    }

    public final boolean i0(@l o o0) {
        L.p(o0, "prefix");
        return this.W(0, o0, 0, o0.h0());
    }

    @l
    @n
    public static final o j(@l String s) {
        return o.d.i(s);
    }

    public final boolean j0(@l byte[] arr_b) {
        L.p(arr_b, "prefix");
        return this.X(0, arr_b, 0, arr_b.length);
    }

    @l
    public o k(@l String s) {
        L.p(s, "algorithm");
        MessageDigest messageDigest0 = MessageDigest.getInstance(s);
        int v = this.h0();
        messageDigest0.update(this.a, 0, v);
        byte[] arr_b = messageDigest0.digest();
        L.m(arr_b);
        return new o(arr_b);
    }

    @l
    public String k0(@l Charset charset0) {
        L.p(charset0, "charset");
        return new String(this.a, charset0);
    }

    @l
    @i(name = "encodeString")
    @n
    public static final o l(@l String s, @l Charset charset0) {
        return o.d.j(s, charset0);
    }

    @l
    @n
    public static final o m(@l String s) {
        return o.d.l(s);
    }

    @l
    @j
    public final o m0() {
        return o.p0(this, 0, 0, 3, null);
    }

    public final boolean n(@l o o0) {
        L.p(o0, "suffix");
        return this.W(this.h0() - o0.h0(), o0, 0, o0.h0());
    }

    @l
    @j
    public final o n0(int v) {
        return o.p0(this, v, 0, 2, null);
    }

    @l
    @j
    public o o0(int v, int v1) {
        int v2 = okio.i.l(this, v1);
        if(v < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if(v2 > this.s().length) {
            throw new IllegalArgumentException(("endIndex > length(" + this.s().length + ')').toString());
        }
        if(v2 - v < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        return v != 0 || v2 != this.s().length ? new o(kotlin.collections.l.f1(this.s(), v, v2)) : this;
    }

    public final boolean p(@l byte[] arr_b) {
        L.p(arr_b, "suffix");
        return this.X(this.h0() - arr_b.length, arr_b, 0, arr_b.length);
    }

    public static o p0(o o0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0xB669FD2E;
        }
        return o0.o0(v, v1);
    }

    @l
    public o q0() {
        for(int v = 0; v < this.s().length; ++v) {
            int v1 = this.s()[v];
            if(v1 >= 65 && v1 <= 90) {
                byte[] arr_b = this.s();
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                L.o(arr_b1, "copyOf(this, size)");
                int v2 = v + 1;
                arr_b1[v] = (byte)(v1 + 0x20);
                while(v2 < arr_b1.length) {
                    int v3 = arr_b1[v2];
                    if(v3 >= 65 && v3 <= 90) {
                        arr_b1[v2] = (byte)(v3 + 0x20);
                    }
                    ++v2;
                }
                return new o(arr_b1);
            }
        }
        return this;
    }

    @i(name = "getByte")
    public final byte r(int v) {
        return this.L(v);
    }

    @l
    public o r0() {
        for(int v = 0; v < this.s().length; ++v) {
            int v1 = this.s()[v];
            if(v1 >= 97 && v1 <= 0x7A) {
                byte[] arr_b = this.s();
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                L.o(arr_b1, "copyOf(this, size)");
                int v2 = v + 1;
                arr_b1[v] = (byte)(v1 - 0x20);
                while(v2 < arr_b1.length) {
                    int v3 = arr_b1[v2];
                    if(v3 >= 97 && v3 <= 0x7A) {
                        arr_b1[v2] = (byte)(v3 - 0x20);
                    }
                    ++v2;
                }
                return new o(arr_b1);
            }
        }
        return this;
    }

    @l
    public final byte[] s() {
        return this.a;
    }

    @l
    public byte[] s0() {
        byte[] arr_b = this.s();
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(this, size)");
        return arr_b1;
    }

    @l
    public String t0() {
        String s = this.y();
        if(s == null) {
            s = t0.c(this.K());
            this.c0(s);
        }
        return s;
    }

    @Override
    @l
    public String toString() {
        if(this.s().length == 0) {
            return "[size=0]";
        }
        int v = b.c(this.s(), 0x40);
        if(v == -1) {
            if(this.s().length <= 0x40) {
                return "[hex=" + this.z() + ']';
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("[size=");
            stringBuilder0.append(this.s().length);
            stringBuilder0.append(" hex=");
            int v1 = okio.i.l(this, 0x40);
            if(v1 > this.s().length) {
                throw new IllegalArgumentException(("endIndex > length(" + this.s().length + ')').toString());
            }
            if(v1 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            stringBuilder0.append((v1 == this.s().length ? this : new o(kotlin.collections.l.f1(this.s(), 0, v1))).z());
            stringBuilder0.append("…]");
            return stringBuilder0.toString();
        }
        String s = this.t0();
        String s1 = s.substring(0, v);
        L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        String s2 = v.l2(v.l2(v.l2(s1, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        return v >= s.length() ? "[text=" + s2 + ']' : "[size=" + this.s().length + " text=" + s2 + "…]";
    }

    public final int u() {
        return this.b;
    }

    public void v0(@l OutputStream outputStream0) throws IOException {
        L.p(outputStream0, "out");
        outputStream0.write(this.a);
    }

    public int w() {
        return this.s().length;
    }

    public void w0(@l okio.l l0, int v, int v1) {
        L.p(l0, "buffer");
        b.H(this, l0, v, v1);
    }

    private final void x0(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.writeInt(this.a.length);
        objectOutputStream0.write(this.a);
    }

    @y4.m
    public final String y() {
        return this.c;
    }

    @l
    public String z() {
        char[] arr_c = new char[this.s().length * 2];
        byte[] arr_b = this.s();
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v2 = arr_b[v];
            int v3 = v1 + 1;
            arr_c[v1] = b.J()[v2 >> 4 & 15];
            v1 += 2;
            arr_c[v3] = b.J()[v2 & 15];
        }
        return v.x1(arr_c);
    }
}

