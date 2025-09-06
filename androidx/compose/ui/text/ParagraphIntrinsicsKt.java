package androidx.compose.ui.text;

import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class ParagraphIntrinsicsKt {
    @k(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @c0(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    @l
    public static final ParagraphIntrinsics a(@l String s, @l TextStyle textStyle0, @l List list0, @l List list1, @l Density density0, @l ResourceLoader font$ResourceLoader0) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(density0, "density");
        L.p(font$ResourceLoader0, "resourceLoader");
        return AndroidParagraphIntrinsics_androidKt.a(s, textStyle0, list0, list1, density0, DelegatingFontLoaderForDeprecatedUsage_androidKt.a(font$ResourceLoader0));
    }

    @l
    public static final ParagraphIntrinsics b(@l String s, @l TextStyle textStyle0, @l List list0, @l List list1, @l Density density0, @l Resolver fontFamily$Resolver0) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        return AndroidParagraphIntrinsics_androidKt.a(s, textStyle0, list0, list1, density0, fontFamily$Resolver0);
    }

    public static ParagraphIntrinsics c(String s, TextStyle textStyle0, List list0, List list1, Density density0, ResourceLoader font$ResourceLoader0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = u.H();
        }
        if((v & 8) != 0) {
            list1 = u.H();
        }
        return ParagraphIntrinsicsKt.a(s, textStyle0, list0, list1, density0, font$ResourceLoader0);
    }

    public static ParagraphIntrinsics d(String s, TextStyle textStyle0, List list0, List list1, Density density0, Resolver fontFamily$Resolver0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = u.H();
        }
        if((v & 8) != 0) {
            list1 = u.H();
        }
        return ParagraphIntrinsicsKt.b(s, textStyle0, list0, list1, density0, fontFamily$Resolver0);
    }
}

