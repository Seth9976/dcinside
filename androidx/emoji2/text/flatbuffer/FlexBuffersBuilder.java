package androidx.emoji2.text.flatbuffer;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class FlexBuffersBuilder {
    static class Value {
        final int a;
        final int b;
        final double c;
        long d;
        int e;
        static final boolean f;

        static {
        }

        Value(int v, int v1, int v2, double f) {
            this.e = v;
            this.a = v1;
            this.b = v2;
            this.c = f;
            this.d = 0x8000000000000000L;
        }

        Value(int v, int v1, int v2, long v3) {
            this.e = v;
            this.a = v1;
            this.b = v2;
            this.d = v3;
            this.c = 4.900000E-324;
        }

        static int a(int v, int v1) {
            return -v & v1 - 1;
        }

        static Value f(int v, int v1, int v2, int v3) {
            return new Value(v, v2, v3, ((long)v1));
        }

        // 去混淆评级： 低(20)
        static Value g(int v, boolean z) {
            return z ? new Value(v, 26, 0, 1L) : new Value(v, 26, 0, 0L);
        }

        private int h(int v, int v1) {
            return Value.i(this.a, this.b, this.d, v, v1);
        }

        private static int i(int v, int v1, long v2, int v3, int v4) {
            if(FlexBuffers.j(v)) {
                return v1;
            }
            for(int v5 = 1; v5 <= 0x20; v5 *= 2) {
                int v6 = FlexBuffersBuilder.E(((int)(((long)((-v3 & v5 - 1) + v3 + v4 * v5)) - v2)));
                if(1L << v6 == ((long)v5)) {
                    return v6;
                }
            }
            return 3;
        }

        static Value j(int v, float f) {
            return new Value(v, 3, 2, ((double)f));
        }

        static Value k(int v, double f) {
            return new Value(v, 3, 3, f);
        }

        static Value l(int v, int v1) {
            return new Value(v, 1, 1, ((long)v1));
        }

        static Value m(int v, int v1) {
            return new Value(v, 1, 2, ((long)v1));
        }

        static Value n(int v, long v1) {
            return new Value(v, 1, 3, v1);
        }

        static Value o(int v, int v1) {
            return new Value(v, 1, 0, ((long)v1));
        }

        private static byte p(int v, int v1) {
            return (byte)(v | v1 << 2);
        }

        private static int q(int v, int v1) [...] // Inlined contents

        private byte r() {
            return this.s(0);
        }

        private byte s(int v) {
            return Value.p(this.t(v), this.a);
        }

        // 去混淆评级： 低(20)
        private int t(int v) {
            return FlexBuffers.j(this.a) ? Math.max(this.b, v) : this.b;
        }

        static Value u(int v, int v1) {
            return new Value(v, 2, 1, ((long)v1));
        }

        static Value v(int v, int v1) {
            return new Value(v, 2, 2, ((long)v1));
        }

        static Value w(int v, long v1) {
            return new Value(v, 2, 3, v1);
        }

        static Value x(int v, int v1) {
            return new Value(v, 2, 0, ((long)v1));
        }
    }

    private final ReadWriteBuf a;
    private final ArrayList b;
    private final HashMap c;
    private final HashMap d;
    private final int e;
    private boolean f;
    private Comparator g;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 7;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    static final boolean r;

    static {
    }

    public FlexBuffersBuilder() {
        this(0x100);
    }

    public FlexBuffersBuilder(int v) {
        this(new ArrayReadWriteBuf(v), 1);
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf0, int v) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
        this.g = new Comparator() {
            final FlexBuffersBuilder a;

            public int b(Value flexBuffersBuilder$Value0, Value flexBuffersBuilder$Value1) {
                int v3;
                int v2;
                int v = flexBuffersBuilder$Value0.e;
                int v1 = flexBuffersBuilder$Value1.e;
                do {
                    v2 = FlexBuffersBuilder.this.a.get(v);
                    v3 = FlexBuffersBuilder.this.a.get(v1);
                    if(v2 == 0) {
                        return -v3;
                    }
                    ++v;
                    ++v1;
                }
                while(v2 == v3);
                return v2 - v3;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((Value)object0), ((Value)object1));
            }
        };
        this.a = readWriteBuf0;
        this.e = v;
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer0) {
        this(byteBuffer0, 1);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer0, int v) {
        this(new ArrayReadWriteBuf(byteBuffer0.array()), v);
    }

    private void A(String s, long v) {
        Value flexBuffersBuilder$Value0 = Value.w(this.u(s), v);
        this.b.add(flexBuffersBuilder$Value0);
    }

    public void B(BigInteger bigInteger0) {
        this.A(null, bigInteger0.longValue());
    }

    public int C() {
        return this.b.size();
    }

    public int D() {
        return this.b.size();
    }

    static int E(long v) {
        if(v <= 0xFFL) {
            return 0;
        }
        if(v <= 0xFFFFL) {
            return 1;
        }
        return v > 0xFFFFFFFFL ? 3 : 2;
    }

    private void F(Value flexBuffersBuilder$Value0, int v) {
        switch(flexBuffersBuilder$Value0.a) {
            case 3: {
                this.H(flexBuffersBuilder$Value0.c, v);
                return;
            }
            case 0: 
            case 1: 
            case 2: 
            case 26: {
                this.I(flexBuffersBuilder$Value0.d, v);
                return;
            }
            default: {
                this.J(flexBuffersBuilder$Value0.d, v);
            }
        }
    }

    private Value G(int v, byte[] arr_b, int v1, boolean z) {
        int v2 = FlexBuffersBuilder.E(arr_b.length);
        int v3 = this.b(v2);
        this.I(((long)arr_b.length), v3);
        int v4 = this.a.l();
        this.a.i(arr_b, 0, arr_b.length);
        if(z) {
            this.a.h(0);
        }
        return Value.f(v, v4, v1, v2);
    }

    private void H(double f, int v) {
        switch(v) {
            case 4: {
                this.a.a(((float)f));
                return;
            }
            case 8: {
                this.a.d(f);
            }
        }
    }

    private void I(long v, int v1) {
        switch(v1) {
            case 1: {
                this.a.h(((byte)(((int)v))));
                return;
            }
            case 2: {
                this.a.e(((short)(((int)v))));
                return;
            }
            case 4: {
                this.a.b(((int)v));
                return;
            }
            case 8: {
                this.a.c(v);
            }
        }
    }

    private void J(long v, int v1) {
        this.I(((long)(((int)(((long)this.a.l()) - v)))), v1);
    }

    private Value K(int v, String s) {
        return this.G(v, s.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int v) {
        for(int v1 = Value.a(this.a.l(), 1 << v); v1 != 0; --v1) {
            this.a.h(0);
        }
        return 1 << v;
    }

    private Value c(int v, int v1) {
        int v2 = Math.max(0, FlexBuffersBuilder.E(v1));
        int v3 = v;
        while(v3 < this.b.size()) {
            long v4 = (long)((Value)this.b.get(v3)).e;
            ++v3;
            v2 = Math.max(v2, Value.i(4, 0, v4, this.a.l(), v3));
        }
        int v5 = this.b(v2);
        this.I(((long)v1), v5);
        int v6 = this.a.l();
        while(v < this.b.size()) {
            Value flexBuffersBuilder$Value0 = (Value)this.b.get(v);
            this.J(((long)((Value)this.b.get(v)).e), v5);
            ++v;
        }
        return new Value(-1, 14, v2, ((long)v6));
    }

    private Value d(int v, int v1, int v2, boolean z, boolean z1, Value flexBuffersBuilder$Value0) {
        int v4;
        int v3 = Math.max(0, FlexBuffersBuilder.E(v2));
        if(flexBuffersBuilder$Value0 == null) {
            v4 = 1;
        }
        else {
            v3 = Math.max(v3, flexBuffersBuilder$Value0.h(this.a.l(), 0));
            v4 = 3;
        }
        int v5 = 4;
        int v6 = v3;
        for(int v7 = v1; v7 < this.b.size(); ++v7) {
            v6 = Math.max(v6, ((Value)this.b.get(v7)).h(this.a.l(), v7 + v4));
            if(z && v7 == v1) {
                v5 = ((Value)this.b.get(v7)).a;
                if(!FlexBuffers.l(v5)) {
                    throw new FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int v8 = v1;
        int v9 = this.b(v6);
        if(flexBuffersBuilder$Value0 != null) {
            this.J(flexBuffersBuilder$Value0.d, v9);
            this.I(1L << flexBuffersBuilder$Value0.b, v9);
        }
        if(!z1) {
            this.I(((long)v2), v9);
        }
        int v10 = this.a.l();
        for(int v11 = v8; v11 < this.b.size(); ++v11) {
            this.F(((Value)this.b.get(v11)), v9);
        }
        if(!z) {
            while(v8 < this.b.size()) {
                int v12 = ((Value)this.b.get(v8)).s(v6);
                this.a.h(((byte)v12));
                ++v8;
            }
        }
        if(flexBuffersBuilder$Value0 != null) {
            return new Value(v, 9, v6, ((long)v10));
        }
        if(z) {
            if(!z1) {
                v2 = 0;
            }
            return new Value(v, FlexBuffers.q(v5, v2), v6, ((long)v10));
        }
        return new Value(v, 10, v6, ((long)v10));
    }

    public int e(String s, int v) {
        int v1 = this.u(s);
        Collections.sort(this.b.subList(v, this.b.size()), this.g);
        Value flexBuffersBuilder$Value0 = this.c(v, this.b.size() - v);
        Value flexBuffersBuilder$Value1 = this.d(v1, v, this.b.size() - v, false, false, flexBuffersBuilder$Value0);
        while(this.b.size() > v) {
            this.b.remove(this.b.size() - 1);
        }
        this.b.add(flexBuffersBuilder$Value1);
        return (int)flexBuffersBuilder$Value1.d;
    }

    public int f(String s, int v, boolean z, boolean z1) {
        Value flexBuffersBuilder$Value0 = this.d(this.u(s), v, this.b.size() - v, z, z1, null);
        while(this.b.size() > v) {
            this.b.remove(this.b.size() - 1);
        }
        this.b.add(flexBuffersBuilder$Value0);
        return (int)flexBuffersBuilder$Value0.d;
    }

    public ByteBuffer g() {
        int v = this.b(((Value)this.b.get(0)).h(this.a.l(), 0));
        this.F(((Value)this.b.get(0)), v);
        int v1 = ((Value)this.b.get(0)).r();
        this.a.h(((byte)v1));
        this.a.h(((byte)v));
        this.f = true;
        return ByteBuffer.wrap(this.a.g(), 0, this.a.l());
    }

    public ReadWriteBuf h() {
        return this.a;
    }

    public int i(String s, byte[] arr_b) {
        Value flexBuffersBuilder$Value0 = this.G(this.u(s), arr_b, 25, false);
        this.b.add(flexBuffersBuilder$Value0);
        return (int)flexBuffersBuilder$Value0.d;
    }

    public int j(byte[] arr_b) {
        return this.i(null, arr_b);
    }

    public void k(String s, boolean z) {
        Value flexBuffersBuilder$Value0 = Value.g(this.u(s), z);
        this.b.add(flexBuffersBuilder$Value0);
    }

    public void l(boolean z) {
        this.k(null, z);
    }

    public void m(double f) {
        this.o(null, f);
    }

    public void n(float f) {
        this.p(null, f);
    }

    public void o(String s, double f) {
        Value flexBuffersBuilder$Value0 = Value.k(this.u(s), f);
        this.b.add(flexBuffersBuilder$Value0);
    }

    public void p(String s, float f) {
        Value flexBuffersBuilder$Value0 = Value.j(this.u(s), f);
        this.b.add(flexBuffersBuilder$Value0);
    }

    public void q(int v) {
        this.s(null, v);
    }

    public void r(long v) {
        this.t(null, v);
    }

    public void s(String s, int v) {
        this.t(s, ((long)v));
    }

    public void t(String s, long v) {
        int v1 = this.u(s);
        if(0xFFFFFFFFFFFFFF80L <= v && v <= 0x7FL) {
            Value flexBuffersBuilder$Value0 = Value.o(v1, ((int)v));
            this.b.add(flexBuffersBuilder$Value0);
            return;
        }
        if(0xFFFFFFFFFFFF8000L <= v && v <= 0x7FFFL) {
            Value flexBuffersBuilder$Value1 = Value.l(v1, ((int)v));
            this.b.add(flexBuffersBuilder$Value1);
            return;
        }
        if(0xFFFFFFFF80000000L <= v && v <= 0x7FFFFFFFL) {
            Value flexBuffersBuilder$Value2 = Value.m(v1, ((int)v));
            this.b.add(flexBuffersBuilder$Value2);
            return;
        }
        Value flexBuffersBuilder$Value3 = Value.n(v1, v);
        this.b.add(flexBuffersBuilder$Value3);
    }

    private int u(String s) {
        if(s == null) {
            return -1;
        }
        int v = this.a.l();
        if((this.e & 1) != 0) {
            Integer integer0 = (Integer)this.c.get(s);
            if(integer0 == null) {
                byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
                this.a.i(arr_b, 0, arr_b.length);
                this.a.h(0);
                this.c.put(s, v);
                return v;
            }
            return (int)integer0;
        }
        byte[] arr_b1 = s.getBytes(StandardCharsets.UTF_8);
        this.a.i(arr_b1, 0, arr_b1.length);
        this.a.h(0);
        this.c.put(s, v);
        return v;
    }

    public int v(String s) {
        return this.w(null, s);
    }

    public int w(String s, String s1) {
        int v = this.u(s);
        if((this.e & 2) != 0) {
            Integer integer0 = (Integer)this.d.get(s1);
            if(integer0 == null) {
                Value flexBuffersBuilder$Value0 = this.K(v, s1);
                this.d.put(s1, ((int)flexBuffersBuilder$Value0.d));
                this.b.add(flexBuffersBuilder$Value0);
                return (int)flexBuffersBuilder$Value0.d;
            }
            Value flexBuffersBuilder$Value1 = Value.f(v, ((int)integer0), 5, FlexBuffersBuilder.E(s1.length()));
            this.b.add(flexBuffersBuilder$Value1);
            return (int)integer0;
        }
        Value flexBuffersBuilder$Value2 = this.K(v, s1);
        this.b.add(flexBuffersBuilder$Value2);
        return (int)flexBuffersBuilder$Value2.d;
    }

    public void x(int v) {
        this.z(null, ((long)v));
    }

    public void y(long v) {
        this.z(null, v);
    }

    private void z(String s, long v) {
        Value flexBuffersBuilder$Value0;
        int v1 = this.u(s);
        int v2 = FlexBuffersBuilder.E(v);
        if(v2 == 0) {
            flexBuffersBuilder$Value0 = Value.x(v1, ((int)v));
        }
        else {
            switch(v2) {
                case 1: {
                    flexBuffersBuilder$Value0 = Value.u(v1, ((int)v));
                    break;
                }
                case 2: {
                    flexBuffersBuilder$Value0 = Value.v(v1, ((int)v));
                    break;
                }
                default: {
                    flexBuffersBuilder$Value0 = Value.w(v1, v);
                }
            }
        }
        this.b.add(flexBuffersBuilder$Value0);
    }
}

