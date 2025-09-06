package com.kakao.adfit.a;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f {
    private final ArrayList a;
    private final ArrayList b;
    private final ArrayList c;
    private final ArrayList d;
    private final ArrayList e;

    public f() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public f(JSONArray jSONArray0) {
        L.p(jSONArray0, "events");
        super();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v1);
            if(jSONObject0 != null) {
                String s = jSONObject0.optString("type");
                if(s != null) {
                    String s1 = jSONObject0.optString("url");
                    if(s1 != null) {
                        Locale locale0 = Locale.ENGLISH;
                        L.o(locale0, "ENGLISH");
                        String s2 = s.toLowerCase(locale0);
                        L.o(s2, "this as java.lang.String).toLowerCase(locale)");
                        switch(s2) {
                            case "click": {
                                this.d.add(s1);
                                break;
                            }
                            case "expose": {
                                this.c.add(s1);
                                break;
                            }
                            case "hide": {
                                this.e.add(s1);
                                break;
                            }
                            case "rendered": {
                                this.a.add(s1);
                                break;
                            }
                            case "viewable": {
                                this.b.add(s1);
                            }
                        }
                    }
                }
            }
        }
    }

    public final ArrayList a() {
        return this.d;
    }

    public final ArrayList b() {
        return this.e;
    }

    public final ArrayList c() {
        return this.a;
    }

    public final ArrayList d() {
        return this.b;
    }
}

