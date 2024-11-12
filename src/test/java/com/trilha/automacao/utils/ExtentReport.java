package com.trilha.automacao.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    public static ExtentReports extent;
    private static ExtentSparkReporter spark;

    public static void setupReport(){
        if (extent == null) {
            extent = new ExtentReports();
            spark = new ExtentSparkReporter("target/Spark.html");
            extent.attachReporter(spark);
        }

    }

    public static void finishReport(){
        if (extent != null) {
            extent.flush();
        }
    }
}
