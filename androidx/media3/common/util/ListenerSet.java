package androidx.media3.common.util;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.FlagSet.Builder;
import androidx.media3.common.FlagSet;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

@UnstableApi
public final class ListenerSet {
    public interface Event {
        void invoke(Object arg1);
    }

    public interface IterationFinishedEvent {
        void a(Object arg1, FlagSet arg2);
    }

    static final class ListenerHolder {
        public final Object a;
        private Builder b;
        private boolean c;
        private boolean d;

        public ListenerHolder(Object object0) {
            this.a = object0;
            this.b = new Builder();
        }

        public void a(int v, Event listenerSet$Event0) {
            if(!this.d) {
                if(v != -1) {
                    this.b.a(v);
                }
                this.c = true;
                listenerSet$Event0.invoke(this.a);
            }
        }

        public void b(IterationFinishedEvent listenerSet$IterationFinishedEvent0) {
            if(!this.d && this.c) {
                FlagSet flagSet0 = this.b.e();
                this.b = new Builder();
                this.c = false;
                listenerSet$IterationFinishedEvent0.a(this.a, flagSet0);
            }
        }

        public void c(IterationFinishedEvent listenerSet$IterationFinishedEvent0) {
            this.d = true;
            if(this.c) {
                this.c = false;
                FlagSet flagSet0 = this.b.e();
                listenerSet$IterationFinishedEvent0.a(this.a, flagSet0);
            }
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return ListenerHolder.class == class0 ? this.a.equals(((ListenerHolder)object0).a) : false;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private final Clock a;
    private final HandlerWrapper b;
    private final IterationFinishedEvent c;
    private final CopyOnWriteArraySet d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private final Object g;
    @GuardedBy("releasedLock")
    private boolean h;
    private boolean i;
    private static final int j = 1;

    public ListenerSet(Looper looper0, Clock clock0, IterationFinishedEvent listenerSet$IterationFinishedEvent0) {
        this(new CopyOnWriteArraySet(), looper0, clock0, listenerSet$IterationFinishedEvent0, true);
    }

    private ListenerSet(CopyOnWriteArraySet copyOnWriteArraySet0, Looper looper0, Clock clock0, IterationFinishedEvent listenerSet$IterationFinishedEvent0, boolean z) {
        this.a = clock0;
        this.d = copyOnWriteArraySet0;
        this.c = listenerSet$IterationFinishedEvent0;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = clock0.c(looper0, (Message message0) -> {
            for(Object object0: this.d) {
                ((ListenerHolder)object0).b(this.c);
                if(this.b.d(1)) {
                    break;
                }
            }
            return true;
        });
        this.i = z;
    }

    public void c(Object object0) {
        Assertions.g(object0);
        synchronized(this.g) {
            if(this.h) {
                return;
            }
            ListenerHolder listenerSet$ListenerHolder0 = new ListenerHolder(object0);
            this.d.add(listenerSet$ListenerHolder0);
        }
    }

    public void d() {
        this.p();
        this.d.clear();
    }

    @CheckResult
    public ListenerSet e(Looper looper0, Clock clock0, IterationFinishedEvent listenerSet$IterationFinishedEvent0) {
        return new ListenerSet(this.d, looper0, clock0, listenerSet$IterationFinishedEvent0, this.i);
    }

    @CheckResult
    public ListenerSet f(Looper looper0, IterationFinishedEvent listenerSet$IterationFinishedEvent0) {
        return this.e(looper0, this.a, listenerSet$IterationFinishedEvent0);
    }

    public void g() {
        this.p();
        if(this.f.isEmpty()) {
            return;
        }
        if(!this.b.d(1)) {
            androidx.media3.common.util.HandlerWrapper.Message handlerWrapper$Message0 = this.b.c(1);
            this.b.h(handlerWrapper$Message0);
        }
        this.e.addAll(this.f);
        this.f.clear();
        if(!this.e.isEmpty()) {
            return;
        }
        while(!this.e.isEmpty()) {
            ((Runnable)this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    // 检测为 Lambda 实现
    private boolean h(Message message0) [...]

    // 检测为 Lambda 实现
    private static void i(CopyOnWriteArraySet copyOnWriteArraySet0, int v, Event listenerSet$Event0) [...]

    public void j(int v, Event listenerSet$Event0) {
        this.p();
        c c0 = () -> for(Object object0: new CopyOnWriteArraySet(this.d)) {
            ((ListenerHolder)object0).a(v, listenerSet$Event0);
        };
        this.f.add(c0);
    }

    public void k() {
        this.p();
        synchronized(this.g) {
            this.h = true;
        }
        for(Object object0: this.d) {
            ((ListenerHolder)object0).c(this.c);
        }
        this.d.clear();
    }

    public void l(Object object0) {
        this.p();
        for(Object object1: this.d) {
            ListenerHolder listenerSet$ListenerHolder0 = (ListenerHolder)object1;
            if(listenerSet$ListenerHolder0.a.equals(object0)) {
                listenerSet$ListenerHolder0.c(this.c);
                this.d.remove(listenerSet$ListenerHolder0);
            }
        }
    }

    public void m(int v, Event listenerSet$Event0) {
        this.j(v, listenerSet$Event0);
        this.g();
    }

    @Deprecated
    public void n(boolean z) {
        this.i = z;
    }

    public int o() {
        this.p();
        return this.d.size();
    }

    private void p() {
        if(!this.i) {
            return;
        }
        Assertions.i(Thread.currentThread() == this.b.j().getThread());
    }
}

