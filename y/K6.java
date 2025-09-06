package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.ResizeTextView;

public final class k6 implements ViewBinding {
    @NonNull
    private final DividerConstraintLayout a;
    @NonNull
    public final ResizeTextView b;
    @NonNull
    public final DividerConstraintLayout c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ResizeTextView e;
    @NonNull
    public final ResizeTextView f;
    @NonNull
    public final ResizeTextView g;
    @NonNull
    public final ImageView h;

    private k6(@NonNull DividerConstraintLayout dividerConstraintLayout0, @NonNull ResizeTextView resizeTextView0, @NonNull DividerConstraintLayout dividerConstraintLayout1, @NonNull ImageView imageView0, @NonNull ResizeTextView resizeTextView1, @NonNull ResizeTextView resizeTextView2, @NonNull ResizeTextView resizeTextView3, @NonNull ImageView imageView1) {
        this.a = dividerConstraintLayout0;
        this.b = resizeTextView0;
        this.c = dividerConstraintLayout1;
        this.d = imageView0;
        this.e = resizeTextView1;
        this.f = resizeTextView2;
        this.g = resizeTextView3;
        this.h = imageView1;
    }

    @NonNull
    public static k6 a(@NonNull View view0) {
        int v = 0x7F0B0A74;  // id:post_list_item_counts
        View view1 = ViewBindings.a(view0, 0x7F0B0A74);  // id:post_list_item_counts
        if(((ResizeTextView)view1) != null) {
            v = 0x7F0B0A76;  // id:post_list_item_member_ic
            View view2 = ViewBindings.a(view0, 0x7F0B0A76);  // id:post_list_item_member_ic
            if(((ImageView)view2) != null) {
                v = 0x7F0B0A7F;  // id:post_list_item_nic
                View view3 = ViewBindings.a(view0, 0x7F0B0A7F);  // id:post_list_item_nic
                if(((ResizeTextView)view3) != null) {
                    v = 0x7F0B0A87;  // id:post_list_item_time
                    View view4 = ViewBindings.a(view0, 0x7F0B0A87);  // id:post_list_item_time
                    if(((ResizeTextView)view4) != null) {
                        v = 0x7F0B0A88;  // id:post_list_item_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0A88);  // id:post_list_item_title
                        if(((ResizeTextView)view5) != null) {
                            v = 0x7F0B0A96;  // id:post_list_slide_bar
                            View view6 = ViewBindings.a(view0, 0x7F0B0A96);  // id:post_list_slide_bar
                            if(((ImageView)view6) != null) {
                                return new k6(((DividerConstraintLayout)view0), ((ResizeTextView)view1), ((DividerConstraintLayout)view0), ((ImageView)view2), ((ResizeTextView)view3), ((ResizeTextView)view4), ((ResizeTextView)view5), ((ImageView)view6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public DividerConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static k6 c(@NonNull LayoutInflater layoutInflater0) {
        return k6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E022E, viewGroup0, false);  // layout:view_post_list_item_basic
        if(z) {
            viewGroup0.addView(view0);
        }
        return k6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

