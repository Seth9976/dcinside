package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class MutableSpanStyle {
    private long a;
    private long b;
    @m
    private FontWeight c;
    @m
    private FontStyle d;
    @m
    private FontSynthesis e;
    @m
    private FontFamily f;
    @m
    private String g;
    private long h;
    @m
    private BaselineShift i;
    @m
    private TextGeometricTransform j;
    @m
    private LocaleList k;
    private long l;
    @m
    private TextDecoration m;
    @m
    private Shadow n;

    private MutableSpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0) {
        this.a = v;
        this.b = v1;
        this.c = fontWeight0;
        this.d = fontStyle0;
        this.e = fontSynthesis0;
        this.f = fontFamily0;
        this.g = s;
        this.h = v2;
        this.i = baselineShift0;
        this.j = textGeometricTransform0;
        this.k = localeList0;
        this.l = v3;
        this.m = textDecoration0;
        this.n = shadow0;
    }

    // 去混淆评级： 低(40)
    public MutableSpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, int v4, w w0) {
        this(((v4 & 1) == 0 ? v : 16L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 16L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), null);
    }

    public MutableSpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, w w0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0);
    }

    public final void A(@m TextDecoration textDecoration0) {
        this.m = textDecoration0;
    }

    public final void B(@m TextGeometricTransform textGeometricTransform0) {
        this.j = textGeometricTransform0;
    }

    @l
    public final SpanStyle C() {
        return new SpanStyle(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, null);
    }

    public final long a() {
        return this.l;
    }

    @m
    public final BaselineShift b() {
        return this.i;
    }

    public final long c() {
        return this.a;
    }

    @m
    public final FontFamily d() {
        return this.f;
    }

    @m
    public final String e() {
        return this.g;
    }

    public final long f() {
        return this.b;
    }

    @m
    public final FontStyle g() {
        return this.d;
    }

    @m
    public final FontSynthesis h() {
        return this.e;
    }

    @m
    public final FontWeight i() {
        return this.c;
    }

    public final long j() {
        return this.h;
    }

    @m
    public final LocaleList k() {
        return this.k;
    }

    @m
    public final Shadow l() {
        return this.n;
    }

    @m
    public final TextDecoration m() {
        return this.m;
    }

    @m
    public final TextGeometricTransform n() {
        return this.j;
    }

    public final void o(long v) {
        this.l = v;
    }

    public final void p(@m BaselineShift baselineShift0) {
        this.i = baselineShift0;
    }

    public final void q(long v) {
        this.a = v;
    }

    public final void r(@m FontFamily fontFamily0) {
        this.f = fontFamily0;
    }

    public final void s(@m String s) {
        this.g = s;
    }

    public final void t(long v) {
        this.b = v;
    }

    public final void u(@m FontStyle fontStyle0) {
        this.d = fontStyle0;
    }

    public final void v(@m FontSynthesis fontSynthesis0) {
        this.e = fontSynthesis0;
    }

    public final void w(@m FontWeight fontWeight0) {
        this.c = fontWeight0;
    }

    public final void x(long v) {
        this.h = v;
    }

    public final void y(@m LocaleList localeList0) {
        this.k = localeList0;
    }

    public final void z(@m Shadow shadow0) {
        this.n = shadow0;
    }
}

