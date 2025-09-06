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

public final class m4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final ImageView f;
    @NonNull
    public final View g;
    @NonNull
    public final TextView h;

    private m4(@NonNull ConstraintLayout constraintLayout0, @NonNull FrameLayout frameLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull ImageView imageView1, @NonNull View view0, @NonNull TextView textView1) {
        this.a = constraintLayout0;
        this.b = frameLayout0;
        this.c = constraintLayout1;
        this.d = imageView0;
        this.e = textView0;
        this.f = imageView1;
        this.g = view0;
        this.h = textView1;
    }

    @NonNull
    public static m4 a(@NonNull View view0) {
        int v = 0x7F0B03B1;  // id:def_img_setting_old_add
        View view1 = ViewBindings.a(view0, 0x7F0B03B1);  // id:def_img_setting_old_add
        if(((FrameLayout)view1) != null) {
            v = 0x7F0B03B3;  // id:def_img_setting_old_delete
            View view2 = ViewBindings.a(view0, 0x7F0B03B3);  // id:def_img_setting_old_delete
            if(((ImageView)view2) != null) {
                v = 0x7F0B03B4;  // id:def_img_setting_old_desc
                View view3 = ViewBindings.a(view0, 0x7F0B03B4);  // id:def_img_setting_old_desc
                if(((TextView)view3) != null) {
                    v = 0x7F0B03B5;  // id:def_img_setting_old_image
                    View view4 = ViewBindings.a(view0, 0x7F0B03B5);  // id:def_img_setting_old_image
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B03B6;  // id:def_img_setting_old_image_fore
                        View view5 = ViewBindings.a(view0, 0x7F0B03B6);  // id:def_img_setting_old_image_fore
                        if(view5 != null) {
                            v = 0x7F0B03B7;  // id:def_img_setting_old_title
                            View view6 = ViewBindings.a(view0, 0x7F0B03B7);  // id:def_img_setting_old_title
                            if(((TextView)view6) != null) {
                                return new m4(((ConstraintLayout)view0), ((FrameLayout)view1), ((ConstraintLayout)view0), ((ImageView)view2), ((TextView)view3), ((ImageView)view4), view5, ((TextView)view6));
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
    public static m4 c(@NonNull LayoutInflater layoutInflater0) {
        return m4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static m4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C8, viewGroup0, false);  // layout:view_def_img_item_old
        if(z) {
            viewGroup0.addView(view0);
        }
        return m4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

