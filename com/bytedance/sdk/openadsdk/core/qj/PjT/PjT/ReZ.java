package com.bytedance.sdk.openadsdk.core.qj.PjT.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.qj.ReZ.cr;
import com.bytedance.sdk.openadsdk.core.qj.Zh.PjT;
import com.bytedance.sdk.openadsdk.core.qj.Zh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ReZ {
    // This method was un-flattened
    public static Zh PjT(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        Zh zh1;
        Zh zh2;
        int v4;
        Zh zh0 = null;
        while(xmlPullParser0.getEventType() != 3 || !xmlPullParser0.getName().equals("Icons")) {
            xmlPullParser0.next();
            if(xmlPullParser0.getEventType() != 2 || !xmlPullParser0.getName().equals("Icon")) {
            label_86:
                zh1 = zh0;
            }
            else {
                String s = JQp.XX;
                int v = JQp.Zh(xmlPullParser0.getAttributeValue(s, "width"));
                int v1 = JQp.Zh(xmlPullParser0.getAttributeValue(s, "height"));
                if(v > 0 && v <= 300 && v1 > 0 && v1 <= 300) {
                    int v2 = PjT.PjT(xmlPullParser0.getAttributeValue(s, "offset"));
                    int v3 = PjT.PjT(xmlPullParser0.getAttributeValue(s, "duration"));
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp.PjT jQp$PjT0 = null;
                    String s1 = null;
                    while(xmlPullParser0.next() != 3 || !xmlPullParser0.getName().equals("Icon")) {
                        if(xmlPullParser0.getEventType() == 2) {
                            String s2 = xmlPullParser0.getName();
                            s2.hashCode();
                            switch(s2.hashCode()) {
                                case 0xC1C22FB5: {
                                    v4 = v3;
                                    if(s2.equals("IconViewTracking")) {
                                        zh2 = zh0;
                                        arrayList1.add(new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(JQp.Zh(xmlPullParser0, "IconViewTracking")).PjT());
                                        goto label_78;
                                    }
                                    else {
                                        zh2 = zh0;
                                        break;
                                    }
                                    goto label_32;
                                }
                                case 0xE9A0C2D2: {
                                label_32:
                                    if(s2.equals("IFrameResource")) {
                                        v4 = v3;
                                        zh2 = zh0;
                                        if(jQp$PjT0 == null) {
                                            jQp$PjT0 = new com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp.PjT(JQp.Zh(xmlPullParser0, "IFrameResource"), com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.PjT, com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh.ReZ);
                                            goto label_78;
                                        }
                                    }
                                    else {
                                        v4 = v3;
                                        zh2 = zh0;
                                    }
                                    break;
                                }
                                case 0x285474BC: {
                                    v4 = v3;
                                    if(s2.equals("StaticResource")) {
                                        zh2 = zh0;
                                        String s3 = xmlPullParser0.getAttributeValue(JQp.XX, "creativeType").toLowerCase();
                                        jQp$PjT0 = new com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp.PjT((com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.contains(s3) || com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh.contains(s3) ? JQp.Zh(xmlPullParser0, "StaticResource") : null), (com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.contains(s3) ? com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.Zh : com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.ReZ), com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh.Zh);
                                        goto label_78;
                                    }
                                    else {
                                        zh2 = zh0;
                                        break;
                                    }
                                    goto label_49;
                                }
                                case 0x3D6FF1E4: {
                                label_49:
                                    v4 = v3;
                                    if(s2.equals("IconClicks")) {
                                        zh2 = zh0;
                                        while(xmlPullParser0.next() != 3 || !xmlPullParser0.getName().equals("IconClicks")) {
                                            if(xmlPullParser0.getEventType() != 2) {
                                            }
                                            else if(xmlPullParser0.getName().equals("IconClickThrough")) {
                                                s1 = JQp.Zh(xmlPullParser0, "IconClickThrough");
                                            }
                                            else if(xmlPullParser0.getName().equals("IconClickTracking")) {
                                                arrayList0.add(new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(JQp.Zh(xmlPullParser0, "IconClickTracking")).PjT());
                                            }
                                        }
                                        goto label_78;
                                    }
                                    else {
                                        zh2 = zh0;
                                        break;
                                    }
                                    goto label_63;
                                }
                                case 0x72EF4CD9: {
                                label_63:
                                    if(s2.equals("HTMLResource")) {
                                        v4 = v3;
                                        if(jQp$PjT0 == null) {
                                            zh2 = zh0;
                                        }
                                        else {
                                            zh2 = zh0;
                                            if(jQp$PjT0.ReZ != com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh.ReZ) {
                                                break;
                                            }
                                        }
                                        jQp$PjT0 = new com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.JQp.PjT(JQp.Zh(xmlPullParser0, "HTMLResource"), com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT.PjT, com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh.PjT);
                                        goto label_78;
                                    }
                                    else {
                                        v4 = v3;
                                        zh2 = zh0;
                                    }
                                    break;
                                }
                                default: {
                                    v4 = v3;
                                    zh2 = zh0;
                                }
                            }
                            JQp.PjT(xmlPullParser0);
                        }
                        else {
                            v4 = v3;
                            zh2 = zh0;
                        }
                    label_78:
                        zh0 = zh2;
                        v3 = v4;
                    }
                    if(jQp$PjT0 == null || zh0 != null && !TextUtils.isEmpty(zh0.cz())) {
                        continue;
                    }
                    Zh zh3 = new Zh(v, v1, ((long)v2), ((long)v3), jQp$PjT0.Zh, jQp$PjT0.ReZ, jQp$PjT0.PjT, arrayList0, arrayList1, s1);
                    JQp.PjT(xmlPullParser0, "Icons", 3);
                    zh0 = zh3;
                    continue;
                }
                else {
                    zh1 = zh0;
                    JQp.PjT(xmlPullParser0);
                    goto label_87;
                }
                goto label_86;
            }
        label_87:
            zh0 = zh1;
        }
        return zh0;
    }

    private static String PjT(XmlPullParser xmlPullParser0, int v, double f, com.bytedance.sdk.openadsdk.core.qj.PjT pjT0) throws IOException, XmlPullParserException {
        double f1 = -Infinity;
        String s = null;
        int v1 = 0x80000000;
        int v2 = 0x80000000;
        while(xmlPullParser0.next() != 3 || !xmlPullParser0.getName().equals("MediaFiles")) {
            if(xmlPullParser0.getEventType() == 2 && xmlPullParser0.getName().equals("MediaFile")) {
                String s1 = xmlPullParser0.getAttributeValue(JQp.XX, "type");
                int v3 = JQp.Zh(xmlPullParser0.getAttributeValue(JQp.XX, "width"));
                int v4 = JQp.Zh(xmlPullParser0.getAttributeValue(JQp.XX, "height"));
                int v5 = JQp.Zh(xmlPullParser0.getAttributeValue(JQp.XX, "bitrate"));
                String s2 = JQp.Zh(xmlPullParser0, "MediaFile");
                if(v3 > 0 && v4 > 0 && cr.PjT.contains(s1) && !TextUtils.isEmpty(s2)) {
                    double f2 = cr.PjT(v, f, v3, v4, v5, s1);
                    if(f2 > f1) {
                        s = s2;
                        f1 = f2;
                        v1 = v3;
                        v2 = v4;
                    }
                }
            }
        }
        if(!TextUtils.isEmpty(s)) {
            pjT0.cr(s);
            pjT0.PjT(v1);
            pjT0.Zh(v2);
        }
        return s;
    }

    private static void PjT(XmlPullParser xmlPullParser0, com.bytedance.sdk.openadsdk.core.qj.PjT pjT0) throws IOException, XmlPullParserException {
        while(xmlPullParser0.next() != 3 || !xmlPullParser0.getName().equals("VideoClicks")) {
            if(xmlPullParser0.getEventType() == 2) {
                String s = xmlPullParser0.getName();
                s.hashCode();
                if(s.equals("ClickThrough")) {
                    pjT0.ReZ(JQp.Zh(xmlPullParser0, "ClickThrough"));
                }
                else if(s.equals("ClickTracking")) {
                    pjT0.PjT().XX(JQp.PjT(xmlPullParser0, "ClickTracking"));
                }
                else {
                    JQp.PjT(xmlPullParser0);
                }
            }
        }
    }

    public static void PjT(XmlPullParser xmlPullParser0, com.bytedance.sdk.openadsdk.core.qj.PjT pjT0, int v, double f) throws IOException, XmlPullParserException {
        boolean z = false;
        while(xmlPullParser0.next() != 3 || !xmlPullParser0.getName().equals("Linear")) {
            if(xmlPullParser0.getEventType() == 2) {
                if(z && TextUtils.isEmpty(pjT0.XX())) {
                    JQp.PjT(xmlPullParser0);
                }
                String s = xmlPullParser0.getName();
                s.hashCode();
                switch(s) {
                    case "Duration": {
                        pjT0.PjT(ReZ.Zh(xmlPullParser0));
                        break;
                    }
                    case "Icons": {
                        Zh zh0 = ReZ.PjT(xmlPullParser0);
                        if(zh0 == null || pjT0.Zh() != null) {
                            continue;
                        }
                        pjT0.PjT(zh0);
                        break;
                    }
                    case "MediaFiles": {
                        ReZ.PjT(xmlPullParser0, v, f, pjT0);
                        z = true;
                        break;
                    }
                    case "TrackingEvents": {
                        ReZ.PjT(xmlPullParser0, pjT0.PjT());
                        break;
                    }
                    case "VideoClicks": {
                        ReZ.PjT(xmlPullParser0, pjT0);
                        break;
                    }
                    default: {
                        JQp.PjT(xmlPullParser0);
                    }
                }
            }
        }
    }

    public static void PjT(XmlPullParser xmlPullParser0, com.bytedance.sdk.openadsdk.core.qj.cr cr0) throws IOException, XmlPullParserException {
        while(xmlPullParser0.next() != 3 || !xmlPullParser0.getName().equals("TrackingEvents")) {
            if(xmlPullParser0.getEventType() != 2) {
            }
            else if("Tracking".equals(xmlPullParser0.getName())) {
                String s = xmlPullParser0.getAttributeValue(JQp.XX, "event");
                if(TextUtils.isEmpty(s)) {
                    JQp.PjT(xmlPullParser0, "Tracking", 3);
                }
                else {
                    s.hashCode();
                    switch(s) {
                        case "close": {
                            cr0.JQp(ReZ.ReZ(xmlPullParser0));
                            break;
                        }
                        case "complete": {
                            cr0.cr(ReZ.ReZ(xmlPullParser0));
                            break;
                        }
                        case "creativeView": {
                            cr0.PjT(JQp.Zh(xmlPullParser0, "Tracking"), 0L);
                            break;
                        }
                        case "firstQuartile": {
                            cr0.PjT(JQp.Zh(xmlPullParser0, "Tracking"), 0.25f);
                            break;
                        }
                        case "midpoint": {
                            cr0.PjT(JQp.Zh(xmlPullParser0, "Tracking"), 0.5f);
                            break;
                        }
                        case "mute": {
                            cr0.qj(ReZ.ReZ(xmlPullParser0));
                            break;
                        }
                        case "pause": {
                            cr0.Zh(ReZ.ReZ(xmlPullParser0));
                            break;
                        }
                        case "resume": {
                            cr0.ReZ(ReZ.ReZ(xmlPullParser0));
                            break;
                        }
                        case "skip": {
                            cr0.cz(ReZ.ReZ(xmlPullParser0));
                            break;
                        }
                        case "start": {
                            cr0.PjT(JQp.Zh(xmlPullParser0, "Tracking"), 0L);
                            break;
                        }
                        case "thirdQuartile": {
                            cr0.PjT(JQp.Zh(xmlPullParser0, "Tracking"), 0.75f);
                            break;
                        }
                        case "unmute": {
                            cr0.xf(ReZ.ReZ(xmlPullParser0));
                        }
                    }
                }
            }
            else if(xmlPullParser0.getEventType() == 4) {
                xmlPullParser0.nextTag();
            }
            else {
                JQp.PjT(xmlPullParser0);
            }
        }
    }

    private static List ReZ(XmlPullParser xmlPullParser0) throws IOException, XmlPullParserException {
        return JQp.PjT(xmlPullParser0, "Tracking");
    }

    public static double Zh(XmlPullParser xmlPullParser0) throws IOException, XmlPullParserException {
        String[] arr_s = JQp.Zh(xmlPullParser0, "Duration").split(":");
        if(arr_s.length == 3) {
            try {
                return (double)(((float)(Integer.parseInt(arr_s[0].trim()) * 3600 + Integer.parseInt(arr_s[1].trim()) * 60)) + Float.parseFloat(arr_s[2].trim()));
            }
            catch(Exception unused_ex) {
            }
        }
        return 0.0;
    }
}

