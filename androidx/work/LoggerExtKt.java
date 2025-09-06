package androidx.work;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class LoggerExtKt {
    public static final void a(@l String s, @l a a0) {
        L.p(s, "tag");
        L.p(a0, "block");
        Logger.e().a(s, ((String)a0.invoke()));
    }

    public static final void b(@l String s, @l Throwable throwable0, @l a a0) {
        L.p(s, "tag");
        L.p(throwable0, "t");
        L.p(a0, "block");
        Logger.e().b(s, ((String)a0.invoke()), throwable0);
    }

    public static final void c(@l String s, @l a a0) {
        L.p(s, "tag");
        L.p(a0, "block");
        Logger.e().c(s, ((String)a0.invoke()));
    }

    public static final void d(@l String s, @l Throwable throwable0, @l a a0) {
        L.p(s, "tag");
        L.p(throwable0, "t");
        L.p(a0, "block");
        Logger.e().d(s, ((String)a0.invoke()), throwable0);
    }

    public static final void e(@l String s, @l a a0) {
        L.p(s, "tag");
        L.p(a0, "block");
        Logger.e().f(s, ((String)a0.invoke()));
    }

    public static final void f(@l String s, @l Throwable throwable0, @l a a0) {
        L.p(s, "tag");
        L.p(throwable0, "t");
        L.p(a0, "block");
        Logger.e().g(s, ((String)a0.invoke()), throwable0);
    }
}

