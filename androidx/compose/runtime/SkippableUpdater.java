package androidx.compose.runtime;

import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import z3.g;

@g
public final class SkippableUpdater {
    @l
    private final Composer a;

    private SkippableUpdater(Composer composer0) {
        this.a = composer0;
    }

    public static final SkippableUpdater a(Composer composer0) {
        return new SkippableUpdater(composer0);
    }

    @l
    public static Composer b(@l Composer composer0) {
        L.p(composer0, "composer");
        return composer0;
    }

    // 去混淆评级： 低(20)
    public static boolean c(Composer composer0, Object object0) {
        return object0 instanceof SkippableUpdater ? L.g(composer0, ((SkippableUpdater)object0).h()) : false;
    }

    public static final boolean d(Composer composer0, Composer composer1) {
        return L.g(composer0, composer1);
    }

    @b0
    public static void e() {
    }

    @Override
    public boolean equals(Object object0) {
        return SkippableUpdater.c(this.a, object0);
    }

    public static int f(Composer composer0) {
        return composer0.hashCode();
    }

    public static String g(Composer composer0) [...] // Inlined contents

    public final Composer h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return SkippableUpdater.f(this.a);
    }

    public static final void i(Composer composer0, @l Function1 function10) {
        L.p(function10, "block");
        composer0.V(509942095);
        function10.invoke(Updater.a(Updater.b(composer0)));
        composer0.g0();
    }

    @Override
    public String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}

