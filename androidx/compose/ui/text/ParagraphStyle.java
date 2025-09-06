package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@Immutable
public final class ParagraphStyle {
    @m
    private final TextAlign a;
    @m
    private final TextDirection b;
    private final long c;
    @m
    private final TextIndent d;
    @m
    private final PlatformParagraphStyle e;
    @m
    private final LineHeightStyle f;
    @m
    private final LineBreak g;
    @m
    private final Hyphens h;
    @m
    private final TextMotion i;
    private final int j;
    private final int k;
    private final int l;
    public static final int m;

    static {
    }

    private ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0) {
        this(textAlign0, textDirection0, v, textIndent0, null, null, null, null, null, null);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, int v1, w w0) {
        if((v1 & 4) != 0) {
            v = 0x7FC00000L;
        }
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), v, ((v1 & 8) == 0 ? textIndent0 : null), null);
    }

    private ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0) {
        this(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, null, null, null, null);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, int v1, w w0) {
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), ((v1 & 4) == 0 ? v : 0x7FC00000L), ((v1 & 8) == 0 ? textIndent0 : null), ((v1 & 16) == 0 ? platformParagraphStyle0 : null), ((v1 & 0x20) == 0 ? lineHeightStyle0 : null), null);
    }

    private ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0) {
        this(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, null, null);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v1, w w0) {
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), ((v1 & 4) == 0 ? v : 0x7FC00000L), ((v1 & 8) == 0 ? textIndent0 : null), ((v1 & 16) == 0 ? platformParagraphStyle0 : null), ((v1 & 0x20) == 0 ? lineHeightStyle0 : null), ((v1 & 0x40) == 0 ? lineBreak0 : null), ((v1 & 0x80) == 0 ? hyphens0 : null), null);
    }

    private ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0) {
        this.a = textAlign0;
        this.b = textDirection0;
        this.c = v;
        this.d = textIndent0;
        this.e = platformParagraphStyle0;
        this.f = lineHeightStyle0;
        this.g = lineBreak0;
        this.h = hyphens0;
        this.i = textMotion0;
        this.j = textAlign0 == null ? 5 : textAlign0.m();
        this.k = lineBreak0 == null ? 0x10301 : lineBreak0.p();
        this.l = hyphens0 == null ? 1 : hyphens0.i();
        if(!TextUnit.j(v, 0x7FC00000L) && TextUnit.n(v) < 0.0f) {
            throw new IllegalStateException(("lineHeight can\'t be negative (" + TextUnit.n(v) + ')').toString());
        }
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v1, w w0) {
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), ((v1 & 4) == 0 ? v : 0x7FC00000L), ((v1 & 8) == 0 ? textIndent0 : null), ((v1 & 16) == 0 ? platformParagraphStyle0 : null), ((v1 & 0x20) == 0 ? lineHeightStyle0 : null), ((v1 & 0x40) == 0 ? lineBreak0 : null), ((v1 & 0x80) == 0 ? hyphens0 : null), ((v1 & 0x100) == 0 ? textMotion0 : null), null);
    }

    @ExperimentalTextApi
    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, w w0) {
        this(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, w w0) {
        this(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0);
    }

    @k(level = kotlin.m.c, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, w w0) {
        this(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0);
    }

    @k(level = kotlin.m.c, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, w w0) {
        this(textAlign0, textDirection0, v, textIndent0);
    }

    @k(level = kotlin.m.c, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final ParagraphStyle a(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0) {
        return new ParagraphStyle(textAlign0, textDirection0, v, textIndent0, this.e, this.f, this.g, this.h, this.i, null);
    }

    public static ParagraphStyle b(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textAlign0 = paragraphStyle0.a;
        }
        if((v1 & 2) != 0) {
            textDirection0 = paragraphStyle0.b;
        }
        if((v1 & 4) != 0) {
            v = paragraphStyle0.c;
        }
        if((v1 & 8) != 0) {
            textIndent0 = paragraphStyle0.d;
        }
        return paragraphStyle0.a(textAlign0, textDirection0, v, textIndent0);
    }

    @ExperimentalTextApi
    @l
    public final ParagraphStyle c(@m TextAlign textAlign0, @m TextDirection textDirection0, long v, @m TextIndent textIndent0, @m PlatformParagraphStyle platformParagraphStyle0, @m LineHeightStyle lineHeightStyle0, @m LineBreak lineBreak0, @m Hyphens hyphens0, @m TextMotion textMotion0) {
        return new ParagraphStyle(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, textMotion0, null);
    }

    public static ParagraphStyle d(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v1, Object object0) {
        TextAlign textAlign1 = (v1 & 1) == 0 ? textAlign0 : paragraphStyle0.a;
        TextDirection textDirection1 = (v1 & 2) == 0 ? textDirection0 : paragraphStyle0.b;
        long v2 = (v1 & 4) == 0 ? v : paragraphStyle0.c;
        TextIndent textIndent1 = (v1 & 8) == 0 ? textIndent0 : paragraphStyle0.d;
        PlatformParagraphStyle platformParagraphStyle1 = (v1 & 16) == 0 ? platformParagraphStyle0 : paragraphStyle0.e;
        LineHeightStyle lineHeightStyle1 = (v1 & 0x20) == 0 ? lineHeightStyle0 : paragraphStyle0.f;
        LineBreak lineBreak1 = (v1 & 0x40) == 0 ? lineBreak0 : paragraphStyle0.g;
        Hyphens hyphens1 = (v1 & 0x80) == 0 ? hyphens0 : paragraphStyle0.h;
        return (v1 & 0x100) == 0 ? paragraphStyle0.c(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, hyphens1, textMotion0) : paragraphStyle0.c(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, hyphens1, paragraphStyle0.i);
    }

    @l
    public final ParagraphStyle e(@m TextAlign textAlign0, @m TextDirection textDirection0, long v, @m TextIndent textIndent0, @m PlatformParagraphStyle platformParagraphStyle0, @m LineHeightStyle lineHeightStyle0, @m LineBreak lineBreak0, @m Hyphens hyphens0) {
        return new ParagraphStyle(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, lineBreak0, hyphens0, this.i, null);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphStyle)) {
            return false;
        }
        if(!L.g(this.a, ((ParagraphStyle)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((ParagraphStyle)object0).b)) {
            return false;
        }
        if(!TextUnit.j(this.c, ((ParagraphStyle)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((ParagraphStyle)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((ParagraphStyle)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((ParagraphStyle)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((ParagraphStyle)object0).g)) {
            return false;
        }
        return L.g(this.h, ((ParagraphStyle)object0).h) ? L.g(this.i, ((ParagraphStyle)object0).i) : false;
    }

    public static ParagraphStyle f(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v1, Object object0) {
        TextAlign textAlign1 = (v1 & 1) == 0 ? textAlign0 : paragraphStyle0.a;
        TextDirection textDirection1 = (v1 & 2) == 0 ? textDirection0 : paragraphStyle0.b;
        long v2 = (v1 & 4) == 0 ? v : paragraphStyle0.c;
        TextIndent textIndent1 = (v1 & 8) == 0 ? textIndent0 : paragraphStyle0.d;
        PlatformParagraphStyle platformParagraphStyle1 = (v1 & 16) == 0 ? platformParagraphStyle0 : paragraphStyle0.e;
        LineHeightStyle lineHeightStyle1 = (v1 & 0x20) == 0 ? lineHeightStyle0 : paragraphStyle0.f;
        LineBreak lineBreak1 = (v1 & 0x40) == 0 ? lineBreak0 : paragraphStyle0.g;
        return (v1 & 0x80) == 0 ? paragraphStyle0.e(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, hyphens0) : paragraphStyle0.e(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, paragraphStyle0.h);
    }

    @k(level = kotlin.m.c, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final ParagraphStyle g(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0) {
        return new ParagraphStyle(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, this.g, this.h, this.i, null);
    }

    public static ParagraphStyle h(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textAlign0 = paragraphStyle0.a;
        }
        if((v1 & 2) != 0) {
            textDirection0 = paragraphStyle0.b;
        }
        if((v1 & 4) != 0) {
            v = paragraphStyle0.c;
        }
        if((v1 & 8) != 0) {
            textIndent0 = paragraphStyle0.d;
        }
        if((v1 & 16) != 0) {
            platformParagraphStyle0 = paragraphStyle0.e;
        }
        if((v1 & 0x20) != 0) {
            lineHeightStyle0 = paragraphStyle0.f;
        }
        return paragraphStyle0.g(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : TextAlign.k(this.a.m());
        int v2 = this.b == null ? 0 : TextDirection.j(this.b.l());
        int v3 = TextUnit.o(this.c);
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = this.g == null ? 0 : LineBreak.n(this.g.p());
        int v8 = this.h == null ? 0 : Hyphens.g(this.h.i());
        TextMotion textMotion0 = this.i;
        if(textMotion0 != null) {
            v = textMotion0.hashCode();
        }
        return (((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v;
    }

    @m
    public final Hyphens i() {
        return this.h;
    }

    public final int j() {
        return this.l;
    }

    @m
    public final LineBreak k() {
        return this.g;
    }

    public final int l() {
        return this.k;
    }

    public final long m() {
        return this.c;
    }

    @m
    public final LineHeightStyle n() {
        return this.f;
    }

    @m
    public final PlatformParagraphStyle o() {
        return this.e;
    }

    @m
    public final TextAlign p() {
        return this.a;
    }

    public final int q() {
        return this.j;
    }

    @m
    public final TextDirection r() {
        return this.b;
    }

    @m
    public final TextIndent s() {
        return this.d;
    }

    @ExperimentalTextApi
    @m
    public final TextMotion t() {
        return this.i;
    }

    @Override
    @l
    public String toString() {
        return "ParagraphStyle(textAlign=" + this.a + ", textDirection=" + this.b + ", lineHeight=" + TextUnit.u(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + this.g + ", hyphens=" + this.h + ", textMotion=" + this.i + ')';
    }

    @ExperimentalTextApi
    public static void u() {
    }

    // 去混淆评级： 低(22)
    @Stable
    @l
    public final ParagraphStyle v(@m ParagraphStyle paragraphStyle0) {
        if(paragraphStyle0 == null) {
            return this;
        }
        PlatformParagraphStyle platformParagraphStyle0 = this.x(paragraphStyle0.e);
        return new ParagraphStyle((paragraphStyle0.a == null ? this.a : paragraphStyle0.a), (paragraphStyle0.b == null ? this.b : paragraphStyle0.b), (TextUnitKt.s(paragraphStyle0.c) ? this.c : paragraphStyle0.c), (paragraphStyle0.d == null ? this.d : paragraphStyle0.d), platformParagraphStyle0, (paragraphStyle0.f == null ? this.f : paragraphStyle0.f), (paragraphStyle0.g == null ? this.g : paragraphStyle0.g), (paragraphStyle0.h == null ? this.h : paragraphStyle0.h), (paragraphStyle0.i == null ? this.i : paragraphStyle0.i), null);
    }

    public static ParagraphStyle w(ParagraphStyle paragraphStyle0, ParagraphStyle paragraphStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            paragraphStyle1 = null;
        }
        return paragraphStyle0.v(paragraphStyle1);
    }

    private final PlatformParagraphStyle x(PlatformParagraphStyle platformParagraphStyle0) {
        PlatformParagraphStyle platformParagraphStyle1 = this.e;
        if(platformParagraphStyle1 == null) {
            return platformParagraphStyle0;
        }
        return platformParagraphStyle0 == null ? platformParagraphStyle1 : platformParagraphStyle1.e(platformParagraphStyle0);
    }

    @Stable
    @l
    public final ParagraphStyle y(@l ParagraphStyle paragraphStyle0) {
        L.p(paragraphStyle0, "other");
        return this.v(paragraphStyle0);
    }
}

