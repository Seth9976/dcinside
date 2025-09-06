package com.bytedance.adsdk.Zh.cr;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import jeb.synthetic.TWR;

public class XX {
    private final JQp PjT;

    public XX(JQp jQp0) {
        this.PjT = jQp0;
    }

    private File PjT() {
        File file0 = this.PjT.PjT();
        if(file0.isFile()) {
            file0.delete();
        }
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return file0;
    }

    // 去混淆评级： 低(20)
    private static String PjT(String s, ReZ reZ0, boolean z) {
        return "lottie_cache_" + s.replaceAll("\\W+", "") + (z ? reZ0.PjT() : reZ0.ReZ);
    }

    Pair PjT(String s) {
        FileInputStream fileInputStream0;
        File file0;
        try {
            file0 = this.Zh(s);
            if(file0 == null) {
                return null;
            }
            fileInputStream0 = new FileInputStream(file0);
        }
        catch(FileNotFoundException unused_ex) {
            return null;
        }
        ReZ reZ0 = file0.getAbsolutePath().endsWith(".zip") ? ReZ.Zh : ReZ.PjT;
        file0.getAbsolutePath();
        return new Pair(reZ0, fileInputStream0);
    }

    File PjT(String s, InputStream inputStream0, ReZ reZ0) throws IOException {
        String s1 = XX.PjT(s, reZ0, true);
        File file0 = new File(this.PjT(), s1);
        try {
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            try {
                byte[] arr_b = new byte[0x400];
                while(true) {
                    inputStream0 = TWR.getResource$NT(inputStream0);
                    TWR.declareResource(inputStream0);
                    TWR.useResource$NT(inputStream0);
                    int v1 = inputStream0.read(arr_b);
                    if(v1 == -1) {
                        break;
                    }
                    TWR.useResource$NT(inputStream0);
                    fileOutputStream0.write(arr_b, 0, v1);
                }
                TWR.useResource$NT(inputStream0);
                fileOutputStream0.flush();
                TWR.useResource$NT(inputStream0);
                return file0;
            }
            finally {
                fileOutputStream0.close();
            }
        }
        catch(Throwable throwable0) {
            TWR.moot$NT();
            throw throwable0;
        }
    }

    void PjT(String s, ReZ reZ0) {
        String s1 = XX.PjT(s, reZ0, true);
        File file0 = new File(this.PjT(), s1);
        File file1 = new File(file0.getAbsolutePath().replace(".temp", ""));
        boolean z = file0.renameTo(file1);
        file1.toString();
        if(!z) {
            file0.getAbsolutePath();
            file1.getAbsolutePath();
        }
    }

    private File Zh(String s) throws FileNotFoundException {
        File file0 = new File(this.PjT(), XX.PjT(s, ReZ.PjT, false));
        if(file0.exists()) {
            return file0;
        }
        File file1 = new File(this.PjT(), XX.PjT(s, ReZ.Zh, false));
        return file1.exists() ? file1 : null;
    }
}

