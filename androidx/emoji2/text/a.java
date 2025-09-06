package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class a implements Executor {
    public final Handler a;

    public a(Handler handler0) {
        this.a = handler0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a.post(runnable0);
    }
}

