package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class DecoderReuseEvaluation {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface DecoderDiscardReasons {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface DecoderReuseResult {
    }

    public final String a;
    public final Format b;
    public final Format c;
    public final int d;
    public final int e;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 4;
    public static final int m = 8;
    public static final int n = 16;
    public static final int o = 0x20;
    public static final int p = 0x40;
    public static final int q = 0x80;
    public static final int r = 0x100;
    public static final int s = 0x200;
    public static final int t = 0x400;
    public static final int u = 0x800;
    public static final int v = 0x1000;
    public static final int w = 0x2000;
    public static final int x = 0x4000;
    public static final int y = 0x8000;

    public DecoderReuseEvaluation(String s, Format format0, Format format1, int v, int v1) {
        Assertions.a(v == 0 || v1 == 0);
        this.a = Assertions.e(s);
        this.b = (Format)Assertions.g(format0);
        this.c = (Format)Assertions.g(format1);
        this.d = v;
        this.e = v1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return DecoderReuseEvaluation.class == class0 && (this.d == ((DecoderReuseEvaluation)object0).d && this.e == ((DecoderReuseEvaluation)object0).e && this.a.equals(((DecoderReuseEvaluation)object0).a) && this.b.equals(((DecoderReuseEvaluation)object0).b) && this.c.equals(((DecoderReuseEvaluation)object0).c));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((((this.d + 0x20F) * 0x1F + this.e) * 0x1F + this.a.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }
}

