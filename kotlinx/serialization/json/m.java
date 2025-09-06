package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.serialization.f;
import y4.l;

public final class m {
    public static final boolean a(@l d d0, @y4.m Boolean boolean0) {
        L.p(d0, "<this>");
        return d0.a(n.b(boolean0));
    }

    public static final boolean b(@l d d0, @y4.m Number number0) {
        L.p(d0, "<this>");
        return d0.a(n.c(number0));
    }

    public static final boolean c(@l d d0, @y4.m String s) {
        L.p(d0, "<this>");
        return d0.a(n.d(s));
    }

    @f
    public static final boolean d(@l d d0, @y4.m Void void0) {
        L.p(d0, "<this>");
        return d0.a(w.c);
    }

    public static final boolean e(@l d d0, @l Function1 function10) {
        L.p(d0, "<this>");
        L.p(function10, "builderAction");
        d d1 = new d();
        function10.invoke(d1);
        return d0.a(d1.b());
    }

    public static final boolean f(@l d d0, @l Function1 function10) {
        L.p(d0, "<this>");
        L.p(function10, "builderAction");
        z z0 = new z();
        function10.invoke(z0);
        return d0.a(z0.a());
    }

    @l
    public static final c g(@l Function1 function10) {
        L.p(function10, "builderAction");
        d d0 = new d();
        function10.invoke(d0);
        return d0.b();
    }

    @l
    public static final y h(@l Function1 function10) {
        L.p(function10, "builderAction");
        z z0 = new z();
        function10.invoke(z0);
        return z0.a();
    }

    @y4.m
    public static final kotlinx.serialization.json.l i(@l z z0, @l String s, @y4.m Boolean boolean0) {
        L.p(z0, "<this>");
        L.p(s, "key");
        return z0.b(s, n.b(boolean0));
    }

    @y4.m
    public static final kotlinx.serialization.json.l j(@l z z0, @l String s, @y4.m Number number0) {
        L.p(z0, "<this>");
        L.p(s, "key");
        return z0.b(s, n.c(number0));
    }

    @y4.m
    public static final kotlinx.serialization.json.l k(@l z z0, @l String s, @y4.m String s1) {
        L.p(z0, "<this>");
        L.p(s, "key");
        return z0.b(s, n.d(s1));
    }

    @f
    @y4.m
    public static final kotlinx.serialization.json.l l(@l z z0, @l String s, @y4.m Void void0) {
        L.p(z0, "<this>");
        L.p(s, "key");
        return z0.b(s, w.c);
    }

    @y4.m
    public static final kotlinx.serialization.json.l m(@l z z0, @l String s, @l Function1 function10) {
        L.p(z0, "<this>");
        L.p(s, "key");
        L.p(function10, "builderAction");
        d d0 = new d();
        function10.invoke(d0);
        return z0.b(s, d0.b());
    }

    @y4.m
    public static final kotlinx.serialization.json.l n(@l z z0, @l String s, @l Function1 function10) {
        L.p(z0, "<this>");
        L.p(s, "key");
        L.p(function10, "builderAction");
        z z1 = new z();
        function10.invoke(z1);
        return z0.b(s, z1.a());
    }
}

