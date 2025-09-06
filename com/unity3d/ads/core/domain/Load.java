package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import gatewayprotocol.v1.AdRequestOuterClass.BannerSize;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface Load {
    public static final class DefaultImpls {
        public static Object invoke$default(Load load0, Context context0, String s, ByteString byteString0, HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0, BannerSize adRequestOuterClass$BannerSize0, UnityAdsLoadOptions unityAdsLoadOptions0, d d0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            return (v & 16) == 0 ? load0.invoke(context0, s, byteString0, headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0, adRequestOuterClass$BannerSize0, unityAdsLoadOptions0, d0) : load0.invoke(context0, s, byteString0, headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0, null, unityAdsLoadOptions0, d0);
        }
    }

    @m
    Object invoke(@l Context arg1, @l String arg2, @l ByteString arg3, @l HeaderBiddingAdMarkup arg4, @m BannerSize arg5, @l UnityAdsLoadOptions arg6, @l d arg7);
}

