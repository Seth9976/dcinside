package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;

public final class w implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final SwitchCompat c;
    @NonNull
    public final LinearLayout d;
    @NonNull
    public final ClearableEditText e;
    @NonNull
    public final ClearableEditText f;
    @NonNull
    public final DcToolbar g;

    private w(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull SwitchCompat switchCompat0, @NonNull LinearLayout linearLayout1, @NonNull ClearableEditText clearableEditText0, @NonNull ClearableEditText clearableEditText1, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = switchCompat0;
        this.d = linearLayout1;
        this.e = clearableEditText0;
        this.f = clearableEditText1;
        this.g = dcToolbar0;
    }

    @NonNull
    public static w a(@NonNull View view0) {
        int v = 0x7F0B055A;  // id:guest_bg
        View view1 = ViewBindings.a(view0, 0x7F0B055A);  // id:guest_bg
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B055B;  // id:guest_enable
            View view2 = ViewBindings.a(view0, 0x7F0B055B);  // id:guest_enable
            if(((SwitchCompat)view2) != null) {
                v = 0x7F0B055C;  // id:guest_enable_view
                View view3 = ViewBindings.a(view0, 0x7F0B055C);  // id:guest_enable_view
                if(((LinearLayout)view3) != null) {
                    v = 0x7F0B055D;  // id:guest_nick
                    View view4 = ViewBindings.a(view0, 0x7F0B055D);  // id:guest_nick
                    if(((ClearableEditText)view4) != null) {
                        v = 0x7F0B055E;  // id:guest_password
                        View view5 = ViewBindings.a(view0, 0x7F0B055E);  // id:guest_password
                        if(((ClearableEditText)view5) != null) {
                            v = 0x7F0B055F;  // id:guest_toolbar
                            View view6 = ViewBindings.a(view0, 0x7F0B055F);  // id:guest_toolbar
                            if(((DcToolbar)view6) != null) {
                                return new w(((CoordinatorLayout)view0), ((LinearLayout)view1), ((SwitchCompat)view2), ((LinearLayout)view3), ((ClearableEditText)view4), ((ClearableEditText)view5), ((DcToolbar)view6));
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
    public static w c(@NonNull LayoutInflater layoutInflater0) {
        return w.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0034, viewGroup0, false);  // layout:activity_guest_info
        if(z) {
            viewGroup0.addView(view0);
        }
        return w.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

