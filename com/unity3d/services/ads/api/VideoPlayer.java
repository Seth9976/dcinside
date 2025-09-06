package com.unity3d.services.ads.api;

import com.unity3d.services.ads.video.VideoPlayerError;
import com.unity3d.services.ads.video.VideoPlayerEvent;
import com.unity3d.services.ads.video.VideoPlayerView;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class VideoPlayer {
    private static VideoPlayerView _videoPlayerView;

    @WebViewExposed
    public static void getCurrentPosition(WebViewCallback webViewCallback0) {
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[]{VideoPlayer.getVideoPlayerView().getCurrentPosition()});
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getProgressEventInterval(WebViewCallback webViewCallback0) {
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[]{VideoPlayer.getVideoPlayerView().getProgressEventInterval()});
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    public static VideoPlayerView getVideoPlayerView() {
        return VideoPlayer._videoPlayerView;
    }

    @WebViewExposed
    public static void getVideoViewRectangle(WebViewCallback webViewCallback0) {
        VideoPlayerView videoPlayerView0 = VideoPlayer.getVideoPlayerView();
        if(videoPlayerView0 != null) {
            int[] arr_v = videoPlayerView0.getVideoViewRectangle();
            webViewCallback0.invoke(new Object[]{((int)arr_v[0]), ((int)arr_v[1]), ((int)arr_v[2]), ((int)arr_v[3])});
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getVolume(WebViewCallback webViewCallback0) {
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[]{VideoPlayer.getVideoPlayerView().getVolume()});
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void pause(WebViewCallback webViewCallback0) {
        DeviceLog.debug("Pausing current video");
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().pause();
                }
            }
        });
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void play(WebViewCallback webViewCallback0) {
        DeviceLog.debug("Starting playback of prepared video");
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().play();
                }
            }
        });
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void prepare(String s, Double double0, WebViewCallback webViewCallback0) {
        VideoPlayer.prepare(s, double0, 0, webViewCallback0);
    }

    @WebViewExposed
    public static void prepare(String s, Double double0, Integer integer0, WebViewCallback webViewCallback0) {
        DeviceLog.debug(("Preparing video for playback: " + s));
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().prepare(s, double0.floatValue(), ((int)integer0));
                }
            }
        });
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[]{s});
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void seekTo(Integer integer0, WebViewCallback webViewCallback0) {
        DeviceLog.debug(("Seeking video to time: " + integer0));
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().seekTo(((int)integer0));
                }
            }
        });
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setInfoListenerEnabled(boolean z, WebViewCallback webViewCallback0) {
        if(VideoPlayer.getVideoPlayerView() != null) {
            VideoPlayer.getVideoPlayerView().setInfoListenerEnabled(z);
            webViewCallback0.invoke(new Object[]{WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.INFO, Boolean.valueOf(z)});
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setProgressEventInterval(Integer integer0, WebViewCallback webViewCallback0) {
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().setProgressEventInterval(((int)integer0));
                }
            }
        });
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    public static void setVideoPlayerView(VideoPlayerView videoPlayerView0) {
        VideoPlayer._videoPlayerView = videoPlayerView0;
    }

    @WebViewExposed
    public static void setVolume(Double double0, WebViewCallback webViewCallback0) {
        DeviceLog.debug(("Setting video volume: " + double0));
        if(VideoPlayer.getVideoPlayerView() != null) {
            VideoPlayer.getVideoPlayerView().setVolume(double0.floatValue());
            webViewCallback0.invoke(new Object[]{double0});
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void stop(WebViewCallback webViewCallback0) {
        DeviceLog.debug("Stopping current video");
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().stop();
                }
            }
        });
        if(VideoPlayer.getVideoPlayerView() != null) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }
}

