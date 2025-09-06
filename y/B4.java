package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.dcinside.app.view.StateAnnounceView;
import com.dcinside.app.view.SwipeHandleTabLayout;

public final class b4 implements ViewBinding {
    @NonNull
    private final View a;
    @NonNull
    public final View b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final ViewPager2 d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final ConstraintLayout f;
    @NonNull
    public final ImageView g;
    @NonNull
    public final StateAnnounceView h;
    @NonNull
    public final SwipeHandleTabLayout i;

    private b4(@NonNull View view0, @NonNull View view1, @NonNull ConstraintLayout constraintLayout0, @NonNull ViewPager2 viewPager20, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView1, @NonNull StateAnnounceView stateAnnounceView0, @NonNull SwipeHandleTabLayout swipeHandleTabLayout0) {
        this.a = view0;
        this.b = view1;
        this.c = constraintLayout0;
        this.d = viewPager20;
        this.e = imageView0;
        this.f = constraintLayout1;
        this.g = imageView1;
        this.h = stateAnnounceView0;
        this.i = swipeHandleTabLayout0;
    }

    @NonNull
    public static b4 a(@NonNull View view0) {
        int v = 0x7F0B0355;  // id:dccon_picker_divide
        View view1 = ViewBindings.a(view0, 0x7F0B0355);  // id:dccon_picker_divide
        if(view1 != null) {
            v = 0x7F0B0358;  // id:dccon_picker_new_bar
            View view2 = ViewBindings.a(view0, 0x7F0B0358);  // id:dccon_picker_new_bar
            if(((ConstraintLayout)view2) != null) {
                v = 0x7F0B0359;  // id:dccon_picker_new_list
                View view3 = ViewBindings.a(view0, 0x7F0B0359);  // id:dccon_picker_new_list
                if(((ViewPager2)view3) != null) {
                    v = 0x7F0B035A;  // id:dccon_picker_new_more
                    View view4 = ViewBindings.a(view0, 0x7F0B035A);  // id:dccon_picker_new_more
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B035B;  // id:dccon_picker_new_option_wrap
                        View view5 = ViewBindings.a(view0, 0x7F0B035B);  // id:dccon_picker_new_option_wrap
                        if(((ConstraintLayout)view5) != null) {
                            v = 0x7F0B035C;  // id:dccon_picker_new_setting
                            View view6 = ViewBindings.a(view0, 0x7F0B035C);  // id:dccon_picker_new_setting
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B035D;  // id:dccon_picker_new_state
                                View view7 = ViewBindings.a(view0, 0x7F0B035D);  // id:dccon_picker_new_state
                                if(((StateAnnounceView)view7) != null) {
                                    v = 0x7F0B035E;  // id:dccon_picker_new_tab
                                    View view8 = ViewBindings.a(view0, 0x7F0B035E);  // id:dccon_picker_new_tab
                                    if(((SwipeHandleTabLayout)view8) != null) {
                                        return new b4(view0, view1, ((ConstraintLayout)view2), ((ViewPager2)view3), ((ImageView)view4), ((ConstraintLayout)view5), ((ImageView)view6), ((StateAnnounceView)view7), ((SwipeHandleTabLayout)view8));
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
    public static b4 b(@NonNull LayoutInflater layoutInflater0, @NonNull ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater0.inflate(0x7F0E01BD, viewGroup0);  // layout:view_dccon_picker
        return b4.a(viewGroup0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

