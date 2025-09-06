package androidx.fragment.app;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class d implements OnContextAvailableListener {
    public final FragmentActivity a;

    public d(FragmentActivity fragmentActivity0) {
        this.a = fragmentActivity0;
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void a(Context context0) {
        this.a.F0(context0);
    }
}

