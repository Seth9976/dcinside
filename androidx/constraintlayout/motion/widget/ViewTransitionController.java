package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues.SharedValuesListener;
import java.util.ArrayList;
import java.util.HashSet;

public class ViewTransitionController {
    private final MotionLayout a;
    private ArrayList b;
    private HashSet c;
    private String d;
    ArrayList e;
    ArrayList f;

    public ViewTransitionController(MotionLayout motionLayout0) {
        this.b = new ArrayList();
        this.d = "ViewTransitionController";
        this.f = new ArrayList();
        this.a = motionLayout0;
    }

    public void b(ViewTransition viewTransition0) {
        this.b.add(viewTransition0);
        this.c = null;
        if(viewTransition0.j() == 4) {
            this.i(viewTransition0, true);
            return;
        }
        if(viewTransition0.j() == 5) {
            this.i(viewTransition0, false);
        }
    }

    void c(Animate viewTransition$Animate0) {
        if(this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(viewTransition$Animate0);
    }

    void d() {
        ArrayList arrayList0 = this.e;
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            ((Animate)object0).a();
        }
        this.e.removeAll(this.f);
        this.f.clear();
        if(this.e.isEmpty()) {
            this.e = null;
        }
    }

    boolean e(int v, MotionController motionController0) {
        for(Object object0: this.b) {
            ViewTransition viewTransition0 = (ViewTransition)object0;
            if(viewTransition0.e() == v) {
                viewTransition0.g.a(motionController0);
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    void f(int v, boolean z) {
        for(Object object0: this.b) {
            ViewTransition viewTransition0 = (ViewTransition)object0;
            if(viewTransition0.e() == v) {
                viewTransition0.o(z);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    void g() {
        this.a.invalidate();
    }

    boolean h(int v) {
        for(Object object0: this.b) {
            ViewTransition viewTransition0 = (ViewTransition)object0;
            if(viewTransition0.e() == v) {
                return viewTransition0.k();
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private void i(ViewTransition viewTransition0, boolean z) {
        ConstraintLayout.getSharedValues().a(viewTransition0.i(), new SharedValuesListener() {
            final ViewTransitionController e;

            @Override  // androidx.constraintlayout.widget.SharedValues$SharedValuesListener
            public void a(int v, int v1, int v2) {
                viewTransition0.r(v1);
                if(viewTransition0.i() == v && viewTransition0.h() != v1) {
                    if(z) {
                        if(viewTransition0.g() == v1) {
                            int v3 = ViewTransitionController.this.a.getChildCount();
                            for(int v4 = 0; v4 < v3; ++v4) {
                                View view0 = ViewTransitionController.this.a.getChildAt(v4);
                                if(viewTransition0.m(view0)) {
                                    int v5 = ViewTransitionController.this.a.getCurrentState();
                                    ConstraintSet constraintSet0 = ViewTransitionController.this.a.u0(v5);
                                    viewTransition0.c(ViewTransitionController.this, ViewTransitionController.this.a, v5, constraintSet0, new View[]{view0});
                                }
                            }
                        }
                    }
                    else if(viewTransition0.g() != v1) {
                        int v6 = ViewTransitionController.this.a.getChildCount();
                        for(int v7 = 0; v7 < v6; ++v7) {
                            View view1 = ViewTransitionController.this.a.getChildAt(v7);
                            if(viewTransition0.m(view1)) {
                                int v8 = ViewTransitionController.this.a.getCurrentState();
                                ConstraintSet constraintSet1 = ViewTransitionController.this.a.u0(v8);
                                viewTransition0.c(ViewTransitionController.this, ViewTransitionController.this.a, v8, constraintSet1, new View[]{view1});
                            }
                        }
                    }
                }
            }
        });
    }

    void j(int v) {
        ViewTransition viewTransition0 = null;
        for(Object object0: this.b) {
            ViewTransition viewTransition1 = (ViewTransition)object0;
            if(viewTransition1.e() == v) {
                viewTransition0 = viewTransition1;
                break;
            }
        }
        if(viewTransition0 != null) {
            this.c = null;
            this.b.remove(viewTransition0);
        }
    }

    void k(Animate viewTransition$Animate0) {
        this.f.add(viewTransition$Animate0);
    }

    void l(MotionEvent motionEvent0) {
        ViewTransition viewTransition2;
        int v = this.a.getCurrentState();
        if(v == -1) {
            return;
        }
        if(this.c == null) {
            this.c = new HashSet();
            for(Object object0: this.b) {
                ViewTransition viewTransition0 = (ViewTransition)object0;
                int v1 = this.a.getChildCount();
                for(int v2 = 0; v2 < v1; ++v2) {
                    View view0 = this.a.getChildAt(v2);
                    if(viewTransition0.m(view0)) {
                        view0.getId();
                        this.c.add(view0);
                    }
                }
            }
        }
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        Rect rect0 = new Rect();
        int v3 = motionEvent0.getAction();
        if(this.e != null && !this.e.isEmpty()) {
            for(Object object1: this.e) {
                ((Animate)object1).d(v3, f, f1);
            }
        }
        if(v3 == 0 || v3 == 1) {
            ConstraintSet constraintSet0 = this.a.u0(v);
            for(Object object2: this.b) {
                ViewTransition viewTransition1 = (ViewTransition)object2;
                if(viewTransition1.u(v3)) {
                    for(Object object3: this.c) {
                        View view1 = (View)object3;
                        if(viewTransition1.m(view1)) {
                            view1.getHitRect(rect0);
                            if(rect0.contains(((int)f), ((int)f1))) {
                                viewTransition2 = viewTransition1;
                                viewTransition1.c(this, this.a, v, constraintSet0, new View[]{view1});
                            }
                            else {
                                viewTransition2 = viewTransition1;
                            }
                            viewTransition1 = viewTransition2;
                        }
                    }
                }
            }
        }
    }

    void m(int v, View[] arr_view) {
        ArrayList arrayList0 = new ArrayList();
        ViewTransition viewTransition0 = null;
        for(Object object0: this.b) {
            ViewTransition viewTransition1 = (ViewTransition)object0;
            if(viewTransition1.e() == v) {
                for(int v1 = 0; v1 < arr_view.length; ++v1) {
                    View view0 = arr_view[v1];
                    if(viewTransition1.d(view0)) {
                        arrayList0.add(view0);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    this.n(viewTransition1, ((View[])arrayList0.toArray(new View[0])));
                    arrayList0.clear();
                }
                viewTransition0 = viewTransition1;
            }
        }
        if(viewTransition0 == null) {
            Log.e(this.d, " Could not find ViewTransition");
        }
    }

    private void n(ViewTransition viewTransition0, View[] arr_view) {
        int v = this.a.getCurrentState();
        if(viewTransition0.f != 2) {
            if(v == -1) {
                Log.w(this.d, "No support for ViewTransition within transition yet. Currently: " + this.a.toString());
                return;
            }
            ConstraintSet constraintSet0 = this.a.u0(v);
            if(constraintSet0 == null) {
                return;
            }
            viewTransition0.c(this, this.a, v, constraintSet0, arr_view);
            return;
        }
        viewTransition0.c(this, this.a, v, null, arr_view);
    }
}

