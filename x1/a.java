package X1;

public class a implements d {
    private final int a;
    private final d[] b;
    private final b c;

    public a(int v, d[] arr_d) {
        this.a = v;
        this.b = arr_d;
        this.c = new b(v);
    }

    @Override  // X1.d
    public StackTraceElement[] a(StackTraceElement[] arr_stackTraceElement) {
        if(arr_stackTraceElement.length <= this.a) {
            return arr_stackTraceElement;
        }
        d[] arr_d = this.b;
        StackTraceElement[] arr_stackTraceElement1 = arr_stackTraceElement;
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            if(arr_stackTraceElement1.length <= this.a) {
                break;
            }
            arr_stackTraceElement1 = d0.a(arr_stackTraceElement);
        }
        return arr_stackTraceElement1.length <= this.a ? arr_stackTraceElement1 : this.c.a(arr_stackTraceElement1);
    }
}

