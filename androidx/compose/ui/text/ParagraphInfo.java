package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class ParagraphInfo {
    @l
    private final Paragraph a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    private float f;
    private float g;

    public ParagraphInfo(@l Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1) {
        L.p(paragraph0, "paragraph");
        super();
        this.a = paragraph0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = f;
        this.g = f1;
    }

    public ParagraphInfo(Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1, int v4, w w0) {
        this(paragraph0, v, v1, ((v4 & 8) == 0 ? v2 : -1), ((v4 & 16) == 0 ? v3 : -1), ((v4 & 0x20) == 0 ? f : -1.0f), ((v4 & 0x40) == 0 ? f1 : -1.0f));
    }

    public final float A(float f) {
        return f + this.f;
    }

    public final long B(long v) {
        return OffsetKt.a(Offset.p(v), Offset.r(v) - this.f);
    }

    public final int C(int v) {
        return s.I(v, this.b, this.c) - this.b;
    }

    public final int D(int v) {
        return v - this.d;
    }

    public final float E(float f) {
        return f - this.f;
    }

    @l
    public final Paragraph a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphInfo)) {
            return false;
        }
        if(!L.g(this.a, ((ParagraphInfo)object0).a)) {
            return false;
        }
        if(this.b != ((ParagraphInfo)object0).b) {
            return false;
        }
        if(this.c != ((ParagraphInfo)object0).c) {
            return false;
        }
        if(this.d != ((ParagraphInfo)object0).d) {
            return false;
        }
        if(this.e != ((ParagraphInfo)object0).e) {
            return false;
        }
        return Float.compare(this.f, ((ParagraphInfo)object0).f) == 0 ? Float.compare(this.g, ((ParagraphInfo)object0).g) == 0 : false;
    }

    public final float f() {
        return this.f;
    }

    public final float g() {
        return this.g;
    }

    @l
    public final ParagraphInfo h(@l Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1) {
        L.p(paragraph0, "paragraph");
        return new ParagraphInfo(paragraph0, v, v1, v2, v3, f, f1);
    }

    @Override
    public int hashCode() {
        return (((((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + Float.floatToIntBits(this.f)) * 0x1F + Float.floatToIntBits(this.g);
    }

    public static ParagraphInfo i(ParagraphInfo paragraphInfo0, Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1, int v4, Object object0) {
        if((v4 & 1) != 0) {
            paragraph0 = paragraphInfo0.a;
        }
        if((v4 & 2) != 0) {
            v = paragraphInfo0.b;
        }
        if((v4 & 4) != 0) {
            v1 = paragraphInfo0.c;
        }
        if((v4 & 8) != 0) {
            v2 = paragraphInfo0.d;
        }
        if((v4 & 16) != 0) {
            v3 = paragraphInfo0.e;
        }
        if((v4 & 0x20) != 0) {
            f = paragraphInfo0.f;
        }
        if((v4 & 0x40) != 0) {
            f1 = paragraphInfo0.g;
        }
        return paragraphInfo0.h(paragraph0, v, v1, v2, v3, f, f1);
    }

    public final float j() {
        return this.g;
    }

    public final int k() {
        return this.c;
    }

    public final int l() {
        return this.e;
    }

    public final int m() {
        return this.c - this.b;
    }

    @l
    public final Paragraph n() {
        return this.a;
    }

    public final int o() {
        return this.b;
    }

    public final int p() {
        return this.d;
    }

    public final float q() {
        return this.f;
    }

    public final void r(float f) {
        this.g = f;
    }

    public final void s(int v) {
        this.e = v;
    }

    public final void t(int v) {
        this.d = v;
    }

    @Override
    @l
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }

    public final void u(float f) {
        this.f = f;
    }

    @l
    public final Rect v(@l Rect rect0) {
        L.p(rect0, "<this>");
        return rect0.S(OffsetKt.a(0.0f, this.f));
    }

    @l
    public final Path w(@l Path path0) {
        L.p(path0, "<this>");
        path0.f(OffsetKt.a(0.0f, this.f));
        return path0;
    }

    public final long x(long v) {
        return TextRangeKt.b(this.y(((int)(v >> 0x20))), this.y(((int)(v & 0xFFFFFFFFL))));
    }

    public final int y(int v) {
        return v + this.b;
    }

    public final int z(int v) {
        return v + this.d;
    }
}

