package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gK {
    private Map PjT;
    private static volatile gK ReZ;
    private volatile boolean Zh;
    private Context cr;

    private gK(Context context0) {
        this.Zh = false;
        if(context0 != null && this.cr == null) {
            this.cr = context0.getApplicationContext();
            this.PjT();
        }
        this.cr = context0;
    }

    private static String JQp(String s) {
        if(s != null && !s.isEmpty()) {
            int v = s.indexOf(46);
            return v < 0 || v >= s.length() - 1 ? "" : s.substring(v + 1);
        }
        return "";
    }

    static gK PjT(Context context0) {
        if(gK.ReZ == null) {
            Class class0 = gK.class;
            __monitor_enter(class0);
            try {
                if(gK.ReZ == null) {
                    gK.ReZ = new gK(context0);
                }
                __monitor_exit(class0);
                return gK.ReZ;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return gK.ReZ;
    }

    public static String PjT(Context context0, String s) {
        if(s != null) {
            try {
                if(s.startsWith("http") && s.contains("?")) {
                    s = s.split("\\?")[0];
                    if(s.endsWith("/")) {
                        s = s.substring(0, s.length() - 1);
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        return gK.PjT(context0).PjT(s);
    }

    private void PjT() {
        if(this.cr == null) {
            return;
        }
        if(!this.Zh) {
            __monitor_enter(this);
            try {
                if(!this.Zh) {
                    List list0 = (List)AccessController.doPrivileged(new PrivilegedAction() {
                        final gK PjT;

                        public List PjT() {
                            List list1;
                            BufferedReader bufferedReader0;
                            InputStream inputStream1;
                            List list0;
                            InputStream inputStream0 = null;
                            try {
                                list0 = new ArrayList();
                                inputStream1 = gK.this.cr.getAssets().open("tt_mime_type.pro");
                            }
                            catch(Throwable unused_ex) {
                                bufferedReader0 = null;
                                goto label_16;
                            }
                            try {
                                bufferedReader0 = null;
                                bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream1));
                                String s;
                                while((s = bufferedReader0.readLine()) != null) {
                                    if(!TextUtils.isEmpty(s)) {
                                        list0.add(s);
                                    }
                                }
                                if(inputStream1 != null) {
                                    goto label_29;
                                }
                                goto label_30;
                            }
                            catch(Throwable unused_ex) {
                                inputStream0 = inputStream1;
                            }
                            try {
                            label_16:
                                list1 = Collections.emptyList();
                            }
                            catch(Throwable throwable0) {
                                if(inputStream0 != null) {
                                    try {
                                        inputStream0.close();
                                    }
                                    catch(Throwable unused_ex) {
                                    }
                                }
                                if(bufferedReader0 != null) {
                                    try {
                                        bufferedReader0.close();
                                    }
                                    catch(Throwable unused_ex) {
                                    }
                                }
                                throw throwable0;
                            }
                            if(inputStream0 != null) {
                                try {
                                    inputStream0.close();
                                }
                                catch(Throwable unused_ex) {
                                }
                            }
                            if(bufferedReader0 != null) {
                                try {
                                    bufferedReader0.close();
                                }
                                catch(Throwable unused_ex) {
                                }
                            }
                            return list1;
                            try {
                            label_29:
                                inputStream1.close();
                            }
                            catch(Throwable unused_ex) {
                            }
                            try {
                            label_30:
                                bufferedReader0.close();
                            }
                            catch(Throwable unused_ex) {
                            }
                            return list0;
                        }

                        @Override
                        public Object run() {
                            return this.PjT();
                        }
                    });
                    this.PjT = new HashMap(list0.size());
                    String s = "";
                    for(Object object0: list0) {
                        String s1 = s + ((String)object0);
                        if(s1.endsWith("\\")) {
                            s = s1.substring(0, s1.length() - 1);
                        }
                        else {
                            this.cz(s1);
                            s = "";
                        }
                    }
                    if(!s.isEmpty()) {
                        this.cz(s);
                    }
                    this.Zh = true;
                }
                __monitor_exit(this);
                return;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        }
    }

    private void PjT(String s, String s1) {
        if(s != null && !s.isEmpty() && s1 != null && !s1.isEmpty() && !this.PjT.containsKey(s)) {
            this.PjT.put(s, s1);
        }
    }

    private static boolean PjT(char c) {
        return c > 0x20 && c < 0x7F && "()<>@,;:/[]?=\\\"".indexOf(((int)c)) < 0;
    }

    public final String PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = this.cr(s);
        return TextUtils.isEmpty(s1) ? null : gK.Zh(s1);
    }

    private static boolean ReZ(String s) {
        int v = s.length();
        if(v == 0) {
            return false;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if(!gK.PjT(s.charAt(v1))) {
                return false;
            }
        }
        return true;
    }

    private static String Zh(String s) {
        int v = s.indexOf(0x2F);
        int v1 = s.indexOf(59);
        if(v < 0) {
            return null;
        }
        Locale locale0 = Locale.ENGLISH;
        String s1 = s.substring(0, v).trim().toLowerCase(locale0);
        if(!gK.ReZ(s1)) {
            return null;
        }
        String s2 = (v1 >= 0 ? s.substring(v + 1, v1) : s.substring(v + 1)).trim().toLowerCase(locale0);
        return gK.ReZ(s2) ? s1 + '/' + s2 : null;
    }

    private String cr(String s) {
        String s2;
        String s1 = gK.JQp(s);
        if(s1.isEmpty()) {
            return null;
        }
        this.PjT();
        if(this.PjT != null && !this.PjT.isEmpty()) {
            do {
                s2 = (String)this.PjT.get(s1);
                if(s2 == null) {
                    s1 = gK.JQp(s1);
                }
            }
            while(s2 == null && !s1.isEmpty());
            return s2;
        }
        return null;
    }

    private void cz(String s) {
        String s1 = s.trim();
        if(!s1.isEmpty() && s1.charAt(0) != 35) {
            String s2 = s1.replaceAll("\\s*#.*", "");
            if(s2.indexOf(61) > 0) {
                Matcher matcher0 = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(s2);
                if(matcher0.find()) {
                    String s3 = matcher0.group().substring(5);
                    if(s3.charAt(0) == 34) {
                        s3 = s3.substring(1, s3.length() - 1);
                    }
                    Matcher matcher1 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(s2);
                    if(matcher1.find()) {
                        String s4 = matcher1.group().substring(5);
                        if(s4.charAt(0) == 34) {
                            s4 = s4.substring(1, s4.length() - 1);
                        }
                        String[] arr_s = s4.split("[\\p{Blank}|\\p{Punct}]+");
                        for(int v = 0; v < arr_s.length; ++v) {
                            this.PjT(arr_s[v], s3);
                        }
                    }
                }
                return;
            }
            String[] arr_s1 = s2.split("\\s+");
            for(int v1 = 1; v1 < arr_s1.length; ++v1) {
                this.PjT(arr_s1[v1], arr_s1[0]);
            }
        }
    }
}

