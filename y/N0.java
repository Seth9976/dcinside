package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class n0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ProgressBar d;
    @NonNull
    public final RecyclerView e;
    @NonNull
    public final DcToolbar f;

    private n0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull ProgressBar progressBar0, @NonNull RecyclerView recyclerView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = imageView0;
        this.c = textView0;
        this.d = progressBar0;
        this.e = recyclerView0;
        this.f = dcToolbar0;
    }

    @NonNull
    public static n0 a(@NonNull View view0) {
        int v = 0x7F0B0397;  // id:def_img_list_profile_icon
        View view1 = ViewBindings.a(view0, 0x7F0B0397);  // id:def_img_list_profile_icon
        if(((ImageView)view1) != null) {
            v = 0x7F0B0398;  // id:def_img_list_profile_name
            View view2 = ViewBindings.a(view0, 0x7F0B0398);  // id:def_img_list_profile_name
            if(((TextView)view2) != null) {
                v = 0x7F0B0399;  // id:def_img_list_setting_progress
                View view3 = ViewBindings.a(view0, 0x7F0B0399);  // id:def_img_list_setting_progress
                if(((ProgressBar)view3) != null) {
                    v = 0x7F0B039A;  // id:def_img_list_setting_recycler
                    View view4 = ViewBindings.a(view0, 0x7F0B039A);  // id:def_img_list_setting_recycler
                    if(((RecyclerView)view4) != null) {
                        v = 0x7F0B039B;  // id:def_img_list_setting_toolbar
                        View view5 = ViewBindings.a(view0, 0x7F0B039B);  // id:def_img_list_setting_toolbar
                        if(((DcToolbar)view5) != null) {
                            return new n0(((CoordinatorLayout)view0), ((ImageView)view1), ((TextView)view2), ((ProgressBar)view3), ((RecyclerView)view4), ((DcToolbar)view5));
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
    public static n0 c(@NonNull LayoutInflater layoutInflater0) {
        return n0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static n0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E005E, viewGroup0, false);  // layout:activity_setting_def_img_list
        if(z) {
            viewGroup0.addView(view0);
        }
        return n0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

