package androidx.core.view;

import A3.o;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.annotation.Px;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.ranges.s;
import kotlin.sequences.m;
import y4.l;

public final class ViewGroupKt {
    public static final boolean a(@l ViewGroup viewGroup0, @l View view0) {
        return viewGroup0.indexOfChild(view0) != -1;
    }

    public static final void b(@l ViewGroup viewGroup0, @l Function1 function10) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(viewGroup0.getChildAt(v1));
        }
    }

    public static final void c(@l ViewGroup viewGroup0, @l o o0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(v1, viewGroup0.getChildAt(v1));
        }
    }

    @l
    public static final View d(@l ViewGroup viewGroup0, int v) {
        View view0 = viewGroup0.getChildAt(v);
        if(view0 == null) {
            throw new IndexOutOfBoundsException("Index: " + v + ", Size: " + viewGroup0.getChildCount());
        }
        return view0;
    }

    @l
    public static final m e(@l ViewGroup viewGroup0) {
        return () -> {
            return new Object() {
                private int a;

                public View a() {
                    int v = this.a;
                    this.a = v + 1;
                    View view0 = this.a.getChildAt(v);
                    if(view0 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    return view0;
                }

                @Override
                public boolean hasNext() {
                    return this.a < this.a.getChildCount();
                }

                @Override
                public Object next() {
                    return this.a();
                }

                @Override
                public void remove() {
                    int v = this.a - 1;
                    this.a = v;
                    this.a.removeViewAt(v);
                }
            };
        };

        public final class androidx.core.view.ViewGroupKt.children.1 implements m {
            androidx.core.view.ViewGroupKt.children.1(ViewGroup viewGroup0) {
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return ViewGroupKt.k(this.a);
            }
        }

    }

    @l
    public static final m f(@l ViewGroup viewGroup0) {
        return new m() {
            @Override  // kotlin.sequences.m
            @l
            public Iterator iterator() {
                return new TreeIterator(ViewGroupKt.e(viewGroup0).iterator(), androidx.core.view.ViewGroupKt.descendants.1.1.e);
            }
        };

        final class androidx.core.view.ViewGroupKt.descendants.1.1 extends N implements Function1 {
            public static final androidx.core.view.ViewGroupKt.descendants.1.1 e;

            static {
                androidx.core.view.ViewGroupKt.descendants.1.1.e = new androidx.core.view.ViewGroupKt.descendants.1.1();
            }

            androidx.core.view.ViewGroupKt.descendants.1.1() {
                super(1);
            }

            public final Iterator b(View view0) {
                ViewGroup viewGroup0 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
                if(viewGroup0 != null) {
                    m m0 = ViewGroupKt.e(viewGroup0);
                    return m0 == null ? null : m0.iterator();
                }
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

    }

    @l
    public static final kotlin.ranges.l g(@l ViewGroup viewGroup0) {
        return s.W1(0, viewGroup0.getChildCount());
    }

    public static final int h(@l ViewGroup viewGroup0) {
        return viewGroup0.getChildCount();
    }

    public static final boolean i(@l ViewGroup viewGroup0) {
        return viewGroup0.getChildCount() == 0;
    }

    public static final boolean j(@l ViewGroup viewGroup0) {
        return viewGroup0.getChildCount() != 0;
    }

    // 检测为 Lambda 实现
    @l
    public static final Iterator k(@l ViewGroup viewGroup0) [...]

    public static final void l(@l ViewGroup viewGroup0, @l View view0) {
        viewGroup0.removeView(view0);
    }

    public static final void m(@l ViewGroup viewGroup0, @l View view0) {
        viewGroup0.addView(view0);
    }

    public static final void n(@l ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, @Px int v) {
        viewGroup$MarginLayoutParams0.setMargins(v, v, v, v);
    }

    public static final void o(@l ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        viewGroup$MarginLayoutParams0.setMargins(v, v1, v2, v3);
    }

    public static void p(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = viewGroup$MarginLayoutParams0.leftMargin;
        }
        if((v4 & 2) != 0) {
            v1 = viewGroup$MarginLayoutParams0.topMargin;
        }
        if((v4 & 4) != 0) {
            v2 = viewGroup$MarginLayoutParams0.rightMargin;
        }
        if((v4 & 8) != 0) {
            v3 = viewGroup$MarginLayoutParams0.bottomMargin;
        }
        viewGroup$MarginLayoutParams0.setMargins(v, v1, v2, v3);
    }

    public static final void q(@l ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        viewGroup$MarginLayoutParams0.setMarginStart(v);
        viewGroup$MarginLayoutParams0.topMargin = v1;
        viewGroup$MarginLayoutParams0.setMarginEnd(v2);
        viewGroup$MarginLayoutParams0.bottomMargin = v3;
    }

    public static void r(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = viewGroup$MarginLayoutParams0.getMarginStart();
        }
        if((v4 & 2) != 0) {
            v1 = viewGroup$MarginLayoutParams0.topMargin;
        }
        if((v4 & 4) != 0) {
            v2 = viewGroup$MarginLayoutParams0.getMarginEnd();
        }
        if((v4 & 8) != 0) {
            v3 = viewGroup$MarginLayoutParams0.bottomMargin;
        }
        viewGroup$MarginLayoutParams0.setMarginStart(v);
        viewGroup$MarginLayoutParams0.topMargin = v1;
        viewGroup$MarginLayoutParams0.setMarginEnd(v2);
        viewGroup$MarginLayoutParams0.bottomMargin = v3;
    }
}

