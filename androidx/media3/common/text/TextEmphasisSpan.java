package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class TextEmphasisSpan implements LanguageFeatureSpan {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface MarkFill {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface MarkShape {
    }

    public int a;
    public int b;
    public final int c;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    private static final String k;
    private static final String l;
    private static final String m;

    static {
        TextEmphasisSpan.k = "0";
        TextEmphasisSpan.l = "1";
        TextEmphasisSpan.m = "2";
    }

    public TextEmphasisSpan(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    // 去混淆评级： 中等(60)
    public static TextEmphasisSpan a(Bundle bundle0) {
        return new TextEmphasisSpan(bundle0.getInt("0"), bundle0.getInt("1"), bundle0.getInt("2"));
    }

    public Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(TextEmphasisSpan.k, this.a);
        bundle0.putInt(TextEmphasisSpan.l, this.b);
        bundle0.putInt(TextEmphasisSpan.m, this.c);
        return bundle0;
    }
}

