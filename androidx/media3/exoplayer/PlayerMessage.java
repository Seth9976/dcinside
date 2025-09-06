package androidx.media3.exoplayer;

import O1.a;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import java.util.concurrent.TimeoutException;

@UnstableApi
public final class PlayerMessage {
    public interface Sender {
        void d(PlayerMessage arg1);
    }

    public interface Target {
        void k(int arg1, @Nullable Object arg2) throws ExoPlaybackException;
    }

    private final Target a;
    private final Sender b;
    private final Clock c;
    private final Timeline d;
    private int e;
    @Nullable
    private Object f;
    private Looper g;
    private int h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public PlayerMessage(Sender playerMessage$Sender0, Target playerMessage$Target0, Timeline timeline0, int v, Clock clock0, Looper looper0) {
        this.b = playerMessage$Sender0;
        this.a = playerMessage$Target0;
        this.d = timeline0;
        this.g = looper0;
        this.c = clock0;
        this.h = v;
        this.i = 0x8000000000000001L;
        this.j = true;
    }

    public boolean a() throws InterruptedException {
        synchronized(this) {
            Assertions.i(this.k);
            Assertions.i(this.g.getThread() != Thread.currentThread());
            while(!this.m) {
                this.wait();
            }
            return this.l;
        }
    }

    public boolean b(long v) throws InterruptedException, TimeoutException {
        synchronized(this) {
            Assertions.i(this.k);
            Assertions.i(this.g.getThread() != Thread.currentThread());
            long v2 = this.c.elapsedRealtime() + v;
            boolean z;
            while(!z = this.m && v > 0L) {
                this.c.b();
                this.wait(v);
                v = v2 - this.c.elapsedRealtime();
            }
            if(z) {
                return this.l;
            }
        }
        throw new TimeoutException("Message delivery timed out.");
    }

    @a
    public PlayerMessage c() {
        synchronized(this) {
            Assertions.i(this.k);
            this.n = true;
            this.m(false);
            return this;
        }
    }

    public boolean d() {
        return this.j;
    }

    public Looper e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    @Nullable
    public Object g() {
        return this.f;
    }

    public long h() {
        return this.i;
    }

    public Target i() {
        return this.a;
    }

    public Timeline j() {
        return this.d;
    }

    public int k() {
        return this.e;
    }

    public boolean l() {
        synchronized(this) {
        }
        return this.n;
    }

    public void m(boolean z) {
        synchronized(this) {
            this.l |= z;
            this.m = true;
            this.notifyAll();
        }
    }

    @a
    public PlayerMessage n() {
        Assertions.i(!this.k);
        if(this.i == 0x8000000000000001L) {
            Assertions.a(this.j);
        }
        this.k = true;
        this.b.d(this);
        return this;
    }

    @a
    public PlayerMessage o(boolean z) {
        Assertions.i(!this.k);
        this.j = z;
        return this;
    }

    @a
    public PlayerMessage p(Looper looper0) {
        Assertions.i(!this.k);
        this.g = looper0;
        return this;
    }

    @a
    public PlayerMessage q(@Nullable Object object0) {
        Assertions.i(!this.k);
        this.f = object0;
        return this;
    }

    @a
    public PlayerMessage r(int v, long v1) {
        boolean z = true;
        Assertions.i(!this.k);
        if(v1 == 0x8000000000000001L) {
            z = false;
        }
        Assertions.a(z);
        if(v < 0 || !this.d.w() && v >= this.d.v()) {
            throw new IllegalSeekPositionException(this.d, v, v1);
        }
        this.h = v;
        this.i = v1;
        return this;
    }

    @a
    public PlayerMessage s(long v) {
        Assertions.i(!this.k);
        this.i = v;
        return this;
    }

    @a
    public PlayerMessage t(int v) {
        Assertions.i(!this.k);
        this.e = v;
        return this;
    }
}

