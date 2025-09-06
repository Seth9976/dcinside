package androidx.slidingpanelayout.widget;

import A3.o;
import android.app.Activity;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

public final class FoldingFeatureObserver {
    public interface OnFoldingFeatureChangeListener {
        void a(@l FoldingFeature arg1);
    }

    @l
    private final WindowInfoTracker a;
    @l
    private final Executor b;
    @m
    private I0 c;
    @m
    private OnFoldingFeatureChangeListener d;

    public FoldingFeatureObserver(@l WindowInfoTracker windowInfoTracker0, @l Executor executor0) {
        L.p(windowInfoTracker0, "windowInfoTracker");
        L.p(executor0, "executor");
        super();
        this.a = windowInfoTracker0;
        this.b = executor0;
    }

    private final FoldingFeature d(WindowLayoutInfo windowLayoutInfo0) {
        for(Object object0: windowLayoutInfo0.a()) {
            if(((DisplayFeature)object0) instanceof FoldingFeature) {
                return object0 instanceof FoldingFeature ? ((FoldingFeature)object0) : null;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void e(@l Activity activity0) {
        L.p(activity0, "activity");
        I0 i00 = this.c;
        if(i00 != null) {
            a.b(i00, null, 1, null);
        }
        this.c = k.f(P.a(w0.c(this.b)), null, null, new o(activity0, null) {
            int k;
            final FoldingFeatureObserver l;
            final Activity m;

            {
                this.l = foldingFeatureObserver0;
                this.m = activity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.slidingpanelayout.widget.FoldingFeatureObserver.registerLayoutStateChangeCallback.1(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.slidingpanelayout.widget.FoldingFeatureObserver.registerLayoutStateChangeCallback.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        i i0 = kotlinx.coroutines.flow.k.g0(new i() {
                            @Override  // kotlinx.coroutines.flow.i
                            @m
                            public Object collect(@l j j0, @l d d0) {
                                androidx.slidingpanelayout.widget.FoldingFeatureObserver.registerLayoutStateChangeCallback.1.invokeSuspend..inlined.mapNotNull.1.2 foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$20 = new j() {
                                    @Override  // kotlinx.coroutines.flow.j
                                    @m
                                    public Object emit(Object object0, @l d d0) {
                                        androidx.slidingpanelayout.widget.FoldingFeatureObserver.registerLayoutStateChangeCallback.1.invokeSuspend..inlined.mapNotNull.1.2.1 foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10;
                                        if(d0 instanceof androidx.slidingpanelayout.widget.FoldingFeatureObserver.registerLayoutStateChangeCallback.1.invokeSuspend..inlined.mapNotNull.1.2.1) {
                                            foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10 = (androidx.slidingpanelayout.widget.FoldingFeatureObserver.registerLayoutStateChangeCallback.1.invokeSuspend..inlined.mapNotNull.1.2.1)d0;
                                            int v = foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10.l;
                                            if((v & 0x80000000) == 0) {
                                                foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                    Object k;
                                                    int l;
                                                    Object m;

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        this.k = object0;
                                                        this.l |= 0x80000000;
                                                        return d0.emit(null, this);
                                                    }
                                                };
                                            }
                                            else {
                                                foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10.l = v ^ 0x80000000;
                                            }
                                        }
                                        else {
                                            foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                Object k;
                                                int l;
                                                Object m;

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    this.k = object0;
                                                    this.l |= 0x80000000;
                                                    return d0.emit(null, this);
                                                }
                                            };
                                        }
                                        Object object1 = foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10.k;
                                        Object object2 = b.l();
                                        switch(foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10.l) {
                                            case 0: {
                                                f0.n(object1);
                                                j j0 = this.b;
                                                FoldingFeature foldingFeature0 = this.b.d(((WindowLayoutInfo)object0));
                                                if(foldingFeature0 != null) {
                                                    foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10.l = 1;
                                                    if(j0.emit(foldingFeature0, foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$10) == object2) {
                                                        return object2;
                                                    }
                                                }
                                                return S0.a;
                                            }
                                            case 1: {
                                                f0.n(object1);
                                                return S0.a;
                                            }
                                            default: {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                        }
                                    }
                                };
                                Object object0 = this.l.collect(foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$20, d0);
                                return object0 == b.l() ? object0 : S0.a;
                            }
                        });
                        androidx.slidingpanelayout.widget.FoldingFeatureObserver.registerLayoutStateChangeCallback.1.invokeSuspend..inlined.collect.1 foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$10 = new j() {
                            @Override  // kotlinx.coroutines.flow.j
                            @m
                            public Object emit(Object object0, @l d d0) {
                                OnFoldingFeatureChangeListener foldingFeatureObserver$OnFoldingFeatureChangeListener0 = this.a.d;
                                if(foldingFeatureObserver$OnFoldingFeatureChangeListener0 == null) {
                                    return null == b.l() ? null : S0.a;
                                }
                                foldingFeatureObserver$OnFoldingFeatureChangeListener0.a(((FoldingFeature)object0));
                                return S0.a == b.l() ? S0.a : S0.a;
                            }
                        };
                        this.k = 1;
                        return i0.collect(foldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$10, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
    }

    public final void f(@l OnFoldingFeatureChangeListener foldingFeatureObserver$OnFoldingFeatureChangeListener0) {
        L.p(foldingFeatureObserver$OnFoldingFeatureChangeListener0, "onFoldingFeatureChangeListener");
        this.d = foldingFeatureObserver$OnFoldingFeatureChangeListener0;
    }

    public final void g() {
        I0 i00 = this.c;
        if(i00 != null) {
            a.b(i00, null, 1, null);
        }
    }
}

