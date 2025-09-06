package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.MenuPageIndicator;
import com.dcinside.app.view.StateAnnounceView;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;

public final class f7 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final MenuPageIndicator c;
    @NonNull
    public final TextView d;
    @NonNull
    public final RecyclerViewPager e;
    @NonNull
    public final FrameLayout f;
    @NonNull
    public final RecyclerView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final LinearLayout i;
    @NonNull
    public final TextView j;
    @NonNull
    public final StateAnnounceView k;

    private f7(@NonNull FrameLayout frameLayout0, @NonNull ImageView imageView0, @NonNull MenuPageIndicator menuPageIndicator0, @NonNull TextView textView0, @NonNull RecyclerViewPager recyclerViewPager0, @NonNull FrameLayout frameLayout1, @NonNull RecyclerView recyclerView0, @NonNull TextView textView1, @NonNull LinearLayout linearLayout0, @NonNull TextView textView2, @NonNull StateAnnounceView stateAnnounceView0) {
        this.a = frameLayout0;
        this.b = imageView0;
        this.c = menuPageIndicator0;
        this.d = textView0;
        this.e = recyclerViewPager0;
        this.f = frameLayout1;
        this.g = recyclerView0;
        this.h = textView1;
        this.i = linearLayout0;
        this.j = textView2;
        this.k = stateAnnounceView0;
    }

    @NonNull
    public static f7 a(@NonNull View view0) {
        int v = 0x7F0B0C9A;  // id:recent_arrow
        View view1 = ViewBindings.a(view0, 0x7F0B0C9A);  // id:recent_arrow
        if(((ImageView)view1) != null) {
            v = 0x7F0B0C9C;  // id:recent_indicator
            View view2 = ViewBindings.a(view0, 0x7F0B0C9C);  // id:recent_indicator
            if(((MenuPageIndicator)view2) != null) {
                v = 0x7F0B0C9D;  // id:recent_last_mode
                View view3 = ViewBindings.a(view0, 0x7F0B0C9D);  // id:recent_last_mode
                if(((TextView)view3) != null) {
                    v = 0x7F0B0C9E;  // id:recent_pager
                    View view4 = ViewBindings.a(view0, 0x7F0B0C9E);  // id:recent_pager
                    if(((RecyclerViewPager)view4) != null) {
                        v = 0x7F0B0C9F;  // id:recent_panel
                        View view5 = ViewBindings.a(view0, 0x7F0B0C9F);  // id:recent_panel
                        if(((FrameLayout)view5) != null) {
                            v = 0x7F0B0CA0;  // id:recent_recycler
                            View view6 = ViewBindings.a(view0, 0x7F0B0CA0);  // id:recent_recycler
                            if(((RecyclerView)view6) != null) {
                                v = 0x7F0B0CA4;  // id:recent_selector_basic
                                View view7 = ViewBindings.a(view0, 0x7F0B0CA4);  // id:recent_selector_basic
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0CA5;  // id:recent_selector_container
                                    View view8 = ViewBindings.a(view0, 0x7F0B0CA5);  // id:recent_selector_container
                                    if(((LinearLayout)view8) != null) {
                                        v = 0x7F0B0CA6;  // id:recent_selector_favorite
                                        View view9 = ViewBindings.a(view0, 0x7F0B0CA6);  // id:recent_selector_favorite
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0CB5;  // id:recent_state
                                            View view10 = ViewBindings.a(view0, 0x7F0B0CB5);  // id:recent_state
                                            if(((StateAnnounceView)view10) != null) {
                                                return new f7(((FrameLayout)view0), ((ImageView)view1), ((MenuPageIndicator)view2), ((TextView)view3), ((RecyclerViewPager)view4), ((FrameLayout)view5), ((RecyclerView)view6), ((TextView)view7), ((LinearLayout)view8), ((TextView)view9), ((StateAnnounceView)view10));
                                            }
                                        }
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
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static f7 c(@NonNull LayoutInflater layoutInflater0) {
        return f7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E025D, viewGroup0, false);  // layout:view_recent_split
        if(z) {
            viewGroup0.addView(view0);
        }
        return f7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

