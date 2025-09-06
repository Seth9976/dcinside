package i1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.common.util.h;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.decoder.c;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.k;
import com.facebook.imagepipeline.image.r;
import j..util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nXmlFormatDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlFormatDecoder.kt\ncom/facebook/imagepipeline/xml/XmlFormatDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,72:1\n1#2:73\n381#3,7:74\n*S KotlinDebug\n*F\n+ 1 XmlFormatDecoder.kt\ncom/facebook/imagepipeline/xml/XmlFormatDecoder\n*L\n45#1:74,7\n*E\n"})
public final class b implements c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final Resources a;
    @l
    private final Map b;
    @l
    public static final a c = null;
    @l
    private static final String d = "XmlFormatDecoder";

    static {
        b.c = new a(null);
    }

    public b(@l Resources resources0) {
        L.p(resources0, "resources");
        super();
        this.a = resources0;
        this.b = new ConcurrentHashMap();
    }

    @Override  // com.facebook.imagepipeline.decoder.c
    @m
    public e a(@l com.facebook.imagepipeline.image.l l0, int v, @l r r0, @l d d0) {
        L.p(l0, "encodedImage");
        L.p(r0, "qualityInfo");
        L.p(d0, "options");
        try {
            String s = l0.s();
            if(s == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            int v1 = this.b(s);
            Drawable drawable0 = ResourcesCompat.g(this.a, v1, null);
            if(drawable0 != null) {
                return new k(drawable0);
            }
        }
        catch(Throwable throwable0) {
            x0.a.v("XmlFormatDecoder", "Cannot decode xml", throwable0);
        }
        return null;
    }

    private final int b(String s) {
        Map map0 = this.b;
        Integer integer0 = map0.get(s);
        if(integer0 == null) {
            Uri uri0 = Uri.parse(s);
            L.o(uri0, "parse(...)");
            integer0 = this.c(uri0);
            map0.put(s, integer0);
        }
        return integer0.intValue();
    }

    private final int c(Uri uri0) {
        if(!h.p(uri0) && !h.r(uri0)) {
            throw new IllegalStateException(("Unsupported uri " + uri0).toString());
        }
        List list0 = uri0.getPathSegments();
        L.o(list0, "getPathSegments(...)");
        String s = (String)u.v3(list0);
        if(s != null) {
            Integer integer0 = v.b1(s);
            if(integer0 != null) {
                return (int)integer0;
            }
        }
        throw new IllegalStateException(("Unable to read resource ID from " + uri0.getPath()).toString());
    }
}

