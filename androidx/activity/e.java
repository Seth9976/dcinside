package androidx.activity;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class e implements OnContextAvailableListener {
    public final ComponentActivity a;

    public e(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void a(Context context0) {
        ComponentActivity.q0(this.a, context0);
    }
}

