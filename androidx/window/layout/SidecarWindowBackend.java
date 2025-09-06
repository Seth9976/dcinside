package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.Version;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class SidecarWindowBackend implements WindowBackend {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final SidecarWindowBackend a(@l Context context0) {
            L.p(context0, "context");
            if(SidecarWindowBackend.e == null) {
                ReentrantLock reentrantLock0 = SidecarWindowBackend.f;
                reentrantLock0.lock();
                try {
                    if(SidecarWindowBackend.e == null) {
                        SidecarWindowBackend.e = new SidecarWindowBackend(SidecarWindowBackend.c.b(context0));
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
            SidecarWindowBackend sidecarWindowBackend0 = SidecarWindowBackend.e;
            L.m(sidecarWindowBackend0);
            return sidecarWindowBackend0;
        }

        @m
        public final ExtensionInterfaceCompat b(@l Context context0) {
            L.p(context0, "context");
            try {
                if(this.c(SidecarCompat.f.c())) {
                    SidecarCompat sidecarCompat0 = new SidecarCompat(context0);
                    if(sidecarCompat0.b()) {
                        return sidecarCompat0;
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            return null;
        }

        @VisibleForTesting
        public final boolean c(@m Version version0) {
            return version0 == null ? false : version0.e(Version.f.c()) >= 0;
        }

        @VisibleForTesting
        public final void d() {
            SidecarWindowBackend.e = null;
        }
    }

    @VisibleForTesting
    public final class ExtensionListenerImpl implements ExtensionCallbackInterface {
        final SidecarWindowBackend a;

        public ExtensionListenerImpl() {
            L.p(sidecarWindowBackend0, "this$0");
            this.a = sidecarWindowBackend0;
            super();
        }

        @Override  // androidx.window.layout.ExtensionInterfaceCompat$ExtensionCallbackInterface
        @SuppressLint({"SyntheticAccessor"})
        public void a(@l Activity activity0, @l WindowLayoutInfo windowLayoutInfo0) {
            L.p(activity0, "activity");
            L.p(windowLayoutInfo0, "newLayout");
            for(Object object0: this.a.h()) {
                WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0 = (WindowLayoutChangeCallbackWrapper)object0;
                if(L.g(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.d(), activity0)) {
                    sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.b(windowLayoutInfo0);
                }
            }
        }
    }

    public static final class WindowLayoutChangeCallbackWrapper {
        @l
        private final Activity a;
        @l
        private final Executor b;
        @l
        private final Consumer c;
        @m
        private WindowLayoutInfo d;

        public WindowLayoutChangeCallbackWrapper(@l Activity activity0, @l Executor executor0, @l Consumer consumer0) {
            L.p(activity0, "activity");
            L.p(executor0, "executor");
            L.p(consumer0, "callback");
            super();
            this.a = activity0;
            this.b = executor0;
            this.c = consumer0;
        }

        public final void b(@l WindowLayoutInfo windowLayoutInfo0) {
            L.p(windowLayoutInfo0, "newLayoutInfo");
            this.d = windowLayoutInfo0;
            i i0 = () -> {
                L.p(this, "this$0");
                L.p(windowLayoutInfo0, "$newLayoutInfo");
                this.c.accept(windowLayoutInfo0);
            };
            this.b.execute(i0);
        }

        // 检测为 Lambda 实现
        private static final void c(WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0, WindowLayoutInfo windowLayoutInfo0) [...]

        @l
        public final Activity d() {
            return this.a;
        }

        @l
        public final Consumer e() {
            return this.c;
        }

        @m
        public final WindowLayoutInfo f() {
            return this.d;
        }

        public final void g(@m WindowLayoutInfo windowLayoutInfo0) {
            this.d = windowLayoutInfo0;
        }
    }

    @GuardedBy("globalLock")
    @VisibleForTesting
    @m
    private ExtensionInterfaceCompat a;
    @l
    private final CopyOnWriteArrayList b;
    @l
    public static final Companion c = null;
    public static final boolean d = false;
    @m
    private static volatile SidecarWindowBackend e = null;
    @l
    private static final ReentrantLock f = null;
    @l
    private static final String g = "WindowServer";

    static {
        SidecarWindowBackend.c = new Companion(null);
        SidecarWindowBackend.f = new ReentrantLock();
    }

    @VisibleForTesting
    public SidecarWindowBackend(@m ExtensionInterfaceCompat extensionInterfaceCompat0) {
        this.a = extensionInterfaceCompat0;
        this.b = new CopyOnWriteArrayList();
        ExtensionInterfaceCompat extensionInterfaceCompat1 = this.a;
        if(extensionInterfaceCompat1 != null) {
            extensionInterfaceCompat1.a(new ExtensionListenerImpl(this));
        }
    }

    @Override  // androidx.window.layout.WindowBackend
    public void a(@l Activity activity0, @l Executor executor0, @l Consumer consumer0) {
        WindowLayoutInfo windowLayoutInfo0;
        L.p(activity0, "activity");
        L.p(executor0, "executor");
        L.p(consumer0, "callback");
        ReentrantLock reentrantLock0 = SidecarWindowBackend.f;
        reentrantLock0.lock();
        try {
            ExtensionInterfaceCompat extensionInterfaceCompat0 = this.g();
            if(extensionInterfaceCompat0 == null) {
                consumer0.accept(new WindowLayoutInfo(u.H()));
                return;
            }
            boolean z = this.j(activity0);
            WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0 = new WindowLayoutChangeCallbackWrapper(activity0, executor0, consumer0);
            this.h().add(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0);
            if(z) {
                Object object0 = null;
                Iterator iterator0 = this.h().iterator();
                while(true) {
                    windowLayoutInfo0 = null;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object1 = iterator0.next();
                    if(L.g(activity0, ((WindowLayoutChangeCallbackWrapper)object1).d())) {
                        object0 = object1;
                        break;
                    }
                }
                if(((WindowLayoutChangeCallbackWrapper)object0) != null) {
                    windowLayoutInfo0 = ((WindowLayoutChangeCallbackWrapper)object0).f();
                }
                if(windowLayoutInfo0 != null) {
                    sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.b(windowLayoutInfo0);
                }
            }
            else {
                extensionInterfaceCompat0.c(activity0);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // androidx.window.layout.WindowBackend
    public void b(@l Consumer consumer0) {
        L.p(consumer0, "callback");
        ReentrantLock reentrantLock0 = SidecarWindowBackend.f;
        __monitor_enter(reentrantLock0);
        try {
            if(this.g() != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: this.h()) {
                    WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0 = (WindowLayoutChangeCallbackWrapper)object0;
                    if(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0.e() == consumer0) {
                        L.o(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0, "callbackWrapper");
                        arrayList0.add(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0);
                    }
                }
                this.h().removeAll(arrayList0);
                Iterator iterator1 = arrayList0.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        goto label_22;
                    }
                    Object object1 = iterator1.next();
                    this.f(((WindowLayoutChangeCallbackWrapper)object1).d());
                }
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(reentrantLock0);
        throw throwable0;
    label_22:
        __monitor_exit(reentrantLock0);
        return;
    label_24:
        __monitor_exit(reentrantLock0);
    }

    @GuardedBy("sLock")
    private final void f(Activity activity0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.b;
        if(!(copyOnWriteArrayList0 instanceof Collection) || !copyOnWriteArrayList0.isEmpty()) {
            for(Object object0: copyOnWriteArrayList0) {
                if(L.g(((WindowLayoutChangeCallbackWrapper)object0).d(), activity0)) {
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
        ExtensionInterfaceCompat extensionInterfaceCompat0 = this.a;
        if(extensionInterfaceCompat0 != null) {
            extensionInterfaceCompat0.d(activity0);
        }
    }

    @m
    public final ExtensionInterfaceCompat g() {
        return this.a;
    }

    @l
    public final CopyOnWriteArrayList h() {
        return this.b;
    }

    @VisibleForTesting
    public static void i() {
    }

    private final boolean j(Activity activity0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.b;
        if(!(copyOnWriteArrayList0 instanceof Collection) || !copyOnWriteArrayList0.isEmpty()) {
            for(Object object0: copyOnWriteArrayList0) {
                if(L.g(((WindowLayoutChangeCallbackWrapper)object0).d(), activity0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final void k(@m ExtensionInterfaceCompat extensionInterfaceCompat0) {
        this.a = extensionInterfaceCompat0;
    }
}

