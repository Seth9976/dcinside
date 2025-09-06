package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;
import kr.better.widget.BetterTextView;

public final class g implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final AppCompatCheckBox b;
    @NonNull
    public final TextView c;
    @NonNull
    public final LinearLayout d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final ClearableEditText f;
    @NonNull
    public final ImageView g;
    @NonNull
    public final Button h;
    @NonNull
    public final LinearLayout i;
    @NonNull
    public final TextView j;
    @NonNull
    public final TextView k;
    @NonNull
    public final BetterTextView l;
    @NonNull
    public final ClearableEditText m;
    @NonNull
    public final TextView n;
    @NonNull
    public final TextView o;
    @NonNull
    public final ConstraintLayout p;
    @NonNull
    public final ClearableEditText q;
    @NonNull
    public final AppCompatCheckBox r;
    @NonNull
    public final DcToolbar s;

    private g(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull AppCompatCheckBox appCompatCheckBox0, @NonNull TextView textView0, @NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull ClearableEditText clearableEditText0, @NonNull ImageView imageView1, @NonNull Button button0, @NonNull LinearLayout linearLayout1, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull BetterTextView betterTextView0, @NonNull ClearableEditText clearableEditText1, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout0, @NonNull ClearableEditText clearableEditText2, @NonNull AppCompatCheckBox appCompatCheckBox1, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = appCompatCheckBox0;
        this.c = textView0;
        this.d = linearLayout0;
        this.e = imageView0;
        this.f = clearableEditText0;
        this.g = imageView1;
        this.h = button0;
        this.i = linearLayout1;
        this.j = textView1;
        this.k = textView2;
        this.l = betterTextView0;
        this.m = clearableEditText1;
        this.n = textView3;
        this.o = textView4;
        this.p = constraintLayout0;
        this.q = clearableEditText2;
        this.r = appCompatCheckBox1;
        this.s = dcToolbar0;
    }

    @NonNull
    public static g a(@NonNull View view0) {
        int v = 0x7F0B0736;  // id:login_auto
        View view1 = ViewBindings.a(view0, 0x7F0B0736);  // id:login_auto
        if(((AppCompatCheckBox)view1) != null) {
            v = 0x7F0B0737;  // id:login_caution
            View view2 = ViewBindings.a(view0, 0x7F0B0737);  // id:login_caution
            if(((TextView)view2) != null) {
                v = 0x7F0B0738;  // id:login_code
                View view3 = ViewBindings.a(view0, 0x7F0B0738);  // id:login_code
                if(((LinearLayout)view3) != null) {
                    v = 0x7F0B0739;  // id:login_code_image
                    View view4 = ViewBindings.a(view0, 0x7F0B0739);  // id:login_code_image
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B073A;  // id:login_code_input
                        View view5 = ViewBindings.a(view0, 0x7F0B073A);  // id:login_code_input
                        if(((ClearableEditText)view5) != null) {
                            v = 0x7F0B073B;  // id:login_code_refresh
                            View view6 = ViewBindings.a(view0, 0x7F0B073B);  // id:login_code_refresh
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B073C;  // id:login_confirm
                                View view7 = ViewBindings.a(view0, 0x7F0B073C);  // id:login_confirm
                                if(((Button)view7) != null) {
                                    v = 0x7F0B073D;  // id:login_container
                                    View view8 = ViewBindings.a(view0, 0x7F0B073D);  // id:login_container
                                    if(((LinearLayout)view8) != null) {
                                        v = 0x7F0B073E;  // id:login_find_id
                                        View view9 = ViewBindings.a(view0, 0x7F0B073E);  // id:login_find_id
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B073F;  // id:login_find_pw
                                            View view10 = ViewBindings.a(view0, 0x7F0B073F);  // id:login_find_pw
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0740;  // id:login_id_change_guide
                                                View view11 = ViewBindings.a(view0, 0x7F0B0740);  // id:login_id_change_guide
                                                if(((BetterTextView)view11) != null) {
                                                    v = 0x7F0B0741;  // id:login_id_edt
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0741);  // id:login_id_edt
                                                    if(((ClearableEditText)view12) != null) {
                                                        v = 0x7F0B074F;  // id:login_join
                                                        View view13 = ViewBindings.a(view0, 0x7F0B074F);  // id:login_join
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B0750;  // id:login_otp_desc
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0750);  // id:login_otp_desc
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B0751;  // id:login_progress
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0751);  // id:login_progress
                                                                if(((ConstraintLayout)view15) != null) {
                                                                    v = 0x7F0B0752;  // id:login_pw_edt
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0752);  // id:login_pw_edt
                                                                    if(((ClearableEditText)view16) != null) {
                                                                        v = 0x7F0B0753;  // id:login_simple
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0753);  // id:login_simple
                                                                        if(((AppCompatCheckBox)view17) != null) {
                                                                            v = 0x7F0B0754;  // id:login_toolbar
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0754);  // id:login_toolbar
                                                                            if(((DcToolbar)view18) != null) {
                                                                                return new g(((CoordinatorLayout)view0), ((AppCompatCheckBox)view1), ((TextView)view2), ((LinearLayout)view3), ((ImageView)view4), ((ClearableEditText)view5), ((ImageView)view6), ((Button)view7), ((LinearLayout)view8), ((TextView)view9), ((TextView)view10), ((BetterTextView)view11), ((ClearableEditText)view12), ((TextView)view13), ((TextView)view14), ((ConstraintLayout)view15), ((ClearableEditText)view16), ((AppCompatCheckBox)view17), ((DcToolbar)view18));
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
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater0) {
        return g.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0022, viewGroup0, false);  // layout:activity_auth
        if(z) {
            viewGroup0.addView(view0);
        }
        return g.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

