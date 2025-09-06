package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;

public final class b {
    public static State a(Resolver fontFamily$Resolver0, FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
        if((v2 & 1) != 0) {
            fontFamily0 = null;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 1;
        }
        return fontFamily$Resolver0.b(fontFamily0, fontWeight0, v, v1);
    }
}

