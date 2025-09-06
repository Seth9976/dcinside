package org.jsoup.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.jsoup.helper.i;
import org.jsoup.j;

public final class a {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String[] h;
    private ArrayList i;
    private int j;
    private boolean k;
    private String l;
    private int m;
    static final char n = '\uFFFF';
    private static final int o = 12;
    static final int p = 0x8000;
    static final int q = 0x6000;
    private static final int r = 0x400;
    private static final int s = 0x200;

    public a(Reader reader0) {
        this(reader0, 0x8000);
    }

    public a(Reader reader0, int v) {
        this.g = -1;
        this.h = new String[0x200];
        this.i = null;
        this.j = 1;
        i.o(reader0);
        i.i(reader0.markSupported(), "The supplied Reader must support mark(), but does not.");
        this.b = reader0;
        this.a = new char[Math.min(v, 0x8000)];
        this.b();
    }

    public a(String s) {
        this(new StringReader(s), s.length());
    }

    public int A() {
        return this.B(this.P());
    }

    int B(int v) {
        if(!this.y()) {
            return 1;
        }
        int v1 = this.z(v);
        return v1 == -1 ? this.j : v1 + this.j + 1;
    }

    void C() {
        if(this.c - this.e < 0x400) {
            this.d = 0;
        }
        this.b();
        this.g = this.e;
    }

    boolean D(String s) {
        this.b();
        if(this.G(s)) {
            this.e += s.length();
            return true;
        }
        return false;
    }

    boolean E(String s) {
        if(this.L(s)) {
            this.e += s.length();
            return true;
        }
        return false;
    }

    boolean F(char c) {
        return !this.w() && this.a[this.e] == c;
    }

    boolean G(String s) {
        this.b();
        int v = s.length();
        if(v > this.c - this.e) {
            return false;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if(s.charAt(v1) != this.a[this.e + v1]) {
                return false;
            }
        }
        return true;
    }

    boolean H(char[] arr_c) {
        if(this.w()) {
            return false;
        }
        this.b();
        int v = this.a[this.e];
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            if(arr_c[v1] == v) {
                return true;
            }
        }
        return false;
    }

    boolean I(char[] arr_c) {
        this.b();
        return !this.w() && Arrays.binarySearch(arr_c, this.a[this.e]) >= 0;
    }

    boolean J() {
        if(this.w()) {
            return false;
        }
        int v = this.a[this.e];
        return v >= 65 && v <= 90 || v >= 97 && v <= 0x7A;
    }

    boolean K() {
        if(this.w()) {
            return false;
        }
        int v = this.a[this.e];
        return v >= 0x30 && v <= 57;
    }

    boolean L(String s) {
        this.b();
        int v = s.length();
        if(v > this.c - this.e) {
            return false;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if(Character.toUpperCase(s.charAt(v1)) != Character.toUpperCase(this.a[this.e + v1])) {
                return false;
            }
        }
        return true;
    }

    boolean M() {
        if(this.w()) {
            return false;
        }
        int v = this.a[this.e];
        return v >= 65 && v <= 90 || v >= 97 && v <= 0x7A || Character.isLetter(((char)v));
    }

    int N(char c) {
        this.b();
        for(int v = this.e; v < this.c; ++v) {
            if(c == this.a[v]) {
                return v - this.e;
            }
        }
        return -1;
    }

    int O(CharSequence charSequence0) {
        this.b();
        int v = charSequence0.charAt(0);
        for(int v1 = this.e; v1 < this.c; ++v1) {
            if(v != this.a[v1]) {
                while(true) {
                    ++v1;
                    if(v1 >= this.c || v == this.a[v1]) {
                        break;
                    }
                }
            }
            int v3 = charSequence0.length() + (v1 + 1) - 1;
            if(v1 < this.c && v3 <= this.c) {
                int v4 = v1 + 1;
                for(int v2 = 1; v4 < v3 && charSequence0.charAt(v2) == this.a[v4]; ++v2) {
                    ++v4;
                }
                if(v4 == v3) {
                    return v1 - this.e;
                }
            }
        }
        return -1;
    }

    public int P() {
        return this.f + this.e;
    }

    String Q() {
        return this.A() + ":" + this.e();
    }

    boolean R(int v, int v1, String s) {
        return a.S(this.a, v, v1, s);
    }

    static boolean S(char[] arr_c, int v, int v1, String s) {
        if(v1 == s.length()) {
            for(int v2 = 0; v1 != 0; ++v2) {
                if(arr_c[v] != s.charAt(v2)) {
                    return false;
                }
                ++v;
                --v1;
            }
            return true;
        }
        return false;
    }

    boolean T() {
        return this.k;
    }

    void U() {
        int v = this.g;
        if(v == -1) {
            throw new j(new IOException("Mark invalid"));
        }
        this.e = v;
        this.Y();
    }

    private void V() {
        if(!this.y()) {
            return;
        }
        if(this.i.size() > 0) {
            int v = this.z(this.f);
            if(v == -1) {
                v = 0;
            }
            Integer integer0 = (Integer)this.i.get(v);
            integer0.intValue();
            this.j += v;
            this.i.clear();
            this.i.add(integer0);
        }
        for(int v1 = this.e; v1 < this.c; ++v1) {
            if(this.a[v1] == 10) {
                this.i.add(((int)(this.f + 1 + v1)));
            }
        }
    }

    public void W(boolean z) {
        if(z && this.i == null) {
            this.i = new ArrayList(409);
            this.V();
            return;
        }
        if(!z) {
            this.i = null;
        }
    }

    void X() {
        int v = this.e;
        if(v < 1) {
            throw new j(new IOException("WTF: No buffer left to unconsume."));
        }
        this.e = v - 1;
    }

    void Y() {
        this.g = -1;
    }

    public void a() {
        ++this.e;
    }

    private void b() {
        boolean z;
        int v2;
        if(!this.k) {
            int v = this.e;
            if(v >= this.d) {
                int v1 = this.g;
                if(v1 == -1) {
                    v2 = 0;
                }
                else {
                    v2 = v - v1;
                    v = v1;
                }
                try {
                    long v3 = this.b.skip(((long)v));
                    this.b.mark(0x8000);
                    int v4;
                    for(v4 = 0; true; v4 += v5) {
                        z = true;
                        if(v4 > 0x400) {
                            break;
                        }
                        int v5 = this.b.read(this.a, v4, this.a.length - v4);
                        if(v5 == -1) {
                            this.k = true;
                        }
                        if(v5 <= 0) {
                            break;
                        }
                    }
                    this.b.reset();
                    if(v4 > 0) {
                        if(v3 != ((long)v)) {
                            z = false;
                        }
                        i.h(z);
                        this.c = v4;
                        this.f += v;
                        this.e = v2;
                        if(this.g != -1) {
                            this.g = 0;
                        }
                        this.d = Math.min(v4, 0x6000);
                    }
                }
                catch(IOException iOException0) {
                    throw new j(iOException0);
                }
                this.V();
                this.l = null;
            }
        }
    }

    private static String c(char[] arr_c, String[] arr_s, int v, int v1) {
        if(v1 > 12) {
            return new String(arr_c, v, v1);
        }
        if(v1 < 1) {
            return "";
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 = v3 * 0x1F + arr_c[v + v2];
        }
        String s = arr_s[v3 & 0x1FF];
        if(s != null && a.S(arr_c, v, v1, s)) {
            return s;
        }
        String s1 = new String(arr_c, v, v1);
        arr_s[v3 & 0x1FF] = s1;
        return s1;
    }

    public void d() {
        Reader reader0 = this.b;
        if(reader0 == null) {
            return;
        }
        try {
            reader0.close();
        }
        catch(IOException unused_ex) {
        }
        finally {
            this.b = null;
            this.a = null;
            this.h = null;
        }
    }

    public int e() {
        return this.f(this.P());
    }

    int f(int v) {
        if(!this.y()) {
            return v + 1;
        }
        int v1 = this.z(v);
        return v1 == -1 ? v + 1 : v - ((int)(((Integer)this.i.get(v1)))) + 1;
    }

    char g() {
        this.b();
        char c = this.x() ? '\uFFFF' : this.a[this.e];
        ++this.e;
        return c;
    }

    String h(boolean z) {
        int v = this.e;
        int v1 = this.c;
        char[] arr_c = this.a;
        int v2 = v;
    label_4:
        while(v2 < v1) {
            switch(arr_c[v2]) {
                case 34: {
                    if(!z) {
                        break label_4;
                    }
                    ++v2;
                    continue;
                }
                case 0: 
                case 38: {
                    break label_4;
                }
                case 39: {
                    if(z) {
                        break label_4;
                    }
                    ++v2;
                    continue;
                }
                default: {
                    ++v2;
                    continue;
                }
            }
        }
        this.e = v2;
        return v2 <= v ? "" : a.c(this.a, this.h, v, v2 - v);
    }

    String i() {
        int v = this.e;
        int v1 = this.c;
        char[] arr_c = this.a;
        int v2 = v;
    alab1:
        while(v2 < v1) {
            switch(arr_c[v2]) {
                case 0: 
                case 38: 
                case 60: {
                    break alab1;
                }
                default: {
                    ++v2;
                }
            }
        }
        this.e = v2;
        return v2 <= v ? "" : a.c(this.a, this.h, v, v2 - v);
    }

    String j() {
        this.b();
        int v = this.e;
        int v1;
        while((v1 = this.e) < this.c) {
            int v2 = this.a[v1];
            if(v2 < 0x30 || v2 > 57) {
                break;
            }
            this.e = v1 + 1;
        }
        return a.c(this.a, this.h, v, v1 - v);
    }

    String k() {
        this.b();
        int v = this.e;
        int v1;
        while((v1 = this.e) < this.c) {
            int v2 = this.a[v1];
            if((v2 < 0x30 || v2 > 57) && (v2 < 65 || v2 > 70) && (v2 < 97 || v2 > 102)) {
                break;
            }
            this.e = v1 + 1;
        }
        return a.c(this.a, this.h, v, v1 - v);
    }

    String l() {
        this.b();
        int v = this.e;
        int v1;
        while((v1 = this.e) < this.c) {
            int v2 = this.a[v1];
            if((v2 < 65 || v2 > 90) && (v2 < 97 || v2 > 0x7A) && !Character.isLetter(((char)v2))) {
                break;
            }
            ++this.e;
        }
        return a.c(this.a, this.h, v, this.e - v);
    }

    String m() {
        this.b();
        int v = this.e;
        int v1;
        while((v1 = this.e) < this.c) {
            int v2 = this.a[v1];
            if((v2 < 65 || v2 > 90) && (v2 < 97 || v2 > 0x7A) && !Character.isLetter(((char)v2))) {
                break;
            }
            ++this.e;
        }
        while(!this.x()) {
            int v3 = this.e;
            int v4 = this.a[v3];
            if(v4 < 0x30 || v4 > 57) {
                break;
            }
            this.e = v3 + 1;
        }
        return a.c(this.a, this.h, v, this.e - v);
    }

    String n() {
        int v = this.e;
        int v1 = this.c;
        char[] arr_c = this.a;
        int v2 = v;
    alab1:
        while(v2 < v1) {
            switch(arr_c[v2]) {
                case 0: 
                case 60: {
                    break alab1;
                }
                default: {
                    ++v2;
                }
            }
        }
        this.e = v2;
        return v2 <= v ? "" : a.c(this.a, this.h, v, v2 - v);
    }

    String o() {
        this.b();
        int v = this.e;
        int v1 = this.c;
        char[] arr_c = this.a;
        int v2 = v;
    alab1:
        while(v2 < v1) {
            switch(arr_c[v2]) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: 
                case 0x2F: 
                case 60: 
                case 62: {
                    break alab1;
                }
                default: {
                    ++v2;
                }
            }
        }
        this.e = v2;
        return v2 <= v ? "" : a.c(this.a, this.h, v, v2 - v);
    }

    public String p(char c) {
        int v = this.N(c);
        if(v != -1) {
            String s = a.c(this.a, this.h, this.e, v);
            this.e += v;
            return s;
        }
        return this.t();
    }

    String q(String s) {
        int v = this.O(s);
        if(v != -1) {
            String s1 = a.c(this.a, this.h, this.e, v);
            this.e += v;
            return s1;
        }
        if(this.c - this.e < s.length()) {
            return this.t();
        }
        int v1 = this.c - s.length() + 1;
        String s2 = a.c(this.a, this.h, this.e, v1 - this.e);
        this.e = v1;
        return s2;
    }

    public String r(char[] arr_c) {
        this.b();
        int v = this.e;
        int v1 = this.c;
        char[] arr_c1 = this.a;
        int v2 = v;
    alab1:
        while(v2 < v1) {
            for(int v3 = 0; v3 < arr_c.length; ++v3) {
                if(arr_c1[v2] == arr_c[v3]) {
                    break alab1;
                }
            }
            ++v2;
        }
        this.e = v2;
        return v2 <= v ? "" : a.c(this.a, this.h, v, v2 - v);
    }

    String s(char[] arr_c) {
        this.b();
        int v = this.e;
        int v1 = this.c;
        char[] arr_c1 = this.a;
        int v2;
        for(v2 = v; v2 < v1 && Arrays.binarySearch(arr_c, arr_c1[v2]) < 0; ++v2) {
        }
        this.e = v2;
        return v2 <= v ? "" : a.c(this.a, this.h, v, v2 - v);
    }

    String t() {
        this.b();
        String s = a.c(this.a, this.h, this.e, this.c - this.e);
        this.e = this.c;
        return s;
    }

    @Override
    public String toString() {
        return this.c - this.e >= 0 ? new String(this.a, this.e, this.c - this.e) : "";
    }

    boolean u(String s) {
        boolean z = false;
        int v = -1;
        if(s.equals(this.l)) {
            int v1 = this.m;
            if(v1 == -1) {
                return false;
            }
            if(v1 >= this.e) {
                return true;
            }
        }
        this.l = s;
        Locale locale0 = Locale.ENGLISH;
        int v2 = this.O(s.toLowerCase(locale0));
        if(v2 > -1) {
            this.m = this.e + v2;
            return true;
        }
        int v3 = this.O(s.toUpperCase(locale0));
        if(v3 > -1) {
            z = true;
            v = this.e + v3;
        }
        this.m = v;
        return z;
    }

    public char v() {
        this.b();
        return this.x() ? '\uFFFF' : this.a[this.e];
    }

    public boolean w() {
        this.b();
        return this.e >= this.c;
    }

    private boolean x() {
        return this.e >= this.c;
    }

    public boolean y() {
        return this.i != null;
    }

    private int z(int v) {
        if(!this.y()) {
            return 0;
        }
        int v1 = Collections.binarySearch(this.i, v);
        return v1 >= -1 ? v1 : Math.abs(v1) - 2;
    }
}

