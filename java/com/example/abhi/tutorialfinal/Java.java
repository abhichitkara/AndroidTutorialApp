package com.example.abhi.tutorialfinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Java extends Fragment {

    String Button = "A user interface element the user can tap or click to perform an action. A button consists of text or an icon (or both text and an icon) that communicates what action occurs when the user touches it." +
            "Different types of Buttons are: Radio,Image,Toggle";
    String Textview="A user interface element that displays text to the user.";
    String Editext="User Editable Text View"+"\nA user interface element for entering and modifying text. When you define an edit text widget, you must specify the TextView_inputType attribute. For example, for plain text input set inputType to text";
    String Checkbox="A checkbox is a specific type of two-states button that can be either checked or unchecked"+"\nCheckboxes allow the user to select one or more options from a set. Typically, you should present each checkbox option in a vertical list.";
    String Viewgroup="A ViewGroup is a special view that can contain other views (called children.) The view group is the base class for layouts and views containers. This class also defines the ViewGroup.LayoutParams class which serves as the base class for layouts parameters. ";
    String Log="API for sending log output.\n" +
            "\n" +
            "Generally, use the Log.v() Log.d() Log.i() Log.w() and Log.e() methods.\n" +
            "\n" +
            "The order in terms of verbosity, from least to most is ERROR, WARN, INFO, DEBUG, VERBOSE. Verbose should never be compiled into an application except during development. Debug logs are compiled in but stripped at runtime. Error, warning and info logs are always kept. ";
    String Dim="\nDenotes that an integer parameter, field or method return value is expected to represent a dimension. ";
    String Listeners="\n An event listener is an interface in the View class that contains a single callback method. These methods will be called by the Android framework when the View to which the listener has been registered is triggered by user interaction with the item in the UI.";
    String MP="Margin indicates a gap between the boundary of UI component, and its neighbour" + "\nPadding is the gap between internal content and boundary";
    String LinearLayout="Linear Layout is a basic layout which arranges the components in horizontal and vertical form(by default horizontal";
    String RelativeLayout=" Relative Layout is also a basic layout which arrange the views with respect to its parent or its neighbours";
    String TableLayout="TableLayout going to be arranged groups of views into rows and columns. You will use the <TableRow> element to build a row in the table. Each row has zero or more cells; each cell can hold one View object.";
    String GridLayout="A layout that places its children in a rectangular grid, The grid is composed of a set of infinitely thin lines that separate the viewing area into cells. Throughout the API, grid lines are referenced by grid indices. ";
    String FrameLayout="FrameLayout will arrange the component in the form of a Stack";
    String Gridview="GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid. The grid items are automatically inserted to the layout using a ListAdapter.";
    String DialogBox="Dialog Box\n" +
            "Date Picker, Time Picker, ALert Dialog, Progress Bar Dialog\n" +
            "\n" +
            "it is a window which is used to show some message or information, or any specific action";
    String AdapterClass="Adapter view is used to showcase multiple results at once\n" +
            "it has 3 types\n" +
            "List View\n" +
            "Grid View\n" +
            "Spinner";
    String ACTV="Auto complete text view helps to show different entries of same initial characters when they're passed in auto complete text view.";
    String lv="Displays a vertically-scrollable collection of views, where each view is positioned immediatelybelow the previous view in the list";
    String spin = "A view that displays one child at a time and lets the user pick among them. The items in the Spinner come from the Adapter associated with this view.";
    String splash="SPLASH ACTIVITY\n" +
            "-its a launcher activity which stays on screen for few seconds and moves to main activity.\n" +
            "-appears only once.\n" +
            "-even if we press back buttton ,it does not appear again.\n" +
            "-so we use finish method inside onStop(). Finish method destroys the activity.\n" +
            "-we use multithreading.\n" +
            "-we use sleep, so as to delay the launch of main activity.";
    String br = "\n" +
            "BROADCAST RECEIVER\n" +
            "-is a basic component which responds to broadcast message by the system.\n" +
            "-eg reboot, calling, charger plug in and out, Bluetooth.\n" +
            "-Implementing broadcast:\n" +
            "   create a broadcast\n" +
            "   register a broadcast";
    String intent ="An Intent provides a facility for performing late runtime binding between the code in different applications. Its most significant use is in the launching of activities, where it can be thought of as the glue between activities. It is basically a passive data structure holding an abstract description of an action to be performed.";
    String frag = "The Fragment class can be used many ways to achieve a wide variety of results. In its core, it represents a particular operation or interface that is running within a larger Activity. A Fragment is closely tied to the Activity it is in, and can not be used apart from one. Though Fragment defines its own lifecycle, that lifecycle is dependent on its activity: if the activity is stopped, no fragments inside of it can be started; when the activity is destroyed, all fragments will be destroyed. ";
    String Sl = "Applications use these classes to manage private databases. If creating a content provider, you will probably have to use these classes to create and manage your own database to store content.";
    String cp = "Content providers can help an application manage access to data stored by itself, stored by other apps, and provide a way to share data with other apps. They encapsulate the data, and provide mechanisms for defining data security. Content providers are the standard interface that connects data in one process with code running in another process.";


    TextView tv;
    ImageView iv;
    public Java() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_java, container, false);
         iv = (ImageView) v.findViewById(R.id.jiv);
         tv = (TextView) v.findViewById(R.id.jtv);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        SharedPreferences sp = getActivity().getSharedPreferences("my_sp", Context.MODE_PRIVATE);
        String dat = sp.getString("check",null);
        if(dat.equals("6")){
            iv.setImageResource(R.drawable.bj1);
            tv.setText(Button);
        }
        if(dat.equals("7")){
            iv.setImageResource(R.drawable.tj1);
            tv.setText(Textview);
        }
        if(dat.equals("8")){
            iv.setImageResource(R.drawable.edj);
            tv.setText(Editext);
        }
        if(dat.equals("9")){
            iv.setImageResource(R.drawable.cj1);
            tv.setText(Checkbox);
        }
        if(dat.equals("10")){
            iv.setImageResource(R.drawable.vgj);
            tv.setText(Viewgroup);
        }
        if(dat.equals("11")){
            iv.setImageResource(R.drawable.lj);
            tv.setText(Log);
        }
        if(dat.equals("12")){
            iv.setImageResource(R.drawable.dj);
            tv.setText(Dim);
        }
        if(dat.equals("13")){
            iv.setImageResource(R.drawable.lsj);
            tv.setText(Listeners);
        }
        if(dat.equals("14")){
            iv.setImageResource(R.drawable.mj);
            tv.setText(MP);
        }
        if(dat.equals("15")){
            iv.setImageResource(R.drawable.llj);
            tv.setText(LinearLayout);
        }
        if(dat.equals("16")){
            iv.setImageResource(R.drawable.rlj);
            tv.setText(RelativeLayout);
        }
        if(dat.equals("17")){
            iv.setImageResource(R.drawable.ttj);
            tv.setText(TableLayout);
        }
        if(dat.equals("18")){
            iv.setImageResource(R.drawable.glj);
            tv.setText(GridLayout);
        }
        if(dat.equals("19")){
            iv.setImageResource(R.drawable.flj);
            tv.setText(FrameLayout);
        }
        if(dat.equals("20")){
            iv.setImageResource(R.drawable.gvj1);
            tv.setText(Gridview);
        }
        if(dat.equals("21")){
            iv.setImageResource(R.drawable.dj1);
            tv.setText(DialogBox);
        }
        if(dat.equals("22")){
            iv.setImageResource(R.drawable.avj);
            tv.setText(AdapterClass);
        }
        if(dat.equals("23")){
            iv.setImageResource(R.drawable.actvj);
            tv.setText(ACTV);
        }
        if(dat.equals("24")){
            iv.setImageResource(R.drawable.lvj);
            tv.setText(lv);
        }
        if(dat.equals("25")){
            iv.setImageResource(R.drawable.spj);
            tv.setText(spin);
        }
        if(dat.equals("26")){
            iv.setImageResource(R.drawable.splj);
            tv.setText(splash);
        }
        if(dat.equals("27")){
            iv.setImageResource(R.drawable.brj);
            tv.setText(br);
        }
        if(dat.equals("28")){
            iv.setImageResource(R.drawable.inj);
            tv.setText(intent);
        }
        if(dat.equals("29")){
            iv.setImageResource(R.drawable.frj);
            tv.setText(frag);
        }
        if(dat.equals("30")){
            iv.setImageResource(R.drawable.sqlj);
            tv.setText(Sl);
        }
        if(dat.equals("31")){
            iv.setImageResource(R.drawable.cpj);
            tv.setText(cp);
        }

    }
}