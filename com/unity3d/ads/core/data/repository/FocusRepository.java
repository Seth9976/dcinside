package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent.Paused;
import com.unity3d.ads.core.domain.LifecycleEvent.Resumed;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRepository.kt\ncom/unity3d/ads/core/data/repository/FocusRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,44:1\n20#2:45\n22#2:49\n47#2:50\n49#2:54\n50#3:46\n55#3:48\n50#3:51\n55#3:53\n106#4:47\n106#4:52\n*S KotlinDebug\n*F\n+ 1 FocusRepository.kt\ncom/unity3d/ads/core/data/repository/FocusRepository\n*L\n31#1:45\n31#1:49\n32#1:50\n32#1:54\n31#1:46\n31#1:48\n32#1:51\n32#1:53\n31#1:47\n32#1:52\n*E\n"})
public final class FocusRepository {
    @l
    private final I focusState;

    public FocusRepository(@l AndroidGetLifecycleFlow androidGetLifecycleFlow0, @l K k0) {
        L.p(androidGetLifecycleFlow0, "getLifecycleFlow");
        I i0;
        L.p(k0, "defaultDispatcher");
        super();
        try {
            i0 = k.F1(new i() {
                @Override  // kotlinx.coroutines.flow.i
                @m
                public Object collect(@l j j0, @l d d0) {
                    com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.map.1.2 focusRepository$special$$inlined$map$1$20 = new j() {
                        @Override  // kotlinx.coroutines.flow.j
                        @m
                        public final Object emit(Object object0, @l d d0) {
                            com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.map.1.2.1 focusRepository$special$$inlined$map$1$2$10;
                            if(d0 instanceof com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.map.1.2.1) {
                                focusRepository$special$$inlined$map$1$2$10 = (com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.map.1.2.1)d0;
                                int v = focusRepository$special$$inlined$map$1$2$10.label;
                                if((v & 0x80000000) == 0) {
                                    focusRepository$special$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                        Object L$0;
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
                                    focusRepository$special$$inlined$map$1$2$10.label = v ^ 0x80000000;
                                }
                            }
                            else {
                                focusRepository$special$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
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
                            Object object1 = focusRepository$special$$inlined$map$1$2$10.result;
                            Object object2 = b.l();
                            switch(focusRepository$special$$inlined$map$1$2$10.label) {
                                case 0: {
                                    f0.n(object1);
                                    j j0 = this.$this_unsafeFlow;
                                    Focused focusState$Focused0 = ((LifecycleEvent)object0) instanceof Resumed ? new Focused(((LifecycleEvent)object0).getActivity()) : new Unfocused(((LifecycleEvent)object0).getActivity());
                                    focusRepository$special$$inlined$map$1$2$10.label = 1;
                                    return j0.emit(focusState$Focused0, focusRepository$special$$inlined$map$1$2$10) == object2 ? object2 : S0.a;
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
                    Object object0 = this.$this_unsafeTransform$inlined.collect(focusRepository$special$$inlined$map$1$20, d0);
                    return object0 == b.l() ? object0 : S0.a;
                }
            }, P.a(k0), O.a.c(), 1);
        }
        catch(Exception exception0) {
            DeviceLog.error("Could not subscribe to lifecycle flow", new Object[]{exception0});
            i0 = kotlinx.coroutines.flow.K.b(0, 0, null, 7, null);
        }
        this.focusState = i0;

        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.filter.1 implements i {
            public com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.filter.1(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.filter.1.2 focusRepository$special$$inlined$filter$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.filter.1.2.1 focusRepository$special$$inlined$filter$1$2$10;
                        if(d0 instanceof com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.filter.1.2.1) {
                            focusRepository$special$$inlined$filter$1$2$10 = (com.unity3d.ads.core.data.repository.FocusRepository.special..inlined.filter.1.2.1)d0;
                            int v = focusRepository$special$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                focusRepository$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                focusRepository$special$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            focusRepository$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = focusRepository$special$$inlined$filter$1$2$10.result;
                        Object object2 = b.l();
                        switch(focusRepository$special$$inlined$filter$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(((LifecycleEvent)object0) instanceof Paused || ((LifecycleEvent)object0) instanceof Resumed) {
                                    focusRepository$special$$inlined$filter$1$2$10.label = 1;
                                    if(j0.emit(object0, focusRepository$special$$inlined$filter$1$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(focusRepository$special$$inlined$filter$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }

    }

    @l
    public final I getFocusState() {
        return this.focusState;
    }
}

