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
import com.dcinside.app.view.DcToolbar;
import kr.better.widget.BetterTextView;

public final class s0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final DcToolbar b;
    @NonNull
    public final LinearLayout c;
    @NonNull
    public final LinearLayout d;
    @NonNull
    public final SwitchCompat e;
    @NonNull
    public final LinearLayout f;
    @NonNull
    public final BetterTextView g;
    @NonNull
    public final TextView h;

    private s0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull DcToolbar dcToolbar0, @NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull SwitchCompat switchCompat0, @NonNull LinearLayout linearLayout2, @NonNull BetterTextView betterTextView0, @NonNull TextView textView0) {
        this.a = coordinatorLayout0;
        this.b = dcToolbar0;
        this.c = linearLayout0;
        this.d = linearLayout1;
        this.e = switchCompat0;
        this.f = linearLayout2;
        this.g = betterTextView0;
        this.h = textView0;
    }

    @NonNull
    public static s0 a(@NonNull View view0) {
        int v = 0x7F0B0E74;  // id:setting_hate_toolbar
        View view1 = ViewBindings.a(view0, 0x7F0B0E74);  // id:setting_hate_toolbar
        if(((DcToolbar)view1) != null) {
            v = 0x7F0B0E75;  // id:setting_hate_word_edit
            View view2 = ViewBindings.a(view0, 0x7F0B0E75);  // id:setting_hate_word_edit
            if(((LinearLayout)view2) != null) {
                v = 0x7F0B0E76;  // id:setting_hate_word_notice
                View view3 = ViewBindings.a(view0, 0x7F0B0E76);  // id:setting_hate_word_notice
                if(((LinearLayout)view3) != null) {
                    v = 0x7F0B0E77;  // id:setting_hate_word_notice_switch
                    View view4 = ViewBindings.a(view0, 0x7F0B0E77);  // id:setting_hate_word_notice_switch
                    if(((SwitchCompat)view4) != null) {
                        v = 0x7F0B0E78;  // id:setting_hate_word_notice_type
                        View view5 = ViewBindings.a(view0, 0x7F0B0E78);  // id:setting_hate_word_notice_type
                        if(((LinearLayout)view5) != null) {
                            v = 0x7F0B0E79;  // id:setting_hate_word_notice_type_title
                            View view6 = ViewBindings.a(view0, 0x7F0B0E79);  // id:setting_hate_word_notice_type_title
                            if(((BetterTextView)view6) != null) {
                                v = 0x7F0B0E7A;  // id:setting_hate_word_notice_value
                                View view7 = ViewBindings.a(view0, 0x7F0B0E7A);  // id:setting_hate_word_notice_value
                                if(((TextView)view7) != null) {
                                    return new s0(((CoordinatorLayout)view0), ((DcToolbar)view1), ((LinearLayout)view2), ((LinearLayout)view3), ((SwitchCompat)view4), ((LinearLayout)view5), ((BetterTextView)view6), ((TextView)view7));
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
    public static s0 c(@NonNull LayoutInflater layoutInflater0) {
        return s0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0063, viewGroup0, false);  // layout:activity_setting_hate
        if(z) {
            viewGroup0.addView(view0);
        }
        return s0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

