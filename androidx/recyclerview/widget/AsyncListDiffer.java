package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class AsyncListDiffer {
    public interface ListListener {
        void a(@NonNull List arg1, @NonNull List arg2);
    }

    static class MainThreadExecutor implements Executor {
        final Handler a;

        MainThreadExecutor() {
            this.a = new Handler(Looper.getMainLooper());
        }

        @Override
        public void execute(@NonNull Runnable runnable0) {
            this.a.post(runnable0);
        }
    }

    private final ListUpdateCallback a;
    final AsyncDifferConfig b;
    Executor c;
    private final List d;
    @Nullable
    private List e;
    @NonNull
    private List f;
    int g;
    private static final Executor h;

    static {
        AsyncListDiffer.h = new MainThreadExecutor();
    }

    public AsyncListDiffer(@NonNull ListUpdateCallback listUpdateCallback0, @NonNull AsyncDifferConfig asyncDifferConfig0) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.emptyList();
        this.a = listUpdateCallback0;
        this.b = asyncDifferConfig0;
        if(asyncDifferConfig0.c() != null) {
            this.c = asyncDifferConfig0.c();
            return;
        }
        this.c = AsyncListDiffer.h;
    }

    public AsyncListDiffer(@NonNull Adapter recyclerView$Adapter0, @NonNull ItemCallback diffUtil$ItemCallback0) {
        this(new AdapterListUpdateCallback(recyclerView$Adapter0), new Builder(diffUtil$ItemCallback0).a());
    }

    public void a(@NonNull ListListener asyncListDiffer$ListListener0) {
        this.d.add(asyncListDiffer$ListListener0);
    }

    @NonNull
    public List b() {
        return this.f;
    }

    void c(@NonNull List list0, @NonNull DiffResult diffUtil$DiffResult0, @Nullable Runnable runnable0) {
        List list1 = this.f;
        this.e = list0;
        this.f = DesugarCollections.unmodifiableList(list0);
        diffUtil$DiffResult0.d(this.a);
        this.d(list1, runnable0);
    }

    private void d(@NonNull List list0, @Nullable Runnable runnable0) {
        for(Object object0: this.d) {
            ((ListListener)object0).a(list0, this.f);
        }
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    public void e(@NonNull ListListener asyncListDiffer$ListListener0) {
        this.d.remove(asyncListDiffer$ListListener0);
    }

    public void f(@Nullable List list0) {
        this.g(list0, null);
    }

    public void g(@Nullable List list0, @Nullable Runnable runnable0) {
        int v = this.g + 1;
        this.g = v;
        List list1 = this.e;
        if(list0 == list1) {
            if(runnable0 != null) {
                runnable0.run();
            }
            return;
        }
        List list2 = this.f;
        if(list0 == null) {
            this.e = null;
            this.f = Collections.emptyList();
            this.a.i(0, list1.size());
            this.d(list2, runnable0);
            return;
        }
        if(list1 == null) {
            this.e = list0;
            this.f = DesugarCollections.unmodifiableList(list0);
            this.a.g(0, list0.size());
            this.d(list2, runnable0);
            return;
        }
        this.b.a().execute(new Runnable() {
            final AsyncListDiffer e;

            @Override
            public void run() {
                DiffResult diffUtil$DiffResult0 = DiffUtil.b(new Callback() {
                    final androidx.recyclerview.widget.AsyncListDiffer.1 a;

                    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
                    public boolean a(int v, int v1) {
                        Object object0 = androidx.recyclerview.widget.AsyncListDiffer.1.this.a.get(v);
                        Object object1 = androidx.recyclerview.widget.AsyncListDiffer.1.this.b.get(v1);
                        if(object0 != null && object1 != null) {
                            return AsyncListDiffer.this.b.b().a(object0, object1);
                        }
                        if(object0 != null || object1 != null) {
                            throw new AssertionError();
                        }
                        return true;
                    }

                    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
                    public boolean b(int v, int v1) {
                        Object object0 = androidx.recyclerview.widget.AsyncListDiffer.1.this.a.get(v);
                        Object object1 = androidx.recyclerview.widget.AsyncListDiffer.1.this.b.get(v1);
                        return object0 == null || object1 == null ? object0 == null && object1 == null : AsyncListDiffer.this.b.b().b(object0, object1);
                    }

                    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
                    @Nullable
                    public Object c(int v, int v1) {
                        Object object0 = androidx.recyclerview.widget.AsyncListDiffer.1.this.a.get(v);
                        Object object1 = androidx.recyclerview.widget.AsyncListDiffer.1.this.b.get(v1);
                        if(object0 == null || object1 == null) {
                            throw new AssertionError();
                        }
                        return AsyncListDiffer.this.b.b().c(object0, object1);
                    }

                    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
                    public int d() {
                        return androidx.recyclerview.widget.AsyncListDiffer.1.this.b.size();
                    }

                    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
                    public int e() {
                        return androidx.recyclerview.widget.AsyncListDiffer.1.this.a.size();
                    }
                });
                AsyncListDiffer.this.c.execute(new Runnable() {
                    final androidx.recyclerview.widget.AsyncListDiffer.1 b;

                    @Override
                    public void run() {
                        androidx.recyclerview.widget.AsyncListDiffer.1 asyncListDiffer$10 = androidx.recyclerview.widget.AsyncListDiffer.1.this;
                        AsyncListDiffer asyncListDiffer0 = AsyncListDiffer.this;
                        if(asyncListDiffer0.g == asyncListDiffer$10.c) {
                            asyncListDiffer0.c(asyncListDiffer$10.b, diffUtil$DiffResult0, asyncListDiffer$10.d);
                        }
                    }
                });
            }
        });
    }
}

