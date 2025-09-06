package androidx.compose.ui.text.input;

import android.view.inputmethod.InputMethodManager;

public final class a implements Runnable {
    public final InputMethodManager a;
    public final ImmHelper21 b;

    public a(InputMethodManager inputMethodManager0, ImmHelper21 immHelper210) {
        this.a = inputMethodManager0;
        this.b = immHelper210;
    }

    @Override
    public final void run() {
        ImmHelper21.d(this.a, this.b);
    }
}

