package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

public final class h4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final LinearLayout e;
    @NonNull
    public final ImageView f;
    @NonNull
    public final EditText g;
    @NonNull
    public final Button h;
    @NonNull
    public final TextView i;
    @NonNull
    public final ConstraintLayout j;
    @NonNull
    public final View k;
    @NonNull
    public final View l;
    @NonNull
    public final SimpleDraweeView m;
    @NonNull
    public final TextView n;

    private h4(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull TextView textView0, @NonNull LinearLayout linearLayout0, @NonNull ImageView imageView2, @NonNull EditText editText0, @NonNull Button button0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1, @NonNull View view0, @NonNull View view1, @NonNull SimpleDraweeView simpleDraweeView0, @NonNull TextView textView2) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = textView0;
        this.e = linearLayout0;
        this.f = imageView2;
        this.g = editText0;
        this.h = button0;
        this.i = textView1;
        this.j = constraintLayout1;
        this.k = view0;
        this.l = view1;
        this.m = simpleDraweeView0;
        this.n = textView2;
    }

    @NonNull
    public static h4 a(@NonNull View view0) {
        int v = 0x7F0B036A;  // id:dccon_tag_item_add
        View view1 = ViewBindings.a(view0, 0x7F0B036A);  // id:dccon_tag_item_add
        if(((ImageView)view1) != null) {
            v = 0x7F0B036B;  // id:dccon_tag_item_custom_remove
            View view2 = ViewBindings.a(view0, 0x7F0B036B);  // id:dccon_tag_item_custom_remove
            if(((ImageView)view2) != null) {
                v = 0x7F0B036C;  // id:dccon_tag_item_custom_tag
                View view3 = ViewBindings.a(view0, 0x7F0B036C);  // id:dccon_tag_item_custom_tag
                if(((TextView)view3) != null) {
                    v = 0x7F0B036D;  // id:dccon_tag_item_custom_wrap
                    View view4 = ViewBindings.a(view0, 0x7F0B036D);  // id:dccon_tag_item_custom_wrap
                    if(((LinearLayout)view4) != null) {
                        v = 0x7F0B036E;  // id:dccon_tag_item_detail_img
                        View view5 = ViewBindings.a(view0, 0x7F0B036E);  // id:dccon_tag_item_detail_img
                        if(((ImageView)view5) != null) {
                            v = 0x7F0B036F;  // id:dccon_tag_item_detail_input
                            View view6 = ViewBindings.a(view0, 0x7F0B036F);  // id:dccon_tag_item_detail_input
                            if(((EditText)view6) != null) {
                                v = 0x7F0B0370;  // id:dccon_tag_item_detail_save
                                View view7 = ViewBindings.a(view0, 0x7F0B0370);  // id:dccon_tag_item_detail_save
                                if(((Button)view7) != null) {
                                    v = 0x7F0B0371;  // id:dccon_tag_item_detail_tag
                                    View view8 = ViewBindings.a(view0, 0x7F0B0371);  // id:dccon_tag_item_detail_tag
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0372;  // id:dccon_tag_item_detail_wrap
                                        View view9 = ViewBindings.a(view0, 0x7F0B0372);  // id:dccon_tag_item_detail_wrap
                                        if(((ConstraintLayout)view9) != null) {
                                            v = 0x7F0B0373;  // id:dccon_tag_item_div_0
                                            View view10 = ViewBindings.a(view0, 0x7F0B0373);  // id:dccon_tag_item_div_0
                                            if(view10 != null) {
                                                v = 0x7F0B0374;  // id:dccon_tag_item_div_1
                                                View view11 = ViewBindings.a(view0, 0x7F0B0374);  // id:dccon_tag_item_div_1
                                                if(view11 != null) {
                                                    v = 0x7F0B0375;  // id:dccon_tag_item_img
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0375);  // id:dccon_tag_item_img
                                                    if(((SimpleDraweeView)view12) != null) {
                                                        v = 0x7F0B0376;  // id:dccon_tag_item_tag
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0376);  // id:dccon_tag_item_tag
                                                        if(((TextView)view13) != null) {
                                                            return new h4(((ConstraintLayout)view0), ((ImageView)view1), ((ImageView)view2), ((TextView)view3), ((LinearLayout)view4), ((ImageView)view5), ((EditText)view6), ((Button)view7), ((TextView)view8), ((ConstraintLayout)view9), view10, view11, ((SimpleDraweeView)view12), ((TextView)view13));
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
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static h4 c(@NonNull LayoutInflater layoutInflater0) {
        return h4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static h4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C3, viewGroup0, false);  // layout:view_dccon_tag_setting_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return h4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

