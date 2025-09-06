package com.dcinside.app.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout;

public final class ql {
    public static class a implements View.OnAttachStateChangeListener {
        public interface com.dcinside.app.util.ql.a.a {
            void a(View arg1, boolean arg2);
        }

        private int a;
        private com.dcinside.app.util.ql.a.a b;
        private static final a c = null;
        private static final int d = 2;
        private static final int e = 4;

        static {
            a.c = new a(0, null);
        }

        private a(int v, com.dcinside.app.util.ql.a.a ql$a$a0) {
            this.a = v;
            this.b = ql$a$a0;
        }

        public static void a(View view0, com.dcinside.app.util.ql.a.a ql$a$a0) {
            a.e(view0, 6, ql$a$a0);
        }

        public static void b(View view0, com.dcinside.app.util.ql.a.a ql$a$a0) {
            a.e(view0, 2, ql$a$a0);
        }

        public static void c(View view0) {
            view0.removeOnAttachStateChangeListener(a.c);
        }

        public static void d(View view0, com.dcinside.app.util.ql.a.a ql$a$a0) {
            a.e(view0, 4, ql$a$a0);
        }

        public static void e(View view0, int v, com.dcinside.app.util.ql.a.a ql$a$a0) {
            a.c(view0);
            view0.addOnAttachStateChangeListener(new a(v, ql$a$a0));
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof a;
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
            if((this.a & 2) > 0) {
                this.b.a(view0, true);
            }
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            if((this.a & 4) > 0) {
                this.b.a(view0, false);
            }
        }
    }

    public static final class b {
        public interface com.dcinside.app.util.ql.b.a {
            void a(int arg1, int arg2, int arg3, int arg4);
        }

        static class com.dcinside.app.util.ql.b.b extends AdapterDataObserver {
            @interface com.dcinside.app.util.ql.b.b.a {
            }

            private int a;
            private com.dcinside.app.util.ql.b.a b;
            private static final com.dcinside.app.util.ql.b.b c = null;
            private static final int d = 2;
            private static final int e = 4;
            private static final int f = 8;
            private static final int g = 16;
            private static final int h = 0x20;

            static {
                com.dcinside.app.util.ql.b.b.c = new com.dcinside.app.util.ql.b.b(0, null);
            }

            private com.dcinside.app.util.ql.b.b(int v, com.dcinside.app.util.ql.b.a ql$b$a0) {
                this.a = v;
                this.b = ql$b$a0;
            }

            com.dcinside.app.util.ql.b.b(int v, com.dcinside.app.util.ql.b.a ql$b$a0, rl rl0) {
                this(v, ql$b$a0);
            }

            @Override
            public boolean equals(Object object0) {
                return object0 instanceof com.dcinside.app.util.ql.b.b;
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void f() {
                int v = this.a;
                if((v & 2) > 0) {
                    this.b.a(v, 0, 0, 0);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void g(int v, int v1) {
                int v2 = this.a;
                if((v2 & 4) > 0) {
                    this.b.a(v2, v, v1, 0);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void i(int v, int v1) {
                int v2 = this.a;
                if((v2 & 8) > 0) {
                    this.b.a(v2, v, v1, 0);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void k(int v, int v1, int v2) {
                int v3 = this.a;
                if((v3 & 0x20) > 0) {
                    this.b.a(v3, v, v1, v2);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void l(int v, int v1) {
                int v2 = this.a;
                if((v2 & 16) > 0) {
                    this.b.a(v2, v, v1, 0);
                }
            }
        }

        static final class c extends SimpleOnItemTouchListener {
            private f a;
            private GestureDetector b;

            private c(Context context0, f ql$b$f0) {
                class com.dcinside.app.util.ql.b.c.a extends GestureDetector.SimpleOnGestureListener {
                    @Override  // android.view.GestureDetector$SimpleOnGestureListener
                    public boolean onSingleTapUp(MotionEvent motionEvent0) {
                        return true;
                    }
                }

                this.a = ql$b$f0;
                this.b = new GestureDetector(context0, new com.dcinside.app.util.ql.b.c.a(this));
            }

            c(Context context0, f ql$b$f0, rl rl0) {
                this(context0, ql$b$f0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$SimpleOnItemTouchListener
            public boolean i(@NonNull RecyclerView recyclerView0, MotionEvent motionEvent0) {
                if(this.a != null && this.b.onTouchEvent(motionEvent0)) {
                    View view0 = recyclerView0.findChildViewUnder(motionEvent0.getX(), motionEvent0.getY());
                    if(view0 != null) {
                        int v = recyclerView0.getChildAdapterPosition(view0);
                        return v >= 0 && recyclerView0.getScrollState() != 1 && this.a.a(view0, v);
                    }
                }
                return false;
            }
        }

        static class d {
            private static void b(RecyclerView recyclerView0) {
                Context context0 = recyclerView0.getContext();
                LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
                    if(((LinearLayoutManager)recyclerView$LayoutManager0).b3() == 0) {
                        recyclerView0.addItemDecoration(new n0.b(context0));
                        return;
                    }
                    recyclerView0.addItemDecoration(new n0.d(context0));
                }
            }
        }

        static final class e extends SimpleOnItemTouchListener {
            private f a;
            private GestureDetector b;

            private e(Context context0, f ql$b$f0) {
                class com.dcinside.app.util.ql.b.e.a extends GestureDetector.SimpleOnGestureListener {
                    @Override  // android.view.GestureDetector$SimpleOnGestureListener
                    public boolean onSingleTapUp(MotionEvent motionEvent0) {
                        return true;
                    }
                }

                this.a = ql$b$f0;
                this.b = new GestureDetector(context0, new com.dcinside.app.util.ql.b.e.a(this));
            }

            e(Context context0, f ql$b$f0, rl rl0) {
                this(context0, ql$b$f0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$SimpleOnItemTouchListener
            public boolean i(@NonNull RecyclerView recyclerView0, MotionEvent motionEvent0) {
                if(this.a != null && this.b.onTouchEvent(motionEvent0)) {
                    float f = motionEvent0.getX();
                    View view0 = recyclerView0.findChildViewUnder(f, motionEvent0.getY());
                    if(view0 instanceof ViewGroup) {
                        int v1 = ((ViewGroup)view0).getChildCount();
                        for(int v = 0; v < v1; ++v) {
                            View view1 = ((ViewGroup)view0).getChildAt(v);
                            if(((float)view1.getLeft()) <= f && f <= ((float)view1.getRight())) {
                                if(view1.isEnabled()) {
                                    int v2 = recyclerView0.getChildAdapterPosition(view0);
                                    if(v2 >= 0) {
                                        this.a.a(view1, v2);
                                    }
                                }
                                return true;
                            }
                        }
                    }
                    if(view0 != null) {
                        int v3 = recyclerView0.getChildAdapterPosition(view0);
                        if(v3 >= 0) {
                            this.a.a(view0, v3);
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        public interface f {
            boolean a(View arg1, int arg2);
        }

        static final class g extends ItemDecoration {
            private final int a;
            private final int b;

            private g(int v, int v1) {
                this.a = v;
                this.b = v1;
            }

            g(int v, int v1, rl rl0) {
                this(v, v1);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
            public void d(@NonNull Rect rect0, @NonNull View view0, RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
                int v = recyclerView0.getChildAdapterPosition(view0);
                if(this.b != 0) {
                    if(v == 0) {
                        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                        if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
                            if(((LinearLayoutManager)recyclerView$LayoutManager0).b3() == 0) {
                                rect0.left = this.b;
                            }
                            else {
                                rect0.top = this.b;
                            }
                        }
                    }
                    else if(v == recyclerView0.getAdapter().getItemCount() - 1) {
                        LayoutManager recyclerView$LayoutManager1 = recyclerView0.getLayoutManager();
                        if(recyclerView$LayoutManager1 instanceof LinearLayoutManager) {
                            if(((LinearLayoutManager)recyclerView$LayoutManager1).b3() == 0) {
                                rect0.right = this.b;
                            }
                            else {
                                rect0.bottom = this.b;
                            }
                        }
                    }
                }
                if(this.a != 0 && v != 0) {
                    LayoutManager recyclerView$LayoutManager2 = recyclerView0.getLayoutManager();
                    if(recyclerView$LayoutManager2 instanceof LinearLayoutManager) {
                        if(((LinearLayoutManager)recyclerView$LayoutManager2).b3() == 0) {
                            rect0.left = this.a;
                            return;
                        }
                        rect0.top = this.a;
                    }
                }
            }
        }

        static final class h extends SimpleOnItemTouchListener {
            private f a;
            private GestureDetector b;

            private h(Context context0, f ql$b$f0) {
                class com.dcinside.app.util.ql.b.h.a extends GestureDetector.SimpleOnGestureListener {
                    @Override  // android.view.GestureDetector$SimpleOnGestureListener
                    public boolean onSingleTapUp(MotionEvent motionEvent0) {
                        return true;
                    }
                }

                this.a = ql$b$f0;
                this.b = new GestureDetector(context0, new com.dcinside.app.util.ql.b.h.a(this));
            }

            h(Context context0, f ql$b$f0, rl rl0) {
                this(context0, ql$b$f0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$SimpleOnItemTouchListener
            public boolean i(@NonNull RecyclerView recyclerView0, MotionEvent motionEvent0) {
                if(this.a != null && this.b.onTouchEvent(motionEvent0)) {
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    View view0 = recyclerView0.findChildViewUnder(f, f1);
                    if(view0 instanceof ViewGroup) {
                        int v1 = ((ViewGroup)view0).getChildCount();
                        for(int v = 0; v < v1; ++v) {
                            View view1 = ((ViewGroup)view0).getChildAt(v);
                            if(((float)view1.getTop()) <= f1 && f1 <= ((float)view1.getBottom())) {
                                if(view1.isEnabled()) {
                                    int v2 = recyclerView0.getChildAdapterPosition(view0);
                                    if(v2 >= 0) {
                                        this.a.a(view1, v2);
                                    }
                                }
                                return true;
                            }
                        }
                    }
                    if(view0 != null) {
                        int v3 = recyclerView0.getChildAdapterPosition(view0);
                        if(v3 >= 0) {
                            this.a.a(view0, v3);
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        public static void a(Adapter recyclerView$Adapter0) {
            try {
                recyclerView$Adapter0.unregisterAdapterDataObserver(com.dcinside.app.util.ql.b.b.c);
            }
            catch(Exception unused_ex) {
            }
        }

        private static void b(Adapter recyclerView$Adapter0, @com.dcinside.app.util.ql.b.b.a int v, com.dcinside.app.util.ql.b.a ql$b$a0) {
            b.a(recyclerView$Adapter0);
            recyclerView$Adapter0.registerAdapterDataObserver(new com.dcinside.app.util.ql.b.b(v, ql$b$a0, null));
        }

        public static void c(Adapter recyclerView$Adapter0, com.dcinside.app.util.ql.b.a ql$b$a0) {
            b.b(recyclerView$Adapter0, 2, ql$b$a0);
        }

        public static void d(@NonNull RecyclerView recyclerView0) {
            d.b(recyclerView0);
        }

        public static void e(@NonNull RecyclerView recyclerView0, @NonNull f ql$b$f0) {
            recyclerView0.addOnItemTouchListener(new c(recyclerView0.getContext(), ql$b$f0, null));
        }

        public static void f(@NonNull RecyclerView recyclerView0, @NonNull f ql$b$f0) {
            recyclerView0.addOnItemTouchListener(new e(recyclerView0.getContext(), ql$b$f0, null));
        }

        public static void g(@NonNull RecyclerView recyclerView0, @NonNull f ql$b$f0) {
            recyclerView0.addOnItemTouchListener(new h(recyclerView0.getContext(), ql$b$f0, null));
        }

        public static void h(Adapter recyclerView$Adapter0, com.dcinside.app.util.ql.b.a ql$b$a0) {
            b.b(recyclerView$Adapter0, 4, ql$b$a0);
        }

        public static void i(Adapter recyclerView$Adapter0, com.dcinside.app.util.ql.b.a ql$b$a0) {
            b.b(recyclerView$Adapter0, 8, ql$b$a0);
        }

        public static void j(Adapter recyclerView$Adapter0, com.dcinside.app.util.ql.b.a ql$b$a0) {
            b.b(recyclerView$Adapter0, 0x20, ql$b$a0);
        }

        public static void k(Adapter recyclerView$Adapter0, com.dcinside.app.util.ql.b.a ql$b$a0) {
            b.b(recyclerView$Adapter0, 16, ql$b$a0);
        }

        public static void l(@NonNull RecyclerView recyclerView0, int v) {
            recyclerView0.addItemDecoration(new g(v, 0, null));
        }

        public static void m(@NonNull RecyclerView recyclerView0, int v, int v1) {
            recyclerView0.addItemDecoration(new g(v, v1, null));
        }
    }

    public static final class com.dcinside.app.util.ql.c implements com.google.android.material.tabs.TabLayout.f {
        public interface com.dcinside.app.util.ql.c.a {
            void a(i arg1);
        }

        private int a;
        private com.dcinside.app.util.ql.c.a b;
        private static final int c = 2;
        private static final int d = 4;
        private static final int e = 8;

        private com.dcinside.app.util.ql.c(int v, com.dcinside.app.util.ql.c.a ql$c$a0) {
            this.a = v;
            this.b = ql$c$a0;
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void N(i tabLayout$i0) {
            if((this.a & 4) > 0) {
                this.b.a(tabLayout$i0);
            }
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void R(i tabLayout$i0) {
            if((this.a & 8) > 0) {
                this.b.a(tabLayout$i0);
            }
        }

        public static void a(TabLayout tabLayout0) {
            tabLayout0.t();
        }

        public static void b(TabLayout tabLayout0, com.dcinside.app.util.ql.c.a ql$c$a0) {
            tabLayout0.h(new com.dcinside.app.util.ql.c(8, ql$c$a0));
        }

        public static void c(TabLayout tabLayout0, com.dcinside.app.util.ql.c.a ql$c$a0) {
            tabLayout0.h(new com.dcinside.app.util.ql.c(2, ql$c$a0));
        }

        public static void d(TabLayout tabLayout0, com.dcinside.app.util.ql.c.a ql$c$a0) {
            tabLayout0.h(new com.dcinside.app.util.ql.c(4, ql$c$a0));
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void j(i tabLayout$i0) {
            if((this.a & 2) > 0) {
                this.b.a(tabLayout$i0);
            }
        }
    }

}

