package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class TextFieldValue {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return TextFieldValue.f;
        }
    }

    @l
    private final AnnotatedString a;
    private final long b;
    @m
    private final TextRange c;
    @l
    public static final Companion d;
    public static final int e;
    @l
    private static final Saver f;

    static {
        TextFieldValue.d = new Companion(null);
        TextFieldValue.f = SaverKt.a(TextFieldValue.Companion.Saver.1.e, TextFieldValue.Companion.Saver.2.e);
    }

    private TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0) {
        this.a = annotatedString0;
        this.b = TextRangeKt.c(v, 0, this.i().length());
        this.c = textRange0 == null ? null : TextRange.b(TextRangeKt.c(textRange0.r(), 0, this.i().length()));
    }

    public TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0, int v1, w w0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            textRange0 = null;
        }
        this(annotatedString0, v, textRange0, null);
    }

    public TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0, w w0) {
        this(annotatedString0, v, textRange0);
    }

    private TextFieldValue(String s, long v, TextRange textRange0) {
        this(new AnnotatedString(s, null, null, 6, null), v, textRange0, null);
    }

    public TextFieldValue(String s, long v, TextRange textRange0, int v1, w w0) {
        if((v1 & 1) != 0) {
            s = "";
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            textRange0 = null;
        }
        this(s, v, textRange0, null);
    }

    public TextFieldValue(String s, long v, TextRange textRange0, w w0) {
        this(s, v, textRange0);
    }

    @l
    public final TextFieldValue b(@l AnnotatedString annotatedString0, long v, @m TextRange textRange0) {
        L.p(annotatedString0, "annotatedString");
        return new TextFieldValue(annotatedString0, v, textRange0, null);
    }

    @l
    public final TextFieldValue c(@l String s, long v, @m TextRange textRange0) {
        L.p(s, "text");
        return new TextFieldValue(new AnnotatedString(s, null, null, 6, null), v, textRange0, null);
    }

    public static TextFieldValue d(TextFieldValue textFieldValue0, AnnotatedString annotatedString0, long v, TextRange textRange0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            annotatedString0 = textFieldValue0.a;
        }
        if((v1 & 2) != 0) {
            v = textFieldValue0.b;
        }
        if((v1 & 4) != 0) {
            textRange0 = textFieldValue0.c;
        }
        return textFieldValue0.b(annotatedString0, v, textRange0);
    }

    public static TextFieldValue e(TextFieldValue textFieldValue0, String s, long v, TextRange textRange0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = textFieldValue0.b;
        }
        if((v1 & 4) != 0) {
            textRange0 = textFieldValue0.c;
        }
        return textFieldValue0.c(s, v, textRange0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextFieldValue ? TextRange.g(this.b, ((TextFieldValue)object0).b) && L.g(this.c, ((TextFieldValue)object0).c) && L.g(this.a, ((TextFieldValue)object0).a) : false;
    }

    @l
    public final AnnotatedString f() {
        return this.a;
    }

    @m
    public final TextRange g() {
        return this.c;
    }

    public final long h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = TextRange.o(this.b);
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + TextRange.o(this.c.r());
    }

    @l
    public final String i() {
        return this.a.j();
    }

    @Override
    @l
    public String toString() {
        return "TextFieldValue(text=\'" + this.a + "\', selection=" + TextRange.q(this.b) + ", composition=" + this.c + ')';
    }
}

