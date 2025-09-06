package com.bytedance.sdk.openadsdk.XX;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class Zh {
    public interface PjT {
        void PjT();
    }

    static class com.bytedance.sdk.openadsdk.XX.Zh.Zh {
        private static final Zh PjT;

        static {
            com.bytedance.sdk.openadsdk.XX.Zh.Zh.PjT = new Zh(null);
        }
    }

    private static final String[] PjT;

    static {
        Zh.PjT = new String[]{"gecko16-normal-useast5.tiktokv.us"};
    }

    private Zh() {
        try {
            GeckoHubImp.inst(ub.PjT());
        }
        catch(Throwable throwable0) {
            RD.PjT("GeckoHub", "GeckoHubImp init error", throwable0);
        }
    }

    Zh(com.bytedance.sdk.openadsdk.XX.Zh.1 zh$10) {
    }

    public static Zh PjT() {
        return com.bytedance.sdk.openadsdk.XX.Zh.Zh.PjT;
    }

    public int PjT(ILoader iLoader0, String s) {
        try {
            return GeckoHubImp.inst(ub.PjT()).getResCount(iLoader0, s);
        }
        catch(Throwable throwable0) {
            RD.PjT("GeckoHub", "getResCount error", throwable0);
            return 0;
        }
    }

    public WebResourceResponseModel PjT(ILoader iLoader0, String s, String s1) {
        if(iLoader0 != null) {
            try {
                return GeckoHubImp.inst(ub.PjT()).findResAndMsg(iLoader0, s, s1);
            }
            catch(Throwable throwable0) {
                RD.PjT("GeckoHub", "findRes error", throwable0);
            }
        }
        return null;
    }

    public void PjT(ILoader iLoader0) {
        if(iLoader0 != null) {
            try {
                GeckoHubImp.inst(ub.PjT()).releaseGeckoResLoader(iLoader0);
            }
            catch(Throwable throwable0) {
                RD.PjT("GeckoHub", "releaseGeckoResLoader error", throwable0);
            }
        }
    }

    public void PjT(Map map0) {
        this.PjT(map0, null, false);
    }

    public void PjT(Map map0, PjT zh$PjT0, boolean z) {
        try {
            String s = xf.PjT(ub.PjT());
            if(TextUtils.isEmpty(s)) {
                return;
            }
            for(Object object0: map0.values()) {
                Owx owx0 = (Owx)object0;
                if(owx0 == null) {
                }
                else if(!z && owx0.AK()) {
                    map0.remove(owx0.MN());
                }
                else {
                    ReZ.Zh(owx0);
                }
            }
            if(map0.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(Zh.cr());
            GeckoHubImp.inst(ub.PjT()).preload(s, new IStatisticMonitor() {
                final Zh ReZ;

                @Override  // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String s, JSONObject jSONObject0) {
                    if("geckosdk_update_stats".equals(s)) {
                        String s1 = jSONObject0.optString("channel");
                        Owx owx0 = (Owx)map0.get(s1);
                        if(owx0 != null) {
                            com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(s, jSONObject0, owx0);
                        }
                        return;
                    }
                    if("download_gecko_end".equals(s)) {
                        PjT zh$PjT0 = zh$PjT0;
                        if(zh$PjT0 != null) {
                            zh$PjT0.PjT();
                        }
                        Zh.Zh(map0, jSONObject0, "");
                    }
                }
            }, map0.keySet(), new com.bytedance.sdk.openadsdk.XX.PjT());
            return;
        }
        catch(Throwable throwable0) {
        }
        Zh.Zh(map0, null, throwable0.toString());
        RD.PjT("GeckoHub", "releaseGeckoResLoader error", throwable0);
    }

    public static void ReZ() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() {
                @Override  // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return Jo.JQp();
                }
            });
        }
        catch(Throwable throwable0) {
            RD.PjT("GeckoHub", "setThreadPoolExecutor error", throwable0);
        }
    }

    private static void Zh(Map map0, JSONObject jSONObject0, String s) {
        try {
            JSONObject jSONObject1 = new JSONObject();
            if(jSONObject0 == null) {
                jSONObject1.put("success", false);
                jSONObject1.put("msg", s);
                jSONObject1.put("code", 1);
                jSONObject0 = jSONObject1;
            }
            for(Object object0: map0.values()) {
                ReZ.PjT(((Owx)object0), jSONObject0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("GeckoHub", "upLoadStateEvent error", throwable0);
    }

    public ILoader Zh() {
        try {
            return GeckoHubImp.inst(ub.PjT()).getGeckoResLoader();
        }
        catch(Throwable throwable0) {
            RD.PjT("GeckoHub", "getGeckoResLoader error", throwable0);
            return null;
        }
    }

    private static String cr() {
        String[] arr_s = ub.cr().oG();
        if(arr_s == null) {
            arr_s = Zh.PjT;
        }
        String s = arr_s[new SecureRandom().nextInt(arr_s.length)];
        return TextUtils.isEmpty(s) ? Zh.PjT[new SecureRandom().nextInt(Zh.PjT.length)] : s;
    }
}

