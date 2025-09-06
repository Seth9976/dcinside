package com.coupang.ads.token;

import java.util.concurrent.ThreadFactory;

public final class d implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return com.coupang.ads.token.AdTokenRequester.innerExecutor.2.invoke$lambda-0(runnable0);
    }
}

