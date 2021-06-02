package br.com.appvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoVi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

         videoVi = findViewById(R.id.video_view);

        //Esconde a status bar e barra de navegacao
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        //esconde a action bar
        getSupportActionBar().hide();

        //executar o video
        videoVi.setMediaController(new MediaController(this));
        videoVi.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoVi.start();
    }
}