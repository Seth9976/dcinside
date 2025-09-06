package androidx.core.content;

import androidx.core.util.Consumer;

public final class c implements Consumer {
    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        IntentSanitizer.t(((String)object0));
    }
}

