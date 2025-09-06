package kotlinx.serialization.json;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.text.v;
import kotlin.y;
import kotlinx.serialization.f;
import kotlinx.serialization.json.internal.j0;
import y4.l;
import y4.m;

public final class n {
    @f
    @l
    public static final w a(@m Void void0) {
        return w.c;
    }

    @l
    public static final B b(@m Boolean boolean0) {
        return boolean0 == null ? w.c : new t(boolean0, false);
    }

    @l
    public static final B c(@m Number number0) {
        return number0 == null ? w.c : new t(number0, false);
    }

    @l
    public static final B d(@m String s) {
        return s == null ? w.c : new t(s, true);
    }

    private static final Void e(kotlinx.serialization.json.l l0, String s) {
        throw new IllegalArgumentException("Element " + m0.d(l0.getClass()) + " is not a " + s);
    }

    public static final boolean f(@l B b0) {
        L.p(b0, "<this>");
        Boolean boolean0 = j0.f(b0.a());
        if(boolean0 == null) {
            throw new IllegalStateException(b0 + " does not represent a Boolean");
        }
        return boolean0.booleanValue();
    }

    @m
    public static final Boolean g(@l B b0) {
        L.p(b0, "<this>");
        return j0.f(b0.a());
    }

    @m
    public static final String h(@l B b0) {
        L.p(b0, "<this>");
        return b0 instanceof w ? null : b0.a();
    }

    public static final double i(@l B b0) {
        L.p(b0, "<this>");
        return Double.parseDouble(b0.a());
    }

    @m
    public static final Double j(@l B b0) {
        L.p(b0, "<this>");
        return v.L0(b0.a());
    }

    public static final float k(@l B b0) {
        L.p(b0, "<this>");
        return Float.parseFloat(b0.a());
    }

    @m
    public static final Float l(@l B b0) {
        L.p(b0, "<this>");
        return v.N0(b0.a());
    }

    public static final int m(@l B b0) {
        L.p(b0, "<this>");
        return Integer.parseInt(b0.a());
    }

    @m
    public static final Integer n(@l B b0) {
        L.p(b0, "<this>");
        return v.b1(b0.a());
    }

    @l
    public static final c o(@l kotlinx.serialization.json.l l0) {
        L.p(l0, "<this>");
        c c0 = l0 instanceof c ? ((c)l0) : null;
        if(c0 != null) {
            return c0;
        }
        n.e(l0, "JsonArray");
        throw new y();
    }

    @l
    public static final w p(@l kotlinx.serialization.json.l l0) {
        L.p(l0, "<this>");
        w w0 = l0 instanceof w ? ((w)l0) : null;
        if(w0 != null) {
            return w0;
        }
        n.e(l0, "JsonNull");
        throw new y();
    }

    @l
    public static final kotlinx.serialization.json.y q(@l kotlinx.serialization.json.l l0) {
        L.p(l0, "<this>");
        kotlinx.serialization.json.y y0 = l0 instanceof kotlinx.serialization.json.y ? ((kotlinx.serialization.json.y)l0) : null;
        if(y0 != null) {
            return y0;
        }
        n.e(l0, "JsonObject");
        throw new y();
    }

    @l
    public static final B r(@l kotlinx.serialization.json.l l0) {
        L.p(l0, "<this>");
        B b0 = l0 instanceof B ? ((B)l0) : null;
        if(b0 != null) {
            return b0;
        }
        n.e(l0, "JsonPrimitive");
        throw new y();
    }

    public static final long s(@l B b0) {
        L.p(b0, "<this>");
        return Long.parseLong(b0.a());
    }

    @m
    public static final Long t(@l B b0) {
        L.p(b0, "<this>");
        return v.d1(b0.a());
    }

    @b0
    @l
    public static final Void u(@l String s, @l String s1) {
        L.p(s, "key");
        L.p(s1, "expected");
        throw new IllegalArgumentException("Element " + s + " is not a " + s1);
    }
}

