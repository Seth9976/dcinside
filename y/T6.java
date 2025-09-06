package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ResizeTextView;
import com.dcinside.app.view.TailTextView;

public final class t6 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ResizeTextView b;
    @NonNull
    public final ResizeTextView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ResizeTextView e;
    @NonNull
    public final ImageView f;
    @NonNull
    public final ImageView g;
    @NonNull
    public final TailTextView h;
    @NonNull
    public final ConstraintLayout i;

    private t6(@NonNull ConstraintLayout constraintLayout0, @NonNull ResizeTextView resizeTextView0, @NonNull ResizeTextView resizeTextView1, @NonNull ImageView imageView0, @NonNull ResizeTextView resizeTextView2, @NonNull ImageView imageView1, @NonNull ImageView imageView2, @NonNull TailTextView tailTextView0, @NonNull ConstraintLayout constraintLayout1) {
        this.a = constraintLayout0;
        this.b = resizeTextView0;
        this.c = resizeTextView1;
        this.d = imageView0;
        this.e = resizeTextView2;
        this.f = imageView1;
        this.g = imageView2;
        this.h = tailTextView0;
        this.i = constraintLayout1;
    }

    @NonNull
    public static t6 a(@NonNull View view0) {
        int v = 0x7F0B0A97;  // id:post_list_thumbnail_date
        View view1 = ViewBindings.a(view0, 0x7F0B0A97);  // id:post_list_thumbnail_date
        if(((ResizeTextView)view1) != null) {
            v = 0x7F0B0A98;  // id:post_list_thumbnail_gallery_name
            View view2 = ViewBindings.a(view0, 0x7F0B0A98);  // id:post_list_thumbnail_gallery_name
            if(((ResizeTextView)view2) != null) {
                v = 0x7F0B0A99;  // id:post_list_thumbnail_member_ic
                View view3 = ViewBindings.a(view0, 0x7F0B0A99);  // id:post_list_thumbnail_member_ic
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0A9A;  // id:post_list_thumbnail_nic
                    View view4 = ViewBindings.a(view0, 0x7F0B0A9A);  // id:post_list_thumbnail_nic
                    if(((ResizeTextView)view4) != null) {
                        v = 0x7F0B0A9B;  // id:post_list_thumbnail_slide_bar
                        View view5 = ViewBindings.a(view0, 0x7F0B0A9B);  // id:post_list_thumbnail_slide_bar
                        if(((ImageView)view5) != null) {
                            v = 0x7F0B0A9C;  // id:post_list_thumbnail_thumbnail
                            View view6 = ViewBindings.a(view0, 0x7F0B0A9C);  // id:post_list_thumbnail_thumbnail
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B0A9D;  // id:post_list_thumbnail_title
                                View view7 = ViewBindings.a(view0, 0x7F0B0A9D);  // id:post_list_thumbnail_title
                                if(((TailTextView)view7) != null) {
                                    return new t6(((ConstraintLayout)view0), ((ResizeTextView)view1), ((ResizeTextView)view2), ((ImageView)view3), ((ResizeTextView)view4), ((ImageView)view5), ((ImageView)view6), ((TailTextView)view7), ((ConstraintLayout)view0));
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
    public static t6 c(@NonNull LayoutInflater layoutInflater0) {
        return t6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0237, viewGroup0, false);  // layout:view_post_list_thumbnail_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return t6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

