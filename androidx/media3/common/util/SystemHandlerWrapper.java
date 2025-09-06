package androidx.media3.common.util;

import O1.a;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

final class SystemHandlerWrapper implements HandlerWrapper {
    static final class SystemMessage implements Message {
        @Nullable
        private android.os.Message a;
        @Nullable
        private SystemHandlerWrapper b;

        private SystemMessage() {
        }

        SystemMessage(androidx.media3.common.util.SystemHandlerWrapper.1 systemHandlerWrapper$10) {
        }

        @Override  // androidx.media3.common.util.HandlerWrapper$Message
        public void a() {
            ((android.os.Message)Assertions.g(this.a)).sendToTarget();
            this.b();
        }

        private void b() {
            this.a = null;
            this.b = null;
            SystemHandlerWrapper.r(this);
        }

        public boolean c(Handler handler0) {
            boolean z = handler0.sendMessageAtFrontOfQueue(((android.os.Message)Assertions.g(this.a)));
            this.b();
            return z;
        }

        @a
        public SystemMessage d(android.os.Message message0, SystemHandlerWrapper systemHandlerWrapper0) {
            this.a = message0;
            this.b = systemHandlerWrapper0;
            return this;
        }

        @Override  // androidx.media3.common.util.HandlerWrapper$Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper)Assertions.g(this.b);
        }
    }

    private final Handler a;
    private static final int b = 50;
    @GuardedBy("messagePool")
    private static final List c;

    static {
        SystemHandlerWrapper.c = new ArrayList(50);
    }

    public SystemHandlerWrapper(Handler handler0) {
        this.a = handler0;
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean a(int v, int v1) {
        return this.a.sendEmptyMessageDelayed(v, ((long)v1));
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean b(Runnable runnable0) {
        return this.a.postAtFrontOfQueue(runnable0);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public Message c(int v) {
        return SystemHandlerWrapper.q().d(this.a.obtainMessage(v), this);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean d(int v) {
        Assertions.a(v != 0);
        return this.a.hasMessages(v);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public Message e(int v, @Nullable Object object0) {
        return SystemHandlerWrapper.q().d(this.a.obtainMessage(v, object0), this);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public void f(@Nullable Object object0) {
        this.a.removeCallbacksAndMessages(object0);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public Message g(int v, int v1, int v2) {
        return SystemHandlerWrapper.q().d(this.a.obtainMessage(v, v1, v2), this);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean h(Message handlerWrapper$Message0) {
        return ((SystemMessage)handlerWrapper$Message0).c(this.a);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public Message i(int v, int v1, int v2, @Nullable Object object0) {
        return SystemHandlerWrapper.q().d(this.a.obtainMessage(v, v1, v2, object0), this);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public Looper j() {
        return this.a.getLooper();
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean k(Runnable runnable0) {
        return this.a.post(runnable0);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean l(Runnable runnable0, long v) {
        return this.a.postDelayed(runnable0, v);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean m(int v) {
        return this.a.sendEmptyMessage(v);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public boolean n(int v, long v1) {
        return this.a.sendEmptyMessageAtTime(v, v1);
    }

    @Override  // androidx.media3.common.util.HandlerWrapper
    public void o(int v) {
        Assertions.a(v != 0);
        this.a.removeMessages(v);
    }

    private static SystemMessage q() {
        synchronized(SystemHandlerWrapper.c) {
            return SystemHandlerWrapper.c.isEmpty() ? new SystemMessage(null) : ((SystemMessage)SystemHandlerWrapper.c.remove(SystemHandlerWrapper.c.size() - 1));
        }
    }

    private static void r(SystemMessage systemHandlerWrapper$SystemMessage0) {
        List list0 = SystemHandlerWrapper.c;
        synchronized(list0) {
            if(list0.size() < 50) {
                list0.add(systemHandlerWrapper$SystemMessage0);
            }
        }
    }

    class androidx.media3.common.util.SystemHandlerWrapper.1 {
    }

}

