package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import j..util.concurrent.ConcurrentHashMap;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import y4.l;
import y4.m;

public final class AndroidAdRepository implements AdRepository {
    @l
    private final ConcurrentHashMap loadedAds;

    public AndroidAdRepository() {
        this.loadedAds = new ConcurrentHashMap();
    }

    @Override  // com.unity3d.ads.core.data.repository.AdRepository
    @m
    public Object addAd(@l ByteString byteString0, @l AdObject adObject0, @l d d0) {
        this.loadedAds.put(byteString0, adObject0);
        return S0.a;
    }

    @Override  // com.unity3d.ads.core.data.repository.AdRepository
    @m
    public Object getAd(@l ByteString byteString0, @l d d0) {
        return this.loadedAds.get(byteString0);
    }

    @Override  // com.unity3d.ads.core.data.repository.AdRepository
    @m
    public Object hasOpportunityId(@l ByteString byteString0, @l d d0) {
        return b.a(this.loadedAds.containsKey(byteString0));
    }

    @Override  // com.unity3d.ads.core.data.repository.AdRepository
    @m
    public Object removeAd(@l ByteString byteString0, @l d d0) {
        this.loadedAds.remove(byteString0);
        return S0.a;
    }
}

