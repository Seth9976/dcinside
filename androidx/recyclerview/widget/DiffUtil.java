package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DiffUtil {
    public static abstract class Callback {
        public abstract boolean a(int arg1, int arg2);

        public abstract boolean b(int arg1, int arg2);

        @Nullable
        public Object c(int v, int v1) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    static class CenteredArray {
        private final int[] a;
        private final int b;

        CenteredArray(int v) {
            int[] arr_v = new int[v];
            this.a = arr_v;
            this.b = arr_v.length / 2;
        }

        int[] a() {
            return this.a;
        }

        public void b(int v) {
            Arrays.fill(this.a, v);
        }

        int c(int v) {
            return this.a[v + this.b];
        }

        void d(int v, int v1) {
            this.a[v + this.b] = v1;
        }
    }

    static class Diagonal {
        public final int a;
        public final int b;
        public final int c;

        Diagonal(int v, int v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        int a() {
            return this.a + this.c;
        }

        int b() {
            return this.b + this.c;
        }
    }

    public static class DiffResult {
        private final List a;
        private final int[] b;
        private final int[] c;
        private final Callback d;
        private final int e;
        private final int f;
        private final boolean g;
        public static final int h = -1;
        private static final int i = 1;
        private static final int j = 2;
        private static final int k = 4;
        private static final int l = 8;
        private static final int m = 12;
        private static final int n = 4;
        private static final int o = 15;

        DiffResult(Callback diffUtil$Callback0, List list0, int[] arr_v, int[] arr_v1, boolean z) {
            this.a = list0;
            this.b = arr_v;
            this.c = arr_v1;
            Arrays.fill(arr_v, 0);
            Arrays.fill(arr_v1, 0);
            this.d = diffUtil$Callback0;
            this.e = diffUtil$Callback0.e();
            this.f = diffUtil$Callback0.d();
            this.g = z;
            this.a();
            this.g();
        }

        private void a() {
            Diagonal diffUtil$Diagonal0 = this.a.isEmpty() ? null : ((Diagonal)this.a.get(0));
            if(diffUtil$Diagonal0 == null || diffUtil$Diagonal0.a != 0 || diffUtil$Diagonal0.b != 0) {
                Diagonal diffUtil$Diagonal1 = new Diagonal(0, 0, 0);
                this.a.add(0, diffUtil$Diagonal1);
            }
            Diagonal diffUtil$Diagonal2 = new Diagonal(this.e, this.f, 0);
            this.a.add(diffUtil$Diagonal2);
        }

        public int b(@IntRange(from = 0L) int v) {
            if(v < 0 || v >= this.f) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + v + ", new list size = " + this.f);
            }
            int v1 = this.c[v];
            return (v1 & 15) == 0 ? -1 : v1 >> 4;
        }

        public int c(@IntRange(from = 0L) int v) {
            if(v < 0 || v >= this.e) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + v + ", old list size = " + this.e);
            }
            int v1 = this.b[v];
            return (v1 & 15) == 0 ? -1 : v1 >> 4;
        }

        public void d(@NonNull ListUpdateCallback listUpdateCallback0) {
            BatchingListUpdateCallback batchingListUpdateCallback0 = listUpdateCallback0 instanceof BatchingListUpdateCallback ? ((BatchingListUpdateCallback)listUpdateCallback0) : new BatchingListUpdateCallback(listUpdateCallback0);
            int v = this.e;
            ArrayDeque arrayDeque0 = new ArrayDeque();
            int v1 = this.e;
            int v2 = this.f;
            int v3 = this.a.size() - 1;
            while(v3 >= 0) {
                Diagonal diffUtil$Diagonal0 = (Diagonal)this.a.get(v3);
                int v4 = diffUtil$Diagonal0.a();
                int v5 = diffUtil$Diagonal0.b();
                while(v1 > v4) {
                    --v1;
                    int v7 = this.b[v1];
                    if((v7 & 12) == 0) {
                        batchingListUpdateCallback0.i(v1, 1);
                        --v;
                    }
                    else {
                        PostponedUpdate diffUtil$PostponedUpdate0 = DiffResult.i(arrayDeque0, v7 >> 4, false);
                        if(diffUtil$PostponedUpdate0 == null) {
                            arrayDeque0.add(new PostponedUpdate(v1, v - v1 - 1, true));
                        }
                        else {
                            int v8 = v - diffUtil$PostponedUpdate0.b - 1;
                            batchingListUpdateCallback0.j(v1, v8);
                            if((v7 & 4) == 0) {
                                continue;
                            }
                            batchingListUpdateCallback0.b(v8, 1, this.d.c(v1, v7 >> 4));
                        }
                    }
                }
                while(v2 > v5) {
                    --v2;
                    int v9 = this.c[v2];
                    if((v9 & 12) == 0) {
                        batchingListUpdateCallback0.g(v1, 1);
                        ++v;
                    }
                    else {
                        PostponedUpdate diffUtil$PostponedUpdate1 = DiffResult.i(arrayDeque0, v9 >> 4, true);
                        if(diffUtil$PostponedUpdate1 == null) {
                            arrayDeque0.add(new PostponedUpdate(v2, v - v1, false));
                        }
                        else {
                            batchingListUpdateCallback0.j(v - diffUtil$PostponedUpdate1.b - 1, v1);
                            if((v9 & 4) == 0) {
                                continue;
                            }
                            batchingListUpdateCallback0.b(v1, 1, this.d.c(v9 >> 4, v2));
                        }
                    }
                }
                int v10 = diffUtil$Diagonal0.a;
                int v11 = diffUtil$Diagonal0.b;
                for(int v6 = 0; v6 < diffUtil$Diagonal0.c; ++v6) {
                    if((this.b[v10] & 15) == 2) {
                        batchingListUpdateCallback0.b(v10, 1, this.d.c(v10, v11));
                    }
                    ++v10;
                    ++v11;
                }
                v1 = diffUtil$Diagonal0.a;
                v2 = diffUtil$Diagonal0.b;
                --v3;
            }
            batchingListUpdateCallback0.a();
        }

        public void e(@NonNull Adapter recyclerView$Adapter0) {
            this.d(new AdapterListUpdateCallback(recyclerView$Adapter0));
        }

        private void f(int v) {
            int v1 = this.a.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Diagonal diffUtil$Diagonal0 = (Diagonal)this.a.get(v2);
                while(v3 < diffUtil$Diagonal0.b) {
                    if(this.c[v3] == 0 && this.d.b(v, v3)) {
                        int v4 = this.d.a(v, v3) ? 8 : 4;
                        this.b[v] = v3 << 4 | v4;
                        this.c[v3] = v << 4 | v4;
                        return;
                    }
                    ++v3;
                }
                v3 = diffUtil$Diagonal0.b();
            }
        }

        private void g() {
            for(Object object0: this.a) {
                Diagonal diffUtil$Diagonal0 = (Diagonal)object0;
                for(int v = 0; v < diffUtil$Diagonal0.c; ++v) {
                    int v1 = diffUtil$Diagonal0.a + v;
                    int v2 = diffUtil$Diagonal0.b + v;
                    int v3 = this.d.a(v1, v2) ? 1 : 2;
                    this.b[v1] = v2 << 4 | v3;
                    this.c[v2] = v1 << 4 | v3;
                }
            }
            if(this.g) {
                this.h();
            }
        }

        private void h() {
            int v = 0;
            for(Object object0: this.a) {
                while(v < ((Diagonal)object0).a) {
                    if(this.b[v] == 0) {
                        this.f(v);
                    }
                    ++v;
                }
                v = ((Diagonal)object0).a();
            }
        }

        @Nullable
        private static PostponedUpdate i(Collection collection0, int v, boolean z) {
            PostponedUpdate diffUtil$PostponedUpdate0;
            Iterator iterator0 = collection0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                diffUtil$PostponedUpdate0 = (PostponedUpdate)object0;
                if(diffUtil$PostponedUpdate0.a != v || diffUtil$PostponedUpdate0.c != z) {
                    continue;
                }
                iterator0.remove();
                goto label_8;
            }
            diffUtil$PostponedUpdate0 = null;
        label_8:
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                PostponedUpdate diffUtil$PostponedUpdate1 = (PostponedUpdate)object1;
                if(z) {
                    --diffUtil$PostponedUpdate1.b;
                }
                else {
                    ++diffUtil$PostponedUpdate1.b;
                }
            }
            return diffUtil$PostponedUpdate0;
        }
    }

    public static abstract class ItemCallback {
        public abstract boolean a(@NonNull Object arg1, @NonNull Object arg2);

        public abstract boolean b(@NonNull Object arg1, @NonNull Object arg2);

        @Nullable
        public Object c(@NonNull Object object0, @NonNull Object object1) {
            return null;
        }
    }

    static class PostponedUpdate {
        int a;
        int b;
        boolean c;

        PostponedUpdate(int v, int v1, boolean z) {
            this.a = v;
            this.b = v1;
            this.c = z;
        }
    }

    static class Range {
        int a;
        int b;
        int c;
        int d;

        public Range() {
        }

        public Range(int v, int v1, int v2, int v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }

        int a() {
            return this.d - this.c;
        }

        int b() {
            return this.b - this.a;
        }
    }

    static class Snake {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }

        boolean b() {
            return this.d - this.b != this.c - this.a;
        }

        boolean c() {
            return this.d - this.b > this.c - this.a;
        }

        @NonNull
        Diagonal d() {
            if(this.b()) {
                if(this.e) {
                    return new Diagonal(this.a, this.b, this.a());
                }
                return this.c() ? new Diagonal(this.a, this.b + 1, this.a()) : new Diagonal(this.a + 1, this.b, this.a());
            }
            return new Diagonal(this.a, this.b, this.c - this.a);
        }
    }

    private static final Comparator a;

    static {
        DiffUtil.a = new Comparator() {
            public int b(Diagonal diffUtil$Diagonal0, Diagonal diffUtil$Diagonal1) {
                return diffUtil$Diagonal0.a - diffUtil$Diagonal1.a;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((Diagonal)object0), ((Diagonal)object1));
            }
        };
    }

    @Nullable
    private static Snake a(Range diffUtil$Range0, Callback diffUtil$Callback0, CenteredArray diffUtil$CenteredArray0, CenteredArray diffUtil$CenteredArray1, int v) {
        int v5;
        int v4;
        boolean z = (diffUtil$Range0.b() - diffUtil$Range0.a()) % 2 == 0;
        int v1 = diffUtil$Range0.b();
        int v2 = diffUtil$Range0.a();
        for(int v3 = -v; v3 <= v; v3 += 2) {
            if(v3 == -v || v3 != v && diffUtil$CenteredArray1.c(v3 + 1) < diffUtil$CenteredArray1.c(v3 - 1)) {
                v4 = diffUtil$CenteredArray1.c(v3 + 1);
                v5 = v4;
            }
            else {
                v4 = diffUtil$CenteredArray1.c(v3 - 1);
                v5 = v4 - 1;
            }
            int v6 = diffUtil$Range0.d - (diffUtil$Range0.b - v5 - v3);
            int v7 = v == 0 || v5 != v4 ? v6 : v6 + 1;
            while(v5 > diffUtil$Range0.a && v6 > diffUtil$Range0.c && diffUtil$Callback0.b(v5 - 1, v6 - 1)) {
                --v5;
                --v6;
            }
            diffUtil$CenteredArray1.d(v3, v5);
            if(z) {
                int v8 = v1 - v2 - v3;
                if(v8 >= -v && v8 <= v && diffUtil$CenteredArray0.c(v8) >= v5) {
                    Snake diffUtil$Snake0 = new Snake();
                    diffUtil$Snake0.a = v5;
                    diffUtil$Snake0.b = v6;
                    diffUtil$Snake0.c = v4;
                    diffUtil$Snake0.d = v7;
                    diffUtil$Snake0.e = true;
                    return diffUtil$Snake0;
                }
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult b(@NonNull Callback diffUtil$Callback0) {
        return DiffUtil.c(diffUtil$Callback0, true);
    }

    @NonNull
    public static DiffResult c(@NonNull Callback diffUtil$Callback0, boolean z) {
        int v = diffUtil$Callback0.e();
        int v1 = diffUtil$Callback0.d();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new Range(0, v, 0, v1));
        int v2 = (v + v1 + 1) / 2 * 2 + 1;
        CenteredArray diffUtil$CenteredArray0 = new CenteredArray(v2);
        CenteredArray diffUtil$CenteredArray1 = new CenteredArray(v2);
        ArrayList arrayList2 = new ArrayList();
        while(!arrayList1.isEmpty()) {
            Range diffUtil$Range0 = (Range)arrayList1.remove(arrayList1.size() - 1);
            Snake diffUtil$Snake0 = DiffUtil.e(diffUtil$Range0, diffUtil$Callback0, diffUtil$CenteredArray0, diffUtil$CenteredArray1);
            if(diffUtil$Snake0 == null) {
                arrayList2.add(diffUtil$Range0);
            }
            else {
                if(diffUtil$Snake0.a() > 0) {
                    arrayList0.add(diffUtil$Snake0.d());
                }
                Range diffUtil$Range1 = arrayList2.isEmpty() ? new Range() : ((Range)arrayList2.remove(arrayList2.size() - 1));
                diffUtil$Range1.a = diffUtil$Range0.a;
                diffUtil$Range1.c = diffUtil$Range0.c;
                diffUtil$Range1.b = diffUtil$Snake0.a;
                diffUtil$Range1.d = diffUtil$Snake0.b;
                arrayList1.add(diffUtil$Range1);
                diffUtil$Range0.b = diffUtil$Range0.b;
                diffUtil$Range0.d = diffUtil$Range0.d;
                diffUtil$Range0.a = diffUtil$Snake0.c;
                diffUtil$Range0.c = diffUtil$Snake0.d;
                arrayList1.add(diffUtil$Range0);
            }
        }
        Collections.sort(arrayList0, DiffUtil.a);
        return new DiffResult(diffUtil$Callback0, arrayList0, diffUtil$CenteredArray0.a(), diffUtil$CenteredArray1.a(), z);
    }

    @Nullable
    private static Snake d(Range diffUtil$Range0, Callback diffUtil$Callback0, CenteredArray diffUtil$CenteredArray0, CenteredArray diffUtil$CenteredArray1, int v) {
        int v5;
        int v4;
        boolean z = Math.abs(diffUtil$Range0.b() - diffUtil$Range0.a()) % 2 == 1;
        int v1 = diffUtil$Range0.b();
        int v2 = diffUtil$Range0.a();
        for(int v3 = -v; v3 <= v; v3 += 2) {
            if(v3 == -v || v3 != v && diffUtil$CenteredArray0.c(v3 + 1) > diffUtil$CenteredArray0.c(v3 - 1)) {
                v4 = diffUtil$CenteredArray0.c(v3 + 1);
                v5 = v4;
            }
            else {
                v4 = diffUtil$CenteredArray0.c(v3 - 1);
                v5 = v4 + 1;
            }
            int v6 = diffUtil$Range0.c + (v5 - diffUtil$Range0.a) - v3;
            int v7 = v == 0 || v5 != v4 ? v6 : v6 - 1;
            while(v5 < diffUtil$Range0.b && v6 < diffUtil$Range0.d && diffUtil$Callback0.b(v5, v6)) {
                ++v5;
                ++v6;
            }
            diffUtil$CenteredArray0.d(v3, v5);
            if(z) {
                int v8 = v1 - v2 - v3;
                if(v8 >= 1 - v && v8 <= v - 1 && diffUtil$CenteredArray1.c(v8) <= v5) {
                    Snake diffUtil$Snake0 = new Snake();
                    diffUtil$Snake0.a = v4;
                    diffUtil$Snake0.b = v7;
                    diffUtil$Snake0.c = v5;
                    diffUtil$Snake0.d = v6;
                    diffUtil$Snake0.e = false;
                    return diffUtil$Snake0;
                }
            }
        }
        return null;
    }

    @Nullable
    private static Snake e(Range diffUtil$Range0, Callback diffUtil$Callback0, CenteredArray diffUtil$CenteredArray0, CenteredArray diffUtil$CenteredArray1) {
        if(diffUtil$Range0.b() >= 1 && diffUtil$Range0.a() >= 1) {
            int v = diffUtil$Range0.b();
            int v1 = diffUtil$Range0.a();
            diffUtil$CenteredArray0.d(1, diffUtil$Range0.a);
            diffUtil$CenteredArray1.d(1, diffUtil$Range0.b);
            for(int v2 = 0; v2 < (v + v1 + 1) / 2; ++v2) {
                Snake diffUtil$Snake0 = DiffUtil.d(diffUtil$Range0, diffUtil$Callback0, diffUtil$CenteredArray0, diffUtil$CenteredArray1, v2);
                if(diffUtil$Snake0 != null) {
                    return diffUtil$Snake0;
                }
                Snake diffUtil$Snake1 = DiffUtil.a(diffUtil$Range0, diffUtil$Callback0, diffUtil$CenteredArray0, diffUtil$CenteredArray1, v2);
                if(diffUtil$Snake1 != null) {
                    return diffUtil$Snake1;
                }
            }
        }
        return null;
    }
}

