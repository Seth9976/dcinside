package androidx.compose.foundation.text;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextFieldDelegateKt {
    public static final int a = 10;
    @l
    private static final String b;

    static {
        TextFieldDelegateKt.b = "HHHHHHHHHH";
    }

    public static final long a(@l TextStyle textStyle0, @l Density density0, @l Resolver fontFamily$Resolver0, @l String s, int v) {
        L.p(textStyle0, "style");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(s, "text");
        List list0 = u.H();
        Paragraph paragraph0 = ParagraphKt.h(s, textStyle0, ConstraintsKt.b(0, 0, 0, 0, 15, null), density0, fontFamily$Resolver0, list0, null, v, false, 0x40, null);
        return IntSizeKt.a(TextDelegateKt.a(paragraph0.a()), TextDelegateKt.a(paragraph0.getHeight()));
    }

    public static long b(TextStyle textStyle0, Density density0, Resolver fontFamily$Resolver0, String s, int v, int v1, Object object0) {
        if((v1 & 8) != 0) {
            s = "HHHHHHHHHH";
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        return TextFieldDelegateKt.a(textStyle0, density0, fontFamily$Resolver0, s, v);
    }

    // 去混淆评级： 低(20)
    @l
    public static final String c() [...] // 潜在的解密器
}

