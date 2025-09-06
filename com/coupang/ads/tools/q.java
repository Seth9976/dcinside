package com.coupang.ads.tools;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class q {
    public static final boolean a(@m TextView textView0, @m CharSequence charSequence0) {
        if(textView0 == null) {
            return false;
        }
        if(charSequence0 != null && charSequence0.length() != 0) {
            q.h(textView0);
            textView0.setText(charSequence0);
            return true;
        }
        q.b(textView0);
        return false;
    }

    public static final void b(@m View view0) {
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }

    public static final void c(@m View view0) {
        if(view0 != null) {
            view0.setVisibility(4);
        }
    }

    public static final boolean d(@m View view0) {
        return view0 != null && view0.getVisibility() == 0;
    }

    public static final void e(@m View view0) {
        if(view0 != null) {
            if(view0.getVisibility() == 0) {
                view0.setVisibility(8);
                return;
            }
            view0.setVisibility(0);
        }
    }

    public static final void f(@m View view0, boolean z, @l Function1 function10) {
        L.p(function10, "callback");
        if(view0 == null) {
            return;
        }
        LinkedList linkedList0 = new LinkedList();
        if(z) {
            linkedList0.add(view0);
        }
        else if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    linkedList0.add(((ViewGroup)view0).getChildAt(v1));
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
        }
        while(!linkedList0.isEmpty()) {
            View view1 = (View)linkedList0.poll();
            if(view1 == null) {
                break;
            }
            p p0 = (p)function10.invoke(view1);
            if(p0 == p.b) {
                return;
            }
            if(p0 != p.c && view1 instanceof ViewGroup) {
                ViewGroup viewGroup0 = (ViewGroup)view1;
                int v2 = viewGroup0.getChildCount();
                if(v2 > 0) {
                    for(int v3 = 0; true; ++v3) {
                        linkedList0.add(viewGroup0.getChildAt(v3));
                        if(v3 + 1 >= v2) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void g(View view0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        q.f(view0, z, function10);
    }

    public static final void h(@m View view0) {
        if(view0 != null) {
            view0.setVisibility(0);
        }
    }

    public static final void i(@m View view0, boolean z) {
        if(view0 != null) {
            view0.setVisibility((z ? 0 : 8));
        }
    }
}

