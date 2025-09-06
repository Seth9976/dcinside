package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class WordIterator {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final boolean a(int v) {
            switch(Character.getType(v)) {
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 29: 
                case 30: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    @l
    private final CharSequence a;
    private final int b;
    private final int c;
    @l
    private final BreakIterator d;
    @l
    public static final Companion e = null;
    private static final int f = 50;

    static {
        WordIterator.e = new Companion(null);
    }

    public WordIterator(@l CharSequence charSequence0, int v, int v1, @m Locale locale0) {
        L.p(charSequence0, "charSequence");
        super();
        this.a = charSequence0;
        if(v < 0 || v > charSequence0.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if(v1 < 0 || v1 > charSequence0.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator breakIterator0 = BreakIterator.getWordInstance(locale0);
        L.o(breakIterator0, "getWordInstance(locale)");
        this.d = breakIterator0;
        this.b = Math.max(0, v - 50);
        this.c = Math.min(charSequence0.length(), v1 + 50);
        breakIterator0.setText(new CharSequenceCharacterIterator(charSequence0, v, v1));
    }

    private final void a(int v) {
        if(v > this.c || this.b > v) {
            throw new IllegalArgumentException(("Invalid offset: " + v + ". Valid range is [" + this.b + " , " + this.c + ']').toString());
        }
    }

    private final int b(int v, boolean z) {
        this.a(v);
        if(this.j(v)) {
            return this.d.isBoundary(v) && (!this.h(v) || !z) ? v : this.d.preceding(v);
        }
        return this.h(v) ? this.d.preceding(v) : -1;
    }

    private final int c(int v, boolean z) {
        this.a(v);
        if(this.h(v)) {
            return this.d.isBoundary(v) && (!this.j(v) || !z) ? v : this.d.following(v);
        }
        return this.j(v) ? this.d.following(v) : -1;
    }

    public final int d(int v) {
        return this.c(v, true);
    }

    public final int e(int v) {
        return this.b(v, true);
    }

    public final int f(int v) {
        this.a(v);
        while(v != -1 && !this.m(v)) {
            v = this.o(v);
        }
        return v;
    }

    public final int g(int v) {
        this.a(v);
        while(v != -1 && !this.l(v)) {
            v = this.n(v);
        }
        return v;
    }

    private final boolean h(int v) {
        return v <= this.c && this.b + 1 <= v && Character.isLetterOrDigit(Character.codePointBefore(this.a, v));
    }

    public final boolean i(int v) {
        return v > this.c || this.b + 1 > v ? false : WordIterator.e.a(Character.codePointBefore(this.a, v));
    }

    private final boolean j(int v) {
        return v < this.c && this.b <= v && Character.isLetterOrDigit(Character.codePointAt(this.a, v));
    }

    public final boolean k(int v) {
        return v >= this.c || this.b > v ? false : WordIterator.e.a(Character.codePointAt(this.a, v));
    }

    // 去混淆评级： 低(20)
    private final boolean l(int v) {
        return !this.k(v) && this.i(v);
    }

    // 去混淆评级： 低(20)
    private final boolean m(int v) {
        return this.k(v) && !this.i(v);
    }

    public final int n(int v) {
        this.a(v);
        return this.d.following(v);
    }

    public final int o(int v) {
        this.a(v);
        return this.d.preceding(v);
    }
}

