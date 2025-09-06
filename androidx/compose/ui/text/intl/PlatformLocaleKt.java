package androidx.compose.ui.text.intl;

import y4.l;

public final class PlatformLocaleKt {
    @l
    private static final PlatformLocaleDelegate a;

    static {
        PlatformLocaleKt.a = AndroidPlatformLocale_androidKt.a();
    }

    @l
    public static final PlatformLocaleDelegate a() {
        return PlatformLocaleKt.a;
    }
}

