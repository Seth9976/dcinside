package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {
    static class a {
        private final Class a;
        final Class b;
        final l c;

        public a(@NonNull Class class0, @NonNull Class class1, l l0) {
            this.a = class0;
            this.b = class1;
            this.c = l0;
        }

        // 去混淆评级： 低(20)
        public boolean a(@NonNull Class class0, @NonNull Class class1) {
            return this.a.isAssignableFrom(class0) && class1.isAssignableFrom(this.b);
        }
    }

    private final List a;
    private final Map b;

    public e() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public void a(@NonNull String s, @NonNull l l0, @NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            this.c(s).add(new a(class0, class1, l0));
        }
    }

    @NonNull
    public List b(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                List list1 = (List)this.b.get(((String)object0));
                if(list1 != null) {
                    for(Object object1: list1) {
                        a e$a0 = (a)object1;
                        if(e$a0.a(class0, class1)) {
                            list0.add(e$a0.c);
                        }
                    }
                }
            }
            return list0;
        }
    }

    @NonNull
    private List c(@NonNull String s) {
        synchronized(this) {
            if(!this.a.contains(s)) {
                this.a.add(s);
            }
            List list0 = (List)this.b.get(s);
            if(list0 == null) {
                list0 = new ArrayList();
                this.b.put(s, list0);
            }
            return list0;
        }
    }

    @NonNull
    public List d(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                List list1 = (List)this.b.get(((String)object0));
                if(list1 != null) {
                    for(Object object1: list1) {
                        a e$a0 = (a)object1;
                        if(e$a0.a(class0, class1) && !list0.contains(e$a0.b)) {
                            list0.add(e$a0.b);
                        }
                    }
                }
            }
            return list0;
        }
    }

    public void e(@NonNull String s, @NonNull l l0, @NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            this.c(s).add(0, new a(class0, class1, l0));
        }
    }

    public void f(@NonNull List list0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.a);
            this.a.clear();
            for(Object object0: list0) {
                this.a.add(((String)object0));
            }
            for(Object object1: arrayList0) {
                String s = (String)object1;
                if(!list0.contains(s)) {
                    this.a.add(s);
                }
            }
        }
    }
}

