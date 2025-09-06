package androidx.compose.foundation.text;

import A3.p;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.jvm.internal.L;
import y4.l;

@Immutable
public final class InlineTextContent {
    @l
    private final Placeholder a;
    @l
    private final p b;
    public static final int c;

    static {
    }

    public InlineTextContent(@l Placeholder placeholder0, @l p p0) {
        L.p(placeholder0, "placeholder");
        L.p(p0, "children");
        super();
        this.a = placeholder0;
        this.b = p0;
    }

    @l
    public final p a() {
        return this.b;
    }

    @l
    public final Placeholder b() {
        return this.a;
    }
}

