package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import y4.l;
import y4.m;

public interface SendDiagnosticEvent {
    public static final class Companion {
        static final Companion $$INSTANCE = null;
        @l
        public static final String APP_ACTIVE = "app_active";
        @l
        public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
        @l
        public static final String AWAITED_INIT = "awaited_init";
        @l
        public static final String BANNER_DESTROYED = "native_banner_destroyed";
        @l
        public static final String BILLING_SERVICE_UNAVAILABLE = "billing_service_unavailable";
        @l
        public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
        @l
        public static final String CACHE_SOURCE = "cache_source";
        @l
        public static final String COMPLETE_STATE = "complete_state";
        @l
        public static final String COROUTINE_NAME = "coroutine_name";
        @l
        public static final String GAME_ID = "game_id";
        @l
        public static final String HB_FAILURE = "native_gateway_token_failure_time";
        @l
        public static final String HB_STARTED = "native_gateway_token_started";
        @l
        public static final String HB_SUCCESS = "native_gateway_token_success_time";
        @l
        public static final String INIT_CLEAN_ASSETS = "native_clean_assets_task_success_time";
        @l
        public static final String INIT_COMPLETED_FAILURE = "native_initialization_completed_event_request_failure_time";
        @l
        public static final String INIT_COMPLETED_STARTED = "native_initialization_completed_event_request_started";
        @l
        public static final String INIT_COMPLETED_SUCCESS = "native_initialization_completed_event_request_success_time";
        @l
        public static final String INIT_FAILURE = "native_initialize_task_failure_time";
        @l
        public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
        @l
        public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
        @l
        public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
        @l
        public static final String INIT_STARTED = "native_initialization_started";
        @l
        public static final String INIT_SUCCESS = "native_initialize_task_success_time";
        @l
        public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
        @l
        public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
        @l
        public static final String IS_RETRY = "is_retry";
        @l
        public static final String LOAD_CACHE_FAILURE = "native_load_cache_failure_time";
        @l
        public static final String LOAD_CACHE_SUCCESS = "native_load_cache_success_time";
        @l
        public static final String LOAD_FAILURE = "native_load_failure_time";
        @l
        public static final String LOAD_STARTED = "native_load_started";
        @l
        public static final String LOAD_STARTED_AD_VIEWER = "native_load_started_ad_viewer";
        @l
        public static final String LOAD_SUCCESS = "native_load_success_time";
        @l
        public static final String NETWORK_CLIENT = "network_client";
        @l
        public static final String NETWORK_FAILURE = "native_network_failure_time";
        @l
        public static final String NETWORK_PARSE = "native_network_parse_failure";
        @l
        public static final String NETWORK_SUCCESS = "native_network_success_time";
        @l
        public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
        @l
        public static final String OLD_CALLBACK_STATUS = "old_callback_status";
        @l
        public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
        @l
        public static final String OM_ACTIVATE_STARTED = "om_activate_started";
        @l
        public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
        @l
        public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
        @l
        public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
        @l
        public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
        @l
        public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
        @l
        public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
        @l
        public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
        @l
        public static final String OPERATION = "operation";
        @l
        public static final String PREVIOUS_GAME_ID = "previous_game_id";
        @l
        public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
        @l
        public static final String PROTOCOL = "protocol";
        @l
        public static final String REASON = "reason";
        @l
        public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
        @l
        public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
        @l
        public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
        @l
        public static final String REASON_AD_VIEWER = "adviewer";
        @l
        public static final String REASON_ALREADY_SHOWING = "already_showing";
        @l
        public static final String REASON_CODE = "reason_code";
        @l
        public static final String REASON_DEBUG = "reason_debug";
        @l
        public static final String REASON_GATEWAY = "gateway";
        @l
        public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
        @l
        public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
        @l
        public static final String REASON_LISTENER_NULL = "listener_null";
        @l
        public static final String REASON_NETWORK = "network";
        @l
        public static final String REASON_NOT_INITIALIZED = "not_initialized";
        @l
        public static final String REASON_NO_FILL = "no_fill";
        @l
        public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
        @l
        public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
        @l
        public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
        @l
        public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
        @l
        public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
        @l
        public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
        @l
        public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
        @l
        public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
        @l
        public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
        @l
        public static final String REASON_PLACEMENT_NULL = "placement_null";
        @l
        public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
        @l
        public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
        @l
        public static final String REASON_TIMEOUT = "timeout";
        @l
        public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
        @l
        public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
        @l
        public static final String REASON_UNKNOWN = "unknown";
        @l
        public static final String RETRIES = "retries";
        @l
        public static final String SAME_SESSION = "same_session";
        @l
        public static final String SCAR_SIGNALS_COLLECTION_FAILURE = "native_scar_signals_collection_failure_time";
        @l
        public static final String SCAR_SIGNALS_COLLECTION_STARTED = "native_scar_signals_collection_started";
        @l
        public static final String SCAR_SIGNALS_COLLECTION_SUCCESS = "native_scar_signals_collection_success_time";
        @l
        public static final String SCAR_SIGNALS_UPLOAD_FAILURE = "native_scar_signals_upload_failure_time";
        @l
        public static final String SCAR_SIGNALS_UPLOAD_STARTED = "native_scar_signals_upload_started";
        @l
        public static final String SCAR_SIGNALS_UPLOAD_SUCCESS = "native_scar_signals_upload_success_time";
        @l
        public static final String SCAR_VIDEO_LENGTH_IN_SEC = "native_scar_video_length_in_sec";
        @l
        public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
        @l
        public static final String SHOW_AD_VIEWER_FULLSCREEN_ACTIVITY_EVENT = "native_show_ad_viewer_fullscreen_activity_event";
        @l
        public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT = "native_show_ad_viewer_fullscreen_intent";
        @l
        public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_CREATION_FAILS = "native_show_ad_viewer_fullscreen_intent_creation_fails";
        @l
        public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_CREATION_STARTS = "native_show_ad_viewer_fullscreen_intent_creation_starts";
        @l
        public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_CREATION_SUCCESS = "native_show_ad_viewer_fullscreen_intent_creation_success_time";
        @l
        public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_DESTROYED = "native_show_ad_viewer_fullscreen_intent_destroyed";
        @l
        public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
        @l
        public static final String SHOW_CLICKED = "native_show_clicked";
        @l
        public static final String SHOW_EVENT_FLOW_COLLECTED = "native_show_event_flow_collected";
        @l
        public static final String SHOW_EVENT_FLOW_COMPLETED = "native_show_event_flow_completed";
        @l
        public static final String SHOW_EVENT_FLOW_STARTED = "native_show_event_flow_started";
        @l
        public static final String SHOW_FAILURE = "native_show_failure_time";
        @l
        public static final String SHOW_HAS_STARTED = "show_has_started";
        @l
        public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
        @l
        public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
        @l
        public static final String SHOW_LEFT_APPLICATION = "native_show_left_app";
        @l
        public static final String SHOW_STARTED = "native_show_started";
        @l
        public static final String SHOW_STARTED_AD_VIEWER = "native_show_started_ad_viewer";
        @l
        public static final String SHOW_SUCCESS = "native_show_success_time";
        @l
        public static final String SHOW_WV_STARTED = "native_show_wv_started";
        @l
        public static final String SIZE_KB = "size_kb";
        @l
        public static final String SOURCE = "source";
        @l
        public static final String SOURCE_GET_TOKEN_API = "get_token";
        @l
        public static final String SOURCE_LOAD_API = "load";
        @l
        public static final String SOURCE_PUBLIC_API = "api";
        @l
        public static final String STATE = "state";
        @l
        public static final String SYNC = "sync";
        @l
        public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
        @l
        public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
        @l
        public static final String TEST_MODE = "test_mode";
        @l
        public static final String URL = "url";
        @l
        public static final String WEBVIEW_ERROR = "webview_error";
        @l
        public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
        @l
        public static final String WEBVIEW_URL = "webview_url";

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    public static final class DefaultImpls {
        public static void invoke$default(SendDiagnosticEvent sendDiagnosticEvent0, String s, Double double0, Map map0, Map map1, AdObject adObject0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            sendDiagnosticEvent0.invoke(s, ((v & 2) == 0 ? double0 : null), ((v & 4) == 0 ? map0 : null), ((v & 8) == 0 ? map1 : null), ((v & 16) == 0 ? adObject0 : null));
        }
    }

    @l
    public static final String APP_ACTIVE = "app_active";
    @l
    public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
    @l
    public static final String AWAITED_INIT = "awaited_init";
    @l
    public static final String BANNER_DESTROYED = "native_banner_destroyed";
    @l
    public static final String BILLING_SERVICE_UNAVAILABLE = "billing_service_unavailable";
    @l
    public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
    @l
    public static final String CACHE_SOURCE = "cache_source";
    @l
    public static final String COMPLETE_STATE = "complete_state";
    @l
    public static final String COROUTINE_NAME = "coroutine_name";
    @l
    public static final Companion Companion = null;
    @l
    public static final String GAME_ID = "game_id";
    @l
    public static final String HB_FAILURE = "native_gateway_token_failure_time";
    @l
    public static final String HB_STARTED = "native_gateway_token_started";
    @l
    public static final String HB_SUCCESS = "native_gateway_token_success_time";
    @l
    public static final String INIT_CLEAN_ASSETS = "native_clean_assets_task_success_time";
    @l
    public static final String INIT_COMPLETED_FAILURE = "native_initialization_completed_event_request_failure_time";
    @l
    public static final String INIT_COMPLETED_STARTED = "native_initialization_completed_event_request_started";
    @l
    public static final String INIT_COMPLETED_SUCCESS = "native_initialization_completed_event_request_success_time";
    @l
    public static final String INIT_FAILURE = "native_initialize_task_failure_time";
    @l
    public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
    @l
    public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
    @l
    public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
    @l
    public static final String INIT_STARTED = "native_initialization_started";
    @l
    public static final String INIT_SUCCESS = "native_initialize_task_success_time";
    @l
    public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
    @l
    public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
    @l
    public static final String IS_RETRY = "is_retry";
    @l
    public static final String LOAD_CACHE_FAILURE = "native_load_cache_failure_time";
    @l
    public static final String LOAD_CACHE_SUCCESS = "native_load_cache_success_time";
    @l
    public static final String LOAD_FAILURE = "native_load_failure_time";
    @l
    public static final String LOAD_STARTED = "native_load_started";
    @l
    public static final String LOAD_STARTED_AD_VIEWER = "native_load_started_ad_viewer";
    @l
    public static final String LOAD_SUCCESS = "native_load_success_time";
    @l
    public static final String NETWORK_CLIENT = "network_client";
    @l
    public static final String NETWORK_FAILURE = "native_network_failure_time";
    @l
    public static final String NETWORK_PARSE = "native_network_parse_failure";
    @l
    public static final String NETWORK_SUCCESS = "native_network_success_time";
    @l
    public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
    @l
    public static final String OLD_CALLBACK_STATUS = "old_callback_status";
    @l
    public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
    @l
    public static final String OM_ACTIVATE_STARTED = "om_activate_started";
    @l
    public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
    @l
    public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
    @l
    public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
    @l
    public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
    @l
    public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
    @l
    public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
    @l
    public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
    @l
    public static final String OPERATION = "operation";
    @l
    public static final String PREVIOUS_GAME_ID = "previous_game_id";
    @l
    public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
    @l
    public static final String PROTOCOL = "protocol";
    @l
    public static final String REASON = "reason";
    @l
    public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
    @l
    public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
    @l
    public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
    @l
    public static final String REASON_AD_VIEWER = "adviewer";
    @l
    public static final String REASON_ALREADY_SHOWING = "already_showing";
    @l
    public static final String REASON_CODE = "reason_code";
    @l
    public static final String REASON_DEBUG = "reason_debug";
    @l
    public static final String REASON_GATEWAY = "gateway";
    @l
    public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
    @l
    public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
    @l
    public static final String REASON_LISTENER_NULL = "listener_null";
    @l
    public static final String REASON_NETWORK = "network";
    @l
    public static final String REASON_NOT_INITIALIZED = "not_initialized";
    @l
    public static final String REASON_NO_FILL = "no_fill";
    @l
    public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
    @l
    public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
    @l
    public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
    @l
    public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
    @l
    public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
    @l
    public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
    @l
    public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
    @l
    public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
    @l
    public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
    @l
    public static final String REASON_PLACEMENT_NULL = "placement_null";
    @l
    public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
    @l
    public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
    @l
    public static final String REASON_TIMEOUT = "timeout";
    @l
    public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
    @l
    public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
    @l
    public static final String REASON_UNKNOWN = "unknown";
    @l
    public static final String RETRIES = "retries";
    @l
    public static final String SAME_SESSION = "same_session";
    @l
    public static final String SCAR_SIGNALS_COLLECTION_FAILURE = "native_scar_signals_collection_failure_time";
    @l
    public static final String SCAR_SIGNALS_COLLECTION_STARTED = "native_scar_signals_collection_started";
    @l
    public static final String SCAR_SIGNALS_COLLECTION_SUCCESS = "native_scar_signals_collection_success_time";
    @l
    public static final String SCAR_SIGNALS_UPLOAD_FAILURE = "native_scar_signals_upload_failure_time";
    @l
    public static final String SCAR_SIGNALS_UPLOAD_STARTED = "native_scar_signals_upload_started";
    @l
    public static final String SCAR_SIGNALS_UPLOAD_SUCCESS = "native_scar_signals_upload_success_time";
    @l
    public static final String SCAR_VIDEO_LENGTH_IN_SEC = "native_scar_video_length_in_sec";
    @l
    public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
    @l
    public static final String SHOW_AD_VIEWER_FULLSCREEN_ACTIVITY_EVENT = "native_show_ad_viewer_fullscreen_activity_event";
    @l
    public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT = "native_show_ad_viewer_fullscreen_intent";
    @l
    public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_CREATION_FAILS = "native_show_ad_viewer_fullscreen_intent_creation_fails";
    @l
    public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_CREATION_STARTS = "native_show_ad_viewer_fullscreen_intent_creation_starts";
    @l
    public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_CREATION_SUCCESS = "native_show_ad_viewer_fullscreen_intent_creation_success_time";
    @l
    public static final String SHOW_AD_VIEWER_FULLSCREEN_INTENT_DESTROYED = "native_show_ad_viewer_fullscreen_intent_destroyed";
    @l
    public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
    @l
    public static final String SHOW_CLICKED = "native_show_clicked";
    @l
    public static final String SHOW_EVENT_FLOW_COLLECTED = "native_show_event_flow_collected";
    @l
    public static final String SHOW_EVENT_FLOW_COMPLETED = "native_show_event_flow_completed";
    @l
    public static final String SHOW_EVENT_FLOW_STARTED = "native_show_event_flow_started";
    @l
    public static final String SHOW_FAILURE = "native_show_failure_time";
    @l
    public static final String SHOW_HAS_STARTED = "show_has_started";
    @l
    public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
    @l
    public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
    @l
    public static final String SHOW_LEFT_APPLICATION = "native_show_left_app";
    @l
    public static final String SHOW_STARTED = "native_show_started";
    @l
    public static final String SHOW_STARTED_AD_VIEWER = "native_show_started_ad_viewer";
    @l
    public static final String SHOW_SUCCESS = "native_show_success_time";
    @l
    public static final String SHOW_WV_STARTED = "native_show_wv_started";
    @l
    public static final String SIZE_KB = "size_kb";
    @l
    public static final String SOURCE = "source";
    @l
    public static final String SOURCE_GET_TOKEN_API = "get_token";
    @l
    public static final String SOURCE_LOAD_API = "load";
    @l
    public static final String SOURCE_PUBLIC_API = "api";
    @l
    public static final String STATE = "state";
    @l
    public static final String SYNC = "sync";
    @l
    public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
    @l
    public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
    @l
    public static final String TEST_MODE = "test_mode";
    @l
    public static final String URL = "url";
    @l
    public static final String WEBVIEW_ERROR = "webview_error";
    @l
    public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
    @l
    public static final String WEBVIEW_URL = "webview_url";

    static {
        SendDiagnosticEvent.Companion = Companion.$$INSTANCE;
    }

    void invoke(@l String arg1, @m Double arg2, @m Map arg3, @m Map arg4, @m AdObject arg5);
}

