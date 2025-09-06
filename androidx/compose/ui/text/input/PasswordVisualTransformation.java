package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class PasswordVisualTransformation implements VisualTransformation {
    private final char b;
    public static final int c;

    static {
    }

    public PasswordVisualTransformation() {
        this('\u0000', 1, null);
    }

    public PasswordVisualTransformation(char c) {
        this.b = c;
    }

    public PasswordVisualTransformation(char c, int v, w w0) {
        if((v & 1) != 0) {
            c = '•';
        }
        this(c);
    }

    @Override  // androidx.compose.ui.text.input.VisualTransformation
    @l
    public TransformedText a(@l AnnotatedString annotatedString0) {
        L.p(annotatedString0, "text");
        return new TransformedText(new AnnotatedString(v.h2(String.valueOf(this.b), annotatedString0.j().length()), null, null, 6, null), OffsetMapping.a.a());
    }

    public final char b() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PasswordVisualTransformation ? this.b == ((PasswordVisualTransformation)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.b;
    }
}

