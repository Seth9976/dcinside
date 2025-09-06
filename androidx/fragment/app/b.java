package androidx.fragment.app;

import android.content.res.Configuration;
import androidx.core.util.Consumer;

public final class b implements Consumer {
    public final FragmentActivity a;

    public b(FragmentActivity fragmentActivity0) {
        this.a = fragmentActivity0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        this.a.D0(((Configuration)object0));
    }
}

