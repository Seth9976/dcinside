package com.unity3d.services.core.request.metrics;

import java.util.Map;

public class TSIMetric {
    private static final String TSI_METRIC_COLLECTION_LATENCY = "native_device_info_collection_latency";
    private static final String TSI_METRIC_COMPRESSION_LATENCY = "native_device_info_compression_latency";
    private static final String TSI_METRIC_CONFIG_REQUEST_FAILURE = "native_config_request_failure_time";
    private static final String TSI_METRIC_CONFIG_REQUEST_SUCCESS = "native_config_request_success_time";
    private static final String TSI_METRIC_EMERGENCY_OFF = "native_emergency_switch_off";
    private static final String TSI_METRIC_INIT_STARTED = "native_initialization_started";
    private static final String TSI_METRIC_MISSING_GAME_SESSION_ID = "native_missing_game_session_id";
    private static final String TSI_METRIC_MISSING_STATE_ID = "native_missing_state_id";
    private static final String TSI_METRIC_MISSING_TOKEN = "native_missing_token";
    private static final String TSI_METRIC_PRIVACY_REQUEST_FAILURE = "native_privacy_request_failure_time";
    private static final String TSI_METRIC_PRIVACY_REQUEST_SUCCESS = "native_privacy_request_success_time";
    private static final String TSI_METRIC_PRIVACY_RESOLUTION_FAILURE = "native_privacy_resolution_request_latency_failure";
    private static final String TSI_METRIC_PRIVACY_RESOLUTION_SUCCESS = "native_privacy_resolution_request_latency_success";
    private static final String TSI_METRIC_TOKEN_ASYNC_AVAILABLE = "native_async_token_available";
    private static final String TSI_METRIC_TOKEN_ASYNC_NULL = "native_async_token_null";
    private static final String TSI_METRIC_TOKEN_AVAILABLE = "native_generated_token_available";
    private static final String TSI_METRIC_TOKEN_CONFIG = "native_token_availability_latency_config";
    private static final String TSI_METRIC_TOKEN_NULL = "native_generated_token_null";
    private static final String TSI_METRIC_TOKEN_RESOLUTION = "native_token_resolution_request_latency";
    private static final String TSI_METRIC_TOKEN_WEBVIEW = "native_token_availability_latency_webview";

    public static Metric newAsyncTokenAvailable(Map map0) {
        return new Metric("native_async_token_available", null, map0);
    }

    public static Metric newAsyncTokenNull(Map map0) {
        return new Metric("native_async_token_null", null, map0);
    }

    public static Metric newConfigRequestLatencyFailure(Long long0) {
        return new Metric("native_config_request_failure_time", long0);
    }

    public static Metric newConfigRequestLatencySuccess(Long long0) {
        return new Metric("native_config_request_success_time", long0);
    }

    public static Metric newDeviceInfoCollectionLatency(Long long0) {
        return new Metric("native_device_info_collection_latency", long0);
    }

    public static Metric newDeviceInfoCompressionLatency(Long long0) {
        return new Metric("native_device_info_compression_latency", long0);
    }

    public static Metric newEmergencySwitchOff() {
        return new Metric("native_emergency_switch_off", null);
    }

    public static Metric newInitStarted() {
        return new Metric("native_initialization_started", null);
    }

    public static Metric newMissingGameSessionId() {
        return new Metric("native_missing_game_session_id", null);
    }

    public static Metric newMissingStateId() {
        return new Metric("native_missing_state_id", null);
    }

    public static Metric newMissingToken() {
        return new Metric("native_missing_token", null);
    }

    public static Metric newNativeGeneratedTokenAvailable(Map map0) {
        return new Metric("native_generated_token_available", null, map0);
    }

    public static Metric newNativeGeneratedTokenNull(Map map0) {
        return new Metric("native_generated_token_null", null, map0);
    }

    public static Metric newPrivacyRequestLatencyFailure(Long long0) {
        return new Metric("native_privacy_request_failure_time", long0);
    }

    public static Metric newPrivacyRequestLatencySuccess(Long long0) {
        return new Metric("native_privacy_request_success_time", long0);
    }

    public static Metric newPrivacyResolutionRequestLatencyFailure(Long long0) {
        return new Metric("native_privacy_resolution_request_latency_failure", long0);
    }

    public static Metric newPrivacyResolutionRequestLatencySuccess(Long long0) {
        return new Metric("native_privacy_resolution_request_latency_success", long0);
    }

    public static Metric newTokenAvailabilityLatencyConfig(Long long0, Map map0) {
        return new Metric("native_token_availability_latency_config", long0, map0);
    }

    public static Metric newTokenAvailabilityLatencyWebview(Long long0, Map map0) {
        return new Metric("native_token_availability_latency_webview", long0, map0);
    }

    public static Metric newTokenResolutionRequestLatency(Long long0, Map map0) {
        return new Metric("native_token_resolution_request_latency", long0, map0);
    }
}

