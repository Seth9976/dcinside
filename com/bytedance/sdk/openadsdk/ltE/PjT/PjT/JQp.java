package com.bytedance.sdk.openadsdk.ltE.PjT.PjT;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ZX;
import com.bytedance.sdk.openadsdk.core.model.Lrd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cr;
import com.bytedance.sdk.openadsdk.core.model.qj;
import com.bytedance.sdk.openadsdk.core.qla;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.RD;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class JQp implements cz {
    protected int JQp;
    public static Boolean PjT;
    protected Owx ReZ;
    protected cr Zh;
    protected String cr;
    private final WeakReference cz;

    static {
    }

    public JQp(Context context0, Owx owx0, String s) {
        this.cz = new WeakReference(context0);
        this.ReZ = owx0;
        this.Zh = owx0.uQg();
        this.cr = s;
        "====tag===".concat(String.valueOf(s));
        if(ub.PjT() == null) {
            ub.Zh(context0);
        }
    }

    // 去混淆评级： 中等(50)
    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public boolean JQp() {
        return this.Zh != null && this.PjT(this.Zh(), "", "");
    }

    private static Intent PjT(Context context0, Lrd lrd0) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            String s = lrd0.cr();
            if(TextUtils.isEmpty(s)) {
                intent0.setPackage("com.android.vending");
            }
            else {
                intent0.setPackage(s);
            }
            intent0.setData(Uri.parse(lrd0.SM()));
            intent0.putExtra("overlay", lrd0.Zh() == 1);
            if(TextUtils.isEmpty(lrd0.ReZ())) {
                intent0.putExtra("callerId", "com.dcinside.app.android");
            }
            else {
                intent0.putExtra("callerId", lrd0.ReZ());
            }
            lrd0.PjT(intent0);
            return intent0;
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    @NonNull
    private static Map PjT(Owx owx0, boolean z, Lrd lrd0) {
        Map map0 = new HashMap();
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("oem_vendor_type", lrd0.cz());
            jSONObject0.put("from_web", ((int)z));
            jSONObject0.put("is_w2a", owx0.XX());
            map0.put("pag_json_data", jSONObject0.toString());
        }
        catch(Throwable unused_ex) {
        }
        return map0;
    }

    private void PjT(Map map0) {
        boolean z = false;
        if(this.ReZ != null && this.ReZ.cyr() == 0) {
            map0.put("auto_click", Boolean.valueOf(this.ReZ != null && !this.ReZ.Au()));
        }
        if(this.ReZ != null && this.ReZ.cyr() == 0) {
            if(this.JQp >= 11) {
                z = true;
            }
            map0.put("dpl_probability_jump", Boolean.valueOf(z));
        }
        map0.put("can_query_install", 0);
    }

    private static void PjT(JSONObject jSONObject0, JSONObject jSONObject1, Owx owx0, String s, int v) {
        try {
            jSONObject0.put("status", v);
            jSONObject1.put("pag_json_data", jSONObject0.toString());
            ReZ.Zh(owx0, s, "gp_mini_card_status", jSONObject1);
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    public static boolean PjT(Context context0, String s, String s1, String s2, Owx owx0) {
        if(!TextUtils.isEmpty(s2) && s2.contains("_landingpage")) {
            s2 = s2.replace("_landingpage", "");
        }
        if(!TextUtils.isEmpty(s)) {
            try {
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent0.setFlags(0x10000000);
                context0.startActivity(intent0);
                ReZ.Zh(owx0, s2, "store_open", null);
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
                        ReZ.Zh(owx0, s2, "store_open", null);
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

    public static boolean PjT(Owx owx0, Context context0, boolean z) {
        Intent intent0;
        JSONObject jSONObject1;
        JSONObject jSONObject0;
        String s;
        if(owx0 != null && owx0.ceO() != null && owx0.ceO().Au() && !TextUtils.isEmpty(owx0.ceO().SM()) && context0 != null) {
            try {
                Lrd lrd0 = owx0.ceO();
                s = wN.PjT(owx0);
                jSONObject0 = new JSONObject();
                jSONObject1 = lrd0.DWo();
                jSONObject1.put("from_web", ((int)z));
                jSONObject1.put("is_w2a", owx0.XX());
                jSONObject1.put("status", 0);
                jSONObject0.put("pag_json_data", jSONObject1.toString());
                ReZ.Zh(owx0, s, "gp_mini_card_status", jSONObject0);
                intent0 = JQp.PjT(context0, lrd0);
                if(intent0 == null) {
                    JQp.PjT(jSONObject1, jSONObject0, owx0, s, -2);
                    return false;
                }
                if(!(context0 instanceof Activity)) {
                    Activity activity0 = qla.PjT().JQp().Zh();
                    if(activity0 != null && RD.PjT(activity0)) {
                        context0 = activity0;
                    }
                }
                else if(!RD.PjT(((Activity)context0))) {
                    context0 = null;
                }
                if(!(context0 instanceof Activity)) {
                    JQp.PjT(jSONObject1, jSONObject0, owx0, s, -5);
                    return false;
                }
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 == null || intent0.resolveActivity(packageManager0) == null) {
                    JQp.PjT(jSONObject1, jSONObject0, owx0, s, -4);
                    return false;
                }
            }
            catch(Throwable unused_ex) {
                return false;
            }
            try {
                ((Activity)context0).startActivityForResult(intent0, 0);
                JQp.PjT(jSONObject1, jSONObject0, owx0, s, 1);
                return true;
            }
            catch(Throwable unused_ex) {
                try {
                    JQp.PjT(jSONObject1, jSONObject0, owx0, s, -3);
                    return false;
                }
                catch(Throwable unused_ex) {
                }
                return false;
            }
        }
        return false;
    }

    public static boolean PjT(Owx owx0, String s) {
        if(owx0 != null && owx0.ceO() != null) {
            String s1 = owx0.ceO().JQp();
            return TextUtils.isEmpty(s1) ? false : Pattern.compile(s1).matcher(s).matches();
        }
        return false;
    }

    public static boolean PjT(Owx owx0, String s, Context context0, String s1, Map map0) {
        if(owx0 != null && owx0.ZsT() == 0) {
            return false;
        }
        try {
            if(!TextUtils.isEmpty(s)) {
                Intent intent0 = wN.PjT(context0, s);
                if(intent0 == null) {
                    return false;
                }
                intent0.putExtra("START_ONLY_FOR_ANDROID", true);
                if(!(context0 instanceof Activity)) {
                    intent0.addFlags(0x10000000);
                }
                context0.startActivity(intent0);
                if(map0 == null) {
                    map0 = new HashMap();
                }
                if(owx0 != null && owx0.cyr() == 0) {
                    map0.put("auto_click", Boolean.valueOf(!owx0.Au()));
                }
                map0.put("can_query_install", 0);
                ReZ.PjT(owx0, s1, "click_open", map0);
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public static boolean PjT(String s, Owx owx0) {
        if(s != null && !s.isEmpty()) {
            try {
                Uri uri0 = Uri.parse(s);
                String s1 = uri0.getScheme();
                String s2 = uri0.getHost();
                if("market".equals(s1) && "details".equals(s2)) {
                    return true;
                }
                if(("http".equals(s1) || "https".equals(s1)) && ("play.google.com".equals(s2) || "market.android.com".equals(s2))) {
                    return true;
                }
                if("market".equals(s1) && "webstoreredirect".equals(s2)) {
                    String s3 = uri0.getQueryParameter("uri");
                    return s3 == null ? false : JQp.PjT(s3, owx0);
                }
                return false;
            }
            catch(Throwable unused_ex) {
            }
            return false;
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public void PjT(int v) {
        this.JQp = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public void PjT(boolean z) {
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public boolean PjT() {
        if(this.Zh == null) {
            return false;
        }
        return this.ReZ == null || this.ReZ.ZsT() != 0 ? false : false;
    }

    public boolean PjT(Context context0, String s, String s1) {
        return JQp.PjT(context0, s, s1, this.cr, this.ReZ);
    }

    public boolean ReZ() {
        com.bytedance.sdk.openadsdk.core.cr.PjT(this.ReZ, this.cr, 1, null);
        qj qj0 = this.ReZ.RV();
        if(qj0 == null) {
            com.bytedance.sdk.openadsdk.core.cr.PjT(this.ReZ, this.cr, -1, null);
            return false;
        }
        HashMap hashMap0 = new HashMap();
        this.PjT(hashMap0);
        if(com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT(this.Zh(), qj0.PjT(), this.ReZ, wN.Zh(this.ReZ), hashMap0, true)) {
            return true;
        }
        ReZ.PjT(this.ReZ, this.cr, "open_fallback_url", hashMap0);
        return false;
    }

    public static boolean Zh(Owx owx0, Context context0, boolean z) {
        String s;
        if(owx0 != null && context0 != null) {
            try {
                Lrd lrd0 = owx0.ceO();
                if(lrd0 != null && !TextUtils.isEmpty(lrd0.SM())) {
                    if(lrd0.Au() && JQp.PjT(owx0, context0, z)) {
                        return true;
                    }
                    if(lrd0.XX()) {
                        if(owx0.XX() == 1) {
                            s = lrd0.PjT();
                        }
                        else {
                            s = owx0.uQg() == null || true ? null : "";
                        }
                        if(!TextUtils.isEmpty(s)) {
                            IPMiBroadcastReceiver iPMiBroadcastReceiver0 = IPMiBroadcastReceiver.PjT(context0);
                            if(iPMiBroadcastReceiver0 != null) {
                                iPMiBroadcastReceiver0.PjT(s, owx0);
                            }
                        }
                    }
                    Map map0 = JQp.PjT(owx0, z, lrd0);
                    boolean z1 = com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT(context0, lrd0.SM(), owx0, wN.Zh(owx0), map0, true);
                    Jo.Zh(new Au("task_oem_store") {
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
                return false;
            }
            catch(Throwable throwable0) {
            }
            com.bytedance.sdk.component.utils.RD.Zh("GPDownLoader", throwable0.getMessage());
        }
        return false;
    }

    protected Context Zh() {
        return this.cz == null || this.cz.get() == null ? ub.PjT() : ((Context)this.cz.get());
    }

    public boolean Zh(boolean z) {
        return JQp.Zh(this.ReZ, this.Zh(), z);
    }

    @Override  // com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz
    public void cr() {
        if(this.Zh() == null) {
            return;
        }
        if(this.ReZ()) {
            this.ReZ.ReZ(true);
            return;
        }
        if(this.PjT()) {
            this.ReZ.ReZ(true);
            return;
        }
        if(this.Zh(false)) {
            return;
        }
        if(this.JQp()) {
            this.ReZ.ReZ(true);
            return;
        }
        if(this.ReZ.uQg() == null && this.ReZ.xu() != null) {
            ZX.PjT(this.Zh(), this.ReZ.xu(), this.ReZ, wN.PjT(this.cr), this.cr, true);
            this.ReZ.ReZ(true);
        }
    }

    private static boolean cz() [...] // Inlined contents
}

