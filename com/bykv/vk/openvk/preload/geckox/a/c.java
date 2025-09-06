package com.bykv.vk.openvk.preload.geckox.a;

import com.bykv.vk.openvk.preload.falconx.a.a;
import com.bykv.vk.openvk.preload.geckox.utils.b;
import com.bykv.vk.openvk.preload.geckox.utils.f;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {
    public c(Field field0) {
        a.a(field0);
    }

    private static List a(File[] arr_file) {
        long v4;
        long v2;
        ArrayList arrayList0 = new ArrayList();
        List list0 = new ArrayList();
        File file0 = null;
        long v = -1L;
        int v1 = 0;
        while(v1 < arr_file.length) {
            File file1 = arr_file[v1];
            String s = file1.getName();
            if(s.endsWith("--updating")) {
                arrayList0.add(file1);
            }
            else if(s.endsWith("--pending-delete")) {
                c.a(file1);
            }
            else {
                try {
                    v2 = Long.parseLong(s);
                    if(v2 <= v) {
                        list0.add(file1);
                    }
                    else {
                        if(file0 != null) {
                            try {
                                list0.add(file0);
                            }
                            catch(Exception unused_ex) {
                                v = v2;
                                goto label_22;
                            }
                        }
                        goto label_24;
                    }
                    goto label_26;
                }
                catch(Exception unused_ex) {
                }
            label_22:
                c.a(file1);
                goto label_26;
            label_24:
                file0 = file1;
                v = v2;
            }
        label_26:
            ++v1;
        }
        for(Object object0: arrayList0) {
            File file2 = (File)object0;
            String s1 = file2.getName();
            int v3 = s1.indexOf("--updating");
            if(v3 == -1) {
                c.a(file2);
            }
            else {
                try {
                    v4 = Long.parseLong(s1.substring(0, v3));
                }
                catch(NumberFormatException numberFormatException0) {
                    numberFormatException0.printStackTrace();
                    v4 = -1L;
                }
                if(v4 <= v) {
                    c.a(file2);
                }
            }
        }
        return list0;
    }

    private static void a(File file0) {
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() {
            @Override
            public final void run() {
                b.a(file0);
            }
        });
    }

    public static void a(String s) {
        f.a().execute(new Runnable() {
            @Override
            public final void run() {
                try {
                    c.c(s);
                }
                catch(Throwable throwable0) {
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException("delete old channel version failed，path：" + s, throwable0));
                }
            }
        });
    }

    public static boolean b(String s) {
        try {
            com.bykv.vk.openvk.preload.geckox.g.a a0 = com.bykv.vk.openvk.preload.geckox.g.a.a((s + "/" + "update.lock"));
            if(a0 == null) {
                return true;
            }
            try {
                com.bykv.vk.openvk.preload.geckox.g.b b0 = com.bykv.vk.openvk.preload.geckox.g.b.a((s + "/" + "select.lock"));
                try {
                    b.c(new File(s));
                }
                catch(Throwable unused_ex) {
                }
                b0.a();
                return true;
            }
            finally {
                a0.a();
            }
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    static void c(String s) throws Exception {
        com.bykv.vk.openvk.preload.geckox.g.a a0 = com.bykv.vk.openvk.preload.geckox.g.a.a((s + "/" + "update.lock"));
        if(a0 != null) {
            try {
                com.bykv.vk.openvk.preload.geckox.g.b b0 = com.bykv.vk.openvk.preload.geckox.g.b.a((s + "/" + "select.lock"));
                try {
                    File[] arr_file = new File(s).listFiles(new FileFilter() {
                        @Override
                        public final boolean accept(File file0) {
                            return file0.isDirectory();
                        }
                    });
                    List list0 = arr_file == null || (arr_file.length == 0 || arr_file.length == 1) ? null : c.a(arr_file);
                    if(list0 != null && !list0.isEmpty()) {
                        Iterator iterator0 = list0.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                goto label_16;
                            }
                            Object object0 = iterator0.next();
                            com.bykv.vk.openvk.preload.geckox.g.c.c((((File)object0).getAbsolutePath() + "/" + "using.lock"));
                        }
                    }
                    goto label_19;
                }
                catch(Throwable throwable0) {
                }
                b0.a();
                throw throwable0;
            label_16:
                b0.a();
                return;
            label_19:
                b0.a();
            }
            finally {
                a0.a();
            }
        }
    }
}

