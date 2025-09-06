package androidx.compose.ui.text;

import A3.a;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak.Strategy;
import androidx.compose.ui.text.style.LineBreak.Strictness;
import androidx.compose.ui.text.style.LineBreak.WordBreak;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,621:1\n1#2:622\n13579#3,2:623\n11335#3:625\n11670#3,3:626\n26#4:629\n26#4:630\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n204#1:623,2\n244#1:625\n244#1:626,3\n439#1:629\n443#1:630\n*E\n"})
public final class AndroidParagraph implements Paragraph {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[ResolvedTextDirection.values().length];
            try {
                arr_v[ResolvedTextDirection.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ResolvedTextDirection.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final AndroidParagraphIntrinsics a;
    private final int b;
    private final boolean c;
    private final long d;
    @l
    private final TextLayout e;
    @l
    private final CharSequence f;
    @l
    private final List g;
    @l
    private final D h;

    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics0, int v, boolean z, long v1) {
        List list0;
        Rect rect0;
        float f2;
        float f;
        this.a = androidParagraphIntrinsics0;
        this.b = v;
        this.c = z;
        this.d = v1;
        if(Constraints.q(v1) != 0 || Constraints.r(v1) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if(v < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle textStyle0 = androidParagraphIntrinsics0.l();
        this.f = AndroidParagraph_androidKt.k(textStyle0, z) ? AndroidParagraph_androidKt.i(androidParagraphIntrinsics0.f()) : androidParagraphIntrinsics0.f();
        int v2 = AndroidParagraph_androidKt.l(textStyle0.K());
        TextAlign textAlign0 = textStyle0.K();
        boolean z1 = textAlign0 == null ? false : TextAlign.j(textAlign0.m(), 4);
        int v3 = AndroidParagraph_androidKt.n(textStyle0.G().i());
        LineBreak lineBreak0 = textStyle0.C();
        int v4 = AndroidParagraph_androidKt.m((lineBreak0 == null ? null : Strategy.d(LineBreak.k(lineBreak0.p()))));
        LineBreak lineBreak1 = textStyle0.C();
        int v5 = AndroidParagraph_androidKt.o((lineBreak1 == null ? null : Strictness.e(LineBreak.l(lineBreak1.p()))));
        LineBreak lineBreak2 = textStyle0.C();
        int v6 = AndroidParagraph_androidKt.p((lineBreak2 == null ? null : WordBreak.c(LineBreak.m(lineBreak2.p()))));
        TextUtils.TruncateAt textUtils$TruncateAt0 = z ? TextUtils.TruncateAt.END : null;
        TextLayout textLayout0 = this.E(v2, ((int)z1), textUtils$TruncateAt0, v, v3, v4, v5, v6);
        if(z && textLayout0.g() > Constraints.o(v1) && v > 1) {
            int v7 = AndroidParagraph_androidKt.j(textLayout0, Constraints.o(v1));
            if(v7 >= 0 && v7 != v) {
                textLayout0 = this.E(v2, ((int)z1), textUtils$TruncateAt0, s.u(v7, 1), v3, v4, v5, v6);
            }
        }
        this.e = textLayout0;
        this.S().f(textStyle0.p(), SizeKt.a(this.getWidth(), this.getHeight()), textStyle0.l());
        ShaderBrushSpan[] arr_shaderBrushSpan = this.P(this.e);
        for(int v8 = 0; v8 < arr_shaderBrushSpan.length; ++v8) {
            arr_shaderBrushSpan[v8].d(SizeKt.a(this.getWidth(), this.getHeight()));
        }
        CharSequence charSequence0 = this.f;
        if(charSequence0 instanceof Spanned) {
            Object[] arr_object = ((Spanned)charSequence0).getSpans(0, charSequence0.length(), PlaceholderSpan.class);
            L.o(arr_object, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList0 = new ArrayList(arr_object.length);
            for(int v9 = 0; v9 < arr_object.length; ++v9) {
                PlaceholderSpan placeholderSpan0 = (PlaceholderSpan)arr_object[v9];
                int v10 = ((Spanned)charSequence0).getSpanStart(placeholderSpan0);
                int v11 = ((Spanned)charSequence0).getSpanEnd(placeholderSpan0);
                int v12 = this.e.v(v10);
                if(this.e.s(v12) > 0 && v11 > this.e.t(v12) || v11 > this.e.u(v12) || v12 >= this.b) {
                    rect0 = null;
                }
                else {
                    switch(this.z(v10)) {
                        case 1: {
                            f = this.v(v10, true);
                            break;
                        }
                        case 2: {
                            f = this.v(v10, true) - ((float)placeholderSpan0.d());
                            break;
                        }
                        default: {
                            throw new J();
                        }
                    }
                    float f1 = ((float)placeholderSpan0.d()) + f;
                    TextLayout textLayout1 = this.e;
                    switch(placeholderSpan0.c()) {
                        case 0: {
                            f2 = textLayout1.o(v12) - ((float)placeholderSpan0.b());
                            break;
                        }
                        case 1: {
                            f2 = textLayout1.B(v12);
                            break;
                        }
                        case 2: {
                            f2 = textLayout1.p(v12) - ((float)placeholderSpan0.b());
                            break;
                        }
                        case 3: {
                            f2 = (textLayout1.B(v12) + textLayout1.p(v12) - ((float)placeholderSpan0.b())) / 2.0f;
                            break;
                        }
                        case 4: {
                            f2 = ((float)placeholderSpan0.a().ascent) + textLayout1.o(v12);
                            break;
                        }
                        case 5: {
                            f2 = ((float)placeholderSpan0.a().descent) + textLayout1.o(v12) - ((float)placeholderSpan0.b());
                            break;
                        }
                        case 6: {
                            Paint.FontMetricsInt paint$FontMetricsInt0 = placeholderSpan0.a();
                            f2 = ((float)((paint$FontMetricsInt0.ascent + paint$FontMetricsInt0.descent - placeholderSpan0.b()) / 2)) + textLayout1.o(v12);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    rect0 = new Rect(f, f2, f1, ((float)placeholderSpan0.b()) + f2);
                }
                arrayList0.add(rect0);
            }
            list0 = arrayList0;
        }
        else {
            list0 = u.H();
        }
        this.g = list0;
        androidx.compose.ui.text.AndroidParagraph.wordBoundary.2 androidParagraph$wordBoundary$20 = new a() {
            final AndroidParagraph e;

            {
                this.e = androidParagraph0;
                super(0);
            }

            @l
            public final WordBoundary b() {
                return new WordBoundary(this.e.Q(), this.e.e.N());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        this.h = E.c(H.c, androidParagraph$wordBoundary$20);
    }

    public AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics0, int v, boolean z, long v1, w w0) {
        this(androidParagraphIntrinsics0, v, z, v1);
    }

    private AndroidParagraph(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, long v1, Resolver fontFamily$Resolver0, Density density0) {
        this(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, fontFamily$Resolver0, density0), v, z, v1, null);
    }

    public AndroidParagraph(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, long v1, Resolver fontFamily$Resolver0, Density density0, w w0) {
        this(s, textStyle0, list0, list1, v, z, v1, fontFamily$Resolver0, density0);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @l
    public List A() {
        return this.g;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float B(int v) {
        return this.e.D(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void C(@l Canvas canvas0, long v, @m Shadow shadow0, @m TextDecoration textDecoration0) {
        L.p(canvas0, "canvas");
        AndroidTextPaint androidTextPaint0 = this.S();
        androidTextPaint0.h(v);
        androidTextPaint0.j(shadow0);
        androidTextPaint0.l(textDecoration0);
        this.V(canvas0);
    }

    private final TextLayout E(int v, int v1, TextUtils.TruncateAt textUtils$TruncateAt0, int v2, int v3, int v4, int v5, int v6) {
        float f = this.getWidth();
        AndroidTextPaint androidTextPaint0 = this.S();
        boolean z = AndroidParagraphHelper_androidKt.b(this.a.l());
        return new TextLayout(this.f, f, androidTextPaint0, v, textUtils$TruncateAt0, this.a.n(), 1.0f, 0.0f, z, true, v2, v4, v5, v6, v3, v1, null, null, this.a.i(), 0x30080, null);
    }

    public final void F(long v, @l float[] arr_f, int v1) {
        L.p(arr_f, "array");
        this.e.a(TextRange.l(v), TextRange.k(v), arr_f, v1);
    }

    @l
    public final CharSequence G() {
        return this.f;
    }

    @VisibleForTesting
    public static void H() {
    }

    public final long I() {
        return this.d;
    }

    public final boolean J() {
        return this.c;
    }

    public final float K(int v) {
        return this.e.n(v);
    }

    public final float L(int v) {
        return this.e.o(v);
    }

    public final float M(int v) {
        return this.e.r(v);
    }

    public final int N() {
        return this.b;
    }

    @l
    public final AndroidParagraphIntrinsics O() {
        return this.a;
    }

    private final ShaderBrushSpan[] P(TextLayout textLayout0) {
        if(!(textLayout0.N() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence charSequence0 = textLayout0.N();
        L.n(charSequence0, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] arr_shaderBrushSpan = (ShaderBrushSpan[])((Spanned)charSequence0).getSpans(0, textLayout0.N().length(), ShaderBrushSpan.class);
        L.o(arr_shaderBrushSpan, "brushSpans");
        return arr_shaderBrushSpan.length == 0 ? new ShaderBrushSpan[0] : arr_shaderBrushSpan;
    }

    @l
    public final Locale Q() {
        Locale locale0 = this.a.o().getTextLocale();
        L.o(locale0, "paragraphIntrinsics.textPaint.textLocale");
        return locale0;
    }

    @VisibleForTesting
    public static void R() {
    }

    @l
    public final AndroidTextPaint S() {
        return this.a.o();
    }

    @VisibleForTesting
    public static void T() {
    }

    private final WordBoundary U() {
        return (WordBoundary)this.h.getValue();
    }

    private final void V(Canvas canvas0) {
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.d(canvas0);
        if(this.t()) {
            canvas1.save();
            canvas1.clipRect(0.0f, 0.0f, this.getWidth(), this.getHeight());
        }
        this.e.T(canvas1);
        if(this.t()) {
            canvas1.restore();
        }
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float a() {
        return this.a.a();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float b() {
        return this.a.b();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @l
    public Rect c(int v) {
        RectF rectF0 = this.e.d(v);
        return new Rect(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @l
    public ResolvedTextDirection d(int v) {
        int v1 = this.e.v(v);
        return this.e.H(v1) == 1 ? ResolvedTextDirection.a : ResolvedTextDirection.b;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float e(int v) {
        return this.e.B(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public long f(int v) {
        return TextRangeKt.b(this.U().b(v), this.U().a(v));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float g() {
        return this.L(0);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return (float)this.e.g();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return (float)Constraints.p(this.d);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int h(long v) {
        int v1 = (int)Offset.r(v);
        int v2 = this.e.w(v1);
        float f = Offset.p(v);
        return this.e.G(v2, f);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int i(int v) {
        return this.e.A(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    public int j(int v, boolean z) {
        return z ? this.e.C(v) : this.e.u(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float k(int v) {
        return this.e.x(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int l(float f) {
        return this.e.w(((int)f));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float m(int v) {
        return this.e.y(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float n(int v) {
        return this.e.p(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @l
    public Rect o(int v) {
        if(v < 0 || v > this.f.length()) {
            throw new AssertionError("offset(" + v + ") is out of bounds (0," + this.f.length());
        }
        float f = TextLayout.J(this.e, v, false, 2, null);
        int v1 = this.e.v(v);
        return new Rect(f, this.e.B(v1), f, this.e.p(v1));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void p(@l Canvas canvas0, long v, @m Shadow shadow0, @m TextDecoration textDecoration0, @m DrawStyle drawStyle0, int v1) {
        L.p(canvas0, "canvas");
        int v2 = this.S().a();
        AndroidTextPaint androidTextPaint0 = this.S();
        androidTextPaint0.h(v);
        androidTextPaint0.j(shadow0);
        androidTextPaint0.l(textDecoration0);
        androidTextPaint0.i(drawStyle0);
        androidTextPaint0.e(v1);
        this.V(canvas0);
        this.S().e(v2);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public boolean q(int v) {
        return this.e.R(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int r() {
        return this.e.q();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float s(int v) {
        return this.e.z(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public boolean t() {
        return this.e.e();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    @l
    public Path u(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.f.length()) {
            throw new AssertionError("Start(" + v + ") or End(" + v1 + ") is out of Range(0.." + this.f.length() + "), or start > end!");
        }
        android.graphics.Path path0 = new android.graphics.Path();
        this.e.M(v, v1, path0);
        return AndroidPath_androidKt.c(path0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    public float v(int v, boolean z) {
        return z ? TextLayout.J(this.e, v, false, 2, null) : TextLayout.L(this.e, v, false, 2, null);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void w(@l Canvas canvas0, @l Brush brush0, float f, @m Shadow shadow0, @m TextDecoration textDecoration0, @m DrawStyle drawStyle0, int v) {
        L.p(canvas0, "canvas");
        L.p(brush0, "brush");
        int v1 = this.S().a();
        AndroidTextPaint androidTextPaint0 = this.S();
        androidTextPaint0.f(brush0, SizeKt.a(this.getWidth(), this.getHeight()), f);
        androidTextPaint0.j(shadow0);
        androidTextPaint0.l(textDecoration0);
        androidTextPaint0.i(drawStyle0);
        androidTextPaint0.e(v);
        this.V(canvas0);
        this.S().e(v1);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float x() {
        return this.L(this.r() - 1);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int y(int v) {
        return this.e.v(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    @l
    public ResolvedTextDirection z(int v) {
        return this.e.S(v) ? ResolvedTextDirection.b : ResolvedTextDirection.a;
    }
}

