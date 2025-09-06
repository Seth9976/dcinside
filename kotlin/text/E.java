package kotlin.text;

import kotlin.W0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r;
import y4.l;
import y4.m;

@s0({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
class e extends d {
    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static final char D(int v) {
        if(v < 0 || v >= 10) {
            throw new IllegalArgumentException("Int " + v + " is not a decimal digit");
        }
        return (char)(v + 0x30);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static final char E(int v, int v1) {
        if(2 > v1 || v1 >= 37) {
            throw new IllegalArgumentException("Invalid radix: " + v1 + ". Valid radix values are in range 2..36");
        }
        if(v < 0 || v >= v1) {
            throw new IllegalArgumentException("Digit " + v + " does not represent a valid digit in radix " + v1);
        }
        return v >= 10 ? ((char)(((char)(v + 65)) - 10)) : ((char)(v + 0x30));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static final int F(char c) {
        int v = d.b(c, 10);
        if(v < 0) {
            throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
        }
        return v;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    public static final int G(char c, int v) {
        Integer integer0 = e.I(c, v);
        if(integer0 == null) {
            throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + v);
        }
        return (int)integer0;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @m
    public static final Integer H(char c) {
        Integer integer0 = d.b(c, 10);
        return integer0.intValue() >= 0 ? integer0 : null;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @m
    public static final Integer I(char c, int v) {
        c.a(v);
        Integer integer0 = d.b(c, v);
        return integer0.intValue() >= 0 ? integer0 : null;
    }

    public static final boolean J(char c, char c1, boolean z) {
        if(c == c1) {
            return true;
        }
        if(!z) {
            return false;
        }
        int v = Character.toUpperCase(c);
        int v1 = Character.toUpperCase(c1);
        return v == v1 || Character.toLowerCase(((char)v)) == Character.toLowerCase(((char)v1));
    }

    public static boolean K(char c, char c1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return e.J(c, c1, z);
    }

    public static final boolean L(char c) {
        return 0xD800 <= c && c < 0xE000;
    }

    @f
    private static final String M(char c, String s) {
        L.p(s, "other");
        return c + s;
    }

    @h0(version = "1.5")
    @l
    public static String N(char c) {
        return N.a(c);
    }
}

