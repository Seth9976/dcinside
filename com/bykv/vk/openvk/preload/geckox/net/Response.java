package com.bykv.vk.openvk.preload.geckox.net;

import java.util.Map;

public class Response {
    public final String body;
    public final int code;
    public final Map headers;
    public final String msg;

    public Response(Map map0, String s, int v, String s1) {
        this.headers = map0;
        this.body = s;
        this.code = v;
        this.msg = s1;
    }
}

