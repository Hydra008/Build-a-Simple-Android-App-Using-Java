package com.teamtreehouse;

public class TreehouseActivity extends Activity {

  public static final String TAG = TreehouseActivity.class.getSimpleName();

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_treehouse);
    Log.d(TAG,"Activity Created!");
    
  }
}
