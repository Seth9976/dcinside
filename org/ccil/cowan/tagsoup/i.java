package org.ccil.cowan.tagsoup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import org.xml.sax.SAXException;

public class i implements n {
    @Override  // org.ccil.cowan.tagsoup.n
    public void a(Reader reader0, m m0) throws IOException, SAXException {
        BufferedReader bufferedReader0 = new BufferedReader(reader0);
        char[] arr_c = null;
        boolean z = false;
        String s;
        while((s = bufferedReader0.readLine()) != null) {
            int v = s.length();
            if(arr_c == null || arr_c.length < v) {
                arr_c = new char[v];
            }
            switch(arr_c[0]) {
                case 40: {
                    if(z) {
                        m0.p(arr_c, 0, 0);
                    }
                    break;
                }
                case 41: {
                    if(z) {
                        m0.p(arr_c, 0, 0);
                        z = false;
                    }
                    m0.c(arr_c, 1, v - 1);
                    continue;
                }
                case 45: {
                    if(z) {
                        m0.p(arr_c, 0, 0);
                        z = false;
                    }
                    if(s.equals("-\\n")) {
                        arr_c[0] = '\n';
                        m0.b(arr_c, 0, 1);
                    }
                    else {
                        m0.b(arr_c, 1, v - 1);
                    }
                    continue;
                }
                case 0x3F: {
                    if(z) {
                        m0.p(arr_c, 0, 0);
                        z = false;
                    }
                    m0.n(arr_c, 1, v - 1);
                    continue;
                }
                case 65: {
                    int v1 = s.indexOf(0x20);
                    m0.d(arr_c, 1, v1 - 1);
                    m0.h(arr_c, v1 + 1, v - v1 - 1);
                    continue;
                }
                case 69: {
                    if(z) {
                        m0.p(arr_c, 0, 0);
                        z = false;
                    }
                    m0.f(arr_c, 1, v - 1);
                    continue;
                }
                default: {
                    continue;
                }
            }
            m0.i(arr_c, 1, v - 1);
            z = true;
        }
        m0.m(arr_c, 0, 0);
    }

    @Override  // org.ccil.cowan.tagsoup.n
    public void b(String s, String s1) {
    }

    public static void c(String[] arr_s) throws IOException, SAXException {
        new i().a(new InputStreamReader(System.in, "UTF-8"), new j(new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"))));
    }

    @Override  // org.ccil.cowan.tagsoup.n
    public void startCDATA() {
    }
}

