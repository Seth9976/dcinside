package com.pgl.ssdk;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

public class d0 {
    public static String a(Context context0) {
        String s2;
        String s1;
        synchronized(d0.class) {
            try {
                String s = context0.getFilesDir().getAbsolutePath() + "/dic";
                if(!new File(s).exists()) {
                    goto label_9;
                }
                d0.a(("chmod 777 " + s));
                s1 = d0.a(s);
                d0.a(("chmod 600 " + s));
                if(s1 == null || s1.length() <= 0) {
                label_9:
                    InputStream inputStream0 = context0.getResources().getAssets().open("dic");
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    byte[] arr_b = new byte[0x1000];
                    int v1;
                    while((v1 = inputStream0.read(arr_b, 0, 0x1000)) != -1) {
                        d0.a(arr_b, v1, "dic".getBytes(Charset.forName("UTF-8")));
                        byteArrayOutputStream0.write(arr_b, 0, v1);
                    }
                    FileOutputStream fileOutputStream0 = new FileOutputStream(s);
                    fileOutputStream0.write(byteArrayOutputStream0.toByteArray());
                    fileOutputStream0.close();
                    d0.a(("chmod 777 " + s));
                    s2 = d0.a(s);
                    if(s2 == null || s2.length() == 0) {
                        RandomAccessFile randomAccessFile0 = new RandomAccessFile(s, "rw");
                        randomAccessFile0.seek(16L);
                        randomAccessFile0.write(new byte[]{2});
                        randomAccessFile0.close();
                        s2 = d0.a(s);
                    }
                    d0.a(("chmod 600 " + s));
                    goto label_31;
                }
                return s1;
            }
            catch(Throwable unused_ex) {
                s2 = "0[<!>]EXCEPTION[<!>]";
            }
        }
    label_31:
        if(s2 == null || s2.length() == 0) {
            s2 = "0[<!>]ERROR[<!>]";
        }
        return s2;
    }

    private static String a(BufferedInputStream bufferedInputStream0) {
        if(bufferedInputStream0 == null) {
            return "";
        }
        byte[] arr_b = new byte[0x1000];
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            while(true) {
                int v = bufferedInputStream0.read(arr_b);
                if(v > 0) {
                    stringBuilder0.append(new String(arr_b, 0, v));
                }
                if(v < 0x1000) {
                    break;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return stringBuilder0.toString();
    }

    private static String a(String s) {
        BufferedInputStream bufferedInputStream0;
        BufferedOutputStream bufferedOutputStream0;
        Process process0;
        String s1 = null;
        try {
            process0 = null;
            process0 = Runtime.getRuntime().exec("sh");
            bufferedOutputStream0 = null;
            bufferedOutputStream0 = new BufferedOutputStream(process0.getOutputStream());
        }
        catch(Exception unused_ex) {
            bufferedInputStream0 = null;
            goto label_20;
        }
        catch(Throwable throwable0) {
            bufferedInputStream0 = null;
            goto label_28;
        }
        try {
            bufferedInputStream0 = null;
            bufferedInputStream0 = new BufferedInputStream(process0.getInputStream());
            bufferedOutputStream0.write(s.getBytes());
            bufferedOutputStream0.write(10);
            bufferedOutputStream0.flush();
            bufferedOutputStream0.close();
            process0.waitFor();
            s1 = d0.a(bufferedInputStream0);
            goto label_35;
        }
        catch(Exception unused_ex) {
        label_20:
            if(bufferedOutputStream0 != null) {
                try {
                    bufferedOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            if(bufferedInputStream0 != null) {
                try {
                    bufferedInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            if(process0 != null) {
                process0.destroy();
                return s1;
            }
            return s1;
        }
        catch(Throwable throwable0) {
            s1 = bufferedOutputStream0;
        }
    label_28:
        if(s1 != null) {
            try {
                ((OutputStream)s1).close();
            }
            catch(IOException unused_ex) {
            }
        }
        if(bufferedInputStream0 != null) {
            try {
                bufferedInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        if(process0 != null) {
            process0.destroy();
        }
        throw throwable0;
        try {
        label_35:
            bufferedOutputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        try {
            bufferedInputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        process0.destroy();
        return s1;
    }

    private static void a(byte[] arr_b, int v, byte[] arr_b1) {
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)(arr_b[v1] ^ arr_b1[v1 % arr_b1.length]);
        }
    }
}

