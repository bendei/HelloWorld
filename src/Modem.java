
class Modem implements Modemable {
		
		private int price;
		
		public Modem(int p) {
			this.price = p;
		}
		
		public Modem()  {};
		
		public int getPrice()  {
			return this.price;
		}
		
		public void setPrice(int p) {
			this.price = p;
		}
		
	}
	