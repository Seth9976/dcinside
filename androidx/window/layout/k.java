package androidx.window.layout;

import androidx.core.util.Consumer;
import kotlinx.coroutines.channels.l;

public final class k implements Consumer {
    public final l a;

    public k(l l0) {
        this.a = l0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        androidx.window.layout.WindowInfoTrackerImpl.windowLayoutInfo.1.f(this.a, ((WindowLayoutInfo)object0));
    }
}

