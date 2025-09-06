package org.jsoup.helper;

import java.util.ArrayList;

public class j extends IllegalArgumentException {
    public static final String a;

    static {
        j.a = "org.jsoup.helper.i";
    }

    public j(String s) {
        super(s);
    }

    @Override
    public Throwable fillInStackTrace() {
        synchronized(this) {
            super.fillInStackTrace();
            StackTraceElement[] arr_stackTraceElement = this.getStackTrace();
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
                if(!stackTraceElement0.getClassName().equals("org.jsoup.helper.i")) {
                    arrayList0.add(stackTraceElement0);
                }
            }
            this.setStackTrace(((StackTraceElement[])arrayList0.toArray(new StackTraceElement[0])));
            return this;
        }
    }
}

