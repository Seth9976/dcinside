package com.coupang.ads.network.api;

import com.coupang.ads.dto.AdsDto;
import com.coupang.ads.dto.c;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import okhttp3.RequestBody;
import y4.l;
import y4.m;

public final class a {
    @l
    private final c a;

    public a(@l c c0) {
        L.p(c0, "network");
        super();
        this.a = c0;
    }

    @l
    public final c a() {
        return this.a;
    }

    @m
    public final Object b(@l RequestBody requestBody0, @l d d0) {
        @f(c = "com.coupang.ads.network.api.AdsApi$requestBannerData$2", f = "AdsApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.coupang.ads.network.api.a.a extends o implements A3.o {
            int k;
            final a l;
            final RequestBody m;

            com.coupang.ads.network.api.a.a(a a0, RequestBody requestBody0, d d0) {
                this.l = a0;
                this.m = requestBody0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.coupang.ads.network.api.a.a(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.coupang.ads.network.api.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return this.l.a().e("https://centaurs-rest.coupang.com/v2/api/ads", AdsDto.class, null, this.m);
            }
        }

        return i.h(h0.c(), new com.coupang.ads.network.api.a.a(this, requestBody0, null), d0);
    }
}

