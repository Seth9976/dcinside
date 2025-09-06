package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@y
final class v1 {
    private static final Class a = null;
    private static final T1 b = null;
    private static final T1 c = null;
    private static final T1 d = null;
    private static final int e = 40;

    static {
        v1.a = v1.D();
        v1.b = v1.F(false);
        v1.c = v1.F(true);
        v1.d = new V1();
    }

    static int A(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof I0) {
            v2 = 0;
            while(v1 < v) {
                v2 += B.o0(((I0)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += B.o0(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    private static void A0(int v, String s, e2 e20) throws IOException {
        if(s != null && !s.isEmpty()) {
            e20.writeString(v, s);
        }
    }

    @x
    static Object B(Object object0, int v, List list0, d t0$d0, Object object1, T1 t10) {
        if(t0$d0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(t0$d0.findValueByNumber(v4) == null) {
                    object1 = v1.Q(object0, v, v4, object1, t10);
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
                return object1;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                int v5 = (int)(((Integer)object2));
                if(t0$d0.findValueByNumber(v5) == null) {
                    object1 = v1.Q(object0, v, v5, object1, t10);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    public static void B0(int v, List list0, e2 e20) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeStringList(v, list0);
        }
    }

    @x
    static Object C(Object object0, int v, List list0, e t0$e0, Object object1, T1 t10) {
        if(t0$e0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(t0$e0.isInRange(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object1 = v1.Q(object0, v, v4, object1, t10);
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object1;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                int v5 = (int)(((Integer)object2));
                if(!t0$e0.isInRange(v5)) {
                    object1 = v1.Q(object0, v, v5, object1, t10);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    public static void C0(int v, int v1, e2 e20) throws IOException {
        if(v1 != 0) {
            e20.writeUInt32(v, v1);
        }
    }

    private static Class D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void D0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeUInt32List(v, list0, z);
        }
    }

    static Object E(Class class0, String s) {
        try {
            Field[] arr_field = Class.forName((class0.getName() + "$" + v1.R(s, true) + "DefaultEntryHolder")).getDeclaredFields();
            if(arr_field.length != 1) {
                throw new IllegalStateException("Unable to look up map field default entry holder class for " + s + " in " + class0.getName());
            }
            return Y1.S(arr_field[0]);
        }
        catch(Throwable throwable0) {
        }
        throw new RuntimeException(throwable0);
    }

    public static void E0(int v, long v1, e2 e20) throws IOException {
        if(v1 != 0L) {
            e20.writeUInt64(v, v1);
        }
    }

    private static T1 F(boolean z) {
        try {
            Class class0 = v1.G();
            return class0 == null ? null : ((T1)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z)));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void F0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeUInt64List(v, list0, z);
        }
    }

    private static Class G() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void H(W w0, Object object0, Object object1) {
        f0 f00 = w0.c(object1);
        if(!f00.C()) {
            w0.d(object0).K(f00);
        }
    }

    static void I(M0 m00, Object object0, Object object1, long v) {
        Y1.t0(object0, v, m00.mergeFrom(Y1.Q(object0, v), Y1.Q(object1, v)));
    }

    static void J(T1 t10, Object object0, Object object1) {
        t10.p(object0, t10.k(t10.g(object0), t10.g(object1)));
    }

    public static T1 K() {
        return v1.b;
    }

    public static T1 L() {
        return v1.c;
    }

    public static void M(Class class0) {
        if(!l0.class.isAssignableFrom(class0) && (v1.a != null && !v1.a.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    // 去混淆评级： 低(20)
    static boolean N(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static boolean O(int v, int v1, int v2) {
        return v1 >= 40 ? ((long)v1) - ((long)v) + 10L <= 2L * ((long)v2) + 3L + (((long)v2) + 3L) * 3L : true;
    }

    public static boolean P(a0[] arr_a0) {
        return arr_a0.length == 0 ? false : v1.O(arr_a0[0].p(), arr_a0[arr_a0.length - 1].p(), arr_a0.length);
    }

    @x
    static Object Q(Object object0, int v, int v1, Object object1, T1 t10) {
        if(object1 == null) {
            object1 = t10.f(object0);
        }
        t10.e(object1, v, ((long)v1));
        return object1;
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

    public static T1 S() {
        return v1.d;
    }

    public static void T(int v, boolean z, e2 e20) throws IOException {
        if(z) {
            e20.writeBool(v, true);
        }
    }

    public static void U(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeBoolList(v, list0, z);
        }
    }

    public static void V(int v, u u0, e2 e20) throws IOException {
        if(u0 != null && !u0.isEmpty()) {
            e20.f(v, u0);
        }
    }

    public static void W(int v, List list0, e2 e20) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeBytesList(v, list0);
        }
    }

    public static void X(int v, double f, e2 e20) throws IOException {
        if(Double.doubleToRawLongBits(f) != 0L) {
            e20.writeDouble(v, f);
        }
    }

    public static void Y(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeDoubleList(v, list0, z);
        }
    }

    public static void Z(int v, int v1, e2 e20) throws IOException {
        if(v1 != 0) {
            e20.writeEnum(v, v1);
        }
    }

    static int a(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? B.k0(v) + B.Q(v1) : v1 * B.n(v, true);
    }

    public static void a0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeEnumList(v, list0, z);
        }
    }

    static int b(List list0) {
        return list0.size();
    }

    public static void b0(int v, int v1, e2 e20) throws IOException {
        if(v1 != 0) {
            e20.writeFixed32(v, v1);
        }
    }

    static int c(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * B.k0(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += B.u(((u)list0.get(v2)));
        }
        return v3;
    }

    public static void c0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeFixed32List(v, list0, z);
        }
    }

    static int d(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = v1.e(list0);
        return z ? B.k0(v) + B.Q(v2) : v2 + v1 * B.k0(v);
    }

    public static void d0(int v, long v1, e2 e20) throws IOException {
        if(v1 != 0L) {
            e20.writeFixed64(v, v1);
        }
    }

    static int e(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof r0) {
            v2 = 0;
            while(v1 < v) {
                v2 += B.y(((r0)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += B.y(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void e0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeFixed64List(v, list0, z);
        }
    }

    static int f(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? B.k0(v) + B.Q(v1 * 4) : v1 * B.z(v, 0);
    }

    public static void f0(int v, float f, e2 e20) throws IOException {
        if(Float.floatToRawIntBits(f) != 0) {
            e20.writeFloat(v, f);
        }
    }

    static int g(List list0) {
        return list0.size() * 4;
    }

    public static void g0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeFloatList(v, list0, z);
        }
    }

    static int h(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? B.k0(v) + B.Q(v1 * 8) : v1 * B.B(v, 0L);
    }

    public static void h0(int v, List list0, e2 e20) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeGroupList(v, list0);
        }
    }

    static int i(List list0) {
        return list0.size() * 8;
    }

    public static void i0(int v, List list0, e2 e20, t1 t10) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.e(v, list0, t10);
        }
    }

    static int j(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += B.F(v, ((R0)list0.get(v2)));
        }
        return v3;
    }

    public static void j0(int v, int v1, e2 e20) throws IOException {
        if(v1 != 0) {
            e20.writeInt32(v, v1);
        }
    }

    static int k(int v, List list0, t1 t10) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += B.G(v, ((R0)list0.get(v2)), t10);
        }
        return v3;
    }

    public static void k0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeInt32List(v, list0, z);
        }
    }

    static int l(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = v1.m(list0);
        return z ? B.k0(v) + B.Q(v2) : v2 + v1 * B.k0(v);
    }

    public static void l0(int v, long v1, e2 e20) throws IOException {
        if(v1 != 0L) {
            e20.writeInt64(v, v1);
        }
    }

    static int m(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof r0) {
            v2 = 0;
            while(v1 < v) {
                v2 += B.K(((r0)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += B.K(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void m0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeInt64List(v, list0, z);
        }
    }

    static int n(int v, List list0, boolean z) {
        if(list0.size() == 0) {
            return 0;
        }
        int v1 = v1.o(list0);
        return z ? B.k0(v) + B.Q(v1) : v1 + list0.size() * B.k0(v);
    }

    public static void n0(int v, List list0, e2 e20) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                ((C0)object0).o(e20, v);
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
        if(list0 instanceof I0) {
            v2 = 0;
            while(v1 < v) {
                v2 += B.M(((I0)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += B.M(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void o0(int v, Object object0, e2 e20) throws IOException {
        if(object0 != null) {
            e20.writeMessage(v, object0);
        }
    }

    // 去混淆评级： 低(20)
    static int p(int v, Object object0, t1 t10) {
        return object0 instanceof C0 ? B.O(v, ((C0)object0)) : B.T(v, ((R0)object0), t10);
    }

    public static void p0(int v, List list0, e2 e20) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeMessageList(v, list0);
        }
    }

    static int q(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = B.k0(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof C0 ? B.P(((C0)object0)) : B.U(((R0)object0)));
        }
        return v3;
    }

    public static void q0(int v, List list0, e2 e20, t1 t10) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.c(v, list0, t10);
        }
    }

    static int r(int v, List list0, t1 t10) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = B.k0(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            v3 += (object0 instanceof C0 ? B.P(((C0)object0)) : B.V(((R0)object0), t10));
        }
        return v3;
    }

    public static void r0(int v, int v1, e2 e20) throws IOException {
        if(v1 != 0) {
            e20.writeSFixed32(v, v1);
        }
    }

    static int s(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = v1.t(list0);
        return z ? B.k0(v) + B.Q(v2) : v2 + v1 * B.k0(v);
    }

    public static void s0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeSFixed32List(v, list0, z);
        }
    }

    static int t(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof r0) {
            v2 = 0;
            while(v1 < v) {
                v2 += B.f0(((r0)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += B.f0(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void t0(int v, long v1, e2 e20) throws IOException {
        if(v1 != 0L) {
            e20.writeSFixed64(v, v1);
        }
    }

    static int u(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = v1.v(list0);
        return z ? B.k0(v) + B.Q(v2) : v2 + v1 * B.k0(v);
    }

    public static void u0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeSFixed64List(v, list0, z);
        }
    }

    static int v(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof I0) {
            v2 = 0;
            while(v1 < v) {
                v2 += B.h0(((I0)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += B.h0(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void v0(int v, int v1, e2 e20) throws IOException {
        if(v1 != 0) {
            e20.writeSInt32(v, v1);
        }
    }

    static int w(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = B.k0(v) * v1;
        if(list0 instanceof E0) {
            while(v2 < v1) {
                Object object0 = ((E0)list0).getRaw(v2);
                v3 += (object0 instanceof u ? B.u(((u)object0)) : B.j0(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof u ? B.u(((u)object1)) : B.j0(((String)object1)));
            ++v2;
        }
        return v3;
    }

    public static void w0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeSInt32List(v, list0, z);
        }
    }

    static int x(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = v1.y(list0);
        return z ? B.k0(v) + B.Q(v2) : v2 + v1 * B.k0(v);
    }

    public static void x0(int v, long v1, e2 e20) throws IOException {
        if(v1 != 0L) {
            e20.writeSInt64(v, v1);
        }
    }

    static int y(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof r0) {
            v2 = 0;
            while(v1 < v) {
                v2 += B.m0(((r0)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += B.m0(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void y0(int v, List list0, e2 e20, boolean z) throws IOException {
        if(list0 != null && !list0.isEmpty()) {
            e20.writeSInt64List(v, list0, z);
        }
    }

    static int z(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = v1.A(list0);
        return z ? B.k0(v) + B.Q(v2) : v2 + v1 * B.k0(v);
    }

    public static void z0(int v, Object object0, e2 e20) throws IOException {
        if(object0 instanceof String) {
            v1.A0(v, ((String)object0), e20);
            return;
        }
        v1.V(v, ((u)object0), e20);
    }
}

