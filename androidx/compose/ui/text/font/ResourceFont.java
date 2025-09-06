package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class ResourceFont implements Font {
    private final int c;
    @l
    private final FontWeight d;
    private final int e;
    @l
    private final Settings f;
    private final int g;
    public static final int h;

    static {
    }

    private ResourceFont(int v, FontWeight fontWeight0, int v1, Settings fontVariation$Settings0, int v2) {
        this.c = v;
        this.d = fontWeight0;
        this.e = v1;
        this.f = fontVariation$Settings0;
        this.g = v2;
    }

    public ResourceFont(int v, FontWeight fontWeight0, int v1, Settings fontVariation$Settings0, int v2, int v3, w w0) {
        if((v3 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            fontVariation$Settings0 = FontVariation.a.b(fontWeight0, v1, new Setting[0]);
        }
        if((v3 & 16) != 0) {
            v2 = 2;
        }
        this(v, fontWeight0, v1, fontVariation$Settings0, v2, null);
    }

    public ResourceFont(int v, FontWeight fontWeight0, int v1, @ExperimentalTextApi Settings fontVariation$Settings0, int v2, w w0) {
        this(v, fontWeight0, v1, fontVariation$Settings0, v2);
    }

    @ExperimentalTextApi
    @l
    public final ResourceFont a(int v, @l FontWeight fontWeight0, int v1, int v2, @l Settings fontVariation$Settings0) {
        L.p(fontWeight0, "weight");
        L.p(fontVariation$Settings0, "variationSettings");
        return new ResourceFont(v, fontWeight0, v1, fontVariation$Settings0, v2, null);
    }

    @Override  // androidx.compose.ui.text.font.Font
    @l
    public FontWeight b() {
        return this.d;
    }

    @Override  // androidx.compose.ui.text.font.Font
    @ExperimentalTextApi
    public int c() {
        return this.g;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public int d() {
        return this.e;
    }

    public static ResourceFont e(ResourceFont resourceFont0, int v, FontWeight fontWeight0, int v1, int v2, Settings fontVariation$Settings0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = resourceFont0.c;
        }
        if((v3 & 2) != 0) {
            fontWeight0 = resourceFont0.b();
        }
        if((v3 & 4) != 0) {
            v1 = resourceFont0.d();
        }
        if((v3 & 8) != 0) {
            v2 = resourceFont0.c();
        }
        if((v3 & 16) != 0) {
            fontVariation$Settings0 = resourceFont0.f;
        }
        return resourceFont0.a(v, fontWeight0, v1, v2, fontVariation$Settings0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ResourceFont)) {
            return false;
        }
        if(this.c != ((ResourceFont)object0).c) {
            return false;
        }
        if(!L.g(this.b(), ((ResourceFont)object0).b())) {
            return false;
        }
        if(!FontStyle.f(this.d(), ((ResourceFont)object0).d())) {
            return false;
        }
        return L.g(this.f, ((ResourceFont)object0).f) ? FontLoadingStrategy.g(this.c(), ((ResourceFont)object0).c()) : false;
    }

    @l
    public final ResourceFont f(int v, @l FontWeight fontWeight0, int v1) {
        L.p(fontWeight0, "weight");
        return ResourceFont.e(this, v, fontWeight0, v1, this.c(), null, 16, null);
    }

    public static ResourceFont g(ResourceFont resourceFont0, int v, FontWeight fontWeight0, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = resourceFont0.c;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = resourceFont0.b();
        }
        if((v2 & 4) != 0) {
            v1 = resourceFont0.d();
        }
        return resourceFont0.f(v, fontWeight0, v1);
    }

    @ExperimentalTextApi
    public static void h() {
    }

    @Override
    public int hashCode() {
        return (((this.c * 0x1F + this.b().hashCode()) * 0x1F + this.d()) * 0x1F + this.c()) * 0x1F + this.f.hashCode();
    }

    public final int i() {
        return this.c;
    }

    @ExperimentalTextApi
    @l
    public final Settings j() {
        return this.f;
    }

    @Override
    @l
    public String toString() {
        return "ResourceFont(resId=" + this.c + ", weight=" + this.b() + ", style=" + FontStyle.i(this.d()) + ", loadingStrategy=" + FontLoadingStrategy.j(this.c()) + ')';
    }
}

