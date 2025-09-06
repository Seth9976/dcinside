package com.bytedance.sdk.openadsdk.qj.PjT;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.PjT.JQp;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM.Zh;
import com.bytedance.sdk.openadsdk.core.KM;
import org.json.JSONObject;

public class XX extends JQp {
    private final String PjT;
    private final KM Zh;

    public XX(String s, KM kM0) {
        this.Zh = kM0;
        this.PjT = s;
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("appInfo", new XX("appInfo", kM0));
        ub0.PjT("adInfo", new XX("adInfo", kM0));
        ub0.PjT("sendLog", new XX("sendLog", kM0));
        ub0.PjT("playable_style", new XX("playable_style", kM0));
        ub0.PjT("getTemplateInfo", new XX("getTemplateInfo", kM0));
        ub0.PjT("getTeMaiAds", new XX("getTeMaiAds", kM0));
        ub0.PjT("isViewable", new XX("isViewable", kM0));
        ub0.PjT("getScreenSize", new XX("getScreenSize", kM0));
        ub0.PjT("getCloseButtonInfo", new XX("getCloseButtonInfo", kM0));
        ub0.PjT("getVolume", new XX("getVolume", kM0));
        ub0.PjT("removeLoading", new XX("removeLoading", kM0));
        ub0.PjT("sendReward", new XX("sendReward", kM0));
        ub0.PjT("subscribe_app_ad", new XX("subscribe_app_ad", kM0));
        ub0.PjT("download_app_ad", new XX("download_app_ad", kM0));
        ub0.PjT("cancel_download_app_ad", new XX("cancel_download_app_ad", kM0));
        ub0.PjT("unsubscribe_app_ad", new XX("unsubscribe_app_ad", kM0));
        ub0.PjT("landscape_click", new XX("landscape_click", kM0));
        ub0.PjT("clickEvent", new XX("clickEvent", kM0));
        ub0.PjT("renderDidFinish", new XX("renderDidFinish", kM0));
        ub0.PjT("dynamicTrack", new XX("dynamicTrack", kM0));
        ub0.PjT("skipVideo", new XX("skipVideo", kM0));
        ub0.PjT("muteVideo", new XX("muteVideo", kM0));
        ub0.PjT("changeVideoState", new XX("changeVideoState", kM0));
        ub0.PjT("getCurrentVideoState", new XX("getCurrentVideoState", kM0));
        ub0.PjT("send_temai_product_ids", new XX("send_temai_product_ids", kM0));
        ub0.PjT("getMaterialMeta", new XX("getMaterialMeta", kM0));
        ub0.PjT("endcard_load", new XX("endcard_load", kM0));
        ub0.PjT("pauseWebView", new XX("pauseWebView", kM0));
        ub0.PjT("pauseWebViewTimers", new XX("pauseWebViewTimers", kM0));
        ub0.PjT("webview_time_track", new XX("webview_time_track", kM0));
        ub0.PjT("openPrivacy", new XX("openPrivacy", kM0));
        ub0.PjT("openAdLandPageLinks", new XX("openAdLandPageLinks", kM0));
        ub0.PjT("getNativeSiteCustomData", new XX("getNativeSiteCustomData", kM0));
        ub0.PjT("close", new XX("close", kM0));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    @Nullable
    public Object PjT(@NonNull Object object0, @NonNull cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    @Nullable
    public JSONObject PjT(@NonNull JSONObject jSONObject0, @NonNull cz cz0) throws Exception {
        Zh kM$Zh0 = new Zh();
        kM$Zh0.PjT = "call";
        kM$Zh0.ReZ = this.PjT;
        kM$Zh0.cr = jSONObject0;
        return this.Zh.PjT(kM$Zh0, 3);
    }
}

