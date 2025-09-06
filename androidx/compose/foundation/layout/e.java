package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

public final class e {
    public static Modifier a(RowScope rowScope0, Modifier modifier0, float f, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if((v & 2) != 0) {
            z = true;
        }
        return rowScope0.b(modifier0, f, z);
    }
}

