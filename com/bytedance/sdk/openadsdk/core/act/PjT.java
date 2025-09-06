package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.qla.Zh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class PjT {
    private static Boolean JQp = null;
    private static String PjT = null;
    private static int ReZ = -1;
    private static int Zh = -1;
    private static volatile boolean cr = false;
    private static ActServiceConnection cz;

    static {
    }

    static boolean JQp() [...] // 潜在的解密器

    public static int PjT() [...] // 潜在的解密器

    public static String PjT(Context context0) {
        Class class0;
        String s = PjT.PjT;
        if(s != null) {
            return s;
        }
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfo0 = packageManager0.resolveActivity(intent0, 0);
            String s1 = resolveInfo0 == null ? null : resolveInfo0.activityInfo.packageName;
            List list0 = packageManager0.queryIntentActivities(intent0, 0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                ResolveInfo resolveInfo1 = (ResolveInfo)object0;
                Intent intent1 = new Intent();
                intent1.setAction("android.support.customtabs.action.CustomTabsService");
                intent1.setPackage(resolveInfo1.activityInfo.packageName);
                if(packageManager0.resolveService(intent1, 0) != null) {
                    arrayList0.add(resolveInfo1.activityInfo.packageName);
                }
            }
            if(arrayList0.isEmpty()) {
                PjT.PjT = null;
            }
            else if(!TextUtils.isEmpty(s1) && !PjT.PjT(context0, intent0) && arrayList0.contains(s1)) {
                PjT.PjT = s1;
            }
            else {
                PjT.PjT = (String)arrayList0.get(0);
            }
            if(!TextUtils.isEmpty(PjT.PjT)) {
                class0 = PjT.class;
                __monitor_enter(class0);
                goto label_29;
            }
            goto label_42;
        }
        catch(Throwable throwable0) {
            RD.Zh("CustomTabsHelper", throwable0.getMessage());
            ReZ.PjT("act_package_name", false, new Zh() {
                @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                @Nullable
                public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                    new JSONObject().put("package_name", PjT.PjT);
                    return cr.Zh().PjT("act_package_name").Zh("{}");
                }
            });
            return PjT.PjT;
        }
        try {
        label_29:
            if(!PjT.cr) {
                com.bytedance.sdk.openadsdk.core.act.PjT.1 pjT$10 = new com.bytedance.sdk.openadsdk.core.act.Zh() {
                    @Override  // com.bytedance.sdk.openadsdk.core.act.Zh
                    public void PjT() {
                        PjT.cz = null;
                    }

                    @Override  // com.bytedance.sdk.openadsdk.core.act.Zh
                    public void PjT(CustomTabsClient customTabsClient0) {
                        fDm.Zh().post(new Runnable() {
                            final com.bytedance.sdk.openadsdk.core.act.PjT.1 Zh;

                            @Override
                            public void run() {
                                try {
                                    CustomTabsCallback customTabsCallback0 = new CustomTabsCallback();
                                    com.bytedance.sdk.openadsdk.core.act.PjT.1.1.1 pjT$1$1$10 = new EngagementSignalsCallback() {
                                        final com.bytedance.sdk.openadsdk.core.act.PjT.1.1 PjT;

                                        @Override  // androidx.browser.customtabs.EngagementSignalsCallback
                                        public void onGreatestScrollPercentageIncreased(int v, @NonNull Bundle bundle0) {
                                        }

                                        @Override  // androidx.browser.customtabs.EngagementSignalsCallback
                                        public void onSessionEnded(boolean z, @NonNull Bundle bundle0) {
                                        }

                                        @Override  // androidx.browser.customtabs.EngagementSignalsCallback
                                        public void onVerticalScrollEvent(boolean z, @NonNull Bundle bundle0) {
                                        }
                                    };
                                    CustomTabsSession customTabsSession0 = customTabsClient0.k(customTabsCallback0);
                                    boolean z = false;
                                    boolean z1 = customTabsSession0 == null ? false : customTabsSession0.j(Bundle.EMPTY);
                                    if(z1) {
                                        PjT.Zh = 1;
                                        boolean z2 = customTabsSession0.q(pjT$1$1$10, Bundle.EMPTY);
                                        if(z2) {
                                            PjT.ReZ = 1;
                                        }
                                        z = z2;
                                    }
                                    else {
                                        PjT.Zh = 0;
                                    }
                                    if(z1 && z) {
                                        PjT.JQp = Boolean.TRUE;
                                        return;
                                    }
                                    PjT.JQp = Boolean.FALSE;
                                    return;
                                }
                                catch(Throwable throwable0) {
                                }
                                RD.Zh("CustomTabsHelper", throwable0.getMessage());
                            }
                        });
                    }
                };
                if(PjT.cz == null) {
                    PjT.cz = new ActServiceConnection(pjT$10);
                }
                CustomTabsClient.b(context0, PjT.PjT, PjT.cz);
                PjT.cr = true;
            }
            __monitor_exit(class0);
            goto label_42;
        }
        catch(Throwable throwable1) {
        }
        try {
            __monitor_exit(class0);
            throw throwable1;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("CustomTabsHelper", throwable0.getMessage());
    label_42:
        ReZ.PjT("act_package_name", false, new Zh() {
            @Override  // com.bytedance.sdk.openadsdk.qla.Zh
            @Nullable
            public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                new JSONObject().put("package_name", PjT.PjT);
                return cr.Zh().PjT("act_package_name").Zh("{}");
            }
        });
        return PjT.PjT;
    }

    public static void PjT(int v) {
        PjT.Zh = v;
    }

    private static boolean PjT(Context context0, Intent intent0) {
        try {
            List list0 = context0.getPackageManager().queryIntentActivities(intent0, 0x40);
            if(list0.size() == 0) {
                return false;
            }
            Iterator iterator0 = list0.iterator();
            while(true) {
            label_4:
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object0 = iterator0.next();
                ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                IntentFilter intentFilter0 = resolveInfo0.filter;
                if(intentFilter0 == null || intentFilter0.countDataAuthorities() == 0 || intentFilter0.countDataPaths() == 0) {
                }
                else if(resolveInfo0.activityInfo != null) {
                    return true;
                }
            }
        }
        catch(RuntimeException unused_ex) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            return false;
        }
        goto label_4;
    }

    public static int ReZ() [...] // 潜在的解密器

    public static int Zh() [...] // 潜在的解密器

    public static int Zh(Context context0) {
        try {
            if(!TextUtils.isEmpty(PjT.PjT(context0))) {
                return 1;
            }
        }
        catch(Throwable unused_ex) {
        }
        return 0;
    }

    public static void Zh(int v) {
        PjT.ReZ = v;
    }

    static ActServiceConnection cr() {
        return PjT.cz;
    }
}

