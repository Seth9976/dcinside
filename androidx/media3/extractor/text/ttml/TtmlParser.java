package androidx.media3.extractor.text.ttml;

import android.text.Layout.Alignment;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser.OutputOptions;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.e;
import com.google.common.base.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

@UnstableApi
public final class TtmlParser implements SubtitleParser {
    static final class FrameAndTickRate {
        final float a;
        final int b;
        final int c;

        FrameAndTickRate(float f, int v, int v1) {
            this.a = f;
            this.b = v;
            this.c = v1;
        }
    }

    static final class TtsExtent {
        final int a;
        final int b;

        TtsExtent(int v, int v1) {
            this.a = v;
            this.b = v1;
        }
    }

    private final XmlPullParserFactory a;
    public static final int b = 1;
    private static final String c = "TtmlParser";
    private static final String d = "http://www.w3.org/ns/ttml#parameter";
    private static final String e = "begin";
    private static final String f = "dur";
    private static final String g = "end";
    private static final String h = "style";
    private static final String i = "region";
    private static final String j = "backgroundImage";
    private static final Pattern k = null;
    private static final Pattern l = null;
    private static final Pattern m = null;
    static final Pattern n = null;
    static final Pattern o = null;
    private static final Pattern p = null;
    private static final Pattern q = null;
    private static final int r = 30;
    private static final FrameAndTickRate s = null;
    private static final int t = 15;

    static {
        TtmlParser.k = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        TtmlParser.l = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        TtmlParser.m = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        TtmlParser.n = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        TtmlParser.o = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
        TtmlParser.p = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
        TtmlParser.q = Pattern.compile("^(\\d+) (\\d+)$");
        TtmlParser.s = new FrameAndTickRate(30.0f, 1, 1);
    }

    public TtmlParser() {
        try {
            XmlPullParserFactory xmlPullParserFactory0 = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactory0;
            xmlPullParserFactory0.setNamespaceAware(true);
        }
        catch(XmlPullParserException xmlPullParserException0) {
            throw new RuntimeException("Couldn\'t create XmlPullParserFactory instance", xmlPullParserException0);
        }
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        LegacySubtitleUtil.c(this.d(arr_b, v, v1), subtitleParser$OutputOptions0, consumer0);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public int b() {
        return 1;
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void c(byte[] arr_b, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        e.a(this, arr_b, subtitleParser$OutputOptions0, consumer0);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public Subtitle d(byte[] arr_b, int v, int v1) {
        FrameAndTickRate ttmlParser$FrameAndTickRate1;
        try {
            XmlPullParser xmlPullParser0 = this.a.newPullParser();
            HashMap hashMap0 = new HashMap();
            HashMap hashMap1 = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap1.put("", new TtmlRegion(""));
            TtsExtent ttmlParser$TtsExtent0 = null;
            xmlPullParser0.setInput(new ByteArrayInputStream(arr_b, v, v1), null);
            ArrayDeque arrayDeque0 = new ArrayDeque();
            int v2 = xmlPullParser0.getEventType();
            FrameAndTickRate ttmlParser$FrameAndTickRate0 = TtmlParser.s;
            TtmlSubtitle ttmlSubtitle0 = null;
            int v3 = 15;
            int v4 = 0;
            while(true) {
                if(v2 == 1) {
                    return (Subtitle)Assertions.g(ttmlSubtitle0);
                }
                TtmlNode ttmlNode0 = (TtmlNode)arrayDeque0.peek();
                if(v4 == 0) {
                    String s = xmlPullParser0.getName();
                    if(v2 == 2) {
                        if("tt".equals(s)) {
                            ttmlParser$FrameAndTickRate0 = TtmlParser.j(xmlPullParser0);
                            v3 = TtmlParser.h(xmlPullParser0, 15);
                            ttmlParser$TtsExtent0 = TtmlParser.s(xmlPullParser0);
                        }
                        if(TtmlParser.f(s)) {
                            if("head".equals(s)) {
                                ttmlParser$FrameAndTickRate1 = ttmlParser$FrameAndTickRate0;
                                TtmlParser.k(xmlPullParser0, hashMap0, v3, ttmlParser$TtsExtent0, hashMap1, hashMap2);
                            }
                            else {
                                try {
                                    ttmlParser$FrameAndTickRate1 = ttmlParser$FrameAndTickRate0;
                                    TtmlNode ttmlNode1 = TtmlParser.m(xmlPullParser0, ttmlNode0, hashMap1, ttmlParser$FrameAndTickRate1);
                                    arrayDeque0.push(ttmlNode1);
                                    if(ttmlNode0 != null) {
                                        ttmlNode0.a(ttmlNode1);
                                    }
                                }
                                catch(SubtitleDecoderException subtitleDecoderException0) {
                                    Log.o("TtmlParser", "Suppressing parser error", subtitleDecoderException0);
                                    v4 = 1;
                                }
                            }
                            ttmlParser$FrameAndTickRate0 = ttmlParser$FrameAndTickRate1;
                        }
                        else {
                            Log.h("TtmlParser", "Ignoring unsupported tag: " + xmlPullParser0.getName());
                            v4 = 1;
                        }
                    }
                    else {
                        switch(v2) {
                            case 3: {
                                if(xmlPullParser0.getName().equals("tt")) {
                                    ttmlSubtitle0 = new TtmlSubtitle(((TtmlNode)Assertions.g(((TtmlNode)arrayDeque0.peek()))), hashMap0, hashMap1, hashMap2);
                                }
                                arrayDeque0.pop();
                                break;
                            }
                            case 4: {
                                ((TtmlNode)Assertions.g(ttmlNode0)).a(TtmlNode.d(xmlPullParser0.getText()));
                            }
                        }
                    }
                }
                else {
                    switch(v2) {
                        case 2: {
                            ++v4;
                            break;
                        }
                        case 3: {
                            --v4;
                        }
                    }
                }
                xmlPullParser0.next();
                v2 = xmlPullParser0.getEventType();
            }
            throw new IllegalStateException("Unexpected error when reading input.", iOException0);
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            throw new IllegalStateException("Unexpected error when reading input.", iOException0);
        }
        throw new IllegalStateException("Unable to decode source", xmlPullParserException0);
    }

    private static TtmlStyle e(@Nullable TtmlStyle ttmlStyle0) {
        return ttmlStyle0 == null ? new TtmlStyle() : ttmlStyle0;
    }

    // 去混淆评级： 中等(150)
    private static boolean f(String s) {
        return s.equals("tt") || s.equals("head") || s.equals("body") || s.equals("div") || s.equals("p") || s.equals("span") || s.equals("br") || s.equals("style") || s.equals("styling") || s.equals("layout") || s.equals("region") || s.equals("metadata") || s.equals("image") || s.equals("data") || s.equals("information");
    }

    @Nullable
    private static Layout.Alignment g(String s) {
        String s1 = c.g(s);
        s1.hashCode();
        switch(s1) {
            case "center": {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case "end": {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case "left": {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case "right": {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case "start": {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            default: {
                return null;
            }
        }
    }

    private static int h(XmlPullParser xmlPullParser0, int v) {
        String s = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if(s == null) {
            return v;
        }
        Matcher matcher0 = TtmlParser.q.matcher(s);
        if(!matcher0.matches()) {
            Log.n("TtmlParser", "Ignoring malformed cell resolution: " + s);
            return v;
        }
        try {
            boolean z = true;
            int v1 = Integer.parseInt(((String)Assertions.g(matcher0.group(1))));
            int v2 = Integer.parseInt(((String)Assertions.g(matcher0.group(2))));
            if(v1 == 0 || v2 == 0) {
                z = false;
            }
            Assertions.b(z, "Invalid cell resolution " + v1 + " " + v2);
            return v2;
        }
        catch(NumberFormatException unused_ex) {
            Log.n("TtmlParser", "Ignoring malformed cell resolution: " + s);
            return v;
        }
    }

    private static void i(String s, TtmlStyle ttmlStyle0) throws SubtitleDecoderException {
        Matcher matcher0;
        String[] arr_s = Util.m2(s, "\\s+");
        if(arr_s.length == 1) {
            matcher0 = TtmlParser.m.matcher(s);
        }
        else if(arr_s.length == 2) {
            matcher0 = TtmlParser.m.matcher(arr_s[1]);
            Log.n("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        else {
            throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + arr_s.length + ".");
        }
        if(!matcher0.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: \'" + s + "\'.");
        }
        String s1 = (String)Assertions.g(matcher0.group(3));
        s1.hashCode();
        switch(s1) {
            case "%": {
                ttmlStyle0.A(3);
                break;
            }
            case "em": {
                ttmlStyle0.A(2);
                break;
            }
            case "px": {
                ttmlStyle0.A(1);
                break;
            }
            default: {
                throw new SubtitleDecoderException("Invalid unit for fontSize: \'" + s1 + "\'.");
            }
        }
        ttmlStyle0.z(Float.parseFloat(((String)Assertions.g(matcher0.group(1)))));
    }

    private static FrameAndTickRate j(XmlPullParser xmlPullParser0) {
        float f;
        String s = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int v = s == null ? 30 : Integer.parseInt(s);
        String s1 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if(s1 == null) {
            f = 1.0f;
        }
        else {
            String[] arr_s = Util.m2(s1, " ");
            Assertions.b(arr_s.length == 2, "frameRateMultiplier doesn\'t have 2 parts");
            f = ((float)Integer.parseInt(arr_s[0])) / ((float)Integer.parseInt(arr_s[1]));
        }
        FrameAndTickRate ttmlParser$FrameAndTickRate0 = TtmlParser.s;
        int v1 = ttmlParser$FrameAndTickRate0.b;
        String s2 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if(s2 != null) {
            v1 = Integer.parseInt(s2);
        }
        int v2 = ttmlParser$FrameAndTickRate0.c;
        String s3 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if(s3 != null) {
            v2 = Integer.parseInt(s3);
        }
        return new FrameAndTickRate(((float)v) * f, v1, v2);
    }

    private static Map k(XmlPullParser xmlPullParser0, Map map0, int v, @Nullable TtsExtent ttmlParser$TtsExtent0, Map map1, Map map2) throws IOException, XmlPullParserException {
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "style")) {
                String s = XmlPullParserUtil.a(xmlPullParser0, "style");
                TtmlStyle ttmlStyle0 = TtmlParser.p(xmlPullParser0, new TtmlStyle());
                if(s != null) {
                    String[] arr_s = TtmlParser.q(s);
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        ttmlStyle0.a(((TtmlStyle)map0.get(arr_s[v1])));
                    }
                }
                String s1 = ttmlStyle0.g();
                if(s1 != null) {
                    map0.put(s1, ttmlStyle0);
                }
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "region")) {
                TtmlRegion ttmlRegion0 = TtmlParser.n(xmlPullParser0, v, ttmlParser$TtsExtent0);
                if(ttmlRegion0 != null) {
                    map1.put(ttmlRegion0.a, ttmlRegion0);
                }
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "metadata")) {
                TtmlParser.l(xmlPullParser0, map2);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "head"));
        return map0;
    }

    private static void l(XmlPullParser xmlPullParser0, Map map0) throws IOException, XmlPullParserException {
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "image")) {
                String s = XmlPullParserUtil.a(xmlPullParser0, "id");
                if(s != null) {
                    map0.put(s, xmlPullParser0.nextText());
                }
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "metadata"));
    }

    // This method was un-flattened
    private static TtmlNode m(XmlPullParser xmlPullParser0, @Nullable TtmlNode ttmlNode0, Map map0, FrameAndTickRate ttmlParser$FrameAndTickRate0) throws SubtitleDecoderException {
        int v = xmlPullParser0.getAttributeCount();
        TtmlStyle ttmlStyle0 = TtmlParser.p(xmlPullParser0, null);
        String s = null;
        String s1 = "";
        long v1 = 0x8000000000000001L;
        long v2 = 0x8000000000000001L;
        long v3 = 0x8000000000000001L;
        String[] arr_s = null;
        for(int v4 = 0; v4 < v; ++v4) {
            String s2 = xmlPullParser0.getAttributeName(v4);
            String s3 = xmlPullParser0.getAttributeValue(v4);
            s2.hashCode();
            switch(s2) {
                case "backgroundImage": {
                    if(s3.startsWith("#")) {
                        s = s3.substring(1);
                    }
                    break;
                }
                case "begin": {
                    v1 = TtmlParser.r(s3, ttmlParser$FrameAndTickRate0);
                    break;
                }
                case "dur": {
                    v3 = TtmlParser.r(s3, ttmlParser$FrameAndTickRate0);
                    break;
                }
                case "end": {
                    v2 = TtmlParser.r(s3, ttmlParser$FrameAndTickRate0);
                    break;
                }
                case "region": {
                    if(map0.containsKey(s3)) {
                        s1 = s3;
                    }
                    break;
                }
                case "style": {
                    String[] arr_s1 = TtmlParser.q(s3);
                    if(arr_s1.length > 0) {
                        arr_s = arr_s1;
                    }
                }
            }
        }
        if(ttmlNode0 != null) {
            long v5 = ttmlNode0.d;
            if(v5 != 0x8000000000000001L) {
                if(v1 != 0x8000000000000001L) {
                    v1 += v5;
                }
                if(v2 != 0x8000000000000001L) {
                    v2 += v5;
                }
            }
        }
        if(v2 == 0x8000000000000001L) {
            if(v3 != 0x8000000000000001L) {
                return TtmlNode.c(xmlPullParser0.getName(), v1, v1 + v3, ttmlStyle0, arr_s, s1, s, ttmlNode0);
            }
            if(ttmlNode0 != null) {
                return ttmlNode0.e == 0x8000000000000001L ? TtmlNode.c(xmlPullParser0.getName(), v1, 0x8000000000000001L, ttmlStyle0, arr_s, s1, s, ttmlNode0) : TtmlNode.c(xmlPullParser0.getName(), v1, ttmlNode0.e, ttmlStyle0, arr_s, s1, s, ttmlNode0);
            }
        }
        return TtmlNode.c(xmlPullParser0.getName(), v1, v2, ttmlStyle0, arr_s, s1, s, ttmlNode0);
    }

    @Nullable
    private static TtmlRegion n(XmlPullParser xmlPullParser0, int v, @Nullable TtsExtent ttmlParser$TtsExtent0) {
        int v5;
        float f6;
        float f5;
        int v4;
        float f4;
        float f3;
        int v2;
        float f2;
        float f1;
        String s = XmlPullParserUtil.a(xmlPullParser0, "id");
        if(s == null) {
            return null;
        }
        String s1 = XmlPullParserUtil.a(xmlPullParser0, "origin");
        if(s1 != null) {
            Pattern pattern0 = TtmlParser.o;
            Matcher matcher0 = pattern0.matcher(s1);
            Pattern pattern1 = TtmlParser.p;
            Matcher matcher1 = pattern1.matcher(s1);
            if(matcher0.matches()) {
                try {
                    float f = Float.parseFloat(((String)Assertions.g(matcher0.group(1))));
                    f1 = Float.parseFloat(((String)Assertions.g(matcher0.group(2)))) / 100.0f;
                    f2 = f / 100.0f;
                    goto label_27;
                }
                catch(NumberFormatException unused_ex) {
                    Log.n("TtmlParser", "Ignoring region with malformed origin: " + s1);
                    return null;
                }
            }
            if(matcher1.matches()) {
                if(ttmlParser$TtsExtent0 == null) {
                    Log.n("TtmlParser", "Ignoring region with missing tts:extent: " + s1);
                    return null;
                }
                try {
                    int v1 = Integer.parseInt(((String)Assertions.g(matcher1.group(1))));
                    v2 = Integer.parseInt(((String)Assertions.g(matcher1.group(2))));
                    f2 = ((float)v1) / ((float)ttmlParser$TtsExtent0.a);
                }
                catch(NumberFormatException unused_ex) {
                    Log.n("TtmlParser", "Ignoring region with malformed origin: " + s1);
                    return null;
                }
                f1 = ((float)v2) / ((float)ttmlParser$TtsExtent0.b);
            label_27:
                String s2 = XmlPullParserUtil.a(xmlPullParser0, "extent");
                if(s2 != null) {
                    Matcher matcher2 = pattern0.matcher(s2);
                    Matcher matcher3 = pattern1.matcher(s2);
                    if(matcher2.matches()) {
                        try {
                            f3 = Float.parseFloat(((String)Assertions.g(matcher2.group(1)))) / 100.0f;
                            f4 = Float.parseFloat(((String)Assertions.g(matcher2.group(2)))) / 100.0f;
                            goto label_49;
                        }
                        catch(NumberFormatException unused_ex) {
                            Log.n("TtmlParser", "Ignoring region with malformed extent: " + s1);
                            return null;
                        }
                    }
                    if(matcher3.matches()) {
                        if(ttmlParser$TtsExtent0 == null) {
                            Log.n("TtmlParser", "Ignoring region with missing tts:extent: " + s1);
                            return null;
                        }
                        try {
                            int v3 = Integer.parseInt(((String)Assertions.g(matcher3.group(1))));
                            v4 = Integer.parseInt(((String)Assertions.g(matcher3.group(2))));
                            f5 = ((float)v3) / ((float)ttmlParser$TtsExtent0.a);
                        }
                        catch(NumberFormatException unused_ex) {
                            Log.n("TtmlParser", "Ignoring region with malformed extent: " + s1);
                            return null;
                        }
                        f3 = f5;
                        f4 = ((float)v4) / ((float)ttmlParser$TtsExtent0.b);
                    label_49:
                        String s3 = XmlPullParserUtil.a(xmlPullParser0, "displayAlign");
                        if(s3 == null) {
                            f6 = f1;
                            v5 = 0;
                        }
                        else {
                            String s4 = c.g(s3);
                            s4.hashCode();
                            if(s4.equals("center")) {
                                f6 = f1 + f4 / 2.0f;
                                v5 = 1;
                            }
                            else if(s4.equals("after")) {
                                f6 = f1 + f4;
                                v5 = 2;
                            }
                            else {
                                f6 = f1;
                                v5 = 0;
                            }
                        }
                        String s5 = XmlPullParserUtil.a(xmlPullParser0, "writingMode");
                        if(s5 != null) {
                            String s6 = c.g(s5);
                            s6.hashCode();
                            switch(s6) {
                                case "tb": 
                                case "tblr": {
                                    return new TtmlRegion(s, f2, f6, 0, v5, f3, f4, 1, 1.0f / ((float)v), 2);
                                }
                                case "tbrl": {
                                    return new TtmlRegion(s, f2, f6, 0, v5, f3, f4, 1, 1.0f / ((float)v), 1);
                                }
                                default: {
                                    return new TtmlRegion(s, f2, f6, 0, v5, f3, f4, 1, 1.0f / ((float)v), 0x80000000);
                                }
                            }
                        }
                        return new TtmlRegion(s, f2, f6, 0, v5, f3, f4, 1, 1.0f / ((float)v), 0x80000000);
                    }
                    Log.n("TtmlParser", "Ignoring region with unsupported extent: " + s1);
                    return null;
                }
                Log.n("TtmlParser", "Ignoring region without an extent");
                return null;
            }
            Log.n("TtmlParser", "Ignoring region with unsupported origin: " + s1);
            return null;
        }
        Log.n("TtmlParser", "Ignoring region without an origin");
        return null;
    }

    private static float o(String s) {
        Matcher matcher0 = TtmlParser.n.matcher(s);
        if(!matcher0.matches()) {
            Log.n("TtmlParser", "Invalid value for shear: " + s);
            return 3.402823E+38f;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(((String)Assertions.g(matcher0.group(1))))));
        }
        catch(NumberFormatException numberFormatException0) {
            Log.o("TtmlParser", "Failed to parse shear: " + s, numberFormatException0);
            return 3.402823E+38f;
        }
    }

    // This method was un-flattened
    private static TtmlStyle p(XmlPullParser xmlPullParser0, TtmlStyle ttmlStyle0) {
        int v = xmlPullParser0.getAttributeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = xmlPullParser0.getAttributeValue(v1);
            String s1 = xmlPullParser0.getAttributeName(v1);
            s1.hashCode();
            switch(s1) {
                case "backgroundColor": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0);
                    try {
                        ttmlStyle0.v(ColorParser.c(s));
                    }
                    catch(IllegalArgumentException unused_ex) {
                        Log.n("TtmlParser", "Failed parsing background value: " + s);
                    }
                    break;
                }
                case "color": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0);
                    try {
                        ttmlStyle0.x(ColorParser.c(s));
                    }
                    catch(IllegalArgumentException unused_ex) {
                        Log.n("TtmlParser", "Failed parsing color value: " + s);
                    }
                    break;
                }
                case "fontFamily": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0).y(s);
                    break;
                }
                case "fontSize": {
                    try {
                        ttmlStyle0 = TtmlParser.e(ttmlStyle0);
                        TtmlParser.i(s, ttmlStyle0);
                    }
                    catch(SubtitleDecoderException unused_ex) {
                        Log.n("TtmlParser", "Failed parsing fontSize value: " + s);
                    }
                    break;
                }
                case "fontStyle": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0).C("italic".equalsIgnoreCase(s));
                    break;
                }
                case "fontWeight": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0).w("bold".equalsIgnoreCase(s));
                    break;
                }
                case "id": {
                    if("style".equals(xmlPullParser0.getName())) {
                        ttmlStyle0 = TtmlParser.e(ttmlStyle0).B(s);
                    }
                    break;
                }
                case "multiRowAlign": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0).E(TtmlParser.g(s));
                    break;
                }
                case "ruby": {
                    String s3 = c.g(s);
                    s3.hashCode();
                    switch(s3) {
                        case "base": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).G(2);
                            break;
                        }
                        case "baseContainer": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).G(2);
                            break;
                        }
                        case "container": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).G(1);
                            break;
                        }
                        case "delimiter": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).G(4);
                            break;
                        }
                        case "text": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).G(3);
                            break;
                        }
                        case "textContainer": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).G(3);
                        }
                    }
                    break;
                }
                case "rubyPosition": {
                    String s5 = c.g(s);
                    s5.hashCode();
                    if(s5.equals("before")) {
                        ttmlStyle0 = TtmlParser.e(ttmlStyle0).F(1);
                    }
                    else if(s5.equals("after")) {
                        ttmlStyle0 = TtmlParser.e(ttmlStyle0).F(2);
                    }
                    break;
                }
                case "shear": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0).H(TtmlParser.o(s));
                    break;
                }
                case "textAlign": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0).I(TtmlParser.g(s));
                    break;
                }
                case "textCombine": {
                    String s4 = c.g(s);
                    s4.hashCode();
                    if(s4.equals("all")) {
                        ttmlStyle0 = TtmlParser.e(ttmlStyle0).J(true);
                    }
                    else if(s4.equals("none")) {
                        ttmlStyle0 = TtmlParser.e(ttmlStyle0).J(false);
                    }
                    break;
                }
                case "textDecoration": {
                    String s2 = c.g(s);
                    s2.hashCode();
                    switch(s2) {
                        case "linethrough": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).D(true);
                            break;
                        }
                        case "nolinethrough": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).D(false);
                            break;
                        }
                        case "nounderline": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).L(false);
                            break;
                        }
                        case "underline": {
                            ttmlStyle0 = TtmlParser.e(ttmlStyle0).L(true);
                        }
                    }
                    break;
                }
                case "textEmphasis": {
                    ttmlStyle0 = TtmlParser.e(ttmlStyle0).K(TextEmphasis.a(s));
                }
            }
        }
        return ttmlStyle0;
    }

    private static String[] q(String s) {
        String s1 = s.trim();
        return s1.isEmpty() ? new String[0] : Util.m2(s1, "\\s+");
    }

    private static long r(String s, FrameAndTickRate ttmlParser$FrameAndTickRate0) throws SubtitleDecoderException {
        Matcher matcher0 = TtmlParser.k.matcher(s);
        if(matcher0.matches()) {
            double f = ((double)(Long.parseLong(((String)Assertions.g(matcher0.group(1)))) * 3600L)) + ((double)(Long.parseLong(((String)Assertions.g(matcher0.group(2)))) * 60L)) + ((double)Long.parseLong(((String)Assertions.g(matcher0.group(3)))));
            String s1 = matcher0.group(4);
            double f1 = 0.0;
            double f2 = s1 == null ? 0.0 : Double.parseDouble(s1);
            String s2 = matcher0.group(5);
            double f3 = s2 == null ? 0.0 : ((double)(((float)Long.parseLong(s2)) / ttmlParser$FrameAndTickRate0.a));
            String s3 = matcher0.group(6);
            if(s3 != null) {
                f1 = ((double)Long.parseLong(s3)) / ((double)ttmlParser$FrameAndTickRate0.b) / ((double)ttmlParser$FrameAndTickRate0.a);
            }
            return (long)((f + f2 + f3 + f1) * 1000000.0);
        }
        Matcher matcher1 = TtmlParser.l.matcher(s);
        if(matcher1.matches()) {
            double f4 = Double.parseDouble(((String)Assertions.g(matcher1.group(1))));
            String s4 = (String)Assertions.g(matcher1.group(2));
            s4.hashCode();
            switch(s4) {
                case "f": {
                    return (long)(f4 / ((double)ttmlParser$FrameAndTickRate0.a) * 1000000.0);
                }
                case "h": {
                    return (long)(f4 * 3600000000.0);
                }
                case "m": {
                    return (long)(f4 * 60000000.0);
                }
                case "ms": {
                    return (long)(f4 / 1000.0 * 1000000.0);
                }
                case "t": {
                    return (long)(f4 / ((double)ttmlParser$FrameAndTickRate0.c) * 1000000.0);
                }
                default: {
                    return (long)(f4 * 1000000.0);
                }
            }
        }
        throw new SubtitleDecoderException("Malformed time expression: " + s);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
    }

    @Nullable
    private static TtsExtent s(XmlPullParser xmlPullParser0) {
        String s = XmlPullParserUtil.a(xmlPullParser0, "extent");
        if(s == null) {
            return null;
        }
        Matcher matcher0 = TtmlParser.p.matcher(s);
        if(!matcher0.matches()) {
            Log.n("TtmlParser", "Ignoring non-pixel tts extent: " + s);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt(((String)Assertions.g(matcher0.group(1)))), Integer.parseInt(((String)Assertions.g(matcher0.group(2)))));
        }
        catch(NumberFormatException unused_ex) {
            Log.n("TtmlParser", "Ignoring malformed tts extent: " + s);
            return null;
        }
    }
}

