package com.vungle.ads.internal.util;

import androidx.annotation.VisibleForTesting;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

public final class w {
    public interface a {
        boolean matches(@m String arg1);
    }

    public static final class b extends IOException {
        public b(@m String s) {
            super(s);
        }
    }

    private static final int BUFFER_SIZE = 0x1000;
    @l
    public static final w INSTANCE;
    private static final String TAG;

    static {
        w.INSTANCE = new w();
        w.TAG = w.class.getCanonicalName();
    }

    @VisibleForTesting
    public final void extractFile(@l InputStream inputStream0, @m String s) throws IOException {
        BufferedOutputStream bufferedOutputStream0;
        Throwable throwable1;
        FileOutputStream fileOutputStream0;
        L.p(inputStream0, "zipIn");
        File file0 = new File(s);
        h.delete(file0);
        File file1 = file0.getParentFile();
        if(file1 != null && !file1.exists()) {
            file1.mkdirs();
        }
        try {
            fileOutputStream0 = new FileOutputStream(s);
        }
        catch(Throwable throwable0) {
            fileOutputStream0 = null;
            throwable1 = throwable0;
            bufferedOutputStream0 = null;
            h.INSTANCE.closeQuietly(inputStream0);
            h.INSTANCE.closeQuietly(bufferedOutputStream0);
            h.INSTANCE.closeQuietly(fileOutputStream0);
            throw throwable1;
        }
        try {
            bufferedOutputStream0 = new BufferedOutputStream(fileOutputStream0);
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            bufferedOutputStream0 = null;
            h.INSTANCE.closeQuietly(inputStream0);
            h.INSTANCE.closeQuietly(bufferedOutputStream0);
            h.INSTANCE.closeQuietly(fileOutputStream0);
            throw throwable1;
        }
        try {
            byte[] arr_b = new byte[0x1000];
            while(true) {
                int v = inputStream0.read(arr_b);
                if(v == -1) {
                    goto label_29;
                }
                bufferedOutputStream0.write(arr_b, 0, v);
            }
        }
        catch(Throwable throwable1) {
        }
        h.INSTANCE.closeQuietly(inputStream0);
        h.INSTANCE.closeQuietly(bufferedOutputStream0);
        h.INSTANCE.closeQuietly(fileOutputStream0);
        throw throwable1;
    label_29:
        h.INSTANCE.closeQuietly(inputStream0);
        h.INSTANCE.closeQuietly(bufferedOutputStream0);
        h.INSTANCE.closeQuietly(fileOutputStream0);
    }

    @l
    @j
    public final List unzip(@m String s, @l String s1) throws IOException {
        L.p(s1, "destDirectory");
        return w.unzip$default(this, s, s1, null, 4, null);
    }

    @l
    @j
    public final List unzip(@m String s, @l String s1, @m a w$a0) throws IOException {
        L.p(s1, "destDirectory");
        if(s == null || s.length() == 0) {
            throw new IOException("Path is empty");
        }
        File file0 = new File(s);
        if(!file0.exists()) {
            throw new IOException("File does not exist");
        }
        File file1 = new File(s1);
        if(!file1.exists()) {
            file1.mkdirs();
        }
        List list0 = new ArrayList();
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(file0);
            Enumeration enumeration0 = zipFile0.entries();
            while(enumeration0.hasMoreElements()) {
                ZipEntry zipEntry0 = (ZipEntry)enumeration0.nextElement();
                String s2 = s1 + "/" + zipEntry0.getName();
                if(w$a0 == null || w$a0.matches(s2)) {
                    this.validateFilename(s2, s1);
                    if(zipEntry0.isDirectory()) {
                        File file2 = new File(s2);
                        if(file2.exists()) {
                            continue;
                        }
                        file2.mkdirs();
                    }
                    else {
                        InputStream inputStream0 = zipFile0.getInputStream(zipEntry0);
                        L.o(inputStream0, "zipFile.getInputStream(entry)");
                        this.extractFile(inputStream0, s2);
                        list0.add(new File(s2));
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            if(zipFile0 != null) {
                try {
                    zipFile0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        }
        try {
            zipFile0.close();
        }
        catch(IOException unused_ex) {
        }
        return list0;
    }

    public static List unzip$default(w w0, String s, String s1, a w$a0, int v, Object object0) throws IOException {
        if((v & 4) != 0) {
            w$a0 = null;
        }
        return w0.unzip(s, s1, w$a0);
    }

    private final String validateFilename(String s, String s1) throws IOException {
        String s2 = new File(s).getCanonicalPath();
        String s3 = new File(s1).getCanonicalPath();
        L.o(s2, "canonicalPath");
        L.o(s3, "canonicalID");
        if(v.v2(s2, s3, false, 2, null)) {
            return s2;
        }
        L.o(w.TAG, "TAG");
        p.Companion.e(w.TAG, "File is outside extraction target directory.");
        throw new b("File is outside extraction target directory.");
    }
}

