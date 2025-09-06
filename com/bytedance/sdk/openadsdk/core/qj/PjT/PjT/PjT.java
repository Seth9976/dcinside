package com.bytedance.sdk.openadsdk.core.qj.PjT.PjT;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh;
import com.bytedance.sdk.openadsdk.core.qj.ReZ;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PjT {
    public static ReZ PjT(Context context0, XmlPullParser xmlPullParser0) throws IOException, XmlPullParserException {
        Context context2;
        XmlPullParser xmlPullParser2;
        int v6;
        int v5;
        Context context1 = context0;
        XmlPullParser xmlPullParser1 = xmlPullParser0;
        if(context1 == null) {
            JQp.PjT(xmlPullParser0);
            return null;
        }
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        int v = displayMetrics0.heightPixels;
        float f = displayMetrics0.density;
        int v1 = (int)(((float)displayMetrics0.widthPixels) / f);
        int v2 = (int)(((float)v) / f);
        float f1 = 1.401298E-45f;
        ReZ reZ0 = null;
        while(xmlPullParser0.getEventType() != 3 || !xmlPullParser0.getName().equals("CompanionAds")) {
            xmlPullParser0.next();
            if(xmlPullParser0.getEventType() != 2 || !xmlPullParser0.getName().equals("Companion")) {
            label_92:
                v5 = v2;
                v6 = v1;
                xmlPullParser2 = xmlPullParser1;
                context2 = context1;
            }
            else {
                int v3 = JQp.Zh(xmlPullParser1.getAttributeValue(JQp.XX, "width"));
                int v4 = JQp.Zh(xmlPullParser1.getAttributeValue(JQp.XX, "height"));
                if(v3 >= 300 && v4 >= 0xFA) {
                    com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp.PjT jQp$PjT0 = new com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp.PjT();
                    while(xmlPullParser0.getEventType() != 3 || !xmlPullParser0.getName().equals("Companion")) {
                        xmlPullParser0.next();
                        if(xmlPullParser0.getEventType() == 2) {
                            String s = xmlPullParser0.getName();
                            s.hashCode();
                            switch(s) {
                                case "CompanionClickThrough": {
                                    jQp$PjT0.cr = JQp.Zh(xmlPullParser0, "CompanionClickThrough");
                                    continue;
                                }
                                case "CompanionClickTracking": {
                                    jQp$PjT0.PjT(JQp.Zh(xmlPullParser0, "CompanionClickTracking"));
                                    continue;
                                }
                                case "HTMLResource": {
                                    goto label_69;
                                }
                                case "IFrameResource": {
                                    goto label_34;
                                }
                                case "StaticResource": {
                                    goto label_53;
                                }
                                case "TrackingEvents": {
                                    goto label_47;
                                }
                            }
                            JQp.PjT(xmlPullParser0);
                            com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp.PjT jQp$PjT1 = jQp$PjT0;
                            jQp$PjT0 = jQp$PjT1;
                            continue;
                        label_34:
                            Point point0 = com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT(context0, v3, v4, Zh.PjT);
                            Zh pjT$Zh0 = Zh.ReZ;
                            com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT pjT$PjT0 = com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.PjT;
                            float f2 = ReZ.PjT(v1, v2, point0.x, point0.y, pjT$Zh0, pjT$PjT0);
                            String s1 = JQp.Zh(xmlPullParser0, "IFrameResource");
                            if(!TextUtils.isEmpty(s1) && f2 > jQp$PjT0.XX && f2 > f1) {
                                jQp$PjT0.XX = f2;
                                jQp$PjT0.PjT(s1, pjT$PjT0, pjT$Zh0);
                            }
                            else {
                                JQp.PjT(xmlPullParser0, "IFrameResource", 3);
                            }
                            continue;
                        label_47:
                            jQp$PjT1 = jQp$PjT0;
                            while(xmlPullParser0.next() != 3 || !xmlPullParser0.getName().equals("TrackingEvents")) {
                                if(xmlPullParser0.getEventType() == 2 && xmlPullParser0.getName().equals("Tracking")) {
                                    jQp$PjT1.Zh(JQp.Zh(xmlPullParser0, "Tracking"));
                                }
                            }
                            jQp$PjT0 = jQp$PjT1;
                            continue;
                        label_53:
                            jQp$PjT1 = jQp$PjT0;
                            String s2 = xmlPullParser0.getAttributeValue(JQp.XX, "creativeType").toLowerCase();
                            com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT pjT$PjT1 = com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.contains(s2) ? com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.Zh : com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.ReZ;
                            Point point1 = com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT(context0, v3, v4, Zh.Zh);
                            Zh pjT$Zh1 = Zh.Zh;
                            float f3 = ReZ.PjT(v1, v2, point1.x, point1.y, pjT$Zh1, pjT$PjT1);
                            String s3 = com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.contains(s2) || com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh.contains(s2) ? JQp.Zh(xmlPullParser0, "StaticResource") : null;
                            if(f3 >= jQp$PjT1.XX && f3 > f1 && !TextUtils.isEmpty(s3)) {
                                jQp$PjT1.XX = f3;
                                jQp$PjT1.PjT(s3, pjT$PjT1, pjT$Zh1);
                            }
                            else {
                                JQp.PjT(xmlPullParser0, "StaticResource", 3);
                            }
                            jQp$PjT0 = jQp$PjT1;
                            continue;
                        label_69:
                            Zh pjT$Zh2 = Zh.PjT;
                            Point point2 = com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT(context0, v3, v4, pjT$Zh2);
                            com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT pjT$PjT2 = com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.PjT;
                            float f4 = ReZ.PjT(v1, v2, point2.x, point2.y, pjT$Zh2, pjT$PjT2);
                            String s4 = JQp.Zh(xmlPullParser0, "HTMLResource");
                            if(!TextUtils.isEmpty(s4) && f4 > jQp$PjT0.XX && f4 > f1) {
                                jQp$PjT0.XX = f4;
                                jQp$PjT0.PjT(s4, pjT$PjT2, pjT$Zh2);
                            }
                            else {
                                JQp.PjT(xmlPullParser0, "HTMLResource", 3);
                            }
                        }
                    }
                    if(TextUtils.isEmpty(jQp$PjT0.PjT) || jQp$PjT0.XX < f1) {
                        v5 = v2;
                        v6 = v1;
                    }
                    else {
                        v5 = v2;
                        v6 = v1;
                        ReZ reZ1 = new ReZ(v3, v4, jQp$PjT0.Zh, jQp$PjT0.ReZ, jQp$PjT0.PjT, jQp$PjT0.JQp, jQp$PjT0.cz, jQp$PjT0.cr);
                        f1 = jQp$PjT0.XX;
                        reZ0 = reZ1;
                    }
                    context1 = context0;
                    xmlPullParser1 = xmlPullParser0;
                    goto label_98;
                }
                else {
                    v5 = v2;
                    v6 = v1;
                    xmlPullParser2 = xmlPullParser1;
                    context2 = context1;
                    JQp.PjT(xmlPullParser0);
                    goto label_96;
                }
                goto label_92;
            }
        label_96:
            context1 = context2;
            xmlPullParser1 = xmlPullParser2;
        label_98:
            v2 = v5;
            v1 = v6;
        }
        return reZ0;
    }
}

