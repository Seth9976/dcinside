package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class u implements ViewBinding {
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
    public final ProgressBar h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final DcToolbar k;

    private u(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = imageView0;
        this.h = progressBar0;
        this.i = textView5;
        this.j = textView6;
        this.k = dcToolbar0;
    }

    @NonNull
    public static u a(@NonNull View view0) {
        int v = 0x7F0B0506;  // id:gallery_transfer_cancel
        View view1 = ViewBindings.a(view0, 0x7F0B0506);  // id:gallery_transfer_cancel
        if(((TextView)view1) != null) {
            v = 0x7F0B0507;  // id:gallery_transfer_date_content
            View view2 = ViewBindings.a(view0, 0x7F0B0507);  // id:gallery_transfer_date_content
            if(((TextView)view2) != null) {
                v = 0x7F0B0508;  // id:gallery_transfer_date_title
                View view3 = ViewBindings.a(view0, 0x7F0B0508);  // id:gallery_transfer_date_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0509;  // id:gallery_transfer_gallery_content
                    View view4 = ViewBindings.a(view0, 0x7F0B0509);  // id:gallery_transfer_gallery_content
                    if(((TextView)view4) != null) {
                        v = 0x7F0B050A;  // id:gallery_transfer_gallery_title
                        View view5 = ViewBindings.a(view0, 0x7F0B050A);  // id:gallery_transfer_gallery_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B050B;  // id:gallery_transfer_img
                            View view6 = ViewBindings.a(view0, 0x7F0B050B);  // id:gallery_transfer_img
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B050C;  // id:gallery_transfer_progress
                                View view7 = ViewBindings.a(view0, 0x7F0B050C);  // id:gallery_transfer_progress
                                if(((ProgressBar)view7) != null) {
                                    v = 0x7F0B050D;  // id:gallery_transfer_reason_content
                                    View view8 = ViewBindings.a(view0, 0x7F0B050D);  // id:gallery_transfer_reason_content
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B050E;  // id:gallery_transfer_reason_title
                                        View view9 = ViewBindings.a(view0, 0x7F0B050E);  // id:gallery_transfer_reason_title
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B050F;  // id:gallery_transfer_toolbar
                                            View view10 = ViewBindings.a(view0, 0x7F0B050F);  // id:gallery_transfer_toolbar
                                            if(((DcToolbar)view10) != null) {
                                                return new u(((CoordinatorLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((ImageView)view6), ((ProgressBar)view7), ((TextView)view8), ((TextView)view9), ((DcToolbar)view10));
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
    public static u c(@NonNull LayoutInflater layoutInflater0) {
        return u.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0032, viewGroup0, false);  // layout:activity_gallery_transfer
        if(z) {
            viewGroup0.addView(view0);
        }
        return u.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

