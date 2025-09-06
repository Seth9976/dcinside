package androidx.fragment.app;

import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.util.Consumer;

public final class h implements Consumer {
    public final FragmentManager a;

    public h(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        this.a.h1(((MultiWindowModeChangedInfo)object0));
    }
}

