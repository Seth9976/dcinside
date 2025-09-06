package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import kotlin.time.s.b.a;
import y4.l;
import y4.m;

public final class CommonGetIsFileCache implements GetIsFileCache {
    @l
    private final CacheRepository cacheRepository;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetIsFileCache(@l CacheRepository cacheRepository0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(cacheRepository0, "cacheRepository");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.cacheRepository = cacheRepository0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.GetIsFileCache
    @m
    public Object invoke(@l String s, @l d d0) {
        long v1;
        CommonGetIsFileCache commonGetIsFileCache0;
        com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke.1 commonGetIsFileCache$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke.1) {
            commonGetIsFileCache$invoke$10 = (com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke.1)d0;
            int v = commonGetIsFileCache$invoke$10.label;
            if((v & 0x80000000) == 0) {
                commonGetIsFileCache$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, this);
                    }
                };
            }
            else {
                commonGetIsFileCache$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonGetIsFileCache$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, this);
                }
            };
        }
        Object object0 = commonGetIsFileCache$invoke$10.result;
        Object object1 = b.l();
        switch(commonGetIsFileCache$invoke$10.label) {
            case 0: {
                f0.n(object0);
                String s1 = v.z5(v.v5(s, "/", null, 2, null), ".", null, 2, null);
                commonGetIsFileCache$invoke$10.L$0 = this;
                commonGetIsFileCache$invoke$10.J$0 = 35297700L;
                commonGetIsFileCache$invoke$10.label = 1;
                object0 = this.cacheRepository.doesFileExist(s1, commonGetIsFileCache$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                commonGetIsFileCache0 = this;
                v1 = 35297700L;
                break;
            }
            case 1: {
                v1 = commonGetIsFileCache$invoke$10.J$0;
                commonGetIsFileCache0 = (CommonGetIsFileCache)commonGetIsFileCache$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        boolean z = ((Boolean)object0).booleanValue();
        DefaultImpls.invoke$default(commonGetIsFileCache0.sendDiagnosticEvent, (z ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time"), kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v1))), null, null, null, 28, null);
        return kotlin.coroutines.jvm.internal.b.a(z);
    }
}

