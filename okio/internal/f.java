package okio.internal;

import java.io.EOFException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.c;
import okio.Z;
import okio.c0;
import okio.f0;
import okio.i0;
import okio.m0;
import okio.n;
import okio.o;
import okio.q0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
@i(name = "-RealBufferedSource")
public final class f {
    @l
    public static final String A(@l i0 i00, long v) {
        L.p(i00, "<this>");
        i00.X2(v);
        return i00.b.C0(v);
    }

    public static final int B(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(1L);
        int v = i00.b.Q(0L);
        if((v & 0xE0) == 0xC0) {
            i00.X2(2L);
            return i00.b.z1();
        }
        if((v & 0xF0) == 0xE0) {
            i00.X2(3L);
            return i00.b.z1();
        }
        if((v & 0xF8) == 0xF0) {
            i00.X2(4L);
        }
        return i00.b.z1();
    }

    @m
    public static final String C(@l i0 i00) {
        L.p(i00, "<this>");
        long v = i00.w0(10);
        if(v == -1L) {
            return i00.b.size() == 0L ? null : i00.C0(i00.b.size());
        }
        return a.j0(i00.b, v);
    }

    @l
    public static final String D(@l i0 i00, long v) {
        L.p(i00, "<this>");
        if(v < 0L) {
            throw new IllegalArgumentException(("limit < 0: " + v).toString());
        }
        long v1 = v == 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : v + 1L;
        long v2 = i00.m2(10, 0L, v1);
        if(v2 != -1L) {
            return a.j0(i00.b, v2);
        }
        if(v1 < 0x7FFFFFFFFFFFFFFFL && i00.request(v1) && i00.b.Q(v1 - 1L) == 13 && i00.request(v1 + 1L) && i00.b.Q(v1) == 10) {
            return a.j0(i00.b, v1);
        }
        okio.l l0 = new okio.l();
        i00.b.q(l0, 0L, Math.min(0x20L, i00.b.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(i00.b.size(), v) + " content=" + l0.B1().z() + '…');
    }

    public static final boolean E(@l i0 i00, long v) {
        L.p(i00, "<this>");
        if(v < 0L) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(i00.c) {
            throw new IllegalStateException("closed");
        }
        while(i00.b.size() < v) {
            if(i00.a.read(i00.b, 0x2000L) == -1L) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static final void F(@l i0 i00, long v) {
        L.p(i00, "<this>");
        if(!i00.request(v)) {
            throw new EOFException();
        }
    }

    public static final int G(@l i0 i00, @l c0 c00) {
        L.p(i00, "<this>");
        L.p(c00, "options");
        if(i00.c) {
            throw new IllegalStateException("closed");
        }
    alab1:
        while(true) {
            int v = a.l0(i00.b, c00, true);
            switch(v) {
                case -2: {
                    if(i00.a.read(i00.b, 0x2000L) != -1L) {
                        break;
                    }
                    break alab1;
                }
                case -1: {
                    return -1;
                }
                default: {
                    int v1 = c00.d()[v].h0();
                    i00.b.skip(((long)v1));
                    return v;
                }
            }
        }
        return -1;
    }

    public static final void H(@l i0 i00, long v) {
        L.p(i00, "<this>");
        if(i00.c) {
            throw new IllegalStateException("closed");
        }
        while(v > 0L) {
            if(i00.b.size() == 0L && i00.a.read(i00.b, 0x2000L) == -1L) {
                throw new EOFException();
            }
            long v1 = Math.min(v, i00.b.size());
            i00.b.skip(v1);
            v -= v1;
        }
    }

    @l
    public static final q0 I(@l i0 i00) {
        L.p(i00, "<this>");
        return i00.a.timeout();
    }

    @l
    public static final String J(@l i0 i00) {
        L.p(i00, "<this>");
        return "buffer(" + i00.a + ')';
    }

    public static final void a(@l i0 i00) {
        L.p(i00, "<this>");
        if(i00.c) {
            return;
        }
        i00.c = true;
        i00.a.close();
        i00.b.c();
    }

    public static final boolean b(@l i0 i00) {
        L.p(i00, "<this>");
        if(i00.c) {
            throw new IllegalStateException("closed");
        }
        return i00.b.j3() && i00.a.read(i00.b, 0x2000L) == -1L;
    }

    public static final long c(@l i0 i00, byte b, long v, long v1) {
        L.p(i00, "<this>");
        if(i00.c) {
            throw new IllegalStateException("closed");
        }
        if(0L > v || v > v1) {
            throw new IllegalArgumentException(("fromIndex=" + v + " toIndex=" + v1).toString());
        }
        while(v < v1) {
            long v2 = i00.b.m2(b, v, v1);
            if(v2 != -1L) {
                return v2;
            }
            long v3 = i00.b.size();
            if(v3 >= v1 || i00.a.read(i00.b, 0x2000L) == -1L) {
                break;
            }
            v = Math.max(v, v3);
        }
        return -1L;
    }

    public static final long d(@l i0 i00, @l o o0, long v) {
        L.p(i00, "<this>");
        L.p(o0, "bytes");
        if(!i00.c) {
            while(true) {
                long v1 = i00.b.K(o0, v);
                if(v1 != -1L) {
                    return v1;
                }
                long v2 = i00.b.size();
                if(i00.a.read(i00.b, 0x2000L) == -1L) {
                    return -1L;
                }
                v = Math.max(v, v2 - ((long)o0.h0()) + 1L);
            }
        }
        throw new IllegalStateException("closed");
    }

    public static final long e(@l i0 i00, @l o o0, long v) {
        L.p(i00, "<this>");
        L.p(o0, "targetBytes");
        if(!i00.c) {
            while(true) {
                long v1 = i00.b.t0(o0, v);
                if(v1 != -1L) {
                    return v1;
                }
                long v2 = i00.b.size();
                if(i00.a.read(i00.b, 0x2000L) == -1L) {
                    return -1L;
                }
                v = Math.max(v, v2);
            }
        }
        throw new IllegalStateException("closed");
    }

    @l
    public static final n f(@l i0 i00) {
        L.p(i00, "<this>");
        return Z.e(new f0(i00));
    }

    public static final boolean g(@l i0 i00, long v, @l o o0, int v1, int v2) {
        L.p(i00, "<this>");
        L.p(o0, "bytes");
        if(i00.c) {
            throw new IllegalStateException("closed");
        }
        if(v >= 0L && v1 >= 0 && v2 >= 0 && o0.h0() - v1 >= v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                long v4 = ((long)v3) + v;
                if(!i00.request(v4 + 1L)) {
                    return false;
                }
                if(i00.b.Q(v4) != o0.r(v1 + v3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final int h(@l i0 i00, @l byte[] arr_b, int v, int v1) {
        L.p(i00, "<this>");
        L.p(arr_b, "sink");
        okio.i.e(arr_b.length, v, v1);
        return i00.b.size() != 0L || i00.a.read(i00.b, 0x2000L) != -1L ? i00.b.read(arr_b, v, ((int)Math.min(v1, i00.b.size()))) : -1;
    }

    public static final long i(@l i0 i00, @l okio.l l0, long v) {
        L.p(i00, "<this>");
        L.p(l0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
        }
        if(i00.c) {
            throw new IllegalStateException("closed");
        }
        return i00.b.size() != 0L || i00.a.read(i00.b, 0x2000L) != -1L ? i00.b.read(l0, Math.min(v, i00.b.size())) : -1L;
    }

    public static final long j(@l i0 i00, @l m0 m00) {
        L.p(i00, "<this>");
        L.p(m00, "sink");
        long v = 0L;
        while(i00.a.read(i00.b, 0x2000L) != -1L) {
            long v1 = i00.b.f();
            if(v1 > 0L) {
                v += v1;
                m00.write(i00.b, v1);
            }
        }
        if(i00.b.size() > 0L) {
            v += i00.b.size();
            m00.write(i00.b, i00.b.size());
        }
        return v;
    }

    public static final byte k(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(1L);
        return i00.b.readByte();
    }

    @l
    public static final byte[] l(@l i0 i00) {
        L.p(i00, "<this>");
        i00.b.K2(i00.a);
        return new byte[0];
    }

    @l
    public static final byte[] m(@l i0 i00, long v) {
        L.p(i00, "<this>");
        i00.X2(v);
        return i00.b.O2(v);
    }

    @l
    public static final o n(@l i0 i00) {
        L.p(i00, "<this>");
        i00.b.K2(i00.a);
        return i00.b.B1();
    }

    @l
    public static final o o(@l i0 i00, long v) {
        L.p(i00, "<this>");
        i00.X2(v);
        return i00.b.F0(v);
    }

    public static final long p(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(1L);
        for(long v = 0L; i00.request(v + 1L); ++v) {
            int v1 = i00.b.Q(v);
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
        return i00.b.o3();
    }

    public static final void q(@l i0 i00, @l okio.l l0, long v) {
        L.p(i00, "<this>");
        L.p(l0, "sink");
        try {
            i00.X2(v);
        }
        catch(EOFException eOFException0) {
            l0.K2(i00.b);
            throw eOFException0;
        }
        i00.b.l2(l0, v);
    }

    public static final void r(@l i0 i00, @l byte[] arr_b) {
        L.p(i00, "<this>");
        L.p(arr_b, "sink");
        try {
            i00.X2(((long)arr_b.length));
        }
        catch(EOFException eOFException0) {
            for(int v = 0; i00.b.size() > 0L; v += v1) {
                int v1 = i00.b.read(arr_b, v, ((int)i00.b.size()));
                if(v1 == -1) {
                    throw new AssertionError();
                }
            }
            throw eOFException0;
        }
        i00.b.readFully(arr_b);
    }

    public static final long s(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(1L);
        int v = 0;
        while(i00.request(((long)(v + 1)))) {
            int v1 = i00.b.Q(((long)v));
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
        return i00.b.T1();
    }

    public static final int t(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(4L);
        return i00.b.readInt();
    }

    public static final int u(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(4L);
        return i00.b.H3();
    }

    public static final long v(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(8L);
        return i00.b.readLong();
    }

    public static final long w(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(8L);
        return i00.b.r0();
    }

    public static final short x(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(2L);
        return i00.b.readShort();
    }

    public static final short y(@l i0 i00) {
        L.p(i00, "<this>");
        i00.X2(2L);
        return i00.b.q0();
    }

    @l
    public static final String z(@l i0 i00) {
        L.p(i00, "<this>");
        i00.b.K2(i00.a);
        return "";
    }
}

