package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;
import y4.l;

final class ImmutableBool implements State {
    private final boolean a;

    public ImmutableBool(boolean z) {
        this.a = z;
    }

    @l
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.b();
    }
}

