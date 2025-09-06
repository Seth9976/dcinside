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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.StateAnnounceView;
import kr.better.widget.BetterTextView;

public final class w6 implements ViewBinding {
    @NonNull
    public final StateAnnounceView A;
    @NonNull
    public final TextView B;
    @NonNull
    public final LinearLayout C;
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final BetterTextView d;
    @NonNull
    public final EditText e;
    @NonNull
    public final TextView f;
    @NonNull
    public final LinearLayout g;
    @NonNull
    public final LinearLayout h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final ClearableEditText j;
    @NonNull
    public final FrameLayout k;
    @NonNull
    public final ImageView l;
    @NonNull
    public final ConstraintLayout m;
    @NonNull
    public final TextView n;
    @NonNull
    public final ConstraintLayout o;
    @NonNull
    public final ImageView p;
    @NonNull
    public final View q;
    @NonNull
    public final ConstraintLayout r;
    @NonNull
    public final View s;
    @NonNull
    public final ClearableEditText t;
    @NonNull
    public final ConstraintLayout u;
    @NonNull
    public final ConstraintLayout v;
    @NonNull
    public final TextView w;
    @NonNull
    public final ImageView x;
    @NonNull
    public final TextView y;
    @NonNull
    public final ClearableEditText z;

    private w6(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout1, @NonNull BetterTextView betterTextView0, @NonNull EditText editText0, @NonNull TextView textView1, @NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull ImageView imageView0, @NonNull ClearableEditText clearableEditText0, @NonNull FrameLayout frameLayout0, @NonNull ImageView imageView1, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView2, @NonNull View view0, @NonNull ConstraintLayout constraintLayout4, @NonNull View view1, @NonNull ClearableEditText clearableEditText1, @NonNull ConstraintLayout constraintLayout5, @NonNull ConstraintLayout constraintLayout6, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull TextView textView4, @NonNull ClearableEditText clearableEditText2, @NonNull StateAnnounceView stateAnnounceView0, @NonNull TextView textView5, @NonNull LinearLayout linearLayout2) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = constraintLayout1;
        this.d = betterTextView0;
        this.e = editText0;
        this.f = textView1;
        this.g = linearLayout0;
        this.h = linearLayout1;
        this.i = imageView0;
        this.j = clearableEditText0;
        this.k = frameLayout0;
        this.l = imageView1;
        this.m = constraintLayout2;
        this.n = textView2;
        this.o = constraintLayout3;
        this.p = imageView2;
        this.q = view0;
        this.r = constraintLayout4;
        this.s = view1;
        this.t = clearableEditText1;
        this.u = constraintLayout5;
        this.v = constraintLayout6;
        this.w = textView3;
        this.x = imageView3;
        this.y = textView4;
        this.z = clearableEditText2;
        this.A = stateAnnounceView0;
        this.B = textView5;
        this.C = linearLayout2;
    }

    @NonNull
    public static w6 a(@NonNull View view0) {
        int v = 0x7F0B05D5;  // id:image_note_confirm
        View view1 = ViewBindings.a(view0, 0x7F0B05D5);  // id:image_note_confirm
        if(((TextView)view1) != null) {
            v = 0x7F0B05D6;  // id:image_note_def_nick_guide
            View view2 = ViewBindings.a(view0, 0x7F0B05D6);  // id:image_note_def_nick_guide
            if(((ConstraintLayout)view2) != null) {
                v = 0x7F0B05D7;  // id:image_note_def_nick_guide_title
                View view3 = ViewBindings.a(view0, 0x7F0B05D7);  // id:image_note_def_nick_guide_title
                if(((BetterTextView)view3) != null) {
                    v = 0x7F0B05E0;  // id:image_note_input
                    View view4 = ViewBindings.a(view0, 0x7F0B05E0);  // id:image_note_input
                    if(((EditText)view4) != null) {
                        v = 0x7F0B05E1;  // id:image_note_input_anonymous
                        View view5 = ViewBindings.a(view0, 0x7F0B05E1);  // id:image_note_input_anonymous
                        if(((TextView)view5) != null) {
                            v = 0x7F0B05E2;  // id:image_note_input_bg
                            View view6 = ViewBindings.a(view0, 0x7F0B05E2);  // id:image_note_input_bg
                            if(((LinearLayout)view6) != null) {
                                v = 0x7F0B05E3;  // id:image_note_input_code
                                View view7 = ViewBindings.a(view0, 0x7F0B05E3);  // id:image_note_input_code
                                if(((LinearLayout)view7) != null) {
                                    v = 0x7F0B05E4;  // id:image_note_input_code_image
                                    View view8 = ViewBindings.a(view0, 0x7F0B05E4);  // id:image_note_input_code_image
                                    if(((ImageView)view8) != null) {
                                        v = 0x7F0B05E5;  // id:image_note_input_code_input
                                        View view9 = ViewBindings.a(view0, 0x7F0B05E5);  // id:image_note_input_code_input
                                        if(((ClearableEditText)view9) != null) {
                                            v = 0x7F0B05E6;  // id:image_note_input_code_move_wrap
                                            View view10 = ViewBindings.a(view0, 0x7F0B05E6);  // id:image_note_input_code_move_wrap
                                            if(((FrameLayout)view10) != null) {
                                                v = 0x7F0B05E7;  // id:image_note_input_code_refresh
                                                View view11 = ViewBindings.a(view0, 0x7F0B05E7);  // id:image_note_input_code_refresh
                                                if(((ImageView)view11) != null) {
                                                    v = 0x7F0B05E8;  // id:image_note_input_container
                                                    View view12 = ViewBindings.a(view0, 0x7F0B05E8);  // id:image_note_input_container
                                                    if(((ConstraintLayout)view12) != null) {
                                                        v = 0x7F0B05E9;  // id:image_note_input_def_guest_nick
                                                        View view13 = ViewBindings.a(view0, 0x7F0B05E9);  // id:image_note_input_def_guest_nick
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B05EA;  // id:image_note_input_def_guest_wrap
                                                            View view14 = ViewBindings.a(view0, 0x7F0B05EA);  // id:image_note_input_def_guest_wrap
                                                            if(((ConstraintLayout)view14) != null) {
                                                                v = 0x7F0B05EB;  // id:image_note_input_delete_def_nick
                                                                View view15 = ViewBindings.a(view0, 0x7F0B05EB);  // id:image_note_input_delete_def_nick
                                                                if(((ImageView)view15) != null) {
                                                                    v = 0x7F0B05EC;  // id:image_note_input_divider
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B05EC);  // id:image_note_input_divider
                                                                    if(view16 != null) {
                                                                        v = 0x7F0B05ED;  // id:image_note_input_move
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B05ED);  // id:image_note_input_move
                                                                        if(((ConstraintLayout)view17) != null) {
                                                                            v = 0x7F0B05EE;  // id:image_note_input_move_icon
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B05EE);  // id:image_note_input_move_icon
                                                                            if(view18 != null) {
                                                                                v = 0x7F0B05EF;  // id:image_note_input_nick
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B05EF);  // id:image_note_input_nick
                                                                                if(((ClearableEditText)view19) != null) {
                                                                                    v = 0x7F0B05F0;  // id:image_note_input_nick_wrap
                                                                                    View view20 = ViewBindings.a(view0, 0x7F0B05F0);  // id:image_note_input_nick_wrap
                                                                                    if(((ConstraintLayout)view20) != null) {
                                                                                        v = 0x7F0B05F2;  // id:image_note_input_profile_anonymous
                                                                                        View view21 = ViewBindings.a(view0, 0x7F0B05F2);  // id:image_note_input_profile_anonymous
                                                                                        if(((TextView)view21) != null) {
                                                                                            v = 0x7F0B05F3;  // id:image_note_input_profile_icon
                                                                                            View view22 = ViewBindings.a(view0, 0x7F0B05F3);  // id:image_note_input_profile_icon
                                                                                            if(((ImageView)view22) != null) {
                                                                                                v = 0x7F0B05F4;  // id:image_note_input_profile_name
                                                                                                View view23 = ViewBindings.a(view0, 0x7F0B05F4);  // id:image_note_input_profile_name
                                                                                                if(((TextView)view23) != null) {
                                                                                                    v = 0x7F0B05F5;  // id:image_note_input_pw
                                                                                                    View view24 = ViewBindings.a(view0, 0x7F0B05F5);  // id:image_note_input_pw
                                                                                                    if(((ClearableEditText)view24) != null) {
                                                                                                        v = 0x7F0B05F6;  // id:image_note_input_state
                                                                                                        View view25 = ViewBindings.a(view0, 0x7F0B05F6);  // id:image_note_input_state
                                                                                                        if(((StateAnnounceView)view25) != null) {
                                                                                                            v = 0x7F0B05F7;  // id:image_note_input_use_def_nick
                                                                                                            View view26 = ViewBindings.a(view0, 0x7F0B05F7);  // id:image_note_input_use_def_nick
                                                                                                            if(((TextView)view26) != null) {
                                                                                                                v = 0x7F0B05F8;  // id:image_note_input_user_wrap
                                                                                                                View view27 = ViewBindings.a(view0, 0x7F0B05F8);  // id:image_note_input_user_wrap
                                                                                                                if(((LinearLayout)view27) != null) {
                                                                                                                    return new w6(((ConstraintLayout)view0), ((TextView)view1), ((ConstraintLayout)view2), ((BetterTextView)view3), ((EditText)view4), ((TextView)view5), ((LinearLayout)view6), ((LinearLayout)view7), ((ImageView)view8), ((ClearableEditText)view9), ((FrameLayout)view10), ((ImageView)view11), ((ConstraintLayout)view12), ((TextView)view13), ((ConstraintLayout)view14), ((ImageView)view15), view16, ((ConstraintLayout)view17), view18, ((ClearableEditText)view19), ((ConstraintLayout)view20), ((ConstraintLayout)view0), ((TextView)view21), ((ImageView)view22), ((TextView)view23), ((ClearableEditText)view24), ((StateAnnounceView)view25), ((TextView)view26), ((LinearLayout)view27));
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
    public static w6 c(@NonNull LayoutInflater layoutInflater0) {
        return w6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E023A, viewGroup0, false);  // layout:view_post_read_image_note_input
        if(z) {
            viewGroup0.addView(view0);
        }
        return w6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

