package br.com.trinopolo.appfile1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        try {

            InputStream image = getAssets().open("autocad_image1.png");

            Bitmap b = BitmapFactory.decodeStream(image);

            imageView.setImageBitmap(b);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
