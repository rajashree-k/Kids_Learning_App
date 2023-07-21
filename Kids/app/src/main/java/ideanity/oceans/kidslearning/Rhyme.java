package ideanity.oceans.kidslearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Rhyme extends AppCompatActivity {

    static MediaPlayer baaba;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhyme);
    }
        public void play(View v){
            if(baaba==null){
                baaba = MediaPlayer.create(Rhyme.this, R.raw.baaba);
            }
            baaba.start();
        }
        public void pause(View v){
        if(baaba!=null){
                baaba.pause();
        }
        }
        public void stop(View v){
        stopplayer();
        }
        private  void stopplayer(){
            if(baaba!=null){
                baaba.release();
                baaba=null;
                Toast.makeText(this,"Mediaplayer released", Toast.LENGTH_SHORT).show();
            }
        }

        protected void onstop(){
        super.onStop();
        stopplayer();
        }
    }
