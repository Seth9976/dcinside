package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class w1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final Barrier b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final SwitchCompat g;
    @NonNull
    public final FrameLayout h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final ImageView j;
    @NonNull
    public final ProgressBar k;
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

    private w1(@NonNull ConstraintLayout constraintLayout0, @NonNull Barrier barrier0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull SwitchCompat switchCompat0, @NonNull FrameLayout frameLayout0, @NonNull ImageView imageView1, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar0, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull ConstraintLayout constraintLayout1) {
        this.a = constraintLayout0;
        this.b = barrier0;
        this.c = imageView0;
        this.d = textView0;
        this.e = textView1;
        this.f = textView2;
        this.g = switchCompat0;
        this.h = frameLayout0;
        this.i = imageView1;
        this.j = imageView2;
        this.k = progressBar0;
        this.l = textView3;
        this.m = textView4;
        this.n = textView5;
        this.o = textView6;
        this.p = textView7;
        this.q = constraintLayout1;
    }

    @NonNull
    public static w1 a(@NonNull View view0) {
        int v = 0x7F0B019A;  // id:best_galler_setting_barrier
        View view1 = ViewBindings.a(view0, 0x7F0B019A);  // id:best_galler_setting_barrier
        if(((Barrier)view1) != null) {
            v = 0x7F0B019B;  // id:best_galler_setting_close
            View view2 = ViewBindings.a(view0, 0x7F0B019B);  // id:best_galler_setting_close
            if(((ImageView)view2) != null) {
                v = 0x7F0B019C;  // id:best_galler_setting_content1
                View view3 = ViewBindings.a(view0, 0x7F0B019C);  // id:best_galler_setting_content1
                if(((TextView)view3) != null) {
                    v = 0x7F0B019D;  // id:best_galler_setting_content2
                    View view4 = ViewBindings.a(view0, 0x7F0B019D);  // id:best_galler_setting_content2
                    if(((TextView)view4) != null) {
                        v = 0x7F0B019E;  // id:best_galler_setting_date
                        View view5 = ViewBindings.a(view0, 0x7F0B019E);  // id:best_galler_setting_date
                        if(((TextView)view5) != null) {
                            v = 0x7F0B019F;  // id:best_galler_setting_enable
                            View view6 = ViewBindings.a(view0, 0x7F0B019F);  // id:best_galler_setting_enable
                            if(((SwitchCompat)view6) != null) {
                                v = 0x7F0B01A0;  // id:best_galler_setting_enable_wrapper
                                View view7 = ViewBindings.a(view0, 0x7F0B01A0);  // id:best_galler_setting_enable_wrapper
                                if(((FrameLayout)view7) != null) {
                                    v = 0x7F0B01A1;  // id:best_galler_setting_galler_con
                                    View view8 = ViewBindings.a(view0, 0x7F0B01A1);  // id:best_galler_setting_galler_con
                                    if(((ImageView)view8) != null) {
                                        v = 0x7F0B01A2;  // id:best_galler_setting_icon
                                        View view9 = ViewBindings.a(view0, 0x7F0B01A2);  // id:best_galler_setting_icon
                                        if(((ImageView)view9) != null) {
                                            v = 0x7F0B01A3;  // id:best_galler_setting_progress
                                            View view10 = ViewBindings.a(view0, 0x7F0B01A3);  // id:best_galler_setting_progress
                                            if(((ProgressBar)view10) != null) {
                                                v = 0x7F0B01A4;  // id:best_galler_setting_title1
                                                View view11 = ViewBindings.a(view0, 0x7F0B01A4);  // id:best_galler_setting_title1
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B01A5;  // id:best_galler_setting_title2
                                                    View view12 = ViewBindings.a(view0, 0x7F0B01A5);  // id:best_galler_setting_title2
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B01A6;  // id:best_galler_setting_title3
                                                        View view13 = ViewBindings.a(view0, 0x7F0B01A6);  // id:best_galler_setting_title3
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B01A7;  // id:best_galler_setting_title4
                                                            View view14 = ViewBindings.a(view0, 0x7F0B01A7);  // id:best_galler_setting_title4
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B01A8;  // id:best_galler_setting_use
                                                                View view15 = ViewBindings.a(view0, 0x7F0B01A8);  // id:best_galler_setting_use
                                                                if(((TextView)view15) != null) {
                                                                    v = 0x7F0B01A9;  // id:best_galler_setting_use_wrapper
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B01A9);  // id:best_galler_setting_use_wrapper
                                                                    if(((ConstraintLayout)view16) != null) {
                                                                        return new w1(((ConstraintLayout)view0), ((Barrier)view1), ((ImageView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((SwitchCompat)view6), ((FrameLayout)view7), ((ImageView)view8), ((ImageView)view9), ((ProgressBar)view10), ((TextView)view11), ((TextView)view12), ((TextView)view13), ((TextView)view14), ((TextView)view15), ((ConstraintLayout)view16));
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
    public static w1 c(@NonNull LayoutInflater layoutInflater0) {
        return w1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D6, viewGroup0, false);  // layout:dialog_fragment_setting_best_gallercon
        if(z) {
            viewGroup0.addView(view0);
        }
        return w1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

