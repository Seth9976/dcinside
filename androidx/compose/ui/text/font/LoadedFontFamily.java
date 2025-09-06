package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class LoadedFontFamily extends FontFamily {
    @l
    private final Typeface i;
    public static final int j;

    static {
    }

    public LoadedFontFamily(@l Typeface typeface0) {
        L.p(typeface0, "typeface");
        super(true, null);
        this.i = typeface0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LoadedFontFamily ? L.g(this.i, ((LoadedFontFamily)object0).i) : false;
    }

    @Override
    public int hashCode() {
        return this.i.hashCode();
    }

    @l
    public final Typeface j() {
        return this.i;
    }

    @Override
    @l
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.i + ')';
    }
}

