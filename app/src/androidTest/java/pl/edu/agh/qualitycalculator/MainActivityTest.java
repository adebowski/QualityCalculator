package pl.edu.agh.qualitycalculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testSum(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("2.0 plus 2.0 plus 2.0 gives value 6.0")));
       }

    @Test
    public void testSubtract(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("2.0 minus 2.0 minus 2.0 gives value -2.0")));
    }

    @Test
    public void testDivide(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("9"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("3"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("9.0 divided by 3.0 divided by 2.0 gives value 1.5")));
    }

    @Test
    public void testMultiply(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("2.0 multiplied by 2.0 multiplied by 2.0 gives value 8.0")));
    }

    @Test
    public void testAverage(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("2"));
        onView(withId(R.id.btnAve)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("average of 2.0 and 2.0 and 2.0 gives value 2.0")));
    }


}

