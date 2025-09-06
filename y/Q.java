package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class q implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final DcToolbar b;
    @NonNull
    public final RecyclerView c;

    private q(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull DcToolbar dcToolbar0, @NonNull RecyclerView recyclerView0) {
        this.a = coordinatorLayout0;
        this.b = dcToolbar0;
        this.c = recyclerView0;
    }

    @NonNull
    public static q a(@NonNull View view0) {
        int v = 0x7F0B050F;  // id:gallery_transfer_toolbar
        DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B050F);  // id:gallery_transfer_toolbar
        if(dcToolbar0 != null) {
            v = 0x7F0B0BEF;  // id:profile_info_list
            RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0BEF);  // id:profile_info_list
            if(recyclerView0 != null) {
                return new q(((CoordinatorLayout)view0), dcToolbar0, recyclerView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static q c(@NonNull LayoutInflater layoutInflater0) {
        return q.d(layoutInflater0, null, false);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E002E, viewGroup0, false);  // layout:activity_full_profile
        if(z) {
            viewGroup0.addView(view0);
        }
        return q.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

