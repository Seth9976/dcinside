package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import z3.i;

@i(name = "AndroidParagraph_androidKt")
public final class AndroidParagraph_androidKt {
    @k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @c0(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @l
    public static final Paragraph a(@l String s, @l TextStyle textStyle0, @l List list0, @l List list1, int v, boolean z, float f, @l Density density0, @l ResourceLoader font$ResourceLoader0) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(density0, "density");
        L.p(font$ResourceLoader0, "resourceLoader");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, DelegatingFontLoaderForDeprecatedUsage_androidKt.a(font$ResourceLoader0), density0), v, z, ConstraintsKt.b(0, ParagraphKt.k(f), 0, 0, 13, null), null);
    }

    @l
    public static final Paragraph b(@l ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, long v1) {
        L.p(paragraphIntrinsics0, "paragraphIntrinsics");
        return new AndroidParagraph(((AndroidParagraphIntrinsics)paragraphIntrinsics0), v, z, v1, null);
    }

    @l
    public static final Paragraph c(@l String s, @l TextStyle textStyle0, @l List list0, @l List list1, int v, boolean z, long v1, @l Density density0, @l Resolver fontFamily$Resolver0) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, fontFamily$Resolver0, density0), v, z, v1, null);
    }
}

