package com.utilities;

public class BaseFunctions extends TestBase{


	public static void logException(Throwable e){
		test.fail(e);
	}

	public static void logPassed(String passedLog) {
		test.pass(passedLog);
	}

	public static void logInfo(String info) {
		test.info(info);
	}

	public static void logFailed(String failedLog) {
		test.fail(failedLog);
	}
}
