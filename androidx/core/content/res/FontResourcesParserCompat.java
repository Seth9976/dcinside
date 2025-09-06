package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.styleable;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.c})
public class FontResourcesParserCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static int a(TypedArray typedArray0, int v) {
            return typedArray0.getType(v);
        }
    }

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        private final FontFileResourceEntry[] a;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry) {
            this.a = arr_fontResourcesParserCompat$FontFileResourceEntry;
        }

        public FontFileResourceEntry[] a() {
            return this.a;
        }
    }

    public static final class FontFileResourceEntry {
        private final String a;
        private final int b;
        private final boolean c;
        private final String d;
        private final int e;
        private final int f;

        public FontFileResourceEntry(String s, int v, boolean z, String s1, int v1, int v2) {
            this.a = s;
            this.b = v;
            this.c = z;
            this.d = s1;
            this.e = v1;
            this.f = v2;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {
        private final FontRequest a;
        private final FontRequest b;
        private final int c;
        private final int d;
        private final String e;

        public ProviderResourceEntry(FontRequest fontRequest0, int v, int v1) {
            this(fontRequest0, null, v, v1, null);
        }

        @RestrictTo({Scope.a})
        public ProviderResourceEntry(FontRequest fontRequest0, FontRequest fontRequest1, int v, int v1, String s) {
            this.a = fontRequest0;
            this.b = fontRequest1;
            this.d = v;
            this.c = v1;
            this.e = s;
        }

        public FontRequest a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public FontRequest c() {
            return this.a;
        }

        @RestrictTo({Scope.a})
        public String d() {
            return this.e;
        }

        public int e() {
            return this.c;
        }
    }

    private static final int a = 400;
    private static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = -1;
    private static final int f = 500;

    private static int a(TypedArray typedArray0, int v) {
        return Api21Impl.a(typedArray0, v);
    }

    public static FamilyResourceEntry b(XmlPullParser xmlPullParser0, Resources resources0) throws XmlPullParserException, IOException {
        do {
            int v = xmlPullParser0.next();
        }
        while(v != 1 && v != 2);
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return FontResourcesParserCompat.d(xmlPullParser0, resources0);
    }

    public static List c(Resources resources0, @ArrayRes int v) {
        if(v == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray0 = resources0.obtainTypedArray(v);
        try {
            if(typedArray0.length() == 0) {
                return Collections.emptyList();
            }
            List list1 = new ArrayList();
            if(FontResourcesParserCompat.a(typedArray0, 0) == 1) {
                for(int v2 = 0; v2 < typedArray0.length(); ++v2) {
                    int v3 = typedArray0.getResourceId(v2, 0);
                    if(v3 != 0) {
                        list1.add(FontResourcesParserCompat.h(resources0.getStringArray(v3)));
                    }
                }
            }
            else {
                list1.add(FontResourcesParserCompat.h(resources0.getStringArray(v)));
            }
            return list1;
        }
        finally {
            typedArray0.recycle();
        }
    }

    private static FamilyResourceEntry d(XmlPullParser xmlPullParser0, Resources resources0) throws XmlPullParserException, IOException {
        xmlPullParser0.require(2, null, "font-family");
        if(xmlPullParser0.getName().equals("font-family")) {
            return FontResourcesParserCompat.e(xmlPullParser0, resources0);
        }
        FontResourcesParserCompat.g(xmlPullParser0);
        return null;
    }

    private static FamilyResourceEntry e(XmlPullParser xmlPullParser0, Resources resources0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = resources0.obtainAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.FontFamily);
        String s = typedArray0.getString(styleable.FontFamily_fontProviderAuthority);
        String s1 = typedArray0.getString(styleable.FontFamily_fontProviderPackage);
        String s2 = typedArray0.getString(styleable.FontFamily_fontProviderQuery);
        String s3 = typedArray0.getString(styleable.FontFamily_fontProviderFallbackQuery);
        int v = typedArray0.getResourceId(styleable.FontFamily_fontProviderCerts, 0);
        int v1 = typedArray0.getInteger(styleable.FontFamily_fontProviderFetchStrategy, 1);
        int v2 = typedArray0.getInteger(styleable.FontFamily_fontProviderFetchTimeout, 500);
        String s4 = typedArray0.getString(styleable.FontFamily_fontProviderSystemFontFamily);
        typedArray0.recycle();
        FontRequest fontRequest0 = null;
        if(s != null && s1 != null && s2 != null) {
            while(xmlPullParser0.next() != 3) {
                FontResourcesParserCompat.g(xmlPullParser0);
            }
            List list0 = FontResourcesParserCompat.c(resources0, v);
            if(s3 != null) {
                fontRequest0 = new FontRequest(s, s1, s3, list0);
            }
            return new ProviderResourceEntry(new FontRequest(s, s1, s2, list0), fontRequest0, v1, v2, s4);
        }
        ArrayList arrayList0 = new ArrayList();
        while(xmlPullParser0.next() != 3) {
            if(xmlPullParser0.getEventType() != 2) {
            }
            else if(xmlPullParser0.getName().equals("font")) {
                arrayList0.add(FontResourcesParserCompat.f(xmlPullParser0, resources0));
            }
            else {
                FontResourcesParserCompat.g(xmlPullParser0);
            }
        }
        return arrayList0.isEmpty() ? null : new FontFamilyFilesResourceEntry(((FontFileResourceEntry[])arrayList0.toArray(new FontFileResourceEntry[0])));
    }

    private static FontFileResourceEntry f(XmlPullParser xmlPullParser0, Resources resources0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = resources0.obtainAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.FontFamilyFont);
        int v = typedArray0.getInt((typedArray0.hasValue(styleable.FontFamilyFont_fontWeight) ? styleable.FontFamilyFont_fontWeight : styleable.FontFamilyFont_android_fontWeight), 400);
        boolean z = 1 == typedArray0.getInt((typedArray0.hasValue(styleable.FontFamilyFont_fontStyle) ? styleable.FontFamilyFont_fontStyle : styleable.FontFamilyFont_android_fontStyle), 0);
        int v1 = typedArray0.hasValue(styleable.FontFamilyFont_ttcIndex) ? styleable.FontFamilyFont_ttcIndex : styleable.FontFamilyFont_android_ttcIndex;
        String s = typedArray0.getString((typedArray0.hasValue(styleable.FontFamilyFont_fontVariationSettings) ? styleable.FontFamilyFont_fontVariationSettings : styleable.FontFamilyFont_android_fontVariationSettings));
        int v2 = typedArray0.getInt(v1, 0);
        int v3 = typedArray0.hasValue(styleable.FontFamilyFont_font) ? styleable.FontFamilyFont_font : styleable.FontFamilyFont_android_font;
        int v4 = typedArray0.getResourceId(v3, 0);
        String s1 = typedArray0.getString(v3);
        typedArray0.recycle();
        while(xmlPullParser0.next() != 3) {
            FontResourcesParserCompat.g(xmlPullParser0);
        }
        return new FontFileResourceEntry(s1, v, z, s, v2, v4);
    }

    private static void g(XmlPullParser xmlPullParser0) throws XmlPullParserException, IOException {
        int v = 1;
        while(v > 0) {
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

    private static List h(String[] arr_s) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            list0.add(Base64.decode(arr_s[v], 0));
        }
        return list0;
    }
}

