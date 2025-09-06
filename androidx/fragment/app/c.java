package androidx.fragment.app;

import android.content.Intent;
import androidx.core.util.Consumer;

public final class c implements Consumer {
    public final FragmentActivity a;

    public c(FragmentActivity fragmentActivity0) {
        this.a = fragmentActivity0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        this.a.E0(((Intent)object0));
    }
}

