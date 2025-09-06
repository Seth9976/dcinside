package com.vungle.ads.internal.network.converters;

import okhttp3.ResponseBody;
import y4.m;

public final class b implements a {
    @Override  // com.vungle.ads.internal.network.converters.a
    public Object convert(Object object0) {
        return this.convert(((ResponseBody)object0));
    }

    @m
    public Void convert(@m ResponseBody responseBody0) {
        if(responseBody0 != null) {
            responseBody0.close();
        }
        return null;
    }
}

