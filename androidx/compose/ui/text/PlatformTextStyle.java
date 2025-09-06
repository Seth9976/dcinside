package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class PlatformTextStyle {
    @m
    private final PlatformSpanStyle a;
    @m
    private final PlatformParagraphStyle b;
    public static final int c;

    static {
    }

    private PlatformTextStyle(int v) {
        this(null, new PlatformParagraphStyle(v, null));
    }

    public PlatformTextStyle(int v, w w0) {
        this(v);
    }

    public PlatformTextStyle(@m PlatformSpanStyle platformSpanStyle0, @m PlatformParagraphStyle platformParagraphStyle0) {
        this.a = platformSpanStyle0;
        this.b = platformParagraphStyle0;
    }

    @k(message = "includeFontPadding was added to Android in order to prevent clipping issues on tall scripts. However that issue has been fixed since Android 28. Compose backports the fix for Android versions prior to Android 28. Therefore the original reason why includeFontPadding was needed is invalid on Compose.This configuration was added for migration of the apps in case some code or design was relying includeFontPadding=true behavior; and will be removed.")
    public PlatformTextStyle(boolean z) {
        this(null, new PlatformParagraphStyle(z));
    }

    public PlatformTextStyle(boolean z, int v, w w0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    @m
    public final PlatformParagraphStyle a() {
        return this.b;
    }

    @m
    public final PlatformSpanStyle b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PlatformTextStyle)) {
            return false;
        }
        return L.g(this.b, ((PlatformTextStyle)object0).b) ? L.g(this.a, ((PlatformTextStyle)object0).a) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        PlatformParagraphStyle platformParagraphStyle0 = this.b;
        if(platformParagraphStyle0 != null) {
            v = platformParagraphStyle0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}

