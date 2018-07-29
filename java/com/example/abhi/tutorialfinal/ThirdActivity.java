package com.example.abhi.tutorialfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {


    String Toast="Toast class is used to broadcast any msg on any specific event. It uses static method makeText()"+"\nA toast is a view containing a quick little message for the user. The toast class helps you create and show those.\n" +
            "\n" +
            "When the view is shown to the user, appears as a floating view over the application. It will never receive focus. The user will probably be in the middle of typing something else. The idea is to be as unobtrusive as possible, while still showing the user the information you want them to see. Two examples are the volume control, and the brief message saying that your settings have been saved.\n" +
            "\n" +
            "The easiest way to use this class is to call one of the static methods that constructs everything you need and returns a new Toast object. ";
    String evtHandle="Event Handling can be done through 2 ways: Java and XML"+"\n    Events are a useful way to collect data about a user's interaction with interactive components of Applications. Like button presses or screen touch etc. The Android framework maintains an event queue as first-in, first-out (FIFO) basis. You can capture these events in your program and take appropriate action as per requirements.\n" +
            "\n" +
            "There are following three concepts related to Android Event Management −\n" +
            "\n" +
            "    Event Listeners − An event listener is an interface in the View class that contains a single callback method. These methods will be called by the Android framework when the View to which the listener has been registered is triggered by user interaction with the item in the UI.\n" +
            "\n" +
            "    Event Listeners Registration − Event Registration is the process by which an Event Handler gets registered with an Event Listener so that the handler is called when the Event Listener fires the event.\n" +
            "\n" +
            "    Event Handlers − When an event happens and we have registered an event listener for the event, the event listener calls the Event Handlers, which is the method that actually handles the event.\n";
    String Orientation="There are two types of Orientations in Android: Landscape and Portrait"+"\nThe screen orientation attribute is provided by the activity element in the Android Manifest.Xml file. The orientations provided by the activity are Portrait, Landscape, Sensor, Unspecified and so on. To perform a screen orientation activity you define the properties in the Android Manifest.Xml file.";
    String History="Android Inc. was founded in Palo Alto, California in October 2003 by Andy Rubin, Rich Miner, Nick Sears, and Chris White. " +"\nInitially developed by Android Inc., which Google bought in 2005, Android was unveiled in 2007, along with the founding of the Open Handset Alliance – a consortium of hardware, software, and telecommunication companies devoted to advancing open standards for mobile devices. Beginning with the first commercial Android device in September 2008, the operating system has gone through multiple major releases, with the current version being 7.0 \"Nougat\", released in August 2016. Android applications (\"apps\") can be downloaded from the Google Play store, which features over 2.7 million apps as of February 2017. Android has been the best-selling OS on tablets since 2013, and runs on the vast majority of smartphones. As of May 2017, Android has two billion monthly active users, and it has the largest installed base of any operating system.";
    String LifeCycle="onCreate()->onStart()->onResume()->onPause()->onStop->onDestroy()"+"\n As a user navigates through, out of, and back to your app, the Activity instances in your app transition through different states in their lifecycle. The Activity class provides a number of callbacks that allow the activity to know that a state has changed: that the system is creating, stopping, or resuming an activity, or destroying the process in which the activity resides.\n" +
            "\n" +
            "Within the lifecycle callback methods, you can declare how your activity behaves when the user leaves and re-enters the activity. For example, if you're building a streaming video player, you might pause the video and terminate the network connection when the user switches to another app. When the user returns, you can reconnect to the network and allow the user to resume the video from the same spot. In other words, each callback allows you to perform specific work that's appropriate to a given change of state. Doing the right work at the right time and handling transitions properly make your app more robust and performant. For example, good implementation of the lifecycle callbacks can help ensure that your app avoids:\n" +
            "\n" +
            "    Crashing if the user receives a phone call or switches to another app while using your app.\n" +
            "    Consuming valuable system resources when the user is not actively using it.\n" +
            "    Losing the user's progress if they leave your app and return to it at a later time.\n" +
            "    Crashing or losing the user's progress when the screen rotates between landscape and portrait orientation.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final TextView ttv1 = (TextView) findViewById(R.id.ttv);
        final TextView intv = (TextView) findViewById(R.id.itv);
        final ImageView iv1 = (ImageView) findViewById(R.id.iv);
        Button b = (Button) findViewById(R.id.mm);
        Intent i = getIntent();
        String Check = i.getExtras().getString("Check");
       if(Check.equals("1")){
            intv.setText(History);
            ttv1.setText("History");
            iv1.setImageResource(R.drawable.ah);
       }
       if(Check.equals("2")){
           intv.setText(LifeCycle);
           ttv1.setText("Life Cycle");
           iv1.setImageResource(R.drawable.lc);
       }

       if(Check.equals("3")){
           intv.setText(Orientation);
           ttv1.setText("Orientation");
           iv1.setImageResource(R.drawable.or);
       }

       if(Check.equals("4")){
            intv.setText(Toast);
           ttv1.setText("Toast");
           iv1.setImageResource(R.drawable.t);
       }

       if(Check.equals("5")){
          intv.setText(evtHandle);
           ttv1.setText("Event Handling");
           iv1.setImageResource(R.drawable.eh);
       }

       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(ThirdActivity.this,SecondActivity.class));
           }
       });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
