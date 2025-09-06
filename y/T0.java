package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class t0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final LinearLayout c;
    @NonNull
    public final LinearLayout d;
    @NonNull
    public final LinearLayout e;
    @NonNull
    public final LinearLayout f;
    @NonNull
    public final RadioButton g;
    @NonNull
    public final RadioButton h;
    @NonNull
    public final RadioButton i;
    @NonNull
    public final RadioButton j;
    @NonNull
    public final RadioButton k;
    @NonNull
    public final DcToolbar l;

    private t0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull RadioButton radioButton0, @NonNull RadioButton radioButton1, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = linearLayout1;
        this.d = linearLayout2;
        this.e = linearLayout3;
        this.f = linearLayout4;
        this.g = radioButton0;
        this.h = radioButton1;
        this.i = radioButton2;
        this.j = radioButton3;
        this.k = radioButton4;
        this.l = dcToolbar0;
    }

    @NonNull
    public static t0 a(@NonNull View view0) {
        int v = 0x7F0B060C;  // id:image_size_setting_0
        View view1 = ViewBindings.a(view0, 0x7F0B060C);  // id:image_size_setting_0
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B060D;  // id:image_size_setting_1
            View view2 = ViewBindings.a(view0, 0x7F0B060D);  // id:image_size_setting_1
            if(((LinearLayout)view2) != null) {
                v = 0x7F0B060E;  // id:image_size_setting_2
                View view3 = ViewBindings.a(view0, 0x7F0B060E);  // id:image_size_setting_2
                if(((LinearLayout)view3) != null) {
                    v = 0x7F0B060F;  // id:image_size_setting_3
                    View view4 = ViewBindings.a(view0, 0x7F0B060F);  // id:image_size_setting_3
                    if(((LinearLayout)view4) != null) {
                        v = 0x7F0B0610;  // id:image_size_setting_4
                        View view5 = ViewBindings.a(view0, 0x7F0B0610);  // id:image_size_setting_4
                        if(((LinearLayout)view5) != null) {
                            v = 0x7F0B0611;  // id:image_size_setting_button0
                            View view6 = ViewBindings.a(view0, 0x7F0B0611);  // id:image_size_setting_button0
                            if(((RadioButton)view6) != null) {
                                v = 0x7F0B0612;  // id:image_size_setting_button1
                                View view7 = ViewBindings.a(view0, 0x7F0B0612);  // id:image_size_setting_button1
                                if(((RadioButton)view7) != null) {
                                    v = 0x7F0B0613;  // id:image_size_setting_button2
                                    View view8 = ViewBindings.a(view0, 0x7F0B0613);  // id:image_size_setting_button2
                                    if(((RadioButton)view8) != null) {
                                        v = 0x7F0B0614;  // id:image_size_setting_button3
                                        View view9 = ViewBindings.a(view0, 0x7F0B0614);  // id:image_size_setting_button3
                                        if(((RadioButton)view9) != null) {
                                            v = 0x7F0B0615;  // id:image_size_setting_button4
                                            View view10 = ViewBindings.a(view0, 0x7F0B0615);  // id:image_size_setting_button4
                                            if(((RadioButton)view10) != null) {
                                                v = 0x7F0B0616;  // id:image_size_setting_toolbar
                                                View view11 = ViewBindings.a(view0, 0x7F0B0616);  // id:image_size_setting_toolbar
                                                if(((DcToolbar)view11) != null) {
                                                    return new t0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((LinearLayout)view2), ((LinearLayout)view3), ((LinearLayout)view4), ((LinearLayout)view5), ((RadioButton)view6), ((RadioButton)view7), ((RadioButton)view8), ((RadioButton)view9), ((RadioButton)view10), ((DcToolbar)view11));
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
    public static t0 c(@NonNull LayoutInflater layoutInflater0) {
        return t0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0064, viewGroup0, false);  // layout:activity_setting_image_size
        if(z) {
            viewGroup0.addView(view0);
        }
        return t0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

