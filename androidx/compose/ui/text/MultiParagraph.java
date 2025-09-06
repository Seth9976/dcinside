package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,980:1\n127#2,3:981\n130#2:988\n131#2,2:1000\n133#2:1003\n33#3,4:984\n151#3,3:989\n33#3,4:992\n154#3,2:996\n38#3:998\n156#3:999\n38#3:1002\n33#3,6:1005\n33#3,6:1011\n1#4:1004\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n371#1:981,3\n371#1:988\n371#1:1000,2\n371#1:1003\n371#1:984,4\n373#1:989,3\n373#1:992,4\n373#1:996,2\n373#1:998\n373#1:999\n371#1:1002\n395#1:1005,6\n413#1:1011,6\n*E\n"})
public final class MultiParagraph {
    @l
    private final MultiParagraphIntrinsics a;
    private final int b;
    private final boolean c;
    private final float d;
    private final float e;
    private final int f;
    @l
    private final List g;
    @l
    private final List h;
    public static final int i = 8;

    static {
    }

    @k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @c0(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@l AnnotatedString annotatedString0, @l TextStyle textStyle0, float f, @l Density density0, @l Resolver fontFamily$Resolver0, @l List list0, int v, boolean z) {
        L.p(annotatedString0, "annotatedString");
        L.p(textStyle0, "style");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(list0, "placeholders");
        this(new MultiParagraphIntrinsics(annotatedString0, textStyle0, list0, density0, fontFamily$Resolver0), ConstraintsKt.b(0, ParagraphKt.k(f), 0, 0, 13, null), v, z, null);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, float f, Density density0, Resolver fontFamily$Resolver0, List list0, int v, boolean z, int v1, w w0) {
        this(annotatedString0, textStyle0, f, density0, fontFamily$Resolver0, ((v1 & 0x20) == 0 ? list0 : u.H()), ((v1 & 0x40) == 0 ? v : 0x7FFFFFFF), ((v1 & 0x80) == 0 ? z : false));
    }

    private MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, long v, Density density0, Resolver fontFamily$Resolver0, List list0, int v1, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString0, textStyle0, list0, density0, fontFamily$Resolver0), v, v1, z, null);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, long v, Density density0, Resolver fontFamily$Resolver0, List list0, int v1, boolean z, int v2, w w0) {
        this(annotatedString0, textStyle0, v, density0, fontFamily$Resolver0, ((v2 & 0x20) == 0 ? list0 : u.H()), ((v2 & 0x40) == 0 ? v1 : 0x7FFFFFFF), ((v2 & 0x80) == 0 ? z : false), null);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, long v, Density density0, Resolver fontFamily$Resolver0, List list0, int v1, boolean z, w w0) {
        this(annotatedString0, textStyle0, v, density0, fontFamily$Resolver0, list0, v1, z);
    }

    @k(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @c0(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(@l AnnotatedString annotatedString0, @l TextStyle textStyle0, @l List list0, int v, boolean z, float f, @l Density density0, @l ResourceLoader font$ResourceLoader0) {
        L.p(annotatedString0, "annotatedString");
        L.p(textStyle0, "style");
        L.p(list0, "placeholders");
        L.p(density0, "density");
        L.p(font$ResourceLoader0, "resourceLoader");
        this(new MultiParagraphIntrinsics(annotatedString0, textStyle0, list0, density0, DelegatingFontLoaderForDeprecatedUsage_androidKt.a(font$ResourceLoader0)), ConstraintsKt.b(0, ParagraphKt.k(f), 0, 0, 13, null), v, z, null);
    }

    public MultiParagraph(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0, int v1, w w0) {
        this(annotatedString0, textStyle0, ((v1 & 4) == 0 ? list0 : u.H()), ((v1 & 8) == 0 ? v : 0x7FFFFFFF), ((v1 & 16) == 0 ? z : false), f, density0, font$ResourceLoader0);
    }

    @k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @c0(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@l MultiParagraphIntrinsics multiParagraphIntrinsics0, int v, boolean z, float f) {
        L.p(multiParagraphIntrinsics0, "intrinsics");
        this(multiParagraphIntrinsics0, ConstraintsKt.b(0, ParagraphKt.k(f), 0, 0, 13, null), v, z, null);
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, int v, boolean z, float f, int v1, w w0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        this(multiParagraphIntrinsics0, v, z, f);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, long v, int v1, boolean z) {
        this.a = multiParagraphIntrinsics0;
        this.b = v1;
        if(Constraints.r(v) != 0 || Constraints.q(v) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        boolean z1 = false;
        ArrayList arrayList0 = new ArrayList();
        List list0 = multiParagraphIntrinsics0.f();
        int v2 = list0.size();
        int v3 = 0;
        int v4 = 0;
        float f;
        for(f = 0.0f; v3 < v2; f = f1) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo0 = (ParagraphIntrinsicInfo)list0.get(v3);
            Paragraph paragraph0 = ParagraphKt.i(paragraphIntrinsicInfo0.g(), ConstraintsKt.b(0, Constraints.p(v), 0, (Constraints.i(v) ? s.u(Constraints.o(v) - ParagraphKt.k(f), 0) : Constraints.o(v)), 5, null), this.b - v4, z);
            float f1 = f + paragraph0.getHeight();
            int v5 = v4 + paragraph0.r();
            int v6 = v5;
            arrayList0.add(new ParagraphInfo(paragraph0, paragraphIntrinsicInfo0.h(), paragraphIntrinsicInfo0.f(), v4, v5, f, f1));
            if(paragraph0.t() || v6 == this.b && v3 != u.J(this.a.f())) {
                z1 = true;
                v4 = v6;
                f = f1;
                break;
            }
            ++v3;
            v4 = v6;
        }
        this.e = f;
        this.f = v4;
        this.c = z1;
        this.h = arrayList0;
        this.d = (float)Constraints.p(v);
        List list1 = new ArrayList(arrayList0.size());
        int v7 = arrayList0.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)arrayList0.get(v8);
            List list2 = paragraphInfo0.n().A();
            ArrayList arrayList1 = new ArrayList(list2.size());
            int v9 = list2.size();
            for(int v10 = 0; v10 < v9; ++v10) {
                Rect rect0 = (Rect)list2.get(v10);
                arrayList1.add((rect0 == null ? null : paragraphInfo0.v(rect0)));
            }
            u.q0(list1, arrayList1);
        }
        if(list1.size() < this.a.g().size()) {
            int v11 = this.a.g().size() - list1.size();
            ArrayList arrayList2 = new ArrayList(v11);
            for(int v12 = 0; v12 < v11; ++v12) {
                arrayList2.add(null);
            }
            list1 = u.D4(list1, arrayList2);
        }
        this.g = list1;
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, long v, int v1, boolean z, int v2, w w0) {
        this(multiParagraphIntrinsics0, v, ((v2 & 4) == 0 ? v1 : 0x7FFFFFFF), ((v2 & 8) == 0 ? z : false), null);
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics0, long v, int v1, boolean z, w w0) {
        this(multiParagraphIntrinsics0, v, v1, z);
    }

    @l
    public final ResolvedTextDirection A(int v) {
        this.O(v);
        int v1 = v == this.a().length() ? u.J(this.h) : MultiParagraphKt.b(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.n().d(paragraphInfo0.C(v));
    }

    @l
    public final List B() {
        return this.h;
    }

    @l
    public final Path C(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.a().j().length()) {
            throw new IllegalArgumentException(("Start(" + v + ") or End(" + v1 + ") is out of range [0.." + this.a().j().length() + "), or start > end!").toString());
        }
        if(v == v1) {
            return AndroidPath_androidKt.a();
        }
        int v2 = MultiParagraphKt.b(this.h, v);
        Path path0 = AndroidPath_androidKt.a();
        int v3 = this.h.size();
        while(v2 < v3) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v2);
            if(paragraphInfo0.o() >= v1) {
                break;
            }
            if(paragraphInfo0.o() != paragraphInfo0.k()) {
                h0.c(path0, paragraphInfo0.w(paragraphInfo0.n().u(paragraphInfo0.C(v), paragraphInfo0.C(v1))), 0L, 2, null);
            }
            ++v2;
        }
        return path0;
    }

    @l
    public final List D() {
        return this.g;
    }

    public final float E() {
        return this.d;
    }

    public final long F(int v) {
        this.O(v);
        int v1 = v == this.a().length() ? u.J(this.h) : MultiParagraphKt.b(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.x(paragraphInfo0.n().f(paragraphInfo0.C(v)));
    }

    public final boolean G(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        return ((ParagraphInfo)this.h.get(v1)).n().q(v);
    }

    @ExperimentalTextApi
    public final void H(@l Canvas canvas0, long v, @m Shadow shadow0, @m TextDecoration textDecoration0, @m DrawStyle drawStyle0, int v1) {
        L.p(canvas0, "canvas");
        canvas0.f();
        List list0 = this.h;
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Object object0 = list0.get(v3);
            ((ParagraphInfo)object0).n().p(canvas0, v, shadow0, textDecoration0, drawStyle0, v1);
            canvas0.c(0.0f, ((ParagraphInfo)object0).n().getHeight());
        }
        canvas0.v();
    }

    // 去混淆评级： 低(25)
    public static void I(MultiParagraph multiParagraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v1, int v2, Object object0) {
        multiParagraph0.H(canvas0, ((v2 & 2) == 0 ? v : 16L), ((v2 & 4) == 0 ? shadow0 : null), ((v2 & 8) == 0 ? textDecoration0 : null), ((v2 & 16) == 0 ? drawStyle0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    public final void J(@l Canvas canvas0, long v, @m Shadow shadow0, @m TextDecoration textDecoration0) {
        L.p(canvas0, "canvas");
        canvas0.f();
        List list0 = this.h;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v2);
            paragraphInfo0.n().C(canvas0, v, shadow0, textDecoration0);
            canvas0.c(0.0f, paragraphInfo0.n().getHeight());
        }
        canvas0.v();
    }

    public static void K(MultiParagraph multiParagraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 16L;
        }
        multiParagraph0.J(canvas0, v, ((v1 & 4) == 0 ? shadow0 : null), ((v1 & 8) == 0 ? textDecoration0 : null));
    }

    @ExperimentalTextApi
    public final void L(@l Canvas canvas0, @l Brush brush0, float f, @m Shadow shadow0, @m TextDecoration textDecoration0, @m DrawStyle drawStyle0, int v) {
        L.p(canvas0, "canvas");
        L.p(brush0, "brush");
        AndroidMultiParagraphDrawKt.a(this, canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
    }

    public static void M(MultiParagraph multiParagraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v, int v1, Object object0) {
        multiParagraph0.L(canvas0, brush0, ((v1 & 4) == 0 ? f : NaNf), ((v1 & 8) == 0 ? shadow0 : null), ((v1 & 16) == 0 ? textDecoration0 : null), ((v1 & 0x20) == 0 ? drawStyle0 : null), ((v1 & 0x40) == 0 ? v : 3));
    }

    private final void N(int v) {
        if(v < 0 || v >= this.a().j().length()) {
            throw new IllegalArgumentException(("offset(" + v + ") is out of bounds [0, " + this.a().length() + ')').toString());
        }
    }

    private final void O(int v) {
        if(v < 0 || v > this.a().j().length()) {
            throw new IllegalArgumentException(("offset(" + v + ") is out of bounds [0, " + this.a().length() + ']').toString());
        }
    }

    private final void P(int v) {
        if(v < 0 || v >= this.f) {
            throw new IllegalArgumentException(("lineIndex(" + v + ") is out of bounds [0, " + this.f + ')').toString());
        }
    }

    private final AnnotatedString a() {
        return this.a.e();
    }

    @l
    public final ResolvedTextDirection b(int v) {
        this.O(v);
        int v1 = v == this.a().length() ? u.J(this.h) : MultiParagraphKt.b(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.n().z(paragraphInfo0.C(v));
    }

    @l
    public final Rect c(int v) {
        this.N(v);
        int v1 = MultiParagraphKt.b(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.v(paragraphInfo0.n().c(paragraphInfo0.C(v)));
    }

    @l
    public final Rect d(int v) {
        this.O(v);
        int v1 = v == this.a().length() ? u.J(this.h) : MultiParagraphKt.b(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.v(paragraphInfo0.n().o(paragraphInfo0.C(v)));
    }

    public final boolean e() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    public final float f() {
        return this.h.isEmpty() ? 0.0f : ((ParagraphInfo)this.h.get(0)).n().g();
    }

    public final float g() {
        return this.e;
    }

    public final float h(int v, boolean z) {
        this.O(v);
        int v1 = v == this.a().length() ? u.J(this.h) : MultiParagraphKt.b(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.n().v(paragraphInfo0.C(v), z);
    }

    @l
    public final MultiParagraphIntrinsics i() {
        return this.a;
    }

    public final float j() {
        if(this.h.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)u.p3(this.h);
        return paragraphInfo0.A(paragraphInfo0.n().x());
    }

    public final float k(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.A(paragraphInfo0.n().n(paragraphInfo0.D(v)));
    }

    public final int l() {
        return this.f;
    }

    public final int m(int v, boolean z) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.y(paragraphInfo0.n().j(paragraphInfo0.D(v), z));
    }

    public static int n(MultiParagraph multiParagraph0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return multiParagraph0.m(v, z);
    }

    public final int o(int v) {
        int v1;
        if(v >= this.a().length()) {
            v1 = u.J(this.h);
        }
        else {
            v1 = v >= 0 ? MultiParagraphKt.b(this.h, v) : 0;
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.z(paragraphInfo0.n().y(paragraphInfo0.C(v)));
    }

    public final int p(float f) {
        int v;
        if(f <= 0.0f) {
            v = 0;
        }
        else {
            v = f >= this.e ? u.J(this.h) : MultiParagraphKt.d(this.h, f);
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v);
        return paragraphInfo0.m() == 0 ? Math.max(0, paragraphInfo0.o() - 1) : paragraphInfo0.z(paragraphInfo0.n().l(paragraphInfo0.E(f)));
    }

    public final float q(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.n().k(paragraphInfo0.D(v));
    }

    public final float r(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.n().m(paragraphInfo0.D(v));
    }

    public final float s(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.n().s(paragraphInfo0.D(v));
    }

    public final int t(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.y(paragraphInfo0.n().i(paragraphInfo0.D(v)));
    }

    public final float u(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.A(paragraphInfo0.n().e(paragraphInfo0.D(v)));
    }

    public final float v(int v) {
        this.P(v);
        int v1 = MultiParagraphKt.c(this.h, v);
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.n().B(paragraphInfo0.D(v));
    }

    public final float w() {
        return this.a.b();
    }

    public final int x() {
        return this.b;
    }

    public final float y() {
        return this.a.b();
    }

    public final int z(long v) {
        int v1;
        if(Offset.r(v) <= 0.0f) {
            v1 = 0;
        }
        else if(Offset.r(v) >= this.e) {
            v1 = u.J(this.h);
        }
        else {
            float f = Offset.r(v);
            v1 = MultiParagraphKt.d(this.h, f);
        }
        ParagraphInfo paragraphInfo0 = (ParagraphInfo)this.h.get(v1);
        return paragraphInfo0.m() == 0 ? Math.max(0, paragraphInfo0.o() - 1) : paragraphInfo0.y(paragraphInfo0.n().h(paragraphInfo0.B(v)));
    }
}

