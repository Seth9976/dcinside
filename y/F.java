package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class f implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final DcToolbar c;

    private f(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FrameLayout frameLayout0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = frameLayout0;
        this.c = dcToolbar0;
    }

    @NonNull
    public static f a(@NonNull View view0) {
        int v = 0x7F0B0151;  // id:archive_voice_select_container
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0151);  // id:archive_voice_select_container
        if(frameLayout0 != null) {
            v = 0x7F0B0152;  // id:archive_voice_select_toolbar
            DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B0152);  // id:archive_voice_select_toolbar
            if(dcToolbar0 != null) {
                return new f(((CoordinatorLayout)view0), frameLayout0, dcToolbar0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater0) {
        return f.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0021, viewGroup0, false);  // layout:activity_archive_voice_select
        if(z) {
            viewGroup0.addView(view0);
        }
        return f.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

