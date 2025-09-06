package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.video.VideoPlayerView;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.ViewUtilities;

public class VideoPlayerHandler implements IAdUnitViewHandler {
    private RelativeLayout _videoContainer;
    private VideoPlayerView _videoView;

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean create(IAdUnitActivity iAdUnitActivity0) {
        DeviceLog.entered();
        if(this._videoContainer == null) {
            this._videoContainer = new RelativeLayout(iAdUnitActivity0.getContext());
        }
        if(this._videoView == null) {
            this._videoView = new VideoPlayerView(iAdUnitActivity0.getContext());
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
            relativeLayout$LayoutParams0.addRule(13);
            this._videoView.setLayoutParams(relativeLayout$LayoutParams0);
            this._videoContainer.addView(this._videoView);
            VideoPlayer.setVideoPlayerView(this._videoView);
        }
        return true;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean destroy() {
        DeviceLog.entered();
        VideoPlayerView videoPlayerView0 = this._videoView;
        if(videoPlayerView0 != null) {
            videoPlayerView0.stopVideoProgressTimer();
            this._videoView.stopPlayback();
            ViewUtilities.removeViewFromParent(this._videoView);
            if(this._videoView.equals(VideoPlayer.getVideoPlayerView())) {
                VideoPlayer.setVideoPlayerView(null);
            }
            this._videoView = null;
        }
        RelativeLayout relativeLayout0 = this._videoContainer;
        if(relativeLayout0 != null) {
            ViewUtilities.removeViewFromParent(relativeLayout0);
            this._videoContainer = null;
        }
        return true;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public View getView() {
        return this._videoContainer;
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onCreate(IAdUnitActivity iAdUnitActivity0, Bundle bundle0) {
        this.create(iAdUnitActivity0);
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onDestroy(IAdUnitActivity iAdUnitActivity0) {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onPause(IAdUnitActivity iAdUnitActivity0) {
        this.destroy();
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onResume(IAdUnitActivity iAdUnitActivity0) {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStart(IAdUnitActivity iAdUnitActivity0) {
    }

    @Override  // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStop(IAdUnitActivity iAdUnitActivity0) {
    }
}

