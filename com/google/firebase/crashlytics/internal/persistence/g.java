package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class g {
    final String a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final File g;
    private static final String h = ".com.google.firebase.crashlytics.files.v1";
    private static final String i = ".com.google.firebase.crashlytics.files.v2";
    private static final String j = ".crashlytics.v3";
    private static final String k = "open-sessions";
    private static final String l = "native";
    private static final String m = "reports";
    private static final String n = "priority-reports";
    private static final String o = "native-reports";

    public g(Context context0) {
        String s = j.a.g(context0).d();
        this.a = s;
        File file0 = context0.getFilesDir();
        this.b = file0;
        File file1 = g.u(new File(file0, (this.z() ? ".crashlytics.v3/" + g.y(s) : ".com.google.firebase.crashlytics.files.v1")));
        this.c = file1;
        this.d = g.u(new File(file1, "open-sessions"));
        this.e = g.u(new File(file1, "reports"));
        this.f = g.u(new File(file1, "priority-reports"));
        this.g = g.u(new File(file1, "native-reports"));
    }

    private void b(String s) {
        File file0 = new File(this.b, s);
        if(file0.exists() && g.w(file0)) {
            com.google.firebase.crashlytics.internal.g.f().b("Deleted previous Crashlytics file system: " + file0.getPath());
        }
    }

    private void c(String s) {
        if(this.b.exists()) {
            f f0 = (File file0, String s1) -> s1.startsWith(s);
            String[] arr_s = this.b.list(f0);
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; ++v) {
                    this.b(arr_s[v]);
                }
            }
        }
    }

    public void d() {
        this.b(".com.google.firebase.crashlytics");
        this.b(".com.google.firebase.crashlytics-ndk");
        if(this.z()) {
            this.b(".com.google.firebase.crashlytics.files.v1");
            this.c(".com.google.firebase.crashlytics.files.v2;");
        }
    }

    @VisibleForTesting
    public void e() {
        g.w(this.c);
    }

    public boolean f(String s) {
        return g.w(new File(this.d, s));
    }

    public List g() {
        return g.x(this.d.list());
    }

    public File h(String s) {
        return new File(this.c, s);
    }

    public List i(FilenameFilter filenameFilter0) {
        return g.x(this.c.listFiles(filenameFilter0));
    }

    public File j(String s) {
        return new File(this.g, s);
    }

    public List k() {
        return g.x(this.g.listFiles());
    }

    public File l(String s) {
        return g.v(new File(this.q(s), "native"));
    }

    public File m(String s) {
        return new File(this.f, s);
    }

    public List n() {
        return g.x(this.f.listFiles());
    }

    public File o(String s) {
        return new File(this.e, s);
    }

    public List p() {
        return g.x(this.e.listFiles());
    }

    private File q(String s) {
        return g.v(new File(this.d, s));
    }

    public File r(String s, String s1) {
        return new File(this.q(s), s1);
    }

    public List s(String s, FilenameFilter filenameFilter0) {
        return g.x(this.q(s).listFiles(filenameFilter0));
    }

    // 检测为 Lambda 实现
    private static boolean t(String s, File file0, String s1) [...]

    private static File u(File file0) {
        synchronized(g.class) {
            if(file0.exists()) {
                if(file0.isDirectory()) {
                    return file0;
                }
                com.google.firebase.crashlytics.internal.g.f().b("Unexpected non-directory file: " + file0 + "; deleting file and creating new directory.");
                file0.delete();
            }
            if(!file0.mkdirs()) {
                com.google.firebase.crashlytics.internal.g.f().d("Could not create Crashlytics-specific directory: " + file0);
            }
            return file0;
        }
    }

    private static File v(File file0) {
        file0.mkdirs();
        return file0;
    }

    static boolean w(File file0) {
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                g.w(arr_file[v]);
            }
        }
        return file0.delete();
    }

    private static List x(@Nullable Object[] arr_object) {
        return arr_object == null ? Collections.emptyList() : Arrays.asList(arr_object);
    }

    @VisibleForTesting
    static String y(String s) {
        return s.length() <= 40 ? s.replaceAll("[^a-zA-Z0-9.]", "_") : i.C(s);
    }

    private boolean z() {
        return !this.a.isEmpty();
    }
}

