package androidx.recyclerview.widget;

import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class AdapterHelper implements Callback {
    interface androidx.recyclerview.widget.AdapterHelper.Callback {
        void a(int arg1, int arg2);

        void b(UpdateOp arg1);

        void c(UpdateOp arg1);

        ViewHolder d(int arg1);

        void e(int arg1, int arg2);

        void f(int arg1, int arg2);

        void g(int arg1, int arg2);

        void h(int arg1, int arg2, Object arg3);
    }

    static final class UpdateOp {
        int a;
        int b;
        Object c;
        int d;
        static final int e = 1;
        static final int f = 2;
        static final int g = 4;
        static final int h = 8;
        static final int i = 30;

        UpdateOp(int v, int v1, int v2, Object object0) {
            this.a = v;
            this.b = v1;
            this.d = v2;
            this.c = object0;
        }

        String a() {
            switch(this.a) {
                case 1: {
                    return "add";
                }
                case 2: {
                    return "rm";
                }
                case 4: {
                    return "up";
                }
                case 8: {
                    return "mv";
                }
                default: {
                    return "??";
                }
            }
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof UpdateOp)) {
                return false;
            }
            int v = this.a;
            if(v != ((UpdateOp)object0).a) {
                return false;
            }
            if(v == 8 && Math.abs(this.d - this.b) == 1 && this.d == ((UpdateOp)object0).b && this.b == ((UpdateOp)object0).d) {
                return true;
            }
            if(this.d != ((UpdateOp)object0).d) {
                return false;
            }
            if(this.b != ((UpdateOp)object0).b) {
                return false;
            }
            return this.c == null ? ((UpdateOp)object0).c == null : this.c.equals(((UpdateOp)object0).c);
        }

        @Override
        public int hashCode() {
            return (this.a * 0x1F + this.b) * 0x1F + this.d;
        }

        @Override
        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + this.a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
        }
    }

    private Pool a;
    final ArrayList b;
    final ArrayList c;
    final androidx.recyclerview.widget.AdapterHelper.Callback d;
    Runnable e;
    final boolean f;
    final OpReorderer g;
    private int h;
    static final int i = 0;
    static final int j = 1;
    private static final boolean k = false;
    private static final String l = "AHT";

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback adapterHelper$Callback0) {
        this(adapterHelper$Callback0, false);
    }

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback adapterHelper$Callback0, boolean z) {
        this.a = new SimplePool(30);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = 0;
        this.d = adapterHelper$Callback0;
        this.f = z;
        this.g = new OpReorderer(this);
    }

    private int A(int v, int v1) {
        int v7;
        int v6;
        for(int v2 = this.c.size() - 1; v2 >= 0; --v2) {
            UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.c.get(v2);
            int v3 = adapterHelper$UpdateOp0.a;
            if(v3 == 8) {
                int v4 = adapterHelper$UpdateOp0.b;
                int v5 = adapterHelper$UpdateOp0.d;
                if(v4 < v5) {
                    v6 = v4;
                    v7 = v5;
                }
                else {
                    v7 = v4;
                    v6 = v5;
                }
                if(v < v6 || v > v7) {
                    if(v < v4) {
                        if(v1 == 1) {
                            adapterHelper$UpdateOp0.b = v4 + 1;
                            adapterHelper$UpdateOp0.d = v5 + 1;
                        }
                        else if(v1 == 2) {
                            adapterHelper$UpdateOp0.b = v4 - 1;
                            adapterHelper$UpdateOp0.d = v5 - 1;
                        }
                    }
                }
                else if(v6 == v4) {
                    if(v1 == 1) {
                        adapterHelper$UpdateOp0.d = v5 + 1;
                    }
                    else if(v1 == 2) {
                        adapterHelper$UpdateOp0.d = v5 - 1;
                    }
                    ++v;
                }
                else {
                    if(v1 == 1) {
                        adapterHelper$UpdateOp0.b = v4 + 1;
                    }
                    else if(v1 == 2) {
                        adapterHelper$UpdateOp0.b = v4 - 1;
                    }
                    --v;
                }
            }
            else {
                int v8 = adapterHelper$UpdateOp0.b;
                if(v8 > v) {
                    if(v1 == 1) {
                        adapterHelper$UpdateOp0.b = v8 + 1;
                    }
                    else if(v1 == 2) {
                        adapterHelper$UpdateOp0.b = v8 - 1;
                    }
                }
                else if(v3 == 1) {
                    v -= adapterHelper$UpdateOp0.d;
                }
                else if(v3 == 2) {
                    v += adapterHelper$UpdateOp0.d;
                }
            }
        }
        for(int v9 = this.c.size() - 1; v9 >= 0; --v9) {
            UpdateOp adapterHelper$UpdateOp1 = (UpdateOp)this.c.get(v9);
            if(adapterHelper$UpdateOp1.a != 8) {
                if(adapterHelper$UpdateOp1.d <= 0) {
                    this.c.remove(v9);
                    this.b(adapterHelper$UpdateOp1);
                }
            }
            else if(adapterHelper$UpdateOp1.d == adapterHelper$UpdateOp1.b || adapterHelper$UpdateOp1.d < 0) {
                this.c.remove(v9);
                this.b(adapterHelper$UpdateOp1);
            }
        }
        return v;
    }

    @Override  // androidx.recyclerview.widget.OpReorderer$Callback
    public UpdateOp a(int v, int v1, int v2, Object object0) {
        UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.a.b();
        if(adapterHelper$UpdateOp0 == null) {
            return new UpdateOp(v, v1, v2, object0);
        }
        adapterHelper$UpdateOp0.a = v;
        adapterHelper$UpdateOp0.b = v1;
        adapterHelper$UpdateOp0.d = v2;
        adapterHelper$UpdateOp0.c = object0;
        return adapterHelper$UpdateOp0;
    }

    @Override  // androidx.recyclerview.widget.OpReorderer$Callback
    public void b(UpdateOp adapterHelper$UpdateOp0) {
        if(!this.f) {
            adapterHelper$UpdateOp0.c = null;
            this.a.a(adapterHelper$UpdateOp0);
        }
    }

    AdapterHelper c(UpdateOp[] arr_adapterHelper$UpdateOp) {
        Collections.addAll(this.b, arr_adapterHelper$UpdateOp);
        return this;
    }

    private void d(UpdateOp adapterHelper$UpdateOp0) {
        this.w(adapterHelper$UpdateOp0);
    }

    private void e(UpdateOp adapterHelper$UpdateOp0) {
        this.w(adapterHelper$UpdateOp0);
    }

    public int f(int v) {
        int v1 = this.b.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.b.get(v2);
            switch(adapterHelper$UpdateOp0.a) {
                case 1: {
                    if(adapterHelper$UpdateOp0.b <= v) {
                        v += adapterHelper$UpdateOp0.d;
                    }
                    break;
                }
                case 2: {
                    int v3 = adapterHelper$UpdateOp0.b;
                    if(v3 <= v) {
                        int v4 = adapterHelper$UpdateOp0.d;
                        if(v3 + v4 > v) {
                            return -1;
                        }
                        v -= v4;
                    }
                    break;
                }
                case 8: {
                    int v5 = adapterHelper$UpdateOp0.b;
                    if(v5 == v) {
                        v = adapterHelper$UpdateOp0.d;
                    }
                    else {
                        if(v5 < v) {
                            --v;
                        }
                        if(adapterHelper$UpdateOp0.d <= v) {
                            ++v;
                        }
                    }
                }
            }
        }
        return v;
    }

    // This method was un-flattened
    private void g(UpdateOp adapterHelper$UpdateOp0) {
        int v5;
        int v = adapterHelper$UpdateOp0.b;
        int v1 = adapterHelper$UpdateOp0.d + v;
        int v2 = -1;
        int v3 = v;
        int v4 = 0;
        while(v3 < v1) {
            if(this.d.d(v3) != null || this.i(v3)) {
            label_13:
                if(v2 == 0) {
                    this.l(this.a(2, v, v4, null));
                    v5 = 1;
                    v3 -= v4;
                    v1 -= v4;
                    v4 = 1;
                    goto label_22;
                }
                else {
                    v5 = 1;
                }
            }
            else {
                if(v2 == 1) {
                    this.w(this.a(2, v, v4, null));
                    v5 = 0;
                    v3 -= v4;
                    v1 -= v4;
                    v4 = 1;
                    goto label_22;
                }
                else {
                    v5 = 0;
                    goto label_21;
                }
                goto label_13;
            }
        label_21:
            ++v4;
        label_22:
            ++v3;
            v2 = v5;
        }
        if(v4 != adapterHelper$UpdateOp0.d) {
            this.b(adapterHelper$UpdateOp0);
            adapterHelper$UpdateOp0 = this.a(2, v, v4, null);
        }
        if(v2 == 0) {
            this.l(adapterHelper$UpdateOp0);
            return;
        }
        this.w(adapterHelper$UpdateOp0);
    }

    private void h(UpdateOp adapterHelper$UpdateOp0) {
        int v = adapterHelper$UpdateOp0.b;
        int v1 = adapterHelper$UpdateOp0.d + v;
        int v2 = v;
        int v3 = -1;
        int v4 = 0;
        while(v < v1) {
            if(this.d.d(v) != null || this.i(v)) {
                if(v3 == 0) {
                    this.l(this.a(4, v2, v4, adapterHelper$UpdateOp0.c));
                    v2 = v;
                    v4 = 0;
                }
                v3 = 1;
            }
            else {
                if(v3 == 1) {
                    this.w(this.a(4, v2, v4, adapterHelper$UpdateOp0.c));
                    v2 = v;
                    v4 = 0;
                }
                v3 = 0;
            }
            ++v4;
            ++v;
        }
        if(v4 != adapterHelper$UpdateOp0.d) {
            Object object0 = adapterHelper$UpdateOp0.c;
            this.b(adapterHelper$UpdateOp0);
            adapterHelper$UpdateOp0 = this.a(4, v2, v4, object0);
        }
        if(v3 == 0) {
            this.l(adapterHelper$UpdateOp0);
            return;
        }
        this.w(adapterHelper$UpdateOp0);
    }

    private boolean i(int v) {
        int v1 = this.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.c.get(v2);
            int v3 = adapterHelper$UpdateOp0.a;
            if(v3 == 8) {
                if(this.o(adapterHelper$UpdateOp0.d, v2 + 1) == v) {
                    return true;
                }
            }
            else if(v3 == 1) {
                int v4 = adapterHelper$UpdateOp0.b;
                int v5 = adapterHelper$UpdateOp0.d + v4;
                while(v4 < v5) {
                    if(this.o(v4, v2 + 1) == v) {
                        return true;
                    }
                    ++v4;
                }
            }
        }
        return false;
    }

    void j() {
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.c.get(v1);
            this.d.c(adapterHelper$UpdateOp0);
        }
        this.y(this.c);
        this.h = 0;
    }

    void k() {
        this.j();
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.b.get(v1);
            switch(adapterHelper$UpdateOp0.a) {
                case 1: {
                    this.d.c(adapterHelper$UpdateOp0);
                    this.d.e(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                    break;
                }
                case 2: {
                    this.d.c(adapterHelper$UpdateOp0);
                    this.d.f(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                    break;
                }
                case 4: {
                    this.d.c(adapterHelper$UpdateOp0);
                    this.d.h(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d, adapterHelper$UpdateOp0.c);
                    break;
                }
                case 8: {
                    this.d.c(adapterHelper$UpdateOp0);
                    this.d.a(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                }
            }
            Runnable runnable0 = this.e;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
        this.y(this.b);
        this.h = 0;
    }

    private void l(UpdateOp adapterHelper$UpdateOp0) {
        int v3;
        int v = adapterHelper$UpdateOp0.a;
        if(v == 1 || v == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v1 = this.A(adapterHelper$UpdateOp0.b, v);
        int v2 = adapterHelper$UpdateOp0.b;
        switch(adapterHelper$UpdateOp0.a) {
            case 2: {
                v3 = 0;
                break;
            }
            case 4: {
                v3 = 1;
                break;
            }
            default: {
                throw new IllegalArgumentException("op should be remove or update." + adapterHelper$UpdateOp0);
            }
        }
        int v5 = 1;
        for(int v4 = 1; v4 < adapterHelper$UpdateOp0.d; ++v4) {
            int v6 = this.A(adapterHelper$UpdateOp0.b + v3 * v4, adapterHelper$UpdateOp0.a);
            int v7 = adapterHelper$UpdateOp0.a;
            switch(v7) {
                case 2: {
                    if(v6 == v1) {
                        ++v5;
                        continue;
                    }
                    break;
                }
                case 4: {
                    if(v6 == v1 + 1) {
                        ++v5;
                        continue;
                    }
                }
            }
            UpdateOp adapterHelper$UpdateOp1 = this.a(v7, v1, v5, adapterHelper$UpdateOp0.c);
            this.m(adapterHelper$UpdateOp1, v2);
            this.b(adapterHelper$UpdateOp1);
            if(adapterHelper$UpdateOp0.a == 4) {
                v2 += v5;
            }
            v1 = v6;
            v5 = 1;
        }
        Object object0 = adapterHelper$UpdateOp0.c;
        this.b(adapterHelper$UpdateOp0);
        if(v5 > 0) {
            UpdateOp adapterHelper$UpdateOp2 = this.a(adapterHelper$UpdateOp0.a, v1, v5, object0);
            this.m(adapterHelper$UpdateOp2, v2);
            this.b(adapterHelper$UpdateOp2);
        }
    }

    void m(UpdateOp adapterHelper$UpdateOp0, int v) {
        this.d.b(adapterHelper$UpdateOp0);
        switch(adapterHelper$UpdateOp0.a) {
            case 2: {
                this.d.f(v, adapterHelper$UpdateOp0.d);
                return;
            }
            case 4: {
                this.d.h(v, adapterHelper$UpdateOp0.d, adapterHelper$UpdateOp0.c);
                return;
            }
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
        }
    }

    int n(int v) {
        return this.o(v, 0);
    }

    int o(int v, int v1) {
        int v2 = this.c.size();
        while(v1 < v2) {
            UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.c.get(v1);
            int v3 = adapterHelper$UpdateOp0.a;
            if(v3 == 8) {
                int v4 = adapterHelper$UpdateOp0.b;
                if(v4 == v) {
                    v = adapterHelper$UpdateOp0.d;
                }
                else {
                    if(v4 < v) {
                        --v;
                    }
                    if(adapterHelper$UpdateOp0.d <= v) {
                        ++v;
                    }
                }
            }
            else {
                int v5 = adapterHelper$UpdateOp0.b;
                if(v5 <= v) {
                    switch(v3) {
                        case 1: {
                            v += adapterHelper$UpdateOp0.d;
                            break;
                        }
                        case 2: {
                            int v6 = adapterHelper$UpdateOp0.d;
                            if(v < v5 + v6) {
                                return -1;
                            }
                            v -= v6;
                        }
                    }
                }
            }
            ++v1;
        }
        return v;
    }

    boolean p(int v) {
        return (v & this.h) != 0;
    }

    boolean q() {
        return this.b.size() > 0;
    }

    // 去混淆评级： 低(20)
    boolean r() {
        return !this.c.isEmpty() && !this.b.isEmpty();
    }

    boolean s(int v, int v1, Object object0) {
        if(v1 < 1) {
            return false;
        }
        UpdateOp adapterHelper$UpdateOp0 = this.a(4, v, v1, object0);
        this.b.add(adapterHelper$UpdateOp0);
        this.h |= 4;
        return this.b.size() == 1;
    }

    boolean t(int v, int v1) {
        if(v1 < 1) {
            return false;
        }
        UpdateOp adapterHelper$UpdateOp0 = this.a(1, v, v1, null);
        this.b.add(adapterHelper$UpdateOp0);
        this.h |= 1;
        return this.b.size() == 1;
    }

    boolean u(int v, int v1, int v2) {
        if(v == v1) {
            return false;
        }
        if(v2 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        UpdateOp adapterHelper$UpdateOp0 = this.a(8, v, v1, null);
        this.b.add(adapterHelper$UpdateOp0);
        this.h |= 8;
        return this.b.size() == 1;
    }

    boolean v(int v, int v1) {
        if(v1 < 1) {
            return false;
        }
        UpdateOp adapterHelper$UpdateOp0 = this.a(2, v, v1, null);
        this.b.add(adapterHelper$UpdateOp0);
        this.h |= 2;
        return this.b.size() == 1;
    }

    private void w(UpdateOp adapterHelper$UpdateOp0) {
        this.c.add(adapterHelper$UpdateOp0);
        switch(adapterHelper$UpdateOp0.a) {
            case 1: {
                this.d.e(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                return;
            }
            case 2: {
                this.d.g(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                return;
            }
            case 4: {
                this.d.h(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d, adapterHelper$UpdateOp0.c);
                return;
            }
            case 8: {
                this.d.a(adapterHelper$UpdateOp0.b, adapterHelper$UpdateOp0.d);
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown update op type for " + adapterHelper$UpdateOp0);
            }
        }
    }

    void x() {
        this.g.b(this.b);
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            UpdateOp adapterHelper$UpdateOp0 = (UpdateOp)this.b.get(v1);
            switch(adapterHelper$UpdateOp0.a) {
                case 1: {
                    this.d(adapterHelper$UpdateOp0);
                    break;
                }
                case 2: {
                    this.g(adapterHelper$UpdateOp0);
                    break;
                }
                case 4: {
                    this.h(adapterHelper$UpdateOp0);
                    break;
                }
                case 8: {
                    this.e(adapterHelper$UpdateOp0);
                }
            }
            Runnable runnable0 = this.e;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
        this.b.clear();
    }

    void y(List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.b(((UpdateOp)list0.get(v1)));
        }
        list0.clear();
    }

    void z() {
        this.y(this.b);
        this.y(this.c);
        this.h = 0;
    }
}

