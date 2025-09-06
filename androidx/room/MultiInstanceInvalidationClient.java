package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
public final class MultiInstanceInvalidationClient {
    @l
    private final String a;
    @l
    private final InvalidationTracker b;
    @l
    private final Executor c;
    private final Context d;
    private int e;
    public Observer f;
    @m
    private IMultiInstanceInvalidationService g;
    @l
    private final IMultiInstanceInvalidationCallback h;
    @l
    private final AtomicBoolean i;
    @l
    private final ServiceConnection j;
    @l
    private final Runnable k;
    @l
    private final Runnable l;

    public MultiInstanceInvalidationClient(@l Context context0, @l String s, @l Intent intent0, @l InvalidationTracker invalidationTracker0, @l Executor executor0) {
        L.p(context0, "context");
        L.p(s, "name");
        L.p(intent0, "serviceIntent");
        L.p(invalidationTracker0, "invalidationTracker");
        L.p(executor0, "executor");
        super();
        this.a = s;
        this.b = invalidationTracker0;
        this.c = executor0;
        Context context1 = context0.getApplicationContext();
        this.d = context1;
        this.h = new Stub() {
            @Override  // androidx.room.IMultiInstanceInvalidationCallback
            public void h(@l String[] arr_s) {
                L.p(arr_s, "tables");
                this.b.e().execute(() -> {
                    L.p(this.b, "this$0");
                    L.p(arr_s, "$tables");
                    this.b.f().p(((String[])Arrays.copyOf(arr_s, arr_s.length)));
                });
            }

            // 检测为 Lambda 实现
            private static final void k1(MultiInstanceInvalidationClient multiInstanceInvalidationClient0, String[] arr_s) [...]
        };
        this.i = new AtomicBoolean(false);
        androidx.room.MultiInstanceInvalidationClient.serviceConnection.1 multiInstanceInvalidationClient$serviceConnection$10 = new ServiceConnection() {
            @Override  // android.content.ServiceConnection
            public void onServiceConnected(@l ComponentName componentName0, @l IBinder iBinder0) {
                L.p(componentName0, "name");
                L.p(iBinder0, "service");
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = androidx.room.IMultiInstanceInvalidationService.Stub.i1(iBinder0);
                this.a.q(iMultiInstanceInvalidationService0);
                Runnable runnable0 = this.a.l();
                this.a.e().execute(runnable0);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(@l ComponentName componentName0) {
                L.p(componentName0, "name");
                Runnable runnable0 = this.a.i();
                this.a.e().execute(runnable0);
                this.a.q(null);
            }
        };
        this.j = multiInstanceInvalidationClient$serviceConnection$10;
        this.k = () -> {
            L.p(this, "this$0");
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = this.g;
            if(iMultiInstanceInvalidationService0 != null) {
                try {
                    this.e = iMultiInstanceInvalidationService0.M0(this.h, this.a);
                    Observer invalidationTracker$Observer0 = this.h();
                    this.b.c(invalidationTracker$Observer0);
                }
                catch(RemoteException remoteException0) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", remoteException0);
                }
            }
        };
        this.l = () -> {
            L.p(this, "this$0");
            Observer invalidationTracker$Observer0 = this.h();
            this.b.t(invalidationTracker$Observer0);
        };
        this.p(new Observer(/*ERROR_MISSING_ARG_1/*) {
            @Override  // androidx.room.InvalidationTracker$Observer
            public boolean b() {
                return true;
            }

            @Override  // androidx.room.InvalidationTracker$Observer
            public void c(@l Set set0) {
                L.p(set0, "tables");
                if(((String[])invalidationTracker0.m().keySet().toArray(new String[0])).m().get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = ((String[])invalidationTracker0.m().keySet().toArray(new String[0])).j();
                    if(iMultiInstanceInvalidationService0 != null) {
                        iMultiInstanceInvalidationService0.E0(((String[])invalidationTracker0.m().keySet().toArray(new String[0])).d(), ((String[])set0.toArray(new String[0])));
                    }
                }
                catch(RemoteException remoteException0) {
                    Log.w("ROOM", "Cannot broadcast invalidation", remoteException0);
                }
            }
        });
        context1.bindService(intent0, multiInstanceInvalidationClient$serviceConnection$10, 1);
    }

    @l
    public final IMultiInstanceInvalidationCallback c() {
        return this.h;
    }

    public final int d() {
        return this.e;
    }

    @l
    public final Executor e() {
        return this.c;
    }

    @l
    public final InvalidationTracker f() {
        return this.b;
    }

    @l
    public final String g() {
        return this.a;
    }

    @l
    public final Observer h() {
        Observer invalidationTracker$Observer0 = this.f;
        if(invalidationTracker$Observer0 != null) {
            return invalidationTracker$Observer0;
        }
        L.S("observer");
        return null;
    }

    @l
    public final Runnable i() {
        return this.l;
    }

    @m
    public final IMultiInstanceInvalidationService j() {
        return this.g;
    }

    @l
    public final ServiceConnection k() {
        return this.j;
    }

    @l
    public final Runnable l() {
        return this.k;
    }

    @l
    public final AtomicBoolean m() {
        return this.i;
    }

    // 检测为 Lambda 实现
    private static final void n(MultiInstanceInvalidationClient multiInstanceInvalidationClient0) [...]

    public final void o(int v) {
        this.e = v;
    }

    public final void p(@l Observer invalidationTracker$Observer0) {
        L.p(invalidationTracker$Observer0, "<set-?>");
        this.f = invalidationTracker$Observer0;
    }

    public final void q(@m IMultiInstanceInvalidationService iMultiInstanceInvalidationService0) {
        this.g = iMultiInstanceInvalidationService0;
    }

    // 检测为 Lambda 实现
    private static final void r(MultiInstanceInvalidationClient multiInstanceInvalidationClient0) [...]

    public final void s() {
        if(this.i.compareAndSet(false, true)) {
            Observer invalidationTracker$Observer0 = this.h();
            this.b.t(invalidationTracker$Observer0);
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = this.g;
            if(iMultiInstanceInvalidationService0 != null) {
                try {
                    iMultiInstanceInvalidationService0.g1(this.h, this.e);
                }
                catch(RemoteException remoteException0) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", remoteException0);
                }
            }
            this.d.unbindService(this.j);
        }
    }
}

