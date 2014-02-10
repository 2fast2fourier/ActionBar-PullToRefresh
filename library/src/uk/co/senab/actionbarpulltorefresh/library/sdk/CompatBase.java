package uk.co.senab.actionbarpulltorefresh.library.sdk;

import android.view.View;

class CompatBase {

    static void setAlpha(View view, float alpha) {
        // NO-OP
    }

    static void postOnAnimation(View view, Runnable runnable) {
        view.postDelayed(runnable, 10l);
    }

    public static boolean canScrollVertically(View view, int direction) {
        //TODO not implemented yet
        return false;
    }
}
