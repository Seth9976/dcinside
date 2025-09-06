package com.unity3d.ads.core.domain;

import A3.o;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class TriggerInitializeListener {
    @l
    private final K coroutineDispatcher;

    public TriggerInitializeListener(@l K k0) {
        L.p(k0, "coroutineDispatcher");
        super();
        this.coroutineDispatcher = k0;
    }

    public final void error(@l UnityAdsInitializationError unityAds$UnityAdsInitializationError0, @l String s) {
        L.p(unityAds$UnityAdsInitializationError0, "unityAdsInitializationError");
        L.p(s, "errorMsg");
        k.f(P.a(this.coroutineDispatcher), null, null, new o(s, null) {
            final String $errorMsg;
            final UnityAdsInitializationError $unityAdsInitializationError;
            int label;

            {
                this.$unityAdsInitializationError = unityAds$UnityAdsInitializationError0;
                this.$errorMsg = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.TriggerInitializeListener.error.1(this.$unityAdsInitializationError, this.$errorMsg, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.TriggerInitializeListener.error.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
                return S0.a;
            }
        }, 3, null);
    }

    public final void success() {
        k.f(P.a(this.coroutineDispatcher), null, null, new o() {
            int label;

            {
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.TriggerInitializeListener.success.1(d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.TriggerInitializeListener.success.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                SdkProperties.notifyInitializationComplete();
                return S0.a;
            }
        }, 3, null);
    }
}

