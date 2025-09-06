package com.apm.insight.l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    static final class a extends Enum {
        public static final enum a a;
        public static final enum a b;
        public static final enum a c;
        public static final enum a d;
        public static final enum a e;
        public static final enum a f;

        static {
            a.a = new a("EMPTY_ARRAY", 0);
            a.b = new a("NONEMPTY_ARRAY", 1);
            a.c = new a("EMPTY_OBJECT", 2);
            a.d = new a("DANGLING_KEY", 3);
            a.e = new a("NONEMPTY_OBJECT", 4);
            a.f = new a("NULL", 5);
        }

        private a(String s, int v) {
            super(s, v);
        }
    }

    private Writer a;
    private final List b;

    private h(Writer writer0) {
        this.b = new ArrayList();
        this.a = writer0;
    }

    private h a() throws JSONException, IOException {
        return this.a(a.a, "[");
    }

    private h a(a h$a0, String s) throws JSONException, IOException {
        this.f();
        this.b.add(h$a0);
        this.a.write(s);
        return this;
    }

    private h a(Object object0) throws JSONException, IOException {
        if(object0 instanceof JSONArray) {
            this.a(((JSONArray)object0));
            return this;
        }
        if(object0 instanceof JSONObject) {
            this.a(((JSONObject)object0));
            return this;
        }
        this.f();
        if(object0 != null && object0 != JSONObject.NULL) {
            if(object0 instanceof Boolean) {
                this.a.write(String.valueOf(object0));
                return this;
            }
            if(object0 instanceof Number) {
                this.a.write(JSONObject.numberToString(((Number)object0)));
                return this;
            }
            this.b(object0.toString());
            return this;
        }
        this.a.write("null");
        return this;
    }

    private h a(String s) throws JSONException, IOException {
        this.e();
        this.b.remove(this.b.size() - 1);
        this.a.write(s);
        return this;
    }

    private void a(a h$a0) {
        this.b.set(this.b.size() - 1, h$a0);
    }

    private void a(JSONArray jSONArray0) throws JSONException, IOException {
        this.a();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            this.a(jSONArray0.get(v));
        }
        this.b();
    }

    public static void a(JSONArray jSONArray0, Writer writer0) throws Throwable {
        new h(writer0).a(jSONArray0);
        writer0.flush();
    }

    private void a(JSONObject jSONObject0) throws JSONException, IOException {
        this.c();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = jSONObject0.get(((String)object0));
            this.c(((String)object0)).a(object1);
        }
        this.d();
    }

    public static void a(JSONObject jSONObject0, Writer writer0) throws Throwable {
        new h(writer0).a(jSONObject0);
        writer0.flush();
    }

    private h b() throws JSONException, IOException {
        return this.a("]");
    }

    private void b(String s) throws IOException {
        this.a.write("\"");
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            switch(v2) {
                case 8: {
                    this.a.write("\\b");
                    break;
                }
                case 9: {
                    this.a.write("\\t");
                    break;
                }
                case 10: {
                    this.a.write("\\n");
                    break;
                }
                case 12: {
                    this.a.write("\\f");
                    break;
                }
                case 13: {
                    this.a.write("\\r");
                    break;
                }
                case 34: 
                case 0x2F: 
                case 92: {
                    this.a.write(92);
                    this.a.write(v2);
                    break;
                }
                default: {
                    if(v2 <= 0x1F) {
                        this.a.write(String.format("\\u%04x", v2));
                    }
                    else {
                        this.a.write(v2);
                    }
                }
            }
        }
        this.a.write("\"");
    }

    private h c() throws JSONException, IOException {
        return this.a(a.c, "{");
    }

    private h c(String s) throws JSONException, IOException {
        a h$a0 = this.e();
        if(h$a0 == a.e) {
            this.a.write(44);
        }
        else if(h$a0 == a.c) {
        }
        else {
            throw new JSONException("Nesting problem");
        }
        this.a(a.d);
        this.b(s);
        return this;
    }

    private h d() throws JSONException, IOException {
        return this.a("}");
    }

    private a e() throws JSONException {
        return (a)this.b.get(this.b.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if(this.b.isEmpty()) {
            return;
        }
        a h$a0 = this.e();
        if(h$a0 == a.a) {
            this.a(a.b);
            return;
        }
        if(h$a0 == a.b) {
            this.a.write(44);
            return;
        }
        if(h$a0 == a.d) {
            this.a.write(":");
            this.a(a.e);
            return;
        }
        if(h$a0 != a.f) {
            throw new JSONException("Nesting problem");
        }
    }

    @Override
    public final String toString() {
        return "";
    }
}

