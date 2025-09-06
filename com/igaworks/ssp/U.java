package com.igaworks.ssp;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONObject;

public class u {
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private boolean F;
    private float G;
    private String H;
    private final int I;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public u() {
        this.a = "app_key";
        this.b = "placement_id";
        this.c = "adid";
        this.d = "android_opt_out_enabled";
        this.e = "platform";
        this.f = "network";
        this.g = "carrier";
        this.h = "model";
        this.i = "manufacturer";
        this.j = "os_version";
        this.k = "sdk_version";
        this.l = "width";
        this.m = "height";
        this.n = "orientation";
        this.o = "country";
        this.p = "language";
        this.q = "age";
        this.r = "gender";
        this.s = "utc_offset";
        this.t = "uid_token";
        this.u = "";
        this.v = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.z = "";
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "3.8.2a";
        this.E = "";
        this.F = false;
        this.H = "";
        this.I = 3600000;
    }

    private Display a(Context context0) {
        return ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
    }

    public String a() [...] // 潜在的解密器

    public JSONObject a(Context context0, String s, String s1) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(s1 != null && s1.length() > 0) {
                jSONObject0.put("app_key", s1);
            }
            else {
                if(this.w == null || this.w.length() <= 0) {
                    b.c(Thread.currentThread(), "AppKey is null");
                    return null;
                }
                jSONObject0.put("app_key", this.w);
            }
            if(s != null && s.length() != 0) {
                jSONObject0.put("placement_id", s);
            }
            if(this.y == null || this.y.length() <= 0) {
                jSONObject0.put("adid", "00000000-0000-0000-0000-000000000000");
            }
            else {
                jSONObject0.put("adid", this.y);
            }
            jSONObject0.put("android_opt_out_enabled", this.F);
            jSONObject0.put("platform", "android");
            try {
                this.E = e0.a(context0);
            }
            catch(Exception unused_ex) {
            }
            jSONObject0.put("network", this.E);
            try {
                TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
                if(telephonyManager0 != null) {
                    this.z = telephonyManager0.getNetworkOperatorName();
                }
                if(this.z == null || this.z.equalsIgnoreCase("")) {
                    this.z = "unknown";
                }
            }
            catch(Exception unused_ex) {
            }
            String s2 = URLEncoder.encode(this.z);
            this.z = s2;
            jSONObject0.put("carrier", s2);
            String s3 = Build.MODEL;
            if(s3 != null && !s3.equalsIgnoreCase("")) {
                this.A = s3;
            }
            jSONObject0.put("model", this.A);
            String s4 = Build.MANUFACTURER;
            if(s4 != null && !s4.equalsIgnoreCase("")) {
                this.B = s4;
            }
            jSONObject0.put("manufacturer", this.B);
            String s5 = Build.VERSION.RELEASE;
            if(s5 != null && !s5.equalsIgnoreCase("")) {
                this.C = s5;
            }
            jSONObject0.put("os_version", this.C);
            jSONObject0.put("sdk_version", this.D);
            Display display0 = this.a(context0);
            jSONObject0.put("width", display0.getWidth());
            jSONObject0.put("height", display0.getHeight());
            try {
                Configuration configuration0 = context0.getResources().getConfiguration();
                if(configuration0 == null || configuration0.orientation != 1) {
                    jSONObject0.put("orientation", "landscape");
                }
                else {
                    jSONObject0.put("orientation", "portrait");
                }
            }
            catch(Exception unused_ex) {
                switch(display0.getRotation()) {
                    case 0: 
                    case 2: {
                        jSONObject0.put("orientation", "portrait");
                        break;
                    }
                    default: {
                        jSONObject0.put("orientation", "landscape");
                    }
                }
            }
            Locale locale0 = Locale.getDefault();
            jSONObject0.put("country", locale0.getCountry());
            jSONObject0.put("language", locale0.getLanguage());
            if(this.u != null && this.u.length() > 0) {
                jSONObject0.put("age", this.u);
            }
            if(this.v != null && this.v.length() > 0) {
                jSONObject0.put("gender", this.v);
            }
            jSONObject0.put("utc_offset", ((double)this.c()));
            jSONObject0.put("uid_token", this.H);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public void a(String s) {
        this.y = s;
    }

    public void a(boolean z) {
        this.F = z;
    }

    public String b() [...] // 潜在的解密器

    public void b(String s) {
        this.w = s;
    }

    private float c() {
        try {
            this.G = ((float)Calendar.getInstance().getTimeZone().getRawOffset()) / 3600000.0f;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return this.G;
    }

    public void c(String s) {
        this.x = s;
    }

    public void d(String s) {
        this.H = s;
    }
}

