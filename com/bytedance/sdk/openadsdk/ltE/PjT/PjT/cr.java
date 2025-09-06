package com.bytedance.sdk.openadsdk.ltE.PjT.PjT;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ZX;
import com.bytedance.sdk.openadsdk.core.model.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.xf;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN.Zh;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class cr implements cz {
    private boolean Au;
    protected final AtomicBoolean JQp;
    protected com.bytedance.sdk.openadsdk.core.model.cr PjT;
    protected String ReZ;
    private final WeakReference XX;
    protected Owx Zh;
    protected boolean cr;
    protected int cz;

    public cr(Context context0, Owx owx0, String s) {
        this.cr = false;
        this.JQp = new AtomicBoolean(false);
        this.Au = false;
        this.XX = new WeakReference(context0);
        this.Zh = owx0;
        this.PjT = owx0.uQg();
        this.ReZ = s;
        "====tag===".concat(String.valueOf(s));
        if(ub.PjT() == null) {
            ub.Zh(context0);
        }
    }

    // 去混淆评级： 低(25)
    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public boolean JQp() {
        this.JQp.set(true);
        return this.PjT != null && this.PjT(this.ReZ(), "", "");
    }

    private void PjT(Map map0) {
        boolean z = false;
        if(this.Zh != null && this.Zh.cyr() == 0) {
            map0.put("auto_click", Boolean.valueOf(this.Zh != null && !this.Zh.Au()));
        }
        if(this.Zh != null && this.Zh.cyr() == 0) {
            if(this.cz >= 11) {
                z = true;
            }
            map0.put("dpl_probability_jump", Boolean.valueOf(z));
        }
        map0.put("can_query_install", 1);
    }

    public static boolean PjT(Context context0, String s, String s1, String s2, Owx owx0) {
        if(ReZ.PjT()) {
            return JQp.PjT(context0, s, s1, s2, owx0);
        }
        if(!TextUtils.isEmpty(s2) && s2.contains("_landingpage")) {
            s2 = s2.replace("_landingpage", "");
        }
        if(!TextUtils.isEmpty(s)) {
            try {
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent0.setFlags(0x10000000);
                context0.startActivity(intent0);
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(owx0, s2, "store_open", null);
                return true;
            }
            catch(Throwable unused_ex) {
            }
        }
        if(context0 != null && s1 != null && !TextUtils.isEmpty(s1)) {
            try {
                Intent intent1 = new Intent("android.intent.action.VIEW");
                Uri uri0 = Uri.parse(("market://details?id=" + s1));
                intent1.setData(uri0);
                for(Object object0: context0.getPackageManager().queryIntentActivities(intent1, 0x10000)) {
                    if(((ResolveInfo)object0).activityInfo.packageName.equals("com.android.vending") && context0.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(uri0);
                        intent2.setPackage("com.android.vending");
                        if(!(context0 instanceof Activity)) {
                            intent2.setFlags(0x10000000);
                        }
                        context0.startActivity(intent2);
                        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(owx0, s2, "store_open", null);
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            catch(Throwable throwable0) {
            }
            ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", throwable0);
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public void PjT(int v) {
        this.cz = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public void PjT(boolean z) {
        this.Au = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public boolean PjT() {
        return false;
    }

    public boolean PjT(Context context0, String s, String s1) {
        return cr.PjT(context0, s, s1, this.ReZ, this.Zh);
    }

    protected Context ReZ() {
        return this.XX == null || this.XX.get() == null ? ub.PjT() : ((Context)this.XX.get());
    }

    public boolean Zh() {
        com.bytedance.sdk.openadsdk.core.cr.PjT(this.Zh, this.ReZ, 1, null);
        if(this.Zh.RV() == null) {
            com.bytedance.sdk.openadsdk.core.cr.PjT(this.Zh, this.ReZ, -1, null);
        }
        else {
            String s = this.Zh.RV().PjT();
            if(TextUtils.isEmpty(s)) {
                com.bytedance.sdk.openadsdk.core.cr.PjT(this.Zh, this.ReZ, -2, this.Zh.RV().cr());
            }
            else {
                Uri uri0 = Uri.parse(s);
                Intent intent0 = new Intent("android.intent.action.VIEW");
                intent0.setData(uri0);
                Zh wN$Zh0 = wN.PjT(this.ReZ(), intent0);
                if(wN$Zh0.Zh > 0) {
                    if(!(this.ReZ() instanceof Activity)) {
                        intent0.addFlags(0x10000000);
                    }
                    try {
                        HashMap hashMap0 = new HashMap();
                        this.PjT(hashMap0);
                        hashMap0.put("matched_count", wN$Zh0.Zh);
                        hashMap0.put("url", s);
                        ComponentName componentName0 = wN$Zh0.PjT;
                        if(componentName0 != null) {
                            intent0.setComponent(componentName0);
                        }
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.Zh, this.ReZ, "open_url_app", hashMap0);
                        this.ReZ().startActivity(intent0);
                        xf.PjT().PjT(hashMap0).PjT(this.Zh, this.ReZ);
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT("dp_start_act_success", this.Zh, this.ReZ, hashMap0);
                        return true;
                    }
                    catch(Throwable throwable0) {
                    }
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("exception", throwable0.getMessage());
                        jSONObject0.put("intent", intent0.toString());
                        jSONObject0.put("can_query_install", 1);
                    }
                    catch(Exception unused_ex) {
                    }
                    com.bytedance.sdk.openadsdk.core.cr.PjT(this.Zh, this.ReZ, -4, jSONObject0);
                    goto label_36;
                }
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("intent", intent0.toString());
                    jSONObject1.put("can_query_install", 1);
                }
                catch(Exception unused_ex) {
                }
                com.bytedance.sdk.openadsdk.core.cr.PjT(this.Zh, this.ReZ, -3, jSONObject1);
            }
        label_36:
            if(!this.cr || this.JQp.get()) {
                this.cr = true;
                HashMap hashMap1 = new HashMap();
                this.PjT(hashMap1);
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.Zh, this.ReZ, "open_fallback_url", hashMap1);
                return false;
            }
        }
        return false;
    }

    public boolean Zh(boolean z) {
        try {
            Owx owx0 = this.Zh;
            if(owx0 != null) {
                Lrd lrd0 = owx0.ceO();
                if(lrd0 != null && !TextUtils.isEmpty(lrd0.SM())) {
                    if(lrd0.XX() && this.Zh.uQg() != null && false) {
                        IPMiBroadcastReceiver iPMiBroadcastReceiver0 = IPMiBroadcastReceiver.PjT(this.ReZ());
                        if(iPMiBroadcastReceiver0 != null) {
                            iPMiBroadcastReceiver0.PjT("", this.Zh);
                        }
                    }
                    boolean z1 = com.bytedance.sdk.openadsdk.ltE.PjT.PjT.Zh.PjT(this.ReZ(), lrd0.SM(), this.Zh);
                    Jo.Zh(new Au("task_oem_store") {
                        final cr Zh;

                        @Override
                        public void run() {
                            if(z1) {
                                SM.PjT("oem_store", "1");
                                return;
                            }
                            SM.PjT("oem_store", "-2");
                        }
                    });
                    return z1;
                }
            }
            return false;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("GPDownLoader", throwable0.getMessage());
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public void cr() {
        if(this.ReZ() == null) {
            return;
        }
        if(this.Zh()) {
            this.JQp.set(true);
            this.Zh.ReZ(true);
            return;
        }
        if(this.PjT()) {
            this.Zh.ReZ(true);
            return;
        }
        if(this.Zh(false)) {
            return;
        }
        if(this.JQp()) {
            this.Zh.ReZ(true);
            return;
        }
        if(this.Zh.uQg() == null && this.Zh.xu() != null) {
            ZX.PjT(this.ReZ(), this.Zh.xu(), this.Zh, wN.PjT(this.ReZ), this.ReZ, true);
            this.Zh.ReZ(true);
        }
    }
}

