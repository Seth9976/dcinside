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

public final class l implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final RecyclerView b;
    @NonNull
    public final DcToolbar c;

    private l(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull RecyclerView recyclerView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = recyclerView0;
        this.c = dcToolbar0;
    }

    @NonNull
    public static l a(@NonNull View view0) {
        int v = 0x7F0B01DF;  // id:block_dccon_child_list
        RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B01DF);  // id:block_dccon_child_list
        if(recyclerView0 != null) {
            v = 0x7F0B01E0;  // id:block_dccon_child_toolbar
            DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B01E0);  // id:block_dccon_child_toolbar
            if(dcToolbar0 != null) {
                return new l(((CoordinatorLayout)view0), recyclerView0, dcToolbar0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater0) {
        return l.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0027, viewGroup0, false);  // layout:activity_block_dccon_child
        if(z) {
            viewGroup0.addView(view0);
        }
        return l.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

