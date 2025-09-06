package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class j implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final SwitchCompat c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final ProgressBar h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final DcToolbar k;

    private j(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull SwitchCompat switchCompat0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ProgressBar progressBar0, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = switchCompat0;
        this.d = textView1;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = progressBar0;
        this.i = textView5;
        this.j = textView6;
        this.k = dcToolbar0;
    }

    @NonNull
    public static j a(@NonNull View view0) {
        int v = 0x7F0B0184;  // id:backup_auto_msg
        View view1 = ViewBindings.a(view0, 0x7F0B0184);  // id:backup_auto_msg
        if(((TextView)view1) != null) {
            v = 0x7F0B0185;  // id:backup_auto_switch
            View view2 = ViewBindings.a(view0, 0x7F0B0185);  // id:backup_auto_switch
            if(((SwitchCompat)view2) != null) {
                v = 0x7F0B0186;  // id:backup_auto_title
                View view3 = ViewBindings.a(view0, 0x7F0B0186);  // id:backup_auto_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0187;  // id:backup_backup
                    View view4 = ViewBindings.a(view0, 0x7F0B0187);  // id:backup_backup
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0188;  // id:backup_hint_msg
                        View view5 = ViewBindings.a(view0, 0x7F0B0188);  // id:backup_hint_msg
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0189;  // id:backup_location_msg
                            View view6 = ViewBindings.a(view0, 0x7F0B0189);  // id:backup_location_msg
                            if(((TextView)view6) != null) {
                                v = 0x7F0B018A;  // id:backup_progress
                                View view7 = ViewBindings.a(view0, 0x7F0B018A);  // id:backup_progress
                                if(((ProgressBar)view7) != null) {
                                    v = 0x7F0B018B;  // id:backup_restore
                                    View view8 = ViewBindings.a(view0, 0x7F0B018B);  // id:backup_restore
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B018C;  // id:backup_target_msg
                                        View view9 = ViewBindings.a(view0, 0x7F0B018C);  // id:backup_target_msg
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B018D;  // id:backup_toolbar
                                            View view10 = ViewBindings.a(view0, 0x7F0B018D);  // id:backup_toolbar
                                            if(((DcToolbar)view10) != null) {
                                                return new j(((CoordinatorLayout)view0), ((TextView)view1), ((SwitchCompat)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((TextView)view6), ((ProgressBar)view7), ((TextView)view8), ((TextView)view9), ((DcToolbar)view10));
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
    public static j c(@NonNull LayoutInflater layoutInflater0) {
        return j.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0025, viewGroup0, false);  // layout:activity_backup
        if(z) {
            viewGroup0.addView(view0);
        }
        return j.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

