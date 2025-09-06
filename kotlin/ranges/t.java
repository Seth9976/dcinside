package kotlin.ranges;

import kotlin.W0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.r;
import y4.l;

class t {
    public static final void a(boolean z, @l Number number0) {
        L.p(number0, "step");
        if(!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number0 + '.');
        }
    }

    @h0(version = "1.3")
    @f
    private static final boolean b(g g0, Object object0) {
        L.p(g0, "<this>");
        return object0 != null && g0.a(((Comparable)object0));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @f
    private static final boolean c(kotlin.ranges.r r0, Object object0) {
        L.p(r0, "<this>");
        return object0 != null && r0.a(((Comparable)object0));
    }

    @h0(version = "1.1")
    @l
    public static final kotlin.ranges.f d(double f, double f1) {
        return new d(f, f1);
    }

    @h0(version = "1.1")
    @l
    public static kotlin.ranges.f e(float f, float f1) {
        return new e(f, f1);
    }

    @l
    public static final g f(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "<this>");
        L.p(comparable1, "that");
        return new i(comparable0, comparable1);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @l
    public static final kotlin.ranges.r g(double f, double f1) {
        return new p(f, f1);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @l
    public static final kotlin.ranges.r h(float f, float f1) {
        return new q(f, f1);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @l
    public static final kotlin.ranges.r i(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "<this>");
        L.p(comparable1, "that");
        return new h(comparable0, comparable1);
    }
}

