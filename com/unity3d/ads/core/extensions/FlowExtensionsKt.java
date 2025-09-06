package com.unity3d.ads.core.extensions;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.G.a;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class FlowExtensionsKt {
    @l
    public static final i timeoutAfter(@l i i0, long v, boolean z, @l o o0) {
        L.p(i0, "<this>");
        L.p(o0, "block");
        return k.w(new o(v, z, o0, i0, null) {
            final boolean $active;
            final o $block;
            final i $this_timeoutAfter;
            final long $timeoutMillis;
            private Object L$0;
            int label;

            {
                this.$timeoutMillis = v;
                this.$active = z;
                this.$block = o0;
                this.$this_timeoutAfter = i0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, d0);
                d1.L$0 = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                D d0;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.L$0;
                        kotlinx.coroutines.k.f(d0, null, null, new o(d0, null) {
                            final D $$this$channelFlow;
                            final i $this_timeoutAfter;
                            int label;

                            {
                                this.$this_timeoutAfter = i0;
                                this.$$this$channelFlow = d0;
                                super(2, d1);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1(this.$this_timeoutAfter, this.$$this$channelFlow, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.label) {
                                    case 0: {
                                        f0.n(object0);
                                        com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1 flowExtensionsKt$timeoutAfter$1$1$10 = new j() {
                                            @Override  // kotlinx.coroutines.flow.j
                                            @m
                                            public final Object emit(Object object0, @l d d0) {
                                                Object object1 = this.$$this$channelFlow.I(object0, d0);
                                                return object1 == b.l() ? object1 : S0.a;
                                            }
                                        };
                                        this.label = 1;
                                        if(this.$this_timeoutAfter.collect(flowExtensionsKt$timeoutAfter$1$1$10, this) == object1) {
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
                                a.a(this.$$this$channelFlow, null, 1, null);
                                return S0.a;
                            }
                        }, 3, null);
                        this.L$0 = d0;
                        this.label = 1;
                        if(a0.b(this.$timeoutMillis, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        d0 = (D)this.L$0;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(this.$active) {
                    com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.2 flowExtensionsKt$timeoutAfter$1$20 = new A3.a() {
                        {
                            super(0, object0, D.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            this.invoke();
                            return S0.a;
                        }

                        public final void invoke() {
                            a.a(((D)this.receiver), null, 1, null);
                        }
                    };
                    this.L$0 = null;
                    this.label = 2;
                    if(this.$block.invoke(flowExtensionsKt$timeoutAfter$1$20, this) == object1) {
                        return object1;
                    }
                }
                return S0.a;
            }
        });
    }

    public static i timeoutAfter$default(i i0, long v, boolean z, o o0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = true;
        }
        return FlowExtensionsKt.timeoutAfter(i0, v, z, o0);
    }
}

