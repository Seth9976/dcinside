package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class TextLayoutResult {
    @l
    private final TextLayoutInput a;
    @l
    private final MultiParagraph b;
    private final long c;
    private final float d;
    private final float e;
    @l
    private final List f;
    public static final int g = 8;

    static {
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput0, MultiParagraph multiParagraph0, long v) {
        this.a = textLayoutInput0;
        this.b = multiParagraph0;
        this.c = v;
        this.d = multiParagraph0.f();
        this.e = multiParagraph0.j();
        this.f = multiParagraph0.D();
    }

    public TextLayoutResult(TextLayoutInput textLayoutInput0, MultiParagraph multiParagraph0, long v, w w0) {
        this(textLayoutInput0, multiParagraph0, v);
    }

    @l
    public final List A() {
        return this.f;
    }

    public final long B() {
        return this.c;
    }

    public final long C(int v) {
        return this.b.F(v);
    }

    public final boolean D(int v) {
        return this.b.G(v);
    }

    @l
    public final TextLayoutResult a(@l TextLayoutInput textLayoutInput0, long v) {
        L.p(textLayoutInput0, "layoutInput");
        return new TextLayoutResult(textLayoutInput0, this.b, v, null);
    }

    public static TextLayoutResult b(TextLayoutResult textLayoutResult0, TextLayoutInput textLayoutInput0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textLayoutInput0 = textLayoutResult0.a;
        }
        if((v1 & 2) != 0) {
            v = textLayoutResult0.c;
        }
        return textLayoutResult0.a(textLayoutInput0, v);
    }

    @l
    public final ResolvedTextDirection c(int v) {
        return this.b.b(v);
    }

    @l
    public final Rect d(int v) {
        return this.b.c(v);
    }

    @l
    public final Rect e(int v) {
        return this.b.d(v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextLayoutResult)) {
            return false;
        }
        if(!L.g(this.a, ((TextLayoutResult)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((TextLayoutResult)object0).b)) {
            return false;
        }
        return IntSize.h(this.c, ((TextLayoutResult)object0).c) ? this.d == ((TextLayoutResult)object0).d && this.e == ((TextLayoutResult)object0).e && L.g(this.f, ((TextLayoutResult)object0).f) : false;
    }

    public final boolean f() {
        return this.b.e() || ((float)(((int)(this.c & 0xFFFFFFFFL)))) < this.b.g();
    }

    public final boolean g() {
        return ((float)(((int)(this.c >> 0x20)))) < this.b.E();
    }

    public final float h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + IntSize.n(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + this.f.hashCode();
    }

    // 去混淆评级： 低(20)
    public final boolean i() {
        return this.g() || this.f();
    }

    public final float j(int v, boolean z) {
        return this.b.h(v, z);
    }

    public final float k() {
        return this.e;
    }

    @l
    public final TextLayoutInput l() {
        return this.a;
    }

    public final float m(int v) {
        return this.b.k(v);
    }

    public final int n() {
        return this.b.l();
    }

    public final int o(int v, boolean z) {
        return this.b.m(v, z);
    }

    public static int p(TextLayoutResult textLayoutResult0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayoutResult0.o(v, z);
    }

    public final int q(int v) {
        return this.b.o(v);
    }

    public final int r(float f) {
        return this.b.p(f);
    }

    public final float s(int v) {
        return this.b.r(v);
    }

    public final float t(int v) {
        return this.b.s(v);
    }

    @Override
    @l
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + IntSize.p(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }

    public final int u(int v) {
        return this.b.t(v);
    }

    public final float v(int v) {
        return this.b.u(v);
    }

    @l
    public final MultiParagraph w() {
        return this.b;
    }

    public final int x(long v) {
        return this.b.z(v);
    }

    @l
    public final ResolvedTextDirection y(int v) {
        return this.b.A(v);
    }

    @l
    public final Path z(int v, int v1) {
        return this.b.C(v, v1);
    }
}

