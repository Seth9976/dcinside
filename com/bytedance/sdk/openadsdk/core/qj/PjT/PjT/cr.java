package com.bytedance.sdk.openadsdk.core.qj.PjT.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.qj.DWo;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class cr {
    public static Set PjT(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        if(xmlPullParser0 == null) {
            return new HashSet();
        }
        Set set0 = new HashSet();
        while(xmlPullParser0.next() != 3) {
            if(xmlPullParser0.getEventType() != 2) {
            }
            else if("Verification".equals(xmlPullParser0.getName())) {
                String s = xmlPullParser0.getAttributeValue(JQp.XX, "vendor");
                CharSequence charSequence0 = null;
                String s1 = null;
                String s2 = null;
                while(xmlPullParser0.getEventType() != 3 || !"Verification".equals(xmlPullParser0.getName())) {
                    xmlPullParser0.next();
                    if(xmlPullParser0.getEventType() == 2) {
                        String s3 = xmlPullParser0.getName();
                        s3.hashCode();
                        switch(s3) {
                            case "JavaScriptResource": {
                                if(!"omid".equals(xmlPullParser0.getAttributeValue(JQp.XX, "apiFramework"))) {
                                    continue;
                                }
                                charSequence0 = JQp.Zh(xmlPullParser0, "JavaScriptResource");
                                break;
                            }
                            case "Tracking": {
                                if(!"verificationNotExecuted".equals(xmlPullParser0.getAttributeValue(JQp.XX, "event"))) {
                                    continue;
                                }
                                s2 = JQp.Zh(xmlPullParser0, "Tracking");
                                break;
                            }
                            case "VerificationParameters": {
                                s1 = JQp.Zh(xmlPullParser0, "VerificationParameters");
                            }
                        }
                    }
                }
                if(TextUtils.isEmpty(charSequence0)) {
                    continue;
                }
                DWo dWo0 = DWo.PjT("omid", ((String)charSequence0), s, s1, s2);
                if(dWo0 == null) {
                    continue;
                }
                set0.add(dWo0);
            }
            else {
                JQp.PjT(xmlPullParser0);
            }
        }
        return set0;
    }
}

