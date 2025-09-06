package com.bytedance.sdk.component.JQp.ReZ.PjT.PjT;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

final class cr {
    static final Charset PjT;
    static final Charset Zh;

    static {
        cr.PjT = Charset.forName("US-ASCII");
        cr.Zh = Charset.forName("UTF-8");
    }

    static void PjT(File file0) throws IOException {
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            throw new IOException("not a readable directory: " + file0);
        }
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            if(file1.isDirectory()) {
                cr.PjT(file1);
            }
            if(!file1.delete()) {
                throw new IOException("failed to delete file: " + file1);
            }
        }
    }
}

