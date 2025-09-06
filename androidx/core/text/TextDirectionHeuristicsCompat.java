package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

public final class TextDirectionHeuristicsCompat {
    static class AnyStrong implements TextDirectionAlgorithm {
        private final boolean a;
        static final AnyStrong b;

        static {
            AnyStrong.b = new AnyStrong(true);
        }

        private AnyStrong(boolean z) {
            this.a = z;
        }

        @Override  // androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm
        public int a(CharSequence charSequence0, int v, int v1) {
            int v2 = v1 + v;
            boolean z = false;
            while(v < v2) {
                switch(TextDirectionHeuristicsCompat.a(Character.getDirectionality(charSequence0.charAt(v)))) {
                    case 0: {
                        if(this.a) {
                            return 0;
                        }
                        z = true;
                        break;
                    }
                    case 1: {
                        if(!this.a) {
                            return 1;
                        }
                        z = true;
                    }
                }
                ++v;
            }
            return z ? this.a : 2;
        }
    }

    static class FirstStrong implements TextDirectionAlgorithm {
        static final FirstStrong a;

        static {
            FirstStrong.a = new FirstStrong();
        }

        @Override  // androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm
        public int a(CharSequence charSequence0, int v, int v1) {
            int v2 = v1 + v;
            int v3 = 2;
            while(v < v2 && v3 == 2) {
                v3 = TextDirectionHeuristicsCompat.b(Character.getDirectionality(charSequence0.charAt(v)));
                ++v;
            }
            return v3;
        }
    }

    interface TextDirectionAlgorithm {
        int a(CharSequence arg1, int arg2, int arg3);
    }

    static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm a;

        TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionHeuristicsCompat$TextDirectionAlgorithm0) {
            this.a = textDirectionHeuristicsCompat$TextDirectionAlgorithm0;
        }

        @Override  // androidx.core.text.TextDirectionHeuristicCompat
        public boolean a(CharSequence charSequence0, int v, int v1) {
            if(charSequence0 == null || v < 0 || v1 < 0 || charSequence0.length() - v1 < v) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? this.c() : this.d(charSequence0, v, v1);
        }

        @Override  // androidx.core.text.TextDirectionHeuristicCompat
        public boolean b(char[] arr_c, int v, int v1) {
            return this.a(CharBuffer.wrap(arr_c), v, v1);
        }

        protected abstract boolean c();

        private boolean d(CharSequence charSequence0, int v, int v1) {
            switch(this.a.a(charSequence0, v, v1)) {
                case 0: {
                    return true;
                }
                case 1: {
                    return false;
                }
                default: {
                    return this.c();
                }
            }
        }
    }

    static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean b;

        TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionHeuristicsCompat$TextDirectionAlgorithm0, boolean z) {
            super(textDirectionHeuristicsCompat$TextDirectionAlgorithm0);
            this.b = z;
        }

        @Override  // androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl
        protected boolean c() {
            return this.b;
        }
    }

    static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        static final TextDirectionHeuristicLocale b;

        static {
            TextDirectionHeuristicLocale.b = new TextDirectionHeuristicLocale();
        }

        TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override  // androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl
        protected boolean c() {
            return TextUtilsCompat.a(Locale.getDefault()) == 1;
        }
    }

    public static final TextDirectionHeuristicCompat a = null;
    public static final TextDirectionHeuristicCompat b = null;
    public static final TextDirectionHeuristicCompat c = null;
    public static final TextDirectionHeuristicCompat d = null;
    public static final TextDirectionHeuristicCompat e = null;
    public static final TextDirectionHeuristicCompat f = null;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;

    static {
        TextDirectionHeuristicsCompat.a = new TextDirectionHeuristicInternal(null, false);
        TextDirectionHeuristicsCompat.b = new TextDirectionHeuristicInternal(null, true);
        TextDirectionHeuristicsCompat.c = new TextDirectionHeuristicInternal(FirstStrong.a, false);
        TextDirectionHeuristicsCompat.d = new TextDirectionHeuristicInternal(FirstStrong.a, true);
        TextDirectionHeuristicsCompat.e = new TextDirectionHeuristicInternal(AnyStrong.b, false);
        TextDirectionHeuristicsCompat.f = TextDirectionHeuristicLocale.b;
    }

    static int a(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 0;
            }
            default: {
                return v == 2 ? 0 : 2;
            }
        }
    }

    static int b(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                break;
            }
            default: {
                if(v != 2) {
                    switch(v) {
                        case 14: 
                        case 15: {
                            return 1;
                        }
                        case 16: 
                        case 17: {
                            break;
                        }
                        default: {
                            return 2;
                        }
                    }
                }
            }
        }
        return 0;
    }
}

