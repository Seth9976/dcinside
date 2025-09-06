package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class AccessibilityIterators {
    @StabilityInferred(parameters = 0)
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        protected String a;
        @l
        private final int[] b;
        public static final int c = 8;

        static {
        }

        public AbstractTextSegmentIterator() {
            this.b = new int[2];
        }

        @m
        protected final int[] c(int v, int v1) {
            if(v >= 0 && v1 >= 0 && v != v1) {
                this.b[0] = v;
                this.b[1] = v1;
                return this.b;
            }
            return null;
        }

        @l
        protected final String d() {
            String s = this.a;
            if(s != null) {
                return s;
            }
            L.S("text");
            return null;
        }

        public void e(@l String s) {
            L.p(s, "text");
            this.f(s);
        }

        protected final void f(@l String s) {
            L.p(s, "<set-?>");
            this.a = s;
        }
    }

    @StabilityInferred(parameters = 0)
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @l
            public final CharacterTextSegmentIterator a(@l Locale locale0) {
                L.p(locale0, "locale");
                if(CharacterTextSegmentIterator.g == null) {
                    CharacterTextSegmentIterator.g = new CharacterTextSegmentIterator(locale0, null);
                }
                CharacterTextSegmentIterator accessibilityIterators$CharacterTextSegmentIterator0 = CharacterTextSegmentIterator.g;
                L.n(accessibilityIterators$CharacterTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return accessibilityIterators$CharacterTextSegmentIterator0;
            }
        }

        private BreakIterator d;
        @l
        public static final Companion e;
        public static final int f;
        @m
        private static CharacterTextSegmentIterator g;

        static {
            CharacterTextSegmentIterator.e = new Companion(null);
            CharacterTextSegmentIterator.f = 8;
        }

        private CharacterTextSegmentIterator(Locale locale0) {
            this.i(locale0);
        }

        public CharacterTextSegmentIterator(Locale locale0, w w0) {
            this(locale0);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] a(int v) {
            int v1 = this.d().length();
            if(v1 <= 0) {
                return null;
            }
            if(v >= v1) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(true) {
                BreakIterator breakIterator0 = this.d;
                if(breakIterator0 == null) {
                    L.S("impl");
                    breakIterator0 = null;
                }
                if(breakIterator0.isBoundary(v)) {
                    break;
                }
                BreakIterator breakIterator1 = this.d;
                if(breakIterator1 == null) {
                    L.S("impl");
                    breakIterator1 = null;
                }
                v = breakIterator1.following(v);
                if(v == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.d;
            if(breakIterator2 == null) {
                L.S("impl");
                breakIterator2 = null;
            }
            int v2 = breakIterator2.following(v);
            return v2 == -1 ? null : this.c(v, v2);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] b(int v) {
            int v1 = this.d().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(true) {
                BreakIterator breakIterator0 = this.d;
                if(breakIterator0 == null) {
                    L.S("impl");
                    breakIterator0 = null;
                }
                if(breakIterator0.isBoundary(v)) {
                    break;
                }
                BreakIterator breakIterator1 = this.d;
                if(breakIterator1 == null) {
                    L.S("impl");
                    breakIterator1 = null;
                }
                v = breakIterator1.preceding(v);
                if(v == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.d;
            if(breakIterator2 == null) {
                L.S("impl");
                breakIterator2 = null;
            }
            int v2 = breakIterator2.preceding(v);
            return v2 == -1 ? null : this.c(v2, v);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator
        public void e(@l String s) {
            L.p(s, "text");
            super.e(s);
            BreakIterator breakIterator0 = this.d;
            if(breakIterator0 == null) {
                L.S("impl");
                breakIterator0 = null;
            }
            breakIterator0.setText(s);
        }

        private final void i(Locale locale0) {
            BreakIterator breakIterator0 = BreakIterator.getCharacterInstance(locale0);
            L.o(breakIterator0, "getCharacterInstance(locale)");
            this.d = breakIterator0;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final class androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(w w0) {
            }

            @l
            public final LineTextSegmentIterator a() {
                if(LineTextSegmentIterator.g == null) {
                    LineTextSegmentIterator.g = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator accessibilityIterators$LineTextSegmentIterator0 = LineTextSegmentIterator.g;
                L.n(accessibilityIterators$LineTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return accessibilityIterators$LineTextSegmentIterator0;
            }
        }

        private TextLayoutResult d;
        @l
        public static final androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion e;
        public static final int f;
        @m
        private static LineTextSegmentIterator g;
        @l
        private static final ResolvedTextDirection h;
        @l
        private static final ResolvedTextDirection i;

        static {
            LineTextSegmentIterator.e = new androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(null);
            LineTextSegmentIterator.f = 8;
            LineTextSegmentIterator.h = ResolvedTextDirection.b;
            LineTextSegmentIterator.i = ResolvedTextDirection.a;
        }

        private LineTextSegmentIterator() {
        }

        public LineTextSegmentIterator(w w0) {
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] a(int v) {
            int v1;
            if(this.d().length() <= 0) {
                return null;
            }
            if(v >= this.d().length()) {
                return null;
            }
            if(v < 0) {
                TextLayoutResult textLayoutResult0 = this.d;
                if(textLayoutResult0 == null) {
                    L.S("layoutResult");
                    textLayoutResult0 = null;
                }
                v1 = textLayoutResult0.q(0);
            }
            else {
                TextLayoutResult textLayoutResult1 = this.d;
                if(textLayoutResult1 == null) {
                    L.S("layoutResult");
                    textLayoutResult1 = null;
                }
                int v2 = textLayoutResult1.q(v);
                v1 = this.i(v2, LineTextSegmentIterator.h) == v ? v2 : v2 + 1;
            }
            TextLayoutResult textLayoutResult2 = this.d;
            if(textLayoutResult2 == null) {
                L.S("layoutResult");
                textLayoutResult2 = null;
            }
            return v1 < textLayoutResult2.n() ? this.c(this.i(v1, LineTextSegmentIterator.h), this.i(v1, LineTextSegmentIterator.i) + 1) : null;
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] b(int v) {
            int v1;
            if(this.d().length() <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > this.d().length()) {
                TextLayoutResult textLayoutResult0 = this.d;
                if(textLayoutResult0 == null) {
                    L.S("layoutResult");
                    textLayoutResult0 = null;
                }
                v1 = textLayoutResult0.q(this.d().length());
                return v1 >= 0 ? this.c(this.i(v1, LineTextSegmentIterator.h), this.i(v1, LineTextSegmentIterator.i) + 1) : null;
            }
            TextLayoutResult textLayoutResult1 = this.d;
            if(textLayoutResult1 == null) {
                L.S("layoutResult");
                textLayoutResult1 = null;
            }
            int v2 = textLayoutResult1.q(v);
            v1 = this.i(v2, LineTextSegmentIterator.i) + 1 == v ? v2 : v2 - 1;
            return v1 >= 0 ? this.c(this.i(v1, LineTextSegmentIterator.h), this.i(v1, LineTextSegmentIterator.i) + 1) : null;
        }

        private final int i(int v, ResolvedTextDirection resolvedTextDirection0) {
            TextLayoutResult textLayoutResult0 = this.d;
            if(textLayoutResult0 == null) {
                L.S("layoutResult");
                textLayoutResult0 = null;
            }
            int v1 = textLayoutResult0.u(v);
            TextLayoutResult textLayoutResult1 = this.d;
            if(textLayoutResult1 == null) {
                L.S("layoutResult");
                textLayoutResult1 = null;
            }
            if(resolvedTextDirection0 != textLayoutResult1.y(v1)) {
                TextLayoutResult textLayoutResult2 = this.d;
                if(textLayoutResult2 == null) {
                    L.S("layoutResult");
                    throw new NullPointerException();
                }
                return textLayoutResult2.u(v);
            }
            TextLayoutResult textLayoutResult3 = this.d;
            if(textLayoutResult3 == null) {
                L.S("layoutResult");
                textLayoutResult3 = null;
            }
            return TextLayoutResult.p(textLayoutResult3, v, false, 2, null) - 1;
        }

        public final void j(@l String s, @l TextLayoutResult textLayoutResult0) {
            L.p(s, "text");
            L.p(textLayoutResult0, "layoutResult");
            this.f(s);
            this.d = textLayoutResult0;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final class androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(w w0) {
            }

            @l
            public final PageTextSegmentIterator a() {
                if(PageTextSegmentIterator.i == null) {
                    PageTextSegmentIterator.i = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator0 = PageTextSegmentIterator.i;
                L.n(accessibilityIterators$PageTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return accessibilityIterators$PageTextSegmentIterator0;
            }
        }

        private TextLayoutResult d;
        private SemanticsNode e;
        @l
        private Rect f;
        @l
        public static final androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion g;
        public static final int h;
        @m
        private static PageTextSegmentIterator i;
        @l
        private static final ResolvedTextDirection j;
        @l
        private static final ResolvedTextDirection k;

        static {
            PageTextSegmentIterator.g = new androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(null);
            PageTextSegmentIterator.h = 8;
            PageTextSegmentIterator.j = ResolvedTextDirection.b;
            PageTextSegmentIterator.k = ResolvedTextDirection.a;
        }

        private PageTextSegmentIterator() {
            this.f = new Rect();
        }

        public PageTextSegmentIterator(w w0) {
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] a(int v) {
            int v1;
            if(this.d().length() <= 0) {
                return null;
            }
            if(v >= this.d().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode0 = this.e;
                if(semanticsNode0 == null) {
                    L.S("node");
                    semanticsNode0 = null;
                }
                v1 = b.L0(semanticsNode0.g().r());
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
            int v2 = s.u(0, v);
            TextLayoutResult textLayoutResult0 = this.d;
            if(textLayoutResult0 == null) {
                L.S("layoutResult");
                textLayoutResult0 = null;
            }
            int v3 = textLayoutResult0.q(v2);
            TextLayoutResult textLayoutResult1 = this.d;
            if(textLayoutResult1 == null) {
                L.S("layoutResult");
                textLayoutResult1 = null;
            }
            float f = textLayoutResult1.v(v3) + ((float)v1);
            TextLayoutResult textLayoutResult2 = this.d;
            if(textLayoutResult2 == null) {
                L.S("layoutResult");
                textLayoutResult2 = null;
            }
            TextLayoutResult textLayoutResult3 = this.d;
            if(textLayoutResult3 == null) {
                L.S("layoutResult");
                textLayoutResult3 = null;
            }
            if(f < textLayoutResult2.v(textLayoutResult3.n() - 1)) {
                TextLayoutResult textLayoutResult4 = this.d;
                if(textLayoutResult4 == null) {
                    L.S("layoutResult");
                    throw new NullPointerException();
                }
                return this.c(v2, this.i(textLayoutResult4.r(f) - 1, PageTextSegmentIterator.k) + 1);
            }
            TextLayoutResult textLayoutResult5 = this.d;
            if(textLayoutResult5 == null) {
                L.S("layoutResult");
                throw new NullPointerException();
            }
            return this.c(v2, this.i(textLayoutResult5.n() - 1, PageTextSegmentIterator.k) + 1);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] b(int v) {
            int v4;
            int v1;
            TextLayoutResult textLayoutResult0 = null;
            if(this.d().length() <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode0 = this.e;
                if(semanticsNode0 == null) {
                    L.S("node");
                    semanticsNode0 = null;
                }
                v1 = b.L0(semanticsNode0.g().r());
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
            int v2 = s.B(this.d().length(), v);
            TextLayoutResult textLayoutResult1 = this.d;
            if(textLayoutResult1 == null) {
                L.S("layoutResult");
                textLayoutResult1 = null;
            }
            int v3 = textLayoutResult1.q(v2);
            TextLayoutResult textLayoutResult2 = this.d;
            if(textLayoutResult2 == null) {
                L.S("layoutResult");
                textLayoutResult2 = null;
            }
            float f = textLayoutResult2.v(v3) - ((float)v1);
            if(f > 0.0f) {
                TextLayoutResult textLayoutResult3 = this.d;
                if(textLayoutResult3 == null) {
                    L.S("layoutResult");
                }
                else {
                    textLayoutResult0 = textLayoutResult3;
                }
                v4 = textLayoutResult0.r(f);
            }
            else {
                v4 = 0;
            }
            if(v2 == this.d().length() && v4 < v3) {
                ++v4;
            }
            return this.c(this.i(v4, PageTextSegmentIterator.j), v2);
        }

        private final int i(int v, ResolvedTextDirection resolvedTextDirection0) {
            TextLayoutResult textLayoutResult0 = this.d;
            if(textLayoutResult0 == null) {
                L.S("layoutResult");
                textLayoutResult0 = null;
            }
            int v1 = textLayoutResult0.u(v);
            TextLayoutResult textLayoutResult1 = this.d;
            if(textLayoutResult1 == null) {
                L.S("layoutResult");
                textLayoutResult1 = null;
            }
            if(resolvedTextDirection0 != textLayoutResult1.y(v1)) {
                TextLayoutResult textLayoutResult2 = this.d;
                if(textLayoutResult2 == null) {
                    L.S("layoutResult");
                    throw new NullPointerException();
                }
                return textLayoutResult2.u(v);
            }
            TextLayoutResult textLayoutResult3 = this.d;
            if(textLayoutResult3 == null) {
                L.S("layoutResult");
                textLayoutResult3 = null;
            }
            return TextLayoutResult.p(textLayoutResult3, v, false, 2, null) - 1;
        }

        public final void j(@l String s, @l TextLayoutResult textLayoutResult0, @l SemanticsNode semanticsNode0) {
            L.p(s, "text");
            L.p(textLayoutResult0, "layoutResult");
            L.p(semanticsNode0, "node");
            this.f(s);
            this.d = textLayoutResult0;
            this.e = semanticsNode0;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final class androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(w w0) {
            }

            @l
            public final ParagraphTextSegmentIterator a() {
                if(ParagraphTextSegmentIterator.f == null) {
                    ParagraphTextSegmentIterator.f = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator accessibilityIterators$ParagraphTextSegmentIterator0 = ParagraphTextSegmentIterator.f;
                L.n(accessibilityIterators$ParagraphTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return accessibilityIterators$ParagraphTextSegmentIterator0;
            }
        }

        @l
        public static final androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion d;
        public static final int e;
        @m
        private static ParagraphTextSegmentIterator f;

        static {
            ParagraphTextSegmentIterator.d = new androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(null);
        }

        private ParagraphTextSegmentIterator() {
        }

        public ParagraphTextSegmentIterator(w w0) {
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] a(int v) {
            int v1 = this.d().length();
            if(v1 <= 0) {
                return null;
            }
            if(v >= v1) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(v < v1 && this.d().charAt(v) == 10 && !this.j(v)) {
                ++v;
            }
            if(v >= v1) {
                return null;
            }
            int v2;
            for(v2 = v + 1; v2 < v1 && !this.i(v2); ++v2) {
            }
            return this.c(v, v2);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] b(int v) {
            int v1 = this.d().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(v > 0 && this.d().charAt(v - 1) == 10 && !this.i(v)) {
                --v;
            }
            if(v <= 0) {
                return null;
            }
            int v2;
            for(v2 = v - 1; v2 > 0 && !this.j(v2); --v2) {
            }
            return this.c(v2, v);
        }

        private final boolean i(int v) {
            return v > 0 && this.d().charAt(v - 1) != 10 && (v == this.d().length() || this.d().charAt(v) == 10);
        }

        private final boolean j(int v) {
            return this.d().charAt(v) != 10 && (v == 0 || this.d().charAt(v - 1) == 10);
        }
    }

    public interface TextSegmentIterator {
        @m
        int[] a(int arg1);

        @m
        int[] b(int arg1);
    }

    @StabilityInferred(parameters = 0)
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final class androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion {
            private androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion() {
            }

            public androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(w w0) {
            }

            @l
            public final WordTextSegmentIterator a(@l Locale locale0) {
                L.p(locale0, "locale");
                if(WordTextSegmentIterator.g == null) {
                    WordTextSegmentIterator.g = new WordTextSegmentIterator(locale0, null);
                }
                WordTextSegmentIterator accessibilityIterators$WordTextSegmentIterator0 = WordTextSegmentIterator.g;
                L.n(accessibilityIterators$WordTextSegmentIterator0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return accessibilityIterators$WordTextSegmentIterator0;
            }
        }

        private BreakIterator d;
        @l
        public static final androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion e;
        public static final int f;
        @m
        private static WordTextSegmentIterator g;

        static {
            WordTextSegmentIterator.e = new androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(null);
            WordTextSegmentIterator.f = 8;
        }

        private WordTextSegmentIterator(Locale locale0) {
            this.l(locale0);
        }

        public WordTextSegmentIterator(Locale locale0, w w0) {
            this(locale0);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] a(int v) {
            if(this.d().length() <= 0) {
                return null;
            }
            if(v >= this.d().length()) {
                return null;
            }
            if(v < 0) {
                v = 0;
            }
            while(!this.j(v) && !this.k(v)) {
                BreakIterator breakIterator0 = this.d;
                if(breakIterator0 == null) {
                    L.S("impl");
                    breakIterator0 = null;
                }
                v = breakIterator0.following(v);
                if(v == -1) {
                    return null;
                }
                if(false) {
                    break;
                }
            }
            BreakIterator breakIterator1 = this.d;
            if(breakIterator1 == null) {
                L.S("impl");
                breakIterator1 = null;
            }
            int v1 = breakIterator1.following(v);
            return v1 == -1 || !this.i(v1) ? null : this.c(v, v1);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator
        @m
        public int[] b(int v) {
            int v1 = this.d().length();
            if(v1 <= 0) {
                return null;
            }
            if(v <= 0) {
                return null;
            }
            if(v > v1) {
                v = v1;
            }
            while(v > 0 && !this.j(v - 1) && !this.i(v)) {
                BreakIterator breakIterator0 = this.d;
                if(breakIterator0 == null) {
                    L.S("impl");
                    breakIterator0 = null;
                }
                v = breakIterator0.preceding(v);
                if(v == -1) {
                    return null;
                }
                if(false) {
                    break;
                }
            }
            BreakIterator breakIterator1 = this.d;
            if(breakIterator1 == null) {
                L.S("impl");
                breakIterator1 = null;
            }
            int v2 = breakIterator1.preceding(v);
            return v2 == -1 || !this.k(v2) ? null : this.c(v2, v);
        }

        @Override  // androidx.compose.ui.platform.AccessibilityIterators$AbstractTextSegmentIterator
        public void e(@l String s) {
            L.p(s, "text");
            super.e(s);
            BreakIterator breakIterator0 = this.d;
            if(breakIterator0 == null) {
                L.S("impl");
                breakIterator0 = null;
            }
            breakIterator0.setText(s);
        }

        // 去混淆评级： 低(30)
        private final boolean i(int v) {
            return v > 0 && this.j(v - 1) && (v == this.d().length() || !this.j(v));
        }

        private final boolean j(int v) {
            return v < 0 || v >= this.d().length() ? false : Character.isLetterOrDigit(this.d().codePointAt(v));
        }

        // 去混淆评级： 低(20)
        private final boolean k(int v) {
            return this.j(v) && (v == 0 || !this.j(v - 1));
        }

        private final void l(Locale locale0) {
            BreakIterator breakIterator0 = BreakIterator.getWordInstance(locale0);
            L.o(breakIterator0, "getWordInstance(locale)");
            this.d = breakIterator0;
        }
    }

}

