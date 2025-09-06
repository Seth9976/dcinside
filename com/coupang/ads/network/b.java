package com.coupang.ads.network;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class b {
    public static RequestBody a(String s) {
        return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), s);
    }
}

