package uk.co.senab.actionbarpulltorefresh.library.sdk;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

class CompatV14 {

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    public static boolean canScrollVertically(View view, int direction) {
        return view.canScrollVertically(direction);
    }
}
