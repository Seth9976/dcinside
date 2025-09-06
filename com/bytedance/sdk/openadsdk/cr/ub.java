package com.bytedance.sdk.openadsdk.cr;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.cr.cr.JQp;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ub implements JQp {
    private JSONArray Au;
    private Boolean JQp;
    private String PjT;
    private Boolean ReZ;
    private JSONArray XX;
    private Owx Zh;
    private Boolean cr;
    private JSONObject cz;

    protected ub() {
        this.PjT = "embeded_ad";
        this.ReZ = Boolean.FALSE;
        this.cr = Boolean.FALSE;
        this.JQp = Boolean.FALSE;
    }

    public ub(int v, String s, Owx owx0) {
        this.ReZ = Boolean.FALSE;
        this.cr = Boolean.FALSE;
        this.JQp = Boolean.FALSE;
        this.PjT = s;
        this.Zh = owx0;
        this.cz = new JSONObject();
        this.XX = new JSONArray();
        this.Au = new JSONArray();
        this.PjT(this.cz, "webview_source", v);
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.ReZ
    public void Au() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                JSONObject jSONObject1 = ub.this.cz;
                ub.this.PjT(jSONObject1, "native_endcard_close", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.ReZ
    public void DWo() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(jSONObject0, "type", "native_enterForeground");
                JSONArray jSONArray0 = ub.this.XX;
                ub.this.PjT(jSONArray0, jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void JQp() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "webview_load_start", jSONObject0, false);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.PjT
    public void JQp(String s) {
        try {
            SM.PjT().post(new Runnable() {
                final ub Zh;

                @Override
                public void run() {
                    JSONObject jSONObject0 = new JSONObject();
                    ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                    ub.this.PjT(ub.this.cz, s, jSONObject0);
                }
            });
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    private void PjT(JSONArray jSONArray0, Object object0) {
        if(jSONArray0 != null && jSONArray0.length() < 10) {
            try {
                jSONArray0.put(object0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private void PjT(JSONObject jSONObject0, String s, Object object0) {
        this.PjT(jSONObject0, s, object0, true);
    }

    private void PjT(JSONObject jSONObject0, String s, Object object0, boolean z) {
        if(jSONObject0 != null && !TextUtils.isEmpty(s)) {
            try {
                if(!z && jSONObject0.has(s)) {
                    return;
                }
                jSONObject0.put(s, object0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cr
    public void PjT() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                Integer integer0 = ub.this.Zh.ZX();
                ub.this.PjT(jSONObject0, "render_sequence", integer0);
                if(ub.this.Zh != null) {
                    if(ub.this.Zh.VY() == null) {
                        if(ub.this.Zh.xH() != null) {
                            Integer integer5 = com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().cr();
                            ub.this.PjT(jSONObject0, "webview_count", integer5);
                            Integer integer6 = com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().cr();
                            ub.this.PjT(jSONObject0, "available_cache_count", integer6);
                        }
                    }
                    else if(ub.this.Zh.VY().fDm()) {
                        Integer integer1 = com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().cr();
                        ub.this.PjT(jSONObject0, "webview_count", integer1);
                        Integer integer2 = com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().cr();
                        ub.this.PjT(jSONObject0, "available_cache_count", integer2);
                    }
                    else {
                        Integer integer3 = com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().ReZ();
                        ub.this.PjT(jSONObject0, "webview_count", integer3);
                        Integer integer4 = com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().ReZ();
                        ub.this.PjT(jSONObject0, "available_cache_count", integer4);
                    }
                }
                ub.this.PjT(ub.this.cz, "render_start", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void PjT(int v) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(jSONObject0, "isWebViewCache", v);
                if(ub.this.Zh != null) {
                    if(ub.this.Zh.tY()) {
                        ub.this.PjT(jSONObject0, "engine_version", "v3");
                    }
                    else {
                        ub.this.PjT(jSONObject0, "engine_version", "v1");
                    }
                }
                ub.this.PjT(ub.this.cz, "before_webview_request", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cr
    public void PjT(int v, String s) {
        SM.PjT().post(new Runnable() {
            final ub ReZ;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(jSONObject0, "code", v);
                String s = s;
                if(s != null) {
                    ub.this.PjT(jSONObject0, "reason", s);
                }
                ub.this.PjT(ub.this.cz, "render_error", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void PjT(String s) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(jSONObject0, "jsb", s);
                ub.this.PjT(ub.this.cz, "webview_jsb_start", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void PjT(String s, long v, long v1, int v2) {
        SM.PjT().post(new Runnable() {
            final ub JQp;

            @Override
            public void run() {
                if(!TextUtils.isEmpty(s) && v1 >= v) {
                    JSONObject jSONObject0 = new JSONObject();
                    ub.this.PjT(jSONObject0, "start_ts", v);
                    ub.this.PjT(jSONObject0, "end_ts", v1);
                    ub.this.PjT(jSONObject0, "intercept_type", v2);
                    ub.this.PjT(jSONObject0, "type", "intercept_html");
                    ub.this.PjT(jSONObject0, "url", s);
                    ub.this.PjT(jSONObject0, "duration", ((long)(v1 - v)));
                    ub.this.PjT(ub.this.Au, jSONObject0);
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void PjT(JSONObject jSONObject0) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                JSONObject jSONObject0 = jSONObject0 == null ? new JSONObject() : jSONObject0;
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "webview_load_error", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.JQp
    public void PjT(boolean z) {
        this.JQp = Boolean.valueOf(z);
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.Zh
    public void ReZ() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "native_render_start", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.PjT
    public void ReZ(int v, String s) {
        try {
            SM.PjT().post(new Runnable() {
                final ub ReZ;

                @Override
                public void run() {
                    JSONObject jSONObject0 = new JSONObject();
                    ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                    ub.this.PjT(jSONObject0, "code", v);
                    ub.this.PjT(ub.this.cz, s, jSONObject0);
                }
            });
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.PjT
    public void ReZ(String s) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, s, jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.ReZ
    public void SM() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(jSONObject0, "type", "native_enterBackground");
                ub.this.PjT(ub.this.XX, jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.ReZ
    public void XX() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "native_endcard_show", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.PjT
    public void XX(String s) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, s, jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cr
    public void Zh() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "render_success", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.PjT
    public void Zh(int v, String s) {
        SM.PjT().post(new Runnable() {
            final ub ReZ;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(jSONObject0, "code", v);
                ub.this.PjT(ub.this.cz, s, jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void Zh(String s) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(jSONObject0, "jsb", s);
                ub.this.PjT(ub.this.cz, "webview_jsb_end", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void Zh(String s, long v, long v1, int v2) {
        SM.PjT().post(new Runnable() {
            final ub JQp;

            @Override
            public void run() {
                if(!TextUtils.isEmpty(s) && v1 >= v) {
                    JSONObject jSONObject0 = new JSONObject();
                    ub.this.PjT(jSONObject0, "start_ts", v);
                    ub.this.PjT(jSONObject0, "end_ts", v1);
                    ub.this.PjT(jSONObject0, "intercept_type", v2);
                    ub.this.PjT(jSONObject0, "type", "intercept_js");
                    ub.this.PjT(jSONObject0, "url", s);
                    ub.this.PjT(jSONObject0, "duration", ((long)(v1 - v)));
                    ub.this.PjT(ub.this.Au, jSONObject0);
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void Zh(JSONObject jSONObject0) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                if(ub.this.cz != null) {
                    JSONObject jSONObject0 = jSONObject0;
                    if(jSONObject0 != null) {
                        Iterator iterator0 = jSONObject0.keys();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            Object object1 = jSONObject0.opt(((String)object0));
                            ub.this.PjT(ub.this.cz, ((String)object0), object1);
                        }
                        ub.this.cr = Boolean.TRUE;
                        ub.this.xf();
                    }
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.ReZ
    public void cr() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "native_render_end", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.PjT
    public void cr(String s) {
        SM.PjT().post(new Runnable() {
            final ub Zh;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, s, jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cz
    public void cz() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "webview_load_success", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.PjT
    public void cz(String s) {
        try {
            SM.PjT().post(new Runnable() {
                final ub Zh;

                @Override
                public void run() {
                    JSONObject jSONObject0 = new JSONObject();
                    ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                    ub.this.PjT(ub.this.cz, s, jSONObject0);
                }
            });
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.Zh
    public void fDm() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "no_native_render", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.JQp
    public void qj() {
        this.ReZ = Boolean.TRUE;
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cr
    public void qla() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "render_failed", jSONObject0);
            }
        });
    }

    // 去混淆评级： 低(30)
    private boolean ub() {
        return this.JQp.booleanValue() || this.cr.booleanValue() && this.ReZ.booleanValue();
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.cr
    public void xE() {
        try {
            SM.PjT().post(new Runnable() {
                final ub PjT;

                @Override
                public void run() {
                    JSONObject jSONObject0 = new JSONObject();
                    ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                    ub.this.PjT(ub.this.cz, "render_did_finish", jSONObject0);
                }
            });
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.JQp
    public void xf() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                if(!ub.this.ub()) {
                    return;
                }
                if(ub.this.XX != null && ub.this.XX.length() != 0) {
                    try {
                        ub.this.cz.put("native_switchBackgroundAndForeground", ub.this.XX);
                    }
                    catch(Exception unused_ex) {
                    }
                }
                if(ub.this.Au != null && ub.this.Au.length() != 0) {
                    try {
                        ub.this.cz.put("intercept_source", ub.this.Au);
                    }
                    catch(Exception unused_ex) {
                    }
                }
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("webview_time_track", ub.this.cz);
                }
                catch(JSONException jSONException0) {
                    RD.PjT("WebviewTimeTrack", "trySendTrackInfo json error", jSONException0);
                }
                boolean z = !com.bytedance.sdk.openadsdk.core.SM.Zh().ltE();
                ReZ.Zh(ub.this.Zh, ub.this.PjT, "webview_time_track", jSONObject0);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.cr.Zh
    public void xs() {
        SM.PjT().post(new Runnable() {
            final ub PjT;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                ub.this.PjT(jSONObject0, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "native_render_end", jSONObject0);
                JSONObject jSONObject1 = new JSONObject();
                ub.this.PjT(jSONObject1, "ts", System.currentTimeMillis());
                ub.this.PjT(ub.this.cz, "render_success", jSONObject1);
            }
        });
    }
}

