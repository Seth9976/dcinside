package androidx.core.net;

import android.net.Uri;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;

public final class MailTo {
    private HashMap a;
    public static final String b = "mailto:";
    private static final String c = "mailto";
    private static final String d = "to";
    private static final String e = "body";
    private static final String f = "cc";
    private static final String g = "bcc";
    private static final String h = "subject";

    private MailTo() {
        this.a = new HashMap();
    }

    public String a() {
        return (String)this.a.get("bcc");
    }

    public String b() {
        return (String)this.a.get("body");
    }

    public String c() {
        return (String)this.a.get("cc");
    }

    public Map d() {
        return this.a;
    }

    public String e() {
        return (String)this.a.get("subject");
    }

    public String f() {
        return (String)this.a.get("to");
    }

    public static boolean g(Uri uri0) {
        return uri0 != null && "mailto".equals(uri0.getScheme());
    }

    public static boolean h(String s) {
        return s != null && s.startsWith("mailto:");
    }

    public static MailTo i(Uri uri0) throws ParseException {
        return MailTo.j(uri0.toString());
    }

    public static MailTo j(String s) throws ParseException {
        String s2;
        String s1;
        Preconditions.l(s);
        if(!MailTo.h(s)) {
            throw new ParseException("Not a mailto scheme");
        }
        int v = s.indexOf(35);
        if(v != -1) {
            s = s.substring(0, v);
        }
        int v1 = s.indexOf(0x3F);
        if(v1 == -1) {
            s1 = Uri.decode(s.substring(7));
            s2 = null;
        }
        else {
            s1 = Uri.decode(s.substring(7, v1));
            s2 = s.substring(v1 + 1);
        }
        MailTo mailTo0 = new MailTo();
        if(s2 != null) {
            String[] arr_s = s2.split("&");
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                String[] arr_s1 = arr_s[v2].split("=", 2);
                if(arr_s1.length != 0) {
                    String s3 = Uri.decode(arr_s1[0]).toLowerCase(Locale.ROOT);
                    String s4 = arr_s1.length <= 1 ? null : Uri.decode(arr_s1[1]);
                    mailTo0.a.put(s3, s4);
                }
            }
        }
        String s5 = mailTo0.f();
        if(s5 != null) {
            s1 = s1 + ", " + s5;
        }
        mailTo0.a.put("to", s1);
        return mailTo0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("mailto:");
        stringBuilder0.append('?');
        for(Object object0: this.a.entrySet()) {
            stringBuilder0.append(Uri.encode(((String)((Map.Entry)object0).getKey())));
            stringBuilder0.append('=');
            stringBuilder0.append(Uri.encode(((String)((Map.Entry)object0).getValue())));
            stringBuilder0.append('&');
        }
        return stringBuilder0.toString();
    }
}

