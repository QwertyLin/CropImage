package q.util.cropimage;

import java.io.File;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainA extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri uri = Uri.fromFile(new File("/sdcard/DCIM/test.jpg"));
        System.out.println(uri);
        Intent intent = new Intent(this, com.android.camera.CropImage.class);
        intent.setData(uri);
        startActivity(intent);
    }

}
