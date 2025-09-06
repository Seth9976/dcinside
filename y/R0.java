package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;

public final class r0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final SwitchCompat c;
    @NonNull
    public final LinearLayout d;
    @NonNull
    public final TextView e;
    @NonNull
    public final ClearableEditText f;
    @NonNull
    public final TextView g;
    @NonNull
    public final LinearLayout h;
    @NonNull
    public final DcToolbar i;
    @NonNull
    public final LinearLayout j;
    @NonNull
    public final SwitchCompat k;
    @NonNull
    public final LinearLayout l;
    @NonNull
    public final View m;
    @NonNull
    public final TextView n;
    @NonNull
    public final ClearableEditText o;
    @NonNull
    public final View p;
    @NonNull
    public final TextView q;
    @NonNull
    public final ClearableEditText r;

    private r0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull SwitchCompat switchCompat0, @NonNull LinearLayout linearLayout1, @NonNull TextView textView0, @NonNull ClearableEditText clearableEditText0, @NonNull TextView textView1, @NonNull LinearLayout linearLayout2, @NonNull DcToolbar dcToolbar0, @NonNull LinearLayout linearLayout3, @NonNull SwitchCompat switchCompat1, @NonNull LinearLayout linearLayout4, @NonNull View view0, @NonNull TextView textView2, @NonNull ClearableEditText clearableEditText1, @NonNull View view1, @NonNull TextView textView3, @NonNull ClearableEditText clearableEditText2) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = switchCompat0;
        this.d = linearLayout1;
        this.e = textView0;
        this.f = clearableEditText0;
        this.g = textView1;
        this.h = linearLayout2;
        this.i = dcToolbar0;
        this.j = linearLayout3;
        this.k = switchCompat1;
        this.l = linearLayout4;
        this.m = view0;
        this.n = textView2;
        this.o = clearableEditText1;
        this.p = view1;
        this.q = textView3;
        this.r = clearableEditText2;
    }

    @NonNull
    public static r0 a(@NonNull View view0) {
        int v = 0x7F0B0D6B;  // id:reply_setting_bg
        View view1 = ViewBindings.a(view0, 0x7F0B0D6B);  // id:reply_setting_bg
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0D6C;  // id:reply_setting_enable
            View view2 = ViewBindings.a(view0, 0x7F0B0D6C);  // id:reply_setting_enable
            if(((SwitchCompat)view2) != null) {
                v = 0x7F0B0D6D;  // id:reply_setting_enable_view
                View view3 = ViewBindings.a(view0, 0x7F0B0D6D);  // id:reply_setting_enable_view
                if(((LinearLayout)view3) != null) {
                    v = 0x7F0B0D6E;  // id:reply_setting_suffix_title
                    View view4 = ViewBindings.a(view0, 0x7F0B0D6E);  // id:reply_setting_suffix_title
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0D6F;  // id:reply_setting_suffix_value
                        View view5 = ViewBindings.a(view0, 0x7F0B0D6F);  // id:reply_setting_suffix_value
                        if(((ClearableEditText)view5) != null) {
                            v = 0x7F0B0E6A;  // id:setting_gallery_text_option_remove_button
                            View view6 = ViewBindings.a(view0, 0x7F0B0E6A);  // id:setting_gallery_text_option_remove_button
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0E6B;  // id:setting_gallery_text_option_remove_group
                                View view7 = ViewBindings.a(view0, 0x7F0B0E6B);  // id:setting_gallery_text_option_remove_group
                                if(((LinearLayout)view7) != null) {
                                    v = 0x7F0B0E6C;  // id:setting_gallery_text_option_toolbar
                                    View view8 = ViewBindings.a(view0, 0x7F0B0E6C);  // id:setting_gallery_text_option_toolbar
                                    if(((DcToolbar)view8) != null) {
                                        v = 0x7F0B1107;  // id:write_setting_bg
                                        View view9 = ViewBindings.a(view0, 0x7F0B1107);  // id:write_setting_bg
                                        if(((LinearLayout)view9) != null) {
                                            v = 0x7F0B1108;  // id:write_setting_enable
                                            View view10 = ViewBindings.a(view0, 0x7F0B1108);  // id:write_setting_enable
                                            if(((SwitchCompat)view10) != null) {
                                                v = 0x7F0B1109;  // id:write_setting_enable_view
                                                View view11 = ViewBindings.a(view0, 0x7F0B1109);  // id:write_setting_enable_view
                                                if(((LinearLayout)view11) != null) {
                                                    v = 0x7F0B110C;  // id:write_setting_prefix_color
                                                    View view12 = ViewBindings.a(view0, 0x7F0B110C);  // id:write_setting_prefix_color
                                                    if(view12 != null) {
                                                        v = 0x7F0B110D;  // id:write_setting_prefix_title
                                                        View view13 = ViewBindings.a(view0, 0x7F0B110D);  // id:write_setting_prefix_title
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B110E;  // id:write_setting_prefix_value
                                                            View view14 = ViewBindings.a(view0, 0x7F0B110E);  // id:write_setting_prefix_value
                                                            if(((ClearableEditText)view14) != null) {
                                                                v = 0x7F0B110F;  // id:write_setting_suffix_color
                                                                View view15 = ViewBindings.a(view0, 0x7F0B110F);  // id:write_setting_suffix_color
                                                                if(view15 != null) {
                                                                    v = 0x7F0B1110;  // id:write_setting_suffix_title
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B1110);  // id:write_setting_suffix_title
                                                                    if(((TextView)view16) != null) {
                                                                        v = 0x7F0B1111;  // id:write_setting_suffix_value
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B1111);  // id:write_setting_suffix_value
                                                                        if(((ClearableEditText)view17) != null) {
                                                                            return new r0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((SwitchCompat)view2), ((LinearLayout)view3), ((TextView)view4), ((ClearableEditText)view5), ((TextView)view6), ((LinearLayout)view7), ((DcToolbar)view8), ((LinearLayout)view9), ((SwitchCompat)view10), ((LinearLayout)view11), view12, ((TextView)view13), ((ClearableEditText)view14), view15, ((TextView)view16), ((ClearableEditText)view17));
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
    public static r0 c(@NonNull LayoutInflater layoutInflater0) {
        return r0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0062, viewGroup0, false);  // layout:activity_setting_gallery_text_option
        if(z) {
            viewGroup0.addView(view0);
        }
        return r0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

