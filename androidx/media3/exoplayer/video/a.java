package androidx.media3.exoplayer.video;

import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

public final class a implements Executor {
    public final HandlerWrapper a;

    public a(HandlerWrapper handlerWrapper0) {
        this.a = handlerWrapper0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a.k(runnable0);
    }
}

