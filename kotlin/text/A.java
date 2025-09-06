package kotlin.text;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum a {
    public static final class kotlin.text.a.a {
        private kotlin.text.a.a() {
        }

        public kotlin.text.a.a(w w0) {
        }

        @l
        public final a a(int v) {
            if(v >= 0 && v < 17) {
                return (a)a.d().get(v);
            }
            if(18 > v || v >= 0x1F) {
                throw new IllegalArgumentException("Category #" + v + " is not defined.");
            }
            return (a)a.d().get(v - 1);
        }
    }

    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");

    private static final a[] H;
    private static final kotlin.enums.a I;
    private final int a;
    @l
    private final String b;
    @l
    public static final kotlin.text.a.a c;

    static {
        a.H = arr_a;
        L.p(arr_a, "entries");
        a.I = new d(arr_a);
        a.c = new kotlin.text.a.a(null);
    }

    private a(int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    private static final a[] a() [...] // Inlined contents

    public final boolean b(char c) {
        return Character.getType(c) == this.a;
    }

    @l
    public final String c() {
        return this.b;
    }

    @l
    public static kotlin.enums.a d() {
        return a.I;
    }

    public final int e() {
        return this.a;
    }
}

