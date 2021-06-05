package org.cef.handler;

/**
 * The manner in which a link click should be opened. These constants match
 * their equivalents in Chromium's window_open_disposition.h.
 */
public enum CefWindowOpenDisposition {
    WOD_UNKNOWN,
    WOD_CURRENT_TAB,
    // Indicates that only one tab with the url should exist in the same window.
    WOD_SINGLETON_TAB,
    WOD_NEW_FOREGROUND_TAB,
    WOD_NEW_BACKGROUND_TAB,
    WOD_NEW_POPUP,
    WOD_NEW_WINDOW,
    WOD_SAVE_TO_DISK,
    WOD_OFF_THE_RECORD,
    WOD_IGNORE_ACTION
}
