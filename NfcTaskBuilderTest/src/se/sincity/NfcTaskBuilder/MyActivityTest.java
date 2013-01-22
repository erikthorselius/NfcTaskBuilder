package se.sincity.NfcTaskBuilder;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import junit.framework.Test;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class se.sincity.NfcTaskBuilder.MyActivityTest \
 * se.sincity.NfcTaskBuilder.tests/android.test.InstrumentationTestRunner
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity> {

    public MyActivityTest() {
        super("se.sincity.NfcTaskBuilder", MyActivity.class);
    }
	@SmallTest
	public void testViewsCreated() {
		assertNotNull(getActivity());
	}
}
