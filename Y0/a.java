package y0;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.r0;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class a {
    @l
    public static final a a;
    @l
    @f
    public static final Map b;

    static {
        a.a = new a();
        a.b = Y.W(new V[]{r0.a("mkv", "video/x-matroska"), r0.a("glb", "model/gltf-binary")});
    }

    private final String a(@NonNull String s) {
        int v = v.G3(s, '.', 0, false, 6, null);
        if(v >= 0 && v != s.length() - 1) {
            String s1 = s.substring(v + 1);
            L.o(s1, "substring(...)");
            return s1;
        }
        return null;
    }

    @m
    @n
    public static final String b(@NonNull @l String s) {
        L.p(s, "path");
        String s1 = a.a.a(s);
        if(s1 != null) {
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s2 = s1.toLowerCase(locale0);
            L.o(s2, "toLowerCase(...)");
            if(s2 != null) {
                String s3 = b.b(s2);
                return s3 == null ? ((String)a.b.get(s2)) : s3;
            }
        }
        return null;
    }

    @n
    public static final boolean c(@NonNull @l String s) {
        L.p(s, "mimeType");
        return a.b.containsValue(s);
    }

    @n
    public static final boolean d(@m String s) {
        return s == null ? false : v.v2(s, "image/", false, 2, null);
    }

    @n
    public static final boolean e(@m String s) {
        return L.g(s, "model/gltf-binary");
    }

    @n
    public static final boolean f(@m String s) {
        return s == null ? false : v.v2(s, "video/", false, 2, null);
    }
}

