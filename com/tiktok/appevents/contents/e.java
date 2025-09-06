package com.tiktok.appevents.contents;

import N2.b;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends b {
    public static class a extends N2.b.a {
        a(String s, String s1) {
            super(s, s1);
        }

        @Override  // N2.b$a
        public b g() {
            return this.i();
        }

        private void h(String s, Object object0) {
            try {
                this.a.put(s, object0);
            }
            catch(Throwable unused_ex) {
            }
        }

        public e i() {
            return new e(this.b, this.a, this.c);
        }

        public a j(String s) {
            if(!TextUtils.isEmpty(s)) {
                this.e("content_id", s);
            }
            return this;
        }

        public a k(String s) {
            if(!TextUtils.isEmpty(s)) {
                this.e("content_type", s);
            }
            return this;
        }

        public a l(d[] arr_d) {
            if(arr_d != null) {
                JSONArray jSONArray0 = new JSONArray();
                for(int v = 0; v < arr_d.length; ++v) {
                    d d0 = arr_d[v];
                    if(d0 != null) {
                        jSONArray0.put(d0.j());
                    }
                }
                this.d("contents", jSONArray0);
            }
            return this;
        }

        public a m(com.tiktok.appevents.contents.f.b f$b0) {
            if(f$b0 != null) {
                this.d("currency", f$b0);
            }
            return this;
        }

        public a n(String s) {
            if(!TextUtils.isEmpty(s)) {
                this.e("description", s);
            }
            return this;
        }

        public a o(double f) {
            this.h("value", f);
            return this;
        }
    }

    e(String s, JSONObject jSONObject0, String s1) {
        super(s, jSONObject0, s1);
    }
}

