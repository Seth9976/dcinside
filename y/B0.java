package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;
import com.dcinside.app.view.PickedBottomIndicatorView;
import com.dcinside.app.view.TouchyRecyclerView;
import com.dcinside.rich.RichToolbar;
import com.dcinside.rich.color.ColorPickerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import fr.castorflex.android.smoothprogressbar.SmoothProgressBar;
import kr.better.widget.BetterTextView;

public final class b0 implements ViewBinding {
    @NonNull
    public final AppBarLayout A;
    @NonNull
    public final RichToolbar A0;
    @NonNull
    public final View B;
    @NonNull
    public final ColorPickerView B0;
    @NonNull
    public final TextView C;
    @NonNull
    public final DcToolbar C0;
    @NonNull
    public final ConstraintLayout D;
    @NonNull
    public final TextView D0;
    @NonNull
    public final BetterTextView E;
    @NonNull
    public final TextView E0;
    @NonNull
    public final BetterTextView F;
    @NonNull
    public final Barrier F0;
    @NonNull
    public final View G;
    @NonNull
    public final Guideline G0;
    @NonNull
    public final ProgressBar H;
    @NonNull
    public final ImageView H0;
    @NonNull
    public final LinearLayout I;
    @NonNull
    public final TextView I0;
    @NonNull
    public final ImageView J;
    @NonNull
    public final FrameLayout J0;
    @NonNull
    public final ClearableEditText K;
    @NonNull
    public final ImageView L;
    @NonNull
    public final TextView M;
    @NonNull
    public final CoordinatorLayout N;
    @NonNull
    public final FrameLayout O;
    @NonNull
    public final ViewStub P;
    @NonNull
    public final ViewStub Q;
    @NonNull
    public final TextView R;
    @NonNull
    public final ConstraintLayout S;
    @NonNull
    public final ConstraintLayout T;
    @NonNull
    public final BetterTextView U;
    @NonNull
    public final ImageView V;
    @NonNull
    public final ConstraintLayout W;
    @NonNull
    public final TextView X;
    @NonNull
    public final RecyclerView Y;
    @NonNull
    public final TextView Z;
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final ImageView a0;
    @NonNull
    public final CollapsingToolbarLayout b;
    @NonNull
    public final LinearLayout b0;
    @NonNull
    public final ImageView c;
    @NonNull
    public final FrameLayout c0;
    @NonNull
    public final View d;
    @NonNull
    public final View d0;
    @NonNull
    public final ImageView e;
    @NonNull
    public final LinearLayout e0;
    @NonNull
    public final TextView f;
    @NonNull
    public final Barrier f0;
    @NonNull
    public final ImageView g;
    @NonNull
    public final ImageView g0;
    @NonNull
    public final TextView h;
    @NonNull
    public final HorizontalScrollView h0;
    @NonNull
    public final ConstraintLayout i;
    @NonNull
    public final BetterTextView i0;
    @NonNull
    public final ProgressBar j;
    @NonNull
    public final ImageView j0;
    @NonNull
    public final TextView k;
    @NonNull
    public final ConstraintLayout k0;
    @NonNull
    public final ImageView l;
    @NonNull
    public final FrameLayout l0;
    @NonNull
    public final TextView m;
    @NonNull
    public final View m0;
    @NonNull
    public final EditText n;
    @NonNull
    public final ClearableEditText n0;
    @NonNull
    public final ConstraintLayout o;
    @NonNull
    public final ClearableEditText o0;
    @NonNull
    public final ConstraintLayout p;
    @NonNull
    public final ConstraintLayout p0;
    @NonNull
    public final TextView q;
    @NonNull
    public final Barrier q0;
    @NonNull
    public final ConstraintLayout r;
    @NonNull
    public final Barrier r0;
    @NonNull
    public final TextView s;
    @NonNull
    public final TextView s0;
    @NonNull
    public final PickedBottomIndicatorView t;
    @NonNull
    public final ProgressBar t0;
    @NonNull
    public final RecyclerView u;
    @NonNull
    public final SmoothProgressBar u0;
    @NonNull
    public final TextView v;
    @NonNull
    public final TextView v0;
    @NonNull
    public final ImageView w;
    @NonNull
    public final TouchyRecyclerView w0;
    @NonNull
    public final ConstraintLayout x;
    @NonNull
    public final TextView x0;
    @NonNull
    public final View y;
    @NonNull
    public final AppCompatEditText y0;
    @NonNull
    public final ConstraintLayout z;
    @NonNull
    public final TextView z0;

    private b0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull CollapsingToolbarLayout collapsingToolbarLayout0, @NonNull ImageView imageView0, @NonNull View view0, @NonNull ImageView imageView1, @NonNull TextView textView0, @NonNull ImageView imageView2, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout0, @NonNull ProgressBar progressBar0, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull EditText editText0, @NonNull ConstraintLayout constraintLayout1, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView5, @NonNull PickedBottomIndicatorView pickedBottomIndicatorView0, @NonNull RecyclerView recyclerView0, @NonNull TextView textView6, @NonNull ImageView imageView4, @NonNull ConstraintLayout constraintLayout4, @NonNull View view1, @NonNull ConstraintLayout constraintLayout5, @NonNull AppBarLayout appBarLayout0, @NonNull View view2, @NonNull TextView textView7, @NonNull ConstraintLayout constraintLayout6, @NonNull BetterTextView betterTextView0, @NonNull BetterTextView betterTextView1, @NonNull View view3, @NonNull ProgressBar progressBar1, @NonNull LinearLayout linearLayout0, @NonNull ImageView imageView5, @NonNull ClearableEditText clearableEditText0, @NonNull ImageView imageView6, @NonNull TextView textView8, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull FrameLayout frameLayout0, @NonNull ViewStub viewStub0, @NonNull ViewStub viewStub1, @NonNull TextView textView9, @NonNull ConstraintLayout constraintLayout7, @NonNull ConstraintLayout constraintLayout8, @NonNull BetterTextView betterTextView2, @NonNull ImageView imageView7, @NonNull ConstraintLayout constraintLayout9, @NonNull TextView textView10, @NonNull RecyclerView recyclerView1, @NonNull TextView textView11, @NonNull ImageView imageView8, @NonNull LinearLayout linearLayout1, @NonNull FrameLayout frameLayout1, @NonNull View view4, @NonNull LinearLayout linearLayout2, @NonNull Barrier barrier0, @NonNull ImageView imageView9, @NonNull HorizontalScrollView horizontalScrollView0, @NonNull BetterTextView betterTextView3, @NonNull ImageView imageView10, @NonNull ConstraintLayout constraintLayout10, @NonNull FrameLayout frameLayout2, @NonNull View view5, @NonNull ClearableEditText clearableEditText1, @NonNull ClearableEditText clearableEditText2, @NonNull ConstraintLayout constraintLayout11, @NonNull Barrier barrier1, @NonNull Barrier barrier2, @NonNull TextView textView12, @NonNull ProgressBar progressBar2, @NonNull SmoothProgressBar smoothProgressBar0, @NonNull TextView textView13, @NonNull TouchyRecyclerView touchyRecyclerView0, @NonNull TextView textView14, @NonNull AppCompatEditText appCompatEditText0, @NonNull TextView textView15, @NonNull RichToolbar richToolbar0, @NonNull ColorPickerView colorPickerView0, @NonNull DcToolbar dcToolbar0, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull Barrier barrier3, @NonNull Guideline guideline0, @NonNull ImageView imageView11, @NonNull TextView textView18, @NonNull FrameLayout frameLayout3) {
        this.a = coordinatorLayout0;
        this.b = collapsingToolbarLayout0;
        this.c = imageView0;
        this.d = view0;
        this.e = imageView1;
        this.f = textView0;
        this.g = imageView2;
        this.h = textView1;
        this.i = constraintLayout0;
        this.j = progressBar0;
        this.k = textView2;
        this.l = imageView3;
        this.m = textView3;
        this.n = editText0;
        this.o = constraintLayout1;
        this.p = constraintLayout2;
        this.q = textView4;
        this.r = constraintLayout3;
        this.s = textView5;
        this.t = pickedBottomIndicatorView0;
        this.u = recyclerView0;
        this.v = textView6;
        this.w = imageView4;
        this.x = constraintLayout4;
        this.y = view1;
        this.z = constraintLayout5;
        this.A = appBarLayout0;
        this.B = view2;
        this.C = textView7;
        this.D = constraintLayout6;
        this.E = betterTextView0;
        this.F = betterTextView1;
        this.G = view3;
        this.H = progressBar1;
        this.I = linearLayout0;
        this.J = imageView5;
        this.K = clearableEditText0;
        this.L = imageView6;
        this.M = textView8;
        this.N = coordinatorLayout1;
        this.O = frameLayout0;
        this.P = viewStub0;
        this.Q = viewStub1;
        this.R = textView9;
        this.S = constraintLayout7;
        this.T = constraintLayout8;
        this.U = betterTextView2;
        this.V = imageView7;
        this.W = constraintLayout9;
        this.X = textView10;
        this.Y = recyclerView1;
        this.Z = textView11;
        this.a0 = imageView8;
        this.b0 = linearLayout1;
        this.c0 = frameLayout1;
        this.d0 = view4;
        this.e0 = linearLayout2;
        this.f0 = barrier0;
        this.g0 = imageView9;
        this.h0 = horizontalScrollView0;
        this.i0 = betterTextView3;
        this.j0 = imageView10;
        this.k0 = constraintLayout10;
        this.l0 = frameLayout2;
        this.m0 = view5;
        this.n0 = clearableEditText1;
        this.o0 = clearableEditText2;
        this.p0 = constraintLayout11;
        this.q0 = barrier1;
        this.r0 = barrier2;
        this.s0 = textView12;
        this.t0 = progressBar2;
        this.u0 = smoothProgressBar0;
        this.v0 = textView13;
        this.w0 = touchyRecyclerView0;
        this.x0 = textView14;
        this.y0 = appCompatEditText0;
        this.z0 = textView15;
        this.A0 = richToolbar0;
        this.B0 = colorPickerView0;
        this.C0 = dcToolbar0;
        this.D0 = textView16;
        this.E0 = textView17;
        this.F0 = barrier3;
        this.G0 = guideline0;
        this.H0 = imageView11;
        this.I0 = textView18;
        this.J0 = frameLayout3;
    }

    @NonNull
    public static b0 a(@NonNull View view0) {
        int v = 0x7F0B02C2;  // id:collapsingToolbarLayout
        View view1 = ViewBindings.a(view0, 0x7F0B02C2);  // id:collapsingToolbarLayout
        if(((CollapsingToolbarLayout)view1) != null) {
            v = 0x7F0B0B38;  // id:post_write_ai_easy_chara
            View view2 = ViewBindings.a(view0, 0x7F0B0B38);  // id:post_write_ai_easy_chara
            if(((ImageView)view2) != null) {
                v = 0x7F0B0B39;  // id:post_write_ai_easy_divider
                View view3 = ViewBindings.a(view0, 0x7F0B0B39);  // id:post_write_ai_easy_divider
                if(view3 != null) {
                    v = 0x7F0B0B3A;  // id:post_write_ai_easy_history
                    View view4 = ViewBindings.a(view0, 0x7F0B0B3A);  // id:post_write_ai_easy_history
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0B3C;  // id:post_write_ai_easy_model
                        View view5 = ViewBindings.a(view0, 0x7F0B0B3C);  // id:post_write_ai_easy_model
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0B3D;  // id:post_write_ai_easy_model_arrow
                            View view6 = ViewBindings.a(view0, 0x7F0B0B3D);  // id:post_write_ai_easy_model_arrow
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B0B3E;  // id:post_write_ai_easy_model_name
                                View view7 = ViewBindings.a(view0, 0x7F0B0B3E);  // id:post_write_ai_easy_model_name
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0B3F;  // id:post_write_ai_easy_model_select
                                    View view8 = ViewBindings.a(view0, 0x7F0B0B3F);  // id:post_write_ai_easy_model_select
                                    if(((ConstraintLayout)view8) != null) {
                                        v = 0x7F0B0B40;  // id:post_write_ai_easy_progress
                                        View view9 = ViewBindings.a(view0, 0x7F0B0B40);  // id:post_write_ai_easy_progress
                                        if(((ProgressBar)view9) != null) {
                                            v = 0x7F0B0B41;  // id:post_write_ai_easy_progress_title
                                            View view10 = ViewBindings.a(view0, 0x7F0B0B41);  // id:post_write_ai_easy_progress_title
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0B42;  // id:post_write_ai_easy_prompt
                                                View view11 = ViewBindings.a(view0, 0x7F0B0B42);  // id:post_write_ai_easy_prompt
                                                if(((ImageView)view11) != null) {
                                                    v = 0x7F0B0B43;  // id:post_write_ai_easy_prompt_apply
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0B43);  // id:post_write_ai_easy_prompt_apply
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B0B44;  // id:post_write_ai_easy_prompt_input
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0B44);  // id:post_write_ai_easy_prompt_input
                                                        if(((EditText)view13) != null) {
                                                            v = 0x7F0B0B45;  // id:post_write_ai_easy_prompt_progress_wrap
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0B45);  // id:post_write_ai_easy_prompt_progress_wrap
                                                            if(((ConstraintLayout)view14) != null) {
                                                                v = 0x7F0B0B46;  // id:post_write_ai_easy_prompt_wrap
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0B46);  // id:post_write_ai_easy_prompt_wrap
                                                                if(((ConstraintLayout)view15) != null) {
                                                                    v = 0x7F0B0B47;  // id:post_write_ai_easy_recent_empty
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0B47);  // id:post_write_ai_easy_recent_empty
                                                                    if(((TextView)view16) != null) {
                                                                        v = 0x7F0B0B48;  // id:post_write_ai_easy_select
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0B48);  // id:post_write_ai_easy_select
                                                                        if(((ConstraintLayout)view17) != null) {
                                                                            v = 0x7F0B0B49;  // id:post_write_ai_easy_select_mode_count
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0B49);  // id:post_write_ai_easy_select_mode_count
                                                                            if(((TextView)view18) != null) {
                                                                                v = 0x7F0B0B4A;  // id:post_write_ai_easy_select_mode_indicator
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B0B4A);  // id:post_write_ai_easy_select_mode_indicator
                                                                                if(((PickedBottomIndicatorView)view19) != null) {
                                                                                    v = 0x7F0B0B4B;  // id:post_write_ai_easy_select_mode_list
                                                                                    View view20 = ViewBindings.a(view0, 0x7F0B0B4B);  // id:post_write_ai_easy_select_mode_list
                                                                                    if(((RecyclerView)view20) != null) {
                                                                                        v = 0x7F0B0B4C;  // id:post_write_ai_easy_select_mode_title
                                                                                        View view21 = ViewBindings.a(view0, 0x7F0B0B4C);  // id:post_write_ai_easy_select_mode_title
                                                                                        if(((TextView)view21) != null) {
                                                                                            v = 0x7F0B0B4D;  // id:post_write_ai_easy_setting
                                                                                            View view22 = ViewBindings.a(view0, 0x7F0B0B4D);  // id:post_write_ai_easy_setting
                                                                                            if(((ImageView)view22) != null) {
                                                                                                v = 0x7F0B0B4E;  // id:post_write_ai_easy_setting_wrap
                                                                                                View view23 = ViewBindings.a(view0, 0x7F0B0B4E);  // id:post_write_ai_easy_setting_wrap
                                                                                                if(((ConstraintLayout)view23) != null) {
                                                                                                    v = 0x7F0B0B50;  // id:post_write_ai_easy_top
                                                                                                    View view24 = ViewBindings.a(view0, 0x7F0B0B50);  // id:post_write_ai_easy_top
                                                                                                    if(view24 != null) {
                                                                                                        v = 0x7F0B0B51;  // id:post_write_ai_easy_wrap
                                                                                                        View view25 = ViewBindings.a(view0, 0x7F0B0B51);  // id:post_write_ai_easy_wrap
                                                                                                        if(((ConstraintLayout)view25) != null) {
                                                                                                            v = 0x7F0B0B52;  // id:post_write_appBar
                                                                                                            View view26 = ViewBindings.a(view0, 0x7F0B0B52);  // id:post_write_appBar
                                                                                                            if(((AppBarLayout)view26) != null) {
                                                                                                                v = 0x7F0B0B53;  // id:post_write_attach_space
                                                                                                                View view27 = ViewBindings.a(view0, 0x7F0B0B53);  // id:post_write_attach_space
                                                                                                                if(view27 != null) {
                                                                                                                    v = 0x7F0B0B54;  // id:post_write_auto_image_go_setting
                                                                                                                    View view28 = ViewBindings.a(view0, 0x7F0B0B54);  // id:post_write_auto_image_go_setting
                                                                                                                    if(((TextView)view28) != null) {
                                                                                                                        v = 0x7F0B0B55;  // id:post_write_auto_image_guide
                                                                                                                        View view29 = ViewBindings.a(view0, 0x7F0B0B55);  // id:post_write_auto_image_guide
                                                                                                                        if(((ConstraintLayout)view29) != null) {
                                                                                                                            v = 0x7F0B0B56;  // id:post_write_auto_image_title
                                                                                                                            View view30 = ViewBindings.a(view0, 0x7F0B0B56);  // id:post_write_auto_image_title
                                                                                                                            if(((BetterTextView)view30) != null) {
                                                                                                                                v = 0x7F0B0B57;  // id:post_write_auto_save
                                                                                                                                View view31 = ViewBindings.a(view0, 0x7F0B0B57);  // id:post_write_auto_save
                                                                                                                                if(((BetterTextView)view31) != null) {
                                                                                                                                    v = 0x7F0B0B58;  // id:post_write_bar_div
                                                                                                                                    View view32 = ViewBindings.a(view0, 0x7F0B0B58);  // id:post_write_bar_div
                                                                                                                                    if(view32 != null) {
                                                                                                                                        v = 0x7F0B0B59;  // id:post_write_check_progress
                                                                                                                                        View view33 = ViewBindings.a(view0, 0x7F0B0B59);  // id:post_write_check_progress
                                                                                                                                        if(((ProgressBar)view33) != null) {
                                                                                                                                            v = 0x7F0B0B5A;  // id:post_write_code
                                                                                                                                            View view34 = ViewBindings.a(view0, 0x7F0B0B5A);  // id:post_write_code
                                                                                                                                            if(((LinearLayout)view34) != null) {
                                                                                                                                                v = 0x7F0B0B5B;  // id:post_write_code_image
                                                                                                                                                View view35 = ViewBindings.a(view0, 0x7F0B0B5B);  // id:post_write_code_image
                                                                                                                                                if(((ImageView)view35) != null) {
                                                                                                                                                    v = 0x7F0B0B5C;  // id:post_write_code_input
                                                                                                                                                    View view36 = ViewBindings.a(view0, 0x7F0B0B5C);  // id:post_write_code_input
                                                                                                                                                    if(((ClearableEditText)view36) != null) {
                                                                                                                                                        v = 0x7F0B0B5D;  // id:post_write_code_refresh
                                                                                                                                                        View view37 = ViewBindings.a(view0, 0x7F0B0B5D);  // id:post_write_code_refresh
                                                                                                                                                        if(((ImageView)view37) != null) {
                                                                                                                                                            v = 0x7F0B0B5E;  // id:post_write_confirm
                                                                                                                                                            View view38 = ViewBindings.a(view0, 0x7F0B0B5E);  // id:post_write_confirm
                                                                                                                                                            if(((TextView)view38) != null) {
                                                                                                                                                                v = 0x7F0B0B60;  // id:post_write_dccon_container
                                                                                                                                                                View view39 = ViewBindings.a(view0, 0x7F0B0B60);  // id:post_write_dccon_container
                                                                                                                                                                if(((FrameLayout)view39) != null) {
                                                                                                                                                                    v = 0x7F0B0B66;  // id:post_write_dccon_picker_detail
                                                                                                                                                                    View view40 = ViewBindings.a(view0, 0x7F0B0B66);  // id:post_write_dccon_picker_detail
                                                                                                                                                                    if(((ViewStub)view40) != null) {
                                                                                                                                                                        v = 0x7F0B0B67;  // id:post_write_dccon_tag_recent
                                                                                                                                                                        View view41 = ViewBindings.a(view0, 0x7F0B0B67);  // id:post_write_dccon_tag_recent
                                                                                                                                                                        if(((ViewStub)view41) != null) {
                                                                                                                                                                            v = 0x7F0B0B6A;  // id:post_write_def_guest_nick
                                                                                                                                                                            View view42 = ViewBindings.a(view0, 0x7F0B0B6A);  // id:post_write_def_guest_nick
                                                                                                                                                                            if(((TextView)view42) != null) {
                                                                                                                                                                                v = 0x7F0B0B6B;  // id:post_write_def_guest_wrap
                                                                                                                                                                                View view43 = ViewBindings.a(view0, 0x7F0B0B6B);  // id:post_write_def_guest_wrap
                                                                                                                                                                                if(((ConstraintLayout)view43) != null) {
                                                                                                                                                                                    v = 0x7F0B0B6C;  // id:post_write_def_nick_guide
                                                                                                                                                                                    View view44 = ViewBindings.a(view0, 0x7F0B0B6C);  // id:post_write_def_nick_guide
                                                                                                                                                                                    if(((ConstraintLayout)view44) != null) {
                                                                                                                                                                                        v = 0x7F0B0B6D;  // id:post_write_def_nick_guide_title
                                                                                                                                                                                        View view45 = ViewBindings.a(view0, 0x7F0B0B6D);  // id:post_write_def_nick_guide_title
                                                                                                                                                                                        if(((BetterTextView)view45) != null) {
                                                                                                                                                                                            v = 0x7F0B0B6E;  // id:post_write_delete_def_nick
                                                                                                                                                                                            View view46 = ViewBindings.a(view0, 0x7F0B0B6E);  // id:post_write_delete_def_nick
                                                                                                                                                                                            if(((ImageView)view46) != null) {
                                                                                                                                                                                                v = 0x7F0B0B6F;  // id:post_write_guest
                                                                                                                                                                                                View view47 = ViewBindings.a(view0, 0x7F0B0B6F);  // id:post_write_guest
                                                                                                                                                                                                if(((ConstraintLayout)view47) != null) {
                                                                                                                                                                                                    v = 0x7F0B0B70;  // id:post_write_guest_anonymous
                                                                                                                                                                                                    View view48 = ViewBindings.a(view0, 0x7F0B0B70);  // id:post_write_guest_anonymous
                                                                                                                                                                                                    if(((TextView)view48) != null) {
                                                                                                                                                                                                        v = 0x7F0B0B71;  // id:post_write_head
                                                                                                                                                                                                        View view49 = ViewBindings.a(view0, 0x7F0B0B71);  // id:post_write_head
                                                                                                                                                                                                        if(((RecyclerView)view49) != null) {
                                                                                                                                                                                                            v = 0x7F0B0B74;  // id:post_write_ignore_head_toast
                                                                                                                                                                                                            View view50 = ViewBindings.a(view0, 0x7F0B0B74);  // id:post_write_ignore_head_toast
                                                                                                                                                                                                            if(((TextView)view50) != null) {
                                                                                                                                                                                                                v = 0x7F0B0BC5;  // id:post_write_login_arrow
                                                                                                                                                                                                                View view51 = ViewBindings.a(view0, 0x7F0B0BC5);  // id:post_write_login_arrow
                                                                                                                                                                                                                if(((ImageView)view51) != null) {
                                                                                                                                                                                                                    v = 0x7F0B0BC6;  // id:post_write_menu_bar
                                                                                                                                                                                                                    View view52 = ViewBindings.a(view0, 0x7F0B0BC6);  // id:post_write_menu_bar
                                                                                                                                                                                                                    if(((LinearLayout)view52) != null) {
                                                                                                                                                                                                                        v = 0x7F0B0BC7;  // id:post_write_menu_bar_wrap
                                                                                                                                                                                                                        View view53 = ViewBindings.a(view0, 0x7F0B0BC7);  // id:post_write_menu_bar_wrap
                                                                                                                                                                                                                        if(((FrameLayout)view53) != null) {
                                                                                                                                                                                                                            v = 0x7F0B0BC8;  // id:post_write_menu_guideline
                                                                                                                                                                                                                            View view54 = ViewBindings.a(view0, 0x7F0B0BC8);  // id:post_write_menu_guideline
                                                                                                                                                                                                                            if(view54 != null) {
                                                                                                                                                                                                                                v = 0x7F0B0BC9;  // id:post_write_menu_more
                                                                                                                                                                                                                                View view55 = ViewBindings.a(view0, 0x7F0B0BC9);  // id:post_write_menu_more
                                                                                                                                                                                                                                if(((LinearLayout)view55) != null) {
                                                                                                                                                                                                                                    v = 0x7F0B0BCA;  // id:post_write_menu_more_barrier
                                                                                                                                                                                                                                    View view56 = ViewBindings.a(view0, 0x7F0B0BCA);  // id:post_write_menu_more_barrier
                                                                                                                                                                                                                                    if(((Barrier)view56) != null) {
                                                                                                                                                                                                                                        v = 0x7F0B0BCB;  // id:post_write_menu_more_icon
                                                                                                                                                                                                                                        View view57 = ViewBindings.a(view0, 0x7F0B0BCB);  // id:post_write_menu_more_icon
                                                                                                                                                                                                                                        if(((ImageView)view57) != null) {
                                                                                                                                                                                                                                            v = 0x7F0B0BCC;  // id:post_write_menu_more_scroll
                                                                                                                                                                                                                                            View view58 = ViewBindings.a(view0, 0x7F0B0BCC);  // id:post_write_menu_more_scroll
                                                                                                                                                                                                                                            if(((HorizontalScrollView)view58) != null) {
                                                                                                                                                                                                                                                v = 0x7F0B0BCD;  // id:post_write_menu_order
                                                                                                                                                                                                                                                View view59 = ViewBindings.a(view0, 0x7F0B0BCD);  // id:post_write_menu_order
                                                                                                                                                                                                                                                if(((BetterTextView)view59) != null) {
                                                                                                                                                                                                                                                    v = 0x7F0B0BCE;  // id:post_write_menu_order_setting
                                                                                                                                                                                                                                                    View view60 = ViewBindings.a(view0, 0x7F0B0BCE);  // id:post_write_menu_order_setting
                                                                                                                                                                                                                                                    if(((ImageView)view60) != null) {
                                                                                                                                                                                                                                                        v = 0x7F0B0BCF;  // id:post_write_menu_wrapper
                                                                                                                                                                                                                                                        View view61 = ViewBindings.a(view0, 0x7F0B0BCF);  // id:post_write_menu_wrapper
                                                                                                                                                                                                                                                        if(((ConstraintLayout)view61) != null) {
                                                                                                                                                                                                                                                            v = 0x7F0B0BD0;  // id:post_write_mini_setting
                                                                                                                                                                                                                                                            View view62 = ViewBindings.a(view0, 0x7F0B0BD0);  // id:post_write_mini_setting
                                                                                                                                                                                                                                                            if(((FrameLayout)view62) != null) {
                                                                                                                                                                                                                                                                v = 0x7F0B0BD1;  // id:post_write_mini_used
                                                                                                                                                                                                                                                                View view63 = ViewBindings.a(view0, 0x7F0B0BD1);  // id:post_write_mini_used
                                                                                                                                                                                                                                                                if(view63 != null) {
                                                                                                                                                                                                                                                                    v = 0x7F0B0BD2;  // id:post_write_nick
                                                                                                                                                                                                                                                                    View view64 = ViewBindings.a(view0, 0x7F0B0BD2);  // id:post_write_nick
                                                                                                                                                                                                                                                                    if(((ClearableEditText)view64) != null) {
                                                                                                                                                                                                                                                                        v = 0x7F0B0BD3;  // id:post_write_password
                                                                                                                                                                                                                                                                        View view65 = ViewBindings.a(view0, 0x7F0B0BD3);  // id:post_write_password
                                                                                                                                                                                                                                                                        if(((ClearableEditText)view65) != null) {
                                                                                                                                                                                                                                                                            v = 0x7F0B0BD4;  // id:post_write_progress
                                                                                                                                                                                                                                                                            View view66 = ViewBindings.a(view0, 0x7F0B0BD4);  // id:post_write_progress
                                                                                                                                                                                                                                                                            if(((ConstraintLayout)view66) != null) {
                                                                                                                                                                                                                                                                                v = 0x7F0B0BD5;  // id:post_write_progress_barrier_bottom
                                                                                                                                                                                                                                                                                View view67 = ViewBindings.a(view0, 0x7F0B0BD5);  // id:post_write_progress_barrier_bottom
                                                                                                                                                                                                                                                                                if(((Barrier)view67) != null) {
                                                                                                                                                                                                                                                                                    v = 0x7F0B0BD6;  // id:post_write_progress_barrier_top
                                                                                                                                                                                                                                                                                    View view68 = ViewBindings.a(view0, 0x7F0B0BD6);  // id:post_write_progress_barrier_top
                                                                                                                                                                                                                                                                                    if(((Barrier)view68) != null) {
                                                                                                                                                                                                                                                                                        v = 0x7F0B0BD7;  // id:post_write_progress_cancel
                                                                                                                                                                                                                                                                                        View view69 = ViewBindings.a(view0, 0x7F0B0BD7);  // id:post_write_progress_cancel
                                                                                                                                                                                                                                                                                        if(((TextView)view69) != null) {
                                                                                                                                                                                                                                                                                            v = 0x7F0B0BD8;  // id:post_write_progress_circular
                                                                                                                                                                                                                                                                                            View view70 = ViewBindings.a(view0, 0x7F0B0BD8);  // id:post_write_progress_circular
                                                                                                                                                                                                                                                                                            if(((ProgressBar)view70) != null) {
                                                                                                                                                                                                                                                                                                v = 0x7F0B0BD9;  // id:post_write_progress_horizontal
                                                                                                                                                                                                                                                                                                View view71 = ViewBindings.a(view0, 0x7F0B0BD9);  // id:post_write_progress_horizontal
                                                                                                                                                                                                                                                                                                if(((SmoothProgressBar)view71) != null) {
                                                                                                                                                                                                                                                                                                    v = 0x7F0B0BDA;  // id:post_write_progress_msg
                                                                                                                                                                                                                                                                                                    View view72 = ViewBindings.a(view0, 0x7F0B0BDA);  // id:post_write_progress_msg
                                                                                                                                                                                                                                                                                                    if(((TextView)view72) != null) {
                                                                                                                                                                                                                                                                                                        v = 0x7F0B0BDB;  // id:post_write_recycler
                                                                                                                                                                                                                                                                                                        View view73 = ViewBindings.a(view0, 0x7F0B0BDB);  // id:post_write_recycler
                                                                                                                                                                                                                                                                                                        if(((TouchyRecyclerView)view73) != null) {
                                                                                                                                                                                                                                                                                                            v = 0x7F0B0BE0;  // id:post_write_save_temp
                                                                                                                                                                                                                                                                                                            View view74 = ViewBindings.a(view0, 0x7F0B0BE0);  // id:post_write_save_temp
                                                                                                                                                                                                                                                                                                            if(((TextView)view74) != null) {
                                                                                                                                                                                                                                                                                                                v = 0x7F0B0BE2;  // id:post_write_subject
                                                                                                                                                                                                                                                                                                                View view75 = ViewBindings.a(view0, 0x7F0B0BE2);  // id:post_write_subject
                                                                                                                                                                                                                                                                                                                if(((AppCompatEditText)view75) != null) {
                                                                                                                                                                                                                                                                                                                    v = 0x7F0B0BE3;  // id:post_write_temp_list
                                                                                                                                                                                                                                                                                                                    View view76 = ViewBindings.a(view0, 0x7F0B0BE3);  // id:post_write_temp_list
                                                                                                                                                                                                                                                                                                                    if(((TextView)view76) != null) {
                                                                                                                                                                                                                                                                                                                        v = 0x7F0B0BE4;  // id:post_write_text_bar
                                                                                                                                                                                                                                                                                                                        View view77 = ViewBindings.a(view0, 0x7F0B0BE4);  // id:post_write_text_bar
                                                                                                                                                                                                                                                                                                                        if(((RichToolbar)view77) != null) {
                                                                                                                                                                                                                                                                                                                            v = 0x7F0B0BE5;  // id:post_write_text_palette
                                                                                                                                                                                                                                                                                                                            View view78 = ViewBindings.a(view0, 0x7F0B0BE5);  // id:post_write_text_palette
                                                                                                                                                                                                                                                                                                                            if(((ColorPickerView)view78) != null) {
                                                                                                                                                                                                                                                                                                                                v = 0x7F0B0BE6;  // id:post_write_toolbar
                                                                                                                                                                                                                                                                                                                                View view79 = ViewBindings.a(view0, 0x7F0B0BE6);  // id:post_write_toolbar
                                                                                                                                                                                                                                                                                                                                if(((DcToolbar)view79) != null) {
                                                                                                                                                                                                                                                                                                                                    v = 0x7F0B0BE7;  // id:post_write_use_def_nick
                                                                                                                                                                                                                                                                                                                                    View view80 = ViewBindings.a(view0, 0x7F0B0BE7);  // id:post_write_use_def_nick
                                                                                                                                                                                                                                                                                                                                    if(((TextView)view80) != null) {
                                                                                                                                                                                                                                                                                                                                        v = 0x7F0B0BE8;  // id:post_write_user_profile_anonymous
                                                                                                                                                                                                                                                                                                                                        View view81 = ViewBindings.a(view0, 0x7F0B0BE8);  // id:post_write_user_profile_anonymous
                                                                                                                                                                                                                                                                                                                                        if(((TextView)view81) != null) {
                                                                                                                                                                                                                                                                                                                                            v = 0x7F0B0BE9;  // id:post_write_user_profile_barrier
                                                                                                                                                                                                                                                                                                                                            View view82 = ViewBindings.a(view0, 0x7F0B0BE9);  // id:post_write_user_profile_barrier
                                                                                                                                                                                                                                                                                                                                            if(((Barrier)view82) != null) {
                                                                                                                                                                                                                                                                                                                                                v = 0x7F0B0BEA;  // id:post_write_user_profile_guide
                                                                                                                                                                                                                                                                                                                                                View view83 = ViewBindings.a(view0, 0x7F0B0BEA);  // id:post_write_user_profile_guide
                                                                                                                                                                                                                                                                                                                                                if(((Guideline)view83) != null) {
                                                                                                                                                                                                                                                                                                                                                    v = 0x7F0B0BEB;  // id:post_write_user_profile_icon
                                                                                                                                                                                                                                                                                                                                                    View view84 = ViewBindings.a(view0, 0x7F0B0BEB);  // id:post_write_user_profile_icon
                                                                                                                                                                                                                                                                                                                                                    if(((ImageView)view84) != null) {
                                                                                                                                                                                                                                                                                                                                                        v = 0x7F0B0BEC;  // id:post_write_user_profile_name
                                                                                                                                                                                                                                                                                                                                                        View view85 = ViewBindings.a(view0, 0x7F0B0BEC);  // id:post_write_user_profile_name
                                                                                                                                                                                                                                                                                                                                                        if(((TextView)view85) != null) {
                                                                                                                                                                                                                                                                                                                                                            v = 0x7F0B0BED;  // id:post_write_voice_container
                                                                                                                                                                                                                                                                                                                                                            View view86 = ViewBindings.a(view0, 0x7F0B0BED);  // id:post_write_voice_container
                                                                                                                                                                                                                                                                                                                                                            if(((FrameLayout)view86) != null) {
                                                                                                                                                                                                                                                                                                                                                                return new b0(((CoordinatorLayout)view0), ((CollapsingToolbarLayout)view1), ((ImageView)view2), view3, ((ImageView)view4), ((TextView)view5), ((ImageView)view6), ((TextView)view7), ((ConstraintLayout)view8), ((ProgressBar)view9), ((TextView)view10), ((ImageView)view11), ((TextView)view12), ((EditText)view13), ((ConstraintLayout)view14), ((ConstraintLayout)view15), ((TextView)view16), ((ConstraintLayout)view17), ((TextView)view18), ((PickedBottomIndicatorView)view19), ((RecyclerView)view20), ((TextView)view21), ((ImageView)view22), ((ConstraintLayout)view23), view24, ((ConstraintLayout)view25), ((AppBarLayout)view26), view27, ((TextView)view28), ((ConstraintLayout)view29), ((BetterTextView)view30), ((BetterTextView)view31), view32, ((ProgressBar)view33), ((LinearLayout)view34), ((ImageView)view35), ((ClearableEditText)view36), ((ImageView)view37), ((TextView)view38), ((CoordinatorLayout)view0), ((FrameLayout)view39), ((ViewStub)view40), ((ViewStub)view41), ((TextView)view42), ((ConstraintLayout)view43), ((ConstraintLayout)view44), ((BetterTextView)view45), ((ImageView)view46), ((ConstraintLayout)view47), ((TextView)view48), ((RecyclerView)view49), ((TextView)view50), ((ImageView)view51), ((LinearLayout)view52), ((FrameLayout)view53), view54, ((LinearLayout)view55), ((Barrier)view56), ((ImageView)view57), ((HorizontalScrollView)view58), ((BetterTextView)view59), ((ImageView)view60), ((ConstraintLayout)view61), ((FrameLayout)view62), view63, ((ClearableEditText)view64), ((ClearableEditText)view65), ((ConstraintLayout)view66), ((Barrier)view67), ((Barrier)view68), ((TextView)view69), ((ProgressBar)view70), ((SmoothProgressBar)view71), ((TextView)view72), ((TouchyRecyclerView)view73), ((TextView)view74), ((AppCompatEditText)view75), ((TextView)view76), ((RichToolbar)view77), ((ColorPickerView)view78), ((DcToolbar)view79), ((TextView)view80), ((TextView)view81), ((Barrier)view82), ((Guideline)view83), ((ImageView)view84), ((TextView)view85), ((FrameLayout)view86));
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
    public static b0 c(@NonNull LayoutInflater layoutInflater0) {
        return b0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0052, viewGroup0, false);  // layout:activity_post_write
        if(z) {
            viewGroup0.addView(view0);
        }
        return b0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

