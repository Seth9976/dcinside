package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class i implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ImageView g;
    @NonNull
    public final ConstraintLayout h;
    @NonNull
    public final AppCompatSpinner i;
    @NonNull
    public final AppCompatSpinner j;
    @NonNull
    public final DcToolbar k;

    private i(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout0, @NonNull AppCompatSpinner appCompatSpinner0, @NonNull AppCompatSpinner appCompatSpinner1, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = imageView0;
        this.h = constraintLayout0;
        this.i = appCompatSpinner0;
        this.j = appCompatSpinner1;
        this.k = dcToolbar0;
    }

    @NonNull
    public static i a(@NonNull View view0) {
        int v = 0x7F0B0A21;  // id:post_auto_del_clear
        View view1 = ViewBindings.a(view0, 0x7F0B0A21);  // id:post_auto_del_clear
        if(((TextView)view1) != null) {
            v = 0x7F0B0A22;  // id:post_auto_del_colon
            View view2 = ViewBindings.a(view0, 0x7F0B0A22);  // id:post_auto_del_colon
            if(((TextView)view2) != null) {
                v = 0x7F0B0A23;  // id:post_auto_del_content
                View view3 = ViewBindings.a(view0, 0x7F0B0A23);  // id:post_auto_del_content
                if(((TextView)view3) != null) {
                    v = 0x7F0B0A24;  // id:post_auto_del_content_Sub
                    View view4 = ViewBindings.a(view0, 0x7F0B0A24);  // id:post_auto_del_content_Sub
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0A25;  // id:post_auto_del_date
                        View view5 = ViewBindings.a(view0, 0x7F0B0A25);  // id:post_auto_del_date
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0A26;  // id:post_auto_del_date_pick_ic
                            View view6 = ViewBindings.a(view0, 0x7F0B0A26);  // id:post_auto_del_date_pick_ic
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B0A27;  // id:post_auto_del_date_wrapper
                                View view7 = ViewBindings.a(view0, 0x7F0B0A27);  // id:post_auto_del_date_wrapper
                                if(((ConstraintLayout)view7) != null) {
                                    v = 0x7F0B0A29;  // id:post_auto_del_hour
                                    View view8 = ViewBindings.a(view0, 0x7F0B0A29);  // id:post_auto_del_hour
                                    if(((AppCompatSpinner)view8) != null) {
                                        v = 0x7F0B0A2A;  // id:post_auto_del_minute
                                        View view9 = ViewBindings.a(view0, 0x7F0B0A2A);  // id:post_auto_del_minute
                                        if(((AppCompatSpinner)view9) != null) {
                                            v = 0x7F0B0A2D;  // id:post_auto_del_toolbar
                                            View view10 = ViewBindings.a(view0, 0x7F0B0A2D);  // id:post_auto_del_toolbar
                                            if(((DcToolbar)view10) != null) {
                                                return new i(((CoordinatorLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((ImageView)view6), ((ConstraintLayout)view7), ((AppCompatSpinner)view8), ((AppCompatSpinner)view9), ((DcToolbar)view10));
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
    public static i c(@NonNull LayoutInflater layoutInflater0) {
        return i.d(layoutInflater0, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0024, viewGroup0, false);  // layout:activity_auto_del_setting
        if(z) {
            viewGroup0.addView(view0);
        }
        return i.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

