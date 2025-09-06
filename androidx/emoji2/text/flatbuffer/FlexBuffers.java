package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class FlexBuffers {
    public static class Blob extends Sized {
        static final Blob e;
        static final boolean f;

        static {
            Blob.e = new Blob(FlexBuffers.C, 1, 1);
        }

        Blob(ReadBuf readBuf0, int v, int v1) {
            super(readBuf0, v, v1);
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Object
        public StringBuilder a(StringBuilder stringBuilder0) {
            stringBuilder0.append('\"');
            stringBuilder0.append(this.a.n(this.b, this.b()));
            stringBuilder0.append('\"');
            return stringBuilder0;
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Sized
        public int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.a.g());
            byteBuffer0.position(this.b);
            byteBuffer0.limit(this.b + this.b());
            return byteBuffer0.asReadOnlyBuffer().slice();
        }

        public static Blob d() {
            return Blob.e;
        }

        public byte e(int v) {
            return this.a.get(this.b + v);
        }

        public byte[] f() {
            int v = this.b();
            byte[] arr_b = new byte[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_b[v1] = this.a.get(this.b + v1);
            }
            return arr_b;
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Object
        public String toString() {
            return this.a.n(this.b, this.b());
        }
    }

    public static class FlexBufferException extends RuntimeException {
        FlexBufferException(String s) {
            super(s);
        }
    }

    public static class Key extends Object {
        private static final Key d;

        static {
            Key.d = new Key(FlexBuffers.C, 0, 0);
        }

        Key(ReadBuf readBuf0, int v, int v1) {
            super(readBuf0, v, v1);
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Object
        public StringBuilder a(StringBuilder stringBuilder0) {
            stringBuilder0.append(this.toString());
            return stringBuilder0;
        }

        int c(byte[] arr_b) {
            int v3;
            int v2;
            int v = this.b;
            int v1 = 0;
            do {
                v2 = this.a.get(v);
                v3 = arr_b[v1];
                if(v2 == 0) {
                    return -v3;
                }
                ++v;
                ++v1;
                if(v1 == arr_b.length) {
                    return v2 - v3;
                }
            }
            while(v2 == v3);
            return v2 - v3;
        }

        public static Key d() {
            return Key.d;
        }

        @Override
        public boolean equals(java.lang.Object object0) {
            return object0 instanceof Key ? ((Key)object0).b == this.b && ((Key)object0).c == this.c : false;
        }

        @Override
        public int hashCode() {
            return this.b ^ this.c;
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Object
        public String toString() {
            int v;
            for(v = this.b; this.a.get(v) != 0; ++v) {
            }
            return this.a.n(this.b, v - this.b);
        }
    }

    public static class KeyVector {
        private final TypedVector a;

        KeyVector(TypedVector flexBuffers$TypedVector0) {
            this.a = flexBuffers$TypedVector0;
        }

        public Key a(int v) {
            if(v >= this.b()) {
                return Key.d;
            }
            ReadBuf readBuf0 = this.a.a;
            return new Key(readBuf0, FlexBuffers.i(readBuf0, this.a.b + v * this.a.c, this.a.c), 1);
        }

        public int b() {
            return this.a.b();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append('[');
            for(int v = 0; v < this.a.b(); ++v) {
                this.a.d(v).z(stringBuilder0);
                if(v != this.a.b() - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
    }

    public static class Map extends Vector {
        private static final Map f;

        static {
            Map.f = new Map(FlexBuffers.C, 1, 1);
        }

        Map(ReadBuf readBuf0, int v, int v1) {
            super(readBuf0, v, v1);
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
        public StringBuilder a(StringBuilder stringBuilder0) {
            stringBuilder0.append("{ ");
            KeyVector flexBuffers$KeyVector0 = this.j();
            int v = this.b();
            Vector flexBuffers$Vector0 = this.k();
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append('\"');
                stringBuilder0.append(flexBuffers$KeyVector0.a(v1).toString());
                stringBuilder0.append("\" : ");
                stringBuilder0.append(flexBuffers$Vector0.d(v1).toString());
                if(v1 != v - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append(" }");
            return stringBuilder0;
        }

        private int f(KeyVector flexBuffers$KeyVector0, byte[] arr_b) {
            int v = flexBuffers$KeyVector0.b() - 1;
            int v1 = 0;
            while(v1 <= v) {
                int v2 = v1 + v >>> 1;
                int v3 = flexBuffers$KeyVector0.a(v2).c(arr_b);
                if(v3 < 0) {
                    v1 = v2 + 1;
                    continue;
                }
                if(v3 > 0) {
                    v = v2 - 1;
                    continue;
                }
                return v2;
            }
            return -(v1 + 1);
        }

        public static Map g() {
            return Map.f;
        }

        public Reference h(String s) {
            return this.i(s.getBytes(StandardCharsets.UTF_8));
        }

        public Reference i(byte[] arr_b) {
            KeyVector flexBuffers$KeyVector0 = this.j();
            int v = flexBuffers$KeyVector0.b();
            int v1 = this.f(flexBuffers$KeyVector0, arr_b);
            return v1 < 0 || v1 >= v ? Reference.f : this.d(v1);
        }

        public KeyVector j() {
            int v = this.b - this.c * 3;
            return new KeyVector(new TypedVector(this.a, FlexBuffers.i(this.a, v, this.c), FlexBuffers.n(this.a, v + this.c, this.c), 4));
        }

        public Vector k() {
            return new Vector(this.a, this.b, this.c);
        }
    }

    static abstract class Object {
        ReadBuf a;
        int b;
        int c;

        Object(ReadBuf readBuf0, int v, int v1) {
            this.a = readBuf0;
            this.b = v;
            this.c = v1;
        }

        public abstract StringBuilder a(StringBuilder arg1);

        @Override
        public String toString() {
            return this.a(new StringBuilder(0x80)).toString();
        }
    }

    public static class Reference {
        private ReadBuf a;
        private int b;
        private int c;
        private int d;
        private int e;
        private static final Reference f;

        static {
            Reference.f = new Reference(FlexBuffers.C, 0, 1, 0);
        }

        Reference(ReadBuf readBuf0, int v, int v1, int v2) {
            this(readBuf0, v, v1, 1 << (v2 & 3), v2 >> 2);
        }

        Reference(ReadBuf readBuf0, int v, int v1, int v2, int v3) {
            this.a = readBuf0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }

        // 去混淆评级： 低(20)
        public Blob b() {
            return this.m() || this.v() ? new Blob(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d) : Blob.d();
        }

        // 去混淆评级： 低(20)
        public boolean c() {
            return this.n() ? this.a.get(this.b) != 0 : this.j() != 0L;
        }

        public double d() {
            switch(this.e) {
                case 1: {
                    return (double)FlexBuffers.n(this.a, this.b, this.c);
                }
                case 3: {
                    return FlexBuffers.m(this.a, this.b, this.c);
                }
                case 5: {
                    return Double.parseDouble(this.i());
                }
                case 6: {
                    return (double)FlexBuffers.n(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 7: {
                    return (double)FlexBuffers.p(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 8: {
                    return FlexBuffers.m(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 10: {
                    return (double)this.k().b();
                }
                case 2: 
                case 26: {
                    return (double)FlexBuffers.p(this.a, this.b, this.c);
                }
                default: {
                    return 0.0;
                }
            }
        }

        public int e() {
            switch(this.e) {
                case 1: {
                    return FlexBuffers.n(this.a, this.b, this.c);
                }
                case 2: {
                    return (int)FlexBuffers.p(this.a, this.b, this.c);
                }
                case 3: {
                    return (int)FlexBuffers.m(this.a, this.b, this.c);
                }
                case 5: {
                    return Integer.parseInt(this.i());
                }
                case 6: {
                    return FlexBuffers.n(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 7: {
                    return (int)FlexBuffers.p(this.a, FlexBuffers.i(this.a, this.b, this.c), this.c);
                }
                case 8: {
                    return (int)FlexBuffers.m(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 10: {
                    return this.k().b();
                }
                case 26: {
                    return FlexBuffers.n(this.a, this.b, this.c);
                }
                default: {
                    return 0;
                }
            }
        }

        // 去混淆评级： 低(20)
        public Key f() {
            return this.r() ? new Key(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d) : Key.d();
        }

        public long g() {
            switch(this.e) {
                case 1: {
                    return FlexBuffers.o(this.a, this.b, this.c);
                }
                case 2: {
                    return FlexBuffers.p(this.a, this.b, this.c);
                }
                case 3: {
                    return (long)FlexBuffers.m(this.a, this.b, this.c);
                }
                case 5: {
                    try {
                        return Long.parseLong(this.i());
                    }
                    catch(NumberFormatException unused_ex) {
                        return 0L;
                    }
                }
                case 6: {
                    return FlexBuffers.o(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 7: {
                    return FlexBuffers.p(this.a, FlexBuffers.i(this.a, this.b, this.c), this.c);
                }
                case 8: {
                    return (long)FlexBuffers.m(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 10: {
                    return (long)this.k().b();
                }
                case 26: {
                    return (long)FlexBuffers.n(this.a, this.b, this.c);
                }
                default: {
                    return 0L;
                }
            }
        }

        // 去混淆评级： 低(20)
        public Map h() {
            return this.s() ? new Map(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d) : Map.g();
        }

        public String i() {
            if(this.v()) {
                int v = FlexBuffers.i(this.a, this.b, this.c);
                int v1 = (int)FlexBuffers.p(this.a, v - this.d, this.d);
                return this.a.n(v, v1);
            }
            if(this.r()) {
                int v2 = FlexBuffers.i(this.a, this.b, this.d);
                int v3;
                for(v3 = v2; this.a.get(v3) != 0; ++v3) {
                }
                return this.a.n(v2, v3 - v2);
            }
            return "";
        }

        public long j() {
            switch(this.e) {
                case 1: {
                    return FlexBuffers.o(this.a, this.b, this.c);
                }
                case 2: {
                    return FlexBuffers.p(this.a, this.b, this.c);
                }
                case 3: {
                    return (long)FlexBuffers.m(this.a, this.b, this.c);
                }
                case 5: {
                    return Long.parseLong(this.i());
                }
                case 6: {
                    return FlexBuffers.o(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 7: {
                    return FlexBuffers.p(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
                }
                case 8: {
                    return (long)FlexBuffers.m(this.a, FlexBuffers.i(this.a, this.b, this.c), this.c);
                }
                case 10: {
                    return (long)this.k().b();
                }
                case 26: {
                    return (long)FlexBuffers.n(this.a, this.b, this.c);
                }
                default: {
                    return 0L;
                }
            }
        }

        public Vector k() {
            if(this.y()) {
                return new Vector(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d);
            }
            int v = this.e;
            if(v == 15) {
                return new TypedVector(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d, 4);
            }
            return FlexBuffers.k(v) ? new TypedVector(this.a, FlexBuffers.i(this.a, this.b, this.c), this.d, this.e - 10) : Vector.c();
        }

        public int l() {
            return this.e;
        }

        public boolean m() {
            return this.e == 25;
        }

        public boolean n() {
            return this.e == 26;
        }

        public boolean o() {
            return this.e == 3 || this.e == 8;
        }

        public boolean p() {
            return this.e == 1 || this.e == 6;
        }

        // 去混淆评级： 低(20)
        public boolean q() {
            return this.p() || this.x();
        }

        public boolean r() {
            return this.e == 4;
        }

        public boolean s() {
            return this.e == 9;
        }

        public boolean t() {
            return this.e == 0;
        }

        @Override
        public String toString() {
            return this.z(new StringBuilder(0x80)).toString();
        }

        // 去混淆评级： 低(20)
        public boolean u() {
            return this.q() || this.o();
        }

        public boolean v() {
            return this.e == 5;
        }

        public boolean w() {
            return FlexBuffers.k(this.e);
        }

        public boolean x() {
            return this.e == 2 || this.e == 7;
        }

        public boolean y() {
            return this.e == 9 || this.e == 10;
        }

        StringBuilder z(StringBuilder stringBuilder0) {
            int v = this.e;
            if(v != 36) {
                switch(v) {
                    case 0: {
                        stringBuilder0.append("null");
                        return stringBuilder0;
                    }
                    case 4: {
                        Key flexBuffers$Key0 = this.f();
                        stringBuilder0.append('\"');
                        StringBuilder stringBuilder1 = flexBuffers$Key0.a(stringBuilder0);
                        stringBuilder1.append('\"');
                        return stringBuilder1;
                    }
                    case 5: {
                        stringBuilder0.append('\"');
                        stringBuilder0.append(this.i());
                        stringBuilder0.append('\"');
                        return stringBuilder0;
                    }
                    case 1: 
                    case 6: {
                        stringBuilder0.append(this.g());
                        return stringBuilder0;
                    }
                    case 2: 
                    case 7: {
                        stringBuilder0.append(this.j());
                        return stringBuilder0;
                    }
                    case 3: 
                    case 8: {
                        stringBuilder0.append(this.d());
                        return stringBuilder0;
                    }
                    case 9: {
                        return this.h().a(stringBuilder0);
                    }
                    case 10: {
                        return this.k().a(stringBuilder0);
                    }
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: {
                        break;
                    }
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: {
                        throw new FlexBufferException("not_implemented:" + this.e);
                    }
                    case 25: {
                        return this.b().a(stringBuilder0);
                    }
                    case 26: {
                        stringBuilder0.append(this.c());
                        return stringBuilder0;
                    }
                    default: {
                        return stringBuilder0;
                    }
                }
            }
            stringBuilder0.append(this.k());
            return stringBuilder0;
        }
    }

    static abstract class Sized extends Object {
        protected final int d;

        Sized(ReadBuf readBuf0, int v, int v1) {
            super(readBuf0, v, v1);
            this.d = FlexBuffers.n(this.a, v - v1, v1);
        }

        public int b() {
            return this.d;
        }
    }

    public static class TypedVector extends Vector {
        private final int f;
        private static final TypedVector g;

        static {
            TypedVector.g = new TypedVector(FlexBuffers.C, 1, 1, 1);
        }

        TypedVector(ReadBuf readBuf0, int v, int v1, int v2) {
            super(readBuf0, v, v1);
            this.f = v2;
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Vector
        public Reference d(int v) {
            return v < this.b() ? new Reference(this.a, this.b + v * this.c, this.c, 1, this.f) : Reference.f;
        }

        public static TypedVector f() {
            return TypedVector.g;
        }

        public int g() {
            return this.f;
        }

        public boolean h() {
            return this == TypedVector.g;
        }
    }

    static class Unsigned {
        static int a(byte b) [...] // Inlined contents

        static long b(int v) [...] // Inlined contents

        static int c(short v) [...] // Inlined contents
    }

    public static class Vector extends Sized {
        private static final Vector e;

        static {
            Vector.e = new Vector(FlexBuffers.C, 1, 1);
        }

        Vector(ReadBuf readBuf0, int v, int v1) {
            super(readBuf0, v, v1);
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Object
        public StringBuilder a(StringBuilder stringBuilder0) {
            stringBuilder0.append("[ ");
            int v = this.b();
            for(int v1 = 0; v1 < v; ++v1) {
                this.d(v1).z(stringBuilder0);
                if(v1 != v - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append(" ]");
            return stringBuilder0;
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Sized
        public int b() {
            return super.b();
        }

        public static Vector c() {
            return Vector.e;
        }

        public Reference d(int v) {
            long v1 = (long)this.b();
            if(((long)v) >= v1) {
                return Reference.f;
            }
            int v2 = Unsigned.a(this.a.get(((int)(((long)this.b) + v1 * ((long)this.c) + ((long)v)))));
            return new Reference(this.a, this.b + v * this.c, this.c, v2);
        }

        public boolean e() {
            return this == Vector.e;
        }

        @Override  // androidx.emoji2.text.flatbuffer.FlexBuffers$Object
        public String toString() {
            return super.toString();
        }
    }

    public static final int A = 26;
    public static final int B = 36;
    private static final ReadBuf C = null;
    static final boolean D = false;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    public static final int o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 17;
    public static final int s = 18;
    public static final int t = 19;
    public static final int u = 20;
    public static final int v = 21;
    public static final int w = 22;
    public static final int x = 23;
    public static final int y = 24;
    public static final int z = 25;

    static {
        FlexBuffers.C = new ArrayReadWriteBuf(new byte[]{0}, 1);
    }

    public static Reference g(ReadBuf readBuf0) {
        int v = readBuf0.limit();
        int v1 = readBuf0.get(v - 1);
        return new Reference(readBuf0, v - 2 - v1, v1, Unsigned.a(readBuf0.get(v - 2)));
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public static Reference h(ByteBuffer byteBuffer0) {
        return byteBuffer0.hasArray() ? FlexBuffers.g(new ArrayReadWriteBuf(byteBuffer0.array(), byteBuffer0.limit())) : FlexBuffers.g(new ByteBufferReadWriteBuf(byteBuffer0));
    }

    private static int i(ReadBuf readBuf0, int v, int v1) {
        return (int)(((long)v) - FlexBuffers.p(readBuf0, v, v1));
    }

    static boolean j(int v) {
        return v <= 3 || v == 26;
    }

    // 去混淆评级： 低(20)
    static boolean k(int v) {
        return v >= 11 && v <= 15 || v == 36;
    }

    static boolean l(int v) {
        return v >= 1 && v <= 4 || v == 26;
    }

    private static double m(ReadBuf readBuf0, int v, int v1) {
        switch(v1) {
            case 4: {
                return (double)readBuf0.getFloat(v);
            }
            case 8: {
                return readBuf0.getDouble(v);
            }
            default: {
                return -1.0;
            }
        }
    }

    private static int n(ReadBuf readBuf0, int v, int v1) {
        return (int)FlexBuffers.o(readBuf0, v, v1);
    }

    private static long o(ReadBuf readBuf0, int v, int v1) {
        switch(v1) {
            case 1: {
                return (long)readBuf0.get(v);
            }
            case 2: {
                return (long)readBuf0.getShort(v);
            }
            case 4: {
                return (long)readBuf0.getInt(v);
            }
            case 8: {
                return readBuf0.getLong(v);
            }
            default: {
                return -1L;
            }
        }
    }

    private static long p(ReadBuf readBuf0, int v, int v1) {
        switch(v1) {
            case 1: {
                return (long)Unsigned.a(readBuf0.get(v));
            }
            case 2: {
                return (long)Unsigned.c(readBuf0.getShort(v));
            }
            case 4: {
                return Unsigned.b(readBuf0.getInt(v));
            }
            case 8: {
                return readBuf0.getLong(v);
            }
            default: {
                return -1L;
            }
        }
    }

    static int q(int v, int v1) [...] // Inlined contents

    static int r(int v) [...] // Inlined contents
}

