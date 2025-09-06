package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.dccon.DcConPickerView;
import kr.better.widget.BetterTextView;

public final class u6 implements ViewBinding {
    @NonNull
    public final ConstraintLayout A;
    @NonNull
    public final ImageView B;
    @NonNull
    public final FrameLayout C;
    @NonNull
    public final EditText D;
    @NonNull
    public final ConstraintLayout E;
    @NonNull
    public final ImageView F;
    @NonNull
    public final ConstraintLayout G;
    @NonNull
    public final ClearableEditText H;
    @NonNull
    public final ClearableEditText I;
    @NonNull
    public final FrameLayout J;
    @NonNull
    public final TextView K;
    @NonNull
    public final ConstraintLayout L;
    @NonNull
    public final TextView M;
    @NonNull
    public final AppCompatTextView N;
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final LinearLayout f;
    @NonNull
    public final Barrier g;
    @NonNull
    public final LinearLayout h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final ClearableEditText j;
    @NonNull
    public final ImageView k;
    @NonNull
    public final ImageView l;
    @NonNull
    public final DcConPickerView m;
    @NonNull
    public final TextView n;
    @NonNull
    public final ConstraintLayout o;
    @NonNull
    public final ConstraintLayout p;
    @NonNull
    public final BetterTextView q;
    @NonNull
    public final ImageView r;
    @NonNull
    public final View s;
    @NonNull
    public final ConstraintLayout t;
    @NonNull
    public final TextView u;
    @NonNull
    public final ConstraintLayout v;
    @NonNull
    public final View w;
    @NonNull
    public final View x;
    @NonNull
    public final RecyclerView y;
    @NonNull
    public final TextView z;

    private u6(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView0, @NonNull LinearLayout linearLayout0, @NonNull Barrier barrier0, @NonNull LinearLayout linearLayout1, @NonNull ImageView imageView1, @NonNull ClearableEditText clearableEditText0, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull DcConPickerView dcConPickerView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull BetterTextView betterTextView0, @NonNull ImageView imageView4, @NonNull View view0, @NonNull ConstraintLayout constraintLayout5, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout6, @NonNull View view1, @NonNull View view2, @NonNull RecyclerView recyclerView0, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout7, @NonNull ImageView imageView5, @NonNull FrameLayout frameLayout0, @NonNull EditText editText0, @NonNull ConstraintLayout constraintLayout8, @NonNull ImageView imageView6, @NonNull ConstraintLayout constraintLayout9, @NonNull ClearableEditText clearableEditText1, @NonNull ClearableEditText clearableEditText2, @NonNull FrameLayout frameLayout1, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout10, @NonNull TextView textView5, @NonNull AppCompatTextView appCompatTextView0) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = textView0;
        this.d = constraintLayout2;
        this.e = imageView0;
        this.f = linearLayout0;
        this.g = barrier0;
        this.h = linearLayout1;
        this.i = imageView1;
        this.j = clearableEditText0;
        this.k = imageView2;
        this.l = imageView3;
        this.m = dcConPickerView0;
        this.n = textView1;
        this.o = constraintLayout3;
        this.p = constraintLayout4;
        this.q = betterTextView0;
        this.r = imageView4;
        this.s = view0;
        this.t = constraintLayout5;
        this.u = textView2;
        this.v = constraintLayout6;
        this.w = view1;
        this.x = view2;
        this.y = recyclerView0;
        this.z = textView3;
        this.A = constraintLayout7;
        this.B = imageView5;
        this.C = frameLayout0;
        this.D = editText0;
        this.E = constraintLayout8;
        this.F = imageView6;
        this.G = constraintLayout9;
        this.H = clearableEditText1;
        this.I = clearableEditText2;
        this.J = frameLayout1;
        this.K = textView4;
        this.L = constraintLayout10;
        this.M = textView5;
        this.N = appCompatTextView0;
    }

    @NonNull
    public static u6 a(@NonNull View view0) {
        int v = 0x7F0B0A92;  // id:post_list_quick_write_view_guide
        View view1 = ViewBindings.a(view0, 0x7F0B0A92);  // id:post_list_quick_write_view_guide
        if(((ConstraintLayout)view1) != null) {
            v = 0x7F0B0A93;  // id:post_list_quick_write_view_guide_text
            View view2 = ViewBindings.a(view0, 0x7F0B0A93);  // id:post_list_quick_write_view_guide_text
            if(((TextView)view2) != null) {
                v = 0x7F0B0AAE;  // id:post_quick_write_addon_arrow
                View view3 = ViewBindings.a(view0, 0x7F0B0AAE);  // id:post_quick_write_addon_arrow
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0AAF;  // id:post_quick_write_addon_wrap
                    View view4 = ViewBindings.a(view0, 0x7F0B0AAF);  // id:post_quick_write_addon_wrap
                    if(((LinearLayout)view4) != null) {
                        v = 0x7F0B0AB0;  // id:post_quick_write_barrier
                        View view5 = ViewBindings.a(view0, 0x7F0B0AB0);  // id:post_quick_write_barrier
                        if(((Barrier)view5) != null) {
                            v = 0x7F0B0AB1;  // id:post_quick_write_code
                            View view6 = ViewBindings.a(view0, 0x7F0B0AB1);  // id:post_quick_write_code
                            if(((LinearLayout)view6) != null) {
                                v = 0x7F0B0AB2;  // id:post_quick_write_code_image
                                View view7 = ViewBindings.a(view0, 0x7F0B0AB2);  // id:post_quick_write_code_image
                                if(((ImageView)view7) != null) {
                                    v = 0x7F0B0AB3;  // id:post_quick_write_code_input
                                    View view8 = ViewBindings.a(view0, 0x7F0B0AB3);  // id:post_quick_write_code_input
                                    if(((ClearableEditText)view8) != null) {
                                        v = 0x7F0B0AB4;  // id:post_quick_write_code_refresh
                                        View view9 = ViewBindings.a(view0, 0x7F0B0AB4);  // id:post_quick_write_code_refresh
                                        if(((ImageView)view9) != null) {
                                            v = 0x7F0B0AB5;  // id:post_quick_write_confirm
                                            View view10 = ViewBindings.a(view0, 0x7F0B0AB5);  // id:post_quick_write_confirm
                                            if(((ImageView)view10) != null) {
                                                v = 0x7F0B0AB6;  // id:post_quick_write_dccon_picker
                                                View view11 = ViewBindings.a(view0, 0x7F0B0AB6);  // id:post_quick_write_dccon_picker
                                                if(((DcConPickerView)view11) != null) {
                                                    v = 0x7F0B0AB7;  // id:post_quick_write_def_guest_nick
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0AB7);  // id:post_quick_write_def_guest_nick
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B0AB8;  // id:post_quick_write_def_guest_wrap
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0AB8);  // id:post_quick_write_def_guest_wrap
                                                        if(((ConstraintLayout)view13) != null) {
                                                            v = 0x7F0B0AB9;  // id:post_quick_write_def_nick_guide
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0AB9);  // id:post_quick_write_def_nick_guide
                                                            if(((ConstraintLayout)view14) != null) {
                                                                v = 0x7F0B0ABA;  // id:post_quick_write_def_nick_guide_title
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0ABA);  // id:post_quick_write_def_nick_guide_title
                                                                if(((BetterTextView)view15) != null) {
                                                                    v = 0x7F0B0ABB;  // id:post_quick_write_delete_def_nick
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0ABB);  // id:post_quick_write_delete_def_nick
                                                                    if(((ImageView)view16) != null) {
                                                                        v = 0x7F0B0ABC;  // id:post_quick_write_divider
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0ABC);  // id:post_quick_write_divider
                                                                        if(view17 != null) {
                                                                            v = 0x7F0B0ABD;  // id:post_quick_write_guest
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0ABD);  // id:post_quick_write_guest
                                                                            if(((ConstraintLayout)view18) != null) {
                                                                                v = 0x7F0B0ABE;  // id:post_quick_write_guest_anonymous
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B0ABE);  // id:post_quick_write_guest_anonymous
                                                                                if(((TextView)view19) != null) {
                                                                                    v = 0x7F0B0ABF;  // id:post_quick_write_guest_wrap
                                                                                    View view20 = ViewBindings.a(view0, 0x7F0B0ABF);  // id:post_quick_write_guest_wrap
                                                                                    if(((ConstraintLayout)view20) != null) {
                                                                                        v = 0x7F0B0AC0;  // id:post_quick_write_head_changed_icon
                                                                                        View view21 = ViewBindings.a(view0, 0x7F0B0AC0);  // id:post_quick_write_head_changed_icon
                                                                                        if(view21 != null) {
                                                                                            v = 0x7F0B0AC1;  // id:post_quick_write_head_divider
                                                                                            View view22 = ViewBindings.a(view0, 0x7F0B0AC1);  // id:post_quick_write_head_divider
                                                                                            if(view22 != null) {
                                                                                                v = 0x7F0B0AC2;  // id:post_quick_write_head_list
                                                                                                View view23 = ViewBindings.a(view0, 0x7F0B0AC2);  // id:post_quick_write_head_list
                                                                                                if(((RecyclerView)view23) != null) {
                                                                                                    v = 0x7F0B0AC3;  // id:post_quick_write_ignore_head_toast
                                                                                                    View view24 = ViewBindings.a(view0, 0x7F0B0AC3);  // id:post_quick_write_ignore_head_toast
                                                                                                    if(((TextView)view24) != null) {
                                                                                                        v = 0x7F0B0AC4;  // id:post_quick_write_ignore_head_toast_wrap
                                                                                                        View view25 = ViewBindings.a(view0, 0x7F0B0AC4);  // id:post_quick_write_ignore_head_toast_wrap
                                                                                                        if(((ConstraintLayout)view25) != null) {
                                                                                                            v = 0x7F0B0AC5;  // id:post_quick_write_input_image
                                                                                                            View view26 = ViewBindings.a(view0, 0x7F0B0AC5);  // id:post_quick_write_input_image
                                                                                                            if(((ImageView)view26) != null) {
                                                                                                                v = 0x7F0B0AC6;  // id:post_quick_write_input_image_delete
                                                                                                                View view27 = ViewBindings.a(view0, 0x7F0B0AC6);  // id:post_quick_write_input_image_delete
                                                                                                                if(((FrameLayout)view27) != null) {
                                                                                                                    v = 0x7F0B0AC7;  // id:post_quick_write_input_memo
                                                                                                                    View view28 = ViewBindings.a(view0, 0x7F0B0AC7);  // id:post_quick_write_input_memo
                                                                                                                    if(((EditText)view28) != null) {
                                                                                                                        v = 0x7F0B0AC8;  // id:post_quick_write_input_wrap
                                                                                                                        View view29 = ViewBindings.a(view0, 0x7F0B0AC8);  // id:post_quick_write_input_wrap
                                                                                                                        if(((ConstraintLayout)view29) != null) {
                                                                                                                            v = 0x7F0B0AC9;  // id:post_quick_write_more
                                                                                                                            View view30 = ViewBindings.a(view0, 0x7F0B0AC9);  // id:post_quick_write_more
                                                                                                                            if(((ImageView)view30) != null) {
                                                                                                                                v = 0x7F0B0ACA;  // id:post_quick_write_move
                                                                                                                                View view31 = ViewBindings.a(view0, 0x7F0B0ACA);  // id:post_quick_write_move
                                                                                                                                if(((ConstraintLayout)view31) != null) {
                                                                                                                                    v = 0x7F0B0ACB;  // id:post_quick_write_nick
                                                                                                                                    View view32 = ViewBindings.a(view0, 0x7F0B0ACB);  // id:post_quick_write_nick
                                                                                                                                    if(((ClearableEditText)view32) != null) {
                                                                                                                                        v = 0x7F0B0ACC;  // id:post_quick_write_password
                                                                                                                                        View view33 = ViewBindings.a(view0, 0x7F0B0ACC);  // id:post_quick_write_password
                                                                                                                                        if(((ClearableEditText)view33) != null) {
                                                                                                                                            v = 0x7F0B0ACD;  // id:post_quick_write_progress
                                                                                                                                            View view34 = ViewBindings.a(view0, 0x7F0B0ACD);  // id:post_quick_write_progress
                                                                                                                                            if(((FrameLayout)view34) != null) {
                                                                                                                                                v = 0x7F0B0ACE;  // id:post_quick_write_use_def_nick
                                                                                                                                                View view35 = ViewBindings.a(view0, 0x7F0B0ACE);  // id:post_quick_write_use_def_nick
                                                                                                                                                if(((TextView)view35) != null) {
                                                                                                                                                    v = 0x7F0B0ACF;  // id:post_quick_write_warning
                                                                                                                                                    View view36 = ViewBindings.a(view0, 0x7F0B0ACF);  // id:post_quick_write_warning
                                                                                                                                                    if(((ConstraintLayout)view36) != null) {
                                                                                                                                                        v = 0x7F0B0AD0;  // id:post_quick_write_warning_detail
                                                                                                                                                        View view37 = ViewBindings.a(view0, 0x7F0B0AD0);  // id:post_quick_write_warning_detail
                                                                                                                                                        if(((TextView)view37) != null) {
                                                                                                                                                            v = 0x7F0B0AD1;  // id:post_quick_write_warning_short
                                                                                                                                                            View view38 = ViewBindings.a(view0, 0x7F0B0AD1);  // id:post_quick_write_warning_short
                                                                                                                                                            if(((AppCompatTextView)view38) != null) {
                                                                                                                                                                return new u6(((ConstraintLayout)view0), ((ConstraintLayout)view1), ((TextView)view2), ((ConstraintLayout)view0), ((ImageView)view3), ((LinearLayout)view4), ((Barrier)view5), ((LinearLayout)view6), ((ImageView)view7), ((ClearableEditText)view8), ((ImageView)view9), ((ImageView)view10), ((DcConPickerView)view11), ((TextView)view12), ((ConstraintLayout)view13), ((ConstraintLayout)view14), ((BetterTextView)view15), ((ImageView)view16), view17, ((ConstraintLayout)view18), ((TextView)view19), ((ConstraintLayout)view20), view21, view22, ((RecyclerView)view23), ((TextView)view24), ((ConstraintLayout)view25), ((ImageView)view26), ((FrameLayout)view27), ((EditText)view28), ((ConstraintLayout)view29), ((ImageView)view30), ((ConstraintLayout)view31), ((ClearableEditText)view32), ((ClearableEditText)view33), ((FrameLayout)view34), ((TextView)view35), ((ConstraintLayout)view36), ((TextView)view37), ((AppCompatTextView)view38));
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
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static u6 c(@NonNull LayoutInflater layoutInflater0) {
        return u6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0238, viewGroup0, false);  // layout:view_post_quick_write
        if(z) {
            viewGroup0.addView(view0);
        }
        return u6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

