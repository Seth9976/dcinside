package kotlin.io.encoding;

import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;

public final class b {
    @h0(version = "1.8")
    @f
    @kotlin.io.encoding.f
    private static final byte[] a(a a0, CharSequence charSequence0, int v, int v1) {
        L.p(a0, "<this>");
        L.p(charSequence0, "source");
        if(charSequence0 instanceof String) {
            a0.g(charSequence0.length(), v, v1);
            String s = ((String)charSequence0).substring(v, v1);
            L.o(s, "substring(...)");
            L.n(s, "null cannot be cast to non-null type java.lang.String");
            byte[] arr_b = s.getBytes(kotlin.text.f.g);
            L.o(arr_b, "getBytes(...)");
            return arr_b;
        }
        return a0.e(charSequence0, v, v1);
    }

    @h0(version = "1.8")
    @f
    @kotlin.io.encoding.f
    private static final int b(a a0, byte[] arr_b, byte[] arr_b1, int v, int v1, int v2) {
        L.p(a0, "<this>");
        L.p(arr_b, "source");
        L.p(arr_b1, "destination");
        return a0.v(arr_b, arr_b1, v, v1, v2);
    }

    @h0(version = "1.8")
    @f
    @kotlin.io.encoding.f
    private static final byte[] c(a a0, byte[] arr_b, int v, int v1) {
        L.p(a0, "<this>");
        L.p(arr_b, "source");
        return a0.B(arr_b, v, v1);
    }

    @h0(version = "1.8")
    @f
    @kotlin.io.encoding.f
    private static final String d(a a0, byte[] arr_b, int v, int v1) {
        L.p(a0, "<this>");
        L.p(arr_b, "source");
        return new String(a0.B(arr_b, v, v1), kotlin.text.f.g);
    }
}

