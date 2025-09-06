package com.facebook.fresco.middleware;

import java.util.Map;
import y4.l;
import y4.m;

public interface a {
    public static final class com.facebook.fresco.middleware.a.a {
        static final com.facebook.fresco.middleware.a.a a = null;
        @l
        public static final String b = "id";
        @l
        public static final String c = "encoded_size";
        @l
        public static final String d = "encoded_width";
        @l
        public static final String e = "encoded_height";
        @l
        public static final String f = "uri_source";
        @l
        public static final String g = "image_format";
        @l
        public static final String h = "bitmap_config";
        @l
        public static final String i = "is_rounded";
        @l
        public static final String j = "non_fatal_decode_error";
        @l
        public static final String k = "original_url";
        @l
        public static final String l = "modified_url";
        @l
        public static final String m = "image_source_type";
        @l
        public static final String n = "origin";
        @l
        public static final String o = "origin_sub";
        @l
        public static final String p = "multiplex_bmp_cnt";
        @l
        public static final String q = "multiplex_enc_cnt";
        @l
        public static final String r = "last_scan_num";
        @l
        public static final String s = "image_source_extras";
        @l
        public static final String t = "image_color_space";

        static {
            com.facebook.fresco.middleware.a.a.a = new com.facebook.fresco.middleware.a.a();
        }
    }

    public static final class b {
        public static Object a(a a0, String s, Object object0, int v, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExtra");
            }
            if((v & 2) != 0) {
                object0 = null;
            }
            return a0.j(s, object0);
        }
    }

    @l
    public static final com.facebook.fresco.middleware.a.a W1 = null;
    @l
    public static final String X1 = "id";
    @l
    public static final String Y1 = "encoded_size";
    @l
    public static final String Z1 = "encoded_width";
    @l
    public static final String a2 = "encoded_height";
    @l
    public static final String b2 = "uri_source";
    @l
    public static final String c2 = "image_format";
    @l
    public static final String d2 = "bitmap_config";
    @l
    public static final String e2 = "is_rounded";
    @l
    public static final String f2 = "non_fatal_decode_error";
    @l
    public static final String g2 = "original_url";
    @l
    public static final String h2 = "modified_url";
    @l
    public static final String i2 = "image_source_type";
    @l
    public static final String j2 = "origin";
    @l
    public static final String k2 = "origin_sub";
    @l
    public static final String l2 = "multiplex_bmp_cnt";
    @l
    public static final String m2 = "multiplex_enc_cnt";
    @l
    public static final String n2 = "last_scan_num";
    @l
    public static final String o2 = "image_source_extras";
    @l
    public static final String p2 = "image_color_space";

    static {
        a.W1 = com.facebook.fresco.middleware.a.a.a;
    }

    void f(@l String arg1, @m Object arg2);

    @l
    Map getExtras();

    @m
    Object j(@l String arg1, @m Object arg2);

    void k(@l Map arg1);

    @m
    Object v(@l String arg1);
}

