package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.util.Set;

public class GeckoHubImp {
    static final class a {
        private static GeckoHubImp a;

        static {
            a.a = new GeckoHubImp(null);
        }
    }

    private GeckoHubImp() {
    }

    GeckoHubImp(com.bykv.vk.openvk.preload.geckox.GeckoHubImp.1 geckoHubImp$10) {
    }

    public WebResourceResponse findRes(ILoader iLoader0, String s, String s1) {
        return c.a().a(iLoader0, s, s1).getWebResourceResponse();
    }

    public WebResourceResponseModel findResAndMsg(ILoader iLoader0, String s, String s1) {
        return c.a().a(iLoader0, s, s1);
    }

    public com.bykv.vk.openvk.preload.falconx.loader.a getGeckoResLoader() {
        return c.b();
    }

    public int getResCount(ILoader iLoader0, String s) {
        return c.a(iLoader0, s);
    }

    public static GeckoHubImp inst(Context context0) {
        c.a(context0);
        return a.a;
    }

    public void preload(String s, IStatisticMonitor iStatisticMonitor0, Set set0, INetWork iNetWork0) {
        c.a().a(s, iStatisticMonitor0, set0, iNetWork0);
    }

    public void releaseGeckoResLoader(ILoader iLoader0) {
        c.a(iLoader0);
    }

    public static void setRandomHost(String s) {
        c.a(s);
    }

    public static void setThreadPoolExecutorCallback(IThreadPoolCallback iThreadPoolCallback0) {
        b.a(iThreadPoolCallback0);
    }

    class com.bykv.vk.openvk.preload.geckox.GeckoHubImp.1 {
    }

}

