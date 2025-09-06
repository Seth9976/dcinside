package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class VisibilityPropagation extends TransitionPropagation {
    private static final String a = "android:visibilityPropagation:visibility";
    private static final String b = "android:visibilityPropagation:center";
    private static final String[] c;

    static {
        VisibilityPropagation.c = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    }

    @Override  // androidx.transition.TransitionPropagation
    public void a(@NonNull TransitionValues transitionValues0) {
        View view0 = transitionValues0.b;
        Integer integer0 = (Integer)transitionValues0.a.get("android:visibility:visibility");
        if(integer0 == null) {
            integer0 = view0.getVisibility();
        }
        transitionValues0.a.put("android:visibilityPropagation:visibility", integer0);
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        int v = arr_v[0] + Math.round(view0.getTranslationX());
        arr_v[0] = v;
        arr_v[0] = v + view0.getWidth() / 2;
        int v1 = arr_v[1] + Math.round(view0.getTranslationY());
        arr_v[1] = v1;
        arr_v[1] = v1 + view0.getHeight() / 2;
        transitionValues0.a.put("android:visibilityPropagation:center", arr_v);
    }

    @Override  // androidx.transition.TransitionPropagation
    @Nullable
    public String[] b() {
        return VisibilityPropagation.c;
    }

    private static int d(@Nullable TransitionValues transitionValues0, int v) {
        if(transitionValues0 == null) {
            return -1;
        }
        int[] arr_v = (int[])transitionValues0.a.get("android:visibilityPropagation:center");
        return arr_v == null ? -1 : arr_v[v];
    }

    public int e(@Nullable TransitionValues transitionValues0) {
        if(transitionValues0 == null) {
            return 8;
        }
        Integer integer0 = (Integer)transitionValues0.a.get("android:visibilityPropagation:visibility");
        return integer0 == null ? 8 : ((int)integer0);
    }

    public int f(@Nullable TransitionValues transitionValues0) {
        return VisibilityPropagation.d(transitionValues0, 0);
    }

    public int g(@Nullable TransitionValues transitionValues0) {
        return VisibilityPropagation.d(transitionValues0, 1);
    }
}

