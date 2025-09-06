package androidx.fragment.app;

import android.content.res.Configuration;
import androidx.core.util.Consumer;

public final class f implements Consumer {
    public final FragmentManager a;

    public f(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        this.a.f1(((Configuration)object0));
    }
}

