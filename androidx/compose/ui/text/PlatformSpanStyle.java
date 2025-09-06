package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class PlatformSpanStyle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final PlatformSpanStyle a() {
            return PlatformSpanStyle.c;
        }
    }

    @l
    public static final Companion a;
    public static final int b;
    @l
    private static final PlatformSpanStyle c;

    static {
        PlatformSpanStyle.a = new Companion(null);
        PlatformSpanStyle.c = new PlatformSpanStyle();
    }

    @l
    public final PlatformSpanStyle b(@m PlatformSpanStyle platformSpanStyle0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return this == object0 ? true : object0 instanceof PlatformSpanStyle;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "PlatformSpanStyle()";
    }
}

