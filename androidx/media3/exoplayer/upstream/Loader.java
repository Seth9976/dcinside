package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@UnstableApi
public final class Loader implements LoaderErrorThrower {
    public interface Callback {
        LoadErrorAction h(Loadable arg1, long arg2, long arg3, IOException arg4, int arg5);

        void o(Loadable arg1, long arg2, long arg3, boolean arg4);

        void u(Loadable arg1, long arg2, long arg3);
    }

    public static final class LoadErrorAction {
        private final int a;
        private final long b;

        private LoadErrorAction(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        LoadErrorAction(int v, long v1, androidx.media3.exoplayer.upstream.Loader.1 loader$10) {
            this(v, v1);
        }

        public boolean c() {
            return this.a == 0 || this.a == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    final class LoadTask extends Handler implements Runnable {
        public final int a;
        private final Loadable b;
        private final long c;
        @Nullable
        private Callback d;
        @Nullable
        private IOException e;
        private int f;
        @Nullable
        private Thread g;
        private boolean h;
        private volatile boolean i;
        final Loader j;
        private static final String k = "LoadTask";
        private static final int l = 1;
        private static final int m = 2;
        private static final int n = 3;
        private static final int o = 4;

        public LoadTask(Looper looper0, Loadable loader$Loadable0, Callback loader$Callback0, int v, long v1) {
            super(looper0);
            this.b = loader$Loadable0;
            this.d = loader$Callback0;
            this.a = v;
            this.c = v1;
        }

        public void a(boolean z) {
            this.i = z;
            this.e = null;
            if(this.hasMessages(1)) {
                this.h = true;
                this.removeMessages(1);
                if(!z) {
                    this.sendEmptyMessage(2);
                }
            }
            else {
                synchronized(this) {
                    this.h = true;
                    this.b.b();
                    Thread thread0 = this.g;
                    if(thread0 != null) {
                        thread0.interrupt();
                    }
                }
            }
            if(z) {
                this.c();
                long v1 = SystemClock.elapsedRealtime();
                ((Callback)Assertions.g(this.d)).o(this.b, v1, v1 - this.c, true);
                this.d = null;
            }
        }

        private void b() {
            this.e = null;
            Loader.this.a.execute(((Runnable)Assertions.g(Loader.this.b)));
        }

        private void c() {
            Loader.this.b = null;
        }

        private long d() {
            return (long)Math.min((this.f - 1) * 1000, 5000);
        }

        public void e(int v) throws IOException {
            IOException iOException0 = this.e;
            if(iOException0 != null && this.f > v) {
                throw iOException0;
            }
        }

        public void f(long v) {
            Assertions.i(Loader.this.b == null);
            Loader.this.b = this;
            if(v > 0L) {
                this.sendEmptyMessageDelayed(1, v);
                return;
            }
            this.b();
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            if(this.i) {
                return;
            }
            int v = message0.what;
            if(v == 1) {
                this.b();
                return;
            }
            if(v != 4) {
                this.c();
                long v1 = SystemClock.elapsedRealtime();
                long v2 = v1 - this.c;
                Callback loader$Callback0 = (Callback)Assertions.g(this.d);
                if(this.h) {
                    loader$Callback0.o(this.b, v1, v2, false);
                    return;
                }
                switch(message0.what) {
                    case 2: {
                        try {
                            loader$Callback0.u(this.b, v1, v2);
                        }
                        catch(RuntimeException runtimeException0) {
                            Log.e("LoadTask", "Unexpected exception handling load completed", runtimeException0);
                            UnexpectedLoaderException loader$UnexpectedLoaderException0 = new UnexpectedLoaderException(runtimeException0);
                            Loader.this.c = loader$UnexpectedLoaderException0;
                        }
                        return;
                    }
                    case 3: {
                        this.e = (IOException)message0.obj;
                        int v3 = this.f + 1;
                        this.f = v3;
                        LoadErrorAction loader$LoadErrorAction0 = loader$Callback0.h(this.b, v1, v2, ((IOException)message0.obj), v3);
                        if(loader$LoadErrorAction0.a == 3) {
                            Loader.this.c = this.e;
                            return;
                        }
                        switch(loader$LoadErrorAction0.a) {
                            case 1: {
                                this.f = 1;
                                break;
                            }
                            case 2: {
                                return;
                            }
                        }
                        this.f((loader$LoadErrorAction0.b == 0x8000000000000001L ? this.d() : loader$LoadErrorAction0.b));
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            throw (Error)message0.obj;
        }

        @Override
        public void run() {
            try {
                __monitor_enter(this);
                this.g = Thread.currentThread();
                __monitor_exit(this);
                if(!this.h) {
                    TraceUtil.a(("load:" + this.b.getClass().getSimpleName()));
                    try {
                        this.b.w();
                    }
                    finally {
                        TraceUtil.b();
                    }
                }
                synchronized(this) {
                    this.g = null;
                    Thread.interrupted();
                }
                if(!this.i) {
                    this.sendEmptyMessage(2);
                    return;
                label_27:
                    if(!this.i) {
                        goto label_28;
                    }
                }
                return;
            }
            catch(IOException iOException0) {
                goto label_27;
            }
            catch(Exception exception0) {
                goto label_30;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                goto label_34;
            }
            catch(Error error0) {
                goto label_38;
            }
        label_28:
            this.obtainMessage(3, iOException0).sendToTarget();
            return;
        label_30:
            if(!this.i) {
                Log.e("LoadTask", "Unexpected exception loading stream", exception0);
                this.obtainMessage(3, new UnexpectedLoaderException(exception0)).sendToTarget();
                return;
            label_34:
                if(!this.i) {
                    Log.e("LoadTask", "OutOfMemory error loading stream", outOfMemoryError0);
                    this.obtainMessage(3, new UnexpectedLoaderException(outOfMemoryError0)).sendToTarget();
                    return;
                label_38:
                    if(!this.i) {
                        Log.e("LoadTask", "Unexpected error loading stream", error0);
                        this.obtainMessage(4, error0).sendToTarget();
                    }
                    throw error0;
                }
            }
        }
    }

    public interface Loadable {
        void b();

        void w() throws IOException;
    }

    public interface ReleaseCallback {
        void l();
    }

    static final class ReleaseTask implements Runnable {
        private final ReleaseCallback a;

        public ReleaseTask(ReleaseCallback loader$ReleaseCallback0) {
            this.a = loader$ReleaseCallback0;
        }

        @Override
        public void run() {
            this.a.l();
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable throwable0) {
            super("Unexpected " + throwable0.getClass().getSimpleName() + (throwable0.getMessage() == null ? "" : ": " + throwable0.getMessage()), throwable0);
        }
    }

    private final ExecutorService a;
    @Nullable
    private LoadTask b;
    @Nullable
    private IOException c;
    private static final String d = "ExoPlayer:Loader:";
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    public static final LoadErrorAction i;
    public static final LoadErrorAction j;
    public static final LoadErrorAction k;
    public static final LoadErrorAction l;

    static {
        Loader.i = Loader.i(false, 0x8000000000000001L);
        Loader.j = Loader.i(true, 0x8000000000000001L);
        Loader.k = new LoadErrorAction(2, 0x8000000000000001L, null);
        Loader.l = new LoadErrorAction(3, 0x8000000000000001L, null);
    }

    public Loader(String s) {
        this.a = Util.G1(("ExoPlayer:Loader:" + s));
    }

    @Override  // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void a(int v) throws IOException {
        IOException iOException0 = this.c;
        if(iOException0 != null) {
            throw iOException0;
        }
        LoadTask loader$LoadTask0 = this.b;
        if(loader$LoadTask0 != null) {
            if(v == 0x80000000) {
                v = loader$LoadTask0.a;
            }
            loader$LoadTask0.e(v);
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void b() throws IOException {
        this.a(0x80000000);
    }

    public void g() {
        ((LoadTask)Assertions.k(this.b)).a(false);
    }

    public void h() {
        this.c = null;
    }

    public static LoadErrorAction i(boolean z, long v) {
        return new LoadErrorAction(((int)z), v, null);
    }

    public boolean j() {
        return this.c != null;
    }

    public boolean k() {
        return this.b != null;
    }

    public void l() {
        this.m(null);
    }

    public void m(@Nullable ReleaseCallback loader$ReleaseCallback0) {
        LoadTask loader$LoadTask0 = this.b;
        if(loader$LoadTask0 != null) {
            loader$LoadTask0.a(true);
        }
        if(loader$ReleaseCallback0 != null) {
            ReleaseTask loader$ReleaseTask0 = new ReleaseTask(loader$ReleaseCallback0);
            this.a.execute(loader$ReleaseTask0);
        }
        this.a.shutdown();
    }

    public long n(Loadable loader$Loadable0, Callback loader$Callback0, int v) {
        Object object0 = Assertions.k(Looper.myLooper());
        this.c = null;
        long v1 = SystemClock.elapsedRealtime();
        new LoadTask(this, ((Looper)object0), loader$Loadable0, loader$Callback0, v, v1).f(0L);
        return v1;
    }

    class androidx.media3.exoplayer.upstream.Loader.1 {
    }

}

