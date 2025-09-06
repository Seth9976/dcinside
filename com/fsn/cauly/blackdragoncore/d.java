package com.fsn.cauly.blackdragoncore;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.l;
import com.fsn.cauly.Y.n;
import com.fsn.cauly.blackdragoncore.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class d {
    static d a;
    public static long b;
    public static Map c;

    static {
    }

    private int a(String s) {
        int v1 = 0;
        for(int v = 0; v < s.length(); ++v) {
            if(String.valueOf(s.charAt(v)).equals("(")) {
                ++v1;
            }
            else if(String.valueOf(s.charAt(v)).equals(")")) {
                --v1;
                if(v1 == 0) {
                    return v;
                }
            }
        }
        return v1;
    }

    public static d a() {
        if(d.a == null) {
            d.a = new d();
        }
        return d.a;
    }

    public String a(Context context0) {
        ArrayList arrayList0 = j.b(context0, "PACKAGE_DETARGET_CHECK");
        String s = "";
        try {
            if(arrayList0 != null && arrayList0.size() > 0) {
                for(Object object0: arrayList0) {
                    String[] arr_s = ((String)object0).split("::");
                    String s1 = arr_s[0];
                    if(!TextUtils.isEmpty(s1) && !s1.contains("::")) {
                        s = s + arr_s[0] + "::";
                    }
                }
            }
            if(s.contains("::")) {
                s = s.substring(0, s.length() - 2);
            }
            new com.fsn.cauly.Y.j(context0).execute();
        }
        catch(Exception unused_ex) {
        }
        return s;
    }

    public void a(Context context0, j0 j00) {
        if(context0 != null && j00 != null) {
            try {
                d.b = 0L;
                ArrayList arrayList0 = j.b(context0, "INSTALL_CHECK");
                for(Object object0: arrayList0) {
                    String s = (String)object0;
                    if(s.contains("::" + j00.F + "::")) {
                        arrayList0.remove(s);
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                if(!TextUtils.isEmpty(j00.F) && !this.c(context0, j00.F)) {
                    arrayList0.add(j00.a + "::" + System.currentTimeMillis() + "::" + j00.F + "::" + j00.F + "::" + j00.n + "::" + j00.k);
                    j.a(context0, "INSTALL_CHECK", arrayList0);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void a(Context context0, String s, String s1) {
        try {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                ArrayList arrayList0 = j.b(context0, "PACKAGE_DETARGET_CHECK");
                ArrayList arrayList1 = new ArrayList();
                long v = System.currentTimeMillis();
                boolean z = false;
                for(Object object0: arrayList0) {
                    String s2 = (String)object0;
                    if(s2.contains("::")) {
                        String[] arr_s = s2.split("::");
                        if(arr_s.length >= 3 && !TextUtils.isEmpty(arr_s[2]) && v - Long.parseLong(arr_s[2]) < 86400000L) {
                            arrayList1.add(s2);
                            if(s2.startsWith(s)) {
                                z = true;
                            }
                        }
                    }
                }
                if(!z) {
                    arrayList1.add(s + "::" + s1 + "::" + System.currentTimeMillis());
                }
                j.a(context0, "PACKAGE_DETARGET_CHECK", arrayList1);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void a(i0 i00, j0 j00) {
        if(i00 != null) {
            try {
                if(i00.r != null) {
                    ArrayList arrayList0 = j.b(i00.b, "INSTALL_CHECK");
                    long v = System.currentTimeMillis();
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: arrayList0) {
                        arrayList1.add(((String)object0));
                    }
                    for(Object object1: arrayList1) {
                        String s = (String)object1;
                        String[] arr_s = s.split("::");
                        if(arr_s != null) {
                            String s1 = arr_s[0];
                            long v1 = Long.parseLong(arr_s[1]);
                            String s2 = arr_s[2];
                            String s3 = arr_s[3];
                            j00.a = s1;
                            if(arr_s.length > 4) {
                                j00.n = arr_s[4];
                                j00.k = arr_s[5];
                            }
                            if(this.c(i00.b, s2) || this.c(i00.b, s3)) {
                                arrayList0.remove(s);
                                l.a(i00, j00, "install", null);
                            }
                            int v2 = i00.r.w;
                            if(v - v1 > (v2 <= 0 ? 86400000L : ((long)v2))) {
                                arrayList0.remove(s);
                            }
                        }
                    }
                    j.a(i00.b, "INSTALL_CHECK", arrayList0);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    boolean b(Context context0, String s) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            intent0.addCategory("android.intent.category.BROWSABLE");
            return !context0.getPackageManager().queryIntentActivities(intent0, 0x10000).isEmpty();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public boolean b(i0 i00, j0 j00) {
        try {
            if(a.a().a(i00.b, false)) {
                a.a().a(i00);
            }
            if(j00 != null && !TextUtils.isEmpty(j00.X)) {
                Map map0 = a.a().g(i00.b);
                Map map1 = a.a().c(i00.b);
                String[] arr_s = j00.X.split(",");
                boolean z = true;
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    String s1 = (String)map0.get(s);
                    if(!TextUtils.isEmpty(s1) && !d.a().d(i00.b, s1)) {
                        map1.remove(s);
                        z = false;
                    }
                }
                a.a().a(i00.b, map1);
                if(!z) {
                    return false;
                }
            }
            if(j00 != null && !TextUtils.isEmpty(j00.U)) {
                boolean z1 = d.a().d(i00.b, j00.U);
                if(j00.V != 2 && !z1) {
                    d.a().a(i00.b, j00.a, j00.U);
                }
                if(j00.V != 0) {
                    n.a(i00, j00, (z1 ? "cy" : "cn"));
                }
                return z1 ? true : j00.V == 2;
            }
        }
        catch(Exception unused_ex) {
        }
        return true;
    }

    void c(Context context0) {
        try {
            if(d.c == null) {
                d.c = new HashMap();
            }
            Intent intent0 = new Intent("android.intent.action.MAIN", null);
            intent0.addCategory("android.intent.category.LAUNCHER");
            for(Object object0: context0.getPackageManager().queryIntentActivities(intent0, 0)) {
                d.c.put(((ResolveInfo)object0).activityInfo.applicationInfo.packageName, "Y");
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public boolean c(Context context0, String s) {
        if(!TextUtils.isEmpty(s) && !s.startsWith("http") && !s.startsWith("intent://")) {
            return s.contains("://") ? this.b(context0, s) : this.e(context0, s);
        }
        return false;
    }

    public boolean d(Context context0, String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            String s1 = s.replace(" ", "");
            if(s1.contains("(") && s1.contains(")")) {
                int v = this.a(s1);
                return this.d(context0, s1.substring(0, s1.indexOf("(")) + this.d(context0, s1.substring(s1.indexOf("(") + 1, v)) + s1.substring(v + 1, s1.length()));
            }
            if(s1.contains("&&")) {
                return this.f(context0, s1, "&&");
            }
            if(s1.contains("||")) {
                return this.f(context0, s1, "||");
            }
            if(s1.contains("&")) {
                return this.f(context0, s1, "&");
            }
            if(s1.contains("|")) {
                return this.f(context0, s1, "|");
            }
            if(s1.equalsIgnoreCase("true")) {
                return true;
            }
            if(s1.equalsIgnoreCase("false")) {
                return false;
            }
            if(!s1.startsWith("!")) {
                return this.e(context0, s1);
            }
            return Build.VERSION.SDK_INT <= 29 ? !this.e(context0, s1.replace("!", "")) : false;
        }
        catch(Exception | Error unused_ex) {
            return false;
        }
    }

    boolean e(Context context0, String s) {
        if(d.c == null) {
            this.c(context0);
        }
        return "Y".equals(d.c.get(s));
    }

    private boolean f(Context context0, String s, String s1) {
        String[] arr_s = s.split(Pattern.quote(s1));
        String s2 = arr_s[0];
        String s3 = s.replace(arr_s[0] + s1, "");
        if(s1.equalsIgnoreCase("&&")) {
            return this.d(context0, s2) && this.d(context0, s3);
        }
        if(s1.equalsIgnoreCase("||")) {
            return this.d(context0, s2) || this.d(context0, s3);
        }
        if(s1.equalsIgnoreCase("&")) {
            boolean z = this.d(context0, s2);
            return this.d(context0, s3) & z;
        }
        boolean z1 = this.d(context0, s2);
        return this.d(context0, s3) | z1;
    }
}

