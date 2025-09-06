package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class v implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final DcToolbar b;
    @NonNull
    public final FrameLayout c;

    private v(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull DcToolbar dcToolbar0, @NonNull FrameLayout frameLayout0) {
        this.a = coordinatorLayout0;
        this.b = dcToolbar0;
        this.c = frameLayout0;
    }

    @NonNull
    public static v a(@NonNull View view0) {
        int v = 0x7F0B0514;  // id:gif_dc_toolbar
        DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B0514);  // id:gif_dc_toolbar
        if(dcToolbar0 != null) {
            v = 0x7F0B051C;  // id:gif_make_fragment
            FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B051C);  // id:gif_make_fragment
            if(frameLayout0 != null) {
                return new v(((CoordinatorLayout)view0), dcToolbar0, frameLayout0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static v c(@NonNull LayoutInflater layoutInflater0) {
        return v.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0033, viewGroup0, false);  // layout:activity_gif_make
        if(z) {
            viewGroup0.addView(view0);
        }
        return v.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

