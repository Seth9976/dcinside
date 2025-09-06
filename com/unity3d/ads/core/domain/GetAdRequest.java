package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdRequestOuterClass.BannerSize;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface GetAdRequest {
    public static final class DefaultImpls {
        public static Object invoke$default(GetAdRequest getAdRequest0, String s, ByteString byteString0, BannerSize adRequestOuterClass$BannerSize0, d d0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if((v & 4) != 0) {
                adRequestOuterClass$BannerSize0 = null;
            }
            return getAdRequest0.invoke(s, byteString0, adRequestOuterClass$BannerSize0, d0);
        }
    }

    @m
    Object invoke(@l String arg1, @l ByteString arg2, @m BannerSize arg3, @l d arg4);
}

