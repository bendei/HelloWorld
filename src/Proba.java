import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Proba {

	public static void main(String[] args) {

		String text = "erewrtzertz@erzer";
		Optional<String> egy = Optional.ofNullable(text);
		
//		egy.ifPresentOrElse(x -> System.out.println(x), () -> {System.out.println("nix");});
		
//		boolean isEmail = egy.filter(x -> x.indexOf("@") != -1).isPresent();
//		System.out.println(isEmail);
//		
//		Modem m = new Modem(1);
//		System.out.println(isInRange(m));
		
		
		
		List<String> dumak = Arrays.asList("aa ", "bb ", "nn ");
		Optional<List<String>> dum = Optional.ofNullable(dumak);
		System.out.println(dum.map(List::size).orElse(0));
		
		
		Sayer sayer = new Sayer();
		sayer.say();
		
		List<Modem> modemek = Arrays.asList(new Modem(11), new Modem(12));
		modemek.forEach(Modem::getPrice);
		
	}
	

	private static boolean isInRange(Modem m) {
		return Optional.ofNullable(m).map(Modem::getPrice).filter(x -> x > 10).filter(x -> x < 20).isPresent();
	}
	
	
}
