package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class s implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final DcToolbar b;

    private s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = dcToolbar0;
    }

    @NonNull
    public static s a(@NonNull View view0) {
        DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B07A0);  // id:major_more_toolbar
        if(dcToolbar0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B07A0));  // id:major_more_toolbar
        }
        return new s(((CoordinatorLayout)view0), dcToolbar0);
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static s c(@NonNull LayoutInflater layoutInflater0) {
        return s.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0030, viewGroup0, false);  // layout:activity_gallery_major_more
        if(z) {
            viewGroup0.addView(view0);
        }
        return s.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

