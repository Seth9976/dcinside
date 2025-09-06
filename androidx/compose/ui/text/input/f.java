package androidx.compose.ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

public final class f implements Executor {
    public final Choreographer a;

    public f(Choreographer choreographer0) {
        this.a = choreographer0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        TextInputServiceAndroid_androidKt.e(this.a, runnable0);
    }
}

