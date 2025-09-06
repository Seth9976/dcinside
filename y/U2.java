package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class u2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final RadioButton g;
    @NonNull
    public final TextView h;
    @NonNull
    public final ConstraintLayout i;
    @NonNull
    public final RadioButton j;
    @NonNull
    public final TextView k;
    @NonNull
    public final ConstraintLayout l;
    @NonNull
    public final ConstraintLayout m;
    @NonNull
    public final TextView n;
    @NonNull
    public final TextView o;
    @NonNull
    public final ConstraintLayout p;

    private u2(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView0, @NonNull TextView textView2, @NonNull RadioButton radioButton0, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2, @NonNull RadioButton radioButton1, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout5) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = constraintLayout1;
        this.e = imageView0;
        this.f = textView2;
        this.g = radioButton0;
        this.h = textView3;
        this.i = constraintLayout2;
        this.j = radioButton1;
        this.k = textView4;
        this.l = constraintLayout3;
        this.m = constraintLayout4;
        this.n = textView5;
        this.o = textView6;
        this.p = constraintLayout5;
    }

    @NonNull
    public static u2 a(@NonNull View view0) {
        int v = 0x7F0B0C08;  // id:quick_write_setting_guide_content
        View view1 = ViewBindings.a(view0, 0x7F0B0C08);  // id:quick_write_setting_guide_content
        if(((TextView)view1) != null) {
            v = 0x7F0B0C09;  // id:quick_write_setting_guide_desc
            View view2 = ViewBindings.a(view0, 0x7F0B0C09);  // id:quick_write_setting_guide_desc
            if(((TextView)view2) != null) {
                v = 0x7F0B0C0B;  // id:quick_write_setting_guide_icon
                View view3 = ViewBindings.a(view0, 0x7F0B0C0B);  // id:quick_write_setting_guide_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0C0C;  // id:quick_write_setting_guide_setting_confirm
                    View view4 = ViewBindings.a(view0, 0x7F0B0C0C);  // id:quick_write_setting_guide_setting_confirm
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0C0D;  // id:quick_write_setting_guide_setting_keep
                        View view5 = ViewBindings.a(view0, 0x7F0B0C0D);  // id:quick_write_setting_guide_setting_keep
                        if(((RadioButton)view5) != null) {
                            v = 0x7F0B0C0E;  // id:quick_write_setting_guide_setting_keep_text
                            View view6 = ViewBindings.a(view0, 0x7F0B0C0E);  // id:quick_write_setting_guide_setting_keep_text
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0C0F;  // id:quick_write_setting_guide_setting_keep_wrap
                                View view7 = ViewBindings.a(view0, 0x7F0B0C0F);  // id:quick_write_setting_guide_setting_keep_wrap
                                if(((ConstraintLayout)view7) != null) {
                                    v = 0x7F0B0C10;  // id:quick_write_setting_guide_setting_refresh
                                    View view8 = ViewBindings.a(view0, 0x7F0B0C10);  // id:quick_write_setting_guide_setting_refresh
                                    if(((RadioButton)view8) != null) {
                                        v = 0x7F0B0C11;  // id:quick_write_setting_guide_setting_refresh_text
                                        View view9 = ViewBindings.a(view0, 0x7F0B0C11);  // id:quick_write_setting_guide_setting_refresh_text
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0C12;  // id:quick_write_setting_guide_setting_refresh_wrap
                                            View view10 = ViewBindings.a(view0, 0x7F0B0C12);  // id:quick_write_setting_guide_setting_refresh_wrap
                                            if(((ConstraintLayout)view10) != null) {
                                                v = 0x7F0B0C13;  // id:quick_write_setting_guide_setting_wrap
                                                View view11 = ViewBindings.a(view0, 0x7F0B0C13);  // id:quick_write_setting_guide_setting_wrap
                                                if(((ConstraintLayout)view11) != null) {
                                                    v = 0x7F0B0C14;  // id:quick_write_setting_guide_title
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0C14);  // id:quick_write_setting_guide_title
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B0C15;  // id:quick_write_setting_guide_toast
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0C15);  // id:quick_write_setting_guide_toast
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B0C16;  // id:quick_write_setting_guide_wrap
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0C16);  // id:quick_write_setting_guide_wrap
                                                            if(((ConstraintLayout)view14) != null) {
                                                                return new u2(((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), ((ConstraintLayout)view0), ((ImageView)view3), ((TextView)view4), ((RadioButton)view5), ((TextView)view6), ((ConstraintLayout)view7), ((RadioButton)view8), ((TextView)view9), ((ConstraintLayout)view10), ((ConstraintLayout)view11), ((TextView)view12), ((TextView)view13), ((ConstraintLayout)view14));
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
    public static u2 c(@NonNull LayoutInflater layoutInflater0) {
        return u2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0115, viewGroup0, false);  // layout:fragment_quick_write_setting
        if(z) {
            viewGroup0.addView(view0);
        }
        return u2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

