package com.kakao.adfit.n;

import com.kakao.adfit.common.matrix.c;
import com.kakao.adfit.m.f;
import java.io.StringReader;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class g {
    private final a a;

    public g() {
        this.a = new a();
    }

    private final e a(XmlPullParser xmlPullParser0) {
        try {
            if(xmlPullParser0.getEventType() == 0) {
                xmlPullParser0.next();
            }
            this.k(xmlPullParser0);
            return this.a.a();
        }
        catch(Exception exception0) {
        }
        f.c("Failed to parse VAST xml.", exception0);
        RuntimeException runtimeException0 = new RuntimeException("Failed to parse VAST xml.", exception0);
        c.a.a(runtimeException0);
        return this.a.a();
    }

    private final XmlPullParser a(String s) {
        try {
            XmlPullParser xmlPullParser0 = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParser0.setInput(new StringReader(s));
            return xmlPullParser0;
        }
        catch(Exception exception0) {
            f.b("Failed to create XmlPullParser.", exception0);
            RuntimeException runtimeException0 = new RuntimeException("Failed to create XmlPullParser.", exception0);
            c.a.a(runtimeException0);
            return null;
        }
    }

    static void a(g g0, XmlPullParser xmlPullParser0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = xmlPullParser0.getName();
            L.o(s, "p.name");
        }
        g0.a(xmlPullParser0, s);
    }

    private final void a(XmlPullParser xmlPullParser0, String s) {
        xmlPullParser0.require(2, null, s);
        int v = 1;
        do {
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
        while(v > 0);
        xmlPullParser0.require(3, null, s);
    }

    private final void b(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "Ad");
        while(xmlPullParser0.nextTag() == 2) {
            if(L.g(xmlPullParser0.getName(), "InLine")) {
                this.e(xmlPullParser0);
            }
            else {
                g.a(this, xmlPullParser0, null, 2, null);
            }
        }
        xmlPullParser0.require(3, null, "Ad");
    }

    public final e b(String s) {
        L.p(s, "data");
        XmlPullParser xmlPullParser0 = this.a(s);
        return xmlPullParser0 == null ? null : this.a(xmlPullParser0);
    }

    private final void c(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "Creative");
        while(xmlPullParser0.nextTag() == 2) {
            if(L.g(xmlPullParser0.getName(), "Linear")) {
                this.f(xmlPullParser0);
            }
            else {
                g.a(this, xmlPullParser0, null, 2, null);
            }
        }
        xmlPullParser0.require(3, null, "Creative");
    }

    private final void d(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "Creatives");
        while(xmlPullParser0.nextTag() == 2) {
            if(L.g(xmlPullParser0.getName(), "Creative")) {
                this.c(xmlPullParser0);
            }
            else {
                g.a(this, xmlPullParser0, null, 2, null);
            }
        }
        xmlPullParser0.require(3, null, "Creatives");
    }

    private final void e(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "InLine");
        while(xmlPullParser0.nextTag() == 2) {
            String s = xmlPullParser0.getName();
            if(L.g(s, "Creatives")) {
                this.d(xmlPullParser0);
            }
            else if(L.g(s, "Error")) {
                String s1 = xmlPullParser0.nextText();
                L.o(s1, "p.nextText()");
                this.a.b(v.G5(s1).toString());
            }
            else {
                g.a(this, xmlPullParser0, null, 2, null);
            }
        }
        xmlPullParser0.require(3, null, "InLine");
    }

    private final void f(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "Linear");
        while(xmlPullParser0.nextTag() == 2) {
            String s = xmlPullParser0.getName();
            if(s != null) {
                switch(s) {
                    case "Duration": {
                        String s1 = xmlPullParser0.nextText();
                        L.o(s1, "p.nextText()");
                        this.a.a(v.G5(s1).toString());
                        continue;
                    }
                    case "MediaFiles": {
                        this.a.a(this.h(xmlPullParser0));
                        continue;
                    }
                    case "TrackingEvents": {
                        this.a.b(this.j(xmlPullParser0));
                        continue;
                    }
                }
            }
            g.a(this, xmlPullParser0, null, 2, null);
        }
        xmlPullParser0.require(3, null, "Linear");
    }

    private final d g(XmlPullParser xmlPullParser0) {
        d d0;
        int v2;
        int v1;
        xmlPullParser0.require(2, null, "MediaFile");
        String s = xmlPullParser0.getAttributeValue(null, "delivery");
        String s1 = xmlPullParser0.getAttributeValue(null, "type");
        if(!L.g(s, "progressive") || !L.g(s1, "video/mp4")) {
            xmlPullParser0.nextText();
            d0 = null;
        }
        else {
            com.kakao.adfit.n.d.a d$a0 = new com.kakao.adfit.n.d.a();
            String s2 = xmlPullParser0.getAttributeValue(null, "width");
            int v = 0;
            if(s2 == null) {
                v1 = 0;
            }
            else {
                L.o(s2, "getAttributeValue(null, \"width\")");
                Integer integer0 = v.b1(s2);
                v1 = integer0 == null ? 0 : ((int)integer0);
            }
            com.kakao.adfit.n.d.a d$a1 = d$a0.c(v1);
            String s3 = xmlPullParser0.getAttributeValue(null, "height");
            if(s3 == null) {
                v2 = 0;
            }
            else {
                L.o(s3, "getAttributeValue(null, \"height\")");
                Integer integer1 = v.b1(s3);
                v2 = integer1 == null ? 0 : ((int)integer1);
            }
            com.kakao.adfit.n.d.a d$a2 = d$a1.b(v2);
            String s4 = xmlPullParser0.getAttributeValue(null, "bitrate");
            if(s4 != null) {
                L.o(s4, "getAttributeValue(null, \"bitrate\")");
                Integer integer2 = v.b1(s4);
                if(integer2 != null) {
                    v = (int)integer2;
                }
            }
            com.kakao.adfit.n.d.a d$a3 = d$a2.a(v);
            String s5 = xmlPullParser0.nextText();
            L.o(s5, "p.nextText()");
            d0 = d$a3.a(v.G5(s5).toString()).a();
        }
        xmlPullParser0.require(3, null, "MediaFile");
        return d0;
    }

    private final ArrayList h(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "MediaFiles");
        ArrayList arrayList0 = new ArrayList();
        while(xmlPullParser0.nextTag() == 2) {
            if(L.g(xmlPullParser0.getName(), "MediaFile")) {
                d d0 = this.g(xmlPullParser0);
                if(d0 == null) {
                    continue;
                }
                arrayList0.add(d0);
            }
            else {
                g.a(this, xmlPullParser0, null, 2, null);
            }
        }
        xmlPullParser0.require(3, null, "MediaFiles");
        return arrayList0;
    }

    private final b i(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "Tracking");
        com.kakao.adfit.n.b.a b$a0 = new com.kakao.adfit.n.b.a().a(xmlPullParser0.getAttributeValue(null, "event")).b(xmlPullParser0.getAttributeValue(null, "offset"));
        String s = xmlPullParser0.nextText();
        L.o(s, "p.nextText()");
        b b0 = b$a0.c(v.G5(s).toString()).a();
        xmlPullParser0.require(3, null, "Tracking");
        return b0;
    }

    private final ArrayList j(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "TrackingEvents");
        ArrayList arrayList0 = new ArrayList();
        while(xmlPullParser0.nextTag() == 2) {
            if(L.g(xmlPullParser0.getName(), "Tracking")) {
                arrayList0.add(this.i(xmlPullParser0));
            }
            else {
                g.a(this, xmlPullParser0, null, 2, null);
            }
        }
        xmlPullParser0.require(3, null, "TrackingEvents");
        return arrayList0;
    }

    private final void k(XmlPullParser xmlPullParser0) {
        xmlPullParser0.require(2, null, "VAST");
        while(xmlPullParser0.nextTag() == 2) {
            if(L.g(xmlPullParser0.getName(), "Ad")) {
                this.b(xmlPullParser0);
            }
            else {
                g.a(this, xmlPullParser0, null, 2, null);
            }
        }
        xmlPullParser0.require(3, null, "VAST");
    }
}

