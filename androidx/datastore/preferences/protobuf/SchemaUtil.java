package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class SchemaUtil {
    private static final Class a = null;
    private static final UnknownFieldSchema b = null;
    private static final UnknownFieldSchema c = null;
    private static final UnknownFieldSchema d = null;
    private static final int e = 40;

    static {
        SchemaUtil.a = SchemaUtil.D();
        SchemaUtil.b = SchemaUtil.F(false);
        SchemaUtil.c = SchemaUtil.F(true);
        SchemaUtil.d = new UnknownFieldSetLiteSchema();
    }

    static int A(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof LongArrayList) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.o0(((LongArrayList)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.o0(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    private static void A0(int v, String s, Writer writer0) throws IOException {
        if(s != null && !s.isEmpty()) {
            writer0.writeString(v, s);
        }
    }

    static Object B(int v, List list0, EnumLiteMap internal$EnumLiteMap0, Object object0, UnknownFieldSchema unknownFieldSchema0) {
        if(internal$EnumLiteMap0 == null) {
            return object0;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(internal$EnumLiteMap0.findValueByNumber(v4) == null) {
                    object0 = SchemaUtil.Q(v, v4, object0, unknownFieldSchema0);
                }
                else {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object0;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                int v5 = (int)(((Integer)object1));
                if(internal$EnumLiteMap0.findValueByNumber(v5) == null) {
                    object0 = SchemaUtil.Q(v, v5, object0, unknownFieldSchema0);
                    iterator0.remove();
                }
            }
        }
        return object0;
    }

    public static void B0(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeStringList(v, list0);
        }
    }

    static Object C(int v, List list0, EnumVerifier internal$EnumVerifier0, Object object0, UnknownFieldSchema unknownFieldSchema0) {
        if(internal$EnumVerifier0 == null) {
            return object0;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(internal$EnumVerifier0.isInRange(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object0 = SchemaUtil.Q(v, v4, object0, unknownFieldSchema0);
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object0;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                int v5 = (int)(((Integer)object1));
                if(!internal$EnumVerifier0.isInRange(v5)) {
                    object0 = SchemaUtil.Q(v, v5, object0, unknownFieldSchema0);
                    iterator0.remove();
                }
            }
        }
        return object0;
    }

    public static void C0(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeUInt32(v, v1);
        }
    }

    private static Class D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void D0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeUInt32List(v, list0, z);
        }
    }

    static Object E(Class class0, String s) {
        try {
            Field[] arr_field = Class.forName((class0.getName() + "$" + SchemaUtil.R(s, true) + "DefaultEntryHolder")).getDeclaredFields();
            if(arr_field.length != 1) {
                throw new IllegalStateException("Unable to look up map field default entry holder class for " + s + " in " + class0.getName());
            }
            return UnsafeUtil.Q(arr_field[0]);
        }
        catch(Throwable throwable0) {
        }
        throw new RuntimeException(throwable0);
    }

    public static void E0(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeUInt64(v, v1);
        }
    }

    private static UnknownFieldSchema F(boolean z) {
        try {
            Class class0 = SchemaUtil.G();
            return class0 == null ? null : ((UnknownFieldSchema)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z)));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void F0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeUInt64List(v, list0, z);
        }
    }

    private static Class G() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void H(ExtensionSchema extensionSchema0, Object object0, Object object1) {
        FieldSet fieldSet0 = extensionSchema0.c(object1);
        if(!fieldSet0.C()) {
            extensionSchema0.d(object0).J(fieldSet0);
        }
    }

    static void I(MapFieldSchema mapFieldSchema0, Object object0, Object object1, long v) {
        UnsafeUtil.q0(object0, v, mapFieldSchema0.mergeFrom(UnsafeUtil.O(object0, v), UnsafeUtil.O(object1, v)));
    }

    static void J(UnknownFieldSchema unknownFieldSchema0, Object object0, Object object1) {
        unknownFieldSchema0.p(object0, unknownFieldSchema0.k(unknownFieldSchema0.g(object0), unknownFieldSchema0.g(object1)));
    }

    public static UnknownFieldSchema K() {
        return SchemaUtil.b;
    }

    public static UnknownFieldSchema L() {
        return SchemaUtil.c;
    }

    public static void M(Class class0) {
        if(!GeneratedMessageLite.class.isAssignableFrom(class0) && (SchemaUtil.a != null && !SchemaUtil.a.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    // 去混淆评级： 低(20)
    static boolean N(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static boolean O(int v, int v1, int v2) {
        return v1 >= 40 ? ((long)v1) - ((long)v) + 10L <= 2L * ((long)v2) + 3L + (((long)v2) + 3L) * 3L : true;
    }

    public static boolean P(FieldInfo[] arr_fieldInfo) {
        return arr_fieldInfo.length == 0 ? false : SchemaUtil.O(arr_fieldInfo[0].p(), arr_fieldInfo[arr_fieldInfo.length - 1].p(), arr_fieldInfo.length);
    }

    static Object Q(int v, int v1, Object object0, UnknownFieldSchema unknownFieldSchema0) {
        if(object0 == null) {
            object0 = unknownFieldSchema0.n();
        }
        unknownFieldSchema0.e(object0, v, ((long)v1));
        return object0;
    }

    static String R(String s, boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(97 <= v1 && v1 <= 0x7A) {
                if(z) {
                    stringBuilder0.append(((char)(v1 - 0x20)));
                }
                else {
                    stringBuilder0.append(((char)v1));
                }
                goto label_15;
            }
            else if(65 > v1 || v1 > 90) {
                if(0x30 <= v1 && v1 <= 57) {
                    stringBuilder0.append(((char)v1));
                }
                z = true;
            }
            else {
                if(v != 0 || z) {
                    stringBuilder0.append(((char)v1));
                }
                else {
                    stringBuilder0.append(((char)(v1 + 0x20)));
                }
            label_15:
                z = false;
            }
            ++v;
        }
        return stringBuilder0.toString();
    }

    public static UnknownFieldSchema S() {
        return SchemaUtil.d;
    }

    public static void T(int v, boolean z, Writer writer0) throws IOException {
        if(z) {
            writer0.writeBool(v, true);
        }
    }

    public static void U(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeBoolList(v, list0, z);
        }
    }

    public static void V(int v, ByteString byteString0, Writer writer0) throws IOException {
        if(byteString0 != null && !byteString0.isEmpty()) {
            writer0.a(v, byteString0);
        }
    }

    public static void W(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeBytesList(v, list0);
        }
    }

    public static void X(int v, double f, Writer writer0) throws IOException {
        if(Double.compare(f, 0.0) != 0) {
            writer0.writeDouble(v, f);
        }
    }

    public static void Y(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeDoubleList(v, list0, z);
        }
    }

    public static void Z(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeEnum(v, v1);
        }
    }

    static int a(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v1) : v1 * CodedOutputStream.n(v, true);
    }

    public static void a0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeEnumList(v, list0, z);
        }
    }

    static int b(List list0) {
        return list0.size();
    }

    public static void b0(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeFixed32(v, v1);
        }
    }

    static int c(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * CodedOutputStream.k0(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += CodedOutputStream.u(((ByteString)list0.get(v2)));
        }
        return v3;
    }

    public static void c0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFixed32List(v, list0, z);
        }
    }

    static int d(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = SchemaUtil.e(list0);
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v2) : v2 + v1 * CodedOutputStream.k0(v);
    }

    public static void d0(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeFixed64(v, v1);
        }
    }

    static int e(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof IntArrayList) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.y(((IntArrayList)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.y(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void e0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFixed64List(v, list0, z);
        }
    }

    static int f(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v1 * 4) : v1 * CodedOutputStream.z(v, 0);
    }

    public static void f0(int v, float f, Writer writer0) throws IOException {
        if(Float.compare(f, 0.0f) != 0) {
            writer0.writeFloat(v, f);
        }
    }

    static int g(List list0) {
        return list0.size() * 4;
    }

    public static void g0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFloatList(v, list0, z);
        }
    }

    static int h(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v1 * 8) : v1 * CodedOutputStream.B(v, 0L);
    }

    public static void h0(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeGroupList(v, list0);
        }
    }

    static int i(List list0) {
        return list0.size() * 8;
    }

    public static void i0(int v, List list0, Writer writer0, Schema schema0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.d(v, list0, schema0);
        }
    }

    static int j(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += CodedOutputStream.F(v, ((MessageLite)list0.get(v2)));
        }
        return v3;
    }

    public static void j0(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeInt32(v, v1);
        }
    }

    static int k(int v, List list0, Schema schema0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += CodedOutputStream.G(v, ((MessageLite)list0.get(v2)), schema0);
        }
        return v3;
    }

    public static void k0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeInt32List(v, list0, z);
        }
    }

    static int l(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = SchemaUtil.m(list0);
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v2) : v2 + v1 * CodedOutputStream.k0(v);
    }

    public static void l0(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeInt64(v, v1);
        }
    }

    static int m(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof IntArrayList) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.K(((IntArrayList)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.K(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void m0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeInt64List(v, list0, z);
        }
    }

    static int n(int v, List list0, boolean z) {
        if(list0.size() == 0) {
            return 0;
        }
        int v1 = SchemaUtil.o(list0);
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v1) : v1 + list0.size() * CodedOutputStream.k0(v);
    }

    public static void n0(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                ((LazyFieldLite)object0).o(writer0, v);
            }
        }
    }

    static int o(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof LongArrayList) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.M(((LongArrayList)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.M(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void o0(int v, Object object0, Writer writer0) throws IOException {
        if(object0 != null) {
            writer0.writeMessage(v, object0);
        }
    }

    // 去混淆评级： 低(20)
    static int p(int v, Object object0, Schema schema0) {
        return object0 instanceof LazyFieldLite ? CodedOutputStream.O(v, ((LazyFieldLite)object0)) : CodedOutputStream.T(v, ((MessageLite)object0), schema0);
    }

    public static void p0(int v, List list0, Writer writer0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeMessageList(v, list0);
        }
    }

    static int q(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.k0(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof LazyFieldLite ? CodedOutputStream.P(((LazyFieldLite)object0)) : CodedOutputStream.U(((MessageLite)object0)));
        }
        return v3;
    }

    public static void q0(int v, List list0, Writer writer0, Schema schema0) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.f(v, list0, schema0);
        }
    }

    static int r(int v, List list0, Schema schema0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.k0(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof LazyFieldLite ? CodedOutputStream.P(((LazyFieldLite)object0)) : CodedOutputStream.V(((MessageLite)object0), schema0));
        }
        return v3;
    }

    public static void r0(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeSFixed32(v, v1);
        }
    }

    static int s(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = SchemaUtil.t(list0);
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v2) : v2 + v1 * CodedOutputStream.k0(v);
    }

    public static void s0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSFixed32List(v, list0, z);
        }
    }

    static int t(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof IntArrayList) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.f0(((IntArrayList)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.f0(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void t0(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeSFixed64(v, v1);
        }
    }

    static int u(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = SchemaUtil.v(list0);
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v2) : v2 + v1 * CodedOutputStream.k0(v);
    }

    public static void u0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSFixed64List(v, list0, z);
        }
    }

    static int v(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof LongArrayList) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.h0(((LongArrayList)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.h0(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void v0(int v, int v1, Writer writer0) throws IOException {
        if(v1 != 0) {
            writer0.writeSInt32(v, v1);
        }
    }

    static int w(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.k0(v) * v1;
        if(list0 instanceof LazyStringList) {
            while(v2 < v1) {
                Object object0 = ((LazyStringList)list0).getRaw(v2);
                v3 += (object0 instanceof ByteString ? CodedOutputStream.u(((ByteString)object0)) : CodedOutputStream.j0(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof ByteString ? CodedOutputStream.u(((ByteString)object1)) : CodedOutputStream.j0(((String)object1)));
            ++v2;
        }
        return v3;
    }

    public static void w0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSInt32List(v, list0, z);
        }
    }

    static int x(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = SchemaUtil.y(list0);
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v2) : v2 + v1 * CodedOutputStream.k0(v);
    }

    public static void x0(int v, long v1, Writer writer0) throws IOException {
        if(v1 != 0L) {
            writer0.writeSInt64(v, v1);
        }
    }

    static int y(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof IntArrayList) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.m0(((IntArrayList)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.m0(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void y0(int v, List list0, Writer writer0, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSInt64List(v, list0, z);
        }
    }

    static int z(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = SchemaUtil.A(list0);
        return z ? CodedOutputStream.k0(v) + CodedOutputStream.Q(v2) : v2 + v1 * CodedOutputStream.k0(v);
    }

    public static void z0(int v, Object object0, Writer writer0) throws IOException {
        if(object0 instanceof String) {
            SchemaUtil.A0(v, ((String)object0), writer0);
            return;
        }
        SchemaUtil.V(v, ((ByteString)object0), writer0);
    }
}

