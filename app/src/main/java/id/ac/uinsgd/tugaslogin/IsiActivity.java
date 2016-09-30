package id.ac.uinsgd.tugaslogin;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IsiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);
        WebView Webview = (WebView) findViewById(R.id.webView);

        if(this.getIntent().getDataString().equals("1"))
        {
            Webview.setVisibility(View.GONE);
        }
        else
        {

            Webview.getSettings().setJavaScriptEnabled(true);
            Webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            Webview.getSettings().setSupportMultipleWindows(true);
            Webview.setWebViewClient(new myWebClient());


            Webview.loadUrl(this.getIntent().getDataString());

        }

    }


    public class myWebClient extends WebViewClient {


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {

            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            return true;

        }
    }
}
