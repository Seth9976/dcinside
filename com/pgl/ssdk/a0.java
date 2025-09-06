package com.pgl.ssdk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Pattern;

public class a0 {
    static final class a implements FileFilter {
        @Override
        public boolean accept(File file0) {
            return Pattern.matches("cpu[0-9]", file0.getName());
        }
    }

    private static final FileFilter a;

    static {
        a0.a = new a();
    }

    private static int a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(a0.a).length;
        }
        catch(Throwable unused_ex) {
            return -1;
        }
    }

    private static String a(String s) [...] // 潜在的解密器

    private static String a(HashMap hashMap0, String s) {
        String s1 = null;
        try {
            s1 = (String)hashMap0.get(s);
        }
        catch(Throwable unused_ex) {
        }
        return s1 == null ? "" : s1.trim();
    }

    private static HashMap b() {
        BufferedReader bufferedReader1;
        FileReader fileReader0;
        HashMap hashMap0 = new HashMap();
        BufferedReader bufferedReader0 = null;
        try {
            fileReader0 = null;
            fileReader0 = new FileReader("/proc/cpuinfo");
            bufferedReader1 = new BufferedReader(fileReader0);
            try {
                while(true) {
                    String s = bufferedReader1.readLine();
                    if(s == null) {
                        goto label_19;
                    }
                    String[] arr_s = s.split(":", 2);
                    if(arr_s.length >= 2) {
                        String s1 = arr_s[0].trim();
                        String s2 = arr_s[1].trim();
                        if(hashMap0.get(s1) == null) {
                            hashMap0.put(s1, s2);
                        }
                    }
                }
            }
            catch(Throwable unused_ex) {
                bufferedReader0 = bufferedReader1;
            }
        }
        catch(Throwable unused_ex) {
        }
        if(bufferedReader0 != null) {
            try {
                bufferedReader0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
        if(fileReader0 != null) {
            goto label_20;
            try {
            label_19:
                bufferedReader1.close();
            }
            catch(Throwable unused_ex) {
            }
            try {
            label_20:
                fileReader0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
        return hashMap0;
    }

    // 去混淆评级： 低(20)
    public static String c() [...] // 潜在的解密器
}

