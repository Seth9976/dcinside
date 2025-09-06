package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public class s {
    private static AccessibilityManager a;

    static {
    }

    private static AccessibilityManager a(Context context0) {
        if(s.a == null) {
            s.a = (AccessibilityManager)context0.getSystemService("accessibility");
        }
        return s.a;
    }

    public static String b(Context context0) {
        if(context0 == null) {
            return null;
        }
        AccessibilityManager accessibilityManager0 = s.a(context0);
        if(accessibilityManager0 == null) {
            return null;
        }
        List list0 = accessibilityManager0.getEnabledAccessibilityServiceList(-1);
        if(list0 == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < list0.size(); ++v) {
            AccessibilityServiceInfo accessibilityServiceInfo0 = (AccessibilityServiceInfo)list0.get(v);
            if(accessibilityServiceInfo0 != null) {
                stringBuilder0.append(String.format("%s#%s", accessibilityServiceInfo0.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo0.getResolveInfo().serviceInfo.name));
                if(v != list0.size() - 1) {
                    stringBuilder0.append(",");
                }
            }
        }
        return stringBuilder0.toString();
    }
}

