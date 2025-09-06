package com.unity3d.ads.core.domain;

import A3.o;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.InputStream;
import java.util.Map;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import org.json.JSONArray;
import y4.l;
import y4.m;

public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[RequestType.values().length];
            try {
                arr_v[RequestType.GET.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[RequestType.HEAD.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[RequestType.POST.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    private final GetCachedAsset getCachedAsset;
    @l
    private final HttpClient httpClient;
    @l
    private final K ioDispatcher;

    public AndroidExecuteAdViewerRequest(@l K k0, @l HttpClient httpClient0, @l GetCachedAsset getCachedAsset0) {
        L.p(k0, "ioDispatcher");
        L.p(httpClient0, "httpClient");
        L.p(getCachedAsset0, "getCachedAsset");
        super();
        this.ioDispatcher = k0;
        this.httpClient = httpClient0;
        this.getCachedAsset = getCachedAsset0;
    }

    private final HttpRequest createRequest(RequestType requestType0, Object[] arr_object) {
        Map map1;
        Map map0;
        Object object0 = kotlin.collections.l.Pe(arr_object, 1);
        if(((String)object0) != null && ((String)object0).length() != 0) {
            switch(requestType0) {
                case 1: 
                case 2: {
                    JSONArray jSONArray0 = (JSONArray)kotlin.collections.l.Pe(arr_object, 2);
                    Integer integer0 = (Integer)kotlin.collections.l.Pe(arr_object, 3);
                    Integer integer1 = (Integer)kotlin.collections.l.Pe(arr_object, 4);
                    if(jSONArray0 == null) {
                        map0 = Y.z();
                    }
                    else {
                        map0 = JSONArrayExtensionsKt.getHeadersMap(jSONArray0);
                        if(map0 == null) {
                            map0 = Y.z();
                        }
                    }
                    int v = integer0 == null ? 30000 : ((int)integer0);
                    return integer1 == null ? new HttpRequest(((String)object0), null, requestType0, null, map0, null, null, null, null, v, 30000, 0, 0, false, null, null, 0, 0x1F9EA, null) : new HttpRequest(((String)object0), null, requestType0, null, map0, null, null, null, null, v, ((int)integer1), 0, 0, false, null, null, 0, 0x1F9EA, null);
                }
                case 3: {
                    String s = (String)kotlin.collections.l.Pe(arr_object, 2);
                    JSONArray jSONArray1 = (JSONArray)kotlin.collections.l.Pe(arr_object, 3);
                    Integer integer2 = (Integer)kotlin.collections.l.Pe(arr_object, 4);
                    Integer integer3 = (Integer)kotlin.collections.l.Pe(arr_object, 5);
                    if(jSONArray1 == null) {
                        map1 = Y.z();
                    }
                    else {
                        map1 = JSONArrayExtensionsKt.getHeadersMap(jSONArray1);
                        if(map1 == null) {
                            map1 = Y.z();
                        }
                    }
                    int v1 = integer2 == null ? 30000 : ((int)integer2);
                    return integer3 == null ? new HttpRequest(((String)object0), null, requestType0, s, map1, null, null, null, null, v1, 30000, 0, 0, false, null, null, 0, 0x1F9E2, null) : new HttpRequest(((String)object0), null, requestType0, s, map1, null, null, null, null, v1, ((int)integer3), 0, 0, false, null, null, 0, 0x1F9E2, null);
                }
                default: {
                    throw new J();
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override  // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    @m
    public Object invoke(@l RequestType requestType0, @l Object[] arr_object, @l d d0) {
        com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.invoke.2 androidExecuteAdViewerRequest$invoke$20 = new o(this, requestType0, null) {
            final Object[] $parameters;
            final RequestType $type;
            int label;

            {
                this.$parameters = arr_object;
                AndroidExecuteAdViewerRequest.this = androidExecuteAdViewerRequest0;
                this.$type = requestType0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.invoke.2(this.$parameters, AndroidExecuteAdViewerRequest.this, this.$type, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Uri uri1;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = kotlin.collections.l.Pe(this.$parameters, 1);
                        byte[] arr_b = null;
                        String s = object2 instanceof String ? ((String)object2) : null;
                        if(s == null) {
                            s = "";
                        }
                        if(s.length() <= 0) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        try {
                            Uri uri0 = Uri.parse(s);
                            L.o(uri0, "parse(this)");
                            uri1 = uri0;
                        }
                        catch(Throwable throwable0) {
                            uri1 = e0.b(f0.a(throwable0));
                        }
                        if(e0.i(uri1)) {
                            uri1 = null;
                        }
                        Uri uri2 = uri1;
                        if(uri2 != null) {
                            if(this.$type != RequestType.GET) {
                                uri2 = null;
                            }
                            if(uri2 != null) {
                                WebResourceResponse webResourceResponse0 = AndroidExecuteAdViewerRequest.this.getCachedAsset.invoke(uri2);
                                if(webResourceResponse0 != null) {
                                    InputStream inputStream0 = webResourceResponse0.getData();
                                    if(inputStream0 != null) {
                                        L.o(inputStream0, "data");
                                        arr_b = kotlin.io.b.p(inputStream0);
                                    }
                                }
                            }
                        }
                        if(arr_b != null) {
                            return new HttpResponse(arr_b, 0, null, null, null, null, 0L, 0x7E, null);
                        }
                        HttpRequest httpRequest0 = AndroidExecuteAdViewerRequest.this.createRequest(this.$type, this.$parameters);
                        this.label = 1;
                        Object object3 = AndroidExecuteAdViewerRequest.this.httpClient.execute(httpRequest0, this);
                        return object3 == object1 ? object1 : object3;
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
        };
        return i.h(this.ioDispatcher, androidExecuteAdViewerRequest$invoke$20, d0);
    }
}

