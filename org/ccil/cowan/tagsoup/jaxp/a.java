package org.ccil.cowan.tagsoup.jaxp;

import java.io.File;
import java.io.PrintStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

public class a {
    public static void a(String[] arr_s) throws Exception {
        new a().b(arr_s);
    }

    private void b(String[] arr_s) throws Exception {
        if(arr_s.length != 1) {
            System.err.println("Usage: java " + this.getClass() + " [input-file]");
            System.exit(1);
        }
        File file0 = new File(arr_s[0]);
        System.setProperty("javax.xml.parsers.SAXParserFactory", "org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl");
        SAXParserFactory sAXParserFactory0 = SAXParserFactory.newInstance();
        PrintStream printStream0 = System.out;
        printStream0.println("Ok, SAX factory JAXP creates is: " + sAXParserFactory0);
        printStream0.println("Let\'s parse...");
        sAXParserFactory0.newSAXParser().parse(file0, new DefaultHandler());
        printStream0.println("Done. And then DOM build:");
        printStream0.println("Succesfully built DOM tree from \'" + file0 + "\', -> " + DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file0));
    }
}

