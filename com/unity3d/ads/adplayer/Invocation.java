package com.unity3d.ads.adplayer;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.X;
import kotlinx.coroutines.k;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import y4.l;
import y4.m;

public final class Invocation {
    @l
    private final x _isHandled;
    @l
    private final x completableDeferred;
    @l
    private final String location;
    @l
    private final Object[] parameters;

    public Invocation(@l String s, @l Object[] arr_object) {
        L.p(s, "location");
        L.p(arr_object, "parameters");
        super();
        this.location = s;
        this.parameters = arr_object;
        this._isHandled = z.c(null, 1, null);
        this.completableDeferred = z.c(null, 1, null);
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @l
    public final Object[] getParameters() {
        return this.parameters;
    }

    @m
    public final Object getResult(@l d d0) {
        return this.completableDeferred.o(d0);
    }

    @m
    public final Object handle(@l Function1 function10, @l d d0) {
        this._isHandled.Q(S0.a);
        k.f(P.a(d0.getContext()), null, null, new o(this, null) {
            final Function1 $handler;
            int label;

            {
                this.$handler = function10;
                Invocation.this = invocation0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.Invocation.handle.3(this.$handler, Invocation.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.Invocation.handle.3)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        try {
                            this.label = 1;
                            object0 = this.$handler.invoke(this);
                            if(object0 == object1) {
                                return object1;
                            label_8:
                                f0.n(object0);
                            }
                            Invocation.this.completableDeferred.Q(object0);
                            return S0.a;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_8;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Invocation.this.completableDeferred.f(throwable0);
                return S0.a;
            }
        }, 3, null);
        return S0.a;
    }

    public static Object handle$default(Invocation invocation0, Function1 function10, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = new Function1(null) {
                int label;

                {
                    super(1, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@l d d0) {
                    return new com.unity3d.ads.adplayer.Invocation.handle.2(d0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.invoke(((d)object0));
                }

                @m
                public final Object invoke(@m d d0) {
                    return ((com.unity3d.ads.adplayer.Invocation.handle.2)this.create(d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.label != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    return S0.a;
                }
            };
        }
        return invocation0.handle(function10, d0);
    }

    @l
    public final X isHandled() {
        return this._isHandled;
    }
}

