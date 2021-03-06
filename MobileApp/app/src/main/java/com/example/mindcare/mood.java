package com.example.mindcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mood extends AppCompatActivity {

    private TextView excitedNote, boredNote, nervousNote, tiredNote, anxietyNote, frustratedNote, happyNote, sadNote, calmNote;
    private SeekBar seekBarExcited, seekBarBored, seekBarNervous, seekBarTired, seekBarAnxiety, seekBarFrustrated, seekBarHappy, seekBarSad, seekBarCalm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);

        seekBarExcited = findViewById(R.id.seekBarExcited);
        seekBarExcited.setVisibility(View.GONE);
        seekBarExcited.setOnSeekBarChangeListener(seekBarExcitedChangeListener);
        excitedNote = findViewById(R.id.textExcitedNote);
        excitedNote.setVisibility(View.GONE);

        seekBarBored = findViewById(R.id.seekBarBored);
        seekBarBored.setVisibility(View.GONE);
        seekBarBored.setOnSeekBarChangeListener(seekBarBoredChangeListener);
        boredNote = findViewById(R.id.textBoredNote);
        boredNote.setVisibility(View.GONE);

        seekBarNervous = findViewById(R.id.seekBarNervous);
        seekBarNervous.setVisibility(View.GONE);
        seekBarNervous.setOnSeekBarChangeListener(seekBarNervousChangeListener);
        nervousNote = findViewById(R.id.textNervousNote);
        nervousNote.setVisibility(View.GONE);

        seekBarTired = findViewById(R.id.seekBarTired);
        seekBarTired.setVisibility(View.GONE);
        seekBarTired.setOnSeekBarChangeListener(seekBarTiredChangeListener);
        tiredNote = findViewById(R.id.textTiredNote);
        tiredNote.setVisibility(View.GONE);

        seekBarAnxiety = findViewById(R.id.seekBarAnxiety);
        seekBarAnxiety.setVisibility(View.GONE);
        seekBarAnxiety.setOnSeekBarChangeListener(seekBarAnxietyChangeListener);
        anxietyNote = findViewById(R.id.textAnxietyNote);
        anxietyNote.setVisibility(View.GONE);

        seekBarFrustrated = findViewById(R.id.seekBarFrustrated);
        seekBarFrustrated.setVisibility(View.GONE);
        seekBarFrustrated.setOnSeekBarChangeListener(seekBarFrustratedChangeListener);
        frustratedNote = findViewById(R.id.textFrustratedNote);
        frustratedNote.setVisibility(View.GONE);

        seekBarHappy = findViewById(R.id.seekBarHappy);
        seekBarHappy.setVisibility(View.GONE);
        seekBarHappy.setOnSeekBarChangeListener(seekBarHappyChangeListener);
        happyNote = findViewById(R.id.textHappyNote);
        happyNote.setVisibility(View.GONE);

        seekBarSad = findViewById(R.id.seekBarSad);
        seekBarSad.setVisibility(View.GONE);
        seekBarSad.setOnSeekBarChangeListener(seekBarSadChangeListener);
        sadNote = findViewById(R.id.textSadNote);
        sadNote.setVisibility(View.GONE);

        seekBarCalm = findViewById(R.id.seekBarCalm);
        seekBarCalm.setVisibility(View.GONE);
        seekBarCalm.setOnSeekBarChangeListener(seekBarCalmChangeListener);
        calmNote = findViewById(R.id.textCalmNote);
        calmNote.setVisibility(View.GONE);


    }

    SeekBar.OnSeekBarChangeListener seekBarExcitedChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            excitedNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarBoredChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            boredNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarNervousChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            nervousNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarTiredChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            tiredNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarAnxietyChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            anxietyNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarFrustratedChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            frustratedNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarHappyChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            happyNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarSadChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            sadNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarCalmChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            calmNote.setText(progress + "/5");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBoxExcited:
                if (checked) {
                    seekBarExcited.setVisibility(View.VISIBLE);
                    excitedNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarExcited.setVisibility(View.GONE);
                    excitedNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxBored:
                if (checked) {
                    seekBarBored.setVisibility(View.VISIBLE);
                    boredNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarBored.setVisibility(View.GONE);
                    boredNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxNervous:
                if (checked) {
                    seekBarNervous.setVisibility(View.VISIBLE);
                    nervousNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarNervous.setVisibility(View.GONE);
                    nervousNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxTired:
                if (checked) {
                    seekBarTired.setVisibility(View.VISIBLE);
                    tiredNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarTired.setVisibility(View.GONE);
                    tiredNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxAnxiety:
                if (checked) {
                    seekBarAnxiety.setVisibility(View.VISIBLE);
                    anxietyNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarAnxiety.setVisibility(View.GONE);
                    anxietyNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxFrustrated:
                if (checked) {
                    seekBarFrustrated.setVisibility(View.VISIBLE);
                    frustratedNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarFrustrated.setVisibility(View.GONE);
                    frustratedNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxHappy:
                if (checked) {
                    seekBarHappy.setVisibility(View.VISIBLE);
                    happyNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarHappy.setVisibility(View.GONE);
                    happyNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxSad:
                if (checked) {
                    seekBarSad.setVisibility(View.VISIBLE);
                    sadNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarSad.setVisibility(View.GONE);
                    sadNote.setVisibility(View.GONE);
                }
                break;
            case R.id.checkBoxCalm:
                if (checked) {
                    seekBarCalm.setVisibility(View.VISIBLE);
                    calmNote.setVisibility(View.VISIBLE);
                } else {
                    seekBarCalm.setVisibility(View.GONE);
                    calmNote.setVisibility(View.GONE);
                }
                break;

        }
    }


    public void submit (View view) throws JSONException {

        EditText feedbackBody = findViewById(R.id.EditTextFeedbackBody);
        JSONObject userData = new JSONObject();
        userData.put("excited", seekBarExcited.getProgress());
        userData.put("bored", seekBarBored.getProgress());
        userData.put("nervous", seekBarNervous.getProgress());
        userData.put("tired", seekBarTired.getProgress());
        userData.put("anxiety", seekBarAnxiety.getProgress());
        userData.put("frustrated", seekBarFrustrated.getProgress());
        userData.put("happy", seekBarHappy.getProgress());
        userData.put("sad", seekBarSad.getProgress());
        userData.put("calm", seekBarCalm.getProgress());
        userData.put("comment", feedbackBody.getText().toString());
        userData.put("id_user",1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"+"Z");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
        userData.put("time", null);

        //System.out.println(HttpResult);

        URL mainServerUrl;
        String mainServerUrlString = "http://192.168.43.239:8080/mobile_api/moods/";

        HttpURLConnection urlConn;
        try {
            mainServerUrl = new URL(mainServerUrlString);
            urlConn = (HttpURLConnection) mainServerUrl.openConnection();

            urlConn.setRequestMethod("POST");

            byte[] postDataBytes = userData.toString().getBytes("UTF-8");

            urlConn.setRequestMethod("POST");
            urlConn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            urlConn.setDoOutput(true);
            urlConn.setDoInput(true);

            urlConn.getOutputStream().write(postDataBytes);

            int HttpResult = urlConn.getResponseCode();
            //HttpResponse response;
            System.out.println(HttpResult);


            InputStream ip = urlConn.getInputStream();
            BufferedReader br1 = new BufferedReader(new InputStreamReader(ip));
            StringBuilder response = new StringBuilder();
            String responseSingle = null;
            while ((responseSingle = br1.readLine()) != null) {
                response.append(responseSingle);
            }
            String xx = response.toString();
            System.out.println(xx);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(this, Panel.class);
        startActivity(intent);
    }

}