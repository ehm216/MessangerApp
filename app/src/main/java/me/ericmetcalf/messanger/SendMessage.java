package me.ericmetcalf.messanger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;


public class SendMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
    }

    //claiming the method when the button is pressed
    public void onSendMessage(View view){
        Intent intent = new Intent(this, RecieveMessageActivity.class);
        startActivity(intent);

    }

}

