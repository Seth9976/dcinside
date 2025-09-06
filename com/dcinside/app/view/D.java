package com.dcinside.app.view;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final class d implements OnApplyWindowInsetsListener {
    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
        return DcToolbar.Y(view0, windowInsetsCompat0);
    }
}

