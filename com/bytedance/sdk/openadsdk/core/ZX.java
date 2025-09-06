package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.ReZ.cz;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.qj;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.xf;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr;
import com.bytedance.sdk.openadsdk.multipro.Zh.PjT;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.utils.RD;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashMap;
import java.util.Map;

public class ZX {
    private static boolean PjT = false;

    static {
    }

    private static Intent PjT(Context context0, String s, Owx owx0, int v, @Nullable PAGNativeAd pAGNativeAd0, PangleAd pangleAd0, String s1, boolean z) {
        return ZX.PjT(context0, s, owx0, v, pAGNativeAd0, pangleAd0, s1, z, false);
    }

    private static Intent PjT(Context context0, String s, Owx owx0, int v, @Nullable PAGNativeAd pAGNativeAd0, PangleAd pangleAd0, String s1, boolean z, boolean z1) {
        Intent intent0;
        if(z1 || !cRA.Zh(owx0) || pAGNativeAd0 == null && pangleAd0 == null) {
            intent0 = z1 || owx0.cI() != 3 || owx0.RD() != 2 && (owx0.RD() != 1 || !ZX.PjT) || owx0.Wcm() ? new Intent(context0, TTLandingPageActivity.class) : new Intent(context0, TTVideoLandingPageLink2Activity.class);
        }
        else {
            intent0 = new Intent(context0, TTPlayableLandingPageActivity.class);
            intent0.putExtra("ad_pending_download", ZX.PjT(owx0, z));
            String s2 = cRA.xf(owx0);
            if(!TextUtils.isEmpty(s2)) {
                s = s2.contains("?") ? s2 + "&orientation=portrait" : s2 + "?orientation=portrait";
            }
        }
        intent0.putExtra("url", s);
        intent0.putExtra("gecko_id", owx0.MN());
        intent0.putExtra("web_title", owx0.Xtz());
        intent0.putExtra("sdk_version", 7104);
        intent0.putExtra("adid", owx0.dIF());
        intent0.putExtra("log_extra", owx0.xR());
        PjT pjT0 = null;
        intent0.putExtra("icon_url", (owx0.Xe() == null ? null : owx0.Xe().PjT()));
        intent0.putExtra("event_tag", s1);
        intent0.putExtra("source", v);
        if(!(context0 instanceof Activity)) {
            intent0.addFlags(0x10000000);
        }
        if(Zh.ReZ()) {
            intent0.putExtra("multi_process_materialmeta", owx0.dDm().toString());
        }
        else {
            Lrd.PjT().cz();
            Lrd.PjT().PjT(owx0);
        }
        switch(owx0.fK()) {
            case 5: 
            case 15: 
            case 50: {
                if(pAGNativeAd0 != null) {
                    if(pAGNativeAd0 instanceof com.bytedance.sdk.openadsdk.multipro.Zh.PjT.PjT) {
                        pjT0 = ((com.bytedance.sdk.openadsdk.multipro.Zh.PjT.PjT)pAGNativeAd0).cz();
                    }
                    else if(pAGNativeAd0 instanceof com.bytedance.sdk.openadsdk.PjT.Zh.PjT.Zh) {
                        pjT0 = ((com.bytedance.sdk.openadsdk.PjT.Zh.PjT.Zh)pAGNativeAd0).Zh();
                    }
                    if(pjT0 != null) {
                        intent0.putExtra("multi_process_data", pjT0.PjT().toString());
                    }
                }
                if(pangleAd0 instanceof cz) {
                    pjT0 = ((cz)pangleAd0).ReZ();
                    if(pjT0 != null) {
                        intent0.putExtra("multi_process_data", pjT0.PjT().toString());
                    }
                }
                if(pjT0 != null) {
                    intent0.putExtra("video_is_auto_play", pjT0.cr);
                }
                return intent0;
            }
            default: {
                return intent0;
            }
        }
    }

    private static com.bytedance.sdk.openadsdk.qla.PjT.Zh PjT(int v, Owx owx0) {
        com.bytedance.sdk.openadsdk.qla.PjT.Zh zh0 = new com.bytedance.sdk.openadsdk.qla.PjT.Zh();
        zh0.PjT("openDetailPage");
        zh0.PjT(owx0);
        zh0.Zh(wN.PjT(owx0));
        zh0.PjT(v);
        zh0.PjT(false);
        zh0.Zh(owx0.cI());
        return zh0;
    }

    private static String PjT(Owx owx0) {
        return !owx0.uvo() || owx0.QB() == null ? owx0.xu() : owx0.QB().SM();
    }

    private static String PjT(qj qj0, Owx owx0) {
        return TextUtils.isEmpty(qj0.Zh()) ? ZX.PjT(owx0) : qj0.Zh();
    }

    public static void PjT(boolean z) {
        ZX.PjT = z;
    }

    public static boolean PjT(Context context0, Owx owx0, int v, @Nullable PAGNativeAd pAGNativeAd0, @Nullable PangleAd pangleAd0, String s, @Nullable com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz cz0, boolean z, int v1) {
        String s1;
        ReZ.PjT(ZX.PjT(-1, owx0));
        boolean z1 = false;
        if(context0 != null && owx0 != null && v != -1) {
            qj qj0 = owx0.RV();
            HashMap hashMap0 = new HashMap();
            if(owx0.cyr() == 0) {
                if(v1 >= 11) {
                    z1 = true;
                }
                hashMap0.put("dpl_probability_jump", Boolean.valueOf(z1));
            }
            if(v1 != 0 && owx0.uvo()) {
                hashMap0.put("dsp_click_type", v1);
            }
            if(qj0 == null || TextUtils.isEmpty(qj0.PjT())) {
                s1 = ZX.PjT(owx0);
            }
            else {
                if(ZX.PjT(context0, owx0, v, s, z, hashMap0)) {
                    ReZ.PjT(ZX.PjT(2, owx0));
                    return true;
                }
                if(qj0.ReZ() == 2) {
                    switch(owx0.fK()) {
                        case 5: 
                        case 15: {
                            s1 = qj0.ReZ() != 1 || TextUtils.isEmpty(qj0.Zh()) ? ZX.PjT(owx0) : qj0.Zh();
                            break;
                        }
                        default: {
                            if(cz0 == null) {
                                s1 = ZX.PjT(qj0, owx0);
                            }
                            else {
                                if(!cz0.PjT()) {
                                    if(cz0.JQp()) {
                                        ReZ.PjT(owx0, s, "open_fallback_url", hashMap0);
                                        ReZ.PjT(ZX.PjT(3, owx0));
                                        return true;
                                    }
                                    s1 = ZX.PjT(qj0, owx0);
                                    ReZ.PjT(ZX.PjT(3, owx0));
                                    break;
                                }
                                ReZ.PjT(owx0, s, "open_fallback_url", hashMap0);
                                ReZ.PjT(ZX.PjT(3, owx0));
                                return true;
                            }
                        }
                    }
                }
                else {
                    s1 = qj0.ReZ() != 1 || TextUtils.isEmpty(qj0.Zh()) ? ZX.PjT(owx0) : qj0.Zh();
                }
                ReZ.PjT(owx0, s, "open_fallback_url", hashMap0);
            }
            if(owx0.cyr() == 0 && !TextUtils.isEmpty(s1) && s1.contains("play.google.com/store")) {
                ReZ.PjT(ZX.PjT(4, owx0));
                return cr.PjT(context0, s1, s1.substring(s1.indexOf("?id=") + 4), s, owx0);
            }
            return ZX.PjT(context0, owx0, v, pAGNativeAd0, pangleAd0, s, z, s1);
        }
        ReZ.PjT(ZX.PjT(1, owx0));
        return false;
    }

    public static boolean PjT(Context context0, Owx owx0, int v, PAGNativeAd pAGNativeAd0, PangleAd pangleAd0, String s, boolean z, String s1) {
        if(TextUtils.isEmpty(s1) && !cRA.Zh(owx0)) {
            ReZ.PjT(ZX.PjT(5, owx0));
            return false;
        }
        switch(owx0.cI()) {
            case 2: 
            case 8: {
                return RD.PjT(context0, s1, owx0, "openDetailPage");
            }
            default: {
                com.bytedance.sdk.component.utils.Zh.PjT(context0, ZX.PjT(context0, s1, owx0, v, pAGNativeAd0, pangleAd0, s, z), null);
                ZX.PjT = false;
                return true;
            }
        }
    }

    public static boolean PjT(Context context0, Owx owx0, int v, String s, boolean z, Map map0) {
        if(owx0 == null) {
            return false;
        }
        qj qj0 = owx0.RV();
        if(qj0 != null && !TextUtils.isEmpty(qj0.PjT())) {
            if(map0 == null) {
                map0 = new HashMap();
            }
            String s1 = qj0.PjT();
            if(com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT()) {
                return com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT(context0, s1, owx0, v, map0, z);
            }
            Uri uri0 = Uri.parse(s1);
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(uri0);
            try {
                if(ub.cr().Au()) {
                    wN.PjT(owx0, s);
                }
                if(!(context0 instanceof Activity)) {
                    intent0.addFlags(0x10000000);
                }
                map0.put("can_query_install", 0);
                ReZ.PjT(owx0, s, "open_url_app", map0);
                context0.startActivity(intent0);
                xf.PjT().PjT(map0).PjT(owx0, s);
                return true;
            }
            catch(Throwable unused_ex) {
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.cr.PjT(owx0, s, (qj0 == null ? -1 : -2), (qj0 == null ? null : qj0.cr()));
        return false;
    }

    public static boolean PjT(Context context0, String s, Owx owx0, int v, String s1, boolean z) {
        try {
            context0.startActivity(ZX.PjT(context0, s, owx0, v, null, null, s1, z));
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    private static boolean PjT(Owx owx0, boolean z) {
        if(!z) {
            return false;
        }
        return owx0 == null || owx0.cI() != 4 ? false : cRA.Zh(owx0);
    }

    public static boolean Zh(Context context0, String s, Owx owx0, int v, String s1, boolean z) {
        try {
            Intent intent0 = ZX.PjT(context0, s, owx0, v, null, null, s1, z, true);
            if(!(context0 instanceof Activity)) {
                intent0.addFlags(0x10000000);
            }
            context0.startActivity(intent0);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

