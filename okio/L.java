package okio;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import z3.f;
import z3.j;

@s0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,641:1\n89#2:642\n86#2:675\n86#2:677\n74#2:737\n74#2:763\n83#2:802\n77#2:813\n89#2:1003\n74#2:1018\n86#2:1122\n89#2:1615\n244#3,32:643\n279#3,10:678\n292#3,18:688\n414#3,2:706\n112#3:708\n416#3:709\n114#3,18:710\n313#3,9:728\n322#3,15:738\n340#3,10:753\n350#3,3:764\n348#3,25:767\n376#3,10:792\n386#3:803\n384#3,9:804\n393#3,7:814\n391#3,20:821\n682#3,60:841\n745#3,56:901\n803#3:957\n806#3:958\n807#3,6:960\n817#3,7:966\n827#3,6:973\n835#3,5:979\n867#3,6:984\n877#3:990\n878#3,11:992\n889#3,5:1004\n898#3,9:1009\n908#3,61:1019\n633#3:1080\n636#3:1081\n637#3,5:1083\n644#3:1088\n647#3,7:1089\n656#3,20:1096\n420#3:1116\n423#3,5:1117\n428#3,10:1123\n439#3,7:1133\n444#3,2:1140\n973#3:1142\n974#3,87:1144\n1064#3,48:1231\n603#3:1279\n610#3,21:1280\n1115#3,7:1301\n1125#3,7:1308\n1135#3,4:1315\n1142#3,8:1319\n1153#3,10:1327\n1166#3,14:1337\n449#3,91:1351\n543#3,40:1442\n586#3:1482\n588#3,13:1484\n1183#3:1497\n1234#3:1498\n1235#3,39:1500\n1276#3,2:1539\n1278#3,4:1542\n1285#3,3:1546\n1289#3,4:1550\n112#3:1554\n1293#3,22:1555\n114#3,18:1577\n1319#3,2:1595\n1321#3,3:1598\n112#3:1601\n1324#3,13:1602\n1337#3,13:1616\n114#3,18:1629\n1354#3,2:1647\n1357#3:1650\n112#3:1651\n1358#3,50:1652\n114#3,18:1702\n1417#3,14:1720\n1434#3,32:1734\n1469#3,12:1766\n1484#3,18:1778\n1506#3:1796\n1507#3:1798\n1512#3,34:1799\n1#4:676\n1#4:959\n1#4:991\n1#4:1082\n1#4:1143\n1#4:1483\n1#4:1499\n1#4:1541\n1#4:1549\n1#4:1597\n1#4:1649\n1#4:1797\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:642\n197#1:675\n235#1:677\n261#1:737\n264#1:763\n267#1:802\n267#1:813\n335#1:1003\n338#1:1018\n374#1:1122\n483#1:1615\n181#1:643,32\n252#1:678,10\n255#1:688,18\n258#1:706,2\n258#1:708\n258#1:709\n258#1:710,18\n261#1:728,9\n261#1:738,15\n264#1:753,10\n264#1:764,3\n264#1:767,25\n267#1:792,10\n267#1:803\n267#1:804,9\n267#1:814,7\n267#1:821,20\n279#1:841,60\n282#1:901,56\n284#1:957\n287#1:958\n287#1:960,6\n289#1:966,7\n292#1:973,6\n295#1:979,5\n329#1:984,6\n335#1:990\n335#1:992,11\n335#1:1004,5\n338#1:1009,9\n338#1:1019,61\n340#1:1080\n343#1:1081\n343#1:1083,5\n345#1:1088\n348#1:1089,7\n351#1:1096,20\n371#1:1116\n374#1:1117,5\n374#1:1123,10\n376#1:1133,7\n379#1:1140,2\n384#1:1142\n384#1:1144,87\n387#1:1231,48\n410#1:1279\n416#1:1280,21\n437#1:1301,7\n441#1:1308,7\n443#1:1315,4\n445#1:1319,8\n449#1:1327,10\n453#1:1337,14\n457#1:1351,91\n460#1:1442,40\n463#1:1482\n463#1:1484,13\n465#1:1497\n465#1:1498\n465#1:1500,39\n467#1:1539,2\n467#1:1542,4\n477#1:1546,3\n477#1:1550,4\n477#1:1554\n477#1:1555,22\n477#1:1577,18\n483#1:1595,2\n483#1:1598,3\n483#1:1601\n483#1:1602,13\n483#1:1616,13\n483#1:1629,18\n488#1:1647,2\n488#1:1650\n488#1:1651\n488#1:1652,50\n488#1:1702,18\n498#1:1720,14\n568#1:1734,32\n570#1:1766,12\n578#1:1778,18\n586#1:1796\n586#1:1798\n588#1:1799,34\n287#1:959\n335#1:991\n343#1:1082\n384#1:1143\n463#1:1483\n465#1:1499\n467#1:1541\n477#1:1549\n483#1:1597\n488#1:1649\n586#1:1797\n*E\n"})
public final class l implements Cloneable, ByteChannel, m, n {
    @s0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"})
    public static final class a implements Closeable {
        @y4.m
        @f
        public l a;
        @f
        public boolean b;
        @y4.m
        private j0 c;
        @f
        public long d;
        @y4.m
        @f
        public byte[] e;
        @f
        public int f;
        @f
        public int g;

        public a() {
            this.d = -1L;
            this.f = -1;
            this.g = -1;
        }

        public final long a(int v) {
            if(v <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + v).toString());
            }
            if(v > 0x2000) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + v).toString());
            }
            l l0 = this.a;
            if(l0 == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if(!this.b) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long v1 = l0.size();
            j0 j00 = l0.j1(v);
            int v2 = 0x2000 - j00.c;
            j00.c = 0x2000;
            l0.a1(v1 + ((long)v2));
            this.i(j00);
            this.d = v1;
            this.e = j00.a;
            this.f = 0x2000 - v2;
            this.g = 0x2000;
            return (long)v2;
        }

        @y4.m
        public final j0 b() {
            return this.c;
        }

        public final int c() {
            long v = this.d;
            l l0 = this.a;
            L.m(l0);
            if(v == l0.size()) {
                throw new IllegalStateException("no more bytes");
            }
            return this.d == -1L ? this.f(0L) : this.f(this.d + ((long)(this.g - this.f)));
        }

        @Override
        public void close() {
            if(this.a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.a = null;
            this.i(null);
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.g = -1;
        }

        public final long e(long v) {
            l l0 = this.a;
            if(l0 == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if(!this.b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long v1 = l0.size();
            if(Long.compare(v, v1) <= 0) {
                if(v < 0L) {
                    throw new IllegalArgumentException(("newSize < 0: " + v).toString());
                }
                long v2 = v1 - v;
                while(v2 > 0L) {
                    j0 j00 = l0.a;
                    L.m(j00);
                    j0 j01 = j00.g;
                    L.m(j01);
                    int v3 = j01.c;
                    long v4 = (long)(v3 - j01.b);
                    if(v4 <= v2) {
                        l0.a = j01.b();
                        k0.d(j01);
                        v2 -= v4;
                    }
                    else {
                        j01.c = v3 - ((int)v2);
                        if(true) {
                            break;
                        }
                    }
                }
                this.i(null);
                this.d = v;
                this.e = null;
                this.f = -1;
                this.g = -1;
            }
            else {
                long v5 = v - v1;
                boolean z = true;
                while(v5 > 0L) {
                    j0 j02 = l0.j1(1);
                    int v6 = (int)Math.min(v5, 0x2000 - j02.c);
                    j02.c += v6;
                    v5 -= (long)v6;
                    if(z) {
                        this.i(j02);
                        this.d = v1;
                        this.e = j02.a;
                        this.f = j02.c - v6;
                        this.g = j02.c;
                        z = false;
                    }
                }
            }
            l0.a1(v);
            return v1;
        }

        public final int f(long v) {
            j0 j02;
            l l0 = this.a;
            if(l0 == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            int v1 = Long.compare(v, -1L);
            if(v1 < 0 || v > l0.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + v + " > size=" + l0.size());
            }
            if(v1 != 0 && v != l0.size()) {
                long v2 = l0.size();
                j0 j00 = l0.a;
                long v3 = 0L;
                if(this.b() == null) {
                    j02 = j00;
                }
                else {
                    long v4 = this.d;
                    int v5 = this.f;
                    j0 j01 = this.b();
                    L.m(j01);
                    long v6 = v4 - ((long)(v5 - j01.b));
                    if(v6 > v) {
                        j02 = j00;
                        j00 = this.b();
                        v2 = v6;
                    }
                    else {
                        j02 = this.b();
                        v3 = v6;
                    }
                }
                if(v2 - v > v - v3) {
                    while(true) {
                        L.m(j02);
                        int v7 = j02.c;
                        int v8 = j02.b;
                        if(v < ((long)(v7 - v8)) + v3) {
                            break;
                        }
                        v3 += (long)(v7 - v8);
                        j02 = j02.f;
                    }
                }
                else {
                    while(v2 > v) {
                        L.m(j00);
                        j00 = j00.g;
                        L.m(j00);
                        v2 -= (long)(j00.c - j00.b);
                    }
                    v3 = v2;
                    j02 = j00;
                }
                if(this.b) {
                    L.m(j02);
                    if(j02.d) {
                        j0 j03 = j02.f();
                        if(l0.a == j02) {
                            l0.a = j03;
                        }
                        j02 = j02.c(j03);
                        j0 j04 = j02.g;
                        L.m(j04);
                        j04.b();
                    }
                }
                this.i(j02);
                this.d = v;
                L.m(j02);
                this.e = j02.a;
                int v9 = j02.b + ((int)(v - v3));
                this.f = v9;
                this.g = j02.c;
                return j02.c - v9;
            }
            this.i(null);
            this.d = v;
            this.e = null;
            this.f = -1;
            this.g = -1;
            return -1;
        }

        public final void i(@y4.m j0 j00) {
            this.c = j00;
        }
    }

    @y4.m
    @f
    public j0 a;
    private long b;

    @Override  // okio.m
    public m A1(long v) {
        return this.i2(v);
    }

    @y4.l
    public l A2(int v) {
        j0 j00 = this.j1(2);
        int v1 = j00.c;
        j00.a[v1] = (byte)(v >>> 8 & 0xFF);
        j00.a[v1 + 1] = (byte)(v & 0xFF);
        j00.c = v1 + 2;
        this.a1(this.size() + 2L);
        return this;
    }

    @Override  // okio.m
    public m A3(String s, Charset charset0) {
        return this.L2(s, charset0);
    }

    @Override  // okio.n
    @y4.l
    public o B1() {
        return this.F0(this.size());
    }

    @Override  // okio.n
    @y4.l
    public String C0(long v) throws EOFException {
        return this.L1(v, kotlin.text.f.b);
    }

    @y4.l
    public l C2(int v) {
        return this.A2(((int)(((short)((((short)v) & 0xFF) << 8 | (0xFF00 & ((short)v)) >>> 8)))));
    }

    @Override  // okio.n, okio.m
    @y4.l
    public l D() [...] // Inlined contents

    @Override  // okio.m
    public m D2(String s) {
        return this.b3(s);
    }

    @Override  // okio.n, okio.m
    @y4.l
    public l E() {
        return this;
    }

    private final void E0(InputStream inputStream0, long v, boolean z) throws IOException {
        while(true) {
            if(v <= 0L && !z) {
                return;
            }
            j0 j00 = this.j1(1);
            int v1 = inputStream0.read(j00.a, j00.c, ((int)Math.min(v, 0x2000 - j00.c)));
            if(v1 == -1) {
                if(j00.b == j00.c) {
                    this.a = j00.b();
                    k0.d(j00);
                }
                if(!z) {
                    throw new EOFException();
                }
                return;
            }
            j00.c += v1;
            this.b += (long)v1;
            v -= (long)v1;
        }
    }

    @Override  // okio.n
    @y4.l
    public o F0(long v) throws EOFException {
        if(v < 0L || v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException(("byteCount: " + v).toString());
        }
        if(this.size() < v) {
            throw new EOFException();
        }
        if(v >= 0x1000L) {
            o o0 = this.i1(((int)v));
            this.skip(v);
            return o0;
        }
        return new o(this.O2(v));
    }

    @Override  // okio.m
    public m F1(o0 o00, long v) {
        return this.J1(o00, v);
    }

    @Override  // okio.n
    public int H3() throws EOFException {
        return i.o(this.readInt());
    }

    @y4.l
    public l I2(@y4.l String s, int v, int v1, @y4.l Charset charset0) {
        L.p(s, "string");
        L.p(charset0, "charset");
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + v).toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + v1 + " < " + v).toString());
        }
        if(v1 > s.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + v1 + " > " + s.length()).toString());
        }
        if(L.g(charset0, kotlin.text.f.b)) {
            return this.e3(s, v, v1);
        }
        String s1 = s.substring(v, v1);
        L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] arr_b = s1.getBytes(charset0);
        L.o(arr_b, "this as java.lang.String).getBytes(charset)");
        return this.d2(arr_b, 0, arr_b.length);
    }

    @Override  // okio.n
    @y4.l
    public InputStream J() {
        @s0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n74#2:642\n86#2:643\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:642\n136#1:643\n*E\n"})
        public static final class b extends InputStream {
            final l a;

            b(l l0) {
                this.a = l0;
                super();
            }

            @Override
            public int available() {
                return (int)Math.min(this.a.size(), 0x7FFFFFFFL);
            }

            @Override
            public void close() {
            }

            @Override
            public int read() {
                return this.a.size() <= 0L ? -1 : this.a.readByte() & 0xFF;
            }

            @Override
            public int read(@y4.l byte[] arr_b, int v, int v1) {
                L.p(arr_b, "sink");
                return this.a.read(arr_b, v, v1);
            }

            @Override
            @y4.l
            public String toString() {
                return this.a + ".inputStream()";
            }
        }

        return new b(this);
    }

    @y4.l
    public l J1(@y4.l o0 o00, long v) throws IOException {
        L.p(o00, "source");
        while(v > 0L) {
            long v1 = o00.read(this, v);
            if(v1 == -1L) {
                throw new EOFException();
            }
            v -= v1;
        }
        return this;
    }

    @Override  // okio.n
    public long K(@y4.l o o0, long v) throws IOException {
        int v6;
        long v1 = 0L;
        L.p(o0, "bytes");
        if(o0.h0() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        if(v < 0L) {
            throw new IllegalArgumentException(("fromIndex < 0: " + v).toString());
        }
        j0 j00 = this.a;
        if(j00 != null) {
            if(this.size() - v < v) {
                for(v1 = this.size(); v1 > v; v1 -= (long)(j00.c - j00.b)) {
                    j00 = j00.g;
                    L.m(j00);
                }
                byte[] arr_b = o0.K();
                int v2 = arr_b[0];
                int v3 = o0.h0();
                long v4 = this.size() - ((long)v3) + 1L;
                while(v1 < v4) {
                    byte[] arr_b1 = j00.a;
                    int v5 = (int)Math.min(j00.c, ((long)j00.b) + v4 - v1);
                    for(v6 = (int)(((long)j00.b) + v - v1); v6 < v5; ++v6) {
                        if(arr_b1[v6] == v2 && okio.internal.a.i0(j00, v6 + 1, arr_b, 1, v3)) {
                            return ((long)(v6 - j00.b)) + v1;
                        }
                    }
                    v1 += (long)(j00.c - j00.b);
                    j00 = j00.f;
                    L.m(j00);
                    v = v1;
                }
                return -1L;
            }
            long v7;
            while((v7 = ((long)(j00.c - j00.b)) + v1) <= v) {
                j00 = j00.f;
                L.m(j00);
                v1 = v7;
            }
            byte[] arr_b2 = o0.K();
            int v8 = arr_b2[0];
            int v9 = o0.h0();
            long v10 = this.size() - ((long)v9) + 1L;
            while(v1 < v10) {
                byte[] arr_b3 = j00.a;
                int v11 = (int)Math.min(j00.c, ((long)j00.b) + v10 - v1);
                v6 = (int)(((long)j00.b) + v - v1);
                while(v6 < v11) {
                    if(arr_b3[v6] != v8 || !okio.internal.a.i0(j00, v6 + 1, arr_b2, 1, v9)) {
                        ++v6;
                        continue;
                    }
                    return ((long)(v6 - j00.b)) + v1;
                }
                v1 += (long)(j00.c - j00.b);
                j00 = j00.f;
                L.m(j00);
                v = v1;
            }
        }
        return -1L;
    }

    @Override  // okio.n
    @y4.l
    public String K1() [...] // 潜在的解密器

    @Override  // okio.m
    public long K2(@y4.l o0 o00) throws IOException {
        L.p(o00, "source");
        long v = 0L;
        long v1;
        while((v1 = o00.read(this, 0x2000L)) != -1L) {
            v += v1;
        }
        return v;
    }

    @y4.l
    public l L() [...] // Inlined contents

    @y4.l
    @j
    public final a L0() {
        return l.Y0(this, null, 1, null);
    }

    @Override  // okio.n
    @y4.l
    public String L1(long v, @y4.l Charset charset0) throws EOFException {
        L.p(charset0, "charset");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0 || v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException(("byteCount: " + v).toString());
        }
        if(this.b < v) {
            throw new EOFException();
        }
        if(v1 == 0) {
            return "";
        }
        j0 j00 = this.a;
        L.m(j00);
        int v2 = j00.b;
        if(((long)v2) + v > ((long)j00.c)) {
            return new String(this.O2(v), charset0);
        }
        String s = new String(j00.a, v2, ((int)v), charset0);
        int v3 = j00.b + ((int)v);
        j00.b = v3;
        this.b -= v;
        if(v3 == j00.c) {
            this.a = j00.b();
            k0.d(j00);
        }
        return s;
    }

    @y4.l
    public l L2(@y4.l String s, @y4.l Charset charset0) {
        L.p(s, "string");
        L.p(charset0, "charset");
        return this.I2(s, 0, s.length(), charset0);
    }

    @Override  // okio.m
    public m M1(o o0) {
        return this.t1(o0);
    }

    @Override  // okio.n
    @y4.l
    public String M2() throws EOFException {
        return this.q2(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.n
    public boolean N2(long v, @y4.l o o0, int v1, int v2) {
        L.p(o0, "bytes");
        if(v >= 0L && v1 >= 0 && v2 >= 0 && this.size() - v >= ((long)v2) && o0.h0() - v1 >= v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                if(this.Q(((long)v3) + v) != o0.r(v1 + v3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override  // okio.n
    @y4.l
    public byte[] O2(long v) throws EOFException {
        if(v < 0L || v > 0x7FFFFFFFL) {
            throw new IllegalArgumentException(("byteCount: " + v).toString());
        }
        if(this.size() < v) {
            throw new EOFException();
        }
        byte[] arr_b = new byte[((int)v)];
        this.readFully(arr_b);
        return arr_b;
    }

    @Override  // okio.m
    public m P(long v) {
        return this.t2(v);
    }

    @y4.l
    @j
    public final l P2(@y4.l OutputStream outputStream0) throws IOException {
        L.p(outputStream0, "out");
        return l.Y2(this, outputStream0, 0L, 2, null);
    }

    @z3.i(name = "getByte")
    public final byte Q(long v) {
        i.e(this.size(), v, 1L);
        j0 j00 = this.a;
        if(j00 != null) {
            if(this.size() - v < v) {
                long v1;
                for(v1 = this.size(); v1 > v; v1 -= (long)(j00.c - j00.b)) {
                    j00 = j00.g;
                    L.m(j00);
                }
                L.m(j00);
                return j00.a[((int)(((long)j00.b) + v - v1))];
            }
            long v2 = 0L;
            long v3;
            while((v3 = ((long)(j00.c - j00.b)) + v2) <= v) {
                j00 = j00.f;
                L.m(j00);
                v2 = v3;
            }
            L.m(j00);
            return j00.a[((int)(((long)j00.b) + v - v2))];
        }
        L.m(null);
        throw null;
    }

    @y4.l
    public l Q1(@y4.l byte[] arr_b) {
        L.p(arr_b, "source");
        return this.d2(arr_b, 0, arr_b.length);
    }

    private final o R(String s, o o0) {
        try {
            Mac mac0 = Mac.getInstance(s);
            mac0.init(new SecretKeySpec(o0.K(), s));
            j0 j00 = this.a;
            if(j00 != null) {
                mac0.update(j00.a, j00.b, j00.c - j00.b);
                j0 j01 = j00.f;
                L.m(j01);
                while(j01 != j00) {
                    mac0.update(j01.a, j01.b, j01.c - j01.b);
                    j01 = j01.f;
                    L.m(j01);
                }
            }
            byte[] arr_b = mac0.doFinal();
            L.o(arr_b, "doFinal(...)");
            return new o(arr_b);
        }
        catch(InvalidKeyException invalidKeyException0) {
        }
        throw new IllegalArgumentException(invalidKeyException0);
    }

    @Override  // okio.n
    public long R1(@y4.l m0 m00) throws IOException {
        L.p(m00, "sink");
        long v = this.size();
        if(v > 0L) {
            m00.write(this, v);
        }
        return v;
    }

    @y4.l
    @j
    public final l R2(@y4.l OutputStream outputStream0, long v) throws IOException {
        L.p(outputStream0, "out");
        i.e(this.b, 0L, v);
        j0 j00 = this.a;
        while(v > 0L) {
            L.m(j00);
            int v1 = (int)Math.min(v, j00.c - j00.b);
            outputStream0.write(j00.a, j00.b, v1);
            int v2 = j00.b + v1;
            j00.b = v2;
            this.b -= (long)v1;
            v -= (long)v1;
            if(v2 == j00.c) {
                j0 j01 = j00.b();
                this.a = j01;
                k0.d(j00);
                j00 = j01;
            }
        }
        return this;
    }

    @Override  // okio.n
    public long S(@y4.l o o0) throws IOException {
        L.p(o0, "bytes");
        return this.K(o0, 0L);
    }

    @y4.l
    public final o T(@y4.l o o0) {
        L.p(o0, "key");
        return this.R("HmacSHA1", o0);
    }

    @y4.l
    @j
    public final a T0(@y4.l a l$a0) {
        L.p(l$a0, "unsafeCursor");
        return okio.internal.a.F(this, l$a0);
    }

    @Override  // okio.n
    public long T1() throws EOFException {
        int v5;
        if(this.size() == 0L) {
            throw new EOFException();
        }
        int v = 0;
        long v1 = 0L;
        boolean z = false;
        do {
            j0 j00 = this.a;
            L.m(j00);
            byte[] arr_b = j00.a;
            int v2 = j00.b;
            int v3 = j00.c;
            while(v2 < v3) {
                int v4 = arr_b[v2];
                if(v4 >= 0x30 && v4 <= 57) {
                    v5 = v4 - 0x30;
                }
                else if(v4 >= 97 && v4 <= 102) {
                    v5 = v4 - 87;
                }
                else if(v4 < 65 || v4 > 70) {
                    goto label_25;
                }
                else {
                    v5 = v4 - 55;
                }
                if((0xF000000000000000L & v1) != 0L) {
                    throw new NumberFormatException("Number too large: ");
                }
                v1 = v1 << 4 | ((long)v5);
                ++v2;
                ++v;
                continue;
            label_25:
                if(v == 0) {
                    throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + i.u(((byte)v4)));
                }
                z = true;
                break;
            }
            if(v2 == v3) {
                this.a = j00.b();
                k0.d(j00);
            }
            else {
                j00.b = v2;
            }
        }
        while(!z && this.a != null);
        this.a1(this.size() - ((long)v));
        return v1;
    }

    @Override  // okio.n
    public long U(byte b, long v) {
        return this.m2(b, v, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.m
    @y4.l
    public OutputStream U3() {
        public static final class c extends OutputStream {
            final l a;

            c(l l0) {
                this.a = l0;
                super();
            }

            @Override
            public void close() {
            }

            @Override
            public void flush() {
            }

            @Override
            @y4.l
            public String toString() {
                return this.a + ".outputStream()";
            }

            @Override
            public void write(int v) {
                this.a.e2(v);
            }

            @Override
            public void write(@y4.l byte[] arr_b, int v, int v1) {
                L.p(arr_b, "data");
                this.a.d2(arr_b, v, v1);
            }
        }

        return new c(this);
    }

    @Override  // okio.n
    public long W(@y4.l o o0) {
        L.p(o0, "targetBytes");
        return this.t0(o0, 0L);
    }

    @Override  // okio.n
    @y4.m
    public String X() throws EOFException {
        long v = this.w0(10);
        if(v != -1L) {
            return okio.internal.a.j0(this, v);
        }
        return this.size() == 0L ? null : this.C0(this.size());
    }

    @Override  // okio.m
    public m X0(o o0, int v, int v1) {
        return this.u1(o0, v, v1);
    }

    @Override  // okio.m
    public m X1() {
        return this;
    }

    @Override  // okio.n
    public void X2(long v) throws EOFException {
        if(this.b < v) {
            throw new EOFException();
        }
    }

    @Override  // okio.n
    public int X3(@y4.l c0 c00) {
        L.p(c00, "options");
        int v = okio.internal.a.m0(this, c00, false, 2, null);
        if(v == -1) {
            return -1;
        }
        this.skip(((long)c00.d()[v].h0()));
        return v;
    }

    @y4.l
    public final o Y(@y4.l o o0) {
        L.p(o0, "key");
        return this.R("HmacSHA256", o0);
    }

    public static a Y0(l l0, a l$a0, int v, Object object0) {
        if((v & 1) != 0) {
            l$a0 = i.g();
        }
        return l0.T0(l$a0);
    }

    public static l Y2(l l0, OutputStream outputStream0, long v, int v1, Object object0) throws IOException {
        if((v1 & 2) != 0) {
            v = l0.b;
        }
        return l0.R2(outputStream0, v);
    }

    @Override  // okio.n
    @y4.l
    public byte[] Z0() [...] // 潜在的解密器

    @k(level = kotlin.m.b, message = "moved to operator function", replaceWith = @kotlin.c0(expression = "this[index]", imports = {}))
    @z3.i(name = "-deprecated_getByte")
    public final byte a(long v) {
        return this.Q(v);
    }

    @Override  // okio.n
    public boolean a0(long v, @y4.l o o0) {
        L.p(o0, "bytes");
        return this.N2(v, o0, 0, o0.h0());
    }

    public final void a1(long v) {
        this.b = v;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @kotlin.c0(expression = "size", imports = {}))
    @z3.i(name = "-deprecated_size")
    public final long b() {
        return this.b;
    }

    @Override  // okio.m
    public m b0(String s, int v, int v1) {
        return this.e3(s, v, v1);
    }

    @y4.l
    public final o b1() {
        return this.w("SHA-1");
    }

    @Override  // okio.m
    public m b2(int v) {
        return this.n3(v);
    }

    @y4.l
    public l b3(@y4.l String s) {
        L.p(s, "string");
        return this.e3(s, 0, s.length());
    }

    public final void c() {
        this.skip(this.size());
    }

    @y4.l
    public final o c1() {
        return this.w("SHA-256");
    }

    @Override
    public Object clone() {
        return this.e();
    }

    @Override  // okio.o0, okio.m0
    public void close() {
    }

    @y4.l
    public final o d0(@y4.l o o0) {
        L.p(o0, "key");
        return this.R("HmacSHA512", o0);
    }

    @y4.l
    public final o d1() {
        return this.w("SHA-512");
    }

    @y4.l
    public l d2(@y4.l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "source");
        i.e(arr_b.length, v, v1);
        int v2 = v1 + v;
        while(v < v2) {
            j0 j00 = this.j1(1);
            int v3 = Math.min(v2 - v, 0x2000 - j00.c);
            int v4 = v + v3;
            kotlin.collections.l.v0(arr_b, j00.a, j00.c, v, v4);
            j00.c += v3;
            v = v4;
        }
        this.a1(this.size() + ((long)v1));
        return this;
    }

    @y4.l
    public l e() {
        return this.j();
    }

    @y4.l
    public final o e0() {
        return this.w("MD5");
    }

    @y4.l
    public l e2(int v) {
        j0 j00 = this.j1(1);
        int v1 = j00.c;
        j00.c = v1 + 1;
        j00.a[v1] = (byte)v;
        this.a1(this.size() + 1L);
        return this;
    }

    @y4.l
    public l e3(@y4.l String s, int v, int v1) {
        L.p(s, "string");
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + v).toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + v1 + " < " + v).toString());
        }
        if(v1 > s.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + v1 + " > " + s.length()).toString());
        }
        while(v < v1) {
            int v2 = s.charAt(v);
            if(v2 < 0x80) {
                j0 j00 = this.j1(1);
                byte[] arr_b = j00.a;
                int v3 = j00.c - v;
                int v4 = Math.min(v1, 0x2000 - v3);
                int v5 = v + 1;
                arr_b[v + v3] = (byte)v2;
                while(true) {
                    v = v5;
                    if(v >= v4) {
                        break;
                    }
                    int v6 = s.charAt(v);
                    if(v6 >= 0x80) {
                        break;
                    }
                    v5 = v + 1;
                    arr_b[v + v3] = (byte)v6;
                }
                int v7 = v3 + v - j00.c;
                j00.c += v7;
                this.a1(this.size() + ((long)v7));
            }
            else {
                if(v2 < 0x800) {
                    j0 j01 = this.j1(2);
                    int v8 = j01.c;
                    j01.a[v8] = (byte)(v2 >> 6 | 0xC0);
                    j01.a[v8 + 1] = (byte)(v2 & 0x3F | 0x80);
                    j01.c = v8 + 2;
                    this.a1(this.size() + 2L);
                }
                else if(v2 < 0xD800 || v2 > 0xDFFF) {
                    j0 j03 = this.j1(3);
                    int v12 = j03.c;
                    j03.a[v12] = (byte)(v2 >> 12 | 0xE0);
                    j03.a[v12 + 1] = (byte)(0x3F & v2 >> 6 | 0x80);
                    j03.a[v12 + 2] = (byte)(v2 & 0x3F | 0x80);
                    j03.c = v12 + 3;
                    this.a1(this.size() + 3L);
                }
                else {
                    int v9 = v + 1 >= v1 ? 0 : s.charAt(v + 1);
                    if(v2 > 0xDBFF || 0xDC00 > v9 || v9 >= 0xE000) {
                        this.e2(0x3F);
                        ++v;
                    }
                    else {
                        int v10 = ((v2 & 0x3FF) << 10 | v9 & 0x3FF) + 0x10000;
                        j0 j02 = this.j1(4);
                        int v11 = j02.c;
                        j02.a[v11] = (byte)(v10 >> 18 | 0xF0);
                        j02.a[v11 + 1] = (byte)(v10 >> 12 & 0x3F | 0x80);
                        j02.a[v11 + 2] = (byte)(v10 >> 6 & 0x3F | 0x80);
                        j02.a[v11 + 3] = (byte)(v10 & 0x3F | 0x80);
                        j02.c = v11 + 4;
                        this.a1(this.size() + 4L);
                        v += 2;
                    }
                    continue;
                }
                ++v;
            }
        }
        return this;
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this != object0) {
            if(!(object0 instanceof l) || this.size() != ((l)object0).size()) {
                return false;
            }
            if(this.size() != 0L) {
                j0 j00 = this.a;
                L.m(j00);
                j0 j01 = ((l)object0).a;
                L.m(j01);
                int v = j00.b;
                int v1 = j01.b;
                for(long v2 = 0L; v2 < this.size(); v2 += v3) {
                    long v3 = (long)Math.min(j00.c - v, j01.c - v1);
                    long v4 = 0L;
                    while(v4 < v3) {
                        if(j00.a[v] != j01.a[v1]) {
                            return false;
                        }
                        ++v4;
                        ++v;
                        ++v1;
                    }
                    if(v == j00.c) {
                        j00 = j00.f;
                        L.m(j00);
                        v = j00.b;
                    }
                    if(v1 == j01.c) {
                        j01 = j01.f;
                        L.m(j01);
                        v1 = j01.b;
                    }
                }
                return true;
            }
        }
        return true;
    }

    public final long f() {
        long v = this.size();
        if(v != 0L) {
            j0 j00 = this.a;
            L.m(j00);
            j0 j01 = j00.g;
            L.m(j01);
            return j01.c >= 0x2000 || !j01.e ? v : v - ((long)(j01.c - j01.b));
        }
        return 0L;
    }

    @y4.l
    @j
    public final a f0() {
        return l.l0(this, null, 1, null);
    }

    @Override  // okio.m
    public m f1(int v) {
        return this.o2(v);
    }

    @Override  // okio.m
    public void flush() {
    }

    @y4.l
    public l g2(long v) {
        boolean z;
        int v1 = 1;
        int v2 = Long.compare(v, 0L);
        if(v2 == 0) {
            return this.e2(0x30);
        }
        if(v2 < 0) {
            v = -v;
            if(v < 0L) {
                return this.b3("-9223372036854775808");
            }
            z = true;
        }
        else {
            z = false;
        }
        if(v >= 100000000L) {
            if(v >= 1000000000000L) {
                if(v >= 1000000000000000L) {
                    if(v >= 100000000000000000L) {
                        v1 = v >= 1000000000000000000L ? 19 : 18;
                    }
                    else if(v < 10000000000000000L) {
                        v1 = 16;
                    }
                    else {
                        v1 = 17;
                    }
                }
                else if(v < 10000000000000L) {
                    v1 = 13;
                }
                else if(v < 100000000000000L) {
                    v1 = 14;
                }
                else {
                    v1 = 15;
                }
            }
            else if(v >= 10000000000L) {
                v1 = v < 100000000000L ? 11 : 12;
            }
            else if(v < 1000000000L) {
                v1 = 9;
            }
            else {
                v1 = 10;
            }
        }
        else if(v >= 10000L) {
            if(v >= 1000000L) {
                v1 = v < 10000000L ? 7 : 8;
            }
            else if(v < 100000L) {
                v1 = 5;
            }
            else {
                v1 = 6;
            }
        }
        else if(v >= 100L) {
            v1 = v < 1000L ? 3 : 4;
        }
        else if(v >= 10L) {
            v1 = 2;
        }
        if(z) {
            ++v1;
        }
        j0 j00 = this.j1(v1);
        byte[] arr_b = j00.a;
        int v3 = j00.c + v1;
        while(v != 0L) {
            --v3;
            arr_b[v3] = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102}[((int)(v % 10L))];
            v /= 10L;
        }
        if(z) {
            arr_b[v3 - 1] = 45;
        }
        j00.c += v1;
        this.a1(this.size() + ((long)v1));
        return this;
    }

    @y4.l
    @j
    public final a h0(@y4.l a l$a0) {
        L.p(l$a0, "unsafeCursor");
        return okio.internal.a.s(this, l$a0);
    }

    @y4.l
    public final o h1() {
        if(this.size() > 0x7FFFFFFFL) {
            throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.size()).toString());
        }
        return this.i1(((int)this.size()));
    }

    @Override
    public int hashCode() {
        j0 j00 = this.a;
        if(j00 == null) {
            return 0;
        }
        int v = 1;
        do {
            int v1 = j00.b;
            int v2 = j00.c;
            while(v1 < v2) {
                v = v * 0x1F + j00.a[v1];
                ++v1;
            }
            j00 = j00.f;
            L.m(j00);
        }
        while(j00 != this.a);
        return v;
    }

    @y4.l
    public final o i1(int v) {
        if(v == 0) {
            return o.f;
        }
        i.e(this.size(), 0L, v);
        j0 j00 = this.a;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v2 < v) {
            L.m(j00);
            int v4 = j00.c;
            int v5 = j00.b;
            if(v4 == v5) {
                throw new AssertionError("s.limit == s.pos");
            }
            v2 += v4 - v5;
            ++v3;
            j00 = j00.f;
        }
        byte[][] arr2_b = new byte[v3][];
        int[] arr_v = new int[v3 * 2];
        j0 j01 = this.a;
        int v6 = 0;
        while(v1 < v) {
            L.m(j01);
            arr2_b[v6] = j01.a;
            v1 += j01.c - j01.b;
            arr_v[v6] = Math.min(v1, v);
            arr_v[v6 + v3] = j01.b;
            j01.d = true;
            ++v6;
            j01 = j01.f;
        }
        return new l0(arr2_b, arr_v);
    }

    @y4.l
    public l i2(long v) {
        if(v == 0L) {
            return this.e2(0x30);
        }
        long v1 = v >>> 1 | v;
        long v2 = v1 | v1 >>> 2;
        long v3 = v2 | v2 >>> 4;
        long v4 = v3 | v3 >>> 8;
        long v5 = v4 | v4 >>> 16;
        long v6 = v5 | v5 >>> 0x20;
        long v7 = v6 - (v6 >>> 1 & 0x5555555555555555L);
        long v8 = (v7 >>> 2 & 0x3333333333333333L) + (v7 & 0x3333333333333333L);
        long v9 = (v8 >>> 4) + v8 & 0xF0F0F0F0F0F0F0FL;
        long v10 = v9 + (v9 >>> 8);
        long v11 = v10 + (v10 >>> 16);
        int v12 = (int)(((v11 & 0x3FL) + (v11 >>> 0x20 & 0x3FL) + 3L) / 4L);
        j0 j00 = this.j1(v12);
        byte[] arr_b = j00.a;
        int v13 = j00.c;
        for(int v14 = v13 + v12 - 1; v14 >= v13; --v14) {
            arr_b[v14] = new byte[]{0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102}[((int)(15L & v))];
            v >>>= 4;
        }
        j00.c += v12;
        this.a1(this.size() + ((long)v12));
        return this;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @y4.l
    public final l j() {
        l l0 = new l();
        if(this.size() != 0L) {
            j0 j00 = this.a;
            L.m(j00);
            j0 j01 = j00.d();
            l0.a = j01;
            j01.g = j01;
            j01.f = j01;
            for(j0 j02 = j00.f; j02 != j00; j02 = j02.f) {
                j0 j03 = j01.g;
                L.m(j03);
                L.m(j02);
                j03.c(j02.d());
            }
            l0.a1(this.size());
        }
        return l0;
    }

    @y4.l
    public final j0 j1(int v) {
        if(v < 1 || v > 0x2000) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        j0 j00 = this.a;
        if(j00 == null) {
            j0 j01 = k0.e();
            this.a = j01;
            j01.g = j01;
            j01.f = j01;
            return j01;
        }
        L.m(j00);
        j0 j02 = j00.g;
        L.m(j02);
        return j02.c + v > 0x2000 || !j02.e ? j02.c(k0.e()) : j02;
    }

    @y4.l
    public l j2(int v) {
        j0 j00 = this.j1(4);
        int v1 = j00.c;
        j00.a[v1] = (byte)(v >>> 24 & 0xFF);
        j00.a[v1 + 1] = (byte)(v >>> 16 & 0xFF);
        j00.a[v1 + 2] = (byte)(v >>> 8 & 0xFF);
        j00.a[v1 + 3] = (byte)(v & 0xFF);
        j00.c = v1 + 4;
        this.a1(this.size() + 4L);
        return this;
    }

    @Override  // okio.n
    public boolean j3() {
        return this.b == 0L;
    }

    @y4.l
    @j
    public final l k(@y4.l OutputStream outputStream0) throws IOException {
        L.p(outputStream0, "out");
        return l.s(this, outputStream0, 0L, 0L, 6, null);
    }

    public static a l0(l l0, a l$a0, int v, Object object0) {
        if((v & 1) != 0) {
            l$a0 = i.g();
        }
        return l0.h0(l$a0);
    }

    @Override  // okio.n
    public void l2(@y4.l l l0, long v) throws EOFException {
        L.p(l0, "sink");
        if(this.size() >= v) {
            l0.write(this, v);
            return;
        }
        l0.write(this, this.size());
        throw new EOFException();
    }

    @Override  // okio.n
    public long m2(byte b, long v, long v1) {
        int v4;
        long v2 = 0L;
        if(0L > v || v > v1) {
            throw new IllegalArgumentException(("size=" + this.size() + " fromIndex=" + v + " toIndex=" + v1).toString());
        }
        if(v1 > this.size()) {
            v1 = this.size();
        }
        if(v != v1) {
            j0 j00 = this.a;
            if(j00 != null) {
                if(this.size() - v < v) {
                    for(v2 = this.size(); v2 > v; v2 -= (long)(j00.c - j00.b)) {
                        j00 = j00.g;
                        L.m(j00);
                    }
                    while(v2 < v1) {
                        byte[] arr_b = j00.a;
                        int v3 = (int)Math.min(j00.c, ((long)j00.b) + v1 - v2);
                        for(v4 = (int)(((long)j00.b) + v - v2); v4 < v3; ++v4) {
                            if(arr_b[v4] == b) {
                                return ((long)(v4 - j00.b)) + v2;
                            }
                        }
                        v2 += (long)(j00.c - j00.b);
                        j00 = j00.f;
                        L.m(j00);
                        v = v2;
                    }
                    return -1L;
                }
                long v5;
                while((v5 = ((long)(j00.c - j00.b)) + v2) <= v) {
                    j00 = j00.f;
                    L.m(j00);
                    v2 = v5;
                }
                while(v2 < v1) {
                    byte[] arr_b1 = j00.a;
                    int v6 = (int)Math.min(j00.c, ((long)j00.b) + v1 - v2);
                    v4 = (int)(((long)j00.b) + v - v2);
                    while(v4 < v6) {
                        if(arr_b1[v4] != b) {
                            ++v4;
                            continue;
                        }
                        return ((long)(v4 - j00.b)) + v2;
                    }
                    v2 += (long)(j00.c - j00.b);
                    j00 = j00.f;
                    L.m(j00);
                    v = v2;
                }
            }
        }
        return -1L;
    }

    @y4.l
    @j
    public final l n(@y4.l OutputStream outputStream0, long v) throws IOException {
        L.p(outputStream0, "out");
        return l.s(this, outputStream0, v, 0L, 4, null);
    }

    @Override  // okio.m
    public m n2() {
        return this;
    }

    @y4.l
    public l n3(int v) {
        if(v < 0x80) {
            this.e2(v);
            return this;
        }
        if(v < 0x800) {
            j0 j00 = this.j1(2);
            int v1 = j00.c;
            j00.a[v1] = (byte)(v >> 6 | 0xC0);
            j00.a[v1 + 1] = (byte)(v & 0x3F | 0x80);
            j00.c = v1 + 2;
            this.a1(this.size() + 2L);
            return this;
        }
        if(0xD800 <= v && v < 0xE000) {
            this.e2(0x3F);
            return this;
        }
        if(v < 0x10000) {
            j0 j01 = this.j1(3);
            int v2 = j01.c;
            j01.a[v2] = (byte)(v >> 12 | 0xE0);
            j01.a[v2 + 1] = (byte)(v >> 6 & 0x3F | 0x80);
            j01.a[v2 + 2] = (byte)(v & 0x3F | 0x80);
            j01.c = v2 + 3;
            this.a1(this.size() + 3L);
            return this;
        }
        if(v > 0x10FFFF) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + i.v(v));
        }
        j0 j02 = this.j1(4);
        int v3 = j02.c;
        j02.a[v3] = (byte)(v >> 18 | 0xF0);
        j02.a[v3 + 1] = (byte)(v >> 12 & 0x3F | 0x80);
        j02.a[v3 + 2] = (byte)(v >> 6 & 0x3F | 0x80);
        j02.a[v3 + 3] = (byte)(v & 0x3F | 0x80);
        j02.c = v3 + 4;
        this.a1(this.size() + 4L);
        return this;
    }

    @y4.l
    @j
    public final l o(@y4.l OutputStream outputStream0, long v, long v1) throws IOException {
        L.p(outputStream0, "out");
        i.e(this.b, v, v1);
        if(v1 == 0L) {
            return this;
        }
        j0 j00;
        for(j00 = this.a; true; j00 = j00.f) {
            L.m(j00);
            int v2 = j00.c;
            int v3 = j00.b;
            if(v < ((long)(v2 - v3))) {
                break;
            }
            v -= (long)(v2 - v3);
        }
        while(v1 > 0L) {
            L.m(j00);
            int v4 = (int)(((long)j00.b) + v);
            int v5 = (int)Math.min(j00.c - v4, v1);
            outputStream0.write(j00.a, v4, v5);
            v1 -= (long)v5;
            j00 = j00.f;
            v = 0L;
        }
        return this;
    }

    @y4.l
    public l o2(int v) {
        return this.j2((v & 0xFF) << 24 | ((0xFF000000 & v) >>> 24 | (0xFF0000 & v) >>> 8 | (0xFF00 & v) << 8));
    }

    @Override  // okio.n
    public long o3() throws EOFException {
        if(this.size() == 0L) {
            throw new EOFException();
        }
        int v = 0;
        long v1 = 0L;
        long v2 = -7L;
        boolean z = false;
        boolean z1 = false;
        do {
            j0 j00 = this.a;
            L.m(j00);
            byte[] arr_b = j00.a;
            int v3 = j00.b;
            int v4 = j00.c;
            while(v3 < v4) {
                int v5 = arr_b[v3];
                if(v5 >= 0x30 && v5 <= 57) {
                    int v6 = Long.compare(v1, -922337203685477580L);
                    if(v6 >= 0 && (v6 != 0 || ((long)(0x30 - v5)) >= v2)) {
                        v1 = v1 * 10L + ((long)(0x30 - v5));
                        goto label_25;
                    }
                    l l0 = new l().g2(v1).e2(v5);
                    if(!z) {
                        l0.readByte();
                    }
                    throw new NumberFormatException("Number too large: ");
                }
                else if(v5 == 45 && v == 0) {
                    --v2;
                    z = true;
                }
                else {
                    goto label_28;
                }
            label_25:
                ++v3;
                ++v;
                continue;
            label_28:
                z1 = true;
                if(true) {
                    break;
                }
            }
            if(v3 == v4) {
                this.a = j00.b();
                k0.d(j00);
            }
            else {
                j00.b = v3;
            }
        }
        while(!z1 && this.a != null);
        this.a1(this.size() - ((long)v));
        if(v < (z ? 2 : 1)) {
            if(this.size() == 0L) {
                throw new EOFException();
            }
            throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or \'-\'") + " but was 0x" + i.u(this.Q(0L)));
        }
        return z ? v1 : -v1;
    }

    @y4.l
    public final l p(@y4.l l l0, long v) {
        L.p(l0, "out");
        return this.q(l0, v, this.b - v);
    }

    @y4.l
    public l p2(long v) {
        j0 j00 = this.j1(8);
        int v1 = j00.c;
        j00.a[v1] = (byte)(((int)(v >>> 56 & 0xFFL)));
        j00.a[v1 + 1] = (byte)(((int)(v >>> 0x30 & 0xFFL)));
        j00.a[v1 + 2] = (byte)(((int)(v >>> 40 & 0xFFL)));
        j00.a[v1 + 3] = (byte)(((int)(v >>> 0x20 & 0xFFL)));
        j00.a[v1 + 4] = (byte)(((int)(v >>> 24 & 0xFFL)));
        j00.a[v1 + 5] = (byte)(((int)(v >>> 16 & 0xFFL)));
        j00.a[v1 + 6] = (byte)(((int)(v >>> 8 & 0xFFL)));
        j00.a[v1 + 7] = (byte)(((int)(v & 0xFFL)));
        j00.c = v1 + 8;
        this.a1(this.size() + 8L);
        return this;
    }

    @Override  // okio.n
    @y4.l
    public n peek() {
        return Z.e(new f0(this));
    }

    @y4.l
    public final l q(@y4.l l l0, long v, long v1) {
        L.p(l0, "out");
        i.e(this.size(), v, v1);
        if(v1 != 0L) {
            l0.a1(l0.size() + v1);
            j0 j00;
            for(j00 = this.a; true; j00 = j00.f) {
                L.m(j00);
                int v2 = j00.c;
                int v3 = j00.b;
                if(v < ((long)(v2 - v3))) {
                    break;
                }
                v -= (long)(v2 - v3);
            }
            while(v1 > 0L) {
                L.m(j00);
                j0 j01 = j00.d();
                int v4 = j01.b + ((int)v);
                j01.b = v4;
                j01.c = Math.min(v4 + ((int)v1), j01.c);
                j0 j02 = l0.a;
                if(j02 == null) {
                    j01.g = j01;
                    j01.f = j01;
                    l0.a = j01;
                }
                else {
                    L.m(j02);
                    j0 j03 = j02.g;
                    L.m(j03);
                    j03.c(j01);
                }
                v1 -= (long)(j01.c - j01.b);
                j00 = j00.f;
                v = 0L;
            }
        }
        return this;
    }

    @Override  // okio.n
    public short q0() throws EOFException {
        return i.q(this.readShort());
    }

    @Override  // okio.m
    public m q1(int v) {
        return this.C2(v);
    }

    @Override  // okio.n
    @y4.l
    public String q2(long v) throws EOFException {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        if(v < 0L) {
            throw new IllegalArgumentException(("limit < 0: " + v).toString());
        }
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            v1 = v + 1L;
        }
        long v2 = this.m2(10, 0L, v1);
        if(v2 != -1L) {
            return okio.internal.a.j0(this, v2);
        }
        if(v1 < this.size() && this.Q(v1 - 1L) == 13 && this.Q(v1) == 10) {
            return okio.internal.a.j0(this, v1);
        }
        l l0 = new l();
        this.q(l0, 0L, Math.min(0x20L, this.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.size(), v) + " content=" + l0.B1().z() + '…');
    }

    @Override  // okio.n
    public long r0() throws EOFException {
        return i.p(this.readLong());
    }

    @Override
    public int read(@y4.l ByteBuffer byteBuffer0) throws IOException {
        L.p(byteBuffer0, "sink");
        j0 j00 = this.a;
        if(j00 == null) {
            return -1;
        }
        int v = Math.min(byteBuffer0.remaining(), j00.c - j00.b);
        byteBuffer0.put(j00.a, j00.b, v);
        int v1 = j00.b + v;
        j00.b = v1;
        this.b -= (long)v;
        if(v1 == j00.c) {
            this.a = j00.b();
            k0.d(j00);
        }
        return v;
    }

    @Override  // okio.n
    public int read(@y4.l byte[] arr_b) {
        L.p(arr_b, "sink");
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override  // okio.n
    public int read(@y4.l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "sink");
        i.e(arr_b.length, v, v1);
        j0 j00 = this.a;
        if(j00 == null) {
            return -1;
        }
        int v2 = Math.min(v1, j00.c - j00.b);
        kotlin.collections.l.v0(j00.a, arr_b, v, j00.b, j00.b + v2);
        j00.b += v2;
        this.a1(this.size() - ((long)v2));
        if(j00.b == j00.c) {
            this.a = j00.b();
            k0.d(j00);
        }
        return v2;
    }

    @Override  // okio.o0
    public long read(@y4.l l l0, long v) {
        L.p(l0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(this.size() == 0L) {
            return -1L;
        }
        if(v > this.size()) {
            v = this.size();
        }
        l0.write(this, v);
        return v;
    }

    @Override  // okio.n
    public byte readByte() throws EOFException {
        if(this.size() == 0L) {
            throw new EOFException();
        }
        j0 j00 = this.a;
        L.m(j00);
        int v = j00.c;
        int v1 = j00.b + 1;
        byte b = j00.a[j00.b];
        this.a1(this.size() - 1L);
        if(v1 == v) {
            this.a = j00.b();
            k0.d(j00);
            return b;
        }
        j00.b = v1;
        return b;
    }

    @Override  // okio.n
    public void readFully(@y4.l byte[] arr_b) throws EOFException {
        L.p(arr_b, "sink");
        for(int v = 0; v < arr_b.length; v += v1) {
            int v1 = this.read(arr_b, v, arr_b.length - v);
            if(v1 == -1) {
                throw new EOFException();
            }
        }
    }

    @Override  // okio.n
    public int readInt() throws EOFException {
        if(this.size() < 4L) {
            throw new EOFException();
        }
        j0 j00 = this.a;
        L.m(j00);
        int v = j00.b;
        int v1 = j00.c;
        if(((long)(v1 - v)) < 4L) {
            return (this.readByte() & 0xFF) << 24 | (this.readByte() & 0xFF) << 16 | (this.readByte() & 0xFF) << 8 | this.readByte() & 0xFF;
        }
        int v2 = j00.a[v + 3] & 0xFF | ((j00.a[v + 1] & 0xFF) << 16 | (j00.a[v] & 0xFF) << 24 | (j00.a[v + 2] & 0xFF) << 8);
        this.a1(this.size() - 4L);
        if(v + 4 == v1) {
            this.a = j00.b();
            k0.d(j00);
            return v2;
        }
        j00.b = v + 4;
        return v2;
    }

    @Override  // okio.n
    public long readLong() throws EOFException {
        if(this.size() < 8L) {
            throw new EOFException();
        }
        j0 j00 = this.a;
        L.m(j00);
        int v = j00.b;
        int v1 = j00.c;
        if(((long)(v1 - v)) < 8L) {
            return (((long)this.readInt()) & 0xFFFFFFFFL) << 0x20 | 0xFFFFFFFFL & ((long)this.readInt());
        }
        long v2 = (((long)j00.a[v + 3]) & 0xFFL) << 0x20 | ((((long)j00.a[v]) & 0xFFL) << 56 | (((long)j00.a[v + 1]) & 0xFFL) << 0x30 | (((long)j00.a[v + 2]) & 0xFFL) << 40) | (((long)j00.a[v + 4]) & 0xFFL) << 24 | (((long)j00.a[v + 5]) & 0xFFL) << 16 | (((long)j00.a[v + 6]) & 0xFFL) << 8 | ((long)j00.a[v + 7]) & 0xFFL;
        this.a1(this.size() - 8L);
        if(v + 8 == v1) {
            this.a = j00.b();
            k0.d(j00);
            return v2;
        }
        j00.b = v + 8;
        return v2;
    }

    @Override  // okio.n
    public short readShort() throws EOFException {
        if(this.size() < 2L) {
            throw new EOFException();
        }
        j0 j00 = this.a;
        L.m(j00);
        int v = j00.b;
        int v1 = j00.c;
        if(v1 - v < 2) {
            return (short)((this.readByte() & 0xFF) << 8 | this.readByte() & 0xFF);
        }
        int v2 = j00.a[v + 1] & 0xFF | (j00.a[v] & 0xFF) << 8;
        this.a1(this.size() - 2L);
        if(v + 2 == v1) {
            this.a = j00.b();
            k0.d(j00);
            return (short)v2;
        }
        j00.b = v + 2;
        return (short)v2;
    }

    @Override  // okio.n
    public boolean request(long v) {
        return this.b >= v;
    }

    public static l s(l l0, OutputStream outputStream0, long v, long v1, int v2, Object object0) throws IOException {
        if((v2 & 2) != 0) {
            v = 0L;
        }
        if((v2 & 4) != 0) {
            v1 = l0.b - v;
        }
        return l0.o(outputStream0, v, v1);
    }

    @Override  // okio.m
    public m s0(String s, int v, int v1, Charset charset0) {
        return this.I2(s, v, v1, charset0);
    }

    @z3.i(name = "size")
    public final long size() {
        return this.b;
    }

    @Override  // okio.n
    public void skip(long v) throws EOFException {
        while(v > 0L) {
            j0 j00 = this.a;
            if(j00 == null) {
                throw new EOFException();
            }
            int v1 = (int)Math.min(v, j00.c - j00.b);
            this.a1(this.size() - ((long)v1));
            v -= (long)v1;
            int v2 = j00.b + v1;
            j00.b = v2;
            if(v2 == j00.c) {
                this.a = j00.b();
                k0.d(j00);
            }
        }
    }

    public static l t(l l0, l l1, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        return l0.p(l1, v);
    }

    @Override  // okio.n
    public long t0(@y4.l o o0, long v) {
        int v4;
        L.p(o0, "targetBytes");
        long v1 = 0L;
        if(v < 0L) {
            throw new IllegalArgumentException(("fromIndex < 0: " + v).toString());
        }
        j0 j00 = this.a;
        if(j00 != null) {
            if(this.size() - v < v) {
                for(v1 = this.size(); v1 > v; v1 -= (long)(j00.c - j00.b)) {
                    j00 = j00.g;
                    L.m(j00);
                }
                if(o0.h0() == 2) {
                    int v2 = o0.r(0);
                    int v3 = o0.r(1);
                    while(v1 < this.size()) {
                        byte[] arr_b = j00.a;
                        v4 = (int)(((long)j00.b) + v - v1);
                        int v5 = j00.c;
                        while(v4 < v5) {
                            int v6 = arr_b[v4];
                            if(v6 == v2 || v6 == v3) {
                                return ((long)(v4 - j00.b)) + v1;
                            }
                            ++v4;
                        }
                        v1 += (long)(j00.c - j00.b);
                        j00 = j00.f;
                        L.m(j00);
                        v = v1;
                    }
                    return -1L;
                }
                byte[] arr_b1 = o0.K();
                while(v1 < this.size()) {
                    byte[] arr_b2 = j00.a;
                    v4 = (int)(((long)j00.b) + v - v1);
                    int v7 = j00.c;
                    while(v4 < v7) {
                        int v8 = arr_b2[v4];
                        for(int v9 = 0; v9 < arr_b1.length; ++v9) {
                            if(v8 == arr_b1[v9]) {
                                return ((long)(v4 - j00.b)) + v1;
                            }
                        }
                        ++v4;
                    }
                    v1 += (long)(j00.c - j00.b);
                    j00 = j00.f;
                    L.m(j00);
                    v = v1;
                }
                return -1L;
            }
            long v10;
            while((v10 = ((long)(j00.c - j00.b)) + v1) <= v) {
                j00 = j00.f;
                L.m(j00);
                v1 = v10;
            }
            if(o0.h0() == 2) {
                int v11 = o0.r(0);
                int v12 = o0.r(1);
                while(v1 < this.size()) {
                    byte[] arr_b3 = j00.a;
                    v4 = (int)(((long)j00.b) + v - v1);
                    int v13 = j00.c;
                    while(v4 < v13) {
                        int v14 = arr_b3[v4];
                        if(v14 != v11 && v14 != v12) {
                            ++v4;
                            continue;
                        }
                        return ((long)(v4 - j00.b)) + v1;
                    }
                    v1 += (long)(j00.c - j00.b);
                    j00 = j00.f;
                    L.m(j00);
                    v = v1;
                }
                return -1L;
            }
            byte[] arr_b4 = o0.K();
            while(v1 < this.size()) {
                byte[] arr_b5 = j00.a;
                v4 = (int)(((long)j00.b) + v - v1);
                int v15 = j00.c;
                while(v4 < v15) {
                    int v16 = arr_b5[v4];
                    int v17 = 0;
                    while(v17 < arr_b4.length) {
                        if(v16 != arr_b4[v17]) {
                            ++v17;
                            continue;
                        }
                        return ((long)(v4 - j00.b)) + v1;
                    }
                    ++v4;
                }
                v1 += (long)(j00.c - j00.b);
                j00 = j00.f;
                L.m(j00);
                v = v1;
            }
        }
        return -1L;
    }

    @y4.l
    public l t1(@y4.l o o0) {
        L.p(o0, "byteString");
        o0.w0(this, 0, o0.h0());
        return this;
    }

    @y4.l
    public l t2(long v) {
        return this.p2(i.p(v));
    }

    @Override  // okio.o0, okio.m0
    @y4.l
    public q0 timeout() {
        return q0.NONE;
    }

    @Override
    @y4.l
    public String toString() {
        return this.h1().toString();
    }

    @y4.l
    public final l u0(@y4.l InputStream inputStream0) throws IOException {
        L.p(inputStream0, "input");
        this.E0(inputStream0, 0x7FFFFFFFFFFFFFFFL, true);
        return this;
    }

    @y4.l
    public l u1(@y4.l o o0, int v, int v1) {
        L.p(o0, "byteString");
        o0.w0(this, v, v1);
        return this;
    }

    public static l v(l l0, l l1, long v, long v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0L;
        }
        return l0.q(l1, v, v1);
    }

    @Override  // okio.m
    public m v0(long v) {
        return this.g2(v);
    }

    private final o w(String s) {
        MessageDigest messageDigest0 = MessageDigest.getInstance(s);
        j0 j00 = this.a;
        if(j00 != null) {
            messageDigest0.update(j00.a, j00.b, j00.c - j00.b);
            j0 j01 = j00.f;
            L.m(j01);
            while(j01 != j00) {
                messageDigest0.update(j01.a, j01.b, j01.c - j01.b);
                j01 = j01.f;
                L.m(j01);
            }
        }
        byte[] arr_b = messageDigest0.digest();
        L.o(arr_b, "digest(...)");
        return new o(arr_b);
    }

    @Override  // okio.n
    public long w0(byte b) {
        return this.m2(b, 0L, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.n
    @y4.l
    public String w1(@y4.l Charset charset0) {
        L.p(charset0, "charset");
        return this.L1(this.b, charset0);
    }

    @Override
    public int write(@y4.l ByteBuffer byteBuffer0) throws IOException {
        L.p(byteBuffer0, "source");
        int v = byteBuffer0.remaining();
        int v1 = v;
        while(v1 > 0) {
            j0 j00 = this.j1(1);
            int v2 = Math.min(v1, 0x2000 - j00.c);
            byteBuffer0.get(j00.a, j00.c, v2);
            v1 -= v2;
            j00.c += v2;
        }
        this.b += (long)v;
        return v;
    }

    @Override  // okio.m
    public m write(byte[] arr_b) {
        return this.Q1(arr_b);
    }

    @Override  // okio.m
    public m write(byte[] arr_b, int v, int v1) {
        return this.d2(arr_b, v, v1);
    }

    @Override  // okio.m0
    public void write(@y4.l l l0, long v) {
        j0 j03;
        L.p(l0, "source");
        if(l0 == this) {
            throw new IllegalArgumentException("source == this");
        }
        i.e(l0.size(), 0L, v);
        while(v > 0L) {
            j0 j00 = l0.a;
            L.m(j00);
            int v1 = j00.c;
            j0 j01 = l0.a;
            L.m(j01);
            if(v < ((long)(v1 - j01.b))) {
                j0 j02 = this.a;
                if(j02 == null) {
                    j03 = null;
                }
                else {
                    L.m(j02);
                    j03 = j02.g;
                }
                if(j03 != null && j03.e && ((long)j03.c) + v - ((long)(j03.d ? 0 : j03.b)) <= 0x2000L) {
                    j0 j04 = l0.a;
                    L.m(j04);
                    j04.g(j03, ((int)v));
                    l0.a1(l0.size() - v);
                    this.a1(this.size() + v);
                    return;
                }
                j0 j05 = l0.a;
                L.m(j05);
                l0.a = j05.e(((int)v));
            }
            j0 j06 = l0.a;
            L.m(j06);
            long v2 = (long)(j06.c - j06.b);
            l0.a = j06.b();
            j0 j07 = this.a;
            if(j07 == null) {
                this.a = j06;
                j06.g = j06;
                j06.f = j06;
            }
            else {
                L.m(j07);
                j0 j08 = j07.g;
                L.m(j08);
                j08.c(j06).a();
            }
            l0.a1(l0.size() - v2);
            this.a1(this.size() + v2);
            v -= v2;
        }
    }

    @Override  // okio.m
    public m writeByte(int v) {
        return this.e2(v);
    }

    @Override  // okio.m
    public m writeInt(int v) {
        return this.j2(v);
    }

    @Override  // okio.m
    public m writeLong(long v) {
        return this.p2(v);
    }

    @Override  // okio.m
    public m writeShort(int v) {
        return this.A2(v);
    }

    @y4.l
    public l x() [...] // Inlined contents

    @y4.l
    public final l x0(@y4.l InputStream inputStream0, long v) throws IOException {
        L.p(inputStream0, "input");
        if(v < 0L) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        this.E0(inputStream0, v, false);
        return this;
    }

    @Override  // okio.n
    public int z1() throws EOFException {
        int v4;
        int v3;
        int v2;
        if(this.size() == 0L) {
            throw new EOFException();
        }
        int v = this.Q(0L);
        int v1 = 1;
        if((v & 0x80) == 0) {
            v2 = v & 0x7F;
            v3 = 1;
            v4 = 0;
            goto label_22;
        }
        if((v & 0xE0) == 0xC0) {
            v2 = v & 0x1F;
            v3 = 2;
            v4 = 0x80;
            goto label_22;
        }
        boolean z = false;
        if((v & 0xF0) == 0xE0) {
            z = true;
            v2 = v & 15;
            v3 = 3;
            v4 = 0x800;
        }
        else if((v & 0xF8) == 0xF0) {
            z = true;
            v2 = v & 7;
            v3 = 4;
            v4 = 0x10000;
        }
        if(z) {
        label_22:
            if(this.size() < ((long)v3)) {
                throw new EOFException("size < " + v3 + ": " + this.size() + " (to read code point prefixed 0x" + i.u(((byte)v)) + ')');
            }
            while(v1 < v3) {
                int v5 = this.Q(((long)v1));
                if((v5 & 0xC0) == 0x80) {
                    v2 = v2 << 6 | v5 & 0x3F;
                    ++v1;
                    continue;
                }
                this.skip(((long)v1));
                return 0xFFFD;
            }
            this.skip(((long)v3));
            return v2 > 0x10FFFF || 0xD800 <= v2 && v2 < 0xE000 || v2 < v4 ? 0xFFFD : v2;
        }
        this.skip(1L);
        return 0xFFFD;
    }
}

