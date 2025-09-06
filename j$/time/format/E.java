package j$.time.format;

import java.util.ArrayList;

final class e implements f {
    private final f[] a;
    private final boolean b;

    e(ArrayList arrayList0, boolean z) {
        this(((f[])arrayList0.toArray(new f[arrayList0.size()])), z);
    }

    e(f[] arr_f, boolean z) {
        this.a = arr_f;
        this.b = z;
    }

    public final e a() {
        return this.b ? new e(this.a, false) : this;
    }

    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        int v = stringBuilder0.length();
        boolean z = this.b;
        if(z) {
            y0.g();
        }
        try {
            f[] arr_f = this.a;
            int v1 = 0;
            while(true) {
                if(v1 >= arr_f.length) {
                    goto label_19;
                }
                if(!arr_f[v1].l(y0, stringBuilder0)) {
                    stringBuilder0.setLength(v);
                    break;
                }
                ++v1;
            }
        }
        catch(Throwable throwable0) {
            if(z) {
                y0.a();
            }
            throw throwable0;
        }
        if(z) {
            y0.a();
        }
        return true;
    label_19:
        if(z) {
            y0.a();
        }
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        f[] arr_f = this.a;
        if(this.b) {
            w0.r();
            int v2 = v;
            for(int v3 = 0; v3 < arr_f.length; ++v3) {
                v2 = arr_f[v3].n(w0, charSequence0, v2);
                if(v2 < 0) {
                    w0.f(false);
                    return v;
                }
            }
            w0.f(true);
            return v2;
        }
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            v = arr_f[v1].n(w0, charSequence0, v);
            if(v < 0) {
                break;
            }
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        f[] arr_f = this.a;
        if(arr_f != null) {
            boolean z = this.b;
            stringBuilder0.append((z ? "[" : "("));
            for(int v = 0; v < arr_f.length; ++v) {
                stringBuilder0.append(arr_f[v]);
            }
            stringBuilder0.append((z ? "]" : ")"));
        }
        return stringBuilder0.toString();
    }
}

