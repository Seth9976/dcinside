package androidx.compose.ui.text.font;

import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidFontUtils_androidKt {
    @l
    public static final FontWeight a(@l Companion fontWeight$Companion0) {
        L.p(fontWeight$Companion0, "<this>");
        return fontWeight$Companion0.D();
    }

    public static final int b(boolean z, boolean z1) {
        if(z1 && z) {
            return 3;
        }
        if(z) {
            return 1;
        }
        return z1 ? 2 : 0;
    }

    // 去混淆评级： 低(20)
    public static final int c(@l FontWeight fontWeight0, int v) {
        L.p(fontWeight0, "fontWeight");
        return fontWeight0.v(AndroidFontUtils_androidKt.a(FontWeight.b)) < 0 ? AndroidFontUtils_androidKt.b(false, FontStyle.f(v, 1)) : AndroidFontUtils_androidKt.b(true, FontStyle.f(v, 1));
    }
}

