package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;
import com.dcinside.app.view.StateAnnounceView;

public final class o0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final AppCompatSpinner b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final RecyclerView e;
    @NonNull
    public final StateAnnounceView f;
    @NonNull
    public final DcToolbar g;

    private o0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppCompatSpinner appCompatSpinner0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull RecyclerView recyclerView0, @NonNull StateAnnounceView stateAnnounceView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = appCompatSpinner0;
        this.c = imageView0;
        this.d = imageView1;
        this.e = recyclerView0;
        this.f = stateAnnounceView0;
        this.g = dcToolbar0;
    }

    @NonNull
    public static o0 a(@NonNull View view0) {
        int v = 0x7F0B0499;  // id:favorite_setting_count
        View view1 = ViewBindings.a(view0, 0x7F0B0499);  // id:favorite_setting_count
        if(((AppCompatSpinner)view1) != null) {
            v = 0x7F0B049A;  // id:favorite_setting_count_ic
            View view2 = ViewBindings.a(view0, 0x7F0B049A);  // id:favorite_setting_count_ic
            if(((ImageView)view2) != null) {
                v = 0x7F0B049D;  // id:favorite_setting_order_ic
                View view3 = ViewBindings.a(view0, 0x7F0B049D);  // id:favorite_setting_order_ic
                if(((ImageView)view3) != null) {
                    v = 0x7F0B049E;  // id:favorite_setting_order_recycler
                    View view4 = ViewBindings.a(view0, 0x7F0B049E);  // id:favorite_setting_order_recycler
                    if(((RecyclerView)view4) != null) {
                        v = 0x7F0B049F;  // id:favorite_setting_order_state
                        View view5 = ViewBindings.a(view0, 0x7F0B049F);  // id:favorite_setting_order_state
                        if(((StateAnnounceView)view5) != null) {
                            v = 0x7F0B04A0;  // id:favorite_setting_toolbar
                            View view6 = ViewBindings.a(view0, 0x7F0B04A0);  // id:favorite_setting_toolbar
                            if(((DcToolbar)view6) != null) {
                                return new o0(((CoordinatorLayout)view0), ((AppCompatSpinner)view1), ((ImageView)view2), ((ImageView)view3), ((RecyclerView)view4), ((StateAnnounceView)view5), ((DcToolbar)view6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static o0 c(@NonNull LayoutInflater layoutInflater0) {
        return o0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E005F, viewGroup0, false);  // layout:activity_setting_favorite
        if(z) {
            viewGroup0.addView(view0);
        }
        return o0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

