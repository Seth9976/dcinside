package androidx.core.view.insets;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class d implements OnApplyWindowInsetsListener {
    public final SystemBarStateMonitor a;

    public d(SystemBarStateMonitor systemBarStateMonitor0) {
        this.a = systemBarStateMonitor0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
        return this.a.m(view0, windowInsetsCompat0);
    }
}

