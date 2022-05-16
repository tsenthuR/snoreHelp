package com.example.senthu.snorehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.androidplot.ui.SeriesRenderer;
import com.androidplot.xy.BarFormatter;
import com.androidplot.xy.BarRenderer;
import com.androidplot.xy.BoundaryMode;
import com.androidplot.xy.PanZoom;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.StepMode;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Report2Activity extends AppCompatActivity {

private XYPlot xyPlot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report2);
        getSupportActionBar().hide();

        xyPlot=findViewById(R.id.mypolit);

        Number[] values1= {80,33,45,67,33};
        Number[] values2= {20,45,67,54,44};

        XYSeries series1= new SimpleXYSeries(Arrays.asList(values1),SimpleXYSeries.ArrayFormat.Y_VALS_ONLY,"Series 1");

       MyBarFormet formatter1= new  MyBarFormet(Color.BLUE,Color.LTGRAY);

        xyPlot.addSeries(series1,formatter1);



        PanZoom.attach(xyPlot);
   

        xyPlot.setRangeStep(StepMode.INCREMENT_BY_VAL,20);
        xyPlot.setDomainStep(StepMode.INCREMENT_BY_VAL,1);

        xyPlot.setDomainBoundaries(-1,5, BoundaryMode.FIXED);
        xyPlot.setRangeBoundaries(0,100,BoundaryMode.FIXED);

        MyBarRender render= (MyBarRender) xyPlot.getRenderer(MyBarRender.class);
        render.setBarGroupWidth(BarRenderer.BarGroupWidthMode.FIXED_WIDTH,50);



    }

}
class MyBarFormet extends BarFormatter{
    public MyBarFormet(int fillColor, int borderColor) {
        super(fillColor, borderColor);
    }

    @Override
    public Class<? extends SeriesRenderer> getRendererClass() {
        return MyBarRender.class ;
    }

    @Override
    public SeriesRenderer doGetRendererInstance(XYPlot plot) {
        return new MyBarRender(plot);
    }
}
class MyBarRender extends BarRenderer<MyBarFormet>{

    public MyBarRender(XYPlot plot) {
        super(plot);
    }
}