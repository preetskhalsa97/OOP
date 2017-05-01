
public class CompositeTest {

	public static void main(String[] Args){
		
		Component hd  = new Leaf(100,"hard drive");
		Component m  = new Leaf(50,"mouse");
		Component monitor  = new Leaf(70,"monitor");
		Component ram  = new Leaf(60,"RAM");
		Component cpu  = new Leaf(150,"CPU");
		
		Composite peri = new Composite("PeriPeri"); //  peripheral
		Composite cabinet = new Composite("Cabinet"); 
		Composite mb = new Composite("MotherBoard"); 
		Composite comp = new Composite("Computer"); 
		
		peri.addComponent(m);
		peri.addComponent(monitor);
		cabinet.addComponent(hd);
		mb.addComponent(cpu);
		mb.addComponent(ram);
		cabinet.addComponent(mb);
		comp.addComponent(peri);
		comp.addComponent(cabinet);
		
		ram.showPrice();
		
		comp.showPrice();
		
	}
	
	
}
