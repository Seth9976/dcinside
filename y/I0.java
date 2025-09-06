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

public final class i0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final DcToolbar c;

    private i0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FrameLayout frameLayout0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = frameLayout0;
        this.c = dcToolbar0;
    }

    @NonNull
    public static i0 a(@NonNull View view0) {
        int v = 0x7F0B0E39;  // id:series_post_archive_fragment
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0E39);  // id:series_post_archive_fragment
        if(frameLayout0 != null) {
            v = 0x7F0B0E3A;  // id:series_post_archive_toolbar
            DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B0E3A);  // id:series_post_archive_toolbar
            if(dcToolbar0 != null) {
                return new i0(((CoordinatorLayout)view0), frameLayout0, dcToolbar0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static i0 c(@NonNull LayoutInflater layoutInflater0) {
        return i0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static i0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0059, viewGroup0, false);  // layout:activity_series_post_archive
        if(z) {
            viewGroup0.addView(view0);
        }
        return i0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

