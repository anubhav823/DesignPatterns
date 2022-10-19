package ObserverPattern;

public class GrabStocks {
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver stockObserver = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(122);
		stockGrabber.setAaplPrice(1122);
		stockGrabber.setGoogPrice(1222);
		
	}
}
