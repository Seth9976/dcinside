package kotlin.text;

import java.nio.charset.Charset;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import z3.i;

@i(name = "CharsetsKt")
public final class g {
    @f
    private static final Charset a(String s) {
        L.p(s, "charsetName");
        Charset charset0 = Charset.forName(s);
        L.o(charset0, "forName(...)");
        return charset0;
    }
}

