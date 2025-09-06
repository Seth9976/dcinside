package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class p0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final SwitchCompat d;
    @NonNull
    public final TextView e;
    @NonNull
    public final LinearLayout f;
    @NonNull
    public final TextView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final ProgressBar i;
    @NonNull
    public final LinearLayout j;
    @NonNull
    public final TextView k;
    @NonNull
    public final TextView l;
    @NonNull
    public final LinearLayout m;
    @NonNull
    public final TextView n;
    @NonNull
    public final TextView o;
    @NonNull
    public final DcToolbar p;

    private p0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull SwitchCompat switchCompat0, @NonNull TextView textView1, @NonNull LinearLayout linearLayout1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ProgressBar progressBar0, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayout linearLayout3, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = textView0;
        this.d = switchCompat0;
        this.e = textView1;
        this.f = linearLayout1;
        this.g = textView2;
        this.h = textView3;
        this.i = progressBar0;
        this.j = linearLayout2;
        this.k = textView4;
        this.l = textView5;
        this.m = linearLayout3;
        this.n = textView6;
        this.o = textView7;
        this.p = dcToolbar0;
    }

    @NonNull
    public static p0 a(@NonNull View view0) {
        int v = 0x7F0B0E5A;  // id:setting_font_fix_read_text_size
        View view1 = ViewBindings.a(view0, 0x7F0B0E5A);  // id:setting_font_fix_read_text_size
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0E5B;  // id:setting_font_fix_read_text_size_msg
            View view2 = ViewBindings.a(view0, 0x7F0B0E5B);  // id:setting_font_fix_read_text_size_msg
            if(((TextView)view2) != null) {
                v = 0x7F0B0E5C;  // id:setting_font_fix_read_text_size_switch
                View view3 = ViewBindings.a(view0, 0x7F0B0E5C);  // id:setting_font_fix_read_text_size_switch
                if(((SwitchCompat)view3) != null) {
                    v = 0x7F0B0E5D;  // id:setting_font_fix_read_text_size_title
                    View view4 = ViewBindings.a(view0, 0x7F0B0E5D);  // id:setting_font_fix_read_text_size_title
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0E5E;  // id:setting_font_list_text_size
                        View view5 = ViewBindings.a(view0, 0x7F0B0E5E);  // id:setting_font_list_text_size
                        if(((LinearLayout)view5) != null) {
                            v = 0x7F0B0E5F;  // id:setting_font_list_text_size_title
                            View view6 = ViewBindings.a(view0, 0x7F0B0E5F);  // id:setting_font_list_text_size_title
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0E60;  // id:setting_font_list_text_size_value
                                View view7 = ViewBindings.a(view0, 0x7F0B0E60);  // id:setting_font_list_text_size_value
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0E61;  // id:setting_font_loading
                                    View view8 = ViewBindings.a(view0, 0x7F0B0E61);  // id:setting_font_loading
                                    if(((ProgressBar)view8) != null) {
                                        v = 0x7F0B0E62;  // id:setting_font_read_text_size
                                        View view9 = ViewBindings.a(view0, 0x7F0B0E62);  // id:setting_font_read_text_size
                                        if(((LinearLayout)view9) != null) {
                                            v = 0x7F0B0E63;  // id:setting_font_read_text_size_title
                                            View view10 = ViewBindings.a(view0, 0x7F0B0E63);  // id:setting_font_read_text_size_title
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0E64;  // id:setting_font_read_text_size_value
                                                View view11 = ViewBindings.a(view0, 0x7F0B0E64);  // id:setting_font_read_text_size_value
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B0E65;  // id:setting_font_reply_text_size
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0E65);  // id:setting_font_reply_text_size
                                                    if(((LinearLayout)view12) != null) {
                                                        v = 0x7F0B0E66;  // id:setting_font_reply_text_size_title
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0E66);  // id:setting_font_reply_text_size_title
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B0E67;  // id:setting_font_reply_text_size_value
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0E67);  // id:setting_font_reply_text_size_value
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B0E68;  // id:setting_font_toolbar
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0E68);  // id:setting_font_toolbar
                                                                if(((DcToolbar)view15) != null) {
                                                                    return new p0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((TextView)view2), ((SwitchCompat)view3), ((TextView)view4), ((LinearLayout)view5), ((TextView)view6), ((TextView)view7), ((ProgressBar)view8), ((LinearLayout)view9), ((TextView)view10), ((TextView)view11), ((LinearLayout)view12), ((TextView)view13), ((TextView)view14), ((DcToolbar)view15));
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
    public static p0 c(@NonNull LayoutInflater layoutInflater0) {
        return p0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static p0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0060, viewGroup0, false);  // layout:activity_setting_font
        if(z) {
            viewGroup0.addView(view0);
        }
        return p0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

