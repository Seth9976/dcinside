package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.Events;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks.Group;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
public class PlayerControlView extends FrameLayout {
    final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        final PlayerControlView c;

        private AudioTrackSelectionAdapter() {
        }

        AudioTrackSelectionAdapter(androidx.media3.ui.PlayerControlView.1 playerControlView$10) {
        }

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void A(SubSettingViewHolder playerControlView$SubSettingViewHolder0) {
            playerControlView$SubSettingViewHolder0.a.setText(string.exo_track_selection_auto);
            boolean z = this.E(((Player)Assertions.g(PlayerControlView.this.b9)).A0());
            playerControlView$SubSettingViewHolder0.b.setVisibility((z ? 4 : 0));
            j j0 = (View view0) -> if(PlayerControlView.this.b9 != null && PlayerControlView.this.b9.v0(29)) {
                TrackSelectionParameters trackSelectionParameters0 = PlayerControlView.this.b9.A0().F().G(1).q0(1, false).D();
                PlayerControlView.this.b9.Z0(trackSelectionParameters0);
                PlayerControlView.this.f.y(1, PlayerControlView.this.getResources().getString(string.exo_track_selection_auto));
                PlayerControlView.this.k.dismiss();
            };
            playerControlView$SubSettingViewHolder0.itemView.setOnClickListener(j0);
        }

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void C(String s) {
            PlayerControlView.this.f.y(1, s);
        }

        private boolean E(TrackSelectionParameters trackSelectionParameters0) {
            for(int v = 0; v < this.a.size(); ++v) {
                TrackGroup trackGroup0 = ((TrackInformation)this.a.get(v)).a.c();
                if(trackSelectionParameters0.A.containsKey(trackGroup0)) {
                    return true;
                }
            }
            return false;
        }

        // 检测为 Lambda 实现
        private void F(View view0) [...]

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void x(List list0) {
            this.a = list0;
            TrackSelectionParameters trackSelectionParameters0 = ((Player)Assertions.g(PlayerControlView.this.b9)).A0();
            if(list0.isEmpty()) {
                String s = PlayerControlView.this.getResources().getString(string.exo_track_selection_none);
                PlayerControlView.this.f.y(1, s);
                return;
            }
            if(!this.E(trackSelectionParameters0)) {
                String s1 = PlayerControlView.this.getResources().getString(string.exo_track_selection_auto);
                PlayerControlView.this.f.y(1, s1);
                return;
            }
            for(int v = 0; v < list0.size(); ++v) {
                TrackInformation playerControlView$TrackInformation0 = (TrackInformation)list0.get(v);
                if(playerControlView$TrackInformation0.a()) {
                    PlayerControlView.this.f.y(1, playerControlView$TrackInformation0.c);
                    return;
                }
            }
        }
    }

    final class ComponentListener implements View.OnClickListener, PopupWindow.OnDismissListener, Listener, OnScrubListener {
        final PlayerControlView a;

        private ComponentListener() {
        }

        ComponentListener(androidx.media3.ui.PlayerControlView.1 playerControlView$10) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void A(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void C(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void E(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void F(boolean z) {
        }

        @Override  // androidx.media3.ui.TimeBar$OnScrubListener
        public void G(TimeBar timeBar0, long v) {
            if(PlayerControlView.this.D != null) {
                PlayerControlView.this.D.setText(Util.H0(PlayerControlView.this.F, PlayerControlView.this.G, v));
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void H(int v, boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void I(MediaMetadata mediaMetadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void J(PlaybackException playbackException0) {
        }

        @Override  // androidx.media3.ui.TimeBar$OnScrubListener
        public void K(TimeBar timeBar0, long v, boolean z) {
            PlayerControlView.this.j9 = false;
            if(!z && PlayerControlView.this.b9 != null) {
                PlayerControlView.this.m0(PlayerControlView.this.b9, v);
            }
            PlayerControlView.this.a.X();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void L(Commands player$Commands0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void N(Player player0, Events player$Events0) {
            if(player$Events0.b(new int[]{4, 5, 13})) {
                PlayerControlView.this.w0();
            }
            if(player$Events0.b(new int[]{4, 5, 7, 13})) {
                PlayerControlView.this.y0();
            }
            if(player$Events0.b(new int[]{8, 13})) {
                PlayerControlView.this.z0();
            }
            if(player$Events0.b(new int[]{9, 13})) {
                PlayerControlView.this.D0();
            }
            if(player$Events0.b(new int[]{8, 9, 11, 0, 16, 17, 13})) {
                PlayerControlView.this.v0();
            }
            if(player$Events0.b(new int[]{11, 0, 13})) {
                PlayerControlView.this.E0();
            }
            if(player$Events0.b(new int[]{12, 13})) {
                PlayerControlView.this.x0();
            }
            if(player$Events0.b(new int[]{2, 13})) {
                PlayerControlView.this.F0();
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Q(Timeline timeline0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void R(long v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void S(Tracks tracks0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void T(DeviceInfo deviceInfo0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void V(boolean z, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Y(PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Z(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a(VideoSize videoSize0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a0(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void c0(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void d(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void f0(long v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void g0(TrackSelectionParameters trackSelectionParameters0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void h0() {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void i0(MediaItem mediaItem0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void l0(int v, int v1) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void o0(int v) {
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            Player player0 = PlayerControlView.this.b9;
            if(player0 == null) {
                return;
            }
            PlayerControlView.this.a.X();
            if(PlayerControlView.this.n == view0) {
                if(player0.v0(9)) {
                    player0.R1();
                }
            }
            else if(PlayerControlView.this.m == view0) {
                if(player0.v0(7)) {
                    player0.B1();
                }
            }
            else if(PlayerControlView.this.p == view0) {
                if(player0.b() != 4 && player0.v0(12)) {
                    player0.f1();
                }
            }
            else if(PlayerControlView.this.q != view0) {
                if(PlayerControlView.this.o == view0) {
                    Util.T0(player0, PlayerControlView.this.h9);
                    return;
                }
                if(PlayerControlView.this.t == view0) {
                    if(player0.v0(15)) {
                        player0.q(RepeatModeUtil.a(player0.i(), PlayerControlView.this.m9));
                    }
                }
                else if(PlayerControlView.this.u != view0) {
                    if(PlayerControlView.this.z == view0) {
                        PlayerControlView.this.a.W();
                        PlayerControlView.this.V(PlayerControlView.this.f, PlayerControlView.this.z);
                        return;
                    }
                    if(PlayerControlView.this.A == view0) {
                        PlayerControlView.this.a.W();
                        PlayerControlView.this.V(PlayerControlView.this.g, PlayerControlView.this.A);
                        return;
                    }
                    if(PlayerControlView.this.B == view0) {
                        PlayerControlView.this.a.W();
                        PlayerControlView.this.V(PlayerControlView.this.i, PlayerControlView.this.B);
                        return;
                    }
                    if(PlayerControlView.this.w == view0) {
                        PlayerControlView.this.a.W();
                        PlayerControlView.this.V(PlayerControlView.this.h, PlayerControlView.this.w);
                    }
                }
                else if(player0.v0(14)) {
                    player0.E0(!player0.t2());
                }
            }
            else if(player0.v0(11)) {
                player0.v2();
            }
        }

        @Override  // android.widget.PopupWindow$OnDismissListener
        public void onDismiss() {
            if(PlayerControlView.this.s9) {
                PlayerControlView.this.a.X();
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void p0(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q(PlaybackParameters playbackParameters0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q0(float f) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r(List list0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r0(AudioAttributes audioAttributes0) {
        }

        @Override  // androidx.media3.ui.TimeBar$OnScrubListener
        public void u(TimeBar timeBar0, long v) {
            PlayerControlView.this.j9 = true;
            if(PlayerControlView.this.D != null) {
                String s = Util.H0(PlayerControlView.this.F, PlayerControlView.this.G, v);
                PlayerControlView.this.D.setText(s);
            }
            PlayerControlView.this.a.W();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void u0(boolean z, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void v0(MediaMetadata mediaMetadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w(CueGroup cueGroup0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w0(PlaybackException playbackException0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x(Metadata metadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x0(long v) {
        }
    }

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void G(boolean arg1);
    }

    final class PlaybackSpeedAdapter extends Adapter {
        private final String[] a;
        private final float[] b;
        private int c;
        final PlayerControlView d;

        public PlaybackSpeedAdapter(String[] arr_s, float[] arr_f) {
            this.a = arr_s;
            this.b = arr_f;
        }

        public void A(float f) {
            int v1 = 0;
            float f1 = 3.402823E+38f;
            for(int v = 0; true; ++v) {
                float[] arr_f = this.b;
                if(v >= arr_f.length) {
                    break;
                }
                float f2 = Math.abs(f - arr_f[v]);
                if(f2 < f1) {
                    v1 = v;
                    f1 = f2;
                }
            }
            this.c = v1;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a.length;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.y(((SubSettingViewHolder)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.z(viewGroup0, v);
        }

        public String w() {
            return this.a[this.c];
        }

        // 检测为 Lambda 实现
        private void x(int v, View view0) [...]

        public void y(SubSettingViewHolder playerControlView$SubSettingViewHolder0, int v) {
            String[] arr_s = this.a;
            if(v < arr_s.length) {
                playerControlView$SubSettingViewHolder0.a.setText(arr_s[v]);
            }
            if(v == this.c) {
                playerControlView$SubSettingViewHolder0.itemView.setSelected(true);
                playerControlView$SubSettingViewHolder0.b.setVisibility(0);
            }
            else {
                playerControlView$SubSettingViewHolder0.itemView.setSelected(false);
                playerControlView$SubSettingViewHolder0.b.setVisibility(4);
            }
            k k0 = (View view0) -> {
                if(v != this.c) {
                    PlayerControlView.this.setPlaybackSpeed(this.b[v]);
                }
                PlayerControlView.this.k.dismiss();
            };
            playerControlView$SubSettingViewHolder0.itemView.setOnClickListener(k0);
        }

        public SubSettingViewHolder z(ViewGroup viewGroup0, int v) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(layout.exo_styled_sub_settings_list_item, viewGroup0, false));
        }
    }

    public interface ProgressUpdateListener {
        void a(long arg1, long arg2);
    }

    final class SettingViewHolder extends ViewHolder {
        private final TextView a;
        private final TextView b;
        private final ImageView c;
        final PlayerControlView d;

        public SettingViewHolder(View view0) {
            super(view0);
            if(Util.a < 26) {
                view0.setFocusable(true);
            }
            this.a = (TextView)view0.findViewById(id.exo_main_text);
            this.b = (TextView)view0.findViewById(id.exo_sub_text);
            this.c = (ImageView)view0.findViewById(id.exo_icon);
            view0.setOnClickListener((View view0) -> {
                int v = this.getBindingAdapterPosition();
                PlayerControlView.this.j0(v);
            });
        }

        // 检测为 Lambda 实现
        private void j(View view0) [...]
    }

    class SettingsAdapter extends Adapter {
        private final String[] a;
        private final String[] b;
        private final Drawable[] c;
        final PlayerControlView d;

        public SettingsAdapter(String[] arr_s, Drawable[] arr_drawable) {
            this.a = arr_s;
            this.b = new String[arr_s.length];
            this.c = arr_drawable;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a.length;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.w(((SettingViewHolder)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.x(viewGroup0, v);
        }

        // 去混淆评级： 低(20)
        public boolean v() {
            return this.z(1) || this.z(0);
        }

        public void w(SettingViewHolder playerControlView$SettingViewHolder0, int v) {
            if(this.z(v)) {
                LayoutParams recyclerView$LayoutParams0 = new LayoutParams(-1, -2);
                playerControlView$SettingViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
            }
            else {
                LayoutParams recyclerView$LayoutParams1 = new LayoutParams(0, 0);
                playerControlView$SettingViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams1);
            }
            playerControlView$SettingViewHolder0.a.setText(this.a[v]);
            if(this.b[v] == null) {
                playerControlView$SettingViewHolder0.b.setVisibility(8);
            }
            else {
                playerControlView$SettingViewHolder0.b.setText(this.b[v]);
            }
            if(this.c[v] == null) {
                playerControlView$SettingViewHolder0.c.setVisibility(8);
                return;
            }
            playerControlView$SettingViewHolder0.c.setImageDrawable(this.c[v]);
        }

        public SettingViewHolder x(ViewGroup viewGroup0, int v) {
            View view0 = LayoutInflater.from(PlayerControlView.this.getContext()).inflate(layout.exo_styled_settings_list_item, viewGroup0, false);
            return new SettingViewHolder(PlayerControlView.this, view0);
        }

        public void y(int v, String s) {
            this.b[v] = s;
        }

        private boolean z(int v) {
            if(PlayerControlView.this.b9 == null) {
                return false;
            }
            switch(v) {
                case 0: {
                    return PlayerControlView.this.b9.v0(13);
                }
                case 1: {
                    return PlayerControlView.this.b9.v0(30) && PlayerControlView.this.b9.v0(29);
                }
                default: {
                    return true;
                }
            }
        }
    }

    static class SubSettingViewHolder extends ViewHolder {
        public final TextView a;
        public final View b;

        public SubSettingViewHolder(View view0) {
            super(view0);
            if(Util.a < 26) {
                view0.setFocusable(true);
            }
            this.a = (TextView)view0.findViewById(id.exo_text);
            this.b = view0.findViewById(id.exo_check);
        }
    }

    final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        final PlayerControlView c;

        private TextTrackSelectionAdapter() {
        }

        TextTrackSelectionAdapter(androidx.media3.ui.PlayerControlView.1 playerControlView$10) {
        }

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void A(SubSettingViewHolder playerControlView$SubSettingViewHolder0) {
            playerControlView$SubSettingViewHolder0.a.setText(string.exo_track_selection_none);
            int v = 0;
            for(int v1 = 0; true; ++v1) {
                boolean z = true;
                if(v1 >= this.a.size()) {
                    break;
                }
                if(((TrackInformation)this.a.get(v1)).a()) {
                    z = false;
                    break;
                }
            }
            View view0 = playerControlView$SubSettingViewHolder0.b;
            if(!z) {
                v = 4;
            }
            view0.setVisibility(v);
            m m0 = (View view0) -> if(PlayerControlView.this.b9 != null && PlayerControlView.this.b9.v0(29)) {
                TrackSelectionParameters trackSelectionParameters0 = PlayerControlView.this.b9.A0().F().G(3).R(-3).D();
                PlayerControlView.this.b9.Z0(trackSelectionParameters0);
                PlayerControlView.this.k.dismiss();
            };
            playerControlView$SubSettingViewHolder0.itemView.setOnClickListener(m0);
        }

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void C(String s) {
        }

        // 检测为 Lambda 实现
        private void E(View view0) [...]

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.z(((SubSettingViewHolder)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void x(List list0) {
            boolean z = false;
            for(int v = 0; v < list0.size(); ++v) {
                if(((TrackInformation)list0.get(v)).a()) {
                    z = true;
                    break;
                }
            }
            if(PlayerControlView.this.w != null) {
                PlayerControlView.this.w.setImageDrawable((z ? PlayerControlView.this.T8 : PlayerControlView.this.U8));
                PlayerControlView.this.w.setContentDescription((z ? PlayerControlView.this.V8 : PlayerControlView.this.W8));
            }
            this.a = list0;
        }

        @Override  // androidx.media3.ui.PlayerControlView$TrackSelectionAdapter
        public void z(SubSettingViewHolder playerControlView$SubSettingViewHolder0, int v) {
            super.z(playerControlView$SubSettingViewHolder0, v);
            if(v > 0) {
                int v1 = ((TrackInformation)this.a.get(v - 1)).a() ? 0 : 4;
                playerControlView$SubSettingViewHolder0.b.setVisibility(v1);
            }
        }
    }

    static final class TrackInformation {
        public final Group a;
        public final int b;
        public final String c;

        public TrackInformation(Tracks tracks0, int v, int v1, String s) {
            this.a = (Group)tracks0.c().get(v);
            this.b = v1;
            this.c = s;
        }

        public boolean a() {
            return this.a.k(this.b);
        }
    }

    abstract class TrackSelectionAdapter extends Adapter {
        protected List a;
        final PlayerControlView b;

        protected TrackSelectionAdapter() {
            this.a = new ArrayList();
        }

        protected abstract void A(SubSettingViewHolder arg1);

        public SubSettingViewHolder B(ViewGroup viewGroup0, int v) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(layout.exo_styled_sub_settings_list_item, viewGroup0, false));
        }

        protected abstract void C(String arg1);

        // 去混淆评级： 低(20)
        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a.isEmpty() ? 0 : this.a.size() + 1;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.z(((SubSettingViewHolder)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.B(viewGroup0, v);
        }

        protected void w() {
            this.a = Collections.emptyList();
        }

        public abstract void x(List arg1);

        // 检测为 Lambda 实现
        private void y(Player player0, TrackGroup trackGroup0, TrackInformation playerControlView$TrackInformation0, View view0) [...]

        public void z(SubSettingViewHolder playerControlView$SubSettingViewHolder0, int v) {
            Player player0 = PlayerControlView.this.b9;
            if(player0 == null) {
                return;
            }
            if(v == 0) {
                this.A(playerControlView$SubSettingViewHolder0);
                return;
            }
            boolean z = true;
            TrackInformation playerControlView$TrackInformation0 = (TrackInformation)this.a.get(v - 1);
            TrackGroup trackGroup0 = playerControlView$TrackInformation0.a.c();
            int v1 = 0;
            if(player0.A0().A.get(trackGroup0) == null || !playerControlView$TrackInformation0.a()) {
                z = false;
            }
            playerControlView$SubSettingViewHolder0.a.setText(playerControlView$TrackInformation0.c);
            View view0 = playerControlView$SubSettingViewHolder0.b;
            if(!z) {
                v1 = 4;
            }
            view0.setVisibility(v1);
            n n0 = (View view0) -> {
                if(!player0.v0(29)) {
                    return;
                }
                player0.Z0(player0.A0().F().b0(new TrackSelectionOverride(trackGroup0, O2.B(playerControlView$TrackInformation0.b))).q0(playerControlView$TrackInformation0.a.f(), false).D());
                this.C(playerControlView$TrackInformation0.c);
                PlayerControlView.this.k.dismiss();
            };
            playerControlView$SubSettingViewHolder0.itemView.setOnClickListener(n0);
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void u(int arg1);
    }

    @Nullable
    private final View A;
    private static final int A9 = 1;
    @Nullable
    private final View B;
    @Nullable
    private final TextView C;
    @Nullable
    private final TextView D;
    @Nullable
    private final TimeBar E;
    private final StringBuilder F;
    private final Formatter G;
    private final Period H;
    private final Window I;
    private final Runnable J;
    private final Drawable K;
    private final Drawable L;
    private final Drawable M;
    private final String M8;
    private final Drawable N;
    private final Drawable N8;
    private final Drawable O;
    private final Drawable O8;
    private final String P;
    private final float P8;
    private final String Q;
    private final float Q8;
    private final String R8;
    private final String S8;
    private final Drawable T8;
    private final Drawable U8;
    private final String V8;
    private final String W8;
    private final Drawable X8;
    private final Drawable Y8;
    private final String Z8;
    private final PlayerControlViewLayoutManager a;
    private final String a9;
    private final Resources b;
    @Nullable
    private Player b9;
    private final ComponentListener c;
    @Nullable
    private ProgressUpdateListener c9;
    private final CopyOnWriteArrayList d;
    @Nullable
    private OnFullScreenModeChangedListener d9;
    private final RecyclerView e;
    private boolean e9;
    private final SettingsAdapter f;
    private boolean f9;
    private final PlaybackSpeedAdapter g;
    private boolean g9;
    private final TextTrackSelectionAdapter h;
    private boolean h9;
    private final AudioTrackSelectionAdapter i;
    private boolean i9;
    private final TrackNameProvider j;
    private boolean j9;
    private final PopupWindow k;
    private int k9;
    private final int l;
    private int l9;
    @Nullable
    private final ImageView m;
    private int m9;
    @Nullable
    private final ImageView n;
    private long[] n9;
    @Nullable
    private final ImageView o;
    private boolean[] o9;
    @Nullable
    private final View p;
    private long[] p9;
    @Nullable
    private final View q;
    private boolean[] q9;
    @Nullable
    private final TextView r;
    private long r9;
    @Nullable
    private final TextView s;
    private boolean s9;
    @Nullable
    private final ImageView t;
    public static final int t9 = 5000;
    @Nullable
    private final ImageView u;
    public static final int u9 = 0;
    @Nullable
    private final ImageView v;
    public static final int v9 = 200;
    @Nullable
    private final ImageView w;
    public static final int w9 = 100;
    @Nullable
    private final ImageView x;
    private static final int x9 = 1000;
    @Nullable
    private final ImageView y;
    private static final float[] y9;
    @Nullable
    private final View z;
    private static final int z9;

    static {
        MediaLibraryInfo.a("media3.ui");
        PlayerControlView.y9 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context0) {
        this(context0, null);
    }

    public PlayerControlView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PlayerControlView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, attributeSet0);
    }

    public PlayerControlView(Context context0, @Nullable AttributeSet attributeSet0, int v, @Nullable AttributeSet attributeSet1) {
        super(context0, attributeSet0, v);
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        int v3;
        int v38;
        boolean z18;
        int v37;
        boolean z17;
        int v36;
        boolean z16;
        ComponentListener playerControlView$ComponentListener1;
        int v35;
        int v34;
        int v33;
        int v32;
        int v31;
        int v30;
        boolean z15;
        boolean z14;
        boolean z13;
        boolean z12;
        boolean z11;
        boolean z10;
        boolean z9;
        int v29;
        int v28;
        int v27;
        int v26;
        int v25;
        int v24;
        int v23;
        int v22;
        int v21;
        boolean z8;
        int v20;
        int v19;
        int v1 = drawable.exo_styled_controls_simple_fastforward;
        this.h9 = true;
        this.k9 = 5000;
        this.m9 = 0;
        this.l9 = 200;
        if(attributeSet1 == null) {
            v29 = 0x7F0801F2;  // drawable:exo_styled_controls_vr
            v34 = 0x7F0801E0;  // drawable:exo_styled_controls_next
            v21 = 0x7F0801EE;  // drawable:exo_styled_controls_simple_rewind
            v22 = 0x7F0801DF;  // drawable:exo_styled_controls_fullscreen_exit
            v23 = 0x7F0801DE;  // drawable:exo_styled_controls_fullscreen_enter
            v24 = 0x7F0801E7;  // drawable:exo_styled_controls_repeat_off
            v25 = 0x7F0801E8;  // drawable:exo_styled_controls_repeat_one
            v26 = 0x7F0801E6;  // drawable:exo_styled_controls_repeat_all
            v27 = 0x7F0801EC;  // drawable:exo_styled_controls_shuffle_on
            v28 = 0x7F0801F0;  // drawable:exo_styled_controls_subtitle_off
            z9 = true;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = false;
            z14 = false;
            z15 = false;
            z8 = true;
            v30 = 0x7F0801E4;  // drawable:exo_styled_controls_play
            v31 = 0x7F0801E3;  // drawable:exo_styled_controls_pause
            v32 = 0x7F0801E5;  // drawable:exo_styled_controls_previous
            v33 = 0x7F0801F1;  // drawable:exo_styled_controls_subtitle_on
            v20 = 0x7F0E00E9;  // layout:exo_player_control_view
            v19 = 0x7F0801EB;  // drawable:exo_styled_controls_shuffle_off
        }
        else {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet1, styleable.PlayerControlView, v, 0);
            try {
                v3 = typedArray0.getResourceId(styleable.PlayerControlView_controller_layout_id, 0x7F0E00E9);  // layout:exo_player_control_view
                v4 = typedArray0.getResourceId(styleable.PlayerControlView_play_icon, 0x7F0801E4);  // drawable:exo_styled_controls_play
                v5 = typedArray0.getResourceId(styleable.PlayerControlView_pause_icon, 0x7F0801E3);  // drawable:exo_styled_controls_pause
                v6 = typedArray0.getResourceId(styleable.PlayerControlView_next_icon, 0x7F0801E0);  // drawable:exo_styled_controls_next
                v1 = typedArray0.getResourceId(styleable.PlayerControlView_fastforward_icon, 0x7F0801ED);  // drawable:exo_styled_controls_simple_fastforward
                v7 = typedArray0.getResourceId(styleable.PlayerControlView_previous_icon, 0x7F0801E5);  // drawable:exo_styled_controls_previous
                v8 = typedArray0.getResourceId(styleable.PlayerControlView_rewind_icon, 0x7F0801EE);  // drawable:exo_styled_controls_simple_rewind
                v9 = typedArray0.getResourceId(styleable.PlayerControlView_fullscreen_exit_icon, 0x7F0801DF);  // drawable:exo_styled_controls_fullscreen_exit
                v10 = typedArray0.getResourceId(styleable.PlayerControlView_fullscreen_enter_icon, 0x7F0801DE);  // drawable:exo_styled_controls_fullscreen_enter
                v11 = typedArray0.getResourceId(styleable.PlayerControlView_repeat_off_icon, 0x7F0801E7);  // drawable:exo_styled_controls_repeat_off
                v12 = typedArray0.getResourceId(styleable.PlayerControlView_repeat_one_icon, 0x7F0801E8);  // drawable:exo_styled_controls_repeat_one
                v13 = typedArray0.getResourceId(styleable.PlayerControlView_repeat_all_icon, 0x7F0801E6);  // drawable:exo_styled_controls_repeat_all
                v14 = typedArray0.getResourceId(styleable.PlayerControlView_shuffle_on_icon, 0x7F0801EC);  // drawable:exo_styled_controls_shuffle_on
                v15 = typedArray0.getResourceId(styleable.PlayerControlView_shuffle_off_icon, 0x7F0801EB);  // drawable:exo_styled_controls_shuffle_off
                v16 = typedArray0.getResourceId(styleable.PlayerControlView_subtitle_on_icon, 0x7F0801F1);  // drawable:exo_styled_controls_subtitle_on
                v17 = typedArray0.getResourceId(styleable.PlayerControlView_subtitle_off_icon, 0x7F0801F0);  // drawable:exo_styled_controls_subtitle_off
                v18 = typedArray0.getResourceId(styleable.PlayerControlView_vr_icon, 0x7F0801F2);  // drawable:exo_styled_controls_vr
                this.k9 = typedArray0.getInt(styleable.PlayerControlView_show_timeout, this.k9);
                this.m9 = PlayerControlView.X(typedArray0, this.m9);
                z = typedArray0.getBoolean(styleable.PlayerControlView_show_rewind_button, true);
                z1 = typedArray0.getBoolean(styleable.PlayerControlView_show_fastforward_button, true);
                z2 = typedArray0.getBoolean(styleable.PlayerControlView_show_previous_button, true);
                z3 = typedArray0.getBoolean(styleable.PlayerControlView_show_next_button, true);
                z4 = typedArray0.getBoolean(styleable.PlayerControlView_show_shuffle_button, false);
                z5 = typedArray0.getBoolean(styleable.PlayerControlView_show_subtitle_button, false);
                z6 = typedArray0.getBoolean(styleable.PlayerControlView_show_vr_button, false);
                this.setTimeBarMinUpdateInterval(typedArray0.getInt(styleable.PlayerControlView_time_bar_min_update_interval, 200));
                z7 = typedArray0.getBoolean(styleable.PlayerControlView_animation_enabled, true);
            }
            finally {
                typedArray0.recycle();
            }
            v19 = v15;
            v20 = v3;
            z8 = z7;
            v21 = v8;
            v22 = v9;
            v23 = v10;
            v24 = v11;
            v25 = v12;
            v26 = v13;
            v27 = v14;
            v28 = v17;
            v29 = v18;
            z9 = z;
            z10 = z1;
            z11 = z2;
            z12 = z3;
            z13 = z4;
            z14 = z5;
            z15 = z6;
            v30 = v4;
            v31 = v5;
            v32 = v7;
            v33 = v16;
            v34 = v6;
        }
        LayoutInflater.from(context0).inflate(v20, this);
        this.setDescendantFocusability(0x40000);
        ComponentListener playerControlView$ComponentListener0 = new ComponentListener(this, null);
        this.c = playerControlView$ComponentListener0;
        this.d = new CopyOnWriteArrayList();
        this.H = new Period();
        this.I = new Window();
        StringBuilder stringBuilder0 = new StringBuilder();
        this.F = stringBuilder0;
        this.G = new Formatter(stringBuilder0, Locale.getDefault());
        this.n9 = new long[0];
        this.o9 = new boolean[0];
        this.p9 = new long[0];
        this.q9 = new boolean[0];
        this.J = () -> {
            long v1;
            long v;
            if(this.f0() && this.f9) {
                Player player0 = this.b9;
                if(player0 == null || !player0.v0(16)) {
                    v = 0L;
                    v1 = 0L;
                }
                else {
                    v = this.r9 + player0.d2();
                    v1 = this.r9 + player0.e1();
                }
                TextView textView0 = this.D;
                if(textView0 != null && !this.j9) {
                    textView0.setText(Util.H0(this.F, this.G, v));
                }
                TimeBar timeBar0 = this.E;
                if(timeBar0 != null) {
                    timeBar0.setPosition(v);
                    this.E.setBufferedPosition(v1);
                }
                ProgressUpdateListener playerControlView$ProgressUpdateListener0 = this.c9;
                if(playerControlView$ProgressUpdateListener0 != null) {
                    playerControlView$ProgressUpdateListener0.a(v, v1);
                }
                this.removeCallbacks(this.J);
                int v2 = player0 == null ? 1 : player0.b();
                long v3 = 1000L;
                if(player0 != null && player0.isPlaying()) {
                    long v4 = Math.min((this.E == null ? 1000L : this.E.getPreferredUpdateDelay()), 1000L - v % 1000L);
                    float f = player0.m().a;
                    if(f > 0.0f) {
                        v3 = (long)(((float)v4) / f);
                    }
                    this.postDelayed(this.J, Util.x(v3, this.l9, 1000L));
                    return;
                }
                if(v2 != 1 && v2 != 4) {
                    this.postDelayed(this.J, 1000L);
                }
            }
        };
        this.C = (TextView)this.findViewById(id.exo_duration);
        this.D = (TextView)this.findViewById(id.exo_position);
        ImageView imageView0 = (ImageView)this.findViewById(id.exo_subtitle);
        this.w = imageView0;
        if(imageView0 != null) {
            imageView0.setOnClickListener(playerControlView$ComponentListener0);
        }
        ImageView imageView1 = (ImageView)this.findViewById(id.exo_fullscreen);
        this.x = imageView1;
        PlayerControlView.b0(imageView1, (View view0) -> {
            if(this.d9 == null) {
                return;
            }
            int v = !this.e9;
            this.e9 = v;
            this.t0(this.x, ((boolean)v));
            this.t0(this.y, this.e9);
            OnFullScreenModeChangedListener playerControlView$OnFullScreenModeChangedListener0 = this.d9;
            if(playerControlView$OnFullScreenModeChangedListener0 != null) {
                playerControlView$OnFullScreenModeChangedListener0.G(this.e9);
            }
        });
        ImageView imageView2 = (ImageView)this.findViewById(id.exo_minimal_fullscreen);
        this.y = imageView2;
        PlayerControlView.b0(imageView2, (View view0) -> {
            if(this.d9 == null) {
                return;
            }
            int v = !this.e9;
            this.e9 = v;
            this.t0(this.x, ((boolean)v));
            this.t0(this.y, this.e9);
            OnFullScreenModeChangedListener playerControlView$OnFullScreenModeChangedListener0 = this.d9;
            if(playerControlView$OnFullScreenModeChangedListener0 != null) {
                playerControlView$OnFullScreenModeChangedListener0.G(this.e9);
            }
        });
        View view0 = this.findViewById(id.exo_settings);
        this.z = view0;
        if(view0 != null) {
            view0.setOnClickListener(playerControlView$ComponentListener0);
        }
        View view1 = this.findViewById(id.exo_playback_speed);
        this.A = view1;
        if(view1 != null) {
            view1.setOnClickListener(playerControlView$ComponentListener0);
        }
        View view2 = this.findViewById(id.exo_audio_track);
        this.B = view2;
        if(view2 != null) {
            view2.setOnClickListener(playerControlView$ComponentListener0);
        }
        TimeBar timeBar0 = (TimeBar)this.findViewById(id.exo_progress);
        View view3 = this.findViewById(id.exo_progress_placeholder);
        if(timeBar0 != null) {
            this.E = timeBar0;
            v35 = v21;
            playerControlView$ComponentListener1 = playerControlView$ComponentListener0;
            z16 = z12;
            v36 = v32;
            z17 = z11;
            v37 = v34;
            z18 = z9;
            v38 = v1;
        }
        else if(view3 == null) {
            v35 = v21;
            playerControlView$ComponentListener1 = playerControlView$ComponentListener0;
            z16 = z12;
            v36 = v32;
            z17 = z11;
            v37 = v34;
            z18 = z9;
            v38 = v1;
            this.E = null;
        }
        else {
            v35 = v21;
            playerControlView$ComponentListener1 = playerControlView$ComponentListener0;
            z16 = z12;
            v36 = v32;
            z17 = z11;
            v37 = v34;
            z18 = z9;
            v38 = v1;
            DefaultTimeBar defaultTimeBar0 = new DefaultTimeBar(context0, null, 0, attributeSet1, style.ExoStyledControls_TimeBar);
            defaultTimeBar0.setId(0x7F0B0480);  // id:exo_progress
            defaultTimeBar0.setLayoutParams(view3.getLayoutParams());
            ViewGroup viewGroup0 = (ViewGroup)view3.getParent();
            int v39 = viewGroup0.indexOfChild(view3);
            viewGroup0.removeView(view3);
            viewGroup0.addView(defaultTimeBar0, v39);
            this.E = defaultTimeBar0;
        }
        TimeBar timeBar1 = this.E;
        if(timeBar1 != null) {
            timeBar1.c(playerControlView$ComponentListener1);
        }
        Resources resources0 = context0.getResources();
        this.b = resources0;
        ImageView imageView3 = (ImageView)this.findViewById(id.exo_play_pause);
        this.o = imageView3;
        if(imageView3 != null) {
            imageView3.setOnClickListener(playerControlView$ComponentListener1);
        }
        ImageView imageView4 = (ImageView)this.findViewById(id.exo_prev);
        this.m = imageView4;
        if(imageView4 != null) {
            imageView4.setImageDrawable(Util.o0(context0, resources0, v36));
            imageView4.setOnClickListener(playerControlView$ComponentListener1);
        }
        ImageView imageView5 = (ImageView)this.findViewById(id.exo_next);
        this.n = imageView5;
        if(imageView5 != null) {
            imageView5.setImageDrawable(Util.o0(context0, resources0, v37));
            imageView5.setOnClickListener(playerControlView$ComponentListener1);
        }
        Typeface typeface0 = ResourcesCompat.j(context0, font.roboto_medium_numbers);
        ImageView imageView6 = (ImageView)this.findViewById(id.exo_rew);
        TextView textView0 = (TextView)this.findViewById(id.exo_rew_with_amount);
        if(imageView6 != null) {
            imageView6.setImageDrawable(Util.o0(context0, resources0, v35));
            this.q = imageView6;
            this.s = null;
        }
        else if(textView0 == null) {
            this.s = null;
            this.q = null;
        }
        else {
            textView0.setTypeface(typeface0);
            this.s = textView0;
            this.q = textView0;
        }
        View view4 = this.q;
        if(view4 != null) {
            view4.setOnClickListener(this.c);
        }
        ImageView imageView7 = (ImageView)this.findViewById(id.exo_ffwd);
        TextView textView1 = (TextView)this.findViewById(id.exo_ffwd_with_amount);
        if(imageView7 != null) {
            imageView7.setImageDrawable(Util.o0(context0, resources0, v38));
            this.p = imageView7;
            this.r = null;
        }
        else if(textView1 == null) {
            this.r = null;
            this.p = null;
        }
        else {
            textView1.setTypeface(typeface0);
            this.r = textView1;
            this.p = textView1;
        }
        View view5 = this.p;
        if(view5 != null) {
            view5.setOnClickListener(this.c);
        }
        ImageView imageView8 = (ImageView)this.findViewById(id.exo_repeat_toggle);
        this.t = imageView8;
        if(imageView8 != null) {
            imageView8.setOnClickListener(this.c);
        }
        ImageView imageView9 = (ImageView)this.findViewById(id.exo_shuffle);
        this.u = imageView9;
        if(imageView9 != null) {
            imageView9.setOnClickListener(this.c);
        }
        this.P8 = ((float)resources0.getInteger(integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.Q8 = ((float)resources0.getInteger(integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        ImageView imageView10 = (ImageView)this.findViewById(id.exo_vr);
        this.v = imageView10;
        if(imageView10 != null) {
            imageView10.setImageDrawable(Util.o0(context0, resources0, v29));
            this.r0(false, imageView10);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager0 = new PlayerControlViewLayoutManager(this);
        this.a = playerControlViewLayoutManager0;
        playerControlViewLayoutManager0.Y(z8);
        String s = resources0.getString(string.exo_controls_playback_speed);
        Drawable drawable0 = Util.o0(context0, resources0, drawable.exo_styled_controls_speed);
        SettingsAdapter playerControlView$SettingsAdapter0 = new SettingsAdapter(this, new String[]{s, this.b.getString(string.exo_track_selection_title_audio)}, new Drawable[]{drawable0, Util.o0(context0, this.b, drawable.exo_styled_controls_audiotrack)});
        this.f = playerControlView$SettingsAdapter0;
        this.l = this.b.getDimensionPixelSize(dimen.exo_settings_offset);
        RecyclerView recyclerView0 = (RecyclerView)LayoutInflater.from(context0).inflate(layout.exo_styled_settings_list, null);
        this.e = recyclerView0;
        recyclerView0.setAdapter(playerControlView$SettingsAdapter0);
        recyclerView0.setLayoutManager(new LinearLayoutManager(this.getContext()));
        PopupWindow popupWindow0 = new PopupWindow(recyclerView0, -2, -2, true);
        this.k = popupWindow0;
        if(Util.a < 23) {
            popupWindow0.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow0.setOnDismissListener(this.c);
        this.s9 = true;
        this.j = new DefaultTrackNameProvider(this.getResources());
        this.T8 = Util.o0(context0, this.b, v33);
        this.U8 = Util.o0(context0, this.b, v28);
        this.V8 = this.b.getString(string.exo_controls_cc_enabled_description);
        this.W8 = this.b.getString(string.exo_controls_cc_disabled_description);
        this.h = new TextTrackSelectionAdapter(this, null);
        this.i = new AudioTrackSelectionAdapter(this, null);
        this.g = new PlaybackSpeedAdapter(this, this.b.getStringArray(array.exo_controls_playback_speeds), PlayerControlView.y9);
        this.K = Util.o0(context0, this.b, v30);
        this.L = Util.o0(context0, this.b, v31);
        this.X8 = Util.o0(context0, this.b, v22);
        this.Y8 = Util.o0(context0, this.b, v23);
        this.M = Util.o0(context0, this.b, v24);
        this.N = Util.o0(context0, this.b, v25);
        this.O = Util.o0(context0, this.b, v26);
        this.N8 = Util.o0(context0, this.b, v27);
        this.O8 = Util.o0(context0, this.b, v19);
        this.Z8 = this.b.getString(string.exo_controls_fullscreen_exit_description);
        this.a9 = this.b.getString(string.exo_controls_fullscreen_enter_description);
        this.P = this.b.getString(string.exo_controls_repeat_off_description);
        this.Q = this.b.getString(string.exo_controls_repeat_one_description);
        this.M8 = this.b.getString(string.exo_controls_repeat_all_description);
        this.R8 = this.b.getString(string.exo_controls_shuffle_on_description);
        this.S8 = this.b.getString(string.exo_controls_shuffle_off_description);
        ViewGroup viewGroup1 = (ViewGroup)this.findViewById(id.exo_bottom_bar);
        boolean z19 = true;
        this.a.Z(viewGroup1, true);
        this.a.Z(this.p, z10);
        this.a.Z(this.q, z18);
        this.a.Z(this.m, z17);
        this.a.Z(this.n, z16);
        this.a.Z(this.u, z13);
        this.a.Z(this.w, z14);
        this.a.Z(this.v, z15);
        PlayerControlViewLayoutManager playerControlViewLayoutManager1 = this.a;
        ImageView imageView11 = this.t;
        if(this.m9 == 0) {
            z19 = false;
        }
        playerControlViewLayoutManager1.Z(imageView11, z19);
        this.addOnLayoutChangeListener((View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> if((v2 - v != v6 - v4 || v3 - v1 != v7 - v5) && this.k.isShowing()) {
            this.C0();
            int v8 = this.getWidth();
            int v9 = this.k.getWidth();
            int v10 = this.k.getHeight();
            this.k.update(view0, v8 - v9 - this.l, -v10 - this.l, -1, -1);
        });
    }

    private void A0() {
        long v = this.b9 == null ? 5000L : this.b9.x2();
        TextView textView0 = this.s;
        if(textView0 != null) {
            textView0.setText(String.valueOf(((int)(v / 1000L))));
        }
        View view0 = this.q;
        if(view0 != null) {
            view0.setContentDescription(this.b.getQuantityString(plurals.exo_controls_rewind_by_amount_description, ((int)(v / 1000L)), new Object[]{((int)(v / 1000L))}));
        }
    }

    private void B0() {
        this.r0(this.f.v(), this.z);
    }

    private void C0() {
        this.e.measure(0, 0);
        int v = this.getWidth();
        int v1 = Math.min(this.e.getMeasuredWidth(), v - this.l * 2);
        this.k.setWidth(v1);
        int v2 = this.getHeight();
        int v3 = this.e.getMeasuredHeight();
        this.k.setHeight(Math.min(v2 - this.l * 2, v3));
    }

    private void D0() {
        if(this.f0() && this.f9) {
            ImageView imageView0 = this.u;
            if(imageView0 != null) {
                Player player0 = this.b9;
                if(!this.a.A(imageView0)) {
                    this.r0(false, this.u);
                    return;
                }
                if(player0 != null && player0.v0(14)) {
                    this.r0(true, this.u);
                    Drawable drawable0 = player0.t2() ? this.N8 : this.O8;
                    this.u.setImageDrawable(drawable0);
                    String s = player0.t2() ? this.R8 : this.S8;
                    this.u.setContentDescription(s);
                    return;
                }
                this.r0(false, this.u);
                this.u.setImageDrawable(this.O8);
                this.u.setContentDescription(this.S8);
            }
        }
    }

    private void E0() {
        long v12;
        Window timeline$Window1;
        int v4;
        Player player0 = this.b9;
        if(player0 == null) {
            return;
        }
        this.i9 = this.g9 && PlayerControlView.T(player0, this.I);
        this.r9 = 0L;
        Timeline timeline0 = player0.v0(17) ? player0.O1() : Timeline.a;
        if(timeline0.w()) {
            if(player0.v0(16)) {
                long v13 = player0.K0();
                v12 = v13 == 0x8000000000000001L ? 0L : Util.F1(v13);
            }
            else {
                v12 = 0L;
            }
            v4 = 0;
        }
        else {
            int v = player0.n2();
            int v1 = this.i9 ? 0 : v;
            int v2 = this.i9 ? timeline0.v() - 1 : v;
            long v3 = 0L;
            v4 = 0;
            while(v1 <= v2) {
                if(v1 == v) {
                    this.r9 = Util.B2(v3);
                }
                timeline0.t(v1, this.I);
                Window timeline$Window0 = this.I;
                if(timeline$Window0.m == 0x8000000000000001L) {
                    Assertions.i(!this.i9);
                    break;
                }
                int v5 = timeline$Window0.n;
                while(true) {
                    timeline$Window1 = this.I;
                    if(v5 > timeline$Window1.o) {
                        break;
                    }
                    timeline0.j(v5, this.H);
                    int v6 = this.H.s();
                    int v7 = this.H.e();
                    while(v6 < v7) {
                        long v8 = this.H.h(v6);
                        if(v8 == 0x8000000000000000L) {
                            long v9 = this.H.d;
                            if(v9 != 0x8000000000000001L) {
                                v8 = v9;
                                goto label_32;
                            }
                        }
                        else {
                        label_32:
                            long v10 = v8 + this.H.r();
                            if(v10 >= 0L) {
                                long[] arr_v = this.n9;
                                if(v4 == arr_v.length) {
                                    int v11 = arr_v.length == 0 ? 1 : arr_v.length * 2;
                                    this.n9 = Arrays.copyOf(arr_v, v11);
                                    this.o9 = Arrays.copyOf(this.o9, v11);
                                }
                                long[] arr_v1 = this.n9;
                                arr_v1[v4] = Util.B2(v3 + v10);
                                this.o9[v4] = this.H.t(v6);
                                ++v4;
                            }
                        }
                        ++v6;
                    }
                    ++v5;
                }
                v3 += timeline$Window1.m;
                ++v1;
            }
            v12 = v3;
        }
        long v14 = Util.B2(v12);
        TextView textView0 = this.C;
        if(textView0 != null) {
            textView0.setText(Util.H0(this.F, this.G, v14));
        }
        TimeBar timeBar0 = this.E;
        if(timeBar0 != null) {
            timeBar0.setDuration(v14);
            int v15 = this.p9.length;
            int v16 = v4 + v15;
            long[] arr_v2 = this.n9;
            if(v16 > arr_v2.length) {
                this.n9 = Arrays.copyOf(arr_v2, v16);
                this.o9 = Arrays.copyOf(this.o9, v16);
            }
            System.arraycopy(this.p9, 0, this.n9, v4, v15);
            System.arraycopy(this.q9, 0, this.o9, v4, v15);
            this.E.b(this.n9, this.o9, v16);
        }
        this.y0();
    }

    private void F0() {
        this.a0();
        this.r0(this.h.getItemCount() > 0, this.w);
        this.B0();
    }

    @Deprecated
    public void S(VisibilityListener playerControlView$VisibilityListener0) {
        Assertions.g(playerControlView$VisibilityListener0);
        this.d.add(playerControlView$VisibilityListener0);
    }

    private static boolean T(Player player0, Window timeline$Window0) {
        if(!player0.v0(17)) {
            return false;
        }
        Timeline timeline0 = player0.O1();
        int v = timeline0.v();
        if(v > 1 && v <= 100) {
            for(int v1 = 0; v1 < v; ++v1) {
                if(timeline0.t(v1, timeline$Window0).m == 0x8000000000000001L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean U(KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        Player player0 = this.b9;
        if(player0 != null && PlayerControlView.e0(v)) {
            if(keyEvent0.getAction() == 0) {
                switch(v) {
                    case 89: {
                        if(player0.v0(11)) {
                            player0.v2();
                            return true;
                        }
                    label_9:
                        if(keyEvent0.getRepeatCount() == 0) {
                            switch(v) {
                                case 0x4F: 
                                case 85: {
                                    Util.T0(player0, this.h9);
                                    return true;
                                }
                                case 87: {
                                    if(player0.v0(9)) {
                                        player0.R1();
                                        return true;
                                    }
                                    break;
                                }
                                case 88: {
                                    if(player0.v0(7)) {
                                        player0.B1();
                                        return true;
                                    }
                                    break;
                                }
                                case 0x7E: {
                                    Util.R0(player0);
                                    return true;
                                }
                                case 0x7F: {
                                    Util.Q0(player0);
                                    return true;
                                }
                                default: {
                                    return true;
                                }
                            }
                        }
                        break;
                    }
                    case 90: {
                        if(player0.b() != 4 && player0.v0(12)) {
                            player0.f1();
                            return true;
                        }
                        break;
                    }
                    default: {
                        goto label_9;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private void V(Adapter recyclerView$Adapter0, View view0) {
        this.e.setAdapter(recyclerView$Adapter0);
        this.C0();
        this.s9 = false;
        this.k.dismiss();
        this.s9 = true;
        int v = this.getWidth();
        int v1 = this.k.getWidth();
        int v2 = this.k.getHeight();
        this.k.showAsDropDown(view0, v - v1 - this.l, -v2 - this.l);
    }

    private O2 W(Tracks tracks0, int v) {
        a o2$a0 = new a();
        O2 o20 = tracks0.c();
        for(int v1 = 0; v1 < o20.size(); ++v1) {
            Group tracks$Group0 = (Group)o20.get(v1);
            if(tracks$Group0.f() == v) {
                for(int v2 = 0; v2 < tracks$Group0.a; ++v2) {
                    if(tracks$Group0.l(v2)) {
                        Format format0 = tracks$Group0.d(v2);
                        if((format0.e & 2) == 0) {
                            o2$a0.j(new TrackInformation(tracks0, v1, v2, this.j.a(format0)));
                        }
                    }
                }
            }
        }
        return o2$a0.n();
    }

    private static int X(TypedArray typedArray0, int v) {
        return typedArray0.getInt(styleable.PlayerControlView_repeat_toggle_modes, v);
    }

    public void Y() {
        this.a.C();
    }

    public void Z() {
        this.a.F();
    }

    private void a0() {
        this.h.w();
        this.i.w();
        if(this.b9 != null && this.b9.v0(30) && this.b9.v0(29)) {
            Tracks tracks0 = this.b9.r0();
            O2 o20 = this.W(tracks0, 1);
            this.i.x(o20);
            if(this.a.A(this.w)) {
                O2 o21 = this.W(tracks0, 3);
                this.h.x(o21);
                return;
            }
            this.h.x(O2.A());
        }
    }

    private static void b0(View view0, View.OnClickListener view$OnClickListener0) {
        if(view0 == null) {
            return;
        }
        view0.setVisibility(8);
        view0.setOnClickListener(view$OnClickListener0);
    }

    public boolean c0() {
        return this.a.I();
    }

    public boolean d0() {
        return this.a.J();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.U(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean e0(int v) {
        switch(v) {
            case 0x4F: 
            case 85: 
            case 87: 
            case 88: 
            case 89: 
            case 90: 
            case 0x7E: 
            case 0x7F: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean f0() {
        return this.getVisibility() == 0;
    }

    void g0() {
        for(Object object0: this.d) {
            ((VisibilityListener)object0).u(this.getVisibility());
        }
    }

    @Nullable
    public Player getPlayer() {
        return this.b9;
    }

    public int getRepeatToggleModes() {
        return this.m9;
    }

    public boolean getShowShuffleButton() {
        return this.a.A(this.u);
    }

    public boolean getShowSubtitleButton() {
        return this.a.A(this.w);
    }

    public int getShowTimeoutMs() {
        return this.k9;
    }

    public boolean getShowVrButton() {
        return this.a.A(this.v);
    }

    // 检测为 Lambda 实现
    private void h0(View view0) [...]

    // 检测为 Lambda 实现
    private void i0(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

    private void j0(int v) {
        if(v == 0) {
            View view0 = (View)Assertions.g(this.z);
            this.V(this.g, view0);
            return;
        }
        if(v == 1) {
            View view1 = (View)Assertions.g(this.z);
            this.V(this.i, view1);
            return;
        }
        this.k.dismiss();
    }

    @Deprecated
    public void k0(VisibilityListener playerControlView$VisibilityListener0) {
        this.d.remove(playerControlView$VisibilityListener0);
    }

    void l0() {
        ImageView imageView0 = this.o;
        if(imageView0 != null) {
            imageView0.requestFocus();
        }
    }

    private void m0(Player player0, long v) {
        if(!this.i9) {
            if(player0.v0(5)) {
                player0.P(v);
            }
        }
        else if(player0.v0(17) && player0.v0(10)) {
            Timeline timeline0 = player0.O1();
            int v1 = timeline0.v();
            int v2;
            for(v2 = 0; true; ++v2) {
                long v3 = timeline0.t(v2, this.I).e();
                if(v < v3) {
                    break;
                }
                if(v2 == v1 - 1) {
                    v = v3;
                    break;
                }
                v -= v3;
            }
            player0.W1(v2, v);
        }
        this.y0();
    }

    public void n0(@Nullable long[] arr_v, @Nullable boolean[] arr_z) {
        boolean z = false;
        if(arr_v == null) {
            this.p9 = new long[0];
            this.q9 = new boolean[0];
        }
        else {
            boolean[] arr_z1 = (boolean[])Assertions.g(arr_z);
            if(arr_v.length == arr_z1.length) {
                z = true;
            }
            Assertions.a(z);
            this.p9 = arr_v;
            this.q9 = arr_z1;
        }
        this.E0();
    }

    // 去混淆评级： 低(30)
    private boolean o0() {
        return this.b9 != null && this.b9.v0(1) && (!this.b9.v0(17) || !this.b9.O1().w());
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.P();
        this.f9 = true;
        if(this.d0()) {
            this.a.X();
        }
        this.q0();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.Q();
        this.f9 = false;
        this.removeCallbacks(this.J);
        this.a.W();
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.a.R(z, v, v1, v2, v3);
    }

    public void p0() {
        this.a.c0();
    }

    void q0() {
        this.w0();
        this.v0();
        this.z0();
        this.D0();
        this.F0();
        this.x0();
        this.E0();
    }

    private void r0(boolean z, @Nullable View view0) {
        if(view0 == null) {
            return;
        }
        view0.setEnabled(z);
        view0.setAlpha((z ? this.P8 : this.Q8));
    }

    private void s0() {
        long v = this.b9 == null ? 15000L : this.b9.T0();
        TextView textView0 = this.r;
        if(textView0 != null) {
            textView0.setText(String.valueOf(((int)(v / 1000L))));
        }
        View view0 = this.p;
        if(view0 != null) {
            view0.setContentDescription(this.b.getQuantityString(plurals.exo_controls_fastforward_by_amount_description, ((int)(v / 1000L)), new Object[]{((int)(v / 1000L))}));
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.a.Y(z);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener playerControlView$OnFullScreenModeChangedListener0) {
        this.d9 = playerControlView$OnFullScreenModeChangedListener0;
        boolean z = false;
        PlayerControlView.u0(this.x, playerControlView$OnFullScreenModeChangedListener0 != null);
        ImageView imageView0 = this.y;
        if(playerControlView$OnFullScreenModeChangedListener0 != null) {
            z = true;
        }
        PlayerControlView.u0(imageView0, z);
    }

    private void setPlaybackSpeed(float f) {
        if(this.b9 != null && this.b9.v0(13)) {
            this.b9.l(this.b9.m().d(f));
        }
    }

    public void setPlayer(@Nullable Player player0) {
        boolean z = false;
        Assertions.i(Looper.myLooper() == Looper.getMainLooper());
        if(player0 == null || player0.P1() == Looper.getMainLooper()) {
            z = true;
        }
        Assertions.a(z);
        Player player1 = this.b9;
        if(player1 == player0) {
            return;
        }
        if(player1 != null) {
            player1.J1(this.c);
        }
        this.b9 = player0;
        if(player0 != null) {
            player0.M1(this.c);
        }
        this.q0();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener playerControlView$ProgressUpdateListener0) {
        this.c9 = playerControlView$ProgressUpdateListener0;
    }

    public void setRepeatToggleModes(int v) {
        this.m9 = v;
        boolean z = false;
        if(this.b9 != null && this.b9.v0(15)) {
            int v1 = this.b9.i();
            if(v == 0 && v1 != 0) {
                this.b9.q(0);
            }
            else if(v == 1 && v1 == 2) {
                this.b9.q(1);
            }
            else if(v == 2 && v1 == 1) {
                this.b9.q(2);
            }
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager0 = this.a;
        ImageView imageView0 = this.t;
        if(v != 0) {
            z = true;
        }
        playerControlViewLayoutManager0.Z(imageView0, z);
        this.z0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.Z(this.p, z);
        this.v0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.g9 = z;
        this.E0();
    }

    public void setShowNextButton(boolean z) {
        this.a.Z(this.n, z);
        this.v0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.h9 = z;
        this.w0();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.Z(this.m, z);
        this.v0();
    }

    public void setShowRewindButton(boolean z) {
        this.a.Z(this.q, z);
        this.v0();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.Z(this.u, z);
        this.D0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.Z(this.w, z);
    }

    public void setShowTimeoutMs(int v) {
        this.k9 = v;
        if(this.d0()) {
            this.a.X();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.Z(this.v, z);
    }

    public void setTimeBarMinUpdateInterval(int v) {
        this.l9 = Util.w(v, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener view$OnClickListener0) {
        ImageView imageView0 = this.v;
        if(imageView0 != null) {
            imageView0.setOnClickListener(view$OnClickListener0);
            this.r0(view$OnClickListener0 != null, this.v);
        }
    }

    private void t0(@Nullable ImageView imageView0, boolean z) {
        if(imageView0 == null) {
            return;
        }
        if(z) {
            imageView0.setImageDrawable(this.X8);
            imageView0.setContentDescription(this.Z8);
            return;
        }
        imageView0.setImageDrawable(this.Y8);
        imageView0.setContentDescription(this.a9);
    }

    private static void u0(@Nullable View view0, boolean z) {
        if(view0 == null) {
            return;
        }
        if(z) {
            view0.setVisibility(0);
            return;
        }
        view0.setVisibility(8);
    }

    private void v0() {
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        if(this.f0() && this.f9) {
            Player player0 = this.b9;
            if(player0 == null) {
                z = false;
                z4 = false;
                z1 = false;
                z2 = false;
                z3 = false;
            }
            else {
                z = !this.g9 || !PlayerControlView.T(player0, this.I) ? player0.v0(5) : player0.v0(10);
                z1 = player0.v0(7);
                z2 = player0.v0(11);
                z3 = player0.v0(12);
                z4 = player0.v0(9);
            }
            if(z2) {
                this.A0();
            }
            if(z3) {
                this.s0();
            }
            this.r0(z1, this.m);
            this.r0(z2, this.q);
            this.r0(z3, this.p);
            this.r0(z4, this.n);
            TimeBar timeBar0 = this.E;
            if(timeBar0 != null) {
                timeBar0.setEnabled(z);
            }
        }
    }

    private void w0() {
        if(this.f0() && this.f9 && this.o != null) {
            boolean z = Util.j2(this.b9, this.h9);
            this.o.setImageDrawable((z ? this.K : this.L));
            String s = this.b.getString((z ? string.exo_controls_play_description : string.exo_controls_pause_description));
            this.o.setContentDescription(s);
            this.r0(this.o0(), this.o);
        }
    }

    private void x0() {
        Player player0 = this.b9;
        if(player0 == null) {
            return;
        }
        PlaybackParameters playbackParameters0 = player0.m();
        this.g.A(playbackParameters0.a);
        String s = this.g.w();
        this.f.y(0, s);
        this.B0();
    }

    // 检测为 Lambda 实现
    private void y0() [...]

    private void z0() {
        if(this.f0() && this.f9) {
            ImageView imageView0 = this.t;
            if(imageView0 != null) {
                if(this.m9 == 0) {
                    this.r0(false, imageView0);
                    return;
                }
                Player player0 = this.b9;
                if(player0 != null && player0.v0(15)) {
                    this.r0(true, this.t);
                    int v = player0.i();
                    switch(v) {
                        case 0: {
                            this.t.setImageDrawable(this.M);
                            this.t.setContentDescription(this.P);
                            break;
                        }
                        case 1: {
                            this.t.setImageDrawable(this.N);
                            this.t.setContentDescription(this.Q);
                            return;
                        label_15:
                            if(v == 2) {
                                this.t.setImageDrawable(this.O);
                                this.t.setContentDescription(this.M8);
                                return;
                            }
                            break;
                        }
                        default: {
                            goto label_15;
                        }
                    }
                    return;
                }
                this.r0(false, this.t);
                this.t.setImageDrawable(this.M);
                this.t.setContentDescription(this.P);
            }
        }
    }

    class androidx.media3.ui.PlayerControlView.1 {
    }

}

