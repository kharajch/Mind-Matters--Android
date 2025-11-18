package com.example.mindmatters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the WebView by its ID from the layout file
        val myWebView: WebView = findViewById(R.id.webView)

        // This ensures that links within your HTML file open in the WebView
        myWebView.webViewClient = WebViewClient()

        // Enable JavaScript if your local HTML uses it
        myWebView.settings.javaScriptEnabled = true

        // Load the local HTML file from the assets folder
        // This is the key line for loading an offline file!
        myWebView.loadUrl("file:///android_asset/index.html")
    }
}