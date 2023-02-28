package net.ov.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {
    @Test
    public void testAgedUserCanPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can't play game");
        ageChecker.setMinAge(14);
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can't play game");
    }
    @Test
    public void testThatTooYongUsersCanNotPlay () {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse (ageChecker.canPlayGame(17),
                "Under aged users should not be able to play game");
    }
}
