package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

public final class t0 {
    public interface a extends k {
        void addBoolean(boolean arg1);

        boolean getBoolean(int arg1);

        a mutableCopyWithCapacity(int arg1);

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$k
        k mutableCopyWithCapacity(int arg1);

        boolean setBoolean(int arg1, boolean arg2);
    }

    public interface b extends k {
        void addDouble(double arg1);

        double getDouble(int arg1);

        b mutableCopyWithCapacity(int arg1);

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$k
        k mutableCopyWithCapacity(int arg1);

        double setDouble(int arg1, double arg2);
    }

    public interface c {
        int getNumber();
    }

    public interface d {
        c findValueByNumber(int arg1);
    }

    public interface e {
        boolean isInRange(int arg1);
    }

    public interface f extends k {
        void addFloat(float arg1);

        float getFloat(int arg1);

        f mutableCopyWithCapacity(int arg1);

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$k
        k mutableCopyWithCapacity(int arg1);

        float setFloat(int arg1, float arg2);
    }

    public interface g extends k {
        void addInt(int arg1);

        int getInt(int arg1);

        g mutableCopyWithCapacity(int arg1);

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$k
        k mutableCopyWithCapacity(int arg1);

        int setInt(int arg1, int arg2);
    }

    public static class h extends AbstractList {
        public interface com.google.crypto.tink.shaded.protobuf.t0.h.a {
            Object convert(Object arg1);
        }

        private final List a;
        private final com.google.crypto.tink.shaded.protobuf.t0.h.a b;

        public h(List list0, com.google.crypto.tink.shaded.protobuf.t0.h.a t0$h$a0) {
            this.a = list0;
            this.b = t0$h$a0;
        }

        @Override
        public Object get(int v) {
            Object object0 = this.a.get(v);
            return this.b.convert(object0);
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    public interface i extends k {
        void addLong(long arg1);

        long getLong(int arg1);

        i mutableCopyWithCapacity(int arg1);

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$k
        k mutableCopyWithCapacity(int arg1);

        long setLong(int arg1, long arg2);
    }

    public static class j extends AbstractMap {
        public interface com.google.crypto.tink.shaded.protobuf.t0.j.b {
            Object doBackward(Object arg1);

            Object doForward(Object arg1);
        }

        class com.google.crypto.tink.shaded.protobuf.t0.j.c implements Map.Entry {
            private final Map.Entry a;
            final j b;

            public com.google.crypto.tink.shaded.protobuf.t0.j.c(Map.Entry map$Entry0) {
                this.a = map$Entry0;
            }

            @Override
            public boolean equals(Object object0) {
                if(object0 == this) {
                    return true;
                }
                return object0 instanceof Map.Entry ? this.getKey().equals(((Map.Entry)object0).getKey()) && this.getValue().equals(this.getValue()) : false;
            }

            @Override
            public Object getKey() {
                return this.a.getKey();
            }

            @Override
            public Object getValue() {
                return j.this.b.doForward(this.a.getValue());
            }

            @Override
            public int hashCode() {
                return this.a.hashCode();
            }

            @Override
            public Object setValue(Object object0) {
                Object object1 = j.this.b.doBackward(object0);
                Object object2 = this.a.setValue(object1);
                return object2 == null ? null : j.this.b.doForward(object2);
            }
        }

        class com.google.crypto.tink.shaded.protobuf.t0.j.d implements Iterator {
            private final Iterator a;
            final j b;

            public com.google.crypto.tink.shaded.protobuf.t0.j.d(Iterator iterator0) {
                this.a = iterator0;
            }

            public Map.Entry a() {
                Object object0 = this.a.next();
                return new com.google.crypto.tink.shaded.protobuf.t0.j.c(j.this, ((Map.Entry)object0));
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                this.a.remove();
            }
        }

        class com.google.crypto.tink.shaded.protobuf.t0.j.e extends AbstractSet {
            private final Set a;
            final j b;

            public com.google.crypto.tink.shaded.protobuf.t0.j.e(Set set0) {
                this.a = set0;
            }

            @Override
            public Iterator iterator() {
                Iterator iterator0 = this.a.iterator();
                return new com.google.crypto.tink.shaded.protobuf.t0.j.d(j.this, iterator0);
            }

            @Override
            public int size() {
                return this.a.size();
            }
        }

        private final Map a;
        private final com.google.crypto.tink.shaded.protobuf.t0.j.b b;

        public j(Map map0, com.google.crypto.tink.shaded.protobuf.t0.j.b t0$j$b0) {
            this.a = map0;
            this.b = t0$j$b0;
        }

        public static com.google.crypto.tink.shaded.protobuf.t0.j.b b(d t0$d0, c t0$c0) {
            class com.google.crypto.tink.shaded.protobuf.t0.j.a implements com.google.crypto.tink.shaded.protobuf.t0.j.b {
                final d a;
                final c b;

                com.google.crypto.tink.shaded.protobuf.t0.j.a(d t0$d0, c t0$c0) {
                    this.b = t0$c0;
                    super();
                }

                public Integer a(c t0$c0) {
                    return t0$c0.getNumber();
                }

                public c b(Integer integer0) {
                    c t0$c0 = this.a.findValueByNumber(((int)integer0));
                    return t0$c0 == null ? this.b : t0$c0;
                }

                @Override  // com.google.crypto.tink.shaded.protobuf.t0$j$b
                public Object doBackward(Object object0) {
                    return this.a(((c)object0));
                }

                @Override  // com.google.crypto.tink.shaded.protobuf.t0$j$b
                public Object doForward(Object object0) {
                    return this.b(((Integer)object0));
                }
            }

            return new com.google.crypto.tink.shaded.protobuf.t0.j.a(t0$d0, t0$c0);
        }

        @Override
        public Set entrySet() {
            return new com.google.crypto.tink.shaded.protobuf.t0.j.e(this, this.a.entrySet());
        }

        @Override
        public Object get(Object object0) {
            Object object1 = this.a.get(object0);
            return object1 == null ? null : this.b.doForward(object1);
        }

        @Override
        public Object put(Object object0, Object object1) {
            Object object2 = this.b.doBackward(object1);
            Object object3 = this.a.put(object0, object2);
            return object3 == null ? null : this.b.doForward(object3);
        }
    }

    public interface k extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        k mutableCopyWithCapacity(int arg1);
    }

    static final Charset a = null;
    static final Charset b = null;
    static final Charset c = null;
    private static final int d = 0x1000;
    public static final byte[] e;
    public static final ByteBuffer f;
    public static final z g;

    static {
        t0.a = Charset.forName("US-ASCII");
        t0.b = Charset.forName("UTF-8");
        t0.c = Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        t0.e = arr_b;
        t0.f = ByteBuffer.wrap(arr_b);
        t0.g = z.q(arr_b);
    }

    public static byte[] a(String s) {
        return s.getBytes(t0.c);
    }

    public static ByteBuffer b(String s) {
        return ByteBuffer.wrap(t0.a(s));
    }

    public static u c(String s) {
        return u.p(s.getBytes(t0.c));
    }

    static Object d(Object object0) {
        object0.getClass();
        return object0;
    }

    static Object e(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public static ByteBuffer f(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.clear();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer1.capacity());
        byteBuffer2.put(byteBuffer1);
        byteBuffer2.clear();
        return byteBuffer2;
    }

    public static boolean g(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return false;
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(!Arrays.equals(((byte[])list0.get(v)), ((byte[])list1.get(v)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        return byteBuffer0.capacity() == byteBuffer1.capacity() ? byteBuffer0.duplicate().clear().equals(byteBuffer1.duplicate().clear()) : false;
    }

    public static boolean i(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return false;
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(!t0.h(((ByteBuffer)list0.get(v)), ((ByteBuffer)list1.get(v)))) {
                return false;
            }
        }
        return true;
    }

    public static R0 j(Class class0) {
        try {
            Method method0 = class0.getMethod("getDefaultInstance", null);
            return (R0)method0.invoke(method0, null);
        }
        catch(Exception exception0) {
            throw new RuntimeException("Failed to get default instance for " + class0, exception0);
        }
    }

    // 去混淆评级： 低(20)
    public static int k(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int l(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + t0.m(((byte[])object0));
        }
        return v;
    }

    public static int m(byte[] arr_b) {
        return t0.n(arr_b, 0, arr_b.length);
    }

    static int n(byte[] arr_b, int v, int v1) {
        int v2 = t0.w(v1, arr_b, v, v1);
        return v2 == 0 ? 1 : v2;
    }

    public static int o(ByteBuffer byteBuffer0) {
        int v = 0x1000;
        if(byteBuffer0.hasArray()) {
            int v1 = t0.w(byteBuffer0.capacity(), byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
            return v1 == 0 ? 1 : v1;
        }
        if(byteBuffer0.capacity() <= 0x1000) {
            v = byteBuffer0.capacity();
        }
        byte[] arr_b = new byte[v];
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.clear();
        int v2;
        for(v2 = byteBuffer0.capacity(); byteBuffer1.remaining() > 0; v2 = t0.w(v2, arr_b, 0, v3)) {
            int v3 = byteBuffer1.remaining() > v ? v : byteBuffer1.remaining();
            byteBuffer1.get(arr_b, 0, v3);
        }
        return v2 == 0 ? 1 : v2;
    }

    public static int p(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + t0.o(((ByteBuffer)object0));
        }
        return v;
    }

    public static int q(c t0$c0) {
        return t0$c0.getNumber();
    }

    public static int r(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + t0.q(((c)object0));
        }
        return v;
    }

    public static int s(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static boolean t(u u0) {
        return u0.I();
    }

    public static boolean u(byte[] arr_b) {
        return Z1.t(arr_b);
    }

    static Object v(Object object0, Object object1) {
        return ((R0)object0).toBuilder().ca(((R0)object1)).buildPartial();
    }

    static int w(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    public static String x(String s) {
        return new String(s.getBytes(t0.c), t0.b);
    }

    public static byte[] y(String s) {
        return s.getBytes(t0.b);
    }

    public static String z(byte[] arr_b) {
        return new String(arr_b, t0.b);
    }
}

