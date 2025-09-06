package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
@RestrictTo({Scope.c})
public abstract class FragmentTransitionImpl {
    public abstract void a(Object arg1, View arg2);

    public abstract void b(Object arg1, ArrayList arg2);

    public abstract void c(ViewGroup arg1, Object arg2);

    protected static void d(List list0, View view0) {
        int v = list0.size();
        if(FragmentTransitionImpl.g(list0, view0, v)) {
            return;
        }
        if(ViewCompat.C0(view0) != null) {
            list0.add(view0);
        }
        for(int v1 = v; v1 < list0.size(); ++v1) {
            View view1 = (View)list0.get(v1);
            if(view1 instanceof ViewGroup) {
                ViewGroup viewGroup0 = (ViewGroup)view1;
                int v2 = viewGroup0.getChildCount();
                for(int v3 = 0; v3 < v2; ++v3) {
                    View view2 = viewGroup0.getChildAt(v3);
                    if(!FragmentTransitionImpl.g(list0, view2, v) && ViewCompat.C0(view2) != null) {
                        list0.add(view2);
                    }
                }
            }
        }
    }

    public abstract boolean e(Object arg1);

    public abstract Object f(Object arg1);

    private static boolean g(List list0, View view0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(list0.get(v1) == view0) {
                return true;
            }
        }
        return false;
    }

    protected void h(View view0, Rect rect0) {
        if(!ViewCompat.T0(view0)) {
            return;
        }
        RectF rectF0 = new RectF();
        rectF0.set(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()));
        view0.getMatrix().mapRect(rectF0);
        rectF0.offset(((float)view0.getLeft()), ((float)view0.getTop()));
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof View; viewParent0 = ((View)viewParent0).getParent()) {
            rectF0.offset(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
            ((View)viewParent0).getMatrix().mapRect(rectF0);
            rectF0.offset(((float)((View)viewParent0).getLeft()), ((float)((View)viewParent0).getTop()));
        }
        int[] arr_v = new int[2];
        view0.getRootView().getLocationOnScreen(arr_v);
        rectF0.offset(((float)arr_v[0]), ((float)arr_v[1]));
        rect0.set(Math.round(rectF0.left), Math.round(rectF0.top), Math.round(rectF0.right), Math.round(rectF0.bottom));
    }

    protected static boolean i(List list0) {
        return list0 == null || list0.isEmpty();
    }

    public abstract Object j(Object arg1, Object arg2, Object arg3);

    public abstract Object k(Object arg1, Object arg2, Object arg3);

    ArrayList l(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)arrayList0.get(v1);
            arrayList1.add(ViewCompat.C0(view0));
            ViewCompat.F2(view0, null);
        }
        return arrayList1;
    }

    public abstract void m(Object arg1, View arg2);

    public abstract void n(Object arg1, ArrayList arg2, ArrayList arg3);

    public abstract void o(Object arg1, View arg2, ArrayList arg3);

    public abstract void p(Object arg1, Object arg2, ArrayList arg3, Object arg4, ArrayList arg5, Object arg6, ArrayList arg7);

    public abstract void q(Object arg1, Rect arg2);

    public abstract void r(Object arg1, View arg2);

    public void s(@NonNull Fragment fragment0, @NonNull Object object0, @NonNull CancellationSignal cancellationSignal0, @NonNull Runnable runnable0) {
        runnable0.run();
    }

    void t(View view0, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, Map map0) {
        int v = arrayList1.size();
        ArrayList arrayList3 = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = (View)arrayList0.get(v1);
            String s = ViewCompat.C0(view1);
            arrayList3.add(s);
            if(s != null) {
                ViewCompat.F2(view1, null);
                String s1 = (String)map0.get(s);
                for(int v2 = 0; v2 < v; ++v2) {
                    if(s1.equals(arrayList2.get(v2))) {
                        ViewCompat.F2(((View)arrayList1.get(v2)), s);
                        break;
                    }
                }
            }
        }
        OneShotPreDrawListener.a(view0, new Runnable() {
            final FragmentTransitionImpl f;

            @Override
            public void run() {
                for(int v = 0; v < v; ++v) {
                    ViewCompat.F2(((View)arrayList1.get(v)), ((String)arrayList2.get(v)));
                    ViewCompat.F2(((View)arrayList0.get(v)), ((String)arrayList3.get(v)));
                }
            }
        });
    }

    public abstract void u(Object arg1, View arg2, ArrayList arg3);

    public abstract void v(Object arg1, ArrayList arg2, ArrayList arg3);

    public abstract Object w(Object arg1);
}

