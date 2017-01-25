package lalinw.washington.edu.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import static lalinw.washington.edu.lifecounter.R.id.p3add1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int count;
    private int p1pts;
    private int p2pts;
    private int p3pts;
    private int p4pts;


    private static final String STATE_COUNTER = "counter";
    private int mCounter;

    Button p1add1, p2add1, p3add1, p4add1,
            p1minus1, p2minus1, p3minus1, p4minus1,
            p1add5, p2add5, p3add5, p4add5,
            p1minus5, p2minus5, p3minus5, p4minus5;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Make sure to call the super method so that the states of our views are saved
        super.onSaveInstanceState(outState);
        // Save our own state now
        outState.putInt(STATE_COUNTER, mCounter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mCounter = savedInstanceState.getInt(STATE_COUNTER, 0);
        }
        setContentView(R.layout.activity_main);

        p1add1 = (Button) findViewById(R.id.p1add1);
        p1add1.setOnClickListener(this);
        p2add1 = (Button) findViewById(R.id.p2add1);
        p2add1.setOnClickListener(this);
        p3add1 = (Button) findViewById(R.id.p3add1);
        p3add1.setOnClickListener(this);
        p4add1 = (Button) findViewById(R.id.p4add1);
        p4add1.setOnClickListener(this);

        p1minus1 = (Button) findViewById(R.id.p1minus1);
        p1minus1.setOnClickListener(this);
        p2minus1 = (Button) findViewById(R.id.p2minus1);
        p2minus1.setOnClickListener(this);
        p3minus1 = (Button) findViewById(R.id.p3minus1);
        p3minus1.setOnClickListener(this);
        p4minus1 = (Button) findViewById(R.id.p4minus1);
        p4minus1.setOnClickListener(this);

        p1add5 = (Button) findViewById(R.id.p1add5);
        p1add5.setOnClickListener(this);
        p2add5 = (Button) findViewById(R.id.p2add5);
        p2add5.setOnClickListener(this);
        p3add5 = (Button) findViewById(R.id.p3add5);
        p3add5.setOnClickListener(this);
        p4add5 = (Button) findViewById(R.id.p4add5);
        p4add5.setOnClickListener(this);

        p1minus5 = (Button) findViewById(R.id.p1minus5);
        p1minus5.setOnClickListener(this);
        p2minus5 = (Button) findViewById(R.id.p2minus5);
        p2minus5.setOnClickListener(this);
        p3minus5 = (Button) findViewById(R.id.p3minus5);
        p3minus5.setOnClickListener(this);
        p4minus5 = (Button) findViewById(R.id.p4minus5);
        p4minus5.setOnClickListener(this);

    }

    public void onClick(View v) {
        // Perform action on click
        TextView status = (TextView) findViewById(R.id.status);

        //Checks status of each player
        TextView ptsp1 = (TextView) findViewById(R.id.ptsp1);
        int p1p = Integer.valueOf(ptsp1.getText().toString());
        TextView ptsp2 = (TextView) findViewById(R.id.ptsp2);
        int p2p = Integer.valueOf(ptsp2.getText().toString());
        TextView ptsp3 = (TextView) findViewById(R.id.ptsp3);
        int p3p = Integer.valueOf(ptsp3.getText().toString());
        TextView ptsp4 = (TextView) findViewById(R.id.ptsp4);
        int p4p = Integer.valueOf(ptsp4.getText().toString());


        switch(v.getId()) {
            //add 1
            case (R.id.p1add1):
                ptsp1.setText("" + (p1p + 1));
                break;
            case (R.id.p2add1):
                ptsp2.setText("" + (p2p + 1));
                break;
            case (R.id.p3add1):
                ptsp3.setText("" + (p3p + 1));
                break;
            case (R.id.p4add1):
                ptsp4.setText("" + (p4p + 1));
                break;

            //minus 1
            case (R.id.p1minus1):
                ptsp1.setText("" + (p1p - 1));
                if (p1p - 1 <= 0) {
                    status.setText("Player 1 LOSES!");
                }
                break;
            case (R.id.p2minus1):
                ptsp2.setText("" + (p2p - 1));
                if (p2p - 1 <= 0) {
                    status.setText("Player 2 LOSES!");
                }
                break;
            case (R.id.p3minus1):
                ptsp3.setText("" + (p3p - 1));
                if (p3p - 1 <= 0) {
                    status.setText("Player 3 LOSES!");
                }
                break;
            case (R.id.p4minus1):
                ptsp4.setText("" + (p4p - 1));
                if (p4p - 1 <= 0) {
                    status.setText("Player 4 LOSES!");
                }
                break;

            //add 5
            case (R.id.p1add5):
                ptsp1.setText("" + (p1p + 5));
                break;
            case (R.id.p2add5):
                ptsp2.setText("" + (p2p + 5));
                break;
            case (R.id.p3add5):
                ptsp3.setText("" + (p3p + 5));
                break;
            case (R.id.p4add5):
                ptsp4.setText("" + (p4p + 5));
                break;

            //minus 5
            case (R.id.p1minus5):
                ptsp1.setText("" + (p1p - 5));
                if (p1p - 5 <= 0) {
                    status.setText("Player 1 LOSES!");
                }
                break;
            case (R.id.p2minus5):
                ptsp2.setText("" + (p2p - 5));
                if (p2p - 5 <= 0) {
                    status.setText("Player 2 LOSES!");
                }
                break;
            case (R.id.p3minus5):
                ptsp3.setText("" + (p3p - 5));
                if (p3p - 5 <= 0) {
                    status.setText("Player 3 LOSES!");
                }
                break;
            case (R.id.p4minus5):
                ptsp4.setText("" + (p4p - 5));
                if (p4p - 5 <= 0) {
                    status.setText("Player 4 LOSES!");
                }
                break;
        }
    }
}
