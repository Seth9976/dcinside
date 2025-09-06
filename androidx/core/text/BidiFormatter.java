package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class BidiFormatter {
    public static final class Builder {
        private boolean a;
        private int b;
        private TextDirectionHeuristicCompat c;

        public Builder() {
            this.c(BidiFormatter.j(Locale.getDefault()));
        }

        public Builder(Locale locale0) {
            this.c(BidiFormatter.j(locale0));
        }

        public Builder(boolean z) {
            this.c(z);
        }

        public BidiFormatter a() {
            return this.b != 2 || this.c != BidiFormatter.d ? new BidiFormatter(this.a, this.b, this.c) : Builder.b(this.a);
        }

        // 去混淆评级： 低(20)
        private static BidiFormatter b(boolean z) {
            return z ? BidiFormatter.p : BidiFormatter.o;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = BidiFormatter.d;
            this.b = 2;
        }

        public Builder d(TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
            this.c = textDirectionHeuristicCompat0;
            return this;
        }

        public Builder e(boolean z) {
            if(z) {
                this.b |= 2;
                return this;
            }
            this.b &= -3;
            return this;
        }
    }

    static class DirectionalityEstimator {
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;
        private static final int f = 0x700;
        private static final byte[] g;

        static {
            DirectionalityEstimator.g = new byte[0x700];
            for(int v = 0; v < 0x700; ++v) {
                DirectionalityEstimator.g[v] = Character.getDirectionality(v);
            }
        }

        DirectionalityEstimator(CharSequence charSequence0, boolean z) {
            this.a = charSequence0;
            this.b = z;
            this.c = charSequence0.length();
        }

        byte a() {
            char c = this.a.charAt(this.d - 1);
            this.e = c;
            if(Character.isLowSurrogate(c)) {
                int v = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(v);
                return Character.getDirectionality(v);
            }
            --this.d;
            byte b = DirectionalityEstimator.c(this.e);
            if(this.b) {
                int v1 = this.e;
                if(v1 == 62) {
                    return this.h();
                }
                return v1 == 59 ? this.f() : b;
            }
            return b;
        }

        byte b() {
            char c = this.a.charAt(this.d);
            this.e = c;
            if(Character.isHighSurrogate(c)) {
                int v = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(v);
                return Character.getDirectionality(v);
            }
            ++this.d;
            byte b = DirectionalityEstimator.c(this.e);
            if(this.b) {
                int v1 = this.e;
                if(v1 == 60) {
                    return this.i();
                }
                return v1 == 38 ? this.g() : b;
            }
            return b;
        }

        private static byte c(char c) {
            return c >= 0x700 ? Character.getDirectionality(c) : DirectionalityEstimator.g[c];
        }

        int d() {
            this.d = 0;
            int v = 0;
            int v1 = 0;
            int v2 = 0;
            while(0 < this.c && v == 0) {
                int v3 = this.b();
            alab1:
                switch(v3) {
                    case 0: {
                    label_20:
                        if(v2 == 0) {
                            return -1;
                        }
                        break;
                    }
                    case 1: {
                    label_22:
                        if(v2 == 0) {
                            return 1;
                        }
                        break;
                    }
                    default: {
                        if(v3 == 2) {
                            goto label_22;
                        }
                        else {
                            if(v3 == 9) {
                                continue;
                            }
                            switch(v3) {
                                case 14: 
                                case 15: {
                                    ++v2;
                                    v1 = -1;
                                    continue;
                                }
                                case 16: 
                                case 17: {
                                    ++v2;
                                    v1 = 1;
                                    continue;
                                }
                                case 18: {
                                    --v2;
                                    v1 = 0;
                                    continue;
                                }
                                default: {
                                    break alab1;
                                }
                            }
                        }
                        goto label_20;
                    }
                }
                v = v2;
            }
            if(v == 0) {
                return 0;
            }
            return v1 == 0 ? 0 : v1;
        }

        int e() {
            this.d = this.c;
            int v = 0;
            int v1 = 0;
            while(this.d > 0) {
                switch(this.a()) {
                    case 0: {
                        if(v == 0) {
                            return -1;
                        }
                        if(v1 != 0) {
                            continue;
                        }
                        v1 = v;
                        continue;
                    }
                    case 1: 
                    case 2: {
                        if(v == 0) {
                            return 1;
                        }
                        if(v1 != 0) {
                            continue;
                        }
                        v1 = v;
                        continue;
                    }
                    case 9: {
                        continue;
                    }
                    case 14: 
                    case 15: {
                        if(v1 == v) {
                            return -1;
                        }
                        --v;
                        continue;
                    }
                    case 16: 
                    case 17: {
                        if(v1 == v) {
                            return 1;
                        }
                        --v;
                        continue;
                    }
                    case 18: {
                        break;
                    }
                    default: {
                        if(v1 != 0) {
                            continue;
                        }
                        v1 = v;
                        continue;
                    }
                }
                ++v;
            }
            return 0;
        }

        private byte f() {
            int v = this.d;
            do {
                int v1 = this.d;
                if(v1 <= 0) {
                    break;
                }
                this.d = v1 - 1;
                char c = this.a.charAt(v1 - 1);
                this.e = c;
                if(c == 38) {
                    return 12;
                }
            }
            while(c != 59);
            this.d = v;
            this.e = ';';
            return 13;
        }

        private byte g() {
            do {
                int v = this.d;
                if(v >= this.c) {
                    break;
                }
                this.d = v + 1;
                char c = this.a.charAt(v);
                this.e = c;
            }
            while(c != 59);
            return 12;
        }

        private byte h() {
            int v = this.d;
        alab1:
            while(true) {
            alab2:
                while(true) {
                    int v1 = this.d;
                    if(v1 <= 0) {
                        break alab1;
                    }
                    this.d = v1 - 1;
                    char c = this.a.charAt(v1 - 1);
                    this.e = c;
                    if(c == 60) {
                        return 12;
                    }
                    switch(c) {
                        case 34: 
                        case 39: {
                        label_10:
                            int v2 = this.d;
                            if(v2 <= 0) {
                                continue alab1;
                            }
                            this.d = v2 - 1;
                            char c1 = this.a.charAt(v2 - 1);
                            this.e = c1;
                            if(c1 == c) {
                                break;
                            }
                            break alab2;
                        }
                        case 62: {
                            break alab1;
                        }
                    }
                }
                goto label_10;
            }
            this.d = v;
            this.e = '>';
            return 13;
        }

        private byte i() {
            int v2;
            int v = this.d;
        alab1:
            while(true) {
                do {
                    do {
                        int v1 = this.d;
                        if(v1 >= this.c) {
                            break alab1;
                        }
                        this.d = v1 + 1;
                        char c = this.a.charAt(v1);
                        this.e = c;
                        if(c == 62) {
                            return 12;
                        }
                        if(c != 34 && c != 39) {
                            continue alab1;
                        }
                    label_9:
                        v2 = this.d;
                    }
                    while(v2 >= this.c);
                    this.d = v2 + 1;
                    char c1 = this.a.charAt(v2);
                    this.e = c1;
                }
                while(c1 == c);
                goto label_9;
            }
            this.d = v;
            this.e = '<';
            return 13;
        }
    }

    private final boolean a;
    private final int b;
    private final TextDirectionHeuristicCompat c;
    static final TextDirectionHeuristicCompat d = null;
    private static final char e = '‪';
    private static final char f = '‫';
    private static final char g = '‬';
    private static final char h = '‎';
    private static final char i = '‏';
    private static final String j = null;
    private static final String k = null;
    private static final String l = "";
    private static final int m = 2;
    private static final int n = 2;
    static final BidiFormatter o = null;
    static final BidiFormatter p = null;
    private static final int q = -1;
    private static final int r = 0;
    private static final int s = 1;

    static {
        BidiFormatter.d = TextDirectionHeuristicsCompat.c;
        BidiFormatter.j = "‎";
        BidiFormatter.k = "\u200F";
        BidiFormatter.o = new BidiFormatter(false, 2, TextDirectionHeuristicsCompat.c);
        BidiFormatter.p = new BidiFormatter(true, 2, TextDirectionHeuristicsCompat.c);
    }

    BidiFormatter(boolean z, int v, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        this.a = z;
        this.b = v;
        this.c = textDirectionHeuristicCompat0;
    }

    private static int a(CharSequence charSequence0) {
        return new DirectionalityEstimator(charSequence0, false).d();
    }

    private static int b(CharSequence charSequence0) {
        return new DirectionalityEstimator(charSequence0, false).e();
    }

    public static BidiFormatter c() {
        return new Builder().a();
    }

    public static BidiFormatter d(Locale locale0) {
        return new Builder(locale0).a();
    }

    public static BidiFormatter e(boolean z) {
        return new Builder(z).a();
    }

    public boolean f() {
        return (this.b & 2) != 0;
    }

    public boolean g(CharSequence charSequence0) {
        int v = charSequence0.length();
        return this.c.a(charSequence0, 0, v);
    }

    public boolean h(String s) {
        return this.g(s);
    }

    public boolean i() {
        return this.a;
    }

    static boolean j(Locale locale0) {
        return TextUtilsCompat.a(locale0) == 1;
    }

    // 去混淆评级： 低(20)
    private String k(CharSequence charSequence0, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        boolean z = textDirectionHeuristicCompat0.a(charSequence0, 0, charSequence0.length());
        if(!this.a && (z || BidiFormatter.b(charSequence0) == 1)) {
            return "‎";
        }
        return !this.a || z && BidiFormatter.b(charSequence0) != -1 ? "" : "\u200F";
    }

    // 去混淆评级： 低(20)
    private String l(CharSequence charSequence0, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        boolean z = textDirectionHeuristicCompat0.a(charSequence0, 0, charSequence0.length());
        if(!this.a && (z || BidiFormatter.a(charSequence0) == 1)) {
            return "‎";
        }
        return !this.a || z && BidiFormatter.a(charSequence0) != -1 ? "" : "\u200F";
    }

    public CharSequence m(CharSequence charSequence0) {
        return this.o(charSequence0, this.c, true);
    }

    public CharSequence n(CharSequence charSequence0, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        return this.o(charSequence0, textDirectionHeuristicCompat0, true);
    }

    public CharSequence o(CharSequence charSequence0, TextDirectionHeuristicCompat textDirectionHeuristicCompat0, boolean z) {
        if(charSequence0 == null) {
            return null;
        }
        boolean z1 = textDirectionHeuristicCompat0.a(charSequence0, 0, charSequence0.length());
        CharSequence charSequence1 = new SpannableStringBuilder();
        if(this.f() && z) {
            ((SpannableStringBuilder)charSequence1).append(this.l(charSequence0, (z1 ? TextDirectionHeuristicsCompat.b : TextDirectionHeuristicsCompat.a)));
        }
        if(z1 == this.a) {
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
        }
        else {
            ((SpannableStringBuilder)charSequence1).append(((char)(z1 ? 0x202B : 0x202A)));
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
            ((SpannableStringBuilder)charSequence1).append('‬');
        }
        if(z) {
            ((SpannableStringBuilder)charSequence1).append(this.k(charSequence0, (z1 ? TextDirectionHeuristicsCompat.b : TextDirectionHeuristicsCompat.a)));
        }
        return charSequence1;
    }

    public CharSequence p(CharSequence charSequence0, boolean z) {
        return this.o(charSequence0, this.c, z);
    }

    public String q(String s) {
        return this.s(s, this.c, true);
    }

    public String r(String s, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        return this.s(s, textDirectionHeuristicCompat0, true);
    }

    public String s(String s, TextDirectionHeuristicCompat textDirectionHeuristicCompat0, boolean z) {
        return s == null ? null : this.o(s, textDirectionHeuristicCompat0, z).toString();
    }

    public String t(String s, boolean z) {
        return this.s(s, this.c, z);
    }
}

