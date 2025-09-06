package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import gatewayprotocol.v1.AdResponseOuterClass.AdResponse;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface HandleGatewayAdResponse {
    @m
    Object invoke(@l UnityAdsLoadOptions arg1, @l ByteString arg2, @l AdResponse arg3, @l Context arg4, @l String arg5, @l DiagnosticAdType arg6, boolean arg7, @l d arg8);
}

