package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;

public final class g {
    public static Long a(File file0) {
        Long long1;
        File[] arr_file = file0.listFiles(new FileFilter() {
            @Override
            public final boolean accept(File file0) {
                return file0.isDirectory();
            }
        });
        Long long0 = null;
        if(arr_file != null && arr_file.length != 0) {
            int v = 0;
            while(v < arr_file.length) {
                String s = arr_file[v].getName();
                try {
                    long1 = Long.valueOf(s);
                    long v1 = (long)long1;
                    if(long0 == null) {
                        goto label_12;
                    }
                    else {
                        goto label_9;
                    }
                }
                catch(Exception unused_ex) {
                }
                goto label_13;
            label_9:
                if(v1 > ((long)long0)) {
                    long0 = long1;
                    goto label_13;
                label_12:
                    long0 = long1;
                }
            label_13:
                ++v;
            }
        }
        return long0;
    }
}

