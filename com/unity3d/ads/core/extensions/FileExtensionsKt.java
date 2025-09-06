package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.L;
import y4.l;

public final class FileExtensionsKt {
    public static final long getDirectorySize(@l File file0) {
        L.p(file0, "<this>");
        long v = 0L;
        if(!file0.exists()) {
            return 0L;
        }
        if(!file0.isDirectory()) {
            return file0.length();
        }
        LinkedList linkedList0 = new LinkedList();
        linkedList0.add(file0);
        while(!linkedList0.isEmpty()) {
            File file1 = (File)linkedList0.remove(0);
            if(file1.exists()) {
                File[] arr_file = file1.listFiles();
                if(arr_file != null && arr_file.length != 0) {
                    int v2 = arr_file.length;
                    for(int v1 = 0; v1 < v2; ++v1) {
                        File file2 = arr_file[v1];
                        if(file2.isDirectory()) {
                            L.o(file2, "child");
                            linkedList0.add(file2);
                        }
                        else {
                            v += file2.length();
                        }
                    }
                }
            }
        }
        return v;
    }
}

