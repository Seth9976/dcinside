package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class TransformedText {
    @l
    private final AnnotatedString a;
    @l
    private final OffsetMapping b;
    public static final int c = 8;

    static {
    }

    public TransformedText(@l AnnotatedString annotatedString0, @l OffsetMapping offsetMapping0) {
        L.p(annotatedString0, "text");
        L.p(offsetMapping0, "offsetMapping");
        super();
        this.a = annotatedString0;
        this.b = offsetMapping0;
    }

    @l
    public final OffsetMapping a() {
        return this.b;
    }

    @l
    public final AnnotatedString b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransformedText)) {
            return false;
        }
        return L.g(this.a, ((TransformedText)object0).a) ? L.g(this.b, ((TransformedText)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ')';
    }
}

