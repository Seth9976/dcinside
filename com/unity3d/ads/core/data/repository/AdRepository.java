package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface AdRepository {
    @m
    Object addAd(@l ByteString arg1, @l AdObject arg2, @l d arg3);

    @m
    Object getAd(@l ByteString arg1, @l d arg2);

    @m
    Object hasOpportunityId(@l ByteString arg1, @l d arg2);

    @m
    Object removeAd(@l ByteString arg1, @l d arg2);
}

