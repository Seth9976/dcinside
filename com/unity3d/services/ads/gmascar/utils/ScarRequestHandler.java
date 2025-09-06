package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

public class ScarRequestHandler {
    private final HttpClient httpClient;

    public ScarRequestHandler() {
        this.httpClient = (HttpClient)Utilities.getService(HttpClient.class);
    }

    public void makeUploadRequest(String s, BiddingSignals biddingSignals0, String s1) throws Exception {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Content-Type", Collections.singletonList("application/json"));
        HashMap hashMap1 = new HashMap();
        hashMap1.put("idfi", Device.getIdfi());
        hashMap1.put("tid", s);
        hashMap1.putAll(biddingSignals0.getMap());
        byte[] arr_b = new JSONObject(hashMap1).toString().getBytes(StandardCharsets.UTF_8);
        HttpRequest httpRequest0 = new HttpRequest(s1, "", RequestType.POST, arr_b, hashMap0);
        this.httpClient.executeBlocking(httpRequest0);
    }
}

