package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

public final class f {
    @l
    public static final f a;
    @l
    @z3.f
    public static final Charset b;
    @l
    @z3.f
    public static final Charset c;
    @l
    @z3.f
    public static final Charset d;
    @l
    @z3.f
    public static final Charset e;
    @l
    @z3.f
    public static final Charset f;
    @l
    @z3.f
    public static final Charset g;
    @m
    private static volatile Charset h;
    @m
    private static volatile Charset i;
    @m
    private static volatile Charset j;

    static {
        f.a = new f();
        Charset charset0 = Charset.forName("UTF-8");
        L.o(charset0, "forName(...)");
        f.b = charset0;
        Charset charset1 = Charset.forName("UTF-16");
        L.o(charset1, "forName(...)");
        f.c = charset1;
        Charset charset2 = Charset.forName("UTF-16BE");
        L.o(charset2, "forName(...)");
        f.d = charset2;
        Charset charset3 = Charset.forName("UTF-16LE");
        L.o(charset3, "forName(...)");
        f.e = charset3;
        Charset charset4 = Charset.forName("US-ASCII");
        L.o(charset4, "forName(...)");
        f.f = charset4;
        Charset charset5 = Charset.forName("ISO-8859-1");
        L.o(charset5, "forName(...)");
        f.g = charset5;
    }

    @l
    @i(name = "UTF32")
    public final Charset a() {
        Charset charset0 = f.h;
        if(charset0 == null) {
            charset0 = Charset.forName("UTF-32");
            L.o(charset0, "forName(...)");
            f.h = charset0;
        }
        return charset0;
    }

    @l
    @i(name = "UTF32_BE")
    public final Charset b() {
        Charset charset0 = f.j;
        if(charset0 == null) {
            charset0 = Charset.forName("UTF-32BE");
            L.o(charset0, "forName(...)");
            f.j = charset0;
        }
        return charset0;
    }

    @l
    @i(name = "UTF32_LE")
    public final Charset c() {
        Charset charset0 = f.i;
        if(charset0 == null) {
            charset0 = Charset.forName("UTF-32LE");
            L.o(charset0, "forName(...)");
            f.i = charset0;
        }
        return charset0;
    }
}

