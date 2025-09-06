package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.internal.g;
import y4.l;
import y4.m;

@s0({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class l0 extends o {
    @l
    private final transient byte[][] g;
    @l
    private final transient int[] h;

    public l0(@l byte[][] arr2_b, @l int[] arr_v) {
        L.p(arr2_b, "segments");
        L.p(arr_v, "directory");
        super(o.f.s());
        this.g = arr2_b;
        this.h = arr_v;
    }

    @Override  // okio.o
    @l
    public o A(@l String s, @l o o0) {
        L.p(s, "algorithm");
        L.p(o0, "key");
        try {
            Mac mac0 = Mac.getInstance(s);
            mac0.init(new SecretKeySpec(o0.s0(), s));
            byte[][] arr2_b = this.z0();
            int v = 0;
            for(int v1 = 0; v < arr2_b.length; v1 = v3) {
                int v2 = this.y0()[arr2_b.length + v];
                int v3 = this.y0()[v];
                mac0.update(this.z0()[v], v2, v3 - v1);
                ++v;
            }
            byte[] arr_b = mac0.doFinal();
            L.o(arr_b, "doFinal(...)");
            return new o(arr_b);
        }
        catch(InvalidKeyException invalidKeyException0) {
        }
        throw new IllegalArgumentException(invalidKeyException0);
    }

    private final o A0() {
        return new o(this.s0());
    }

    private final Object B0() {
        o o0 = this.A0();
        L.n(o0, "null cannot be cast to non-null type java.lang.Object");
        return o0;
    }

    @Override  // okio.o
    public int H(@l byte[] arr_b, int v) {
        L.p(arr_b, "other");
        return this.A0().H(arr_b, v);
    }

    @Override  // okio.o
    @l
    public byte[] K() {
        return this.s0();
    }

    @Override  // okio.o
    public byte L(int v) {
        i.e(this.y0()[this.z0().length - 1], v, 1L);
        int v1 = g.n(this, v);
        return v1 == 0 ? this.z0()[0][v + this.y0()[this.z0().length]] : this.z0()[v1][v - this.y0()[v1 - 1] + this.y0()[this.z0().length + v1]];
    }

    @Override  // okio.o
    public int P(@l byte[] arr_b, int v) {
        L.p(arr_b, "other");
        return this.A0().P(arr_b, v);
    }

    @Override  // okio.o
    public boolean W(int v, @l o o0, int v1, int v2) {
        L.p(o0, "other");
        if(v >= 0 && v <= this.h0() - v2) {
            int v3 = v2 + v;
            for(int v4 = g.n(this, v); v < v3; ++v4) {
                int v5 = v4 == 0 ? 0 : this.y0()[v4 - 1];
                int v6 = Math.min(v3, this.y0()[v4]) - v;
                if(!o0.X(v1, this.z0()[v4], this.y0()[this.z0().length + v4] + (v - v5), v6)) {
                    return false;
                }
                v1 += v6;
                v += v6;
            }
            return true;
        }
        return false;
    }

    @Override  // okio.o
    public boolean X(int v, @l byte[] arr_b, int v1, int v2) {
        L.p(arr_b, "other");
        if(v >= 0 && v <= this.h0() - v2 && v1 >= 0 && v1 <= arr_b.length - v2) {
            int v3 = v2 + v;
            for(int v4 = g.n(this, v); v < v3; ++v4) {
                int v5 = v4 == 0 ? 0 : this.y0()[v4 - 1];
                int v6 = Math.min(v3, this.y0()[v4]) - v;
                if(!i.d(this.z0()[v4], this.y0()[this.z0().length + v4] + (v - v5), arr_b, v1, v6)) {
                    return false;
                }
                v1 += v6;
                v += v6;
            }
            return true;
        }
        return false;
    }

    @Override  // okio.o
    @l
    public ByteBuffer c() {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.s0()).asReadOnlyBuffer();
        L.o(byteBuffer0, "asReadOnlyBuffer(...)");
        return byteBuffer0;
    }

    @Override  // okio.o
    @l
    public String d() {
        return this.A0().d();
    }

    @Override  // okio.o
    @l
    public String e() {
        return this.A0().e();
    }

    // 去混淆评级： 低(20)
    @Override  // okio.o
    public boolean equals(@m Object object0) {
        return object0 == this || object0 instanceof o && ((o)object0).h0() == this.h0() && this.W(0, ((o)object0), 0, this.h0());
    }

    @Override  // okio.o
    public void g(int v, @l byte[] arr_b, int v1, int v2) {
        L.p(arr_b, "target");
        i.e(this.h0(), v, v2);
        i.e(arr_b.length, v1, v2);
        int v3 = v2 + v;
        for(int v4 = g.n(this, v); v < v3; ++v4) {
            int v5 = v4 == 0 ? 0 : this.y0()[v4 - 1];
            int v6 = Math.min(v3, this.y0()[v4]) - v;
            int v7 = this.y0()[this.z0().length + v4] + (v - v5);
            kotlin.collections.l.v0(this.z0()[v4], arr_b, v1, v7, v7 + v6);
            v1 += v6;
            v += v6;
        }
    }

    @Override  // okio.o
    public int hashCode() {
        int v = this.u();
        if(v == 0) {
            byte[][] arr2_b = this.z0();
            int v1 = 0;
            int v2 = 1;
            for(int v3 = 0; v1 < arr2_b.length; v3 = v5) {
                int v4 = this.y0()[arr2_b.length + v1];
                int v5 = this.y0()[v1];
                byte[] arr_b = this.z0()[v1];
                int v6 = v5 - v3 + v4;
                while(v4 < v6) {
                    v2 = v2 * 0x1F + arr_b[v4];
                    ++v4;
                }
                ++v1;
            }
            this.b0(v2);
            return v2;
        }
        return v;
    }

    @Override  // okio.o
    @l
    public o k(@l String s) {
        L.p(s, "algorithm");
        MessageDigest messageDigest0 = MessageDigest.getInstance(s);
        byte[][] arr2_b = this.z0();
        int v = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v3) {
            int v2 = this.y0()[arr2_b.length + v];
            int v3 = this.y0()[v];
            messageDigest0.update(this.z0()[v], v2, v3 - v1);
            ++v;
        }
        byte[] arr_b = messageDigest0.digest();
        L.m(arr_b);
        return new o(arr_b);
    }

    @Override  // okio.o
    @l
    public String k0(@l Charset charset0) {
        L.p(charset0, "charset");
        return this.A0().k0(charset0);
    }

    @Override  // okio.o
    @l
    public o o0(int v, int v1) {
        int v2 = i.l(this, v1);
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex=" + v + " < 0").toString());
        }
        if(v2 > this.h0()) {
            throw new IllegalArgumentException(("endIndex=" + v2 + " > length(" + this.h0() + ')').toString());
        }
        int v3 = v2 - v;
        if(v3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + v2 + " < beginIndex=" + v).toString());
        }
        if(v == 0 && v2 == this.h0()) {
            return this;
        }
        if(v == v2) {
            return o.f;
        }
        int v4 = g.n(this, v);
        int v5 = g.n(this, v2 - 1);
        byte[][] arr2_b = (byte[][])kotlin.collections.l.l1(this.z0(), v4, v5 + 1);
        int[] arr_v = new int[arr2_b.length * 2];
        int v6 = 0;
        if(v4 <= v5) {
            int v7 = v4;
            for(int v8 = 0; true; ++v8) {
                arr_v[v8] = Math.min(this.y0()[v7] - v, v3);
                arr_v[v8 + arr2_b.length] = this.y0()[this.z0().length + v7];
                if(v7 == v5) {
                    break;
                }
                ++v7;
            }
        }
        if(v4 != 0) {
            v6 = this.y0()[v4 - 1];
        }
        arr_v[arr2_b.length] += v - v6;
        return new l0(arr2_b, arr_v);
    }

    @Override  // okio.o
    @l
    public o q0() {
        return this.A0().q0();
    }

    @Override  // okio.o
    @l
    public o r0() {
        return this.A0().r0();
    }

    @Override  // okio.o
    @l
    public byte[] s0() {
        byte[] arr_b = new byte[this.h0()];
        byte[][] arr2_b = this.z0();
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v4) {
            int v3 = this.y0()[arr2_b.length + v];
            int v4 = this.y0()[v];
            int v5 = v4 - v1;
            kotlin.collections.l.v0(this.z0()[v], arr_b, v2, v3, v3 + v5);
            v2 += v5;
            ++v;
        }
        return arr_b;
    }

    @Override  // okio.o
    @l
    public String toString() {
        return this.A0().toString();
    }

    @Override  // okio.o
    public void v0(@l OutputStream outputStream0) throws IOException {
        L.p(outputStream0, "out");
        byte[][] arr2_b = this.z0();
        int v = 0;
        for(int v1 = 0; v < arr2_b.length; v1 = v3) {
            int v2 = this.y0()[arr2_b.length + v];
            int v3 = this.y0()[v];
            outputStream0.write(this.z0()[v], v2, v3 - v1);
            ++v;
        }
    }

    @Override  // okio.o
    public int w() {
        return this.y0()[this.z0().length - 1];
    }

    @Override  // okio.o
    public void w0(@l okio.l l0, int v, int v1) {
        L.p(l0, "buffer");
        int v2 = v + v1;
        for(int v3 = g.n(this, v); v < v2; ++v3) {
            int v4 = v3 == 0 ? 0 : this.y0()[v3 - 1];
            int v5 = Math.min(v2, this.y0()[v3]) - v;
            int v6 = this.y0()[this.z0().length + v3] + (v - v4);
            j0 j00 = new j0(this.z0()[v3], v6, v6 + v5, true, false);
            j0 j01 = l0.a;
            if(j01 == null) {
                j00.g = j00;
                j00.f = j00;
                l0.a = j00;
            }
            else {
                L.m(j01);
                j0 j02 = j01.g;
                L.m(j02);
                j02.c(j00);
            }
            v += v5;
        }
        l0.a1(l0.size() + ((long)v1));
    }

    @l
    public final int[] y0() {
        return this.h;
    }

    @Override  // okio.o
    @l
    public String z() {
        return this.A0().z();
    }

    @l
    public final byte[][] z0() {
        return this.g;
    }
}

