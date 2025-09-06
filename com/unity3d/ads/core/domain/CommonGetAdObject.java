package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.repository.AdRepository;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CommonGetAdObject implements GetAdObject {
    @l
    private final AdRepository adRepository;

    public CommonGetAdObject(@l AdRepository adRepository0) {
        L.p(adRepository0, "adRepository");
        super();
        this.adRepository = adRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetAdObject
    @m
    public Object invoke(@l String s, @l d d0) {
        ByteString byteString0 = ByteStringsKt.toByteStringUtf8(s);
        return this.adRepository.getAd(byteString0, d0);
    }
}

