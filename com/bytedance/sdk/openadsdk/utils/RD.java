package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback;
import com.bytedance.sdk.openadsdk.core.act.AdActAction;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qla;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.xf;
import com.bytedance.sdk.openadsdk.qla.PjT.Zh;
import java.util.HashMap;

public class RD {
    public static boolean PjT(Activity activity0) {
        if(activity0 == null) {
            return false;
        }
        return activity0.isDestroyed() ? false : !activity0.isFinishing();
    }

    public static boolean PjT(Context context0, String s, Owx owx0, String s1) {
        if(!(context0 instanceof Activity)) {
            Activity activity0 = qla.PjT().JQp().Zh();
            if(activity0 != null && RD.PjT(activity0)) {
                context0 = activity0;
            }
        }
        else if(!RD.PjT(((Activity)context0))) {
            context0 = null;
        }
        if(context0 == null) {
            context0 = ub.PjT();
        }
        if(context0 == null) {
            return false;
        }
        String s2 = wN.PjT(owx0);
        if(!ltE.PjT(s)) {
            ReZ.PjT(RD.Zh(s1, 5, owx0));
            return false;
        }
        String s3 = Owx.Zh(context0, owx0);
        if(!TextUtils.isEmpty(s3)) {
            try {
                Builder customTabsIntent$Builder0 = new Builder();
                customTabsIntent$Builder0.T(false);
                customTabsIntent$Builder0.N(2);
                new AdActAction(context0, owx0, s1, s).PjT(new BindCustomTabsServiceCallback() {
                    @Override  // com.bytedance.sdk.openadsdk.core.act.AdActAction$BindCustomTabsServiceCallback
                    public void onBindFail(int v, String s) {
                        Zh zh0 = RD.Zh(s1, v, owx0);
                        zh0.ReZ(s);
                        ReZ.PjT(zh0);
                        RD.Zh(context0, s, owx0, s1, s2);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.core.act.AdActAction$BindCustomTabsServiceCallback
                    public void onBindSuccess(CustomTabsSession customTabsSession0) {
                        try {
                            if(customTabsSession0 != null) {
                                customTabsIntent$Builder0.J(customTabsSession0);
                            }
                            CustomTabsIntent customTabsIntent0 = customTabsIntent$Builder0.d();
                            if(!(context0 instanceof Activity)) {
                                customTabsIntent0.a.addFlags(0x10000000);
                            }
                            Uri uri0 = Uri.parse(s);
                            com.bytedance.sdk.openadsdk.core.act.ReZ.PjT(context0, s3, customTabsIntent0, uri0);
                            Context context0 = context0;
                            if(context0 instanceof TTBaseActivity) {
                                ((TTBaseActivity)context0).Zh(true);
                            }
                            Zh zh0 = RD.Zh(s1, 100, owx0);
                            zh0.PjT(true);
                            zh0.Zh(8);
                            ReZ.PjT(zh0);
                            return;
                        }
                        catch(Throwable throwable0) {
                        }
                        String s = throwable0.getMessage();
                        com.bytedance.sdk.component.utils.RD.Zh("OpenUtils", s);
                        Zh zh1 = RD.Zh(s1, 13, owx0);
                        zh1.ReZ(s);
                        ReZ.PjT(zh1);
                        RD.Zh(context0, s, owx0, s1, s2);
                    }
                });
                return true;
            }
            catch(Throwable throwable0) {
                String s4 = throwable0.getMessage();
                com.bytedance.sdk.component.utils.RD.Zh("OpenUtils", s4);
                Zh zh0 = RD.Zh(s1, 12, owx0);
                zh0.ReZ(s4);
                ReZ.PjT(zh0);
                return RD.Zh(context0, s, owx0, s1, s2);
            }
        }
        return RD.Zh(context0, s, owx0, s1, s2);
    }

    public static boolean PjT(String s) {
        return !TextUtils.isEmpty(s);
    }

    private static Zh Zh(String s, int v, Owx owx0) {
        Zh zh0 = new Zh();
        zh0.PjT(s);
        zh0.PjT(owx0);
        zh0.Zh(wN.PjT(owx0));
        zh0.PjT(v);
        zh0.PjT(false);
        zh0.Zh(owx0.cI());
        return zh0;
    }

    public static boolean Zh(Context context0, String s, Owx owx0, String s1) {
        if(!(context0 instanceof Activity)) {
            Activity activity0 = qla.PjT().JQp().Zh();
            if(activity0 != null && RD.PjT(activity0)) {
                context0 = activity0;
            }
        }
        else if(!RD.PjT(((Activity)context0))) {
            context0 = null;
        }
        if(context0 == null) {
            context0 = ub.PjT();
        }
        if(context0 == null) {
            return false;
        }
        if(!RD.PjT(s)) {
            return false;
        }
        Uri uri0 = Uri.parse(s);
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(uri0);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("deeplink_url", s);
        hashMap0.put("jsb_deeplink", 1);
        if(com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT()) {
            return com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT(context0, s, owx0, wN.Zh(owx0), hashMap0, true);
        }
        try {
            if(!(context0 instanceof Activity)) {
                intent0.addFlags(0x10000000);
            }
            ReZ.PjT(owx0, s1, "open_url_app", hashMap0);
            context0.startActivity(intent0);
            xf.PjT().PjT(hashMap0).PjT(owx0, s1);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    private static boolean Zh(Context context0, String s, Owx owx0, String s1, String s2) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        try {
            intent0.setData(Uri.parse(s));
        }
        catch(Throwable throwable0) {
            Zh zh0 = RD.Zh(s1, 6, owx0);
            zh0.ReZ(throwable0.getMessage());
            zh0.Zh(2);
            ReZ.PjT(zh0);
            return false;
        }
        if(!(context0 instanceof Activity)) {
            intent0.addFlags(0x10000000);
        }
        try {
            context0.startActivity(intent0);
            Zh zh1 = RD.Zh(s1, 100, owx0);
            zh1.PjT(true);
            zh1.Zh(2);
            ReZ.PjT(zh1);
            return true;
        }
        catch(Throwable throwable1) {
            Zh zh2 = RD.Zh(s1, 7, owx0);
            zh2.ReZ(throwable1.getMessage());
            zh2.Zh(2);
            ReZ.PjT(zh2);
            return false;
        }
    }
}

