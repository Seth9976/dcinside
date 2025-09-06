package androidx.compose.ui.text;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidTextStyle_androidKt {
    public static final boolean a = true;

    @l
    public static final PlatformTextStyle a(@m PlatformSpanStyle platformSpanStyle0, @m PlatformParagraphStyle platformParagraphStyle0) {
        return new PlatformTextStyle(platformSpanStyle0, platformParagraphStyle0);
    }

    @l
    public static final PlatformParagraphStyle b(@l PlatformParagraphStyle platformParagraphStyle0, @l PlatformParagraphStyle platformParagraphStyle1, float f) {
        L.p(platformParagraphStyle0, "start");
        L.p(platformParagraphStyle1, "stop");
        return platformParagraphStyle0.c() == platformParagraphStyle1.c() ? platformParagraphStyle0 : new PlatformParagraphStyle(((EmojiSupportMatch)SpanStyleKt.c(EmojiSupportMatch.c(platformParagraphStyle0.b()), EmojiSupportMatch.c(platformParagraphStyle1.b()), f)).i(), ((Boolean)SpanStyleKt.c(Boolean.valueOf(platformParagraphStyle0.c()), Boolean.valueOf(platformParagraphStyle1.c()), f)).booleanValue(), null);
    }

    @l
    public static final PlatformSpanStyle c(@l PlatformSpanStyle platformSpanStyle0, @l PlatformSpanStyle platformSpanStyle1, float f) {
        L.p(platformSpanStyle0, "start");
        L.p(platformSpanStyle1, "stop");
        return platformSpanStyle0;
    }
}

