package com.fsn.cauly.Y;

import android.content.Context;
import android.text.TextUtils;
import com.fsn.cauly.Logger;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.j;
import com.fsn.cauly.blackdragoncore.utils.l;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;

public class e extends u0 {
    class a implements b {
        a() {
            super();
        }

        @Override  // com.fsn.cauly.Y.d0$b
        public void a() {
        }

        @Override  // com.fsn.cauly.Y.d0$b
        public void a(String s) {
        }

        @Override  // com.fsn.cauly.Y.d0$b
        public void b() {
        }

        @Override  // com.fsn.cauly.Y.d0$b
        public void c() {
            e.w = true;
            m0.c = "3d";
            g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "3D Module Check success");
        }
    }

    l0 s;
    String t;
    Context u;
    d0 v;
    static boolean w = false;
    static b x;

    static {
        e.x = new a();
    }

    public e(Context context0, String s, String s1) {
        this.v = new d0();
        this.u = context0;
        this.b(3);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("https://xconf.cauly.co.kr/caulyXconf?");
        stringBuilder0.append("sdk_type=3d-na");
        stringBuilder0.append("&code=" + s);
        stringBuilder0.append("&model=" + m0.a());
        stringBuilder0.append("&sdk_version=3.5.30");
        stringBuilder0.append("&target_sdk_version=" + m0.k(context0));
        stringBuilder0.append("&version=" + m0.d());
        stringBuilder0.append("&platform=Android");
        stringBuilder0.append("&scode=" + m0.i(context0));
        stringBuilder0.append("&origin_code=" + m0.h(context0));
        stringBuilder0.append("&scode_type=" + m0.j(context0));
        if(m0.n(context0)) {
            stringBuilder0.append("&gaid=" + m0.i(context0));
        }
        else {
            stringBuilder0.append("&app_set_id=" + m0.i(context0));
            stringBuilder0.append("&app_set_id_scope=" + m0.c(context0));
        }
        this.m = stringBuilder0.toString();
        this.a(s1);
        this.a(true);
        this.v.c();
    }

    @Override  // com.fsn.cauly.Y.u0
    protected void a(File file0) {
        this.j(file0);
    }

    @Override  // com.fsn.cauly.Y.u0
    public void c() {
        synchronized(e.class) {
            super.c();
        }
    }

    @Override  // com.fsn.cauly.Y.u0
    public String d() {
        return this.t;
    }

    @Override  // com.fsn.cauly.Y.u0
    protected void g() {
        if(this.s == null) {
            this.j(new File(this.k));
        }
        if(this.s != null && this.s.p) {
            this.i(this.u);
        }
    }

    public l0 i() {
        return this.s;
    }

    void i(Context context0) {
        if(e.w) {
            return;
        }
        if(!m0.b(context0)) {
            g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "no 3d device");
        }
        else if(this.s.o) {
            if(!"WIFI".equals(m0.g(context0))) {
                g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "Skip 3D Module check(No WiFi)");
                return;
            }
            try {
                if(!this.v.a(context0.getApplicationContext(), e.x)) {
                    goto label_8;
                }
                return;
            }
            catch(Throwable unused_ex) {
            }
        label_8:
            g.a(com.fsn.cauly.blackdragoncore.utils.g.b.e, "3D Module Check fail");
        }
    }

    void j(File file0) {
        l0 l00 = new l0();
        try {
            Element element0 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file0).getDocumentElement();
            boolean z = "Y".equalsIgnoreCase(l.a(element0, "ssl"));
            l00.a = z;
            j.b(this.u, "ssl", z);
            l00.b = "Y".equalsIgnoreCase(l.a(element0, "report_ack"));
            Element element1 = (Element)element0.getElementsByTagName("impress_param").item(0);
            l00.c = "Y".equalsIgnoreCase(l.a(element1, "gender"));
            l00.d = "Y".equalsIgnoreCase(l.a(element1, "age"));
            l00.e = "Y".equalsIgnoreCase(l.a(element1, "manufacturer"));
            l00.f = "Y".equalsIgnoreCase(l.a(element1, "model"));
            l00.g = "Y".equalsIgnoreCase(l.a(element1, "lang"));
            l00.h = "Y".equalsIgnoreCase(l.a(element1, "reuse_seq"));
            l00.i = "Y".equalsIgnoreCase(l.a(element1, "request_seq"));
            l00.j = "Y".equalsIgnoreCase(l.a(element1, "network"));
            l00.k = l.a(element0, "alt_cpc_ad");
            l00.l = l.a(element0, "alt_cpm_ad");
            l00.m = Integer.parseInt(l.a(element0, "refresh_period"));
            if(l.a(element0, "min_interstitial_delay") != null) {
                l00.q = Integer.parseInt(l.a(element0, "min_interstitial_delay"));
            }
            if(l.a(element0, "min_request_interval") != null) {
                l00.r = Integer.parseInt(l.a(element0, "min_request_interval"));
            }
            if(l.a(element0, "min_closead_interval") != null) {
                l00.s = Integer.parseInt(l.a(element0, "min_closead_interval"));
            }
            if(l.a(element0, "prefetch_expire") != null) {
                l00.t = Integer.parseInt(l.a(element0, "prefetch_expire"));
            }
            if(l.a(element0, "mem_adaptive_control") != null) {
                l00.u = l.a(element0, "mem_adaptive_control");
            }
            l00.n = "Y".equalsIgnoreCase(l.a(element0, "unique_app_id"));
            l00.o = "Y".equalsIgnoreCase(l.a(element0, "check_net_onload_module"));
            l00.p = "Y".equalsIgnoreCase(l.a(element0, "load_3d_module"));
            l00.v = "Y".equalsIgnoreCase(l.a(element0, "enable_cached_banner"));
            if(l.a(element0, "send_tracker_report") != null) {
                l00.z = "Y".equalsIgnoreCase(l.a(element0, "send_tracker_report"));
            }
            Context context0 = this.u;
            if(context0 != null) {
                j.b(context0, "EN_ID", "Y".equalsIgnoreCase(l.a(element0, "enable_id")));
            }
            String s = l.a(element0, "real_exposure_rate");
            if(!TextUtils.isEmpty(s)) {
                l00.y = Float.parseFloat(s);
            }
            String s1 = l.a(element0, "install_time_limit");
            if(!TextUtils.isEmpty(s1)) {
                l00.w = Integer.parseInt(s1);
            }
            String s2 = l.a(element0, "retry_limit");
            if(!TextUtils.isEmpty(s2)) {
                l00.x = Integer.parseInt(s2);
            }
            String s3 = l.a(element0, "clk_percent");
            if(!TextUtils.isEmpty(s3)) {
                j.a(this.u, "CLK_PERCENT", Integer.parseInt(s3));
            }
            String s4 = l.a(element0, "connect_timeout_limit");
            if(!TextUtils.isEmpty(s4)) {
                l00.A = Integer.parseInt(s4);
            }
            String s5 = l.a(element0, "interstitial_expire_sec");
            if(!TextUtils.isEmpty(s5)) {
                Context context1 = this.u;
                if(context1 != null) {
                    j.a(context1, "INTER_EXPIRE_SEC", Integer.parseInt(s5));
                }
            }
            String s6 = l.a(element0, "banner_expire_sec");
            if(!TextUtils.isEmpty(s6)) {
                Context context2 = this.u;
                if(context2 != null) {
                    j.a(context2, "BANNER_EXPIRE_SEC", Integer.parseInt(s6));
                }
            }
            if(l.a(element0, "browser_rotation") != null) {
                l00.C = "Y".equalsIgnoreCase(l.a(element0, "browser_rotation"));
            }
            if(l.a(element0, "priority_browsers") != null) {
                l00.B = l.a(element0, "priority_browsers");
            }
            if(l.a(element0, "banner_proportional_action") != null) {
                l00.D = "Y".equalsIgnoreCase(l.a(element0, "banner_proportional_action"));
            }
            if(l.a(element0, "hide_package_name") != null) {
                l00.E = "Y".equalsIgnoreCase(l.a(element0, "hide_package_name"));
            }
            if(l.a(element0, "enable_debug") != null) {
                boolean z1 = "Y".equalsIgnoreCase(l.a(element0, "enable_debug"));
                g.a(com.fsn.cauly.blackdragoncore.utils.g.b.values()[Logger.getLogLevel().ordinal()], z1);
            }
            this.s = l00;
            return;
        }
        catch(Throwable throwable0) {
        }
        throwable0.printStackTrace();
        this.c = -100;
        this.t = "Protocol Error";
    }
}

