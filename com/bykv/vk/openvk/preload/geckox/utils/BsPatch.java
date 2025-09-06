package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileNotFoundException;

public class BsPatch {
    static {
        System.loadLibrary("geckox_bspatch");
    }

    public static void a(File file0, File file1, File file2, String s) throws Exception {
        if(!file0.exists()) {
            throw new FileNotFoundException("full package not exist：" + file0.getAbsolutePath());
        }
        if(!file1.exists()) {
            throw new FileNotFoundException("patch package not exist：" + file1.getAbsolutePath());
        }
        file2.mkdirs();
        File file3 = new File(file2, s);
        file3.delete();
        int v = BsPatch.patch(file0.getAbsolutePath(), file3.getAbsolutePath(), file1.getAbsolutePath());
        if(v != 0) {
            throw new RuntimeException("patch merged failed, code：" + v + " full:" + file0.getAbsolutePath() + " patch:" + file1.getAbsolutePath() + " dest:" + file3.getAbsolutePath());
        }
    }

    private static native int patch(String arg0, String arg1, String arg2) throws Exception {
    }
}

