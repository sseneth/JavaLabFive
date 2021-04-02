import java.util.concurrent.*;
import java.time.Instant;

/*
 * This class borrowed mostly from https://www.javaspecialists.eu/archive/Issue153.html
 * Modifications made for the TriviaQuiz problem.
 */

public class ConsoleInput {
  private final int tries;
  private final int timeout;
  private final TimeUnit unit;

  public ConsoleInput(int tries, int timeout, TimeUnit unit) {
    this.tries = tries;
    this.timeout = timeout;
    this.unit = unit;
  }

  public String readLine() throws InterruptedException {
    ExecutorService ex = Executors.newSingleThreadExecutor();
    String input = null;
    try {
      // start working
      Instant start = Instant.now();
      Instant now;
      for (int i = 0; i < tries; i++) {
    	if (i!=0) {
    		now = Instant.now();
			long nowSeconds = now.getEpochSecond();
			long startSeconds = start.getEpochSecond();
			long diff = nowSeconds - startSeconds;
    		System.out.println(diff + " seconds have passed...");
    	}
        Future<String> result = ex.submit(
            new ConsoleInputReadTask());
        try {
          input = result.get(timeout, unit);
          break;
        } catch (ExecutionException e) {
          e.getCause().printStackTrace();
        } catch (TimeoutException e) {
          result.cancel(true);
        }
      }
    } finally {
      ex.shutdownNow();
    }
    return input;
  }
}