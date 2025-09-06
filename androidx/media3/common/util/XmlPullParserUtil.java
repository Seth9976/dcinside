package androidx.media3.common.util;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@UnstableApi
public final class XmlPullParserUtil {
    @Nullable
    public static String a(XmlPullParser xmlPullParser0, String s) {
        int v = xmlPullParser0.getAttributeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(xmlPullParser0.getAttributeName(v1).equals(s)) {
                return xmlPullParser0.getAttributeValue(v1);
            }
        }
        return null;
    }

    @Nullable
    public static String b(XmlPullParser xmlPullParser0, String s) {
        int v = xmlPullParser0.getAttributeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(XmlPullParserUtil.h(xmlPullParser0.getAttributeName(v1)).equals(s)) {
                return xmlPullParser0.getAttributeValue(v1);
            }
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser0) throws XmlPullParserException {
        return xmlPullParser0.getEventType() == 3;
    }

    // 去混淆评级： 低(20)
    public static boolean d(XmlPullParser xmlPullParser0, String s) throws XmlPullParserException {
        return XmlPullParserUtil.c(xmlPullParser0) && xmlPullParser0.getName().equals(s);
    }

    public static boolean e(XmlPullParser xmlPullParser0) throws XmlPullParserException {
        return xmlPullParser0.getEventType() == 2;
    }

    // 去混淆评级： 低(20)
    public static boolean f(XmlPullParser xmlPullParser0, String s) throws XmlPullParserException {
        return XmlPullParserUtil.e(xmlPullParser0) && xmlPullParser0.getName().equals(s);
    }

    // 去混淆评级： 低(20)
    public static boolean g(XmlPullParser xmlPullParser0, String s) throws XmlPullParserException {
        return XmlPullParserUtil.e(xmlPullParser0) && XmlPullParserUtil.h(xmlPullParser0.getName()).equals(s);
    }

    private static String h(String s) {
        int v = s.indexOf(58);
        return v == -1 ? s : s.substring(v + 1);
    }
}

