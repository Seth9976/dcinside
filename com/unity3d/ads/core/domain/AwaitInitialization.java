package com.unity3d.ads.core.domain;

import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface AwaitInitialization {
    public static final class DefaultImpls {
        public static Object invoke$default(AwaitInitialization awaitInitialization0, long v, d d0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if((v1 & 1) != 0) {
                v = 0x7FFFFFFFFFFFFFFFL;
            }
            return awaitInitialization0.invoke(v, d0);
        }
    }

    @m
    Object invoke(long arg1, @l d arg2);
}

