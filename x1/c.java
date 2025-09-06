package X1;

import java.util.HashMap;

public class c implements d {
    private final int a;

    public c() {
        this(1);
    }

    public c(int v) {
        this.a = v;
    }

    @Override  // X1.d
    public StackTraceElement[] a(StackTraceElement[] arr_stackTraceElement) {
        StackTraceElement[] arr_stackTraceElement1 = c.c(arr_stackTraceElement, this.a);
        return arr_stackTraceElement1.length >= arr_stackTraceElement.length ? arr_stackTraceElement : arr_stackTraceElement1;
    }

    private static boolean b(StackTraceElement[] arr_stackTraceElement, int v, int v1) {
        int v2 = v1 - v;
        if(v1 + v2 > arr_stackTraceElement.length) {
            return false;
        }
        for(int v3 = 0; v3 < v2; ++v3) {
            if(!arr_stackTraceElement[v + v3].equals(arr_stackTraceElement[v1 + v3])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] c(StackTraceElement[] arr_stackTraceElement, int v) {
        int v5;
        HashMap hashMap0 = new HashMap();
        StackTraceElement[] arr_stackTraceElement1 = new StackTraceElement[arr_stackTraceElement.length];
        int v2 = 0;
        int v3 = 1;
        for(int v1 = 0; v1 < arr_stackTraceElement.length; v1 = v5 + 1) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
            Integer integer0 = (Integer)hashMap0.get(stackTraceElement0);
            if(integer0 == null || !c.b(arr_stackTraceElement, ((int)integer0), v1)) {
                arr_stackTraceElement1[v2] = arr_stackTraceElement[v1];
                ++v2;
                v5 = v1;
                v3 = 1;
            }
            else {
                int v4 = v1 - ((int)integer0);
                if(v3 < v) {
                    System.arraycopy(arr_stackTraceElement, v1, arr_stackTraceElement1, v2, v4);
                    v2 += v4;
                    ++v3;
                }
                v5 = v4 - 1 + v1;
            }
            hashMap0.put(stackTraceElement0, v1);
        }
        StackTraceElement[] arr_stackTraceElement2 = new StackTraceElement[v2];
        System.arraycopy(arr_stackTraceElement1, 0, arr_stackTraceElement2, 0, v2);
        return arr_stackTraceElement2;
    }
}

