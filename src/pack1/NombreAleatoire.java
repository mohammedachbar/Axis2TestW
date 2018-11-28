package pack1;
import java.util.Random;

public class NombreAleatoire {

		public long getNombre(){
			Random random = new Random(1000);
			return random.nextLong();
		}
}
