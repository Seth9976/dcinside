package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.vk.openvk.preload.geckox.utils.b;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public final class c {
    static final class a {
        private static c a;

        static {
            a.a = new c(0);
        }
    }

    private static File a;
    private static Context b;
    private static String c;
    private Map.Entry d;
    private Map.Entry e;
    private INetWork f;
    private static final Set g;

    static {
        c.g = new HashSet(Arrays.asList(new String[]{"js", "css", "html", "ico", "jpeg", "jpg", "png", "gif", "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"}));
    }

    private c() {
    }

    c(byte b) {
    }

    public static int a(ILoader iLoader0, String s) {
        if(iLoader0 == null) {
            return 0;
        }
        if(s == null) {
            return 0;
        }
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(c.b, "f36c832c8dbb162c49b46a7a6dd47fbd", c.a).a(s + "/");
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    public static c a() {
        return a.a;
    }

    public static c a(Context context0) {
        c.b = context0;
        if(c.a == null) {
            c.a = new File(c.b.getCacheDir() + "/" + "gecko");
        }
        return a.a;
    }

    private static String a(String s, JSONObject jSONObject0) {
        try {
            return jSONObject0.getJSONObject(s).getString("md5");
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    private JSONObject a(String s, String s1) {
        if(s != null && s1 != null) {
            try {
                if(this.d == null || !s.equals(this.d.getKey())) {
                    String s2 = b.a(new com.bykv.vk.openvk.preload.falconx.loader.a(c.b, "f36c832c8dbb162c49b46a7a6dd47fbd", c.a).getInputStream(s + "/manifest.json"));
                    if(TextUtils.isEmpty(s2)) {
                        return null;
                    }
                    this.d = new AbstractMap.SimpleEntry(s, new JSONObject(s2));
                }
                if(this.e == null || !s.equals(this.e.getKey())) {
                    String s3 = b.a(new com.bykv.vk.openvk.preload.falconx.loader.a(c.b, "f36c832c8dbb162c49b46a7a6dd47fbd", c.a).getInputStream(s + "/md5_url_map.json"));
                    if(TextUtils.isEmpty(s3)) {
                        return null;
                    }
                    this.e = new AbstractMap.SimpleEntry(s, new JSONObject(s3));
                }
                JSONObject jSONObject0 = (JSONObject)this.d.getValue();
                JSONObject jSONObject1 = (JSONObject)this.e.getValue();
                String s4 = c.a(s1, jSONObject1);
                if(jSONObject0.has(s4)) {
                    JSONObject jSONObject2 = jSONObject0.getJSONObject(s4);
                    this.a(jSONObject0, s4, s1);
                    return jSONObject2;
                }
                String s5 = c.b(s1);
                if(s5 == null) {
                    return null;
                }
                String s6 = c.a(s5, jSONObject1);
                if(jSONObject0.has(s6)) {
                    JSONObject jSONObject3 = jSONObject0.getJSONObject(s6);
                    this.a(jSONObject0, s6, s1);
                    return jSONObject3;
                }
                return null;
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    public static void a(ILoader iLoader0) {
        if(iLoader0 != null) {
            try {
                iLoader0.release();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void a(String s) {
        c.c = s;
    }

    private void a(JSONObject jSONObject0, String s, String s1) {
        try {
            if("once".equals(jSONObject0.getJSONObject(s).optJSONObject("cacheStrategy").optString("hitStrategy"))) {
                jSONObject0.remove(s);
                this.c(s1);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public final WebResourceResponseModel a(ILoader iLoader0, String s, String s1) {
        try {
            if(iLoader0 == null) {
                return new WebResourceResponseModel(-1, null);
            }
            if(!TextUtils.isEmpty(s1) && !s1.matches("^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js") && !s1.matches("^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)") && !s1.matches("^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel") && !s1.matches("https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js") && !s1.matches("https?:\\/\\/mc\\.yandex\\.ru\\/") && !s1.contains("jsonp") && !s1.contains("Callback") && !s1.contains("analytics.tiktok.com/i18n/pixel") && !s1.contains("google-analytics.com/analytics") && !s1.contains("connect.facebook.net")) {
                JSONObject jSONObject0 = this.a(s, s1);
                String s2 = c.b(s1);
                int v = s2.lastIndexOf(".");
                int v1 = c.g.contains((v == -1 ? "" : s2.substring(v + 1))) ? 2 : -1;
                if(jSONObject0 == null) {
                    return new WebResourceResponseModel(v1, null);
                }
                String s3 = jSONObject0.optString("fileName", null);
                if(s3 == null) {
                    return new WebResourceResponseModel(v1, null);
                }
                JSONObject jSONObject1 = jSONObject0.has("respHeader") ? jSONObject0.getJSONObject("respHeader") : null;
                if(jSONObject1 == null) {
                    return new WebResourceResponseModel(v1, null);
                }
                String s4 = s + "/" + s3;
                InputStream inputStream0 = iLoader0.exist(s4) ? iLoader0.getInputStream(s4) : null;
                if(inputStream0 == null) {
                    return new WebResourceResponseModel(v1, null);
                }
                HashMap hashMap0 = new HashMap();
                Iterator iterator0 = jSONObject1.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    hashMap0.put(((String)object0), jSONObject1.getString(((String)object0)));
                }
                return new WebResourceResponseModel(v1, com.bykv.vk.openvk.preload.falconx.a.a.a(inputStream0, hashMap0));
            }
            return new WebResourceResponseModel(1, null);
        }
        catch(Throwable unused_ex) {
            return new WebResourceResponseModel(-1, null);
        }
    }

    public final void a(String s, IStatisticMonitor iStatisticMonitor0, Set set0, INetWork iNetWork0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.b b0 = new com.bykv.vk.openvk.preload.geckox.b(new com.bykv.vk.openvk.preload.geckox.b.a(c.b).b(new String[]{"f36c832c8dbb162c49b46a7a6dd47fbd"}).a(new String[]{"f36c832c8dbb162c49b46a7a6dd47fbd"}).b().b(s).a("9999999.0.0").a(new com.bykv.vk.openvk.preload.geckox.a.a.a.a().a().a(com.bykv.vk.openvk.preload.geckox.a.a.b.b).b()).a(c.a).a().c(c.c).a(iStatisticMonitor0).a(iNetWork0).a(SystemClock.elapsedRealtime()), 0);
        this.f = iNetWork0;
        com.bykv.vk.openvk.preload.geckox.a a0 = com.bykv.vk.openvk.preload.geckox.a.a(b0);
        HashMap hashMap0 = new HashMap();
        LinkedList linkedList0 = new LinkedList();
        for(Object object0: set0) {
            linkedList0.add(new TargetChannel(((String)object0)));
        }
        hashMap0.put("f36c832c8dbb162c49b46a7a6dd47fbd", linkedList0);
        a0.a(hashMap0);
    }

    public static com.bykv.vk.openvk.preload.falconx.loader.a b() {
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(c.b, "f36c832c8dbb162c49b46a7a6dd47fbd", c.a);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static String b(String s) {
        if(s == null) {
            return null;
        }
        int v = s.indexOf("?");
        return v == -1 ? s : s.substring(0, v);
    }

    private void c(String s) {
        try {
            if(this.f != null && !TextUtils.isEmpty(s)) {
                this.f.syncDoGet(s);
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

