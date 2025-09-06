package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class n1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final View d;
    @NonNull
    public final CheckBox e;
    @NonNull
    public final EditText f;
    @NonNull
    public final LinearLayout g;
    @NonNull
    public final CheckBox h;
    @NonNull
    public final EditText i;
    @NonNull
    public final RadioGroup j;
    @NonNull
    public final LinearLayout k;
    @NonNull
    public final CheckBox l;
    @NonNull
    public final EditText m;
    @NonNull
    public final LinearLayout n;
    @NonNull
    public final TextView o;
    @NonNull
    public final RadioButton p;
    @NonNull
    public final RadioButton q;
    @NonNull
    public final RadioButton r;

    private n1(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull View view0, @NonNull CheckBox checkBox0, @NonNull EditText editText0, @NonNull LinearLayout linearLayout0, @NonNull CheckBox checkBox1, @NonNull EditText editText1, @NonNull RadioGroup radioGroup0, @NonNull LinearLayout linearLayout1, @NonNull CheckBox checkBox2, @NonNull EditText editText2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull RadioButton radioButton0, @NonNull RadioButton radioButton1, @NonNull RadioButton radioButton2) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = view0;
        this.e = checkBox0;
        this.f = editText0;
        this.g = linearLayout0;
        this.h = checkBox1;
        this.i = editText1;
        this.j = radioGroup0;
        this.k = linearLayout1;
        this.l = checkBox2;
        this.m = editText2;
        this.n = linearLayout2;
        this.o = textView2;
        this.p = radioButton0;
        this.q = radioButton1;
        this.r = radioButton2;
    }

    @NonNull
    public static n1 a(@NonNull View view0) {
        int v = 0x7F0B0A3D;  // id:post_filter_apply
        View view1 = ViewBindings.a(view0, 0x7F0B0A3D);  // id:post_filter_apply
        if(((TextView)view1) != null) {
            v = 0x7F0B0A3E;  // id:post_filter_cancel
            View view2 = ViewBindings.a(view0, 0x7F0B0A3E);  // id:post_filter_cancel
            if(((TextView)view2) != null) {
                v = 0x7F0B0A3F;  // id:post_filter_divider
                View view3 = ViewBindings.a(view0, 0x7F0B0A3F);  // id:post_filter_divider
                if(view3 != null) {
                    v = 0x7F0B0A40;  // id:post_filter_hit
                    View view4 = ViewBindings.a(view0, 0x7F0B0A40);  // id:post_filter_hit
                    if(((CheckBox)view4) != null) {
                        v = 0x7F0B0A41;  // id:post_filter_hit_count
                        View view5 = ViewBindings.a(view0, 0x7F0B0A41);  // id:post_filter_hit_count
                        if(((EditText)view5) != null) {
                            v = 0x7F0B0A42;  // id:post_filter_hit_wrap
                            View view6 = ViewBindings.a(view0, 0x7F0B0A42);  // id:post_filter_hit_wrap
                            if(((LinearLayout)view6) != null) {
                                v = 0x7F0B0A43;  // id:post_filter_like
                                View view7 = ViewBindings.a(view0, 0x7F0B0A43);  // id:post_filter_like
                                if(((CheckBox)view7) != null) {
                                    v = 0x7F0B0A44;  // id:post_filter_like_count
                                    View view8 = ViewBindings.a(view0, 0x7F0B0A44);  // id:post_filter_like_count
                                    if(((EditText)view8) != null) {
                                        v = 0x7F0B0A45;  // id:post_filter_post_type
                                        View view9 = ViewBindings.a(view0, 0x7F0B0A45);  // id:post_filter_post_type
                                        if(((RadioGroup)view9) != null) {
                                            v = 0x7F0B0A46;  // id:post_filter_recommend_wrap
                                            View view10 = ViewBindings.a(view0, 0x7F0B0A46);  // id:post_filter_recommend_wrap
                                            if(((LinearLayout)view10) != null) {
                                                v = 0x7F0B0A47;  // id:post_filter_reply
                                                View view11 = ViewBindings.a(view0, 0x7F0B0A47);  // id:post_filter_reply
                                                if(((CheckBox)view11) != null) {
                                                    v = 0x7F0B0A48;  // id:post_filter_reply_count
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0A48);  // id:post_filter_reply_count
                                                    if(((EditText)view12) != null) {
                                                        v = 0x7F0B0A49;  // id:post_filter_reply_wrap
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0A49);  // id:post_filter_reply_wrap
                                                        if(((LinearLayout)view13) != null) {
                                                            v = 0x7F0B0A4A;  // id:post_filter_title
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0A4A);  // id:post_filter_title
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B0B34;  // id:post_type_all
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0B34);  // id:post_type_all
                                                                if(((RadioButton)view15) != null) {
                                                                    v = 0x7F0B0B35;  // id:post_type_read
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0B35);  // id:post_type_read
                                                                    if(((RadioButton)view16) != null) {
                                                                        v = 0x7F0B0B36;  // id:post_type_unread
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0B36);  // id:post_type_unread
                                                                        if(((RadioButton)view17) != null) {
                                                                            return new n1(((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), view3, ((CheckBox)view4), ((EditText)view5), ((LinearLayout)view6), ((CheckBox)view7), ((EditText)view8), ((RadioGroup)view9), ((LinearLayout)view10), ((CheckBox)view11), ((EditText)view12), ((LinearLayout)view13), ((TextView)view14), ((RadioButton)view15), ((RadioButton)view16), ((RadioButton)view17));
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
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static n1 c(@NonNull LayoutInflater layoutInflater0) {
        return n1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static n1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00CD, viewGroup0, false);  // layout:dialog_fragment_post_filter
        if(z) {
            viewGroup0.addView(view0);
        }
        return n1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

