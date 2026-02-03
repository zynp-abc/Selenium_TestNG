package freelancer.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {


    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart = Test Süreci Başladı: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart = Her testten önce çağrılır: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess = BAŞARILI testten sonra çağrılır:  " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure = Başarısız olan testten sonra çağrılır: " + result.getName());
    }


    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped =Atlama yapılan testlerden sonra çağrılır:  " + result.getName());
    }

    @Override
    public void onFinish(ITestContext result) {
        System.out.println("onFinish = Tüm testlerde sonra çağrılır:  " + result.getName());
    }

}

