package com.bytedance.sdk.openadsdk.core.qj.PjT.PjT;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.qj.PjT.Zh;
import com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ;
import com.bytedance.sdk.openadsdk.core.qj.cr;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class JQp extends Zh {
    static class PjT {
        final List JQp;
        String PjT;
        com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh ReZ;
        float XX;
        com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT Zh;
        String cr;
        final List cz;

        public PjT() {
            this.JQp = new ArrayList();
            this.cz = new ArrayList();
            this.XX = 1.401298E-45f;
        }

        public PjT(String s, com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT pjT$PjT0, com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh pjT$Zh0) {
            this.JQp = new ArrayList();
            this.cz = new ArrayList();
            this.XX = 1.401298E-45f;
            this.PjT(s, pjT$PjT0, pjT$Zh0);
        }

        public void PjT(String s) {
            ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(s).PjT();
            this.JQp.add(reZ0);
        }

        public void PjT(String s, com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT pjT$PjT0, com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh pjT$Zh0) {
            this.PjT = s;
            this.Zh = pjT$PjT0;
            this.ReZ = pjT$Zh0;
        }

        public void Zh(String s) {
            ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(s).PjT();
            this.cz.add(reZ0);
        }
    }

    public static final String XX;

    static {
    }

    public JQp(Context context0, int v, int v1) {
        super(context0, v, v1);
    }

    private com.bytedance.sdk.openadsdk.core.qj.PjT PjT(XmlPullParser xmlPullParser0, List list0) throws IOException, XmlPullParserException {
        xmlPullParser0.require(2, JQp.XX, "VAST");
        boolean z = false;
        String s = null;
        while(xmlPullParser0.next() != 1) {
            if(xmlPullParser0.getEventType() == 2) {
                String s1 = xmlPullParser0.getName();
                if("Error".equals(s1)) {
                    s = JQp.Zh(xmlPullParser0, s1);
                }
                else if("Ad".equals(s1)) {
                    if(this.PjT(xmlPullParser0.getAttributeValue(JQp.XX, "sequence"))) {
                        while(xmlPullParser0.next() != 3 || !"Ad".equals(xmlPullParser0.getName())) {
                            if(xmlPullParser0.getEventType() == 2) {
                                String s2 = xmlPullParser0.getName();
                                if("InLine".equals(s2)) {
                                    com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.Zh.PjT(this.Zh, xmlPullParser0, list0, this.ReZ, this.cr);
                                    if(pjT0 == null) {
                                        continue;
                                    }
                                    if(TextUtils.isEmpty(pjT0.XX())) {
                                        this.JQp = -6;
                                        return null;
                                    }
                                    return pjT0;
                                }
                                if("Wrapper".equals(s2)) {
                                    com.bytedance.sdk.openadsdk.core.qj.PjT pjT1 = this.Zh(xmlPullParser0, list0);
                                    if(pjT1 == null) {
                                        continue;
                                    }
                                    return pjT1;
                                }
                                JQp.PjT(xmlPullParser0);
                            }
                        }
                    }
                    else {
                        JQp.PjT(xmlPullParser0);
                    }
                    z = true;
                }
                else {
                    JQp.PjT(xmlPullParser0);
                }
            }
        }
        if(!z) {
            this.JQp = -4;
            this.ReZ(s);
        }
        if(this.JQp == 0) {
            this.JQp = -5;
        }
        return null;
    }

    private static List PjT(String s, boolean z) {
        return TextUtils.isEmpty(s) ? new ArrayList() : Collections.singletonList(new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(s).PjT(z).PjT());
    }

    public static List PjT(XmlPullParser xmlPullParser0, String s) throws IOException, XmlPullParserException {
        return JQp.cr(JQp.Zh(xmlPullParser0, s));
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.qj.PjT pjT0) {
        if(this.cz == null) {
            this.cz = new com.bytedance.sdk.openadsdk.core.qj.PjT.Zh.PjT();
        }
        com.bytedance.sdk.openadsdk.core.qj.PjT.Zh.PjT zh$PjT0 = this.cz;
        zh$PjT0.PjT = this.JQp;
        zh$PjT0.Zh = this.PjT;
        if(pjT0 != null) {
            zh$PjT0.ReZ = pjT0.PjT().Zh.size() <= 0;
        }
    }

    public static void PjT(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        if(xmlPullParser0.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int v = 1;
        while(v != 0) {
            switch(xmlPullParser0.next()) {
                case 2: {
                    ++v;
                    break;
                }
                case 3: {
                    --v;
                }
            }
        }
    }

    public static void PjT(XmlPullParser xmlPullParser0, String s, int v) throws XmlPullParserException, IOException {
        while(xmlPullParser0.getEventType() != 1 && (!s.equals(xmlPullParser0.getName()) || xmlPullParser0.getEventType() != v)) {
            xmlPullParser0.next();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.qj.PjT.Zh
    public com.bytedance.sdk.openadsdk.core.qj.PjT PjT(String s, List list0) {
        com.bytedance.sdk.openadsdk.core.qj.PjT pjT0;
        ByteArrayInputStream byteArrayInputStream1;
        this.JQp = 0;
        ByteArrayInputStream byteArrayInputStream0 = null;
        if(this.Zh == null) {
            this.JQp = -1;
            return null;
        }
        if(TextUtils.isEmpty(s)) {
            this.JQp = -2;
            return null;
        }
        try {
            byteArrayInputStream1 = null;
            byteArrayInputStream1 = new ByteArrayInputStream(s.getBytes("UTF-8"));
            goto label_13;
        }
        catch(Exception unused_ex) {
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
        goto label_27;
        try {
            try {
            label_13:
                XmlPullParser xmlPullParser0 = Xml.newPullParser();
                xmlPullParser0.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                xmlPullParser0.setInput(byteArrayInputStream1, "UTF-8");
                xmlPullParser0.nextTag();
                pjT0 = this.PjT(xmlPullParser0, list0);
                this.PjT(pjT0);
                goto label_30;
            }
            catch(Exception unused_ex) {
            }
        label_20:
            this.JQp = -3;
            this.PjT(null);
            if(byteArrayInputStream1 != null) {
                goto label_23;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
        try {
        label_23:
            byteArrayInputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        return null;
    label_26:
        byteArrayInputStream0 = byteArrayInputStream1;
    label_27:
        if(byteArrayInputStream0 != null) {
            try {
                byteArrayInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_30:
            byteArrayInputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        return pjT0;
    }

    private void ReZ(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        ReZ.PjT(ReZ.PjT(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(s).PjT()), (this.PjT <= 0 ? com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.XX : com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.cr), -1L, null), null);
    }

    public static int Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            return 0x80000000;
        }
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            return 0x80000000;
        }
    }

    private com.bytedance.sdk.openadsdk.core.qj.PjT Zh(XmlPullParser xmlPullParser0, List list0) throws XmlPullParserException, IOException {
        if(this.PjT >= 5) {
            JQp.PjT(xmlPullParser0);
            return null;
        }
        cr cr0 = new cr(null);
        String s = null;
        com.bytedance.sdk.openadsdk.core.qj.ReZ reZ0 = null;
        while(true) {
            if(xmlPullParser0.getEventType() == 3 && "Wrapper".equals(xmlPullParser0.getName())) {
                com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = this.PjT(s, list0);
                if(pjT0 != null) {
                    if(pjT0.ReZ() == null) {
                        pjT0.PjT(reZ0);
                    }
                    pjT0.PjT().PjT(cr0);
                }
                return pjT0;
            }
            xmlPullParser0.next();
            if(xmlPullParser0.getEventType() == 2) {
                String s1 = xmlPullParser0.getName();
                s1.hashCode();
                switch(s1) {
                    case "ClickTracking": {
                        cr0.XX(JQp.PjT(xmlPullParser0, "ClickTracking"));
                        continue;
                    }
                    case "CompanionAds": {
                        reZ0 = com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.PjT.PjT(this.Zh, xmlPullParser0);
                        continue;
                    }
                    case "Error": {
                        list0.add(new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(JQp.Zh(xmlPullParser0, "Error")).PjT());
                        continue;
                    }
                    case "Impression": {
                        break;
                    }
                    case "TrackingEvents": {
                        com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.ReZ.PjT(xmlPullParser0, cr0);
                        continue;
                    }
                    case "VASTAdTagURI": {
                        String s2 = this.Zh(JQp.Zh(xmlPullParser0, "VASTAdTagURI"), list0);
                        if(TextUtils.isEmpty(s2)) {
                            JQp.PjT(xmlPullParser0, "Wrapper", 3);
                            this.JQp = -2;
                            return null;
                        }
                        s = s2;
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
                cr0.PjT(JQp.PjT(xmlPullParser0, s1));
            }
        }
    }

    public static String Zh(XmlPullParser xmlPullParser0, String s) throws IOException, XmlPullParserException {
        String s2;
        String s1 = JQp.XX;
        xmlPullParser0.require(2, s1, s);
        if(xmlPullParser0.next() == 4) {
            s2 = xmlPullParser0.getText().trim();
            xmlPullParser0.nextTag();
        }
        else {
            s2 = "";
        }
        xmlPullParser0.require(3, s1, s);
        return s2;
    }

    private static List cr(String s) {
        return JQp.PjT(s, false);
    }
}

