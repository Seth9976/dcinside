package androidx.compose.ui.focus;

public final class b {
    public static void a(FocusManager focusManager0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if((v & 1) != 0) {
            z = false;
        }
        focusManager0.m(z);
    }
}

