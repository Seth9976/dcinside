package io.realm.gradle;

import kotlin.jvm.internal.L;
import org.slf4j.a;
import org.slf4j.b;
import y4.l;

public final class c {
    @l
    private static final a a = null;
    @l
    public static final String b = "androidTestImplementation";

    static {
        a a0 = b.j("realm-logger");
        L.o(a0, "getLogger(\"realm-logger\")");
        c.a = a0;
    }

    @l
    public static final a a() {
        return c.a;
    }
}

