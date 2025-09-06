package com.unity3d.ads.core.utils;

import A3.a;
import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class CommonCoroutineTimer implements CoroutineTimer {
    @l
    private final K dispatcher;
    @l
    private final A job;
    @l
    private final O scope;

    public CommonCoroutineTimer(@l K k0) {
        L.p(k0, "dispatcher");
        super();
        this.dispatcher = k0;
        A a0 = j1.c(null, 1, null);
        this.job = a0;
        this.scope = P.a(k0.plus(a0));
    }

    @Override  // com.unity3d.ads.core.utils.CoroutineTimer
    @l
    public I0 start(long v, long v1, @l a a0) {
        L.p(a0, "action");
        com.unity3d.ads.core.utils.CommonCoroutineTimer.start.1 commonCoroutineTimer$start$10 = new o(a0, v1, null) {
            final a $action;
            final long $delayStartMillis;
            final long $repeatMillis;
            private Object L$0;
            int label;

            {
                this.$delayStartMillis = v;
                this.$action = a0;
                this.$repeatMillis = v1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.utils.CommonCoroutineTimer.start.1(this.$delayStartMillis, this.$action, this.$repeatMillis, d0);
                d1.L$0 = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.utils.CommonCoroutineTimer.start.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                O o0;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.L$0;
                        this.L$0 = o0;
                        this.label = 1;
                        if(a0.b(this.$delayStartMillis, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: 
                    case 2: {
                        o0 = (O)this.L$0;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(P.k(o0)) {
                    this.$action.invoke();
                    this.L$0 = o0;
                    this.label = 2;
                    if(a0.b(this.$repeatMillis, this) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        };
        return k.f(this.scope, this.dispatcher, null, commonCoroutineTimer$start$10, 2, null);
    }
}

