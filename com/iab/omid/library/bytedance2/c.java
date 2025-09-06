package com.iab.omid.library.bytedance2;

import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class c {
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;

    static {
        c.a = Pattern.compile("<(head)( [^>]*)?>", 2);
        c.b = Pattern.compile("<(head)( [^>]*)?/>", 2);
        c.c = Pattern.compile("<(body)( [^>]*?)?>", 2);
        c.d = Pattern.compile("<(body)( [^>]*?)?/>", 2);
        c.e = Pattern.compile("<(html)( [^>]*?)?>", 2);
        c.f = Pattern.compile("<(html)( [^>]*?)?/>", 2);
        c.g = Pattern.compile("<!DOCTYPE [^>]*>", 2);
    }

    static String a(String s, String s1) {
        g.a(s, "HTML is null or empty");
        int[][] arr2_v = c.a(s);
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + s1.length() + 16);
        if(c.b(s, stringBuilder0, c.b, s1, arr2_v)) {
            return stringBuilder0.toString();
        }
        if(c.a(s, stringBuilder0, c.a, s1, arr2_v)) {
            return stringBuilder0.toString();
        }
        if(c.b(s, stringBuilder0, c.d, s1, arr2_v)) {
            return stringBuilder0.toString();
        }
        if(c.a(s, stringBuilder0, c.c, s1, arr2_v)) {
            return stringBuilder0.toString();
        }
        if(c.b(s, stringBuilder0, c.f, s1, arr2_v)) {
            return stringBuilder0.toString();
        }
        if(c.a(s, stringBuilder0, c.e, s1, arr2_v)) {
            return stringBuilder0.toString();
        }
        return c.a(s, stringBuilder0, c.g, s1, arr2_v) ? stringBuilder0.toString() : s1 + s;
    }

    private static boolean a(int v, int[][] arr2_v) {
        if(arr2_v != null) {
            for(int v1 = 0; v1 < arr2_v.length; ++v1) {
                int[] arr_v = arr2_v[v1];
                if(v >= arr_v[0] && v <= arr_v[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String s, StringBuilder stringBuilder0, Pattern pattern0, String s1, int[][] arr2_v) {
        Matcher matcher0 = pattern0.matcher(s);
        for(int v = 0; matcher0.find(v); v = v2) {
            int v1 = matcher0.start();
            int v2 = matcher0.end();
            if(!c.a(v1, arr2_v)) {
                stringBuilder0.append(s.substring(0, matcher0.end()));
                stringBuilder0.append(s1);
                stringBuilder0.append(s.substring(matcher0.end()));
                return true;
            }
        }
        return false;
    }

    private static int[][] a(String s) {
        ArrayList arrayList0 = new ArrayList();
        int v = s.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = s.indexOf("<!--", v1);
            if(v2 >= 0) {
                int v3 = s.indexOf("-->", v2);
                if(v3 >= 0) {
                    arrayList0.add(new int[]{v2, v3});
                    v1 = v3 + 3;
                    continue;
                }
                else {
                    arrayList0.add(new int[]{v2, v});
                }
            }
            v1 = v;
        }
        return (int[][])arrayList0.toArray(new int[0][2]);
    }

    static String b(String s, String s1) {
        return c.a(s1, "<script type=\"text/javascript\">" + s + "</script>");
    }

    private static boolean b(String s, StringBuilder stringBuilder0, Pattern pattern0, String s1, int[][] arr2_v) {
        Matcher matcher0 = pattern0.matcher(s);
        for(int v = 0; matcher0.find(v); v = v2) {
            int v1 = matcher0.start();
            int v2 = matcher0.end();
            if(!c.a(v1, arr2_v)) {
                stringBuilder0.append(s.substring(0, matcher0.end() - 2));
                stringBuilder0.append(">");
                stringBuilder0.append(s1);
                stringBuilder0.append("</");
                stringBuilder0.append(matcher0.group(1));
                stringBuilder0.append(">");
                stringBuilder0.append(s.substring(matcher0.end()));
                return true;
            }
        }
        return false;
    }
}

