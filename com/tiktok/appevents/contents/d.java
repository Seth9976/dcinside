package com.tiktok.appevents.contents;

import android.text.TextUtils;
import org.json.JSONObject;

public class d {
    public static class a {
        private float a;
        private int b;
        private String c;
        private String d;
        private String e;
        private String f;
        private boolean g;
        private boolean h;

        public a() {
            this.a = NaNf;
            this.b = -1;
            this.g = false;
            this.h = false;
        }

        public d a() {
            d d0 = new d();
            d0.a = this.a;
            d0.g = this.g;
            d0.b = this.b;
            d0.h = this.h;
            d0.c = this.c;
            d0.d = this.d;
            d0.e = this.e;
            d0.f = this.f;
            return d0;
        }

        public a b(String s) {
            this.f = s;
            return this;
        }

        public a c(String s) {
            this.d = s;
            return this;
        }

        public a d(String s) {
            this.c = s;
            return this;
        }

        public a e(String s) {
            this.e = s;
            return this;
        }

        public a f(float f) {
            this.a = f;
            this.g = true;
            return this;
        }

        public a g(int v) {
            this.b = v;
            this.h = true;
            return this;
        }
    }

    private float a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;

    public d() {
        this.g = false;
        this.h = false;
    }

    public static a i() {
        return new a();
    }

    public JSONObject j() {
        Throwable throwable1;
        JSONObject jSONObject0;
        try {
            jSONObject0 = new JSONObject();
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            throwable1.printStackTrace();
            return null;
        }
        try {
            if(this.h) {
                jSONObject0.put("quantity", this.b);
            }
            if(!TextUtils.isEmpty(this.c)) {
                jSONObject0.put("content_id", this.c);
            }
            if(!TextUtils.isEmpty(this.d)) {
                jSONObject0.put("content_category", this.d);
            }
            if(!TextUtils.isEmpty(this.e)) {
                jSONObject0.put("content_name", this.e);
            }
            if(!TextUtils.isEmpty(this.f)) {
                jSONObject0.put("brand", this.f);
            }
            if(this.g) {
                float f = this.a;
                if(f != NaNf) {
                    jSONObject0.put("price", Double.parseDouble(String.valueOf(f)));
                    return jSONObject0;
                }
            }
            return jSONObject0;
        }
        catch(Throwable throwable1) {
        }
        throwable1.printStackTrace();
        return jSONObject0;
    }
}

