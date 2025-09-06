package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j..util.function.Consumer.-CC;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    @SuppressLint({"NewApi"})
    static final class MulticastConsumer implements Consumer {
        @l
        private final Activity a;
        @l
        private final ReentrantLock b;
        @GuardedBy("lock")
        @m
        private WindowLayoutInfo c;
        @GuardedBy("lock")
        @l
        private final Set d;

        public MulticastConsumer(@l Activity activity0) {
            L.p(activity0, "activity");
            super();
            this.a = activity0;
            this.b = new ReentrantLock();
            this.d = new LinkedHashSet();
        }

        public void a(@l androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo0) {
            L.p(windowLayoutInfo0, "value");
            ReentrantLock reentrantLock0 = this.b;
            reentrantLock0.lock();
            try {
                this.c = ExtensionsWindowLayoutInfoAdapter.a.b(this.a, windowLayoutInfo0);
                for(Object object0: this.d) {
                    ((androidx.core.util.Consumer)object0).accept(this.c);
                }
            }
            finally {
                reentrantLock0.unlock();
            }
        }

        @Override
        public void accept(Object object0) {
            this.a(((androidx.window.extensions.layout.WindowLayoutInfo)object0));
        }

        @Override
        public Consumer andThen(Consumer consumer0) {
            return Consumer.-CC.$default$andThen(this, consumer0);
        }

        public final void b(@l androidx.core.util.Consumer consumer0) {
            L.p(consumer0, "listener");
            ReentrantLock reentrantLock0 = this.b;
            reentrantLock0.lock();
            try {
                WindowLayoutInfo windowLayoutInfo0 = this.c;
                if(windowLayoutInfo0 != null) {
                    consumer0.accept(windowLayoutInfo0);
                }
                this.d.add(consumer0);
            }
            finally {
                reentrantLock0.unlock();
            }
        }

        public final boolean c() {
            return this.d.isEmpty();
        }

        public final void d(@l androidx.core.util.Consumer consumer0) {
            L.p(consumer0, "listener");
            this.b.lock();
            try {
                this.d.remove(consumer0);
            }
            finally {
                this.b.unlock();
            }
        }
    }

    @l
    private final WindowLayoutComponent a;
    @l
    private final ReentrantLock b;
    @GuardedBy("lock")
    @l
    private final Map c;
    @GuardedBy("lock")
    @l
    private final Map d;

    public ExtensionWindowLayoutInfoBackend(@l WindowLayoutComponent windowLayoutComponent0) {
        L.p(windowLayoutComponent0, "component");
        super();
        this.a = windowLayoutComponent0;
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override  // androidx.window.layout.WindowBackend
    public void a(@l Activity activity0, @l Executor executor0, @l androidx.core.util.Consumer consumer0) {
        S0 s00;
        L.p(activity0, "activity");
        L.p(executor0, "executor");
        L.p(consumer0, "callback");
        ReentrantLock reentrantLock0 = this.b;
        reentrantLock0.lock();
        try {
            MulticastConsumer extensionWindowLayoutInfoBackend$MulticastConsumer0 = (MulticastConsumer)this.c.get(activity0);
            if(extensionWindowLayoutInfoBackend$MulticastConsumer0 == null) {
                s00 = null;
            }
            else {
                extensionWindowLayoutInfoBackend$MulticastConsumer0.b(consumer0);
                this.d.put(consumer0, activity0);
                s00 = S0.a;
            }
            if(s00 == null) {
                MulticastConsumer extensionWindowLayoutInfoBackend$MulticastConsumer1 = new MulticastConsumer(activity0);
                this.c.put(activity0, extensionWindowLayoutInfoBackend$MulticastConsumer1);
                this.d.put(consumer0, activity0);
                extensionWindowLayoutInfoBackend$MulticastConsumer1.b(consumer0);
                this.a.addWindowLayoutInfoListener(activity0, extensionWindowLayoutInfoBackend$MulticastConsumer1);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // androidx.window.layout.WindowBackend
    public void b(@l androidx.core.util.Consumer consumer0) {
        L.p(consumer0, "callback");
        ReentrantLock reentrantLock0 = this.b;
        reentrantLock0.lock();
        try {
            Activity activity0 = (Activity)this.d.get(consumer0);
            if(activity0 != null) {
                MulticastConsumer extensionWindowLayoutInfoBackend$MulticastConsumer0 = (MulticastConsumer)this.c.get(activity0);
                if(extensionWindowLayoutInfoBackend$MulticastConsumer0 != null) {
                    extensionWindowLayoutInfoBackend$MulticastConsumer0.d(consumer0);
                    if(extensionWindowLayoutInfoBackend$MulticastConsumer0.c()) {
                        this.a.removeWindowLayoutInfoListener(extensionWindowLayoutInfoBackend$MulticastConsumer0);
                    }
                    goto label_14;
                }
                goto label_16;
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
        }
        reentrantLock0.unlock();
        throw throwable0;
    label_14:
        reentrantLock0.unlock();
        return;
    label_16:
        reentrantLock0.unlock();
        return;
    label_18:
        reentrantLock0.unlock();
    }
}

