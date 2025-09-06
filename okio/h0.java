package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.f;

@s0({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
public final class h0 implements m {
    @l
    @f
    public final m0 a;
    @l
    @f
    public final okio.l b;
    @f
    public boolean c;

    public h0(@l m0 m00) {
        L.p(m00, "sink");
        super();
        this.a = m00;
        this.b = new okio.l();
    }

    @Override  // okio.m
    @l
    public m A1(long v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.i2(v);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m A3(@l String s, @l Charset charset0) {
        L.p(s, "string");
        L.p(charset0, "charset");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.L2(s, charset0);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public okio.l D() {
        return this.b;
    }

    @Override  // okio.m
    @l
    public m D2(@l String s) {
        L.p(s, "string");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.b3(s);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public okio.l E() {
        return this.b;
    }

    @Override  // okio.m
    @l
    public m F1(@l o0 o00, long v) {
        L.p(o00, "source");
        while(v > 0L) {
            long v1 = o00.read(this.b, v);
            if(v1 == -1L) {
                throw new EOFException();
            }
            v -= v1;
            this.n2();
        }
        return this;
    }

    @Override  // okio.m
    public long K2(@l o0 o00) {
        L.p(o00, "source");
        long v = 0L;
        long v1;
        while((v1 = o00.read(this.b, 0x2000L)) != -1L) {
            v += v1;
            this.n2();
        }
        return v;
    }

    @Override  // okio.m
    @l
    public m M1(@l o o0) {
        L.p(o0, "byteString");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.t1(o0);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m P(long v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.t2(v);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public OutputStream U3() {
        @s0({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
        public static final class a extends OutputStream {
            final h0 a;

            a(h0 h00) {
                this.a = h00;
                super();
            }

            @Override
            public void close() {
                this.a.close();
            }

            @Override
            public void flush() {
                h0 h00 = this.a;
                if(!h00.c) {
                    h00.flush();
                }
            }

            @Override
            @l
            public String toString() {
                return this.a + ".outputStream()";
            }

            @Override
            public void write(int v) {
                h0 h00 = this.a;
                if(h00.c) {
                    throw new IOException("closed");
                }
                h00.b.e2(((int)(((byte)v))));
                this.a.n2();
            }

            @Override
            public void write(@l byte[] arr_b, int v, int v1) {
                L.p(arr_b, "data");
                h0 h00 = this.a;
                if(h00.c) {
                    throw new IOException("closed");
                }
                h00.b.d2(arr_b, v, v1);
                this.a.n2();
            }
        }

        return new a(this);
    }

    @Override  // okio.m
    @l
    public m X0(@l o o0, int v, int v1) {
        L.p(o0, "byteString");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.u1(o0, v, v1);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m X1() {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        long v = this.b.size();
        if(v > 0L) {
            this.a.write(this.b, v);
        }
        return this;
    }

    public static void a() {
    }

    @Override  // okio.m
    @l
    public m b0(@l String s, int v, int v1) {
        L.p(s, "string");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.e3(s, v, v1);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m b2(int v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.n3(v);
        return this.n2();
    }

    @Override  // okio.m0
    public void close() {
        if(!this.c) {
            try {
                if(this.b.size() > 0L) {
                    this.a.write(this.b, this.b.size());
                }
                throwable0 = null;
            }
            catch(Throwable throwable0) {
            }
            try {
                this.a.close();
            }
            catch(Throwable throwable1) {
                if(throwable0 == null) {
                    throwable0 = throwable1;
                }
            }
            this.c = true;
            if(throwable0 != null) {
                throw throwable0;
            }
        }
    }

    @Override  // okio.m
    @l
    public m f1(int v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.o2(v);
        return this.n2();
    }

    @Override  // okio.m
    public void flush() {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        if(this.b.size() > 0L) {
            this.a.write(this.b, this.b.size());
        }
        this.a.flush();
    }

    @Override
    public boolean isOpen() {
        return !this.c;
    }

    @Override  // okio.m
    @l
    public m n2() {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        long v = this.b.f();
        if(v > 0L) {
            this.a.write(this.b, v);
        }
        return this;
    }

    @Override  // okio.m
    @l
    public m q1(int v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.C2(v);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m s0(@l String s, int v, int v1, @l Charset charset0) {
        L.p(s, "string");
        L.p(charset0, "charset");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.I2(s, v, v1, charset0);
        return this.n2();
    }

    @Override  // okio.m0
    @l
    public q0 timeout() {
        return this.a.timeout();
    }

    @Override
    @l
    public String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override  // okio.m
    @l
    public m v0(long v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.g2(v);
        return this.n2();
    }

    @Override
    public int write(@l ByteBuffer byteBuffer0) {
        L.p(byteBuffer0, "source");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        int v = this.b.write(byteBuffer0);
        this.n2();
        return v;
    }

    @Override  // okio.m
    @l
    public m write(@l byte[] arr_b) {
        L.p(arr_b, "source");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.Q1(arr_b);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m write(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "source");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.d2(arr_b, v, v1);
        return this.n2();
    }

    @Override  // okio.m0
    public void write(@l okio.l l0, long v) {
        L.p(l0, "source");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.write(l0, v);
        this.n2();
    }

    @Override  // okio.m
    @l
    public m writeByte(int v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.e2(v);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m writeInt(int v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.j2(v);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m writeLong(long v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.p2(v);
        return this.n2();
    }

    @Override  // okio.m
    @l
    public m writeShort(int v) {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.A2(v);
        return this.n2();
    }
}

