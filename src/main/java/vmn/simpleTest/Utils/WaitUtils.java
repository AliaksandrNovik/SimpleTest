package vmn.simpleTest.Utils;

import org.apache.log4j.Logger;

public class WaitUtils {
	private static final long TIMEOUT_IN_SEC = 30;

	private static final long POLLING_IN_MILIS = 300;

	private static final Logger LOGGER = Logger.getLogger(WaitUtils.class);

	/*
	 * public static void waitForElementDisplayed(WebDriver driver, final
	 * WebElement element) { new
	 * FluentWait<WebDriver>(driver).withTimeout(TIMEOUT_IN_SEC,
	 * TimeUnit.SECONDS) .pollingEvery(POLLING_IN_MILIS,
	 * TimeUnit.MILLISECONDS).until(new Function<WebDriver, Boolean>() { public
	 * Boolean apply(WebDriver input) { return element.isDisplayed(); } },
	 * RuntimeException.class, "ERROR! Element isn't displayed during " +
	 * TIMEOUT_IN_SEC + " seconds"); }
	 */
}
