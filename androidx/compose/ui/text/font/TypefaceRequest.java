package androidx.compose.ui.text.font;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class TypefaceRequest {
    @m
    private final FontFamily a;
    @l
    private final FontWeight b;
    private final int c;
    private final int d;
    @m
    private final Object e;

    private TypefaceRequest(FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, Object object0) {
        this.a = fontFamily0;
        this.b = fontWeight0;
        this.c = v;
        this.d = v1;
        this.e = object0;
    }

    public TypefaceRequest(FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, Object object0, w w0) {
        this(fontFamily0, fontWeight0, v, v1, object0);
    }

    @m
    public final FontFamily a() {
        return this.a;
    }

    @l
    public final FontWeight b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @m
    public final Object e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TypefaceRequest)) {
            return false;
        }
        if(!L.g(this.a, ((TypefaceRequest)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((TypefaceRequest)object0).b)) {
            return false;
        }
        if(!FontStyle.f(this.c, ((TypefaceRequest)object0).c)) {
            return false;
        }
        return FontSynthesis.h(this.d, ((TypefaceRequest)object0).d) ? L.g(this.e, ((TypefaceRequest)object0).e) : false;
    }

    @l
    public final TypefaceRequest f(@m FontFamily fontFamily0, @l FontWeight fontWeight0, int v, int v1, @m Object object0) {
        L.p(fontWeight0, "fontWeight");
        return new TypefaceRequest(fontFamily0, fontWeight0, v, v1, object0, null);
    }

    public static TypefaceRequest g(TypefaceRequest typefaceRequest0, FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, Object object0, int v2, Object object1) {
        if((v2 & 1) != 0) {
            fontFamily0 = typefaceRequest0.a;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = typefaceRequest0.b;
        }
        if((v2 & 4) != 0) {
            v = typefaceRequest0.c;
        }
        if((v2 & 8) != 0) {
            v1 = typefaceRequest0.d;
        }
        if((v2 & 16) != 0) {
            object0 = typefaceRequest0.e;
        }
        return typefaceRequest0.f(fontFamily0, fontWeight0, v, v1, object0);
    }

    @m
    public final FontFamily h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b.hashCode();
        int v3 = this.c;
        int v4 = this.d;
        Object object0 = this.e;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    public final int i() {
        return this.c;
    }

    public final int j() {
        return this.d;
    }

    @l
    public final FontWeight k() {
        return this.b;
    }

    @m
    public final Object l() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + FontStyle.i(this.c) + ", fontSynthesis=" + FontSynthesis.l(this.d) + ", resourceLoaderCacheKey=" + this.e + ')';
    }
}

