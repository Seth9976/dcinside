package androidx.core.app;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

@RestrictTo({Scope.c})
public class AppLocalesStorageHelper {
    static final String a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final String b = "application_locales";
    static final String c = "locales";
    static final String d = "AppLocalesStorageHelper";
    static final boolean e = false;
    private static final Object f;

    static {
        AppLocalesStorageHelper.f = new Object();
    }

    public static void a(Context context0, String s) {
        FileOutputStream fileOutputStream0;
        synchronized(AppLocalesStorageHelper.f) {
            if(s.equals("")) {
                context0.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                fileOutputStream0 = context0.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            }
            catch(FileNotFoundException unused_ex) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
                return;
            }
            XmlSerializer xmlSerializer0 = Xml.newSerializer();
            try {
                try {
                    xmlSerializer0.setOutput(fileOutputStream0, null);
                    xmlSerializer0.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializer0.startTag(null, "locales");
                    xmlSerializer0.attribute(null, "application_locales", s);
                    xmlSerializer0.endTag(null, "locales");
                    xmlSerializer0.endDocument();
                    goto label_32;
                }
                catch(Exception exception0) {
                }
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", exception0);
                if(fileOutputStream0 != null) {
                    goto label_25;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_28;
            }
            try {
            label_25:
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return;
        label_28:
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        label_32:
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
        }
    }

    public static String b(Context context0) {
        FileInputStream fileInputStream0;
        synchronized(AppLocalesStorageHelper.f) {
            String s = "";
            try {
                fileInputStream0 = context0.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            }
            catch(FileNotFoundException unused_ex) {
                return "";
            }
            try {
                try {
                    XmlPullParser xmlPullParser0 = Xml.newPullParser();
                    xmlPullParser0.setInput(fileInputStream0, "UTF-8");
                    int v1 = xmlPullParser0.getDepth();
                    do {
                        int v2 = xmlPullParser0.next();
                        if(v2 == 1 || v2 == 3 && xmlPullParser0.getDepth() <= v1) {
                            goto label_26;
                        }
                    }
                    while(v2 == 3 || v2 == 4 || !xmlPullParser0.getName().equals("locales"));
                    s = xmlPullParser0.getAttributeValue(null, "application_locales");
                    goto label_26;
                }
                catch(XmlPullParserException | IOException unused_ex) {
                }
                Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                if(fileInputStream0 != null) {
                    goto label_20;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
                goto label_22;
            }
            try {
            label_20:
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            goto label_28;
        label_22:
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        label_26:
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
        label_28:
            if(s.isEmpty()) {
                context0.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            }
            return s;
        }
    }
}

