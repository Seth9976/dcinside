package androidx.navigation;

import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import y4.l;
import y4.m;
import z3.b;

public final class NavigatorProviderKt {
    @l
    public static final Navigator a(@l NavigatorProvider navigatorProvider0, @l String s) {
        L.p(navigatorProvider0, "<this>");
        L.p(s, "name");
        return navigatorProvider0.f(s);
    }

    @l
    public static final Navigator b(@l NavigatorProvider navigatorProvider0, @l d d0) {
        L.p(navigatorProvider0, "<this>");
        L.p(d0, "clazz");
        return navigatorProvider0.e(b.e(d0));
    }

    public static final void c(@l NavigatorProvider navigatorProvider0, @l Navigator navigator0) {
        L.p(navigatorProvider0, "<this>");
        L.p(navigator0, "navigator");
        navigatorProvider0.b(navigator0);
    }

    @m
    public static final Navigator d(@l NavigatorProvider navigatorProvider0, @l String s, @l Navigator navigator0) {
        L.p(navigatorProvider0, "<this>");
        L.p(s, "name");
        L.p(navigator0, "navigator");
        return navigatorProvider0.c(s, navigator0);
    }
}

