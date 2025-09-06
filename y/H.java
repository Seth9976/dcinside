package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
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

public final class h implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final AppCompatCheckBox c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ClearableEditText e;
    @NonNull
    public final Button f;
    @NonNull
    public final TextView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final ProgressBar j;
    @NonNull
    public final DcToolbar k;

    private h(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ConstraintLayout constraintLayout0, @NonNull AppCompatCheckBox appCompatCheckBox0, @NonNull TextView textView0, @NonNull ClearableEditText clearableEditText0, @NonNull Button button0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ProgressBar progressBar0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = constraintLayout0;
        this.c = appCompatCheckBox0;
        this.d = textView0;
        this.e = clearableEditText0;
        this.f = button0;
        this.g = textView1;
        this.h = textView2;
        this.i = textView3;
        this.j = progressBar0;
        this.k = dcToolbar0;
    }

    @NonNull
    public static h a(@NonNull View view0) {
        int v = 0x7F0B0160;  // id:auth_second_otp
        View view1 = ViewBindings.a(view0, 0x7F0B0160);  // id:auth_second_otp
        if(((ConstraintLayout)view1) != null) {
            v = 0x7F0B0161;  // id:auth_second_otp_auto
            View view2 = ViewBindings.a(view0, 0x7F0B0161);  // id:auth_second_otp_auto
            if(((AppCompatCheckBox)view2) != null) {
                v = 0x7F0B0162;  // id:auth_second_otp_check
                View view3 = ViewBindings.a(view0, 0x7F0B0162);  // id:auth_second_otp_check
                if(((TextView)view3) != null) {
                    v = 0x7F0B0163;  // id:auth_second_otp_code
                    View view4 = ViewBindings.a(view0, 0x7F0B0163);  // id:auth_second_otp_code
                    if(((ClearableEditText)view4) != null) {
                        v = 0x7F0B0164;  // id:auth_second_otp_confirm
                        View view5 = ViewBindings.a(view0, 0x7F0B0164);  // id:auth_second_otp_confirm
                        if(((Button)view5) != null) {
                            v = 0x7F0B0165;  // id:auth_second_otp_desc
                            View view6 = ViewBindings.a(view0, 0x7F0B0165);  // id:auth_second_otp_desc
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0166;  // id:auth_second_otp_external
                                View view7 = ViewBindings.a(view0, 0x7F0B0166);  // id:auth_second_otp_external
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0167;  // id:auth_second_otp_input
                                    View view8 = ViewBindings.a(view0, 0x7F0B0167);  // id:auth_second_otp_input
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0168;  // id:auth_second_progress
                                        View view9 = ViewBindings.a(view0, 0x7F0B0168);  // id:auth_second_progress
                                        if(((ProgressBar)view9) != null) {
                                            v = 0x7F0B0169;  // id:auth_second_toolbar
                                            View view10 = ViewBindings.a(view0, 0x7F0B0169);  // id:auth_second_toolbar
                                            if(((DcToolbar)view10) != null) {
                                                return new h(((CoordinatorLayout)view0), ((ConstraintLayout)view1), ((AppCompatCheckBox)view2), ((TextView)view3), ((ClearableEditText)view4), ((Button)view5), ((TextView)view6), ((TextView)view7), ((TextView)view8), ((ProgressBar)view9), ((DcToolbar)view10));
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
    public static h c(@NonNull LayoutInflater layoutInflater0) {
        return h.d(layoutInflater0, null, false);
    }

    @NonNull
    public static h d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0023, viewGroup0, false);  // layout:activity_auth_second_input
        if(z) {
            viewGroup0.addView(view0);
        }
        return h.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

