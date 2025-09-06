package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class f {
    static final class a {
        final int a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        final List g;

        private a(int v, String s, String s1, int v1, int v2, String s2, List list0) {
            this.a = v;
            this.b = s;
            this.c = s1;
            this.d = v1;
            this.e = v2;
            this.f = s2;
            this.g = list0;
        }

        static a a(b f$b0, List list0) throws d {
            String s4;
            int v7;
            int v3;
            int v = f$b0.b.indexOf("?");
            if(v == -1) {
                throw new d("path format error, path: " + f$b0.b);
            }
            ArrayList arrayList0 = new ArrayList();
            String[] arr_s = f$b0.b.substring(v + 1).split("&");
            String s = null;
            CharSequence charSequence0 = null;
            CharSequence charSequence1 = null;
            int v1 = 0;
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                String[] arr_s1 = arr_s[v2].split("=");
                if(arr_s1.length == 2) {
                    if("rk".equals(arr_s1[0])) {
                        charSequence0 = Uri.decode(arr_s1[1]);
                    }
                    else if("k".equals(arr_s1[0])) {
                        charSequence1 = Uri.decode(arr_s1[1]);
                    }
                    else if(arr_s1[0].startsWith("u")) {
                        arrayList0.add(Uri.decode(arr_s1[1]));
                    }
                    else if("f".equals(arr_s1[0]) && com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.t(arr_s1[1]) == 1) {
                        v1 = 1;
                    }
                }
            }
            if(TextUtils.isEmpty(charSequence0) || TextUtils.isEmpty(charSequence1)) {
                throw new d("rawKey or key is empty, path: " + f$b0.b);
            }
            if(list0 == null) {
                s4 = null;
                v7 = 0;
                v3 = 0;
            }
            else {
                v3 = 0;
                int v4 = 0;
                for(Object object0: list0) {
                    c f$c0 = (c)object0;
                    if(f$c0 != null && "Range".equalsIgnoreCase(f$c0.a)) {
                        int v5 = f$c0.b.indexOf("=");
                        if(v5 == -1 || !"bytes".equalsIgnoreCase(f$c0.b.substring(0, v5).trim())) {
                            throw new d("Range format error, Range: " + f$c0.b);
                        }
                        String s1 = f$c0.b.substring(v5 + 1);
                        if(s1.contains(",")) {
                            throw new d("Range format error, Range: " + f$c0.b);
                        }
                        int v6 = s1.indexOf("-");
                        if(v6 == -1) {
                            throw new d("Range format error, Range: " + f$c0.b);
                        }
                        String s2 = s1.substring(0, v6).trim();
                        String s3 = s1.substring(v6 + 1).trim();
                        try {
                            if(s2.length() > 0) {
                                v3 = Integer.parseInt(s2);
                            }
                            if(s3.length() > 0) {
                                v4 = Integer.parseInt(s3);
                                if(v3 > v4) {
                                    throw new d("Range format error, Range: " + f$c0.b);
                                }
                            }
                            s = f$c0.b;
                        }
                        catch(NumberFormatException unused_ex) {
                            throw new d("Range format error, Range: " + f$c0.b);
                        }
                    }
                }
                v7 = v4;
                s4 = s;
            }
            if(arrayList0.isEmpty()) {
                throw new d("no url found: path: " + f$b0.b);
            }
            return new a(v1, ((String)charSequence0), ((String)charSequence1), v3, v7, s4, arrayList0);
        }

        @Override
        public String toString() {
            return "Extra{flag=" + this.a + ", rawKey=\'" + this.b + '\'' + ", key=\'" + this.c + '\'' + ", from=" + this.d + ", to=" + this.e + ", urls=" + this.g + '}';
        }
    }

    static final class b {
        final String a;
        final String b;
        final String c;

        private b(String s, String s1, String s2) {
            this.a = s;
            this.b = s1;
            this.c = s2;
        }

        static b a(String s) throws d {
            int v = s.indexOf(0x20);
            if(v == -1) {
                throw new d("request line format error, line: " + s);
            }
            int v1 = s.lastIndexOf(0x20);
            if(v1 <= v) {
                throw new d("request line format error, line: " + s);
            }
            String s1 = s.substring(0, v).trim();
            String s2 = s.substring(v + 1, v1).trim();
            String s3 = s.substring(v1 + 1).trim();
            if(s1.length() == 0 || s2.length() == 0 || s3.length() == 0) {
                throw new d("request line format error, line: " + s);
            }
            return new b(s1, s2, s3);
        }

        @Override
        public String toString() {
            return "RequestLine{method=\'" + this.a + '\'' + ", path=\'" + this.b + '\'' + ", version=\'" + this.c + '\'' + '}';
        }
    }

    public static final class c {
        public final String a;
        public final String b;

        public c(String s, String s1) {
            this.a = s;
            this.b = s1;
        }

        static c a(String s) throws d {
            int v = s.indexOf(":");
            if(v == -1) {
                throw new d("request header format error, header: " + s);
            }
            String s1 = s.substring(0, v).trim();
            String s2 = s.substring(v + 1).trim();
            if(s1.length() == 0 || s2.length() == 0) {
                throw new d("request header format error, header: " + s);
            }
            return new c(s1, s2);
        }

        @Override
        public String toString() {
            return "Header{name=\'" + this.a + '\'' + ", value=\'" + this.b + '\'' + '}';
        }
    }

    static final class d extends Exception {
        d(String s) {
            super(s);
        }
    }

    public final b a;
    public final List b;
    public final a c;

    public f(b f$b0, List list0, a f$a0) {
        this.a = f$b0;
        this.b = list0;
        this.c = f$a0;
    }

    public static f a(InputStream inputStream0) throws IOException, d {
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.b));
        ArrayList arrayList0 = new ArrayList();
        b f$b0 = null;
        while(true) {
            String s = bufferedReader0.readLine();
            if(TextUtils.isEmpty(s)) {
                break;
            }
            String s1 = s.trim();
            if(f$b0 == null) {
                f$b0 = b.a(s1);
            }
            else {
                arrayList0.add(c.a(s1));
            }
        }
        if(f$b0 == null) {
            throw new d("request line is null");
        }
        return new f(f$b0, arrayList0, a.a(f$b0, arrayList0));
    }

    static String b(String s, String s1, List list0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x200);
        String s2 = null;
        do {
            if(s2 != null) {
                if(list0.size() == 1) {
                    return null;
                }
                list0.remove(list0.size() - 1);
            }
            s2 = f.c(stringBuilder0, s, s1, list0);
        }
        while(s2.length() > 0xC00);
        return s2;
    }

    private static String c(StringBuilder stringBuilder0, String s, String s1, List list0) {
        stringBuilder0.delete(0, stringBuilder0.length());
        stringBuilder0.append("rk=");
        stringBuilder0.append(Uri.encode(s));
        stringBuilder0.append("&k=");
        stringBuilder0.append(Uri.encode(s1));
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            stringBuilder0.append("&u");
            stringBuilder0.append(v);
            stringBuilder0.append("=");
            stringBuilder0.append(Uri.encode(((String)list0.get(v))));
        }
        return stringBuilder0.toString();
    }

    @Override
    public String toString() {
        return "Request{requestLine=" + this.a + ", headers=" + this.b + ", extra=" + this.c + '}';
    }
}

