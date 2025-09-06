package com.google.common.net;

import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.base.z;
import com.google.common.hash.t;
import com.google.common.io.h;
import com.google.common.primitives.l;
import j..util.Objects;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

@c
@d
@a
public final class e {
    public static final class com.google.common.net.e.a {
        private final Inet4Address a;
        private final Inet4Address b;
        private final int c;
        private final int d;

        public com.google.common.net.e.a(@o3.a Inet4Address inet4Address0, @o3.a Inet4Address inet4Address1, int v, int v1) {
            boolean z = false;
            H.k(v >= 0 && v <= 0xFFFF, "port \'%s\' is out of range (0 <= port <= 0xffff)", v);
            if(v1 >= 0 && v1 <= 0xFFFF) {
                z = true;
            }
            H.k(z, "flags \'%s\' is out of range (0 <= flags <= 0xffff)", v1);
            this.a = (Inet4Address)z.a(inet4Address0, e.h);
            this.b = (Inet4Address)z.a(inet4Address1, e.h);
            this.c = v;
            this.d = v1;
        }

        public Inet4Address a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.c;
        }

        public Inet4Address d() {
            return this.a;
        }
    }

    private static final int a = 4;
    private static final int b = 8;
    private static final char c = '.';
    private static final char d = ':';
    private static final com.google.common.base.e e;
    private static final com.google.common.base.e f;
    private static final Inet4Address g;
    private static final Inet4Address h;

    static {
        e.e = com.google.common.base.e.q('.');
        e.f = com.google.common.base.e.q(':');
        e.g = (Inet4Address)e.g("127.0.0.1");
        e.h = (Inet4Address)e.g("0.0.0.0");
    }

    public static boolean A(Inet6Address inet6Address0) {
        byte[] arr_b = inet6Address0.getAddress();
        return arr_b[0] == 0x20 && arr_b[1] == 2;
    }

    public static boolean B(Inet6Address inet6Address0) {
        if(!inet6Address0.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] arr_b = inet6Address0.getAddress();
        if(arr_b[12] == 0 && arr_b[13] == 0 && arr_b[14] == 0) {
            switch(arr_b[15]) {
                case 0: 
                case 1: {
                    return false;
                }
                default: {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean C(String s) {
        return e.z(s) != null;
    }

    public static boolean D(Inet6Address inet6Address0) {
        if(e.G(inet6Address0)) {
            return false;
        }
        byte[] arr_b = inet6Address0.getAddress();
        return (arr_b[8] | 3) == 3 ? arr_b[9] == 0 && arr_b[10] == 94 && arr_b[11] == -2 : false;
    }

    public static boolean E(String s) {
        byte[] arr_b = e.z(s);
        if(arr_b != null && arr_b.length == 16) {
            for(int v = 0; v < 10; ++v) {
                if(arr_b[v] != 0) {
                    return false;
                }
            }
            for(int v1 = 10; v1 < 12; ++v1) {
                if(arr_b[v1] != -1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean F(InetAddress inetAddress0) {
        byte[] arr_b = inetAddress0.getAddress();
        for(int v = 0; v < arr_b.length; ++v) {
            if(arr_b[v] != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(Inet6Address inet6Address0) {
        byte[] arr_b = inet6Address0.getAddress();
        return arr_b[0] == 0x20 && arr_b[1] == 1 && arr_b[2] == 0 && arr_b[3] == 0;
    }

    public static boolean H(String s) {
        return e.i(s) != null;
    }

    private static short I(String s, int v, int v1) {
        if(v1 - v <= 0 || v1 - v > 4) {
            throw new NumberFormatException();
        }
        int v2 = 0;
        while(v < v1) {
            v2 = v2 << 4 | Character.digit(s.charAt(v), 16);
            ++v;
        }
        return (short)v2;
    }

    private static byte J(String s, int v, int v1) {
        int v2 = v1 - v;
        if(v2 <= 0 || v2 > 3 || v2 > 1 && s.charAt(v) == 0x30) {
            throw new NumberFormatException();
        }
        int v3 = 0;
        while(v < v1) {
            int v4 = Character.digit(s.charAt(v), 10);
            if(v4 < 0) {
                throw new NumberFormatException();
            }
            v3 = v3 * 10 + v4;
            ++v;
        }
        if(v3 > 0xFF) {
            throw new NumberFormatException();
        }
        return (byte)v3;
    }

    @o3.a
    private static byte[] K(String s) {
        if(e.e.i(s) + 1 != 4) {
            return null;
        }
        byte[] arr_b = new byte[4];
        int v = 0;
        for(int v1 = 0; v1 < 4; ++v1) {
            int v2 = s.indexOf(46, v);
            if(v2 == -1) {
                v2 = s.length();
            }
            try {
                arr_b[v1] = e.J(s, v, v2);
                v = v2 + 1;
            }
            catch(NumberFormatException unused_ex) {
                return null;
            }
        }
        return arr_b;
    }

    @o3.a
    private static byte[] L(String s) {
        int v = e.f.i(s);
        if(v >= 2 && v <= 8) {
            int v1 = 1;
            int v2 = 7 - v;
            boolean z = false;
            for(int v3 = 0; v3 < s.length() - 1; ++v3) {
                if(s.charAt(v3) == 58 && s.charAt(v3 + 1) == 58) {
                    if(z) {
                        return null;
                    }
                    int v4 = v3 == 0 ? v2 + 2 : v2 + 1;
                    if(v3 == s.length() - 2) {
                        ++v4;
                    }
                    v2 = v4;
                    z = true;
                }
            }
            if(s.charAt(0) == 58 && s.charAt(1) != 58) {
                return null;
            }
            if(s.charAt(s.length() - 1) == 58 && s.charAt(s.length() - 2) != 58) {
                return null;
            }
            if(z && v2 <= 0) {
                return null;
            }
            if(!z && v + 1 != 8) {
                return null;
            }
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(16);
            try {
                if(s.charAt(0) != 58) {
                    v1 = 0;
                }
                while(v1 < s.length()) {
                    int v5 = s.indexOf(58, v1) == -1 ? s.length() : s.indexOf(58, v1);
                    if(s.charAt(v1) == 58) {
                        for(int v6 = 0; v6 < v2; ++v6) {
                            byteBuffer0.putShort(0);
                        }
                    }
                    else {
                        byteBuffer0.putShort(e.I(s, v1, v5));
                    }
                    v1 = v5 + 1;
                }
            }
            catch(NumberFormatException unused_ex) {
                return null;
            }
            return byteBuffer0.array();
        }
        return null;
    }

    public static String M(InetAddress inetAddress0) {
        H.E(inetAddress0);
        if(inetAddress0 instanceof Inet4Address) {
            String s = inetAddress0.getHostAddress();
            Objects.requireNonNull(s);
            return s;
        }
        H.d(inetAddress0 instanceof Inet6Address);
        byte[] arr_b = inetAddress0.getAddress();
        int[] arr_v = new int[8];
        for(int v = 0; v < 8; ++v) {
            arr_v[v] = l.k(((byte)0), ((byte)0), arr_b[v * 2], arr_b[v * 2 + 1]);
        }
        e.d(arr_v);
        return e.x(arr_v);
    }

    public static BigInteger N(InetAddress inetAddress0) {
        return new BigInteger(1, inetAddress0.getAddress());
    }

    // 去混淆评级： 低(20)
    public static String O(InetAddress inetAddress0) {
        return inetAddress0 instanceof Inet6Address ? "[" + e.M(inetAddress0) + "]" : e.M(inetAddress0);
    }

    private static InetAddress b(byte[] arr_b) {
        try {
            return InetAddress.getByAddress(arr_b);
        }
        catch(UnknownHostException unknownHostException0) {
            throw new AssertionError(unknownHostException0);
        }
    }

    public static int c(InetAddress inetAddress0) {
        return h.h(e.q(inetAddress0).getAddress()).readInt();
    }

    private static void d(int[] arr_v) {
        int v1 = -1;
        int v2 = -1;
        int v3 = -1;
        for(int v = 0; v < arr_v.length + 1; ++v) {
            if(v >= arr_v.length || arr_v[v] != 0) {
                if(v3 >= 0) {
                    int v4 = v - v3;
                    if(v4 > v1) {
                        v2 = v3;
                        v1 = v4;
                    }
                    v3 = -1;
                }
            }
            else if(v3 < 0) {
                v3 = v;
            }
        }
        if(v1 >= 2) {
            Arrays.fill(arr_v, v2, v1 + v2, -1);
        }
    }

    @o3.a
    private static String e(String s) {
        int v = s.lastIndexOf(58);
        byte[] arr_b = e.K(s.substring(v + 1));
        return arr_b == null ? null : s.substring(0, v + 1) + Integer.toHexString((arr_b[0] & 0xFF) << 8 | arr_b[1] & 0xFF) + ":" + Integer.toHexString(arr_b[3] & 0xFF | (arr_b[2] & 0xFF) << 8);
    }

    public static InetAddress f(InetAddress inetAddress0) {
        byte[] arr_b = inetAddress0.getAddress();
        int v;
        for(v = arr_b.length - 1; v >= 0 && arr_b[v] == 0; --v) {
            arr_b[v] = -1;
        }
        H.u(v >= 0, "Decrementing %s would wrap.", inetAddress0);
        arr_b[v] = (byte)(arr_b[v] - 1);
        return e.b(arr_b);
    }

    @O1.a
    public static InetAddress g(String s) {
        byte[] arr_b = e.z(s);
        if(arr_b == null) {
            throw e.j("\'%s\' is not an IP string literal.", new Object[]{s});
        }
        return e.b(arr_b);
    }

    public static InetAddress h(String s) {
        InetAddress inetAddress0 = e.i(s);
        if(inetAddress0 == null) {
            throw e.j("Not a valid URI IP literal: \'%s\'", new Object[]{s});
        }
        return inetAddress0;
    }

    @o3.a
    private static InetAddress i(String s) {
        int v;
        H.E(s);
        if(!s.startsWith("[") || !s.endsWith("]")) {
            v = 4;
        }
        else {
            s = s.substring(1, s.length() - 1);
            v = 16;
        }
        byte[] arr_b = e.z(s);
        return arr_b == null || arr_b.length != v ? null : e.b(arr_b);
    }

    private static IllegalArgumentException j(String s, Object[] arr_object) {
        return new IllegalArgumentException(String.format(Locale.ROOT, s, arr_object));
    }

    private static InetAddress k(BigInteger bigInteger0, boolean z) {
        H.e(bigInteger0.signum() >= 0, "BigInteger must be greater than or equal to 0");
        byte[] arr_b = bigInteger0.toByteArray();
        byte[] arr_b1 = new byte[(z ? 16 : 4)];
        int v = Math.max(0, arr_b.length - (z ? 16 : 4));
        int v1 = arr_b.length - v;
        for(int v2 = 0; v2 < v; ++v2) {
            if(arr_b[v2] != 0) {
                throw e.j("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", new Object[]{((int)(z ? 16 : 4)), bigInteger0});
            }
        }
        System.arraycopy(arr_b, v, arr_b1, (z ? 16 : 4) - v1, v1);
        try {
            return InetAddress.getByAddress(arr_b1);
        }
        catch(UnknownHostException unknownHostException0) {
            throw new AssertionError(unknownHostException0);
        }
    }

    public static Inet4Address l(BigInteger bigInteger0) {
        return (Inet4Address)e.k(bigInteger0, false);
    }

    public static Inet6Address m(BigInteger bigInteger0) {
        return (Inet6Address)e.k(bigInteger0, true);
    }

    public static Inet4Address n(int v) {
        return e.t(l.E(v));
    }

    public static InetAddress o(byte[] arr_b) throws UnknownHostException {
        byte[] arr_b1 = new byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b1[v] = arr_b[arr_b.length - v - 1];
        }
        return InetAddress.getByAddress(arr_b1);
    }

    public static Inet4Address p(Inet6Address inet6Address0) {
        H.u(e.A(inet6Address0), "Address \'%s\' is not a 6to4 address.", e.M(inet6Address0));
        return e.t(Arrays.copyOfRange(inet6Address0.getAddress(), 2, 6));
    }

    public static Inet4Address q(InetAddress inetAddress0) {
        if(inetAddress0 instanceof Inet4Address) {
            return (Inet4Address)inetAddress0;
        }
        byte[] arr_b = inetAddress0.getAddress();
        for(int v = 0; true; ++v) {
            boolean z = true;
            if(v >= 15) {
                break;
            }
            if(arr_b[v] != 0) {
                z = false;
                break;
            }
        }
        if(z && arr_b[15] == 1) {
            return e.g;
        }
        if(z && arr_b[15] == 0) {
            return e.h;
        }
        int v1 = t.B().e((e.w(((Inet6Address)inetAddress0)) ? ((long)e.s(((Inet6Address)inetAddress0)).hashCode()) : ByteBuffer.wrap(((Inet6Address)inetAddress0).getAddress(), 0, 8).getLong())).b() | 0xE0000000;
        if(v1 == -1) {
            v1 = -2;
        }
        return e.t(l.E(v1));
    }

    public static Inet4Address r(Inet6Address inet6Address0) {
        H.u(e.B(inet6Address0), "Address \'%s\' is not IPv4-compatible.", e.M(inet6Address0));
        return e.t(Arrays.copyOfRange(inet6Address0.getAddress(), 12, 16));
    }

    public static Inet4Address s(Inet6Address inet6Address0) {
        if(e.B(inet6Address0)) {
            return e.r(inet6Address0);
        }
        if(e.A(inet6Address0)) {
            return e.p(inet6Address0);
        }
        if(!e.G(inet6Address0)) {
            throw e.j("\'%s\' has no embedded IPv4 address.", new Object[]{e.M(inet6Address0)});
        }
        return e.v(inet6Address0).a();
    }

    private static Inet4Address t(byte[] arr_b) {
        H.k(arr_b.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", arr_b.length);
        return (Inet4Address)e.b(arr_b);
    }

    public static Inet4Address u(Inet6Address inet6Address0) {
        H.u(e.D(inet6Address0), "Address \'%s\' is not an ISATAP address.", e.M(inet6Address0));
        return e.t(Arrays.copyOfRange(inet6Address0.getAddress(), 12, 16));
    }

    public static com.google.common.net.e.a v(Inet6Address inet6Address0) {
        H.u(e.G(inet6Address0), "Address \'%s\' is not a Teredo address.", e.M(inet6Address0));
        byte[] arr_b = inet6Address0.getAddress();
        Inet4Address inet4Address0 = e.t(Arrays.copyOfRange(arr_b, 4, 8));
        int v = h.i(arr_b, 8).readShort();
        int v1 = h.i(arr_b, 10).readShort();
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 12, 16);
        for(int v2 = 0; v2 < arr_b1.length; ++v2) {
            arr_b1[v2] = (byte)(~arr_b1[v2]);
        }
        return new com.google.common.net.e.a(inet4Address0, e.t(arr_b1), 0xFFFF & ~v1, v & 0xFFFF);
    }

    // 去混淆评级： 低(30)
    public static boolean w(Inet6Address inet6Address0) {
        return e.B(inet6Address0) || e.A(inet6Address0) || e.G(inet6Address0);
    }

    private static String x(int[] arr_v) {
        StringBuilder stringBuilder0 = new StringBuilder(39);
        int v = 0;
        for(int v1 = 0; v < arr_v.length; v1 = v2) {
            int v2 = arr_v[v] < 0 ? 0 : 1;
            if(v2 != 0) {
                if(v1 != 0) {
                    stringBuilder0.append(':');
                }
                stringBuilder0.append(Integer.toHexString(arr_v[v]));
            }
            else if(v == 0 || v1 != 0) {
                stringBuilder0.append("::");
            }
            ++v;
        }
        return stringBuilder0.toString();
    }

    public static InetAddress y(InetAddress inetAddress0) {
        boolean z;
        byte[] arr_b = inetAddress0.getAddress();
        int v;
        for(v = arr_b.length - 1; true; --v) {
            z = false;
            if(v < 0 || arr_b[v] != -1) {
                break;
            }
            arr_b[v] = 0;
        }
        if(v >= 0) {
            z = true;
        }
        H.u(z, "Incrementing %s would wrap.", inetAddress0);
        arr_b[v] = (byte)(arr_b[v] + 1);
        return e.b(arr_b);
    }

    @o3.a
    private static byte[] z(String s) {
        int v = 0;
        boolean z = false;
        boolean z1 = false;
        while(true) {
            if(v >= s.length()) {
                v = -1;
                break;
            }
            int v1 = s.charAt(v);
            if(v1 == 46) {
                z = true;
            }
            else if(v1 == 58) {
                if(z) {
                    return null;
                }
                z1 = true;
            }
            else {
                if(v1 == 37) {
                    break;
                }
                if(Character.digit(((char)v1), 16) == -1) {
                    return null;
                }
            }
            ++v;
        }
        if(z1) {
            if(z) {
                s = e.e(s);
                if(s == null) {
                    return null;
                }
            }
            if(v != -1) {
                s = s.substring(0, v);
            }
            return e.L(s);
        }
        return z && v == -1 ? e.K(s) : null;
    }
}

