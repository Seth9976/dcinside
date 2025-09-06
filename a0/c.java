package A0;

import java.io.UnsupportedEncodingException;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class c {
    public static final boolean a = false;
    public static final boolean b = false;
    @h
    public static b c = null;
    private static boolean d = false;
    private static final String e = "UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==";
    private static final int f = 20;
    private static final int g = 21;
    private static final byte[] h;
    private static final byte[] i;
    private static final byte[] j;
    private static final byte[] k;
    private static final byte[] l;

    static {
        c.a = true;
        c.b = true;
        c.c = null;
        c.d = false;
        c.h = new byte[]{82, 73, 70, 70};
        c.i = new byte[]{87, 69, 66, 80};
        c.j = new byte[]{86, 80, 56, 0x20};
        c.k = new byte[]{86, 80, 56, 76};
        c.l = new byte[]{86, 80, 56, 88};
    }

    private static byte[] a(String s) {
        try {
            return s.getBytes("ASCII");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("ASCII not found!", unsupportedEncodingException0);
        }
    }

    // 去混淆评级： 低(30)
    public static boolean b(byte[] arr_b, int v) {
        return c.k(arr_b, v + 12, c.l) && (arr_b[v + 20] & 2) == 2;
    }

    public static boolean c(byte[] arr_b, int v, int v1) {
        return v1 >= 21 && c.k(arr_b, v + 12, c.l);
    }

    // 去混淆评级： 低(30)
    public static boolean d(byte[] arr_b, int v) {
        return c.k(arr_b, v + 12, c.l) && (arr_b[v + 20] & 16) == 16;
    }

    private static boolean e() [...] // Inlined contents

    public static boolean f(byte[] arr_b, int v) {
        return c.k(arr_b, v + 12, c.k);
    }

    public static boolean g(byte[] arr_b, int v) {
        return c.k(arr_b, v + 12, c.j);
    }

    // 去混淆评级： 低(20)
    public static boolean h(byte[] arr_b, int v, int v1) {
        return v1 >= 20 && c.k(arr_b, v, c.h) && c.k(arr_b, v + 8, c.i);
    }

    public static boolean i(byte[] arr_b, int v, int v1) {
        if(c.g(arr_b, v)) {
            return c.a;
        }
        if(c.f(arr_b, v)) {
            return c.b;
        }
        return c.c(arr_b, v, v1) && !c.b(arr_b, v) ? c.b : false;
    }

    @h
    public static b j() {
        b b0;
        if(c.d) {
            return c.c;
        }
        try {
            b0 = null;
            b0 = (b)Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        }
        catch(Throwable unused_ex) {
        }
        c.d = true;
        return b0;
    }

    private static boolean k(byte[] arr_b, int v, byte[] arr_b1) {
        if(arr_b1 == null || arr_b == null || arr_b1.length + v > arr_b.length) {
            return false;
        }
        for(int v1 = 0; v1 < arr_b1.length; ++v1) {
            if(arr_b[v1 + v] != arr_b1[v1]) {
                return false;
            }
        }
        return true;
    }
}

