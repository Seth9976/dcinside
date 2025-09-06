package com.tiktok.appevents;

import com.tiktok.b;
import com.tiktok.util.e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

class t {
    private final p a;
    private final e b;
    private static final String c = "com.tiktok.appevents.t";
    private static final SimpleDateFormat d;
    private static final SimpleDateFormat e;

    static {
        t.d = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        t.e = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault());
    }

    public t(p p0) {
        this.a = p0;
        this.b = new e(b.l());
    }

    private boolean a(Date date0, Date date1) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTime(date0);
        calendar0.add(5, 1);
        Date date2 = calendar0.getTime();
        return t.d.format(date2).equals(t.d.format(date1));
    }

    // 去混淆评级： 低(20)
    Boolean b(com.tiktok.util.d.b d$b0) {
        return !this.a.b || this.a.c.contains(d$b0) ? false : true;
    }

    void c() {
        if(this.b.a("com.tiktok.sdk.2drTime") != null) {
            return;
        }
        String s = this.b.a("com.tiktok.sdk.firstInstall");
        if(s == null) {
            return;
        }
        try {
            Date date0 = t.e.parse(s);
            Date date1 = new Date();
            com.tiktok.util.d.b d$b0 = com.tiktok.util.d.b.c;
            if(this.b(d$b0).booleanValue() && this.a(date0, date1) && p.r) {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.putOpt("type", "auto");
                    this.a.O(d$b0.a, jSONObject0);
                }
                catch(JSONException jSONException0) {
                    jSONException0.printStackTrace();
                }
                String s1 = t.e.format(date1);
                this.b.b("com.tiktok.sdk.2drTime", s1);
            }
        }
        catch(ParseException unused_ex) {
        }
    }

    private void d() {
        if(this.b.a("com.tiktok.sdk.firstInstall") != null) {
            return;
        }
        Date date0 = new Date();
        HashMap hashMap0 = new HashMap();
        hashMap0.put("com.tiktok.sdk.firstInstall", t.e.format(date0));
        com.tiktok.util.d.b d$b0 = com.tiktok.util.d.b.b;
        if(this.b(d$b0).booleanValue()) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.putOpt("type", "auto");
                this.a.O(d$b0.a, jSONObject0);
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
        }
        this.b.c(hashMap0);
    }

    private void e() {
        com.tiktok.util.d.b d$b0 = com.tiktok.util.d.b.d;
        if(this.b(d$b0).booleanValue()) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.putOpt("type", "auto");
                this.a.O(d$b0.a, jSONObject0);
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
            Date date0 = new Date();
            String s = t.e.format(date0);
            this.b.b("com.tiktok.sdk.lastLaunch", s);
        }
    }

    public void f() {
        this.d();
        this.c();
        this.e();
    }
}

