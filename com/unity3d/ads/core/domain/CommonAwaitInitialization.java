package com.unity3d.ads.core.domain;

import A3.o;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

public final class CommonAwaitInitialization implements AwaitInitialization {
    @l
    private final SessionRepository sessionRepository;

    public CommonAwaitInitialization(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.sessionRepository = sessionRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.AwaitInitialization
    @m
    public Object invoke(long v, @l d d0) {
        return u1.e(v, new o(null) {
            int label;

            {
                CommonAwaitInitialization.this = commonAwaitInitialization0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.CommonAwaitInitialization.invoke.2(CommonAwaitInitialization.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.CommonAwaitInitialization.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        com.unity3d.ads.core.domain.CommonAwaitInitialization.invoke.2.invokeSuspend..inlined.filter.1 commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$10 = new i() {
                            @Override  // kotlinx.coroutines.flow.i
                            @m
                            public Object collect(@l j j0, @l d d0) {
                                com.unity3d.ads.core.domain.CommonAwaitInitialization.invoke.2.invokeSuspend..inlined.filter.1.2 commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$20 = new j() {
                                    @Override  // kotlinx.coroutines.flow.j
                                    @m
                                    public final Object emit(Object object0, @l d d0) {
                                        com.unity3d.ads.core.domain.CommonAwaitInitialization.invoke.2.invokeSuspend..inlined.filter.1.2.1 commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10;
                                        if(d0 instanceof com.unity3d.ads.core.domain.CommonAwaitInitialization.invoke.2.invokeSuspend..inlined.filter.1.2.1) {
                                            commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10 = (com.unity3d.ads.core.domain.CommonAwaitInitialization.invoke.2.invokeSuspend..inlined.filter.1.2.1)d0;
                                            int v = commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10.label;
                                            if((v & 0x80000000) == 0) {
                                                commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                    Object L$0;
                                                    Object L$1;
                                                    int label;
                                                    Object result;

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        this.result = object0;
                                                        this.label |= 0x80000000;
                                                        return d0.emit(null, this);
                                                    }
                                                };
                                            }
                                            else {
                                                commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                                            }
                                        }
                                        else {
                                            commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                Object L$0;
                                                Object L$1;
                                                int label;
                                                Object result;

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    this.result = object0;
                                                    this.label |= 0x80000000;
                                                    return d0.emit(null, this);
                                                }
                                            };
                                        }
                                        Object object1 = commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10.result;
                                        Object object2 = b.l();
                                        switch(commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10.label) {
                                            case 0: {
                                                f0.n(object1);
                                                j j0 = this.$this_unsafeFlow;
                                                if(((InitializationState)object0) == InitializationState.INITIALIZED || ((InitializationState)object0) == InitializationState.FAILED) {
                                                    commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10.label = 1;
                                                    if(j0.emit(object0, commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$10) == object2) {
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
                                Object object0 = this.$this_unsafeTransform$inlined.collect(commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$20, d0);
                                return object0 == b.l() ? object0 : S0.a;
                            }
                        };
                        this.label = 1;
                        object0 = k.v0(commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$10, this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, d0);
    }
}

