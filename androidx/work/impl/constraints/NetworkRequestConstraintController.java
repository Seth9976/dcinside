package androidx.work.impl.constraints;

import A3.o;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.G.a;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;

@RequiresApi(28)
public final class NetworkRequestConstraintController implements ConstraintController {
    @l
    private final ConnectivityManager a;
    private final long b;

    public NetworkRequestConstraintController(@l ConnectivityManager connectivityManager0, long v) {
        L.p(connectivityManager0, "connManager");
        super();
        this.a = connectivityManager0;
        this.b = v;
    }

    public NetworkRequestConstraintController(ConnectivityManager connectivityManager0, long v, int v1, w w0) {
        if((v1 & 2) != 0) {
            v = 1000L;
        }
        this(connectivityManager0, v);
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    @l
    public i a(@l Constraints constraints0) {
        L.p(constraints0, "constraints");
        return k.s(new o(this, null) {
            int k;
            private Object l;
            final Constraints m;
            final NetworkRequestConstraintController n;

            {
                this.m = constraints0;
                this.n = networkRequestConstraintController0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new androidx.work.impl.constraints.NetworkRequestConstraintController.track.1(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            public final Object invoke(D d0, d d1) {
                return ((androidx.work.impl.constraints.NetworkRequestConstraintController.track.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        NetworkRequest networkRequest0 = this.m.d();
                        if(networkRequest0 == null) {
                            a.a(d0.b(), null, 1, null);
                            return S0.a;
                        }
                        androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.networkCallback.1 networkRequestConstraintController$track$1$networkCallback$10 = new ConnectivityManager.NetworkCallback() {
                            @Override  // android.net.ConnectivityManager$NetworkCallback
                            public void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
                                L.p(network0, "network");
                                L.p(networkCapabilities0, "networkCapabilities");
                                kotlinx.coroutines.I0.a.b(d0, null, 1, null);
                                Logger.e().a("WM-WorkConstraintsTrack", "NetworkRequestConstraintController onCapabilitiesChanged callback");
                                this.b.l(ConstraintsMet.a);
                            }

                            @Override  // android.net.ConnectivityManager$NetworkCallback
                            public void onLost(Network network0) {
                                L.p(network0, "network");
                                kotlinx.coroutines.I0.a.b(d0, null, 1, null);
                                Logger.e().a("WM-WorkConstraintsTrack", "NetworkRequestConstraintController onLost callback");
                                ConstraintsNotMet constraintsState$ConstraintsNotMet0 = new ConstraintsNotMet(7);
                                this.b.l(constraintsState$ConstraintsNotMet0);
                            }
                        };
                        Logger.e().a("WM-WorkConstraintsTrack", "NetworkRequestConstraintController register callback");
                        this.n.a.registerNetworkCallback(networkRequest0, networkRequestConstraintController$track$1$networkCallback$10);
                        androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.1 networkRequestConstraintController$track$1$10 = new A3.a(networkRequestConstraintController$track$1$networkCallback$10) {
                            final NetworkRequestConstraintController e;
                            final androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.networkCallback.1 f;

                            {
                                this.e = networkRequestConstraintController0;
                                this.f = networkRequestConstraintController$track$1$networkCallback$10;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                Logger.e().a("WM-WorkConstraintsTrack", "NetworkRequestConstraintController unregister callback");
                                this.e.a.unregisterNetworkCallback(this.f);
                            }
                        };
                        this.k = 1;
                        return B.a(d0, networkRequestConstraintController$track$1$10, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }

                @f(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$job$1", f = "WorkConstraintsTracker.kt", i = {}, l = {0x94}, m = "invokeSuspend", n = {}, s = {})
                final class androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.job.1 extends kotlin.coroutines.jvm.internal.o implements o {
                    int k;
                    final NetworkRequestConstraintController l;
                    final D m;

                    androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.job.1(NetworkRequestConstraintController networkRequestConstraintController0, D d0, d d1) {
                        this.l = networkRequestConstraintController0;
                        this.m = d0;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final d create(Object object0, d d0) {
                        return new androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.job.1(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    public final Object invoke(O o0, d d0) {
                        return ((androidx.work.impl.constraints.NetworkRequestConstraintController.track.1.job.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                if(a0.b(this.l.b, this) == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 1: {
                                f0.n(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        Logger.e().a("WM-WorkConstraintsTrack", "NetworkRequestConstraintController didn\'t receive neither  onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.l.b + " ms");
                        ConstraintsNotMet constraintsState$ConstraintsNotMet0 = new ConstraintsNotMet(7);
                        this.m.l(constraintsState$ConstraintsNotMet0);
                        return S0.a;
                    }
                }

            }
        });
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean b(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        if(this.c(workSpec0)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn\'t supported");
        }
        return false;
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean c(@l WorkSpec workSpec0) {
        L.p(workSpec0, "workSpec");
        return workSpec0.j.d() != null;
    }
}

