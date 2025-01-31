public class ShopCalApp{
	public static void main(String x[]){
		int qty, rate, GstAmt, total;
		qty =Integer.parseInt(x[0]);
		rate=Integer.parseInt(x[1]);
		GstAmt =((qty*rate)*18)/100;
		System.out.println("Gst Amount is "+GstAmt);
		total = (qty*rate)+GstAmt;
		System.out.println("The total Amount including GST is "+ total);
	}
}