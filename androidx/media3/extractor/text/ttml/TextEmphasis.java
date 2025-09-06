package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.c;
import com.google.common.collect.D4.m;
import com.google.common.collect.D4;
import com.google.common.collect.a3;
import com.google.common.collect.p3;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

final class TextEmphasis {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Position {
    }

    public final int a;
    public final int b;
    public final int c;
    public static final int d = -1;
    public static final int e = -2;
    private static final Pattern f;
    private static final a3 g;
    private static final a3 h;
    private static final a3 i;
    private static final a3 j;

    static {
        TextEmphasis.f = Pattern.compile("\\s+");
        TextEmphasis.g = a3.D("auto", "none");
        TextEmphasis.h = a3.E("dot", "sesame", "circle");
        TextEmphasis.i = a3.D("filled", "open");
        TextEmphasis.j = a3.E("after", "before", "outside");
    }

    private TextEmphasis(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Nullable
    public static TextEmphasis a(@Nullable String s) {
        if(s == null) {
            return null;
        }
        String s1 = c.g(s.trim());
        return s1.isEmpty() ? null : TextEmphasis.b(a3.y(TextUtils.split(s1, TextEmphasis.f)));
    }

    private static TextEmphasis b(a3 a30) {
        int v2;
        int v = 2;
        int v1 = 0;
        switch(((String)p3.v(D4.n(TextEmphasis.j, a30), "outside"))) {
            case "after": {
                v2 = 2;
                break;
            }
            case "outside": {
                v2 = -2;
                break;
            }
            default: {
                v2 = 1;
            }
        }
        m d4$m0 = D4.n(TextEmphasis.g, a30);
        if(!d4$m0.isEmpty()) {
            Object object0 = d4$m0.iterator().next();
            switch(((String)object0).hashCode()) {
                case 3005871: {
                    ((String)object0).equals("auto");
                    return new TextEmphasis(-1, 0, v2);
                }
                case 0x33AF38: {
                    return ((String)object0).equals("none") ? new TextEmphasis(0, 0, v2) : new TextEmphasis(-1, 0, v2);
                }
                default: {
                    return new TextEmphasis(-1, 0, v2);
                }
            }
        }
        m d4$m1 = D4.n(TextEmphasis.i, a30);
        m d4$m2 = D4.n(TextEmphasis.h, a30);
        if(d4$m1.isEmpty() && d4$m2.isEmpty()) {
            return new TextEmphasis(-1, 0, v2);
        }
        String s = (String)p3.v(d4$m1, "filled");
        int v3 = s.hashCode() != 0x34264A || !s.equals("open") ? 1 : 2;
        switch(((String)p3.v(d4$m2, "circle"))) {
            case "circle": {
                v1 = 2;
                break;
            }
            case "dot": {
                break;
            }
            case "sesame": {
                v1 = 1;
                break;
            }
            default: {
                v1 = -1;
            }
        }
        if(v1 != 0) {
            if(v1 != 1) {
                return new TextEmphasis(1, v3, v2);
            }
            v = 3;
        }
        return new TextEmphasis(v, v3, v2);
    }
}

