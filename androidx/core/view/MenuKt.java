package androidx.core.view;

import A3.o;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import y4.l;

@s0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class MenuKt {
    public static final boolean a(@l Menu menu0, @l MenuItem menuItem0) {
        int v = menu0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(L.g(menu0.getItem(v1), menuItem0)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@l Menu menu0, @l Function1 function10) {
        int v = menu0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(menu0.getItem(v1));
        }
    }

    public static final void c(@l Menu menu0, @l o o0) {
        int v = menu0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(v1, menu0.getItem(v1));
        }
    }

    @l
    public static final MenuItem d(@l Menu menu0, int v) {
        return menu0.getItem(v);
    }

    @l
    public static final m e(@l Menu menu0) {
        return () -> {
            return new Object() {
                private int a;

                public MenuItem a() {
                    int v = this.a;
                    this.a = v + 1;
                    MenuItem menuItem0 = this.a.getItem(v);
                    if(menuItem0 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    return menuItem0;
                }

                @Override
                public boolean hasNext() {
                    return this.a < this.a.size();
                }

                @Override
                public Object next() {
                    return this.a();
                }

                @Override
                public void remove() {
                    S0 s00;
                    Menu menu0 = this.a;
                    int v = this.a - 1;
                    this.a = v;
                    MenuItem menuItem0 = menu0.getItem(v);
                    if(menuItem0 == null) {
                        s00 = null;
                    }
                    else {
                        menu0.removeItem(menuItem0.getItemId());
                        s00 = S0.a;
                    }
                    if(s00 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                }
            };
        };

        public final class androidx.core.view.MenuKt.children.1 implements m {
            androidx.core.view.MenuKt.children.1(Menu menu0) {
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return MenuKt.i(this.a);
            }
        }

    }

    public static final int f(@l Menu menu0) {
        return menu0.size();
    }

    public static final boolean g(@l Menu menu0) {
        return menu0.size() == 0;
    }

    public static final boolean h(@l Menu menu0) {
        return menu0.size() != 0;
    }

    // 检测为 Lambda 实现
    @l
    public static final Iterator i(@l Menu menu0) [...]

    public static final void j(@l Menu menu0, @l MenuItem menuItem0) {
        menu0.removeItem(menuItem0.getItemId());
    }

    public static final void k(@l Menu menu0, int v) {
        S0 s00;
        MenuItem menuItem0 = menu0.getItem(v);
        if(menuItem0 == null) {
            s00 = null;
        }
        else {
            menu0.removeItem(menuItem0.getItemId());
            s00 = S0.a;
        }
        if(s00 == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}

