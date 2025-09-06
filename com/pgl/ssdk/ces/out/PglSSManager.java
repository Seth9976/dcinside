package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";
    private static volatile PglSSManager a;
    private final b b;
    private volatile int c;

    static {
    }

    private PglSSManager(Context context0, PglSSConfig pglSSConfig0) {
        this.c = 0;
        this.b = b.a(context0, pglSSConfig0.getAppId(), pglSSConfig0.getOVRegionType(), pglSSConfig0.getCollectMode(), pglSSConfig0.getAdSdkVersion());
    }

    // 去混淆评级： 低(20)
    public void checkEventVirtual(MotionEvent motionEvent0) {
    }

    // 去混淆评级： 低(20)
    public long getECForBidding() {
        return 0L;
    }

    // 去混淆评级： 低(20)
    public Map getFeatureHash(String s, byte[] arr_b) {
        return null;
    }

    // 去混淆评级： 低(20)
    public static int getInitStatus() [...] // 潜在的解密器

    public static PglSSManager getInstance() {
        return PglSSManager.a;
    }

    public static String getLoadError() {
        return b.i() == null ? null : b.i().b;
    }

    // 去混淆评级： 低(20)
    public String getSofChara() {
        return null;
    }

    // 去混淆评级： 低(20)
    public String getToken() {
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context0, PglSSConfig pglSSConfig0, String s, String s1, String s2, String s3) {
        if(context0 == null && pglSSConfig0 == null) {
            return null;
        }
        if(PglSSManager.a == null) {
            Class class0 = PglSSManager.class;
            __monitor_enter(class0);
            try {
                if(PglSSManager.a == null) {
                    PglSSManager.a = new PglSSManager(context0, pglSSConfig0);
                }
                __monitor_exit(class0);
                return PglSSManager.a;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PglSSManager.a;
    }

    // 去混淆评级： 低(30)
    public void reportNow(String s, Map map0) {
    }

    // 去混淆评级： 低(20)
    public void setCustomInfo(Map map0) {
    }

    // 去混淆评级： 低(20)
    public void setDeviceId(String s) {
    }

    // 去混淆评级： 低(20)
    public void setGaid(String s) {
    }
}

