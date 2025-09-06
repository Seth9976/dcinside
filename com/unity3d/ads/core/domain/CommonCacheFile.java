package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult.Failure;
import com.unity3d.ads.core.data.model.CacheResult.Success;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.r0;
import kotlin.time.s.b.a;
import org.json.JSONArray;
import y4.l;
import y4.m;

public final class CommonCacheFile implements CacheFile {
    @l
    private final CacheRepository cacheRepository;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCacheFile(@l CacheRepository cacheRepository0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(cacheRepository0, "cacheRepository");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.cacheRepository = cacheRepository0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.CacheFile
    @m
    public Object invoke(@l String s, @l AdObject adObject0, @m JSONArray jSONArray0, int v, @l d d0) {
        long v2;
        AdObject adObject1;
        CommonCacheFile commonCacheFile0;
        com.unity3d.ads.core.domain.CommonCacheFile.invoke.1 commonCacheFile$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.CommonCacheFile.invoke.1) {
            commonCacheFile$invoke$10 = (com.unity3d.ads.core.domain.CommonCacheFile.invoke.1)d0;
            int v1 = commonCacheFile$invoke$10.label;
            if((v1 & 0x80000000) == 0) {
                commonCacheFile$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, null, 0, this);
                    }
                };
            }
            else {
                commonCacheFile$invoke$10.label = v1 ^ 0x80000000;
            }
        }
        else {
            commonCacheFile$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, null, 0, this);
                }
            };
        }
        Object object0 = commonCacheFile$invoke$10.result;
        Object object1 = b.l();
        switch(commonCacheFile$invoke$10.label) {
            case 0: {
                f0.n(object0);
                String s1 = adObject0.getOpportunityId().toStringUtf8();
                L.o(s1, "adObject.opportunityId.toStringUtf8()");
                commonCacheFile$invoke$10.L$0 = this;
                commonCacheFile$invoke$10.L$1 = adObject0;
                commonCacheFile$invoke$10.J$0 = 3482700L;
                commonCacheFile$invoke$10.label = 1;
                Object object2 = this.cacheRepository.getFile(s, s1, jSONArray0, v, commonCacheFile$invoke$10);
                if(object2 == object1) {
                    return object1;
                }
                commonCacheFile0 = this;
                adObject1 = adObject0;
                object0 = object2;
                v2 = 3482700L;
                break;
            }
            case 1: {
                v2 = commonCacheFile$invoke$10.J$0;
                AdObject adObject2 = (AdObject)commonCacheFile$invoke$10.L$1;
                commonCacheFile0 = (CommonCacheFile)commonCacheFile$invoke$10.L$0;
                f0.n(object0);
                adObject1 = adObject2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((CacheResult)object0) instanceof Success) {
            Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v2)));
            Map map0 = Y.W(new V[]{r0.a("cache_source", ((Success)(((CacheResult)object0))).getSource().toString()), r0.a("protocol", ((Success)(((CacheResult)object0))).getCachedFile().getProtocol())});
            Map map1 = Y.k(r0.a("size_kb", kotlin.coroutines.jvm.internal.b.f(((int)(((Success)(((CacheResult)object0))).getCachedFile().getContentLength() / 0x400L)))));
            commonCacheFile0.sendDiagnosticEvent.invoke("native_load_cache_success_time", double0, map0, map1, adObject1);
            return (CacheResult)object0;
        }
        if(((CacheResult)object0) instanceof Failure) {
            Double double1 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v2)));
            Map map2 = Y.W(new V[]{r0.a("cache_source", ((Failure)(((CacheResult)object0))).getSource().toString()), r0.a("reason", ((Failure)(((CacheResult)object0))).getError().toString())});
            DefaultImpls.invoke$default(commonCacheFile0.sendDiagnosticEvent, "native_load_cache_failure_time", double1, map2, null, adObject1, 8, null);
        }
        return (CacheResult)object0;
    }
}

