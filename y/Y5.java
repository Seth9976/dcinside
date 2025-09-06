package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;

public final class y5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TabLayout g;
    @NonNull
    public final TextView h;
    @NonNull
    public final ConstraintLayout i;

    private y5(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TabLayout tabLayout0, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = textView0;
        this.d = constraintLayout1;
        this.e = textView1;
        this.f = textView2;
        this.g = tabLayout0;
        this.h = textView3;
        this.i = constraintLayout2;
    }

    @NonNull
    public static y5 a(@NonNull View view0) {
        int v = 0x7F0B0199;  // id:best_filter_divider
        View view1 = ViewBindings.a(view0, 0x7F0B0199);  // id:best_filter_divider
        if(view1 != null) {
            v = 0x7F0B01AF;  // id:best_sort_count
            View view2 = ViewBindings.a(view0, 0x7F0B01AF);  // id:best_sort_count
            if(((TextView)view2) != null) {
                v = 0x7F0B01B0;  // id:best_sort_ranking_wrap
                View view3 = ViewBindings.a(view0, 0x7F0B01B0);  // id:best_sort_ranking_wrap
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B01B1;  // id:best_sort_recommend
                    View view4 = ViewBindings.a(view0, 0x7F0B01B1);  // id:best_sort_recommend
                    if(((TextView)view4) != null) {
                        v = 0x7F0B01B2;  // id:best_sort_reply
                        View view5 = ViewBindings.a(view0, 0x7F0B01B2);  // id:best_sort_reply
                        if(((TextView)view5) != null) {
                            v = 0x7F0B01B3;  // id:best_tab
                            View view6 = ViewBindings.a(view0, 0x7F0B01B3);  // id:best_tab
                            if(((TabLayout)view6) != null) {
                                v = 0x7F0B01B4;  // id:best_title
                                View view7 = ViewBindings.a(view0, 0x7F0B01B4);  // id:best_title
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B01B5;  // id:best_title_wrap
                                    View view8 = ViewBindings.a(view0, 0x7F0B01B5);  // id:best_title_wrap
                                    if(((ConstraintLayout)view8) != null) {
                                        return new y5(((ConstraintLayout)view0), view1, ((TextView)view2), ((ConstraintLayout)view3), ((TextView)view4), ((TextView)view5), ((TabLayout)view6), ((TextView)view7), ((ConstraintLayout)view8));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static y5 c(@NonNull LayoutInflater layoutInflater0) {
        return y5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0208, viewGroup0, false);  // layout:view_main_best_filter
        if(z) {
            viewGroup0.addView(view0);
        }
        return y5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

