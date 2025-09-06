package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.DWo.PjT;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashMap;
import org.json.JSONObject;

public class AdActAction {
    public interface BindCustomTabsServiceCallback {
        void onBindFail(int arg1, String arg2);

        void onBindSuccess(CustomTabsSession arg1);
    }

    public class PAGCustomTabsCallback extends CustomTabsCallback {
        @Override  // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int v, @Nullable Bundle bundle0) {
            switch(v) {
                case 1: {
                    Long long0 = SystemClock.elapsedRealtime();
                    AdActAction.this.qla = long0;
                    if(!AdActAction.this.xf && AdActAction.this.ReZ != null) {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            jSONObject0.putOpt("render_type", "h5");
                            jSONObject0.putOpt("render_type_2", 0);
                            AdActAction.this.PjT("load_start", jSONObject0, 0L);
                            AdActAction.this.xf = true;
                        }
                        catch(Throwable throwable0) {
                            RD.Zh("AdActAction", throwable0.getMessage());
                        }
                        return;
                    }
                    break;
                }
                case 2: {
                    if(!AdActAction.this.DWo && AdActAction.this.qla != null && AdActAction.this.ReZ != null) {
                        long v1 = (long)AdActAction.this.qla;
                        long v2 = SystemClock.elapsedRealtime();
                        JSONObject jSONObject1 = new JSONObject();
                        try {
                            jSONObject1.put("first_page", true);
                            jSONObject1.putOpt("render_type", "h5");
                            jSONObject1.putOpt("render_type_2", 0);
                            jSONObject1.put("url", AdActAction.this.JQp);
                            jSONObject1.put("preload_h5_type", AdActAction.this.ReZ.Uo());
                            AdActAction.this.PjT("load_finish", jSONObject1, v1 - v2);
                            AdActAction.this.DWo = true;
                        }
                        catch(Throwable throwable1) {
                            RD.Zh("AdActAction", throwable1.getMessage());
                        }
                        return;
                    }
                    break;
                }
                case 3: {
                    if(!AdActAction.this.qj && AdActAction.this.ReZ != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.putOpt("render_type", "h5");
                            jSONObject2.putOpt("render_type_2", 0);
                            jSONObject2.put("url", AdActAction.this.JQp);
                            jSONObject2.put("preload_h5_type", AdActAction.this.ReZ.Uo());
                            AdActAction.this.PjT("load_fail", jSONObject2, 0L);
                            AdActAction.this.qj = true;
                        }
                        catch(Throwable throwable2) {
                            RD.Zh("AdActAction", throwable2.getMessage());
                        }
                        return;
                    }
                    break;
                }
                case 6: {
                    AdActAction.this.PjT();
                    if(!AdActAction.this.xs && AdActAction.this.ReZ != null && !AdActAction.this.qj && !AdActAction.this.DWo && AdActAction.this.qla != null) {
                        String s = wN.PjT(AdActAction.this.ReZ);
                        long v3 = SystemClock.elapsedRealtime();
                        ReZ.PjT(AdActAction.this.ReZ, s, v3 - ((long)AdActAction.this.qla), 0, 1);
                        return;
                    }
                    break;
                }
            }
        }
    }

    public class PAGEngagementSignalsCallback implements EngagementSignalsCallback {
        @Override  // androidx.browser.customtabs.EngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int v, @NonNull Bundle bundle0) {
        }

        @Override  // androidx.browser.customtabs.EngagementSignalsCallback
        public void onSessionEnded(boolean z, @NonNull Bundle bundle0) {
        }

        @Override  // androidx.browser.customtabs.EngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z, @NonNull Bundle bundle0) {
            AdActAction.this.fDm = System.currentTimeMillis();
            if(AdActAction.this.ReZ != null && !AdActAction.this.SM) {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("url", AdActAction.this.JQp);
                    jSONObject0.put("down_time", AdActAction.this.fDm);
                    long v = System.currentTimeMillis();
                    jSONObject0.put("up_time", v);
                    String s = wN.PjT(AdActAction.this.ReZ);
                    ReZ.Zh(AdActAction.this.ReZ, s, "in_web_click", jSONObject0, v - AdActAction.this.fDm);
                }
                catch(Throwable throwable0) {
                    RD.Zh("AdActAction", throwable0.getMessage());
                }
                if(!TextUtils.isEmpty(Owx.PjT(AdActAction.this.Zh, AdActAction.this.ReZ))) {
                    DWo dWo0 = new PjT().Zh(AdActAction.this.fDm).PjT(System.currentTimeMillis()).Zh((SM.Zh().PjT() ? 1 : 2)).ReZ(qZS.SM(AdActAction.this.Zh)).PjT(qZS.XX(AdActAction.this.Zh)).Zh(qZS.Au(AdActAction.this.Zh)).PjT();
                    HashMap hashMap0 = new HashMap();
                    String s1 = wN.PjT(AdActAction.this.ReZ);
                    ReZ.PjT("click", AdActAction.this.ReZ, dWo0, s1, true, hashMap0, 2);
                }
                AdActAction.this.SM = true;
            }
        }
    }

    private ActServiceConnection Au;
    private boolean DWo;
    private String JQp;
    public EngagementSignalsCallback PjT;
    private Owx ReZ;
    private boolean SM;
    private CustomTabsSession XX;
    private Context Zh;
    private String cr;
    private CustomTabsClient cz;
    private long fDm;
    private CustomTabsCallback gK;
    private boolean qj;
    private Long qla;
    private Zh ub;
    private BindCustomTabsServiceCallback xE;
    private boolean xf;
    private boolean xs;

    public AdActAction(Context context0, Owx owx0, String s, String s1) {
        this.cz = null;
        this.SM = false;
        this.DWo = false;
        this.qj = false;
        this.xf = false;
        this.xs = false;
        this.fDm = 0L;
        this.ub = new Zh() {
            final AdActAction PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.act.Zh
            public void PjT() {
                AdActAction.this.cz = null;
                AdActAction.this.Au = null;
                AdActAction.this.XX = null;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.act.Zh
            public void PjT(CustomTabsClient customTabsClient0) {
                if(Jo.cz()) {
                    AdActAction.this.PjT(customTabsClient0);
                    return;
                }
                Jo.PjT(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.act.AdActAction.1 Zh;

                    @Override
                    public void run() {
                        AdActAction.this.PjT(customTabsClient0);
                    }
                });
            }
        };
        this.PjT = new PAGEngagementSignalsCallback(this);
        this.gK = new PAGCustomTabsCallback(this);
        this.Zh = context0;
        this.ReZ = owx0;
        this.cr = s;
        this.JQp = s1;
    }

    private com.bytedance.sdk.openadsdk.qla.PjT.Zh PjT(int v) {
        com.bytedance.sdk.openadsdk.qla.PjT.Zh zh0 = new com.bytedance.sdk.openadsdk.qla.PjT.Zh();
        zh0.PjT(this.cr);
        zh0.PjT(this.ReZ);
        zh0.Zh(wN.PjT(this.ReZ));
        zh0.PjT(v);
        zh0.PjT(false);
        zh0.Zh(8);
        return zh0;
    }

    private void PjT() {
        try {
            ActServiceConnection actServiceConnection0 = this.Au;
            if(actServiceConnection0 == null) {
                return;
            }
            this.Zh.unbindService(actServiceConnection0);
            this.cz = null;
            this.XX = null;
            this.Au = null;
        }
        catch(Throwable throwable0) {
            RD.Zh("AdActAction", throwable0.getMessage());
        }
    }

    private void PjT(CustomTabsClient customTabsClient0) {
        this.cz = customTabsClient0;
        this.XX = customTabsClient0.k(this.gK);
        com.bytedance.sdk.openadsdk.qla.PjT.Zh zh0 = this.PjT(9);
        try {
            Bundle bundle0 = Bundle.EMPTY;
            if(this.XX.j(bundle0)) {
                boolean z = this.XX.q(this.PjT, bundle0);
                zh0.ReZ(1);
                com.bytedance.sdk.openadsdk.core.act.PjT.PjT(1);
                if(z) {
                    zh0.cr(1);
                    com.bytedance.sdk.openadsdk.core.act.PjT.Zh(1);
                }
                else {
                    com.bytedance.sdk.openadsdk.core.act.PjT.Zh(0);
                }
            }
            else {
                zh0.ReZ(0);
                com.bytedance.sdk.openadsdk.core.act.PjT.PjT(0);
            }
            ReZ.PjT(zh0);
            BindCustomTabsServiceCallback adActAction$BindCustomTabsServiceCallback0 = this.xE;
            if(adActAction$BindCustomTabsServiceCallback0 != null) {
                adActAction$BindCustomTabsServiceCallback0.onBindSuccess(this.XX);
            }
        }
        catch(Throwable throwable0) {
            BindCustomTabsServiceCallback adActAction$BindCustomTabsServiceCallback1 = this.xE;
            if(adActAction$BindCustomTabsServiceCallback1 != null) {
                adActAction$BindCustomTabsServiceCallback1.onBindFail(11, throwable0.getMessage());
            }
        }
    }

    private void PjT(String s, JSONObject jSONObject0, long v) {
        if(this.ReZ != null && !TextUtils.isEmpty(s)) {
            ReZ.PjT(System.currentTimeMillis(), this.ReZ, wN.PjT(this.ReZ), s, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                final AdActAction ReZ;

                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    Throwable throwable1;
                    JSONObject jSONObject0;
                    try {
                        boolean z = cRA.Zh(AdActAction.this.ReZ);
                        jSONObject0.put("is_playable", ((int)z));
                        boolean z1 = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(AdActAction.this.ReZ);
                        jSONObject0.put("usecache", ((int)z1));
                        jSONObject0 = new JSONObject();
                    }
                    catch(Throwable throwable0) {
                        throwable1 = throwable0;
                        RD.Zh("AdActAction", throwable1.getMessage());
                        return null;
                    }
                    try {
                        jSONObject0.put("ad_extra_data", jSONObject0.toString());
                        long v = v;
                        if(v > 0L) {
                            jSONObject0.put("duration", v);
                            return jSONObject0;
                        }
                        return jSONObject0;
                    }
                    catch(Throwable throwable1) {
                    }
                    RD.Zh("AdActAction", throwable1.getMessage());
                    return jSONObject0;
                }
            });
        }
    }

    public void PjT(BindCustomTabsServiceCallback adActAction$BindCustomTabsServiceCallback0) {
        this.xE = adActAction$BindCustomTabsServiceCallback0;
        if(this.Zh != null && this.ReZ != null) {
            try {
                ReZ.PjT(this.PjT(8));
                String s = com.bytedance.sdk.openadsdk.core.act.PjT.PjT(this.Zh);
                if(s == null) {
                    return;
                }
                ActServiceConnection actServiceConnection0 = new ActServiceConnection(this.ub);
                this.Au = actServiceConnection0;
                CustomTabsClient.b(this.Zh, s, actServiceConnection0);
            }
            catch(Throwable throwable0) {
                String s1 = throwable0.getMessage();
                RD.Zh("AdActAction", s1);
                BindCustomTabsServiceCallback adActAction$BindCustomTabsServiceCallback1 = this.xE;
                if(adActAction$BindCustomTabsServiceCallback1 != null) {
                    adActAction$BindCustomTabsServiceCallback1.onBindFail(10, s1);
                }
            }
        }
    }
}

