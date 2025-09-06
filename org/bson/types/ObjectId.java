package org.bson.types;

import R3.a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObjectId implements Serializable, Comparable {
    private final int a;
    private final int b;
    private final int c;
    private final short d;
    private static final long e = 0x32EEBE4C9F646A80L;
    private static final int f = 12;
    private static final int g = 0xFFFFFF;
    private static final int h;
    private static final short i;
    private static final AtomicInteger j;
    private static final char[] k;

    static {
        ObjectId.j = new AtomicInteger(new SecureRandom().nextInt());
        ObjectId.k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            SecureRandom secureRandom0 = new SecureRandom();
            ObjectId.h = secureRandom0.nextInt(0x1000000);
            ObjectId.i = (short)secureRandom0.nextInt(0x8000);
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    public ObjectId(int v, int v1) {
        this(v, v1, true);
    }

    ObjectId(int v, int v1, int v2) {
        this(ObjectId.y(v, v1, v2));
    }

    @Deprecated
    public ObjectId(int v, int v1, short v2, int v3) {
        this(v, v1, v2, v3, true);
    }

    private ObjectId(int v, int v1, short v2, int v3, boolean z) {
        if((v1 & 0xFF000000) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if(z && (v3 & 0xFF000000) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.a = v;
        this.b = 0xFFFFFF & v3;
        this.c = v1;
        this.d = v2;
    }

    private ObjectId(int v, int v1, boolean z) {
        this(v, ObjectId.h, ObjectId.i, v1, z);
    }

    public ObjectId(String s) {
        this(ObjectId.B(s));
    }

    public ObjectId(ByteBuffer byteBuffer0) {
        a.e("buffer", byteBuffer0);
        a.d("buffer.remaining() >=12", byteBuffer0.remaining() >= 12);
        this.a = ObjectId.z(byteBuffer0.get(), byteBuffer0.get(), byteBuffer0.get(), byteBuffer0.get());
        this.c = ObjectId.z(((byte)0), byteBuffer0.get(), byteBuffer0.get(), byteBuffer0.get());
        this.d = ObjectId.A(byteBuffer0.get(), byteBuffer0.get());
        this.b = ObjectId.z(((byte)0), byteBuffer0.get(), byteBuffer0.get(), byteBuffer0.get());
    }

    public ObjectId(Date date0) {
        this(ObjectId.c(date0), ObjectId.j.getAndIncrement() & 0xFFFFFF, false);
    }

    public ObjectId(Date date0, int v) {
        this(ObjectId.c(date0), v, true);
    }

    @Deprecated
    public ObjectId(Date date0, int v, short v1, int v2) {
        this(ObjectId.c(date0), v, v1, v2);
    }

    public ObjectId(byte[] arr_b) {
        this(ByteBuffer.wrap(((byte[])a.c("bytes has length of 12", arr_b, ((byte[])a.e("bytes", arr_b)).length == 12))));
    }

    private static short A(byte b, byte b1) {
        return (short)((b & 0xFF) << 8 | b1 & 0xFF);
    }

    private static byte[] B(String s) {
        if(!ObjectId.w(s)) {
            throw new IllegalArgumentException("invalid hexadecimal representation of an ObjectId: [" + s + "]");
        }
        byte[] arr_b = new byte[12];
        for(int v = 0; v < 12; ++v) {
            arr_b[v] = (byte)Integer.parseInt(s.substring(v * 2, v * 2 + 2), 16);
        }
        return arr_b;
    }

    public void C(ByteBuffer byteBuffer0) {
        a.e("buffer", byteBuffer0);
        a.d("buffer.remaining() >=12", byteBuffer0.remaining() >= 12);
        byteBuffer0.put(((byte)(this.a >> 24)));
        byteBuffer0.put(((byte)(this.a >> 16)));
        byteBuffer0.put(((byte)(this.a >> 8)));
        byteBuffer0.put(((byte)this.a));
        byteBuffer0.put(((byte)(this.c >> 16)));
        byteBuffer0.put(((byte)(this.c >> 8)));
        byteBuffer0.put(((byte)this.c));
        byteBuffer0.put(((byte)(this.d >> 8)));
        byteBuffer0.put(((byte)this.d));
        byteBuffer0.put(((byte)(this.b >> 16)));
        byteBuffer0.put(((byte)(this.b >> 8)));
        byteBuffer0.put(((byte)this.b));
    }

    private static byte D(short v) [...] // Inlined contents

    private static byte E(short v) [...] // Inlined contents

    public byte[] F() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    public String G() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @Deprecated
    public String H() {
        return "68bb119ecc11fe019353a65e";
    }

    public int a(ObjectId objectId0) {
        objectId0.getClass();
        for(int v = 0; v < 12; ++v) {
            int v1 = new byte[]{104, -69, 17, -100, 91, -57, (byte)0xC1, 81, (byte)0xC1, 21, (byte)0x83, 0x79}[v];
            int v2 = new byte[]{104, -69, 17, -99, 91, -57, (byte)0xC1, 81, (byte)0xC1, 21, (byte)0x83, 0x7A}[v];
            if(v1 != v2) {
                return (v1 & 0xFF) >= (v2 & 0xFF) ? 1 : -1;
            }
        }
        return 0;
    }

    @Deprecated
    public static ObjectId b(int v, int v1, int v2) {
        return new ObjectId(v, v1, v2);
    }

    private static int c(Date date0) {
        return (int)(date0.getTime() / 1000L);
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((ObjectId)object0));
    }

    public static ObjectId d() {
        return new ObjectId();
    }

    @Deprecated
    public int e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(ObjectId.class != class0 || this.b != ((ObjectId)object0).b) {
                return false;
            }
            if(this.a != ((ObjectId)object0).a) {
                return false;
            }
            return this.c == ((ObjectId)object0).c ? this.d == ((ObjectId)object0).d : false;
        }
        return false;
    }

    @Deprecated
    public static int f() {
        return ObjectId.j.get() & 0xFFFFFF;
    }

    public Date g() {
        return new Date((((long)this.a) & 0xFFFFFFFFL) * 1000L);
    }

    @Deprecated
    public static int h() {
        return ObjectId.h;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Deprecated
    public static int i() {
        return ObjectId.i;
    }

    @Deprecated
    public int j() {
        return this.c;
    }

    @Deprecated
    public short k() {
        return this.d;
    }

    @Deprecated
    public long l() {
        return (((long)this.a) & 0xFFFFFFFFL) * 1000L;
    }

    @Deprecated
    public int m() {
        return this.a;
    }

    public int n() {
        return this.a;
    }

    private static byte p(int v) [...] // Inlined contents

    private static byte r(int v) [...] // Inlined contents

    private static byte s(int v) [...] // Inlined contents

    // 去混淆评级： 低(20)
    @Override
    public String toString() [...] // 潜在的解密器

    private static byte u(int v) [...] // Inlined contents

    public static boolean w(String s) {
        if(s == null) {
            throw new IllegalArgumentException();
        }
        if(s.length() != 24) {
            return false;
        }
        int v = 0;
        while(v < 24) {
            int v1 = s.charAt(v);
            if(v1 >= 0x30 && v1 <= 57 || v1 >= 97 && v1 <= 102 || v1 >= 65 && v1 <= 70) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    private static byte[] y(int v, int v1, int v2) {
        return new byte[]{((byte)(v >> 24)), ((byte)(v >> 16)), ((byte)(v >> 8)), ((byte)v), ((byte)(v1 >> 24)), ((byte)(v1 >> 16)), ((byte)(v1 >> 8)), ((byte)v1), ((byte)(v2 >> 24)), ((byte)(v2 >> 16)), ((byte)(v2 >> 8)), ((byte)v2)};
    }

    private static int z(byte b, byte b1, byte b2, byte b3) {
        return b << 24 | (b1 & 0xFF) << 16 | (b2 & 0xFF) << 8 | b3 & 0xFF;
    }
}

