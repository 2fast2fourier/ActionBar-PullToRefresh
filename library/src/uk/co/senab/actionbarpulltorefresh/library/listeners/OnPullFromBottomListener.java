package uk.co.senab.actionbarpulltorefresh.library.listeners;

import android.view.View;

/**
 * Created by matthewshepard on 2/9/14.
 */
public interface OnPullFromBottomListener {
    /**
     * Called when the user has initiated a refresh by pulling up.
     *
     * @param view
     *            - View which the user has started the refresh from.
     */
    public void onPullFromBottom(View view);
}
