package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class f {
    protected final Set a;
    protected final b b;
    protected final a c;
    protected boolean d;
    protected boolean e;
    protected d f;
    private static final String g = "lib";

    protected f() {
        this(new g(), new com.getkeepsafe.relinker.a());
    }

    protected f(b e$b0, a e$a0) {
        this.a = new HashSet();
        if(e$b0 == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if(e$a0 == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.b = e$b0;
        this.c = e$a0;
    }

    protected void b(Context context0, String s, String s1) {
        class com.getkeepsafe.relinker.f.b implements FilenameFilter {
            final String a;
            final f b;

            com.getkeepsafe.relinker.f.b(String s) {
                this.a = s;
                super();
            }

            @Override
            public boolean accept(File file0, String s) {
                return s.startsWith(this.a);
            }
        }

        File file0 = this.d(context0);
        File file1 = this.e(context0, s, s1);
        File[] arr_file = file0.listFiles(new com.getkeepsafe.relinker.f.b(this, this.b.e(s)));
        if(arr_file == null) {
            return;
        }
        for(int v = 0; v < arr_file.length; ++v) {
            File file2 = arr_file[v];
            if(this.d || !file2.getAbsolutePath().equals(file1.getAbsolutePath())) {
                file2.delete();
            }
        }
    }

    public f c() {
        this.d = true;
        return this;
    }

    protected File d(Context context0) {
        return context0.getDir("lib", 0);
    }

    protected File e(Context context0, String s, String s1) {
        String s2 = this.b.e(s);
        return h.a(s1) ? new File(this.d(context0), s2) : new File(this.d(context0), s2 + "." + s1);
    }

    public void f(Context context0, String s) {
        this.i(context0, s, null, null);
    }

    public void g(Context context0, String s, c e$c0) {
        this.i(context0, s, null, e$c0);
    }

    public void h(Context context0, String s, String s1) {
        this.i(context0, s, s1, null);
    }

    public void i(Context context0, String s, String s1, c e$c0) {
        class com.getkeepsafe.relinker.f.a implements Runnable {
            final Context a;
            final String b;
            final String c;
            final c d;
            final f e;

            com.getkeepsafe.relinker.f.a(Context context0, String s, String s1, c e$c0) {
                this.a = context0;
                this.b = s;
                this.c = s1;
                this.d = e$c0;
                super();
            }

            @Override
            public void run() {
                try {
                    f.this.j(this.a, this.b, this.c);
                    this.d.success();
                }
                catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                    this.d.a(unsatisfiedLinkError0);
                }
                catch(com.getkeepsafe.relinker.c c0) {
                    this.d.a(c0);
                }
            }
        }

        if(context0 == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if(h.a(s)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        this.m("Beginning load of %s...", new Object[]{s});
        if(e$c0 == null) {
            this.j(context0, s, s1);
            return;
        }
        new Thread(new com.getkeepsafe.relinker.f.a(this, context0, s, s1, e$c0)).start();
    }

    private void j(Context context0, String s, String s1) {
        com.getkeepsafe.relinker.elf.f f0;
        if(this.a.contains(s) && !this.d) {
            this.m("%s already loaded previously!", new Object[]{s});
            return;
        }
        try {
            this.b.a(s);
            this.a.add(s);
            this.m("%s (%s) was loaded normally!", new Object[]{s, s1});
        }
        catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            this.m("Loading the library normally failed: %s", new Object[]{Log.getStackTraceString(unsatisfiedLinkError0)});
            this.m("%s (%s) was not loaded normally, re-linking...", new Object[]{s, s1});
            File file0 = this.e(context0, s, s1);
            if(!file0.exists() || this.d) {
                if(this.d) {
                    this.m("Forcing a re-link of %s (%s)...", new Object[]{s, s1});
                }
                this.b(context0, s, s1);
                String[] arr_s = this.b.c();
                String s2 = this.b.e(s);
                this.c.a(context0, arr_s, s2, file0, this);
            }
            if(this.e) {
                try {
                    f0 = new com.getkeepsafe.relinker.elf.f(file0);
                    List list0 = f0.c();
                    for(Object object0: list0) {
                        this.f(context0, this.b.b(((String)object0)));
                    }
                }
                catch(IOException unused_ex) {
                }
                finally {
                    f0.close();
                }
            }
            String s3 = file0.getAbsolutePath();
            this.b.d(s3);
            this.a.add(s);
            this.m("%s (%s) was re-linked!", new Object[]{s, s1});
        }
    }

    public f k(d e$d0) {
        this.f = e$d0;
        return this;
    }

    public void l(String s) {
        d e$d0 = this.f;
        if(e$d0 != null) {
            e$d0.a(s);
        }
    }

    public void m(String s, Object[] arr_object) {
        this.l(String.format(Locale.US, s, arr_object));
    }

    public f n() {
        this.e = true;
        return this;
    }
}

