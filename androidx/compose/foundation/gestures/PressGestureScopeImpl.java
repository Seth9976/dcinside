package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;
import y4.l;
import y4.m;

final class PressGestureScopeImpl implements PressGestureScope, Density {
    private final Density a;
    private boolean b;
    private boolean c;
    @l
    private final a d;

    public PressGestureScopeImpl(@l Density density0) {
        L.p(density0, "density");
        super();
        this.a = density0;
        this.d = c.a(false);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float C(int v) {
        return this.a.C(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float D(float f) {
        return this.a.D(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int E1(long v) {
        return this.a.E1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect H0(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return this.a.H0(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long J(long v) {
        return this.a.J(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long M(float f) {
        return this.a.M(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int b1(float f) {
        return this.a.b1(f);
    }

    public final void c() {
        this.c = true;
        kotlinx.coroutines.sync.a.a.d(this.d, null, 1, null);
    }

    public final void e() {
        this.b = true;
        kotlinx.coroutines.sync.a.a.d(this.d, null, 1, null);
    }

    @Override  // androidx.compose.foundation.gestures.PressGestureScope
    @m
    public Object e1(@l d d0) {
        PressGestureScopeImpl pressGestureScopeImpl0;
        androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease.1 pressGestureScopeImpl$tryAwaitRelease$10;
        if(d0 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease.1) {
            pressGestureScopeImpl$tryAwaitRelease$10 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease.1)d0;
            int v = pressGestureScopeImpl$tryAwaitRelease$10.n;
            if((v & 0x80000000) == 0) {
                pressGestureScopeImpl$tryAwaitRelease$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.e1(this);
                    }
                };
            }
            else {
                pressGestureScopeImpl$tryAwaitRelease$10.n = v ^ 0x80000000;
            }
        }
        else {
            pressGestureScopeImpl$tryAwaitRelease$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.e1(this);
                }
            };
        }
        Object object0 = pressGestureScopeImpl$tryAwaitRelease$10.l;
        Object object1 = b.l();
        switch(pressGestureScopeImpl$tryAwaitRelease$10.n) {
            case 0: {
                f0.n(object0);
                if(!this.b && !this.c) {
                    pressGestureScopeImpl$tryAwaitRelease$10.k = this;
                    pressGestureScopeImpl$tryAwaitRelease$10.n = 1;
                    if(kotlinx.coroutines.sync.a.a.b(this.d, null, pressGestureScopeImpl$tryAwaitRelease$10, 1, null) == object1) {
                        return object1;
                    }
                    pressGestureScopeImpl0 = this;
                    break;
                }
                return kotlin.coroutines.jvm.internal.b.a(this.b);
            }
            case 1: {
                pressGestureScopeImpl0 = (PressGestureScopeImpl)pressGestureScopeImpl$tryAwaitRelease$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        kotlinx.coroutines.sync.a.a.d(pressGestureScopeImpl0.d, null, 1, null);
        return kotlin.coroutines.jvm.internal.b.a(pressGestureScopeImpl0.b);
    }

    @m
    public final Object f(@l d d0) {
        PressGestureScopeImpl pressGestureScopeImpl0;
        androidx.compose.foundation.gestures.PressGestureScopeImpl.reset.1 pressGestureScopeImpl$reset$10;
        if(d0 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.reset.1) {
            pressGestureScopeImpl$reset$10 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.reset.1)d0;
            int v = pressGestureScopeImpl$reset$10.n;
            if((v & 0x80000000) == 0) {
                pressGestureScopeImpl$reset$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.f(this);
                    }
                };
            }
            else {
                pressGestureScopeImpl$reset$10.n = v ^ 0x80000000;
            }
        }
        else {
            pressGestureScopeImpl$reset$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.f(this);
                }
            };
        }
        Object object0 = pressGestureScopeImpl$reset$10.l;
        Object object1 = b.l();
        switch(pressGestureScopeImpl$reset$10.n) {
            case 0: {
                f0.n(object0);
                pressGestureScopeImpl$reset$10.k = this;
                pressGestureScopeImpl$reset$10.n = 1;
                if(kotlinx.coroutines.sync.a.a.b(this.d, null, pressGestureScopeImpl$reset$10, 1, null) == object1) {
                    return object1;
                }
                pressGestureScopeImpl0 = this;
                break;
            }
            case 1: {
                pressGestureScopeImpl0 = (PressGestureScopeImpl)pressGestureScopeImpl$reset$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pressGestureScopeImpl0.b = false;
        pressGestureScopeImpl0.c = false;
        return S0.a;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float g1(long v) {
        return this.a.g1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long m(long v) {
        return this.a.m(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float p(long v) {
        return this.a.p(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long r(int v) {
        return this.a.r(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long s(float f) {
        return this.a.s(f);
    }

    @Override  // androidx.compose.foundation.gestures.PressGestureScope
    @m
    public Object s1(@l d d0) {
        androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease.1 pressGestureScopeImpl$awaitRelease$10;
        if(d0 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease.1) {
            pressGestureScopeImpl$awaitRelease$10 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease.1)d0;
            int v = pressGestureScopeImpl$awaitRelease$10.m;
            if((v & 0x80000000) == 0) {
                pressGestureScopeImpl$awaitRelease$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return d0.s1(this);
                    }
                };
            }
            else {
                pressGestureScopeImpl$awaitRelease$10.m = v ^ 0x80000000;
            }
        }
        else {
            pressGestureScopeImpl$awaitRelease$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.m |= 0x80000000;
                    return d0.s1(this);
                }
            };
        }
        Object object0 = pressGestureScopeImpl$awaitRelease$10.k;
        Object object1 = b.l();
        switch(pressGestureScopeImpl$awaitRelease$10.m) {
            case 0: {
                f0.n(object0);
                pressGestureScopeImpl$awaitRelease$10.m = 1;
                object0 = this.e1(pressGestureScopeImpl$awaitRelease$10);
                if(object0 == object1) {
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
        if(!((Boolean)object0).booleanValue()) {
            throw new GestureCancellationException("The press gesture was canceled.");
        }
        return S0.a;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.a.w1();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float y1(float f) {
        return this.a.y1(f);
    }
}

