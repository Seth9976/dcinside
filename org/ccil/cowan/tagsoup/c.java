package org.ccil.cowan.tagsoup;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Hashtable;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

public class c {
    static Hashtable a;
    private static l b;
    private static h c;
    private static String d;

    static {
        Hashtable hashtable0 = new Hashtable();
        c.a = hashtable0;
        hashtable0.put("--nocdata", Boolean.FALSE);
        c.a.put("--files", Boolean.FALSE);
        c.a.put("--reuse", Boolean.FALSE);
        c.a.put("--nons", Boolean.FALSE);
        c.a.put("--nobogons", Boolean.FALSE);
        c.a.put("--any", Boolean.FALSE);
        c.a.put("--emptybogons", Boolean.FALSE);
        c.a.put("--norootbogons", Boolean.FALSE);
        c.a.put("--pyxin", Boolean.FALSE);
        c.a.put("--lexical", Boolean.FALSE);
        c.a.put("--pyx", Boolean.FALSE);
        c.a.put("--html", Boolean.FALSE);
        c.a.put("--method=", Boolean.FALSE);
        c.a.put("--doctype-public=", Boolean.FALSE);
        c.a.put("--doctype-system=", Boolean.FALSE);
        c.a.put("--output-encoding=", Boolean.FALSE);
        c.a.put("--omit-xml-declaration", Boolean.FALSE);
        c.a.put("--encoding=", Boolean.FALSE);
        c.a.put("--help", Boolean.FALSE);
        c.a.put("--version", Boolean.FALSE);
        c.a.put("--nodefaults", Boolean.FALSE);
        c.a.put("--nocolons", Boolean.FALSE);
        c.a.put("--norestart", Boolean.FALSE);
        c.a.put("--ignorable", Boolean.FALSE);
        c.b = null;
        c.c = null;
        c.d = null;
    }

    private static ContentHandler a(Writer writer0) {
        if(c.d(c.a, "--pyx")) {
            return new j(writer0);
        }
        ContentHandler contentHandler0 = new p(writer0);
        if(c.d(c.a, "--html")) {
            ((p)contentHandler0).u("method", "html");
            ((p)contentHandler0).u("omit-xml-declaration", "yes");
        }
        if(c.d(c.a, "--method=")) {
            String s = (String)c.a.get("--method=");
            if(s != null) {
                ((p)contentHandler0).u("method", s);
            }
        }
        if(c.d(c.a, "--doctype-public=")) {
            String s1 = (String)c.a.get("--doctype-public=");
            if(s1 != null) {
                ((p)contentHandler0).u("doctype-public", s1);
            }
        }
        if(c.d(c.a, "--doctype-system=")) {
            String s2 = (String)c.a.get("--doctype-system=");
            if(s2 != null) {
                ((p)contentHandler0).u("doctype-system", s2);
            }
        }
        if(c.d(c.a, "--output-encoding=")) {
            String s3 = (String)c.a.get("--output-encoding=");
            c.d = s3;
            if(s3 != null) {
                ((p)contentHandler0).u("encoding", s3);
            }
        }
        if(c.d(c.a, "--omit-xml-declaration")) {
            ((p)contentHandler0).u("omit-xml-declaration", "yes");
        }
        ((p)contentHandler0).v("", "");
        return contentHandler0;
    }

    private static void b() {
        PrintStream printStream0 = System.err;
        printStream0.print("usage: java -jar tagsoup-*.jar ");
        printStream0.print(" [ ");
        Enumeration enumeration0 = c.a.keys();
        for(boolean z = true; enumeration0.hasMoreElements(); z = false) {
            if(!z) {
                System.err.print("| ");
            }
            String s = (String)enumeration0.nextElement();
            PrintStream printStream1 = System.err;
            printStream1.print(s);
            if(s.endsWith("=")) {
                printStream1.print("?");
            }
            printStream1.print(" ");
        }
        System.err.println("]*");
    }

    private static int c(Hashtable hashtable0, String[] arr_s) {
        String s1;
        int v;
        for(v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s.charAt(0) != 45) {
                break;
            }
            int v1 = s.indexOf(61);
            if(v1 == -1) {
                s1 = null;
            }
            else {
                s1 = s.substring(v1 + 1, s.length());
                s = s.substring(0, v1 + 1);
            }
            if(!hashtable0.containsKey(s)) {
                PrintStream printStream0 = System.err;
                printStream0.print("Unknown option ");
                printStream0.println(s);
                System.exit(1);
            }
            else if(s1 == null) {
                hashtable0.put(s, Boolean.TRUE);
            }
            else {
                hashtable0.put(s, s1);
            }
        }
        return v;
    }

    // 去混淆评级： 低(20)
    private static boolean d(Hashtable hashtable0, String s) {
        return Boolean.getBoolean(s) ? true : hashtable0.get(s) != Boolean.FALSE;
    }

    public static void e(String[] arr_s) throws IOException, SAXException {
        String s1;
        int v = c.c(c.a, arr_s);
        if(c.d(c.a, "--help")) {
            c.b();
            return;
        }
        if(c.d(c.a, "--version")) {
            System.err.println("TagSoup version 1.2.1");
            return;
        }
        if(arr_s.length == v) {
            c.f("", System.out);
            return;
        }
        if(c.d(c.a, "--files")) {
            while(v < arr_s.length) {
                String s = arr_s[v];
                int v1 = s.lastIndexOf(46);
                if(v1 == -1) {
                    s1 = s + ".xhtml";
                }
                else {
                    s1 = s.endsWith(".xhtml") ? s + "_" : s.substring(0, v1) + ".xhtml";
                }
                System.err.println("src: " + s + " dst: " + s1);
                c.f(s, new FileOutputStream(s1));
                ++v;
            }
            return;
        }
        while(v < arr_s.length) {
            System.err.println("src: " + arr_s[v]);
            c.f(arr_s[v], System.out);
            ++v;
        }
    }

    private static void f(String s, OutputStream outputStream0) throws IOException, SAXException {
        l l0;
        if(c.d(c.a, "--reuse")) {
            if(c.b == null) {
                c.b = new l();
            }
            l0 = c.b;
        }
        else {
            l0 = new l();
        }
        h h0 = new h();
        c.c = h0;
        l0.setProperty("http://www.ccil.org/~cowan/tagsoup/properties/schema", h0);
        if(c.d(c.a, "--nocdata")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/cdata-elements", false);
        }
        if(c.d(c.a, "--nons") || c.d(c.a, "--html")) {
            l0.setFeature("http://xml.org/sax/features/namespaces", false);
        }
        if(c.d(c.a, "--nobogons")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons", true);
        }
        if(c.d(c.a, "--any")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty", false);
        }
        else if(c.d(c.a, "--emptybogons")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/bogons-empty", true);
        }
        if(c.d(c.a, "--norootbogons")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/root-bogons", false);
        }
        if(c.d(c.a, "--nodefaults")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/default-attributes", false);
        }
        if(c.d(c.a, "--nocolons")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/translate-colons", true);
        }
        if(c.d(c.a, "--norestart")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/restart-elements", false);
        }
        if(c.d(c.a, "--ignorable")) {
            l0.setFeature("http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace", true);
        }
        if(c.d(c.a, "--pyxin")) {
            l0.setProperty("http://www.ccil.org/~cowan/tagsoup/properties/scanner", new i());
        }
        ContentHandler contentHandler0 = c.a((c.d == null ? new OutputStreamWriter(outputStream0) : new OutputStreamWriter(outputStream0, c.d)));
        l0.setContentHandler(contentHandler0);
        if(c.d(c.a, "--lexical") && contentHandler0 instanceof LexicalHandler) {
            l0.setProperty("http://xml.org/sax/properties/lexical-handler", contentHandler0);
        }
        InputSource inputSource0 = new InputSource();
        if(s == "") {
            inputSource0.setByteStream(System.in);
        }
        else {
            inputSource0.setSystemId(s);
        }
        if(c.d(c.a, "--encoding=")) {
            String s1 = (String)c.a.get("--encoding=");
            if(s1 != null) {
                inputSource0.setEncoding(s1);
            }
        }
        l0.parse(inputSource0);
    }
}

