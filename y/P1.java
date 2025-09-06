package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class p1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final SwitchCompat c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final LinearLayout e;
    @NonNull
    public final SwitchCompat f;
    @NonNull
    public final CardView g;
    @NonNull
    public final ProgressBar h;
    @NonNull
    public final TextView i;
    @NonNull
    public final ImageView j;
    @NonNull
    public final ConstraintLayout k;
    @NonNull
    public final TextView l;
    @NonNull
    public final LinearLayout m;
    @NonNull
    public final SwitchCompat n;
    @NonNull
    public final ConstraintLayout o;

    private p1(@NonNull ConstraintLayout constraintLayout0, @NonNull LinearLayout linearLayout0, @NonNull SwitchCompat switchCompat0, @NonNull ImageView imageView0, @NonNull LinearLayout linearLayout1, @NonNull SwitchCompat switchCompat1, @NonNull CardView cardView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView0, @NonNull ImageView imageView1, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView1, @NonNull LinearLayout linearLayout2, @NonNull SwitchCompat switchCompat2, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = linearLayout0;
        this.c = switchCompat0;
        this.d = imageView0;
        this.e = linearLayout1;
        this.f = switchCompat1;
        this.g = cardView0;
        this.h = progressBar0;
        this.i = textView0;
        this.j = imageView1;
        this.k = constraintLayout1;
        this.l = textView1;
        this.m = linearLayout2;
        this.n = switchCompat2;
        this.o = constraintLayout2;
    }

    @NonNull
    public static p1 a(@NonNull View view0) {
        int v = 0x7F0B0AA0;  // id:post_push_setting_article
        View view1 = ViewBindings.a(view0, 0x7F0B0AA0);  // id:post_push_setting_article
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0AA1;  // id:post_push_setting_article_enable
            View view2 = ViewBindings.a(view0, 0x7F0B0AA1);  // id:post_push_setting_article_enable
            if(((SwitchCompat)view2) != null) {
                v = 0x7F0B0AA2;  // id:post_push_setting_close
                View view3 = ViewBindings.a(view0, 0x7F0B0AA2);  // id:post_push_setting_close
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0AA3;  // id:post_push_setting_my_post
                    View view4 = ViewBindings.a(view0, 0x7F0B0AA3);  // id:post_push_setting_my_post
                    if(((LinearLayout)view4) != null) {
                        v = 0x7F0B0AA4;  // id:post_push_setting_my_post_enable
                        View view5 = ViewBindings.a(view0, 0x7F0B0AA4);  // id:post_push_setting_my_post_enable
                        if(((SwitchCompat)view5) != null) {
                            v = 0x7F0B0AA5;  // id:post_push_setting_parent
                            View view6 = ViewBindings.a(view0, 0x7F0B0AA5);  // id:post_push_setting_parent
                            if(((CardView)view6) != null) {
                                v = 0x7F0B0AA6;  // id:post_push_setting_progress
                                View view7 = ViewBindings.a(view0, 0x7F0B0AA6);  // id:post_push_setting_progress
                                if(((ProgressBar)view7) != null) {
                                    v = 0x7F0B0AA7;  // id:post_push_setting_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B0AA7);  // id:post_push_setting_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0AA8;  // id:post_push_setting_title_icon
                                        View view9 = ViewBindings.a(view0, 0x7F0B0AA8);  // id:post_push_setting_title_icon
                                        if(((ImageView)view9) != null) {
                                            v = 0x7F0B0AA9;  // id:post_push_setting_toast
                                            View view10 = ViewBindings.a(view0, 0x7F0B0AA9);  // id:post_push_setting_toast
                                            if(((ConstraintLayout)view10) != null) {
                                                v = 0x7F0B0AAA;  // id:post_push_setting_toast_text
                                                View view11 = ViewBindings.a(view0, 0x7F0B0AAA);  // id:post_push_setting_toast_text
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B0AAB;  // id:post_push_setting_user
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0AAB);  // id:post_push_setting_user
                                                    if(((LinearLayout)view12) != null) {
                                                        v = 0x7F0B0AAC;  // id:post_push_setting_user_enable
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0AAC);  // id:post_push_setting_user_enable
                                                        if(((SwitchCompat)view13) != null) {
                                                            return new p1(((ConstraintLayout)view0), ((LinearLayout)view1), ((SwitchCompat)view2), ((ImageView)view3), ((LinearLayout)view4), ((SwitchCompat)view5), ((CardView)view6), ((ProgressBar)view7), ((TextView)view8), ((ImageView)view9), ((ConstraintLayout)view10), ((TextView)view11), ((LinearLayout)view12), ((SwitchCompat)view13), ((ConstraintLayout)view0));
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
    public static p1 c(@NonNull LayoutInflater layoutInflater0) {
        return p1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static p1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00CF, viewGroup0, false);  // layout:dialog_fragment_post_push_setting
        if(z) {
            viewGroup0.addView(view0);
        }
        return p1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

