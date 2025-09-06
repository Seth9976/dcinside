package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jeb.synthetic.TWR;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.b})
public class ShortcutXmlParser {
    private static final String a = "ShortcutXmlParser";
    private static final String b = "android.app.shortcuts";
    private static final String c = "shortcut";
    private static final String d = "shortcutId";
    private static volatile ArrayList e;
    private static final Object f;

    static {
        ShortcutXmlParser.f = new Object();
    }

    private static String a(XmlPullParser xmlPullParser0, String s) {
        String s1 = xmlPullParser0.getAttributeValue("http://schemas.android.com/apk/res/android", s);
        return s1 == null ? xmlPullParser0.getAttributeValue(null, s) : s1;
    }

    @WorkerThread
    public static List b(Context context0) {
        if(ShortcutXmlParser.e == null) {
            Object object0 = ShortcutXmlParser.f;
            synchronized(object0) {
                if(ShortcutXmlParser.e == null) {
                    ShortcutXmlParser.e = new ArrayList();
                    ShortcutXmlParser.e.addAll(ShortcutXmlParser.e(context0));
                }
            }
        }
        return ShortcutXmlParser.e;
    }

    private static XmlResourceParser c(Context context0, ActivityInfo activityInfo0) {
        XmlResourceParser xmlResourceParser0 = activityInfo0.loadXmlMetaData(context0.getPackageManager(), "android.app.shortcuts");
        if(xmlResourceParser0 == null) {
            throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo0.name);
        }
        return xmlResourceParser0;
    }

    @VisibleForTesting
    public static List d(XmlPullParser xmlPullParser0) throws IOException, XmlPullParserException {
        List list0 = new ArrayList(1);
        while(true) {
            int v = xmlPullParser0.next();
            if(v == 1 || v == 3 && xmlPullParser0.getDepth() <= 0) {
                break;
            }
            if(v == 2 && xmlPullParser0.getDepth() == 2 && "shortcut".equals(xmlPullParser0.getName())) {
                String s = ShortcutXmlParser.a(xmlPullParser0, "shortcutId");
                if(s != null) {
                    list0.add(s);
                }
            }
        }
        return list0;
    }

    private static Set e(Context context0) {
        Set set0 = new HashSet();
        Intent intent0 = new Intent("android.intent.action.MAIN");
        intent0.addCategory("android.intent.category.LAUNCHER");
        intent0.setPackage("com.dcinside.app.android");
        List list0 = context0.getPackageManager().queryIntentActivities(intent0, 0x80);
        if(list0 != null && list0.size() != 0) {
            try {
                for(Object object0: list0) {
                    ActivityInfo activityInfo0 = ((ResolveInfo)object0).activityInfo;
                    if(activityInfo0.metaData != null && activityInfo0.metaData.containsKey("android.app.shortcuts")) {
                        XmlResourceParser xmlResourceParser0 = ShortcutXmlParser.c(context0, activityInfo0);
                        TWR.declareResource(xmlResourceParser0);
                        TWR.useResource$NT(xmlResourceParser0);
                        set0.addAll(ShortcutXmlParser.d(xmlResourceParser0));
                    }
                }
            }
            catch(Exception exception0) {
                Log.e("ShortcutXmlParser", "Failed to parse the Xml resource: ", exception0);
            }
        }
        return set0;
    }
}

