package androidx.media3.extractor.jpeg;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.XmlPullParserUtil;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class XmpMotionPhotoDescriptionParser {
    private static final String a = "MotionPhotoXmpParser";
    private static final String[] b;
    private static final String[] c;
    private static final String[] d;

    static {
        XmpMotionPhotoDescriptionParser.b = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        XmpMotionPhotoDescriptionParser.c = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        XmpMotionPhotoDescriptionParser.d = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    }

    @Nullable
    public static MotionPhotoDescription a(String s) throws IOException {
        try {
            return XmpMotionPhotoDescriptionParser.b(s);
        }
        catch(XmlPullParserException | ParserException | NumberFormatException unused_ex) {
            Log.n("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @Nullable
    private static MotionPhotoDescription b(String s) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser0 = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParser0.setInput(new StringReader(s));
        xmlPullParser0.next();
        if(!XmlPullParserUtil.f(xmlPullParser0, "x:xmpmeta")) {
            throw ParserException.a("Couldn\'t find xmp metadata", null);
        }
        O2 o20 = O2.A();
        long v = 0x8000000000000001L;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "rdf:Description")) {
                if(!XmpMotionPhotoDescriptionParser.d(xmlPullParser0)) {
                    return null;
                }
                v = XmpMotionPhotoDescriptionParser.e(xmlPullParser0);
                o20 = XmpMotionPhotoDescriptionParser.c(xmlPullParser0);
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "Container:Directory")) {
                o20 = XmpMotionPhotoDescriptionParser.f(xmlPullParser0, "Container", "Item");
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "GContainer:Directory")) {
                o20 = XmpMotionPhotoDescriptionParser.f(xmlPullParser0, "GContainer", "GContainerItem");
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "x:xmpmeta"));
        return o20.isEmpty() ? null : new MotionPhotoDescription(v, o20);
    }

    private static O2 c(XmlPullParser xmlPullParser0) {
        String[] arr_s = XmpMotionPhotoDescriptionParser.d;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = XmlPullParserUtil.a(xmlPullParser0, arr_s[v]);
            if(s != null) {
                long v1 = Long.parseLong(s);
                return O2.C(new ContainerItem("image/jpeg", "Primary", 0L, 0L), new ContainerItem("video/mp4", "MotionPhoto", v1, 0L));
            }
        }
        return O2.A();
    }

    private static boolean d(XmlPullParser xmlPullParser0) {
        String[] arr_s = XmpMotionPhotoDescriptionParser.b;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = XmlPullParserUtil.a(xmlPullParser0, arr_s[v]);
            if(s != null) {
                return Integer.parseInt(s) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser0) {
        String[] arr_s = XmpMotionPhotoDescriptionParser.c;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = XmlPullParserUtil.a(xmlPullParser0, arr_s[v]);
            if(s != null) {
                long v1 = Long.parseLong(s);
                return v1 == -1L ? 0x8000000000000001L : v1;
            }
        }
        return 0x8000000000000001L;
    }

    private static O2 f(XmlPullParser xmlPullParser0, String s, String s1) throws XmlPullParserException, IOException {
        a o2$a0 = O2.n();
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, s + ":Item")) {
                String s2 = XmlPullParserUtil.a(xmlPullParser0, s1 + ":Mime");
                String s3 = XmlPullParserUtil.a(xmlPullParser0, s1 + ":Semantic");
                String s4 = XmlPullParserUtil.a(xmlPullParser0, s1 + ":Length");
                String s5 = XmlPullParserUtil.a(xmlPullParser0, s1 + ":Padding");
                if(s2 != null && s3 != null) {
                    o2$a0.j(new ContainerItem(s2, s3, (s4 == null ? 0L : Long.parseLong(s4)), (s5 == null ? 0L : Long.parseLong(s5))));
                    continue;
                }
                return O2.A();
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, s + ":Directory"));
        return o2$a0.n();
    }
}

