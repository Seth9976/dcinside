package com.bumptech.glide.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import jeb.synthetic.TWR;

final class d {
    static final Charset a;
    static final Charset b;

    static {
        d.a = Charset.forName("US-ASCII");
        d.b = Charset.forName("UTF-8");
    }

    static void a(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    static void b(File file0) throws IOException {
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            throw new IOException("not a readable directory: " + file0);
        }
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            if(file1.isDirectory()) {
                d.b(file1);
            }
            if(!file1.delete()) {
                throw new IOException("failed to delete file: " + file1);
            }
        }
    }

    static String c(Reader reader0) throws IOException {
        try {
            StringWriter stringWriter0 = new StringWriter();
            char[] arr_c = new char[0x400];
            while(true) {
                reader0 = TWR.getResource$NT(reader0);
                TWR.declareResource(reader0);
                TWR.useResource$NT(reader0);
                int v = reader0.read(arr_c);
                if(v == -1) {
                    break;
                }
                TWR.useResource$NT(reader0);
                stringWriter0.write(arr_c, 0, v);
            }
            return stringWriter0.toString();
        }
        catch(Throwable throwable0) {
            TWR.moot$NT();
            throw throwable0;
        }
    }
}

