package com.bytedance.sdk.component.Au;

import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class cr {
    public static class PjT {
        public int PjT;
        public String ReZ;
        public String Zh;
        public String cr;

        public PjT(String s, int v, String s1, String s2) {
            this.ReZ = s;
            this.PjT = v;
            this.cr = s1;
            this.Zh = s2;
        }

        public int PjT() {
            return this.PjT;
        }

        public void PjT(int v) {
            this.PjT = v;
        }

        @Override
        public String toString() {
            return "ThreadModel{times=" + this.PjT + ", name=\'" + this.Zh + '\'' + ", lastStackStack=\'" + this.ReZ + '\'' + '}';
        }
    }

    private static int JQp;
    public static final String[] PjT;
    private static AtomicInteger ReZ;
    public static final String[] Zh;
    private static int cr;

    static {
        cr.ReZ = new AtomicInteger(0);
        cr.PjT = new String[]{"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
        cr.Zh = new String[]{"tt_pangle", "bd_tracker"};
        cr.cr = 0;
        cr.JQp = 0;
    }

    public static void PjT() {
        try {
            cr.Zh();
        }
        catch(Throwable unused_ex) {
        }
    }

    private static boolean PjT(String s, String[] arr_s) {
        if(!TextUtils.isEmpty(s) && arr_s != null) {
            for(int v = 0; v < arr_s.length; ++v) {
                if(s.contains(arr_s[v])) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void Zh() {
        ReZ reZ0 = cz.SM();
        if(reZ0 == null) {
            return;
        }
        int v = cr.ReZ.addAndGet(1);
        if(cz.ReZ >= 0 && v % cz.ReZ == 0 && Looper.getMainLooper() != Looper.myLooper()) {
            Map map0 = Thread.getAllStackTraces();
            new HashMap();
            if(map0 == null) {
                return;
            }
            int v1 = map0.size();
            if(v1 > cr.JQp) {
                cr.JQp = v1;
            }
            int v2 = 0;
            int v3 = 0;
            for(Object object0: map0.entrySet()) {
                ++v3;
                Thread thread0 = (Thread)((Map.Entry)object0).getKey();
                StackTraceElement[] arr_stackTraceElement = (StackTraceElement[])((Map.Entry)object0).getValue();
                new StringBuilder("\n");
                CharSequence charSequence0 = null;
                for(int v4 = 0; v4 < arr_stackTraceElement.length; ++v4) {
                    String s = arr_stackTraceElement[v4].toString();
                    if(TextUtils.isEmpty(charSequence0)) {
                        if(cr.PjT(s, cr.PjT)) {
                            ++v2;
                            charSequence0 = s;
                        }
                        else if(cr.PjT(thread0.getName(), cr.Zh)) {
                            ++v2;
                            charSequence0 = s;
                        }
                    }
                }
            }
            if(v2 > cr.cr) {
                cr.cr = v2;
            }
            reZ0.PjT(new com.bytedance.sdk.component.Au.Zh.PjT(v2, cr.cr, v1, cr.JQp));
        }
    }
}

