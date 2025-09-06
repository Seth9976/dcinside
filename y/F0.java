package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;

public final class f0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ClearableEditText d;
    @NonNull
    public final Barrier e;
    @NonNull
    public final TextView f;
    @NonNull
    public final DcToolbar g;

    private f0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ClearableEditText clearableEditText0, @NonNull Barrier barrier0, @NonNull TextView textView2, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = clearableEditText0;
        this.e = barrier0;
        this.f = textView2;
        this.g = dcToolbar0;
    }

    @NonNull
    public static f0 a(@NonNull View view0) {
        int v = 0x7F0B0B0B;  // id:post_secret_clear
        View view1 = ViewBindings.a(view0, 0x7F0B0B0B);  // id:post_secret_clear
        if(((TextView)view1) != null) {
            v = 0x7F0B0B0D;  // id:post_secret_manager_content
            View view2 = ViewBindings.a(view0, 0x7F0B0B0D);  // id:post_secret_manager_content
            if(((TextView)view2) != null) {
                v = 0x7F0B0B0E;  // id:post_secret_password
                View view3 = ViewBindings.a(view0, 0x7F0B0B0E);  // id:post_secret_password
                if(((ClearableEditText)view3) != null) {
                    v = 0x7F0B0B0F;  // id:post_secret_password_barrier
                    View view4 = ViewBindings.a(view0, 0x7F0B0B0F);  // id:post_secret_password_barrier
                    if(((Barrier)view4) != null) {
                        v = 0x7F0B0B10;  // id:post_secret_password_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0B10);  // id:post_secret_password_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0B13;  // id:post_secret_toolbar
                            View view6 = ViewBindings.a(view0, 0x7F0B0B13);  // id:post_secret_toolbar
                            if(((DcToolbar)view6) != null) {
                                return new f0(((CoordinatorLayout)view0), ((TextView)view1), ((TextView)view2), ((ClearableEditText)view3), ((Barrier)view4), ((TextView)view5), ((DcToolbar)view6));
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
    public static f0 c(@NonNull LayoutInflater layoutInflater0) {
        return f0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0056, viewGroup0, false);  // layout:activity_secret_setting
        if(z) {
            viewGroup0.addView(view0);
        }
        return f0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

