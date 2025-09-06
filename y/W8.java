package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class w8 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final ImageView j;

    private w8(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull ImageView imageView4, @NonNull ImageView imageView5) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = imageView2;
        this.e = imageView3;
        this.f = textView0;
        this.g = textView1;
        this.h = textView2;
        this.i = imageView4;
        this.j = imageView5;
    }

    @NonNull
    public static w8 a(@NonNull View view0) {
        int v = 0x7F0B0FB1;  // id:total_search_gallery_item_block
        View view1 = ViewBindings.a(view0, 0x7F0B0FB1);  // id:total_search_gallery_item_block
        if(((ImageView)view1) != null) {
            v = 0x7F0B0FB2;  // id:total_search_gallery_item_certified_icon
            View view2 = ViewBindings.a(view0, 0x7F0B0FB2);  // id:total_search_gallery_item_certified_icon
            if(((ImageView)view2) != null) {
                v = 0x7F0B0FB3;  // id:total_search_gallery_item_mini_icon
                View view3 = ViewBindings.a(view0, 0x7F0B0FB3);  // id:total_search_gallery_item_mini_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0FB4;  // id:total_search_gallery_item_minor_icon
                    View view4 = ViewBindings.a(view0, 0x7F0B0FB4);  // id:total_search_gallery_item_minor_icon
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0FB5;  // id:total_search_gallery_item_profile
                        View view5 = ViewBindings.a(view0, 0x7F0B0FB5);  // id:total_search_gallery_item_profile
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0FB6;  // id:total_search_gallery_item_status
                            View view6 = ViewBindings.a(view0, 0x7F0B0FB6);  // id:total_search_gallery_item_status
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0FB7;  // id:total_search_gallery_item_text
                                View view7 = ViewBindings.a(view0, 0x7F0B0FB7);  // id:total_search_gallery_item_text
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0FB8;  // id:total_search_gallery_profile_error_img
                                    View view8 = ViewBindings.a(view0, 0x7F0B0FB8);  // id:total_search_gallery_profile_error_img
                                    if(((ImageView)view8) != null) {
                                        v = 0x7F0B0FB9;  // id:total_search_gallery_profile_img
                                        View view9 = ViewBindings.a(view0, 0x7F0B0FB9);  // id:total_search_gallery_profile_img
                                        if(((ImageView)view9) != null) {
                                            return new w8(((ConstraintLayout)view0), ((ImageView)view1), ((ImageView)view2), ((ImageView)view3), ((ImageView)view4), ((TextView)view5), ((TextView)view6), ((TextView)view7), ((ImageView)view8), ((ImageView)view9));
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
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static w8 c(@NonNull LayoutInflater layoutInflater0) {
        return w8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02A2, viewGroup0, false);  // layout:view_total_search_gallery_content
        if(z) {
            viewGroup0.addView(view0);
        }
        return w8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

