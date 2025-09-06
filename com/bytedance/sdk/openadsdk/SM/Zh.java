package com.bytedance.sdk.openadsdk.SM;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.ub.ReZ;
import com.bytedance.sdk.openadsdk.ub.Zh.PjT;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONObject;

public class Zh implements xE {
    private final long PjT;
    private final xE ReZ;
    private final String Zh;
    private final Owx cr;

    public Zh(Owx owx0, String s, xE xE0) {
        this.PjT = SystemClock.elapsedRealtime();
        this.ReZ = xE0;
        this.cr = owx0;
        this.Zh = s;
        if(cr.Zh()) {
            ReZ.PjT(new com.bytedance.sdk.openadsdk.ub.cr() {
                final Zh Zh;

                @Override  // com.bytedance.sdk.openadsdk.ub.cr
                public PjT generatorModel() {
                    PjT pjT0 = new PjT();
                    pjT0.Zh("load_img");
                    Owx owx0 = owx0;
                    if(owx0 != null) {
                        pjT0.ReZ(owx0.cRA("-1"));
                        pjT0.cr(wN.ReZ(owx0.kW()));
                    }
                    pjT0.PjT("7.1.0.4");
                    return pjT0;
                }
            });
        }
    }

    @Override  // com.bytedance.sdk.component.JQp.xE
    public void PjT(int v, String s, @Nullable Throwable throwable0) {
        xE xE0 = this.ReZ;
        if(xE0 != null) {
            xE0.PjT(v, s, throwable0);
        }
        Owx owx0 = this.cr;
        if(owx0 != null) {
            if(!TextUtils.isEmpty(wN.PjT(owx0))) {
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("load_image_error", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                    final Zh JQp;

                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    @Nullable
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("duration", SystemClock.elapsedRealtime() - this.PjT);
                        jSONObject0.put("url", Zh.this.Zh);
                        jSONObject0.put("error_code", v);
                        Throwable throwable0 = throwable0;
                        if(throwable0 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", throwable0);
                        }
                        jSONObject0.put("error_message", s);
                        jSONObject0.put("image_mode", Zh.this.cr.fK());
                        jSONObject0.put("use_new_img", ((int)cr.Zh()));
                        return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("load_image_error").PjT(Zh.this.cr.kW()).Zh(jSONObject0.toString());
                    }
                });
            }
            if(cr.Zh()) {
                ReZ.ReZ(new com.bytedance.sdk.openadsdk.ub.cr() {
                    final Zh PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public PjT generatorModel() {
                        PjT pjT0 = new PjT();
                        pjT0.Zh("load_img");
                        if(Zh.this.cr != null) {
                            pjT0.ReZ(Zh.this.cr.cRA("-1"));
                            pjT0.cr(wN.ReZ(Zh.this.cr.kW()));
                        }
                        pjT0.PjT("7.1.0.4");
                        return pjT0;
                    }
                });
            }
        }
    }

    @Override  // com.bytedance.sdk.component.JQp.xE
    public void PjT(qj qj0) {
        xE xE0 = this.ReZ;
        if(xE0 != null) {
            xE0.PjT(qj0);
        }
        if(this.cr != null) {
            long v = SystemClock.elapsedRealtime();
            int v1 = qj0.XX();
            boolean z = qj0.cz();
            com.bytedance.sdk.openadsdk.qla.ReZ.PjT("load_image_success", false, new com.bytedance.sdk.openadsdk.qla.Zh() {
                final Zh cr;

                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                @Nullable
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("duration", v - this.PjT);
                    jSONObject0.put("url", Zh.this.Zh);
                    jSONObject0.put("preload_size", v1 / 0x400);
                    jSONObject0.put("local_cache", ((int)z));
                    jSONObject0.put("image_mode", Zh.this.cr.fK());
                    jSONObject0.put("use_new_img", ((int)cr.Zh()));
                    return com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().PjT("load_image_success").PjT(Zh.this.cr.kW()).Zh(jSONObject0.toString());
                }
            });
            if(cr.Zh()) {
                ReZ.Zh(new com.bytedance.sdk.openadsdk.ub.cr() {
                    final Zh PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public PjT generatorModel() {
                        PjT pjT0 = new PjT();
                        pjT0.Zh("load_img");
                        if(Zh.this.cr != null) {
                            pjT0.ReZ(Zh.this.cr.cRA("-1"));
                            pjT0.cr(wN.ReZ(Zh.this.cr.kW()));
                        }
                        pjT0.PjT("7.1.0.4");
                        return pjT0;
                    }
                });
            }
        }
    }
}

