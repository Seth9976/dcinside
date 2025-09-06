package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.view.KeyEventDispatcher.Component;

public final class r implements Component {
    public final AppCompatDialog a;

    public r(AppCompatDialog appCompatDialog0) {
        this.a = appCompatDialog0;
    }

    @Override  // androidx.core.view.KeyEventDispatcher$Component
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent0) {
        return this.a.j(keyEvent0);
    }
}

