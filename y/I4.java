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

public final class i4 implements ViewBinding {
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
    public final ImageView g;
    @NonNull
    public final View h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final TextView k;
    @NonNull
    public final TextView l;
    @NonNull
    public final TextView m;
    @NonNull
    public final TextView n;
    @NonNull
    public final TextView o;
    @NonNull
    public final TextView p;
    @NonNull
    public final ConstraintLayout q;

    private i4(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull ImageView imageView0, @NonNull View view5, @NonNull ImageView imageView1, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout1) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = view1;
        this.d = view2;
        this.e = view3;
        this.f = view4;
        this.g = imageView0;
        this.h = view5;
        this.i = imageView1;
        this.j = textView0;
        this.k = textView1;
        this.l = textView2;
        this.m = textView3;
        this.n = textView4;
        this.o = textView5;
        this.p = textView6;
        this.q = constraintLayout1;
    }

    @NonNull
    public static i4 a(@NonNull View view0) {
        int v = 0x7F0B037E;  // id:def_ai_img_setting_border
        View view1 = ViewBindings.a(view0, 0x7F0B037E);  // id:def_ai_img_setting_border
        if(view1 != null) {
            v = 0x7F0B037F;  // id:def_ai_img_setting_border_bottom
            View view2 = ViewBindings.a(view0, 0x7F0B037F);  // id:def_ai_img_setting_border_bottom
            if(view2 != null) {
                v = 0x7F0B0380;  // id:def_ai_img_setting_border_left
                View view3 = ViewBindings.a(view0, 0x7F0B0380);  // id:def_ai_img_setting_border_left
                if(view3 != null) {
                    v = 0x7F0B0381;  // id:def_ai_img_setting_border_right
                    View view4 = ViewBindings.a(view0, 0x7F0B0381);  // id:def_ai_img_setting_border_right
                    if(view4 != null) {
                        v = 0x7F0B0382;  // id:def_ai_img_setting_border_top
                        View view5 = ViewBindings.a(view0, 0x7F0B0382);  // id:def_ai_img_setting_border_top
                        if(view5 != null) {
                            v = 0x7F0B0383;  // id:def_ai_img_setting_delete
                            View view6 = ViewBindings.a(view0, 0x7F0B0383);  // id:def_ai_img_setting_delete
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B0384;  // id:def_ai_img_setting_fore
                                View view7 = ViewBindings.a(view0, 0x7F0B0384);  // id:def_ai_img_setting_fore
                                if(view7 != null) {
                                    v = 0x7F0B0385;  // id:def_ai_img_setting_icon
                                    View view8 = ViewBindings.a(view0, 0x7F0B0385);  // id:def_ai_img_setting_icon
                                    if(((ImageView)view8) != null) {
                                        v = 0x7F0B0386;  // id:def_ai_img_setting_lora
                                        View view9 = ViewBindings.a(view0, 0x7F0B0386);  // id:def_ai_img_setting_lora
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0387;  // id:def_ai_img_setting_model
                                            View view10 = ViewBindings.a(view0, 0x7F0B0387);  // id:def_ai_img_setting_model
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0388;  // id:def_ai_img_setting_modify
                                                View view11 = ViewBindings.a(view0, 0x7F0B0388);  // id:def_ai_img_setting_modify
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B0389;  // id:def_ai_img_setting_neg_prompts
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0389);  // id:def_ai_img_setting_neg_prompts
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B038A;  // id:def_ai_img_setting_picked
                                                        View view13 = ViewBindings.a(view0, 0x7F0B038A);  // id:def_ai_img_setting_picked
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B038B;  // id:def_ai_img_setting_prompts
                                                            View view14 = ViewBindings.a(view0, 0x7F0B038B);  // id:def_ai_img_setting_prompts
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B038C;  // id:def_ai_img_setting_sampling
                                                                View view15 = ViewBindings.a(view0, 0x7F0B038C);  // id:def_ai_img_setting_sampling
                                                                if(((TextView)view15) != null) {
                                                                    v = 0x7F0B038D;  // id:def_ai_img_setting_wrap
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B038D);  // id:def_ai_img_setting_wrap
                                                                    if(((ConstraintLayout)view16) != null) {
                                                                        return new i4(((ConstraintLayout)view0), view1, view2, view3, view4, view5, ((ImageView)view6), view7, ((ImageView)view8), ((TextView)view9), ((TextView)view10), ((TextView)view11), ((TextView)view12), ((TextView)view13), ((TextView)view14), ((TextView)view15), ((ConstraintLayout)view16));
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
    public static i4 c(@NonNull LayoutInflater layoutInflater0) {
        return i4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static i4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C4, viewGroup0, false);  // layout:view_def_img_ai_image
        if(z) {
            viewGroup0.addView(view0);
        }
        return i4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

