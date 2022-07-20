import com.PackageExample;
import com.modifierexample;

public class Usepackage {

	public void show() {
		
		System.out.println("I am in current package (default)");
	}
	public static void main(String[] args) {
		PackageExample p = new PackageExample();
		p.display();
		
		Usepackage u = new Usepackage();
		u.show();
		
		modifierexample.my();
	}

}
