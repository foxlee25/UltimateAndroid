package com.marshalchen.ua.common.commonUtils.moduleUtils;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.marshalchen.ua.common.commonUtils.logUtils.Logs;

/**
 * A webview which can open url by itself and can show some error message when receive error
 */

public class SampleWebViewClient extends WebViewClient {



    String showErrorString = "<html><body><h1>" + "Network error" + "</h1></body></html>";


    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);    //To change body of overridden methods use File | Settings | File Templates.
    }


    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);

        view.loadDataWithBaseURL("", showErrorString, "text/html", "utf-8", null);
    }

    public String getShowErrorString() {
        return showErrorString;
    }

    public void setShowErrorString(String showErrorString) {
        this.showErrorString = showErrorString;
    }

}
