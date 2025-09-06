package org.ccil.cowan.tagsoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PushbackReader;
import java.io.Reader;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class g implements n, Locator {
    private static final int A = 16;
    private static int[] A0 = null;
    private static final int B = 17;
    private static final String[] B0 = null;
    private static final int C = 18;
    private static final String[] C0 = null;
    private static final int D = 19;
    static short[][] D0 = null;
    private static final int E = 20;
    static int E0 = 0;
    private static final int F = 21;
    private static final int G = 22;
    private static final int H = 23;
    private static final int I = 24;
    private static final int J = 25;
    private static final int K = 26;
    private static final int L = 27;
    private static final int M = 28;
    private static final int N = 29;
    private static final int O = 30;
    private static final int P = 0x1F;
    private static final int Q = 0x20;
    private static final int R = 33;
    private static final int S = 34;
    private static final int T = 35;
    private static final int U = 1;
    private static final int V = 2;
    private static final int W = 3;
    private static final int X = 4;
    private static final int Y = 5;
    private static final int Z = 6;
    private String a;
    private static final int a0 = 7;
    private String b;
    private static final int b0 = 8;
    private int c;
    private static final int c0 = 9;
    private int d;
    private static final int d0 = 10;
    private int e;
    private static final int e0 = 11;
    private int f;
    private static final int f0 = 12;
    int g;
    private static final int g0 = 13;
    int h;
    private static final int h0 = 14;
    char[] i;
    private static final int i0 = 15;
    int j;
    private static final int j0 = 16;
    int[] k;
    private static final int k0 = 17;
    private static final int l = 1;
    private static final int l0 = 18;
    private static final int m = 2;
    private static final int m0 = 19;
    private static final int n = 3;
    private static final int n0 = 20;
    private static final int o = 4;
    private static final int o0 = 21;
    private static final int p = 5;
    private static final int p0 = 22;
    private static final int q = 6;
    private static final int q0 = 23;
    private static final int r = 7;
    private static final int r0 = 24;
    private static final int s = 8;
    private static final int s0 = 25;
    private static final int t = 9;
    private static final int t0 = 26;
    private static final int u = 10;
    private static final int u0 = 27;
    private static final int v = 11;
    private static final int v0 = 28;
    private static final int w = 12;
    private static final int w0 = 29;
    private static final int x = 13;
    private static final int x0 = 30;
    private static final int y = 14;
    private static final int y0 = 0x1F;
    private static final int z = 15;
    private static final int z0 = 0x20;

    static {
        g.A0 = new int[]{1, 0x2F, 5, 22, 1, 61, 4, 3, 1, 62, 6, 28, 1, 0, 27, 1, 1, -1, 6, 21, 1, 0x20, 4, 24, 1, 10, 4, 24, 1, 9, 4, 24, 2, 39, 7, 34, 2, 0, 27, 2, 2, -1, 8, 21, 2, 0x20, 29, 2, 2, 10, 29, 2, 2, 9, 29, 2, 3, 34, 28, 0x1F, 3, 39, 28, 2, 3, 62, 8, 28, 3, 0, 27, 0x20, 3, -1, 8, 21, 3, 0x20, 28, 3, 3, 10, 28, 3, 3, 9, 28, 3, 4, 67, 28, 5, 4, 0, 28, 19, 4, -1, 28, 21, 5, 68, 28, 6, 5, 0, 28, 19, 5, -1, 28, 21, 6, 65, 28, 7, 6, 0, 28, 19, 6, -1, 28, 21, 7, 84, 28, 8, 7, 0, 28, 19, 7, -1, 28, 21, 8, 65, 28, 9, 8, 0, 28, 19, 8, -1, 28, 21, 9, 91, 28, 12, 9, 0, 28, 19, 9, -1, 28, 21, 10, 60, 27, 11, 10, 0, 27, 10, 10, -1, 23, 21, 11, 0x2F, 0x20, 25, 11, 0, 27, 10, 11, -1, 0x20, 21, 12, 93, 27, 13, 12, 0, 27, 12, 12, -1, 28, 21, 13, 93, 27, 14, 13, 0, 27, 12, 13, -1, 28, 21, 14, 62, 9, 28, 14, 93, 27, 14, 14, 0, 27, 12, 14, -1, 28, 21, 15, 45, 28, 16, 15, 0, 27, 16, 15, -1, 10, 21, 16, 45, 28, 17, 16, 0, 27, 16, 16, -1, 10, 21, 17, 45, 28, 18, 17, 0, 20, 16, 17, -1, 10, 21, 18, 45, 22, 18, 18, 62, 10, 28, 18, 0, 21, 16, 18, -1, 10, 21, 19, 45, 28, 15, 19, 62, 28, 28, 19, 91, 28, 4, 19, 0, 27, 20, 19, -1, 28, 21, 20, 62, 11, 28, 20, 0, 27, 20, 20, -1, 28, 21, 22, 62, 12, 28, 22, 0, 27, 1, 22, 0x20, 28, 34, 22, 10, 28, 34, 22, 9, 28, 34, 23, 0, 13, 23, 23, -1, 13, 21, 24, 61, 28, 3, 24, 62, 3, 28, 24, 0, 2, 1, 24, -1, 3, 21, 24, 0x20, 28, 24, 24, 10, 28, 24, 24, 9, 28, 24, 25, 62, 15, 28, 25, 0, 27, 25, 25, -1, 15, 21, 25, 0x20, 28, 25, 25, 10, 28, 25, 25, 9, 28, 25, 26, 0x2F, 28, 22, 26, 62, 17, 28, 26, 0, 27, 26, 26, -1, 28, 21, 26, 0x20, 16, 34, 26, 10, 16, 34, 26, 9, 16, 34, 27, 0, 13, 27, 27, -1, 13, 21, 28, 38, 14, 23, 28, 60, 23, 33, 28, 0, 27, 28, 28, -1, 23, 21, 29, 62, 24, 28, 29, 0, 27, 29, 29, -1, 24, 21, 30, 62, 26, 28, 30, 0, 27, 30, 30, -1, 26, 21, 30, 0x20, 25, 29, 30, 10, 25, 29, 30, 9, 25, 29, 0x1F, 34, 7, 34, 0x1F, 0, 27, 0x1F, 0x1F, -1, 8, 21, 0x1F, 0x20, 29, 0x1F, 0x1F, 10, 29, 0x1F, 0x1F, 9, 29, 0x1F, 0x20, 62, 8, 28, 0x20, 0, 27, 0x20, 0x20, -1, 8, 21, 0x20, 0x20, 7, 34, 0x20, 10, 7, 34, 0x20, 9, 7, 34, 33, 33, 28, 19, 33, 0x2F, 28, 25, 33, 60, 27, 33, 33, 0x3F, 28, 30, 33, 0, 27, 26, 33, -1, 19, 21, 33, 0x20, 18, 28, 33, 10, 18, 28, 33, 9, 18, 28, 34, 0x2F, 28, 22, 34, 62, 30, 28, 34, 0, 27, 1, 34, -1, 30, 21, 34, 0x20, 28, 34, 34, 10, 28, 34, 34, 9, 28, 34, 35, 0, 13, 35, 35, -1, 13, 21};
        g.B0 = new String[]{"", "A_ADUP", "A_ADUP_SAVE", "A_ADUP_STAGC", "A_ANAME", "A_ANAME_ADUP", "A_ANAME_ADUP_STAGC", "A_AVAL", "A_AVAL_STAGC", "A_CDATA", "A_CMNT", "A_DECL", "A_EMPTYTAG", "A_ENTITY", "A_ENTITY_START", "A_ETAG", "A_GI", "A_GI_STAGC", "A_LT", "A_LT_PCDATA", "A_MINUS", "A_MINUS2", "A_MINUS3", "A_PCDATA", "A_PI", "A_PITARGET", "A_PITARGET_PI", "A_SAVE", "A_SKIP", "A_SP", "A_STAGC", "A_UNGET", "A_UNSAVE_PCDATA"};
        g.C0 = new String[]{"", "S_ANAME", "S_APOS", "S_AVAL", "S_BB", "S_BBC", "S_BBCD", "S_BBCDA", "S_BBCDAT", "S_BBCDATA", "S_CDATA", "S_CDATA2", "S_CDSECT", "S_CDSECT1", "S_CDSECT2", "S_COM", "S_COM2", "S_COM3", "S_COM4", "S_DECL", "S_DECL2", "S_DONE", "S_EMPTYTAG", "S_ENT", "S_EQ", "S_ETAG", "S_GI", "S_NCR", "S_PCDATA", "S_PI", "S_PITARGET", "S_QUOT", "S_STAGC", "S_TAG", "S_TAGWS", "S_XNCR"};
        int v1 = -1;
        int v2 = -1;
        for(int v = 0; true; v += 4) {
            int[] arr_v = g.A0;
            if(v >= arr_v.length) {
                break;
            }
            int v3 = arr_v[v];
            if(v3 > v2) {
                v2 = v3;
            }
            int v4 = arr_v[v + 1];
            if(v4 > v1) {
                v1 = v4;
            }
        }
        g.E0 = v1 + 1;
        g.D0 = new short[v2 + 1][v1 + 3];
        for(int v5 = 0; v5 <= v2; ++v5) {
            for(int v6 = -2; v6 <= v1; ++v6) {
                int v7 = 0;
                int v8 = 0;
                int v9 = -1;
                while(true) {
                    int[] arr_v1 = g.A0;
                    if(v7 >= arr_v1.length) {
                        v7 = v9;
                        break;
                    }
                    if(v5 == arr_v1[v7]) {
                        int v10 = arr_v1[v7 + 1];
                        if(v10 == 0) {
                            v8 = arr_v1[v7 + 2];
                            v9 = v7;
                        }
                        else if(v10 == v6) {
                            int v11 = arr_v1[v7 + 2];
                            break;
                        }
                    }
                    else if(v8 != 0) {
                        v7 = v9;
                        break;
                    }
                    v7 += 4;
                }
                g.D0[v5][v6 + 2] = (short)v7;
            }
        }
    }

    public g() {
        this.i = new char[200];
        this.k = new int[]{0x20AC, 0xFFFD, 0x201A, 402, 0x201E, 8230, 0x2020, 0x2021, 710, 0x2030, 0x160, 0x2039, 338, 0xFFFD, 381, 0xFFFD, 0xFFFD, 0x2018, 0x2019, 8220, 0x201D, 0x2022, 0x2013, 0x2014, 732, 8482, 353, 8250, 339, 0xFFFD, 382, 376};
    }

    @Override  // org.ccil.cowan.tagsoup.n
    public void a(Reader reader0, m m0) throws IOException, SAXException {
        int v3;
        this.g = 28;
        PushbackReader pushbackReader0 = reader0 instanceof BufferedReader ? new PushbackReader(reader0, 5) : new PushbackReader(new BufferedReader(reader0), 5);
        int v = pushbackReader0.read();
        if(v != 0xFEFF) {
            this.g(pushbackReader0, v);
        }
        while(this.g != 21) {
            int v1 = pushbackReader0.read();
            if(v1 >= 0x80 && v1 <= 0x9F) {
                v1 = this.k[v1 - 0x80];
            }
            if(v1 == 13) {
                v1 = pushbackReader0.read();
                if(v1 != 10) {
                    this.g(pushbackReader0, v1);
                    v1 = 10;
                }
            }
            if(v1 == 10) {
                ++this.e;
                this.f = 0;
            }
            else {
                ++this.f;
            }
            if(v1 >= 0x20 || (v1 == -1 || v1 == 9 || v1 == 10)) {
                int v2 = g.D0[this.g][(v1 < -1 || v1 >= g.E0 ? -2 : v1) + 2];
                if(v2 == -1) {
                    v3 = 0;
                }
                else {
                    int[] arr_v = g.A0;
                    v3 = arr_v[v2 + 2];
                    this.h = arr_v[v2 + 3];
                }
                switch(v3) {
                    case 0: {
                        throw new Error("HTMLScanner can\'t cope with " + Integer.toString(v1) + " in state " + Integer.toString(this.g));
                    }
                    case 1: {
                        m0.g(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 2: {
                        m0.g(this.i, 0, this.j);
                        this.j = 0;
                        this.f(v1, m0);
                        break;
                    }
                    case 3: {
                        m0.g(this.i, 0, this.j);
                        this.j = 0;
                        m0.p(this.i, 0, 0);
                        break;
                    }
                    case 4: {
                        m0.d(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 5: {
                        m0.d(this.i, 0, this.j);
                        this.j = 0;
                        m0.g(this.i, 0, 0);
                        break;
                    }
                    case 6: {
                        m0.d(this.i, 0, this.j);
                        this.j = 0;
                        m0.g(this.i, 0, 0);
                        m0.p(this.i, 0, this.j);
                        break;
                    }
                    case 7: {
                        m0.h(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 8: {
                        m0.h(this.i, 0, this.j);
                        this.j = 0;
                        m0.p(this.i, 0, 0);
                        break;
                    }
                    case 9: {
                        this.d();
                        int v4 = this.j;
                        if(v4 > 1) {
                            this.j = v4 - 2;
                        }
                        m0.b(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 10: {
                        this.d();
                        m0.o(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 11: {
                        m0.l(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 12: {
                        this.d();
                        int v5 = this.j;
                        if(v5 > 0) {
                            m0.i(this.i, 0, v5);
                        }
                        this.j = 0;
                        m0.k(this.i, 0, 0);
                        break;
                    }
                    case 13: {
                        this.d();
                        int v6 = this.g;
                        if(v6 == 23 && ((char)v1) == 35) {
                            this.h = 27;
                            this.f(v1, m0);
                        }
                        else if(v6 == 27 && (((char)v1) == 88 || ((char)v1) == 120)) {
                            this.h = 35;
                            this.f(v1, m0);
                        }
                        else if(v6 == 23 && Character.isLetterOrDigit(((char)v1))) {
                            this.f(v1, m0);
                        }
                        else if(this.g == 27 && Character.isDigit(((char)v1))) {
                            this.f(v1, m0);
                        }
                        else if(this.g != 35 || !Character.isDigit(((char)v1)) && "abcdefABCDEF".indexOf(((int)(((char)v1)))) == -1) {
                            m0.f(this.i, 1, this.j - 1);
                            int v7 = m0.j();
                            if(v7 == 0) {
                                this.g(pushbackReader0, v1);
                                --this.f;
                            }
                            else {
                                this.j = 0;
                                if(v7 >= 0x80 && v7 <= 0x9F) {
                                    v7 = this.k[v7 - 0x80];
                                }
                                if(v7 >= 0x20 && (v7 < 0xD800 || v7 > 0xDFFF)) {
                                    if(v7 <= 0xFFFF) {
                                        this.f(v7, m0);
                                    }
                                    else {
                                        this.f((v7 - 0x10000 >> 10) + 0xD800, m0);
                                        this.f((v7 - 0x10000 & 0x3FF) + 0xDC00, m0);
                                    }
                                }
                                if(v1 != 59) {
                                    this.g(pushbackReader0, v1);
                                    --this.f;
                                }
                            }
                            this.h = 28;
                        }
                        else {
                            this.f(v1, m0);
                        }
                        break;
                    }
                    case 14: {
                        m0.b(this.i, 0, this.j);
                        this.j = 0;
                        this.f(v1, m0);
                        break;
                    }
                    case 15: {
                        m0.c(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 16: {
                        m0.i(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 17: {
                        m0.i(this.i, 0, this.j);
                        this.j = 0;
                        m0.p(this.i, 0, 0);
                        break;
                    }
                    case 18: {
                        this.d();
                        this.f(60, m0);
                        this.f(v1, m0);
                        break;
                    }
                    case 19: {
                        this.d();
                        this.f(60, m0);
                        m0.b(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 20: {
                        this.f(45, m0);
                        this.f(v1, m0);
                        break;
                    }
                    case 21: {
                        this.f(45, m0);
                        this.f(0x20, m0);
                        this.f(45, m0);
                        this.f(v1, m0);
                        break;
                    }
                    case 22: {
                        this.f(45, m0);
                        this.f(0x20, m0);
                        break;
                    }
                    case 23: {
                        this.d();
                        m0.b(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 24: {
                        this.d();
                        m0.n(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 25: {
                        m0.e(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 26: {
                        m0.e(this.i, 0, this.j);
                        this.j = 0;
                        m0.n(this.i, 0, 0);
                        break;
                    }
                    case 27: {
                        this.f(v1, m0);
                        break;
                    }
                    case 28: {
                        break;
                    }
                    case 29: {
                        this.f(0x20, m0);
                        break;
                    }
                    case 30: {
                        m0.p(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    case 0x1F: {
                        this.g(pushbackReader0, v1);
                        --this.f;
                        break;
                    }
                    case 0x20: {
                        int v8 = this.j;
                        if(v8 > 0) {
                            this.j = v8 - 1;
                        }
                        m0.b(this.i, 0, this.j);
                        this.j = 0;
                        break;
                    }
                    default: {
                        throw new Error("Can\'t process state " + v3);
                    }
                }
                this.g = this.h;
            }
        }
        m0.m(this.i, 0, 0);
    }

    @Override  // org.ccil.cowan.tagsoup.n
    public void b(String s, String s1) {
        this.a = s;
        this.b = s1;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
    }

    public static void c(String[] arr_s) throws IOException, SAXException {
        g g0 = new g();
        InputStreamReader inputStreamReader0 = new InputStreamReader(System.in, "UTF-8");
        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(System.out, "UTF-8");
        g0.a(inputStreamReader0, new j(outputStreamWriter0));
        outputStreamWriter0.close();
    }

    private void d() {
        this.d = this.f;
        this.c = this.e;
    }

    private static String e(int v) {
        if(v == 10) {
            return "\\n";
        }
        return v >= 0x20 ? "\'" + ((char)v) + "\'" : "0x" + Integer.toHexString(v);
    }

    private void f(int v, m m0) throws IOException, SAXException {
        int v1 = this.j;
        char[] arr_c = this.i;
        if(v1 >= arr_c.length - 20) {
            if(this.g == 10 || this.g == 28) {
                m0.b(arr_c, 0, v1);
                this.j = 0;
            }
            else {
                char[] arr_c1 = new char[arr_c.length * 2];
                System.arraycopy(arr_c, 0, arr_c1, 0, v1 + 1);
                this.i = arr_c1;
            }
        }
        int v2 = this.j;
        this.j = v2 + 1;
        this.i[v2] = (char)v;
    }

    private void g(PushbackReader pushbackReader0, int v) throws IOException {
        if(v != -1) {
            pushbackReader0.unread(v);
        }
    }

    @Override  // org.xml.sax.Locator
    public int getColumnNumber() {
        return this.d;
    }

    @Override  // org.xml.sax.Locator
    public int getLineNumber() {
        return this.c;
    }

    @Override  // org.xml.sax.Locator
    public String getPublicId() {
        return this.a;
    }

    @Override  // org.xml.sax.Locator
    public String getSystemId() {
        return this.b;
    }

    @Override  // org.ccil.cowan.tagsoup.n
    public void startCDATA() {
        this.h = 10;
    }
}

