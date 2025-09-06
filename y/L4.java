package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class l4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final View c;
    @NonNull
    public final View d;
    @NonNull
    public final View e;
    @NonNull
    public final View f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final ImageView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final FrameLayout j;
    @NonNull
    public final View k;
    @NonNull
    public final ImageView l;
    @NonNull
    public final TextView m;

    private l4(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout0, @NonNull View view5, @NonNull ImageView imageView1, @NonNull TextView textView1) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = view1;
        this.d = view2;
        this.e = view3;
        this.f = view4;
        this.g = constraintLayout1;
        this.h = imageView0;
        this.i = textView0;
        this.j = frameLayout0;
        this.k = view5;
        this.l = imageView1;
        this.m = textView1;
    }

    @NonNull
    public static l4 a(@NonNull View view0) {
        int v = 0x7F0B03A0;  // id:def_img_setting_border
        View view1 = ViewBindings.a(view0, 0x7F0B03A0);  // id:def_img_setting_border
        if(view1 != null) {
            v = 0x7F0B03A1;  // id:def_img_setting_border_bottom
            View view2 = ViewBindings.a(view0, 0x7F0B03A1);  // id:def_img_setting_border_bottom
            if(view2 != null) {
                v = 0x7F0B03A2;  // id:def_img_setting_border_left
                View view3 = ViewBindings.a(view0, 0x7F0B03A2);  // id:def_img_setting_border_left
                if(view3 != null) {
                    v = 0x7F0B03A3;  // id:def_img_setting_border_right
                    View view4 = ViewBindings.a(view0, 0x7F0B03A3);  // id:def_img_setting_border_right
                    if(view4 != null) {
                        v = 0x7F0B03A4;  // id:def_img_setting_border_top
                        View view5 = ViewBindings.a(view0, 0x7F0B03A4);  // id:def_img_setting_border_top
                        if(view5 != null) {
                            v = 0x7F0B03A6;  // id:def_img_setting_delete
                            View view6 = ViewBindings.a(view0, 0x7F0B03A6);  // id:def_img_setting_delete
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B03A7;  // id:def_img_setting_desc
                                View view7 = ViewBindings.a(view0, 0x7F0B03A7);  // id:def_img_setting_desc
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B03A8;  // id:def_img_setting_detail
                                    View view8 = ViewBindings.a(view0, 0x7F0B03A8);  // id:def_img_setting_detail
                                    if(((FrameLayout)view8) != null) {
                                        v = 0x7F0B03A9;  // id:def_img_setting_fore
                                        View view9 = ViewBindings.a(view0, 0x7F0B03A9);  // id:def_img_setting_fore
                                        if(view9 != null) {
                                            v = 0x7F0B03AF;  // id:def_img_setting_image
                                            View view10 = ViewBindings.a(view0, 0x7F0B03AF);  // id:def_img_setting_image
                                            if(((ImageView)view10) != null) {
                                                v = 0x7F0B03B8;  // id:def_img_setting_picked
                                                View view11 = ViewBindings.a(view0, 0x7F0B03B8);  // id:def_img_setting_picked
                                                if(((TextView)view11) != null) {
                                                    return new l4(((ConstraintLayout)view0), view1, view2, view3, view4, view5, ((ConstraintLayout)view0), ((ImageView)view6), ((TextView)view7), ((FrameLayout)view8), view9, ((ImageView)view10), ((TextView)view11));
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
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static l4 c(@NonNull LayoutInflater layoutInflater0) {
        return l4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C7, viewGroup0, false);  // layout:view_def_img_item_img
        if(z) {
            viewGroup0.addView(view0);
        }
        return l4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

