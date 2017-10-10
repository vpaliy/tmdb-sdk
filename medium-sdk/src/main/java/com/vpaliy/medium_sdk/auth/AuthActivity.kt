package com.vpaliy.medium_sdk.auth

import android.annotation.SuppressLint
import android.net.http.SslError
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import com.vpaliy.medium_sdk.R
import kotlinx.android.synthetic.main.auth_layout.*
import android.webkit.*
import com.vpaliy.medium_sdk.Constants


class AuthActivity:AppCompatActivity(){

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.auth_layout)
        val url=intent.getStringExtra(Constants.EXTRA_URL)
        web.settings.javaScriptEnabled=true
        web.addJavascriptInterface(JSInterface(),"appObj")
        web.webViewClient=WebClient()
        web.loadUrl(url)
    }

    inner class JSInterface {
        @JavascriptInterface
        fun onCodeReceived(code: String, state: String) {
            finish()
        }

        @JavascriptInterface
        fun onAccessDenied() {
            finish()
        }
    }

    class WebClient:WebViewClient(){
        override fun onReceivedError(view: WebView?, request: WebResourceRequest?, error: WebResourceError?) {
            super.onReceivedError(view, request, error)
            handleError()
        }

        override fun onReceivedHttpError(view: WebView?, request: WebResourceRequest?, errorResponse: WebResourceResponse?) {
            super.onReceivedHttpError(view, request, errorResponse)
            handleError()
        }

        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            super.onReceivedSslError(view, handler, error)
            handleError()
        }

        private fun handleError(){
            //TODO implementation
        }
    }
}