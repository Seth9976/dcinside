package com.google.android.gms.internal.ads;

import android.text.Layout.Alignment;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class zzalf implements zzakf {
    static final Pattern zza;
    static final Pattern zzb;
    private static final Pattern zzc;
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    private static final Pattern zzg;
    private static final zzald zzh;
    private final XmlPullParserFactory zzi;

    static {
        zzalf.zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        zzalf.zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        zzalf.zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        zzalf.zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        zzalf.zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
        zzalf.zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
        zzalf.zzg = Pattern.compile("^(\\d+) (\\d+)$");
        zzalf.zzh = new zzald(30.0f, 1, 1);
    }

    public zzalf() {
        try {
            XmlPullParserFactory xmlPullParserFactory0 = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactory0;
            xmlPullParserFactory0.setNamespaceAware(true);
        }
        catch(XmlPullParserException xmlPullParserException0) {
            throw new RuntimeException("Couldn\'t create XmlPullParserFactory instance", xmlPullParserException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        zzajz.zza(this.zzb(arr_b, v, v1), zzake0, zzdb0);
    }

    // This method was un-flattened
    public final zzaka zzb(byte[] arr_b, int v, int v1) {
        int v19;
        float f9;
        XmlPullParserException xmlPullParserException1;
        long v30;
        long v29;
        zzalc zzalc4;
        zzalc zzalc3;
        String[] arr_s3;
        zzakb zzakb2;
        String s30;
        String s28;
        String[] arr_s2;
        long v26;
        long v25;
        long v24;
        int v23;
        String s27;
        zzali zzali1;
        zzald zzald5;
        int v20;
        zzalg zzalg0;
        float f5;
        float f4;
        Matcher matcher4;
        int v5;
        zzaka zzaka1;
        HashMap hashMap3;
        HashMap hashMap4;
        float f2;
        float f1;
        Pattern pattern1;
        Matcher matcher2;
        Pattern pattern0;
        String s13;
        String s12;
        zzald zzald3;
        int v14;
        zzale zzale1;
        boolean z;
        int v12;
        int v11;
        int v10;
        zzald zzald2;
        zzalc zzalc2;
        int v9;
        float f;
        zzaka zzaka2;
        int v3;
        zzale zzale0;
        zzaka zzaka0;
        zzald zzald0;
        int v2;
        ArrayDeque arrayDeque0;
        HashMap hashMap1;
        HashMap hashMap0;
        XmlPullParser xmlPullParser0;
        try {
            xmlPullParser0 = this.zzi.newPullParser();
            hashMap0 = new HashMap();
            hashMap1 = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap1.put("", new zzalg("", -3.402823E+38f, -3.402823E+38f, 0x80000000, 0x80000000, -3.402823E+38f, -3.402823E+38f, 0x80000000, -3.402823E+38f, 0x80000000));
            xmlPullParser0.setInput(new ByteArrayInputStream(arr_b, v, v1), null);
            arrayDeque0 = new ArrayDeque();
            v2 = xmlPullParser0.getEventType();
            zzald0 = zzalf.zzh;
            zzaka0 = null;
            zzale0 = null;
            v3 = 0;
            int v4 = 15;
        alab1:
            while(true) {
            label_13:
                if(v2 == 1) {
                    if(zzaka0 == null) {
                        throw null;
                    }
                    return zzaka0;
                }
                zzalc zzalc0 = (zzalc)arrayDeque0.peek();
                if(v3 == 0) {
                    String s = xmlPullParser0.getName();
                    if(v2 == 2) {
                        if("tt".equals(s)) {
                            String s1 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
                            int v6 = s1 == null ? 30 : Integer.parseInt(s1);
                            String s2 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
                            zzaka2 = zzaka0;
                            if(s2 == null) {
                                f = 1.0f;
                            }
                            else {
                                String[] arr_s = s2.split(" ", -1);
                                zzcw.zze(arr_s.length == 2, "frameRateMultiplier doesn\'t have 2 parts");
                                f = ((float)Integer.parseInt(arr_s[0])) / ((float)Integer.parseInt(arr_s[1]));
                            }
                            String s3 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
                            int v7 = s3 == null ? zzalf.zzh.zzb : Integer.parseInt(s3);
                            int v8 = zzalf.zzh.zzc;
                            String s4 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
                            if(s4 == null) {
                                zzalc2 = zzalc0;
                                v9 = v8;
                            }
                            else {
                                v9 = Integer.parseInt(s4);
                                zzalc2 = zzalc0;
                            }
                            zzald zzald1 = new zzald(((float)v6) * f, v7, v9);
                            String s5 = xmlPullParser0.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
                            if(s5 == null) {
                                zzald2 = zzald1;
                            }
                            else {
                                Matcher matcher0 = zzalf.zzg.matcher(s5);
                                if(matcher0.matches()) {
                                    try {
                                        String s6 = matcher0.group(1);
                                        if(s6 != null) {
                                            v10 = Integer.parseInt(s6);
                                            String s7 = matcher0.group(2);
                                            if(s7 != null) {
                                                v11 = Integer.parseInt(s7);
                                                goto label_94;
                                            }
                                            zzald2 = zzald1;
                                            throw null;
                                        }
                                        zzald2 = zzald1;
                                        throw null;
                                    }
                                    catch(NumberFormatException unused_ex) {
                                        try {
                                            zzald2 = zzald1;
                                        }
                                        catch(NumberFormatException unused_ex) {
                                        }
                                        goto label_114;
                                    }
                                label_94:
                                    if(v10 == 0) {
                                        v12 = v11;
                                        zzald2 = zzald1;
                                        z = false;
                                    }
                                    else if(v11 == 0) {
                                        zzald2 = zzald1;
                                        z = false;
                                        v12 = 0;
                                    }
                                    else {
                                        v12 = v11;
                                        zzald2 = zzald1;
                                        z = true;
                                    }
                                    try {
                                        zzcw.zze(z, "Invalid cell resolution " + v10 + " " + v12);
                                        v4 = v12;
                                        goto label_116;
                                    }
                                    catch(NumberFormatException unused_ex) {
                                    label_114:
                                        zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: " + s5);
                                    }
                                }
                                else {
                                    zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: " + s5);
                                    zzald2 = zzald1;
                                }
                            }
                            v4 = 15;
                        label_116:
                            String s8 = zzej.zza(xmlPullParser0, "extent");
                            if(s8 != null) {
                                Matcher matcher1 = zzalf.zzf.matcher(s8);
                                if(matcher1.matches()) {
                                    try {
                                        String s9 = matcher1.group(1);
                                        if(s9 == null) {
                                            throw null;
                                        }
                                        int v13 = Integer.parseInt(s9);
                                        String s10 = matcher1.group(2);
                                        if(s10 == null) {
                                            throw null;
                                        }
                                        zzale1 = new zzale(v13, Integer.parseInt(s10));
                                        goto label_133;
                                    }
                                    catch(NumberFormatException unused_ex) {
                                        zzdo.zzf("TtmlParser", "Ignoring malformed tts extent: " + s8);
                                    }
                                }
                                else {
                                    zzdo.zzf("TtmlParser", "Ignoring non-pixel tts extent: " + s8);
                                }
                            }
                            zzale1 = null;
                        label_133:
                            zzald0 = zzald2;
                        }
                        else {
                            zzalc2 = zzalc0;
                            zzaka2 = zzaka0;
                            zzale1 = zzale0;
                        }
                        v14 = v4;
                        if(s.equals("tt") || (s.equals("head") || s.equals("body") || s.equals("div") || s.equals("p") || s.equals("span") || s.equals("br") || s.equals("style") || s.equals("styling") || s.equals("layout") || s.equals("region") || s.equals("metadata") || s.equals("image") || s.equals("data") || s.equals("information"))) {
                            if("head".equals(s)) {
                                while(true) {
                                label_146:
                                    xmlPullParser0.next();
                                    if(zzej.zzc(xmlPullParser0, "style")) {
                                        goto label_277;
                                    }
                                    else {
                                        zzald3 = zzald0;
                                        if(zzej.zzc(xmlPullParser0, "region")) {
                                            s12 = zzej.zza(xmlPullParser0, "id");
                                            if(s12 == null) {
                                                hashMap4 = hashMap0;
                                            }
                                            else {
                                                s13 = zzej.zza(xmlPullParser0, "origin");
                                                if(s13 == null) {
                                                    hashMap4 = hashMap0;
                                                    zzdo.zzf("TtmlParser", "Ignoring region without an origin");
                                                }
                                                else {
                                                    pattern0 = zzalf.zzb;
                                                    matcher2 = pattern0.matcher(s13);
                                                    pattern1 = zzalf.zzf;
                                                    Matcher matcher3 = pattern1.matcher(s13);
                                                    if(!matcher2.matches()) {
                                                        hashMap4 = hashMap0;
                                                        if(!matcher3.matches()) {
                                                            zzdo.zzf("TtmlParser", "Ignoring region with unsupported origin: " + s13);
                                                            zzalg0 = null;
                                                            goto label_274;
                                                        }
                                                        else if(zzale1 == null) {
                                                            zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: " + s13);
                                                            zzalg0 = null;
                                                            goto label_274;
                                                        }
                                                        else {
                                                            try {
                                                                String s14 = matcher3.group(1);
                                                                if(s14 == null) {
                                                                    throw null;
                                                                }
                                                                int v15 = Integer.parseInt(s14);
                                                                String s15 = matcher3.group(2);
                                                                if(s15 == null) {
                                                                    throw null;
                                                                }
                                                                int v16 = Integer.parseInt(s15);
                                                                f1 = ((float)v15) / ((float)zzale1.zza);
                                                                f2 = (float)v16;
                                                                break alab1;
                                                            }
                                                            catch(NumberFormatException unused_ex) {
                                                                zzdo.zzf("TtmlParser", "Ignoring region with malformed origin: " + s13);
                                                                zzalg0 = null;
                                                                goto label_274;
                                                            }
                                                        }
                                                    }
                                                    goto label_195;
                                                }
                                            }
                                            zzalg0 = null;
                                            goto label_274;
                                        }
                                        else {
                                            if(zzej.zzc(xmlPullParser0, "metadata")) {
                                                while(true) {
                                                    xmlPullParser0.next();
                                                    if(zzej.zzc(xmlPullParser0, "image")) {
                                                        String s11 = zzej.zza(xmlPullParser0, "id");
                                                        if(s11 != null) {
                                                            hashMap2.put(s11, xmlPullParser0.nextText());
                                                        }
                                                    }
                                                    if(zzej.zzb(xmlPullParser0, "metadata")) {
                                                        break;
                                                    }
                                                }
                                            }
                                            hashMap4 = hashMap0;
                                        }
                                    }
                                    goto label_294;
                                }
                            }
                            else {
                                goto label_300;
                            }
                            goto label_403;
                        }
                        else {
                            zzdo.zze("TtmlParser", "Ignoring unsupported tag: " + xmlPullParser0.getName());
                            hashMap3 = hashMap0;
                            zzale0 = zzale1;
                            zzaka0 = zzaka2;
                            v3 = 1;
                        }
                    }
                    else {
                        zzaka1 = zzaka0;
                        v5 = 0;
                        if(v2 == 4) {
                            if(zzalc0 == null) {
                                throw null;
                            }
                            zzalc0.zzf(zzalc.zzc(xmlPullParser0.getText()));
                        }
                        else if(v2 == 3) {
                            if(xmlPullParser0.getName().equals("tt")) {
                                zzalc zzalc1 = (zzalc)arrayDeque0.peek();
                                if(zzalc1 == null) {
                                    throw null;
                                }
                                hashMap3 = hashMap0;
                                zzaka0 = new zzalj(zzalc1, hashMap3, hashMap1, hashMap2);
                            }
                            else {
                                hashMap3 = hashMap0;
                                zzaka0 = zzaka1;
                            }
                            arrayDeque0.pop();
                            v3 = v5;
                            goto label_408;
                        }
                        hashMap3 = hashMap0;
                        zzaka0 = zzaka1;
                        v3 = v5;
                    }
                }
                else {
                    hashMap3 = hashMap0;
                    zzaka1 = zzaka0;
                    v5 = v3;
                    switch(v2) {
                        case 2: {
                            v3 = v5 + 1;
                            zzaka0 = zzaka1;
                            break;
                        }
                        case 3: {
                            v3 = v5 - 1;
                            zzaka0 = zzaka1;
                            break;
                        }
                        default: {
                            zzaka0 = zzaka1;
                            v3 = v5;
                        }
                    }
                }
                goto label_408;
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
        float f3 = f2 / ((float)zzale1.zzb);
        goto label_207;
        try {
            try {
            label_195:
                hashMap4 = hashMap0;
                String s16 = matcher2.group(1);
                if(s16 == null) {
                    throw null;
                }
                f1 = Float.parseFloat(s16) / 100.0f;
                String s17 = matcher2.group(2);
                if(s17 == null) {
                    throw null;
                }
                f3 = Float.parseFloat(s17) / 100.0f;
            }
            catch(NumberFormatException unused_ex) {
                zzdo.zzf("TtmlParser", "Ignoring region with malformed origin: " + s13);
                zzalg0 = null;
                goto label_274;
            }
        label_207:
            String s18 = zzej.zza(xmlPullParser0, "extent");
            if(s18 == null) {
                zzdo.zzf("TtmlParser", "Ignoring region without an extent");
            }
            else {
                matcher4 = pattern0.matcher(s18);
                Matcher matcher5 = pattern1.matcher(s18);
                if(matcher4.matches()) {
                }
                else if(!matcher5.matches()) {
                    zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: " + s13);
                    zzalg0 = null;
                    goto label_274;
                }
                else if(zzale1 == null) {
                    zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: " + s13);
                    zzalg0 = null;
                    goto label_274;
                }
                else {
                    try {
                        String s19 = matcher5.group(1);
                        if(s19 == null) {
                            throw null;
                        }
                        int v17 = Integer.parseInt(s19);
                        String s20 = matcher5.group(2);
                        if(s20 == null) {
                            throw null;
                        }
                        int v18 = Integer.parseInt(s20);
                        f4 = ((float)v17) / ((float)zzale1.zza);
                        f5 = (float)v18;
                        goto label_233;
                    }
                    catch(NumberFormatException unused_ex) {
                        zzdo.zzf("TtmlParser", "Ignoring region with malformed extent: " + s13);
                        zzalg0 = null;
                        goto label_274;
                    }
                }
                goto label_236;
            }
            zzalg0 = null;
            goto label_274;
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
    label_233:
        float f6 = f5 / ((float)zzale1.zzb);
        float f7 = f4;
        goto label_249;
        try {
            try {
            label_236:
                String s21 = matcher4.group(1);
                if(s21 == null) {
                    throw null;
                }
                float f8 = Float.parseFloat(s21) / 100.0f;
                String s22 = matcher4.group(2);
                if(s22 == null) {
                    throw null;
                }
                f6 = Float.parseFloat(s22) / 100.0f;
                f7 = f8;
            }
            catch(NumberFormatException unused_ex) {
                zzdo.zzf("TtmlParser", "Ignoring region with malformed extent: " + s13);
                zzalg0 = null;
                goto label_274;
            }
        label_249:
            String s23 = zzej.zza(xmlPullParser0, "displayAlign");
            if(s23 != null) {
                switch(zzftt.zza(s23)) {
                    case "after": {
                        f9 = f3 + f6;
                        v19 = 2;
                        goto label_262;
                    }
                    case "center": {
                        goto label_253;
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
        goto label_260;
    label_253:
        f9 = f3 + f6 / 2.0f;
        v19 = 1;
        float f10 = 1.0f / ((float)v14);
        goto label_263;
        try {
        label_260:
            f9 = f3;
            v19 = 0;
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
    label_262:
        f10 = 1.0f / ((float)v14);
        try {
        label_263:
            String s24 = zzej.zza(xmlPullParser0, "writingMode");
            if(s24 == null) {
                v20 = 0x80000000;
            }
            else {
                switch(zzftt.zza(s24)) {
                    case "tb": 
                    case "tblr": {
                        v20 = 2;
                        break;
                    }
                    case "tbrl": {
                        v20 = 1;
                        break;
                    }
                    default: {
                        v20 = 0x80000000;
                    }
                }
            }
            zzalg0 = new zzalg(s12, f1, f9, 0, v19, f7, f6, 1, f10, v20);
        label_274:
            if(zzalg0 != null) {
                hashMap1.put(zzalg0.zza, zzalg0);
                goto label_294;
            label_277:
                String s25 = zzej.zza(xmlPullParser0, "style");
                zzali zzali0 = zzalf.zzf(xmlPullParser0, new zzali());
                if(s25 == null) {
                    zzald3 = zzald0;
                }
                else {
                    String[] arr_s1 = zzalf.zzg(s25);
                    zzald3 = zzald0;
                    for(int v21 = 0; v21 < arr_s1.length; ++v21) {
                        zzali0.zzl(((zzali)hashMap0.get(arr_s1[v21])));
                    }
                }
                String s26 = zzali0.zzE();
                if(s26 != null) {
                    hashMap0.put(s26, zzali0);
                }
                hashMap4 = hashMap0;
            }
        label_294:
            if(zzej.zzb(xmlPullParser0, "head")) {
                goto label_298;
            }
            zzald0 = zzald3;
            hashMap0 = hashMap4;
            goto label_146;
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
    label_298:
        zzald zzald4 = zzald3;
        goto label_403;
        try {
        label_300:
            hashMap4 = hashMap0;
            zzald5 = zzald0;
            int v22 = xmlPullParser0.getAttributeCount();
            zzali1 = zzalf.zzf(xmlPullParser0, null);
            s27 = "";
            v23 = 0;
            v24 = 0x8000000000000001L;
            v25 = 0x8000000000000001L;
            v26 = 0x8000000000000001L;
            arr_s2 = null;
            s28 = null;
            goto label_315;
        }
        catch(zzakb zzakb0) {
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
        zzald4 = zzald5;
        goto label_395;
        while(true) {
        label_315:
            if(v23 >= v22) {
                goto label_351;
            }
            try {
                String s29 = xmlPullParser0.getAttributeName(v23);
                s30 = xmlPullParser0.getAttributeValue(v23);
                switch(s29) {
                    case "backgroundImage": {
                        goto label_340;
                    }
                    case "begin": {
                        zzald4 = zzald5;
                        v25 = zzalf.zzc(s30, zzald4);
                        ++v23;
                        zzald5 = zzald4;
                        continue;
                    }
                    case "dur": {
                        goto label_327;
                    }
                    case "end": {
                        goto label_330;
                    }
                    case "region": {
                        goto label_324;
                    }
                    case "style": {
                        goto label_336;
                    }
                    default: {
                        zzald4 = zzald5;
                        ++v23;
                        zzald5 = zzald4;
                        continue;
                    }
                }
            }
            catch(zzakb zzakb1) {
            }
            catch(XmlPullParserException xmlPullParserException0) {
                xmlPullParserException1 = xmlPullParserException0;
                throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
            }
            catch(IOException iOException0) {
                goto label_413;
            }
            try {
                try {
                    zzald4 = zzald5;
                }
                catch(zzakb zzakb1) {
                }
                zzakb2 = zzakb1;
                goto label_396;
                try {
                label_324:
                    if(hashMap1.containsKey(s30)) {
                        s27 = s30;
                    }
                    zzald4 = zzald5;
                    ++v23;
                    zzald5 = zzald4;
                    continue;
                }
                catch(zzakb zzakb3) {
                    zzakb2 = zzakb3;
                    zzald4 = zzald5;
                    goto label_396;
                }
                try {
                label_327:
                    zzald4 = zzald5;
                    v26 = zzalf.zzc(s30, zzald4);
                    ++v23;
                    zzald5 = zzald4;
                    continue;
                label_330:
                    zzald4 = zzald5;
                    v24 = zzalf.zzc(s30, zzald4);
                    ++v23;
                    zzald5 = zzald4;
                    continue;
                }
                catch(zzakb zzakb1) {
                    zzakb2 = zzakb1;
                    goto label_396;
                }
                try {
                label_336:
                    arr_s3 = zzalf.zzg(s30);
                    if(arr_s3.length > 0) {
                        goto label_338;
                    }
                    zzald4 = zzald5;
                    ++v23;
                    zzald5 = zzald4;
                    continue;
                }
                catch(zzakb zzakb3) {
                    zzakb2 = zzakb3;
                    zzald4 = zzald5;
                    goto label_396;
                }
            label_338:
                arr_s2 = arr_s3;
                zzald4 = zzald5;
                ++v23;
                zzald5 = zzald4;
                continue;
                try {
                label_340:
                    if(s30.startsWith("#")) {
                        s28 = s30.substring(1);
                    }
                    zzald4 = zzald5;
                    ++v23;
                    zzald5 = zzald4;
                    continue;
                }
                catch(zzakb zzakb3) {
                }
                zzakb2 = zzakb3;
                zzald4 = zzald5;
                goto label_396;
                try {
                    ++v23;
                    zzald5 = zzald4;
                    continue;
                label_351:
                    zzald4 = zzald5;
                    if(zzalc2 == null) {
                        zzalc3 = null;
                        v29 = v25;
                        zzalc4 = null;
                    }
                    else {
                        zzalc3 = zzalc2;
                        long v27 = zzalc3.zzd;
                        if(v27 == 0x8000000000000001L) {
                            zzalc4 = zzalc3;
                            v29 = v25;
                        }
                        else {
                            long v28 = v25 == 0x8000000000000001L ? 0x8000000000000001L : v25 + v27;
                            if(v24 == 0x8000000000000001L) {
                                zzalc4 = zzalc3;
                                v29 = v28;
                                v24 = 0x8000000000000001L;
                            }
                            else {
                                zzalc4 = zzalc3;
                                v29 = v28;
                                v24 += v27;
                            }
                        }
                    }
                    if(v24 == 0x8000000000000001L) {
                        try {
                            if(v26 != 0x8000000000000001L) {
                                v30 = v29 + v26;
                                goto label_389;
                            }
                            break;
                        }
                        catch(zzakb zzakb1) {
                            zzakb2 = zzakb1;
                            goto label_396;
                        }
                        catch(XmlPullParserException xmlPullParserException0) {
                            xmlPullParserException1 = xmlPullParserException0;
                            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
                        }
                        catch(IOException iOException0) {
                            goto label_413;
                        }
                    }
                    else {
                        goto label_388;
                    }
                    goto label_389;
                }
                catch(zzakb zzakb1) {
                    zzakb2 = zzakb1;
                    goto label_396;
                }
            }
            catch(XmlPullParserException xmlPullParserException0) {
                xmlPullParserException1 = xmlPullParserException0;
                throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
            }
            catch(IOException iOException0) {
                goto label_413;
            }
        }
        if(zzalc4 == null) {
            v30 = 0x8000000000000001L;
        }
        else {
            v24 = zzalc4.zze;
            v30 = v24 == 0x8000000000000001L ? 0x8000000000000001L : v24;
        }
        goto label_389;
    label_388:
        v30 = v24;
        try {
        label_389:
            zzalc zzalc5 = zzalc.zzb(xmlPullParser0.getName(), v29, v30, zzali1, arr_s2, s27, s28, zzalc4);
            arrayDeque0.push(zzalc5);
            if(zzalc3 != null) {
                zzalc3.zzf(zzalc5);
            }
            goto label_403;
        }
        catch(zzakb zzakb0) {
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
    label_395:
        zzakb2 = zzakb0;
        try {
        label_396:
            zzdo.zzg("TtmlParser", "Suppressing parser error", zzakb2);
            zzale0 = zzale1;
            zzald0 = zzald4;
            zzaka0 = zzaka2;
            hashMap3 = hashMap4;
            v3 = 1;
            goto label_408;
        label_403:
            zzale0 = zzale1;
            zzald0 = zzald4;
            zzaka0 = zzaka2;
            v3 = 0;
            hashMap3 = hashMap4;
        label_408:
            xmlPullParser0.next();
            v2 = xmlPullParser0.getEventType();
            hashMap0 = hashMap3;
            goto label_13;
        label_413:
            IOException iOException1 = iOException0;
            throw new IllegalStateException("Unexpected error when reading input.", iOException1);
        }
        catch(XmlPullParserException xmlPullParserException0) {
            xmlPullParserException1 = xmlPullParserException0;
            throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
        }
        catch(IOException iOException0) {
            goto label_413;
        }
        throw new IllegalStateException("Unable to decode source", xmlPullParserException1);
    }

    private static long zzc(String s, zzald zzald0) throws zzakb {
        Matcher matcher0 = zzalf.zzc.matcher(s);
        if(matcher0.matches()) {
            String s1 = matcher0.group(1);
            s1.getClass();
            long v = Long.parseLong(s1);
            String s2 = matcher0.group(2);
            s2.getClass();
            long v1 = Long.parseLong(s2);
            String s3 = matcher0.group(3);
            s3.getClass();
            double f = (double)Long.parseLong(s3);
            String s4 = matcher0.group(4);
            double f1 = 0.0;
            double f2 = s4 == null ? 0.0 : Double.parseDouble(s4);
            String s5 = matcher0.group(5);
            double f3 = s5 == null ? 0.0 : ((double)(((float)Long.parseLong(s5)) / zzald0.zza));
            String s6 = matcher0.group(6);
            if(s6 != null) {
                f1 = ((double)Long.parseLong(s6)) / ((double)zzald0.zzb) / ((double)zzald0.zza);
            }
            return (long)((((double)(v * 3600L)) + ((double)(v1 * 60L)) + f + f2 + f3 + f1) * 1000000.0);
        }
        Matcher matcher1 = zzalf.zzd.matcher(s);
        if(matcher1.matches()) {
            String s7 = matcher1.group(1);
            s7.getClass();
            double f4 = Double.parseDouble(s7);
            String s8 = matcher1.group(2);
            s8.getClass();
            switch(s8) {
                case "f": {
                    return (long)(f4 / ((double)zzald0.zza) * 1000000.0);
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
                case "s": {
                    return (long)(f4 * 1000000.0);
                }
                case "t": {
                    return (long)(f4 / ((double)zzald0.zzc) * 1000000.0);
                }
                default: {
                    return (long)(f4 * 1000000.0);
                }
            }
        }
        throw new zzakb("Malformed time expression: " + s);
    }

    @Nullable
    private static Layout.Alignment zzd(String s) {
        switch(zzftt.zza(s)) {
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

    private static zzali zze(@Nullable zzali zzali0) {
        return zzali0 == null ? new zzali() : zzali0;
    }

    // This method was un-flattened
    private static zzali zzf(XmlPullParser xmlPullParser0, zzali zzali0) {
        Matcher matcher1;
        int v = xmlPullParser0.getAttributeCount();
        zzali zzali1 = zzali0;
        int v1 = 0;
        while(v1 < v) {
            String s = xmlPullParser0.getAttributeValue(v1);
            switch(xmlPullParser0.getAttributeName(v1)) {
                case "backgroundColor": {
                    zzali1 = zzalf.zze(zzali1);
                    try {
                        zzali1.zzm(zzcz.zzb(s));
                    }
                    catch(IllegalArgumentException unused_ex) {
                        zzdo.zzf("TtmlParser", "Failed parsing background value: " + s);
                    }
                    break;
                }
                case "color": {
                    zzali1 = zzalf.zze(zzali1);
                    try {
                        zzali1.zzo(zzcz.zzb(s));
                    }
                    catch(IllegalArgumentException unused_ex) {
                        zzdo.zzf("TtmlParser", "Failed parsing color value: " + s);
                    }
                    break;
                }
                case "fontFamily": {
                    zzali1 = zzalf.zze(zzali1);
                    zzali1.zzp(s);
                    break;
                }
                case "fontSize": {
                    try {
                        zzali1 = zzalf.zze(zzali1);
                        String[] arr_s = s.split("\\s+", -1);
                        int v2 = arr_s.length;
                        if(v2 == 1) {
                            matcher1 = zzalf.zze.matcher(s);
                            goto label_98;
                        }
                        else if(v2 == 2) {
                            matcher1 = zzalf.zze.matcher(arr_s[1]);
                            zzdo.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        label_98:
                            if(matcher1.matches()) {
                                String s2 = matcher1.group(3);
                                if(s2 == null) {
                                    throw null;
                                }
                                switch(s2) {
                                    case "%": {
                                        zzali1.zzr(3);
                                        break;
                                    }
                                    case "em": {
                                        zzali1.zzr(2);
                                        break;
                                    }
                                    case "px": {
                                        zzali1.zzr(1);
                                        break;
                                    }
                                    default: {
                                        goto label_114;
                                    }
                                }
                                String s3 = matcher1.group(1);
                                if(s3 == null) {
                                    throw null;
                                }
                                zzali1.zzq(Float.parseFloat(s3));
                                break;
                            }
                        }
                        goto label_114;
                    }
                    catch(zzakb unused_ex) {
                    label_114:
                        zzdo.zzf("TtmlParser", "Failed parsing fontSize value: " + s);
                        break;
                    }
                }
                case "fontStyle": {
                    zzali1 = zzalf.zze(zzali1);
                    zzali1.zzt("italic".equalsIgnoreCase(s));
                    break;
                }
                case "fontWeight": {
                    zzali1 = zzalf.zze(zzali1);
                    zzali1.zzn("bold".equalsIgnoreCase(s));
                    break;
                }
                case "id": {
                    if("style".equals(xmlPullParser0.getName())) {
                        zzali1 = zzalf.zze(zzali1);
                        zzali1.zzs(s);
                    }
                    break;
                }
                case "multiRowAlign": {
                    zzali1 = zzalf.zze(zzali1);
                    zzali1.zzv(zzalf.zzd(s));
                    break;
                }
                case "ruby": {
                    switch(zzftt.zza(s)) {
                        case "base": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzx(2);
                            break;
                        }
                        case "baseContainer": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzx(2);
                            break;
                        }
                        case "container": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzx(1);
                            break;
                        }
                        case "delimiter": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzx(4);
                            break;
                        }
                        case "text": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzx(3);
                            break;
                        }
                        case "textContainer": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzx(3);
                        }
                    }
                    break;
                }
                case "rubyPosition": {
                    switch(zzftt.zza(s)) {
                        case "after": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzw(2);
                            break;
                        }
                        case "before": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzw(1);
                        }
                    }
                    break;
                }
                case "shear": {
                    zzali zzali2 = zzalf.zze(zzali1);
                    Matcher matcher0 = zzalf.zza.matcher(s);
                    float f = 3.402823E+38f;
                    if(matcher0.matches()) {
                        try {
                            String s1 = matcher0.group(1);
                            if(s1 == null) {
                                throw null;
                            }
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(s1)));
                            goto label_77;
                        }
                        catch(NumberFormatException numberFormatException0) {
                        }
                        zzdo.zzg("TtmlParser", "Failed to parse shear: " + s, numberFormatException0);
                    }
                    else {
                        zzdo.zzf("TtmlParser", "Invalid value for shear: " + s);
                    }
                label_77:
                    zzali2.zzy(f);
                    zzali1 = zzali2;
                    break;
                }
                case "textAlign": {
                    zzali1 = zzalf.zze(zzali1);
                    zzali1.zzz(zzalf.zzd(s));
                    break;
                }
                case "textCombine": {
                    switch(zzftt.zza(s)) {
                        case "all": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzA(true);
                            break;
                        }
                        case "none": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzA(false);
                        }
                    }
                    break;
                }
                case "textDecoration": {
                    switch(zzftt.zza(s)) {
                        case "linethrough": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzu(true);
                            break;
                        }
                        case "nolinethrough": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzu(false);
                            break;
                        }
                        case "nounderline": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzC(false);
                            break;
                        }
                        case "underline": {
                            zzali1 = zzalf.zze(zzali1);
                            zzali1.zzC(true);
                        }
                    }
                    break;
                }
                case "textEmphasis": {
                    zzali1 = zzalf.zze(zzali1);
                    zzali1.zzB(zzalb.zza(s));
                }
            }
            ++v1;
        }
        return zzali1;
    }

    private static String[] zzg(String s) {
        String s1 = s.trim();
        return s1.isEmpty() ? new String[0] : s1.split("\\s+", -1);
    }
}

