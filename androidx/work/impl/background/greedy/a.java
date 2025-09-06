package androidx.work.impl.background.greedy;

import androidx.work.impl.StartStopToken;

public final class a implements Runnable {
    public final TimeLimiter a;
    public final StartStopToken b;

    public a(TimeLimiter timeLimiter0, StartStopToken startStopToken0) {
        this.a = timeLimiter0;
        this.b = startStopToken0;
    }

    @Override
    public final void run() {
        TimeLimiter.d(this.a, this.b);
    }
}

