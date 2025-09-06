package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData.SchemeData;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.upstream.ParsingLoadable.Parser;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.common.base.c;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

@UnstableApi
public class DashManifestParser extends DefaultHandler implements Parser {
    public static final class RepresentationInfo {
        public final Format a;
        public final O2 b;
        public final SegmentBase c;
        @Nullable
        public final String d;
        public final ArrayList e;
        public final ArrayList f;
        public final long g;
        public final List h;
        public final List i;

        public RepresentationInfo(Format format0, List list0, SegmentBase segmentBase0, @Nullable String s, ArrayList arrayList0, ArrayList arrayList1, List list1, List list2, long v) {
            this.a = format0;
            this.b = O2.r(list0);
            this.c = segmentBase0;
            this.d = s;
            this.e = arrayList0;
            this.f = arrayList1;
            this.h = list1;
            this.i = list2;
            this.g = v;
        }
    }

    private final XmlPullParserFactory a;
    private static final String b = "MpdParser";
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final int[] f;

    static {
        DashManifestParser.c = Pattern.compile("(\\d+)(?:/(\\d+))?");
        DashManifestParser.d = Pattern.compile("CC([1-4])=.*");
        DashManifestParser.e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
        DashManifestParser.f = new int[]{-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    }

    public DashManifestParser() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        }
        catch(XmlPullParserException xmlPullParserException0) {
            throw new RuntimeException("Couldn\'t create XmlPullParserFactory instance", xmlPullParserException0);
        }
    }

    protected int A(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        String s = DashManifestParser.r0(xmlPullParser0, "schemeIdUri", null);
        s.hashCode();
        int v = -1;
        switch(s) {
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011": {
                v = DashManifestParser.J(xmlPullParser0);
                break;
            }
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012": {
                v = DashManifestParser.K(xmlPullParser0);
                break;
            }
            case "tag:dts.com,2018:uhd:audio_channel_configuration": {
                v = DashManifestParser.L(xmlPullParser0);
                break;
            }
            case "urn:dolby:dash:audio_channel_configuration:2011": {
                v = DashManifestParser.J(xmlPullParser0);
                break;
            }
            case "urn:dts:dash:audio_channel_configuration:2012": {
                v = DashManifestParser.K(xmlPullParser0);
                break;
            }
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011": {
                v = DashManifestParser.U(xmlPullParser0, "value", -1);
                break;
            }
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration": {
                v = DashManifestParser.Z(xmlPullParser0);
            }
        }
        do {
            xmlPullParser0.next();
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "AudioChannelConfiguration"));
        return v;
    }

    protected long B(XmlPullParser xmlPullParser0, long v) {
        String s = xmlPullParser0.getAttributeValue(null, "availabilityTimeOffset");
        if(s == null) {
            return v;
        }
        return "INF".equals(s) ? 0x7FFFFFFFFFFFFFFFL : ((long)(Float.parseFloat(s) * 1000000.0f));
    }

    protected List C(XmlPullParser xmlPullParser0, List list0, boolean z) throws XmlPullParserException, IOException {
        int v1;
        String s = xmlPullParser0.getAttributeValue(null, "dvb:priority");
        if(s == null) {
            v1 = z ? 1 : 0x80000000;
        }
        else {
            v1 = Integer.parseInt(s);
        }
        String s1 = xmlPullParser0.getAttributeValue(null, "dvb:weight");
        int v2 = s1 == null ? 1 : Integer.parseInt(s1);
        String s2 = xmlPullParser0.getAttributeValue(null, "serviceLocation");
        String s3 = DashManifestParser.s0(xmlPullParser0, "BaseURL");
        if(UriUtil.c(s3)) {
            if(s2 == null) {
                s2 = s3;
            }
            return z3.t(new BaseUrl[]{new BaseUrl(s3, s2, v1, v2)});
        }
        List list1 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            BaseUrl baseUrl0 = (BaseUrl)list0.get(v);
            String s4 = UriUtil.f(baseUrl0.a, s3);
            String s5 = s2 == null ? s4 : s2;
            if(z) {
                v1 = baseUrl0.c;
                v2 = baseUrl0.d;
                s5 = baseUrl0.b;
            }
            list1.add(new BaseUrl(s4, s5, v1, v2));
        }
        return list1;
    }

    protected static int D(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if("urn:scte:dash:cc:cea-608:2015".equals(descriptor0.a)) {
                String s = descriptor0.b;
                if(s != null) {
                    Matcher matcher0 = DashManifestParser.d.matcher(s);
                    if(matcher0.matches()) {
                        return Integer.parseInt(matcher0.group(1));
                    }
                    Log.n("MpdParser", "Unable to parse CEA-608 channel number from: " + descriptor0.b);
                }
            }
        }
        return -1;
    }

    protected static int E(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if("urn:scte:dash:cc:cea-708:2015".equals(descriptor0.a)) {
                String s = descriptor0.b;
                if(s != null) {
                    Matcher matcher0 = DashManifestParser.e.matcher(s);
                    if(matcher0.matches()) {
                        return Integer.parseInt(matcher0.group(1));
                    }
                    Log.n("MpdParser", "Unable to parse CEA-708 service block number from: " + descriptor0.b);
                }
            }
        }
        return -1;
    }

    protected Pair F(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        String s3;
        byte[] arr_b;
        String s2;
        UUID uUID0;
        SchemeData drmInitData$SchemeData0 = null;
        String s = xmlPullParser0.getAttributeValue(null, "schemeIdUri");
        if(s == null) {
            uUID0 = null;
            s2 = null;
            arr_b = null;
            s3 = null;
        }
        else {
            String s1 = c.g(s);
            s1.hashCode();
            switch(s1) {
                case "urn:mpeg:dash:mp4protection:2011": {
                    s2 = xmlPullParser0.getAttributeValue(null, "value");
                    String s4 = XmlPullParserUtil.b(xmlPullParser0, "default_KID");
                    if(TextUtils.isEmpty(s4) || "00000000-0000-0000-0000-000000000000".equals(s4)) {
                        Log.n("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uUID0 = null;
                        arr_b = null;
                    }
                    else {
                        String[] arr_s = s4.split("\\s+");
                        UUID[] arr_uUID = new UUID[arr_s.length];
                        for(int v = 0; v < arr_s.length; ++v) {
                            arr_uUID[v] = UUID.fromString(arr_s[v]);
                        }
                        uUID0 = C.h2;
                        arr_b = PsshAtomUtil.b(uUID0, arr_uUID, null);
                    }
                    s3 = null;
                    break;
                }
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95": {
                    uUID0 = C.k2;
                    s2 = null;
                    arr_b = null;
                    s3 = null;
                    break;
                }
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e": {
                    uUID0 = C.i2;
                    s2 = null;
                    arr_b = null;
                    s3 = null;
                    break;
                }
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed": {
                    uUID0 = C.j2;
                    s2 = null;
                    arr_b = null;
                    s3 = null;
                    break;
                }
                default: {
                    uUID0 = null;
                    s2 = null;
                    arr_b = null;
                    s3 = null;
                }
            }
        }
        do {
            xmlPullParser0.next();
            if((XmlPullParserUtil.f(xmlPullParser0, "clearkey:Laurl") || XmlPullParserUtil.f(xmlPullParser0, "dashif:Laurl")) && xmlPullParser0.next() == 4) {
                s3 = xmlPullParser0.getText();
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "ms:laurl")) {
                s3 = xmlPullParser0.getAttributeValue(null, "licenseUrl");
            }
            else if(arr_b != null || !XmlPullParserUtil.g(xmlPullParser0, "pssh") || xmlPullParser0.next() != 4) {
                if(arr_b == null) {
                    UUID uUID2 = C.k2;
                    if(uUID2.equals(uUID0) && XmlPullParserUtil.f(xmlPullParser0, "mspr:pro") && xmlPullParser0.next() == 4) {
                        arr_b = PsshAtomUtil.a(uUID2, Base64.decode(xmlPullParser0.getText(), 0));
                        continue;
                    }
                }
                DashManifestParser.w(xmlPullParser0);
            }
            else {
                byte[] arr_b1 = Base64.decode(xmlPullParser0.getText(), 0);
                UUID uUID1 = PsshAtomUtil.f(arr_b1);
                if(uUID1 == null) {
                    Log.n("MpdParser", "Skipping malformed cenc:pssh data");
                    uUID0 = null;
                    arr_b = null;
                }
                else {
                    arr_b = arr_b1;
                    uUID0 = uUID1;
                }
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "ContentProtection"));
        if(uUID0 != null) {
            drmInitData$SchemeData0 = new SchemeData(uUID0, s3, "video/mp4", arr_b);
        }
        return Pair.create(s2, drmInitData$SchemeData0);
    }

    protected int G(XmlPullParser xmlPullParser0) {
        String s = xmlPullParser0.getAttributeValue(null, "contentType");
        if(!TextUtils.isEmpty(s)) {
            if("audio".equals(s)) {
                return 1;
            }
            if("video".equals(s)) {
                return 2;
            }
            if("text".equals(s)) {
                return 3;
            }
            return "image".equals(s) ? 4 : -1;
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser0, String s, long v) throws ParserException {
        String s1 = xmlPullParser0.getAttributeValue(null, s);
        return s1 == null ? v : Util.O1(s1);
    }

    protected static Descriptor I(XmlPullParser xmlPullParser0, String s) throws XmlPullParserException, IOException {
        String s1 = DashManifestParser.r0(xmlPullParser0, "schemeIdUri", "");
        String s2 = DashManifestParser.r0(xmlPullParser0, "value", null);
        String s3 = DashManifestParser.r0(xmlPullParser0, "id", null);
        do {
            xmlPullParser0.next();
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, s));
        return new Descriptor(s1, s2, s3);
    }

    protected static int J(XmlPullParser xmlPullParser0) {
        String s = xmlPullParser0.getAttributeValue(null, "value");
        if(s == null) {
            return -1;
        }
        String s1 = c.g(s);
        s1.hashCode();
        switch(s1) {
            case "4000": {
                return 1;
            }
            case "a000": {
                return 2;
            }
            case "f800": {
                return 5;
            }
            case "f801": {
                return 6;
            }
            case "fa01": {
                return 8;
            }
            default: {
                return -1;
            }
        }
    }

    protected static int K(XmlPullParser xmlPullParser0) {
        int v = DashManifestParser.U(xmlPullParser0, "value", -1);
        return v <= 0 || v >= 33 ? -1 : v;
    }

    protected static int L(XmlPullParser xmlPullParser0) {
        String s = xmlPullParser0.getAttributeValue(null, "value");
        if(s == null) {
            return -1;
        }
        int v = Integer.bitCount(Integer.parseInt(s, 16));
        return v == 0 ? -1 : v;
    }

    protected static long M(XmlPullParser xmlPullParser0, String s, long v) {
        String s1 = xmlPullParser0.getAttributeValue(null, s);
        return s1 == null ? v : Util.P1(s1);
    }

    protected static String N(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(descriptor0.a) && "JOC".equals(descriptor0.b) || "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(descriptor0.a) && "ec+3".equals(descriptor0.b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected Pair O(XmlPullParser xmlPullParser0, String s, String s1, long v, long v1, ByteArrayOutputStream byteArrayOutputStream0) throws IOException, XmlPullParserException {
        long v2 = DashManifestParser.X(xmlPullParser0, "id", 0L);
        long v3 = DashManifestParser.X(xmlPullParser0, "duration", 0x8000000000000001L);
        long v4 = DashManifestParser.X(xmlPullParser0, "presentationTime", 0L);
        long v5 = Util.Z1(v3, 1000L, v);
        long v6 = Util.Z1(v4 - v1, 1000000L, v);
        String s2 = DashManifestParser.r0(xmlPullParser0, "messageData", null);
        Long long0 = v6;
        return s2 == null ? Pair.create(long0, this.d(s, s1, v2, v5, this.P(xmlPullParser0, byteArrayOutputStream0))) : Pair.create(long0, this.d(s, s1, v2, v5, Util.O0(s2)));
    }

    protected byte[] P(XmlPullParser xmlPullParser0, ByteArrayOutputStream byteArrayOutputStream0) throws XmlPullParserException, IOException {
        byteArrayOutputStream0.reset();
        XmlSerializer xmlSerializer0 = Xml.newSerializer();
        xmlSerializer0.setOutput(byteArrayOutputStream0, "UTF-8");
        xmlPullParser0.nextToken();
        while(!XmlPullParserUtil.d(xmlPullParser0, "Event")) {
            switch(xmlPullParser0.getEventType()) {
                case 0: {
                    xmlSerializer0.startDocument(null, Boolean.FALSE);
                    break;
                }
                case 1: {
                    xmlSerializer0.endDocument();
                    break;
                }
                case 2: {
                    xmlSerializer0.startTag(xmlPullParser0.getNamespace(), xmlPullParser0.getName());
                    for(int v = 0; v < xmlPullParser0.getAttributeCount(); ++v) {
                        xmlSerializer0.attribute(xmlPullParser0.getAttributeNamespace(v), xmlPullParser0.getAttributeName(v), xmlPullParser0.getAttributeValue(v));
                    }
                    break;
                }
                case 3: {
                    xmlSerializer0.endTag(xmlPullParser0.getNamespace(), xmlPullParser0.getName());
                    break;
                }
                case 4: {
                    xmlSerializer0.text(xmlPullParser0.getText());
                    break;
                }
                case 5: {
                    xmlSerializer0.cdsect(xmlPullParser0.getText());
                    break;
                }
                case 6: {
                    xmlSerializer0.entityRef(xmlPullParser0.getText());
                    break;
                }
                case 7: {
                    xmlSerializer0.ignorableWhitespace(xmlPullParser0.getText());
                    break;
                }
                case 8: {
                    xmlSerializer0.processingInstruction(xmlPullParser0.getText());
                    break;
                }
                case 9: {
                    xmlSerializer0.comment(xmlPullParser0.getText());
                    break;
                }
                case 10: {
                    xmlSerializer0.docdecl(xmlPullParser0.getText());
                }
            }
            xmlPullParser0.nextToken();
        }
        xmlSerializer0.flush();
        return byteArrayOutputStream0.toByteArray();
    }

    protected EventStream Q(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        String s = DashManifestParser.r0(xmlPullParser0, "schemeIdUri", "");
        String s1 = DashManifestParser.r0(xmlPullParser0, "value", "");
        long v = DashManifestParser.X(xmlPullParser0, "timescale", 1L);
        long v1 = DashManifestParser.X(xmlPullParser0, "presentationTimeOffset", 0L);
        ArrayList arrayList0 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x200);
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "Event")) {
                arrayList0.add(this.O(xmlPullParser0, s, s1, v, v1, byteArrayOutputStream0));
            }
            else {
                DashManifestParser.w(xmlPullParser0);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "EventStream"));
        long[] arr_v = new long[arrayList0.size()];
        EventMessage[] arr_eventMessage = new EventMessage[arrayList0.size()];
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            Pair pair0 = (Pair)arrayList0.get(v2);
            arr_v[v2] = (long)(((Long)pair0.first));
            arr_eventMessage[v2] = (EventMessage)pair0.second;
        }
        return this.e(s, s1, v, arr_v, arr_eventMessage);
    }

    protected static float R(XmlPullParser xmlPullParser0, String s, float f) {
        String s1 = xmlPullParser0.getAttributeValue(null, s);
        return s1 == null ? f : Float.parseFloat(s1);
    }

    protected static float S(XmlPullParser xmlPullParser0, float f) {
        String s = xmlPullParser0.getAttributeValue(null, "frameRate");
        if(s != null) {
            Matcher matcher0 = DashManifestParser.c.matcher(s);
            if(matcher0.matches()) {
                int v = Integer.parseInt(matcher0.group(1));
                String s1 = matcher0.group(2);
                return TextUtils.isEmpty(s1) ? ((float)v) : ((float)v) / ((float)Integer.parseInt(s1));
            }
        }
        return f;
    }

    protected RangedUri T(XmlPullParser xmlPullParser0) {
        return this.d0(xmlPullParser0, "sourceURL", "range");
    }

    protected static int U(XmlPullParser xmlPullParser0, String s, int v) {
        String s1 = xmlPullParser0.getAttributeValue(null, s);
        return s1 == null ? v : Integer.parseInt(s1);
    }

    protected Label V(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        return new Label(xmlPullParser0.getAttributeValue(null, "lang"), DashManifestParser.s0(xmlPullParser0, "Label"));
    }

    protected static long W(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if(c.a("http://dashif.org/guidelines/last-segment-number", descriptor0.a)) {
                return Long.parseLong(descriptor0.b);
            }
        }
        return -1L;
    }

    protected static long X(XmlPullParser xmlPullParser0, String s, long v) {
        String s1 = xmlPullParser0.getAttributeValue(null, s);
        return s1 == null ? v : Long.parseLong(s1);
    }

    protected DashManifest Y(XmlPullParser xmlPullParser0, Uri uri0) throws XmlPullParserException, IOException {
        long v12;
        long v10;
        boolean z = this.v(this.b0(xmlPullParser0, "profiles", new String[0]));
        long v = DashManifestParser.H(xmlPullParser0, "availabilityStartTime", 0x8000000000000001L);
        long v1 = DashManifestParser.M(xmlPullParser0, "mediaPresentationDuration", 0x8000000000000001L);
        long v2 = DashManifestParser.M(xmlPullParser0, "minBufferTime", 0x8000000000000001L);
        boolean z1 = "dynamic".equals(xmlPullParser0.getAttributeValue(null, "type"));
        long v3 = z1 ? DashManifestParser.M(xmlPullParser0, "minimumUpdatePeriod", 0x8000000000000001L) : 0x8000000000000001L;
        long v4 = z1 ? DashManifestParser.M(xmlPullParser0, "timeShiftBufferDepth", 0x8000000000000001L) : 0x8000000000000001L;
        long v5 = z1 ? DashManifestParser.M(xmlPullParser0, "suggestedPresentationDelay", 0x8000000000000001L) : 0x8000000000000001L;
        long v6 = DashManifestParser.H(xmlPullParser0, "publishTime", 0x8000000000000001L);
        long v7 = 0L;
        long v8 = z1 ? 0L : 0x8000000000000001L;
        ArrayList arrayList0 = z3.t(new BaseUrl[]{new BaseUrl(uri0.toString(), uri0.toString(), (z ? 1 : 0x80000000), 1)});
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if(z1) {
            v7 = 0x8000000000000001L;
        }
        long v9 = v7;
        ProgramInformation programInformation0 = null;
        UtcTimingElement utcTimingElement0 = null;
        Uri uri1 = null;
        ServiceDescriptionElement serviceDescriptionElement0 = null;
        boolean z2 = false;
        boolean z3 = false;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "BaseURL")) {
                if(!z2) {
                    v8 = this.B(xmlPullParser0, v8);
                    z2 = true;
                }
                arrayList2.addAll(this.C(xmlPullParser0, arrayList0, z));
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "ProgramInformation")) {
                programInformation0 = this.c0(xmlPullParser0);
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "UTCTiming")) {
                utcTimingElement0 = this.w0(xmlPullParser0);
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "Location")) {
                uri1 = UriUtil.g(uri0.toString(), xmlPullParser0.nextText());
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "ServiceDescription")) {
                serviceDescriptionElement0 = this.q0(xmlPullParser0);
            }
            else {
                if(!XmlPullParserUtil.f(xmlPullParser0, "Period") || z3) {
                    v10 = v8;
                    DashManifestParser.w(xmlPullParser0);
                }
                else {
                    v10 = v8;
                    Pair pair0 = this.a0(xmlPullParser0, (arrayList2.isEmpty() ? arrayList0 : arrayList2), v9, v10, v, v4, z);
                    Period period0 = (Period)pair0.first;
                    if(period0.b == 0x8000000000000001L) {
                        if(!z1) {
                            throw ParserException.c(("Unable to determine start of period " + arrayList1.size()), null);
                        }
                        z3 = true;
                    }
                    else {
                        long v11 = (long)(((Long)pair0.second));
                        arrayList1.add(period0);
                        v9 = v11 == 0x8000000000000001L ? 0x8000000000000001L : period0.b + v11;
                    }
                }
                v8 = v10;
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "MPD"));
        if(v1 != 0x8000000000000001L) {
            v12 = v1;
        }
        else if(v9 != 0x8000000000000001L) {
            v12 = v9;
        }
        else {
            if(!z1) {
                throw ParserException.c("Unable to determine duration of static manifest.", null);
            }
            v12 = 0x8000000000000001L;
        }
        if(arrayList1.isEmpty()) {
            throw ParserException.c("No periods found.", null);
        }
        return this.g(v, v12, v2, z1, v3, v4, v5, v6, programInformation0, utcTimingElement0, serviceDescriptionElement0, uri1, arrayList1);
    }

    protected static int Z(XmlPullParser xmlPullParser0) {
        int v = DashManifestParser.U(xmlPullParser0, "value", -1);
        if(v >= 0) {
            return v >= DashManifestParser.f.length ? -1 : DashManifestParser.f[v];
        }
        return -1;
    }

    @Override  // androidx.media3.exoplayer.upstream.ParsingLoadable$Parser
    public Object a(Uri uri0, InputStream inputStream0) throws IOException {
        return this.x(uri0, inputStream0);
    }

    protected Pair a0(XmlPullParser xmlPullParser0, List list0, long v, long v1, long v2, long v3, boolean z) throws XmlPullParserException, IOException {
        long v9;
        String s = xmlPullParser0.getAttributeValue(null, "id");
        long v4 = DashManifestParser.M(xmlPullParser0, "start", v);
        long v5 = v2 == 0x8000000000000001L ? 0x8000000000000001L : v2 + v4;
        long v6 = DashManifestParser.M(xmlPullParser0, "duration", 0x8000000000000001L);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long v7 = v1;
        long v8 = 0x8000000000000001L;
        SingleSegmentBase segmentBase$SingleSegmentBase0 = null;
        Descriptor descriptor0 = null;
        boolean z1 = false;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "BaseURL")) {
                if(!z1) {
                    v7 = this.B(xmlPullParser0, v7);
                    z1 = true;
                }
                arrayList2.addAll(this.C(xmlPullParser0, list0, z));
            }
            else {
                if(XmlPullParserUtil.f(xmlPullParser0, "AdaptationSet")) {
                    List list1 = arrayList2.isEmpty() ? list0 : arrayList2;
                    v9 = v7;
                    arrayList0.add(this.y(xmlPullParser0, list1, segmentBase$SingleSegmentBase0, v6, v7, v8, v5, v3, z));
                }
                else {
                    v9 = v7;
                    if(XmlPullParserUtil.f(xmlPullParser0, "EventStream")) {
                        arrayList1.add(this.Q(xmlPullParser0));
                    }
                    else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentBase")) {
                        segmentBase$SingleSegmentBase0 = this.j0(xmlPullParser0, null);
                        v7 = v9;
                        continue;
                    }
                    else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentList")) {
                        long v10 = this.B(xmlPullParser0, 0x8000000000000001L);
                        v8 = v10;
                        v7 = v9;
                        segmentBase$SingleSegmentBase0 = this.k0(xmlPullParser0, null, v5, v6, v9, v10, v3);
                        continue;
                    }
                    else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentTemplate")) {
                        long v11 = this.B(xmlPullParser0, 0x8000000000000001L);
                        v8 = v11;
                        v7 = v9;
                        segmentBase$SingleSegmentBase0 = this.l0(xmlPullParser0, null, O2.A(), v5, v6, v9, v11, v3);
                        continue;
                    }
                    else if(XmlPullParserUtil.f(xmlPullParser0, "AssetIdentifier")) {
                        descriptor0 = DashManifestParser.I(xmlPullParser0, "AssetIdentifier");
                    }
                    else {
                        DashManifestParser.w(xmlPullParser0);
                    }
                }
                v7 = v9;
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "Period"));
        return Pair.create(this.h(s, v4, arrayList0, arrayList1, descriptor0), v6);
    }

    private long b(List list0, long v, long v1, int v2, long v3) {
        int v4 = v2 < 0 ? ((int)((v3 - v + v1 - 1L) / v1)) : v2 + 1;
        for(int v5 = 0; v5 < v4; ++v5) {
            list0.add(this.m(v, v1));
            v += v1;
        }
        return v;
    }

    protected String[] b0(XmlPullParser xmlPullParser0, String s, String[] arr_s) {
        String s1 = xmlPullParser0.getAttributeValue(null, s);
        return s1 == null ? arr_s : s1.split(",");
    }

    protected AdaptationSet c(long v, int v1, List list0, List list1, List list2, List list3) {
        return new AdaptationSet(v, v1, list0, list1, list2, list3);
    }

    protected ProgramInformation c0(XmlPullParser xmlPullParser0) throws IOException, XmlPullParserException {
        String s = null;
        String s1 = DashManifestParser.r0(xmlPullParser0, "moreInformationURL", null);
        String s2 = DashManifestParser.r0(xmlPullParser0, "lang", null);
        String s3 = null;
        String s4 = null;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "Title")) {
                s = xmlPullParser0.nextText();
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "Source")) {
                s3 = xmlPullParser0.nextText();
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "Copyright")) {
                s4 = xmlPullParser0.nextText();
            }
            else {
                DashManifestParser.w(xmlPullParser0);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "ProgramInformation"));
        return new ProgramInformation(s, s3, s4, s1, s2);
    }

    protected EventMessage d(String s, String s1, long v, long v1, byte[] arr_b) {
        return new EventMessage(s, s1, v1, v, arr_b);
    }

    protected RangedUri d0(XmlPullParser xmlPullParser0, String s, String s1) {
        String s2 = xmlPullParser0.getAttributeValue(null, s);
        String s3 = xmlPullParser0.getAttributeValue(null, s1);
        if(s3 != null) {
            String[] arr_s = s3.split("-");
            long v = Long.parseLong(arr_s[0]);
            return arr_s.length == 2 ? this.i(s2, v, Long.parseLong(arr_s[1]) - v + 1L) : this.i(s2, v, -1L);
        }
        return this.i(s2, 0L, -1L);
    }

    protected EventStream e(String s, String s1, long v, long[] arr_v, EventMessage[] arr_eventMessage) {
        return new EventStream(s, s1, v, arr_v, arr_eventMessage);
    }

    protected RepresentationInfo e0(XmlPullParser xmlPullParser0, List list0, @Nullable String s, @Nullable String s1, int v, int v1, float f, int v2, int v3, @Nullable String s2, List list1, List list2, List list3, List list4, @Nullable SegmentBase segmentBase0, long v4, long v5, long v6, long v7, long v8, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList7;
        ArrayList arrayList6;
        long v18;
        long v17;
        ArrayList arrayList5;
        ArrayList arrayList4;
        int v16;
        List list6;
        SegmentBase segmentBase2;
        String s3 = xmlPullParser0.getAttributeValue(null, "id");
        int v9 = DashManifestParser.U(xmlPullParser0, "bandwidth", -1);
        String s4 = DashManifestParser.r0(xmlPullParser0, "mimeType", s);
        String s5 = DashManifestParser.r0(xmlPullParser0, "codecs", s1);
        int v10 = DashManifestParser.U(xmlPullParser0, "width", v);
        int v11 = DashManifestParser.U(xmlPullParser0, "height", v1);
        float f1 = DashManifestParser.S(xmlPullParser0, f);
        int v12 = DashManifestParser.U(xmlPullParser0, "audioSamplingRate", v3);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list3);
        ArrayList arrayList3 = new ArrayList(list4);
        List list5 = new ArrayList();
        int v13 = v2;
        SegmentBase segmentBase1 = segmentBase0;
        long v14 = v6;
        String s6 = null;
        boolean z1 = false;
        long v15 = v7;
        while(true) {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "BaseURL")) {
                if(!z1) {
                    v14 = this.B(xmlPullParser0, v14);
                    z1 = true;
                }
                ((ArrayList)list5).addAll(this.C(xmlPullParser0, list0, z));
                goto label_33;
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "AudioChannelConfiguration")) {
                segmentBase2 = segmentBase1;
                list6 = list5;
                v16 = this.A(xmlPullParser0);
                arrayList4 = arrayList1;
                arrayList5 = arrayList3;
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentBase")) {
                segmentBase1 = this.j0(xmlPullParser0, ((SingleSegmentBase)segmentBase1));
            label_33:
                list6 = list5;
                v16 = v13;
                segmentBase2 = segmentBase1;
                arrayList4 = arrayList1;
                arrayList5 = arrayList3;
            }
            else {
                if(XmlPullParserUtil.f(xmlPullParser0, "SegmentList")) {
                    v17 = this.B(xmlPullParser0, v15);
                    v18 = v14;
                    list6 = list5;
                    arrayList6 = arrayList3;
                    arrayList7 = arrayList1;
                    segmentBase1 = this.k0(xmlPullParser0, ((SegmentList)segmentBase1), v4, v5, v18, v17, v8);
                    v16 = v13;
                    v15 = v17;
                    goto label_68;
                }
                else {
                    v18 = v14;
                    list6 = list5;
                    arrayList6 = arrayList3;
                    arrayList7 = arrayList1;
                    if(XmlPullParserUtil.f(xmlPullParser0, "SegmentTemplate")) {
                        v17 = this.B(xmlPullParser0, v15);
                        segmentBase1 = this.l0(xmlPullParser0, ((SegmentTemplate)segmentBase1), list4, v4, v5, v18, v17, v8);
                        v16 = v13;
                        v15 = v17;
                        goto label_68;
                    }
                    else if(XmlPullParserUtil.f(xmlPullParser0, "ContentProtection")) {
                        Pair pair0 = this.F(xmlPullParser0);
                        Object object0 = pair0.first;
                        if(object0 != null) {
                            s6 = (String)object0;
                        }
                        Object object1 = pair0.second;
                        if(object1 != null) {
                            arrayList0.add(((SchemeData)object1));
                        }
                        v16 = v13;
                    label_68:
                        v14 = v18;
                        arrayList5 = arrayList6;
                        arrayList4 = arrayList7;
                    }
                    else {
                        if(XmlPullParserUtil.f(xmlPullParser0, "InbandEventStream")) {
                            arrayList4 = arrayList7;
                            arrayList4.add(DashManifestParser.I(xmlPullParser0, "InbandEventStream"));
                            arrayList5 = arrayList6;
                        }
                        else {
                            arrayList4 = arrayList7;
                            if(XmlPullParserUtil.f(xmlPullParser0, "EssentialProperty")) {
                                arrayList2.add(DashManifestParser.I(xmlPullParser0, "EssentialProperty"));
                                arrayList5 = arrayList6;
                            }
                            else if(XmlPullParserUtil.f(xmlPullParser0, "SupplementalProperty")) {
                                arrayList5 = arrayList6;
                                arrayList5.add(DashManifestParser.I(xmlPullParser0, "SupplementalProperty"));
                            }
                            else {
                                arrayList5 = arrayList6;
                                DashManifestParser.w(xmlPullParser0);
                            }
                        }
                        v16 = v13;
                        v14 = v18;
                    }
                }
                segmentBase2 = segmentBase1;
            }
            if(XmlPullParserUtil.d(xmlPullParser0, "Representation")) {
                break;
            }
            arrayList3 = arrayList5;
            arrayList1 = arrayList4;
            segmentBase1 = segmentBase2;
            v13 = v16;
            list5 = list6;
        }
        Format format0 = this.f(s3, s4, v10, v11, f1, v16, v12, v9, s2, list1, list2, s5, arrayList2, arrayList5);
        if(segmentBase2 == null) {
            segmentBase2 = new SingleSegmentBase();
        }
        if(((ArrayList)list6).isEmpty()) {
            list6 = list0;
        }
        return new RepresentationInfo(format0, list6, segmentBase2, s6, arrayList0, arrayList4, arrayList2, arrayList5, -1L);
    }

    protected Format f(@Nullable String s, @Nullable String s1, int v, int v1, float f, int v2, int v3, int v4, @Nullable String s2, List list0, List list1, @Nullable String s3, List list2, List list3) {
        String s4 = DashManifestParser.u(s1, s3);
        if("audio/eac3".equals(s4)) {
            s4 = DashManifestParser.N(list3);
            if("audio/eac3-joc".equals(s4)) {
                s3 = "ec+3";
            }
        }
        int v5 = this.p0(list0);
        int v6 = this.i0(list0);
        int v7 = this.f0(list1);
        int v8 = this.h0(list2);
        int v9 = this.h0(list3);
        Pair pair0 = this.t0(list2);
        int v10 = -1;
        Builder format$Builder0 = new Builder().a0(s).Q(s1).o0(s4).O(s3).j0(v4).q0(v5).m0(v6 | v7 | v8 | v9).e0(s2).t0((pair0 == null ? -1 : ((int)(((Integer)pair0.first))))).u0((pair0 == null ? -1 : ((int)(((Integer)pair0.second)))));
        if(MimeTypes.u(s4)) {
            format$Builder0.v0(v).Y(v1).X(f);
            return format$Builder0.K();
        }
        if(MimeTypes.q(s4)) {
            format$Builder0.N(v2).p0(v3);
            return format$Builder0.K();
        }
        if(MimeTypes.t(s4)) {
            if("application/cea-608".equals(s4)) {
                v10 = DashManifestParser.D(list1);
            }
            else if("application/cea-708".equals(s4)) {
                v10 = DashManifestParser.E(list1);
            }
            format$Builder0.L(v10);
            return format$Builder0.K();
        }
        if(MimeTypes.r(s4)) {
            format$Builder0.v0(v).Y(v1);
        }
        return format$Builder0.K();
    }

    protected int f0(List list0) {
        int v1 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if(c.a("urn:mpeg:dash:role:2011", descriptor0.a)) {
                v1 |= this.g0(descriptor0.b);
            }
            else if(c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor0.a)) {
                v1 |= this.u0(descriptor0.b);
            }
        }
        return v1;
    }

    protected DashManifest g(long v, long v1, long v2, boolean z, long v3, long v4, long v5, long v6, @Nullable ProgramInformation programInformation0, @Nullable UtcTimingElement utcTimingElement0, @Nullable ServiceDescriptionElement serviceDescriptionElement0, @Nullable Uri uri0, List list0) {
        return new DashManifest(v, v1, v2, z, v3, v4, v5, v6, programInformation0, utcTimingElement0, serviceDescriptionElement0, uri0, list0);
    }

    protected int g0(@Nullable String s) {
        if(s == null) {
            return 0;
        }
        switch(s) {
            case "alternate": {
                return 2;
            }
            case "caption": {
                return 0x40;
            }
            case "commentary": {
                return 8;
            }
            case "description": {
                return 0x200;
            }
            case "dub": {
                return 16;
            }
            case "emergency": {
                return 0x20;
            }
            case "enhanced-audio-intelligibility": {
                return 0x800;
            }
            case "forced-subtitle": {
                return 0x80;
            }
            case "forced_subtitle": {
                return 0x80;
            }
            case "main": {
                return 1;
            }
            case "sign": {
                return 0x100;
            }
            case "subtitle": {
                return 0x80;
            }
            case "supplementary": {
                return 4;
            }
            default: {
                return 0;
            }
        }
    }

    protected Period h(@Nullable String s, long v, List list0, List list1, @Nullable Descriptor descriptor0) {
        return new Period(s, v, list0, list1, descriptor0);
    }

    protected int h0(List list0) {
        int v1 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            if(c.a("http://dashif.org/guidelines/trickmode", ((Descriptor)list0.get(v)).a)) {
                v1 = 0x4000;
            }
        }
        return v1;
    }

    protected RangedUri i(String s, long v, long v1) {
        return new RangedUri(s, v, v1);
    }

    protected int i0(List list0) {
        int v1 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if(c.a("urn:mpeg:dash:role:2011", descriptor0.a)) {
                v1 |= this.g0(descriptor0.b);
            }
        }
        return v1;
    }

    protected Representation j(RepresentationInfo dashManifestParser$RepresentationInfo0, @Nullable String s, List list0, @Nullable String s1, ArrayList arrayList0, ArrayList arrayList1) {
        Builder format$Builder0 = dashManifestParser$RepresentationInfo0.a.a();
        if(s == null || !list0.isEmpty()) {
            format$Builder0.d0(list0);
        }
        else {
            format$Builder0.c0(s);
        }
        String s2 = dashManifestParser$RepresentationInfo0.d == null ? s1 : dashManifestParser$RepresentationInfo0.d;
        ArrayList arrayList2 = dashManifestParser$RepresentationInfo0.e;
        arrayList2.addAll(arrayList0);
        if(!arrayList2.isEmpty()) {
            DashManifestParser.r(arrayList2);
            DashManifestParser.s(arrayList2);
            format$Builder0.U(new DrmInitData(s2, arrayList2));
        }
        dashManifestParser$RepresentationInfo0.f.addAll(arrayList1);
        Format format0 = format$Builder0.K();
        return Representation.p(dashManifestParser$RepresentationInfo0.g, format0, dashManifestParser$RepresentationInfo0.b, dashManifestParser$RepresentationInfo0.c, dashManifestParser$RepresentationInfo0.f, dashManifestParser$RepresentationInfo0.h, dashManifestParser$RepresentationInfo0.i, null);
    }

    protected SingleSegmentBase j0(XmlPullParser xmlPullParser0, @Nullable SingleSegmentBase segmentBase$SingleSegmentBase0) throws XmlPullParserException, IOException {
        long v5;
        long v4;
        long v = DashManifestParser.X(xmlPullParser0, "timescale", (segmentBase$SingleSegmentBase0 == null ? 1L : segmentBase$SingleSegmentBase0.b));
        long v1 = 0L;
        long v2 = DashManifestParser.X(xmlPullParser0, "presentationTimeOffset", (segmentBase$SingleSegmentBase0 == null ? 0L : segmentBase$SingleSegmentBase0.c));
        long v3 = segmentBase$SingleSegmentBase0 == null ? 0L : segmentBase$SingleSegmentBase0.d;
        if(segmentBase$SingleSegmentBase0 != null) {
            v1 = segmentBase$SingleSegmentBase0.e;
        }
        RangedUri rangedUri0 = null;
        String s = xmlPullParser0.getAttributeValue(null, "indexRange");
        if(s == null) {
            v5 = v1;
            v4 = v3;
        }
        else {
            String[] arr_s = s.split("-");
            v4 = Long.parseLong(arr_s[0]);
            v5 = Long.parseLong(arr_s[1]) - v4 + 1L;
        }
        if(segmentBase$SingleSegmentBase0 != null) {
            rangedUri0 = segmentBase$SingleSegmentBase0.a;
        }
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "Initialization")) {
                rangedUri0 = this.T(xmlPullParser0);
            }
            else {
                DashManifestParser.w(xmlPullParser0);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "SegmentBase"));
        return this.n(rangedUri0, v, v2, v4, v5);
    }

    protected SegmentList k(RangedUri rangedUri0, long v, long v1, long v2, long v3, @Nullable List list0, long v4, @Nullable List list1, long v5, long v6) {
        return new SegmentList(rangedUri0, v, v1, v2, v3, list0, v4, list1, Util.F1(v5), Util.F1(v6));
    }

    protected SegmentList k0(XmlPullParser xmlPullParser0, @Nullable SegmentList segmentBase$SegmentList0, long v, long v1, long v2, long v3, long v4) throws XmlPullParserException, IOException {
        long v5 = 1L;
        long v6 = DashManifestParser.X(xmlPullParser0, "timescale", (segmentBase$SegmentList0 == null ? 1L : segmentBase$SegmentList0.b));
        long v7 = DashManifestParser.X(xmlPullParser0, "presentationTimeOffset", (segmentBase$SegmentList0 == null ? 0L : segmentBase$SegmentList0.c));
        long v8 = DashManifestParser.X(xmlPullParser0, "duration", (segmentBase$SegmentList0 == null ? 0x8000000000000001L : segmentBase$SegmentList0.e));
        if(segmentBase$SegmentList0 != null) {
            v5 = segmentBase$SegmentList0.d;
        }
        long v9 = DashManifestParser.X(xmlPullParser0, "startNumber", v5);
        long v10 = DashManifestParser.t(v2, v3);
        List list0 = null;
        List list1 = null;
        RangedUri rangedUri0 = null;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "Initialization")) {
                rangedUri0 = this.T(xmlPullParser0);
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentTimeline")) {
                list0 = this.m0(xmlPullParser0, v6, v1);
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentURL")) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.add(this.n0(xmlPullParser0));
            }
            else {
                DashManifestParser.w(xmlPullParser0);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "SegmentList"));
        if(segmentBase$SegmentList0 != null) {
            if(rangedUri0 == null) {
                rangedUri0 = segmentBase$SegmentList0.a;
            }
            if(list0 == null) {
                list0 = segmentBase$SegmentList0.f;
            }
            if(list1 == null) {
                list1 = segmentBase$SegmentList0.j;
            }
        }
        return this.k(rangedUri0, v6, v7, v9, v8, list0, v10, list1, v4, v);
    }

    protected SegmentTemplate l(RangedUri rangedUri0, long v, long v1, long v2, long v3, long v4, List list0, long v5, @Nullable UrlTemplate urlTemplate0, @Nullable UrlTemplate urlTemplate1, long v6, long v7) {
        return new SegmentTemplate(rangedUri0, v, v1, v2, v3, v4, list0, v5, urlTemplate0, urlTemplate1, Util.F1(v6), Util.F1(v7));
    }

    protected SegmentTemplate l0(XmlPullParser xmlPullParser0, @Nullable SegmentTemplate segmentBase$SegmentTemplate0, List list0, long v, long v1, long v2, long v3, long v4) throws XmlPullParserException, IOException {
        long v5 = 1L;
        long v6 = DashManifestParser.X(xmlPullParser0, "timescale", (segmentBase$SegmentTemplate0 == null ? 1L : segmentBase$SegmentTemplate0.b));
        long v7 = DashManifestParser.X(xmlPullParser0, "presentationTimeOffset", (segmentBase$SegmentTemplate0 == null ? 0L : segmentBase$SegmentTemplate0.c));
        long v8 = DashManifestParser.X(xmlPullParser0, "duration", (segmentBase$SegmentTemplate0 == null ? 0x8000000000000001L : segmentBase$SegmentTemplate0.e));
        if(segmentBase$SegmentTemplate0 != null) {
            v5 = segmentBase$SegmentTemplate0.d;
        }
        long v9 = DashManifestParser.X(xmlPullParser0, "startNumber", v5);
        long v10 = DashManifestParser.W(list0);
        long v11 = DashManifestParser.t(v2, v3);
        List list1 = null;
        UrlTemplate urlTemplate0 = this.v0(xmlPullParser0, "media", (segmentBase$SegmentTemplate0 == null ? null : segmentBase$SegmentTemplate0.k));
        UrlTemplate urlTemplate1 = this.v0(xmlPullParser0, "initialization", (segmentBase$SegmentTemplate0 == null ? null : segmentBase$SegmentTemplate0.j));
        RangedUri rangedUri0 = null;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "Initialization")) {
                rangedUri0 = this.T(xmlPullParser0);
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentTimeline")) {
                list1 = this.m0(xmlPullParser0, v6, v1);
            }
            else {
                DashManifestParser.w(xmlPullParser0);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "SegmentTemplate"));
        if(segmentBase$SegmentTemplate0 != null) {
            if(rangedUri0 == null) {
                rangedUri0 = segmentBase$SegmentTemplate0.a;
            }
            if(list1 == null) {
                list1 = segmentBase$SegmentTemplate0.f;
            }
        }
        return this.l(rangedUri0, v6, v7, v9, v10, v8, list1, v11, urlTemplate1, urlTemplate0, v4, v);
    }

    protected SegmentTimelineElement m(long v, long v1) {
        return new SegmentTimelineElement(v, v1);
    }

    protected List m0(XmlPullParser xmlPullParser0, long v, long v1) throws XmlPullParserException, IOException {
        List list0 = new ArrayList();
        long v2 = 0L;
        long v3 = 0x8000000000000001L;
        boolean z = false;
        int v4 = 0;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "S")) {
                long v5 = DashManifestParser.X(xmlPullParser0, "t", 0x8000000000000001L);
                if(z) {
                    v2 = this.b(list0, v2, v3, v4, v5);
                }
                if(v5 == 0x8000000000000001L) {
                    v5 = v2;
                }
                v3 = DashManifestParser.X(xmlPullParser0, "d", 0x8000000000000001L);
                v4 = DashManifestParser.U(xmlPullParser0, "r", 0);
                v2 = v5;
                z = true;
            }
            else {
                DashManifestParser.w(xmlPullParser0);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "SegmentTimeline"));
        if(z) {
            this.b(list0, v2, v3, v4, Util.Z1(v1, v, 1000L));
        }
        return list0;
    }

    protected SingleSegmentBase n(RangedUri rangedUri0, long v, long v1, long v2, long v3) {
        return new SingleSegmentBase(rangedUri0, v, v1, v2, v3);
    }

    protected RangedUri n0(XmlPullParser xmlPullParser0) {
        return this.d0(xmlPullParser0, "media", "mediaRange");
    }

    protected UtcTimingElement o(String s, String s1) {
        return new UtcTimingElement(s, s1);
    }

    protected int o0(@Nullable String s) {
        if(s == null) {
            return 0;
        }
        return s.equals("forced_subtitle") || s.equals("forced-subtitle") ? 2 : 0;
    }

    private static int p(int v, int v1) {
        if(v == -1) {
            return v1;
        }
        if(v1 == -1) {
            return v;
        }
        Assertions.i(v == v1);
        return v;
    }

    protected int p0(List list0) {
        int v1 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if(c.a("urn:mpeg:dash:role:2011", descriptor0.a)) {
                v1 |= this.o0(descriptor0.b);
            }
        }
        return v1;
    }

    @Nullable
    private static String q(@Nullable String s, @Nullable String s1) {
        if(s == null) {
            return s1;
        }
        if(s1 == null) {
            return s;
        }
        Assertions.i(s.equals(s1));
        return s;
    }

    protected ServiceDescriptionElement q0(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        long v = 0x8000000000000001L;
        long v1 = 0x8000000000000001L;
        long v2 = 0x8000000000000001L;
        float f = -3.402823E+38f;
        float f1 = -3.402823E+38f;
        do {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "Latency")) {
                v = DashManifestParser.X(xmlPullParser0, "target", 0x8000000000000001L);
                v1 = DashManifestParser.X(xmlPullParser0, "min", 0x8000000000000001L);
                v2 = DashManifestParser.X(xmlPullParser0, "max", 0x8000000000000001L);
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "PlaybackRate")) {
                f = DashManifestParser.R(xmlPullParser0, "min", -3.402823E+38f);
                f1 = DashManifestParser.R(xmlPullParser0, "max", -3.402823E+38f);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, "ServiceDescription"));
        return new ServiceDescriptionElement(v, v1, v2, f, f1);
    }

    private static void r(ArrayList arrayList0) {
        String s;
        for(int v1 = 0; true; ++v1) {
            s = null;
            if(v1 >= arrayList0.size()) {
                break;
            }
            SchemeData drmInitData$SchemeData0 = (SchemeData)arrayList0.get(v1);
            if(C.i2.equals(drmInitData$SchemeData0.b)) {
                s = drmInitData$SchemeData0.c;
                if(s != null) {
                    arrayList0.remove(v1);
                    break;
                }
            }
        }
        if(s == null) {
            return;
        }
        for(int v = 0; v < arrayList0.size(); ++v) {
            SchemeData drmInitData$SchemeData1 = (SchemeData)arrayList0.get(v);
            if(C.h2.equals(drmInitData$SchemeData1.b) && drmInitData$SchemeData1.c == null) {
                arrayList0.set(v, new SchemeData(C.i2, s, drmInitData$SchemeData1.d, drmInitData$SchemeData1.e));
            }
        }
    }

    protected static String r0(XmlPullParser xmlPullParser0, String s, String s1) {
        String s2 = xmlPullParser0.getAttributeValue(null, s);
        return s2 == null ? s1 : s2;
    }

    private static void s(ArrayList arrayList0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            SchemeData drmInitData$SchemeData0 = (SchemeData)arrayList0.get(v);
            if(!drmInitData$SchemeData0.d()) {
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    if(((SchemeData)arrayList0.get(v1)).a(drmInitData$SchemeData0)) {
                        arrayList0.remove(v);
                        break;
                    }
                }
            }
        }
    }

    protected static String s0(XmlPullParser xmlPullParser0, String s) throws XmlPullParserException, IOException {
        String s1 = "";
        do {
            xmlPullParser0.next();
            if(xmlPullParser0.getEventType() == 4) {
                s1 = xmlPullParser0.getText();
            }
            else {
                DashManifestParser.w(xmlPullParser0);
            }
        }
        while(!XmlPullParserUtil.d(xmlPullParser0, s));
        return s1;
    }

    private static long t(long v, long v1) {
        if(v1 != 0x8000000000000001L) {
            v = v1;
        }
        return v == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000001L : v;
    }

    @Nullable
    protected Pair t0(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            Descriptor descriptor0 = (Descriptor)list0.get(v);
            if(c.a("http://dashif.org/thumbnail_tile", descriptor0.a) || c.a("http://dashif.org/guidelines/thumbnail_tile", descriptor0.a)) {
                String s = descriptor0.b;
                if(s != null) {
                    String[] arr_s = Util.m2(s, "x");
                    if(arr_s.length == 2) {
                        try {
                            return Pair.create(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]));
                        }
                        catch(NumberFormatException unused_ex) {
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    private static String u(@Nullable String s, @Nullable String s1) {
        if(MimeTypes.q(s)) {
            return MimeTypes.c(s1);
        }
        if(MimeTypes.u(s)) {
            return MimeTypes.p(s1);
        }
        if(MimeTypes.t(s)) {
            return s;
        }
        if(MimeTypes.r(s)) {
            return s;
        }
        if("application/mp4".equals(s)) {
            String s2 = MimeTypes.g(s1);
            return "text/vtt".equals(s2) ? "application/x-mp4-vtt" : s2;
        }
        return null;
    }

    protected int u0(@Nullable String s) {
        if(s == null) {
            return 0;
        }
        switch(s) {
            case "1": {
                return 0x200;
            }
            case "2": {
                return 0x800;
            }
            case "3": {
                return 4;
            }
            case "4": {
                return 8;
            }
            case "6": {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    private boolean v(String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    protected UrlTemplate v0(XmlPullParser xmlPullParser0, String s, @Nullable UrlTemplate urlTemplate0) {
        String s1 = xmlPullParser0.getAttributeValue(null, s);
        return s1 == null ? urlTemplate0 : UrlTemplate.b(s1);
    }

    public static void w(XmlPullParser xmlPullParser0) throws IOException, XmlPullParserException {
        if(!XmlPullParserUtil.e(xmlPullParser0)) {
            return;
        }
        int v = 1;
        while(v != 0) {
            xmlPullParser0.next();
            if(XmlPullParserUtil.e(xmlPullParser0)) {
                ++v;
            }
            else if(XmlPullParserUtil.c(xmlPullParser0)) {
                --v;
            }
        }
    }

    protected UtcTimingElement w0(XmlPullParser xmlPullParser0) {
        return this.o(xmlPullParser0.getAttributeValue(null, "schemeIdUri"), xmlPullParser0.getAttributeValue(null, "value"));
    }

    public DashManifest x(Uri uri0, InputStream inputStream0) throws IOException {
        try {
            XmlPullParser xmlPullParser0 = this.a.newPullParser();
            xmlPullParser0.setInput(inputStream0, null);
            if(xmlPullParser0.next() != 2 || !"MPD".equals(xmlPullParser0.getName())) {
                throw ParserException.c("inputStream does not contain a valid media presentation description", null);
            }
            return this.Y(xmlPullParser0, uri0);
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        throw ParserException.c(null, xmlPullParserException0);
    }

    protected AdaptationSet y(XmlPullParser xmlPullParser0, List list0, @Nullable SegmentBase segmentBase0, long v, long v1, long v2, long v3, long v4, boolean z) throws XmlPullParserException, IOException {
        List list1;
        int v17;
        long v16;
        long v15;
        int v14;
        long v13;
        String s6;
        long v5 = DashManifestParser.X(xmlPullParser0, "id", -1L);
        int v6 = this.G(xmlPullParser0);
        String s = xmlPullParser0.getAttributeValue(null, "mimeType");
        String s1 = xmlPullParser0.getAttributeValue(null, "codecs");
        int v7 = DashManifestParser.U(xmlPullParser0, "width", -1);
        int v8 = DashManifestParser.U(xmlPullParser0, "height", -1);
        float f = DashManifestParser.S(xmlPullParser0, -1.0f);
        int v9 = DashManifestParser.U(xmlPullParser0, "audioSamplingRate", -1);
        String s2 = xmlPullParser0.getAttributeValue(null, "lang");
        String s3 = xmlPullParser0.getAttributeValue(null, "label");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        SegmentBase segmentBase1 = segmentBase0;
        String s4 = s2;
        String s5 = null;
        int v10 = -1;
        boolean z1 = false;
        long v11 = v1;
        long v12 = v2;
        while(true) {
            xmlPullParser0.next();
            if(XmlPullParserUtil.f(xmlPullParser0, "BaseURL")) {
                if(!z1) {
                    v11 = this.B(xmlPullParser0, v11);
                    z1 = true;
                }
                arrayList8.addAll(this.C(xmlPullParser0, list0, z));
                goto label_41;
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "ContentProtection")) {
                Pair pair0 = this.F(xmlPullParser0);
                Object object0 = pair0.first;
                if(object0 != null) {
                    s5 = (String)object0;
                }
                Object object1 = pair0.second;
                if(object1 != null) {
                    arrayList1.add(((SchemeData)object1));
                }
            label_41:
                s6 = s4;
                v13 = v12;
            }
            else if(XmlPullParserUtil.f(xmlPullParser0, "ContentComponent")) {
                String s7 = DashManifestParser.q(s4, xmlPullParser0.getAttributeValue(null, "lang"));
                v6 = DashManifestParser.p(v6, this.G(xmlPullParser0));
                s6 = s7;
                v13 = v12;
            }
            else {
                if(XmlPullParserUtil.f(xmlPullParser0, "Role")) {
                    arrayList4.add(DashManifestParser.I(xmlPullParser0, "Role"));
                    goto label_66;
                }
                else if(XmlPullParserUtil.f(xmlPullParser0, "AudioChannelConfiguration")) {
                    v10 = this.A(xmlPullParser0);
                    s6 = s4;
                    v13 = v12;
                    goto label_116;
                }
                else if(XmlPullParserUtil.f(xmlPullParser0, "Accessibility")) {
                    arrayList3.add(DashManifestParser.I(xmlPullParser0, "Accessibility"));
                    goto label_66;
                }
                else if(XmlPullParserUtil.f(xmlPullParser0, "EssentialProperty")) {
                    arrayList5.add(DashManifestParser.I(xmlPullParser0, "EssentialProperty"));
                    goto label_66;
                }
                else if(XmlPullParserUtil.f(xmlPullParser0, "SupplementalProperty")) {
                    arrayList6.add(DashManifestParser.I(xmlPullParser0, "SupplementalProperty"));
                label_66:
                    v14 = v6;
                    s6 = s4;
                    v15 = v11;
                    v16 = v12;
                }
                else if(XmlPullParserUtil.f(xmlPullParser0, "Representation")) {
                    if(arrayList8.isEmpty()) {
                        v17 = v6;
                        list1 = list0;
                    }
                    else {
                        v17 = v6;
                        list1 = arrayList8;
                    }
                    s6 = s4;
                    RepresentationInfo dashManifestParser$RepresentationInfo0 = this.e0(xmlPullParser0, list1, s, s1, v7, v8, f, v10, v9, s4, arrayList4, arrayList3, arrayList5, arrayList6, segmentBase1, v3, v, v11, v12, v4, z);
                    int v18 = DashManifestParser.p(v17, MimeTypes.m(dashManifestParser$RepresentationInfo0.a.n));
                    arrayList7.add(dashManifestParser$RepresentationInfo0);
                    v13 = v12;
                    v6 = v18;
                    goto label_116;
                }
                else {
                    s6 = s4;
                    v15 = v11;
                    if(XmlPullParserUtil.f(xmlPullParser0, "SegmentBase")) {
                        v13 = v12;
                        segmentBase1 = this.j0(xmlPullParser0, ((SingleSegmentBase)segmentBase1));
                        v11 = v15;
                        goto label_116;
                    }
                    else if(XmlPullParserUtil.f(xmlPullParser0, "SegmentList")) {
                        v13 = this.B(xmlPullParser0, v12);
                        segmentBase1 = this.k0(xmlPullParser0, ((SegmentList)segmentBase1), v3, v, v15, v13, v4);
                        v11 = v15;
                        goto label_116;
                    }
                    else {
                        v16 = v12;
                        v14 = v6;
                        if(XmlPullParserUtil.f(xmlPullParser0, "SegmentTemplate")) {
                            v13 = this.B(xmlPullParser0, v16);
                            segmentBase1 = this.l0(xmlPullParser0, ((SegmentTemplate)segmentBase1), arrayList6, v3, v, v15, v13, v4);
                            v11 = v15;
                            v6 = v14;
                            goto label_116;
                        }
                        else if(XmlPullParserUtil.f(xmlPullParser0, "InbandEventStream")) {
                            arrayList2.add(DashManifestParser.I(xmlPullParser0, "InbandEventStream"));
                        }
                        else if(XmlPullParserUtil.f(xmlPullParser0, "Label")) {
                            arrayList0.add(this.V(xmlPullParser0));
                        }
                        else if(XmlPullParserUtil.e(xmlPullParser0)) {
                            this.z(xmlPullParser0);
                        }
                    }
                }
                v13 = v16;
                v11 = v15;
                v6 = v14;
            }
        label_116:
            if(XmlPullParserUtil.d(xmlPullParser0, "AdaptationSet")) {
                break;
            }
            v12 = v13;
            s4 = s6;
        }
        ArrayList arrayList9 = new ArrayList(arrayList7.size());
        for(int v19 = 0; v19 < arrayList7.size(); ++v19) {
            arrayList9.add(this.j(((RepresentationInfo)arrayList7.get(v19)), s3, arrayList0, s5, arrayList1, arrayList2));
        }
        return this.c(v5, v6, arrayList9, arrayList3, arrayList5, arrayList6);
    }

    protected void z(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        DashManifestParser.w(xmlPullParser0);
    }
}

