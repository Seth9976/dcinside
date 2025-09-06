package W0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

@s0({"SMAP\nImageSourceProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSourceProvider.kt\ncom/facebook/fresco/vito/source/ImageSourceProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
public final class h {
    @l
    public static final h a;
    @l
    private static Function1 b;

    static {
        h.a = new h();
        h.b = (String s) -> {
            L.p(s, "it");
            Uri uri0 = Uri.parse(s);
            L.o(uri0, "parse(...)");
            return uri0;
        };
    }

    @l
    @n
    public static final e b(@l Bitmap bitmap0) {
        L.p(bitmap0, "bitmap");
        return new a(bitmap0);
    }

    @l
    @n
    public static final e c(@l Drawable drawable0) {
        L.p(drawable0, "drawable");
        return new b(drawable0);
    }

    @l
    @n
    public static final e d() {
        return c.a;
    }

    @l
    @n
    public static final e e(@l e[] arr_e) {
        L.p(arr_e, "imageSources");
        return new d(arr_e);
    }

    @l
    @j
    @n
    public static final e f(@m Uri uri0) {
        return h.j(uri0, null, 2, null);
    }

    @l
    @j
    @n
    public static final e g(@m Uri uri0, @m Map map0) {
        if(uri0 == null) {
            return h.d();
        }
        Map map1 = Y.g();
        if(map0 != null) {
            map1.putAll(map0);
        }
        map1.put("uri_source", uri0);
        return new W0.l(uri0, Y.d(map1));
    }

    @l
    @j
    @n
    public static final e h(@m String s) {
        return h.k(s, null, 2, null);
    }

    @l
    @j
    @n
    public static final e i(@m String s, @m Map map0) {
        return s == null ? h.g(null, map0) : h.g(((Uri)h.b.invoke(s)), map0);
    }

    public static e j(Uri uri0, Map map0, int v, Object object0) {
        if((v & 2) != 0) {
            map0 = null;
        }
        return h.g(uri0, map0);
    }

    public static e k(String s, Map map0, int v, Object object0) {
        if((v & 2) != 0) {
            map0 = null;
        }
        return h.i(s, map0);
    }

    @l
    public final Function1 l() {
        return h.b;
    }

    @l
    @n
    public static final e m(@l e e0, @l e e1) {
        L.p(e0, "lowResImageSource");
        L.p(e1, "highResImageSource");
        return new i(e0, e1, null);
    }

    @l
    @n
    public static final e n(@l e e0, @l e e1, @m Map map0) {
        L.p(e0, "lowResImageSource");
        L.p(e1, "highResImageSource");
        return new i(e0, e1, map0);
    }

    @l
    @n
    public static final e o(@m Uri uri0, @m Uri uri1) {
        return uri0 == null ? h.j(uri1, null, 2, null) : new i(h.j(uri0, null, 2, null), h.j(uri1, null, 2, null), null, 4, null);
    }

    public static e p(e e0, e e1, Map map0, int v, Object object0) {
        if((v & 4) != 0) {
            map0 = null;
        }
        return h.n(e0, e1, map0);
    }

    public final void q(@l Function1 function10) {
        L.p(function10, "<set-?>");
        h.b = function10;
    }

    // 检测为 Lambda 实现
    private static final Uri r(String s) [...]
}

