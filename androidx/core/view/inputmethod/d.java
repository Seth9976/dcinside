package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;

public final class d implements OnCommitContentListener {
    public final View a;

    public d(View view0) {
        this.a = view0;
    }

    @Override  // androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
    public final boolean a(InputContentInfoCompat inputContentInfoCompat0, int v, Bundle bundle0) {
        return InputConnectionCompat.g(this.a, inputContentInfoCompat0, v, bundle0);
    }
}

