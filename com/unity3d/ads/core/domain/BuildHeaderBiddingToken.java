package com.unity3d.ads.core.domain;

import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface BuildHeaderBiddingToken {
    public static final class DefaultImpls {
        public static Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken0, boolean z, d d0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if((v & 1) != 0) {
                z = false;
            }
            return buildHeaderBiddingToken0.invoke(z, d0);
        }
    }

    @m
    Object invoke(boolean arg1, @l d arg2);
}

