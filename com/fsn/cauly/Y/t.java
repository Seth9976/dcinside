package com.fsn.cauly.Y;

import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.fsn.cauly.blackdragoncore.c;
import com.fsn.cauly.blackdragoncore.contents.f;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class t extends q implements a, com.fsn.cauly.Y.s0.a {
    j0 e;
    ArrayList f;
    HashMap g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    int m;
    g n;
    int o;
    String p;
    int q;
    boolean r;

    public t(i0 i00) {
        super(i00);
        this.h = 0;
        this.i = 1;
        this.j = 2;
        this.k = 3;
        this.l = 4;
        this.m = 0;
        this.r = false;
        com.fsn.cauly.blackdragoncore.utils.g.a(b.e, "Created Custom container");
        HashMap hashMap0 = i00.C;
        this.g = new HashMap();
        if(hashMap0 != null && hashMap0.containsKey("ret_data")) {
            this.r = ((Boolean)hashMap0.get("ret_data")).booleanValue();
        }
        try {
            if(((Activity)i00.b).findViewById(((int)(((Integer)hashMap0.get("main_image_id"))))) instanceof WebView) {
                i00.N = "all";
            }
            else {
                i00.N = "img";
                com.fsn.cauly.blackdragoncore.utils.g.a(b.c, "Recommand use Webview");
            }
        }
        catch(Exception exception0) {
            com.fsn.cauly.blackdragoncore.utils.g.a(b.c, "" + exception0.getMessage());
        }
        if(hashMap0 != null && hashMap0.containsKey("custom_type")) {
            int v = (int)(((Integer)hashMap0.get("custom_type")));
            this.q = v;
            if(v <= 1) {
                i00.a = com.fsn.cauly.Y.i0.a.b;
                this.s();
                return;
            }
            if(v <= 3) {
                i00.a = com.fsn.cauly.Y.i0.a.c;
                this.t();
                return;
            }
            i00.a = com.fsn.cauly.Y.i0.a.a;
            this.r();
        }
    }

    @Override  // com.fsn.cauly.Y.n0$a
    public void a(n0 n00, boolean z) {
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        if(s00.getErrorCode() == 0) {
            if(s00 instanceof g) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(((g)s00).j());
                arrayList0.add(c.a(this.e, ""));
                this.a.a(0x70, this.e.o, arrayList0);
                return;
            }
            int v = this.q;
            if(v >= 4) {
                this.l(s00);
                return;
            }
            if(v >= 2) {
                this.p(s00);
                return;
            }
            this.n(s00);
            return;
        }
        this.a.a(101, s00.getErrorCode(), ((u0)s00).d());
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(com.fsn.cauly.blackdragoncore.contents.c c0, j0 j00) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void a(com.fsn.cauly.blackdragoncore.contents.c c0, com.fsn.cauly.blackdragoncore.contents.c c1) {
    }

    public void a(Object object0) {
        j0 j00;
        if(this.q <= 1) {
            j00 = this.e;
        }
        else {
            j00 = !this.r || this.a == null || object0 == null || !(object0 instanceof String) ? null : this.h(((String)object0));
        }
        this.o(j00);
    }

    @Override  // com.fsn.cauly.Y.q
    protected void b(com.fsn.cauly.blackdragoncore.contents.c c0, MotionEvent motionEvent0) {
    }

    public void b(Object object0) {
        if(this.q <= 1) {
            if(this.e != null && this.a != null && !this.g.containsKey(this.e.a)) {
                this.g.put(this.e.a, Boolean.TRUE);
                o.a(this.a, this.e, null, null, true);
            }
        }
        else if(this.r && this.a != null && object0 != null && object0 instanceof String) {
            j0 j00 = this.h(((String)object0));
            if(j00 != null && !this.g.containsKey(((String)object0))) {
                this.g.put(((String)object0), Boolean.TRUE);
                o.a(this.a, j00, null, true);
            }
        }
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void c() {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void c(com.fsn.cauly.blackdragoncore.contents.c c0) {
    }

    @Override  // com.fsn.cauly.blackdragoncore.contents.c$a
    public void e() {
    }

    @Override  // com.fsn.cauly.Y.q
    protected void e(com.fsn.cauly.blackdragoncore.contents.c c0) {
    }

    @Override  // com.fsn.cauly.Y.q
    protected Point f() {
        return d.a(this.a, com.fsn.cauly.Y.i0.a.a);
    }

    @Override  // com.fsn.cauly.Y.q
    public void g() {
        com.fsn.cauly.blackdragoncore.utils.g.a(b.e, "Stopped Custom container");
        g g0 = this.n;
        if(g0 != null) {
            g0.cancel();
            if(this.n.j() != null && !this.n.j().isRecycled()) {
                this.n.j().recycle();
            }
        }
        super.g();
    }

    private j0 h(String s) {
        for(Object object0: this.f) {
            j0 j00 = (j0)object0;
            if(s.equalsIgnoreCase(j00.a)) {
                return j00;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private JSONObject i(ArrayList arrayList0, String s) {
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: arrayList0) {
                j0 j00 = (j0)object0;
                if(this.r) {
                    String s1 = j00.g;
                    if(!TextUtils.isEmpty(s1) && (s1.equals("img") || (s1.equals("n/a") || s1.equals("html5") || s1.equals("neo_html5")))) {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("id", "" + j00.a);
                        if(s1.contains("html5") || s1.contains("neo_html5")) {
                            jSONObject0.put("image", "" + j00.h);
                            jSONObject0.put("image_content_type", "html");
                        }
                        else {
                            jSONObject0.put("image", "" + j00.i);
                            jSONObject0.put("image_content_type", "img");
                        }
                        jSONObject0.put("image_l", j00.c0);
                        jSONObject0.put("image_r", j00.d0);
                        jSONObject0.put("title", "" + j00.c);
                        jSONObject0.put("subtitle", "" + j00.K);
                        jSONObject0.put("description", "" + j00.d);
                        jSONObject0.put("icon", "" + j00.i);
                        jSONObject0.put("ad_charge_type", "" + j00.W);
                        jSONObject0.put("linkUrl", "" + j00.e);
                        jSONObject0.put("price", "" + j00.a0);
                        jSONObject0.put("earntype", "" + j00.b0);
                        jSONObject0.put("bg_color", j00.e0);
                        jSONObject0.put("optout_url", "" + j00.f0);
                        jSONObject0.put("optout_img_url", j00.g0);
                        jSONObject0.put("optout", j00.n0);
                        jSONArray0.put(jSONObject0);
                    }
                }
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("ads", jSONArray0);
            return jSONObject1;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    int j(j0 j00) {
        int v = j00.o;
        boolean z = "0".equals(j00.a);
        int v1 = 100;
        if(z && j00.o == 0) {
            v = 100;
        }
        if(!z || j00.o != 400) {
            v1 = v;
        }
        return j00.o == 400 || this.a.a != com.fsn.cauly.Y.i0.a.b || !z ? v1 : 200;
    }

    private JSONObject k(ArrayList arrayList0, String s) {
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: arrayList0) {
                j0 j00 = (j0)object0;
                if(this.r) {
                    String s1 = j00.g;
                    if(!TextUtils.isEmpty(s1) && (s1.equals("img") || (s1.equals("n/a") || s1.equals("html5") || s1.equals("neo_html5")))) {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("id", "" + j00.a);
                        if(s1.contains("html5") || s1.contains("neo_html5")) {
                            jSONObject0.put("image_content_type", "html");
                        }
                        else {
                            jSONObject0.put("image_content_type", "img");
                        }
                        jSONObject0.put("image_l", j00.c0);
                        jSONObject0.put("image_r", j00.d0);
                        jSONObject0.put("image", "" + j00.h);
                        jSONObject0.put("image_type", "" + j00.h);
                        jSONObject0.put("title", "" + j00.c);
                        jSONObject0.put("subtitle", "" + j00.K);
                        jSONObject0.put("description", "" + j00.d);
                        jSONObject0.put("icon", "" + j00.i);
                        jSONObject0.put("ad_charge_type", "" + j00.W);
                        jSONObject0.put("linkUrl", "" + j00.e);
                        jSONObject0.put("price", "" + j00.a0);
                        jSONObject0.put("earntype", "" + j00.b0);
                        jSONObject0.put("bg_color", j00.e0);
                        jSONObject0.put("optout_url", "" + j00.f0);
                        jSONObject0.put("optout_img_url", j00.g0);
                        jSONObject0.put("optout", j00.n0);
                        jSONArray0.put(jSONObject0);
                    }
                }
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("ads", jSONArray0);
            jSONObject1.put("custom_params", "" + s);
            return jSONObject1;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    private void l(s0 s00) {
        this.f = ((com.fsn.cauly.Y.c)s00).j();
        int v = s00.getErrorCode();
        this.o = v;
        if(v != 0) {
            this.p = ((u0)s00).d();
            this.a.a(101, this.o, this.p);
            return;
        }
        if(this.f != null && this.f.size() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.f) {
                j0 j00 = (j0)object0;
                if(com.fsn.cauly.blackdragoncore.d.a().b(this.a, j00)) {
                    arrayList0.add(j00);
                }
            }
            if(arrayList0.size() > 0 && this.r) {
                JSONObject jSONObject0 = this.i(arrayList0, ((com.fsn.cauly.Y.c)s00).i());
                if(jSONObject0 != null) {
                    this.a.a(0x70, ((com.fsn.cauly.Y.c)s00).getErrorCode(), jSONObject0.toString());
                    return;
                }
            }
        }
        this.a.a(101, 200, "No filled AD");
    }

    String m(j0 j00) {
        if(j00 == null) {
            return "";
        }
        int v = j00.o;
        if(v != -200) {
            switch(v) {
                case -100: {
                    return "SDK error";
                }
                case 0: 
                case 100: {
                    return null;
                }
                case 200: {
                    return "No filled AD";
                }
                case 400: {
                    return "Invalid APPCODE";
                }
                case 500: {
                    return "Server error";
                }
                default: {
                    return "Cauly error";
                }
            }
        }
        return "Request Failed";
    }

    private void n(s0 s00) {
        j0 j00 = ((com.fsn.cauly.Y.b)s00).j();
        this.e = j00;
        if(j00 != null) {
            int v = s00.getErrorCode();
            this.o = v;
            if(v != 0) {
                this.p = ((u0)s00).d();
                this.a.a(101, this.o, this.p);
                return;
            }
            if(!com.fsn.cauly.blackdragoncore.d.a().b(this.a, this.e)) {
                this.s();
                return;
            }
            this.e.o = this.j(this.e);
            if("img".equals(this.e.g) && !TextUtils.isEmpty(this.e.h)) {
                g g0 = new g(this.a.b, this.e.h, null);
                this.n = g0;
                g0.a(this);
                this.n.execute();
                return;
            }
            this.a.a(101, 200, "No filled AD");
            return;
        }
        this.a.a(101, s00.getErrorCode(), this.m(this.e));
    }

    void o(j0 j00) {
        String s;
        if(this.a != null && j00 != null) {
            if(j00.l != null && j00.l.equals("app")) {
                r.a(this.a, j00, 0);
                return;
            }
            Matcher matcher0 = Pattern.compile("cauly_action_param=open_browser").matcher(j00.e);
            if(Pattern.compile("cauly_action_param=open_youtube").matcher(j00.e).find()) {
                f.b(((Activity)this.a.b), j00.e, null);
            }
            else if(matcher0.find()) {
                f.a(this.a.b, j00, j00.e, null, this.a.j);
            }
            else {
                new o0(this.a.b).a(this.a, j00, 0);
            }
            try {
                s = URLEncoder.encode(j00.e, "UTF-8");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                unsupportedEncodingException0.printStackTrace();
                s = "";
            }
            l.a(this.a, j00, null, "click_action_param1=" + s);
        }
    }

    private void p(s0 s00) {
        this.f = ((com.fsn.cauly.Y.c)s00).j();
        int v = s00.getErrorCode();
        this.o = v;
        if(v != 0) {
            this.p = ((u0)s00).d();
            this.a.a(101, this.o, this.p);
            return;
        }
        if(this.f != null && this.f.size() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.f) {
                j0 j00 = (j0)object0;
                if(com.fsn.cauly.blackdragoncore.d.a().b(this.a, j00)) {
                    if(!this.a.K) {
                    }
                    else if(TextUtils.isEmpty(j00.m0) || "none".equalsIgnoreCase(j00.m0)) {
                        continue;
                    }
                    arrayList0.add(j00);
                }
            }
            if(arrayList0.size() > 0) {
                if(!this.r) {
                    this.a.a(0x70, ((com.fsn.cauly.Y.c)s00).getErrorCode(), arrayList0);
                    return;
                }
                JSONObject jSONObject0 = this.k(arrayList0, ((com.fsn.cauly.Y.c)s00).i());
                if(jSONObject0 != null) {
                    this.a.a(0x70, ((com.fsn.cauly.Y.c)s00).getErrorCode(), jSONObject0.toString());
                    return;
                }
            }
        }
        this.a.a(101, 200, "No filled AD");
    }

    boolean q() {
        int v;
        l0 l00 = this.a.r;
        if(l00 == null) {
            v = 10;
        }
        else {
            v = l00.x;
            if(v <= 0) {
                v = 10;
            }
        }
        if(this.m >= v) {
            this.m = 0;
            return true;
        }
        return false;
    }

    private void r() {
        if(this.q()) {
            this.a.a(101, 200, "No filled AD");
            return;
        }
        Point point0 = d.a(this.a, com.fsn.cauly.Y.i0.a.a);
        int v = this.m;
        this.m = v + 1;
        com.fsn.cauly.Y.c c0 = new com.fsn.cauly.Y.c(this.a, point0.x, point0.y, false, false, v, this.r);
        c0.a(this);
        c0.execute();
    }

    private void s() {
        if(this.q()) {
            this.a.a(101, 200, "No filled AD");
            return;
        }
        Point point0 = d.a(this.a, com.fsn.cauly.Y.i0.a.b);
        int v = this.m;
        this.m = v + 1;
        com.fsn.cauly.Y.b b0 = new com.fsn.cauly.Y.b(this.a, (this.q == 0 ? point0.x : point0.y), (this.q == 0 ? point0.y : point0.x), false, false, v);
        b0.a(this);
        b0.execute();
    }

    private void t() {
        if(this.q()) {
            this.a.a(101, 200, "No filled AD");
            return;
        }
        int v = this.m;
        this.m = v + 1;
        com.fsn.cauly.Y.c c0 = new com.fsn.cauly.Y.c(this.a, (this.q == 3 ? 1 : 0), (this.q == 3 ? 0 : 1), false, false, v, this.r);
        c0.a(this);
        c0.execute();
    }
}

