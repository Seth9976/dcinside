package com.fsn.cauly;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

public class CaulyBrowserUtil {
    static Intent a(Context context0, Intent intent0, String s) {
        if(context0.getPackageManager() != null && s.startsWith("http")) {
            String s1 = CaulyBrowserUtil.b(context0, "com.android.browser");
            if(!TextUtils.isEmpty(s1)) {
                intent0.setClassName("com.android.browser", s1);
                return intent0;
            }
            String s2 = CaulyBrowserUtil.b(context0, "com.android.chrome");
            if(!TextUtils.isEmpty(s2)) {
                intent0.setClassName("com.android.chrome", s2);
            }
        }
        return intent0;
    }

    static String b(Context context0, String s) {
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.setPackage(s);
        Iterator iterator0 = context0.getPackageManager().queryIntentActivities(intent0, 0x40).iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            return ((ResolveInfo)object0).activityInfo.name;
        }
        return "";
    }

    public static void openBrowser(Context context0, String s) {
        try {
            Intent intent0 = CaulyBrowserUtil.a(context0, new Intent("android.intent.action.VIEW", Uri.parse(s)), s);
            intent0.addFlags(0x10000000);
            intent0.addCategory("android.intent.category.BROWSABLE");
            intent0.putExtra("com.android.browser.application_id", "com.dcinside.app.android");
            context0.startActivity(intent0);
        }
        catch(Throwable unused_ex) {
            Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            intent1.addFlags(0x10000000);
            intent1.addCategory("android.intent.category.BROWSABLE");
            intent1.putExtra("com.android.browser.application_id", "com.dcinside.app.android");
            context0.startActivity(intent1);
        }
    }
}

