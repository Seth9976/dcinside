package androidx.window.core;

import y4.l;

public final class BuildConfig {
    @l
    public static final BuildConfig a;
    @l
    private static final VerificationMode b;

    static {
        BuildConfig.a = new BuildConfig();
        BuildConfig.b = VerificationMode.c;
    }

    @l
    public final VerificationMode a() {
        return BuildConfig.b;
    }
}

