package in.edu.ptuniv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button frag=findViewById(R.id.buttonfrag);
        frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutFragment aboutFragment=new aboutFragment();
                FragmentManager manager=getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.frame,aboutFragment.class,null).commit();

            }
        });

    }
}