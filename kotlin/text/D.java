package kotlin.text;

import java.util.Locale;
import kotlin.W0;
import kotlin.b0;
import kotlin.c0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.r;
import y4.l;

class d {
    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final String A(char c) {
        String s = String.valueOf(c);
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.toUpperCase(Locale.ROOT);
        L.o(s1, "toUpperCase(...)");
        return s1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static final String B(char c, @l Locale locale0) {
        L.p(locale0, "locale");
        String s = String.valueOf(c);
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.toUpperCase(locale0);
        L.o(s1, "toUpperCase(...)");
        return s1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final char C(char c) {
        return Character.toUpperCase(c);
    }

    @b0
    public static int a(int v) {
        if(2 > v || v >= 37) {
            throw new IllegalArgumentException("radix " + v + " was not in valid range " + new kotlin.ranges.l(2, 36));
        }
        return v;
    }

    public static final int b(char c, int v) {
        return Character.digit(c, v);
    }

    @l
    public static final a c(char c) {
        return a.c.a(Character.getType(c));
    }

    @l
    public static final b d(char c) {
        return b.b.b(Character.getDirectionality(c));
    }

    @f
    private static final boolean e(char c) {
        return Character.isDefined(c);
    }

    @f
    private static final boolean f(char c) {
        return Character.isDigit(c);
    }

    @f
    private static final boolean g(char c) {
        return Character.isHighSurrogate(c);
    }

    @f
    private static final boolean h(char c) {
        return Character.isISOControl(c);
    }

    @f
    private static final boolean i(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @f
    private static final boolean j(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @f
    private static final boolean k(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @f
    private static final boolean l(char c) {
        return Character.isLetter(c);
    }

    @f
    private static final boolean m(char c) {
        return Character.isLetterOrDigit(c);
    }

    @f
    private static final boolean n(char c) {
        return Character.isLowSurrogate(c);
    }

    @f
    private static final boolean o(char c) {
        return Character.isLowerCase(c);
    }

    @f
    private static final boolean p(char c) {
        return Character.isTitleCase(c);
    }

    @f
    private static final boolean q(char c) {
        return Character.isUpperCase(c);
    }

    // 去混淆评级： 低(20)
    public static boolean r(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final String s(char c) {
        String s = String.valueOf(c);
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.toLowerCase(Locale.ROOT);
        L.o(s1, "toLowerCase(...)");
        return s1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static String t(char c, @l Locale locale0) {
        L.p(locale0, "locale");
        String s = String.valueOf(c);
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.toLowerCase(locale0);
        L.o(s1, "toLowerCase(...)");
        return s1;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final char u(char c) {
        return Character.toLowerCase(c);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @l
    public static String v(char c, @l Locale locale0) {
        L.p(locale0, "locale");
        String s = d.B(c, locale0);
        if(s.length() > 1) {
            if(c != 329) {
                L.n(s, "null cannot be cast to non-null type java.lang.String");
                String s1 = s.substring(1);
                L.o(s1, "substring(...)");
                L.n(s1, "null cannot be cast to non-null type java.lang.String");
                String s2 = s1.toLowerCase(Locale.ROOT);
                L.o(s2, "toLowerCase(...)");
                return s.charAt(0) + s2;
            }
            return s;
        }
        String s3 = String.valueOf(c);
        L.n(s3, "null cannot be cast to non-null type java.lang.String");
        String s4 = s3.toUpperCase(Locale.ROOT);
        L.o(s4, "toUpperCase(...)");
        return L.g(s, s4) ? String.valueOf(Character.toTitleCase(c)) : s;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.5")
    @f
    private static final char w(char c) {
        return Character.toTitleCase(c);
    }

    @f
    @k(message = "Use lowercaseChar() instead.", replaceWith = @c0(expression = "lowercaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    private static final char x(char c) {
        return Character.toLowerCase(c);
    }

    @f
    @k(message = "Use titlecaseChar() instead.", replaceWith = @c0(expression = "titlecaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    private static final char y(char c) {
        return Character.toTitleCase(c);
    }

    @f
    @k(message = "Use uppercaseChar() instead.", replaceWith = @c0(expression = "uppercaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    private static final char z(char c) {
        return Character.toUpperCase(c);
    }
}

