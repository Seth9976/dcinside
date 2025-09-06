package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.g.b;
import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

final class a {
    private String a;
    private String b;
    private volatile File c;
    private volatile Long d;
    private volatile com.bykv.vk.openvk.preload.geckox.f.a.a e;
    private AtomicBoolean f;

    a(String s, String s1) {
        this.f = new AtomicBoolean(false);
        this.a = s;
        this.b = s1;
    }

    private static String a(String s, String s1) {
        return s1.substring(s.length() + 1);
    }

    final InputStream a(String s) throws Exception {
        return this.d(this.b).a(a.a(this.b, s));
    }

    final Long a() {
        return this.d;
    }

    final String b() {
        return this.b;
    }

    final boolean b(String s) throws Exception {
        return this.d(this.b).b(a.a(this.b, s));
    }

    public final int c(String s) {
        try {
            File file0 = new File(this.e(s), "res");
            if(file0.exists() && file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                return arr_file.length <= 0 ? 0 : arr_file.length - 1;
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return 0;
    }

    final void c() throws Exception {
        if(this.f.getAndSet(true)) {
            return;
        }
        b b0 = b.a((this.a + "/" + this.b + "/" + "select.lock"));
        GeckoLogger.d("gecko-file-lock", new Object[]{"channel version loader clean"});
        try {
            if(this.c == null) {
                return;
            }
            c.b((this.c.getAbsolutePath() + "/" + "using.lock"));
        }
        finally {
            b0.a();
        }
        com.bykv.vk.openvk.preload.geckox.a.c.a((this.a + "/" + this.b));
    }

    private com.bykv.vk.openvk.preload.geckox.f.a.a d(String s) throws Exception {
        synchronized(this) {
            if(this.e != null) {
                return this.e;
            }
            File file0 = this.e(s);
            if(file0 != null) {
                File file1 = new File(file0, "res.macv");
                File file2 = new File(file0, "res");
                if(file2.exists() && file2.isDirectory()) {
                    this.e = new com.bykv.vk.openvk.preload.geckox.f.a.c(file0);
                }
                else if(file1.exists() && file1.isFile()) {
                    this.e = new com.bykv.vk.openvk.preload.geckox.f.a.b(file0);
                }
                else {
                    throw new RuntimeException("can not find res, dir:" + file0.getAbsolutePath());
                }
                return this.e;
            }
        }
        throw new FileNotFoundException("channel no exist，channel:" + s);
    }

    private File e(String s) throws Exception {
        File file1;
        synchronized(this) {
            if(this.c != null) {
                return this.c;
            }
            if(this.d != null && ((long)this.d) == -1L) {
                return null;
            }
            b b0 = b.a((this.a + "/" + s + "/" + "select.lock"));
            try {
                if(this.d == null) {
                    this.d = g.a(new File(this.a, s));
                }
                if(this.d == null) {
                    this.d = -1L;
                    goto label_15;
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                b0.a();
                throw throwable0;
            }
        label_15:
            b0.a();
            return null;
            try {
            label_18:
                File file0 = new File(this.a, "/" + s + "/" + this.d + "/" + "using.lock");
                this.c = file0.getParentFile();
                c.a(file0.getAbsolutePath());
                file1 = this.c;
            }
            catch(Throwable throwable0) {
                b0.a();
                throw throwable0;
            }
            b0.a();
            return file1;
        }
    }
}

