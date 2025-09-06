package com.bykv.vk.openvk.preload.b.a;

import java.util.ArrayList;
import java.util.List;

public final class a extends Exception {
    public a(List list0) {
        if(list0.isEmpty()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            a.a(((Throwable)object0), arrayList0);
        }
        this.setStackTrace(((StackTraceElement[])arrayList0.toArray(new StackTraceElement[arrayList0.size()])));
    }

    private static void a(Throwable throwable0, List list0) {
        while(throwable0 != null) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(v == 0) {
                    String s = throwable0.getMessage();
                    StringBuilder stringBuilder0 = new StringBuilder("\b\b\b\nCaused by:");
                    if(s == null) {
                        s = "";
                    }
                    stringBuilder0.append(s);
                    stringBuilder0.append("\n\t");
                    stringBuilder0.append(stackTraceElement0.getClassName());
                    list0.add(new StackTraceElement(stringBuilder0.toString(), stackTraceElement0.getMethodName(), stackTraceElement0.getFileName(), stackTraceElement0.getLineNumber()));
                }
                else {
                    list0.add(stackTraceElement0);
                }
            }
            throwable0 = throwable0.getCause();
        }
    }
}

