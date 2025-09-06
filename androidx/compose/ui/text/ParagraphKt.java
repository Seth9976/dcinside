package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class ParagraphKt {
    public static final int a = 0x7FFFFFFF;

    @k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @c0(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @l
    public static final Paragraph a(@l ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, float f) {
        L.p(paragraphIntrinsics0, "paragraphIntrinsics");
        return AndroidParagraph_androidKt.b(paragraphIntrinsics0, v, z, ConstraintsKt.b(0, ParagraphKt.k(f), 0, 0, 13, null));
    }

    @k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @c0(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @l
    public static final Paragraph b(@l String s, @l TextStyle textStyle0, float f, @l Density density0, @l Resolver fontFamily$Resolver0, @l List list0, @l List list1, int v, boolean z) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        return AndroidParagraph_androidKt.c(s, textStyle0, list0, list1, v, z, ConstraintsKt.b(0, ParagraphKt.k(f), 0, 0, 13, null), density0, fontFamily$Resolver0);
    }

    @k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @c0(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @l
    public static final Paragraph c(@l String s, @l TextStyle textStyle0, @l List list0, @l List list1, int v, boolean z, float f, @l Density density0, @l ResourceLoader font$ResourceLoader0) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(density0, "density");
        L.p(font$ResourceLoader0, "resourceLoader");
        return AndroidParagraph_androidKt.a(s, textStyle0, list0, list1, v, z, f, density0, font$ResourceLoader0);
    }

    public static Paragraph d(ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, float f, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return ParagraphKt.a(paragraphIntrinsics0, v, z, f);
    }

    public static Paragraph e(String s, TextStyle textStyle0, float f, Density density0, Resolver fontFamily$Resolver0, List list0, List list1, int v, boolean z, int v1, Object object0) {
        List list2 = (v1 & 0x20) == 0 ? list0 : u.H();
        List list3 = (v1 & 0x40) == 0 ? list1 : u.H();
        int v2 = (v1 & 0x80) == 0 ? v : 0x7FFFFFFF;
        return (v1 & 0x100) == 0 ? ParagraphKt.b(s, textStyle0, f, density0, fontFamily$Resolver0, list2, list3, v2, z) : ParagraphKt.b(s, textStyle0, f, density0, fontFamily$Resolver0, list2, list3, v2, false);
    }

    public static Paragraph f(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0, int v1, Object object0) {
        List list2 = (v1 & 4) == 0 ? list0 : u.H();
        List list3 = (v1 & 8) == 0 ? list1 : u.H();
        int v2 = (v1 & 16) == 0 ? v : 0x7FFFFFFF;
        return (v1 & 0x20) == 0 ? ParagraphKt.c(s, textStyle0, list2, list3, v2, z, f, density0, font$ResourceLoader0) : ParagraphKt.c(s, textStyle0, list2, list3, v2, false, f, density0, font$ResourceLoader0);
    }

    @l
    public static final Paragraph g(@l String s, @l TextStyle textStyle0, long v, @l Density density0, @l Resolver fontFamily$Resolver0, @l List list0, @l List list1, int v1, boolean z) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        return AndroidParagraph_androidKt.c(s, textStyle0, list0, list1, v1, z, v, density0, fontFamily$Resolver0);
    }

    public static Paragraph h(String s, TextStyle textStyle0, long v, Density density0, Resolver fontFamily$Resolver0, List list0, List list1, int v1, boolean z, int v2, Object object0) {
        List list2 = (v2 & 0x20) == 0 ? list0 : u.H();
        List list3 = (v2 & 0x40) == 0 ? list1 : u.H();
        int v3 = (v2 & 0x80) == 0 ? v1 : 0x7FFFFFFF;
        return (v2 & 0x100) == 0 ? ParagraphKt.g(s, textStyle0, v, density0, fontFamily$Resolver0, list2, list3, v3, z) : ParagraphKt.g(s, textStyle0, v, density0, fontFamily$Resolver0, list2, list3, v3, false);
    }

    @l
    public static final Paragraph i(@l ParagraphIntrinsics paragraphIntrinsics0, long v, int v1, boolean z) {
        L.p(paragraphIntrinsics0, "paragraphIntrinsics");
        return AndroidParagraph_androidKt.b(paragraphIntrinsics0, v1, z, v);
    }

    public static Paragraph j(ParagraphIntrinsics paragraphIntrinsics0, long v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 4) != 0) {
            v1 = 0x7FFFFFFF;
        }
        if((v2 & 8) != 0) {
            z = false;
        }
        return ParagraphKt.i(paragraphIntrinsics0, v, v1, z);
    }

    public static final int k(float f) {
        return (int)(((float)Math.ceil(f)));
    }
}

