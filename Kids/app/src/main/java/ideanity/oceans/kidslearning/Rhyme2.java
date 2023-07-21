package ideanity.oceans.kidslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Rhyme2 extends AppCompatActivity {
    static MediaPlayer twinkle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhyme2);
    }
    public void play(View v){
        if(twinkle==null){
            twinkle = MediaPlayer.create(Rhyme2.this, R.raw.twinkle);
        }
        twinkle.start();
    }
    public void pause(View v){
        if(twinkle!=null){
            twinkle.pause();
        }
    }
    public void stop(View v){
        stopplayer();
    }
    private  void stopplayer(){
        if(twinkle!=null){
            twinkle.release();
            twinkle=null;
            Toast.makeText(this,"Mediaplayer released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onstop(){
        super.onStop();
        stopplayer();
    }
}

