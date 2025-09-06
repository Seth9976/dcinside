package Y2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a {
    private List a;

    public a() {
        this.a = new ArrayList();
    }

    public a(a a0) {
        new ArrayList();
        this.a = a0.a;
    }

    public void a(c c0) {
        this.a.add(c0);
    }

    public void b(@NonNull List list0) {
        this.a.addAll(list0);
    }

    public void c() {
        this.a.clear();
    }

    public c d(String s) {
        for(Object object0: this.a) {
            c c0 = (c)object0;
            if(c0.getTag().equals(s)) {
                return c0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NonNull
    public List e() {
        return this.a == null || this.a.isEmpty() ? new ArrayList(0) : new ArrayList(this.a);
    }

    public Bitmap f(Bitmap bitmap0) {
        if(bitmap0 != null) {
            for(Object object0: this.a) {
                c c0 = (c)object0;
                try {
                    bitmap0 = c0.a(bitmap0);
                }
                catch(OutOfMemoryError unused_ex) {
                    System.gc();
                    try {
                        bitmap0 = c0.a(bitmap0);
                    }
                    catch(OutOfMemoryError unused_ex) {
                    }
                }
            }
        }
        return bitmap0;
    }

    public void g(String s) {
        Iterator iterator0 = this.a.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((c)object0).getTag().equals(s)) {
                iterator0.remove();
            }
        }
    }
}

