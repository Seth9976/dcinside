package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class AnimationHandler {
    class AnimationCallbackDispatcher {
        final AnimationHandler a;

        void a() {
            AnimationHandler.this.e = SystemClock.uptimeMillis();
            AnimationHandler.this.c(AnimationHandler.this.e);
            if(AnimationHandler.this.b.size() > 0) {
                AnimationHandler.this.f().a();
            }
        }
    }

    interface AnimationFrameCallback {
        boolean a(long arg1);
    }

    static abstract class AnimationFrameCallbackProvider {
        final AnimationCallbackDispatcher a;

        AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationHandler$AnimationCallbackDispatcher0) {
            this.a = animationHandler$AnimationCallbackDispatcher0;
        }

        abstract void a();
    }

    static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {
        private final Runnable b;
        private final Handler c;
        long d;

        FrameCallbackProvider14(AnimationCallbackDispatcher animationHandler$AnimationCallbackDispatcher0) {
            super(animationHandler$AnimationCallbackDispatcher0);
            this.d = -1L;
            this.b = new Runnable() {
                final FrameCallbackProvider14 a;

                @Override
                public void run() {
                    FrameCallbackProvider14.this.d = SystemClock.uptimeMillis();
                    FrameCallbackProvider14.this.a.a();
                }
            };
            this.c = new Handler(Looper.myLooper());
        }

        @Override  // androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider
        void a() {
            long v = Math.max(10L - (SystemClock.uptimeMillis() - this.d), 0L);
            this.c.postDelayed(this.b, v);
        }
    }

    @RequiresApi(16)
    static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {
        private final Choreographer b;
        private final Choreographer.FrameCallback c;

        FrameCallbackProvider16(AnimationCallbackDispatcher animationHandler$AnimationCallbackDispatcher0) {
            super(animationHandler$AnimationCallbackDispatcher0);
            this.b = Choreographer.getInstance();
            this.c = new Choreographer.FrameCallback() {
                final FrameCallbackProvider16 a;

                @Override  // android.view.Choreographer$FrameCallback
                public void doFrame(long v) {
                    FrameCallbackProvider16.this.a.a();
                }
            };
        }

        @Override  // androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider
        void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    private final SimpleArrayMap a;
    final ArrayList b;
    private final AnimationCallbackDispatcher c;
    private AnimationFrameCallbackProvider d;
    long e;
    private boolean f;
    private static final long g = 10L;
    public static final ThreadLocal h;

    static {
        AnimationHandler.h = new ThreadLocal();
    }

    AnimationHandler() {
        this.a = new SimpleArrayMap();
        this.b = new ArrayList();
        this.c = new AnimationCallbackDispatcher(this);
        this.e = 0L;
        this.f = false;
    }

    public void a(AnimationFrameCallback animationHandler$AnimationFrameCallback0, long v) {
        if(this.b.size() == 0) {
            this.f().a();
        }
        if(!this.b.contains(animationHandler$AnimationFrameCallback0)) {
            this.b.add(animationHandler$AnimationFrameCallback0);
        }
        if(v > 0L) {
            Long long0 = (long)(SystemClock.uptimeMillis() + v);
            this.a.put(animationHandler$AnimationFrameCallback0, long0);
        }
    }

    private void b() {
        if(this.f) {
            for(int v = this.b.size() - 1; v >= 0; --v) {
                if(this.b.get(v) == null) {
                    this.b.remove(v);
                }
            }
            this.f = false;
        }
    }

    void c(long v) {
        long v1 = SystemClock.uptimeMillis();
        for(int v2 = 0; v2 < this.b.size(); ++v2) {
            AnimationFrameCallback animationHandler$AnimationFrameCallback0 = (AnimationFrameCallback)this.b.get(v2);
            if(animationHandler$AnimationFrameCallback0 != null && this.g(animationHandler$AnimationFrameCallback0, v1)) {
                animationHandler$AnimationFrameCallback0.a(v);
            }
        }
        this.b();
    }

    public static long d() {
        return AnimationHandler.h.get() == null ? 0L : ((AnimationHandler)AnimationHandler.h.get()).e;
    }

    public static AnimationHandler e() {
        ThreadLocal threadLocal0 = AnimationHandler.h;
        if(threadLocal0.get() == null) {
            threadLocal0.set(new AnimationHandler());
        }
        return (AnimationHandler)threadLocal0.get();
    }

    AnimationFrameCallbackProvider f() {
        if(this.d == null) {
            this.d = new FrameCallbackProvider16(this.c);
        }
        return this.d;
    }

    private boolean g(AnimationFrameCallback animationHandler$AnimationFrameCallback0, long v) {
        Long long0 = (Long)this.a.get(animationHandler$AnimationFrameCallback0);
        if(long0 == null) {
            return true;
        }
        if(((long)long0) < v) {
            this.a.remove(animationHandler$AnimationFrameCallback0);
            return true;
        }
        return false;
    }

    public void h(AnimationFrameCallback animationHandler$AnimationFrameCallback0) {
        this.a.remove(animationHandler$AnimationFrameCallback0);
        int v = this.b.indexOf(animationHandler$AnimationFrameCallback0);
        if(v >= 0) {
            this.b.set(v, null);
            this.f = true;
        }
    }

    public void i(AnimationFrameCallbackProvider animationHandler$AnimationFrameCallbackProvider0) {
        this.d = animationHandler$AnimationFrameCallbackProvider0;
    }
}

