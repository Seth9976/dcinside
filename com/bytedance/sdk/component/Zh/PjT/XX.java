package com.bytedance.sdk.component.Zh.PjT;

import com.bytedance.sdk.component.Zh.PjT.Zh.SM;
import j..util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class XX {
    public static final class PjT {
        static enum com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST;

        }

        String Au;
        int JQp;
        String PjT;
        String ReZ;
        List XX;
        String Zh;
        String cr;
        final List cz;

        public PjT() {
            this.Zh = "";
            this.ReZ = "";
            this.JQp = -1;
            ArrayList arrayList0 = new ArrayList();
            this.cz = arrayList0;
            arrayList0.add("");
        }

        private static String JQp(String s, int v, int v1) {
            return SM.PjT(XX.PjT(s, v, v1, false));
        }

        // 去混淆评级： 低(20)
        private boolean JQp(String s) {
            return s.equals(".") || s.equalsIgnoreCase("%2e");
        }

        private PjT PjT(String s, boolean z) {
            int v = 0;
            do {
                int v1 = SM.PjT(s, v, s.length(), "/\\");
                this.PjT(s, v, v1, v1 < s.length(), z);
                v = v1 + 1;
            }
            while(v <= s.length());
            return this;
        }

        private void PjT(String s, int v, int v1) {
            if(v == v1) {
                return;
            }
            switch(s.charAt(v)) {
                case 0x2F: 
                case 92: {
                    this.cz.clear();
                    this.cz.add("");
                    break;
                }
                default: {
                    this.cz.set(this.cz.size() - 1, "");
                    goto label_8;
                }
            }
            while(true) {
                ++v;
            label_8:
                int v2 = v;
                if(v2 >= v1) {
                    break;
                }
                v = SM.PjT(s, v2, v1, "/\\");
                boolean z = v < v1;
                this.PjT(s, v2, v, z, true);
                if(z) {
                    continue;
                }
                if(false) {
                    break;
                }
                goto label_8;
            }
        }

        private void PjT(String s, int v, int v1, boolean z, boolean z1) {
            String s1 = XX.PjT(s, v, v1, " \"<>^`{}|/\\?#", z1, false, false, true, null);
            if(this.JQp(s1)) {
                return;
            }
            if(this.cz(s1)) {
                this.ReZ();
                return;
            }
            if(((String)this.cz.get(this.cz.size() - 1)).isEmpty()) {
                this.cz.set(this.cz.size() - 1, s1);
            }
            else {
                this.cz.add(s1);
            }
            if(z) {
                this.cz.add("");
            }
        }

        int PjT() {
            return this.JQp == -1 ? XX.PjT(this.PjT) : this.JQp;
        }

        com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT PjT(XX xX0, String s) {
            int v8;
            int v4;
            int v = SM.PjT(s, 0, s.length());
            int v1 = SM.Zh(s, v, s.length());
            if(PjT.Zh(s, v, v1) != -1) {
                if(s.regionMatches(true, v, "https:", 0, 6)) {
                    this.PjT = "https";
                    v += 6;
                    goto label_14;
                }
                if(s.regionMatches(true, v, "http:", 0, 5)) {
                    this.PjT = "http";
                    v += 5;
                    goto label_14;
                }
                return com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT.ReZ;
            }
            if(xX0 != null) {
                this.PjT = xX0.PjT;
            label_14:
                int v2 = PjT.ReZ(s, v, v1);
                if(v2 >= 2 || xX0 == null || !xX0.PjT.equals(this.PjT)) {
                    int v3 = v + v2;
                    boolean z = false;
                    boolean z1 = false;
                    while(true) {
                        v4 = SM.PjT(s, v3, v1, "@/\\?#");
                        int v5 = v4 == v1 ? -1 : s.charAt(v4);
                        if(v5 == -1 || v5 == 35 || v5 == 0x2F || (v5 == 0x3F || v5 == 92)) {
                            break;
                        }
                        if(v5 == 0x40) {
                            if(z) {
                                v8 = v4;
                                this.ReZ = this.ReZ + "%40" + XX.PjT(s, v3, v8, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            }
                            else {
                                int v6 = SM.PjT(s, v3, v4, ':');
                                int v7 = v6;
                                v8 = v4;
                                String s1 = XX.PjT(s, v3, v6, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if(z1) {
                                    s1 = this.Zh + "%40" + s1;
                                }
                                this.Zh = s1;
                                if(v7 != v8) {
                                    this.ReZ = XX.PjT(s, v7 + 1, v8, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    z = true;
                                }
                                z1 = true;
                            }
                            v3 = v8 + 1;
                        }
                    }
                    int v9 = PjT.cr(s, v3, v4);
                    if(v9 + 1 < v4) {
                        this.cr = PjT.JQp(s, v3, v9);
                        int v10 = PjT.cz(s, v9 + 1, v4);
                        this.JQp = v10;
                        if(v10 == -1) {
                            return com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT.cr;
                        }
                    }
                    else {
                        this.cr = PjT.JQp(s, v3, v9);
                        this.JQp = XX.PjT(this.PjT);
                    }
                    if(this.cr == null) {
                        return com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT.JQp;
                    }
                    v = v4;
                }
                else {
                    this.Zh = xX0.Zh();
                    this.ReZ = xX0.ReZ();
                    this.cr = xX0.Zh;
                    this.JQp = xX0.ReZ;
                    this.cz.clear();
                    List list0 = xX0.cr();
                    this.cz.addAll(list0);
                    if(v == v1 || s.charAt(v) == 35) {
                        this.cr(xX0.JQp());
                    }
                }
                int v11 = SM.PjT(s, v, v1, "?#");
                this.PjT(s, v, v11);
                if(v11 < v1 && s.charAt(v11) == 0x3F) {
                    int v12 = SM.PjT(s, v11, v1, '#');
                    this.XX = XX.Zh(XX.PjT(s, v11 + 1, v12, " \"\'<>#", true, false, true, true, null));
                    v11 = v12;
                }
                if(v11 < v1 && s.charAt(v11) == 35) {
                    this.Au = XX.PjT(s, v11 + 1, v1, "", true, false, false, false, null);
                }
                return com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT.PjT;
            }
            return com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT.Zh;
        }

        public PjT PjT(String s) {
            if(s == null) {
                throw new NullPointerException("scheme == null");
            }
            if(s.equalsIgnoreCase("http")) {
                this.PjT = "http";
                return this;
            }
            if(!s.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: " + s);
            }
            this.PjT = "https";
            return this;
        }

        public PjT PjT(String s, String s1) {
            if(s == null) {
                throw new NullPointerException("encodedName == null");
            }
            if(this.XX == null) {
                this.XX = new ArrayList();
            }
            this.XX.add(XX.PjT(s, " \"\'<>#&=", true, false, true, true));
            this.XX.add((s1 == null ? null : XX.PjT(s1, " \"\'<>#&=", true, false, true, true)));
            return this;
        }

        private static int ReZ(String s, int v, int v1) {
            int v2 = 0;
            while(v < v1) {
                switch(s.charAt(v)) {
                    case 0x2F: 
                    case 92: {
                        ++v2;
                        ++v;
                        continue;
                    }
                    default: {
                        return v2;
                    }
                }
            }
            return v2;
        }

        private void ReZ() {
            if(((String)this.cz.remove(this.cz.size() - 1)).isEmpty() && !this.cz.isEmpty()) {
                this.cz.set(this.cz.size() - 1, "");
                return;
            }
            this.cz.add("");
        }

        public PjT ReZ(String s) {
            if(s == null) {
                throw new NullPointerException("encodedPathSegments == null");
            }
            return this.PjT(s, true);
        }

        private static int Zh(String s, int v, int v1) {
            if(v1 - v < 2) {
                return -1;
            }
            int v2 = s.charAt(v);
            if(v2 >= 97 && v2 <= 0x7A || v2 >= 65 && v2 <= 90) {
                while(true) {
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                    int v3 = s.charAt(v);
                    if((v3 < 97 || v3 > 0x7A) && (v3 < 65 || v3 > 90) && (v3 < 0x30 || v3 > 57)) {
                        switch(v3) {
                            case 43: 
                            case 45: 
                            case 46: {
                                break;
                            }
                            case 58: {
                                return v;
                            }
                            default: {
                                return -1;
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public PjT Zh(String s) {
            if(s == null) {
                throw new NullPointerException("host == null");
            }
            String s1 = PjT.JQp(s, 0, s.length());
            if(s1 == null) {
                throw new IllegalArgumentException("unexpected host: " + s);
            }
            this.cr = s1;
            return this;
        }

        public XX Zh() {
            if(this.PjT == null) {
                throw new IllegalStateException("scheme == null");
            }
            if(this.cr == null) {
                throw new IllegalStateException("host == null");
            }
            return new XX(this);
        }

        private static int cr(String s, int v, int v1) {
            while(v < v1) {
                switch(s.charAt(v)) {
                    case 58: {
                        return v;
                    }
                    case 91: {
                        while(true) {
                            ++v;
                            if(v >= v1 || s.charAt(v) == 93) {
                                break;
                            }
                        }
                    }
                }
                ++v;
            }
            return v1;
        }

        public PjT cr(String s) {
            this.XX = s == null ? null : XX.Zh(XX.PjT(s, " \"\'<>#", true, false, true, true));
            return this;
        }

        private static int cz(String s, int v, int v1) {
            try {
                int v2 = Integer.parseInt(XX.PjT(s, v, v1, "", false, false, false, true, null));
                if(v2 > 0 && v2 <= 0xFFFF) {
                    return v2;
                }
            }
            catch(NumberFormatException unused_ex) {
            }
            return -1;
        }

        // 去混淆评级： 低(40)
        private boolean cz(String s) {
            return s.equals("..") || s.equalsIgnoreCase("%2e.") || s.equalsIgnoreCase(".%2e") || s.equalsIgnoreCase("%2e%2e");
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.PjT);
            stringBuilder0.append("://");
            if(!this.Zh.isEmpty() || !this.ReZ.isEmpty()) {
                stringBuilder0.append(this.Zh);
                if(!this.ReZ.isEmpty()) {
                    stringBuilder0.append(':');
                    stringBuilder0.append(this.ReZ);
                }
                stringBuilder0.append('@');
            }
            if(this.cr.indexOf(58) == -1) {
                stringBuilder0.append(this.cr);
            }
            else {
                stringBuilder0.append('[');
                stringBuilder0.append(this.cr);
                stringBuilder0.append(']');
            }
            int v = this.PjT();
            if(v != XX.PjT(this.PjT)) {
                stringBuilder0.append(':');
                stringBuilder0.append(v);
            }
            XX.PjT(stringBuilder0, this.cz);
            if(this.XX != null) {
                stringBuilder0.append('?');
                XX.Zh(stringBuilder0, this.XX);
            }
            if(this.Au != null) {
                stringBuilder0.append('#');
                stringBuilder0.append(this.Au);
            }
            return stringBuilder0.toString();
        }
    }

    private final List Au;
    private final String DWo;
    private final String JQp;
    final String PjT;
    final int ReZ;
    private final String SM;
    private final List XX;
    final String Zh;
    private static final char[] cr;
    private final String cz;

    static {
        XX.cr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    XX(PjT xX$PjT0) {
        this.PjT = xX$PjT0.PjT;
        this.JQp = XX.PjT(xX$PjT0.Zh, false);
        this.cz = XX.PjT(xX$PjT0.ReZ, false);
        this.Zh = xX$PjT0.cr;
        this.ReZ = xX$PjT0.PjT();
        this.XX = this.PjT(xX$PjT0.cz, false);
        String s = null;
        this.Au = xX$PjT0.XX == null ? null : this.PjT(xX$PjT0.XX, true);
        String s1 = xX$PjT0.Au;
        if(s1 != null) {
            s = XX.PjT(s1, false);
        }
        this.SM = s;
        this.DWo = xX$PjT0.toString();
    }

    public String JQp() {
        if(this.Au == null) {
            return null;
        }
        int v = this.DWo.indexOf(0x3F);
        return this.DWo.substring(v + 1, SM.PjT(this.DWo, v + 1, this.DWo.length(), '#'));
    }

    public static int PjT(String s) {
        if(s.equals("http")) {
            return 80;
        }
        return s.equals("https") ? 443 : -1;
    }

    static String PjT(String s, int v, int v1, String s1, boolean z, boolean z1, boolean z2, boolean z3, Charset charset0) {
        int v2 = v;
        while(v2 < v1) {
            int v3 = s.codePointAt(v2);
            if(v3 >= 0x20 && v3 != 0x7F && (v3 < 0x80 || !z3) && s1.indexOf(v3) == -1 && (v3 != 37 || z && (!z1 || XX.PjT(s, v2, v1))) && (v3 != 43 || !z2)) {
                v2 += Character.charCount(v3);
                continue;
            }
            com.bytedance.sdk.component.Zh.PjT.Zh.PjT pjT0 = new com.bytedance.sdk.component.Zh.PjT.Zh.PjT();
            pjT0.PjT(s, v, v2);
            XX.PjT(pjT0, s, v2, v1, s1, z, z1, z2, z3, charset0);
            return "";
        }
        return s.substring(v, v1);
    }

    static String PjT(String s, int v, int v1, boolean z) {
        int v2 = v;
        while(v2 < v1) {
            int v3 = s.charAt(v2);
            if(v3 != 37 && (v3 != 43 || !z)) {
                ++v2;
                continue;
            }
            com.bytedance.sdk.component.Zh.PjT.Zh.PjT pjT0 = new com.bytedance.sdk.component.Zh.PjT.Zh.PjT();
            pjT0.PjT(s, v, v2);
            XX.PjT(pjT0, s, v2, v1, z);
            return "";
        }
        return s.substring(v, v1);
    }

    static String PjT(String s, String s1, boolean z, boolean z1, boolean z2, boolean z3) {
        return XX.PjT(s, 0, s.length(), s1, z, z1, z2, z3, null);
    }

    static String PjT(String s, boolean z) {
        return XX.PjT(s, 0, s.length(), z);
    }

    private List PjT(List list0, boolean z) {
        int v = list0.size();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)list0.get(v1);
            arrayList0.add((s == null ? null : XX.PjT(s, z)));
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    static void PjT(com.bytedance.sdk.component.Zh.PjT.Zh.PjT pjT0, String s, int v, int v1, String s1, boolean z, boolean z1, boolean z2, boolean z3, Charset charset0) {
        com.bytedance.sdk.component.Zh.PjT.Zh.PjT pjT1 = null;
        while(v < v1) {
            int v2 = s.codePointAt(v);
            if(!z || v2 != 9 && v2 != 10 && v2 != 12 && v2 != 13) {
                if(v2 == 43 && z2) {
                    pjT0.PjT((z ? "+" : "%2B"));
                }
                else if(v2 < 0x20 || v2 == 0x7F || v2 >= 0x80 && z3 || s1.indexOf(v2) != -1 || v2 == 37 && (!z || z1 && !XX.PjT(s, v, v1))) {
                    if(pjT1 == null) {
                        pjT1 = new com.bytedance.sdk.component.Zh.PjT.Zh.PjT();
                    }
                    if(charset0 == null || charset0.equals(SM.PjT)) {
                        pjT1.PjT(v2);
                    }
                    else {
                        pjT1.PjT(s, v, Character.charCount(v2) + v, charset0);
                    }
                    while(!pjT1.PjT()) {
                        int v3 = pjT1.Zh();
                        pjT0.Zh(37);
                        pjT0.Zh(((int)XX.cr[(v3 & 0xFF) >> 4 & 15]));
                        pjT0.Zh(((int)XX.cr[v3 & 15]));
                    }
                }
                else {
                    pjT0.PjT(v2);
                }
            }
            v += Character.charCount(v2);
        }
    }

    static void PjT(com.bytedance.sdk.component.Zh.PjT.Zh.PjT pjT0, String s, int v, int v1, boolean z) {
        while(v < v1) {
            int v2 = s.codePointAt(v);
            if(v2 == 37 && v + 2 < v1) {
                int v3 = SM.PjT(s.charAt(v + 1));
                int v4 = SM.PjT(s.charAt(v + 2));
                if(v3 != -1 && v4 != -1) {
                    pjT0.Zh((v3 << 4) + v4);
                    v += 2;
                }
            }
            else if(v2 == 43 && z) {
                pjT0.Zh(0x20);
            }
            else {
                pjT0.PjT(v2);
            }
            v += Character.charCount(v2);
        }
    }

    static void PjT(StringBuilder stringBuilder0, List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append('/');
            stringBuilder0.append(((String)list0.get(v1)));
        }
    }

    static boolean PjT(String s, int v, int v1) {
        return v + 2 < v1 && s.charAt(v) == 37 && SM.PjT(s.charAt(v + 1)) != -1 && SM.PjT(s.charAt(v + 2)) != -1;
    }

    public URL PjT() {
        try {
            return new URL(this.DWo);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new RuntimeException(malformedURLException0);
        }
    }

    public static XX ReZ(String s) {
        PjT xX$PjT0 = new PjT();
        return xX$PjT0.PjT(null, s) == com.bytedance.sdk.component.Zh.PjT.XX.PjT.PjT.PjT ? xX$PjT0.Zh() : null;
    }

    // 去混淆评级： 低(20)
    public String ReZ() {
        return this.cz.isEmpty() ? "" : this.DWo.substring(this.DWo.indexOf(58, this.PjT.length() + 3) + 1, this.DWo.indexOf(0x40));
    }

    static List Zh(String s) {
        List list0 = new ArrayList();
        for(int v = 0; v <= s.length(); v = v1 + 1) {
            int v1 = s.indexOf(38, v) == -1 ? s.length() : s.indexOf(38, v);
            int v2 = s.indexOf(61, v);
            if(v2 == -1 || v2 > v1) {
                list0.add(s.substring(v, v1));
                list0.add(null);
            }
            else {
                list0.add(s.substring(v, v2));
                list0.add(s.substring(v2 + 1, v1));
            }
        }
        return list0;
    }

    static void Zh(StringBuilder stringBuilder0, List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; v1 += 2) {
            String s = (String)list0.get(v1);
            String s1 = (String)list0.get(v1 + 1);
            if(v1 > 0) {
                stringBuilder0.append('&');
            }
            stringBuilder0.append(s);
            if(s1 != null) {
                stringBuilder0.append('=');
                stringBuilder0.append(s1);
            }
        }
    }

    public String Zh() {
        if(this.JQp.isEmpty()) {
            return "";
        }
        int v = this.PjT.length();
        return this.DWo.substring(v + 3, SM.PjT(this.DWo, v + 3, this.DWo.length(), ":@"));
    }

    public List cr() {
        int v = this.DWo.indexOf(0x2F, this.PjT.length() + 3);
        int v1 = SM.PjT(this.DWo, v, this.DWo.length(), "?#");
        List list0 = new ArrayList();
        while(v < v1) {
            int v2 = SM.PjT(this.DWo, v + 1, v1, '/');
            list0.add(this.DWo.substring(v + 1, v2));
            v = v2;
        }
        return list0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof XX && ((XX)object0).DWo.equals(this.DWo);
    }

    @Override
    public int hashCode() {
        return this.DWo.hashCode();
    }

    @Override
    public String toString() {
        return this.DWo;
    }
}

