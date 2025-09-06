package com.gomfactory.adpie.sdk.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioAttributes.Builder;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.TextureView;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.nativeads.util.VideoThumbnail;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import com.gomfactory.adpie.sdk.util.HttpUtil;
import com.gomfactory.adpie.sdk.util.ReportUtil;
import com.gomfactory.adpie.sdk.videoads.VideoAdData;
import java.util.concurrent.TimeUnit;

public class MainAdVideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public class NoSkipSeekBar extends SeekBar {
        public NoSkipSeekBar(Context context0) {
            super(context0);
        }

        public NoSkipSeekBar(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public NoSkipSeekBar(Context context0, AttributeSet attributeSet0, int v) {
            super(context0, attributeSet0, v);
        }

        @Override  // android.widget.AbsSeekBar
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            return true;
        }
    }

    public static final String TAG = "MainAdVideoView";
    private Runnable checkVideoPrepared;
    private boolean isSentComplete;
    private boolean isSentFirst;
    private boolean isSentImpression;
    private boolean isSentSecond;
    private boolean isSentStart;
    private boolean isSentThird;
    private Button mAdButton;
    private AdEventListener mAdEventListener;
    private View mBackgroundView;
    private RelativeLayout mContainer;
    private Context mContext;
    private int mFirstQuartile;
    private boolean mIsAutoPlay;
    private boolean mIsClickableVideo;
    private boolean mIsPrepared;
    private boolean mIsPreparing;
    private boolean mIsReady;
    private boolean mIsVisible;
    private boolean mIsVolumeOn;
    private boolean mIsWebViewLanding;
    private String mLink;
    private MediaPlayer mMediaPlayer;
    private ImageView mPauseImageView;
    private ImageView mPlayImageView;
    private RelativeLayout mPlayStateContainer;
    private ProgressBar mProgressBar;
    private RelativeLayout mReadyStateContainer;
    private ImageView mRestartImageView;
    private int mSecondQuartile;
    private NoSkipSeekBar mSeekbar;
    private SurfaceTexture mSurfaceTexture;
    private TextureView mTextureView;
    private int mThirdQuartile;
    private String mUrl;
    private VideoAdData mVideoAdData;
    private int mVideoCurPosSec;
    private int mVideoDuration;
    private int mVideoHeight;
    private int mVideoWidth;
    private ImageView mVolumeImage;
    private Bitmap mVolumeOffBitmap;
    private Bitmap mVolumeOnBitmap;
    private Runnable videoPlayTrackerRunnable;

    static {
    }

    public MainAdVideoView(@NonNull Context context0) {
        super(context0);
        this.videoPlayTrackerRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    if(MainAdVideoView.this.mMediaPlayer != null && MainAdVideoView.this.mMediaPlayer.isPlaying()) {
                        MainAdVideoView.this.setVisibleContainer(false, true);
                        int v = MainAdVideoView.this.mMediaPlayer.getCurrentPosition();
                        MainAdVideoView.this.mVideoCurPosSec = v / 1000;
                        AdPieLog.d("MainAdVideoView", "video current position  : " + MainAdVideoView.this.mVideoCurPosSec);
                        if(MainAdVideoView.this.mVideoCurPosSec > 0 && MainAdVideoView.this.mVideoAdData != null) {
                            if(MainAdVideoView.this.mVideoCurPosSec == MainAdVideoView.this.mFirstQuartile && !MainAdVideoView.this.isSentFirst) {
                                MainAdVideoView.this.isSentFirst = true;
                                ReportUtil.sendReport("VIDEO_FIRST_QUARTILE", MainAdVideoView.this.mVideoAdData.getTrackingFirstQuartileUrls());
                            }
                            else if(MainAdVideoView.this.mVideoCurPosSec == MainAdVideoView.this.mSecondQuartile && !MainAdVideoView.this.isSentSecond) {
                                MainAdVideoView.this.isSentSecond = true;
                                ReportUtil.sendReport("VIDEO_MID_POINT", MainAdVideoView.this.mVideoAdData.getTrackingMidpointUrls());
                            }
                            else if(MainAdVideoView.this.mVideoCurPosSec == MainAdVideoView.this.mThirdQuartile && !MainAdVideoView.this.isSentThird) {
                                MainAdVideoView.this.isSentThird = true;
                                ReportUtil.sendReport("VIDEO_THIRD_QUARTILE", MainAdVideoView.this.mVideoAdData.getTrackingThirdQuartileUrls());
                            }
                        }
                        if(MainAdVideoView.this.mSeekbar != null && MainAdVideoView.this.mMediaPlayer != null) {
                            int v1 = MainAdVideoView.this.mMediaPlayer.getCurrentPosition();
                            MainAdVideoView.this.mSeekbar.setProgress(v1);
                        }
                        MainAdVideoView.this.postDelayed(MainAdVideoView.this.videoPlayTrackerRunnable, 500L);
                        return;
                    }
                    AdPieLog.d("MainAdVideoView", "::: videoview : " + (MainAdVideoView.this.mMediaPlayer == null ? "null" : "isPlaying - " + MainAdVideoView.this.mMediaPlayer.isPlaying()));
                    return;
                }
                catch(Exception exception0) {
                }
                AdPieLog.e("MainAdVideoView", exception0);
            }
        };
        this.checkVideoPrepared = new Runnable() {
            @Override
            public void run() {
                if(!MainAdVideoView.this.mIsPrepared) {
                    MainAdVideoView.this.notifyError();
                    MainAdVideoView.this.stopVideo();
                }
            }
        };
        this.mContext = context0;
        if(this.mTextureView == null) {
            this.mTextureView = new TextureView(this.mContext);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            this.mTextureView.setLayoutParams(frameLayout$LayoutParams0);
            this.mTextureView.setSurfaceTextureListener(this);
            this.addView(this.mTextureView, 0);
        }
        this.initLayout();
    }

    private void adjustAspectRatio(int v, int v1) {
    }

    private MediaPlayer createMediaPlayer() {
        try {
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            mediaPlayer0.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
            mediaPlayer0.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override  // android.media.MediaPlayer$OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer0) {
                    AdPieLog.d("MainAdVideoView", "onPrepared");
                    MainAdVideoView.this.mIsPrepared = true;
                    MainAdVideoView.this.mIsPreparing = false;
                    MainAdVideoView.this.removeCallbacks(MainAdVideoView.this.checkVideoPrepared);
                    int v = mediaPlayer0.getVideoWidth();
                    int v1 = mediaPlayer0.getVideoHeight();
                    if(v > 0 && v1 > 0) {
                        MainAdVideoView.this.mVideoWidth = v;
                        MainAdVideoView.this.mVideoHeight = v1;
                        AdPieLog.d("MainAdVideoView", "videoWidth : " + v + ", videoHeight : " + v1 + ", videoProportion : " + ((float)v) / ((float)v1));
                        int v2 = mediaPlayer0.getDuration();
                        AdPieLog.d("MainAdVideoView", "finalTime : " + v2);
                        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                        AdPieLog.d("MainAdVideoView", String.format("onPrepared - %d:%d", timeUnit0.toMinutes(((long)v2)), ((long)(timeUnit0.toSeconds(((long)v2)) - TimeUnit.MINUTES.toSeconds(timeUnit0.toMinutes(((long)v2)))))));
                        MainAdVideoView.this.mVideoDuration = v2 / 1000;
                        MainAdVideoView.this.mFirstQuartile = MainAdVideoView.this.mVideoDuration / 4;
                        MainAdVideoView.this.mSecondQuartile = MainAdVideoView.this.mVideoDuration / 2;
                        MainAdVideoView.this.mThirdQuartile = MainAdVideoView.this.mVideoDuration * 3 / 4;
                        if(MainAdVideoView.this.mSeekbar != null) {
                            MainAdVideoView.this.mSeekbar.setMax(v2);
                        }
                        MainAdVideoView.this.mute();
                        MainAdVideoView.this.mIsVolumeOn = false;
                        MainAdVideoView.this.setVolumeImage();
                        if(MainAdVideoView.this.mVolumeImage != null) {
                            MainAdVideoView.this.mVolumeImage.setImageBitmap(MainAdVideoView.this.mVolumeOffBitmap);
                            MainAdVideoView.this.mVolumeImage.setVisibility(0);
                        }
                        mediaPlayer0.start();
                        MainAdVideoView.this.setVisibleContainer(false, true);
                        MainAdVideoView.this.removeCallbacks(MainAdVideoView.this.videoPlayTrackerRunnable);
                        MainAdVideoView.this.post(MainAdVideoView.this.videoPlayTrackerRunnable);
                        MainAdVideoView.this.notifyStarted();
                        if(!MainAdVideoView.this.isSentStart) {
                            MainAdVideoView.this.isSentStart = true;
                            ReportUtil.sendReport("VIDEO_START", MainAdVideoView.this.mVideoAdData.getTrackingStartUrls());
                        }
                    }
                }
            });
            mediaPlayer0.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                @Override  // android.media.MediaPlayer$OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
                    AdPieLog.d("MainAdVideoView", "onError");
                    MainAdVideoView.this.setVisibleContainer(true, false);
                    MainAdVideoView.this.notifyError();
                    MainAdVideoView.this.stopVideo();
                    return false;
                }
            });
            mediaPlayer0.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                @Override  // android.media.MediaPlayer$OnInfoListener
                public boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
                    switch(v) {
                        case 701: {
                            AdPieLog.d("MainAdVideoView", "MediaPlayer Buffering Start");
                            if(MainAdVideoView.this.mProgressBar != null) {
                                MainAdVideoView.this.mProgressBar.setVisibility(0);
                                return false;
                            }
                            break;
                        }
                        case 702: {
                            AdPieLog.d("MainAdVideoView", "MediaPlayer Buffering End");
                            if(MainAdVideoView.this.mProgressBar != null) {
                                MainAdVideoView.this.mProgressBar.setVisibility(8);
                                return false;
                            }
                            break;
                        }
                        default: {
                            return false;
                        }
                    }
                    return false;
                }
            });
            mediaPlayer0.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override  // android.media.MediaPlayer$OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer0) {
                    AdPieLog.d("MainAdVideoView", "onCompletion - current position : " + MainAdVideoView.this.mVideoCurPosSec + ", duration : " + MainAdVideoView.this.mVideoDuration);
                    MainAdVideoView.this.setVisibleContainer(true, false);
                    MainAdVideoView.this.notifyCompleted();
                    if(!MainAdVideoView.this.isSentComplete) {
                        MainAdVideoView.this.isSentComplete = true;
                        ReportUtil.sendReport("VIDEO_COMPLETE", MainAdVideoView.this.mVideoAdData.getTrackingCompleteUrls());
                    }
                }
            });
            return mediaPlayer0;
        }
        catch(Exception exception0) {
            AdPieLog.e("MainAdVideoView", exception0);
            return null;
        }
    }

    private void fadeOutAndHideImage(ImageView imageView0) {
        if(imageView0 != null) {
            imageView0.setVisibility(0);
            AlphaAnimation alphaAnimation0 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation0.setInterpolator(new AccelerateInterpolator());
            alphaAnimation0.setDuration(1000L);
            alphaAnimation0.setAnimationListener(new Animation.AnimationListener() {
                @Override  // android.view.animation.Animation$AnimationListener
                public void onAnimationEnd(Animation animation0) {
                    ImageView imageView0 = imageView0;
                    if(imageView0 != null) {
                        imageView0.setVisibility(8);
                    }
                }

                @Override  // android.view.animation.Animation$AnimationListener
                public void onAnimationRepeat(Animation animation0) {
                }

                @Override  // android.view.animation.Animation$AnimationListener
                public void onAnimationStart(Animation animation0) {
                }
            });
            imageView0.setAnimation(alphaAnimation0);
        }
    }

    public int getVideoHeight() {
        if(this.mVideoHeight == 0) {
            Drawable drawable0 = this.getBackground();
            return drawable0 == null ? this.mVideoHeight : drawable0.getIntrinsicHeight();
        }
        return this.mVideoHeight;
    }

    public int getVideoWidth() {
        if(this.mVideoWidth == 0) {
            Drawable drawable0 = this.getBackground();
            return drawable0 == null ? this.mVideoWidth : drawable0.getIntrinsicWidth();
        }
        return this.mVideoWidth;
    }

    private void initLayout() {
        try {
            if(this.mContext == null) {
                return;
            }
            TextureView textureView0 = this.mTextureView;
            if(textureView0 != null) {
                this.removeView(textureView0);
                this.mTextureView = null;
            }
            if(this.mTextureView == null) {
                TextureView textureView1 = new TextureView(this.mContext);
                this.mTextureView = textureView1;
                textureView1.setOpaque(false);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                this.mTextureView.setLayoutParams(frameLayout$LayoutParams0);
                this.mTextureView.setSurfaceTextureListener(this);
                this.addView(this.mTextureView, 0);
            }
            if(this.mContainer == null) {
                this.mContainer = new RelativeLayout(this.mContext);
                FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
                this.mContainer.setLayoutParams(frameLayout$LayoutParams1);
                this.addView(this.mContainer);
                this.setupReadyStateContainer();
                this.setupPlayStateContainer();
            }
            if(this.mProgressBar == null) {
                this.mProgressBar = new ProgressBar(this.mContext);
                FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                frameLayout$LayoutParams2.gravity = 17;
                this.mProgressBar.setLayoutParams(frameLayout$LayoutParams2);
                try {
                    this.mProgressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF4081"), PorterDuff.Mode.SRC_IN);
                }
                catch(Exception unused_ex) {
                }
                this.addView(this.mProgressBar);
            }
            this.setVisibleContainer(true, false);
        }
        catch(Exception unused_ex) {
        }
    }

    public boolean mute() {
        return this.setVolume(0);
    }

    private void notifyClick() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyAdClicked();
        }
    }

    private void notifyCompleted() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdCompleted();
        }
    }

    private void notifyError() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdError();
        }
    }

    private void notifyPaused() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdPaused();
        }
    }

    private void notifySkipped() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdSkipped();
        }
    }

    private void notifyStarted() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdStarted();
        }
    }

    private void notifyStopped() {
        AdEventListener adEventListener0 = this.mAdEventListener;
        if(adEventListener0 != null) {
            adEventListener0.notifyVideoAdStopped();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        AdPieLog.d("MainAdVideoView", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        AdPieLog.d("MainAdVideoView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        AdPieLog.d("MainAdVideoView", "onSurfaceTextureAvailable");
        this.mSurfaceTexture = surfaceTexture0;
        this.mIsReady = true;
        this.setVisibleContainer(true, false);
        if(this.getBackground() == null) {
            new VideoThumbnail(this, this.mUrl).execute();
        }
        if(!this.isSentImpression) {
            this.isSentImpression = true;
            ReportUtil.sendReport("VIDEO_IMPRESSION", this.mVideoAdData.getTrackingImpUrls());
        }
        if(this.mIsAutoPlay) {
            this.startVideo();
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        AdPieLog.d("MainAdVideoView", "onSurfaceTextureDestroyed");
        this.mIsReady = false;
        if(this.mMediaPlayer != null && this.mMediaPlayer.isPlaying()) {
            this.notifyStopped();
        }
        this.stopVideo();
        return false;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        AdPieLog.d("MainAdVideoView", "onSurfaceTextureSizeChanged");
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        AdPieLog.d("MainAdVideoView", "onSurfaceTextureUpdated");
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        AdPieLog.d("MainAdVideoView", "onWindowVisibilityChanged(" + v + "): " + (v == 0 ? "VISIBLE" : "INVISIBLE"));
        if(v == 0) {
            if(!this.mIsVisible) {
                this.initLayout();
            }
            this.mIsVisible = true;
            return;
        }
        this.mIsVisible = false;
        if(this.mMediaPlayer != null && this.mMediaPlayer.isPlaying()) {
            this.notifyStopped();
        }
        this.stopVideo();
    }

    public void pauseVideo() {
        MediaPlayer mediaPlayer0 = this.mMediaPlayer;
        if(mediaPlayer0 != null) {
            mediaPlayer0.pause();
            ImageView imageView0 = this.mRestartImageView;
            if(imageView0 != null) {
                imageView0.setVisibility(8);
            }
            this.fadeOutAndHideImage(this.mPauseImageView);
            this.notifyPaused();
        }
    }

    private void resetData() {
        this.mUrl = null;
        this.mIsClickableVideo = false;
        this.mLink = null;
        this.mVideoDuration = 0;
        this.mVideoCurPosSec = 0;
        this.mFirstQuartile = 0;
        this.mSecondQuartile = 0;
        this.mThirdQuartile = 0;
        this.isSentStart = false;
        this.isSentComplete = false;
        this.isSentFirst = false;
        this.isSentSecond = false;
        this.isSentThird = false;
        this.mIsPrepared = false;
        this.mIsPreparing = false;
    }

    public void restartVideo() {
        MediaPlayer mediaPlayer0 = this.mMediaPlayer;
        if(mediaPlayer0 != null) {
            mediaPlayer0.start();
            this.removeCallbacks(this.videoPlayTrackerRunnable);
            this.post(this.videoPlayTrackerRunnable);
            ImageView imageView0 = this.mPauseImageView;
            if(imageView0 != null) {
                imageView0.setVisibility(8);
            }
            this.fadeOutAndHideImage(this.mRestartImageView);
            this.notifyStarted();
        }
    }

    public void setVideoAdData(VideoAdData videoAdData0, AdEventListener adEventListener0) {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("MainAdVideoView", "setVideoAdData");
        }
        this.resetData();
        this.mVideoAdData = videoAdData0;
        this.mAdEventListener = adEventListener0;
        this.mIsAutoPlay = videoAdData0.isAutoPlay();
        this.mUrl = videoAdData0.getVideoContent();
        this.mLink = this.mVideoAdData.getLink();
        this.mIsWebViewLanding = this.mVideoAdData.getWebviewLanding() == 1;
        boolean z = TextUtils.isEmpty(this.mLink);
        this.mIsClickableVideo = !z;
        if(z) {
            Button button1 = this.mAdButton;
            if(button1 != null) {
                button1.setVisibility(8);
            }
        }
        else {
            Button button0 = this.mAdButton;
            if(button0 != null) {
                button0.setVisibility(0);
                if(this.mVideoAdData != null && !TextUtils.isEmpty(this.mVideoAdData.getLinkText())) {
                    this.mAdButton.setText(this.mVideoAdData.getLinkText());
                    return;
                }
                this.mAdButton.setText("자세히 보기");
            }
        }
    }

    private void setVisibleContainer(boolean z, boolean z1) {
        int v = 8;
        if(z || z1) {
            ProgressBar progressBar1 = this.mProgressBar;
            if(progressBar1 != null) {
                progressBar1.setVisibility(8);
            }
        }
        else {
            ProgressBar progressBar0 = this.mProgressBar;
            if(progressBar0 != null) {
                progressBar0.setVisibility(0);
            }
        }
        RelativeLayout relativeLayout0 = this.mReadyStateContainer;
        if(relativeLayout0 != null) {
            relativeLayout0.setVisibility((z ? 0 : 8));
        }
        RelativeLayout relativeLayout1 = this.mPlayStateContainer;
        if(relativeLayout1 != null) {
            if(z1) {
                v = 0;
            }
            relativeLayout1.setVisibility(v);
        }
    }

    private boolean setVolume(int v) {
        if(this.mMediaPlayer != null) {
            try {
                float f = (float)(1.0 - (100 - v <= 0 ? 0.0 : Math.log(100 - v)) / 4.60517);
                this.mMediaPlayer.setVolume(f, f);
                return true;
            }
            catch(Exception exception0) {
            }
            AdPieLog.e("MainAdVideoView", exception0);
        }
        return false;
    }

    public void setVolumeImage() {
        try {
            if(this.mVolumeOffBitmap == null) {
                byte[] arr_b = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAAB20lEQVR4Ae3WPYtTQRSH8dFdJIKijW8pfEHMBhsLsbOIgtoLFvkISW8rq34DOwM2IvgNtLwq64paRCyMgp3sptHGTlnziEw4HIazN39IOvOcKpO599fMwE3LFt0ymlS0SML0OKPsS/hp8gXYkgiATbqsoANUALXEugNyI67rQIvtWuIueMAa0NAAT2xTEvfAARV/HPGOoxqQWIsJ7pNLNmcZsGPEJ47EgEY0eO8Bm4uMjHhLQwFKYm26dnhKlHsP8MyIhwJgxDgmgr37eG7ENWJAJ8K9B/lsh3ZFBRLtiLB/39B2ey/ZmerqQEjYwE867vcjcq/rgLrGBcE/wq2dY0LutAAIRG7Trbwk168BdMLuxQ1buU3uiQ5ERLu4F4/t6cvkhgqgE1/t6WPkviuATvxyFy73WwB0wh3LVXI7CqAT++3pE+R+zAdslYTNFXIf5gNauxJ3hGMqlHYlhuR68wIxsTq9FxNORkA86xFgRHwvXpB0ICLSDOKmDsREqiUOsUcHYiLNIJIOxERSCR0wIgCu8g1iQgeMKIDzPMWKCB0wwgEb+CYRoQNGOMC//AEXGIeEDhhRAh/pFF8glQAIA/CKW+wtPnJGHF8M0OdU8B1V2esNWPwsgf8N+AunGBPD8qjlUgAAAABJRU5ErkJggg==", 0);
                this.mVolumeOffBitmap = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            }
            if(this.mVolumeOnBitmap == null) {
                byte[] arr_b1 = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAQAAAD9CzEMAAABjklEQVR4Ae2XQSuEQRjHN2qtoj0QDgqx7d6lqFVI6+6EswvOnPdDyGFLLfEVuKjN2nbLRZJ2w0dQtDfi/blMT9O0YfJMLu8zp/n/n31+787Ozjxv4v8ijjjYYoLEz8Oe+A2AOut06wKKCMBEk4IeoAg2QKJESgNQBAtQ4RMJrhn6E0DKYymTlPiwlqojwrc8jj5N0/oWvf4AtzyuRx9n4pX8AW55OvhJzsUtuK5veTrm9NMybsv9X/iWR5wGOStvRvbUhgvwK4940GbByj00fv07wG/Czm2TlXmGyGSMawHc57002o4mAFZE2TXKqS7gWJS8UW50AU+iDBvlWRfwJkrSKO/BAaGWaCTMEpVFmQ/zIy+LsmeUE03AlfXpqtG29QCvZGSelYwxrcPuhbyVWzZ+Teu4rjJl5c3KUbcW4sJJ82Dce7r0r8weLsRd0r/001b5A/22ZY5HcRqkdBuvHEdWd3fHoG7rWCMCiToD4ZrfiH2S4dr3WxZDvYBEVFiVfa8O2GQ06CuUjBgQA74AFyzYmAiHa/QAAAAASUVORK5CYII=", 0);
                this.mVolumeOnBitmap = BitmapFactory.decodeByteArray(arr_b1, 0, arr_b1.length);
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("MainAdVideoView", exception0);
        }
    }

    private void setupBackgroundView() {
        if(this.mBackgroundView == null) {
            try {
                this.mBackgroundView = new View(this.mContext);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                this.mBackgroundView.setLayoutParams(frameLayout$LayoutParams0);
                this.mBackgroundView.setBackgroundColor(Color.parseColor("#66000000"));
                this.mReadyStateContainer.addView(this.mBackgroundView);
            }
            catch(Exception exception0) {
                AdPieLog.e("MainAdVideoView", exception0);
            }
        }
    }

    private void setupClickButton() {
        try {
            if(this.mAdButton == null) {
                Button button0 = new Button(this.mContext);
                this.mAdButton = button0;
                button0.setBackgroundColor(0x80000000);
                this.mAdButton.setTextColor(-1);
                this.mAdButton.setOnClickListener(new View.OnClickListener() {
                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        if(!ClickThroughUtil.isValidClick()) {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("MainAdVideoView", ":::clickEvent::: " + MainAdVideoView.this.mLink + " -> block");
                            }
                            return;
                        }
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("MainAdVideoView", ":::clickEvent::: " + MainAdVideoView.this.mLink + " -> isWebViewLanding : " + MainAdVideoView.this.mIsWebViewLanding);
                        }
                        if(MainAdVideoView.this.mIsWebViewLanding) {
                            HttpUtil.getFinalURL(MainAdVideoView.this.mLink, new Handler(Looper.getMainLooper()) {
                                @Override  // android.os.Handler
                                public void handleMessage(@NonNull Message message0) {
                                    if(message0.what == 100) {
                                        try {
                                            if(ClickThroughUtil.goToWebView(MainAdVideoView.this.mContext, ((String)message0.obj))) {
                                                MainAdVideoView.this.notifyClick();
                                                if(MainAdVideoView.this.mVideoAdData != null) {
                                                    ReportUtil.sendReport("VIDEO_CLICK", MainAdVideoView.this.mVideoAdData.getTrackingClkUrls());
                                                    return;
                                                }
                                            }
                                            else if(ClickThroughUtil.goToBrowser(MainAdVideoView.this.mContext, ((String)message0.obj))) {
                                                MainAdVideoView.this.notifyClick();
                                                if(MainAdVideoView.this.mVideoAdData != null) {
                                                    ReportUtil.sendReport("VIDEO_CLICK", MainAdVideoView.this.mVideoAdData.getTrackingClkUrls());
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        AdPieLog.e("MainAdVideoView", exception0);
                                    }
                                }
                            });
                            return;
                        }
                        if(ClickThroughUtil.goToBrowser(MainAdVideoView.this.mContext, MainAdVideoView.this.mLink)) {
                            MainAdVideoView.this.notifyClick();
                            if(MainAdVideoView.this.mVideoAdData != null) {
                                ReportUtil.sendReport("VIDEO_CLICK", MainAdVideoView.this.mVideoAdData.getTrackingClkUrls());
                            }
                        }
                    }
                });
                this.mAdButton.setTextSize(2, 9.0f);
                this.mAdButton.setMinimumHeight(0);
                this.mAdButton.setMinimumWidth(0);
                this.mAdButton.setMaxEms(10);
                this.mAdButton.setMaxLines(1);
                this.mAdButton.setSingleLine();
                this.mAdButton.setWidth(DisplayUtil.dpToPx(this.mContext, 60));
                this.mAdButton.setHeight(DisplayUtil.dpToPx(this.mContext, 0x20));
                this.mAdButton.setAllCaps(false);
                this.mAdButton.setEllipsize(TextUtils.TruncateAt.END);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
                relativeLayout$LayoutParams0.addRule(11);
                relativeLayout$LayoutParams0.addRule(12);
                int v = DisplayUtil.dpToPx(this.mContext, 10);
                relativeLayout$LayoutParams0.setMargins(v, v, v, v);
                this.mAdButton.setLayoutParams(relativeLayout$LayoutParams0);
                this.mAdButton.setVisibility(8);
                this.mPlayStateContainer.addView(this.mAdButton, relativeLayout$LayoutParams0);
            }
            if(this.mIsClickableVideo) {
                Button button1 = this.mAdButton;
                if(button1 != null) {
                    button1.setVisibility(0);
                    if(this.mVideoAdData != null && !TextUtils.isEmpty(this.mVideoAdData.getLinkText())) {
                        this.mAdButton.setText(this.mVideoAdData.getLinkText());
                        return;
                    }
                    this.mAdButton.setText("자세히 보기");
                }
            }
            else {
                Button button2 = this.mAdButton;
                if(button2 != null) {
                    button2.setVisibility(8);
                }
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("MainAdVideoView", exception0);
        }
    }

    private void setupPauseIcon() {
        try {
            if(this.mPauseImageView == null) {
                this.mPauseImageView = new ImageView(this.mContext);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, 80), DisplayUtil.dpToPx(this.mContext, 80));
                relativeLayout$LayoutParams0.addRule(13);
                this.mPauseImageView.setLayoutParams(relativeLayout$LayoutParams0);
                try {
                    byte[] arr_b = Base64.decode("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", 0);
                    Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                    this.mPauseImageView.setImageBitmap(bitmap0);
                }
                catch(Exception exception0) {
                    AdPieLog.e("MainAdVideoView", exception0);
                }
                this.mPlayStateContainer.addView(this.mPauseImageView);
            }
            this.mPauseImageView.setVisibility(8);
        }
        catch(Exception unused_ex) {
        }
    }

    private void setupPlayIcon() {
        try {
            if(this.mPlayImageView == null) {
                this.mPlayImageView = new ImageView(this.mContext);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, 80), DisplayUtil.dpToPx(this.mContext, 80));
                relativeLayout$LayoutParams0.addRule(13);
                this.mPlayImageView.setLayoutParams(relativeLayout$LayoutParams0);
                goto label_5;
            }
        }
        catch(Exception unused_ex) {
        }
        return;
        try {
        label_5:
            byte[] arr_b = Base64.decode("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", 0);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            this.mPlayImageView.setImageBitmap(bitmap0);
            goto label_11;
        }
        catch(Exception exception0) {
            try {
                AdPieLog.e("MainAdVideoView", exception0);
            label_11:
                this.mPlayImageView.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                    AdPieLog.d("MainAdVideoView", ":::start::: isReady : " + MainAdVideoView.this.mIsReady + ", isLoading : " + MainAdVideoView.this.mIsPreparing);
                    if(MainAdVideoView.this.mIsReady && !MainAdVideoView.this.mIsPreparing) {
                        try {
                            if(MainAdVideoView.this.mMediaPlayer != null && MainAdVideoView.this.mMediaPlayer.isPlaying()) {
                                return;
                            }
                            MainAdVideoView.this.stopVideo();
                            MainAdVideoView.this.mIsPreparing = true;
                            MainAdVideoView.this.mMediaPlayer = MainAdVideoView.this.createMediaPlayer();
                            Surface surface0 = new Surface(MainAdVideoView.this.mSurfaceTexture);
                            MainAdVideoView.this.mMediaPlayer.setSurface(surface0);
                            MainAdVideoView.this.mMediaPlayer.setDataSource(MainAdVideoView.this.mUrl);
                            MainAdVideoView.this.mMediaPlayer.prepareAsync();
                            MainAdVideoView.this.mIsPrepared = false;
                            MainAdVideoView.this.postDelayed(MainAdVideoView.this.checkVideoPrepared, 5000L);
                            MainAdVideoView.this.setVisibleContainer(false, false);
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        MainAdVideoView.this.mIsPreparing = false;
                        AdPieLog.e("MainAdVideoView", exception0);
                        MainAdVideoView.this.notifyError();
                        MainAdVideoView.this.stopVideo();
                    }
                });
                this.mReadyStateContainer.addView(this.mPlayImageView);
            }
            catch(Exception unused_ex) {
            }
        }

        class com.gomfactory.adpie.sdk.nativeads.MainAdVideoView.8 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                MainAdVideoView.this.startVideo();
            }
        }

    }

    private void setupPlayStateContainer() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.mContext);
        this.mPlayStateContainer = relativeLayout0;
        relativeLayout0.setLayoutParams(frameLayout$LayoutParams0);
        this.mPlayStateContainer.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(MainAdVideoView.this.mMediaPlayer != null) {
                    if(MainAdVideoView.this.mMediaPlayer.isPlaying()) {
                        MainAdVideoView.this.pauseVideo();
                        return;
                    }
                    MainAdVideoView.this.restartVideo();
                }
            }
        });
        this.addView(this.mPlayStateContainer);
        this.setupVolumeButton();
        this.setupPauseIcon();
        this.setupRestartIcon();
        this.setupSeekBar();
        this.setupClickButton();
    }

    private void setupReadyStateContainer() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.mContext);
        this.mReadyStateContainer = relativeLayout0;
        relativeLayout0.setLayoutParams(frameLayout$LayoutParams0);
        this.mReadyStateContainer.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            AdPieLog.d("MainAdVideoView", ":::start::: isReady : " + MainAdVideoView.this.mIsReady + ", isLoading : " + MainAdVideoView.this.mIsPreparing);
            if(MainAdVideoView.this.mIsReady && !MainAdVideoView.this.mIsPreparing) {
                try {
                    if(MainAdVideoView.this.mMediaPlayer != null && MainAdVideoView.this.mMediaPlayer.isPlaying()) {
                        return;
                    }
                    MainAdVideoView.this.stopVideo();
                    MainAdVideoView.this.mIsPreparing = true;
                    MainAdVideoView.this.mMediaPlayer = MainAdVideoView.this.createMediaPlayer();
                    Surface surface0 = new Surface(MainAdVideoView.this.mSurfaceTexture);
                    MainAdVideoView.this.mMediaPlayer.setSurface(surface0);
                    MainAdVideoView.this.mMediaPlayer.setDataSource(MainAdVideoView.this.mUrl);
                    MainAdVideoView.this.mMediaPlayer.prepareAsync();
                    MainAdVideoView.this.mIsPrepared = false;
                    MainAdVideoView.this.postDelayed(MainAdVideoView.this.checkVideoPrepared, 5000L);
                    MainAdVideoView.this.setVisibleContainer(false, false);
                    return;
                }
                catch(Exception exception0) {
                }
                MainAdVideoView.this.mIsPreparing = false;
                AdPieLog.e("MainAdVideoView", exception0);
                MainAdVideoView.this.notifyError();
                MainAdVideoView.this.stopVideo();
            }
        });
        this.addView(this.mReadyStateContainer);
        this.setupBackgroundView();
        this.setupPlayIcon();

        class com.gomfactory.adpie.sdk.nativeads.MainAdVideoView.7 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                MainAdVideoView.this.startVideo();
            }
        }

    }

    private void setupRestartIcon() {
        try {
            if(this.mRestartImageView == null) {
                this.mRestartImageView = new ImageView(this.mContext);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, 80), DisplayUtil.dpToPx(this.mContext, 80));
                relativeLayout$LayoutParams0.addRule(13);
                this.mRestartImageView.setLayoutParams(relativeLayout$LayoutParams0);
                goto label_5;
            }
            goto label_12;
        }
        catch(Exception exception0) {
            AdPieLog.e("MainAdVideoView", exception0);
            return;
        }
        try {
        label_5:
            byte[] arr_b = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAMAAAADACAQAAAD41aSMAAAK20lEQVR4AezBgQAAAACAoP2pF6kCAAAAAACYvXv/jarM4zj+nSlKSyJtYX8RRIgstN1elKBLuBSDP+ElUUNRy6olBoMkGC8oroWW6m7MxhQXI4hKVlzRXRRdMCJUURApN9FEXEsiAaoYWS21BZX0Mpf3/gfP88zMOed7ztjX5w8w6Tt+2zmdDuFAEVXcxP208jptHOEUXZynjxQp+jhPF6c4Qhuv0cpSbqKSIiQKE8K8UdxIM29xnBSZSvE1W2jmBkqHAmS60dSzgWOk8UKaDl7iDkYNBbCvmlUcIoUfkhykicrwB9BZGS0cIwgdNDM5tAEUVkQD7QTtE+6iaCjABNZwDi29PMP4326Aa3iTJNoS/Jupv70AV7ODMHmXKb+dAJVsI3zSvE15/gcYzTqShFWCZynN3wBxltJD2HVzH7F8DFDJQaKinYr8CnARLQwQJQM0MSxfAkzmCFF0iIn5EGARvxJVv7Aw2gGK2IRX0pxiO8+xjDqupYpLKaaIAgooophLqeJa6ljGWt6jkzReeZnCqAa4gi/I3fe8yQPM4BIkg41kJg+yhTPk7jPGRzHAHHrIxQAf8BBlSI6r4GF2MUguuqmNWoC7GCBbCXaykBLEw5VyD20kyVY/9VEK0Ey2OlnBGMSnjaWJb8hOmsejESDGGrKzj5uJB/B6/Fb2k53W8AeIs4Fs7GAaEuBm8D7ZWE8szAHibCJzu5mOKGwWn5C5V4iFNUCMDWTqBLcgiqujk0y9ENYAz5KZfpq4GFFeIU8wQGZWhzFAM5lppxwJySo5QGYeD1uAu8nEII8RR0K0OCtI4C5NfZgCzGEQd8eZioRwf+QE7vqpDUuAK+jB3VZGIiFdCe/irpvxYQhQxBe4SrOSGBLixVhFGlefUagfYBOu+rgNicAWMICrf2gHWISrn5iJRGSz6cVVg2aASfyKmx+pRiK0q+jCzc9coRXgIo7g5nvKkIitgjO4OcgwnQAtuPmRMiSCq+AsblZqBKhi0PH21yAR3RR6cdFPedAB4hzERR8zkAhvNgO42Ecs2ABLcZHmNiTiW0AaF4uDDDCaHufbGP214OIsJcEFWIuLbcTyIkCM7bj4e1ABKklid5yRSJ6shJPYDVIWTIBt2A0yFcmjTSOB3ZYgAlyNiz8jebYm7NJc6X+AHdi1e/jrllcYgeiPAg5h947fAa7x+GWJfdDBH/QDOL/0nOJvgDewa0I8HMAFFiL640nsXvczwASS2JzgYs8DAKE4RYV8g02Ccf4FWIPdLYgfAUJyiuZjt9qvACM4h81uxJ8AoTlF+7DpodCfAA3YTfcrQGhO0Wzs7vQnQDs2OxDfA+ifol3Y7PUjQDl20wIIoH+KZmL3e+8DtGCzDwkkgP4pOoDNSu8DHMPm5oAC6J+iedh86XWAamw6iQcUQP8UxfkWmwpvA6zCZgXibwD9U+TD18M5wCHMEoxRCKB3isaRwqzdywCjrf+5nYhCAM1T9CFmSUq8C1CPzUKFALqn6F5s5nsXYANmA5QoBNA9RaNJYPa8dwGOYfYBohBA+xTtwexLrwKMIo3ZQ/oBFE7RcsxSFHsT4EZsyvQDKJyiamzmehOgGbPvEf0AKqeoC7MV3gR4C7M39QMonaKtmG32JsBxzB7QD6B0ipZhdsyLAEWkMJuhH0DpFM3CLMnw3ANUYZbmEv0ASqeoBJvy3APchNkpRD+A2ik6jdn1uQe4H7Pt+gEUT9FOzJbkHqAVs+f0AyieovWYPZ17gNcxW6YfQPEULcfs1dwDtGFWpx9A8RTdjtmO3AMcwexa/QCKp+g6zA7nHuAUZlX6ARRPUQ1mJ3MP0IXZpfoBFE/RGMx+yD3AecyK9QMonqJSzHpzD9CHWZF+AMVTNAKzC7kHSGFWoB9A8RQVYJYcCmAO0KAXYOgEfaV5goa+CW/U/CY89GNoA+LJxmb+Y+jQC7GvNF+IDT2K2Kj5KGLoYVxDwA/j3ss9wGt58zj6q2g+jm7FbG1EAmyM6i9kltr/J/N1mqcn9wO9xP9fynf6H0Dt9Nj3HWZzcw9QiVmakaEOsFH1bSllQbwxa6ZmAPvp8XG1mCW8eGOW8DVmD+oFsJ8eX/cIZh2IFwG2YLZFM4DC6XH/9LzNwbw9/YxKAPvp8X9nMWv0JsAN2FQoBLCdHv9XE9QfaJSSxuxhhQC20+P/HsMsxUhvAggdmO1SCGA7Pf7vY8yOIl4FeAmzQUoVAlhOj8/7HQnM1nkX4A5s7lEIYDk9Pm8xNnXeBRhFCrM2hQCW0+PzPsIsQbF3AYSDmCUZqxDAcnp83OWkvPn4Ku8+OblJKYD99Oj8mwKN3gaowuYblQ9sakAUFuc0NuXeBhA6sLnVnwCW06OxOmyOIl4HaMZmvz8BLKdHY4exafQ+wGSVj20Vy+nRWC12E70PIOzD5n3E61lOj8Z2Y7MH8SPA3djN8jWA/fT4vznYLfAnQBG92Oz1NYD99Pi//dj8xHB/AgjPYDfPtwD20+P/6rFrRfwKMJ4kNqco9CWA/fT4vxGcxmaQy/wLIGzG7gnPA9hPTzB7CrtNiJ8BpmI3QKWnAeynJ5jVkMDuSn8DCNuxO+DhY4mNoflnrD7Fbivid4AppLFrRPJsLdilqfY/gPA2dgmuQfJoM0hitxkJIkA5CexOUILkyUbRid0gk4IJIDyLi3eJIXmwOG24aEWCClBKNy5W5UWAv+Cii+LgAgj34SJNPRLx3Y2bRUiQAWLsx0U/tUiEN4cBXHxMLNgAQgUDuOjlKiSim8o5XPQxGQk6gNCEmy4qkAiukm7cNCIaAYZxCDdnIpigkv/hpp0CnQDCRH7BTVfEDtFUunFzngmIVgBhIa56mR2hb73ncPUnRDOAsBFX/SyIyA+eg7h6EdEOUMjnuErTQizkr3r/irvDXKwfQBhPN+62UxLiZz5tuOviMiQMAYRa+nF3kmkhfeLZibs+piNhCSDUk8ZdgpXEkRCtgBaSuEszHwlTAKGRzByiCgnJaviUzDyKhC2A0EpmBnmSQv13OvAUCTLzNySMAYQXyFQn85Xf53OaTK1Fwhogzj/J3CfMVnq5tZ/MvUwsvAGEGC+QjV3MRALcbHaTjXXEEN0A9q0mOweYRzyAl1p1HMbCcvtDHkBoJE12vmUV43z807oWTpOdNI8iUQkg1NNPtlJ8yL2M9vjPqhfzESmy1cd8JEoBhFq6yUWCPSyn2oOf8R/jYxLkoovpSNQCCOP5nNz9yFaWMSvD9xyUUMsjbKOL3B1mHBLFAEIhL+Od0+xkPcu5neuoYQyljKCAAkZQylhquI7bWc562vgO77zIcCS8Aexr4Gei6rz91y3hDyBM5CBR1M4EJB8CCMNYST9R0sfjFCDRCWBfBe1ExV4mI8FMCG4xFnOWsOtiETEkmgHsK2ENCcJqkFaKkSAnBL9ytpAmbNJsZhIS9ASdXcU7hMl/qEY0JuhtCv8igbZBNnElojVBd5ezmh609NDKZYjmBP0Vcid7CVaaPSygENGeEJZNYiX/JQhHaWQiEo4J4VoFK2gniR8S7KORciRME8K4EubzPF+SwgspjrKOeRQj4ZsQ5hUzlxW8wTGSZCpBB5tpZK79Cz8UwL7hlHM9S3iaV9nBYU7yA71cIEmSC/TyAyc5zHu8ytMsYS5l/j7F/397dEwEAACAQKh/azu4PkcEegE/AQgQgAABCBCAAAEIEIAAAQgQwADyDx+z4ALLxwAAAABJRU5ErkJggg==", 0);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            this.mRestartImageView.setImageBitmap(bitmap0);
            goto label_11;
        }
        catch(Exception exception1) {
            try {
                AdPieLog.e("MainAdVideoView", exception1);
            label_11:
                this.mPlayStateContainer.addView(this.mRestartImageView);
            label_12:
                this.mRestartImageView.setVisibility(8);
                return;
            }
            catch(Exception exception0) {
            }
        }
        AdPieLog.e("MainAdVideoView", exception0);
    }

    private void setupSeekBar() {
        if(this.mSeekbar == null) {
            try {
                this.mSeekbar = new NoSkipSeekBar(this, this.mContext);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, DisplayUtil.dpToPx(this.mContext, 4));
                relativeLayout$LayoutParams0.addRule(12);
                this.mSeekbar.setLayoutParams(relativeLayout$LayoutParams0);
                ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(new float[]{6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f}, null, null));
                shapeDrawable0.setIntrinsicHeight(0);
                shapeDrawable0.setIntrinsicWidth(0);
                this.mSeekbar.setThumb(shapeDrawable0);
                Drawable drawable0 = this.mSeekbar.getProgressDrawable();
                int v = Color.parseColor("#FF4081");
                PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
                drawable0.setColorFilter(v, porterDuff$Mode0);
                this.mSeekbar.getThumb().setColorFilter(Color.parseColor("#FF4081"), porterDuff$Mode0);
                this.mPlayStateContainer.addView(this.mSeekbar);
            }
            catch(Exception exception0) {
                AdPieLog.e("MainAdVideoView", exception0);
            }
        }
    }

    private void setupVolumeButton() {
        try {
            if(this.mVolumeImage == null) {
                ImageView imageView0 = new ImageView(this.mContext);
                this.mVolumeImage = imageView0;
                imageView0.setBackgroundColor(0x80000000);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, 24), DisplayUtil.dpToPx(this.mContext, 24));
                relativeLayout$LayoutParams0.addRule(9);
                relativeLayout$LayoutParams0.addRule(12);
                int v = DisplayUtil.dpToPx(this.mContext, 14);
                relativeLayout$LayoutParams0.setMargins(v, v, v, v);
                this.mVolumeImage.setLayoutParams(relativeLayout$LayoutParams0);
                this.mVolumeImage.setOnClickListener(new View.OnClickListener() {
                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        MainAdVideoView.this.setVolumeImage();
                        if(MainAdVideoView.this.mIsVolumeOn) {
                            if(MainAdVideoView.this.mute()) {
                                MainAdVideoView.this.mIsVolumeOn = false;
                                MainAdVideoView.this.mVolumeImage.setImageBitmap(MainAdVideoView.this.mVolumeOffBitmap);
                            }
                        }
                        else if(MainAdVideoView.this.unmute()) {
                            MainAdVideoView.this.mIsVolumeOn = true;
                            MainAdVideoView.this.mVolumeImage.setImageBitmap(MainAdVideoView.this.mVolumeOnBitmap);
                        }
                    }
                });
                this.mPlayStateContainer.addView(this.mVolumeImage);
            }
            this.mIsVolumeOn = false;
            this.setVolumeImage();
            this.mVolumeImage.setImageBitmap(this.mVolumeOffBitmap);
            this.mVolumeImage.setVisibility(8);
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("MainAdVideoView", exception0);
    }

    // 检测为 Lambda 实现
    public void startVideo() [...]

    public void stopVideo() {
        MediaPlayer mediaPlayer0 = this.mMediaPlayer;
        if(mediaPlayer0 != null) {
            mediaPlayer0.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        this.setVisibleContainer(true, false);
        ProgressBar progressBar0 = this.mProgressBar;
        if(progressBar0 != null) {
            progressBar0.setVisibility(8);
        }
        ImageView imageView0 = this.mPauseImageView;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
        }
        ImageView imageView1 = this.mRestartImageView;
        if(imageView1 != null) {
            imageView1.setVisibility(8);
        }
        this.removeCallbacks(this.checkVideoPrepared);
        this.removeCallbacks(this.videoPlayTrackerRunnable);
        this.mIsPreparing = false;
    }

    public boolean unmute() {
        return this.setVolume(100);
    }
}

