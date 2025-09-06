package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.post.gui.ListTabItemView;

public final class s6 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ListTabItemView b;
    @NonNull
    public final ListTabItemView c;
    @NonNull
    public final ListTabItemView d;
    @NonNull
    public final ListTabItemView e;
    @NonNull
    public final ListTabItemView f;

    private s6(@NonNull LinearLayout linearLayout0, @NonNull ListTabItemView listTabItemView0, @NonNull ListTabItemView listTabItemView1, @NonNull ListTabItemView listTabItemView2, @NonNull ListTabItemView listTabItemView3, @NonNull ListTabItemView listTabItemView4) {
        this.a = linearLayout0;
        this.b = listTabItemView0;
        this.c = listTabItemView1;
        this.d = listTabItemView2;
        this.e = listTabItemView3;
        this.f = listTabItemView4;
    }

    @NonNull
    public static s6 a(@NonNull View view0) {
        int v = 0x7F0B0700;  // id:list_go_home
        View view1 = ViewBindings.a(view0, 0x7F0B0700);  // id:list_go_home
        if(((ListTabItemView)view1) != null) {
            v = 0x7F0B0716;  // id:list_notice
            View view2 = ViewBindings.a(view0, 0x7F0B0716);  // id:list_notice
            if(((ListTabItemView)view2) != null) {
                v = 0x7F0B071B;  // id:list_recommended
                View view3 = ViewBindings.a(view0, 0x7F0B071B);  // id:list_recommended
                if(((ListTabItemView)view3) != null) {
                    v = 0x7F0B071E;  // id:list_search
                    View view4 = ViewBindings.a(view0, 0x7F0B071E);  // id:list_search
                    if(((ListTabItemView)view4) != null) {
                        v = 0x7F0B0725;  // id:list_write
                        View view5 = ViewBindings.a(view0, 0x7F0B0725);  // id:list_write
                        if(((ListTabItemView)view5) != null) {
                            return new s6(((LinearLayout)view0), ((ListTabItemView)view1), ((ListTabItemView)view2), ((ListTabItemView)view3), ((ListTabItemView)view4), ((ListTabItemView)view5));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static s6 c(@NonNull LayoutInflater layoutInflater0) {
        return s6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0236, viewGroup0, false);  // layout:view_post_list_tabs
        if(z) {
            viewGroup0.addView(view0);
        }
        return s6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

