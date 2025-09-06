package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import y4.l;

@Immutable
public final class GenericFontFamily extends SystemFontFamily {
    @l
    private final String j;
    @l
    private final String k;
    public static final int l;

    static {
    }

    public GenericFontFamily(@l String s, @l String s1) {
        L.p(s, "name");
        L.p(s1, "fontFamilyName");
        super(null);
        this.j = s;
        this.k = s1;
    }

    @l
    public final String j() {
        return this.j;
    }

    @Override
    @l
    public String toString() {
        return this.k;
    }
}

