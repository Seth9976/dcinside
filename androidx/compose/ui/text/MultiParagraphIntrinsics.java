package androidx.compose.ui.text;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n803#2:153\n804#2,5:162\n151#3,3:154\n33#3,4:157\n154#3:161\n155#3:167\n38#3:168\n156#3:169\n101#3,2:170\n33#3,6:172\n103#3:178\n1#4:179\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n95#1:153\n95#1:162,5\n95#1:154,3\n95#1:157,4\n95#1:161\n95#1:167\n95#1:168\n95#1:169\n120#1:170,2\n120#1:172,6\n120#1:178\n*E\n"})
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    @l
    private final AnnotatedString a;
    @l
    private final List b;
    @l
    private final D c;
    @l
    private final D d;
    @l
    private final List e;
    public static final int f = 8;

    static {
    }

    @k(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @c0(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public MultiParagraphIntrinsics(@l AnnotatedString annotatedString0, @l TextStyle textStyle0, @l List list0, @l Density density0, @l ResourceLoader font$ResourceLoader0) {
        L.p(annotatedString0, "annotatedString");
        L.p(textStyle0, "style");
        L.p(list0, "placeholders");
        L.p(density0, "density");
        L.p(font$ResourceLoader0, "resourceLoader");
        this(annotatedString0, textStyle0, list0, density0, DelegatingFontLoaderForDeprecatedUsage_androidKt.a(font$ResourceLoader0));
    }

    public MultiParagraphIntrinsics(@l AnnotatedString annotatedString0, @l TextStyle textStyle0, @l List list0, @l Density density0, @l Resolver fontFamily$Resolver0) {
        L.p(annotatedString0, "annotatedString");
        L.p(textStyle0, "style");
        L.p(list0, "placeholders");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        super();
        this.a = annotatedString0;
        this.b = list0;
        androidx.compose.ui.text.MultiParagraphIntrinsics.minIntrinsicWidth.2 multiParagraphIntrinsics$minIntrinsicWidth$20 = new a() {
            final MultiParagraphIntrinsics e;

            {
                this.e = multiParagraphIntrinsics0;
                super(0);
            }

            @l
            public final Float b() {
                Object object0;
                List list0 = this.e.f();
                if(list0.isEmpty()) {
                    object0 = null;
                }
                else {
                    Object object1 = list0.get(0);
                    float f = ((ParagraphIntrinsicInfo)object1).g().a();
                    int v = u.J(list0);
                    if(1 <= v) {
                        for(int v1 = 1; true; ++v1) {
                            Object object2 = list0.get(v1);
                            float f1 = ((ParagraphIntrinsicInfo)object2).g().a();
                            if(Float.compare(f, f1) < 0) {
                                object1 = object2;
                                f = f1;
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                    }
                    object0 = object1;
                }
                if(((ParagraphIntrinsicInfo)object0) != null) {
                    ParagraphIntrinsics paragraphIntrinsics0 = ((ParagraphIntrinsicInfo)object0).g();
                    return paragraphIntrinsics0 == null ? 0.0f : paragraphIntrinsics0.a();
                }
                return 0.0f;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        this.c = E.c(H.c, multiParagraphIntrinsics$minIntrinsicWidth$20);
        androidx.compose.ui.text.MultiParagraphIntrinsics.maxIntrinsicWidth.2 multiParagraphIntrinsics$maxIntrinsicWidth$20 = new a() {
            final MultiParagraphIntrinsics e;

            {
                this.e = multiParagraphIntrinsics0;
                super(0);
            }

            @l
            public final Float b() {
                Object object0;
                List list0 = this.e.f();
                if(list0.isEmpty()) {
                    object0 = null;
                }
                else {
                    Object object1 = list0.get(0);
                    float f = ((ParagraphIntrinsicInfo)object1).g().b();
                    int v = u.J(list0);
                    if(1 <= v) {
                        for(int v1 = 1; true; ++v1) {
                            Object object2 = list0.get(v1);
                            float f1 = ((ParagraphIntrinsicInfo)object2).g().b();
                            if(Float.compare(f, f1) < 0) {
                                object1 = object2;
                                f = f1;
                            }
                            if(v1 == v) {
                                break;
                            }
                        }
                    }
                    object0 = object1;
                }
                if(((ParagraphIntrinsicInfo)object0) != null) {
                    ParagraphIntrinsics paragraphIntrinsics0 = ((ParagraphIntrinsicInfo)object0).g();
                    return paragraphIntrinsics0 == null ? 0.0f : paragraphIntrinsics0.b();
                }
                return 0.0f;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        this.d = E.c(H.c, multiParagraphIntrinsics$maxIntrinsicWidth$20);
        ParagraphStyle paragraphStyle0 = textStyle0.a0();
        List list1 = AnnotatedStringKt.v(annotatedString0, paragraphStyle0);
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list1.get(v1);
            AnnotatedString annotatedString1 = AnnotatedStringKt.w(annotatedString0, ((Range)object0).i(), ((Range)object0).g());
            arrayList0.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.b(annotatedString1.j(), textStyle0.T(this.h(((ParagraphStyle)((Range)object0).h()), paragraphStyle0)), annotatedString1.f(), MultiParagraphIntrinsicsKt.b(this.g(), ((Range)object0).i(), ((Range)object0).g()), density0, fontFamily$Resolver0), ((Range)object0).i(), ((Range)object0).g()));
        }
        this.e = arrayList0;
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float a() {
        return ((Number)this.c.getValue()).floatValue();
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float b() {
        return ((Number)this.d.getValue()).floatValue();
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean c() {
        List list0 = this.e;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((ParagraphIntrinsicInfo)list0.get(v1)).g().c()) {
                return true;
            }
        }
        return false;
    }

    @l
    public final AnnotatedString e() {
        return this.a;
    }

    @l
    public final List f() {
        return this.e;
    }

    @l
    public final List g() {
        return this.b;
    }

    private final ParagraphStyle h(ParagraphStyle paragraphStyle0, ParagraphStyle paragraphStyle1) {
        return paragraphStyle0.r() == null ? ParagraphStyle.f(paragraphStyle0, null, paragraphStyle1.r(), 0L, null, null, null, null, null, 0xFD, null) : paragraphStyle0;
    }
}

