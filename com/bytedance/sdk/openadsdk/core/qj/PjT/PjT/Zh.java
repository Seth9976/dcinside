package com.bytedance.sdk.openadsdk.core.qj.PjT.PjT;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.qj.PjT;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class Zh {
    public static PjT PjT(Context context0, XmlPullParser xmlPullParser0, List list0, int v, double f) throws IOException, XmlPullParserException {
        xmlPullParser0.require(2, JQp.XX, "InLine");
        PjT pjT0 = new PjT();
        while(xmlPullParser0.next() != 3 || !"InLine".equals(xmlPullParser0.getName())) {
            if(xmlPullParser0.getEventType() == 2) {
                String s = xmlPullParser0.getName();
                s.hashCode();
                switch(s) {
                    case "AdTitle": {
                        pjT0.PjT(JQp.Zh(xmlPullParser0, s));
                        break;
                    }
                    case "AdVerifications": {
                        pjT0.PjT(cr.PjT(xmlPullParser0));
                        break;
                    }
                    case "Creatives": {
                        if(TextUtils.isEmpty(pjT0.XX()) || pjT0.ReZ() == null) {
                            while(xmlPullParser0.next() != 3) {
                                if(xmlPullParser0.getEventType() != 2) {
                                }
                                else if("Creative".equals(xmlPullParser0.getName())) {
                                    Zh.PjT(context0, xmlPullParser0, pjT0, v, f);
                                }
                                else {
                                    JQp.PjT(xmlPullParser0);
                                }
                            }
                            break;
                        }
                        else {
                            JQp.PjT(xmlPullParser0);
                            continue;
                        }
                        pjT0.Zh(JQp.Zh(xmlPullParser0, s));
                        break;
                    }
                    case "Description": {
                        pjT0.Zh(JQp.Zh(xmlPullParser0, s));
                        break;
                    }
                    case "Error": {
                        list0.addAll(JQp.PjT(xmlPullParser0, s));
                        break;
                    }
                    case "Extensions": {
                        while(xmlPullParser0.getEventType() != 3 || !"Extensions".equals(xmlPullParser0.getName())) {
                            xmlPullParser0.next();
                            if(xmlPullParser0.getEventType() == 2 && "AdVerifications".equals(xmlPullParser0.getName())) {
                                pjT0.PjT(cr.PjT(xmlPullParser0));
                            }
                        }
                        break;
                    }
                    case "Impression": {
                        pjT0.PjT().PjT(JQp.PjT(xmlPullParser0, s));
                        break;
                    }
                    default: {
                        JQp.PjT(xmlPullParser0);
                    }
                }
            }
        }
        pjT0.PjT().DWo(list0);
        return pjT0;
    }

    public static void PjT(Context context0, XmlPullParser xmlPullParser0, PjT pjT0, int v, double f) throws IOException, XmlPullParserException {
        while(xmlPullParser0.next() != 3) {
            if(xmlPullParser0.getEventType() != 2) {
            }
            else if("Linear".equals(xmlPullParser0.getName()) && TextUtils.isEmpty(pjT0.XX())) {
                ReZ.PjT(xmlPullParser0, pjT0, v, f);
            }
            else if("CompanionAds".equals(xmlPullParser0.getName()) && pjT0.ReZ() == null) {
                pjT0.PjT(com.bytedance.sdk.openadsdk.core.qj.PjT.PjT.PjT.PjT(context0, xmlPullParser0));
            }
            else {
                JQp.PjT(xmlPullParser0);
            }
        }
    }
}

