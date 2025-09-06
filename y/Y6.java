package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class y6 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final AppCompatSpinner e;
    @NonNull
    public final AppCompatImageView f;
    @NonNull
    public final AppCompatSpinner g;
    @NonNull
    public final AppCompatImageView h;
    @NonNull
    public final ProgressBar i;
    @NonNull
    public final TextView j;
    @NonNull
    public final CheckBox k;
    @NonNull
    public final AppCompatSpinner l;
    @NonNull
    public final AppCompatImageView m;

    private y6(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull AppCompatSpinner appCompatSpinner0, @NonNull AppCompatImageView appCompatImageView0, @NonNull AppCompatSpinner appCompatSpinner1, @NonNull AppCompatImageView appCompatImageView1, @NonNull ProgressBar progressBar0, @NonNull TextView textView1, @NonNull CheckBox checkBox0, @NonNull AppCompatSpinner appCompatSpinner2, @NonNull AppCompatImageView appCompatImageView2) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = imageView0;
        this.d = textView0;
        this.e = appCompatSpinner0;
        this.f = appCompatImageView0;
        this.g = appCompatSpinner1;
        this.h = appCompatImageView1;
        this.i = progressBar0;
        this.j = textView1;
        this.k = checkBox0;
        this.l = appCompatSpinner2;
        this.m = appCompatImageView2;
    }

    @NonNull
    public static y6 a(@NonNull View view0) {
        int v = 0x7F0B0AF4;  // id:post_search_calendar
        View view1 = ViewBindings.a(view0, 0x7F0B0AF4);  // id:post_search_calendar
        if(((ConstraintLayout)view1) != null) {
            v = 0x7F0B0AF5;  // id:post_search_calendar_icon
            View view2 = ViewBindings.a(view0, 0x7F0B0AF5);  // id:post_search_calendar_icon
            if(((ImageView)view2) != null) {
                v = 0x7F0B0AFA;  // id:post_search_date
                View view3 = ViewBindings.a(view0, 0x7F0B0AFA);  // id:post_search_date
                if(((TextView)view3) != null) {
                    v = 0x7F0B0AFC;  // id:post_search_gallery
                    View view4 = ViewBindings.a(view0, 0x7F0B0AFC);  // id:post_search_gallery
                    if(((AppCompatSpinner)view4) != null) {
                        v = 0x7F0B0AFD;  // id:post_search_gallery_ic
                        View view5 = ViewBindings.a(view0, 0x7F0B0AFD);  // id:post_search_gallery_ic
                        if(((AppCompatImageView)view5) != null) {
                            v = 0x7F0B0AFE;  // id:post_search_head
                            View view6 = ViewBindings.a(view0, 0x7F0B0AFE);  // id:post_search_head
                            if(((AppCompatSpinner)view6) != null) {
                                v = 0x7F0B0AFF;  // id:post_search_head_ic
                                View view7 = ViewBindings.a(view0, 0x7F0B0AFF);  // id:post_search_head_ic
                                if(((AppCompatImageView)view7) != null) {
                                    v = 0x7F0B0B00;  // id:post_search_head_progress
                                    View view8 = ViewBindings.a(view0, 0x7F0B0B00);  // id:post_search_head_progress
                                    if(((ProgressBar)view8) != null) {
                                        v = 0x7F0B0B01;  // id:post_search_head_status
                                        View view9 = ViewBindings.a(view0, 0x7F0B0B01);  // id:post_search_head_status
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0B05;  // id:post_search_recommended
                                            View view10 = ViewBindings.a(view0, 0x7F0B0B05);  // id:post_search_recommended
                                            if(((CheckBox)view10) != null) {
                                                v = 0x7F0B0B09;  // id:post_search_type
                                                View view11 = ViewBindings.a(view0, 0x7F0B0B09);  // id:post_search_type
                                                if(((AppCompatSpinner)view11) != null) {
                                                    v = 0x7F0B0B0A;  // id:post_search_type_ic
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0B0A);  // id:post_search_type_ic
                                                    if(((AppCompatImageView)view12) != null) {
                                                        return new y6(((ConstraintLayout)view0), ((ConstraintLayout)view1), ((ImageView)view2), ((TextView)view3), ((AppCompatSpinner)view4), ((AppCompatImageView)view5), ((AppCompatSpinner)view6), ((AppCompatImageView)view7), ((ProgressBar)view8), ((TextView)view9), ((CheckBox)view10), ((AppCompatSpinner)view11), ((AppCompatImageView)view12));
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
    public static y6 c(@NonNull LayoutInflater layoutInflater0) {
        return y6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E023C, viewGroup0, false);  // layout:view_post_search_head
        if(z) {
            viewGroup0.addView(view0);
        }
        return y6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

