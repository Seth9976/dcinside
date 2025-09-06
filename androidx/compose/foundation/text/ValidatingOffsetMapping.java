package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.internal.L;
import y4.l;

final class ValidatingOffsetMapping implements OffsetMapping {
    @l
    private final OffsetMapping b;
    private final int c;
    private final int d;

    public ValidatingOffsetMapping(@l OffsetMapping offsetMapping0, int v, int v1) {
        L.p(offsetMapping0, "delegate");
        super();
        this.b = offsetMapping0;
        this.c = v;
        this.d = v1;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int a(int v) {
        int v1 = this.b.a(v);
        if(v1 < 0 || v1 > this.c) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + v + " -> " + v1 + " is not in range of original text [0, " + this.c + ']').toString());
        }
        return v1;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int b(int v) {
        int v1 = this.b.b(v);
        if(v1 < 0 || v1 > this.d) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + v + " -> " + v1 + " is not in range of transformed text [0, " + this.d + ']').toString());
        }
        return v1;
    }
}

