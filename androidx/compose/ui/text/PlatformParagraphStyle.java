package androidx.compose.ui.text;

import androidx.compose.foundation.c;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class PlatformParagraphStyle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final PlatformParagraphStyle a() {
            return PlatformParagraphStyle.e;
        }
    }

    private final boolean a;
    private final int b;
    @l
    public static final Companion c;
    public static final int d;
    @l
    private static final PlatformParagraphStyle e;

    static {
        PlatformParagraphStyle.c = new Companion(null);
        PlatformParagraphStyle.e = new PlatformParagraphStyle();
    }

    public PlatformParagraphStyle() {
        this(0, true, null);
    }

    private PlatformParagraphStyle(int v) {
        this.a = true;
        this.b = v;
    }

    public PlatformParagraphStyle(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v, null);
    }

    public PlatformParagraphStyle(int v, w w0) {
        this(v);
    }

    private PlatformParagraphStyle(int v, boolean z) {
        this.a = z;
        this.b = v;
    }

    public PlatformParagraphStyle(int v, boolean z, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            z = true;
        }
        this(v, z, null);
    }

    @k(message = "Provides configuration options for behavior compatibility.")
    public PlatformParagraphStyle(int v, boolean z, w w0) {
        this(v, z);
    }

    @k(message = "Provides configuration options for behavior compatibility.")
    public PlatformParagraphStyle(boolean z) {
        this.a = z;
        this.b = 0;
    }

    public PlatformParagraphStyle(boolean z, int v, w w0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    @k(message = "Sets includeFontPadding parameter for transitioning. Will be removed.")
    public static void d() {
    }

    @l
    public final PlatformParagraphStyle e(@m PlatformParagraphStyle platformParagraphStyle0) {
        return platformParagraphStyle0 == null ? this : platformParagraphStyle0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PlatformParagraphStyle)) {
            return false;
        }
        return this.a == ((PlatformParagraphStyle)object0).a ? EmojiSupportMatch.f(this.b, ((PlatformParagraphStyle)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return c.a(this.a) * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + EmojiSupportMatch.h(this.b) + ')';
    }
}

