package X1;

public class b implements d {
    private final int a;

    public b(int v) {
        this.a = v;
    }

    @Override  // X1.d
    public StackTraceElement[] a(StackTraceElement[] arr_stackTraceElement) {
        int v = this.a;
        if(arr_stackTraceElement.length <= v) {
            return arr_stackTraceElement;
        }
        int v1 = v - v / 2;
        StackTraceElement[] arr_stackTraceElement1 = new StackTraceElement[v];
        System.arraycopy(arr_stackTraceElement, 0, arr_stackTraceElement1, 0, v1);
        System.arraycopy(arr_stackTraceElement, arr_stackTraceElement.length - v / 2, arr_stackTraceElement1, v1, v / 2);
        return arr_stackTraceElement1;
    }
}

