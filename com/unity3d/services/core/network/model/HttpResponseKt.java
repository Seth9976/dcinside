package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import y4.l;

public final class HttpResponseKt {
    public static final boolean isSuccessful(@l HttpResponse httpResponse0) {
        L.p(httpResponse0, "<this>");
        int v = httpResponse0.getStatusCode();
        return 200 <= v && v < 300;
    }

    @l
    public static final HttpResponse toHttpResponse(@l UnityAdsNetworkException unityAdsNetworkException0) {
        L.p(unityAdsNetworkException0, "<this>");
        Integer integer0 = unityAdsNetworkException0.getCode();
        String s = unityAdsNetworkException0.getUrl();
        String s1 = unityAdsNetworkException0.getProtocol();
        return new HttpResponse("", (integer0 == null ? 520 : ((int)integer0)), Y.z(), (s == null ? "" : s), (s1 == null ? "" : s1), (unityAdsNetworkException0.getClient() == null ? "unknown" : unityAdsNetworkException0.getClient()), 0L, 0x40, null);
    }
}

