package okio.internal;

import java.io.EOFException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.h0;
import okio.m;
import okio.o0;
import okio.o;
import okio.q0;
import y4.l;
import z3.i;

@s0({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
@i(name = "-RealBufferedSink")
public final class e {
    public static final void a(@l h0 h00) {
        L.p(h00, "<this>");
        if(h00.c) {
            return;
        }
        try {
            if(h00.b.size() > 0L) {
                h00.a.write(h00.b, h00.b.size());
            }
            throwable0 = null;
        }
        catch(Throwable throwable0) {
        }
        try {
            h00.a.close();
        }
        catch(Throwable throwable1) {
            if(throwable0 == null) {
                throwable0 = throwable1;
            }
        }
        h00.c = true;
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    @l
    public static final m b(@l h0 h00) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        long v = h00.b.size();
        if(v > 0L) {
            h00.a.write(h00.b, v);
        }
        return h00;
    }

    @l
    public static final m c(@l h0 h00) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        long v = h00.b.f();
        if(v > 0L) {
            h00.a.write(h00.b, v);
        }
        return h00;
    }

    public static final void d(@l h0 h00) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        if(h00.b.size() > 0L) {
            h00.a.write(h00.b, h00.b.size());
        }
        h00.a.flush();
    }

    @l
    public static final q0 e(@l h0 h00) {
        L.p(h00, "<this>");
        return h00.a.timeout();
    }

    @l
    public static final String f(@l h0 h00) {
        L.p(h00, "<this>");
        return "buffer(" + h00.a + ')';
    }

    @l
    public static final m g(@l h0 h00, @l o o0) {
        L.p(h00, "<this>");
        L.p(o0, "byteString");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.t1(o0);
        return h00.n2();
    }

    @l
    public static final m h(@l h0 h00, @l o o0, int v, int v1) {
        L.p(h00, "<this>");
        L.p(o0, "byteString");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.u1(o0, v, v1);
        return h00.n2();
    }

    @l
    public static final m i(@l h0 h00, @l o0 o00, long v) {
        L.p(h00, "<this>");
        L.p(o00, "source");
        while(v > 0L) {
            long v1 = o00.read(h00.b, v);
            if(v1 == -1L) {
                throw new EOFException();
            }
            v -= v1;
            h00.n2();
        }
        return h00;
    }

    @l
    public static final m j(@l h0 h00, @l byte[] arr_b) {
        L.p(h00, "<this>");
        L.p(arr_b, "source");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.Q1(arr_b);
        return h00.n2();
    }

    @l
    public static final m k(@l h0 h00, @l byte[] arr_b, int v, int v1) {
        L.p(h00, "<this>");
        L.p(arr_b, "source");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.d2(arr_b, v, v1);
        return h00.n2();
    }

    public static final void l(@l h0 h00, @l okio.l l0, long v) {
        L.p(h00, "<this>");
        L.p(l0, "source");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.write(l0, v);
        h00.n2();
    }

    public static final long m(@l h0 h00, @l o0 o00) {
        L.p(h00, "<this>");
        L.p(o00, "source");
        long v = 0L;
        long v1;
        while((v1 = o00.read(h00.b, 0x2000L)) != -1L) {
            v += v1;
            h00.n2();
        }
        return v;
    }

    @l
    public static final m n(@l h0 h00, int v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.e2(v);
        return h00.n2();
    }

    @l
    public static final m o(@l h0 h00, long v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.g2(v);
        return h00.n2();
    }

    @l
    public static final m p(@l h0 h00, long v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.i2(v);
        return h00.n2();
    }

    @l
    public static final m q(@l h0 h00, int v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.j2(v);
        return h00.n2();
    }

    @l
    public static final m r(@l h0 h00, int v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.o2(v);
        return h00.n2();
    }

    @l
    public static final m s(@l h0 h00, long v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.p2(v);
        return h00.n2();
    }

    @l
    public static final m t(@l h0 h00, long v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.t2(v);
        return h00.n2();
    }

    @l
    public static final m u(@l h0 h00, int v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.A2(v);
        return h00.n2();
    }

    @l
    public static final m v(@l h0 h00, int v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.C2(v);
        return h00.n2();
    }

    @l
    public static final m w(@l h0 h00, @l String s) {
        L.p(h00, "<this>");
        L.p(s, "string");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.b3(s);
        return h00.n2();
    }

    @l
    public static final m x(@l h0 h00, @l String s, int v, int v1) {
        L.p(h00, "<this>");
        L.p(s, "string");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.e3(s, v, v1);
        return h00.n2();
    }

    @l
    public static final m y(@l h0 h00, int v) {
        L.p(h00, "<this>");
        if(h00.c) {
            throw new IllegalStateException("closed");
        }
        h00.b.n3(v);
        return h00.n2();
    }
}

