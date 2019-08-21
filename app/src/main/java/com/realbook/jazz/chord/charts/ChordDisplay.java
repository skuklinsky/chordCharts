package com.realbook.jazz.chord.charts;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ChordDisplay extends AppCompatActivity {

    int width;
    int height;
    String musicalKey;
    int titleAndAuthorHeight;
    int leftMarginSize;
    int rightMarginSize;
    int numLines;
    int lineHeight;
    int lineTopAndBottomMargins;
    int chordFontSize;

    Guideline A;
    Guideline B;
    Guideline C;
    Guideline D;
    Guideline E;
    Guideline F;
    Guideline G;
    Guideline H;
    Guideline I;
    Guideline J;
    Guideline K;
    Guideline L;
    Guideline M;
    Guideline N;
    Guideline O;
    Guideline P;
    Guideline Q;
    Guideline r;
    Guideline S;
    Guideline T;
    Guideline U;
    Guideline V;
    Guideline W;
    Guideline X;
    Guideline Y;
    Guideline Z;
    Guideline AA;
    Guideline AB;
    Guideline AC;
    Guideline AD;
    Guideline AE;
    Guideline AF;
    Guideline AG;
    Guideline AH;
    Guideline AI;
    Guideline AJ;
    Guideline AK;
    Guideline AL;
    Guideline AM;
    Guideline AN;
    Guideline AO;
    Guideline AP;
    Guideline AQ;
    Guideline AR;
    Guideline AS;

    int guidelineMarginA;
    int guidelineMarginB;
    int guidelineMarginC;
    int guidelineMarginD;
    int guidelineMarginE;
    int guidelineMarginF;
    int guidelineMarginG;
    int guidelineMarginH;
    int guidelineMarginI;
    int guidelineMarginJ;
    int guidelineMarginK;
    int guidelineMarginL;
    int guidelineMarginM;
    int guidelineMarginN;
    int guidelineMarginO;
    int guidelineMarginP;
    int guidelineMarginQ;
    int guidelineMarginR;
    int guidelineMarginS;
    int guidelineMarginT;
    int guidelineMarginU;
    int guidelineMarginV;
    int guidelineMarginW;
    int guidelineMarginX;
    int guidelineMarginY;
    int guidelineMarginZ;
    int guidelineMarginAA;
    int guidelineMarginAB;
    int guidelineMarginAC;
    int guidelineMarginAD;
    int guidelineMarginAE;
    int guidelineMarginAF;
    int guidelineMarginAG;
    int guidelineMarginAH;
    int guidelineMarginAI;
    int guidelineMarginAJ;
    int guidelineMarginAK;
    int guidelineMarginAL;
    int guidelineMarginAM;
    int guidelineMarginAN;
    int guidelineMarginAO;
    int guidelineMarginAP;
    int guidelineMarginAQ;
    int guidelineMarginAR;
    int guidelineMarginAS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord_display);

        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().setCustomView(R.layout.chord_display_banner);

        String title = getIntent().getStringExtra("title");
        ArrayList<String> list = getIntent().getStringArrayListExtra("list");

        width = getScreenWidthInPixels();
        height = getScreenHeightInPixels() - getStatusBarHeight();
        numLines = list.size() - 2;
        musicalKey = list.get(1);

        guidelineMarginAQ = 0;
        guidelineMarginAR = 0;
        guidelineMarginAS = width;

        guidelineMarginA = (int) width * 3 / 64;
        guidelineMarginB = guidelineMarginA + (int) ((double)width * 3.7 / 64);
        guidelineMarginC = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 2);
        guidelineMarginD = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 3);
        guidelineMarginE = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 4);
        guidelineMarginF = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 5);
        guidelineMarginG = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 6);
        guidelineMarginH = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 7);
        guidelineMarginI = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 8);
        guidelineMarginJ = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 9);
        guidelineMarginK = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 10);
        guidelineMarginL = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 11);
        guidelineMarginM = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 12);
        guidelineMarginN = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 13);
        guidelineMarginO = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 14);
        guidelineMarginP = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 15);
        guidelineMarginQ = guidelineMarginA + (int) ((double)width * 3.7 / 64 * 16);

        guidelineMarginR = (int) width * 4 / 64;
        guidelineMarginS = (int) width * 7 / 64;

        if(numLines <= 6) {
            lineHeight = (int) width * 8 / 64;
            guidelineMarginU = (int) width * 9 / 64;

            guidelineMarginW = guidelineMarginU + (int) (width * 12 / 64);
            guidelineMarginY = guidelineMarginU + (int) (width * 12 / 64 * 2);
            guidelineMarginAA = guidelineMarginU + (int) (width * 12 / 64 * 3);
            guidelineMarginAC = guidelineMarginU + (int) (width * 12 / 64 * 4);
            guidelineMarginAE = guidelineMarginU + (int) (width * 12 / 64 * 5);

            guidelineMarginV = guidelineMarginU + (int) (width * 8 / 64);

            guidelineMarginX = guidelineMarginV + (int) (width * 12 / 64);
            guidelineMarginZ = guidelineMarginV + (int) (width * 12 / 64 * 2);
            guidelineMarginAB = guidelineMarginV + (int) (width * 12 / 64 * 3);
            guidelineMarginAD = guidelineMarginV + (int) (width * 12 / 64 * 4);
            guidelineMarginAF = guidelineMarginV + (int) (width * 12 / 64 * 5);
        }

        else {
            lineHeight = (int) ((height - guidelineMarginS) / numLines * 2 / 3);
            guidelineMarginU = guidelineMarginS + (int) (lineHeight / 4);

            guidelineMarginW = guidelineMarginU + (int) (lineHeight * 3 / 2);
            guidelineMarginY = guidelineMarginU + (int) (lineHeight * 3 / 2 * 2);
            guidelineMarginAA = guidelineMarginU + (int) (lineHeight * 3 / 2 * 3);
            guidelineMarginAC = guidelineMarginU + (int) (lineHeight * 3 / 2 * 4);
            guidelineMarginAE = guidelineMarginU + (int) (lineHeight * 3 / 2 * 5);
            guidelineMarginAG = guidelineMarginU + (int) (lineHeight * 3 / 2 * 6);
            guidelineMarginAI = guidelineMarginU + (int) (lineHeight * 3 / 2 * 7);
            guidelineMarginAK = guidelineMarginU + (int) (lineHeight * 3 / 2 * 8);
            guidelineMarginAM = guidelineMarginU + (int) (lineHeight * 3 / 2 * 9);
            guidelineMarginAO = guidelineMarginU + (int) (lineHeight * 3 / 2 * 10);

            guidelineMarginV = guidelineMarginU + lineHeight;

            guidelineMarginX = guidelineMarginV + (int) (lineHeight * 3 / 2);
            guidelineMarginZ = guidelineMarginV + (int) (lineHeight * 3 / 2 * 2);
            guidelineMarginAB = guidelineMarginV + (int) (lineHeight * 3 / 2 * 3);
            guidelineMarginAD = guidelineMarginV + (int) (lineHeight * 3 / 2 * 4);
            guidelineMarginAF = guidelineMarginV + (int) (lineHeight * 3 / 2 * 5);
            guidelineMarginAH = guidelineMarginV + (int) (lineHeight * 3 / 2 * 6);
            guidelineMarginAJ = guidelineMarginV + (int) (lineHeight * 3 / 2 * 7);
            guidelineMarginAL = guidelineMarginV + (int) (lineHeight * 3 / 2 * 8);
            guidelineMarginAN = guidelineMarginV + (int) (lineHeight * 3 / 2 * 9);
            guidelineMarginAP = guidelineMarginV + (int) (lineHeight * 3 / 2 * 10);

        }

        guidelineMarginT = (int) ((guidelineMarginU + guidelineMarginV) / 2);

        A = findViewById(R.id.A);
        A.setGuidelineBegin(guidelineMarginA);
        B = findViewById(R.id.B);
        B.setGuidelineBegin(guidelineMarginB);
        C = findViewById(R.id.C);
        C.setGuidelineBegin(guidelineMarginC);
        D = findViewById(R.id.D);
        D.setGuidelineBegin(guidelineMarginD);
        E = findViewById(R.id.E);
        E.setGuidelineBegin(guidelineMarginE);
        F = findViewById(R.id.F);
        F.setGuidelineBegin(guidelineMarginF);
        G = findViewById(R.id.G);
        G.setGuidelineBegin(guidelineMarginG);
        H = findViewById(R.id.H);
        H.setGuidelineBegin(guidelineMarginH);
        I = findViewById(R.id.I);
        I.setGuidelineBegin(guidelineMarginI);
        J = findViewById(R.id.J);
        J.setGuidelineBegin(guidelineMarginJ);
        K = findViewById(R.id.K);
        K.setGuidelineBegin(guidelineMarginK);
        L = findViewById(R.id.L);
        L.setGuidelineBegin(guidelineMarginL);
        M = findViewById(R.id.M);
        M.setGuidelineBegin(guidelineMarginM);
        N = findViewById(R.id.N);
        N.setGuidelineBegin(guidelineMarginN);
        O = findViewById(R.id.O);
        O.setGuidelineBegin(guidelineMarginO);
        P = findViewById(R.id.P);
        P.setGuidelineBegin(guidelineMarginP);
        Q = findViewById(R.id.Q);
        Q.setGuidelineBegin(guidelineMarginQ);

        r = findViewById(R.id.R);
        r.setGuidelineBegin(guidelineMarginR);
        S = findViewById(R.id.S);
        S.setGuidelineBegin(guidelineMarginS);

        U = findViewById(R.id.U);
        U.setGuidelineBegin(guidelineMarginU);
        V = findViewById(R.id.V);
        V.setGuidelineBegin(guidelineMarginV);
        X = findViewById(R.id.X);
        X.setGuidelineBegin(guidelineMarginX);
        Y = findViewById(R.id.Y);
        Y.setGuidelineBegin(guidelineMarginY);
        Z = findViewById(R.id.Z);
        Z.setGuidelineBegin(guidelineMarginZ);
        AA = findViewById(R.id.AA);
        AA.setGuidelineBegin(guidelineMarginAA);
        AB = findViewById(R.id.AB);
        AB.setGuidelineBegin(guidelineMarginAB);
        AC = findViewById(R.id.AC);
        AC.setGuidelineBegin(guidelineMarginAC);
        AD = findViewById(R.id.AD);
        AD.setGuidelineBegin(guidelineMarginAD);
        AE = findViewById(R.id.AE);
        AE.setGuidelineBegin(guidelineMarginAE);
        AF = findViewById(R.id.AF);
        AF.setGuidelineBegin(guidelineMarginAF);
        AG = findViewById(R.id.AG);
        AG.setGuidelineBegin(guidelineMarginAG);
        AH = findViewById(R.id.AH);
        AH.setGuidelineBegin(guidelineMarginAH);
        AI = findViewById(R.id.AI);
        AI.setGuidelineBegin(guidelineMarginAI);
        AJ = findViewById(R.id.AJ);
        AJ.setGuidelineBegin(guidelineMarginAJ);
        AK = findViewById(R.id.AK);
        AK.setGuidelineBegin(guidelineMarginAK);
        AL = findViewById(R.id.AL);
        AL.setGuidelineBegin(guidelineMarginAL);
        AM = findViewById(R.id.AM);
        AM.setGuidelineBegin(guidelineMarginAM);
        AN = findViewById(R.id.AN);
        AN.setGuidelineBegin(guidelineMarginAN);
        AO = findViewById(R.id.AO);
        AO.setGuidelineBegin(guidelineMarginAO);
        AP = findViewById(R.id.AP);
        AP.setGuidelineBegin(guidelineMarginAP);
        AQ = findViewById(R.id.AQ);
        AQ.setGuidelineBegin(guidelineMarginAQ);
        AR = findViewById(R.id.AR);
        AR.setGuidelineBegin(guidelineMarginAR);
        AS = findViewById(R.id.AS);
        AS.setGuidelineBegin(guidelineMarginAS);

        T = findViewById(R.id.T);
        T.setGuidelineBegin(guidelineMarginT);

        drawTextFromGuidelines(r, AQ, AR, AS, title, (guidelineMarginR - guidelineMarginAR), true);
        drawTextFromGuidelines(S, AQ, r, AS, list.get(0), (guidelineMarginS - guidelineMarginR),false);
/*
        TextView titleDisplay = findViewById(R.id.titleDisplay);
        titleDisplay.setText(title);
        titleDisplay.setTextSize(17);
        titleDisplay.setTextColor(Color.parseColor("#000000"));

        TextView authorDisplay = findViewById(R.id.authorDisplay);
        authorDisplay.setText(list.get(0));
        authorDisplay.setTextSize(13);
        authorDisplay.setTextColor(Color.parseColor("#000000"));
*/
        Guideline[] lowerGuidelines = {V, X, Z, AB, AD, AF, AH, AJ, AL, AN, AP};
        Guideline[] leftGuidelines = {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q};

        for(int i = 1; i < numLines + 1; i++) {
            drawLine(list.get(i+1), i, lowerGuidelines, leftGuidelines);
        }


    }

    private static int getPixelsFromDP(int dp, Context applicationContext) {
        float d = applicationContext.getResources().getDisplayMetrics().density;
        int result = (int)(dp * d); // margin in pixels
        return result;
    }

    public static int getScreenHeightInDPs(Context context){
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(dm);
        int heightInDP = Math.round(dm.heightPixels / dm.density);
        return heightInDP;
    }

    public static int getScreenWidthInDPs(Context context){
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(dm);
        int widthInDP = Math.round(dm.widthPixels / dm.density);
        return widthInDP;
    }

    public int getScreenHeightInPixels(){
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) getApplicationContext().getSystemService(WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    public int getScreenWidthInPixels(){
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) getApplicationContext().getSystemService(WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public void drawBarFromGuidelines(Guideline lowerGuideline, Guideline leftGuideline) {
        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView barDisplay= new TextView(getApplicationContext());
        barDisplay.setTextSize(TypedValue.COMPLEX_UNIT_PX, lineHeight);
        barDisplay.setText(Character.toString((char) 0xff5c));
        barDisplay.setTextColor(Color.parseColor("#000000"));
        barDisplay.setBackgroundColor(Color.GREEN);

        params.leftToRight = leftGuideline.getId();
        params.bottomToTop = lowerGuideline.getId();
        barDisplay.setLayoutParams(params);
        constraintLayout.addView(barDisplay);
    }

    public void drawTextFromGuidelines(Guideline lowerGuideline, Guideline leftGuideline, Guideline
                                   upperGuideline, Guideline rightGuideline, String text, int height,
                                       boolean bold) {
        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);

        TextView display= new TextView(getApplicationContext());
        display.setTextSize(TypedValue.COMPLEX_UNIT_PX, height);
        display.setText(text);
        display.setTextColor(Color.parseColor("#000000"));
        if(bold) {
            display.setTypeface(null, Typeface.BOLD);
        }
        display.setGravity(Gravity.CENTER);
        display.setBackgroundColor(Color.RED);

        params.leftToRight = leftGuideline.getId();
        params.rightToLeft = rightGuideline.getId();
        params.bottomToTop = lowerGuideline.getId();
        params.topToBottom = upperGuideline.getId();

        display.setLayoutParams(params);
        constraintLayout.addView(display);
    }

    public void drawBarsFromGuidelines(Guideline[] lowerGuidelines, Guideline[] leftGuidelines) {
        if(lowerGuidelines.length != leftGuidelines.length) {
            System.out.println("error");
        }
        for(int i = 0; i < lowerGuidelines.length; i++) {
            drawBarFromGuidelines(lowerGuidelines[i], leftGuidelines[i]);
        }
    }

    //linenumbers starting at 1
    public void drawLine(String line, int lineNumber, Guideline[] lowerBarGuidelines, Guideline[] leftGuidelines) {
        String delim = "[|]";
        String[] stringBars = line.split(delim);
        Bar[] bars = new Bar[stringBars.length];
        for (int j = 0; j < bars.length; j++) {
            bars[j] = new Bar(stringBars[j]);
        }

        Guideline lowerGuideline = lowerBarGuidelines[lineNumber - 1];

        if(bars.length >= 4) {
            Guideline[] leftGuidelineArray = {leftGuidelines[0], leftGuidelines[4], leftGuidelines[8],
                    leftGuidelines[12], leftGuidelines[16]};
            Guideline[] lowerGuidelineArray = {lowerGuideline, lowerGuideline, lowerGuideline,
            lowerGuideline, lowerGuideline};
            drawBarsFromGuidelines(lowerGuidelineArray, leftGuidelineArray);
        }

        if(bars.length == 8) {
            Guideline[] lowerGuidelinesArray = {lowerGuideline, lowerGuideline, lowerGuideline, lowerGuideline};
            Guideline[] leftGuidelineArray = {leftGuidelines[2], leftGuidelines[6], leftGuidelines[10],
                    leftGuidelines[14]};
            drawBarsFromGuidelines(lowerGuidelinesArray, leftGuidelineArray);
        }

        for(int i = 0; i < bars.length; i++) {
            if(bars[i].fourFour) {
                //drawTextFromGuidelines(T, AQ, U, A, "4", (int)((guidelineMarginT - guidelineMarginU) * 0.8),
               //         true);
                //drawTextFromGuidelines(V, AQ, T, A, "4", (int)((guidelineMarginV - guidelineMarginT) * 0.8),
                //        true);
                drawTextFromGuidelines(V, AQ, U, A, "-", (int)((guidelineMarginV - guidelineMarginU) * 0.8),
                        false);
            }
        }
    }


}

/*
        lineHeight = (height - titleAndAuthorHeight) / numLines * 2 / 3;
        lineTopAndBottomMargins = lineHeight / 4;
        chordFontSize = lineHeight * 2 / 3;

        LinearLayout verticalBarLayout = findViewById(R.id.verticalBarLayout);
        LinearLayout.LayoutParams verticalParams = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        verticalParams.setMargins(getPixelsFromDP(leftMarginSize, getApplicationContext()),
                getPixelsFromDP(lineTopAndBottomMargins,getApplicationContext()), 0,
                getPixelsFromDP(lineTopAndBottomMargins, getApplicationContext()));

        LinearLayout[] horizontalBarLayouts = new LinearLayout[numLines];
        for (int i = 0; i < numLines; i++) {
            String delim = "[|]";
            String[] stringBars = list.get(i + 2).split(delim);
            Bar[] bars = new Bar[stringBars.length];
            for (int j = 0; j < bars.length; j++) {
                bars[j] = new Bar(stringBars[j]);
            }
            int barWidth = (width - (leftMarginSize + rightMarginSize)) / bars.length;
            horizontalBarLayouts[i] = new LinearLayout(getApplicationContext());

            LinearLayout.LayoutParams horizontalParams = new LinearLayout.LayoutParams(
                    LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            horizontalParams.setMargins(0, 0, getPixelsFromDP(barWidth, getApplicationContext()), 0);

            TextView[] barDisplays = new TextView[bars.length];
            for (int j = 0; j < bars.length; j++) {
                barDisplays[j] = new TextView(getApplicationContext());
                barDisplays[j].setTextSize(TypedValue.COMPLEX_UNIT_PX, lineHeight);
                barDisplays[j].setText("|");
                barDisplays[j].setTextColor(Color.parseColor("#000000"));
                horizontalBarLayouts[i].addView(barDisplays[j], horizontalParams);
            }
            verticalBarLayout.addView(horizontalBarLayouts[i], verticalParams);
        }*/