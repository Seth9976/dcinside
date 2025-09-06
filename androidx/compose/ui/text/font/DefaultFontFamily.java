package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import y4.l;

@Immutable
public final class DefaultFontFamily extends SystemFontFamily {
    public DefaultFontFamily() {
        super(null);
    }

    @Override
    @l
    public String toString() {
        return "FontFamily.Default";
    }
}

