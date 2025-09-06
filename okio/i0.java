package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.c;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#1:191\n62#1:201\n62#1:208\n62#1:214\n62#1:216\n62#1:220\n62#1:225\n62#1:240\n62#1:244\n62#1:251\n62#1:264\n62#1:272\n62#1:273\n62#1:274\n62#1:280\n62#1:288\n62#1:301\n62#1:305\n62#1:306\n62#1:307\n62#1:308\n62#1:313\n62#1:325\n62#1:341\n62#1:351\n62#1:354\n62#1:357\n62#1:360\n62#1:363\n62#1:366\n62#1:372\n62#1:389\n62#1:409\n62#1:424\n62#1:441\n62#1:454\n62#1:475\n62#1:482\n38#2:186\n39#2,3:188\n42#2,6:192\n51#2:198\n52#2:200\n56#2,2:202\n60#2:204\n61#2,2:206\n63#2,3:209\n69#2,2:212\n74#2:215\n75#2:217\n79#2,2:218\n84#2:221\n86#2,2:223\n88#2,13:226\n107#2:239\n108#2:241\n112#2,2:242\n117#2,6:245\n123#2,9:252\n134#2,3:261\n137#2,5:265\n142#2:271\n146#2,5:275\n151#2,5:281\n158#2,2:286\n160#2,11:289\n174#2:300\n175#2:302\n179#2,2:303\n184#2,4:309\n188#2,6:314\n198#2:320\n199#2,3:322\n202#2,8:326\n210#2,3:335\n217#2,3:338\n220#2,7:342\n230#2,2:349\n235#2,2:352\n240#2,2:355\n245#2,2:358\n250#2,2:361\n255#2,2:364\n260#2,5:367\n265#2,11:373\n279#2,5:384\n284#2,14:390\n301#2,2:404\n303#2,2:407\n305#2,7:410\n314#2,2:417\n316#2,4:420\n320#2,11:425\n334#2,2:436\n337#2,2:439\n339#2,7:442\n350#2,2:449\n353#2,2:452\n355#2,7:455\n371#2:462\n373#2,11:464\n385#2:476\n389#2:477\n393#2,4:478\n397#2:483\n399#2:484\n401#2:485\n1#3:187\n1#3:199\n1#3:205\n1#3:222\n1#3:321\n1#3:406\n1#3:419\n1#3:438\n1#3:451\n1#3:463\n89#4:270\n89#4:334\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:191\n67#1:201\n69#1:208\n70#1:214\n71#1:216\n72#1:220\n73#1:225\n74#1:240\n75#1:244\n77#1:251\n79#1:264\n82#1:272\n83#1:273\n87#1:274\n90#1:280\n91#1:288\n92#1:301\n93#1:305\n96#1:306\n97#1:307\n102#1:308\n105#1:313\n107#1:325\n108#1:341\n109#1:351\n110#1:354\n111#1:357\n112#1:360\n113#1:363\n114#1:366\n115#1:372\n116#1:389\n117#1:409\n121#1:424\n124#1:441\n127#1:454\n141#1:475\n181#1:482\n66#1:186\n66#1:188,3\n66#1:192,6\n67#1:198\n67#1:200\n68#1:202,2\n69#1:204\n69#1:206,2\n69#1:209,3\n70#1:212,2\n71#1:215\n71#1:217\n72#1:218,2\n73#1:221\n73#1:223,2\n73#1:226,13\n74#1:239\n74#1:241\n75#1:242,2\n77#1:245,6\n77#1:252,9\n79#1:261,3\n79#1:265,5\n79#1:271\n90#1:275,5\n90#1:281,5\n91#1:286,2\n91#1:289,11\n92#1:300\n92#1:302\n93#1:303,2\n105#1:309,4\n105#1:314,6\n107#1:320\n107#1:322,3\n107#1:326,8\n107#1:335,3\n108#1:338,3\n108#1:342,7\n109#1:349,2\n110#1:352,2\n111#1:355,2\n112#1:358,2\n113#1:361,2\n114#1:364,2\n115#1:367,5\n115#1:373,11\n116#1:384,5\n116#1:390,14\n117#1:404,2\n117#1:407,2\n117#1:410,7\n121#1:417,2\n121#1:420,4\n121#1:425,11\n124#1:436,2\n124#1:439,2\n124#1:442,7\n127#1:449,2\n127#1:452,2\n127#1:455,7\n141#1:462\n141#1:464,11\n141#1:476\n143#1:477\n181#1:478,4\n181#1:483\n182#1:484\n183#1:485\n66#1:187\n67#1:199\n69#1:205\n73#1:222\n107#1:321\n117#1:406\n121#1:419\n124#1:438\n127#1:451\n141#1:463\n79#1:270\n107#1:334\n*E\n"})
public final class i0 implements n {
    @l
    @f
    public final o0 a;
    @l
    @f
    public final okio.l b;
    @f
    public boolean c;

    public i0(@l o0 o00) {
        L.p(o00, "source");
        super();
        this.a = o00;
        this.b = new okio.l();
    }

    @Override  // okio.n
    @l
    public o B1() {
        this.b.K2(this.a);
        return this.b.B1();
    }

    @Override  // okio.n
    @l
    public String C0(long v) {
        this.X2(v);
        return this.b.C0(v);
    }

    @Override  // okio.n
    @l
    public okio.l D() {
        return this.b;
    }

    @Override  // okio.n
    @l
    public okio.l E() {
        return this.b;
    }

    @Override  // okio.n
    @l
    public o F0(long v) {
        this.X2(v);
        return this.b.F0(v);
    }

    @Override  // okio.n
    public int H3() {
        this.X2(4L);
        return this.b.H3();
    }

    @Override  // okio.n
    @l
    public InputStream J() {
        @s0({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#2:186\n62#2:187\n62#2:188\n62#2:190\n62#2:191\n62#2:192\n62#2:193\n74#3:189\n86#3:194\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n149#1:186\n150#1:187\n153#1:188\n160#1:190\n161#1:191\n165#1:192\n170#1:193\n153#1:189\n170#1:194\n*E\n"})
        public static final class a extends InputStream {
            final i0 a;

            a(i0 i00) {
                this.a = i00;
                super();
            }

            @Override
            public int available() {
                i0 i00 = this.a;
                if(i00.c) {
                    throw new IOException("closed");
                }
                return (int)Math.min(i00.b.size(), 0x7FFFFFFFL);
            }

            @Override
            public void close() {
                this.a.close();
            }

            @Override
            public int read() {
                i0 i00 = this.a;
                if(i00.c) {
                    throw new IOException("closed");
                }
                return i00.b.size() != 0L || this.a.a.read(this.a.b, 0x2000L) != -1L ? this.a.b.readByte() & 0xFF : -1;
            }

            @Override
            public int read(@l byte[] arr_b, int v, int v1) {
                L.p(arr_b, "data");
                if(this.a.c) {
                    throw new IOException("closed");
                }
                i.e(arr_b.length, v, v1);
                return this.a.b.size() != 0L || this.a.a.read(this.a.b, 0x2000L) != -1L ? this.a.b.read(arr_b, v, v1) : -1;
            }

            @Override
            @l
            public String toString() {
                return this.a + ".inputStream()";
            }
        }

        return new a(this);
    }

    @Override  // okio.n
    public long K(@l o o0, long v) {
        L.p(o0, "bytes");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        long v1;
        while((v1 = this.b.K(o0, v)) == -1L) {
            long v2 = this.b.size();
            if(this.a.read(this.b, 0x2000L) == -1L) {
                return -1L;
            }
            v = Math.max(v, v2 - ((long)o0.h0()) + 1L);
        }
        return v1;
    }

    @Override  // okio.n
    @l
    public String K1() {
        this.b.K2(this.a);
        return "";
    }

    @Override  // okio.n
    @l
    public String L1(long v, @l Charset charset0) {
        L.p(charset0, "charset");
        this.X2(v);
        return this.b.L1(v, charset0);
    }

    @Override  // okio.n
    @l
    public String M2() {
        return this.q2(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.n
    public boolean N2(long v, @l o o0, int v1, int v2) {
        L.p(o0, "bytes");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        if(v >= 0L && v1 >= 0 && v2 >= 0 && o0.h0() - v1 >= v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                long v4 = ((long)v3) + v;
                if(!this.request(v4 + 1L) || this.b.Q(v4) != o0.r(v1 + v3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override  // okio.n
    @l
    public byte[] O2(long v) {
        this.X2(v);
        return this.b.O2(v);
    }

    @Override  // okio.n
    public long R1(@l m0 m00) {
        L.p(m00, "sink");
        long v = 0L;
        while(this.a.read(this.b, 0x2000L) != -1L) {
            long v1 = this.b.f();
            if(v1 > 0L) {
                v += v1;
                m00.write(this.b, v1);
            }
        }
        if(this.b.size() > 0L) {
            v += this.b.size();
            m00.write(this.b, this.b.size());
        }
        return v;
    }

    @Override  // okio.n
    public long S(@l o o0) {
        L.p(o0, "bytes");
        return this.K(o0, 0L);
    }

    @Override  // okio.n
    public long T1() {
        this.X2(1L);
        int v = 0;
        while(this.request(((long)(v + 1)))) {
            int v1 = this.b.Q(((long)v));
            if(v1 >= 0x30 && v1 <= 57 || v1 >= 97 && v1 <= 102 || v1 >= 65 && v1 <= 70) {
                ++v;
                continue;
            }
            if(v != 0) {
                break;
            }
            String s = Integer.toString(v1, c.a(c.a(16)));
            L.o(s, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + s);
        }
        return this.b.T1();
    }

    @Override  // okio.n
    public long U(byte b, long v) {
        return this.m2(b, v, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.n
    public long W(@l o o0) {
        L.p(o0, "targetBytes");
        return this.t0(o0, 0L);
    }

    @Override  // okio.n
    @m
    public String X() {
        long v = this.w0(10);
        if(v == -1L) {
            return this.b.size() == 0L ? null : this.C0(this.b.size());
        }
        return okio.internal.a.j0(this.b, v);
    }

    @Override  // okio.n
    public void X2(long v) {
        if(!this.request(v)) {
            throw new EOFException();
        }
    }

    @Override  // okio.n
    public int X3(@l c0 c00) {
        L.p(c00, "options");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
    alab1:
        while(true) {
            int v = okio.internal.a.l0(this.b, c00, true);
            switch(v) {
                case -2: {
                    if(this.a.read(this.b, 0x2000L) != -1L) {
                        break;
                    }
                    break alab1;
                }
                case -1: {
                    return -1;
                }
                default: {
                    int v1 = c00.d()[v].h0();
                    this.b.skip(((long)v1));
                    return v;
                }
            }
        }
        return -1;
    }

    @Override  // okio.n
    @l
    public byte[] Z0() {
        this.b.K2(this.a);
        return new byte[0];
    }

    public static void a() {
    }

    @Override  // okio.n
    public boolean a0(long v, @l o o0) {
        L.p(o0, "bytes");
        return this.N2(v, o0, 0, o0.h0());
    }

    @Override  // okio.o0
    public void close() {
        if(!this.c) {
            this.c = true;
            this.a.close();
            this.b.c();
        }
    }

    @Override
    public boolean isOpen() {
        return !this.c;
    }

    @Override  // okio.n
    public boolean j3() {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        return this.b.j3() && this.a.read(this.b, 0x2000L) == -1L;
    }

    @Override  // okio.n
    public void l2(@l okio.l l0, long v) {
        L.p(l0, "sink");
        try {
            this.X2(v);
        }
        catch(EOFException eOFException0) {
            l0.K2(this.b);
            throw eOFException0;
        }
        this.b.l2(l0, v);
    }

    @Override  // okio.n
    public long m2(byte b, long v, long v1) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        if(0L > v || v > v1) {
            throw new IllegalArgumentException(("fromIndex=" + v + " toIndex=" + v1).toString());
        }
        while(v < v1) {
            long v2 = this.b.m2(b, v, v1);
            if(v2 != -1L) {
                return v2;
            }
            long v3 = this.b.size();
            if(v3 >= v1 || this.a.read(this.b, 0x2000L) == -1L) {
                break;
            }
            v = Math.max(v, v3);
        }
        return -1L;
    }

    @Override  // okio.n
    public long o3() {
        this.X2(1L);
        for(long v = 0L; this.request(v + 1L); ++v) {
            int v1 = this.b.Q(v);
            if(v1 < 0x30 || v1 > 57) {
                int v2 = Long.compare(v, 0L);
                if(v2 != 0 || v1 != 45) {
                    if(v2 != 0) {
                        break;
                    }
                    String s = Integer.toString(v1, c.a(c.a(16)));
                    L.o(s, "toString(this, checkRadix(radix))");
                    throw new NumberFormatException("Expected a digit or \'-\' but was 0x" + s);
                }
            }
        }
        return this.b.o3();
    }

    @Override  // okio.n
    @l
    public n peek() {
        return Z.e(new f0(this));
    }

    @Override  // okio.n
    public short q0() {
        this.X2(2L);
        return this.b.q0();
    }

    @Override  // okio.n
    @l
    public String q2(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(("limit < 0: " + v).toString());
        }
        long v1 = v == 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : v + 1L;
        long v2 = this.m2(10, 0L, v1);
        if(v2 != -1L) {
            return okio.internal.a.j0(this.b, v2);
        }
        if(v1 < 0x7FFFFFFFFFFFFFFFL && this.request(v1) && this.b.Q(v1 - 1L) == 13 && this.request(v1 + 1L) && this.b.Q(v1) == 10) {
            return okio.internal.a.j0(this.b, v1);
        }
        okio.l l0 = new okio.l();
        this.b.q(l0, 0L, Math.min(0x20L, this.b.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b.size(), v) + " content=" + l0.B1().z() + '…');
    }

    @Override  // okio.n
    public long r0() {
        this.X2(8L);
        return this.b.r0();
    }

    @Override
    public int read(@l ByteBuffer byteBuffer0) {
        L.p(byteBuffer0, "sink");
        return this.b.size() != 0L || this.a.read(this.b, 0x2000L) != -1L ? this.b.read(byteBuffer0) : -1;
    }

    @Override  // okio.n
    public int read(@l byte[] arr_b) {
        L.p(arr_b, "sink");
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override  // okio.n
    public int read(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "sink");
        i.e(arr_b.length, v, v1);
        return this.b.size() != 0L || this.a.read(this.b, 0x2000L) != -1L ? this.b.read(arr_b, v, ((int)Math.min(v1, this.b.size()))) : -1;
    }

    @Override  // okio.o0
    public long read(@l okio.l l0, long v) {
        L.p(l0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        return this.b.size() == 0L && this.a.read(this.b, 0x2000L) == -1L ? -1L : this.b.read(l0, Math.min(v, this.b.size()));
    }

    @Override  // okio.n
    public byte readByte() {
        this.X2(1L);
        return this.b.readByte();
    }

    @Override  // okio.n
    public void readFully(@l byte[] arr_b) {
        L.p(arr_b, "sink");
        try {
            this.X2(((long)arr_b.length));
        }
        catch(EOFException eOFException0) {
            for(int v = 0; this.b.size() > 0L; v += v1) {
                int v1 = this.b.read(arr_b, v, ((int)this.b.size()));
                if(v1 == -1) {
                    throw new AssertionError();
                }
            }
            throw eOFException0;
        }
        this.b.readFully(arr_b);
    }

    @Override  // okio.n
    public int readInt() {
        this.X2(4L);
        return this.b.readInt();
    }

    @Override  // okio.n
    public long readLong() {
        this.X2(8L);
        return this.b.readLong();
    }

    @Override  // okio.n
    public short readShort() {
        this.X2(2L);
        return this.b.readShort();
    }

    @Override  // okio.n
    public boolean request(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        while(this.b.size() < v) {
            if(this.a.read(this.b, 0x2000L) == -1L) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // okio.n
    public void skip(long v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        while(v > 0L) {
            if(this.b.size() == 0L && this.a.read(this.b, 0x2000L) == -1L) {
                throw new EOFException();
            }
            long v1 = Math.min(v, this.b.size());
            this.b.skip(v1);
            v -= v1;
        }
    }

    @Override  // okio.n
    public long t0(@l o o0, long v) {
        L.p(o0, "targetBytes");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        long v1;
        while((v1 = this.b.t0(o0, v)) == -1L) {
            long v2 = this.b.size();
            if(this.a.read(this.b, 0x2000L) == -1L) {
                return -1L;
            }
            v = Math.max(v, v2);
        }
        return v1;
    }

    @Override  // okio.o0
    @l
    public q0 timeout() {
        return this.a.timeout();
    }

    @Override
    @l
    public String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override  // okio.n
    public long w0(byte b) {
        return this.m2(b, 0L, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // okio.n
    @l
    public String w1(@l Charset charset0) {
        L.p(charset0, "charset");
        this.b.K2(this.a);
        return this.b.w1(charset0);
    }

    @Override  // okio.n
    public int z1() {
        this.X2(1L);
        int v = this.b.Q(0L);
        if((v & 0xE0) == 0xC0) {
            this.X2(2L);
            return this.b.z1();
        }
        if((v & 0xF0) == 0xE0) {
            this.X2(3L);
            return this.b.z1();
        }
        if((v & 0xF8) == 0xF0) {
            this.X2(4L);
        }
        return this.b.z1();
    }
}

