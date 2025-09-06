package androidx.fragment.app;

import androidx.core.util.Consumer;

public final class g implements Consumer {
    public final FragmentManager a;

    public g(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        this.a.g1(((Integer)object0));
    }
}

