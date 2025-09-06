package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class m1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final LinearLayout e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final ImageView h;
    @NonNull
    public final LinearLayout i;
    @NonNull
    public final TextView j;
    @NonNull
    public final FrameLayout k;
    @NonNull
    public final TextView l;
    @NonNull
    public final TextView m;

    private m1(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull LinearLayout linearLayout0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout1, @NonNull TextView textView3, @NonNull FrameLayout frameLayout0, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = imageView0;
        this.d = imageView1;
        this.e = linearLayout0;
        this.f = textView1;
        this.g = textView2;
        this.h = imageView2;
        this.i = linearLayout1;
        this.j = textView3;
        this.k = frameLayout0;
        this.l = textView4;
        this.m = textView5;
    }

    @NonNull
    public static m1 a(@NonNull View view0) {
        int v = 0x7F0B07D3;  // id:manager_notify_accept
        View view1 = ViewBindings.a(view0, 0x7F0B07D3);  // id:manager_notify_accept
        if(((TextView)view1) != null) {
            v = 0x7F0B07D4;  // id:manager_notify_close
            View view2 = ViewBindings.a(view0, 0x7F0B07D4);  // id:manager_notify_close
            if(((ImageView)view2) != null) {
                v = 0x7F0B07D5;  // id:manager_notify_management_check
                View view3 = ViewBindings.a(view0, 0x7F0B07D5);  // id:manager_notify_management_check
                if(((ImageView)view3) != null) {
                    v = 0x7F0B07D6;  // id:manager_notify_management_policy
                    View view4 = ViewBindings.a(view0, 0x7F0B07D6);  // id:manager_notify_management_policy
                    if(((LinearLayout)view4) != null) {
                        v = 0x7F0B07D7;  // id:manager_notify_management_title
                        View view5 = ViewBindings.a(view0, 0x7F0B07D7);  // id:manager_notify_management_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B07D8;  // id:manager_notify_next_again
                            View view6 = ViewBindings.a(view0, 0x7F0B07D8);  // id:manager_notify_next_again
                            if(((TextView)view6) != null) {
                                v = 0x7F0B07D9;  // id:manager_notify_privacy_check
                                View view7 = ViewBindings.a(view0, 0x7F0B07D9);  // id:manager_notify_privacy_check
                                if(((ImageView)view7) != null) {
                                    v = 0x7F0B07DA;  // id:manager_notify_privacy_policy
                                    View view8 = ViewBindings.a(view0, 0x7F0B07DA);  // id:manager_notify_privacy_policy
                                    if(((LinearLayout)view8) != null) {
                                        v = 0x7F0B07DB;  // id:manager_notify_privacy_title
                                        View view9 = ViewBindings.a(view0, 0x7F0B07DB);  // id:manager_notify_privacy_title
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B07DC;  // id:manager_notify_progress
                                            View view10 = ViewBindings.a(view0, 0x7F0B07DC);  // id:manager_notify_progress
                                            if(((FrameLayout)view10) != null) {
                                                v = 0x7F0B07DD;  // id:manager_notify_reject
                                                View view11 = ViewBindings.a(view0, 0x7F0B07DD);  // id:manager_notify_reject
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B07DE;  // id:manager_notify_title
                                                    View view12 = ViewBindings.a(view0, 0x7F0B07DE);  // id:manager_notify_title
                                                    if(((TextView)view12) != null) {
                                                        return new m1(((ConstraintLayout)view0), ((TextView)view1), ((ImageView)view2), ((ImageView)view3), ((LinearLayout)view4), ((TextView)view5), ((TextView)view6), ((ImageView)view7), ((LinearLayout)view8), ((TextView)view9), ((FrameLayout)view10), ((TextView)view11), ((TextView)view12));
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
    public static m1 c(@NonNull LayoutInflater layoutInflater0) {
        return m1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static m1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00CC, viewGroup0, false);  // layout:dialog_fragment_manager_notify
        if(z) {
            viewGroup0.addView(view0);
        }
        return m1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

