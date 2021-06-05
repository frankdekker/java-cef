// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.handler;

public class CefPopupFeatures {
    /**
     * The requested x coordinate for the popup window, -1 if not set.
     */
    public int x = -1;
    /**
     * The requested y coordinate for the popup window, -1 if not set.
     */
    public int y = -1;
    /**
     * The requested width of the popup window, -1 if not set.
     */
    public int width = -1;
    /**
     * The requested height of the popup window, -1 if not set.
     */
    public int height = -1;
    public boolean menuBarVisible = false;
    public boolean statusBarVisible = false;
    public boolean toolBarVisible = false;    
    public boolean scrollBarsVisible = false;

    public String toString() {
        return "x: " + x + ", y: " + y + ", " +
               "width: " + width + ", height: " + height + ", " +
               "menubar: " + (menuBarVisible ? "yes" : "no") + ", " +
               "statusbar: " + (statusBarVisible ? "yes" : "no") + ", " +
               "toolbar: " + (toolBarVisible ? "yes" : "no") + ", " +
               "scrollbars: " + (scrollBarsVisible ? "yes" : "no") + ", ";
    }
}