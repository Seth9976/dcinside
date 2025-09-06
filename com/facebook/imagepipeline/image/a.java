package com.facebook.imagepipeline.image;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class com.facebook.imagepipeline.image.a implements e {
    private Map a;
    @h
    private o b;
    private static final Set c;

    static {
        com.facebook.imagepipeline.image.a.c = new HashSet(Arrays.asList(new String[]{"encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"}));
    }

    public com.facebook.imagepipeline.image.a() {
        this.a = new HashMap();
    }

    @Override  // com.facebook.imagepipeline.image.e
    public o D1() {
        if(this.b == null) {
            this.b = new p(this.getWidth(), this.getHeight(), this.z(), this.I(), this.getExtras());
        }
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public r I() {
        return q.d;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public boolean V3() {
        return false;
    }

    @Override  // com.facebook.fresco.middleware.a
    public void f(String s, @h Object object0) {
        if(com.facebook.imagepipeline.image.a.c.contains(s)) {
            this.a.put(s, object0);
        }
    }

    @Override  // com.facebook.fresco.middleware.a, com.facebook.imagepipeline.image.m
    public Map getExtras() {
        return this.a;
    }

    @Override  // com.facebook.fresco.middleware.a
    public Object j(String s, @h Object object0) {
        Object object1 = this.a.get(s);
        return object1 == null ? object0 : object1;
    }

    @Override  // com.facebook.fresco.middleware.a
    public void k(@h Map map0) {
        if(map0 == null) {
            return;
        }
        for(Object object0: com.facebook.imagepipeline.image.a.c) {
            String s = (String)object0;
            Object object1 = map0.get(s);
            if(object1 != null) {
                this.a.put(s, object1);
            }
        }
    }

    @Override  // com.facebook.fresco.middleware.a
    public Object v(String s) {
        return this.j(s, null);
    }
}

