package androidx.datastore.preferences.protobuf;

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

public final class Internal {
    public interface BooleanList extends ProtobufList {
        void addBoolean(boolean arg1);

        boolean getBoolean(int arg1);

        BooleanList mutableCopyWithCapacity(int arg1);

        boolean setBoolean(int arg1, boolean arg2);
    }

    public interface DoubleList extends ProtobufList {
        void addDouble(double arg1);

        double getDouble(int arg1);

        DoubleList mutableCopyWithCapacity(int arg1);

        double setDouble(int arg1, double arg2);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap {
        EnumLite findValueByNumber(int arg1);
    }

    public interface EnumVerifier {
        boolean isInRange(int arg1);
    }

    public interface FloatList extends ProtobufList {
        void addFloat(float arg1);

        float getFloat(int arg1);

        FloatList mutableCopyWithCapacity(int arg1);

        float setFloat(int arg1, float arg2);
    }

    public interface IntList extends ProtobufList {
        void addInt(int arg1);

        int getInt(int arg1);

        IntList mutableCopyWithCapacity(int arg1);

        int setInt(int arg1, int arg2);
    }

    public static class ListAdapter extends AbstractList {
        public interface Converter {
            Object convert(Object arg1);
        }

        private final List a;
        private final Converter b;

        public ListAdapter(List list0, Converter internal$ListAdapter$Converter0) {
            this.a = list0;
            this.b = internal$ListAdapter$Converter0;
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

    public interface LongList extends ProtobufList {
        void addLong(long arg1);

        long getLong(int arg1);

        LongList mutableCopyWithCapacity(int arg1);

        long setLong(int arg1, long arg2);
    }

    public static class MapAdapter extends AbstractMap {
        public interface androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter {
            Object doBackward(Object arg1);

            Object doForward(Object arg1);
        }

        class EntryAdapter implements Map.Entry {
            private final Map.Entry a;
            final MapAdapter b;

            public EntryAdapter(Map.Entry map$Entry0) {
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
                return MapAdapter.this.b.doForward(this.a.getValue());
            }

            @Override
            public int hashCode() {
                return this.a.hashCode();
            }

            @Override
            public Object setValue(Object object0) {
                Object object1 = MapAdapter.this.b.doBackward(object0);
                Object object2 = this.a.setValue(object1);
                return object2 == null ? null : MapAdapter.this.b.doForward(object2);
            }
        }

        class IteratorAdapter implements Iterator {
            private final Iterator a;
            final MapAdapter b;

            public IteratorAdapter(Iterator iterator0) {
                this.a = iterator0;
            }

            public Map.Entry a() {
                Object object0 = this.a.next();
                return new EntryAdapter(MapAdapter.this, ((Map.Entry)object0));
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

        class SetAdapter extends AbstractSet {
            private final Set a;
            final MapAdapter b;

            public SetAdapter(Set set0) {
                this.a = set0;
            }

            @Override
            public Iterator iterator() {
                Iterator iterator0 = this.a.iterator();
                return new IteratorAdapter(MapAdapter.this, iterator0);
            }

            @Override
            public int size() {
                return this.a.size();
            }
        }

        private final Map a;
        private final androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter b;

        public MapAdapter(Map map0, androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter internal$MapAdapter$Converter0) {
            this.a = map0;
            this.b = internal$MapAdapter$Converter0;
        }

        public static androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter b(EnumLiteMap internal$EnumLiteMap0, EnumLite internal$EnumLite0) {
            return new androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter() {
                public Integer a(EnumLite internal$EnumLite0) {
                    return internal$EnumLite0.getNumber();
                }

                public EnumLite b(Integer integer0) {
                    EnumLite internal$EnumLite0 = internal$EnumLiteMap0.findValueByNumber(((int)integer0));
                    return internal$EnumLite0 == null ? internal$EnumLite0 : internal$EnumLite0;
                }

                @Override  // androidx.datastore.preferences.protobuf.Internal$MapAdapter$Converter
                public Object doBackward(Object object0) {
                    return this.a(((EnumLite)object0));
                }

                @Override  // androidx.datastore.preferences.protobuf.Internal$MapAdapter$Converter
                public Object doForward(Object object0) {
                    return this.b(((Integer)object0));
                }
            };
        }

        @Override
        public Set entrySet() {
            return new SetAdapter(this, this.a.entrySet());
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

    public interface ProtobufList extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList mutableCopyWithCapacity(int arg1);
    }

    static final Charset a = null;
    static final Charset b = null;
    private static final int c = 0x1000;
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final CodedInputStream f;

    static {
        Internal.a = Charset.forName("UTF-8");
        Internal.b = Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        Internal.d = arr_b;
        Internal.e = ByteBuffer.wrap(arr_b);
        Internal.f = CodedInputStream.p(arr_b);
    }

    public static byte[] a(String s) {
        return s.getBytes(Internal.b);
    }

    public static ByteBuffer b(String s) {
        return ByteBuffer.wrap(Internal.a(s));
    }

    public static ByteString c(String s) {
        return ByteString.p(s.getBytes(Internal.b));
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
            if(!Internal.h(((ByteBuffer)list0.get(v)), ((ByteBuffer)list1.get(v)))) {
                return false;
            }
        }
        return true;
    }

    public static MessageLite j(Class class0) {
        try {
            Method method0 = class0.getMethod("getDefaultInstance", null);
            return (MessageLite)method0.invoke(method0, null);
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
            v = v * 0x1F + Internal.m(((byte[])object0));
        }
        return v;
    }

    public static int m(byte[] arr_b) {
        return Internal.n(arr_b, 0, arr_b.length);
    }

    static int n(byte[] arr_b, int v, int v1) {
        int v2 = Internal.w(v1, arr_b, v, v1);
        return v2 == 0 ? 1 : v2;
    }

    public static int o(ByteBuffer byteBuffer0) {
        int v = 0x1000;
        if(byteBuffer0.hasArray()) {
            int v1 = Internal.w(byteBuffer0.capacity(), byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
            return v1 == 0 ? 1 : v1;
        }
        if(byteBuffer0.capacity() <= 0x1000) {
            v = byteBuffer0.capacity();
        }
        byte[] arr_b = new byte[v];
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.clear();
        int v2;
        for(v2 = byteBuffer0.capacity(); byteBuffer1.remaining() > 0; v2 = Internal.w(v2, arr_b, 0, v3)) {
            int v3 = byteBuffer1.remaining() > v ? v : byteBuffer1.remaining();
            byteBuffer1.get(arr_b, 0, v3);
        }
        return v2 == 0 ? 1 : v2;
    }

    public static int p(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + Internal.o(((ByteBuffer)object0));
        }
        return v;
    }

    public static int q(EnumLite internal$EnumLite0) {
        return internal$EnumLite0.getNumber();
    }

    public static int r(List list0) {
        int v = 1;
        for(Object object0: list0) {
            v = v * 0x1F + Internal.q(((EnumLite)object0));
        }
        return v;
    }

    public static int s(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static boolean t(ByteString byteString0) {
        return byteString0.E();
    }

    public static boolean u(byte[] arr_b) {
        return Utf8.t(arr_b);
    }

    static Object v(Object object0, Object object1) {
        return ((MessageLite)object0).toBuilder().l1(((MessageLite)object1)).buildPartial();
    }

    static int w(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    public static String x(String s) {
        return new String(s.getBytes(Internal.b), Internal.a);
    }

    public static byte[] y(String s) {
        return s.getBytes(Internal.a);
    }

    public static String z(byte[] arr_b) {
        return new String(arr_b, Internal.a);
    }
}

