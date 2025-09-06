package org.ccil.cowan.tagsoup;

import java.io.PrintWriter;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

public class j implements m, ContentHandler, LexicalHandler {
    private PrintWriter a;
    private String b;
    private static char[] c;

    static {
        j.c = new char[1];
    }

    public j(Writer writer0) {
        if(writer0 instanceof PrintWriter) {
            this.a = (PrintWriter)writer0;
            return;
        }
        this.a = new PrintWriter(writer0);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void a(char[] arr_c, int v, int v1) throws SAXException {
        this.b(arr_c, v, v1);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void b(char[] arr_c, int v, int v1) throws SAXException {
        if(v1 == 0) {
            return;
        }
        int v2 = v1 + v;
        boolean z = false;
        while(v < v2) {
            if(arr_c[v] == 10) {
                if(z) {
                    this.a.println();
                }
                this.a.println("-\\n");
                z = false;
            }
            else {
                if(!z) {
                    this.a.print('-');
                }
                int v3 = arr_c[v];
                switch(v3) {
                    case 9: {
                        this.a.print("\\t");
                        break;
                    }
                    case 92: {
                        this.a.print("\\\\");
                        break;
                    }
                    default: {
                        this.a.print(((char)v3));
                    }
                }
                z = true;
            }
            ++v;
        }
        if(z) {
            this.a.println();
        }
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void c(char[] arr_c, int v, int v1) throws SAXException {
        this.a.print(')');
        this.a.write(arr_c, v, v1);
        this.a.println();
    }

    @Override  // org.xml.sax.ContentHandler
    public void characters(char[] arr_c, int v, int v1) throws SAXException {
        this.b(arr_c, v, v1);
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void comment(char[] arr_c, int v, int v1) throws SAXException {
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void d(char[] arr_c, int v, int v1) throws SAXException {
        this.a.print('A');
        this.a.write(arr_c, v, v1);
        this.a.print(' ');
        this.b = new String(arr_c, v, v1);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void e(char[] arr_c, int v, int v1) throws SAXException {
        this.a.print('?');
        this.a.write(arr_c, v, v1);
        this.a.write(0x20);
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override  // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.a.close();
    }

    @Override  // org.xml.sax.ContentHandler
    public void endElement(String s, String s1, String s2) throws SAXException {
        if(s2.length() != 0) {
            s1 = s2;
        }
        this.a.print(')');
        this.a.println(s1);
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void endEntity(String s) throws SAXException {
    }

    @Override  // org.xml.sax.ContentHandler
    public void endPrefixMapping(String s) throws SAXException {
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void f(char[] arr_c, int v, int v1) throws SAXException {
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void g(char[] arr_c, int v, int v1) throws SAXException {
        this.a.println(this.b);
        this.b = null;
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void h(char[] arr_c, int v, int v1) throws SAXException {
        this.a.write(arr_c, v, v1);
        this.a.println();
        this.b = null;
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void i(char[] arr_c, int v, int v1) throws SAXException {
        this.a.print('(');
        this.a.write(arr_c, v, v1);
        this.a.println();
    }

    @Override  // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] arr_c, int v, int v1) throws SAXException {
        this.characters(arr_c, v, v1);
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public int j() {
        return 0;
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void k(char[] arr_c, int v, int v1) throws SAXException {
        this.a.println("!");
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void l(char[] arr_c, int v, int v1) throws SAXException {
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void m(char[] arr_c, int v, int v1) throws SAXException {
        this.a.close();
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void n(char[] arr_c, int v, int v1) throws SAXException {
        this.a.write(arr_c, v, v1);
        this.a.println();
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void o(char[] arr_c, int v, int v1) throws SAXException {
    }

    @Override  // org.ccil.cowan.tagsoup.m
    public void p(char[] arr_c, int v, int v1) throws SAXException {
    }

    @Override  // org.xml.sax.ContentHandler
    public void processingInstruction(String s, String s1) throws SAXException {
        this.a.print('?');
        this.a.print(s);
        this.a.print(' ');
        this.a.println(s1);
    }

    @Override  // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator0) {
    }

    @Override  // org.xml.sax.ContentHandler
    public void skippedEntity(String s) throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startDTD(String s, String s1, String s2) throws SAXException {
    }

    @Override  // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    @Override  // org.xml.sax.ContentHandler
    public void startElement(String s, String s1, String s2, Attributes attributes0) throws SAXException {
        if(s2.length() != 0) {
            s1 = s2;
        }
        this.a.print('(');
        this.a.println(s1);
        int v = attributes0.getLength();
        for(int v1 = 0; v1 < v; ++v1) {
            String s3 = attributes0.getQName(v1);
            if(s3.length() == 0) {
                s3 = attributes0.getLocalName(v1);
            }
            this.a.print('A');
            this.a.print(s3);
            this.a.print(' ');
            this.a.println(attributes0.getValue(v1));
        }
    }

    @Override  // org.xml.sax.ext.LexicalHandler
    public void startEntity(String s) throws SAXException {
    }

    @Override  // org.xml.sax.ContentHandler
    public void startPrefixMapping(String s, String s1) throws SAXException {
    }
}

