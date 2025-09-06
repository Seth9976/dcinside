package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocale;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidParagraphIntrinsics_androidKt {
    @l
    public static final ParagraphIntrinsics a(@l String s, @l TextStyle textStyle0, @l List list0, @l List list1, @l Density density0, @l Resolver fontFamily$Resolver0) {
        L.p(s, "text");
        L.p(textStyle0, "style");
        L.p(list0, "spanStyles");
        L.p(list1, "placeholders");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, fontFamily$Resolver0, density0);
    }

    private static final boolean c(TextStyle textStyle0) {
        PlatformTextStyle platformTextStyle0 = textStyle0.H();
        if(platformTextStyle0 != null) {
            PlatformParagraphStyle platformParagraphStyle0 = platformTextStyle0.a();
            if(platformParagraphStyle0 != null) {
                EmojiSupportMatch emojiSupportMatch0 = EmojiSupportMatch.c(platformParagraphStyle0.b());
                return emojiSupportMatch0 == null ? true : !EmojiSupportMatch.f(emojiSupportMatch0.i(), 1);
            }
        }
        throw new NullPointerException();
    }

    public static final int d(@m TextDirection textDirection0, @m LocaleList localeList0) {
        Locale locale0;
        int v = textDirection0 == null ? 3 : textDirection0.l();
        if(!TextDirection.i(v, 4)) {
            if(TextDirection.i(v, 5)) {
                return 3;
            }
            if(TextDirection.i(v, 1)) {
                return 0;
            }
            if(TextDirection.i(v, 2)) {
                return 1;
            }
            if(!TextDirection.i(v, 3)) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            if(localeList0 == null) {
                locale0 = Locale.getDefault();
            }
            else {
                PlatformLocale platformLocale0 = localeList0.c(0).b();
                L.n(platformLocale0, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                locale0 = ((AndroidLocale)platformLocale0).d();
                if(locale0 == null) {
                    locale0 = Locale.getDefault();
                }
            }
            int v1 = TextUtilsCompat.a(locale0);
            return v1 != 0 && v1 == 1 ? 3 : 2;
        }
        return 2;
    }

    public static int e(TextDirection textDirection0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            textDirection0 = null;
        }
        if((v & 2) != 0) {
            localeList0 = null;
        }
        return AndroidParagraphIntrinsics_androidKt.d(textDirection0, localeList0);
    }
}

