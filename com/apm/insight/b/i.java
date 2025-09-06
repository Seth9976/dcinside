package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class i {
    public interface a {
    }

    static final class b implements Printer {
        List a;
        List b;
        boolean c;
        private List d;
        private boolean e;

        b() {
            this.a = new ArrayList();
            this.d = new ArrayList();
            this.b = new ArrayList();
            this.e = false;
            this.c = false;
        }

        @Override  // android.util.Printer
        public final void println(String s) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(s.charAt(0) == 62 && this.c) {
                for(Object object0: this.b) {
                    Printer printer0 = (Printer)object0;
                    if(!this.a.contains(printer0)) {
                        this.a.add(printer0);
                    }
                }
                this.b.clear();
                this.c = false;
            }
            if(this.a.size() > 5) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for(Object object1: this.a) {
                Printer printer1 = (Printer)object1;
                if(printer1 != null) {
                    printer1.println(s);
                }
            }
        }
    }

    private static int a = 5;
    private static b b;
    private static boolean c;
    private static Printer d;

    static {
    }

    public static void a() {
        if(i.c) {
            return;
        }
        i.c = true;
        i.b = new b();
        Printer printer0 = i.d();
        i.d = printer0;
        if(printer0 != null) {
            i.b.a.add(printer0);
        }
        Looper.getMainLooper().setMessageLogging(i.b);
    }

    public static void a(Printer printer0) {
        if(printer0 != null && !i.b.b.contains(printer0)) {
            i.b.b.add(printer0);
            i.b.c = true;
        }
    }

    static a b() {
        return null;
    }

    static int c() [...] // 潜在的解密器

    private static Printer d() {
        try {
            Field field0 = Looper.class.getDeclaredField("mLogging");
            field0.setAccessible(true);
            return (Printer)field0.get(Looper.getMainLooper());
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

