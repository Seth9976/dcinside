package com.unity3d.services.ads.video;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.os.Build.VERSION;
import android.widget.VideoView;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.util.Timer;
import java.util.TimerTask;

public class VideoPlayerView extends VideoView {
    private AudioManager _audioManager;
    private final IEventSender _eventSender;
    private boolean _infoListenerEnabled;
    private MediaPlayer _mediaPlayer;
    private Timer _prepareTimer;
    private int _progressEventInterval;
    private Timer _videoTimer;
    private String _videoUrl;
    private Float _volume;

    public VideoPlayerView(Context context0) {
        this(context0, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public VideoPlayerView(Context context0, IEventSender iEventSender0) {
        super(context0);
        this._progressEventInterval = 500;
        this._mediaPlayer = null;
        this._volume = null;
        this._infoListenerEnabled = true;
        this._audioManager = null;
        this._eventSender = iEventSender0;
    }

    public int getProgressEventInterval() {
        return this._progressEventInterval;
    }

    public int[] getVideoViewRectangle() {
        int[] arr_v = new int[2];
        this.getLocationInWindow(arr_v);
        return new int[]{arr_v[0], arr_v[1], this.getMeasuredWidth(), this.getMeasuredHeight()};
    }

    public float getVolume() {
        return (float)this._volume;
    }

    @Override  // android.widget.VideoView
    public void pause() {
        try {
            super.pause();
            if(Build.VERSION.SDK_INT >= 26) {
                this.setAudioFocusRequest(0);
            }
            else {
                AudioManager audioManager0 = this._audioManager;
                if(audioManager0 != null) {
                    audioManager0.abandonAudioFocus(null);
                }
            }
        }
        catch(Exception exception0) {
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PAUSE_ERROR, new Object[]{this._videoUrl});
            DeviceLog.exception("Error pausing video", exception0);
            return;
        }
        this.stopVideoProgressTimer();
        this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PAUSE, new Object[]{this._videoUrl});
    }

    public void play() {
        DeviceLog.entered();
        this.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override  // android.media.MediaPlayer$OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer0) {
                if(mediaPlayer0 != null) {
                    VideoPlayerView.this._mediaPlayer = mediaPlayer0;
                }
                VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.COMPLETED, new Object[]{VideoPlayerView.this._videoUrl});
                VideoPlayerView.this.stopVideoProgressTimer();
            }
        });
        try {
            this.start();
            this.stopVideoProgressTimer();
            this.startVideoProgressTimer();
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PLAY, new Object[]{this._videoUrl});
        }
        catch(IllegalStateException unused_ex) {
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.ILLEGAL_STATE, new Object[]{this._videoUrl, Boolean.FALSE});
        }
    }

    public boolean prepare(String s, float f, int v) {
        DeviceLog.entered();
        this._videoUrl = s;
        this.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override  // android.media.MediaPlayer$OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer0) {
                VideoPlayerView.this.stopPrepareTimer();
                if(mediaPlayer0 != null) {
                    VideoPlayerView.this._mediaPlayer = mediaPlayer0;
                }
                VideoPlayerView.this.setVolume(f);
                Integer integer0 = mediaPlayer0.getDuration();
                Integer integer1 = mediaPlayer0.getVideoWidth();
                Integer integer2 = mediaPlayer0.getVideoHeight();
                VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PREPARED, new Object[]{VideoPlayerView.this._videoUrl, integer0, integer1, integer2});
            }
        });
        this.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override  // android.media.MediaPlayer$OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
                VideoPlayerView.this.stopPrepareTimer();
                if(mediaPlayer0 != null) {
                    VideoPlayerView.this._mediaPlayer = mediaPlayer0;
                }
                VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.GENERIC_ERROR, new Object[]{VideoPlayerView.this._videoUrl, v, v1});
                VideoPlayerView.this.stopVideoProgressTimer();
                return true;
            }
        });
        this.setInfoListenerEnabled(this._infoListenerEnabled);
        if(v > 0) {
            this.startPrepareTimer(((long)v));
        }
        try {
            if(Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager0 = (AudioManager)this.getContext().getSystemService("audio");
                this._audioManager = audioManager0;
                if(audioManager0 != null) {
                    audioManager0.requestAudioFocus(null, 3, 2);
                }
            }
            else {
                this.setAudioFocusRequest(2);
            }
            this.setVideoPath(this._videoUrl);
            return true;
        }
        catch(Exception exception0) {
        }
        this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PREPARE_ERROR, new Object[]{this._videoUrl});
        DeviceLog.exception(("Error preparing video: " + this._videoUrl), exception0);
        return false;
    }

    @Override  // android.widget.VideoView
    public void seekTo(int v) {
        try {
            super.seekTo(v);
        }
        catch(Exception exception0) {
            this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.SEEKTO_ERROR, new Object[]{this._videoUrl});
            DeviceLog.exception("Error seeking video", exception0);
            return;
        }
        this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.SEEKTO, new Object[]{this._videoUrl});
    }

    public void setInfoListenerEnabled(boolean z) {
        this._infoListenerEnabled = z;
        if(z) {
            this.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                @Override  // android.media.MediaPlayer$OnInfoListener
                public boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
                    VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.INFO, new Object[]{VideoPlayerView.this._videoUrl, v, v1});
                    return true;
                }
            });
            return;
        }
        this.setOnInfoListener(null);
    }

    public void setProgressEventInterval(int v) {
        this._progressEventInterval = v;
        if(this._videoTimer != null) {
            this.stopVideoProgressTimer();
            this.startVideoProgressTimer();
        }
    }

    public void setVolume(Float float0) {
        try {
            this._mediaPlayer.setVolume(((float)float0), ((float)float0));
            this._volume = float0;
        }
        catch(Exception exception0) {
            DeviceLog.exception("MediaPlayer generic error", exception0);
        }
    }

    private void startPrepareTimer(long v) {
        Timer timer0 = new Timer();
        this._prepareTimer = timer0;
        timer0.schedule(new TimerTask() {
            @Override
            public void run() {
                boolean z = false;
                try {
                    z = VideoPlayerView.this.isPlaying();
                    if(!z) {
                        VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PREPARE_TIMEOUT, new Object[]{VideoPlayerView.this._videoUrl});
                        DeviceLog.error(("Video player prepare timeout: " + VideoPlayerView.this._videoUrl));
                    }
                }
                catch(IllegalStateException illegalStateException0) {
                    DeviceLog.exception("Exception while preparing timer", illegalStateException0);
                    VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.ILLEGAL_STATE, new Object[]{VideoPlayerEvent.PREPARE_TIMEOUT, VideoPlayerView.this._videoUrl, Boolean.valueOf(z)});
                }
            }
        }, v);
    }

    private void startVideoProgressTimer() {
        Timer timer0 = new Timer();
        this._videoTimer = timer0;
        timer0.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                boolean z = false;
                try {
                    z = VideoPlayerView.this.isPlaying();
                    Object[] arr_object = {VideoPlayerView.this.getCurrentPosition()};
                    VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.PROGRESS, arr_object);
                }
                catch(IllegalStateException illegalStateException0) {
                    DeviceLog.exception("Exception while sending current position to webapp", illegalStateException0);
                    VideoPlayerView.this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.ILLEGAL_STATE, new Object[]{VideoPlayerEvent.PROGRESS, VideoPlayerView.this._videoUrl, Boolean.valueOf(z)});
                }
            }
        }, ((long)this._progressEventInterval), ((long)this._progressEventInterval));
    }

    public void stop() {
        this.stopPlayback();
        this.stopVideoProgressTimer();
        if(Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager0 = this._audioManager;
            if(audioManager0 != null) {
                audioManager0.abandonAudioFocus(null);
            }
        }
        else {
            this.setAudioFocusRequest(0);
        }
        this._eventSender.sendEvent(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.STOP, new Object[]{this._videoUrl});
    }

    public void stopPrepareTimer() {
        Timer timer0 = this._prepareTimer;
        if(timer0 != null) {
            timer0.cancel();
            this._prepareTimer.purge();
            this._prepareTimer = null;
        }
    }

    public void stopVideoProgressTimer() {
        Timer timer0 = this._videoTimer;
        if(timer0 != null) {
            timer0.cancel();
            this._videoTimer.purge();
            this._videoTimer = null;
        }
    }
}

