public class BuyingShowTickets {
	public static int waitingTime(int[] Tickets, int p) {
	    int waitingTime = Tickets[p];
	    for (int i = 0; i < Tickets.length; i++) {
	      if (i == p) continue;
	      waitingTime += (Math.min(Tickets[p], Tickets[i]));
	      if (i > p) {
	        waitingTime--;
	      }
	    }

	    return waitingTime;
	  }
}
